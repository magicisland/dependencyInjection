package org.javabrains.koushik;

public class Triangle {

	protected String type;
	protected int height;
	
	
	
	
	public String getType() {
		return type;
	}



	public void setType(String type) {
		this.type = type;
	}


	public Triangle(String type,int height){
		this.type=type;
		this.height=height;
		
	}
	public Triangle(String type){
		
		this.type=type;
		
	}

	public void draw(){
		
		System.out.println(" Triangle draw " + getType() +  getHeight());
		
		
	}



	public int getHeight() {
		return height;
	}
}
