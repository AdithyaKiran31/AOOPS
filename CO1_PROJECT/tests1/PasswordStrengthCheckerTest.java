package tests1;

import src1.PasswordStrengthChecker;
import src1.PasswordStrengthChecker.Strength;
import src1.InvalidPasswordException;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class PasswordStrengthCheckerTest {

    private final PasswordStrengthChecker checker = new PasswordStrengthChecker();

    @Test
    void testWeakPassword() throws InvalidPasswordException {
        assertEquals(Strength.WEAK, checker.checkPasswordStrength("abc123"));
        assertEquals(Strength.WEAK, checker.checkPasswordStrength("password"));
        assertEquals(Strength.WEAK, checker.checkPasswordStrength("123456"));
    }

    @Test
    void testMediumPassword() throws InvalidPasswordException {
        assertEquals(Strength.MEDIUM, checker.checkPasswordStrength("Abc12345"));
        assertEquals(Strength.MEDIUM, checker.checkPasswordStrength("1234@abc"));
    }

    @Test
    void testStrongPassword() throws InvalidPasswordException {
        assertEquals(Strength.STRONG, checker.checkPasswordStrength("A1b2@C3d4!"));
        assertEquals(Strength.STRONG, checker.checkPasswordStrength("StrongP@ssw0rd123"));
    }

    @Test
    void testInvalidPassword() {
        assertThrows(InvalidPasswordException.class, () -> checker.checkPasswordStrength(null));
        assertThrows(InvalidPasswordException.class, () -> checker.checkPasswordStrength(""));
        assertThrows(InvalidPasswordException.class, () -> checker.checkPasswordStrength("     "));
    }
}
