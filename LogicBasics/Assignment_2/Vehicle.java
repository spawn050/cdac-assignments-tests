class Vehicle{
	float price;
	String color;
	String model;
	
	
	public static void main(String[] args){
		Vehicle vehicle = new Vehicle(2495.5f, "Red", "Ferrari SF-23");
		System.out.println(vehicle.display());
	}

	Vehicle(float inputPrice, String inputColor, String inputModel){
		price = inputPrice;
		color = inputColor;
		model = inputModel;
	}

	String display(){
		String details = "The model of the car is " + model + ", the color is " + color + " and the price is " + price;
		return details;
	}
}