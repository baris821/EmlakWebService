package com.yazlab2.controller;

import com.yazlab2.model.Ev;
import com.yazlab2.service.EvService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.util.Map;

/**
 * Created by alpaydin on 11.05.2017.
 */
@RestController
@RequestMapping(value = "/ev")
public class EvController {

    @Autowired
    private EvService evService;

    @RequestMapping(value = "/{id}" , method = RequestMethod.GET , produces = MediaType.APPLICATION_JSON_VALUE)
    public @ResponseBody
    Ev getEvById(@PathVariable("id") int id ){
        return evService.getEvById(id);
    }

    @RequestMapping(value = "/getEvList" , method = RequestMethod.GET , produces = MediaType.APPLICATION_JSON_VALUE)
    public @ResponseBody
    Map<Integer , Ev> getEvList(){
        return evService.getEvMap();
    }

    @RequestMapping(value = "/addEv" , method = RequestMethod.POST , consumes = MediaType.APPLICATION_JSON_VALUE)
    public HttpStatus addEv(@RequestBody Ev ev){
        return evService.addEv(ev);
    }


}
