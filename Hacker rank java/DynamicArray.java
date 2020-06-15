import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class DynamicArray{
    List<Integer> seq = new ArrayList<Integer>();
    List<List<Integer>> seqlist = new ArrayList<List<Integer>>();
    int lastans =0;
    public   DynamicArray(int N){
        for(int i =0;i< N;i++){
            seq = new ArrayList<Integer>();
            seqlist.add(seq);
        }
    }
    void appendValue(int x,int y, int N){
        int rowindex= (x ^ lastans)%N;
        List<Integer> seq  = seqlist.get(rowindex);
        seq.add(y);

    }
    void printValue(int x, int y,int N){
        int colindex =0;
        int rowindex = (x ^ lastans)%N;
        List<Integer> seq  = seqlist.get(rowindex);
        colindex =y % seq.size();
        lastans = seq.get(colindex);
        System.out.println(lastans);


        
    }

     public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int Q = sc.nextInt();
        DynamicArray ds = new DynamicArray(N);
        for(int i = 0; i<Q;i++){
            int querytype = sc.nextInt();
            int x =sc.nextInt();
            int y = sc.nextInt();
            if(querytype==1){
                ds.appendValue(x,y,N);


            }else{
                ds.printValue(x,y,N);

            }
        }
        sc.close();



    }

}

