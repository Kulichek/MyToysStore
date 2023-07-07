package MyToyStore.Core.Infrastructure;

import java.util.Queue;
import java.util.LinkedList;

import MyToyStore.Core.Models.Toy;

public class PrizeToys {

    Queue<Toy> toyQueue = new LinkedList<>();

    public void addToQueue(Toy prizeToy) {
        toyQueue.add(prizeToy);
    }

    public Toy getToyFromQueue() {
        if (toyQueue.isEmpty()) {
            return null;
        }
        return toyQueue.poll();
    }

    @Override
    public String toString() {
        String result = "";
        for (Toy toy : toyQueue) {
            result += toy+"\n";
        }
        return result;
    }

}
