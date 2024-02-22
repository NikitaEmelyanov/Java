package Program;

public class Alphabet {
    public static void main(String[] args) {
        String [][] srtings = new String[4][6];
        String [][] strings = {{"Aa" , "Bb" , "Cc", "Dd"},
                               {"Ee" , "Ff" , "Gg", "Hh"},
                               {"Ii" , "Jj" , "Kk", "Ll"},
                               {"Mm" , "Nn" , "Oo", "Pp"},
                               {"Qq" , "Vv" , "Ww", "Xx"},
                               {"Yy" , "Zz" }};
        System.out.println("English Alphabet");
        System.out.print(strings[0][0] + "  " + strings[0][1] + "  " + strings[0][2] + "  " + strings[0][3] + "  " + "\n" +
                         strings[1][0] + "  " + strings[1][1] + "  " + strings[1][2] + "  " + strings[1][3] + "  " + "\n" +
                         strings[2][0] + "  " + strings[2][1] + "  " + strings[2][2] + "  " + strings[2][3] + "  " + "\n" +
                         strings[3][0] + "  " + strings[3][1] + "  " + strings[3][2] + "  " + strings[3][3] + "  " + "\n" +
                         strings[4][0] + "  " + strings[4][1] + "  " + strings[4][2] + "  " + strings[4][3] + "  " + "\n" +
                         strings[5][0] + "  " + strings[5][1] + "  " );


    }
}
