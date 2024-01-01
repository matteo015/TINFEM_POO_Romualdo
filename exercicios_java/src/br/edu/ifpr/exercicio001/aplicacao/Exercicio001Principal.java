package br.edu.ifpr.exercicio001.aplicacao;

import br.edu.ifpr.exercicio001.modelo.User;
import java.util.Random;


public class Exercicio001Principal
{
     public static void bubbleSort(int array[],int n){
        int temp;
        
        for(int i = 1; i < n; i++){
            for(int j = 0; j < n - i; j++){
                if(array[j] > array[j+1]){
                    temp       = array[j];
                    array[j]   = array[j+1];
                    array[j+1] = temp;
                }
            }
        }
    }
    
   public static void merge(int[] nums1, int m, int[] nums2, int n) {
        int[] temp = new int[n+m];

        System.arraycopy(nums1,0,temp,m, 2);
        System.arraycopy(nums2,m+1,temp,n, 2);
        nums1 = temp;
    }
    
	public static void main(String[] args) {
		int[] nums1 = {1,2,3};
		int[] nums2 = {2,5,6};
		
		int m = 3,n = 3;
		
		merge(nums1,m,nums2,n);
		for(int i = 0; i < nums1.length;i++)
		    System.out.print(nums1[i]);
	}
}