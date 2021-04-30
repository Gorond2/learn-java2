package org.example.database;

public interface DatabaseConnector {

    //CRUD

    String create(String[] payload);

    String read(String[] payload);

    String update(String[] payload);

    String delete(String[] payload);
}
