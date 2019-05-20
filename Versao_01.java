package Itharya;

import java.util.Scanner;

public class Versao_01 {

    static Scanner leitor = new Scanner(System.in);

    public static void main(String[] args) {

        int escolhaMenu;
        String classe, personagem;

        // Castelo da História do jogo;
        System.out.println("\t\t  Bem vindo(a) à Itharya.");
        System.out.println("`,.      .   .        *   .    .      .  _    ..          .\n"
                + "     \\,~-.         *           .    .       ))       *    .\n"
                + "          \\ *          .   .   |    *  . .  ~    .      .  .  ,\n"
                + " ,           `-.  .            :               *           ,-\n"
                + "  -             `-.        *._/_\\_.       .       .   ,-'\n"
                + "  -                 `-_.,     |n|     .      .       ;\n"
                + "    -                    \\._/_,_\\_.  .          . ,'         ,\n"
                + "     -                    `-.|.n.|      .   ,-.__,'         -\n"
                + "      -                   ._/_,_,_\\_.    ,-'              -\n"
                + "      -                     |..n..|-`'-'                -\n"
                + "       -                 ._/_,_,_,_\\_.                 -\n"
                + "         -               ,-|...n...|                  -\n"
                + "           -         ,-'._/_,_,_,_,_\\_.              -\n"
                + "             -  ,-=-'     |....n....|              -\n"
                + "              -;       ._/_,_,_,_,_,_\\_.         -\n"
                + "             ,-          |.....n.....|          -\n"
                + "           ,;         ._/_,_,_,_,_,_,_\\_.         -\n"
                + "  `,  '.  `.  \".  `,  '.| n   ,-.   n |  \",  `.  `,  '.  `,  ',\n"
                + ",.:;..;;..;;.,:;,.;:,o__|__o !.|.! o__|__o;,.:;.,;;,,:;,.:;,;;:\n"
                + " ][  ][  ][  ][  ][  |_i_i_H_|_|_|_H_i_i_|  ][  ][  ][  ][  ][\n"
                + "                     |     //=====\\\\     |\n"
                + "                     |____//=======\\\\____|\n"
                + "                         //=========\\\\\n"
                + "------------------------------------------------------------------------------------");

        System.out.println("Antes de iniciar o jogo recomendamos que leia a história"); // Dica para o jogador

        System.out.println("\n1-Iniciar Jogo \n2-Ler a História do Jogo \n3-Créditos \n4-Sair"); // Opções do menu

        do {
            System.err.print("\nEscolha o número da opção desejada: ");
            escolhaMenu = leitor.nextInt();

            switch (escolhaMenu) {
                case 1:
                    System.out.println("------------------------------------------------------------------------------------"); //Designer
                    System.out.println("Mago: Por milhares de anos, Itharya deteve os maiores conhecimentos do mundo, agora que ela caiu. Posso conquista-los sem nenhuma resistência"); // Apresentação da classe mago
                    System.out.println("\nTemplário: Eu sou espada da Justiça! Somente eu posso acabar com a maldição de Itharya!"); // Apresentação da classe templário
                    do {
                        System.out.println("");
                        System.err.print("\nEscolha uma Classe (Saídas Mago ou Templário): "); //Escolha da classe 
                        classe = leitor.next();//Leitura da classe 

                        if (!classe.equals("Mago") && !classe.equals("mago") && !classe.equals("MAGO") && !classe.equals("Templário") && !classe.equals("Templario") && !classe.equals("templario") && !classe.equals("templário") && !classe.equals("TEMPLARIO") && !classe.equals("TEMPLÁRIO")) { // Verificar se o jogador não Digitou a classe errada. 

                            System.out.println("------------------------------------------------------------------------------------"); //Designer
                            System.out.println("Digite uma opção válida!"); // Mensagem caso a classe tenha sido errada
                        }

                    } while (!classe.equals("Mago") && !classe.equals("mago") && !classe.equals("MAGO") && !classe.equals("Templário") && !classe.equals("Templario") && !classe.equals("templario")
                            && !classe.equals("templário") && !classe.equals("TEMPLARIO") && !classe.equals("TEMPLÁRIO")); // Se o jogador digitar a clase errada, voltar para a parte que o mesmo Digita a clase.

                    System.out.println("------------------------------------------------------------------------------------"); //Designer
                    System.err.print("Digite o nome do Personagem: "); // Escolha do nome do personagem. 
                    personagem = leitor.next(); // Leitura do nome do Personagem

                    System.out.println("------------------------------------------------------------------------------------"); //Designer
                    System.out.println("INICIAR O JOGO COM A HISTÓRIA USANDO A CLASSE ESCOLHIDA E O NOME"); //Começo do jogo

                    break;

                case 2:
                    System.out.println(""
                            + "\nAs Lendas dizem que há muitos anos, uma entidade de luz, chamada Ohai,desceu do céu e escolheu uma cidade... "
                            + "\nEsta cidade se desenvolveu em todas as áreas, pois tudo que a luz tocava, crescia e florescia, assim, "
                            + "\nItharya foi considerada a Capital do Mundo, e os Itharyanos, foram considerados um povo evoluído, elevado."
                            + "\n\nMas a ganância do homem queria mais... "
                            + "\n\nOs Itharyanos pensaram que podiam aprisionar a luz, e assim alcançar a vida eterna. "
                            + "\nMas Ohai era muito poderosa, e puniu toda Itharya por essa afronta. Fez com que todas as águas fossem "
                            + "\nenvenenadas, toda terra secasse e deu vida eterna aos Itharyanos."
                            + "\n\nMas não como eles queriam..."
                            + "\n\nEles se tornaram amaldiçoados, vivendo uma vida de eterna dor e sofrimento."
                            + "\nPor fim, Ohai criou um gigante castelo, e disse que a maldição só desapareceria quando alguém conseguisse"
                            + "\nsuperar todos os desafios e chegar ao último andar. "
                            + "\n\nDepois se escondeu dentro do castelo, esperando todos que tivessem coragem de desafiar o Castelo. "
                            + "\nPor anos, pessoas de todos os reionos, tentaram, e fracassaram, e os Itharyanos,jazem sem esperanças..."); // O Texto é a história do jogo
                    System.out.println("------------------------------------------------------------------------------------"); //Designer

                    break;
                case 3:
                    System.out.println("Matheus\nDiego");

                    System.out.println("------------------------------------------------------------------------------------");
                    break;
                case 4:
                    System.out.println("------------------------------------------------------------------------------------"); //Designer
                    System.out.println("A Maldição ainda paira sobre Itharya... \nVocê saiu do jogo."); // Mensagem que aparece quando o jogador resolve sair
                    break;
                default:
                    System.out.println("Digite uma opção Válida");
                    break;
            }
        } while (escolhaMenu != 1 && escolhaMenu != 4);

    }
}