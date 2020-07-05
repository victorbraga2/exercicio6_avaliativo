/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercicio6_avaliativo;
import java.util.Scanner;
/**
 *
 * @author User
 */
public class Exercicio6_avaliativo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Scanner result = new Scanner (System.in);
       double hora, turno;
       System.out.println("Digite que horas seu turno começou: ");
       hora = result.nextDouble();
       turno = result.nextDouble();
       
       if (hora > 0 && hora < 24)
       {
          hora = turno + 6;
          System.out.println("O seu horario de saída é: "+hora);
       }
       else
       {
       if (hora == 0)
       {
       hora = 0 + 6;
        System.out.println("O seu horario de saída é: "+hora);
       }
       }
    }
    
}
