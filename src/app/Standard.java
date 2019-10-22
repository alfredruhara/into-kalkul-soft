/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package app;

/**
 *
 * @author Cool_dev
 */
public class Standard {
    
    public double num1;
    public double num2;
    public double ans;
    public String operator;
    public Object math;
    
    public void deletezero(javax.swing.JTextField screen){
        
      String backspace= null;
        
       if(screen.getText().length() >= 3 && screen.getText().contains(".00") ){

            StringBuilder strtext = new StringBuilder(screen.getText());
            strtext.deleteCharAt(screen.getText().length() - 1);
            strtext.deleteCharAt(screen.getText().length() - 2);
            strtext.deleteCharAt(screen.getText().length() - 3);
            
            backspace=strtext.toString();
            screen.setText(backspace);

        }
    }
    
    public void assign(javax.swing.JTextField screen_std, String sign) {
        if(! (screen_std.getText().contains("-")  || screen_std.getText().contains("+")
            || screen_std.getText().contains("x") || screen_std.getText().contains("÷") )){

            num1 =Double.parseDouble(screen_std.getText());
            screen_std.setText(null);
            operator = sign;
        }
    }
        
    public String equal(String setNum2){
         
        num2 =Double.parseDouble(setNum2);

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
