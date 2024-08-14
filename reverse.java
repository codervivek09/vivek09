

public class reverse {
    public static void main(String[] args) {
      
        int n = 98754;
       
        int count = 0;

        while(n>0){
            int rem = n % 10;
            n=n/10;
         
            count = count *10 + rem;
    }
    System.out.println(count);
    }

}
