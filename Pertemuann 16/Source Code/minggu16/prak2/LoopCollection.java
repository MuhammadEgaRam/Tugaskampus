/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package minggu16.prak2;
import java.util.Stack;
import java.util.Iterator;
import java.util.Collections;
/**
 *
 * @author EgaRam
 */
public class LoopCollection {
    public static void main(String[] args) {
        Stack<String> fruits = new Stack<>();
        fruits.push("Banana");
        fruits.add("Orange");
        fruits.add("Watermelon");
        fruits.add("Leci");
        fruits.push("Salak");
        
        for(String fruit : fruits){
            System.out.printf("%s ", fruit);
        }
        
        System.out.println("\n" + fruits.toString());
        
        while(!fruits.empty()){
            System.out.printf("%s ", fruits.pop());
        }
        fruits.push("Melon");
        fruits.push("Strawberry");
        System.out.println("");
        for(Iterator<String> it = fruits.iterator(); it.hasNext();){
            String fruit = it.next();
            System.out.printf("%s ", fruit);
        }
        System.out.println("");
        fruits.stream().forEach(e -> {
            System.out.printf("%s ", e);
        });
        System.out.println("");
        for(int i = 0; i < fruits.size(); i++){
            System.out.printf("%s ", fruits.get(i));
        }
        System.out.println(" ");
        //Menambahkan data dengan sorting
        fruits.push("Mango");
        fruits.push("Guava");
        fruits.push("Avocado");
        
        System.out.println("\nData sudah tersorting");
        Collections.sort(fruits);
        Iterator i = fruits.iterator();
        
        while(i.hasNext()){
            System.out.println(i.next());
        }
    }
}
