package chapter06;

//클래스 : 설계도, 학생 객체(박명수..)를 생성하기 위한 설계도
//value object(VO), 자바빈 클래스
public class Student {
	//속성=필드=멤버변수:정적인 데이터를 담을때 필요함
	//학생 아이디 멤변
	private String stId;
	//학생 이름 멤변
	private String stName;
	//학생 연락처 멤변
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
	//멤버변수에 setting 된 데이터를 확인
	@Override
	public String toString() {
		return "Student [stId=" + stId + ", stName=" + stName + ", telNum=" + telNum + "]";
	}
	//멤버변수에 setting된 데이터를 확인
	public String viewInfo() {
        return		stId+"  "+stName+"    "+telNum;
	
	/*
	//setter메소드
	//public으로 해야 어디서든 접근 가능해
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

