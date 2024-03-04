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
        return num1 / num2;
    }
    
    public static void usserInfo(){
        System.out.println("Bienvenido a la CALCULATOR");
        System.out.println("Digite el primer numero para suma");
        System.out.println("Digite el segundo numero para resta");
        System.out.println("Digite el tercer numero para multiplicacion");
        System.out.println("Digite el cuarto numero para divicion");
        
        int num1 = Integer.parseInt(JOptionPane.showInputDialog("Digite el numero 1"));
    }
    
    public static void main(String[] args) {
        usserInfo();
    }
}
