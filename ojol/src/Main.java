
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        String user="Qeish Annaba Putra";

        int pass= 12345;

        Scanner input = new Scanner(System.in);


        System.out.println("++Login++");

        System.out.println("Masukkan username   : ");

        String username=input.nextLine();

        System.out.println("Masukkan password   : ");

        int password = input.nextInt();

        if (username.equals(user)&&password==pass){
            System.out.println("Silahkan pilih menu :");
            System.out.println("1.Goojek");
            System.out.println("2.Gofood");
            System.out.println("3.Gosend");
            System.out.println("masukkan pilihan    : ");
            int pilih = input.nextInt();

            switch(pilih){
                case 1:

                    System.out.println("Anda memiloh Goojek silahkan pilih");

                    System.out.println("1.Purworejo - Kutoarjo");
                    System.out.println("2.Purworejo - Kebumen");
                    System.out.println("3.Purworejo - Magelang");

                    System.out.println("Silahkan pilih  : ");

                    int pilih1 = input.nextInt();

                    switch(pilih1){

                        case 1:

                            gojek a=new gojek("Purworejo", "Kutoarjo", 2000,7);
                            a.tampilgojek();

                            break;

                        case 2:
                            gojek b=new gojek("Purwrejo", "Kebumen",2000,10);
                            b.tampilgojek();

                            break;

                        case 3:
                            gojek  c= new gojek("Purworejo","Magelang",2000,15);
                            c.tampilgojek();
                            break;
                    }
                    break;

                case 2:
                    System.out.println("Anda memilih menu gofood silahkan pilih");

                    System.out.println("1.Bakso");
                    System.out.println("2.Soto");
                    System.out.println("3.Nasi Goreng");
                    System.out.println("masukkan pilihan");

                    int pilih2=input.nextInt();

                    switch(pilih2) {
                        case 1:
                            gofood a =new gofood("Bakso", 10000);
                            a.tampilgofood();
                            break;

                        case 2:

                            gofood b=new gofood("Soto", 9000);
                            b.tampilgofood();
                            break;

                        case 3:
                            gofood c =new gofood("Nasi Goreng", 13000);
                            c.tampilgofood();
                            break;
                    }
                    break;

                case 3:

                    System.out.println("Anda memilih menu gosend sialhkan pilh");

                    System.out.println("1.Barang jenis kain");
                    System.out.println("2.Barang jenis plastik");
                    System.out.println("3.Barang jenis kaca");

                    System.out.println("Silahkan masukkan pilihan");

                    int pilih3=input.nextInt();
                    switch(pilih3){
                        case 1:
                            gosend a =new gosend("Barang Jenis kain", 5.5, 1.20);
                            a.tampilgosend();
                            break;

                        case 2:
                            gosend b=new gosend("Barang jenis plastik", 5.5, 2);
                            b.tampilgosend();
                            break;

                        case 3:
                            gosend c=new gosend("Barang jenis kaca" ,7.5, 5);
                            c.tampilgosend();
                            break;
                    }
                    break;

            }
        }else {
            System.out.println("Login anda salah");
        }
    }
}
