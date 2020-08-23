package com.main.imp;

interface Meal{
	String getContent();
	double price();
}

class FriedChicken implements Meal{

	@Override
	public String getContent() {
		// TODO Auto-generated method stub
		return "不黑心炸雞";
	}

	@Override
	public double price() {
		// TODO Auto-generated method stub
		return 49.0;
	}
	
}

class Hamburger implements Meal{

	@Override
	public String getContent() {
		// TODO Auto-generated method stub
		return "美味蟹堡";
	}

	@Override
	public double price() {
		// TODO Auto-generated method stub
		return 99.0;
	}
	
}

abstract class SideDish implements Meal{
	protected Meal meal;
	public SideDish(Meal meal) {
		// TODO Auto-generated constructor stub
		this.meal = meal;
	}
}

class SideDishOne extends SideDish{

	public SideDishOne(Meal meal) {
		super(meal);
		// TODO Auto-generated constructor stub
	}

	@Override
	public String getContent() {
		// TODO Auto-generated method stub
		return meal.getContent()+"| 可樂 | 薯條 ";
	}

	@Override
	public double price() {
		// TODO Auto-generated method stub
		return meal.price()+30.0;
	}
	
	
	
}


public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Meal meal = new SideDishOne(new FriedChicken());
		System.out.println(meal.getContent());
		System.out.println(meal.price());

	}

}
