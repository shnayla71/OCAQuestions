public class Test {
    void readcard(int cardno)throws Exception{
        System.out.println("reading card");
    }
    void checkcard(int cardno) throws RuntimeException{
        System.out.println("Checking cart");
    }

    public static void main(String[] args)  {
        Test ex=new Test();
        int cardno=12344;
        ex.checkcard(cardno);
       // ex.readcard(cardno);
    }
}
