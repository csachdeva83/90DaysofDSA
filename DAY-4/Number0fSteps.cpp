#include<bits/stdc++.h>
using namespace std;

int steps(int n, int c){
	if(n==0){
		return c;
	}
	if(n%2==0){
		return steps(n/2,++c);
	}
	return steps(n-1,++c);
}


int main(){
	int n;
	cin>>n;
	cout<<steps(n,0);
}