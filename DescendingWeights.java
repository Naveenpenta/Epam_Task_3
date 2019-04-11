/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author RGUKT
 */
import java.util.*;
class DescendingWeights {
    public static void main(String args[] ) throws Exception {

        Scanner in =new Scanner(System.in);
        int number =in.nextInt();
        int k=in.nextInt();
        ArrayList<Integer> arr=new ArrayList<Integer>(number);
        for(int i=0;i<number;i++){
            
            arr.add(in.nextInt());
        }
        Collections.sort(arr, new Comparator<Integer>(){
            @Override
            public int compare(Integer a,Integer b){
                    if(a%k > b%k) return -1;
                    
                    if(a%k < b%k) return 1;
                    
                    if(a%k == b%k ){
                    
                        if(a < b) return -1;
                        else return 1;
                    
                    }
            return 0;
            
            }
            
        });
 
        arr.forEach((i) -> {
            System.out.println(i);
        });
    }
}

