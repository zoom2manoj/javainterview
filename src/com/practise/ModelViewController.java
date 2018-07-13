package com.practise;

class EngStudent{
	
	String name;
	int roll;
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	public int getRoll() {
		return roll;
	}
	public void setRoll(int roll) {
		this.roll = roll;
	}
	
}

class View {
	
	public void printRecord(String name,int roll){
		
		System.out.println(name+" "+roll);
	}
}

class EngController{
	
	EngStudent model;
	View view;
	
	public EngController(EngStudent model, View view) {
		this.model = model;
		this.view = view;
	}
	
	public void updateName(String name){
		
		model.setName(name);
	}
	
	public void updateRoll(int roll){
		
		model.setRoll(roll);
	}

	public void printRecord(){
		
		view.printRecord(model.getName(), model.getRoll());
	}
	
	public void updateView(){
		
		view.printRecord(model.getName(), model.getRoll());
		
	}
}


public class ModelViewController {

	public static void main(String...s){
		
		EngStudent model=new EngStudent();
		model.setName("Deepak Sharma");
		model.setRoll(101);
		
		View view=new View();
		
		EngController mController=new EngController(model, view);
		mController.printRecord();
		
		mController.updateName("Shyam");
		mController.updateView();
		
	}
	
}
