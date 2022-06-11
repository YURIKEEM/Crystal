package Book;

public class Homework {

	public static void main(String[] args) {
		int sum = 0;
		String str1="";

		for(
		int i = 1;i<=10;i++)
		{

			if (i % 2 == 0) {
				str1 += "-" + i;
				sum += -i;

			} else {
				// if(i==1) str1+= i;
				String tmp = (i == 1) ? i + "" : "+" + i;
				str1 += tmp;

				sum += i;

			}
		}

		System.out.println(str1+"=?");
		System.out.println("결과: "+sum);

		}
	}

	


/*
 * 1 위의 결과를 등수 순으로 출력하시오 정렬이용 자리바꾸기 2 다음 자료로 막대 그래프를 작성하시오 [자료]{25,55,45,40,50}
 * -막대 그래프를 다음과 같이 출력하시오 힌트1차원배열을 2차원배열로바꿔야함 
 * 55| * 
 * 50| * 
 * 45| * * 
 * 40| * * 
 * 35| * *
 * 30| * * 
 * 25| * * *
 */
