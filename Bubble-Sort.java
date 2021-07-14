package T1;


import static java.lang.System.out;

public class Bubble-Sort {



    public static void main(String args[]) {



        int [] number = {70,80,31,37,10,1,48,60,33,80};
        int temp;
        for(var i=0;i<number.length;i++)
        {
            for(var j=0;j<number.length-1;j++)
            {
                if(number[j+1]<number[j])
                {
                    temp = number[j+1];
                    number[j+1]=number[j];
                    number[j]=temp;
                }
            }
        }

        for(var i=0;i<10;i++)
        {
            out.print(number[i]+" ");
        }
    }

}

