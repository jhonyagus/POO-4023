/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.designpaterns.factorymethod;

/**
 *
 * @author Jhony Naranjo
 */
public class FactoryOne extends Factory{
    
    @Override
    public Connection createConnection(String type){
        if(type.equals("Oracle"))
            return new OracleConnection();
        else
            return new MySqlConnection();
    }
}
