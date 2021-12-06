#include<bits/stdc++.h>
using namespace std;
typedef long long ll;
#define MOD 1000000007
#define endl ("\n")

void printSubsequenceASCII(string ans,string s){
    if(s.length()==0){
        cout<<ans<<endl;
        return;
    }

    printSubsequenceASCII(ans,s.substr(1));
    printSubsequenceASCII(ans+s[0],s.substr(1));
    printSubsequenceASCII(ans+to_string(s[0]+0),s.substr(1));
}

vector<string> getSubsequenceASCII(string ans,string s){
    if(s.length()==0){
        vector<string> list;
        list.push_back(ans);
        return list;
    }

    vector<string> left= getSubsequenceASCII(ans,s.substr(1));
    vector<string> mid= getSubsequenceASCII(ans+s[0],s.substr(1));
    vector<string> right= getSubsequenceASCII(ans+to_string(s[0]+0),s.substr(1));

    vector<string> v(left.size()+right.size()+mid.size());
    merge(left.begin(),left.end(),right.begin(),right.end(),mid.begin(),mid.end(),v.begin());

    return v;
}

void solve(){
    string s;
    cin>>s;
    // printSubsequenceASCII("",s);
    // cout<<endl;
    vector<string> temp;
    vector<string> ans=getSubsequenceASCII("",s);
    for(auto it:ans){
        cout<<it<<" ";
    }   
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