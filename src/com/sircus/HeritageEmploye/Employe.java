package com.sircus.HeritageEmploye;
import java.text.DateFormat;
import java.text.NumberFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Employe {

	protected String nomEmp;
	protected double salaireEmp;
	protected Date embaucheEmp;
	
	NumberFormat formatter = NumberFormat.getCurrencyInstance();

	
	//---------------------- Get, Set Nom Employe ------------------------
	public String getNomEmp() {
		return nomEmp;
	}
	public void setNomEmp(String nomEmp) {
		this.nomEmp = nomEmp;
	}
	
	//---------------------- Get, Set Salaire Employe ------------------------
	public double getSalaireEmp() {
		return salaireEmp;
	}
	public void setSalaireEmp(double salaireEmp) {
		this.salaireEmp = salaireEmp;
	}
	
	//---------------------- Get, Set Embauche Employe ------------------------
	public Date getEmbaucheEmp() {
		return embaucheEmp;
	}
	public void setEmbaucheEmp(Date embaucheEmp) {
		this.embaucheEmp = embaucheEmp;
	}
	
	public Employe ()
	{
		
	}
	
	public Employe (String pNom, double pSalaire, String pEmbauche)
	{
		nomEmp = pNom;
		salaireEmp = pSalaire;
		embaucheEmp = formatDate(pEmbauche);
	}
	
	
	public static Date formatDate(String embauche)
	{
		DateFormat format = new SimpleDateFormat("dd MM yyyy");
		Date date = new Date();
		try {
			date = format.parse(embauche);
		} catch (ParseException e) {
			e.printStackTrace();
		}
		return date;
	}
	public String toString(){
		String EmpInfo = "\n Nom : " + nomEmp + "\n Salaire : " + formatter.format(salaireEmp) + "\n Date d'embauche : " + embaucheEmp;
		return EmpInfo;
	}
	
	public double augmentationSalaire(double augmentation)
	{
		
		return salaireEmp *=(1+(augmentation/100));
		
	}
	
	
}

