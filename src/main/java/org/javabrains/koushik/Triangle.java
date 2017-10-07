package org.javabrains.koushik;

public class Triangle {

	protected String type;
	
	
	
	public String getType() {
		return type;
	}



	public void setType(String type) {
		this.type = type;
	}


	public Triangle(String type){
		
		this.type=type;
		
	}

	public void draw(){
		
		System.out.println(" Triangle draw " + getType());
		
		
	}
}
