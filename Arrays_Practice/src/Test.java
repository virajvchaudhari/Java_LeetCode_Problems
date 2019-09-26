class Test{
    private int a;
    private int b;

    Test(int first, int second){
        this.a = first;
        this.b = second;
    }

    public static int addition(int a, int b){

        return a + b;
    }

    public int add(){
        return this.a + this.b;
    }

    public static void main(String[] args) {
        Test t = new Test(2,3);
        System.out.println(t.add());
        System.out.println(addition(4,5));
    }
}