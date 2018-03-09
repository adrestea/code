package com.scott.aidl;
import com.scott.aidl.Person;

interface IGreetService {
    String greet(in Person person);
}
