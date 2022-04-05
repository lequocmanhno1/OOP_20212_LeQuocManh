// phuong trinh ax+b= 0 (a != 0)

public class LinearEquation {
	double a,b;
	public String solve() {
		if(a==0){
			return "a cannot be 0";
		}else{
			return "x= "+(-b)/a;
		    }
	}
}
