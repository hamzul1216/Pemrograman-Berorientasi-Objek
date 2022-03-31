package Kuis;
import java.util.Scanner;

class Perpustakaan{
    String nama;
    String buku;
    String penulis;

    Perpustakaan(String nama,String buku,String penulis){
        this.nama=nama;
        this.buku=buku;
        this.penulis=penulis;
    }

    void tampil(){
        System.out.println("Nama Peminjam : "+this.nama);
        System.out.println("Nama Buku     : "+this.buku);
        System.out.println("Penulis Buku : "+this.penulis);
        }
}

public class Main {
    public static void main(String[] args) {
        String nama,buku,penulis;
        int a,z=0,menu=0;
        Perpustakaan[] perpus=new Perpustakaan[1024];
        try (Scanner getstr = new Scanner(System.in)) {
            try (Scanner getint = new Scanner(System.in)) {
                while(menu!=3){
                    System.out.print("Menu...\n1.Input\n2.Output\n3.Exit\nPilihan : ");
                    menu=getint.nextInt();
                    if(menu==1){
                        z++;
                        System.out.println("Masukkan data...");
                        System.out.print("Nama Peminjam : ");
                        nama=getstr.nextLine();
                        System.out.print("Nama Buku     : ");
                        buku=getstr.nextLine();
                        System.out.print("Penulis Buku  : ");
                        penulis=getstr.nextLine();
                        perpus[z]=new Perpustakaan(nama,buku,penulis);
                    }
                    else if(menu==2){
                        if(z<1){
                            System.out.println("Data Masih Kosong...");
                        }
                        else{
                            a=0;
                            while(a<z){
                                a++;
                                System.out.println("---"+a+"---");
                                perpus[a].tampil();
                            }
                        }
                    }
                    else if(menu==3){
                        System.out.println("Keluar...");
                    }
                    else{
                        System.out.println("Masukkan Menu Yang Tersedia...");
                    }
                }
            }
        }
    }
}
