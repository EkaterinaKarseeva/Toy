import java.io.FileWriter;
import java.io.IOException;
import java.util.PriorityQueue;

public class ToyStore {
    private PriorityQueue<Toy> toyQueue;

    public ToyStore() {
        toyQueue = new PriorityQueue<>();
    }

    public void addToy(Toy toy) {
        toyQueue.add(toy);
    }

    public Toy getToy() {
        return toyQueue.poll();
    }

    public void runRaffle(int numOfDraws, String filePath) {
        try (FileWriter writer = new FileWriter(filePath)) {
            for (int i = 0; i < numOfDraws; i++) {
                Toy toy = getToy();
                if (toy != null) {
                    writer.write(toy.toString() + "\n");
                } else {
                    writer.write("No more toys available\n");
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
