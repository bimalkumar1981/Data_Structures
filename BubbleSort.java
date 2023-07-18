public class BubbleSort {  
    
    public static void main(String[] args) {  
                int arr[] ={14,33,27,35,10};  
                 
                                 
                bubbleSort(arr);//sorting array elements using bubble sort  
                 
                System.out.println("Array After Bubble Sort");  
                for(int i=0; i < arr.length; i++){  
                        System.out.print(arr[i] + " ");  
                }  
   
        } 
		
		static void bubbleSort(int[] arr) {  
        int n = arr.length;  
        int temp = 0;  
         for(int i=0; i < n; i++)
			 { 
			  for(int j=1; j < (n-i); j++){ 
				          if(arr[j-1] > arr[j]){  
                                 //swap elements  
                                 temp = arr[j-1];  
                                 arr[j-1] = arr[j];  
                                 arr[j] = temp; 								  
					       }
						for(int k:arr){    
							System.out.print(k+" "); 
						}
						System.out.println();      
				} 
				
				
         }  
  
    }  
}  