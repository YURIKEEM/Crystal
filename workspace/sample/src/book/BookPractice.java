package book;

import java.util.Arrays;

public class BookPractice {

	public static void main(String[] args) {
//	   int[] scores;
//	   scores=new int[] {83,90,87};
// 	   int sum1=0;
//       for(int i=0; i<3; i++) {
//    	   sum1 += scores[i];
//       }
//    		   System.out.println("총합: "+sum1);
//    		   
//      int sum2=add( new int[] {83,90,87});
//      System.out.println("총합: "+sum2);
//      System.out.println();
//      
//	}
//     public static int add(int[]scores) {
//    	 int sum=0;
//    	 for(int i=0; i<3; i++) {
//    		 sum+=scores[i];
//    	 }
//    	 return sum;

	int[][]mathScores= new int[2][3];
	for(int i = 0;i<mathScores.length;i++){
		for (int k = 0; k < mathScores[i].length; k++) {
			System.out.println("mathScores[" + i + "][" + k + "]=" + mathScores[i][k]);

		}
	}System.out.println();
}

}
