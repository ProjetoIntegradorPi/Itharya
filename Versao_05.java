package itharya;

import java.util.Random;
import java.util.Scanner;

public class Versao_05 {

    static Scanner leitor = new Scanner(System.in);

    public static void main(String[] args) {
        
        Controle ();

    }
    
    static void Controle (){
        int escolhaMenu;

        // Castelo da História do jogo;
        System.out.println("\t\t  Bem vindo(a) à Itharya.");
         System.out.println (" "
+"                           *\n" +
"                            :\n" +
"                            |\n" +
"                            |\n" +
"                            |\n" +
"                           :|:\n" +
"                           |||\n" +
"                      _____|||_____\n" +
"                     /=============\\\n" +
"                 ---<~~~~~~~~~~~~~~~>---\n" +
"                     \\-------------/\n" +
"                      \\___________/\n" +
"                        \\||:::||/\n" +
"                         ||:::||\n" +
"                         ||:::||\n" +
"                         ||:::||\n" +
"                         ||ooo||\n" +
"                         ||___||\n" +
"                         ||:::||\n" +
"                         ||:::||\n" +
"                         ||:::||\n" +
"                         ||:::||\n" +
"                         ||:::||\n" +            
"                         ||:::||\n" +  
"                         ||:::||\n" +  
"                         ||:::||\n" +
"                        /||:::||\\\n" +
"                       / ||:::|| \\\n" +
"                      /  ||:::||  \\\n" +
"                     /   ||:::||   \\\n" +
"                 ___/____||:::||____\\____\n" +
"                /~~~~~~~~~~~~~~~~~~~~~~~~\\\n" +
"               /   |~~~~~~~~|  _____      \\\n" +
"               |   |________| |  |  |     | \n" +
"_______________|______________|__|__|_____|________________");

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

        quizEContinuidadeDoJogo_Andar1();
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

    static String[] perguntas_Andar1 () { //Esse método reúne todos os desafios do andar 1 do castelo em um vetor

        String[] perguntas1 = new String[]{
            "Qual o resultado para a expressão: (2 * (3 + 5)) - 15 + ((3*0) * 15))", 
            "Qual o resultado da expressão: 3* ((7+3*5) * (10/5+10) + 1)",
            "Qual o resultado da expressão: 15 – 7 *((10*3+15) + (27/3 * 5))",
            "Qual o resultado da expressão: ((-15) * (-15)) + 30 * (-17)) – 175",
            "Qual o resultado da expressão: ((-50) * 81 + 32/16 – (15* 32))"};

        return perguntas1;
    }
    static String[] perguntas_Andar2 () { //Esse método reúne todos os desafios do andar 2 do castelo em um vetor

        String[] perguntas1 = new String[]{""}; 

        return perguntas1;
    }
    static String[] perguntas_Andar3 () { //Esse método reúne todos os desafios do andar 3 do castelo em um vetor

        String[] perguntas1 = new String[]{""}; 

        return perguntas1;
    }
    static String[] perguntas_Andar4 () { //Esse método reúne todos os desafios do andar 4 do castelo em um vetor

        String[] perguntas1 = new String[]{""}; 

        return perguntas1;
    }
    static String[] perguntas_Andar5 () { //Esse método reúne todos os desafios do andar 5 do castelo em um vetor

        String[] perguntas1 = new String[]{""}; 

        return perguntas1;
    }
    static String[] perguntas_Andar6 () { //Esse método reúne todos os desafios do andar 6 do castelo em um vetor

        String[] perguntas1 = new String[]{""}; 

        return perguntas1;
    }
    static String[] perguntas_Andar7 () { //Esse método reúne todos os desafios do andar 7 do castelo em um vetor

        String[] perguntas1 = new String[]{""}; 

        return perguntas1;
    }
    static String[] perguntas_Andar8 () { //Esse método reúne todos os desafios do andar 8 do castelo em um vetor

        String[] perguntas1 = new String[]{""}; 

        return perguntas1;
    }
    static String[] perguntas_Andar9 () { //Esse método reúne todos os desafios do andar 9 do castelo em um vetor

        String[] perguntas1 = new String[]{""}; 

        return perguntas1;
    }
    static String[] perguntas_Andar10 () { //Esse método reúne todos os desafios do andar 10 do castelo em um vetor

        String[] perguntas1 = new String[]{""}; 

        return perguntas1;
    }

    
    
    static String[][] respostas_Andar1 () { // Essa função reúne todas as alternativas das perguntas do andar 1 em uma matriz
        String[][] matriz = new String[][]{
            {"a-)15","b-)10","c-)1","d-)3"},
            {"a-)795","b-)337","c-)657","d-)17"},
            {"a-)750","b-)-615","c-)615","d-)-750"},
            {"a-)570","b-)-373","c-)460","d-)-460"},
            {"a-)-4528","b-)–3255","c-)478","d-)1"}};

        return matriz;
    }
    static String[][] respostas_Andar2 () { // Essa função reúne todas as alternativas das perguntas do andar 2 em uma matriz
        String[][] matriz = new String[][]{};

        return matriz;
    }
    static String[][] respostas_Andar3 () { // Essa função reúne todas as alternativas das perguntas do andar 3 em uma matriz
        String[][] matriz = new String[][]{};

        return matriz;
    }
    static String[][] respostas_Andar4 () { // Essa função reúne todas as alternativas das perguntas do andar 4 em uma matriz
        String[][] matriz = new String[][]{};

        return matriz;
    }
    static String[][] respostas_Andar5 () { // Essa função reúne todas as alternativas das perguntas do andar 5 em uma matriz
        String[][] matriz = new String[][]{};

        return matriz;
    }
    static String[][] respostas_Andar6 () { // Essa função reúne todas as alternativas das perguntas do andar 6 em uma matriz
        String[][] matriz = new String[][]{};

        return matriz;
    }
    static String[][] respostas_Andar7 () { // Essa função reúne todas as alternativas das perguntas do andar 7 em uma matriz
        String[][] matriz = new String[][]{};

        return matriz;
    }
    static String[][] respostas_Andar8 () { // Essa função reúne todas as alternativas das perguntas do andar 8 em uma matriz
        String[][] matriz = new String[][]{};

        return matriz;
    }
    static String[][] respostas_Andar9 () { // Essa função reúne todas as alternativas das perguntas do andar 9 em uma matriz
        String[][] matriz = new String[][]{};

        return matriz;
    }
    static String[][] respostas_Andar10 () { // Essa função reúne todas as alternativas das perguntas do andar 10 em uma matriz
        String[][] matriz = new String[][]{};

        return matriz;
    }
    
    
    static int[] embaralhar () { // Essa função cria uma lista de números, com a quantidade de perguntas que eu tenho no andar 1 e embaralha esses números
        Random gerador = new Random();
        int a, b, temp;

        int[] numeros = new int[5]; // Numeros é um vetor e a função da variavel número é retornar uma lista com os números embaralhados.

        for (int i = 0; i < 5; i++) { // vai preencher o vetor número de 0 aé o valor que eu TIVER DE PERGUNTAS.
            numeros[i] = i;
        }

        for (int i = 0; i < 50; i++) { // embaralha os números do vetor
            a = gerador.nextInt(5);
            b = gerador.nextInt(5);
            if (a != b) {
                temp = numeros[a];
                numeros[a] = numeros[b];
                numeros[b] = temp;
            }
        }
        return numeros;
    }

    static void quizEContinuidadeDoJogo_Andar1() { //Essa função irá chamar a pergunta aleatória do primeiro andar

        String[] perguntasQuiz = perguntas_Andar1(); // perguntasQuiz recebe os desafios da função pergunta_Andar1
        String[][] respostasQuiz = respostas_Andar1(); // respostasQuiz recebe as alternativas das perguntas que está na função respostas_Andar1
        String escolha;
        int[] sequencia = embaralhar(); //Cria a variavel sequencia com os valores embaralhados da função embaralhar

        for (int i = 0; i < 1; i++) { //*Os números já vão está embaralhados, com isso vou limitar quantas perguntas eu quero mostrar para o usuario

            System.out.println(perguntasQuiz[sequencia[i]]); // PerguntasQuiz está recebendo o valor que está armazenado na posição 0 da variavel sequencia e assim consecutivamente

            for (int j = 0; j < 4; j++) {
                System.out.println(respostasQuiz[sequencia[i]][j]); //respostaQuiz vai receber sequencia [i][j] --> para apresentar todas as alternativas de respostas
            }

            System.err.print("Escolha a opção correta: "); // O usuario vai digitar a alternativa que ele considera ser a correta 
            escolha = leitor.next(); // a resposta ficará armazenada na variavel escolha

            switch (sequencia[i]) { // esse switch é responsável por localizar a pergunta que será feita ao usuario, enquanto os if e else são responsáveis de verificar se o usuario digitou a alternativa correta. 
                case 0:
                    if (escolha.equals("c")) {
                        System.out.println("Você acertou");
                    } else {
                        System.out.println("Você errou");
                    }
                    break;

                case 1:
                    if (escolha.equals("a")) {
                        System.out.println("Você acertou");
                    } else {
                        System.out.println("Você errou");
                    }
                    break;

                case 2:
                    if (escolha.equals("b")) {
                        System.out.println("Você acertou");
                    } else {
                        System.out.println("Você errou");
                    }
                    break;

                case 3:
                    if (escolha.equals("d")) {
                        System.out.println("Você acertou");
                    } else {
                        System.out.println("Você errou");
                    }
                    break;

                case 4:
                    if (escolha.equals("a")) {
                        System.out.println("Você acertou");
                    } else {
                        System.out.println("Você errou");
                    }
                    break;
            }
        }
    }
}