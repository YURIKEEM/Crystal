package haSsemClass;

public abstract class Employee {
	 private String name;

	   public String getName() {
	      return name;
	   }

	   public void setName(String name) {
	      this.name = name;
	   }
	   
	   public abstract void echo();
}
