package T19_DependencyInversionPrinciple.Auth;

public interface ServiceAuthentication {

    public boolean auth(String user, String password);
} 