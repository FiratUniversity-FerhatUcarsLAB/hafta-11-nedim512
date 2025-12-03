/*
 250541621
 nedim isa
 03.12.2025
 */
public class Exercise4_4 {

    public static int getNumber() {
        return 42;
    }

    public static void sayHello() {
        System.out.println("hello");
    }

    public static void main(String[] args) {

        // 1) Donus degerini kullanmayin -> ne oluyor?
        //Cevap1: Java'da bu hata vermez. Metot çalışır, işini yapar, dönen değer (return value) hafızada bir yere atanmadığı için kaybolur (ignore edilir).
        getNumber();

        // 2) void metodu ifade icinde kullanin -> ne oluyor?
        // System.out.println(sayHello() + 7);
        //Cevap2: Java derleme hatası (compile-time error) verir. Çünkü void metotlar bir değer üretmez, dolayısıyla matematiksel veya mantıksal bir işleme sokulamazlar.
        
    }
}
