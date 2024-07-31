import java.util.Scanner;

public class twoDArray {
    public static void main(String[] args) {
        Scanner  scn = new Scanner(System.in);
        int rows = scn.nextInt();
        int columns = scn.nextInt();
        int[][] arrnum = new int[rows][columns];  //defining an array  //rows,columns
        System.out.println();
        scn.close();

        for(int i=0;i<rows;i++){              //taking input elements to fill array
            for(int j=0;j<columns;j++){
                arrnum[i][j] = scn.nextInt();
            }
        }


        for(int i=0;i<rows;i++){            //printing teh 2D array
            for(int j=0;j<columns;j++){
                System.out.println(arrnum[i][j]);
            }
        }

        for(int i=0;i<rows;i++){            //printing teh 2D array
            for(int j=0;j<columns;j++){
                if (arrnum[i][j]== 4) {
                    System.out.println("found");
                    
                }
            }
        }
    }
    
}
