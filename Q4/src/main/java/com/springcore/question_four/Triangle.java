package com.springcore.question_four;
import java.util.Random;

public class Triangle {
	private int base;
	private int height;
		 
	public int getHeight() {
		return height;
	}
	public void setHeight(int height) {
		this.height = height;
	}

	public int getBase() {
		return base;
	}
	public void setBase(int base) {
		this.base = base;
	}
	
	public double getArea(int base, int height) {
		return 0.5 * this.base * this.height;
	}

	public void draw() {
		
		System.out.println("Question 4 : ");
		System.out.println("Base of the Triangle is : " + base + " and Height is : " + height);
		System.out.println("Area of triangle is : " + getArea(base,height));
		Random rand = new Random();
        int delay = rand.nextInt(100);
        try {
        	System.out.println("Total Delay : "+ delay + " ms");
            Thread.sleep(delay);
        }catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}