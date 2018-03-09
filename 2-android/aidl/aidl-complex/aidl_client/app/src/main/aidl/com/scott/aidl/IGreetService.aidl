package com.scott.aidl;
import com.scott.Person;

interface IGreetService {
    String greet(in Person person);
}
