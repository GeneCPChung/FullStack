package basicLessons;

public class PrimeOrNot {
    public static void main(String[] args) {
        Calculate prime = new Calculate();
        if(prime.isPrime(7.5)){
            System.out.println("Number is prime");


        }else{
            System.out.println("Number is not prime");
        }
    }
}
