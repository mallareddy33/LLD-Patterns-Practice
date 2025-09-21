package com.malla.oop.design.pattern.singleton;

public class Database {
    private static Database instance = null;

    private Database(){}

    public static Database getInstance() {
        if (instance == null) {
            synchronized (Database.class) {
                if (instance == null) {
                    instance = new Database();
                }
            }
        }

        return instance;
    }
}
