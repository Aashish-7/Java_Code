package java_8_base64_encode_decode;

import java.util.Base64;

public class Base64BasicEncryptionExample2 {
    // MIME Encoding and Decoding
    public static void main(String[] args) {

        // getting MIME encoder
        Base64.Encoder encoder = Base64.getMimeEncoder();

        // encoded string MIME
        String message = "Hello, Java !!";
        String str = encoder.encodeToString(message.getBytes());
        System.out.println("Encoded MIMI msg  :"+ str);

        // getting MIME decoder
        Base64.Decoder decoder = Base64.getMimeDecoder();

        // decoded string MIME
        String dstr = new String(decoder.decode(str));
        System.out.println("Decoded Message :" + dstr);
    }
}
