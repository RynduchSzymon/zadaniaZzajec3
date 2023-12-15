//Zadanie 1.
//Zapoznac sie z dokumentacja klasy Math

//Zadanie 2
//public class Main{
//    public static void main(String[] args){
//        String strliczba="123";
//
//        int intValue = Integer.parseInt(strliczba);
//        long longValue = Long.parseLong(strliczba);
//        double doubleValue = Double.parseDouble(strliczba);
//        float floatValue = Float.parseFloat(strliczba);
//        // Wyświetlenie wyników
//        System.out.println("int: " + intValue);
//        System.out.println("long: " + longValue);
//        System.out.println("float: " + floatValue);
//        System.out.println("double: " + doubleValue);
//
//    }
//}
//Zadanie 3
//public class Main{
//    public static void main(String[] args){
//        int x = 5;
//        int y = 10;
//        int result = (x>y) ?x:y;
//        System.out.println(result);
//    }
//}
//Zadanie 4.
//public class Main{
//    public static void main (String[] args){
//        outerLoop:
//        for (int i = 0; i < 5; i++) {
//            for (int j = 0; j < 5; j++) {
//                if (j == 3) {
//                    break outerLoop; // przerwanie zewnętrznej pętli
//                }
//                if (j == 2) {
//                    continue; // pominięcie reszty kodu w obecnej iteracji
//                }
//                System.out.println("i=" + i + ", j=" + j);
//            }
//        }
//    }
//}
//Zadanie 5.
//public class Main{
//    public static void main(String[] args){
//        int a = 5, b=3 , c=2;
//        int result = a+b*c;
//        System.out.println(result);
//
//    }
//}
//Zadanie 6
//public class Main{
//    public static void main(String[] args){
//        String str1 = new String("Hello");
//        String str2 = new String("Hello");
//        boolean areEqual = (str1 == str2); // porównanie referencji
//        boolean areEqual2 = str1.equals(str2); // porównanie zawartości
//        System.out.println(areEqual);
//        System.out.println(areEqual2);
//    }
//}
//Zadanie 7.
//import java.util.Arrays;
//
//public class Main {
//    public static void main(String[] args) {
//        int[] liczby = {1, 2, 3, 4, 5};
//        reverseArray(liczby);
//    }
//
//    // Metoda do odwracania kolejności tablicy
//    private static void reverseArray(int[] array) {
//        for (int i = 0; i < array.length / 2; i++) {
//            int temp = array[i];
//            array[i] = array[array.length - i - 1];
//            array[array.length - i - 1] = temp;
//        }
//        System.out.println("Tablica po odwróceniu: " + Arrays.toString(array));
//    }
//}
//Zadanie 9
//public class Main {
//    public static void main(String[] args) {
//        boolean condition1 = checkCondition1();
//        boolean condition2 = checkCondition2();
//
//        if (condition1 && condition2) {
//            System.out.println("Obie warunki są spełnione.");
//        }
//    }
//
//    // Przykładowa metoda zwracająca boolean
//    private static boolean checkCondition1() {
//        // Logika sprawdzająca pierwszy warunek
//        return true; // lub false, w zależności od logiki warunku
//    }
//
//    // Kolejna przykładowa metoda zwracająca boolean
//    private static boolean checkCondition2() {
//        // Logika sprawdzająca drugi warunek
//        return true; // lub false, w zależności od logiki warunku
//    }
//}
//Zadanie 10.
//public class Main{
//    public static void main(String[] args){
//        if (args.length >= 2) {
//            int param1 = Integer.parseInt(args[0]);
//            int param2 = Integer.parseInt(args[1]);
//            int sum = param1 + param2;
//            int difference = param1 - param2;
//            System.out.println("Suma: " + sum);
//            System.out.println("Różnica: " + difference);
//        }
//    }
//}
//Zadanie 11.
//import java.util.Arrays;
//
//public class Main {
//    public static void main(String[] args) {
//        RandomArrayFiller randomArrayFiller = new RandomArrayFiller();
//        int[] array1D = new int[20];
//        int[][] array2D = new int[5][4];
//
//        randomArrayFiller.fillArray(array1D, 0, 20);
//        randomArrayFiller.fillArray(array2D, 0, 20);
//
//        // Wyświetlenie zawartości tablic
//        System.out.println("Tablica 1D: " + Arrays.toString(array1D));
//        System.out.println("Tablica 2D: " + Arrays.deepToString(array2D));
//    }
//}
//
//class RandomArrayFiller {
//    // Metoda do uzupełniania tablicy liczbami losowymi
//    void fillArray(int[] array, int min, int max) {
//        for (int i = 0; i < array.length; i++) {
//            array[i] = (int) (Math.random() * (max - min + 1) + min);
//        }
//    }
//
//    void fillArray(int[][] array, int min, int max) {
//        for (int i = 0; i < array.length; i++) {
//            for (int j = 0; j < array[i].length; j++) {
//                array[i][j] = (int) (Math.random() * (max - min + 1) + min);
//            }
//        }
//    }
//}
//
