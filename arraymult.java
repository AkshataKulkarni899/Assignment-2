import java.io.*;
class arraymult
{
public static void main(String args[])throws Exception
{
	int a[][],b[][],i,j,k,n,sum=0;
	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	
	System.out.println("Enter the diamension of matrix="+n);
	n = Integer.parseInt(br.readLine());
	
	System.out.println("\t Enter 1st matrix="n*n);
	for(i=0;i<n;i++)
	for(j=0;j<n;j++)
	System.out.println("\n 1st matrix is",+a[i][j]);
	a = Integer.parseInt(br.readLine());
	
	System.out.println("\t Enter 2nd matrix="n*n);
	for(i=0;i<n;i++)
	for(j=0;j<n;j++)
	System.out.println("\n 2nd matrix is",+b[i][j]);
	b = Integer.parseInt(br.readLine());
	
	System.out.Println("\n The Multiplication is",n*n);
	for(i=0;i<n;i++)
	for(j=0;j<n;j++)
	for(k=0;k<n;k++)
	sum=sum+a[i][k]*b[k][j];
	System.out.println("\n Multiplication is",+sum);
	sum=Integer.parseInt(br.readLine());
}
}

	

	
