package viktalina;

import java.util.List;

public class FirstClass {

  public static void main(String[] args) {
    // 8 приметивных типов данных
    //  Целочисленные типы (не являются объектом)
    byte aByte = 0; // 8b -128 +127
    short aShort = 0; // 16b -32768 +32767
    int aInt = 0; // 32b (-2^32) ... (+2^32 - 1)
    Integer aInt1 =0; // обертка, объект
    long aLong = 0L; // 64b

    // Типы с плавающей точкой
    float aFloat = 0.0F; // 32b
    double aDouble = 0.0; // 64b
    Double aDouble1 =9.1; // обертка, объект

    // Символьный тип
    char aChar = 'a'; // целочисленный, хранит числовой код символа
    Character aChar1 = 'b'; // обертка, объект

    // Логический тип
    boolean aBoulean = true;

    // Строка (объектный или ссылочный тип)
    String toBePrint = "Hello, World!";

    // Список строк
    List<String> teachers = List.of("Stanislav", "Dmitrii");

    System.out.println(toBePrint);

    // Операторы

    // Оператор присвоения =
    String nameFirst = "Dmitrii";
    String nameSecond = "Dmitrii";
    int age = 34;

    // Арифметические опертаторы + - / * % ++ --

    System.out.println(4.0 + 3);

    // Операторы сравнения <, >, >=, <=, !=, ==, нельзя сравнивать объектные типы, для них equals

    System.out.println(3 > 2);

    // Логические операторы &, |, &&, ||, !

    System.out.println(nameFirst.equals("Dmitrii") && age == 34); // && выполение заканчивается если первое условие не верно

    if (nameFirst != null & nameFirst.length() == 5) {        // можно получить исключение, если в nameFirst будет null
      System.out.println("Удача");
    }

    // Оператор instanceof
    System.out.println(nameFirst instanceof String);

    // Тернарный оператор (есть ограничения, обязан вернуть результат)
    char sex ='m';
    String childName = sex == 'm' ? "Valentin" : "Valentina";

    // Управляющая конструкция if

    if (sex == 'm') {
      childName = "Valentin";
    } else if (sex == 'v'){    // else if и/или else может не быть
      childName = "Valentina";
    } else {
      System.out.println("((");
    }

    // ключевое слово new (для создание объектов - данных, описанных в классе

    String name = new String("тест"); // можно без new - исключение
  }
}