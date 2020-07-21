package Q213;

abstract class Toy {
    int price;
    abstract void printToy();//  C SIKKI
    //line n1;
    public int calculatePrice() { // D
        return price;
    }
    public abstract int computeDiscount();// E
}
//which code fragments are valid at line n1?
//A.  public static void insertToy(){
//        /*  code goes here  */
//    }
//B.  final Toy getToy(){
//        return new Toy();
//    }
//C.  public void printToy();
//D.  public int calculatePrice(){
//        return price;
//    }
//E. public abstract int computeDiscount();
//    A. Option A
//    B. Option B
//    C. Option C
//    D. Option D
//    E. Option E
//Answer: C D E
