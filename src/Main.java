public class Main {
    public static void main(String[] args) {



        int acertos = 0;
        int totalQuestoes = 15; // variavel para o total de questões

        Questao[] questao = new Questao[
                totalQuestoes
                ];


        System.out.println("*----Paleontologia----*");
        // Questão 1
        questao[0] = new Questao();
        questao[0].pergunta = "1. Qual dos dinossauros seguintes é mudialmente conhecido por ter protagonismo em diversos filmes?";
        questao[0].opcaoA = "A - Quetzalquatrus";
        questao[0].opcaoB = "B - Tropeugnatos";
        questao[0].opcaoC = "C - Parassaurolofo";
        questao[0].opcaoD = "D - Tyranossaurus Rex";
        questao[0].opcaoE = "E - Utaraptor";
        questao[0].correta = "D";

        // Questão 2
        questao[1] = new Questao();
        questao[1].pergunta = "2. Como se chamam os resquicios de animais pré historicos encontrados?";
        questao[1].opcaoA = "A - Fosseis";
        questao[1].opcaoB = "B - Difuntos";
        questao[1].opcaoC = "C - Mumías";
        questao[1].opcaoD = "D - Peter Jordan";
        questao[1].opcaoE = "E - corpos decompostos";
        questao[1].correta = "A";

        // Questão 3
        questao[2] = new Questao();
        questao[2].pergunta = "3. Qual o nome do animal pré-historico áquatico sendo reconhecido como o maior predador marinho conhecido";
        questao[2].opcaoA = "A - plesiosaurus";
        questao[2].opcaoB = "B - Lula colossal";
        questao[2].opcaoC = "C - Orcas";
        questao[2].opcaoD = "D - Cachalotes";
        questao[2].opcaoE = "E - Megalodon";
        questao[2].correta = "E";

        // Questão 4
        questao[3] = new Questao();
        questao[3].pergunta = "4. Qual era a principal do triceratops?";
        questao[3].opcaoA = "A - Chifres frontais";
        questao[3].opcaoB = "B - Cauda";
        questao[3].opcaoC = "C - Seu bico";
        questao[3].opcaoD = "D - Sua forte pele grossa";
        questao[3].opcaoE = "E - Nenhuma das anteriores";
        questao[3].correta = "C";

        // Questão 5
        questao[4] = new Questao();
        questao[4].pergunta = "5. Qual dos animais pré-historicos abaixo viveu a mesma época que a construção das piramides do Egito?";
        questao[4].opcaoA = "A - Dimorfodontes";
        questao[4].opcaoB = "B - Mammoths/mamutes";
        questao[4].opcaoC = "C - Velociraptores";
        questao[4].opcaoD = "D - Megalodontes";
        questao[4].opcaoE = "E - Mosassaurus";
        questao[4].correta = "B";

        // Questão 6
        questao[5] = new Questao();
        questao[5].pergunta = "6.  Qual o nome se da ao ramo da ciência que estuda as rochas?";
        questao[5].opcaoA = "A - Biologia";
        questao[5].opcaoB = "B - Engenharia de Software";
        questao[5].opcaoC = "C - Geologia";
        questao[5].opcaoD = "D - paleontologia\"";
        questao[5].opcaoE = "E - Historia";
        questao[5].correta = "C";

        // Questão 7
        questao[6] = new Questao();
        questao[6].pergunta = "7. Na grande maioria dos animais pré-historicos representados no mundo da ficção, os tamanhos realmente seguem o tamanho real de cada um?";
        questao[6].opcaoA = "A - Sim, todos os filmes, séries, jogos, etc, seguem o tamanho real";
        questao[6].opcaoB = "B - Não, todos os tamanhos não são reais e chegam a ser desproporcionais";
        questao[6].opcaoC = "C - Alguns filmes, documentarios, livros os animais tem os mesmos padrões de tamanho aproximados aos da realidade, mas alguns são irrealistas e desproporcionais";
        questao[6].opcaoD = "D - Os fosseis que seguem os padrões da ficção";
        questao[6].opcaoE = "E - Nenhuma das anteriores";
        questao[6].correta = "C";

        // Questão 8
        questao[7] = new Questao();
        questao[7].pergunta = "8. Qual dos animais é reconhecido como Lagarto Foice?";
        questao[7].opcaoA = "A - Therezinossauros";
        questao[7].opcaoB = "B - Estegossauros";
        questao[7].opcaoC = "C - Oxalaia";
        questao[7].opcaoD = "D - Beelzebufo";
        questao[7].opcaoE = "E - Titanoboa";
        questao[7].correta = "A";

        // Questão 9
        questao[8] = new Questao();
        questao[8].pergunta = "9. Durante a transição do Permiano para o Triássico, qual evento geológico teve papel crucial na maior extinção em massa da história da Terra?";
        questao[8].opcaoA = "A - As erupções vulcânicas em larga escala da Trapps Siberianas";
        questao[8].opcaoB = "B - O impacto de um grande asteroide na região do Golfo do México";
        questao[8].opcaoC = "C - O resfriamento global súbito causado por glaciação";
        questao[8].opcaoD = "D - A abertura inicial do oceano Atlântico";
        questao[8].opcaoE = "E - A colisão entre Gondwana e Laurásia";
        questao[8].correta = "A";

        // Questão 10
        questao[9] = new Questao();
        questao[9].pergunta = "10. Os cinodontes, frequentemente apontados como ancestrais dos mamíferos, apresentavam qual dessas características transicionais??";
        questao[9].opcaoA = "A - Mandíbula formada por múltiplos ossos";
        questao[9].opcaoB = "B - Dentes indiferenciados";
        questao[9].opcaoC = "C - Ausência de palato secundário";
        questao[9].opcaoD = "D - Ossos do ouvido médio derivados dos ossos da mandíbula";
        questao[9].opcaoE = "E - Escamas epidérmicas ceratinizadas ";
        questao[9].correta = "D";

        // Questão 11
        questao[10] = new Questao();
        questao[10].pergunta = "11. Qual método de datação radiométrica é mais adequado para datar rochas vulcânicas associadas a fósseis mesozoicos";
        questao[10].opcaoA = "A - Potássio-Argônio (K-Ar)";
        questao[10].opcaoB = "B - Carbono-14";
        questao[10].opcaoC = "C - Urânio-Chumbo (U-Pb)";
        questao[10].opcaoD = "D - Samário-Neodímio (Sm-Nd)";
        questao[10].opcaoE = "E - Rubídio-Estrôncio (Rb-Sr)";
        questao[10].correta = "A";

        // Questão 12
        questao[11] = new Questao();
        questao[11].pergunta = "12. O fóssil Archaeopteryx lithographica, do Jurássico Superior, é notável por";
        questao[11].opcaoA = "A - Ser o primeiro dinossauro com penugem filamentosa";
        questao[11].opcaoB = "B - Ser uma ave com características reptilianas, como dentes e cauda óssea";
        questao[11].opcaoC = "C - Ser o ancestral direto de todos os mamíferos";
        questao[11].opcaoD = "D - Conter impressões de tecidos moles de anfíbios";
        questao[11].opcaoE = "E - Ser o primeiro fóssil com DNA preservado\"";
        questao[11].correta = "B";

        // Questão 13
        questao[12] = new Questao();
        questao[12].pergunta = "13. Os primeiros fósseis reconhecíveis no registro geológico são";
        questao[12].opcaoA = "A - Trilobitas";
        questao[12].opcaoB = "B - Cianobactérias em estromatólitos";
        questao[12].opcaoC = "C - Arqueociatários";
        questao[12].opcaoD = "D - Espongiários";
        questao[12].opcaoE = "E - Fungos primitivos";
        questao[12].correta = "B";

        // Questão 14
        questao[13] = new Questao();
        questao[13].pergunta = "14 - Entre as seguintes características, qual é exclusiva de mamíferos verdadeiros (classe Mammalia) e não aparece em seus ancestrais cinodontes?";
        questao[13].opcaoA = "A - Ossos do ouvido médio separados da mandíbula\"";
        questao[13].opcaoB = "B - Dentes diferenciados (heterodontia)";
        questao[13].opcaoC = "C - Palato secundário completo";
        questao[13].opcaoD = "D - Articulação dentário–esquamosal";
        questao[13].opcaoE = "E - Presença de pelos";
        questao[13].correta = "E";

        // Questão 15
        questao[14] = new Questao();
        questao[14].pergunta = "15. O isolamento do supercontinente Gondwana durante o Mesozóico favoreceu a evolução de faunas únicas. Qual grupo de dinossauros é típico desse contexto geográfico??";
        questao[14].opcaoA = "A - Hadrossaurídeos";
        questao[14].opcaoB = "B - Ceratopsídeos";
        questao[14].opcaoC = "C - Abelissaurídeos";
        questao[14].opcaoD = "D - Dromeossaurídeos";
        questao[14].opcaoE = "E - Sauropelta";
        questao[14].correta = "C";


        System.out.println("========================================");
        System.out.println("   BEM-VINDO AO SISTEMA DE QUIZ!");
        System.out.println("========================================");
        System.out.println("Você responderá 15 questões.");
        System.out.println("Boa sorte!\n");


        for (int i = 0; i < totalQuestoes; i++) {
            questao[i].escrevaQuestao();


            String respostaUsuario = questao[i].leiaResposta();


            if (questao[i].isCorreta(respostaUsuario)) {
                acertos++;
            }
        }

        // Calculo de acertos
        double porcentagem = ((double) acertos / totalQuestoes) * 100;

        //
        System.out.println("========================================");
        System.out.println("        RESULTADO FINAL");
        System.out.println("========================================");
        System.out.println("Total de questões: " + totalQuestoes);
        System.out.println("Total de acertos: " + acertos);
        System.out.printf("Porcentagem de acertos: %.2f%%\n", porcentagem);
        System.out.println("========================================");

        System.out.println("========================================");
    }
}


