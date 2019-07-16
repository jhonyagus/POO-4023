/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.hardware.controller;

import ec.edu.espe.hardware.model.ProductMdl;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.StringTokenizer;
import java.util.Vector;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Jhony Naranjo
 */
public class SaveProduct {
    Vector vector = new Vector();
    
    public void save(ProductMdl product) {
        vector.addElement(product);
    }
    
    public void saveProduct(ProductMdl product) {
        try {
            FileWriter fileWriter = new FileWriter("product.json", true);
            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
            PrintWriter printWriter = new PrintWriter(bufferedWriter);
            printWriter.print(product.getId());
            printWriter.print("|" + product.getName());
            printWriter.close();
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, ex);
        }
    }
    
    public DefaultTableModel listProduct() {
        Vector principal = new Vector();
        principal.addElement("ID");
        principal.addElement("Name");
        DefaultTableModel defaultTable = new DefaultTableModel(principal, 0);
        try {
            FileReader fileReader = new FileReader("product.json");
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            String read;
            while((read = bufferedReader.readLine()) != null) {
                StringTokenizer date = new StringTokenizer(read, "|");
                Vector vect = new Vector();
                while(date.hasMoreTokens()) {
                    vect.addElement(date.nextToken());
                }
                defaultTable.addRow(vect);
            }
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, ex);
        }
        return defaultTable;
    }
}
