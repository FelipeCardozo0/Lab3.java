public class Lab3 {
        public static void asterisk(int rows) {
            for (int j = 0; j < rows;j++) {
                for (int i = 0; i < rows -j; i++) {
                    System.out.print(" ");
                }

                for (int i = 0; i <= j; i++) {
                    System.out.print("/");
                }

                System.out.print("**");
                for (int i = 0; i <= j; i++) {
                    System.out.print("\\");
                }
                System.out.println();
            }

        }
        public static void asterisk_1(int rows) {
            for (int j = 0; j < rows;j++){
                if (j == 0){
                    System.out.println("|../\\..../\\..|");
                }
                else if (j == 1){
                    System.out.println("|./\\/\\../\\/\\.|");
                }
                else if (j == 2){
                    System.out.println("|/\\/\\/\\/\\/\\/\\|");
                }
                else if (j == 3){
                    System.out.println("|\\/\\/\\/\\/\\/\\/|");
                }
                else if (j == 4){
                    System.out.println("|.\\/\\/..\\/\\/.|");
                }
                else if (j == 5){
                    System.out.println("|..\\/....\\/..|");
                }
            }
        }
        public static void asterisk_2(int rows) {
            for (int j = 0; j < rows; j++) {
            if (j == 0) {
                System.out.println("|\\/\\/\\/\\/\\/\\/|");
            }
            else if (j == 1){
                System.out.println("|.\\/\\/..\\/\\/.|");
            }
            else if (j == 2){
                System.out.println("|..\\/....\\/..|");
            }
            else if (j == 3){
                System.out.println("|../\\..../\\..|");
            }
            else if (j == 4){
                System.out.println("|./\\/\\../\\/\\.|");
            }
            else if (j == 4){
                System.out.println("|/\\\\/\\\\/\\\\/\\\\/\\\\/\\\\|");
            }
        }
    }

    public static void main(String[] args){
            asterisk(5);
            System.out.println("+=*=*=*=*=*=*+");
            asterisk_1(6);
            System.out.println("+=*=*=*=*=*=*+");
            asterisk_2(6);
            asterisk(5);
        }
    }
