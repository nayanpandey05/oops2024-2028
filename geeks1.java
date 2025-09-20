public class geeks1 {
    static int a=40;
    int b=50;
    void simpleDisplay() {
        System.out.print(a);
        System.out.println(b);
    }
    static void staticDisplay()
    {
        System.out.println(a);
    }
    public static void main(String[] args) {
        geeks1 obj=new geeks1();
        obj.simpleDisplay();
        geeks1.staticDisplay();
        staticDisplay();
    }

    
}
