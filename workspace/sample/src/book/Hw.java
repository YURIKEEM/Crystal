package book;

import java.util.Arrays;

public class Hw {

	public static void main(String[] args) {
		
       Exam011 exam1= new Exam011();
       
       exam1.setData();
       System.out.println("setData 이후 ");
       exam1.printArr(); // 테스트완료
       System.out.println("----------------------------------");
       System.out.println("getRank 이후");
       exam1.getRank();
       exam1.printArr();
       System.out.println("----------------------------------");
       exam1.sortRank();
       exam1.printArr();
	}

}

class Exam011{
	String[]name= {"강감찬","이성계","홍길도","이진우","조우진","장유진","손영흔"};
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
     public void getRank() { // 검증완료
    	 for(int i=0; i<score.length; i++) {
    		 for(int k=0; k<score.length;k++) {
    			 if(score[i][5]<score[k][5]) {
    				 score[i][7]++;
    		     }
        	}
    	 }
	}
 
     
    public void printArr() {
    	for(int i = 0; i < score.length; i++) {
    		System.out.print(name[i] + "\t");
    		for(int j = 0; j < score[i].length; j++) {
    			System.out.print(score[i][j] + "\t");
    		}
    		System.out.println();
    	}
    }
    public void sortRank() {
    	int  temp= 0;
    	String str ="";
    	for(int i=0; i<score.length-1; i++) {
    		for(int k=i+1; k<score.length;k++) {
    			if(score[i][7]>score[k][7]) {
    				str = name[i];
    				name[i] = name[k];
    				name[k] = str;
    				for(int j=0; j<score[i].length;j++ ) {
    					temp=score[i][j];
        				score[i][j]=score[k][j];
        				score[k][j]=temp;
    				}
    			}
    		}
     	}
   	}
 }
     
