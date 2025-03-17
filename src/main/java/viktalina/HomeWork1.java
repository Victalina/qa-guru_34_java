package viktalina;

public class HomeWork1 {
  public static void main(String[] args){
    int intFirst = 5;
    int intSecond = 2;
    Double doubleFirst = 1.5;
    Double doubleSecond = 2.0;

    // применить несколько арифметических операций ( + , -, * , /) над двумя примитивами типа int
    System.out.println(intFirst + intSecond);
    System.out.println(intFirst - intSecond);
    System.out.println(intFirst * intSecond);
    System.out.println(intFirst / intSecond);

    // применить несколько арифметических операций над int и double в одном выражении
    System.out.println(intFirst / doubleSecond);
    System.out.println(intFirst - doubleFirst);

    // применить несколько логических операций ( < , >, >=, <= )
    System.out.println(doubleFirst < doubleSecond || intFirst >= intSecond);
    int intThird = intFirst > intSecond && doubleFirst < doubleSecond ? 10 : 11;
    System.out.println(intThird);

    if(intFirst <= intSecond != true) {
      System.out.println("Success");
    } else {
      System.out.println("Fail");
    }

    // получить переполнение при арифметической операции

    int x = Integer.MAX_VALUE;
    int y = Integer.MAX_VALUE;
    int z = x * y;
    System.out.println(z);

    long d = Long.MIN_VALUE;
    long g = - d;
    System.out.println(d + ", "+ g);


    float a = Float.MAX_VALUE;
    float b = Float.MAX_VALUE;
    float c = a * b;
    System.out.println(c);
  }
}