/*
Задание 2
Разработать приложение, позволяющее по выбору пользователя использовать
русский или английский язык, для отображения информации. Приложение должно
представлять собой перечень вопросов под номерами (на английском или русском
соответственно). Выбрав номер вопроса пользователь может узнать ответ на него.
 */
package task2;

import java.util.Locale;
import java.util.ResourceBundle;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.print("language: ");
        Scanner in = new Scanner(System.in);
        Locale locale = new Locale(in.nextLine());
        ResourceBundle bundle = ResourceBundle.getBundle("task2.ClassBundle", locale);
        bundle.keySet().forEach(System.out::println);
        System.out.println("question: ");
        System.out.println(bundle.getObject(in.nextLine()));
    }
}
