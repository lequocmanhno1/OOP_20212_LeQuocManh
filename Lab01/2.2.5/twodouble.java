import javax.swing.JOptionPane;

public class twodouble {
    public static void main(String[] args){
        String strNum1, strNum2;
        strNum1 = JOptionPane.showInputDialog(null,
                "Please input the first number: ", "Input the first number",
                JOptionPane.INFORMATION_MESSAGE);
        double num1 = Double.parseDouble(strNum1);
        
        String Operator;
        Operator = "+-*/:x";
        
        String op;
        do {
        op = JOptionPane.showInputDialog(null, "Please input operator ", "Input operator: ", JOptionPane.INFORMATION_MESSAGE);
        } while (Operator.indexOf(op) == -1 ); 
        
        double num2;
        strNum2 = JOptionPane.showInputDialog(null,
    		  		"Please input the second number: ", "Input the second number",
    		  		JOptionPane.INFORMATION_MESSAGE);
        num2 = Double.parseDouble(strNum2);
        
    	while ((op.equals("/") == true || op.equals(":")) && num2 == 0) {
    		strNum2 = JOptionPane.showInputDialog(null, 
    				"Cannot devine by zero ", "Input the second number", 
    				JOptionPane.INFORMATION_MESSAGE);
    		num2 = Double.parseDouble(strNum2);
    	}
    	   
    	switch(op) {
    	   case "+":    
    		   	JOptionPane.showMessageDialog(null,num1 + op + num2 + " = " + (num1 + num2),
    		   			"Result", JOptionPane.INFORMATION_MESSAGE);
    		   	break;
    	   case "-":    
   		   		JOptionPane.showMessageDialog(null,num1 + op + num2 + " = " + (num1 - num2),
   		   				"Result", JOptionPane.INFORMATION_MESSAGE);
   		   		break;
    	   case "*":
    	   case "x":
   		   		JOptionPane.showMessageDialog(null,num1 + op + num2 + " = " + (num1 * num2),
   		   				"Result", JOptionPane.INFORMATION_MESSAGE);
   		   		break;
    	   case "/":
    	   case ":":
   		   		JOptionPane.showMessageDialog(null,num1 + op + num2 + " = " + (num1 / num2),
   		   				"Result", JOptionPane.INFORMATION_MESSAGE);
   		   		break;
    	   }
        System.exit(0);
    }
}