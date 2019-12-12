package com.yyy.springbootredis.controller;

import com.google.common.collect.ImmutableMap;
import com.yyy.springbootredis.entity.Person;
import com.yyy.springbootredis.exception.ResourceNotFoundException;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@RestController
@RequestMapping("/api")
public class ExceptionController {

    @GetMapping("/resourceNotFound")
    public void throwException(Model model) {
        //Person person = new Person(1L, "yyy");
        Map<String, Object> map = model.asMap();
        System.out.println(map);
        //throw new ResourceNotFoundException(ImmutableMap.of("person id", person.getId()));
    }
}
