public class Animal {

    private int runMaxDistance;
    private int swimMaxDistance;
    private double jumpMaxDistance;

    public Animal(int runMaxDistance, int swimMaxDistance, double jumpMaxDistance) {
        this.runMaxDistance = runMaxDistance;
        this.swimMaxDistance = swimMaxDistance;
        this.jumpMaxDistance = jumpMaxDistance;
    }

    public void run(int runDistance) {
        System.out.println("run: " + (runDistance <= runMaxDistance));
    }

    public void swim(int swimDistance) {
        System.out.println("swim: " + (swimDistance <= swimMaxDistance));
    }

    public void jump(double jumpHeight) {
        System.out.println("jump: " + (jumpHeight <= jumpMaxDistance));
    }

}