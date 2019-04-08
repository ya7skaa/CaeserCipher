import CaesarCipher.Encrypt;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class EncryptTest {
    @Test
    public void encrypter_testUpperCase_String(){
        Encrypt encryptTest = new Encrypt();
        String expectedOutput = "BCD";
        assertEquals(expectedOutput, encryptTest.encrypter("ABC", 1));

    }
    @Test
    public void encrypter_testEncrypter_String(){
        Encrypt encryptTest = new Encrypt();
        String expectedOutput = "bcd";
        assertEquals(expectedOutput, encryptTest.encrypter("abc", 1));

    }



}
