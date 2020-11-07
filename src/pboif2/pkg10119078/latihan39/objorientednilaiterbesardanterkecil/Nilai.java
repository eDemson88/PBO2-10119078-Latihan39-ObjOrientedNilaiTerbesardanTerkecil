/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pboif2.pkg10119078.latihan39.objorientednilaiterbesardanterkecil;

import java.util.Scanner;
/**
 *
 * @author ryzen
 */
public class Nilai {
    public int banyakMhs,max,min;
    
    public void getMhs(){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Masukan banyaknya mahasiswa: ");
        banyakMhs = scanner.nextInt();
    }
    
    public int [] isiNilai(int parBanyakMhs){ 
        Scanner scanner = new Scanner(System.in);
        int [] nilaiMhs = new int [banyakMhs];
        for (int i = 0; i < banyakMhs; i++){
        System.out.print("Nilai mahasiswa ke-" + (i+1) + ": ");
        nilaiMhs[i] = scanner.nextInt();
        }
        max = nilaiMhs[0];
        min = nilaiMhs[0];
        for (int i = 0; i < banyakMhs; i++){
            if (nilaiMhs[i] > max){
                max = nilaiMhs[i];
            }
            else if (nilaiMhs[i] < min){
                min = nilaiMhs[i];
            }
        }
        
        System.out.println("Nilai max = " + max);
        System.out.println("Nilai min = " + min);
        return nilaiMhs;
    }
        
}

