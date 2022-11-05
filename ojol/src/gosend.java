public class gosend extends Main{
    String nama;

    double jarak, berat, biaya;

    gosend (String nama1, double jarak1, double berat1){
        this.nama = nama1;
        this.jarak = jarak1;
        this.berat = berat1;

        biaya=(berat*3000)+(jarak*1000)+2000;
    }

    void tampilgosend(){
        System.out.println("Nama barang         : "+nama);
        System.out.println("Berat barang        : "+berat+" kg");
        System.out.println("Jarak pengiriman    : "+jarak+" km");
        System.out.println("Biaya pemesanan     : "+biaya);
    }
}
