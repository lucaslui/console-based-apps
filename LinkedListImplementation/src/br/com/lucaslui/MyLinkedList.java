/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.lucaslui;

/**
 *
 * @author lucas
 */
public class MyLinkedList {

    private Node head; // cria um nó com valor inicial nulo.
    private int size;  // cria uma variável com valor inicial 0 para ser o tamanho da list

    // método construtor para acesso ao número de elementos na lista
    public int getSize() {
        return size;
    }

    // método que adiciona um novo elemento na lista
    public void append(Object data) {
        size++;
        // se for o primeiro elemento
        if (head == null) {
            head = new Node();

            head.data = data;
            head.next = null;
        } else { // se for outro elemento
            Node new_node = new Node();
            new_node.data = data;

            // sempre começa do nó cabeça e percorre toda lista através dos atributos next 
            // onde fica os endereços dos próximos nós
            Node current_node = head;
            while (current_node.next != null) {
                current_node = current_node.next;
            }
            current_node.next = new_node; // adiciona o nó no atributo de endereçamento do nó anterior
        }
    }

    public void set(Object data, int position) {
        if (position > size - 1) {
            throw new IndexOutOfBoundsException();
        } else {
            // sempre começa do nó cabeça e percorre toda lista através dos atributos next 
            // onde fica os endereços dos próximos nós
            Node current_node = head;
            for (int i = 0; i < position; ++i) {
                current_node = current_node.next;
            }
            current_node.data = data;
        }
    }

    public Object get(int position) {
        if (position > size - 1) {
            throw new IndexOutOfBoundsException();
        } else {
            // sempre começa do nó cabeça e percorre toda lista através dos atributos next 
            // onde fica os endereços dos próximos nós
            Node current_node = head;
            for (int i = 0; i < position; ++i) {
                current_node = current_node.next;
            }
            return current_node.data; // retorna o valor que estava no elemento da posição desejada
        }
    }

    public void remove(int position) {
        if (position > size - 1) {
            throw new IndexOutOfBoundsException();
            //throw new System.ArgumentException("Position wrong!");
        } else if (position == 0) { // se for o primeiro
            head = head.next;
        } else if (position == size - 1) { // se for o ultimo elemento
            Node before_node = head;
            for (int i = 0; i < position - 1; ++i) {
                before_node = before_node.next;
            }
            before_node.next = null;
        } else { // caso seja um elemento intermediário
            Node before_node = head;
            for (int i = 0; i < position - 1; ++i) {
                before_node = before_node.next;
            }

            Node after_node = head;
            for (int i = 0; i < position + 1; ++i) {
                after_node = after_node.next;
            }
            before_node.next = after_node;
        }
        size--;
    }
}
