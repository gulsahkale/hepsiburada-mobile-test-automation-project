package utils;

import java.util.Random;

public class Utils {

    public static String generateRandomString(int length) {
        String alphabet = "abcçdefgğhıijklmnoöprsştuüvyz";
        StringBuilder sb = new StringBuilder();
        Random random = new Random();
        for(int i = 0; i < length; i++) {
            int index = random.nextInt(alphabet.length());
            char randomChar = alphabet.charAt(index);
            sb.append(randomChar);
        }
        return sb.toString();
    }
}
