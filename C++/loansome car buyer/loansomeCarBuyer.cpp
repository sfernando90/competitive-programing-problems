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
	
	int duration, depreciatoinRecords;
	double loan, downPayment, rates[101];
	
	
	while(true){
		cin >>duration>>downPayment>>loan>>depreciatoinRecords;
		
		if(duration < 0)
			break;
		
		int m;
		double cr;
		while(depreciatoinRecords--){
				cin>>m>>cr;
				for(int i = m; i<101; i++){
					rates[i]= cr;	
				}
		}
		
		double value = loan + downPayment;
		double monthlyPayment = loan/duration;
		double owed = loan;
		
		int month = 0;
		double currentRate = rates[month];
		value = value - (value * currentRate);
		
		while(value < owed){
			month++;
            
            currentRate = rates[month];
            
            value = value - (value * currentRate);
            owed = owed - monthlyPayment;
		}
		if(month==1)
			cout<<month<<" month"<<endl;
		else 
			cout<<month<<" months"<<endl;
	}	

	return 0;
}
