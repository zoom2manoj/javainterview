package com.duplicate;

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

class EngStudentview{
	
	public void printRecord(String name,int roll){
		
		System.out.println(name + " "+ roll);
	}
	
}

class Controller{
	
	EngStudent model;
	EngStudentview view;
	
	public Controller(EngStudent model,EngStudentview view){
		
		this.model=model;
		this.view=view;
	}
	
	public void setStudentName(String name){
		
		model.setName(name);
	}
	
	public void getStudentName(){
		
		model.getName();
	}
	
	public void setStudentRoll(int roll){
		
		model.setRoll(roll);
	}
	
	public void getStudentRoll(){
		
		model.getRoll();
	}
	
	public void updateView(){
		
		view.printRecord(model.getName(),model.getRoll());
	}
}
	
public class ModelViewController {
	
	public static void main(String...s){
		
		EngStudent model=getdataFromDataBase();
		EngStudentview view=new EngStudentview();
		
		Controller mController=new Controller(model, view);
		
		mController.updateView();
	}

	private static EngStudent getdataFromDataBase() {
		
		EngStudent mEngStudent=new EngStudent();
		mEngStudent.setName("Shyam");
		mEngStudent.setRoll(102);
		
		return mEngStudent;
	}
	

}
