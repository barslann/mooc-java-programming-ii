
public class Main {

    public static void main(String[] args) {
        // test your code here

//        Card first = new Card(2, Suit.DIAMOND);
//        Card second = new Card(14, Suit.SPADE);
//        Card third = new Card(12, Suit.HEART);
//
//        System.out.println(first);
//        System.out.println(second);
//        System.out.println(third);
        BySuitInValueOrder comparator = new BySuitInValueOrder();
        Card first = new Card(4, Suit.HEART);
        Card second = new Card(5, Suit.HEART);
        System.out.println(comparator.compare(first, second));
    }
}
