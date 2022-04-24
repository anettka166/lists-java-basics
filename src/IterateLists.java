import java.util.ArrayList;
import java.util.List;

public class IterateLists {
    public static void main(String[] args) {

        List<String> cities = new ArrayList<>();

        cities.add("NYC");
        cities.add("Fairfax");
        cities.add("LA");
        cities.add("Boston");
        System.out.print(cities + " ");

        System.out.println();

        for (int i = 0; i < cities.size(); i++) {
            System.out.print(cities.get(i) + " , ");

            if(cities.get(i).startsWith("B")){
                System.out.println(cities.get(i));
            }
        }


        System.out.println(cities.removeAll(List.of("Fairfax", "Boston")));


    }
}
