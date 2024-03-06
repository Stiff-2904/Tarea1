package com.mycompany.tarea1;

import javax.swing.JOptionPane;

public class Calculator {

    public static int sum(int num1, int num2){
        return num1 + num2;
    }
    
    public static int rest(int num1, int num2){
        return num1 - num2;
    }
    
    public static int multi(int num1, int num2){
        return num1 * num2;
    }
    
    public static float divid(int num1, int num2){
        
        if(num2 != 0) {
            return (float)num1 / num2;
        } else {
            JOptionPane.showMessageDialog(null, "No se puede dividir entre 0");
            return Float.NaN;
        }
        
    }
    
    public static void userInfo(){
         JOptionPane.showMessageDialog(null, "Bienvenido a la CALCULATOR\nBy Stiff");
         
        int option, number1, number2;
        
        do {
            JOptionPane.showMessageDialog(null, "1. Sumar.\n2. Restar.\n3. Multiplicar.\n4. Dividir.\n0. Salida del programa.");
        
            option = Integer.parseInt(JOptionPane.showInputDialog("Seleccione una opción"));
            
            if (option != 0) {
                number1 = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el número 1"));
                number2 = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el número 2"));
                
                switch(option) {
                    case 1:
                        JOptionPane.showMessageDialog(null, "El resultado es: " + sum(number1, number2));
                        break;
                    case 2:
                        JOptionPane.showMessageDialog(null, "El resultado es: " + rest(number1, number2));
                        break;
                    case 3:
                        JOptionPane.showMessageDialog(null, "El resultado es: " + multi(number1, number2));
                        break;
                    case 4:
                        JOptionPane.showMessageDialog(null, "El resultado es: " + divid(number1, number2));
                        break;
                    default:
                        JOptionPane.showMessageDialog(null, "Opción no válida");
                }
            }
            
        } while (option != 0);
    }
    
    public static void main(String[] args) {
        userInfo();
    }
}
