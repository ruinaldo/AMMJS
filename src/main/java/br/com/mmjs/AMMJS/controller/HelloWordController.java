package br.com.mmjs.AMMJS.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value= "/hello")
public class HelloWordController {

    @RequestMapping(method = RequestMethod.GET)
    public ResponseEntity<String> hello(){
        return ResponseEntity.ok().body("Ruinaldo o Lindaoooo");
    }


}
