package itharya;

import java.util.Random;
import java.util.Scanner;

public class Versao_03 {

    static Scanner leitor = new Scanner(System.in);

    public static void main(String[] args) {
        
        int escolhaMenu;

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

        do {
            System.out.println("\n1-Iniciar Jogo \n2-Ler a História do Jogo \n3-Créditos \n4-Sair"); // Opções do menu

            System.err.print("\nEscolha o número da opção desejada: ");
            escolhaMenu = leitor.nextInt();

            switch (escolhaMenu) {
                case 1:
                    escolha_do_Menu1(escolhaMenu);
                    break;
                case 2:
                    escolha_do_Menu2(escolhaMenu);
                    break;
                case 3:
                    escolha_do_Menu3(escolhaMenu);
                    break;
                case 4:
                    escolha_do_Menu4(escolhaMenu);
                    break;
                default:
                    System.out.println("Digite uma opção Válida");
                    break;
            }
        } while (escolhaMenu != 1 && escolhaMenu != 4);

    }

    static void escolha_do_Menu1(int escolhaMenu1) { // Se o jogador escolher a opção 1 do menu, é chamada essa função no Main, que inicia o jogo.

        int r1;
        String classe, personagem;

        System.out.println("------------------------------------------------------------------------------------");
        System.out.println("Mago: Por milhares de anos, Itharya deteve os maiores conhecimentos do mundo, agora que ela caiu. Posso conquista-los sem nenhuma resistência"); // Apresentação da classe mago
        System.out.println("\nTemplário: Eu sou espada da Justiça! Somente eu posso acabar com a maldição de Itharya!"); // Apresentação da classe templário
        do {
            System.out.println("");
            System.err.print("\nEscolha uma Classe (Saídas Mago ou Templário): "); //Escolha da classe 
            classe = leitor.next();//Leitura da classe 

            if (!classe.equals("Mago") && !classe.equals("mago") && !classe.equals("MAGO") && !classe.equals("Templário") && !classe.equals("Templario") && !classe.equals("templario") && !classe.equals("templário") && !classe.equals("TEMPLARIO") && !classe.equals("TEMPLÁRIO")) { // Verificar se o jogador não digitou a classe errada. 

                System.out.println("------------------------------------------------------------------------------------");
                System.out.println("Digite uma opção válida!"); // Mensagem caso a classe tenha sido errada
            }

        } while (!classe.equals("Mago") && !classe.equals("mago") && !classe.equals("MAGO") && !classe.equals("Templário") && !classe.equals("Templario") && !classe.equals("templario")
                && !classe.equals("templário") && !classe.equals("TEMPLARIO") && !classe.equals("TEMPLÁRIO")); // Se o jogador digitar a clase errada, voltar para a parte que o mesmo Digita a clase.

        System.out.println("------------------------------------------------------------------------------------");
        System.err.print("Digite o nome do Personagem: "); // Escolha do nome do personagem. 
        personagem = leitor.next(); // Leitura do nome do Personagem

        System.out.println("------------------------------------------------------------------------------------");
        System.out.println("INICIAR O JOGO COM A HISTÓRIA USANDO A CLASSE ESCOLHIDA E O NOME"); //Começo do jogo

        quizEContinuidadeDoJogo();
    }

    static void escolha_do_Menu2(int escolhaMenu1) { // Se o jogador escolher a opção 2 do menu, é chamada essa função no Main, que apresenta a história do jogo.

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
        System.out.println("------------------------------------------------------------------------------------");

    }

    static void escolha_do_Menu3(int escolhaMenu1) { // Se o jogador escolher a opção 3 do menu, é chamada essa função no Main, que apresenta os criadores do jogo.

        System.out.println("Matheus\nDiego");

        System.out.println("------------------------------------------------------------------------------------");
    }

    static void escolha_do_Menu4(int escolhaMenu1) { // Se o jogador escolher a opção 4 do menu, é chamada essa função no Main, e o jojo termina.

        System.out.println("------------------------------------------------------------------------------------");
        System.out.println("A Maldição ainda paira sobre Itharya... \nVocê saiu do jogo."); // Mensagem que aparece quando o jogador resolve sair
    }

    static String[] perguntas() { //Essa função reúne todos os desafios em um vetor 

        String[] perguntas = new String[]{"1 – Como converter um número decimal para hexadecimal?", // pergunta 0
            "2- Como representar o número 25987935 em binário?", // pergunta 1
            "3- Como representar o número 88975 em octal?", // pergunta 2
            "4– O que é um circuito lógico? (Escolha a alternativa correta)", // pergunta 3
            "5- Considerando que os valores a seguir estejam representados em binário, qual o resultado da soma 101010111 + 011011011 em decimal?", // pergunta 4
            "6- Considerando que os valores a seguir estejam representados em binário, qual o resultado da multiplicação 11011011011011011 * 01111111111101111 em decimal?", // pergunta 5
            "7- Qual a função da porta lógica OR?", // pergunta 6
            "8- Qual linguagem o computador entende?"}; // pergunta 7

        return perguntas;
    }

