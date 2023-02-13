import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        /* String name = "Uwa";
        System.out.println("My name is " +  name);
        float f1 = 35e3f;
        double d1 = 12E4d;
        System.out.println(f1);
        System.out.println(d1);

        if (20 < 18) {
            System.out.println("20 is greater than 18");
        }else {
            System.out.println("False");
        }
        int i = 0;
        while (i < 5) {
            System.out.println(i);
            i++;
        }
        for (int i = 0; i < 5; i++) {
            System.out.println(i);
        } */
        String[] cars = {"Volvo", "BMW", "Ford", "Mazda"};
        System.out.println(cars[0]);
        // Outputs Volvo
        cars[1] = "Benz";
        System.out.println(cars[1]);
        // Outputs Benz
    }

}