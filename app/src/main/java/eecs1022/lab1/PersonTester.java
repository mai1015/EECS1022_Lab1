package eecs1022.lab1;

/**
 * Created by user on 1/18/18.
 */
public class PersonTester {
    public static void main(String[] args) {
        Person p1 = new Person("Jackie", 80, 1.85);
        Person p2 = new Person("Dav", 80, 1.85);
        Person p3 = new Person("Macreep", 80, 1.85);
        System.out.println(p1);
        System.out.println(p2);
        System.out.println(p3);

        p3.setWeight(p3.getWeight() + 2.0);
        p2.setWeight(p2.getWeight() - 5);
        System.out.println(p2);
        System.out.println(p3);
    }
}
