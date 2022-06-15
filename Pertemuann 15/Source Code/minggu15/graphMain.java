/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package minggu15;
import java.util.Scanner;
/**
 *
 * @author EgaRam
 */
public class graphMain {
    public static void main(String[] args)throws Exception {
        Scanner sc = new Scanner(System.in);
               
        System.out.print("Masukkan jumlah vertec : ");
        String[] ve = new String[sc.nextInt()];
        sc.nextLine();
        
        for(int i = 0; i < ve.length; i++){
            System.out.print("Masukkan data vertex ke-" +i+ " : ");
            ve[i] = sc.nextLine();
        }
        graph<String> Graph = new graph<String>(ve);
        
        System.out.println("===========================");
        
        System.out.print("Masukkan jumlah edge   : ");
        int edge = sc.nextInt();
        
                                    
        int pilih;
        do{
            System.out.println("1 Untuk Directed | 2 Untuk Undirected");
            System.out.print("Jawaban : ");
            pilih = sc.nextInt();
           
            System.out.println("Masukkan Edge : <from> <to>");
            if(pilih == 1){//untuk directed
                for(int i = 0; i < edge; i++){
                    //System.out.print("Masukkan source         : ");
                    //int source = sc.nextInt();
                    //System.out.print("Masukkan destination    : ");
                    //int destination = sc.nextInt();
                    Graph.graphType(sc.nextInt(), sc.nextInt());
               }
            Graph.printGraph();
            
           }else if(pilih == 2){//untuk undirected
                for(int i = 0; i < edge; i++){
                    //System.out.print("Masukkan source         : ");
                    //int source = sc.nextInt();
                    //System.out.print("Masukkan destination    : ");
                    //int destination = sc.nextInt();
                    Graph.addEdge(sc.nextInt(), sc.nextInt());
                }
                Graph.printGraph();
           }  
        }while(pilih != 1 && pilih != 2); 
    }
}
