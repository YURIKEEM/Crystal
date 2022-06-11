package chapter10;

public class Student {
 private int studentNum;
 private String studentName;
 private int score;
 
 public Student() {}
 
 public Student(int studentNum, String studentName, int score) {
	 this.studentNum = studentNum;
	 this.studentName = studentName;
	 this.score = score;
 }
 
 public void setStudentNum(int studentNum) {
	 this.studentNum = studentNum;
 }
 
 public void setStudentName(String studentName) {
	 this.studentName = studentName;
 }
 
 public void setScore(int score) {
	 this.score = score;
 }
	 
public int getStudentNum() {
	return studentNum ;
}
public String getStudentName() {
	return studentName;
 }


@Override
public String toString() {
	return studentNum +", "+studentName+", "+score;
}



}
