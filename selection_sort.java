
// program to sort a number of elements using selection sort
import java.util.Scanner;    
public class selection_sort 
{  
   public static void main(String args[])  
   {  
       int size, i, j, temp;  
       int arr[] = new int[50];//initialising array size and calling size,temp and j  
       Scanner sc = new Scanner(System.in);  
         
       System.out.print("Enter Number of elements : ");  
       size = sc.nextInt();  //nuber of elements
         
       System.out.print("Enter Elements : ");  
       for(i=0; i<size; i++)  
       {  
           arr[i] = sc.nextInt();  
       }  
         
       System.out.print("Sorting using Selection Sort Technique..\n");  
       for(i=0; i<size; i++)  
       {  
           for(j=i+1; j<size; j++)  
           {  
               if(arr[i] > arr[j])  
               {  
                   temp = arr[i];  
                   arr[i] = arr[j]; //swapping 
                   arr[j] = temp;  
               }  
           }  
       }  
         
       System.out.print("Now the sequence after Sorting is :\n");  //printing array after sorting
       for(i=0; i<size; i++)  
       {  
           System.out.print(arr[i]+ "  ");  
       }  
   }  
}  
   //vdt
//S.no   //variable    //Use
//1      //int size    //size of array
//2      //int i       //first element of array
//3      //int j       //number after i position
//4      //int temp    //temprary value of i