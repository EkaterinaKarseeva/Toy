public class Main {
    public static void main(String[] args) {
        ToyStore store = new ToyStore();
        store.addToy(new Toy("1", "Teddy Bear", 10));
        store.addToy(new Toy("2", "Lego Set", 5));
        store.addToy(new Toy("3", "Toy Car", 20));

        store.runRaffle(10, "raffle_results.txt");
    }
}
