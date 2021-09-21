package tryObserver;

public class Customer extends Observer {

    float discount;
    Store favStore;
    String name;


    public Customer(Store storeName, String name) {
        this.discount = this.favStore.discount;
        this.favStore = storeName;
        this.name = name;
    }

    @Override
    public void update(float discount) {
        this.discount = discount;
        System.out.println(this.name + " has a discount of " + this.discount);
    }

    public void register(Store storeName) {
        storeName.register(this);
    }

    public void unregister(Store storeName) {
        storeName.unregister(this);
    }
}
