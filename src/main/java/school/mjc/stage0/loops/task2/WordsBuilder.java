package school.mjc.stage0.loops.task2;

public class WordsBuilder {

    public void buildPhrase(char... chars) {
        int i = 0;
        String txt = "";
        while (i < chars.length) {
            txt += String.valueOf(chars, i, 1);
            i++;
        }
        System.out.print(txt);

    }
    }