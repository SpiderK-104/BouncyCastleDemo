package digest;


import init.Register;

import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.security.NoSuchProviderException;
import java.util.Arrays;
import java.util.HexFormat;

public class MessageDigestDemo {
    public static void main(String[] args) throws NoSuchAlgorithmException, NoSuchProviderException {
        Register.init();
        String text = "This is a test message";
        MessageDigest md = MessageDigest.getInstance("SM3", "BC");
        byte[] hash = md.digest(text.getBytes(StandardCharsets.UTF_8));
        System.out.println(HexFormat.of().formatHex(hash));
    }
}