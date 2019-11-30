public class BaseClass {
    public String publicField = "BaseClass.publicField";
    private String privateField = "BaseClass.privateField";
    protected String protectedField = "BaseClass.protectedField";

    public void show () {
        System.out.println(privateField);
    }
}