package com.yazlab2.service;

import com.yazlab2.model.Ev;
import com.yazlab2.model.dbConnect;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by alpaydin on 11.05.2017.
 */
@Service
public class EvService {

    dbConnect connect;

    @PostConstruct
    public void init(){
        connect = new dbConnect();
    }

    public Ev getEvById(int id){
        return connect.listEv().get(id);
    }

    public Map<Integer , Ev> getEvMap(){
        return connect.listEv();
    }

    public HttpStatus addEv(Ev ev){
        return connect.evEkle(ev);
    }
}
