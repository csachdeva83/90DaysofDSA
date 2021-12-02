#include<bits/stdc++.h>
using namespace std;

// int cnt=0;

// int countZero(int n){
// 	if(n){
// 		int rem=n%10;
// 		if(rem==0){
// 			cnt=cnt+1;
// 		}
// 		countZero(n/10);
// 	}else{
// 		return 0;
// 	}
// 	return cnt;
// }

int countZero(int n, int c){
	if(n==0){
		return c;
	}
	if(n%10==0){
		return countZero(n/10,++c);
	}
	return countZero(n/10,c);
}


int main(){
	int n;
	cin>>n;
	cout<<countZero(n,0);
}