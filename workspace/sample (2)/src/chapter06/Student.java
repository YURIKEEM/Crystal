package chapter06;

//Ŭ���� : ���赵, �л� ��ü(�ڸ��..)�� �����ϱ� ���� ���赵
//value object(VO), �ڹٺ� Ŭ����
public class Student {
	//�Ӽ�=�ʵ�=�������:������ �����͸� ������ �ʿ���
	//�л� ���̵� �⺯
	private String stId;
	//�л� �̸� �⺯
	private String stName;
	//�л� ����ó �⺯
	private String telNum;
	
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}
	public void setStId(String stId) {
		this.stId = stId;
	}
	public void setStName(String stName) {
		this.stName = stName;
	}
	public void setTelNum(String telNum) {
		this.telNum = telNum;
	}
	//��������� setting �� �����͸� Ȯ��
	@Override
	public String toString() {
		return "Student [stId=" + stId + ", stName=" + stName + ", telNum=" + telNum + "]";
	}
	//��������� setting�� �����͸� Ȯ��
	public String viewInfo() {
        return		stId+"  "+stName+"    "+telNum;
	
	/*
	//setter�޼ҵ�
	//public���� �ؾ� ��𼭵� ���� ������
	public void setStId(String stId) {
		//this. : Student
		this.stId=stId;
	}
	public void setStName(String stName) {
		this.stName=stName;
	}
	
	public void setTelNum(String telNum) {
		this.telNum=telNum;
	}
	
	public String viewInfo() {
         return		stId+"  "+stName+"    "+telNum;
         */
	}
}

