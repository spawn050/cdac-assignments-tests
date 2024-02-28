class Box{
	int height;
	int width;
	int breadth;

	Box(int inputHeight, int inputWidth, int inputBreadth){
		height = inputHeight;
		width = inputWidth;
		breadth = inputBreadth;
	}

	public static void main(String[] args){
		Box box1 = new Box(3, 5, 7);
		Box box2 = new Box(1, 2, 3);
		System.out.println("The volume of box one is " + box1.getVolume() + " and the surface area is " + box1.getArea());
		System.out.println("The volume of box two is " + box2.getVolume() + " and the surface area is " + box2.getArea());
	}

	int getVolume(){
		return height * width * breadth;
	}

	int getArea(){
		return 2*(height + width + breadth);
	}
}