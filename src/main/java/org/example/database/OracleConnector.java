package org.example.database;

public class OracleConnector implements DatabaseConnector{

    @Override
    public String create(String[] payload) {
        String str = "";
        for (int i=0;i < payload.length; i++) {
            str += "\n"+payload[i];
        }
        System.out.println("Создаём объекты "+str+"\n в базе");
        return "Status: Успех";
    }

    @Override
    public String read(String[] payload) {
        String str = "";
        for (int i=0;i < payload.length; i++) {
            str += "\n"+payload[i];
        }
        System.out.println("Читаем инфу из "+str+"\n в базе");
        return "Status: Успех";
    }

    @Override
    public String update(String[] payload) {
        String str = "";
        for (int i=0;i < payload.length; i++) {
            str += "\n"+payload[i];
        }
        System.out.println("Обновляем инфу из "+str+"\n в базе");
        return "Status: Успех";
    }

    @Override
    public String delete(String[] payload) {
        System.out.println("Удаляем строки из таблицы");
        return "Status: Успех";
    }
}
