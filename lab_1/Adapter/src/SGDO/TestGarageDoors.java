package SGDO;

public class TestGarageDoors {

    public static void main(String[] args) {
        PremiumGarageDoorOpener premiumDoor = new PremiumGarageDoorOpener();
        StdGarageDoorOpener adapter = new GarageDoorAdapter(premiumDoor);

        adapter.closeDoor();
        adapter.openDoor();


    }
}
