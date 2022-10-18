package java_8_base64_encode_decode;

import java.nio.charset.StandardCharsets;
import java.util.Base64;

public class Base64BasicEncryptionExample {        // Basic Encoding and Decoding
    public static void main(String[] args) {

        // getting encoder
        Base64.Encoder encoder = Base64.getEncoder();

        // creating byte array
        byte byteArr[] = {1,2};

        // encoding byte array
        byte byteArr2 [] = encoder.encode(byteArr);
        System.out.println("Encoded byte arrray :" +  byteArr2);

        byte byteArr3 [] = new byte[5];   // enough size to store copied bytes
        int x = encoder.encode(byteArr,byteArr3);
        System.out.println("Encoded byte array written to another way :"+ byteArr3);
        System.out.println("Encoded String :"+ x);

        // Encoding String
        String str = encoder.encodeToString("JavaTpoint".getBytes(StandardCharsets.UTF_8));
        System.out.println("Encoded string :"+str);

        // Getting decoder
        Base64.Decoder decoder = Base64.getDecoder();

        // Decoding String
        String dstr = new String(decoder.decode(str));
        System.out.println("Decoding String "+ dstr);
    }
}
