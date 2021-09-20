package SGDO;

public class GarageDoorAdapter implements StdGarageDoorOpener {

    private BasicGarageDoor doorOpener;

    public GarageDoorAdapter(BasicGarageDoor doorOpener) {
        this.doorOpener = doorOpener;
    }

    public void openDoor() {
        doorOpener.openDoor();
    }

    public void closeDoor() {
        doorOpener.closeDoor();
    }
}
