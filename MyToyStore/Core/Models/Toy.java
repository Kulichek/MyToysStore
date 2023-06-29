package MyToyStore.Core.Models;

import java.util.UUID;

public class Toy {
    
    private final String name;
    private int probability;
    private final UUID id;

    public Toy(String name, int probability) {
        this.name = name;
        this.probability = probability;
        this.id = UUID.randomUUID();
    }

    public String getName() {
        return name;
    }

    public int getProbability() {
        return probability;
    }

    public UUID getId() {
        return id;
    }

    public void setProbability(int newPrice) {
        this.probability = newPrice;
    }
     
    
}