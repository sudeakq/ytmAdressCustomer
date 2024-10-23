public class Main {
    public static void main(String[] args) {
        Adres adres1 = new Adres("İstanbul", "34000", "123. Sokak");

        Musteri musteri1 = new Musteri("Ali Veli", adres1, "aliveli@example.com");
        System.out.println("\n Müşteri Bilgileri:");
        musteri1.printMusteriInfo();
    }
}
