import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] list = {36,63,61,52,0,-52,-64,6,2,7,83,105,601,-105,124,676};
        System.out.println("Dizi : "+ Arrays.toString(list));
        int number;
        System.out.println("Bir Sayı Giriniz : ");
        number = input.nextInt();
        Arrays.sort(list);
        int min = list[0];
        int max = list[15];

        for (int i : list){
            if (i > min && i < number){
                min = i;
            }

            if (i < max && i > number){
                max = i;
            }
        }

        System.out.println("Minimum yakın sayı : " + min);
        System.out.println("Maximum yakın sayı : " + max);
    }
}