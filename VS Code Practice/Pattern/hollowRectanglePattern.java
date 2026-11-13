public class hollowRectanglePattern{
    void main(){
        int n=4;
        for(int row = 0;row<=n;row++){
              for(int col=0;col<=5;col++){
                  if(row == 0 || row==n){
                      System.out.print("* ");
                  }
                  else{
                        if(col==0 || col==5){
                            System.out.print("*     ");
                        }
                        else{
                             System.out.print(' ');
                        }
                  }
              }
              System.out.println();
            }
    }
}