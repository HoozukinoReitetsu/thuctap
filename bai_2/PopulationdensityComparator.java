package bai_2;

import java.util.*;
public class PopulationdensityComparator implements Comparator<Country> {

    @Override
    public int compare(Country o1, Country o2) {
        if((o1.getPopulation()/o1.getSurfaceArea()) > (o2.getPopulation()/o2.getSurfaceArea())) return -1;
        else return 1;
        
    }
}
