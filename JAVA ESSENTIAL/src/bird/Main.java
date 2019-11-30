package bird;

public class Main {
    public static void main(String[] args) {
        Bird s = new Straus();
        Bird p = new Pinguin();
        Bird f = new Swallow();
        Bird [] arr = {s, p, f};
        for (Bird temp:arr) {
            temp.move();

        }
    }
}
