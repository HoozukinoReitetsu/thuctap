package bai_2;

public class City {
    private int id,population;
    private String name;

    public int getId() {
        return this.id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getPopulation() {
        return this.population;
    }

    public void setPopulation(int population) {
        this.population = population;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "{" +
            " id='" + getId() + "'" +
            ", population='" + getPopulation() + "'" +
            ", name='" + getName() + "'" +
            "}";
    }

    public City(int id, int population, String name) {
        this.id = id;
        this.population = population;
        this.name = name;
    }

}