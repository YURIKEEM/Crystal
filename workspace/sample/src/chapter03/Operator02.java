package chapter03;

public class Operator02 {

	public static void main(String[] args) {
		//  ���迬����- ��Ұ��� �� 
		// >, <, >=, <=, ==, !=,  instanceof
		// ����� true or false ��ȯ
		// if�� ���� ���ǹ� ������ ���
		
		Oper1 op1=new Oper1 () ;
		System.out.println("������:"+op1.comOper(10, 15));
		System.out.println("����:"+op1.comOper(10, 10.f));
		System.out.println("���ڿ���:"+op1.comOper("ȫ�浿", "ȫ�浿")); //���ͷ�Ǯ�� ������ ��ĵ�ؼ� ���þ��� ���� �ּ� ���⶧���� true
		System.out.println("���ڿ���:"+op1.comOper(new String("ȫ�浿"), new String("ȫ�浿"))); //���� �ٸ� �����ҷ� ��������ֱ� ������ false��µ�
		System.out.println("���ڿ���:"+op1.comOperContent(new String("ȫ�浿"), new String ("ȫ�浿")));
		
	}

}

class Oper1 {
    public boolean comOper (int a, int b){
    	boolean res=a>b;
    	return res;
    }
	
    public boolean comOper (String a, String b){
    	boolean res=(a==b); // (��ü��������==��ü��������)�� ���� �񱳰� �ƴ϶� �ּҸ� ���ϴ� ������ 
    	return res;                // �����: a equals b 
    }
    
    public boolean comOperContent (String a,String b){
    	boolean res=a.equals(b);  
    	return res;              
}
    
    public String comOper (int a, float b){    //int�� ū float�� ���� float�� ��ȯ�� ���� �� ������ ũ�� �񱳰� �ȴ�.
    	if (a>b) {
    		  return "a�� b���� ũ��";   
    	}else if (a<b)	{
    		 return "a�� b���� �۴�";
    	}else{
    		 return "a�� b�� ����";
    	}
    }
}
            