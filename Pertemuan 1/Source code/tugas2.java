import java.util.*;

public class tugas2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukkan nilai kecepatan : ");
        Double kec = sc.nextDouble();
        System.out.print("Masukkan nilai Jarak : ");
        Double jK = sc.nextDouble();
        System.out.print("Masukkan nilai Waktu : ");
        Double w = sc.nextDouble();
        do{
            System.out.println(" ");
            System.out.println("\n<---------- Rumus KJW ----------->\n");
            System.out.println("+==================================================================+");
            System.out.println("[1] Kecepatan\t\t");
            System.out.println("[2] Jarak\t");
            System.out.println("[3] Waktu\t");
            System.out.print("Masukkan menu yang anda inginkan [ 1 - 3 ] : ");
            int menu = sc.nextInt();
            System.out.println(" ");
            switch (menu) {
                case 1: 
                System.out.print("Kecepatannya adalah " + kecepatan(jK,w));
                break;

                case 2: 
                System.out.print("Jaraknya adalah " + jarak(kec,w));
                break;

                case 3: 
                System.out.print("Kecepatannya adalah " + waktu(jK,kec));
                break;
            }
            System.out.println();
        } while (true);
    }
    static Double kecepatan(Double jK, Double w){
        Double kec = jK/w;
        return kec;
    }
    static Double jarak(Double kec, Double w){
        Double jK = kec*w;
        return jK;
    }
    static Double waktu(Double jK, Double kec){
        Double w = jK/kec;
        return w;
    }

}
