import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Calculate Shop = new Calculate();
        Scanner Input = new Scanner(System.in);
        String barang="";
        int jumlah = 0;
        boolean again;

        System.out.println("---Program Hitung Harga---");
        System.out.print("Nama anda: ");
        String nama = Input.nextLine();
        Shop.setName(nama);
        System.out.println(" ");

        do {

            System.out.println("Barang yang tersedia (pilih dengan angka):");
            System.out.println("1. Garam");
            System.out.println("2. Lada");
            System.out.println("3. Gula");
            System.out.println("4. Paprika");
            System.out.println("5. Tepung");
            System.out.print("Pilihan anda: ");
            int pilihan = Input.nextInt();
            System.out.println(" ");

            if (pilihan == 1) {
                System.out.print("Berapa banyak (kg): ");
                jumlah = Input.nextInt();
                Shop.setAmount(jumlah);
                barang = "Garam";
                System.out.println(" ");
                Shop.CalculateGaram();
            } else if (pilihan == 2) {
                System.out.print("Berapa banyak (kg): ");
                jumlah = Input.nextInt();
                Shop.setAmount(jumlah);
                barang = "Lada";
                System.out.println(" ");
                Shop.CalculateLada();
            } else if (pilihan == 3) {
                System.out.print("Berapa banyak (kg): ");
                jumlah = Input.nextInt();
                Shop.setAmount(jumlah);
                barang = "Gula";
                System.out.println(" ");
                Shop.CalculateGula();
            } else if (pilihan == 4) {
                System.out.print("Berapa banyak (kg): ");
                jumlah = Input.nextInt();
                Shop.setAmount(jumlah);
                System.out.println(" ");
                barang = "Paprika";
                Shop.CalculatePaprika();
            } else if (pilihan == 5) {
                System.out.print("Berapa banyak (kg): ");
                jumlah = Input.nextInt();
                Shop.setAmount(jumlah);
                barang = "Tepung";
                System.out.println(" ");
                Shop.CalculateTepung();
            }

            System.out.println(" ");
            System.out.println("---Output---");
            System.out.println("Nama pelanggan: " + nama);
            System.out.println("Memilih barang: "+ barang);
            System.out.println("Jumlah barang: " + jumlah +"kg");
            System.out.print("Total harga anda: Rp." + " " + Shop.getTotal());
            System.out.println(" ");
            System.out.println(" ");
            System.out.println(" ");

            System.out.println("Apakah anda ingin mengulang lagi?");
            System.out.println("1. Iya");
            System.out.println("2. Tidak");
            System.out.print("Pilihan: ");
            int redo = Input.nextInt();
            System.out.println(" ");
            System.out.println(" ");
            if (redo == 1){
                again = true;
            } else {
                again = false;
            }

        }while(again == true);

    }
}
