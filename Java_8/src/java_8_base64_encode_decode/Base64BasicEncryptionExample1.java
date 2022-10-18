package java_8_base64_encode_decode;

import java.util.Base64;

public class Base64BasicEncryptionExample1 {
    // URL Encoding and Decoding
    public static void main(String[] args) {

        // Getting encoder
        Base64.Encoder encoder = Base64.getUrlEncoder();

        // Encoding url
        String str = encoder.encodeToString("https://www.javatpoint.com".getBytes());
        System.out.println("Encoded Url :"+ str);

        // Getting decoder
        Base64.Decoder decoder = Base64.getUrlDecoder();

        // Decoding url
        String dstr = new String(decoder.decode(str));
        System.out.println("Decoded Url :"+ dstr);
    }
}
