package shadowing;

public class Test {

	public static void main(String[] args) {
		vegitables veg=new vegitables("Tomato","Red",10,5);
		System.out.println(veg.getName());
		System.out.println(veg.getColor());
		System.out.println(veg.getCost());
		System.out.println(veg.getSize());

	}

}	     
