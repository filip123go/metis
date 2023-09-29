package test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;
import service.three.TextEncryptor;

public class TextEncryptorTest {

    @Test
    public void testEncryptTextCats() {
        assertEquals("Atscay areway reatgay etspay.", TextEncryptor.encryptText("Cats are great pets."));
    }

    @Test
    public void testEncryptTextTom() {
        assertEquals("Omtay otgay away mallsay iecepay ofway iepay.", TextEncryptor.encryptText("Tom got a small piece of pie."));
    }

    @Test
    public void testEncryptTextHe() {
        assertEquals("Ehay oldtay usway away eryvay excitingway aletay.", TextEncryptor.encryptText("He told us a very exciting tale."));
    }
}