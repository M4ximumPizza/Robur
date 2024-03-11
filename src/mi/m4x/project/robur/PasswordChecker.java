package mi.m4x.project.robur;

/**
 * A class to check the strength of a password.
 *
 * @author M4ximumPizza
 */
public class PasswordChecker {
    public int calculatePasswordStrength(String password) {
        int score = 0;

        // Check length
        if (password.length() >= 8) {
            score += 5;
        }

        // Check for lowercase letters
        if (password.matches(".*[a-z].*")) {
            score += 5;
        }

        // Check for uppercase letters
        if (password.matches(".*[A-Z].*")) {
            score += 5;
        }

        // Check for digits
        if (password.matches(".*\\d.*")) {
            score += 5;
        }

        // Check for special characters
        if (password.matches(".*[!@#$%^&*()-_=+].*")) {
            score += 5;
        }

        return score;
    }

    public String determineStrength(int score) {
        if (score < 20) {
            return "Weak";
        } else if (score < 35) {
            return "Moderate";
        } else if (score < 50) {
            return "Strong";
        } else {
            return "Very Strong";
        }
    }
}

