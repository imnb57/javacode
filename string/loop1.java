
public class loop1 {
    public static void main(String[] args) {
        int i = 3, j = 4;
        int sum1 = 5+ ++i;
        int sum2 = 5+ j++;
        System.out.println(sum1);
        System.out.println(sum2);
        // for loop, first initialize value then condition and increment or decrement
        for (int k=0;k<10;k++){
            System.out.println(k);
        }
        for (int a=1;a<11;a++){
            for(int b=1;b<11;b++){
                System.out.println("");
                System.out.println(a+"*"+b+"="+a*b);
            }
        }
    }
}
