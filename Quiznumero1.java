

package com.mycompany.quiznumero1;
import javax.swing.JOptionPane; 

public class Quiznumero1 {

    public static void main(String[] args) {
        //solicitar la cantidad de empleados 
        String Empleado = JOptionPane.showInputDialog("ingrese la cantidad de empleados");
        // solicitar el salario neto del empleado 
        String Salario = JOptionPane.showInputDialog("ingrese el salario del empleado");
        // convertir 
        int Empleados = Integer.parseInt (Empleado);
        double Salarios = Double.parseDouble(Salario);
        //solicitar el seguro de enfermedad y maternidad 
        double SeguroEyM = Salarios * 0.0925;
        //solicitar el seguro de vejez, invalidez y muerte 
        double InvalidezMuerte = Salarios * 0.0508;
        // la empresa debe de pagar 
        //resultado 
        double resultado = SeguroEyM + InvalidezMuerte; 
        
        JOptionPane.showMessageDialog(null, "la empresa debe de debera abonar a la CCSS el monto de": resultado);  
        
        
        
       
                
        
                
       
    
    }
}



//se basa en el salario N 
// salario individuales 
// calcular monto total a pagar aplicando brutos 