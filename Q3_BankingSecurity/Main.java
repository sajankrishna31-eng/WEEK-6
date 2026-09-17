interface BasicSecurity {
    void login();
    void logout();
}

interface AdvancedSecurity extends BasicSecurity {
    void fingerprintAuthentication();
    void faceRecognitionAuthentication();
}

class BankingApplication implements AdvancedSecurity {
    @Override
    public void login() {
        System.out.println("Basic login successful");
    }

    @Override
    public void logout() {
        System.out.println("Logged out successfully");
    }

    @Override
    public void fingerprintAuthentication() {
        System.out.println("Fingerprint authentication successful");
    }

    @Override
    public void faceRecognitionAuthentication() {
        System.out.println("Face recognition authentication successful");
    }
}

public class Main {
    public static void main(String[] args) {
        BankingApplication bank = new BankingApplication();
        bank.login();
        bank.fingerprintAuthentication();
        bank.faceRecognitionAuthentication();
        bank.logout();
    }
}
