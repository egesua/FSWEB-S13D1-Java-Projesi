import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println(shouldWakeUp(true, 9));
        System.out.println(hasTeen(9,99,19));
        System.out.println(isCatPlaying(true, 40));

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter width of a rectangle: ");
        double width = scanner.nextDouble();
        System.out.println("Enter height of a rectangle: ");
        double height = scanner.nextDouble();
        System.out.println("Area of the rectangle: " + area(height, width));
    }

    public static boolean shouldWakeUp(boolean isBark, int hour) {
        if (hour < 0 || hour > 23) return false;
        if (!isBark) return false;
        return hour < 8 || hour >= 20;
    }

    public static boolean hasTeen(int... ages) {
        for(int age: ages){
            if(age >= 13 && age <= 19) return true;
        }
        return false;
    }

    public static boolean isCatPlaying(boolean isSummer, int temperature) {
        if (isSummer) {
            return temperature > 25 && temperature < 35;
        }
        return temperature > 25 && temperature < 45;
    }

    public static double area(double height, double width) {
        if(width < 0 || height < 0) return -1;
        return width * height;
    }
}

