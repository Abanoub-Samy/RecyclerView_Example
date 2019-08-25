package com.example.test;

import java.util.ArrayList;

public class RecycleModel {
    ArrayList<Integer> id ;
    ArrayList<String> title ;
    ArrayList<String> body ;

    public RecycleModel(ArrayList<Integer> id, ArrayList<String> title, ArrayList<String> body) {
        this.id = id;
        this.title = title;
        this.body = body;
    }

    public ArrayList<Integer> getId() {
        return id;
    }

    public void setId(ArrayList<Integer> id) {
        this.id = id;
    }

    public ArrayList<String> getTitle() {
        return title;
    }

    public void setTitle(ArrayList<String> title) {
        this.title = title;
    }

    public ArrayList<String> getBody() {
        return body;
    }

    public void setBody(ArrayList<String> body) {
        this.body = body;
    }
}
