package com.me.services;

import com.me.domain.Person;
import org.springframework.stereotype.Service;

/**
 * Created with IntelliJ IDEA.
 * User: bmaghbool
 * Date: 6/07/13
 * Time: 9:10 PM
 * To change this template use File | Settings | File Templates.
 */

@Service
public class PersonService {
    public void printPerson(Person person) {
        System.out.println(person);
    }
}
