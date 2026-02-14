public class Hello {
    
    public static void main(String[] args) {

        weave(solid(11, 11));
        System.out.println();

        weave(horizontal(11, 11));
        System.out.println();

        weave(vertical(11, 11));
        System.out.println();

        weave(diagonal(11, 11));
        System.out.println();

        weave(plaid(11, 11));
        System.out.println();

        weave(argyle(11, 11));
        System.out.println();
    }

    public static void weave(String[][] rug) {
        // Method to print 2D emoji arrays.
        for(int i = 0; i < rug.length; i++) {
            for(int j = 0; j < rug[i].length; j++) {
                System.out.print(rug[i][j]);
            }
           
            System.out.println("");
        }
    }

    public static String[][] solid(int width, int height) {
        String[][] rug = new String[width][height];

        for(int i = 0; i < rug.length; i++) {
            for(int j = 0; j < rug[i].length; j++) {
                rug[i][j] = "🪻";
            }
        }

        return rug;
    }
    


   public static String[][] horizontal(int width, int height) { //bad
        String[][] rug = new String[width][height];
        for(int i = 0; i < rug.length; i++) {
            for(int j = 0; j < rug[i].length; j++) {
                if(i % 2 == 0) {
                    rug[i][j] = "🌜";
                }  else {
                    rug[i][j] = "🌛";
                }
            }
        }

            return rug;
   }

        public static String[][] vertical(int width, int height) {
        String[][] rug = new String[width][height];

        for (int i = 0; i < rug.length; i++) {
            for (int j = 0; j < rug[i].length; j++) {
                if (j % 2 == 0) {
                    rug[i][j] = "🙉";
                } else {
                    rug[i][j] = "🙈";
                }
            }
        }

        return rug;
    }

public static String[][] diagonal(int width, int height) {
        String[][] rug = new String[width][height];

        for (int i = 0; i < rug.length; i++) {
            for (int j = 0; j < rug[i].length; j++) {
                if (i == j) {
                    rug[i][j] = "🌜";
                } else {
                    rug[i][j] = "🌛";
                }
            }
        }

        return rug;
    }

public static String[][] plaid(int width, int height) { // bad
        String[][] rug = new String[width][height];

        for (int i = 0; i < rug.length; i++) {
            for (int j = 0; j < rug[i].length; j++) {
                if (i % 3 == 0 || j % 3 == 0) {
                    rug[i][j] = "🙉";
                } else {
                    rug[i][j] = "🙈";
                }
            }
        }

        return rug;
    }

public static String[][] argyle(int width, int height) {
    String[][] rug = new String[width][height];

     for (int i = 0; i < width; i++) {
        for (int j = 0; j < height; j++) {
            if ((i % 4 == j % 4) || ((i + j) % 4 == 0)) {
                rug[i][j] = "🌜";
            } else {
                rug[i][j] = "🌛";
            }
        }
    }
        return rug;
    }
}   

