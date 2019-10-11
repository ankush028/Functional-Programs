

public class ArrayIntegerSum {

	public static void main(String[] args) {
		int a[] = {1,2,-3,6,7,-4,20,10,-1,6,60,-40,30};
		for(int i=0;i<a.length;i++){
			for(int j=i+1;j<a.length;j++){
				for(int k=j+1;k<a.length;k++){
					if(a[i]+a[j]+a[k]==0){
						System.out.println(a[i]+","+a[j]+","+a[k]);
					}
				}
			}
		}
	}
}
