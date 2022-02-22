public class array1 {
    public static void main(String[] args) {
        String cabangToko[] = {"RoyalGarden1","RoyalGarden2","RoyalGarden3","RoyalGarden4"};
        String bunga[] = {"Aglonema","Keladi","Alocasia","Mawar"};

        int stock[][] = {{10,5,15,7},{6,11,9,12},{2,10,10,5},{5,7,12,9}};
    
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

        int aG = stock[0][0] - 1;
        int k = stock[0][1] - 2;
        int aL = stock[0][2] - 0;
        int m = stock[0][3] - 5;

        System.out.println("");
        System.out.println("Pengurangan stock bunga pada Toko Royal Garden 1");
        System.out.println("=====================");
        System.out.println("Aglonema\t: "+ aG);
        System.out.println("Keladi\t\t: "+ k);
        System.out.println("Alocasia\t: "+ aL);
        System.out.println("Mawar\t\t: "+ m);
        System.out.println("=====================");
        int pendapatan = (aG*75000) + (k*50000) + (aL*60000) + (m*10000);
        System.out.println("");
        System.out.println("Pendapatan Royal Garden 1 adalah sebesar : Rp. "+ pendapatan);
        }
}
