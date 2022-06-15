/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package minggu15;

/**
 *
 * @author EgaRam
 */
public class graph <T>{
    T[] vertex;
    doublelinkedlist list[];
    
    public graph(T[] vertex){
        this.vertex = vertex;
        list = new doublelinkedlist[vertex.length];
        for(int i = 0; i < vertex.length; i++){
            list[i] = new doublelinkedlist();
        }
    }
    void addEdge(int source, int destination){
        //add edge
        list[source].addFirst(destination);
        //add back edge(for undirected)
        list[destination].addFirst(source);
    }
    void degree(int source) throws Exception{
        //undirected
        System.out.println("degree dari vertex " + vertex[source] + " sejumlah " + list[source].size());
        
        //degree directed graph
        //inDegree
        int k, totalIn = 0, totalOut = 0;
        for(int i = 0; i < vertex.length; i++){
            for(int j = 0; j < list[i].size; j++){
                if(list[i].get(j) == source){
                    ++totalIn;
                }                   }
        //outdegree
        for(k = 0; k < list[source].size(); k++){
            list[source].get(k);
        }
        totalOut = k;
        }
        System.out.println("InDegree dari vertex " + vertex[source] + " : " + totalIn);
        System.out.println("OutDegree dari vertex " + vertex[source] + " : " + totalOut);
        System.out.println("Degree dari vertex " + vertex[source] + " : " + totalIn + totalOut);
    }
    void removeEdge(int source, int destination) throws Exception{
        for(int i = 0; i < vertex.length; i++){
            if(i == destination){
                list[source].remove(destination);
            }
        }
    }
    void removeAllEdge(){
        for(int i = 0; i < vertex.length; i++){
            list[i].clear();
        }
        System.out.println("Seluruh edge pada graf berhasil dihapus");
    }
    void printGraph() throws Exception{
        for(int i = 0; i < vertex.length; i++){
            if(list[i].size() > 0){
                System.out.print("Vertex " + vertex[i] + " terhubung dengan ");
                for(int j = 0; j < list[i].size(); j++){
                    System.out.print(vertex[list[i].get(j)] + " ");
                }
                System.out.println("");
            }
        }
        System.out.println("  ");
    }
    //directed
    boolean graphType(int source, int destination){
        list[source].addFirst(destination);
        return true;
    }
}
