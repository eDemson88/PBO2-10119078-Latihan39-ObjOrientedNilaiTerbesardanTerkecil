/*
 * NAMA: Adam Firdaus Darmawan
 * NIM: 10119078
 * KELAS: IF-2
 * DESKRIPSI: berisi codingan untuk menampilkan nilai terbesar dan terkecil
 */
package pboif2.pkg10119078.latihan39.objorientednilaiterbesardanterkecil;

import java.util.Scanner;
/**
 *
 * @author ryzen
 */
public class PBOIF210119078Latihan39ObjOrientedNilaiTerbesardanTerkecil {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String nama;
        
        Scanner scanner = new Scanner(System.in);
        Nilai nilai = new Nilai();
        
        System.out.println("=====Program Nilai Terbesar dan Terkecil Nilai Mahasiswa=====");
        System.out.printf("Masukan Nama Petugas: ");
        nama = scanner.nextLine();
        
        nilai.getMhs();
        nilai.isiNilai(nilai.banyakMhs);

        
        
    }
    
}
