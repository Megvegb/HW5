package task_1.competitors;

public class Sportsman extends Human {
    private String name;
    private int maxRunDist;
    private int maxJumpHgt;

    public Sportsman (String name, int maxRunDist, int maxJumpHgt) {
        super(name);
        this.maxRunDist = maxRunDist;
        this.maxJumpHgt = maxJumpHgt;
    }
}
