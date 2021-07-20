class zadanka
{   
    public static void main(String args[])
    {
        int x = 2, y;
       // double a, b, c, delta, x1, x2;

        y = (x==1) ? 10 : 20;
        y = x == 1 ? 10 : 20;
        System.out.println(y);
        
       // y = (x==1) ? System.out.print("tak") : System.out.print("tak");
      /* a=2;
       b=3;
       c=5;

        delta = b*b+4*a*c;

        if(a<0)
        {
            System.out.print("nie nie jest rownanie keadratowe"); 
        }
        else
        {

             if(delta==0)
            {
                x1 = (-b/2*a)
                System.out.println("x= "+x1);
            }

             else if(delta>0)
            {

            }   
            else if(delta<0)
            {

            } */
            
        //zadanie wyswitlajacy liczby od 0 do 30
       /* for(int i = 0; i<30; i++)
        {
            if(i%2==1)
            {
                continue;
            }
            System.out.println(i);

        }*/

        //zadanie z choinka
        int size = 10;
                /*for(int i = 0; i<size; i++)
        {
            for(int j = 0; j < size - i - 1 ;j++) //j < size - i - 1
            {
                System.out.print(" ");
            }

            for(int k = 0; k <  i ; k++)
            {
                System.out.print("*");
            }
            System.out.println("*");
        }*/

        for (int i = 1; i < size; i++)
         {
            for (int j = 0; j <= size - i; j++)
                System.out.print(" ");

            for (int j = 0; j < (i * 2) - 1; j++)
                System.out.print("*");

            System.out.println(" ");

        }
        


    }
    }