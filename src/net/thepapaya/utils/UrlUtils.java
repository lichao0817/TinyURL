package net.thepapaya.utils;

/**
 * Created by Chao on 2016/12/16.
 */
public class UrlUtils {

    public static int shortKeytoID(String shortKey) {
        int id = 0;
        for (int i = 0; i < shortKey.length(); ++i) {
            if ('a' <= shortKey.charAt(i) && shortKey.charAt(i) <= 'z')
                id = id * 62 + (shortKey.charAt(i) - 'a');
            if ('A' <= shortKey.charAt(i) && shortKey.charAt(i) <= 'Z')
                id = id * 62 + (shortKey.charAt(i) - 'A' + 26);
            if ('0' <= shortKey.charAt(i) && shortKey.charAt(i) <= '9')
                id = id * 62 + (shortKey.charAt(i) - '0' + 52);
        }
        return id;
    }

    public static String idToShortKey(int n) {
        StringBuffer shortKey = new StringBuffer();
        char[] c = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789".toCharArray();
        while (n > 0) {
            shortKey.append(c[(int)(n % 62)]);
            n = n / 62;
        }
        while (shortKey.length() < 6) {
            shortKey.append("a");
        }
        return shortKey.reverse().toString();
    }
}
