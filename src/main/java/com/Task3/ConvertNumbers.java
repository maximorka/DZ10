package com.Task3;

import java.util.Arrays;

public class ConvertNumbers {
    // Получить из массива все числа, вернуть в отсортированном виде, разделенные запятой, то есть
    // "0, 1, 2, 4, 5"

    private final String[] data = {"1, 2, 0", "41, 5","10,11"};

    public String convert() {
        String dataString = String.join(", ", data);

         return Arrays.toString(Arrays.stream(dataString.split(","))
                 .map(String::trim)
                 .mapToInt(Integer::parseInt)
                 .sorted()
                 .toArray());
    }

    public static void main(String[] args) {
        ConvertNumbers convertNumbers = new ConvertNumbers();

        System.out.println("convertNumbers.convert() = " + convertNumbers.convert());
    }
}
