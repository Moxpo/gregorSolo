import org.w3c.dom.ls.LSOutput;

public class gregorShip {

    private String name;
    private String model;
    private int maxSpeed;
    private String owner;


    public gregorShip(String name, String model, int maxSpeed, String owner) {
        this.name = name;
        this.model = model;
        this.maxSpeed = maxSpeed;
        this.owner = owner;
    }

    public static void main(String[] args) {
        gregorShip newShip = new gregorShip(args[0], args[1], Integer.valueOf(args[2]), args[3]);


        System.out.println(newShip);
    }


}
