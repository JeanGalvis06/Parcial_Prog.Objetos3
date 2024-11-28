package T19_DependencyInversionPrinciple.Auth;

public class AuthenticationLocal implements ServiceAuthentication {

    @Override
    public boolean auth(String user, String password) {
        return "juan".equals(user) && "12345".equals(password);
    }
    
}
