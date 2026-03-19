class test{

    static void checkodd(int num){
        if(num%2==0){
            System.out.println("Even");
        }
        else{
            System.out.println("Odd");
        }
    }

    public static void main(String[] args) {
        checkodd(2);
        checkodd(987897);
    }

}