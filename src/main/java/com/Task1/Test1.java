package com.Task1;

import com.GeneratorPerson;
import com.Person;
import org.w3c.dom.ls.LSOutput;

import java.util.*;
import java.util.function.ToIntFunction;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Test1 {
//    Метод принимает на вход список имен.
//    Вернуть строку в виде: "1. Ivan, 3. Peter ...",
//    с именами из списка, стоящими под нечетным индексом (1, 3 и т.д.).

    public String changeListSecondMetod(List listName) {

        final int[] count = {0};
        StringBuilder stringBuilder = new StringBuilder();
        listName.stream()
                .map(it -> {
                    count[0]++;
                    return count[0] + ". " + it;
                })
                .map((it) -> {
                    String[] peoples = ((String) it).split(". ");
                    if (Integer.parseInt(peoples[0]) % 2 == 1)
                        stringBuilder.append(it + ", ");
                    return it;
                })
                .collect(Collectors.toList());

        return stringBuilder.toString();
    }

    public String changeList(List listName) {
       String result =  IntStream.range(0, listName.size())
                .mapToObj(idx -> (idx + 1) + ". " + listName.get(idx))
                .filter((it) -> {
                    String[] split = it.split(". ");
                    if (Integer.parseInt(split[0]) % 2 == 1)
                        return true;
                    return false;
                })
                .collect(Collectors.joining(", "));

        return result;
    }


    public static void main(String[] args) {
        Test1 test1 = new Test1();
        GeneratorPerson person = new GeneratorPerson();

        List<String> names = person.generatPerson(100).stream()
                .map(it -> it.getName())
                .collect(Collectors.toList());


        System.out.println(test1.changeList(names));


    }
}
