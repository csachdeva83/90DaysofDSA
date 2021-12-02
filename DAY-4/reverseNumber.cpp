#include<bits/stdc++.h>
using namespace std;

int sum=0;

int rev(int n){
	if(n){
		int r=n%10;
		sum=sum*10+r;
		rev(n/10);
	}else{
		return 0;
	}

	return sum;
}

int main(){
	int n;
	cin>>n;
	cout<<rev(n);
}