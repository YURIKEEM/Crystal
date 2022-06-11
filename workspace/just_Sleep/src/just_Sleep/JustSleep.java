package just_Sleep;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class JustSleep {
	static Statement stmt = null;   
	static  ResultSet rs = null; 
	static  Connection conn=null;
	static ResultSetMetaData rsmd=null;
	static PreparedStatement pstmt = null;         
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		Scanner sc=new Scanner(System.in);
		int num=0;
		String str;
		while(true)
		{
			try {
				init();
				System.out.println("하고자 하는 작업을 고르시오(1. select 2. insert 3.delete 4.update)");
				num=sc.nextInt();
				if(num==1)
				{
					System.out.println("선택할 쿼리를 입력하시오");
					str=sc.nextLine();
					str=sc.nextLine();
					select(str);
				}
				else if(num==2)
				{
					System.out.println("삽입할 쿼리를 입력하시오");
					str=sc.nextLine();
					str=sc.nextLine();
					insert(str,2);
				}
				else if(num==3)
				{
					System.out.println("삭제할 쿼리를 입력하시오");
					str=sc.nextLine();
					str=sc.nextLine();
					insert(str,3);
				}
				else if(num==4)
				{
					System.out.println("업데이트할 쿼리를 입력하시오");
					str=sc.nextLine();
					str=sc.nextLine();
					insert(str,4);
				}
				else{
					System.out.println("올바른 숫자를 입력해주세요");
				}
				
				
			}
			catch(ClassNotFoundException e)
			{
				System.out.println("드라이버 연동 실패");
				e.printStackTrace();
			}
			catch(SQLException e)
			{
				e.printStackTrace();
			}
		}
		
	}
	
	//데이터베이스 연결메소드
	static void init() throws ClassNotFoundException, SQLException
	{
		Class.forName("oracle.jdbc.driver.OracleDriver");
		String db_url="jdbc:oracle:thin:@localhost:1521:xe";
		//실행 쿼리
		conn=DriverManager.getConnection(db_url,"ddit","java");
		//실행할 쿼리 정보 등록
		stmt = conn.createStatement();
		//결과를 담을 ResultSet 생성 후 결과 담기
	}
	static String eliminate(String str)
	{
		if(str.contains(";"))
		{
			str=str.replace(";", "");
		}
		return str;
	}
	//select 메소드
	static void select(String str) throws SQLException
	{
		
		
		rs = stmt.executeQuery(eliminate(str));
		rsmd=rs.getMetaData();
		
		int rowCnt = rsmd.getColumnCount();
			while(rs.next())
			{
				for(int i=0;i<rowCnt;i++)
				{
					System.out.print(rs.getString(i+1)+" ");
				}
				System.out.println();
			}
	}
	static void insert(String str, int num) throws SQLException, ClassNotFoundException
	{
		
		try {
			stmt.executeQuery(eliminate(str));
			if(num==2)
			{
				System.out.println("데이터 삽입 성공!");
			}
			else if(num==3)
			{
				System.out.println("데이터 삭제 성공!");
			}
			else if(num==4)
			{
				System.out.println("데이터 업데이트 성공!");
			}
		}
		 catch(SQLException e)
			{
				if(num==2)
				{
					System.out.println("데이터 삽입 실패!");
				}
				else if(num==3)
				{
					System.out.println("데이터 삭제 실패!");
				}
				else if(num==4)
				{
					System.out.println("데이터 업데이트 실패!");
				}
			}
	}

}


