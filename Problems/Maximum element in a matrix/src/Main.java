import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int m = scan.nextInt();
        int[][] array = new int[n][m];
        int reihe=0;
        int spalte=0;
        int value = Integer.MIN_VALUE;

        for(int i = 0;i < array.length;i++){
            for(int j = 0;j < array[i].length;j++){
                array[i][j] = scan.nextInt();
            }
        }

        for(int i = 1;i < array.length;i++){
            for(int j = 1;j < array[i].length;j++){
                if(array[i-1][j-1]>value){
                    value = array[i-1][j-1];
                    reihe = i-1;
                    spalte = j-1;
                }
            }
        }

        System.out.println(reihe + " " + spalte);

    }
}

/*
       int n = scan.nextInt();
        int m = scan.nextInt();
        boolean controll = false;
        int[][] matrix = new int[n][m];
        int row= Integer.MIN_VALUE;
        int column=Integer.MIN_VALUE;
        for (int i=0;i< matrix.length;i++){
            for(int j=0;j<matrix[i].length;j++){
                matrix[i][j] = scan.nextInt();
            }
        }
        for (int i = 1;i<n;i++){
            for(int j = 1;j<m;j++){
                if (matrix[i-1][j-1]>matrix[i-1][j]){
                     row = i;
                     column = j;
                     controll = true;
                }
            }
        }

         if (controll == true){
        System.out.println(row+" "+column);
         } else {
             for (int i = 1;i<n;i++){
                 for(int j = 1;j<m;j++){
                     if (matrix[i-1][j-1]<matrix[i-1][j]){
                         row = i;
                         column = j;
                         controll = false;
                     }
                 }
             }
         }
         if (controll == false){
             System.out.println(row+" "+column);
         }

 */