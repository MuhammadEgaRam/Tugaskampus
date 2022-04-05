/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package minggu7.LatihanPrak3;

/**
 *
 * @author EgaRam
 */
public class Latihan3 {
    public int[] data;
    public int max = 0;
    public int posisi;
    public int jumlah = 0;

    Latihan3(int nilai[]) {
        data = nilai;
    }

    void tampil() {
        for (int i = 0; i < data.length; i++) {
            System.out.print(data[i] + " ");
        }
        System.out.println();
    }

    void bubblesort() {
        for (int i = 0; i < data.length - 1; i++) {
            for (int n = 1; n < data.length - i; n++) {
                if (data[n] > data[n - 1]) {
                    int tmp = data[n];
                    data[n] = data[n - 1];
                    data[n - 1] = tmp;
                }
            }
        }
    }

    public int Searching(int cari, int kiri, int kanan) {
        int mid;
        if (kanan >= kiri) {
            mid = (kiri + kanan) / 2;
            if (cari == data[mid]) {
                return (mid);
            } else if (data[mid] > cari) {
                return Searching(cari, mid + 1, kanan);
            } else {
                return Searching(cari, kiri, mid - 1);
            }
        }
        return -1;
    }

    public int nilaiTerbesar() {
        for (int i = 0; i < data.length; i++) {
            if (data[i] > max) {
                max = data[i];
            }
        }
        System.out.println("Nilai terbesarnya adalah : " + max);
        return max;
    }

    public void tampilPosisi(int pos) {
        for (int i = 0; i < data.length; i++) {
            if (data[i] == max) {
                jumlah++;
            }
        }
        System.out.print("dengan jumlah " + jumlah);
        System.out.println();
        posisi = max;
        for (int i = 0; i < data.length; i++) {
            if (posisi == data[i]) {
                pos = i;
                System.out.println("Data ditemukan pada indeks ke-" + pos);
            }
        }
    }
}
