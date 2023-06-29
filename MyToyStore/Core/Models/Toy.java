package MyToyStore.Core.Models;

import java.util.UUID;

public class Toy implements Comparable<Toy> {

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

    @Override
    public String toString() {
        return "Игрушка [имя: " + name + ", id=" + id + "]";
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((name == null) ? 0 : name.hashCode());
        long temp;
        temp = Double.doubleToLongBits(probability);
        result = prime * result + (int) (temp ^ (temp >>> 32));
        result = prime * result + ((id == null) ? 0 : id.hashCode());
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Toy other = (Toy) obj;
        if (name == null) {
            if (other.name != null)
                return false;
        } else if (!name.equals(other.name))
            return false;
        if (Double.doubleToLongBits(probability) != Double.doubleToLongBits(other.probability))
            return false;
        if (id == null) {
            if (other.id != null)
                return false;
        } else if (!id.equals(other.id))
            return false;
        return true;
    }

    @Override
    public int compareTo(Toy other) {

        return Double.compare(this.probability, other.getProbability());

    }

    
}
