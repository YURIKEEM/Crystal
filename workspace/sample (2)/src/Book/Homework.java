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
		System.out.println("���: "+sum);

		}
	}

	


/*
 * 1 ���� ����� ��� ������ ����Ͻÿ� �����̿� �ڸ��ٲٱ� 2 ���� �ڷ�� ���� �׷����� �ۼ��Ͻÿ� [�ڷ�]{25,55,45,40,50}
 * -���� �׷����� ������ ���� ����Ͻÿ� ��Ʈ1�����迭�� 2�����迭�ιٲ���� 
 * 55| * 
 * 50| * 
 * 45| * * 
 * 40| * * 
 * 35| * *
 * 30| * * 
 * 25| * * *
 */
