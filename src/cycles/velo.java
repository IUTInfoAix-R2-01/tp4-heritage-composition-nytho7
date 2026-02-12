package cycles;

import java.util.Random;

public class velo {
	private double DEFAUT_BRAQUET = 13.0;
	private double braquet;
	private double diamRoue;
	private Random genAlea;
	
	public double getDEFAUT_BRAQUET() {
		return DEFAUT_BRAQUET;
	}
	public void setDEFAUT_BRAQUET(double dEFAUT_BRAQUET) {
		DEFAUT_BRAQUET = dEFAUT_BRAQUET;
	}
	
	public velo(double braquet, double diamRoue) {
		this.braquet = braquet;
		this.diamRoue = diamRoue;
		genAlea = new Random();
	}
	
	public velo(double braquet) {
		this.braquet = braquet;
	}
		
	public velo() {
		
	}
	
	public double getBraquet() {
		return braquet;
	}
	
	public void setBraquet(double braquet) {
		this.braquet = braquet;
	}
	
	public double getDiamRoue() {
		return diamRoue;
	}
	
	public void setDiamRoue(double diamRoue) {
		this.diamRoue = diamRoue;
	}
	
	public Random getGenAlea() {
		return genAlea;
	}
	
	public void setGenAlea(Random genAlea) {
		this.genAlea = genAlea;
	}

	public String toString() {
		return "velo [braquet=" + braquet + ", diamRoue=" + diamRoue + "]";
	}
	
	public double getPuissance(double FrequenceCoupsDePedale) {
		return FrequenceCoupsDePedale * braquet * genAlea.nextDouble();
	}


	public static void main(String[] args) {
		// Test constructor and toString()
	    velo vel = new velo(2.0,13.0);
	    System.out.println(vel);  // toString()
	   
	    // Test Setters and Getters
	    System.out.println(vel);  // toString()
	    System.out.println("braquet is: " + vel.getBraquet());
	    System.out.println("diamRoue is: " + vel.getDiamRoue());
	    System.out.println("genAlea is: " + vel.getGenAlea());
	   }
	}
	