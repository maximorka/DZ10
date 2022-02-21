package com.Task3;

import java.util.Arrays;
import java.util.stream.Collectors;

public class ConvertNumbers {
    // Получить из массива все числа, вернуть в отсортированном виде, разделенные запятой, то есть
    // "0, 1, 2, 4, 5"

    private String[] data = {"1, 2, 0", "4, 5"};

    public String convert() {
        String dataString = Arrays.asList(data).stream()
                .collect(Collectors.joining(", "));

        String result = Arrays.asList(dataString.split(",")).stream()
                .map(it -> it.trim())
                .sorted()
                .collect(Collectors.joining(","));

        return result;

    }

    public static void main(String[] args) {
        ConvertNumbers convertNumbers = new ConvertNumbers();

        System.out.println("convertNumbers.convert() = " + convertNumbers.convert());
    }
}
