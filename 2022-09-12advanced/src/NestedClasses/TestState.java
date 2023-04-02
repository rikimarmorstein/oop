package NestedClasses;

import NestedClasses.State.Citizen;
import NestedClasses.State.Flag;

public class TestState {

	public static void main(String[] args) {

		State isr = new State("Israel");
		State geo = new State("Georgia");

		
		Citizen c1=isr.new Citizen("Moshe");
		Citizen c2=isr.new Citizen("Oz");
		Citizen c3=geo.new Citizen("Max");
		Citizen c4=geo.new Citizen("Vital");
		Citizen c5=isr.new Citizen("Mn");


		System.out.println(c1.getName());
		System.out.println(c1.getStateName());
		System.out.println(c4.getName());
		System.out.println(c4.getStateName());
		
		System.out.println(isr.getPopulation());
		System.out.println(geo.getPopulation());

		Flag flag = new Flag("Hapoel");
		System.out.println(flag);
	}

}
