import java.sql.SQLOutput;

public class Main {
    public static void main(String[] args) {

        int pontos = 0;


        System.out.println("|         Paleontologia         |");


        //Parte das Questões

        Questao q1 = new Questao();
        q1.pergunta = "1. Qual dos dinossauros seguintes é mudialmente conhecido por ter protagonismo em diversos filmes?";
        q1.opcaoA = "A - Quetzalquatrus";
        q1.opcaoB = "B - Tropeugnatos";
        q1.opcaoC = "C - Parassaurolofo";
        q1.opcaoD = "D - Tyranossaurus Rex";
        q1.opcaoE = "E - Utaraptor";
        q1.correta = "D";

        System.out.println("-----------------------------------------------------------");

        q1.escrevaQuestao();
        if (q1.isCorreta(q1.leiaResposta())){
            pontos++;
        }

        Questao q2 = new Questao();
        q2.pergunta = "2. Como se chamam os resquicios de animais pré historicos encontrados?";
        q2.opcaoA = "A - Fosseis";
        q2.opcaoB = "B - Difuntos";
        q2.opcaoC = "C - Mumías";
        q2.opcaoD = "D - Peter Jordan";
        q2.opcaoE = "E - corpos decompostos";
        q2.correta = "A";

        System.out.println("-----------------------------------------------------------");

        q2.escrevaQuestao();
        if (q2.isCorreta(q2.leiaResposta())) {
            pontos++;
        }

        Questao q3 = new Questao();
        q3.pergunta = "3. Qual o nome do animal pré-historico áquatico sendo reconhecido como o maior predador marinho conhecido?";
        q3.opcaoA = "A - plesiosaurus";
        q3.opcaoB = "B - Lula colossal";
        q3.opcaoC = "C - Orcas";
        q3.opcaoD = "D - Cachalotes";
        q3.opcaoE = "E - Megalodon";
        q3.correta = "E";

        System.out.println("-----------------------------------------------------------");

        q3.escrevaQuestao();
        if (q3.isCorreta(q3.leiaResposta())) {
            pontos++;
        }

        Questao q4 = new Questao();
        q4.pergunta = "4. Qual era a principal do triceratops?";
        q4.opcaoA = "A - Chifres frontais";
        q4.opcaoB = "B - Cauda";
        q4.opcaoC = "C - Seu bico";
        q4.opcaoD = "D - Sua forte pele grossa";
        q4.opcaoE = "E - Nenhuma das anteriores";
        q4.correta = "C";

        System.out.println("-----------------------------------------------------------");

        q4.escrevaQuestao();
        if (q4.isCorreta(q4.leiaResposta())) {
            pontos++;
        }

        Questao q5 = new Questao();
        q5.pergunta = "5. Qual dos animais pré-historicos abaixo viveu a mesma época que a construção das piramides do Egito?";
        q5.opcaoA = "A - Dimorfodontes";
        q5.opcaoB = "B - Mammoths/mamutes";
        q5.opcaoC = "C - Velociraptores";
        q5.opcaoD = "D - Megalodontes";
        q5.opcaoE = "E - Mosassaurus";
        q5.correta = "B";

        System.out.println("-----------------------------------------------------------");

        q5.escrevaQuestao();
        if (q5.isCorreta(q5.leiaResposta())) {
            pontos++;
        }

        Questao q6 = new Questao();
        q6.pergunta = "6.  Qual o nome se da ao ramo da ciência que estuda as rochas?";
        q6.opcaoA = "A - Biologia";
        q6.opcaoB = "B - Engenharia de Software";
        q6.opcaoC = "C - Geologia";
        q6.opcaoD = "D - paleontologia";
        q6.opcaoE = "E - Historia";
        q6.correta = "C";

        System.out.println("-----------------------------------------------------------");

        q6.escrevaQuestao();
        if (q6.isCorreta(q6.leiaResposta())) {
            pontos++;
        }

        Questao q7 = new Questao();
        q7.pergunta = "7. Na grande maioria dos animais pré-historicos representados no mundo da ficção, os tamanhos realmente seguem o tamanho real de cada um?";
        q7.opcaoA = "A - Sim, todos os filmes, séries, jogos, etc, seguem o tamanho real";
        q7.opcaoB = "B - Não, todos os tamanhos não são reais e chegam a ser desproporcionais";
        q7.opcaoC = "C - Alguns filmes, documentarios, livros os animais tem os mesmos padrões de tamanho aproximados aos da realidade, mas alguns são irrealistas e desproporcionais";
        q7.opcaoD = "D - Os fosseis que seguem os padrões da ficção";
        q7.opcaoE = "E - Nenhuma das anteriores";
        q7.correta = "C";

        System.out.println("-----------------------------------------------------------");

        q7.escrevaQuestao();
        if (q7.isCorreta(q7.leiaResposta())) {
            pontos++;
        }

        Questao q8 = new Questao();
        q8.pergunta = "8. Qual dos animais é reconhecido como Lagarto Foice?";
        q8.opcaoA = "A - Therezinossauros";
        q8.opcaoB = "B - Estegossauros";
        q8.opcaoC = "C - Oxalaia";
        q8.opcaoD = "D - Beelzebufo";
        q8.opcaoE = "E - Titanoboa";
        q8.correta = "A";

        System.out.println("-----------------------------------------------------------");

        q8.escrevaQuestao();
        if (q8.isCorreta(q8.leiaResposta())) {
            pontos++;
        }

        Questao q9 = new Questao();
        q9.pergunta = "9. Durante a transição do Permiano para o Triássico, qual evento geológico teve papel crucial na maior extinção em massa da história da Terra?";
        q9.opcaoA = "A - As erupções vulcânicas em larga escala da Trapps Siberianas";
        q9.opcaoB = "B - O impacto de um grande asteroide na região do Golfo do México";
        q9.opcaoC = "C - O resfriamento global súbito causado por glaciação";
        q9.opcaoD = "D - A abertura inicial do oceano Atlântico";
        q9.opcaoE = "E - A colisão entre Gondwana e Laurásia";
        q9.correta = "A";

        System.out.println("-----------------------------------------------------------");

        q9.escrevaQuestao();
        if (q9.isCorreta(q9.leiaResposta())) {
            pontos++;
        }

        Questao q10 = new Questao();
        q10.pergunta = "10. Os cinodontes, frequentemente apontados como ancestrais dos mamíferos, apresentavam qual dessas características transicionais??";
        q10.opcaoA = "A - Mandíbula formada por múltiplos ossos";
        q10.opcaoB = "B - Dentes indiferenciados";
        q10.opcaoC = "C - Ausência de palato secundário";
        q10.opcaoD = "D - Ossos do ouvido médio derivados dos ossos da mandíbula";
        q10.opcaoE = "E - Escamas epidérmicas ceratinizadas";
        q10.correta = "D";

        System.out.println("-----------------------------------------------------------");

        q10.escrevaQuestao();
        if (q10.isCorreta(q10.leiaResposta())) {
            pontos++;
        }

        Questao q11 = new Questao();
        q11.pergunta = "11. Qual método de datação radiométrica é mais adequado para datar rochas vulcânicas associadas a fósseis mesozoicos?";
        q11.opcaoA = "A - Potássio-Argônio (K-Ar)";
        q11.opcaoB = "B - Carbono-14";
        q11.opcaoC = "C - Urânio-Chumbo (U-Pb)";
        q11.opcaoD = "D - Samário-Neodímio (Sm-Nd)";
        q11.opcaoE = "E - Rubídio-Estrôncio (Rb-Sr)";
        q11.correta = "A";

        System.out.println("-----------------------------------------------------------");

        q11.escrevaQuestao();
        if (q11.isCorreta(q11.leiaResposta())) {
            pontos++;
        }

        Questao q12 = new Questao();
        q12.pergunta = "12. O fóssil Archaeopteryx lithographica, do Jurássico Superior, é notável por";
        q12.opcaoA = "A - Ser o primeiro dinossauro com penugem filamentosa";
        q12.opcaoB = "B - Ser uma ave com características reptilianas, como dentes e cauda óssea";
        q12.opcaoC = "C - Ser o ancestral direto de todos os mamíferos";
        q12.opcaoD = "D - Conter impressões de tecidos moles de anfíbios";
        q12.opcaoE = "E - Ser o primeiro fóssil com DNA preservado";
        q12.correta = "B";

        System.out.println("-----------------------------------------------------------");

        q12.escrevaQuestao();
        if (q12.isCorreta(q12.leiaResposta())) {
            pontos++;
        }

        Questao q13 = new Questao();
        q13.pergunta = "13. Os primeiros fósseis reconhecíveis no registro geológico são";
        q13.opcaoA = "A - Trilobitas";
        q13.opcaoB = "B - Cianobactérias em estromatólitos";
        q13.opcaoC = "C - Arqueociatários";
        q13.opcaoD = "D - Espongiários";
        q13.opcaoE = "E - Fungos primitivos";
        q13.correta = "B";

        System.out.println("-----------------------------------------------------------");

        q13.escrevaQuestao();
        if (q13.isCorreta(q13.leiaResposta())) {
            pontos++;
        }

        Questao q14 = new Questao();
        q14.pergunta = "Entre as seguintes características, qual é exclusiva de mamíferos verdadeiros (classe Mammalia) e não aparece em seus ancestrais cinodontes?";
        q14.opcaoA = "A - Ossos do ouvido médio separados da mandíbula";
        q14.opcaoB = "B - Dentes diferenciados (heterodontia)";
        q14.opcaoC = "C - Palato secundário completo";
        q14.opcaoD = "D - Articulação dentário–esquamosal";
        q14.opcaoE = "E - Presença de pelos";
        q14.correta = "E";

        System.out.println("-----------------------------------------------------------");

        q14.escrevaQuestao();
        if (q14.isCorreta(q14.leiaResposta())) {
            pontos++;
        }

        Questao q15 = new Questao();
        q15.pergunta = "15. O isolamento do supercontinente Gondwana durante o Mesozóico favoreceu a evolução de faunas únicas. Qual grupo de dinossauros é típico desse contexto geográfico??";
        q15.opcaoA = "A - Hadrossaurídeos";
        q15.opcaoB = "B - Ceratopsídeos";
        q15.opcaoC = "C - Abelissaurídeos";
        q15.opcaoD = "D - Dromeossaurídeos";
        q15.opcaoE = "E - Sauropelta";
        q15.correta = "C";

        System.out.println("-----------------------------------------------------------");

        q15.escrevaQuestao();
        if (q15.isCorreta(q15.leiaResposta())) {
            pontos++;
        }

        System.out.println("-----------------------------------------------------------");

        System.out.println("Você conseguiu acertar "+pontos+" pontos!");
        System.out.println("Total: " + (float)pontos*100/15 + "%");

        System.out.println("-----------------------------------------------------------");

    }
}