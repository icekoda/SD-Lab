package SGDO;

public class GarageDoorAdapter implements StdGarageDoorOpener {

    private PremiumGarageDoorOpener doorOpener;

    private int doorSpeed = 10;

    public GarageDoorAdapter(PremiumGarageDoorOpener doorOpener) {
        this.doorOpener = doorOpener;
    }

    public void openDoor() {
        doorOpener.openDoor(doorSpeed);
    }

    public void closeDoor() {
        doorOpener.closeDoor(doorSpeed);
    }
}
