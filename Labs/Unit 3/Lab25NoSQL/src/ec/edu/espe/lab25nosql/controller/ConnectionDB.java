/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.lab25nosql.controller;

import com.mongodb.DB;
import com.mongodb.Mongo;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Jhony NAranjo
 */
public class ConnectionDB {
private DB db;

 
    public ConnectionDB() {
   
    try {
        Mongo mongo = new Mongo("localhost",27017);
        db = mongo.getDB("Lab25NoSQL");
    } catch (java.net.UnknownHostException ex) {
        Logger.getLogger(ConnectionDB.class.getName()).log(Level.SEVERE, null, ex);
    }
    }

    public DB getDb() {
        return db;
    }

}