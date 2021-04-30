package org.example.database;

public class Document {
    private OracleConnector connector;

    public Document() {connector = new OracleConnector();}

    public void createDocument(String[] payload){
        // тут мы типа вызываем подключение к БД и посылаем что создать в базе
        String result = connector.create(payload);
        System.out.println(result);// результат отработки процедуры созадния в базе
    }

    public void selectDocument(String[] payload){
        String result = connector.read(payload);
        System.out.println(result);
    }

    public void updateDocument(String[] payload){
        String result = connector.update(payload);
        System.out.println(result);
    }

}
