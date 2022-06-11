/* �������迭
 * -��� ���� ����
 * (��������)
 * Ÿ�Ը�[][]�迭��;(�Ϲ���)
 * Ÿ�Ը�[]�迭��[];
 * Ÿ�Ը� �迭��[][];
 * (����)
 * -new������ ���
 * Ÿ�Ը�[][]�迭��=new Ÿ�Ը�[����ũ��][����ũ��];
 * -�����͸� �����ؼ� ����
 * Ÿ�Ը�[][]�迭��={{������,...},{������,...},...}; 
 * -�����迭
 *   .�� �ึ�� ���� ������ �ٸ� �迭
 *   (����)
 *   Ÿ�Ը�[][]�迭��=newŸ�Ը�[����ũ��][];
 *   �迭��[0]=newŸ�Ը�[���� ũ��];
 *   �迭��[1]=newŸ�Ը�[���� ũ��];
 *                      :        
 *   �迭��[n]=newŸ�Ը�[���� ũ��];
 *             
 */
/* name 1���� �迭�� score 2�����迭�� �̿��Ͽ� ������ ���, ����� ����Ͽ� ����Ͻÿ�
 * String[]name={"������","�̼���","ȫ�浵","������","������","������","�տ���"};
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
	String[]name= {"������","�̼���","ȫ�浵","������","������","������","�տ���"};
	//int[][]score=new int[7][8];
	public void setData() {
		int[][]score= {{60,80,60,70,85,0,0,1},
				            {70,90,75,70,80,0,0,1},
				            {90,80,50,60,60,0,0,1},
				            {95,90,85,90,95,0,0,1},
				            {50,65,55,60,70,0,0,1},
				            {65,75,85,64,50,0,0,1},
				            {75,95,95,95,90,0,0,1}};    //***score.length�� ���� ��  ***score[0].length�ش� �࿡ ���Ե� ���� ��
		//������ ���
		for(int i=0;i<score.length;i++) {//���� ó��
		 for(int j=0;j<5;j++) {               //���� ó��
			 score[i][5]=score[i][5]+score[i][j];
		 }
		 score[i][6]=score[i][5]/5;   //����� ���� for������ �ѻ�� ���� �� ���� �� �ۿ��� �ϴϱ� ����!
		}
		getRank(score); //score �� �迭�� ����Ű�� �����ϱ� (score�ּڰ�)�� �������
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
		System.out.println("  �� ��    ���� ���� ����  ���� ��ȸ  ����  ���  ���");
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

