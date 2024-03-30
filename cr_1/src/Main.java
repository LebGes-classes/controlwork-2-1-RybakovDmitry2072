import static org.junit.jupiter.api.Assertions.assertEquals;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        MyArrayList<Integer> list = new MyArrayList<>();
        list.add(10);
        list.add(20);
        list.add(30);
        System.out.println(list.getIndex(10));

        list.remove(1);
        System.out.println(list);

        System.out.println(list.contains(10));

        list.clear();
        System.out.println(list);

        list.add(1);
        list.add(2);
        list.add(3);
        System.out.println(list.getIndex(3));

        System.out.println(list);
    }
}