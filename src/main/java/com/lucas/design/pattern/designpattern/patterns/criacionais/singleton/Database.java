package com.lucas.design.pattern.designpattern.patterns.criacionais.singleton;

import javax.xml.crypto.Data;
import java.util.UUID;

public class Database {
    
    private static Database database;
    private String databaseConection;
    private Database(){};

    private Database(String databaseConection){
        this.databaseConection = databaseConection;
    }
    public static Database getInstance(){
        if(database == null){
            database = new Database("Database conectado: " + UUID.randomUUID().toString());
        }

        return database;
    }

    public String getDatabaseConection() {
        return databaseConection;
    }
}
