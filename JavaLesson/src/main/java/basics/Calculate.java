package basics;

public class Calculate {
    public boolean isPrime(int num){

        int temp = 0;
        boolean isPrime = true;

        for (int i =2; i<num/2; i++){
            temp = num%i;
            if (temp == 0){
                isPrime = false;
                break;
            }
        }
        return isPrime;
    }

    public boolean isPrime(double doubleValue){
        int num = (int) doubleValue;
        int temp = 0;
        boolean isPrime = true;

        for (int i =2; i<num/2; i++){
            temp = num%i;
            if (temp == 0){
                isPrime = false;
                break;
            }
        }
        return isPrime;
    }
}
