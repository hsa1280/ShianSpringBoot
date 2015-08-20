package com.shian.spring.boot.controller;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by shian on 8/19/15.
 */
@RestController
@RequestMapping("/customer")
public class ControllerTest {

    @RequestMapping(value = "/{customerId}", method = RequestMethod.GET)
    public String getHello(@PathVariable("firstName") String firstName, @PathVariable("lastName") String lastName) {
        return "hello " + firstName + " " + lastName;
    }

    @RequestMapping(value = "/{customerId}", method = RequestMethod.DELETE)
    public void delete(@PathVariable("firstName") String firstName, @PathVariable("lastName") String lastName) {

    }
}
