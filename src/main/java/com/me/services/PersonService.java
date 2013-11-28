package com.me.services;

import com.me.domain.Person;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * User: bmaghbool
 * Date: 6/07/13
 * Time: 9:10 PM
 * To change this template use File | Settings | File Templates.
 */

@Service
public class PersonService {

    List<Person> persons = new ArrayList<Person>();

    public void savePerson(Person person) {
        persons.add(person);
    }

    public List getPersons(){
        return persons;
    }
}
