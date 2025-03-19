package sistema_estacionamento;
import java.util.Scanner;

public class Sistema_Estacionamento {
    public static void main(String[] args) {

//      Criando Scanner
        Scanner input = new Scanner(System.in); 

//      Declarando variáveis do tipo inteiras
        int opcao_menu, horario_entrada, horario_saida, horario_final, valor_estacionamento_por_hora, valor_estacionamento_final;

//      Declarando variáveis do tipo String
        String marca_veiculo = "", modelo_veiculo, cor_veiculo, placa_veiculo, vaga_localizao, consultar_placa;

        
//      Laço de Repetição que Contém o Menu de Opções
        while(true){
//          Menu de Opções
            System.out.println("""
                               #========== BEM VINDO ==========#
                               #===============================#
                               #===== SELECIONE UMA OPÇÃO =====#
                               #== 1 - Cadastrar veiculo ======#
                               #== 2 - Retirar veiculo ========#
                               #== 3 - Sair ===================#
                               #===============================#
                               """);
//          Coleta a Opção Inserida pelo Usuário
            opcao_menu = input.nextInt();
//          Switch Case
            switch(opcao_menu){
//              Opção 1 - Cadastrar Veículo
                case 1:
//                  Verifica se Existe Algum Veículo no Pátio
                    if (marca_veiculo.isEmpty()) {
                        System.out.println("#== CADASTRAR VEICULO NOVO ==#");
                    } else {
                        System.out.println("#== SOBREESCREVER VEICULO ==#");
                    }
//                  Marca do Veículo
                    System.out.println("Digite a marca do veículo:");
                    marca_veiculo = input.next();
//                  Modelo do Veículo
                    System.out.println("Digite o modelo do veículo:");
                    modelo_veiculo = input.next();
//                  Cor do Veículo
                    System.out.println("Digite a cor do veículo:");
                    cor_veiculo = input.next();
//                  Placa do Veículo                    
                    System.out.println("Digite a placa do veículo:");
                    placa_veiculo = input.next();
//                  Horário de Entrada do Veículo                    
                    System.out.println("Digite o horário de entrada:");
                    horario_entrada = input.nextInt();
//                  Verifica Horário Inserido                    
                    while (horario_entrada < 0 || horario_entrada >= 24) {
                        System.out.println("Digite um horário válido (entre 0 e 23):");
                        horario_entrada = input.nextInt();
                    }
//                  Localização da Vaga onde o Veículo Estacionou
                    System.out.println("Digite a localização da vaga:");
                    vaga_localizao = input.next();
//                  Exibe os Dados Coletados
                    System.out.println("\n#== Dados do Veículo ==#");
                    System.out.println("Marca: " + marca_veiculo);
                    System.out.println("Modelo: " + modelo_veiculo);
                    System.out.println("Cor: " + cor_veiculo);
                    System.out.println("Placa: " + placa_veiculo);
                    System.out.println("Horário de Entrada: " + horario_entrada + ":00");
                    System.out.println("Localização da Vaga: " + vaga_localizao);
                    break;

//              Opção 2 - Retirar Veículo
                case 2:
                    System.out.println("#== REMOVER VEICULO DO PÁTIO ==#");
                    System.out.println("Digite a placa do veiculo");
                    consultar_placa = input.next();
                    break;

//              Opção 3 - Encerrar Programa                    
                case 3:
                    System.out.println("Programa encerrado!");
                    return;

//              Opção Inválida - Encerrar Programa
                default :
                    System.out.println("Insira uma opção válida!");
            }
        }
    }
}
