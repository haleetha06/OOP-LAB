interface Authenticator {
    boolean login(String username, String password);
    void logout();
}

interface TokenGenerator {
    String generateToken();
}

class AuthService implements Authenticator, TokenGenerator {
        public boolean login(String username, String password) {
        return username.equals("halitha") && password.equals("060306");
    }

        public void logout() {
        System.out.println("User logged out");
    }

      public String generateToken() {
        return "TOKEN-" + System.currentTimeMillis();
    }
}

public class interface_1  {
    public static void main(String[] args) {
        AuthService auth = new AuthService();
        System.out.println("Login successful? " + auth.login("halitha", "060306"));
        System.out.println("Generated Token: " + auth.generateToken());
        auth.logout();
    }
}