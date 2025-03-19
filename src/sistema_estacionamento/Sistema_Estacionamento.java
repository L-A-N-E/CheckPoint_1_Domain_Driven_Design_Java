// Pacote Principal
package sistema_estacionamento;

// Importando Dependências
import java.util.Scanner;

public class Sistema_Estacionamento {
    // Função Principal
    public static void main(String[] args) {
        // Criando Scanner
        Scanner input = new Scanner(System.in);

        // Declarando variáveis do tipo inteiro
        int opcao_menu, opcao_alt, horario_entrada = 0, horario_saida = 0, horario_final = 0, valor_estacionamento = 0;

        // Declarando variáveis do tipo String
        String marca_veiculo = "", modelo_veiculo = "", cor_veiculo = "", placa_veiculo = "", vaga_localizao = "", danos_veiculo = "", consultar_placa = "";

        // Laço de Repetição que Contém o Menu de Opções
        while (true) {
            // Menu de Opções
            System.out.println("""
                    #===============================#
                    #===== SELECIONE UMA OPÇÃO =====#
                    #== 1 - Registrar Veículo ======#
                    #== 2 - Editar Registro ========#
                    #== 3 - Imprimir Comprovante ===#
                    #== 4 - Consultar Lotação ======#
                    #== 5 - Retirar Veículo ========#
                    #== 6 - Sair ===================#
                    #===============================#
                    """);

            // Coleta a Opção Inserida pelo Usuário
            opcao_menu = input.nextInt();

            // Switch Case
            switch (opcao_menu) {
                // Opção 1 - Registrar Veículo
                case 1:
                    // Verifica se Existe Algum Veículo no Pátio
                    if (placa_veiculo.isEmpty()) {
                        // Cadastrando um Veículo Novo
                        System.out.println("#== Registrar VEICULO NOVO ==#");
                        // Marca do Veículo
                        System.out.println("Digite a marca do veículo:");
                        marca_veiculo = input.next();
                        // Modelo do Veículo
                        System.out.println("Digite o modelo do veículo:");
                        modelo_veiculo = input.next();
                        // Cor do Veículo
                        System.out.println("Digite a cor do veículo:");
                        cor_veiculo = input.next();
                        // Placa do Veículo                    
                        System.out.println("Digite a placa do veículo:");
                        placa_veiculo = input.next();
                        // Localização da Vaga onde o Veículo Estacionou
                        System.out.println("Digite a localização da vaga:");
                        vaga_localizao = input.next();
                        // Pergunta se há danos no Veículo
                        System.out.println("Há danos no carro (riscos, batidas, etc)? [Sim/Não]:");
                        danos_veiculo = input.next();
                        // Horário de Entrada do Veículo                    
                        System.out.println("Digite o horário de entrada (entre 0 e 23):");
                        horario_entrada = input.nextInt();

                        // Verifica Horário Inserido                    
                        while (horario_entrada < 0 || horario_entrada >= 24) {
                            System.out.println("Horário Inválido!");
                            System.out.println("Digite um horário válido (entre 0 e 23):");
                            horario_entrada = input.nextInt();
                        }
                    } else {
                        System.out.println("Sem espaço no B.D.");
                    }
                    break;

                // Opção 2 - Editar Registro
                case 2:
                    // Editando registro
                    // Verifica se há algum registro
                    if(!(placa_veiculo.isEmpty())){
                        System.out.println("#== Editar Registro ==#");
                        System.out.println("""
                            #======= Editar Registro =======#
                                Qual campo deseja alterar?
                                    1 - Marca
                                    2 - Modelo
                                    3 - Cor
                                    4 - Placa
                                    5 - Localização da Vaga
                                    6 - Há Danos no Veículo?
                                    7 - Horário de Entrada
                            """);                    
                        opcao_alt = input.nextInt();

                        // Switch para selecionar qual campo editar
                        switch (opcao_alt) {
                            case 1:
                                // Editando Marca do Veículo
                                System.out.println("Digite a nova marca do veículo:");
                                marca_veiculo = input.next();
                                break;
                            case 2:
                                // Editando Modelo do Veículo
                                System.out.println("Digite o novo modelo do veículo:");
                                modelo_veiculo = input.next();
                                break;
                            case 3:
                                // Editando Cor do Veículo
                                System.out.println("Digite a nova cor do veículo:");
                                cor_veiculo = input.next();
                                break;
                            case 4:
                                // Editando Placa do Veículo                    
                                System.out.println("Digite a nova placa do veículo:");
                                placa_veiculo = input.next();
                                break;
                            case 5:
                                // Editando a Localização da Vaga
                                System.out.println("Digite a nova localização da vaga:");
                                vaga_localizao = input.next();
                                break;
                            case 6:
                                // Editando se há danos no Veículo
                                System.out.println("Há danos no carro (riscos, batidas, etc)? [Sim/Não]:");
                                danos_veiculo = input.next();
                                break;
                            case 7:
                                // Editando o Horário de Entrada do Veículo                    
                                System.out.println("Digite o novo horário de entrada (entre 0 e 23):");
                                horario_entrada = input.nextInt();
                                // Verifica Horário Inserido                    
                                while (horario_entrada < 0 || horario_entrada >= 24) {
                                    System.out.println("Horário Inválido!");
                                    System.out.println("Digite um horário válido (entre 0 e 23):");
                                    horario_entrada = input.nextInt();
                                }
                                break;
                            default:
                                // Mostrando mensagem de inválido
                                System.out.println("Opção Inválida.");
                                break;
                        }
                    }else{
                        System.out.println("Não há veículos registrados.");
                    }
                    
                    break;

                // Opção 3 - Imprimir Comprovante 
                case 3:
                    // Imprime o Comprovante com os Dados do Veículo 
                    if(!(placa_veiculo.isEmpty())){
                        System.out.println("#== COMPROVANTE ==#");
                        // Exibe os Dados Coletados
                        System.out.println("Marca: " + marca_veiculo + "\nModelo: " + modelo_veiculo + "\nCor: " + cor_veiculo
                                            + "\nPlaca: " + placa_veiculo + "\nHorário de Entrada: " + horario_entrada + ":00" + "\nLocalização da Vaga: " + vaga_localizao
                                            + "\nHá Danos no Veículo? " + danos_veiculo);
                    }else{
                        System.out.println("Não há veículos registrados.");
                    }
                
                    break;

                // Opção 4 - Consultar Lotação
                case 4:
                    // Consulta quantos carros há registrados
                    if(placa_veiculo.isEmpty()){
                        // Caso não haja registro
                        System.out.println("Lotação: 0/1");
                    }else{
                        // Caso haja registro
                        System.out.println("Estacionamento Cheio!\nLotação: 1/1");
                    }

                    break;
                // Opção 5 - Retirar Veículo
                case 5:
                    // Retirando Veículo do Estacionamento
                    if(!(placa_veiculo.isEmpty())){
                        // Caso não haja registro
                        System.out.println("#== Retirando Veículo ==#");
                        // Buscando pela placa                   
                        System.out.println("Digite a placa do veículo:");
                        consultar_placa = input.next();

                        // Verifica se o carro possuí a mesma placa
                        if(consultar_placa.equals(placa_veiculo)){
                            // Caso hja veículo com a placa digitada
                            // Horário de Saída do Veículo                    
                            System.out.println("Digite o horário de saida (entre 0 e 23):");
                            horario_saida = input.nextInt();

                            // Verifica Horário Inserido                    
                            while (horario_saida < 0 || horario_saida >= 24 || horario_saida < horario_entrada) {
                                System.out.println("Horário Inválido!");
                                System.out.println("Digite um horário válido (entre 0 e 23):");
                                horario_saida = input.nextInt();
                            }

                            // Calculando quantas horas o carro ficou estacionado
                            horario_final = horario_saida - horario_entrada;
                            // Calculando o preço do estacionamento
                            valor_estacionamento = horario_final * 15;

                            // Mostrando os dados do carro com o valor a ser pago
                            System.out.println("#== Dados Veículo ==#");
                            // Exibe os Dados Coletados
                            System.out.println("Marca: " + marca_veiculo + "\nModelo: " + modelo_veiculo + "\nCor: " + cor_veiculo
                                                + "\nPlaca: " + placa_veiculo + "\nLocalização da Vaga: " + vaga_localizao
                                                + "\nHá Danos no Veículo? " + danos_veiculo + "\nHorário de Entrada: " + horario_entrada + ":00" 
                                                + "\nHorário de Saída: " + horario_saida + ":00" + "\nValor do Estacionamento: R$ " + valor_estacionamento);

                            // Excluindo Dados do carro
                            marca_veiculo = ""; modelo_veiculo = ""; cor_veiculo = ""; placa_veiculo = ""; vaga_localizao = ""; danos_veiculo = "";
                            horario_entrada = 0; horario_saida = 0; valor_estacionamento = 0;

                        }else{
                            // Caso não haja veículo com a placa digitada
                            System.out.println("Não há veículo com essa placa.");
                        }
                    }else{
                        // Caso haja registro
                        System.out.println("Não há veículos registrados.");
                    }

                    break;
                // Opção 6 - Sair
                case 6:
                    System.out.println("Programa encerrado!");
                    return;

                // Opção Inválida
                default:
                    System.out.println("Opção inválida! Tente novamente.");
            }
        }
    }
}
