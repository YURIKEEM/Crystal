package sample;
public class Lec050302 {

	public static void main(String[] args) {
		float f1=100.5f;//float�� �ڷ�� ���� �� f �߰�
        double d1=100.5;//�Ǽ����� �⺻�� double
        
        float f2=(float)0.1;
        double d2=0.1f;
        
        System.out.println("f2="+f2);
        System.out.println("d2="+d2);
        
        if(f2==d2){
        	 System.out.println("���� ���� ��");
        }else{
        	System.out.println("���� �ٸ� ��");
        }
	}

}
