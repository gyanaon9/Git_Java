package Javapro;

public class MissingNo {

	public static void main(String[] args) {
		
		int a[]={-1,0,1,2,3,4,5,6,7,9,10};
		int sum=0;
		
		for(int i=0;i<a.length;i++)
		{
			sum=sum+a[i];
		}
		System.out.println(sum);

    int sum1=0;
    for(int j=-1;j<=10;j++){
    	sum1=sum1+j;
    }
    System.out.println(sum1);
    	System.out.println("Missing no.="+(sum1-sum));
    }
    	
}