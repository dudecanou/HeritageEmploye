package com.sircus.HeritageEmploye;

import java.text.NumberFormat;

public class EmployeCommission extends Employe{

	private double vente;
	private double commission;
	NumberFormat formatter = NumberFormat.getCurrencyInstance();

	
	// ------------------------------ VENTE -------------------------------
	public double getVente() {
		return vente;
	}
	public void setVente(double vente) {
		this.vente = vente;
	}
	
	// --------------------------- COMMISSION -----------------------------
	public double getCommission() {
		return commission;
	}
	public void setCommission(double commission) {
		this.commission = commission;
	}
	
	public EmployeCommission()
	{
		super();
		this.vente=0;
		this.commission=0;
	}
	
	public EmployeCommission(String nom, double salaire, String embauche, double vente)
	{
		super (nom, salaire, embauche);
		this.vente = vente;
	}
	
	public double augmentationSalaire(double augmentation)
	{
		
		return salaireEmp *=(1+(augmentation/100));
	}
	
	public double augmentationSalaireCom(double commission)
	{
		
		double a= getSalaireEmp();
		a = a * (1+(commission/100));
		salaireEmp = a;
		return salaireEmp;
	}
	
	public String toString(){
		String EmpInfo = "\n Nom : " + nomEmp + "\n Salaire : " + formatter.format(salaireEmp) + "\n Date d'embauche : " + embaucheEmp + "\n Vente Annuel : " + formatter.format(vente);
		return EmpInfo;
	}
}
