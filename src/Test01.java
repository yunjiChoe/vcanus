class Bread {
	String bread;
	int flour;
	int water;
	int type;
	
	public String getBread() {
		return bread;
	}
	public void setBread(String bread) {
		this.bread = bread;
	}
	public int getFlour() {
		return flour;
	}
	public void setFlour(int flour) {
		this.flour = flour;
	}
	public int getWater() {
		return water;
	}
	public void setWater(int water) {
		this.water = water;
	}
	public int getType() {
		return type;
	}
	public void setType(int type) {
		this.type = type;
	}
	
	void print() {
		System.out.println("breadType: " + getBread());
		System.out.println("recipe");
		System.out.println("flour: " + getFlour());
		System.out.println("water: " + getWater());
		System.out.println(getBread() + ": " + getType());
		System.out.println();
	}
	
}

public class Test01 {
	public static void main(String[] args) {

		Bread cream = new Bread();
		cream.setBread("cream");
		cream.setFlour(100);
		cream.setWater(100);
		cream.setType(200);
		cream.print();
		
		Bread sugar = new Bread();
		sugar.setBread("sugar");
		sugar.setFlour(100);
		sugar.setWater(50);
		sugar.setType(200);
		sugar.print();
		
		Bread butter = new Bread();
		butter.setBread("butter");
		butter.setFlour(100);
		butter.setWater(100);
		butter.setType(50);
		butter.print();
	}

}
