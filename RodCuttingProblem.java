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
class RodCuttingProblem {
    
    public static int specialRods(int number){
        int special_rods_count=0;
        while(number>2){
            number=(number-1)/2;
            special_rods_count++;
        }
        return special_rods_count;
    }
    public static void main(String args[] ) throws Exception {
        Scanner in =new Scanner(System.in);
        int T=in.nextInt();
        for(int i=1;i<=T;i++){
            int count=0;
            int N=in.nextInt();
            count=specialRods(N);
            System.out.println(count);
        }
    }
}