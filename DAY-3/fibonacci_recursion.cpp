#include<bits/stdc++.h>
using namespace std;
typedef long long ll;
#define MOD 1000000007
#define endl ("\n")

int fibo(int n){
    if(n<2){
        return n;
    }

    return fibo(n-1)+fibo(n-2);
}

void solve(){
    int n=5;
    cout<<fibo(n);
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