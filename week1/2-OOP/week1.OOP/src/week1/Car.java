package week1;

public class Car {
	
	int mileage;
	int doors;
	String color;
	
	public void whatAmI(){
		System.out.println("I am a car");
	}
	
	public Car(){
		this.color = "white";
	}
	
	public Car(int mileage, String color, int doors){
		this.mileage = mileage;
		this.doors = doors;
		this.color = color;
		
	}

	static public class BMW {
		public BMW(int i) {
			// TODO Auto-generated constructor stub
		}

		@Override
		public String toString() {
			return "BMW" + "@" + Integer.toHexString(hashCode());

		}
	}


}

class Audi extends Car{
	int mileage;
	public Audi(){
		this.mileage = 200000;
	}
	public Audi(int mileage){
		this.mileage = mileage;
	}
	public String toString(){
		return getClass().getSimpleName() + "@" +Integer.toHexString(hashCode());
	}
	public void setMileage(int mileage){
		this.mileage = mileage;
	}
	public int returnMileage(){
		return mileage;
	}
}

class BMW extends Car{
	int crushes;
	double a;

	public BMW(int mileage, String color, int doors){
		super(mileage, color, doors);
		this.crushes = sumCrushes();
	} 
	
	public BMW() {
	}

	private int sumCrushes(){
		if(this.mileage > 1000){
			return 2;
		}
		if(this.color.equals("black")){
			return 10;
		}
		else return 1;
	}
	
	public String toString(){
		return getClass().getSimpleName() + "@" +Integer.toHexString(hashCode());
	}
}

class Volvo extends Car{
	public String toString(){
		return getClass().getSimpleName() + "@" +Integer.toHexString(hashCode());
	}
}

class Wolkswagen extends Car{
	public String toString(){
		return getClass().getSimpleName() + "@" +Integer.toHexString(hashCode());
	}
}

/*d	 public enum Cars {
		Audi(100000), BMW(1000), Wolkswagen(1000000), Porsche(50000);
		private int mileage;

		private Cars(int mileage) {

			this.mileage = mileage;
		}

		@Override
		public String toString() {
			switch (this) {
			case Audi:
				return "Audi" + "@" +Integer.toHexString(hashCode());
				
			case BMW:
				System.out.println("BMW" + BMW.toString());
				break;
			case Wolkswagen:
				System.out.println("Wolkswagen" + Wolkswagen.toString());
				break;
			case Porsche:
				System.out.println("Porsche" + Porsche.toString());
				break;
			}

			return super.toString();
		}

	};*/

