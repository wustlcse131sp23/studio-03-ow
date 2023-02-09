package studio3;
import java.util.Scanner;
public class Sieve {

	public static void main(String[] args) {
		System.out.println("input the n");
		Scanner scan=new Scanner(System.in);
		int n=scan.nextInt();
		int[] a=new int[n];
		for (int i=0;i<=n-1;i++) {
			a[i]=i+1;
		}
		int p=1;
		int max_num=0;
		double mod_result=0;
		int int_part=0;
		for (int i=a.length-1;i>=0;i--) {
			if (a[i]!=1) {
				max_num=a[i];
				break;
			}
		}
		while (p*p<=max_num) {
			for (int i=0;i<=a.length-1;i++) {
				if (a[i]>p) {
					p=a[i];
					break;
				}
			}

			for (int i=0;i<=a.length-1;i++) {
				if (a[i]<=p) {
					
					continue;
				}
				mod_result=(double)a[i] / p;
				int_part=(int)mod_result;
				if (mod_result-int_part==0) {
					a[i]=1;
				}
			for (int j=a.length-1;j>=0;j--) {
				if (a[j]!=1) {
					max_num=a[j];
					break;
				}
			}
		}
		}
		for (int i=0;i<=a.length-1;i++) {
			if (a[i]!=1) {
				System.out.println(a[i]);
			}
		}

	}
}
