#include<bits/stdc++.h>
using namespace std;
typedef long long ll;
#define MOD 1000000007
#define endl ("\n")

void permu(string ans,string s){
    if(s.size()==0){
        cout<<ans<<endl;
        return;
    }
    char ch=s[0];
    for(int i=0;i<=ans.size();i++){
        string start=ans.substr(0,i);
        string last=ans.substr(i,ans.size()-i);
        permu(start+ch+last,s.substr(1));
    }
}

int countPermu(string ans,string s){
    if(s.size()==0){
        return 1;
    }
    int count=0;
    char ch=s[0];
    for(int i=0;i<=ans.size();i++){
        string start=ans.substr(0,i);
        string last=ans.substr(i,ans.size()-i);
        count+=countPermu(start+ch+last,s.substr(1));
    }
    return count;
}

void solve(){
    // permu("","abc");
    cout<<countPermu("","abc");
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