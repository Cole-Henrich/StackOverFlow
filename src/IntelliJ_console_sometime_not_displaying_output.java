import java.util.Arrays;
import java.util.concurrent.ThreadLocalRandom;
        public class IntelliJ_console_sometime_not_displaying_output {
            public static void main(String[] args) {
                String[] one = {"hello", "goodbye"};
                String[] two = {"goodbye", "hello"};
                String[][] arr = {
                        one, two
                };
                secondGen(arr,2,3);
            }
            public static void secondGen(String[][] arr,int N,int M){
                String[][] arrSwap = new String[N][M];
                int count=0;
                for(int i=0;i<N;i++){
                    for(int j = 0; j<M;j++){
                        count++;
                        int random = ThreadLocalRandom.current().nextInt(1,((N*M)/2)+1);
                        String number = String.valueOf(random);
                        arrSwap[i][j] = number;
                        if(count%2==0){
//                        if(!/*ArrayGen.arrOutputValidation*/(arrSwap,N,M,i,j)){
                            j--;
                            count--;
//                        }
                        }
                    }
                }
                System.out.println(Arrays.deepToString(arrSwap));
//            Utility.render(arrSwap);
            }
        }
