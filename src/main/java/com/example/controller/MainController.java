package com.example.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by lemieber on 28/07/16.
 */

@RestController
public class MainController {

    @RequestMapping(value = "/getFoo", method = RequestMethod.GET)
    public Integer getFoo(
            @RequestParam(name = "longitude", defaultValue = "${defaultValues.foo}") final Integer foo

    ) {
        return foo;
    }
    }

