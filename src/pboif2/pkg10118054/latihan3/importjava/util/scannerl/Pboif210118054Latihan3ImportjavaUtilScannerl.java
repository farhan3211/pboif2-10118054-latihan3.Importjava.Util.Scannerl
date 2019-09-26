/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pboif2.pkg10118054.latihan3.importjava.util.scannerl;
import java.util.Scanner

/**
 *
 * @author ASUS
 */

public class Pboif210118054Latihan3ImportjavaUtilScannerl {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
           System.out.print("Masukkan nama anda: ");
        Scanner scanner = new Scanner (System.in);
        
        String nama = scanner.next();
        System.out.println("Nama anda adalah "+nama);
    }
    
}
