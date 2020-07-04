/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.lucaslui;

import java.util.Scanner;

/**
 *
 * @author lucas
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Boolean isAppToClose = false;
                
        do {
            Scanner userInput = new Scanner(System.in);
            
            System.out.println("Digita a expressão desejada:");
            String expression = userInput.nextLine();

            double result = ExpressionSolver.evaluate(expression);
            System.out.println("O resultado é: " + result);

            System.out.println("\nDigital 1 para continuar no programa ou 2 para sair.\n");
            int userChoice = Integer.parseInt(userInput.nextLine());
            
            if(userChoice == 2){
                isAppToClose = true;
            }
            
        } while (isAppToClose == false);
    }

}
