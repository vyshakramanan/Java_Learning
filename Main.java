    import java.util.Scanner; //importing scanner
    public class Main {

        static Scanner sc=new Scanner(System.in); //initializing scanner
        public static void main(String[] args) {
        int n; //output variable
            int roll; //roll variable
            int low=1; //dice minimum
            int high=6; //dice maximum
            System.out.println("Enter the number of rolls for a dice");
            roll=sc.nextInt(); //roll input assignment
            System.out.println("Random Roll function");
            for(int i=0; i<roll; i++) //for loop to roll 'n' times
            {
                n=roller(low,high); //roller method initialization
                System.out.println(n); //output
            }
        }

    private static int roller(int low, int high)
    {
        int r=(int)(Math.random()*(high-low+1))+low;
        /* evaluation -
          * (int)(0.2*(6-1+1))+1
          * (int)(0.2*5)+1
          * (int)(1+1)
          * r=2
           * */
        return(r);
    }

    }
