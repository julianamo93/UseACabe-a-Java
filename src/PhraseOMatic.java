public class PhraseOMatic {

    public static void main (String[] args) {
        //primeiro criamos as palavras aleatórias para armazenar nas variáveis seguintes.
        String[] worldListOne = {"24/7", "várias camadas", "30.000 pés", "B-to-B", "toos ganham", "front-end", "baseado na web",
        "difundido", "inteligente", "seis sigma", "caminho crítico", "dinâmico"};

        String[] worldListTwo = {"Habilitado", "adesivo", "valor agregado", "orientado", "central", "distribuído", "agrupado",
        "solidificado", "independente da máquina", "posicionado", "em rede", "dedicado", "alavancado", "alinhado", "destinado",
        "compartilhado", "cooperativo", "acelerado"};

        String[] worldListThree = {"processo", "ponto máximo", "solução", "arquitetura", "habilitação mo núcleo", "estratégia",
        "mindshare", "portal", "espaço", "visão", "paradigma", "missão"};

        //descobrindo quantas palavras existem em cada lista
        int oneLength = worldListOne.length;
        int twoLength = worldListTwo.length;
        int threeLength = worldListThree.length;

        //então geramos três números aleatórios
        int rand1 = (int) (Math.random() * oneLength);
        int rand2 = (int) (Math.random() * twoLength);
        int rand3 = (int) (Math.random() * threeLength);

        //construímos uma frase concatenando as variáveis
        String phrase = worldListOne[rand1] + " " + worldListTwo[rand2] + " " + worldListThree[rand3] + ".";

        //exibimos a frase
        System.out.println("Precisamos de " + phrase);

    }
}