    static String[][] respostas() { // Essa função reúne todas as alternativas das perguntas em uma matriz
        String[][] matriz = new String[][]{
            {"a-) Para realizar a conversão é preciso dividir o número sucessivamente por 16 (base do sistema hexadecimal).", "b-) Para realizar a conversão é preciso dividir um número sucessivamente por 8 (base do sistema hexadecimal).", "c-) Para realizar a conversão é preciso dividir o número pela sua metade e multiplica-lo por 3, para assim chegar no seu valor hexadecimal.", "d-) É preciso usar um sistema binário, que tem como princípio dividir um número um número X por 2, até o seu resto ser igual a 1 ou 0."}, // alternativas da pergunta 0
            {"a-) 0011001100001111110101010", "b-) 1111110000000111111111111", "c-) 1100011001000101101011111 ", "d-) 1100111100001010110011001"}, // alternativas da pergunta 1 
            {"a-) 552131", "b-) 457151", "c-) 255617", "d-) 356173"}, // alternativas da pergunta 2
            {"a-) São dispositivos que operam um ou mais sinais lógicos de entrada para produzir somente uma saída.", "b-) São dispositivos que operam um ou mais sinais lógicos de entrada para produzir duas ou mais saídas. ", "c-) São dispositivos que operam um ou mais sinais lógicos de entrada para produzir saídas de valores baixos.", "d-) São dispositivos que operam um ou mais sinais lógicos de entrada para produzir saídas de valores altos."}, // alternativas da pergunta 3
            {"a-) 378", "b-) 410", "c-) 485", "d-) 562"}, // alternativas da pergunta 4
            {"a-) 8956723167", "b-) 7360863093", "c-) 5567314567", "d-) 5701698763"}, // alternativas da pergunta 5
            {"a-) É uma operação lógica entre dois operandos que resulta em um valor lógico verdadeiro somente se todos os operadores têm um valor verdadeiro.", "b-) É uma operação lógica entre dois ou mais operandos que resulta em um valor lógico falso se somente todos os operandos tiverem um valor falso", "c-) É uma porta lógica digital que implementa a negação lógica, de acordo com a tabela verdade", "d-) É uma porta lógica que inverte o resultado da saída (de acordo com a tabela verdade)"}, // alternativas da pergunta 6
            {"a-) Linguagem Hexadecimal ", "b-) Linguagem Octal", "c-) Linguagem Binária", "d-) Linguagem Decimal"}}; // alternativas da pergunta 7

        return matriz;
    }

    static int[] embaralhar() { // Essa função cria uma lista de números, com a quantidade de perguntas que eu tenho e embaralha esses números
        Random gerador = new Random();
        int a, b, temp;

        int[] numeros = new int[8]; // Numeros é um vetor e a função da variavel número é retornar uma lista com os números embaralhados.

        for (int i = 0; i < 8; i++) { // vai preencher o vetor número de 0 aé o valor que eu TIVER DE PERGUNTAS.
            numeros[i] = i;
        }

        for (int i = 0; i < 50; i++) { // embaralha os números do vetor
            a = gerador.nextInt(8);
            b = gerador.nextInt(8);
            if (a != b) {
                temp = numeros[a];
                numeros[a] = numeros[b];
                numeros[b] = temp;

            }

        }

        return numeros;

    }

    static void quizEContinuidadeDoJogo() { //Essa função irá chamar a história do jogo, e aqui vai mostrar se o jogador acertou ou errou os desafios. 

        String[] perguntasQuiz = perguntas(); // perguntasQuiz recebe os desafios da função pergunta
        String[][] respostasQuiz = respostas(); // respostasQuiz recebe as alternativas das perguntas que está na função respostas
        String escolha;
        int[] sequencia = embaralhar(); //Cria a variavel sequencia com os valores embaralhados da função embaralhar.

        for (int i = 0; i < 5; i++) { //*Os números já vão está embaralhados, com isso vou limitar quantas perguntas eu quero mostrar para o usuario

            /*
            if (i == 1){
                Historia_parte1 ();
                     
            }
            else if (i == 5){
               System.out.println("Pontuação,etc...");
               System.exit(0);
           }*/
            System.out.println(perguntasQuiz[sequencia[i]]); // PerguntasQuiz está recebendo o valor que está armazenado na posição 0 da variavel sequencia e assim consecutivamente

            for (int j = 0; j < 4; j++) {
                System.out.println(respostasQuiz[sequencia[i]][j]); //respostaQuiz vai receber sequencia [i][j] --> para apresentar todas as alternativas de respostas
            }

            System.err.print("Escolha a opção correta: "); // O usuario vai digitar a alternativa que ele considera ser a correta 
            escolha = leitor.next(); // a resposta ficará armazenada na variavel escolha

            switch (sequencia[i]) { // esse switch é responsável por localizar a pergunta que será feita ao usuario, enquanto os if e else são responsáveis de verificar se o usuario digitou a alternativa correta. 
                case 0:
                    if (escolha.equals("a")) {
                        System.out.println("Você acertou");
                    } else {
                        System.out.println("Você errou");
                    }
                    break;

                case 1:
                    if (escolha.equals("c")) {
                        System.out.println("Você acertou");
                    } else {
                        System.out.println("Você errou");
                    }
                    break;

                case 2:
                    if (escolha.equals("c")) {
                        System.out.println("Você acertou");
                    } else {
                        System.out.println("Você errou");
                    }
                    break;

                case 3:
                    if (escolha.equals("a")) {
                        System.out.println("Você acertou");
                    } else {
                        System.out.println("Você errou");
                    }
                    break;

                case 4:
                    if (escolha.equals("d")) {
                        System.out.println("Você acertou");
                    } else {
                        System.out.println("Você errou");
                    }
                    break;

                case 5:
                    if (escolha.equals("b")) {
                        System.out.println("Você acertou");
                    } else {
                        System.out.println("Você errou");
                    }
                    break;

                case 6:
                    if (escolha.equals("b")) {
                        System.out.println("Você acertou");
                    } else {
                        System.out.println("Você errou");
                    }
                    break;

                case 7:
                    if (escolha.equals("c")) {
                        System.out.println("Você acertou");
                    } else {
                        System.out.println("Você errou");
                    }
                    break;

            }
        }
    }
}

