public class Main {
    public static void main(String[] args) {
int year =2000;

        if ( year%100==0 && year%400 ==0 ) {
            System.out.println(year+ " год является високосным");
        } else {
            System.out.println(year+" год не является високосным");
    }
}
}


