import java.util.Scanner;
/*
Java dilinde "Recursive" metot kullanarak, kullanıcıdan alınan sayının
"Asal" sayı olup olmadığını bulan programı yazın.

Senaryo
Sayı Giriniz : 22
22 sayısı ASAL değildir !


Sayı Giriniz : 2
2 sayısı ASALDIR !


Sayı Giriniz : 39
39 sayısı ASAL değildir !


Sayı Giriniz : 17
17 sayısı ASALDIR !
 */

public class Recursive_Prime {
    static void prime(int x) {

        int counter = 0;
        for (int i = 2; i <= x-1; i++) {
            if (x % i == 0) {
                counter++;
            }
        }
        if (counter >= 1 && x > 2) {
            System.out.println("Asal sayı değildir.");
        } else {
            System.out.println("Asal sayıdır.");
        }
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Bir sayı giriniz: ");
        int x = scan.nextInt();
        prime(x);


    }
}
