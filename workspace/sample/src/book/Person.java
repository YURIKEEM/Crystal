package book;

public class Person {
	private String name;
	private int year;
	private int month;
	private int day;
	MyDate md;

 Person(){}

 Person(String name, int year, int month, int day){
	this.name=name;
	this.year=year;
	this.month=month;
	this.day=day;
	
 }
 Person(String name, MyDate md){
	this.name=name;
	this.year=md.getYear();
	this.month=md.getMonth();
	this.day=md.getDay();
  }
 
 public String getName() {
	 return name;
 }
 public int getYear() {
	 return year;
 }
 public int getMonth() {
	 return month;
 }
 public int getDay() {
	 return day;
 }
 public void setName(String name) {
	 this.name=name;
 }
 public void setYear(int year) {
	 this.year=year;
 }
 public void setMonth(int month) {
	 this.month=month;
 }
 public void setDay(int day) {
	 this.day=day;
 }
 
}