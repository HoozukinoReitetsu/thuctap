package bai_2;

import java.util.*;

public class main {
    public static void main(final String args[]) {
        final Map<Country, ArrayList<City>> storage = new HashMap<>();
        final Function function = new Function();
        // tao data
        function.creatData(storage);
        // Tìm thành phố đông dân nhất của mỗi quốc gia
        Map<Country, City> result = new HashMap<>();
        result = function.findMostPopulationCityInCountry(storage);
        System.out.println("MostPopulationCityInCountry");
        result.forEach((k, v) -> {
            System.out.print(k);
            System.out.print(" ----> ");
            System.out.println(v);
        });
        // -------------------------------------------//
        // Tìm thành phố đông dân nhất của mỗi lục địa
        Map<String, City> resultContinent = new HashMap<>();
        resultContinent = function.findMostPopulationCityInContinent(storage);
        System.out.println("MostPopulationCityInContinent");
        resultContinent.forEach((k, v) -> {
            System.out.print(k);
            System.out.print(" ----> ");
            System.out.println(v);
        });
        // -------------------------------------------//
        // Tìm thành phố là thủ đô, đông dân nhất
        Optional<City> mostPopulationCapital = function.findMostPopulationCapital(storage);
        System.out.println("MostPopulationCaptital");
        if (mostPopulationCapital.isPresent()) {
            System.out.println(mostPopulationCapital.get());
        } else {
            System.out.println("NOT FOUND");
        }

        // -----------------------------------------//
        // Tìm thành phố là thủ đô, đông dân nhất của mỗi lục địa
        Map<String, City> resultCapital = new HashMap<>();
        resultCapital = function.findMostPopulationCapitalInContinent(storage);
        System.out.println("MostPopulationCaptitalInContinent");
        resultCapital.forEach((k, v) -> {
            System.out.print(k);
            System.out.print(" ----> ");
            System.out.println(v);
        });
        // -----------------------------------------//
        // Sắp xếp các quốc gia theo số lượng thành phố giảm dần
        function.sortCountryWithDescNumberOfCities(storage);
        // ----------------------------------------//
        // Sắp xếp các quốc gia theo mật độ dân số theo thứ tự giảm dần 
        function.sortCountry(storage);
        // ----------------------------------------//

    }

}