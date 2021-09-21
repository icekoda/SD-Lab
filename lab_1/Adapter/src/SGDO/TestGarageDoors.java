package SGDO;

public class TestGarageDoors {

    public static void main(String[] args) {
        BasicGarageDoor standardDoor = new BasicGarageDoor();
        StdGarageDoorOpener adapter = new GarageDoorAdapter(standardDoor);

        adapter.closeDoor();
        adapter.openDoor();


    }
}
