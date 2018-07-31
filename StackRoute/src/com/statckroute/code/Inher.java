package com.statckroute.code;

interface Building{
	public void room();
	public void parking();
}

class School implements Building{
	@Override
	public void room() {
		// TODO Auto-generated method stub
		System.out.println("Rooms are Classes");
	}

	@Override
	public void parking() {
		// TODO Auto-generated method stub
		System.out.println("Parking for teachers and students are different");
	}
}

class PG implements Building{

	@Override
	public void room() {
		// TODO Auto-generated method stub
		System.out.println("Rooms are residential");
	}

	@Override
	public void parking() {
		// TODO Auto-generated method stub
		System.out.println("Parking is in basement");
		
	}


	
}

public class Inher {
	public static void main(String [] args) {
		School ob = new School();
		ob.room();
		ob.parking();
		PG ob1 = new PG();
		ob1.room();
		ob1.parking();
	}
}
