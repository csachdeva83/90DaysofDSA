#include<bits/stdc++.h>
using namespace std;

void toPrint(int n){
	if(n==0){
		return;
	}

	cout<<n<<endl;
	toPrint(n-1);
}

int main(){
	int n;
	cin>>n;
	toPrint(n);
}