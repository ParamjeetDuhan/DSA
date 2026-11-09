public class hollowRectanglePattern{
    void main(){
        for(int i = 0;i<=4;i++){
              for(int j=0;j<=5;j++){
                  if(i == 0 || i==4){
                      System.out.print("*"+' ');
                  }
                  else if(i==1 || i== 2 || i== 3){
                        if(j==0 || j==5){
                            System.out.print("*"+' '+' '+' '+' '+' ');
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