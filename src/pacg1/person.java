package pacg1;
import java.util.*; 

import javax.swing.JOptionPane;
public class person {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.out.println("sabah with java");
student a=new student();
a.sum(3, 99);
	}
	

}

 
  
 class Ppolynomial {
private ArrayList<Double> coeficient;
private ArrayList<Integer> power;
Ppolynomial(){
	coeficient= new ArrayList<Double>();
	power= new ArrayList<Integer>();
}


Ppolynomial (ArrayList<Double> coef, ArrayList<Integer>pow)
{ coeficient= new ArrayList<Double>();
power= new ArrayList<Integer>();

for (int i=0 ; i<coef.size();i++) {
	coeficient.add(i,coef.get(i));
}
for (int k=0 ; k<pow.size();k++) {
	power.add(k,pow.get(k));
}	


}

 public ArrayList<Double> getCoeficient() {
	 return coeficient;
	
 }
 
 
 public String getPolynomial() {
	 String X= " ";
	 for (int i=0;i<coeficient.size(); i++) {
		  if (power.get(i) ==0) {
			  X+= coeficient.get(i) ;
		  }
		  else if (power.get(i)==1){
			  X+= coeficient.get(i) + "X"; 
		  }
		  else {
		 X+= coeficient.get(i) + "X^" + power.get(i);}
	 }
	 return X;
 }
 
 public void showPolynomial() 
 {
	 JOptionPane.showMessageDialog(null, getPolynomial());
 }
 public boolean equals (Ppolynomial X) {
	 if (coeficient.size() != X.coeficient.size()) return false;
	 for (int i=0;i<coeficient.size(); i++) {
		 Double A1 = coeficient.get(i);
		 Double A2= X.coeficient.get(i);
		 int B1=power.get(i);
		 int B2=power.get(i);
		 if ((A1!=A2) || (B1!=B2))
				 return false;
	 }
	 return true; 
 }
 
 
 public Ppolynomial add(Ppolynomial X) {
	 int i=0;
	 int j=0;
	 double coef1, coef2, Ans_coef;
	 int Ans_exp;
	 
	 Ppolynomial poly_Ans= new Ppolynomial();
	 while (i!= coeficient.size() && j!= X.coeficient.size())
	
	 if (power.get(i)== X.power.get(j)) {
		  coef1= coeficient.get(i);
		  coef2= X.coeficient.get(j);
		  Ans_coef= coef1+coef2;
		  Ans_exp=power.get(i);
		 poly_Ans.coeficient.add(Ans_coef);
		 poly_Ans.power.add(Ans_exp);
		 i++; 
		 j++;}
	 
	 else if (power.get(i)> X.power.get(j)){
		 Ans_coef=coeficient.get(i);
		 Ans_exp= power.get(i);
		 poly_Ans.coeficient.add(Ans_coef);
		 poly_Ans.power.add(Ans_exp);
		 i++;
	 }
	 else if (power.get(i)< X.power.get(j)){
		 Ans_coef= X.coeficient.get(j);
		 Ans_exp= X.power.get(j);
		 poly_Ans.coeficient.add(Ans_coef);
		 poly_Ans.power.add(Ans_exp);
		 j++;
	 }
 
	 if (i!= coeficient.size()) {
		 for (int k=i; k< coeficient.size();k++) {
			 Ans_coef=coeficient.get(i);
			 Ans_exp= power.get(i);
			 poly_Ans.coeficient.add(Ans_coef);
			 poly_Ans.power.add(Ans_exp);
			
		 }
	 }
	 else if (j!= X.coeficient.size()) {
		 for (int k=i; k< X.coeficient.size();k++) {
			 Ans_coef= X.coeficient.get(j);
			 Ans_exp= X.power.get(j);
			 poly_Ans.coeficient.add(Ans_coef);
			 poly_Ans.power.add(Ans_exp);
		 }
	 }
	 return poly_Ans;
 }
 
 public Ppolynomial subtract(Ppolynomial X) {

	 int i=0;
	 int j=0;
	 double coef1, coef2, Ans_coef;
	 int Ans_exp;
	 
	 Ppolynomial poly_Ans= new Ppolynomial();
	 while (i!= coeficient.size() && j!= X.coeficient.size())
	
	 if (power.get(i)== X.power.get(j)) {
		  coef1= coeficient.get(i);
		  coef2= X.coeficient.get(j);
		  Ans_coef= coef1-coef2;
		  Ans_exp=power.get(i);
		 poly_Ans.coeficient.add(Ans_coef);
		 poly_Ans.power.add(Ans_exp);
		 i++; 
		 j++;}
	 
	 else if (power.get(i)> X.power.get(j)){
		 Ans_coef=coeficient.get(i);
		 Ans_exp= power.get(i);
		 poly_Ans.coeficient.add(Ans_coef);
		 poly_Ans.power.add(Ans_exp);
		 i++;
	 }
	 else if (power.get(i)< X.power.get(j)){
		 Ans_coef= -1 *X.coeficient.get(j);
		 Ans_exp= X.power.get(j);
		 poly_Ans.coeficient.add(Ans_coef);
		 poly_Ans.power.add(Ans_exp);
		 j++;
	 }
 
	 if (i!= coeficient.size()) {
		 for (int k=i; k< coeficient.size();k++) {
			 Ans_coef= coeficient.get(i);
			 Ans_exp= power.get(i);
			 poly_Ans.coeficient.add(Ans_coef);
			 poly_Ans.power.add(Ans_exp);
			
		 }
	 }
	 else if (j!= X.coeficient.size()) {
		 for (int k=i; k< X.coeficient.size();k++) {
			 Ans_coef= -1*X.coeficient.get(j);
			 Ans_exp= X.power.get(j);
			 poly_Ans.coeficient.add(Ans_coef);
			 poly_Ans.power.add(Ans_exp);
		 }
	 }
	 return poly_Ans;
 }
 
 public Ppolynomial Multiply (Ppolynomial X) {
	 int i=0;
	 int j=0;
	 double coef1, coef2,exp, Ans_coef;
	 int Ans_exp;
	 
	 Ppolynomial poly_Ans= new Ppolynomial();
	 for ( i=0; i<coeficient.size(); i++)
		for(j=0; j<X.coeficient.size(); j++) 
	 {
		  coef1= coeficient.get(i);
		  coef2= X.coeficient.get(i);
		  Ans_coef= coef1*coef2;
		  Ans_exp= power.get(i)+ X.power.get(i);
		  if (Ans_coef!= 0) {
			  poly_Ans.coeficient.add(Ans_coef);
				 poly_Ans.power.add(Ans_exp);}
		 }
	 
	 for (int k=0; k<poly_Ans.coeficient.size(); k++)
		 for (int z=k+1;z<poly_Ans.coeficient.size(); z++) {
			 
			 if (poly_Ans.power.get(k)== poly_Ans.power.get(z)) {
				  coef1=poly_Ans.coeficient.get(k);
				  coef2= poly_Ans.coeficient.get(z);
				  poly_Ans.coeficient.set(k, coef1+coef2);
				  poly_Ans.coeficient.remove(z);
				  poly_Ans.power.remove(z);
		 }
	 }
	return poly_Ans;} 
 


public static void main(String []args) {
	
    
	 ArrayList<Double> c= new ArrayList <Double>();
	 
	 c.add(0, 3.4);
	 c.add(1, 2.4);
	 c.add(2, 5.74);
	 
	 ArrayList<Integer> p=new ArrayList<Integer>();
	 p.add(0,0);
	 p.add(1,1);
	 p.add(2,2);
	 
	 Ppolynomial obj1= new Ppolynomial (c,p);
 ArrayList<Double> cc= new ArrayList <Double>();
	 
	 c.add(0, 3.4);
	 c.add(1, 2.4);
	 c.add(2, 5.74);
	 
	 ArrayList<Integer> pp=new ArrayList<Integer>();
	 p.add(0,0);
	 p.add(1,1);
	 p.add(2,2);
	 Ppolynomial obj2= new Ppolynomial (cc,pp);
	 Ppolynomial obj3= new Ppolynomial ();
     obj3= obj1.add(obj2);
     obj3.showPolynomial();



}
}






