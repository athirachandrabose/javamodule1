package problems;

public class lrftrotarr {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int arr1[]= {1,2,3,4,5};
int n=3;
for(int i=0;i<n;i++) {
	int first=arr1[0];
	for(int j=1;j<arr1.length;j++) {
		arr1[j]=arr1[j+1];
		arr1[j]=first;
	}
	
}for(int i=0;i<arr1.length;i++) {
	System.out.println(arr1[i]);
}
	}

}
