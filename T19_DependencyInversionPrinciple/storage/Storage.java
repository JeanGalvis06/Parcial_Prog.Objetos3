package T19_DependencyInversionPrinciple.storage;

public interface Storage {
    public void saveFile(String file);
    public void recover(String file);
}
