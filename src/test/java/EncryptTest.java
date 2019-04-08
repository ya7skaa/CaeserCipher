import CaesarCipher.Encrypt;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class EncryptTest {
    @Test
    public void encrypter_testEncrypter_String(){
        Encrypt encryptTest = new Encrypt();
        String expectedOutput = "bcd";
        assertEquals(expectedOutput, encryptTest.encrypter("abc", 1));

    }



}
