package chapter06;


	class Car02{
		private String kind;
		private int maxSpeed;
		private String color;
		
		public Car02() {}
	    
		public Car02(String kind, int maxSpeed, String color) {
			this.kind = kind;
			this.maxSpeed = maxSpeed;
			this.color = color;
		}
		
		public void setKind(String kind) {
			this.kind = kind;
		}
		
		public void setMaxSpeed(int maxSpeed) {
			this.maxSpeed = maxSpeed;
		}
		
		public void setColor(String color) {
			this.color = color;
		}
		
		public String getColor() {
			return color; 
		}
		
		public String toString() {
			String str = "차종 : " +kind+"최대속도 : "+maxSpeed+"색상 : "+color;
			return str;
		}
	}


