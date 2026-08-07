    public class sudoko{
        public static void main(String[] args) {
            
            int [][] matrix = new int[9][9];

            for(int i = 0;i < 9; i++){
                for(int j = 0; j < 9; j++){
                    // System.out.print("["+ i+"]" + "[" +j+"]  ");
                    // System.out.print("["+ j+"]" + "[" +i+"]  ");

                    if(i < 3 && j < 3){
                        System.out.print("m");
                    }else if (i < 3 && (j >=3 && j<6)) {
                        System.out.print("l");
                    }else if(i < 3 && (j >= 6 && j < 9)){
                        System.out.print("K");
                    }
                }
                System.out.println();
            }

            char a = '9';
            System.out.println(a);

            int[][] points = {{0,0},{0,1},{1,0},{0,2]2,0}};

        }
    }