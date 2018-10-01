/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo310117119latihan20targetsaldotabungan;

/**
 *
 * @author Yogaputra
 */
public class PBO310117119Latihan20TargetSaldoTabungan {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int i,saldo, bulan;
        double bunga1,bunga, jumlah;

        saldo = 3500000;
        bunga = 0.8;
        jumlah = 6000000;
        
        i=1;
        while(saldo<=jumlah){
             bunga1 = saldo*bunga;
            saldo += bunga1;
            
                String saldoakhir =String.format("Rp.%,3d",saldo).replaceAll(","
                +"",".");
                System.out.println("Saldo di bulan Ke-" + i + " "+saldoakhir);
            }
        }

    }


    
