/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package minggu16;
import java.util.LinkedList;
import java.util.List;
import java.util.ArrayList;
/**
 *
 * @author EgaRam
 */
public class contohList {
    public static void main(String[] args) {
        List l = new ArrayList();
        l.add(1);
        l.add(2);
        l.add(3);
        l.add("Cireng");
        System.out.printf("Elemen 0: %d total elemen : %d elemen terakhir : %s\n", l.get(0), l.size(), l.get(l.size() - 1));
        
        l.add(4);
        l.remove(0);
        System.out.printf("Elemen 0: %d total elemen : %d elemen terakhir : %s\n", l.get(0), l.size(), l.get(l.size() - 1));
        
        System.out.println("-------------------------------------------------------------------------------");
        
        List<String> names = new LinkedList<>();
        names.add("Noureen");
        names.add("Akhleema");
        names.add("Shannum");
        names.add("Uwais");
        names.add("Al-Qarni");
        
        System.out.printf("Elemen 0 : %s total elemen : %s elemen terakhir : %s\n", names.get(0), names.size(), names.get(names.size() - 1));
        names.set(0, "My kid");
        System.out.printf("Elemen 0 : %s total elemen : %s elemen terakhir : %s\n", names.get(0), names.size(), names.get(names.size() - 1));
        System.out.println("Names : " + names.toString());
        
        System.out.println("-------------------------------------------------------------------------------");
        
        LinkedList<String> name = new LinkedList<>();
        name.add("Noureen");
        name.add("Akhleema");
        name.add("Shannum");
        name.add("Uwais");
        name.add("Al-Qarni");

        name.push("Mei-mei");
        System.out.printf("Elemen 0 : %s total elemen : %s elemen terakhir : %s\n", name.getFirst(), name.size(), name.getLast());
        System.out.println("Names : " + name.toString());
    }
}
