#include<bits/stdc++.h>
using namespace std;

int digitSum(int n){

	if(n==0){
		return 0;
	}

	int rem=n%10;
	n=n/10;
	return rem+digitSum(n);
}

int main(){
	int n;
	cin>>n;
	cout<<digitSum(n);
}