package com;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Random;

public class GeneratorPerson {

    public Collection<Person> generatPerson(int count){
        Random random = new Random();

        List<String> name = List.of("Petro","Ivan","Jonh","Igor","Ilon","AndriyX");

        List<String> surname = List.of("Shevzov", "Mask", "Ivanov","Churay","Bugay","Burda");
        Collection<Person> persons = new ArrayList<>();

        for (int i = 0; i <count ; i++) {

            String firstName = name.get(random.nextInt(name.size()));
            String secondName  = surname.get(random.nextInt(surname.size()));

            int salary = 500+ random.nextInt(1001);
            Person person = new Person(firstName, secondName,firstName+" "+secondName,salary);

            persons.add(person);
        }

        return persons;
    }
}
