
package com.mycompany._for;

import java.util.Scanner;


public class _FOR {

    public static void main(String[] args) {
    
        
      
       
       Scanner teclado = new Scanner(System.in);
       
       System.out.println("ATIVIDADE 1\n");
        System.out.println("Digite um número:");
       int num1 = teclado.nextInt();
        System.out.println("Os números íapares até chegar nele são:\n");
       for (int a = 1; a < num1 ; a += 2){
           System.out.println(a);
           
       }
         
       
       /////////////////////////////////////////////////////////////////
       
       
       Scanner teclado2 = new Scanner(System.in);
        System.out.println("\n\nATIVIDADE 2\n");
        System.out.println("Digite o total de tentativas:");
        int num2 = teclado2.nextInt();
       
        System.out.println("Agora descubra qual é o intervalo:");
        for(int b = 0; b < num2; b +=1){
            
            int y = teclado2.nextInt();
            
            if(y >= 10 && y <= 20){
                System.out.println("Este número está dentro do intervalo");
                
            }
            else{
                System.out.println("Este número está fora do intervalo");
                
            
            
        }}
        
            
      
       
       
       
       
       
       ////////////////////////////////////////////////////////////////
       
       
        Scanner teclado3 = new Scanner(System.in);
       System.out.println("\n\nATIVIDADE 3\n");    
        
        System.out.println("\nDigite quantas provas você tem em mão:");
        int num3 = teclado3.nextInt();
        double soma = 0;
      
        for(int i = 0; i < num3; i += 1){
            System.out.printf("Agora escreva a nota da prova de número %d:\n",i + 1);
            double x = teclado3.nextDouble();
           
            soma += x;
            
            
        }
        soma /= num3;
        System.out.printf("A média das provas é: %.1f",soma);
      
     

       //////////////////////////////////////////////////////////////////////////
       
       Scanner teclado4 = new Scanner(System.in);
        System.out.println("\n\nATIVIDADE 4\n");
       System.out.println("Digite a quantidade de pares que você quer dividir:");
       int num4 = teclado4.nextInt();
       double numero2;
       double  soma1=0;
    
       
        
       for(int z = 0; z < num4; z += 1){
       
           System.out.printf("\n\nAgora escreva o dividendo do par número %d:\n",z + 1);
           double numero = teclado4.nextDouble();
           System.out.printf("\nAgora o divisor do par número %d\n ",z + 1);
           numero2 = teclado4.nextDouble();
           
           soma1 = numero; 
           if(numero2 <= 0){  
            System.out.println("Divisão impossível");
                
            
           }
            else{
              
              soma1 /= numero2;  
            
              System.out.println("O resultado é: "+ soma1);
              
            }
           
       }
        
 
       
       
    }
}
