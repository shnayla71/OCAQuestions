package q193;

public class Q193_3 {
    public static void main(String[] args) {
        int sum = 0;
        for ( int xVal = 1; xVal <= 5; xVal++){
            sum = sum + xVal;
            System.out.println("The sum of "+xVal + " number is: " +sum);
        }

        // xVal is in loop so it is not visible outside of the loop
        // xVal must be declared as local variable --> The sum of 6 number is: 15
        // or syso must be in loop
    }
}
/*
* What is the result?
A. The sum of 4 numbers is: 10
* B. A compile time error occurs.
* C. The sum of 5 numbers is: 10
* D. The sum of 5 numbers is: 15*/

//Answer: B
//eger sout loop un icerisinde olsaydi
//cevap D olurdu