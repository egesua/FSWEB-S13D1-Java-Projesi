public class Main {
    public static void main(String[] args) {
        boolean isSummer = true;
        int temp1 = 30;
        int temp2 = 40;
        boolean bark = true;
        int hour = 10;

        boolean result = shouldWakeUp(bark, hour);
        System.out.println("Result is: " + result);

        boolean result2 = hasTeen(9, 99, 19);
        System.out.println(result2);

        boolean result3 = isCatPlaying(isSummer, temp1);
        boolean result4 = isCatPlaying(false, temp2);
        System.out.println(result3);
        System.out.println(result4);
    }

    public static boolean shouldWakeUp(boolean bark, int hour) {
        return bark && (hour < 8 || hour >= 20);
    }

    public static boolean hasTeen(int age1, int age2, int age3) {
        return isTeen(age1) || isTeen(age2) || isTeen(age3);
    }

    public static boolean isTeen(int age) {
        if (age < 13 || age > 19) {
            return false;
        } else {
            return true;
        }
    }

    public static boolean isCatPlaying(boolean isSummer, int temp) {
        int maxDegree = isSummer ? 45 : 35;
        return temp >= 25 && temp <= maxDegree;
    }
}