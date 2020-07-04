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

            double result = ExpressionSolver.Evaluate(expression);
            System.out.println(result);

            System.out.println("\nPressione qualquer tecla para continuar ou 5 para sair.\n");
            int userChoice = Integer.parseInt(userInput.nextLine());
            
        } while (isAppToClose == true);
    }

}
