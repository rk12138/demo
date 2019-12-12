package com.yyy.springbootredis.test;

import com.yyy.springbootredis.entity.Person;
import com.yyy.springbootredis.mapper.PersonRepository;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.Optional;

@RunWith(SpringRunner.class)
@SpringBootTest
public class TestJpa {
    @Autowired
    private PersonRepository personRepository;
    private Long id;

    @Before
    public void setUp() {
        Person person = new Person("yyy", 20);
        Person savePerson = personRepository.saveAndFlush(person);
        id = savePerson.getId();
    }
    @Test
    public void findPerson() {
        //Optional<Person> optionalPerson = personRepository.findById(id);
        Optional<Person> optionalPerson = personRepository.findPersonByNameCustom("yyy");
        System.out.println("name:"+optionalPerson.get().getName());
        personRepository.deleteAll();
    }
}
