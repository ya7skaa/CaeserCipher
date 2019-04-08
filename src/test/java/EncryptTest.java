import CaesarCipher.Encrypt;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class EncryptTest {
    @Test
    public void encrypter_testEncrypter_String(){
        Encrypt encryptTest = new Encrypt();
        String expectedOutput = "QEB NRFZH YOLTK CLU GRJMP LSBO QEB IXWV ALD";
        assertEquals(expectedOutput, encryptTest.encrypter("THE QUICK BROWN FOX JUMPS OVER THE LAZY DOG", 23));

    }



}
