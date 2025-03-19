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
                               #== 1 - Cadastrar Veiculo ======#
                               #== 2 - Retirar Veiculo ========#
                               #== 3 - Sair ===================#
                               #===============================#
                               """);
//          Coleta a Opção Inserida pelo Usuário
            opcao_menu = input.nextInt();
//          Switch Case
            switch(opcao_menu){
//              Opção 1 - Cadastrar Veículo
                case 1:
                    if (marca_veiculo.isEmpty()) {
                        System.out.println("#== CADASTRAR VEICULO NOVO ==#");
                    } else {
                        System.out.println("#== SOBREESCREVER VEICULO ==#");
                    }

                    System.out.println("Digite a marca do veículo:");
                    marca_veiculo = input.next();

                    System.out.println("Digite o modelo do veículo:");
                    modelo_veiculo = input.next();

                    System.out.println("Digite a cor do veículo:");
                    cor_veiculo = input.next();
                    
                    System.out.println("Digite a placa do veículo:");
                    placa_veiculo = input.next();
                    
                    System.out.println("Digite o horário de entrada (somente números inteiros):");
                    horario_entrada = input.nextInt();

                    System.out.println("Digite a localização da vaga:");
                    vaga_localizao = input.next();

                    System.out.println("\n### Dados do Veículo ###");
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
                    System.out.println("Programa Encerrado!");
                    return;

//              Opção Inválida - Encerrar Programa
                default :
                    System.out.println("Insira uma opção válida!");
            }
        }
    }
}
