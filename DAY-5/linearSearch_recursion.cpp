#include<bits/stdc++.h>
using namespace std;

bool find(int arr[],int index,int n,int target){
	if(index==n){
		return false;
	}

	return arr[index]==target || find(arr,++index,n,target);
}

int findIndex(int arr[],int index,int n,int target){
	if(index==n){
		return -1;
	}
	if(arr[index]==target){
		return index;
	}
	return findIndex(arr,++index,n,target);
}

int findIndexLast(int arr[],int index,int target){
	if(index==-1){
		return -1;
	}
	if(arr[index]==target){
		return index;
	}
	return findIndexLast(arr,--index,target);
}

vector<int> findAllIndex(int arr[],int n,int index,int target,vector<int> ans){
	if(index==n){
		return ans;
	}
	if(arr[index]==target){
		ans.push_back(index);
	}
	return findAllIndex(arr,n,++index,target,ans);	
}

int main(){
	int arr[]={1,23,23,23,23,23};
	int n=sizeof(arr)/sizeof(arr[0]);
	int target=23;
	vector<int> temp;

	cout<<(find(arr,0,n,target)?"True":"False")<<endl;
	
	cout<<findIndex(arr,0,n,target)<<endl;
	
	cout<<findIndexLast(arr,n-1,target)<<endl;
	
	vector<int> ans=findAllIndex(arr,n,0,target,temp);
	for(auto it: ans){
		cout<<it<<" ";
	}	
}