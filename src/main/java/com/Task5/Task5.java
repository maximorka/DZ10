package com.Task5;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Task5 {
    /*
    Напишите метод public static <T> Stream<T> zip(Stream<T> first, Stream<T> second)
     который "перемешивает" элементы из стримов first и second, останавливается тогда,
     когда у одного из стримов закончатся элементы.
     */

    public static <T> Stream<T> zip(Stream<T> first, Stream<T> second){
        List<T> res = new ArrayList<T>();

        Iterator<T> iteratorFirst = first.iterator();
        Iterator<T> iteratorSecond = second.iterator();

        while (iteratorFirst.hasNext() && iteratorSecond.hasNext()) {
            res.add(iteratorFirst.next());
            res.add(iteratorSecond.next());
        }
        return res.stream();
    }

    public static void main(String[] args) {


        Stream<String> f = Stream.of("1","2","3","4","5","6");
        Stream<String> s = Stream.of("1","2","3","4");

        Task5.zip(f,s).peek(System.out::println)
                .collect(Collectors.toList());
    }
}
