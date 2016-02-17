package com.sircus.HeritageEmploye;

public class Superviseur extends Employe {
	
	private double augmentationSup = 5;

	
	
	public double getAugmentationSup() {
		return augmentationSup;
	}

	public void setAugmentationSup(double augmentationSup) {
		this.augmentationSup = augmentationSup;
	}
	
	public Superviseur()
	{
		super();
		this.augmentationSup = 0;
	}
	
	public Superviseur(String nom, double salaire, String embauche )
	{
		super(nom, salaire, embauche);
		
	}
	
	public double augmentationSalaire(double augmentation)
	{
		double a= getSalaireEmp();
		a = a * (1+(augmentationSup/100));
		a = a * (1+(augmentation/100));
		salaireEmp = a;
		return salaireEmp;
		
	}
	
}


