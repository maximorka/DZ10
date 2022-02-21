package com.Task2;

import com.GeneratorPerson;


import java.util.List;
import java.util.stream.Collectors;

public class SortedString {
    //Метод принимает на вход список из строк (можно список из Задания 1).
    // Возвращает список этих строк в верхнем регистре и отсортированные по убыванию (от Z до А).
    public List<String> sort(List<String> stringsNeedToSort){

        List<String> collect = stringsNeedToSort.stream()
                .map(it -> it.toUpperCase())
                .sorted(((o1, o2) -> o2.compareTo(o1)))
                .collect(Collectors.toList());
        return collect;

    }

    public static void main(String[] args) {
        GeneratorPerson person = new GeneratorPerson();
        List<String> names = person.generatPerson(100).stream()
                .map(it -> it.getName())
                .collect(Collectors.toList());


        SortedString sortedString = new SortedString();
        System.out.println("sortedString.sort(names) = " + sortedString.sort(names));


    }
}
