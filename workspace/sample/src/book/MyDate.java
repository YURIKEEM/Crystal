package book;

public class MyDate {
  private int year;
  private int month;
  private int day;
  
  MyDate(){}
  
  MyDate(int year, int month, int day){
	  this.year=year;
	  this.month=month;
	  this.day =day;
  }

  
  public int getYear() {
	  return this.year;
  }
  public int getMonth() {
	  return this.month;
  }
  public int getDay() {
	  return this.day;
  }
  
  public void setYear(int year) {
	  this.year=year;
  }
  public void setMonth(int month) {
	  this.month=month;
  }
  public void setDay(int day) { 
	 this.day =day;
 }
}