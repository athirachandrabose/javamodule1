package problems;

public class arrayfreq {
public static void main(String[] args) {
	int count=0,visited=-1;
	int arr1[]= {1,2,3,4,5,2,3,1,2,1};
	int[] freq=new int[arr1.length];
	for(int i=0;i<arr1.length;i++) {
		count=1;
		for(int j=i+1;j<arr1.length;j++) {
			if(arr1[i]==arr1[j]) {
				count++;
				freq[j]=visited;
			}
	if(freq[i]!=visited) {
		freq[i]=count;
	}
	
		}
	}
		for(int j=0;j<freq.length;j++) {
			if(freq[j]!=visited) {
				System.out.println(arr1[j]+" " +freq[j]);
				    
			}
		}
		//System.out.println(count);
		
	}
}

