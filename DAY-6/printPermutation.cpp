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

vector<string> permuList(string ans,string s,vector<string> temp){
    if(s.size()==0){
        vector<string> list;
        list.push_back(ans);
        return list; 
    }
    vector<string> v;
    char ch=s[0];
    for(int i=0;i<=ans.size();i++){
        string start=ans.substr(0,i);
        string last=ans.substr(i,ans.size()-i);
        v.insert(end(v),begin(permuList(start+ch+last,s.substr(1),temp)),end(permuList(start+ch+last,s.substr(1),temp)));
    }    
    return v;
}

void solve(){
    // permu("","abc");
    vector<string> temp;
    vector<string> ans=permuList("","abc",temp);
    for(auto it: ans){
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