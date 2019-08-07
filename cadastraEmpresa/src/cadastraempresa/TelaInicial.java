/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cadastraempresa;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author 201720091
 */
public class TelaInicial {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner ler = new Scanner(System.in);        
        String cnpjEmp, nomeEmp;
        int opcao = 1;
        ArrayList<Empresa> empresa = new ArrayList<Empresa>();
		
	System.out.println("Informe o nome da Empresa:");
        nomeEmp = ler.nextLine();
	System.out.println("Informe o CNPJ da Empresa:");	
	cnpjEmp = ler.nextLine();
				
	while(opcao != 0){
            
            switch(opcao){
                
            }            
        }
    }
    
}
