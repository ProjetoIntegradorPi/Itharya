package itharya;

import java.util.Random;
import java.util.Scanner;

public class Versao_06 {

    static Scanner leitor = new Scanner(System.in);

    public static void main(String[] args) {

        Controle();

    }

    static void Controle() {
        int escolhaMenu;

        // Castelo da História do jogo;
        System.out.println("\t\t  Bem vindo(a) à Itharya.");
        System.out.println(" "
                + "                           *\n"
                + "                            :\n"
                + "                            |\n"
                + "                            |\n"
                + "                            |\n"
                + "                           :|:\n"
                + "                           |||\n"
                + "                      _____|||_____\n"
                + "                     /=============\\\n"
                + "                 ---<~~~~~~~~~~~~~~~>---\n"
                + "                     \\-------------/\n"
                + "                      \\___________/\n"
                + "                        \\||:::||/\n"
                + "                         ||:::||\n"
                + "                         ||:::||\n"
                + "                         ||:::||\n"
                + "                         ||ooo||\n"
                + "                         ||___||\n"
                + "                         ||:::||\n"
                + "                         ||:::||\n"
                + "                         ||:::||\n"
                + "                         ||:::||\n"
                + "                         ||:::||\n"
                + "                         ||:::||\n"
                + "                         ||:::||\n"
                + "                         ||:::||\n"
                + "                        /||:::||\\\n"
                + "                       / ||:::|| \\\n"
                + "                      /  ||:::||  \\\n"
                + "                     /   ||:::||   \\\n"
                + "                 ___/____||:::||____\\____\n"
                + "                /~~~~~~~~~~~~~~~~~~~~~~~~\\\n"
                + "               /   |~~~~~~~~|  _____      \\\n"
                + "               |   |________| |  |  |     | \n"
                + "_______________|______________|__|__|_____|________________");

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
        quizEContinuidadeDoJogo_Andar2();
        quizEContinuidadeDoJogo_Andar3();
        quizEContinuidadeDoJogo_Andar4();
        quizEContinuidadeDoJogo_Andar5();
        quizEContinuidadeDoJogo_Andar6();
        quizEContinuidadeDoJogo_Andar7();
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

    static String[] perguntas_Andar1() { //Esse método reúne todos os desafios do andar 1 do castelo em um vetor

        String[] perguntas1 = new String[]{
            "Qual o resultado para a expressão: (2 * (3 + 5)) - 15 + ((3*0) * 15))",
            "Qual o resultado da expressão: 3* ((7+3*5) * (10/5+10) + 1)",
            "Qual o resultado da expressão: 15 – 7 *((10*3+15) + (27/3 * 5))",
            "Qual o resultado da expressão: ((-15) * (-15)) + 30 * (-17)) – 175",
            "Qual o resultado da expressão: ((-50) * 81 + 32/16 – (15* 32))"};

        return perguntas1;
    }

    static String[] perguntas_Andar2() { //Esse método reúne todos os desafios do andar 2 do castelo em um vetor

        String[] perguntas1 = new String[]{
            "Qual o valor da função  f(X)= 5*X + 35”, considerando o X= -3?",
            "Qual o valor da função  f(X)= 10- X, considerando X= ((3*3) + 15)",
            "Qual o valor da função  f(x)= 2*X + 3*X - 1, considerando X= -3 * 4",
            "Qual o valor da função  f(X)= 5*3 + X, considerando X= -235",
            "Qual o valor da função  f(x)= 3*x*2 + 18x + 22 para x = 2"};

        return perguntas1;
    }

    static String[] perguntas_Andar3() { //Esse método reúne todos os desafios do andar 3 do castelo em um vetor

        String[] perguntas1 = new String[]{
            "Como representar o número 25987935(decimal) em binário?",
            "Como representar o número 88975(decimal) em octal?",
            "Como representar o número 256142(decimal) em binário?",
            "Como representar o número 89484(decimal) em octal?",
            "Como representar o número 85362(decimal) em octal?"};

        return perguntas1;
    }

    static String[] perguntas_Andar4() { //Esse método reúne todos os desafios do andar 4 do castelo em um vetor

        String[] perguntas1 = new String[]{
            "Como representar o número 111011101(binário) em octal?",
            "Como representar o número 1010101100(binário) em octal?",
            "Como representar o número 77712(octal) em binário?",
            "Como representar o número 54123(octal) em binário?",
            "Como representar o número 388A1(hexadecimal) em octal?"};

        return perguntas1;
    }

    static String[] perguntas_Andar5() { //Esse método reúne todos os desafios do andar 5 do castelo em um vetor

        String[] perguntas1 = new String[]{
            "Considerando que os valores a seguir estejam representados em binário qual o resultado da soma 101010111 + 011011011 em decimal?",
            "Considerando que os valores a seguir estejam representados em binário qual o resultado da soma 11110001 + 1000100101 em decimal?",
            "Considerando que os valores a seguir estejam representados em binário qual o resultado da soma 1111110101 + 111110101 em decimal?",
            "Considerando que os valores a seguir estejam representados em binário qual o resultado da soma 10101010 + 11111010101 em decimal?",
            "Considerando que os valores a seguir estejam representados em binário qual o resultado da soma 111111111 + 11111111 em decimal?"};

        return perguntas1;
    }

    static String[] perguntas_Andar6() { //Esse método reúne todos os desafios do andar 6 do castelo em um vetor

        String[] perguntas1 = new String[]{
            "Considerando que os valores a seguir estejam representados em binário, qual o resultado da multiplicação 11011011011011011 * 01111111111101111 em decimal?",
            "Considerando que os valores a seguir estejam representados em binário, qual o resultado da multiplicação 1111010101 * 1111010101 em decimal?",
            "Considerando que os valores a seguir estejam representados em binário, qual o resultado da multiplicação 110101 * 1110011 em decimal?",
            "Considerando que os valores a seguir estejam representados em binário, qual o resultado da multiplicação 10101010 * 10101010 em decimal?",
            "Considerando que os valores a seguir estejam representados em binário, qual o resultado da multiplicação 11111111111 * 111111111 em decimal?"};

        return perguntas1;
    }

    static String[] perguntas_Andar7() { //Esse método reúne todos os desafios do andar 7 do castelo em um vetor

        String[] perguntas1 = new String[]{
            "Considerando que os valores a seguir estejam representados em binário, qual o resultado da multiplicação 11110101* 10101011 em octal?",
            "Considerando que os valores a seguir estejam representados em binário, qual o resultado da multiplicação 111111 * 11111 em octal?",
            "Considerando que os valores a seguir estejam representados em binário, qual o resultado da multiplicação 1010101011 * 1010101011 em octal?",
            "Considerando que os valores a seguir estejam representados em binário, qual o resultado da multiplicação 110101010 * 01010110 em decimal?",
            "Considerando que os valores a seguir estejam representados em binário, qual o resultado da multiplicação 10101011110 * 1101010101 em octal?"};

        return perguntas1;
    }

    static String[] perguntas_Andar8() { //Esse método reúne todos os desafios do andar 8 do castelo em um vetor

        String[] perguntas1 = new String[]{""};

        return perguntas1;
    }

    static String[] perguntas_Andar9() { //Esse método reúne todos os desafios do andar 9 do castelo em um vetor

        String[] perguntas1 = new String[]{""};

        return perguntas1;
    }

    static String[] perguntas_Andar10() { //Esse método reúne todos os desafios do andar 10 do castelo em um vetor

        String[] perguntas1 = new String[]{""};

        return perguntas1;
    }

    static String[][] respostas_Andar1() { // Essa função reúne todas as alternativas das perguntas do andar 1 em uma matriz
        String[][] matriz = new String[][]{
            {"a-)15", "b-)10", "c-)1", "d-)3"},
            {"a-)795", "b-)337", "c-)657", "d-)17"},
            {"a-)750", "b-)-615", "c-)615", "d-)-750"},
            {"a-)570", "b-)-373", "c-)460", "d-)-460"},
            {"a-)-4528", "b-)–3255", "c-)478", "d-)1"}};

        return matriz;
    }

    static String[][] respostas_Andar2() { // Essa função reúne todas as alternativas das perguntas do andar 2 em uma matriz
        String[][] matriz = new String[][]{
            {"a-)20", "b-)160", "c-)-15", "d-)35"},
            {"a-)-21", "b-)-14", "c-)-5", "d-)32"},
            {"a-)-32", "b-)0", "c-)-61", "d-)77"},
            {"a-)450", "b-)750", "c-)112", "d-)-220"},
            {"a-)50", "b-)60", "c-)70", "d-)80"}};

        return matriz;
    }

    static String[][] respostas_Andar3() { // Essa função reúne todas as alternativas das perguntas do andar 3 em uma matriz
        String[][] matriz = new String[][]{
            {"a-)0011001100001111110101010", "b-)1111110000000111111111111", "c-)1100011001000101101011111", "d-)1100111100001010110011001"},
            {"a-)552131", "b-)457151", "c-)255617", "d-)356173"},
            {"a-)001110011110101010", "b-)111110100010001110", "c-)111111000000101010", "d-)110101010111100010"},
            {"a-)256614", "b-)321565", "c-)623514", "d-)632514"},
            {"a-)325614", "b-)145261", "c-)566562", "d-)246562"}};

        return matriz;
    }

    static String[][] respostas_Andar4() { // Essa função reúne todas as alternativas das perguntas do andar 4 em uma matriz
        String[][] matriz = new String[][]{
            {"a-)635", "b-)735", "c-)566", "d-)788"},
            {"a-)1165", "b-)1253", "c-)2564", "d-)1254"},
            {"a-)111111111001010", "b-)111111101011010", "c-)000000011111111", "d-)111010001011101"},
            {"a-)101010101110100", "b-)111111000111010", "c-)101100001010011", "d-)101111110101001"},
            {"a-)657416", "b-)325451", "c-)602121", "d-)704241"}};

        return matriz;
    }

    static String[][] respostas_Andar5() { // Essa função reúne todas as alternativas das perguntas do andar 5 em uma matriz
        String[][] matriz = new String[][]{
            {"a-)378", "b-)410", "c-)485", "d-)562"},
            {"a-)564", "b-)125", "c-)790", "d-)890"},
            {"a-)1514", "b-)1614", "c-)1714", "d-)1814"},
            {"a-)3215", "b-)2175", "c-)4123", "d-)2562"},
            {"a-)735", "b-)566", "c-)855", "d-)766"}};

        return matriz;
    }

    static String[][] respostas_Andar6() { // Essa função reúne todas as alternativas das perguntas do andar 6 em uma matriz
        String[][] matriz = new String[][]{
            {"a-)8956723167", "b-)7360863093", "c-)5567314567", "d-)5701698763"},
            {"a-)525364", "b-)962461", "c-)962361", "d-)728521"},
            {"a-)5522", "b-)5521", "c-)6011", "d-)6095"},
            {"a-)28900", "b-)27550", "c-)28652", "d-)32651"},
            {"a-)1415021", "b-)1152321", "c-)1502018", "d-)1046017"}};

        return matriz;
    }

    static String[][] respostas_Andar7() { // Essa função reúne todas as alternativas das perguntas do andar 7 em uma matriz
        String[][] matriz = new String[][]{
            {"a-)121647", "b-)264174", "c-)747412", "d-)154231"},
            {"a-)5641", "b-)3641", "c-)2165", "d-)7451"},
            {"a-)2126254", "b-)1741425", "c-)1617071", "d-)1415213"},
            {"a-)112564", "b-)326577", "c-)112152", "d-)107434"},
            {"a-)1232561", "b-)6215417", "c-)2135261", "d-)4361066"}};

        return matriz;
    }

    static String[][] respostas_Andar8() { // Essa função reúne todas as alternativas das perguntas do andar 8 em uma matriz
        String[][] matriz = new String[][]{};

        return matriz;
    }

    static String[][] respostas_Andar9() { // Essa função reúne todas as alternativas das perguntas do andar 9 em uma matriz
        String[][] matriz = new String[][]{};

        return matriz;
    }

    static String[][] respostas_Andar10() { // Essa função reúne todas as alternativas das perguntas do andar 10 em uma matriz
        String[][] matriz = new String[][]{};

        return matriz;
    }

    static int[] embaralhar() { // Essa função cria uma lista de números, com a quantidade de perguntas que eu tenho no andar 1 e embaralha esses números
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

    static void quizEContinuidadeDoJogo_Andar2() { //Essa função irá chamar a pergunta aleatória do segundo andar

        String[] perguntasQuiz = perguntas_Andar2(); // perguntasQuiz recebe os desafios da função pergunta_Andar2
        String[][] respostasQuiz = respostas_Andar2(); // respostasQuiz recebe as alternativas das perguntas que está na função respostas_Andar2
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
                    if (escolha.equals("a")) {
                        System.out.println("Você acertou");
                    } else {
                        System.out.println("Você errou");
                    }
                    break;

                case 1:
                    if (escolha.equals("b")) {
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
                    if (escolha.equals("d")) {
                        System.out.println("Você acertou");
                    } else {
                        System.out.println("Você errou");
                    }
                    break;

                case 4:
                    if (escolha.equals("c")) {
                        System.out.println("Você acertou");
                    } else {
                        System.out.println("Você errou");
                    }
                    break;
            }
        }
    }

    static void quizEContinuidadeDoJogo_Andar3() { //Essa função irá chamar a pergunta aleatória do terceiro andar

        String[] perguntasQuiz = perguntas_Andar3(); // perguntasQuiz recebe os desafios da função pergunta_Andar3
        String[][] respostasQuiz = respostas_Andar3(); // respostasQuiz recebe as alternativas das perguntas que está na função respostas_Andar3
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
                    if (escolha.equals("c")) {
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
            }
        }
    }

