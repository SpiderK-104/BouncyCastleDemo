package digest;


import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Arrays;
import java.util.HexFormat;

public class MessageDigestDemo  {
    public static void main(String[] args) throws NoSuchAlgorithmException {

        String str = "Hello World!";
        MessageDigest md = MessageDigest.getInstance("SHA-256");
        byte [] hash = md.digest(str.getBytes(StandardCharsets.UTF_8));
        System.out.println(HexFormat.of().formatHex(hash));
    }
}