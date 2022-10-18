package arrayyt;

public class RemoveDuplicateSorted {

	public static void main(String[] args) {
		int [] a = {1,2,2,3,4,5,5};
		
		int [] temp = new int [a.length];
		int j =0;
		
		for(int i=0; i<a.length-1; i++) {
			if(a[i]!=a[i+1]) {
				temp[j]= a[i];
				j++;
			}
			temp[j] = a[a.length-1]; // to insert last element of array which not check in for loop
		}
		for(int i=0; i<temp.length; i++) {
			System.out.print(temp[i]+" ");
		}
	}

}
