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
        String cnpjEmp, nomeEmp, nomeFunc, depFunc, dtaAdFunc;
        double slrFunc;
        int opcao = 1, numFunc;
        boolean val;
        ArrayList<Empresa> empresa = new ArrayList<Empresa>();
        ArrayList<String> depto = new ArrayList();
				
	while(opcao != 0){
            
            System.out.println("------------------------------------");
            System.out.println("1 - Adicionar Empresa \n"
                              +"2 - Adicionar Funcionários \n"
                              +"3 - Aumento por Departamento \n"
                              +"0 - Sair\n"
                              +"Digite: ");
            opcao = Integer.parseInt(ler.nextLine());
            
            switch(opcao){
                
                case 1:
                    
                    System.out.println("Informe o nome da empresa:");
                    nomeEmp = ler.nextLine();
					
                    System.out.println("Informe o cnpj da empresa:");
                    cnpjEmp = ler.nextLine();
                    
                    if (empresa.isEmpty() == true){
                        empresa.add(new Empresa(nomeEmp, cnpjEmp));
                    }else{
                        for(Empresa e : empresa){
                            if (e.getCnpj() == cnpjEmp){
                                System.out.println("Já existe um empresa cadastrada com o CNPJ informado!");
                                break;
                            }else{
                                empresa.add(new Empresa(nomeEmp, cnpjEmp));
                                
                            }                        
                        }                        
                    }        		
                    break;
                    
                case 2:
                    
                    if (empresa.isEmpty() == true){
                        System.out.println("Não existem empresas cadastradas!");
                        break;
                    }
                    
                    System.out.println("Informe o cnpj da empresa:");
                    cnpjEmp = ler.nextLine();
                    
                    val = false;
                    
                    for(Empresa e : empresa){
                        if (e.getCnpj() == cnpjEmp){
                            val = true;                                                    
                        }
                    }
                    
                    if (val == false){
                        System.out.println("Empresa sem cadastro!");
                        break;
                    }
                    
                    System.out.println("Informe o número de funcionários da empresa:");
                    numFunc = Integer.parseInt(ler.nextLine());

                    for (int i = 0; i < numFunc; i++){
                        System.out.println("Informe o nome do funcionário:");
                        nomeFunc = ler.nextLine();

                        System.out.println("Informe o departamento do funcionário:");
                        depFunc = ler.nextLine();
                        
                        System.out.println("Informe a data de admissão do funcionário:");
                        dtaAdFunc = ler.nextLine();
                        
                        System.out.println("Informe o salário do funcionário:");
                        slrFunc = ler.nextFloat();
                        ler.nextLine();
                        
                        for(Empresa e : empresa){
                            if (e.getCnpj() == cnpjEmp){
                                e.incluirFuncionario(new Funcionario(nomeFunc, slrFunc, dtaAdFunc, depFunc));
                            }
                        }
                    }
                    break;
                    
                case 3:
                    
                    if (empresa.isEmpty() == true){
                        System.out.println("Não existem empresas cadastradas!");
                        break;
                    }
                    
                    System.out.println("Informe o cnpj da empresa:");
                    cnpjEmp = ler.nextLine();
                    
                    val = false;
                    
                    for(Empresa e : empresa){
                        if (e.getCnpj() == cnpjEmp){
                            val = true;                                                    
                        }
                    }
                    
                    if (val == false){
                        System.out.println("Empresa sem cadastro!");
                        break;
                    }
                    
                    for(Empresa e : empresa){
                        if (e.getCnpj() == cnpjEmp){
                            depto = e.retornarDepartamento();
                        }
                    }
                    
                    System.out.println("Informe o departamento que receberá o aumento:");
                    depFunc = ler.nextLine();
                    
                    for(Empresa e : empresa){
                        if (e.getCnpj() == cnpjEmp){
                            e.aplicarAumento(depFunc);
                            System.out.println("Funcionários do departamento receberam aumento!");
                        }
                    }
                    break;
                
            }            
        }
    }
    
}
