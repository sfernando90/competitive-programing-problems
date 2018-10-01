#include <bits/stdc++.h>
using namespace std;

#define MEM(arr,val)memset((arr),(val), sizeof (arr))
#define PI (acos(0)*2.0)
#define FASTER ios_base::sync_with_stdio(false); cin.tie(NULL); cout.tie(NULL)

typedef long long ll;
typedef pair<int,int> ii;
typedef vector<int> vi;
typedef vector<ii> vii;

ll gcd(ll a,ll b){return b == 0 ? a : gcd(b,a%b);}
ll lcm(ll a,ll b){return a*(b/gcd(a,b));}

/**
 * __builtin_popcount(int d) // count bits
 * __builtin_popcountll(long long d)
 * strtol(s, &end, base); // convert base number
 */
//----------------------------------------------------------------------//

int main(){
	FASTER;
	
	int cases, a, b, c, i=0;
	
	cin>>cases;
	
	
	while(cases--){
		cin>>a>>b>>c;
		i++;
		if((a>b && a<c) || (a<b && a>c) )
			cout<<"Case " <<i<< ": "<< a<<endl;
		else if((b>a && b<c) || (b<a && b>c))
			cout<<"Case " <<i<< ": "<< b<<endl;
		else if((c>a && c<b) || (c<a && c>b))
			cout<<"Case " <<i<< ": "<< c<<endl;
	}
	return 0;
}
