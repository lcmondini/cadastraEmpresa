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
        String cnpjEmp, nomeEmp, nomeFunc, depFunc, dtaAdFunc, crgFunc;
        double slrFunc;
        int opcao = 1, numFunc;
        boolean val;
        ArrayList<Empresa> empresa = new ArrayList<Empresa>();
        ArrayList<String> depto = new ArrayList();
				
	while(opcao != 0){
            
            System.out.println("\n------------------------------------");
            System.out.println("1 - Adicionar Empresa \n"
                              +"2 - Adicionar Funcionários \n"
                              +"3 - Aumento por Departamento \n"
                              +"4 - Aumento Gerentes \n"
                              +"0 - Sair\n"
                              +"Digite: ");
            opcao = Integer.parseInt(ler.nextLine());
            
            switch(opcao){
                
                case 1:
                    
                    System.out.println("\nInforme o nome da empresa:");
                    nomeEmp = ler.nextLine();
					
                    System.out.println("\nInforme o cnpj da empresa:");
                    cnpjEmp = ler.nextLine();
                    
                    if (empresa.isEmpty() == true){
                        empresa.add(new Empresa(nomeEmp, cnpjEmp));
                    }else{
                        for(Empresa e : empresa){
                            if (e.getCnpj().equals(cnpjEmp)){
                                System.out.println("\nJá existe um empresa cadastrada com o CNPJ informado!");
                                break;
                            }else{
                                empresa.add(new Empresa(nomeEmp, cnpjEmp));
                                
                            }                        
                        }                        
                    }        		
                    break;
                    
                case 2:
                    
                    if (empresa.isEmpty() == true){
                        System.out.println("\nNão existem empresas cadastradas!");
                        break;
                    }
                    
                    System.out.println("\nInforme o cnpj da empresa:");
                    cnpjEmp = ler.nextLine();
                    
                    val = false;
                    
                    for(Empresa e : empresa){
                        if (e.getCnpj().equals(cnpjEmp)){                        
                            val = true;                                                    
                        }
                    }
                    
                    if (val == false){
                        System.out.println("\nEmpresa sem cadastro!");
                        break;
                    }
                    
                    System.out.println("\nInforme o número de funcionários da empresa:");
                    numFunc = Integer.parseInt(ler.nextLine());

                    for (int i = 0; i < numFunc; i++){
                        System.out.println("\nInforme o nome do funcionário:");
                        nomeFunc = ler.nextLine();

                        System.out.println("\nInforme o departamento do funcionário:");
                        depFunc = ler.nextLine();
                        
                        System.out.println("\nInforme o cargo do funcionário:");
                        crgFunc = ler.nextLine();
                        
                        System.out.println("\nInforme a data de admissão do funcionário:");
                        dtaAdFunc = ler.nextLine();
                        
                        System.out.println("\nInforme o salário do funcionário:");
                        slrFunc = ler.nextFloat();
                        ler.nextLine();
                        
                        for(Empresa e : empresa){
                            if (e.getCnpj().equals(cnpjEmp)){
                                if(crgFunc.equals("Gerente")){
                                    e.incluirFuncionario(new Gerente(nomeFunc, slrFunc, dtaAdFunc, depFunc, crgFunc));
                                }else if(crgFunc.equals("Analista")){
                                    e.incluirFuncionario(new Analista(nomeFunc, slrFunc, dtaAdFunc, depFunc, crgFunc));
                                }else if(crgFunc.equals("Tecnico")){
                                    e.incluirFuncionario(new Tecnico(nomeFunc, slrFunc, dtaAdFunc, depFunc, crgFunc));
                                }else{
                                    e.incluirFuncionario(new Funcionario(nomeFunc, slrFunc, dtaAdFunc, depFunc, crgFunc));
                                }
                            }
                        }
                    }
                    
                    System.out.println("\nFuncionários cadastrados:");
                    for(Empresa e : empresa){
                        if (e.getCnpj().equals(cnpjEmp)){
                            e.mostrarDados();
                        }
                    }
                    
                    break;
                    
                case 3:
                    
                    if (empresa.isEmpty() == true){
                        System.out.println("\nNão existem empresas cadastradas!");
                        break;
                    }
                    
                    System.out.println("\nInforme o cnpj da empresa:");
                    cnpjEmp = ler.nextLine();
                    
                    val = false;
                    
                    for(Empresa e : empresa){
                        if (e.getCnpj().equals(cnpjEmp)){
                            val = true;                                                    
                        }
                    }
                    
                    if (val == false){
                        System.out.println("\nEmpresa sem cadastro!");
                        break;
                    }
                    
                    for(Empresa e : empresa){
                        if (e.getCnpj().equals(cnpjEmp)){
                            depto = e.retornarDepartamento();
                        }
                    }
                    
                    System.out.println("Departamentos \n");
                    for(int i = 0; i < depto.size(); i++){
                        System.out.println((i + 1) + " - " + depto.get(i));
                    }
                    
                    System.out.println("\nInforme o departamento que receberá o aumento:");
                    depFunc = ler.nextLine();
                    
                    for(Empresa e : empresa){
                        if (e.getCnpj().equals(cnpjEmp)){
                            e.aplicarAumento(depFunc);
                            System.out.println("\nFuncionários do departamento receberam aumento!");
                        }
                    }
                    break;
                    
                case 4:
                    
                    if (empresa.isEmpty() == true){
                        System.out.println("\nNão existem empresas cadastradas!");
                        break;
                    }
                    
                    System.out.println("\nInforme o cnpj da empresa:");
                    cnpjEmp = ler.nextLine();
                    
                    val = false;
                    
                    for(Empresa e : empresa){
                        if (e.getCnpj().equals(cnpjEmp)){
                            val = true;                                                    
                        }
                    }
                    
                    if (val == false){
                        System.out.println("\nEmpresa sem cadastro!");
                        break;
                    }
                    
                    for(Empresa e : empresa){
                        if (e.getCnpj().equals(cnpjEmp)){
                            e.aplicarAumentoGer();
                            System.out.println("\nGerentes receberam aumento!");
                        }
                    }
                    
                    break;
            }            
        }
    ler.close();
    }
    
}
