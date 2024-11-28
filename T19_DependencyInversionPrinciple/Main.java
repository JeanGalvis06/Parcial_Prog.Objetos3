package T19_DependencyInversionPrinciple;

import T19_DependencyInversionPrinciple.Auth.Authentication0Auth;
import T19_DependencyInversionPrinciple.Auth.AuthenticationLocal;
import T19_DependencyInversionPrinciple.Auth.ManagerAuthentication;
import T19_DependencyInversionPrinciple.Auth.ServiceAuthentication;
import T19_DependencyInversionPrinciple.storage.LocalStorage;
import T19_DependencyInversionPrinciple.storage.ManagerFile;
import T19_DependencyInversionPrinciple.storage.Storage;

public class Main {
    public static void main(String[] args) {
        //Auth
        ServiceAuthentication authLocal = new AuthenticationLocal();
        ManagerAuthentication managerAuthentication = new ManagerAuthentication(authLocal);
        System.out.println(managerAuthentication.authentication("juan", "12345"));


        ServiceAuthentication authO = new Authentication0Auth();
        ManagerAuthentication managerAuthentication2 = new ManagerAuthentication(authO);
        System.out.println(managerAuthentication2.authentication("joaksu", "32421323"));



        //Storagee
        Storage localStorage = new LocalStorage();
        ManagerFile managerFile = new ManagerFile(localStorage);
        managerFile.createFile("new file");
        managerFile.recoerFile("new file");

    }
}
