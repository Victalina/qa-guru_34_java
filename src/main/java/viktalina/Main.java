package viktalina;

import java.util.*;

public class Main {
  public static void main(String[] args) {
    Human dima = new Human(
            "Dmitrii",
            34,
            true
    );
    System.out.println("Name: " + dima.getName()); // перегрузка оператора "+" для сложения и склеивания строк - конкатенация
    System.out.println("Name: " + dima.getAge());
    System.out.println("Name: " + dima.isCute());

 //   dima.setName("Dmitrii");
 //   dima.setAge(34);
 //   dima.setCute(true);

    System.out.println(dima);
    dima = dima.incrememtAge();
    System.out.println(dima);

    dima.sayHelloNonStatic();

    List<String> lectures = new ArrayList<>(); // лист
    lectures.add("git");
    lectures.add("java");
    lectures.add("files");
    lectures.add("junit");

    Set<String> lecturesSet = Set.of("git", "java", "files", "junit");  //new HashSet нельзя добавить одинаковые значения, множество уникальных объектов
    Map<String, Human> humans = new HashMap<>(); //аналог БД, доступ по ключу
    humans.put("47754455", dima);

    for (Map.Entry<String, Human> entry : humans.entrySet()) {
      entry.getKey();
      entry.getValue();
    }

    for (String key : humans.keySet()){

    }

    for (Human value : humans.values()){

    }

    int hours = 12;
    String hello = "Hello";
    dima.printSomeValues(hours, hello, lectures );

    System.out.println("After method, int: " + hours );
    System.out.println("After method, String: " + hello );
    System.out.println("After method, List: " + lectures );

    String[] lecturesArray = new String[4]; // массив
    lecturesArray[0] = "git";
    lecturesArray[1] = "java";
    lecturesArray[2] = "files";
    lecturesArray[3] = "junit";

    int[] intArray0 = new int[] {1,2,3};
    int[] intArray1 = new int[] {1,2,3};
    int [][] biArray = new int[][] {     // двухмерный массив
            intArray0,
            intArray1
    };

    for (int i = 0; i < lecturesArray.length; i++){  //цикл: инициализация, условия завершения, изменения
      System.out.println(lecturesArray[i]);
    }

    for (int i = lecturesArray.length - 1; i >= 0; i--){  //цикл: инициализация, условия завершения, изменения
      System.out.println(lecturesArray[i]);
    }

    for (String lectureName : lecturesArray) {
      if (lectureName.startsWith("j")) {
        System.out.println(lectureName);
        break;
      }
    }

    for (String lectureName : lecturesArray) {
      if (!lectureName.startsWith("j")) {
        continue;
      }
      System.out.println(lectureName);
    }

    int i = 0;                             //может быть 0 итераций
    while (i < lecturesArray.length) {
      System.out.println(lecturesArray[i]);
      i++;
    }

   // do{                                      // будет хотя бы одна итерация всегда

   // }
  //  while ();




  }
}
