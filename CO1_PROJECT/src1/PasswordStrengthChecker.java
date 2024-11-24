package src1;


public class PasswordStrengthChecker {

    public enum Strength {
        WEAK, MEDIUM, STRONG
    }

    /**
     * Checks the strength of a given password.
     * @param password the password to check
     * @return Strength enum representing the password's strength
     * @throws InvalidPasswordException if the password is null or empty
     */
    public Strength checkPasswordStrength(String password) throws InvalidPasswordException {
        if (password == null || password.trim().isEmpty()) {
            throw new InvalidPasswordException("Password cannot be null or empty.");
        }

        int length = password.length();
        boolean hasUppercase = password.chars().anyMatch(Character::isUpperCase);
        boolean hasLowercase = password.chars().anyMatch(Character::isLowerCase);
        boolean hasDigit = password.chars().anyMatch(Character::isDigit);
        boolean hasSpecialChar = password.chars().anyMatch(c -> "!@#$%^&*()_+-=[]{}|;:',.<>?/`~".indexOf(c) >= 0);

        // Evaluate strength
        if (length >= 12 && hasUppercase && hasLowercase && hasDigit && hasSpecialChar) {
            return Strength.STRONG;
        } else if (length >= 8 && ((hasUppercase && hasLowercase) || (hasDigit && hasSpecialChar))) {
            return Strength.MEDIUM;
        } else {
            return Strength.WEAK;
        }
    }
}

