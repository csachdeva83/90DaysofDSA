#include<bits/stdc++.h>
using namespace std;
typedef long long ll;
#define MOD 1000000007
#define endl ("\n")

void printSubsequence(string ans,string s){
    if(s.length()==0){
        cout<<ans<<endl;
        return;
    }

    printSubsequence(ans,s.substr(1));
    printSubsequence(ans+s[0],s.substr(1));
}

vector<string> getSubsequence(string ans,string s){
    if(s.length()==0){
        vector<string> list;
        list.push_back(ans);
        return list;
    }

    vector<string> left= getSubsequence(ans+s[0],s.substr(1));
    vector<string> right= getSubsequence(ans,s.substr(1));

    vector<string> v(left.size()+right.size());
    merge(left.begin(),left.end(),right.begin(),right.end(),v.begin());

    return v;
}

void solve(){
    string s;
    cin>>s;
    printSubsequence("",s);
    cout<<endl;
    vector<string> temp;
    vector<string> ans=getSubsequence("",s);
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