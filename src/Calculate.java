public class Calculate {
    private String nama;
    private String barang;
    private int jumlah;
    private int total;

    //Getter

    public String getName() {
        return nama;
    }

    public String getItem() {
        return barang;
    }

    public int getAmount() {
        return jumlah;
    }

    public int getTotal() {
        return total;
    }

    //Setter

    public void setName(String nama) {
        this.nama = nama;
    }

    public void setItem(String barang) {
        this.barang = barang;
    }

    public void setAmount(int jumlah) {
        this.jumlah = jumlah;
    }

    public void setTotal(int total) {
        this.total = total;
    }

    /*public void Calculate(int total) {
        if (barang == "Garam") {
            kilogram * 10000 = total;
        }else if (barang == "Lada"){
            kilogram * 20000 = total;
        } else if (barang == "Gula"){
            kilogram * 5000 = total;
        } else if (barang == "Paprika"){
            kilogram * 30000 == total;
        } else if (barang == "Tepung"){
            kilogram * 15000 = total;
        }
    }*/

    //Menghitung total
    public void CalculateGaram(){
        int harga = 10000;
        total = jumlah * harga;
    }

    public void CalculateLada(){
        int harga = 20000;
        total = jumlah * harga;
    }

    public void CalculateGula(){
        int harga = 5000;
        total = jumlah * harga;
    }

    public void CalculatePaprika(){
        int harga = 30000;
        total = jumlah * harga;
    }

    public void CalculateTepung(){
        int harga = 15000;
        total = jumlah * harga;
    }
}
