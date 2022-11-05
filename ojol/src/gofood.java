public class gofood extends Main{
    String nama;

    int harga,total;
    int ongkir = 8000;

    gofood(String nama1, int harga){
        this.nama = nama;
        this.harga = harga;
        total=harga+ongkir;
    }

    void tampilgofood(){
        System.out.println("Anda pilih      :"+nama);

        System.out.println("Total Pemesanan :"+total);
    }
}

