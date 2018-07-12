package models;

import java.util.ArrayList;
import java.util.List;

public class Restaurant {

    private int id;
    private String name;
    private List<Table> tables;

    public Restaurant() {
    }

    public Restaurant(String name) {
        this.name = name;
        this.tables = new ArrayList<Table>();
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Table> getTables() {
        return tables;
    }

    public void setTables(List<Table> tables) {
        this.tables = tables;
    }

    public void addTable(Table table){
        this.tables.add(table);
    }
}
