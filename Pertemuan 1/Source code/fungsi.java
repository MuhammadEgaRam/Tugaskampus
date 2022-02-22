import java.util.*;

public class fungsi {
    static String cabangToko[] = {"RoyalGarden1","RoyalGarden2","RoyalGarden3","RoyalGarden4"};
    static String bunga[] = {"Aglonema","Keladi","Alocasia","Mawar"};
    static int stock[][] = {{10,5,15,7},{6,11,9,12},{2,10,10,5},{5,7,12,9}};
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        do {
            System.out.println(" ");
            System.out.println("\n<---------- Selamat Datang Di RoyalGarden ----------->\n");
            System.out.println("+==================================================================+");
            System.out.println("|\t\t\t\t Menu  \t\t\t\t   |");
            System.out.println("+==================================================================+\n");
            System.out.println("[1] Stock Bunga\t\t");
            System.out.println("[2] Melihat Jumlah Stock Bunga\t");
            System.out.print("Masukkan menu yang anda inginkan [ 1 - 2 ] : ");
            int menu = sc.nextInt();
            System.out.println(" ");

            switch (menu) {
                case 1: {
                    stockbunga();
                }
                break;

                case 2: {
                    jumlahstock(cabangToko, bunga);
                }
                break;
                
            }
            System.out.println();

        } while (true);
    }
    static void stockbunga(){
        System.out.println("Aglonema|Keladi|Alocasia|Mawar|");
        for (int i = 0; i < stock.length; i++) {
            for(int j = 0; j < stock.length; j++){
                System.out.print("  "+stock[i][j]+"     ");
            }
        System.out.println(" ");
        }
    }
    static void jumlahstock(String cabangToko[], String bunga[]) {
        int jumAglo = stock[0][0] + stock[1][0] + stock[2][0] + stock[3][0];
        int jumKeldi = stock[0][1] + stock[1][1] + stock[2][1] + stock[3][1];
        int jumAlo = stock[0][2] + stock[1][2] + stock[2][2] + stock[3][2];
        int jumMaw = stock[0][3] + stock[1][2] + stock[2][3] + stock[3][3];

        System.out.println("Stock bunga pada seluruh Cabang adalah");
        System.out.println("=====================");
        System.out.println("Aglonema\t: " + jumAglo);
        System.out.println("Keladi\t\t: " + jumKeldi);
        System.out.println("Alocasia\t: " + jumAlo);
        System.out.println("Mawar\t\t: " + jumMaw);
    }
}        



