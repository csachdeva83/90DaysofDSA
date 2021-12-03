#include<bits/stdc++.h>
using namespace std;

bool isSorted(int arr[],int index,int n){
	if(index==n-1){
		return true;
	}

	return arr[index]<arr[index+1] && isSorted(arr,++index,n);
}

int main(){
	int arr[]={1,2,23,42,67,89};
	int n=sizeof(arr)/sizeof(arr[0]);
	cout<<(isSorted(arr,0,n)?"Yes":"No");	
}