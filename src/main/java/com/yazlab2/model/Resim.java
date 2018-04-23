package com.yazlab2.model;

import com.fasterxml.jackson.annotation.JsonInclude;

/**
 * Created by alpaydin on 11.05.2017.
 */
@JsonInclude(value = JsonInclude.Include.NON_NULL)
public class Resim {

    private int id;
    private String dizin;
    private int evID;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDizin() {
        return dizin;
    }

    public void setDizin(String dizin) {
        this.dizin = dizin;
    }

    public int getEvID() {
        return evID;
    }

    public void setEvID(int evID) {
        this.evID = evID;
    }
}
