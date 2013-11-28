package com.me.controller;

import com.me.domain.Person;
import com.me.services.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

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
}
