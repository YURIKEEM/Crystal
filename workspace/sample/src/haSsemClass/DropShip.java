package haSsemClass;

public class DropShip extends Unit {
	public DropShip() {
    }
    
    @Override
    public void move(int x, int y) {
     System.out.println("드랍쉽의 위치: " + x +"," + y + "로 이동함.");    
    }
    
    //DropShip의 고유메서드
    public void load(){
        System.out.println("탑승모드: 유닛 탑승!");
    }
 
    public void unload(){
        System.out.println("탑승모드: 유닛 하강!");
    }

}
