package com.example.Adminka.model;

public class Book {

    private int id;

    public String getDir() {
        return dir;
    }

    public void setDir(String dir) {
        this.dir = dir;
    }

    public String getUniverse() {
        return universe;
    }

    public void setUniverse(String universe) {
        this.universe = universe;
    }

    private String dir;
    private String universe;

    public Book(int id, String dir, String universe) {
        this.id = id;
        this.dir = dir;
        this.universe = universe;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}
