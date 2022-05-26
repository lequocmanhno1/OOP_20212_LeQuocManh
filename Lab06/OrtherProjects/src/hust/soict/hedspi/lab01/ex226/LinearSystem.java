package hust.soict.hedspi.lab01.ex226;

// he phuong trinh bac nhat 2 an
public class LinearSystem {
	double a11, a12, b1;
	double a21, a22, b2;
	public String solve() {
		double D = a11*a22 - a21*a12;
		double D1 = b1*a22 - b2*a12;
		double D2 = a11*b2 - a21*b1;
		if(D==0){
            if(D1==0 && D2==0) return "Infinite solution";
            else return "No solution";
        }else{
            return "System has unique solution (x1,x2)= ("+D1/D +"," + D2/D +")";
        }
	}
}
