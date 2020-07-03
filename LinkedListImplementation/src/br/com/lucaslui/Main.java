/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.lucaslui;

import java.io.IOException;
import java.util.Scanner;

/**
 *
 * @author lucas
 */
public class Main {

    public static void main(String[] args) throws IOException {
        
        MyLinkedList names = new MyLinkedList();

        Boolean isAppToClose = false;

        do {
            System.out.println("Escolha a operação que deseja fazer na lista encadeada de nomes:\n");
            System.out.println("1 - Incluir um nome na lista");
            System.out.println("2 - Consultar todos os nomes na lista");
            System.out.println("3 - Trocar um nome em determinada posição da lista");
            System.out.println("4 - Remover um nome");
            System.out.println("5 - Sair do programa");

            Scanner userInput = new Scanner(System.in);
                
            int option = Integer.parseInt(userInput.nextLine());
                           
            switch (option) {
                case 1:
                    System.out.println("Digite o nome que deseja incluir na lista:");
                    String name = userInput.nextLine();
                    names.append(name);
                    break;
                case 2:
                    System.out.println("Os nomes na lista são:\n");
                    for (int i = 0; i < names.getSize(); ++i) {
                        System.out.println("Index: " + i + " Value: " + names.get(i));
                    }
                    break;
                case 3:
                    System.out.println("Digite o indice do nome que deseja alterar:");
                    int indexToUpdateElement = Integer.parseInt(userInput.nextLine());
                    System.out.println("Digite o novo nome:");
                    String newName = userInput.nextLine();
                    names.set(newName, indexToUpdateElement);
                    break;
                case 4:
                    System.out.println("Digite o indice do nome que deseja remover:");
                    int indexToRemoveElement = Integer.parseInt(userInput.nextLine());
                    names.remove(indexToRemoveElement);
                    break;
                case 5:
                    isAppToClose = true;
                    break;
                default:
                    System.out.println("Opção inválida!");
            }
            
            if(isAppToClose == false)
                System.out.println("\nOperação realizada com sucesso!\n");
            
        } while (isAppToClose == false);
    }

}
