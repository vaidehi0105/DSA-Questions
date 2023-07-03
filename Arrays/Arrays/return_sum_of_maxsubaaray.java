import java.util.Scanner;

public class return_sum_of_maxsubaaray {
    public static void maxsubarray(int arr[],int n){
        int maxsum=Integer.MIN_VALUE;
        int currsum=0;
        for(int i=0;i<n;i++)
        {
            currsum+=arr[i];
            if(currsum>maxsum)
            {
                maxsum=currsum;
            }
            if(currsum<0)
            {
                currsum=0;
            }
        }
        System.out.println(maxsum);
    }
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int n;
        System.out.println("Enter the size of array");
        n=sc.nextInt();
        int arr[]=new int[n];
        System.out.println("Enter the elements in array");
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }


        maxsubarray(arr,n);

    }
}
