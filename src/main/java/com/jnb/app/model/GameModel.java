package com.jnb.app.model;

import java.util.ArrayList;
import java.util.List;

public class GameModel {

    public String acrostico(String word) {
        StringBuilder caracteres = new StringBuilder();

        String[] col = {"Alohomora", "Accio", "Anapneo", "Animago", "Ascendio", "Albus", "Bellatrix", "Bombarda", "Braquium", "Brachiabindo", "Bublio", "Bamboé", "Crucio", "Clypeus", "Cave", "Confringo", "Confundus", "Confractus", "Draconifors", "Dragão", "Diabrete", "Duklifors", "Diffindo", "Deletrius", "Episkey", "Expecto", "Expelliarmus", "Estupefaça", "Estupore", "Evanesco", "Flipendo", "Finite", "Fidelius", "Ferula", "Finestra", "Furnunculus", "Geminio", "Godric", "Gui Weasley", "Gryffindor", "Glacius", "Glisseo", "Horcrux", "Harry", "Homenum", "Hypnus", "Herbivicus", "Homorfo", "Imperius", "Incarcerous", "Incendio", "Impedimenta", "Immobilus", "Impervius", "James Potter", "Jorge Weasley", "James Sirius Potter", "Kreacher", "Karkaroff", "Knight-Bus", "Kelpie", "Krum", "Knarl", "Lumus", "Legilimency", "Levicorpus", "Locomotor", "Lorem", "Llaguz", "Morsmordre", "Mannaz", "Mobilicorpus", "Mobiliarbus", "Mandrake", "Marauder's Map", "Nox", "Nigel", "Narcisa", "Nauthiz", "Nargle", "Natália McDonald", "Obliviate", "Orchideous", "Ofidioglota", "Ollivander's", "Odin", "Othila",  "Petrificus", "Patrono", "Pericullum", "Peter", "Petunia", "Perht", "Quadribol", "Quidditch", "Quietus", "Quintipede", "Quirrel", "Quirke", "Riddikulus", "Riddle", "Revelio", "Reducto", "Raido", "Ravenclaw", "Sectumsempra", "Salvio", "Serpensortia", "Slytherin", "Sowelu", "Sinistro", "Transfiguração", "Trasgo", "Travessa do Tranco", "Trato das Criaturas Mágicas", "Thomas", "Toothill", "Umfraville", "Uruz", "Unicórnio", "Uediuósi", "Umbridge", "Umgubular", "Vera-Verto", "Vulnera", "Visgo", "Venomous-Tentacula", "Veela", "Vagem", "Wizengamot", "Wingardium", "Weasley", "Wand", "Wunjo", "Wilkes", "Xenophilius", "Xarope", "Yaxley", "Youdle", "Yeti", "Yen", "Zabini", "Zeller", "Zamojski"};
        ArrayList<String> collection = new ArrayList<String>(List.of(col));

        word = unaccent(word);

        for (int i = 0; i < collection.size(); i++) {
            if (word.equalsIgnoreCase( unaccent(collection.get(i)) )) {
                collection.remove(collection.get(i));
            }
        }
        for (int i = 0; i < word.length(); i++) {
            for (String s : collection) {
                if (unaccent(s.toLowerCase()).charAt(0) == word.charAt(i)) {
                    caracteres.append(s).append('\n');
                    collection.remove(s);
                    break;
                }
            }
        }
        word = caracteres.toString();

        return word;
    }

    public String compor(String word) {
        StringBuilder caracteres = new StringBuilder();

//      Cria a String e insere as letras uma a uma até formar a frase
        for (int i = 1; i <= word.length(); i++) {
            caracteres.append("\n").append(word, 0, i);
        }
//      Na String acima pode haver duplicatas geradas por frases com espaco, portanto tiraremos as duplicatas

//      Neste array teremos todas as palavras presentes na string separadamente
        String[] splitString = caracteres.toString().split("\n");

        caracteres = new StringBuilder();

//      Realiza um looping em cada string do array e caso nao seja identica a string anterior ao remover seus espacos, sera adicionada na string principal
        for (int i = 0; i < splitString.length; i++) {

            if (i > 0 && !splitString[i].trim().equals(splitString[i-1])){
                caracteres.append('\n').append(splitString[i]);
            }
        }
        word = caracteres.toString();

        return word;
    }

    public String comporDecompor(String word) {
        StringBuilder caracteres = new StringBuilder();
        caracteres.append(compor(word));

        word = word.substring(0, word.length()-1);

        while (!word.isEmpty()) {
            caracteres.append("\n").append(word);
            if (word.charAt(word.length()-1) == ' '){
                word = word.substring(0, word.length()-1);
            }
            word = word.substring(0, word.length()-1);
        }
        word = caracteres.toString();

        return word;
    }

