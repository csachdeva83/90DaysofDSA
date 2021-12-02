#include<bits/stdc++.h>
using namespace std;

int revNum=0;

int isPalindrome(int n){
	if(n){
		int rem=n%10;
		revNum=revNum*10+rem;
		isPalindrome(n/10);
	}else{
		return 0;
	}

	return revNum;
}

int main(){
	int n;
	cin>>n;
	if(n==isPalindrome(n)){
		cout<<"yes";
	}else{
		cout<<"no";
	}
}