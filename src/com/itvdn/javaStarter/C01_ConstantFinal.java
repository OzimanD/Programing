package com.itvdn.javaStarter;

public class C01_ConstantFinal {
    public static void main(String[] args) {
        // На 7-му рядку створюємо константу з ім'ям PI, типу double і присвоюємо їй значення 3.1415

        final double PI = 3.1415;

        // На 11-му рядку виводимо значення константи - PI на екран.

        System.out.println("Значення числа Пі у мирний час дорівнює: " + PI + " у найкращі роки");

        // Спроба присвоєння константі нового значення призводить до помилки рівня компіляції.!

        // PI = 2.71828183;
    }
}

