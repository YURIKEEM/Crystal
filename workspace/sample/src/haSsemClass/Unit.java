package haSsemClass;

public abstract class Unit {
	 //필드
    int x;
    int y;
    String str;
 
    //추상메서드 선언(구현부 없다.)
    //모든 유닛은 움직여야하기 때문에 move()를 추상메서드로 썼다.
    public abstract void move(int x, int y);
    
    public void stop(String str, int x, int y) {
        this.x = x;
        this.y = y;
        this.str = str;
        System.out.println("현재위치: " + this.x + "," + this.y +"에" + this.str + "가/이 멈춥니다.");
    }
}
