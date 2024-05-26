package kadai_011;

public class Prime_Chapter11 {

	public static void main(String[] args) {
		boolean[] primeNum =new boolean[101];
		for(int i=1; i<primeNum.length; i++) {
			primeNum[i]=true;
		}
		int numberDivided=2;
		while(numberDivided<primeNum.length) {
			for(int i=numberDivided+1;i<primeNum.length; i++) {
				if(i% numberDivided==0) {
					primeNum[i]=false;
					continue;
				}
			}
			numberDivided+=1;
		}
		for(int i =2; i<primeNum.length; i++) {
			if(primeNum[i]) {
				System.out.println(i);			}
		}
	}

}
