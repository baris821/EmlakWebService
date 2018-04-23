package com.yazlab2.model;

import org.springframework.http.HttpStatus;

import java.sql.*;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by alpaydin on 11.05.2017.
 */
public class dbConnect {

    private Connection conn;
    private PreparedStatement ps;
    private ResultSet rs;

    public Connection connected() {
        try {
            Class.forName("org.sqlite.JDBC");
            conn = DriverManager.getConnection("jdbc:sqlite:dbEV.sqlite");
            return conn;
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
            return null;
        } catch (SQLException e) {
            e.printStackTrace();
            return null;
        }
    }
    public Map<Integer , Ev> listEv() {

        Map<Integer, Ev> list = new HashMap<>();
        try {
            ps = connected().prepareStatement("SELECT * FROM ev");
            rs = ps.executeQuery();

            Ev ev;
            while (rs.next()) {
                ev = new Ev();
                ev.setId(rs.getInt("id"));
                ev.setIl(rs.getString("il"));
                ev.setEmlakTipi(rs.getString("emlakTipi"));
                ev.setAlan(rs.getInt("alan"));
                ev.setBulKat(rs.getInt("bulKat"));
                ev.setBinaYasi(rs.getInt("binaYasi"));
                ev.setOdaSayisi(rs.getInt("odaSayisi"));
                ev.setFiyat(rs.getInt("fiyat"));
                ev.setAciklama(rs.getString("aciklama"));

                list.put(ev.getId(), ev);
            }
            return list;
        } catch (SQLException e) {
            e.printStackTrace();
            return null;
        }
    }
    public Map<Integer , Resim> getResimList(){

        Map<Integer, Resim> list = new HashMap<>();
        try {
            ps = connected().prepareStatement("SELECT * FROM resim");
            rs = ps.executeQuery();

            Resim r;

            while (rs.next()){
                r = new Resim();
                r.setId(rs.getInt("id"));
                r.setDizin(rs.getString("dizin"));
                r.setEvID(rs.getInt("evID"));

                list.put(r.getId(),r);
            }
            return list;
        } catch (SQLException e) {
            e.printStackTrace();
            return null;
        }

    }
    public HttpStatus evEkle(Ev ev){
        try {
            ps = connected().prepareStatement("INSERT INTO ev(il,emlakTipi,alan,odaSayisi,binaYasi,bulKat,fiyat,aciklama) VALUES (?,?,?,?,?,?,?,?)");
            ps.setString(1,ev.getIl());
            ps.setString(2,ev.getEmlakTipi());
            ps.setInt(3,ev.getAlan());
            ps.setInt(4,ev.getOdaSayisi());
            ps.setInt(5,ev.getBinaYasi());
            ps.setInt(6,ev.getBulKat());
            ps.setInt(7,ev.getFiyat());
            ps.setString(8,ev.getAciklama());
            ps.executeUpdate();
            return HttpStatus.OK;
        } catch (SQLException e) {
            return HttpStatus.EXPECTATION_FAILED;
        }
    }

}
