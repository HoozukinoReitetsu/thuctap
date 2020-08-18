package bai_2;

public class Country {
    private String code,name,continent;
    private double surfaceArea,gnp;
    private int population,capital;

    public String getCode() {
        return this.code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getContinent() {
        return this.continent;
    }

    public void setContinent(String continent) {
        this.continent = continent;
    }

    public double getSurfaceArea() {
        return this.surfaceArea;
    }

    public void setSurfaceArea(double surfaceArea) {
        this.surfaceArea = surfaceArea;
    }

    public double getGnp() {
        return this.gnp;
    }

    public void setGnp(double gnp) {
        this.gnp = gnp;
    }

    public int getPopulation() {
        return this.population;
    }

    public void setPopulation(int population) {
        this.population = population;
    }

    public int getCapital() {
        return this.capital;
    }

    public void setCapital(int capital) {
        this.capital = capital;
    }

    @Override
    public String toString() {
        return "{" +
            " code='" + getCode() + "'" +
            ", name='" + getName() + "'" +
            ", continent='" + getContinent() + "'" +
            ", surfaceArea='" + getSurfaceArea() + "'" +
            ", gnp='" + getGnp() + "'" +
            ", poplation='" + getPopulation() + "'" +
            ", capital='" + getCapital() + "'" +
            "}";
    }

    public Country(String code, String name, String continent, double surfaceArea, double gnp, int poplation, int capital) {
        this.code = code;
        this.name = name;
        this.continent = continent;
        this.surfaceArea = surfaceArea;
        this.gnp = gnp;
        this.population = poplation;
        this.capital = capital;
    }
    
}