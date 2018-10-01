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

    double height, climb, slide, fatigue, snailHeight, calculatedFatigue;
    int day=0;

 while(true){
        cin >> height>>climb>>slide>>fatigue;
        
        snailHeight=0;
        day=0;
     
        if(height == 0)
            break;

        calculatedFatigue = (climb*fatigue)/100;


        while(snailHeight <= height && snailHeight >= 0){
            snailHeight += climb;
            if(climb > 0)
                climb -= calculatedFatigue;
            
            day++;
            
            if(snailHeight<=height)
                snailHeight -= slide;
        }
        
        if(snailHeight < 0)
            cout<<"failure on day "<<day<<endl;
        else
            cout<<"success on day "<<day<<endl;

    }

	return 0;
}
