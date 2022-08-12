public class P002 {
    public static void main(String[] args){
        int num1 = 1;
        int num2 =2;

        int sum= 0;
        while (num1<89){

            if(num1%2==0){
                sum =sum+ num1;
            }
            int num3 = num1 + num2;
            num1= num2;
            num2 =num3;
            
        }
        System.out.println(+sum);
        


    }
}