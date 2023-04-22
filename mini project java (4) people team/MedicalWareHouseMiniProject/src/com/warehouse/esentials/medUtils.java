package com.warehouse.esentials;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class medUtils {
	static Scanner sc = new Scanner(System.in);
	public static void addMEds (List<Medicines>medlist) {
	medlist.add(new Medicines("Amoxicillin 250 mg ;","laxoSmithKline Pharmaceuticals Ltd.","ANTIBIOTIC","3/04/2025",1,68.91,"Doxycycline","Azithromycin"));
	medlist.add(new Medicines("Cefuroxime 250 mg","laxoSmithKline Pharmaceuticals Ltd.","ANTIBIOTIC","29/04/2023",2,80,"Ceftum 250mg","Azithromycin"));
	medlist.add(new Medicines("Ciprofloxacin 250 mg;","Bayer Pharmaceuticals Pvt. Ltd..","ANTIBIOTIC","1/02/2036",1,52.5,"Keflex","Azithromycin"));
	medlist.add(new Medicines("Levofloxacin 750 mg;","Dr. Reddy's Laboratories Ltd.","ANTIBIOTIC","1/03/2025",2,79.13,"Amoxicillin","Azithromycin"));
	medlist.add(new Medicines("Azithromycin 500 mg;","Alembic Pharmaceuticals Ltd.","ANTIBIOTIC","1/03/2025",1,40.00,"azithromycin","levofloxacin"));
	medlist.add(new Medicines("Clindamycin 300 mg","Pfizer Ltd.","ANTIBIOTIC","02/02/2026",1,233.64,"Moxifloxacin","Moxifloxacin"));
	medlist.add(new Medicines("Erythromycin 250 mg","Abbott India Ltd","ANTIBIOTIC","1/02/2036",1,80.75,"Roxithromycin","Amoxicillin"));
	medlist.add(new Medicines("Linezolid 600 mg","Cipla Ltd.","ANTIBIOTIC","02/02/2026",1,314.93,"Daptomycin","Tinidazole"));
	medlist.add(new Medicines("Norfloxacin 400 mg","Cipla Ltd","ANTIBIOTIC","02/02/2026",1,66.35,"Ciprofloxacin","Daptomycin"));
	medlist.add(new Medicines("Ofloxacin 200 mg","Cipla Ltd.","ANTIBIOTIC","1/03/2025",1,75.28,"Ciprofloxacin","Roxithromycin"));
	medlist.add(new Medicines("Penicillin G  1.2 million units ","7.64 ","ANTIBIOTIC","Pfizer Ltd",1,7.64,"Daptomycin","Roxithromycin"));
	medlist.add(new Medicines("Tazobactam  100 mg","Pfizer Ltd.","ANTIBIOTIC","1/03/2025",1,259.28,"Meropenem","Piperacillin"));
	medlist.add(new Medicines("Rifampicin 150 mg","BSanofi India Ltd.","ANTIBIOTIC","02/02/2026",1,260,"Meropenem","Doxycycline"));
	medlist.add(new Medicines("Tetracycline 200 mg","Pfizer Ltd.","ANTIBIOTIC","1/03/2025  ",1,8.05,"Cefixime","Minocycline"));
	medlist.add(new Medicines("Tobramycin 80 mg","Sun Pharmaceutical Industries Ltd.","ANTIBIOTIC","02/02/2026",1,152.5,"Minocycline","Gentamicin"));
	medlist.add(new Medicines("Trimethoprim Sulfamethoxazole  400 mg ","GlaxoSmithKline Pharmaceuticals Ltd.","ANTIBIOTIC","1/03/2025",1,255.5," Clarithromycin","Tobramycin"));
	medlist.add(new Medicines("Vancomycin 100 mg","Fresenius Kabi India Pvt. Ltd","ANTIBIOTIC","1/03/2025",1,646.00,"Linezolid","GlaxoSmithKline"));
	medlist.add(new Medicines("Meropenem 2 gm","AstraZeneca Pharma India Ltd.","ANTIBIOTIC","1/02/2026",1,2979.00,"Ertapenem","Kabi"));
	medlist.add(new Medicines("Imipenem  Cilastatin 500 mg"," Cipla Ltd.","ANTIBIOTIC","1/02/2036",1,430.55,"Doripenem","Minocycline"));
	medlist.add(new Medicines("Ceftazidime 2gm","GlaxoSmithKline Pharmaceuticals Ltd.","ANTIBIOTIC","1/03/2025",1,233.50,"Cefotaxime","Cefotaxime"));
	medlist.add(new Medicines("Gentamicin 40 mg","Sun Pharmaceutical Industries Ltd.","ANTIBIOTIC","1/02/2036",1,35.70,"Netilmicin","Cefixime"));
	medlist.add(new Medicines("Amikacin 250 mg"," Cipla Ltd.","ANTIBIOTIC","1/03/2025",1,25,"Gentamicin","Cefotaxime"));
	medlist.add(new Medicines("Colistin  1 million units"," Glenmark Pharmaceuticals Ltd.","ANTIBIOTIC","02/02/2026",1,1697.02,"Polymyxin B","Barvoxinon z"));
	
	//type 2
	medlist.add(new Medicines("Amlodipine (Norvasc) 1 million units"," Pfizer.","ANTIHYPERTENSIVE","02/02/2026",1,18.75,"Alphamarta","Felodipine"));
	medlist.add(new Medicines("Lisinopril (Prinivil, Zestril) 250mg"," Pfizer.","ANTIHYPERTENSIVE","02/02/2026",1,51.48,"Enalapril","Benazepril"));
	medlist.add(new Medicines(" Losartan (Cozaar) 250mg"," Merck & Co.","ANTIHYPERTENSIVE","1/02/2036",1,26.9,"Telmisartan","'Valsartan"));
	medlist.add(new Medicines("Metoprolol (Lopressor, Toprol-XL 250mg"," AstraZeneca.","ANTIHYPERTENSIVE","1/02/2036",1,3.840,"Carvedilol","Bisoprolol"));
	medlist.add(new Medicines("Hydrochlorothiazide (Microzide) 250mg"," Watson Laboratories.","ANTIHYPERTENSIVE","02/02/2026",1,1597,"Chlorthalidone","Metoprolol"));
	medlist.add(new Medicines("Chlorthalidone (Thalitone) 250mg"," Lannett Company","ANTIHYPERTENSIVE","02/02/2026",1,87.42,"Atenolol","Bisoprolol"));
	medlist.add(new Medicines("Valsartan (Diovan) 250mg"," Novartis","ANTIHYPERTENSIVE","02/02/2026",1,4.00,"Indapamide","Metolazone"));
	medlist.add(new Medicines("Candesartan (Atacand) 250mg","  AstraZeneca.","ANTIHYPERTENSIVE","02/02/2026",1,2.50,"Valsartan","Telmisartan"));
	medlist.add(new Medicines("Irbesartan (Avapro)"," Pfizer.","Bristol-Myers Squibb","02/02/2026",1,2.70,"Losartan","Valsartan"));
	medlist.add(new Medicines("Propranolol (Inderal) ) 250mg"," Wyeth.","ANTIHYPERTENSIVE","3/04/2025",1,40.98,"Metoprolol","Atenolol"));
	medlist.add(new Medicines(",Carvedilol (Coreg)"," GlaxoSmithKliner.","ANTIHYPERTENSIVE","3/04/2025",1,1.91,"Nebivolol","Metoprolol"));
	medlist.add(new Medicines("Bisoprolol (Zebeta)","Duramed Pharmaceuticals .","ANTIHYPERTENSIVE","1/02/2036",1,4.2,"Carvedilol","Atenolol"));
	medlist.add(new Medicines("Ramipril 250mg"," Pfizer.","ANTIHYPERTENSIVE","02/02/2026",1,23.685,"Lisinopril","Perindopril"));
	medlist.add(new Medicines("Furosemide (Lasix)"," Sanofi .","ANTIHYPERTENSIVE","1/02/2036",1,1.198,"Bumetanide","Torsemide"));
	medlist.add(new Medicines("Spironolactone (Aldactone)250mg"," Pfizer.","ANTIHYPERTENSIVE","02/02/2026",1,55.67,"Amiloride","Triamterene"));
	medlist.add(new Medicines("Eplerenone (Inspra)"," Pfizer.","ANTIHYPERTENSIVE","02/02/2026",1,18.75,"Amiloride,","Spironolactone"));
	medlist.add(new Medicines("Clonidine (Catapres) 250mg"," Boehringer Ingelheim","ANTIHYPERTENSIVE","3/04/2025",1,7.75,"Guanfacine","Guanabenz"));
	medlist.add(new Medicines("Methyldopa (Aldomet)"," Pfizer.","ANTIHYPERTENSIVE","02/02/2026",1,15.8,"Clonidine","Guanfacine"));
	medlist.add(new Medicines("Hydralazine (Apresoline) 250mg"," Teva Pharmaceuticals.","ANTIHYPERTENSIVE","02/02/2026",1,29.28,"Nitroglycerin","Sodium Nitroprusside"));
	medlist.add(new Medicines("Nifedipine (Procardia) 250mg"," Pfizer.","ANTIHYPERTENSIVE","02/02/2026",1,3.25,"Amlodipine","Verapamil"));
	medlist.add(new Medicines("Verapamil (Calan, Verelan)) 250mg"," Pfizer.","ANTIHYPERTENSIVE","3/04/2025",1,18.75,"Diltiazem","Nif"));
	medlist.add(new Medicines("Lisinopril (Prinivil, Zestril) 250mg"," Pfizer.","ANTIHYPERTENSIVE","02/02/2026",1,12.50,"Nitroglycerin","Methyldopa"));
	
	
	//type3 
	medlist.add(new Medicines("Acetaminophen","Johnson & Johnson.","PAIN RELIEVERS","3/04/2025",1,125,"Aspirin","Ibuprofen","Naproxen"));
	medlist.add(new Medicines("Aspirin ","Bayer.","PAIN RELIEVERS","3/04/2025",1,3.15,"Acetaminophen","Ibuprofen","Naproxen"));
	medlist.add(new Medicines("Ibuprofen","Advil","PAIN RELIEVERS","1/02/2036",1,15.27,"Acetaminophen","Aspirin","Naproxen"));
	medlist.add(new Medicines("Naproxen","Aleve","PAIN RELIEVERS","3/04/2025",1,58.61,"Acetaminophen","Aspirin","Naproxen"));
	medlist.add(new Medicines("Celecoxib","Pfizer","PAIN RELIEVERS","1/02/2036",1,17.75,"Acetaminophen","Ibuprofen","Naproxen"));
	medlist.add(new Medicines("Diclofena"," Novartis","PAIN RELIEVERS","1/02/2036",1,0.75,"Hydrocodone", "Oxycodone","Morphine"));
	medlist.add(new Medicines("Fentanyl","Duragesic.","PAIN RELIEVERS","3/04/2025",1,8.90,"Acetaminophen"," Oxycodone","Tramadol"));
	medlist.add(new Medicines("Hydrocodone","Vicodin.","PAIN RELIEVERS","3/04/2025",1,6.52,"Acetaminophen","Aspirin","Naproxen"));
	medlist.add(new Medicines("Hydromorphone","Dilaudid.","PAIN RELIEVERS","3/04/2025",1,16.50,"Fentanyl", "Methadone","Oxycodone"));
	medlist.add(new Medicines("Methadone"," Dolophine.","PAIN RELIEVERS","3/04/2025",1,7,"Fentanyl", "Methadone","Oxycodone"));
	medlist.add(new Medicines("Morphine","Kadian.","PAIN RELIEVERS","3/06/2023",1,6.75,"Fentanyl", "Methadone","Oxycodone"));
	medlist.add(new Medicines("Oxycodone","OxyContin.","PAIN RELIEVERS","3/04/2025",1,35.0,"Hydrocodone", "Methadone","Oxycodone"));
	medlist.add(new Medicines("Tramadol"," Ultram.","PAIN RELIEVERS","3/04/2024",1,6,"Fentanyl", "Morphine","Oxycodone"));
	medlist.add(new Medicines("Codeine","Tylenol with Codeine.","PAIN RELIEVERS","3/04/2025",1,4.834,"Hydrocodone", "Oxycodone", "Tramadol"));
	medlist.add(new Medicines("Meperidine","Demerol","PAIN RELIEVERS","1/02/2036",1,35,"Fentanyl", "Hydrocodone"," Oxycodone"));
	medlist.add(new Medicines("Butalbita"," Fioricet","PAIN RELIEVERS","1/02/2036",1,68,"Pregabalin", "Carbamazepine", "Valproic Acid"));
	medlist.add(new Medicines("Gabapentin","Neurontin","PAIN RELIEVERS","04/12/2023",1,3.1,"Pregabalin","Aspirin"));
	medlist.add(new Medicines("Lidocaine","Lidoderm.","PAIN RELIEVERS","3/04/2025",1,120,"Bupivacaine", "Benzocaine", " Prilocaine"));
	medlist.add(new Medicines("Naproxen sodium","Anaprox","PAIN RELIEVERS","1/04/2024",1,1.75,"Acet",""));
	
	
	//type4
	medlist.add(new Medicines("Prozac (fluoxetine)","Eli Lilly and Company","ANTI DEPRESSANTS","1/04/2024",1,1.75,"Zoloft","sertraline"));
	medlist.add(new Medicines("Paxil (paroxetine)","GlaxoSmithKline","ANTI DEPRESSANTS","1/04/2024",1,1.75,"Effexor","venlafaxine"));
	medlist.add(new Medicines("Zoloft","Pfize","ANTI DEPRESSANTS","1/04/2024",1,1.75,"Lexapro","escitalopram"));
	medlist.add(new Medicines("Lexapro","Forest Laboratories","ANTI DEPRESSANTS","1/04/2024",1,1.75,"Zoloft","fluoxetine"));
	medlist.add(new Medicines("Effexor (venlafaxine)","Pfizer","ANTI DEPRESSANTS","1/04/2024",1,1.75,"duloxetine","Cymbalta"));
	medlist.add(new Medicines("Cymbalta (duloxetine)","Eli Lilly and Compan","ANTI DEPRESSANTS","1/04/2024",1,1.75,"Prozac","fluoxetine"));
	medlist.add(new Medicines("Celexa (citalopram)","Forest Laboratories","ANTI DEPRESSANTS","1/04/2024",1,1.75,"Symbalyo","citalopram"));
	medlist.add(new Medicines(",Wellbutrin","GlaxoSmithKline","ANTI DEPRESSANTS","1/04/2024",1,1.75,"Lexapro","escitalopram"));
	medlist.add(new Medicines("Remeron","Organon","ANTI DEPRESSANTS","1/04/2024",1,1.75,"Prozac","mirtazapine"));
	medlist.add(new Medicines("Luvox","Jazz Pharmaceuticals","ANTI DEPRESSANTS","1/04/2024",1,1.75,"sertraline","'Zoloft"));
	medlist.add(new Medicines("Pristiq","Pfizer","ANTI DEPRESSANTS","1/04/2024",1,1.75,"Effexor","venlafaxine"));
	medlist.add(new Medicines("Tofranil","Mallinckrodt Pharmaceuticals","ANTI DEPRESSANTS","1/04/2024",1,1.75,"citalopram","Celexa"));
	medlist.add(new Medicines("Elavil","Sandoz","ANTI DEPRESSANTS","1/04/2024",1,1.75,"citalopram","Squibb"));
	medlist.add(new Medicines("Prothiaden","Abbott Laboratories","ANTI DEPRESSANTS","1/04/2024",1,1.75,"Parnate","tranylcypromine"));
	medlist.add(new Medicines("Desyrel","Bristol-Myers Squibb","ANTI DEPRESSANTS","1/04/2024",1,1.75,"Nardil","phenelzine"));
	medlist.add(new Medicines("Nardil","Pfizer","ANTI DEPRESSANTS","1/04/2024",1,1.75,"isocarboxazid","Parnate"));
	medlist.add(new Medicines("Parnate","GlaxoSmithKline","ANTI DEPRESSANTS","1/04/2024",1,1.75,"Prozac","isocarboxazid"));
	medlist.add(new Medicines("Marplan","Validus Pharmaceuticals","ANTI DEPRESSANTS","1/04/2024",1,1.75,"Celexa","Zoloft"));
	medlist.add(new Medicines("Emsam","Somerset Pharmaceuticals","ANTI DEPRESSANTS","1/04/2024",1,1.75,"Celexa","Parnate"));
	medlist.add(new Medicines("Anafranil","Mallinckrodt Pharmaceuticals","ANTI DEPRESSANTS","1/04/2024",1,1.75,"Emsam","Desyrel"));
	
	
	
	
	

		

	}
	public static  Medicines findMed(List<Medicines>medlist) {
		Medicines med=new Medicines();
		System.out.println("Enter Medicine Name");
		med.medName=sc.nextLine();
		if(medlist.contains(med)) {
			int index = medlist.indexOf(med);
			Medicines medicine = medlist.get(index);
			return medicine;
		}
		return null;
	}

}
