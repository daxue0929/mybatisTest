package util;


import java.util.Random;

public class RandomUtil {
    public static Integer getInstance(int number) {

        Random random = new Random();
        int anInt = random.nextInt(number);
        return anInt;
    }
}
