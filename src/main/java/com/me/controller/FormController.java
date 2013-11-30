package com.me.controller;

import com.me.domain.Person;
import com.me.services.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import javax.xml.ws.RespectBinding;
import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * User: bmaghbool
 * Date: 6/07/13
 * Time: 7:44 PM
 * To change this template use File | Settings | File Templates.
 */
@Controller
public class FormController {

    private final PersonService service;

    @Autowired
    public FormController(PersonService service) {
        this.service = service;
    }

    @RequestMapping(value = "/SimpleForm",method = RequestMethod.GET)
    public String processSimpleForm(){
        return "SimpleForm";
    }

    @RequestMapping(value = "/form",method = RequestMethod.GET)
    public String index(Model model){
        model.addAttribute("person",new Person());
        return "form";
    }

    @RequestMapping(value = "/form",method = RequestMethod.POST)
    public String processForm(@ModelAttribute Person person,Model model){
        service.savePerson(person);
        model.addAttribute("persons",service.getPersons());
        return "form";
    }

    @RequestMapping(value="/addPerson",method = RequestMethod.GET)
    public
    @ResponseBody
    List<Person> addPerson(
            @RequestParam("fullName") String fullName,
            @RequestParam("phoneNo") String phoneNo,
            @RequestParam("gender") String gender){
        service.savePerson(new Person(fullName, phoneNo, Person.Gender.valueOf(gender)));
        return service.getPersons();
    }

    @RequestMapping(value = "/getPersons",method = RequestMethod.POST)
    public
    @ResponseBody
    List<Person> getPersons(){
        return service.getPersons();
    }



}
