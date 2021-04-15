public class week6{
    public static void main(String[] args) {
        
        // Code for Count the Even Numbers
        Runnable runnable1 = ()->{
            int even_count=0;
            for (int i = 0; i <= 10000; i++) {
                if(i % 2 == 0)
                {
                    even_count++;
                }
            }
            System.out.println("Hi From Runnable1");
            System.out.println("Even Count:- " + even_count);
        };

        // Code for Count the Prime Numbers

        Runnable runnable2 = ()->{
            int prim_count=0;
            int i =0;
            int num =0;
            String primeNumbers = "";
            for (i = 1; i <= 10000; i++)
            {
                int counter=0;
                for(num =i; num>=1; num--)
                {
                    if(i%num==0)
                    {
                        counter = counter + 1;
                    }
                }
                if (counter ==2)
                {
                    prim_count++;
                    // primeNumbers = primeNumbers + i + " ";
                }
            }
            System.out.println("Hi From Runnable2");
            System.out.println("Prime Numbers " + prim_count);
        };

        Thread th1 = new Thread(runnable1);
        Thread th2 = new Thread(runnable2);

        th1.start();
        th2.start();

    }
}