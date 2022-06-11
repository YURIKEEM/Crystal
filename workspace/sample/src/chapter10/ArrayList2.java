package chapter10;
//문제1] 키보드로 "N"이나 "n"을 입력할때 까지 정수를 입력 받아 ArrayList에 저장하고,
//저장된 값중 가장 큰 값을 출력하는 프로그램 작성

import java.util.List;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class ArrayList2 {

 public static void main(String[] args) throws Exception {
    List <Integer>list = new ArrayList<Integer>();
    Scanner sc = new Scanner(System.in);
    
    while(true) {
    System.out.println("숫자 또는(N) 입력");      
    String inputStr = sc.next();   
    
    
    if(inputStr.equalsIgnoreCase("N")) {
       break;
    }else {
       list.add(Integer.parseInt(inputStr));
       
       }
    }
    System.out.println(list);
    System.out.println("최대값 : "+maxNumber(list));
 
 }
 public static int maxNumber(List<Integer>list) {
    int tmax = list.get(0);
    for(int i=1;i<list.size();i++) {
       if(tmax<list.get(i)) {
          tmax = list.get(i);
       }
    }
    return tmax;

 }
}
