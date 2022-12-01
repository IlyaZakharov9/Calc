package Test;

import java.io.IOException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scn = new Scanner(System.in);
        RomanArab converter = new RomanArab();

        System.out.println("Ввод выражения a + b, a - b, a * b, a / b (арабские или римские числа от 1 до 10 включительно, не более): ");



        String input = scn.nextLine();


        String[] data = null;
        String sign = null;
        input = input.replace(" ", "");


        if (input.contains("+")) {
            data = input.split("\\+");
            sign = "+";
        } else if (input.contains("-")) {
            data = input.split("-");
            sign = "-";
        } else if (input.contains("*")) {
            data = input.split("\\*");
            sign = "*";
        } else if (input.contains("/")) {
            data = input.split("/");
            sign = "/";
        } else {
            System.out.println("Неверный знак");
            return;
        }

        if (converter.roman(data[0]) == converter.roman(data[1])) {
            int a, b;


            boolean numRoman = converter.roman(data[0]);
            if (numRoman) {

                a = converter.fromRoman (data[0]);
                b = converter.fromRoman(data[1]);



            } else {
                a = Integer.parseInt(data[0]);
                b = Integer.parseInt(data[1]);


            }
            int result=0;


            switch (sign) {
                    case "+":
                        result = a + b;
                        break;
                    case "-":
                        result = a - b;
                        break;
                    case "*":
                        result = a * b;
                        break;
                    case "/":
                        result = a / b;
                        break;
            }
                if (numRoman) {
                    System.out.println(converter.toRoman(result));
                }
                else {
                    System.out.println(result);
            }
        }
    }
}