package com.yazlab2.model;

import com.fasterxml.jackson.annotation.JsonInclude;

/**
 * Created by alpaydin on 11.05.2017.
 */
@JsonInclude(value = JsonInclude.Include.NON_NULL)
public class Ev {

    private int id;
    private String il;
    private String emlakTipi;
    private int alan;
    private int odaSayisi;
    private int binaYasi;
    private int bulKat;
    private int fiyat;
    private String aciklama;


    public Ev(){

    }
    public Ev(int id, String il, String emlakTipi, int alan, int odaSayisi, int bulKat, int fiyat, String aciklama , int binaYasi) {
        this.id = id;
        this.il = il;
        this.emlakTipi = emlakTipi;
        this.alan = alan;
        this.odaSayisi = odaSayisi;
        this.binaYasi = binaYasi;
        this.bulKat = bulKat;
        this.fiyat = fiyat;
        this.aciklama = aciklama;
    }


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getIl() {
        return il;
    }

    public void setIl(String il) {
        this.il = il;
    }

    public String getEmlakTipi() {
        return emlakTipi;
    }

    public void setEmlakTipi(String emlakTipi) {
        this.emlakTipi = emlakTipi;
    }

    public int getAlan() {
        return alan;
    }

    public void setAlan(int alan) {
        this.alan = alan;
    }

    public int getOdaSayisi() {
        return odaSayisi;
    }

    public void setOdaSayisi(int odaSayisi) {
        this.odaSayisi = odaSayisi;
    }

    public int getBulKat() {
        return bulKat;
    }

    public void setBulKat(int bulKat) {
        this.bulKat = bulKat;
    }

    public int getFiyat() {
        return fiyat;
    }

    public void setFiyat(int fiyat) {
        this.fiyat = fiyat;
    }

    public int getBinaYasi() {
        return binaYasi;
    }

    public void setBinaYasi(int binaYasi) {
        this.binaYasi = binaYasi;
    }

    public String getAciklama() {
        return aciklama;
    }

    public void setAciklama(String aciklama) {
        this.aciklama = aciklama;
    }
}
