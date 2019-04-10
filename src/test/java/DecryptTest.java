
import CeaserCipher.Decrypt;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class DecryptTest {
    @Test
    public void decrypter_testEncrypter_String(){
        Decrypt decryptTest = new Decrypt();
        String expectedOutput = "bcd";
        assertEquals(expectedOutput, decryptTest.decrypter("abc", 1));
    }
}
