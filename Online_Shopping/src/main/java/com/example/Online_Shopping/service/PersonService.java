package com.example.Online_Shopping.service;


import com.example.Online_Shopping.models.Person;

import com.example.Online_Shopping.repository.PersonRepository;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Service;


@Service

public class PersonService {
    @Autowired
    private PersonRepository personRepository;
    //CreateOperation
    public String create(Person person){
        personRepository.save(person);
        return ("Hi "+ person.getName()+"you have been registered");
    }
    /*public Person create(String Name, String email, String address, String password, String phone) {
        return personRepository.save(new Person(Name, email, address, password,  phone));
    }*/
//RetrieveOperation
    public List<Person> getAll() {
        return personRepository.findAll();
    }
    public Person findByEmail(String email) {
        return personRepository.findByEmail(email);
    }
//UpdateOperation
    public Person update(String name, String email, String address, String password, String phone) {
        Person p = personRepository.findByEmail(email);
        p.setName(name);
        p.setAddress(address);
        p.setPassword(password);
        p.setPhone(phone);
        return personRepository.save(p);
    }
    //DeleteOperation
    public void deleteAll() {
        personRepository.deleteAll();
    }
    public void delete(String email) {
        Person p = personRepository.findByEmail(email);
        personRepository.delete(p);
    }

}

