package database;

import java.util.*;

public class main {
    public static void main( final String args[] ) {
        final Map<Country, ArrayList<City>> storage = new HashMap<>();
        creatData(storage);
        findMostPopulationCityInCountry(storage);
        findMostPopulationCityInContinent(storage);
        findMostPopulationCapital(storage);
        findMostPopulationCapitalInContinent(storage);
        sortCountryWithDescNumberOfCities(storage);
        sortCountry(storage);

    }

    public static void creatData(final Map<Country, ArrayList<City>> storage) {
        final ArrayList<City> Cities = new ArrayList<>();
        final Country country1 = new Country("121", "vn", "asian", 13455, 5645.17, 9000000, 1);
        Cities.add(new City(1, 123, "hn"));
        Cities.add(new City(3, 4635, "nd"));
        Cities.add(new City(4, 5723, "nb"));
        Cities.add(new City(5, 3457, "dn"));
        Cities.add(new City(7, 234423, "tq"));
        storage.put(country1, Cities);
        final Country country2 = new Country("142", "amc", "South", 300, 40, 1000, 4);
        final ArrayList<City> arr2 = new ArrayList<>();
        arr2.add(new City(3, 12412, "12"));
        arr2.add(new City(4, 50, "assdw"));
        storage.put(country2, arr2);
    }

    public static Map<String, ArrayList<City>> getAllCapitalsInContinent(final Map<Country, ArrayList<City>> storage) {
        final Map<String, ArrayList<City>> temp = new HashMap<>();

        storage.forEach((k, v) -> {
            final ArrayList<City> m = temp.getOrDefault(k.getContinent(), new ArrayList<>());
            //
            final int cap = k.getCapital();
            final Optional<City> op = v.stream().filter(i -> i.getId() == cap).findFirst();
            op.ifPresent(m::add);
            //
            temp.put(k.getContinent(), m);
        });
        return temp;
    }

    public static void findMostPopulationCityInCountry(final Map<Country, ArrayList<City>> storage) {
        System.out.println("MostPopulationCityInCountry");
        final Map<Country, City> temp = new HashMap<>();
        storage.forEach((k, v) -> {
            final Optional<City> optional = v.stream().max(Comparator.comparingInt(City::getPopulation));
            optional.ifPresent(city -> temp.put(k, city));
        });
        temp.forEach((k, v) -> {
            System.out.print(k);
            System.out.print(" ----> ");
            System.out.println(v);
        });
    }

    public static Map<String, ArrayList<City>> getAllCitiesInContinent(final Map<Country, ArrayList<City>> storage) {
        final Map<String, ArrayList<City>> temp = new HashMap<>();

        storage.forEach((k, v) -> {
            final ArrayList<City> m = temp.getOrDefault(k.getContinent(), new ArrayList<>());
            m.addAll(v);
            temp.put(k.getContinent(), m);
        });
        return temp;
    }

    public static void findMostPopulationCityInContinent(final Map<Country, ArrayList<City>> storage) {

        System.out.println("MostPopulationCityInContinent");
        final Map<String, ArrayList<City>> st = getAllCitiesInContinent(storage);
        final Map<String, City> result = new HashMap<>();
        st.forEach((k, v) -> {
            final Optional<City> op = v.stream().max(Comparator.comparingInt(City::getPopulation));
            op.ifPresent(city -> result.put(k, city));
        });

        result.forEach((k, v) -> {
            System.out.print(k);
            System.out.print(" ----> ");
            System.out.println(v);
        });
    }

    public static void findMostPopulationCapital(final Map<Country, ArrayList<City>> storage) {
        System.out.println("MostPopulationCaptital");
        final ArrayList<City> m = new ArrayList<>();
        storage.forEach((k, v) -> {
            final int cap = k.getCapital();
            final Optional<City> op = v.stream().filter(i -> i.getId() == cap).findFirst();
            op.ifPresent(m::add);
        });
        final Optional<City> result = m.stream().max(Comparator.comparingInt(City::getPopulation));
        if (result.isPresent()) {
            System.out.println(result.get());
        } else {
            System.out.println("NOT FOUND");
        }
    }

    public static void findMostPopulationCapitalInContinent(final Map<Country, ArrayList<City>> storage) {
        System.out.println("MostPopulationCaptitalInContinent");
        final Map<String, ArrayList<City>> m = getAllCapitalsInContinent(storage);
        final Map<String, City> result = new HashMap<>();
        m.forEach((k, v) -> {
            final Optional<City> tmp = v.stream().max(Comparator.comparing(City::getPopulation));
            tmp.ifPresent(city -> result.put(k, city));
        });
        result.forEach((k, v) -> {
            System.out.print(k);
            System.out.print(" ----> ");
            System.out.println(v);
        });

    }
    public static void sortCountryWithDescNumberOfCities(final Map<Country, ArrayList<City>> storage) {
        System.out.println("sortCountryWithDescNumberOfCities");
        final ArrayList<Country> m = new ArrayList<>();
        storage.forEach((k, v) -> m.add(k));
        m.stream().sorted((a, b) -> storage.get(b).size() - storage.get(a).size()).forEach(System.out::println);
    }
    public static void sortCountry(final Map<Country, ArrayList<City>> storage) {
        System.out.println("sortCountryWithDescPopulationdensity");
        final ArrayList<Country> m = new ArrayList<>();
        storage.forEach((k, v) -> m.add(k));
        PopulationdensityComparator myComparator = new PopulationdensityComparator();
        m.stream().sorted((a,b)->myComparator.compare(a,b)).filter(i -> i.getPopulation() != 0)
                .forEach(System.out::println);
    }

   

}