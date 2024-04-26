
class Solution{
	void toBinary(int N) {
		//Write your code here
		String w="";
		while(N!=0){
		    w=(N & 1)+w;
		    N=N>>1;
		}
		System.out.print(w);
	}
}