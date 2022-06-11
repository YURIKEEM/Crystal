/* 다차원배열
 * -행과 열로 구성
 * (선언형식)
 * 타입명[][]배열명;(일반적)
 * 타입명[]배열명[];
 * 타입명 배열명[][];
 * (생성)
 * -new연산자 사용
 * 타입명[][]배열명=new 타입명[행의크기][열의크기];
 * -데이터를 정의해서 생성
 * 타입명[][]배열명={{데이터,...},{데이터,...},...}; 
 * -가변배열
 *   .각 행마다 열의 갯수가 다른 배열
 *   (생성)
 *   타입명[][]배열명=new타입명[행의크기][];
 *   배열명[0]=new타입명[열의 크기];
 *   배열명[1]=new타입명[열의 크기];
 *                      :        
 *   배열명[n]=new타입명[열의 크기];
 *             
 */
/* name 1차원 배열과 score 2차원배열을 이용하여 총점과 평균, 등수를 계산하여 출력하시오
 * String[]name={"강감찬","이성계","홍길도","이진우","조우진","장유진","손영흔"};
 * int[][]score={{60,80,60,70,85,0,0,1},
				            {70,90,75,70,80,0,0,1},
				            {90,80,50,60,60,0,0,1},
				            {95,90,85,90,95,0,0,1},
				            {50,65,55,60,70,0,0,1},
				            {65,75,85,64,50,0,0,1},
				            {75,95,95,95,90,0,0,1}};  
 */

package chaper05;

import java.util.Arrays;

public class TwoDimArray {

	public static void main(String[] args) {
		MiddleExam m1= new MiddleExam();
		m1.setData();
		
		

	}

}

class MiddleExam{
	String[]name= {"강감찬","이성계","홍길도","이진우","조우진","장유진","손영흔"};
	//int[][]score=new int[7][8];
	public void setData() {
		int[][]score= {{60,80,60,70,85,0,0,1},
				            {70,90,75,70,80,0,0,1},
				            {90,80,50,60,60,0,0,1},
				            {95,90,85,90,95,0,0,1},
				            {50,65,55,60,70,0,0,1},
				            {65,75,85,64,50,0,0,1},
				            {75,95,95,95,90,0,0,1}};    //***score.length는 행의 수  ***score[0].length해당 행에 포함된 열의 수
		//총점과 평균
		for(int i=0;i<score.length;i++) {//행을 처리
		 for(int j=0;j<5;j++) {               //열을 처리
			 score[i][5]=score[i][5]+score[i][j];
		 }
		 score[i][6]=score[i][5]/5;   //평균은 안쪽 for문에서 한사람 점수 다 더한 후 밖에서 하니까 여기!
		}
		getRank(score); //score 는 배열을 가르키는 변수니까 (score주솟값)이 들어있음
		printScore(score);
	}
	public void getRank(int[][]tscore) {
	
		for(int i=0;i<tscore.length;i++) {
			for(int j=0; j<tscore.length; j++) {
				if(tscore[i][5]<tscore[j][5]) {
					tscore[i][7]++;
				}
			}
		}
	}
	public void printScore(int[][]tscore) {
		System.out.println("  이 름    국어 영어 수학  과학 사회  총점  평균  등수");
		System.out.println("==================================");
		for(int i=0;i<tscore.length;i++) {
			System.out.printf("%5s",name[i]);
			for(int j=0; j<tscore[i].length;j++) {
				System.out.printf(" %4d ",tscore[i][j]);
			}
			System.out.println();
		}
	}
}	

