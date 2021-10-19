
package matrizes;

public class Matrizes {


    public static void main(String[] args){


        int matriz[][] = new int [5][5];

      System.out.println("----Matriz----");

        for(int i=0; i<5; i++){
            for (int j=0; j<5; j++){
                 matriz[i][j]=i+j;
                 System.out.print("["+matriz[i][j]+"]");
            }
             System.out.println();
        }

        System.out.print("Diagonal Principal:");
         System.out.println();
        int dp=0;
        int ds=0;
        int soma =0;
        int soma2=0;
        int menor = 0;
        for( int i=0; i<5; i++){
          for (int j=0; j<5; j++){
            dp = matriz[i][j];
            if(i == j){
                System.out.print("["+dp+"]");
            }
            }
            }
         System.out.println();
        System.out.println("A soma da diogonal principal é:");

             for (int i=0; i<5; i++){
                 for (int j=0; j<5; j++){
                     if(i==j){
                      soma = soma + matriz[i][j];

                     }
                 }
             }
              System.out.println("["+soma+"]");

              System.out.println("Diagonal Secundária:");
                      for (int j=0; j<5; j++){
                      for (int i=0; i<5; i++){
                      ds = matriz[j][i];
                      if(i+j==5-1){
                       System.out.print("["+ds+"]");

                      }
                  }

              }
                      System.out.println();
                      System.out.println("A soma da diagonal secundária é:");
                      for(int i=0; i<5; i++){
                          for(int j=0; j<5; j++){
                              if(j==i){
                                  soma2= soma2 + matriz[j][i];
                              }
                          }
                      }
                       System.out.println("["+soma2+"]");
                         System.out.println("O menor valor é:");
                         for(int i=0; i<5; i++){
                             for(int j=0; j<5; j++){
                                 if(menor > matriz[i][j]){
                                     menor=matriz[i][j];
                                 }
                             }
                         }
                          System.out.println("["+menor+"]");

}
}


