//참조형 변수 : 주소를 저장하고 있는 변수
//                    C언어의 Pointer에 해당
//                    배열, 객체참조변수, 열거형, 인터페이스
//==, != 연산자는 참조형 변수에 저장된 값(주소)를 비교
//내용비교는 equals()메소드를 사용

//  chapter 5.배열
// -동일타입의 데이터를 연소된 기억공간에 저장하고 
//   일괄적인 처리를 수행할 수 있는 기억공간
// -선언-초기화-사용
// -선언된 배열의 크기는 늘리거나 줄일 수 없다 >그래서 컬랙션 프레임워크가 있다고..
//         5.1)배열 선언
//          타입[ ] 배열명;                                    <배열변수를 가르킬 주소를 담는 공간 변수 선언해서 만듬*변수는 초기값꼭!
//          타입[ ] 배열명 = new 타입명[ 크기];       <new 연산자로 힙에 배열을 만들어서 변수에 위치값 넣어줌
//          타입[ ] 배열명 = {값1,값2,....};                <배열 안에 담을 내용 
             //배열요소 : 배열명[인덱스] >> 일반변수처럼 사용 가능
             //인덱스는 크기-1 갯수 들어있다 첫째 칸이 0번이라서
//         5.2) 배열 초기화
//         -선언된 배열요소를 초기화
//         -초기화 명령이 없으면 자동 초기화됨
//         -보통 선언과 초기화를 결합한 형태를 사용
//            타입[] 배열명={값1,값2,......};
//             타입[] 배열명=new 타입[]{값1,값2,......};
/*
 *             ex) int[] num1;                      //배열 가르키는 주소담는 변수 선언
 *                  num 1= new int[10];         //new연산자로 힙에 배열을[컨테이너갯수] 만들고 위에만든 변수와 연결됨
 *                  int[] num=new int[10];      
 */
package chaper05;

public class RefVal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     FirstArray f1=new FirstArray();
     f1.sampleArray();
	}

}

class FirstArray{
	public void sampleArray(){
		int[]num= null;
		num= new int[5];  //점수
		
		
		/*String[]name=new String[5]
		 * name[0]="홍길동"; 
		 * name[1]="홍길순"; 
		 * name[2]="강감찬"; 
		 * name[3]="이성계"; 
		 * name[4]="조현우";
		 */
//		String[]name=null;
//		name = new String[]{"홍길동","홍길순","강감찬","이성계","조현우"};
		
		String[] name={"홍길동","홍길순","강감찬","이성계","조현우"};
		for(int i=0; i<name.length;i++) {
			System.out.print(name[i]+",");
		}
		
		int[] a = new int[7];
		
		
		
		
	}
}
