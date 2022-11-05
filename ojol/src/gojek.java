public class gojek extends Main {
    String lokasi;
    String tujuan;

    int biaya;
    int total,jarak;
    int ongkir=8000;

    public gojek(String lokasi1, String tujuan1, int biaya1, int jarak1){
        this.lokasi = lokasi1;
        this.tujuan = tujuan1;
        this.biaya = biaya1;
        this.jarak = jarak1;

        total = (biaya*jarak)+ongkir;
    }

    void tampilgojek(){
        System.out.println("Lokasi anda sekarang    :"+lokasi);
        System.out.println("Lokasi tujuan anda      :"+tujuan);
        System.out.println("Biaya pemesanan         :"+total);
    }
}
