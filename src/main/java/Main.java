import java.util.concurrent.ThreadLocalRandom;

public class Main {

    public static void main(String[] args) {
        int intVar = 2147483647;
        long longVar = 9223372036854775807L;
        // доибваемся переполнения переменной Long прибавляя к максимальному числу лонг еще максимальное число инт
        long longVarExtra = intVar + longVar;

        System.out.println(longVar);
        System.out.println(longVarExtra);

        float floatVar = 1.3F;
        double doubleVar = 123456789.65656565656565;
        System.out.println(floatVar + " " + doubleVar);

        // деление целых чисел с получением числа в плавающей точкой
        int a = 2;
        int b = 3;
        double d = a/b; // получаем 0
        System.out.println(d);
        double c = (double) a/b; // получаем правильный результат
        System.out.println(c);

        // логические операторы
        boolean result = a > b; // получим false
        System.out.println(result);
        int randomFirst = ThreadLocalRandom.current().nextInt(1, 100);
        int randomSecond = ThreadLocalRandom.current().nextInt(1, 100);
        String compare = randomFirst > randomSecond ? "larger" : "smaller" ;
        System.out.println(randomFirst + " is " + compare + " than " + randomSecond);

        int zeroVar = 0;
        int largeVar = 1000000;
        double zeroDiv = (double) largeVar/zeroVar; // infinity
        System.out.println(zeroDiv);
        String month = "January";
        int day = 31;
        boolean logicResult = month == "Jan" && day < 31;
        System.out.println(logicResult);
        logicResult = month == "Jan" || day >= 31;
        System.out.println(logicResult);

    }
}
