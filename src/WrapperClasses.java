import java.util.ArrayList;
import java.util.List;

public class WrapperClasses {
    public static void main(String[] args) {

        //byte, short, long, float, char, int, boolean, double

        //Class types: Byte, Short, Long, Float, Char, Integer, Boolean, Double

        List <Integer>list = new ArrayList();

        Integer n = 12;
        Double price = 55.70;

        String str = "1234";
        int converted = Integer.parseInt(str);

        String hoagiePrice = "$12.56";
        double actualHoagiePrice = 12.56;
        double parsedPrice = Double.parseDouble(hoagiePrice.replace("$", ""));
        if(actualHoagiePrice ==parsedPrice){
            System.out.println("Prices are equal");
        }

        String canTravel = "truee";
        boolean parseCanTravel = Boolean.parseBoolean(canTravel);

        if(parseCanTravel){
            System.out.println("Yes, you an travel!");
        }else{
            System.out.println("You can not travel;(");
        }

        int number = 123456;
        String numberStr =  String.valueOf(number);//or (number + "");







    }
}
