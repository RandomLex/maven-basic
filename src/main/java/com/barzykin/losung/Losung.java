package com.barzykin.losung;

import org.apache.commons.lang3.StringUtils;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Locale;

public class Losung {
    public static void main(String[] args) {

        System.out.print("Input a losung draft");
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))) {
            String srcLosung = reader.readLine();

            if (StringUtils.isEmpty(srcLosung)) {
                throw new IllegalArgumentException("You shouldn't input an empty string");
            }

            String result = srcLosung.toUpperCase(Locale.ROOT);

            System.out.println(result + "!!!");

        } catch (IOException e) {
            System.err.println("Ошибка во время чтения из консоли");
        }
    }
}