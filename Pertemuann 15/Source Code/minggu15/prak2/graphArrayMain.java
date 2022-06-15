/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package minggu15.prak2;
import java.util.Scanner;
/**
 * 
 *
 * @author EgaRam
 */
public class graphArrayMain {
    public static void main(String[] args) {
    int v, e, count = 1, to = 0, from = 0;
    Scanner sc = new Scanner(System.in);
    Scanner ss = new Scanner(System.in);
    graphArray <String> graph;
    
    try{
        System.out.println("Masukkan jumlah vertices : ");
        v = sc.nextInt();
        System.out.println("Masukkan jumlah edges : ");
        e = sc.nextInt();
        
        System.out.println();
        
        String[] vert = new String[v + 1];//Tipe data disesuaikan dengan data yang akan disimpan dalam graph
        
        for(int i = 1; i <= v; i++){
        System.out.print("Masukkan data vertex ke-" + i + " : ");
        vert[i] = ss.nextLine();
        }
        graph = new graphArray<String>(vert);
        
        System.out.println();
        
        System.out.println("Masukkan Edge: <to> <from>");
        while(count <= e){
            to = sc.nextInt();
            from = sc.nextInt();            
            graph.makeEdge(to, from, 1);
            count++;
        }
        System.out.println();
        
        System.out.println("Array 2D sebagai representasi graph sbb : ");
        System.out.print("\t");
        for(int i = 1; i <= v; i++){
            System.out.print(vert[i] + "\t");
        }
        System.out.println();
        
        for(int i = 1; i <= v; i++){
            System.out.print(vert[i] + "\t");
            for(int j = 1; j <= v; j++){
                System.out.print(graph.getEdge(i, j) + "\t");
            }
            System.out.println();
        }
    }catch(Exception E){
        System.out.println("Error. Silahkan cek kembali\n" + E.getMessage());
    }
    sc.close();
    }
}
