package com.example.Online_Shopping.controller;


import com.example.Online_Shopping.models.Person;

import com.example.Online_Shopping.service.PersonService;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.web.bind.annotation.*;


import java.util.List;


@RestController
@CrossOrigin(origins = "*")
public class PersonController {
    @Autowired
    private PersonService personService;

    @RequestMapping(method = RequestMethod.POST,value="/create")
    public String create(@RequestBody Person person){
        personService.create(person);
        return ("Hi "+person.getName()+" you have been login successfully");
    }

    /*@RequestMapping("/create")
    public String create(@RequestParam String Name, @RequestParam String email, @RequestParam String address,
                         @RequestParam String password, @RequestParam String phone) {
        Person p = personService.create(Name, email, address, password,phone);
        return p.toString();
    }*/
    @RequestMapping("/get")
    public Person getPerson(@RequestParam String email) {
        return personService.findByEmail(email);
    }
    @RequestMapping("/getAll")
    public List<Person> getAllPerson() {
        return personService.getAll();
    }
    @RequestMapping("/update")
    public String update(@RequestParam String name, @RequestParam String email, @RequestParam String address,
                         @RequestParam String password, @RequestParam String phone) {
        Person p = personService.update(name, email, address, password,phone);
        return p.toString();
    }
    @RequestMapping("/delete")
    public String delete(@RequestParam String email) {
        personService.delete(email);
        return "Deleted " ;
    }
    @RequestMapping("/deleteAll")
    public String deleteAll() {
        personService.deleteAll();
        return "Deleted All Records!";
    }

}
