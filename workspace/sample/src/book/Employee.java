package book;
//문제3] 다음 조건을 만족하는 클래스를 생성하시오
//*           사원 클래스(Employee) 
//*           1) 멤버변수: 월급여(salary) :정수형
//*                            사원번호(emp_id):문자열
//*                            사원명(emp_name):문자열 -> 완료
//*           2) 메소드 : 생성자(사원번호, 사원명을 입력)
//*                           기본생성자
//*                           연봉을 계산해서 반환하는 메소드 
//*                           => 연봉은 월급여(12개월)와 500% 보너스로 구성
/*
 * 문제4 ) 위의 사원의 여러명을 처리하기 위한 방법
 * 
 * 
 */
public class Employee {
	
	private int salary;
	private String emp_id;
	private String emp_name;
	
	Employee(){} // 기본 생성자
	
	Employee(String emp_id, String emp_name){
		this.emp_id = emp_id;
		this.emp_name = emp_name;
	}
	
	Employee(String emp_id, String emp_name, int salary){
		this.emp_id = emp_id;
		this.emp_name = emp_name;
		this.salary = salary;
	}
	

	public void setter(int salary) {
		this.salary = salary;
		
	}
	
	public int getSalary() {	
		return (salary * 5) + (salary * 12);
	}
	
}

