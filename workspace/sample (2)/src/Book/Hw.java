package Book;

import java.util.Arrays;

public class Hw {

	public static void main(String[] args) {
		
       Exam011 exam1= new Exam011();
       
       exam1.setData();
       System.out.println("setData ���� ");
       exam1.printArr(exam1.score); // �׽�Ʈ�Ϸ�
       System.out.println("----------------------------------");
       System.out.println("getRank ����");
       exam1.getRank();
       exam1.printArr(exam1.score);
       System.out.println("----------------------------------");
       
       
	}

}

class Exam011{
	String[]name= {"������","�̼���","ȫ�浵","������","������","������","�տ���"};
	int[][]score= {
			{60,80,60,70,85,0,0,1},
			{70,90,75,70,80,0,0,1},
			{90,80,50,60,60,0,0,1},
			{95,90,85,90,95,0,0,1},
			{50,65,55,60,70,0,0,1},
			{65,75,85,64,50,0,0,1},
			{75,95,95,95,90,0,0,1}}; 
	
	public void setData() {
		
		for(int i=0; i<score.length;i++) {
			for(int k=0; k<score[i].length - 3;k++) {
				score[i][5]+=score[i][k];
			}	
			  score[i][6]=score[i][5]/5;
		}
		
		}
     public void getRank() { // �����Ϸ�
    	 for(int i=0; i<score.length; i++) {
    		 for(int k=0; k<score.length;k++) {
    			 if(score[i][5]<score[k][5]) {
    				 score[i][7]++;
    		 }
    	 
		
		}

    	 }
    	 
	}
 
     
    public void printArr(int[][] score) {
    	for(int i = 0; i < score.length; i++) {
    		System.out.print(name[i] + "\t");
    		for(int j = 0; j < score[i].length; j++) {
    			System.out.print(score[i][j] + "\t");
    		}
    		System.out.println();
    	}
    }
     
}