package sample;
public class Lec050302 {

	public static void main(String[] args) {
		float f1=100.5f;//float형 자료는 끝에 꼭 f 추가
        double d1=100.5;//실수형의 기본은 double
        
        float f2=(float)0.1;
        double d2=0.1f;
        
        System.out.println("f2="+f2);
        System.out.println("d2="+d2);
        
        if(f2==d2){
        	 System.out.println("서로 같은 수");
        }else{
        	System.out.println("서로 다른 수");
        }
	}

}
