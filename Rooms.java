package OOP_HomeTask;

public class Rooms {

    private boolean pass;

    public Rooms(boolean pass) {
        this.pass = pass;
    }

    public void print() {
        if (pass) {
            System.out.println("проходная комната");
        } else {
            System.out.println("непроходная комната");
        }
    }

    public boolean isPass() {
        return pass;
    }

    public void setPass(boolean pass) {
        this.pass = pass;
    }
}

