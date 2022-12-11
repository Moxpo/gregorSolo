public class gregorShip {
    private String name;
    private String model;
    private int naxSpeed;
    private String owner;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getNaxSpeed() {
        return naxSpeed;
    }

    public void setNaxSpeed(int naxSpeed) {
        this.naxSpeed = naxSpeed;
    }

    public String getOwner() {
        return owner;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }

    public gregorShip(String name, String model, int naxSpeed, String owner) {
        this.name = name;
        this.model = model;
        this.naxSpeed = naxSpeed;
        this.owner = owner;
    }
}
