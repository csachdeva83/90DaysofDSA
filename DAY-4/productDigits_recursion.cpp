#include<bits/stdc++.h>
using namespace std;

int digitProduct(int n){

	if(n==0){
		return 1;
	}

	int rem=n%10;
	n=n/10;
	return rem*digitProduct(n);
}

int main(){
	int n;
	cin>>n;
	cout<<digitProduct(n);
}