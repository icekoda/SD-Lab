package tryObserver;

public class TestDriver {
    public static void main(String[] args) {
        Store mcdonalds = new Store("MCDonalds", (float) 2.99);
        Store tim_hortons = new Store("Tim Hortons", (float) 1.99);

        Customer customer1 = new Customer(mcdonalds, "Adam");
        Customer customer2 = new Customer(mcdonalds, "Daniel");
        Customer customer3 = new Customer(mcdonalds, "Harris");

//        Register Customers
        customer1.register(mcdonalds);
        customer1.register(tim_hortons);
        customer2.register(mcdonalds);
        customer2.register(tim_hortons);
//      Update Customer2 discount
        customer2.update((float) 3.99);
        customer3.register(mcdonalds);
        customer3.register(tim_hortons);
//      Add discount to McDonalds
        mcdonalds.setDiscount("Lab 1", (float) 5.99);

//        Unregister Customers
        customer1.unregister(mcdonalds);
        customer1.unregister(tim_hortons);
        customer2.unregister(mcdonalds);
        customer2.unregister(tim_hortons);
        customer3.unregister(mcdonalds);
        customer3.unregister(tim_hortons);

    }
}
