package tag01_Constructor;

public class test {
    public static void main(String[] args) {

        for(int i=1; i<=100;i++){
            if (i% 15==0){
                System.out.print("FizzBuzz ");
            }else if(i % 5==0){
                System.out.print("Buzz ");
            }else if(i %3==0){
                System.out.print("Fizz ");
            }else{
                System.out.print(i+" ");
            }
        }
    }
}
