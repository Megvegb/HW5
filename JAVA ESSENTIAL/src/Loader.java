public class Loader {
    public static void main(String[] args) {
        DerivedClass instance = new DerivedClass();
        System.out.println(instance.publicField);
        instance.show();
    }
}