    public String decompor(String word) {
        StringBuilder caracteres = new StringBuilder();

        while (!word.isEmpty()) {
            caracteres.append("\n").append(word);
            if (word.charAt(word.length()-1) == ' '){
                word = word.substring(0, word.length()-1);
            }
            word = word.substring(0, word.length()-1);
        }
        word = caracteres.toString();

        return word;
    }

    public String decomporCompor(String word) {
        StringBuilder caracteres = new StringBuilder();

        caracteres.append(decompor(word));
        caracteres.delete(caracteres.length()-1, caracteres.length());
        caracteres.append(compor(word).replaceFirst("\n",""));

        word = caracteres.toString();

        return word;
    }

    public String desmembrando(String word) {
        StringBuilder caracteres = new StringBuilder();

        while (!word.isEmpty()) {
            caracteres.append(word);
            word = word.substring(1);
            caracteres.append('\n');
        }
        word = caracteres.toString();

        return word;
    }

    public String espelho(String word) {
        word = new StringBuilder(word).reverse().toString();
        return word;
    }

    public String geminio(String word) {
        StringBuilder caracteres = new StringBuilder();

        for(int i = 0; i < word.length(); i++) {
            String caractere = "";
            char a = word.charAt(i);

           if (a != ' ') {
               caractere = a + "" + a;
           } else {
               caractere = a+"";
           }

           caracteres.append(caractere);
        }
        word = caracteres.toString();

        return word;
    }

    public String malditoTeto(String word) {
        StringBuilder caracteres = new StringBuilder();

        String[] words = word.toUpperCase().split(" ");
        int remove = 0;
        boolean removed = true;

        while (removed) {

            for (String s : words) {
                if (remove < s.length()) {
                    caracteres.append(s, 0, s.length() - remove).append('\n');
                    removed = true;
                } else {
                    removed = false;
                }
            }
            remove++;
        }

        word = caracteres.toString();

        return word;
    }

    public String pontilhado(String word) {
        StringBuilder caracteres = new StringBuilder();

        for(int i = 0; i < word.length(); i++) {
            String caractere = "";
            char a = word.charAt(i);

            caractere = a + ".";

            caracteres.append(caractere);
        }
        word = caracteres.toString();

        return word;
    }

    public String separador(String word) {
        StringBuilder caracteres = new StringBuilder();

        for(int i = 0; i < word.length(); i++) {
            String caractere = "";
            char a = word.charAt(i);

            caractere = a + " ";

            caracteres.append(caractere);
        }
        word = caracteres.toString();

        return word;
    }

    public String tNove(String word) {
        ArrayList<String> patterns = new ArrayList<>(8);

        patterns.add("a-b-c");
        patterns.add("d-e-f");
        patterns.add("g-h-i");
        patterns.add("j-k-l");
        patterns.add("m-n-o");
        patterns.add("p-q-r");
        patterns.add("s-t-u");
        patterns.add("v-w-x-y-z");
        word = unaccent(word);

        for (int i = 0; i < patterns.size(); i++) {
            String[] chars = patterns.get(i).split("-");
            for (String c : chars) {
                if (word.contains(c)) {
                    word = word.replaceAll(c, String.valueOf(i+2));
                }
            }
        }
        return word;
    }

    public String torreDupla (String word) {
        StringBuilder caracteres = new StringBuilder();
        word = word.toUpperCase();

        for (int i = 0; i < word.length(); i++) {
            char c = word.charAt(i);
            caracteres.append(String.format("%c%c\n", c, c));
        }
        word = caracteres.toString();

        return word;
    }

    public String zigZag (String word) {
        StringBuilder caracteres = new StringBuilder();
        for (int i = 0; i < word.length(); i++) {
            if (i % 2 == 0) {
                char c = word.charAt(i);
                caracteres.append(c).append("\n ");
            } else {
                char c = word.charAt(i);
                caracteres.append(c).append("\n");
            }
        }
        word = caracteres.toString();

        return word;
    }


    private String unaccent(String word) {
        word = word.toLowerCase();
        String[] accents = {"á", "é", "í", "ó", "ú", "à", "è", "ì", "ò", "ù", "ã", "õ", "â", "ê", "î", "ô", "û", "ä", "ë", "ï", "ö", "ü", "ç"};
        String[] noaccents = {"a", "e", "i", "o", "u", "a", "e", "i", "o", "u", "a", "o", "a", "e", "i", "o", "u", "a", "e", "i", "o", "u", "c"};

        for (int i = 0; i < accents.length; i++) {
            if (word.contains(accents[i])) {
                word = word.replaceAll(accents[i], noaccents[i]);
            }
        }

        return word;
    }
}
