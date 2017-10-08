package org.javabrains.koushik;

import java.util.List;

public class Triangle {

	protected List<Point> points;
	

	
	public List<Point> getPoints() {
		return points;
	}



	public void setPoints(List<Point> points) {
		this.points = points;
	}



	public void draw(){
	
			for (Point point:points){
				System.out.println(" punto : "  + point.getX() + " , " +  point.getY());
			}
		
	}
}
