//정렬(sort)
//-크기순으로 재배열
//-오름차순(ascending:작은값->큰값, 기본정렬)
//-내림차순(descending:큰값->작은값)
//-버블정렬(bubble sort), 선택정렬(selection sort)

package chaper05;
import java.util.Arrays;
public class IntegerSort {

	public static void main(String[] args) {
		BubbleSort b1=new BubbleSort();
		b1.bubble_sort();
		
	}

}

class BubbleSort{
	int[] num= {56,23,81,15,70,17,29};
	
	public void bubble_sort() {
		System.out.println("[원본]");
		System.out.println(Arrays.toString(num));
		for(int i=1; i<num.length;i++) {         //버블 회전 for문
			for(int j=0;j<num.length-i; j++) {   //자리 바꾸는 for문
				if(num[j]>num[j+1]) {         //j 자리가 옆자리보다 크면 자리바꾸기
					swap(num,j,j+1);        //void타입이어야만 가능
					
				}
			}
		}
		System.out.println("[결과]");
		for(int i=0; i<num.length; i++) {
			System.out.println(num[i]+",");
		}
	}
	
	public void swap(int[] tar, int a, int b) {  
		int temp=0;
		temp=tar[a];
		tar[a] = tar[b];
		tar[b]= temp;
		
		
	}
}