/**
 * Main class.
 *
 * @author: Finbarr Shiels (116765721)
 * */


public class Main {
    public static void main(final String[] args){
        Queue tits = new Queue(5);
        tits.add(20);
        tits.add(50);
        tits.add(17);
        tits.add(99);
        tits.add(44);
        System.out.println((tits.peek()));
        System.out.println((tits.element()));
        tits.poll();
        System.out.println((tits.peek()));
    }
}
