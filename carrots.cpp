#include <iostream>
using namespace std;

int main() { 
  int n,p;
  cin>>n>>p;
  if(1<=n && n<=1000 && 1<=p && p<=1000){
    for(int i=0;i<=n;i++){
      string a;
      getline(cin,a);
    }   
    cout<<p;
  }
}
