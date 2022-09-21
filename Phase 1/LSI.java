package dsa;

import java.util.*; 
class LSI 
{ 
    static int lis(int[] arr, int n)  
    { 
        int max = 0; 
        int[] lst = new int[n]; 
  
       
        Arrays.fill(lst, 1); 
  
     
        for (int i = 1; i < n; i++)  
        { 
            for (int j = 0; j < i; j++)  
            { 
                if (arr[i] > arr[j] &&  
                    lst[i] < lst[j] + 1) 
                    lst[i] = lst[j] + 1; 
            } 
        } 
  
             for (int i = 0; i < n; i++) 
            if (max < lst[i]) 
                max = lst[i]; 
  
        return max; 
    } 
  
    public static void main(String[] args)  
    { 
        int[] arr = { 20,180,40,30,23,100,60,90,70 }; 
        int n = arr.length; 
        System.out.println("Length of lis is " +  
                                   lis(arr, n)); 
    } 
}
