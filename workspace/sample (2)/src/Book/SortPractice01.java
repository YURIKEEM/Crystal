package Book;

import java.util.Arrays;

public class SortPractice01 {

	public static void main(String[] args) {
	  //��������
//		InsertSort inst = new InsertSort();
//	   inst.inserS();
	   
	   //��������
	    SelectionSort selest=new SelectionSort();
	    selest.selectS();
	    
	
	}
}
        //            �������� �˰���
class InsertSort{
	
public void inserS() {
	
int[] arr = {7,3,4,1,10,8};

 for(int i=1; i<arr.length;i++) {
	 for(int j=0; j<i; j++) {
		 if(arr[j]>arr[i]) {
			 int temp=0;
			 temp=arr[i];
			 arr[i]=arr[j];
			 arr[j]=temp;
		 }
		 
	 }
 }
  System.out.println(Arrays.toString(arr));
}
}
class SelectionSort{
	
	public void selectS() {	
		int[]arr2= {5,6,1,9,15,2,7};
		System.out.print("[����]");
		System.out.println(Arrays.toString(arr2));
		for(int i=1; i<arr2.length;i++) {
			for(int j=0; j<arr2.length;j++) {
				if(arr2[j]>arr2[i]) {
					int temp=0;
					temp=arr2[i];
					arr2[i]=arr2[j];
					arr2[j]=temp;
					
				}
			}
		}
		System.out.println(Arrays.toString(arr2));
	}
}