package utils;

import java.util.Base64;

public class Base64Utils {
    public static void main(String[] args) {
        String a = Base64.getEncoder().encodeToString("a".getBytes());    // YQ==
        String ab = Base64.getEncoder().encodeToString("ab".getBytes());   // YWI=
        String abc = Base64.getEncoder().encodeToString("abc".getBytes());  // YWJj
        String abcd = Base64.getEncoder().encodeToString("abcd".getBytes()); // YWJjZA==

        System.out.println(a);
        System.out.println(ab);
        System.out.println(abc);
        System.out.println(abcd);
    }
}
