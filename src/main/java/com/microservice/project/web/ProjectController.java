package com.microservice.project.web;

import com.microservice.project.client.UserClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ProjectController {

    @Autowired
    private UserClient userClient;

    @RequestMapping(path = "/projects", method = RequestMethod.GET)
    public ResponseEntity listProject(){
        return ResponseEntity.ok().body("==== this is project service ======");
    }

    @RequestMapping(path = "/users", method = RequestMethod.GET)
    public ResponseEntity listUsers(){
        return ResponseEntity.ok().body(userClient.listUsers());
    }

}
