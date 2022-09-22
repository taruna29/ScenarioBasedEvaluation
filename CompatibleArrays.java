import java.util.*;
public class CompatibleArrays{
    public static void main(String[] args){
        Scanner sc=new Scanner (System.in);
        System.out.println("Enter size of first array:");
        int size1=sc.nextInt();
        if(size1<=0)
        System.out.println("Invalid array size");
        else
        {
            int arr1[]=new int[size1];
            System.out.println("enter the element for first array:");
            for(int i=0;i<size1;i++)
                arr1[i]=sc.nextInt();
                 System.out.println("enter the size of second array:");
                 int size2=sc.nextInt();
                 if(size2<=0)
                  System.out.println("Invalid array size");
                  else{
                    int count=0;
                    int arr2[]=new int[size2];
                     System.out.println("enter the element for second array:");
                      for(int i=0;i<size2;i++)
                          arr2[i]=sc.nextInt();
                if(size1==size2)
                {
                    for(int i=0;i<size1;i++)
                    {
                        if(arr1[i]>arr2[i])
                        count++;
                    }
                    if(count==(size1))
                    System.out.println("Arrays are compatible");
                    else{
                        System.out.println("arrays are not compatible");
                    }
                }
                else
                System.out.println("Arrays are not compatible");
                  }
            

        }
    }

} 
