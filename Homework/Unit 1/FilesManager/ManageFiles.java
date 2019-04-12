
package managefiles;

import com.csvreader.CsvReader;
import com.csvreader.CsvWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class ManageFiles {

    public static void main(String[] args) {
           List<User> users = new ArrayList<User>();
           
           users.add(new User("Jhony","Naranjo","Guamani","jhonyagus@hotmail.com"));
           users.add(new User("Tania","Naranjo","Guamani","tafyre@hotmail.com"));
           
           //ExportCSV(users);
           ImportCSV();
    }
    
     public static void ExportCSV(List<User> users){
         String outputFile = "users.csv"; // Name the file
         boolean exist = new File(outputFile).exists(); //verifica si existe
         
         //Si existe un archivo asi lo borra
         if(exist){
             File usersFile = new File (outputFile);
             usersFile.delete();
         }
         
         try {
               //Crea el archivo
               CsvWriter outputCSV = new CsvWriter (new FileWriter(outputFile,true),',');
               
               //Datos para identificar las columnas
               outputCSV.write("Name");
               outputCSV.write("LastName");
               outputCSV.write("Adress");
               outputCSV.write("Email");
               
               outputCSV.endRecord(); //Deja de escribir en el archivo
               
               //Recorremos la lista y lo insertamos en el archivo
               for(User user1: users){
                    outputCSV.write(user1.getName());
                    outputCSV.write(user1.getLastname());
                    outputCSV.write(user1.getAdress());
                    outputCSV.write(user1.getEmail());
                    
                    outputCSV.endRecord(); //Deja de escribir en el archivo
                }
               
               outputCSV.close(); //Close the file
               
        }catch (IOException e){
             e.printStackTrace();
        }   
    }
     
     public  static void ImportCSV(){
         try{
             List<User> users = new ArrayList<User>(); //Lista donde guardaremos los datos del archivo
             
             CsvReader readUsers = new CsvReader("users.csv");
             readUsers.readHeaders();
             
             //Mientras haya lineas obtenemos los daros del archivo
             while(readUsers.readRecord()){
                 String name = readUsers.get(0);
                 String lastname = readUsers.get(1);
                 String adress = readUsers.get(2);
                 String email = readUsers.get(3);
                 
                 users.add(new User(name, lastname, adress, email)); //Añade la informacion a la lista
             }
             readUsers.close(); //Close the file
             
             //Recorremos la lista y la mostramos en la pantalla
             for(User user1 : users){
                 System.out.println(user1.getName() + ","
                       + user1.getLastname() + ","
                       + user1.getAdress() + ","
                       + user1.getEmail());
             }
             
         }catch(FileNotFoundException e){
             e.printStackTrace();
         }catch(IOException e){
             e.printStackTrace();
         }
    }
}
