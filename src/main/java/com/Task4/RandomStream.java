package com.Task4;

import java.util.stream.Stream;

public class RandomStream {
    MyRandom myRandom;// = new MyRandom(1,25214903917L,11, (long) Math.pow(2,48));
    /*
    Используя Stream.iterate сделайте бесконечный стрим рандомных чисел, но не используя Math.random.
     Реализуйте свой "линейный конгруэнтный генератор". Для этого начните с x[0] = seed и затем
     каждый следующий элемент x[n + 1] = 1 (a x[n] + c) % m, для корректных значений a, c, и m.
     Необходимо имплементировать метод, который принимает на вход параметрыa, c, m и seed и возвращает Stream<Long>.
     Для теста используйте данные a = 25214903917, c = 11 и m = 2^48 (2 в степени 48).
     */
public Stream<Long> createMyStream(long seed, long a , long c, long m){
    myRandom = new MyRandom(seed,a,c, m);
    return Stream.iterate(seed,(in)-> myRandom.rand());
}
    public static void main(String[] args) {
        RandomStream randomStream = new RandomStream();

        randomStream.createMyStream(6,25214903917L,11, (long) Math.pow(2,48)).limit(10)
                .forEach(System.out::println);
    }
}
