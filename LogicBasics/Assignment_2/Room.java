class Room{
	int height;
	int width;
	int breadth;

	Room(int inputHeight, int inputWidth, int inputBreadth){
		height = inputHeight;
		width = inputWidth;
		breadth = inputBreadth;
	}

	public static void main(String[] args){		
		Room room = new Room(5, 5, 5);
		System.out.println("The volume of the room is " + room.volume());
	}

	int volume(){
		return height*width*breadth;
	}
}