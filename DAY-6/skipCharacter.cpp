#include<bits/stdc++.h>
using namespace std;
typedef long long ll;
#define MOD 1000000007
#define endl ("\n")

string removeCharacter(string s,int target,string ans){
    if(s.size()==0){
        return ans;
    }
    if(s[0]!=target){
        ans+=s[0];

    }
    return removeCharacter(s.substr(1),target,ans);
}

void solve(){
    string s;
    cin>>s;
    string ans="";
    cout<<removeCharacter(s,'a',ans);   
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