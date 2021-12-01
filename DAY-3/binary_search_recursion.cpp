#include<bits/stdc++.h>
using namespace std;
typedef long long ll;
#define MOD 1000000007
#define endl ("\n")

int search(int arr[],int target,int s,int e){
    if(s>e){
        return -1;
    }

    int m=s+(e-s)/2;

    if(target==arr[m]){
        return m;
    }
    if(target<arr[m]){
        return search(arr,target,s,m-1);
    }
    return search(arr,target,m+1,e);
}

void solve(){
    int arr[]={1,2,45,67,89};
    int n=sizeof(arr)/sizeof(arr[0]);
    int target=89;
    cout<<search(arr,target,0,n);
}   

int32_t main(){
    ios_base::sync_with_stdio(false);
    cin.tie(NULL);
    
    ll t;
    cin>>t;
    while(t--){
        solve();
    }
}