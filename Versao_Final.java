package terra2119;

import java.util.Random;
import java.util.Scanner;

public class Versao_Final {

    static Scanner leitor = new Scanner(System.in);

    static int pontos = 100;

    public static void main(String[] args) {

        Controle();

    }

    static void Controle() {
        int escolhaMenu;

        System.out.println("\t\t  Bem vindo(a) à Terra 2.0");
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
                + "_______________|______________|__|__|_____|_________________________________");

        System.out.println("Caso queira saber sobre Universo do Jogo, recomendamos que leia a história");

        do {
            System.out.println("\n1-Iniciar Jogo \n2-Ler a História do Jogo \n3-Créditos \n4-Sair"); // Opções do menu

            System.err.print("\nEscolha o número da opção desejada: ");
            escolhaMenu = leitor.nextInt();

            switch (escolhaMenu) {
                case 1:
                    escolha_do_Menu1(escolhaMenu); //Iniciar Jogo
                    break;
                case 2:
                    escolha_do_Menu2(escolhaMenu); //História do Jogo
                    break;
                case 3:
                    escolha_do_Menu3(escolhaMenu); //Créditos
                    break;
                case 4:
                    escolha_do_Menu4(escolhaMenu); // Sair do Jogo
                    break;
                default:
                    System.out.println("Digite uma opção Válida");
                    break;
            }
        } while (escolhaMenu != 1 && escolhaMenu != 4);
    }

    static void escolha_do_Menu1(int escolhaMenu1) { // Função que inicia o jogo

        String classe, personagem;

        System.out.println("------------------------------------------------------------------------------------");
        System.out.println("Escolha um antecedente: ");
        System.out.println("\nCientista ou Hacker");
        do {
            System.out.println("");
            System.err.print("\nAntecedente: "); //Resposta de Escolha de Antecedente 
            classe = leitor.next();//Leitura de Antecedente

            if (!classe.equals("Cientista") && !classe.equals("cientista") && !classe.equals("CIENTISTA") && !classe.equals("Hacker") && !classe.equals("hacker") && !classe.equals("HACKER")) { //Verificar a digitiação do joagdor 

                System.out.println("------------------------------------------------------------------------------------");
                System.out.println("Digite uma opção válida!"); // Mensagem caso o jogador não digite nenhuma das opções válidas
            }

        } while (!classe.equals("Cientista") && !classe.equals("cientista") && !classe.equals("CIENTISTA") && !classe.equals("Hacker") && !classe.equals("hacker") && !classe.equals("HACKER"));
        // Se o jogador digitar a classe errada, voltar para a parte que o mesmo Digita a clase.

        System.out.println("------------------------------------------------------------------------------------");
        System.err.print("Qual o seu nome?: "); //
        personagem = leitor.next(); // Leitura do nome do Personagem

        System.out.println("------------------------------------------------------------------------------------");
        //O JOGO COMEÇA
        System.out.println("Primeiro, escuro. Não vejo nada… Uma voz feminina começa a falar..."
                + "\n\n- Olá. Meu nome é Titã e como os antigos seres da mitologia, fui criada para impor ordem a um novo mundo e separar, os fortes, dos fracos. "
                + "\nHoje é o dia 360 do ano 2119. Você está na Torre S027P. Não se assuste. Você deve estar confuso, atordoado, mas fique calmo, logo entenderá. "
                + "\n\nLuzes se acendem, ofuscam minha visão… Não vejo nada… Aos poucos meus olhos se acostumam à claridade… Estou em uma sala branca, sem mobília,"
                + "\nvazia...Não sei onde estou, nem como vim parar aqui..."
                + "\n\n- Se olhar para o seu braço direito, notará uma pulseira com o número 100, isso significa o quanto você poderá viver aqui. Caso esse número chegue a zero"
                + "\no bracelete emitirá uma onda sonora que fará com todos os seus orgãos pare, e sua existência, seja apagada. Mas, os gregos sempre recompensaram os valorosos"
                + "\nassim, você tem uma missão. Sobreviva, aos 10 desafios  dessa torre, e viverá no Olimpo, junto aos deuses e heróis. Fracasse, e será lançado no esquecimento."
                + "\n\nUma das paredes abriu uma passagem… Passo por ela e imediatamente ela se fecha…. Estou em um corredor estreito… No fim dele um console, com teclado… "
                + "\nA voz me pergunta…"); //Começo do jogo    

        System.out.println("\nSeus pontos de Vida são: " + pontos);

        quizEContinuidadeDoJogo_Andar1();

        System.out.println("\nPontos de vida atual: " + pontos);

        System.out.println("\nUm pequeno círculo acende no chão… Eu respiro fundo e subo nele… Rapidamente, começo a ser levado para cima... "
                + "\nNovamente, muita luz e não vejo nada… Só consigo abrir os olhos quando o elevador para… Estou em um corredor estreito com um console no fim…"
                + "\n\n- Vamos tentar mais uma vez. Me Responda: ");

        quizEContinuidadeDoJogo_Andar2();

        System.out.println("\nPontos de vida atual: " + pontos);

        System.out.println("\nDessa vez, sem círculo no chão… Uma parede abriu atrás do console… Estava mal iluminado… Me aproximo da porta e vejo uma escada… "
                + "\nQuando piso no primeiro degrau, ela liga e começa a me levar para cima, em uma reta diagonal… Ao chegar no fim da escada vejo um corredor estreito com "
                + "\num console… Mas dessa vez, acima do console vejo uma balança digital flutuando, do lado esquerdo da balança está mostrando um número grande, e do lado direito, o número zero…"
                + "\n\n- Antes de prosseguir, você deve provar que consegue equilibrar essa balança. Me responda: ");

        quizEContinuidadeDoJogo_Andar3();

        System.out.println("\nPontos de vida atual: " + pontos);

        System.out.println("\nPor algum motivo, sei exatamente do que se trata o assunto dessas perguntas… Como?... Não sei dizer… Só me resta prosseguir para o próximo andar… "
                + "\nNovamente, a parede a frente se abre e vejo uma escada rolante… Estou começando a me cansar de corredores estreitos com um console no fim… Outra balança digital..."
                + "\n\n- Equilíbrio é importante… Vamos continuar os testes. Me responda: ");

        quizEContinuidadeDoJogo_Andar4();

        System.out.println("\nPontos de vida atual: " + pontos);

        System.out.println("\nDessa vez, duas paredes se abriram… Vejo uma rampa suspensa por dois braços metálicos… Sei que devo subir nela… "
                + "\nAssim que o faço, ela começa a subir em uma diagonal… Parece que estou em uma oficina… Algo me diz isso… A frente vejo um computador dos anos 40… "
                + "\nUma telinha pequena com números verdes ligado a vários e gigantes gabinetes… Cabos por todos os lados…"
                + "\n\n- Agora um teste de comunicação. Me responda: ");

        quizEContinuidadeDoJogo_Andar5();

        System.out.println("\nSPontos de vida atual: " + pontos);

        System.out.println("O computador acende… Me assusto… Números verdes apareceram na tela novamente..."
                + "\n\n - Quero testá-lo mais uma vez antes de prosseguir… Me responda: ");

        quizEContinuidadeDoJogo_Andar6();

        System.out.println("\nPontos de vida atual: " + pontos);

        System.out.println("\nO computador acende novamente… Ele está estalando… Números vermelhos aparecem na tela… A voz de Titã agora estava diferente… "
                + "\nSoava mais perigosa..."
                + "\n\n- Mais uma vez… Antes de prosseguir… Me responda: ");

        quizEContinuidadeDoJogo_Andar7();

        System.out.println("\nPontos de vida atual: " + pontos);

        System.out.println("\nEscuro… Senti meu corpo sendo puxado para cima… Me sinto flutuando… Sendo sugado… Agora estou em um hangar... "
                + "\nEstou vendo uma grande esfera, uma cápsula, com um lugar para sentar… "
                + "\n\n- Esta esfera fará você se lembrar de tudo verme… Mas ela precisa ser consertada… Você precisará consertar 2 circuitos… "
                + "\nLigue os cabos necessários, ative as portas certas, cuidado para não confundi-lás! HA-HA-HA!"
                + "\n\nEssa esfera é toda branca, exceto pelo assento de couro marrom ao centro… Saindo do lado direito e do lado esquerdo da esfera, circuitos desligados… "
                + "\nComo sei que isso são circuitos?... Bom, isso não importa agora… Vou primeiro ao lado esquerdo…"
                + "\n\n- Me responda…");

        quizEContinuidadeDoJogo_Andar8();

        System.out.println("\nPontos de vida atual: " + pontos);

        System.out.println("\nAgora vou para o lado direito… Sinto que Titã está ficando instável, ela está gritando coisas sem sentido… Sobre eu ser um "
                + "\nverme que destruiu a Terra… Que o mundo teria uma chance agora que os humanos estavam nas torres…  Não dou atenção a ela… "
                + "\nA sala está piscando em vermelho… Leio o próximo desafio...");

        quizEContinuidadeDoJogo_Andar9();

        System.out.println("\nPontos de vida atual: " + pontos);

        System.out.println("\nA esfera acendeu… Ligou...Me sento na cadeira de couro e a esfera se fecha… Sinto a sala tremer com os gritos de Titã… Dentro da esfera é tudo iluminado. "
                + "\nTudo branco. Limpo. Ouço outra voz feminina… Mais calma… Mais firme… \n"
                + "\n\n- Não se preocupe com o que está lá fora. Passe nesse último teste, e saberá de tudo…");

        quizEContinuidadeDoJogo_Andar10();

        //System.out.println("\nPontos de vida atual: " + pontos);            
        if (classe.equals("Cientista") || classe.equals("cientista") || classe.equals("CIENTISTA")) { //Programação dos dois finais

            //Final do Cientista
            System.out.println(""
                    + "\n- Olá " + personagem + ". Quanto tempo. Quando a crise começou, apenas nós sabíamos que não poderíamos recriar o Terra se alguns sacrifícios não fossem feitos."
                    + "\nPor isso decidimos que só os melhores poderiam viver na Terra 2.0, mas, quando as torres ficaram prontas, você não achou que era justo… Por isso apagamos sua memória,"
                    + "\nvocê não sabia sobre o seu passado, mas não perdeu seu conhecimento."
                    + "\n\n- Agora que passou por essa torre, por esse teste, pode voltar para a Lua, e nos ajudar criar a Terra 2.0, afinal ainda há muito trabalho a ser feito… Mas já podemos comemorar"
                    + "\nalgumas vitórias, os oceanos da terra já estão quase totalmente despoluídos… O que você está fazendo?"
                    + "\n\nEu ajudei a fazer essas torres, sei tudo o que precisa para controlá-las, facilmente desligo todas as outras torres do mundo… "
                    + "\nNinguém merece passar por esse teste, é desumano… Eu ajudei a fazer essas torres, mas vou consertar o que fiz… "
                    + "\nProgramo a  torre que estou para alçar voo em direção à base Lua… Essa torre irá se chocar com a base lunar, e depois disso, "
                    + "\nas pessoas da Terra terão que se ajudar e construir uma nova Terra…"
                    + "\n\nParabéns! Você venceu o jogo!");

        } else if (classe.equals("Hacker") || classe.equals("hacker") || classe.equals("HACKER")) {

            //Final do Hacker
            System.out.println(""
                    + "Sinto que a esfera começou a flutuar lentamente, e foi aumentando sua velocidade… Agora percebo que estou voando…"
                    + "\n\n - Olá " + personagem + ". Parabéns pela conquista, agora você nos ajudará construir a Terra 2.0, mas primeiro você precisa descansar, se alimentar e restabelecer o seu espírito. "
                    + "\n\n - Seja bem vindo à Base Lunar…"
                    + "\n\nMe lembro de quando as torres chegaram, já vivíamos a anos sem esperanças de ajuda, mas a tecnologia sempre foi minha amiga "
                    + "\ne consegui sobreviver na Velha Terra graças ao meu conhecimento… Agora a única coisa que quero é uma refeição decente…  "
                    + "\n\n Parabéns! Você venceu o jogo!");
        }

    }

    static void escolha_do_Menu2(int escolhaMenu1) { //Função que apresenta a história do jogo.

        System.out.println("" // história do jogo
                + "\nTerra 2.0 se passa em mundo pós-apocalíptico... "
                + "\n\nDepois da Terceira Guerra Mundial, a Terra passou por uma grande crise hídrica, falta de alimentos e o fim dos combustíveis."
                + "\nAssim, um experimento começou, a Terra 2.0. Líderes mundiais se uniram para criar uma estação espacial na Lua,"
                + "\npara onde o pouco que sobrou dos recursos da Antiga Terra foi levado. Inicialmente, os políticos, suas famílias, astronaustas e "
                + "\ncientistas foram os únicos levados para viver lá, enquantos o resto da Humanidade tentava sobrebiver sem esperanças de ajuda..."
                + "\n\nApós alguns meses algo aconteceu. Todos na Antiga Terra olharam para o céu e viram o que pareciam naves, centenas delas se aproximando"
                + "\ne rapidamente começaram a comemorar acreditando ser ajuda... Estavam errados..."
                + "\n\nQuando as naves pousaram as pessoas puderam ver o que eram na verdade... Torres...");
        System.out.println("------------------------------------------------------------------------------------");

    }

    static void escolha_do_Menu3(int escolhaMenu1) { // Função que apresenta os créditos do jogo.

        System.out.println(
                "\n   Projeto Integrador Desenvolvido pelos alunos Matheus Felipe Amancio e Diego Souza de Queiroz,"
                + "\nsob a supervisão do Professor Orientador Leonildo, para o Curso de Análise e Desenvolvimento de Sistemas"
                + "\ndo Centro Universitário Senac (2019). ");

        System.out.println("\n------------------------------------------------------------------------------------");
    }

    static void escolha_do_Menu4(int escolhaMenu1) { // Função que encerra o Jogo no Menu

        System.out.println("------------------------------------------------------------------------------------");
        System.out.println("Obrigado por Jogar Terra 2.0! \nVocê saiu do jogo."); //Feedback para o jogador
    }

    static String[] perguntas_Andar1() { //Esse método reúne todos os desafios do andar 1 do castelo em um vetor

        String[] perguntas1 = new String[]{
            "\nQual o resultado para a expressão: (2 * (3 + 5)) - 15 + ((3*0) * 15))",
            "\nQual o resultado da expressão: 3* ((7+3*5) * (10/5+10) + 1)",
            "\nQual o resultado da expressão: 15 – 7 *((10*3+15) + (27/3 * 5))",
            "\nQual o resultado da expressão: ((-15) * (-15)) + 30 * (-17)) – 175",
            "\nQual o resultado da expressão: ((-50) * 81 + 32/16 – (15* 32))"};

        return perguntas1;
    }

    static String[] perguntas_Andar2() { //Esse método reúne todos os desafios do andar 2 do castelo em um vetor

        String[] perguntas1 = new String[]{
            "\nQual o valor da função  f(X)= 5*X + 35”, considerando o X= -3?",
            "\nQual o valor da função  f(X)= 10- X, considerando X= ((3*3) + 15)",
            "\nQual o valor da função  f(x)= 2*X + 3*X - 1, considerando X= -3 * 4",
            "\nQual o valor da função  f(X)= 5*3 + X, considerando X= -235",
            "\nQual o valor da função  f(x)= 3*x*2 + 18x + 22 para x = 2"};

        return perguntas1;
    }

    static String[] perguntas_Andar3() { //Esse método reúne todos os desafios do andar 3 do castelo em um vetor

        String[] perguntas1 = new String[]{
            "\nComo representar o número 25987935(decimal) em binário?",
            "\nComo representar o número 88975(decimal) em octal?",
            "\nComo representar o número 256142(decimal) em binário?",
            "\nComo representar o número 89484(decimal) em octal?",
            "\nComo representar o número 85362(decimal) em octal?"};

        return perguntas1;
    }

    static String[] perguntas_Andar4() { //Esse método reúne todos os desafios do andar 4 do castelo em um vetor

        String[] perguntas1 = new String[]{
            "\nComo representar o número 111011101(binário) em octal?",
            "\nComo representar o número 1010101100(binário) em octal?",
            "\nComo representar o número 77712(octal) em binário?",
            "\nComo representar o número 54123(octal) em binário?",
            "\nComo representar o número 388A1(hexadecimal) em octal?"};

        return perguntas1;
    }

    static String[] perguntas_Andar5() { //Esse método reúne todos os desafios do andar 5 do castelo em um vetor

        String[] perguntas1 = new String[]{
            "\nConsiderando que os valores a seguir estejam representados em binário qual o resultado da soma 101010111 + 011011011 em decimal?",
            "\nConsiderando que os valores a seguir estejam representados em binário qual o resultado da soma 11110001 + 1000100101 em decimal?",
            "\nConsiderando que os valores a seguir estejam representados em binário qual o resultado da soma 1111110101 + 111110101 em decimal?",
            "\nConsiderando que os valores a seguir estejam representados em binário qual o resultado da soma 10101010 + 11111010101 em decimal?",
            "\nConsiderando que os valores a seguir estejam representados em binário qual o resultado da soma 111111111 + 11111111 em decimal?"};

        return perguntas1;
    }

    static String[] perguntas_Andar6() { //Esse método reúne todos os desafios do andar 6 do castelo em um vetor

        String[] perguntas1 = new String[]{
            "\nConsiderando que os valores a seguir estejam representados em binário, qual o resultado da multiplicação 11011011011011011 * 01111111111101111 em decimal?",
            "\nConsiderando que os valores a seguir estejam representados em binário, qual o resultado da multiplicação 1111010101 * 1111010101 em decimal?",
            "\nConsiderando que os valores a seguir estejam representados em binário, qual o resultado da multiplicação 110101 * 1110011 em decimal?",
            "\nConsiderando que os valores a seguir estejam representados em binário, qual o resultado da multiplicação 10101010 * 10101010 em decimal?",
            "\nConsiderando que os valores a seguir estejam representados em binário, qual o resultado da multiplicação 11111111111 * 111111111 em decimal?"};

        return perguntas1;
    }

    static String[] perguntas_Andar7() { //Esse método reúne todos os desafios do andar 7 do castelo em um vetor

        String[] perguntas1 = new String[]{
            "\nConsiderando que os valores a seguir estejam representados em binário, qual o resultado da multiplicação 11110101* 10101011 em octal?",
            "\nConsiderando que os valores a seguir estejam representados em binário, qual o resultado da multiplicação 111111 * 11111 em octal?",
            "\nConsiderando que os valores a seguir estejam representados em binário, qual o resultado da multiplicação 1010101011 * 1010101011 em octal?",
            "\nConsiderando que os valores a seguir estejam representados em binário, qual o resultado da multiplicação 110101010 * 01010110 em decimal?",
            "\nConsiderando que os valores a seguir estejam representados em binário, qual o resultado da multiplicação 10101011110 * 1101010101 em octal?"};

        return perguntas1;
    }

    static String[] perguntas_Andar8() { //Esse método reúne todos os desafios do andar 8 do castelo em um vetor

        String[] perguntas1 = new String[]{
            "\nQual é forma mais correta de definir uma variável do tipo inteiro?",
            "\nQual a melhor forma de declarar uma variável do tipo real? ",
            "\nSendo X e Y variáveis inteiras, qual será o valor final delas se: \nX = (5 + 32) \nY = ((15 + X ) - (5*10 + 8))\n",
            "\nSendo X, Y e Z variáveis inteiras, qual é o valor final delas se: X = 10 + 5 \nY = X + 13 - 5 \nX = Y + 12 \nZ = X + Y\n",
            "\n5.  Sabendo que X, Y e Z são variáveis inteiras, qual o valor final delas se: \nX = 13 \nY= X + 15 \nZ = X - 5 \nX = Z + 3 \nY = X+ Z  \nZ = X * Y\n"};

        return perguntas1;
    }

    static String[] perguntas_Andar9() { //Esse método reúne todos os desafios do andar 9 do castelo em um vetor

        String[] perguntas1 = new String[]{
            "\nint idade = 15; \n?(idade < 18){ \n\tSystem.out.println(Não pode entrar); \n} \n\nAnalisando o algoritmo, devemos substituir o “?” por: ",
            "\nint velocidade = 118; \nif(? > 70){ \nSystem.out.println(Multado!); \n} \n\nAnalisando o algoritmo, devemos subistituir o “?” por: ",
            "\nint media = 8; \nif(media > 6){ \nSystem.out.println(Aprovado!); \n} \n? { \nSystem.out.println(Reprovado); \n} \n\nAnalisando o algoritmo, devemos substituir o “?” por:",
            "\n? frequencia = 30; \nif(frequencia > 50){ \nSystem.out.println(Aprovado); \n} \n\nAnalisando o algoritmo, devemos substituir o “?” por:",
            "\nint n1 = 14; \nint n2 = 24; \nint soma = n1 + n2; \nif (soma  ? 38) { \nSystem.out.println (\"Resposta Certa\"); \n} \n\nAnalisando o algoritmo, devemos substituir o “?” por:"};
        return perguntas1;
    }

    static String[] perguntas_Andar10() { //Esse método reúne todos os desafios do andar 10 do castelo em um vetor

        String[] perguntas1 = new String[]{
            "\nQual a forma correta de chamar uma função?",
            "\nQual o tipo de função que não retorna nenhum valor?",
            "\nComo se declarar um vetor?",
            "\nQuais são as letras mais utilizadas para se referir à linha e coluna de uma matriz?",
            "\nComo declarar uma matriz?"};

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
        String[][] matriz = new String[][]{
            {"a-)int nomeVariavel = 10;", "b-)inteiro nome = 10;", "c-)int 8nome = 10;", "d-)int @nome = 10;"},
            {"a-)int nomeVariavel = 10;", "b-)float nomeVariavel = 10;", "c-)Float NOMEVARIAVEL = 10;", "d-)float = 10;"},
            {"a-)X = 37, Y = -15", "b-) X = 5 + 32, Y = -38", "c-) X= 37, Y= -6", "d-)X = 5 + 32, Y= 6"},
            {"a-)X = 15, Y =23 , Z = 38", "b-)X = 23, Y = 10 , Z = 33", "c-)X = 35, Y = 17 , Z = 52", "d-)X = 35, Y = 23, Z = 58"},
            {"a-)X = 11, Y = 19 , Z = 209", "b-)X = 15, Y =23 , Z = 345", "c-)X = 7, Y =38 , Z = 266", "d-)X = 7, Y =17 , Z = 119 "}};

        return matriz;
    }

    static String[][] respostas_Andar9() { // Essa função reúne todas as alternativas das perguntas do andar 9 em uma matriz
        String[][] matriz = new String[][]{
            {"a-)if", "b-)se", "c-)for", "d-)do"},
            {"a-)int", "b-)velocidade", "c-)118", "d-)variável"},
            {"a-)if else", "b-)if", "c-)else ", "d-)do "},
            {"a-)var", "b-)string", "c-)char", "d-)int"},
            {"a-)==", "b-)= ", "c-)>", "d-)<"}};

        return matriz;
    }

    static String[][] respostas_Andar10() { // Essa função reúne todas as alternativas das perguntas do andar 10 em uma matriz
        String[][] matriz = new String[][]{
            {"a-)Funcao ( );", "b-)Função ( );", "c-)funcao [ ];", "d-)funcao { };"},
            {"a-)int", "b-)void", "c-)static", "d-)float"},
            {"a-)vetor ( ) int", "b-)vetor [ ] float", "c-)int [ ] vetor", "d-)void [ ] vetor"},
            {"a-)v, m", "b-)s, ss ", "c-)l, c", "d-)i, j "},
            {"a-)int [ ] [ ] matriz", "b-)matriz ( ) ( ) int", "c-)void [ ] [ ] matriz", "d-)float [ ] matriz"}};

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
                        System.out.println("\n- Uma pergunta muito simples para alguém como você… Suba para o próximo andar, o caminho ainda é longo");
                        System.out.println("\n------------------------------------------------------------------------------------");

                    } else {
                        pontos = pontos - 10;
                        System.out.println("\nEu grito… Uma onda de choque fez meu braço arder…\n- Todo herói fracassou alguma vez… Suba para o próximo andar, o caminho é longo");
                        System.out.println("\n------------------------------------------------------------------------------------");
                    }
                    break;

                case 1:
                    if (escolha.equals("a")) {
                        System.out.println("\n- Uma pergunta muito simples para alguém como você… Suba para o próximo andar, o caminho ainda é longo");
                        System.out.println("\n------------------------------------------------------------------------------------");

                    } else {
                        pontos = pontos - 10;
                        System.out.println("\nEu grito… Uma onda de choque fez meu braço arder…\n- Todo herói fracassou alguma vez… Suba para o próximo andar, o caminho é longo");
                        System.out.println("\n------------------------------------------------------------------------------------");
                    }
                    break;

                case 2:
                    if (escolha.equals("b")) {
                        System.out.println("\n- Uma pergunta muito simples para alguém como você… Suba para o próximo andar, o caminho ainda é longo");
                        System.out.println("\n------------------------------------------------------------------------------------");

                    } else {
                        pontos = pontos - 10;
                        System.out.println("\nEu grito… Uma onda de choque fez meu braço arder…\n- Todo herói fracassou alguma vez… Suba para o próximo andar, o caminho é longo");
                        System.out.println("\n------------------------------------------------------------------------------------");
                    }
                    break;

                case 3:
                    if (escolha.equals("d")) {
                        System.out.println("\n- Uma pergunta muito simples para alguém como você… Suba para o próximo andar, o caminho ainda é longo");
                        System.out.println("\n------------------------------------------------------------------------------------");
                    } else {
                        pontos = pontos - 10;
                        System.out.println("\nEu grito… Uma onda de choque fez meu braço arder…\n- Todo herói fracassou alguma vez… Suba para o próximo andar, o caminho é longo");
                        System.out.println("\n------------------------------------------------------------------------------------");

                    }
                    break;

                case 4:
                    if (escolha.equals("a")) {
                        System.out.println("\n- Uma pergunta muito simples para alguém como você… Suba para o próximo andar, o caminho ainda é longo");
                        System.out.println("\n------------------------------------------------------------------------------------");

                    } else {
                        pontos = pontos - 10;
                        System.out.println("\nEu grito… Uma onda de choque fez meu braço arder…\n- Todo herói fracassou alguma vez… Suba para o próximo andar, o caminho é longo");
                        System.out.println("\n------------------------------------------------------------------------------------");
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
                        System.out.println("\n-Muito bem. Daqui em diante os testes serão mais difíceis. Suba para o próximo andar, o caminho ainda é longo");
                        System.out.println("\n------------------------------------------------------------------------------------");

                    } else {
                        pontos = pontos - 10;
                        System.out.println("\nEu desmaio… Vejo pessoas correndo. Sendo perseguidas por algo que não consigo ver. Ouço gritos…  A onda de choque me fez perder os sentidos…Acordo próximo ao console… \n-Cuidado. A cada andar, a onda de choque será maior. Suba para o próximo andar, o caminho é longo");
                        System.out.println("\n------------------------------------------------------------------------------------");

                    }
                    break;

                case 1:
                    if (escolha.equals("b")) {
                        System.out.println("\n-Muito bem. Daqui em diante os testes serão mais difíceis. Suba para o próximo andar, o caminho ainda é longo");
                        System.out.println("\n------------------------------------------------------------------------------------");

                    } else {
                        pontos = pontos - 10;
                        System.out.println("\nEu desmaio… Vejo pessoas correndo. Sendo perseguidas por algo que não consigo ver. Ouço gritos…  A onda de choque me fez perder os sentidos…Acordo próximo ao console… \n-Cuidado. A cada andar, a onda de choque será maior. Suba para o próximo andar, o caminho é longo");
                        System.out.println("\n------------------------------------------------------------------------------------");

                    }
                    break;

                case 2:
                    if (escolha.equals("c")) {
                        System.out.println("\n-Muito bem. Daqui em diante os testes serão mais difíceis. Suba para o próximo andar, o caminho ainda é longo");
                        System.out.println("\n------------------------------------------------------------------------------------");

                    } else {
                        pontos = pontos - 10;
                        System.out.println("\nEu desmaio… Vejo pessoas correndo. Sendo perseguidas por algo que não consigo ver. Ouço gritos…  A onda de choque me fez perder os sentidos…Acordo próximo ao console… \n-Cuidado. A cada andar, a onda de choque será maior. Suba para o próximo andar, o caminho é longo");
                        System.out.println("\n------------------------------------------------------------------------------------");

                    }
                    break;

                case 3:
                    if (escolha.equals("d")) {
                        System.out.println("\n-Muito bem. Daqui em diante os testes serão mais difíceis. Suba para o próximo andar, o caminho ainda é longo");
                        System.out.println("\n------------------------------------------------------------------------------------");

                    } else {
                        pontos = pontos - 10;
                        System.out.println("\nEu desmaio… Vejo pessoas correndo. Sendo perseguidas por algo que não consigo ver. Ouço gritos…  A onda de choque me fez perder os sentidos…Acordo próximo ao console… \n-Cuidado. A cada andar, a onda de choque será maior. Suba para o próximo andar, o caminho é longo");
                        System.out.println("\n------------------------------------------------------------------------------------");

                    }
                    break;

                case 4:
                    if (escolha.equals("c")) {
                        System.out.println("\n-Muito bem. Daqui em diante os testes serão mais difíceis. Suba para o próximo andar, o caminho ainda é longo");
                        System.out.println("\n------------------------------------------------------------------------------------");

                    } else {
                        pontos = pontos - 10;
                        System.out.println("\nEu desmaio… Vejo pessoas correndo. Sendo perseguidas por algo que não consigo ver. Ouço gritos…  A onda de choque me fez perder os sentidos…Acordo próximo ao console… \n-Cuidado. A cada andar, a onda de choque será maior. Suba para o próximo andar, o caminho é longo");
                        System.out.println("\n------------------------------------------------------------------------------------");

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
                        System.out.println("\n“Parabéns… me superou mais uma vez... Veremos se conseguirá completar o caminho. Suba para o próximo andar, o caminho ainda é longo”");
                        System.out.println("\n------------------------------------------------------------------------------------");
                    } else {
                        pontos = pontos - 10;
                        System.out.println("\nO bracelete emite um barulho… Sinto algo escorrendo do meu ouvido… Sangue… Perco os sentidos por alguns segundos… Estou de pé… Onde estava a balança está escrito “Errado”\n“ha-ha-ha… Cuidado, o próximo erro pode ser fatal.  Suba para o próximo andar, o caminho é longo ha-ha-ha”");
                        System.out.println("\n------------------------------------------------------------------------------------");

                    }
                    break;

                case 1:
                    if (escolha.equals("c")) {
                        System.out.println("\n“Parabéns… me superou mais uma vez... Veremos se conseguirá completar o caminho. Suba para o próximo andar, o caminho ainda é longo”");
                        System.out.println("\n------------------------------------------------------------------------------------");
                    } else {
                        pontos = pontos - 10;
                        System.out.println("\nO bracelete emite um barulho… Sinto algo escorrendo do meu ouvido… Sangue… Perco os sentidos por alguns segundos… Estou de pé… Onde estava a balança está escrito “Errado”\n“ha-ha-ha… Cuidado, o próximo erro pode ser fatal.  Suba para o próximo andar, o caminho é longo ha-ha-ha”");
                        System.out.println("\n------------------------------------------------------------------------------------");

                    }
                    break;

                case 2:
                    if (escolha.equals("b")) {
                        System.out.println("\n“Parabéns… me superou mais uma vez... Veremos se conseguirá completar o caminho. Suba para o próximo andar, o caminho ainda é longo”");
                        System.out.println("\n------------------------------------------------------------------------------------");
                    } else {
                        pontos = pontos - 10;
                        System.out.println("\nO bracelete emite um barulho… Sinto algo escorrendo do meu ouvido… Sangue… Perco os sentidos por alguns segundos… Estou de pé… Onde estava a balança está escrito “Errado”\n“ha-ha-ha… Cuidado, o próximo erro pode ser fatal.  Suba para o próximo andar, o caminho é longo ha-ha-ha”");
                        System.out.println("\n------------------------------------------------------------------------------------");

                    }
                    break;

                case 3:
                    if (escolha.equals("a")) {
                        System.out.println("\n“Parabéns… me superou mais uma vez... Veremos se conseguirá completar o caminho. Suba para o próximo andar, o caminho ainda é longo”");
                        System.out.println("\n------------------------------------------------------------------------------------");
                    } else {
                        pontos = pontos - 10;
                        System.out.println("\nO bracelete emite um barulho… Sinto algo escorrendo do meu ouvido… Sangue… Perco os sentidos por alguns segundos… Estou de pé… Onde estava a balança está escrito “Errado”\n“ha-ha-ha… Cuidado, o próximo erro pode ser fatal.  Suba para o próximo andar, o caminho é longo ha-ha-ha”");
                        System.out.println("\n------------------------------------------------------------------------------------");

                    }
                    break;

                case 4:
                    if (escolha.equals("d")) {
                        System.out.println("\n“Parabéns… me superou mais uma vez... Veremos se conseguirá completar o caminho. Suba para o próximo andar, o caminho ainda é longo”");
                        System.out.println("\n------------------------------------------------------------------------------------");
                    } else {
                        pontos = pontos - 10;
                        System.out.println("\nO bracelete emite um barulho… Sinto algo escorrendo do meu ouvido… Sangue… Perco os sentidos por alguns segundos… Estou de pé… Onde estava a balança está escrito “Errado”\n“ha-ha-ha… Cuidado, o próximo erro pode ser fatal.  Suba para o próximo andar, o caminho é longo ha-ha-ha”");
                        System.out.println("\n------------------------------------------------------------------------------------");

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
                        System.out.println("\n“Não é possível que se lembre de tanto… Quero dizer… Parabéns… me superou mais uma vez... Você está despertando meu interesse. Suba para o próximo andar, o caminho ainda é longo”");
                        System.out.println("\n------------------------------------------------------------------------------------");
                    } else {
                        pontos = pontos - 10;
                        System.out.println("\nO bracelete emite uma luz forte… Quando volto a ver, sinto aquela sensação novamente… Sangue… Não estou enxergando com meu olho esquerdo… Onde estava a balança está escrito “Errado”\n“ha-ha-ha…Logo não aguentará mais. Suba para o próximo andar, o caminho é longo ha-ha-ha”");
                        System.out.println("\n------------------------------------------------------------------------------------");

                    }
                    break;

                case 1:
                    if (escolha.equals("d")) {
                        System.out.println("\n“Não é possível que se lembre de tanto… Quero dizer… Parabéns… me superou mais uma vez... Você está despertando meu interesse. Suba para o próximo andar, o caminho ainda é longo”");
                        System.out.println("\n------------------------------------------------------------------------------------");
                    } else {
                        pontos = pontos - 10;
                        System.out.println("O bracelete emite uma luz forte… Quando volto a ver, sinto aquela sensação novamente… Sangue… Não estou enxergando com meu olho esquerdo… Onde estava a balança está escrito “Errado”\n“ha-ha-ha…Logo não aguentará mais. Suba para o próximo andar, o caminho é longo ha-ha-ha”");
                        System.out.println("\n------------------------------------------------------------------------------------");

                    }
                    break;

                case 2:
                    if (escolha.equals("a")) {
                        System.out.println("\n“Não é possível que se lembre de tanto… Quero dizer… Parabéns… me superou mais uma vez... Você está despertando meu interesse. Suba para o próximo andar, o caminho ainda é longo”");
                        System.out.println("\n------------------------------------------------------------------------------------");
                    } else {
                        pontos = pontos - 10;
                        System.out.println("\nO bracelete emite uma luz forte… Quando volto a ver, sinto aquela sensação novamente… Sangue… Não estou enxergando com meu olho esquerdo… Onde estava a balança está escrito “Errado”\n“ha-ha-ha…Logo não aguentará mais. Suba para o próximo andar, o caminho é longo ha-ha-ha”");
                        System.out.println("\n------------------------------------------------------------------------------------");

                    }
                    break;

                case 3:
                    if (escolha.equals("c")) {
                        System.out.println("\n“Não é possível que se lembre de tanto… Quero dizer… Parabéns… me superou mais uma vez... Você está despertando meu interesse. Suba para o próximo andar, o caminho ainda é longo”");
                        System.out.println("\n------------------------------------------------------------------------------------");
                    } else {
                        pontos = pontos - 10;
                        System.out.println("\nO bracelete emite uma luz forte… Quando volto a ver, sinto aquela sensação novamente… Sangue… Não estou enxergando com meu olho esquerdo… Onde estava a balança está escrito “Errado”\n“ha-ha-ha…Logo não aguentará mais. Suba para o próximo andar, o caminho é longo ha-ha-ha”");
                        System.out.println("\n------------------------------------------------------------------------------------");

                    }
                    break;

                case 4:
                    if (escolha.equals("d")) {
                        System.out.println("\n“Não é possível que se lembre de tanto… Quero dizer… Parabéns… me superou mais uma vez... Você está despertando meu interesse. Suba para o próximo andar, o caminho ainda é longo”");
                        System.out.println("\n------------------------------------------------------------------------------------");
                    } else {
                        pontos = pontos - 10;
                        System.out.println("\nO bracelete emite uma luz forte… Quando volto a ver, sinto aquela sensação novamente… Sangue… Não estou enxergando com meu olho esquerdo… Onde estava a balança está escrito “Errado”\n“ha-ha-ha…Logo não aguentará mais. Suba para o próximo andar, o caminho é longo ha-ha-ha”");
                        System.out.println("\n------------------------------------------------------------------------------------");

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
                        System.out.println("\nO computador apagou… \n“Esses números são de um tempo muito distante… um idioma esquecido… Você realmente está se superando, ver… Digo… Herói… O caminho ainda é longo”");
                        System.out.println("\n------------------------------------------------------------------------------------");
                    } else {
                        pontos = pontos - 10;
                        System.out.println("O computador apagou… Estranhamente nada me feriu… Mas o bracelete mostrou que estou com menos pontos…\n“Já sobreviveu até a metade… Chegará até o final?”");
                        System.out.println("\n------------------------------------------------------------------------------------");
                        if (pontos < 0) {
                            System.out.println("\nSeus pontos de vida chegaram a zero... Sua existência será apagada... ");
                            System.exit(0);
                        }
                    }
                    break;

                case 1:
                    if (escolha.equals("c")) {
                        System.out.println("\nO computador apagou… \n“Esses números são de um tempo muito distante… um idioma esquecido… Você realmente está se superando, ver… Digo… Herói… O caminho ainda é longo”");
                        System.out.println("\n------------------------------------------------------------------------------------");
                    } else {
                        pontos = pontos - 10;
                        System.out.println("O computador apagou… Estranhamente nada me feriu… Mas o bracelete mostrou que estou com menos pontos…\n“Já sobreviveu até a metade… Chegará até o final?”");
                        System.out.println("\n------------------------------------------------------------------------------------");
                        if (pontos < 0) {
                            System.out.println("\nSeus pontos de vida chegaram a zero... Sua existência será apagada... ");
                            System.exit(0);
                        }
                    }
                    break;

                case 2:
                    if (escolha.equals("a")) {
                        System.out.println("\nO computador apagou… \n“Esses números são de um tempo muito distante… um idioma esquecido… Você realmente está se superando, ver… Digo… Herói… O caminho ainda é longo”");
                        System.out.println("\n------------------------------------------------------------------------------------");
                    } else {
                        pontos = pontos - 10;
                        System.out.println("O computador apagou… Estranhamente nada me feriu… Mas o bracelete mostrou que estou com menos pontos…\n“Já sobreviveu até a metade… Chegará até o final?”");
                        System.out.println("\n------------------------------------------------------------------------------------");
                        if (pontos < 0) {
                            System.out.println("\nSeus pontos de vida chegaram a zero... Sua existência será apagada... ");
                            System.exit(0);
                        }
                    }
                    break;

                case 3:
                    if (escolha.equals("b")) {
                        System.out.println("\nO computador apagou… \n“Esses números são de um tempo muito distante… um idioma esquecido… Você realmente está se superando, ver… Digo… Herói… O caminho ainda é longo”");
                        System.out.println("\n------------------------------------------------------------------------------------");
                    } else {
                        pontos = pontos - 10;
                        System.out.println("O computador apagou… Estranhamente nada me feriu… Mas o bracelete mostrou que estou com menos pontos…\n“Já sobreviveu até a metade… Chegará até o final?”");
                        System.out.println("\n------------------------------------------------------------------------------------");
                        if (pontos < 0) {
                            System.out.println("\nSeus pontos de vida chegaram a zero... Sua existência será apagada... ");
                            System.exit(0);
                        }
                    }
                    break;

                case 4:
                    if (escolha.equals("d")) {
                        System.out.println("\nO computador apagou… \n“Esses números são de um tempo muito distante… um idioma esquecido… Você realmente está se superando, ver… Digo… Herói… O caminho ainda é longo”");
                        System.out.println("\n------------------------------------------------------------------------------------");
                    } else {
                        pontos = pontos - 10;
                        System.out.println("\nO computador apagou… Estranhamente nada me feriu… Mas o bracelete mostrou que estou com menos pontos…\n“Já sobreviveu até a metade… Chegará até o final?”");
                        System.out.println("\n------------------------------------------------------------------------------------");
                        if (pontos < 0) {
                            System.out.println("\nSeus pontos de vida chegaram a zero... Sua existência será apagada... ");
                            System.exit(0);
                        }
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
                        System.out.println("\nO computador apagou novamente, mas dessa vez fez um barulho…\n“Acertou mais uma…Como isso é possível?... Digo... Continue. O CAMINHO É LONGO HA-HA-HA”");
                        System.out.println("\n------------------------------------------------------------------------------------");
                    } else {
                        pontos = pontos - 10;
                        System.out.println("\n“Não é vergonha errar… Não é uma linguagem que usamos hoje…Continue, o caminho é longo”");
                        System.out.println("\n------------------------------------------------------------------------------------");
                        if (pontos < 0 || pontos == 0) {
                            System.out.println("\nSeus pontos de vida chegaram a zero... Sua existência será apagada... ");
                            System.exit(0);
                        }
                    }
                    break;

                case 1:
                    if (escolha.equals("c")) {
                        System.out.println("\nO computador apagou novamente, mas dessa vez fez um barulho…\n“Acertou mais uma…Como isso é possível?... Digo... Continue. O CAMINHO É LONGO HA-HA-HA”");
                        System.out.println("\n------------------------------------------------------------------------------------");
                    } else {
                        pontos = pontos - 10;
                        System.out.println("\n“Não é vergonha errar… Não é uma linguagem que usamos hoje…Continue, o caminho é longo”");
                        System.out.println("\n------------------------------------------------------------------------------------");
                        if (pontos < 0 || pontos == 0) {
                            System.out.println("\nSeus pontos de vida chegaram a zero... Sua existência será apagada... ");
                            System.exit(0);
                        }
                    }
                    break;

                case 2:
                    if (escolha.equals("d")) {
                        System.out.println("\nO computador apagou novamente, mas dessa vez fez um barulho…\n“Acertou mais uma…Como isso é possível?... Digo... Continue. O CAMINHO É LONGO HA-HA-HA”");
                        System.out.println("\n------------------------------------------------------------------------------------");
                    } else {
                        pontos = pontos - 10;
                        System.out.println("\n“Não é vergonha errar… Não é uma linguagem que usamos hoje…Continue, o caminho é longo”");
                        System.out.println("\n------------------------------------------------------------------------------------");
                        if (pontos < 0 || pontos == 0) {
                            System.out.println("\nSeus pontos de vida chegaram a zero... Sua existência será apagada... ");
                            System.exit(0);
                        }
                    }
                    break;

                case 3:
                    if (escolha.equals("a")) {
                        System.out.println("\nO computador apagou novamente, mas dessa vez fez um barulho…\n“Acertou mais uma…Como isso é possível?... Digo... Continue. O CAMINHO É LONGO HA-HA-HA”");
                        System.out.println("\n------------------------------------------------------------------------------------");
                    } else {
                        pontos = pontos - 10;
                        System.out.println("\n“Não é vergonha errar… Não é uma linguagem que usamos hoje…Continue, o caminho é longo”");
                        System.out.println("\n------------------------------------------------------------------------------------");
                        if (pontos < 0 || pontos == 0) {
                            System.out.println("\nSeus pontos de vida chegaram a zero... Sua existência será apagada... ");
                            System.exit(0);
                        }
                    }
                    break;

                case 4:
                    if (escolha.equals("d")) {
                        System.out.println("\nO computador apagou novamente, mas dessa vez fez um barulho…\n“Acertou mais uma…Como isso é possível?... Digo... Continue. O CAMINHO É LONGO HA-HA-HA”");
                        System.out.println("\n------------------------------------------------------------------------------------");
                    } else {
                        pontos = pontos - 10;
                        System.out.println("\n“Não é vergonha errar… Não é uma linguagem que usamos hoje…Continue, o caminho é longo”");
                        System.out.println("\n------------------------------------------------------------------------------------");
                        if (pontos < 0 || pontos == 0) {
                            System.out.println("\nSeus pontos de vida chegaram a zero... Sua existência será apagada... ");
                            System.exit(0);
                        }
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
                        System.out.println("\n“AAAAAAAAAAAH… PARABÉNS POR ACERTAR… VERME… HERÓI… CONSEGUIRÁ CONTINUAR? O CAMINHO É LONGO HA-HA-HA”");
                        System.out.println("\n------------------------------------------------------------------------------------");
                    } else {
                        pontos = pontos - 10;
                        System.out.println("\n“Chega disso… mesmo que errou, ainda pode prosseguir…Continue, o caminho é longo”");
                        System.out.println("\n------------------------------------------------------------------------------------");
                        if (pontos < 0 || pontos == 0) {
                            System.out.println("\nSeus pontos de vida chegaram a zero... Sua existência será apagada... ");
                            System.exit(0);
                        }
                    }
                    break;

                case 1:
                    if (escolha.equals("b")) {
                        System.out.println("\n“AAAAAAAAAAAH… PARABÉNS POR ACERTAR… VERME… HERÓI… CONSEGUIRÁ CONTINUAR? O CAMINHO É LONGO HA-HA-HA”");
                        System.out.println("\n------------------------------------------------------------------------------------");
                    } else {
                        pontos = pontos - 10;
                        System.out.println("\n“Chega disso… mesmo que errou, ainda pode prosseguir…Continue, o caminho é longo”");
                        System.out.println("\n------------------------------------------------------------------------------------");
                        if (pontos < 0 || pontos == 0) {
                            System.out.println("\nSeus pontos de vida chegaram a zero... Sua existência será apagada... ");
                            System.exit(0);
                        }
                    }
                    break;

                case 2:
                    if (escolha.equals("c")) {
                        System.out.println("\n“AAAAAAAAAAAH… PARABÉNS POR ACERTAR… VERME… HERÓI… CONSEGUIRÁ CONTINUAR? O CAMINHO É LONGO HA-HA-HA”");
                        System.out.println("\n------------------------------------------------------------------------------------");
                    } else {
                        pontos = pontos - 10;
                        System.out.println("\n“Chega disso… mesmo que errou, ainda pode prosseguir…Continue, o caminho é longo”");
                        System.out.println("\n------------------------------------------------------------------------------------");
                        if (pontos < 0 || pontos == 0) {
                            System.out.println("\nSeus pontos de vida chegaram a zero... Sua existência será apagada... ");
                            System.exit(0);
                        }
                    }
                    break;

                case 3:
                    if (escolha.equals("d")) {
                        System.out.println("\n“AAAAAAAAAAAH… PARABÉNS POR ACERTAR… VERME… HERÓI… CONSEGUIRÁ CONTINUAR? O CAMINHO É LONGO HA-HA-HA”");
                        System.out.println("\n------------------------------------------------------------------------------------");
                    } else {
                        pontos = pontos - 10;
                        System.out.println("\n“Chega disso… mesmo que errou, ainda pode prosseguir…Continue, o caminho é longo”");
                        System.out.println("\n------------------------------------------------------------------------------------");
                        if (pontos < 0 || pontos == 0) {
                            System.out.println("\nSeus pontos de vida chegaram a zero... Sua existência será apagada... ");
                            System.exit(0);
                        }
                    }
                    break;

                case 4:
                    if (escolha.equals("d")) {
                        System.out.println("\n“AAAAAAAAAAAH… PARABÉNS POR ACERTAR… VERME… HERÓI… CONSEGUIRÁ CONTINUAR? O CAMINHO É LONGO HA-HA-HA”");
                        System.out.println("\n------------------------------------------------------------------------------------");
                    } else {
                        pontos = pontos - 10;
                        System.out.println("\n“Chega disso… mesmo que errou, ainda pode prosseguir…Continue, o caminho é longo”");
                        System.out.println("\n------------------------------------------------------------------------------------");
                        if (pontos < 0 || pontos == 0) {
                            System.out.println("\nSeus pontos de vida chegaram a zero... Sua existência será apagada... ");
                            System.exit(0);
                        }
                    }
                    break;
            }
        }
    }

    static void quizEContinuidadeDoJogo_Andar8() {

        String[] perguntasQuiz = perguntas_Andar8(); // perguntasQuiz recebe os desafios da função pergunta_Andar3
        String[][] respostasQuiz = respostas_Andar8(); // respostasQuiz recebe as alternativas das perguntas que está na função respostas_Andar3
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
                        System.out.println("\n- VOCÊ ACERTOU… VER… VERME… VERME... ");
                        System.out.println("\n------------------------------------------------------------------------------------");
                    } else {
                        pontos = pontos - 20;
                        if (pontos < 0 || pontos == 0) {
                            System.out.println("\nSeus pontos de vida chegaram a zero... Sua existência será apagada... ");
                            System.exit(0);
                        }
                        System.out.println("\nEspero a dor, mas ela não vem… O bracelete marca que perdi mais pontos…\nQUAL O PROBLEMA VERME? PRECISA SER CASTIGADO PARA CONTINUAR? SE FRACASSAR AQUI, FAREI VOCÊ IMPLORAR POR ALGO DOCE COMO A DOR!");
                        System.out.println("\n------------------------------------------------------------------------------------");
                    }
                    break;

                case 1:
                    if (escolha.equals("b")) {
                        System.out.println("\n- VOCÊ ACERTOU… VER… VERME… VERME... ");
                        System.out.println("\n------------------------------------------------------------------------------------");
                    } else {
                        pontos = pontos - 20;
                        if (pontos < 0 || pontos == 0) {
                            System.out.println("\nSeus pontos de vida chegaram a zero... Sua existência será apagada... ");
                            System.exit(0);
                        }
                        System.out.println("\nEspero a dor, mas ela não vem… O bracelete marca que perdi mais pontos…\nQUAL O PROBLEMA VERME? PRECISA SER CASTIGADO PARA CONTINUAR? SE FRACASSAR AQUI, FAREI VOCÊ IMPLORAR POR ALGO DOCE COMO A DOR!");
                        System.out.println("\n------------------------------------------------------------------------------------");
                    }
                    break;

                case 2:
                    if (escolha.equals("c")) {
                        System.out.println("\n- VOCÊ ACERTOU… VER… VERME… VERME... ");
                        System.out.println("\n------------------------------------------------------------------------------------");;
                    } else {
                        pontos = pontos - 20;
                        if (pontos < 0 || pontos == 0) {
                            System.out.println("\nSeus pontos de vida chegaram a zero... Sua existência será apagada... ");
                            System.exit(0);
                        }
                        System.out.println("\nEspero a dor, mas ela não vem… O bracelete marca que perdi mais pontos…\nQUAL O PROBLEMA VERME? PRECISA SER CASTIGADO PARA CONTINUAR? SE FRACASSAR AQUI, FAREI VOCÊ IMPLORAR POR ALGO DOCE COMO A DOR!");
                        System.out.println("\n------------------------------------------------------------------------------------");
                    }
                    break;

                case 3:
                    if (escolha.equals("d")) {
                        System.out.println("\n- VOCÊ ACERTOU… VER… VERME… VERME... ");
                        System.out.println("\n------------------------------------------------------------------------------------");
                    } else {
                        pontos = pontos - 20;
                        if (pontos < 0 || pontos == 0) {
                            System.out.println("\nSeus pontos de vida chegaram a zero... Sua existência será apagada... ");
                            System.exit(0);
                        }
                        System.out.println("\nEspero a dor, mas ela não vem… O bracelete marca que perdi mais pontos…\nQUAL O PROBLEMA VERME? PRECISA SER CASTIGADO PARA CONTINUAR? SE FRACASSAR AQUI, FAREI VOCÊ IMPLORAR POR ALGO DOCE COMO A DOR!");
                        System.out.println("\n------------------------------------------------------------------------------------");
                    }
                    break;

                case 4:
                    if (escolha.equals("a")) {
                        System.out.println("\n- VOCÊ ACERTOU… VER… VERME… VERME... ");
                        System.out.println("\n------------------------------------------------------------------------------------");
                    } else {
                        pontos = pontos - 20;
                        if (pontos < 0 || pontos == 0) {
                            System.out.println("\nSeus pontos de vida chegaram a zero... Sua existência será apagada... ");
                            System.exit(0);
                        }
                        System.out.println("\nEspero a dor, mas ela não vem… O bracelete marca que perdi mais pontos…\nQUAL O PROBLEMA VERME? PRECISA SER CASTIGADO PARA CONTINUAR? SE FRACASSAR AQUI, FAREI VOCÊ IMPLORAR POR ALGO DOCE COMO A DOR!");
                        System.out.println("\n------------------------------------------------------------------------------------");
                    }
                    break;
            }
        }
    }

    static void quizEContinuidadeDoJogo_Andar9() {

        String[] perguntasQuiz = perguntas_Andar9(); // perguntasQuiz recebe os desafios da função pergunta_Andar3
        String[][] respostasQuiz = respostas_Andar9(); // respostasQuiz recebe as alternativas das perguntas que está na função respostas_Andar3
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
                        System.out.println("\n- O visor acende… Titã está aos berros…");
                        System.out.println("\n------------------------------------------------------------------------------------");
                    } else {
                        pontos = pontos - 20;
                        if (pontos < 0 || pontos == 0) {
                            System.out.println("\nSeus pontos de vida chegaram a zero... Sua existência será apagada... ");
                            System.exit(0);
                        }
                        System.out.println("\nNovamente não sinto dor… Mas o bracelete mostra q perdi pontos \n- VERME ERROU, VERME ERROU, VERME ERROU...Você errou");
                        System.out.println("\n------------------------------------------------------------------------------------");

                    }
                    break;

                case 1:
                    if (escolha.equals("b")) {
                        System.out.println("\n- O visor acende… Titã está aos berros…");
                        System.out.println("\n------------------------------------------------------------------------------------");
                    } else {
                        pontos = pontos - 20;
                        if (pontos < 0 || pontos == 0) {
                            System.out.println("\nSeus pontos de vida chegaram a zero... Sua existência será apagada... ");
                            System.exit(0);
                        }
                        System.out.println("\nNovamente não sinto dor… Mas o bracelete mostra q perdi pontos \n- VERME ERROU, VERME ERROU, VERME ERROU...Você errou");
                        System.out.println("\n------------------------------------------------------------------------------------");

                    }
                    break;

                case 2:
                    if (escolha.equals("c")) {
                        System.out.println("\n- O visor acende… Titã está aos berros…");
                        System.out.println("\n------------------------------------------------------------------------------------");
                    } else {
                        pontos = pontos - 20;
                        if (pontos < 0 || pontos == 0) {
                            System.out.println("\nSeus pontos de vida chegaram a zero... Sua existência será apagada... ");
                            System.exit(0);
                        }
                        System.out.println("\nNovamente não sinto dor… Mas o bracelete mostra q perdi pontos \n- VERME ERROU, VERME ERROU, VERME ERROU...Você errou");
                        System.out.println("\n------------------------------------------------------------------------------------");

                    }
                    break;

                case 3:
                    if (escolha.equals("d")) {
                        System.out.println("\n- O visor acende… Titã está aos berros…");
                        System.out.println("\n------------------------------------------------------------------------------------");
                    } else {
                        pontos = pontos - 20;
                        if (pontos < 0 || pontos == 0) {
                            System.out.println("\nSeus pontos de vida chegaram a zero... Sua existência será apagada... ");
                            System.exit(0);
                        }
                        System.out.println("\nNovamente não sinto dor… Mas o bracelete mostra q perdi pontos \n- VERME ERROU, VERME ERROU, VERME ERROU...Você errou");
                        System.out.println("\n------------------------------------------------------------------------------------");

                    }
                    break;

                case 4:
                    if (escolha.equals("a")) {
                        System.out.println("\n- O visor acende… Titã está aos berros…");
                        System.out.println("\n------------------------------------------------------------------------------------");
                    } else {
                        pontos = pontos - 20;
                        if (pontos < 0 || pontos == 0) {
                            System.out.println("\nSeus pontos de vida chegaram a zero... Sua existência será apagada... ");
                            System.exit(0);
                        }
                        System.out.println("\nNovamente não sinto dor… Mas o bracelete mostra q perdi pontos \n- VERME ERROU, VERME ERROU, VERME ERROU...Você errou");
                        System.out.println("\n------------------------------------------------------------------------------------");
                    }
                    break;

            }
        }
    }

    static void quizEContinuidadeDoJogo_Andar10() {

        String[] perguntasQuiz = perguntas_Andar10(); // perguntasQuiz recebe os desafios da função pergunta_Andar3
        String[][] respostasQuiz = respostas_Andar10(); // respostasQuiz recebe as alternativas das perguntas que está na função respostas_Andar3
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
                        System.out.println("\nEscuto Titã gritar fora da esfera...\n\n- NÃÃÃÃÃÃÃÃÃÃOOO! CHEGOU AO TOPO VERME! PARABÉNS!\n\nO barulho fora da esfera cessa… Dentro da esfera o bracelete se parte e cai no chão… A esfera começa a iluminar muito.. \nUm filme passa na minha mente… Me lembro de tudo… ");
                    } else {
                        System.out.println("Você errou");
                        System.out.println("\nEscuto Titã gritar uma última vez...SUA EXISTÊNCIA SE APAGA…\n\nQUASE CONSEGUIU VERME… HAHAHA ");
                        System.exit(0);
                    }
                    break;

                case 1:
                    if (escolha.equals("b")) {
                        System.out.println("\nEscuto Titã gritar fora da esfera...\n\n- NÃÃÃÃÃÃÃÃÃÃOOO! CHEGOU AO TOPO VERME! PARABÉNS!\n\nO barulho fora da esfera cessa… Dentro da esfera o bracelete se parte e cai no chão… A esfera começa a iluminar muito.. \nUm filme passa na minha mente… Me lembro de tudo… ");
                    } else {
                        System.out.println("Você errou");
                        System.out.println("\nEscuto Titã gritar uma última vez...SUA EXISTÊNCIA SE APAGA…\n\nQUASE CONSEGUIU VERME… HAHAHA ");
                        System.exit(0);
                    }
                    break;

                case 2:
                    if (escolha.equals("c")) {
                        System.out.println("\nEscuto Titã gritar fora da esfera...\n\n- NÃÃÃÃÃÃÃÃÃÃOOO! CHEGOU AO TOPO VERME! PARABÉNS!\n\nO barulho fora da esfera cessa… Dentro da esfera o bracelete se parte e cai no chão… A esfera começa a iluminar muito.. \nUm filme passa na minha mente… Me lembro de tudo… ");
                    } else {
                        System.out.println("Você errou");
                        System.out.println("\nEscuto Titã gritar uma última vez...SUA EXISTÊNCIA SE APAGA…\n\nQUASE CONSEGUIU VERME… HAHAHA ");
                        System.exit(0);
                    }
                    break;

                case 3:
                    if (escolha.equals("d")) {
                        System.out.println("\nEscuto Titã gritar fora da esfera...\n\n- NÃÃÃÃÃÃÃÃÃÃOOO! CHEGOU AO TOPO VERME! PARABÉNS!\n\nO barulho fora da esfera cessa… Dentro da esfera o bracelete se parte e cai no chão… A esfera começa a iluminar muito.. \nUm filme passa na minha mente… Me lembro de tudo… ");
                    } else {
                        System.out.println("Você errou");
                        System.out.println("\nEscuto Titã gritar uma última vez...SUA EXISTÊNCIA SE APAGA…\n\nQUASE CONSEGUIU VERME… HAHAHA ");
                        System.exit(0);
                    }
                    break;

                case 4:
                    if (escolha.equals("a")) {
                        System.out.println("\nEscuto Titã gritar fora da esfera...\n\n- NÃÃÃÃÃÃÃÃÃÃOOO! CHEGOU AO TOPO VERME! PARABÉNS!\n\nO barulho fora da esfera cessa… Dentro da esfera o bracelete se parte e cai no chão… A esfera começa a iluminar muito.. \nUm filme passa na minha mente… Me lembro de tudo… ");
                    } else {
                        System.out.println("Você errou");
                        System.out.println("\nEscuto Titã gritar uma última vez...SUA EXISTÊNCIA SE APAGA…\n\nQUASE CONSEGUIU VERME… HAHAHA ");
                        System.exit(0);
                    }
                    break;
            }
        }
    }
}