    static void quizEContinuidadeDoJogo_Andar4() { //Essa função irá chamar a pergunta aleatória do quarto andar

        String[] perguntasQuiz = perguntas_Andar4(); // perguntasQuiz recebe os desafios da função pergunta_Andar4
        String[][] respostasQuiz = respostas_Andar4(); // respostasQuiz recebe as alternativas das perguntas que está na função respostas_Andar4
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
                    if (escolha.equals("b")) {
                        System.out.println("Você acertou");
                    } else {
                        System.out.println("Você errou");
                    }
                    break;

                case 1:
                    if (escolha.equals("d")) {
                        System.out.println("Você acertou");
                    } else {
                        System.out.println("Você errou");
                    }
                    break;

                case 2:
                    if (escolha.equals("a")) {
                        System.out.println("Você acertou");
                    } else {
                        System.out.println("Você errou");
                    }
                    break;

                case 3:
                    if (escolha.equals("c")) {
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
            }
        }
    }

    static void quizEContinuidadeDoJogo_Andar5() { //Essa função irá chamar a pergunta aleatória do quinto andar

        String[] perguntasQuiz = perguntas_Andar5(); // perguntasQuiz recebe os desafios da função pergunta_Andar5
        String[][] respostasQuiz = respostas_Andar5(); // respostasQuiz recebe as alternativas das perguntas que está na função respostas_Andar5
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
                    if (escolha.equals("d")) {
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
                    if (escolha.equals("a")) {
                        System.out.println("Você acertou");
                    } else {
                        System.out.println("Você errou");
                    }
                    break;

                case 3:
                    if (escolha.equals("b")) {
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
            }
        }
    }

    static void quizEContinuidadeDoJogo_Andar6() { //Essa função irá chamar a pergunta aleatória do sexto andar

        String[] perguntasQuiz = perguntas_Andar6(); // perguntasQuiz recebe os desafios da função pergunta_Andar6
        String[][] respostasQuiz = respostas_Andar6(); // respostasQuiz recebe as alternativas das perguntas que está na função respostas_Andar6
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
                    if (escolha.equals("b")) {
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
                    if (escolha.equals("d")) {
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
            }
        }
    }
    static void quizEContinuidadeDoJogo_Andar7() { //Essa função irá chamar a pergunta aleatória do sétimo andar

        String[] perguntasQuiz = perguntas_Andar7(); // perguntasQuiz recebe os desafios da função pergunta_Andar7
        String[][] respostasQuiz = respostas_Andar7(); // respostasQuiz recebe as alternativas das perguntas que está na função respostas_Andar7
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
                    if (escolha.equals("a")) {
                        System.out.println("Você acertou");
                    } else {
                        System.out.println("Você errou");
                    }
                    break;

                case 1:
                    if (escolha.equals("b")) {
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
                    if (escolha.equals("d")) {
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
            }
        }
    }
}
