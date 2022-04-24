import java.util.ArrayList;
import java.util.List;

public class ListsBasics {
    public static void main(String[] args) {


        List<Integer> list = new ArrayList<>();

        list.add(12);
        list.add(13);
        list.add(14);
        list.add(15);
        list.add(16);

        System.out.println(list);
        System.out.println(list.size());

        list.remove(2);
        System.out.println(list);
        System.out.println(list.size());

List<String> books = new ArrayList<>();
books.add("Java for Beginnesrs");
books.add("Kite Beginners");
books.add("Python or Java");

        System.out.println(books.get(0));//first item
        System.out.println(books.get(books.size()-1));//last item

        List<Byte> bytes = new ArrayList<>();
        bytes.add((byte)1);

        List <Character> chars = new ArrayList<>();
        chars.add('A');
        chars.add('B');
        System.out.println(chars.get(1));




    }
}
