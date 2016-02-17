package com.sircus.HeritageEmploye;

import java.util.Scanner;

public class Main {

	public static void main(String[] args){
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

		
		String nom,embauche;
		double salaire, augmentation, vente, commission;
		
		
	//---------------------------- EMPLOYE 1 ---------------------------
		System.out.println("***************** Employe 1 *****************");
		System.out.println("");
		System.out.println("Entrez le nom de l'employe ==>");
		nom = sc.nextLine();		
		System.out.println("");

		System.out.println("Entrez le salaire de l'employe ==>");
		salaire = sc.nextDouble();
		System.out.println("");
		sc.nextLine();
		
		System.out.println("Entrez la date d'embauche de l'employe ==>");
		embauche = sc.nextLine();
		System.out.println("");
		
		Employe emp1 = new Employe (nom, salaire,embauche);

		System.out.println(emp1.toString());
		System.out.println("");
		
		//---------------------------- EMPLOYE 2 ---------------------------
				System.out.println("***************** Employe 2 *****************");
				System.out.println("");
				System.out.println("Entrez le nom de l'employe ==>");
				nom = sc.nextLine();		
				System.out.println("");

				System.out.println("Entrez le salaire de l'employe ==>");
				salaire = sc.nextDouble();
				System.out.println("");
				sc.nextLine();
				
				System.out.println("Entrez la date d'embauche de l'employe ==>");
				embauche = sc.nextLine();
				System.out.println("");
				
				Employe emp2 = new Employe (nom, salaire,embauche);

				System.out.println(emp2.toString());
				System.out.println("");
				
				//---------------------------- SUPERVISEUR ---------------------------
				System.out.println("***************** Superviseur *****************");
				System.out.println("");
				System.out.println("Entrez le nom du superviseur ==>");
				nom = sc.nextLine();		
				System.out.println("");

				System.out.println("Entrez le salaire du superviseur ==>");
				salaire = sc.nextDouble();
				System.out.println("");
				sc.nextLine();
				
				System.out.println("Entrez la date d'embauche du superviseur ==>");
				embauche = sc.nextLine();
				System.out.println("");
				
				Superviseur sup = new Superviseur (nom, salaire,embauche);

				System.out.println(sup.toString());
				System.out.println("");
				
				//---------------------------- EMPLOYE COMMISSION ---------------------------
				System.out.println("***************** Employe commission *****************");
				System.out.println("");
				System.out.println("Entrez le nom de l'Employe commission ==>");
				nom = sc.nextLine();		
				System.out.println("");

				System.out.println("Entrez le salaire de l'Employe commission ==>");
				salaire = sc.nextDouble();
				System.out.println("");
				sc.nextLine();
				
				System.out.println("Entrez la date d'embauche de l'Employe commission ==>");
				embauche = sc.nextLine();
				System.out.println("");
				
				System.out.println("Entrez la somme des ventes annuel de l'employe commission ==>");
				vente = sc.nextDouble();
				System.out.println("");
				sc.nextLine();

				
				EmployeCommission EmpC = new EmployeCommission (nom, salaire,embauche, vente);

				System.out.println(EmpC.toString());
				System.out.println("");



		//---------------------------- Augmentation de salaire ---------------------------
		System.out.println("Quel est le pourcentage d'augmentation (entrez 10 pour 10%) ==>");
		augmentation = sc.nextDouble();
		sc.nextLine();
		emp1.augmentationSalaire(augmentation);
		emp2.augmentationSalaire(augmentation);
		sup.augmentationSalaire(augmentation);
		EmpC.augmentationSalaire(augmentation);


		
		System.out.println("***************** Employe 1 *****************");
		System.out.println(emp1.toString());
		System.out.println("");
		
		System.out.println("***************** Employe 2 *****************");
		System.out.println(emp2.toString());
		System.out.println("");
		
		System.out.println("***************** Superviseur *****************");
		System.out.println(sup.toString());
		System.out.println("");
		
		System.out.println("***************** Employe Commission *****************");
		System.out.println(EmpC.toString());
		System.out.println("");
		System.out.println("");

		System.out.println(" % d'augmentation de l'employe commission (5% ->500 et 1000 ; 10% ->1001 et 5000; 20%-> 5001 et plus)");
		commission = sc.nextDouble();
		sc.nextLine();
		EmpC.augmentationSalaireCom(commission);
		System.out.println(EmpC.toString());

		sc.close();

	}

}
