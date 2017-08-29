/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package latihan3;

/**
 *
 * @author AREMA FC
 */
public class TestSiswa {
    public static void main(String args[]){
        EncapSiswa siswa = new EncapSiswa();
        siswa.setName("Blee");
        siswa.setAbsen(87);
        siswa.setAddress("Malang");
        
        System.out.print("Name : " + siswa.getName()
        + " Absen : " + siswa.getAbsen()+ 
        " Address : " + siswa.getAddress());
    }
}
