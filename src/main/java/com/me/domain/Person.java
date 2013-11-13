package com.me.domain;

import org.springframework.web.servlet.ModelAndView;

/**
 * Created with IntelliJ IDEA.
 * User: bmaghbool
 * Date: 6/07/13
 * Time: 7:38 PM
 * To change this template use File | Settings | File Templates.
 */
public class Person {
    private String fullName;
    private String phoneNo;
    private Gender gender;

    public enum Gender{
        MALE,
        FEMALE
        }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getPhoneNo() {
        return phoneNo;
    }

    public void setPhoneNo(String phoneNo) {
        this.phoneNo = phoneNo;
    }

    public Gender getGender() {
        return gender;
    }

    public void setGender(Gender gender) {
        this.gender = gender;
    }

    @Override
    public String toString() {
        return "Person{" +
                "fullName='" + fullName + '\'' +
                ", phoneNo='" + phoneNo + '\'' +
                ", gender=" + gender +
                '}';
    }
}
