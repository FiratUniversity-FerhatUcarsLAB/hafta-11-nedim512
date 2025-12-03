/*
250541621
nedim isa
03.12.2025
*/
import java.util.Scanner;

public class Exercise4_1 {
    public static void printEuropean(int day1, String month1, int year1, String dayName1) {
        if ((day1 > 0 && day1 <= 31) && (year1 > 0 && year1 <= 2025))

            System.out.printf("%d %s/%d/%S\n", day1, month1, year1, dayName1);
    }

    public static void printAmerican(int day, String month, int year, String dayName) {
        if ((day > 0 && day <= 31) && (year > 0 && year <= 2025))
            System.out.printf("%s/%s %d/%d", dayName, month, day, year);
        else
            System.out.print("Geçersiz Seçim!");
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int gun, yil;
        String ay, gunAdi;

        System.out.print("Gün :");
        gun = scan.nextInt();

        System.out.print("Ay :");
        ay = scan.next();

        System.out.print("Yıl :");
        yil = scan.nextInt();
        scan.nextLine();
        System.out.print("Gun Adı :");
        gunAdi = scan.nextLine();

        printEuropean(gun, ay, yil, gunAdi);
        printAmerican(gun, ay, yil, gunAdi);
    }
}
