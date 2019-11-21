abstract public class Player {

    public Player(){}

    public Player(String name) {
        setName(name);
    }

    private String name = "Anonim";

    public void setName(String name) {

        if(name!=null  && name.matches("^[a-zA-Z0-9~]{3,}$")) {
            this.name = name;
        }
        else {
            throw new IllegalArgumentException("Nieprawidłowe imię.");
        }
    }

    public String getName() {
        return name;
    }

    public abstract int guess();
}