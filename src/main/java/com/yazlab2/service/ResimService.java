package com.yazlab2.service;

import com.yazlab2.model.Resim;
import com.yazlab2.model.dbConnect;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;

/**
 * Created by alpaydin on 11.05.2017.
 */
@Service
public class ResimService {

    dbConnect connect;

    @PostConstruct
    public void init(){
        connect = new dbConnect();
    }



}
