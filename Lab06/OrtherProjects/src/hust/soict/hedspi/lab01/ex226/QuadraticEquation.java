package hust.soict.hedspi.lab01.ex226;

// Phuong trinh bac hai 1 an ax^2 + bx + c = 0
import java.lang.Math;
public class QuadraticEquation {
	double a,b,c;
	public String solve() {	
		double denta = b*b -4*a*c;
		if (denta == 0) return "Equation has double roots"  + -b/(2*a);
		if (denta > 0) return "Equation has two distint roots: " + (-b+Math.sqrt(denta))/(2*a)  + " and "  + (-b-Math.sqrt(denta))/(2*a);
		if (denta < 0) return "Equation has no solution.";
		return "";
	}
}
