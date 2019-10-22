/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package app;

import computersciencetools.Brain;
import computersciencetools.ChadaEval;
import computersciencetools.ChadaStepEvaluated;

/**
 *
 * @author Alfred ChadA
 */
public class Scientific {
    
    public double num1;
    public double num2;
    public double ans;
    public int trigon;
    
    public String operator;
    public Object math;
    
    
    public void footPrints(javax.swing.JTextField screen_sci, javax.swing.JTextField screen_sci_2, String sign) {
        if(! (screen_sci.getText().contains("-")  || screen_sci.getText().contains("+")
            || screen_sci.getText().contains("x") || screen_sci.getText().contains("÷") )){

            num1 =Double.parseDouble(screen_sci.getText());
            screen_sci.setText(null);
            operator = sign;

            String status = screen_sci_2.getText()+ sign;
            screen_sci_2.setText(status);
        }
    }
    
    public String evaluateExpression(String expression){

        ChadaStepEvaluated eval = new ChadaStepEvaluated(expression);

        ChadaEval calc = new ChadaEval(eval.getPostfixAsList());
            
        return calc.result().toString();
    }
    
    public String equal(String setNum2){
         
        num2 = Double.parseDouble(setNum2);

        if(operator == "+"){
            ans = num1 + num2;
           
        }else if(operator == "-"){
            ans = num1 - num2;
          
        }else if(operator == "x" ){
            ans = num1 * num2;
      
        }else if(operator == "/"){
            ans = num1 / num2;
        
        }else if(operator == "%"){
            ans = num1 % num2;
        }else{
            return "Err";
        }
        
        return String.format("%.2f", ans);  

    }
            
}
