package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.print("Введите пример: ");
        String exeA = in.nextLine(); // ввод строки
        String words[] = new String[3]; // объявление и инициализация массива
        int result = 0;  // объявление переменной результата
        words = exeA.split(" "); // разделение строки на массив из трёх строк
        String[] znaky = {"+", "-", "*", "/"}; // объявление массива знаков
        String[] arab = {"1", "2", "3", "4", "5", "6", "7", "8", "9", "10"}; // объявление массива арабских чисел
        String[] rim = {"I", "II", "III", "IV", "V", "VI", "VII", "VIII", "IX", "X"}; // объявление массива римских чисел
        String[] rimResult = {"I", "II", "III", "IV", "V", "VI", "VII", "VIII", "IX", "X", "XI", "XII", "XIII", "XIV", "XV", "XVI", "XVII", "XVIII", "XIX", "XX", "XXI", "XXII", "XXIII", "XXIV", "XXV", "XXVI", "XXVII", "XXVIII", "XXIX", "XXX", "XXXI", "XXXII", "XXXIII", "XXXIV", "XXXV", "XXXVI", "XXXVII", "XXXVIII", "XXXIX", "XL", "XLI", "XLII", "XLIII", "XLIV", "XLV", "XLVI", "XLVII", "XLVIII", "XLIX", "L", "LI", "LII", "LIII", "LIV", "LV", "LVI", "LVII", "LVIII", "LIX", "LX", "LXI", "LXII", "LXIII", "LXIV", "LXV", "LXVI", "LXVII", "LXVIII", "LXIX", "LXX", "LXXI", "LXXII", "LXXIII", "LXXIV", "LXXV", "LXXVI", "LXXVII", "LXXVIII", "LXXIX", "LXXX", "LXXXI", "LXXXII", "LXXXIII", "LXXXIV", "LXXXV", "LXXXVI", "LXXXVII", "LXXXVIII", "LXXXIX", "XC", "XCI", "XCII", "XCIII", "XCIV", "XCV", "XCVI", "XCVII", "XCVIII", "XCIX", "C"}; // объявление массива результата римских чисел
        boolean f = false; // флаг выполнения примера
        boolean fRim = false; // флаг выполнения примера римских цифр

        // проверка примера на арабские цифры и вычисление
        for (int i = 0; i < 4; i++)
        {
            if (words[1].equals(znaky[i]))
            {
                for (int ia = 0; ia < 10; ia++)
                {
                    if (words[0].equals(arab[ia]))
                    {
                        for (int ib = 0; ib < 10; ib++)
                        {
                            if (words[2].equals(arab[ib]))
                            {
                                int a = Integer.parseInt(words[0]); // преобразование первой строки в число
                                int b = Integer.parseInt(words[2]); // преобразование третьей строки в число
                                if (i == 0) {
                                    result = a + b;
                                    f = true;
                                } else {
                                    if (i == 1) {
                                        result = a - b;
                                        f = true;
                                    } else {
                                        if (i == 2){
                                            result = a * b;
                                            f = true;
                                        } else {
                                            result = a / b;
                                            f = true;
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        // проверка примера на римские цифры и вычисление
        for (int i = 0; i < 4; i++)
        {
            if (words[1].equals(znaky[i]))
            {
                for (int ia = 0; ia < 10; ia++)
                {
                    if (words[0].equals(rim[ia]))
                    {
                        for (int ib = 0; ib < 10; ib++)
                        {
                            if (words[2].equals(rim[ib]))
                            {
                                int a = ia + 1; // преобразование первой строки в число
                                int b = ib + 1; // преобразование третьей строки в число
                                if (i == 0) {
                                    result = a + b;
                                    f = true;
                                    fRim = true;
                                } else {
                                    if (i == 1) {
                                        result = a - b;
                                        f = true;
                                        fRim = true;
                                    } else {
                                        if (i == 2){
                                            result = a * b;
                                            f = true;
                                            fRim = true;
                                        } else {
                                            result = a / b;
                                            f = true;
                                            fRim = true;
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        if (f == false) {
            System.out.println("Введён некорректный пример");
        } else {
            if (fRim == false) {
                System.out.printf("Сумма = %d \n", result);
            } else {
                System.out.printf("Сумма = %s \n", rimResult[result-1]);
            }
        }
        /*
        если строка2 входит в массив [+, -, *, /], то
            если строка1 входит в массив [1, 2, 3, 4, 5, 6, 7, 8, 9, 10], то
                если строка3 входит в массив [1, 2, 3, 4, 5, 6, 7, 8, 9, 10], то
                    вычисляем
                иначе
                    "Введён некорректный пример"
            иначе
                если строка1 входит в массив [I, II, III, IV, V, VI, VII, VIII, IX, X], то
                    если строка1 входит в массив [I, II, III, IV, V, VI, VII, VIII, IX, X], то
                        вычисляем
                    иначе
                       "Введён некорректный пример"
                иначе
                    "Введён некорректный пример"
        иначе
            "Введён некорректный пример"
        */
        in.close();
    }
}
