package exam;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import javax.annotation.processing.SupportedSourceVersion;

import java.sql.PreparedStatement;

public class DBConnection {
//정적인경우
   public static void main(String[] args) {
      //연결공식외우기
      String driver ="oracle.jdbc.driver.OracleDriver";
      String url = "jdbc:oracle:thin:@localhost:1521:xe";
      String user = "ddit";
      String password ="java";
      
      Connection conn = null; //연결객체
      ResultSet rs = null;       // 결과보관객체->주로 뷰, 커서라고 함
      Statement stmt = null;  // sql명령객체
      PreparedStatement pstmt = null;
      
      try {
         Class.forName(driver);
         conn=DriverManager.getConnection(url,user, password);
         //다음절과의 사이에 공백 한칸이상 필 수
         String sql ="select mem_id, mem_name,mem_mileage"
               +" from member"
               +" where substr(mem_regno2,1,1)='2'";
      
         stmt = conn.createStatement();
      
         rs=stmt.executeQuery(sql);
      
         while(rs.next()) {
            String id =rs.getString("mem_id");
            String name =rs.getString("mem_name");
            int mileage = rs.getInt("mem_mileage");
               System.out.println(id+"\t"+name+"\t"+mileage);
         }
         
      }catch(ClassNotFoundException e) {//drive에서 못찾았을 때
         e.printStackTrace();
      }catch(SQLException e ) {  //sql구문 오류시 
         e.printStackTrace();
      }finally {//마지막 필수 코스! 열어놓은 것 닫아주기!
            try {
               if(rs!=null)   rs.close();
               if(stmt!=null)   stmt.close();
               if(conn!=null)   conn.close();
            }catch(Exception e) {
               e.printStackTrace();
            }
         }
      }
   }