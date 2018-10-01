#include <iostream>
using namespace std;

int main()
{
    int cases, n, m, x, y;

    cin>>cases;

    while(cases !=0 ){
        cin>>n>>m;
        while(cases--){
            cin>>x >> y;

            if(x == n || y == m)
                cout<<"divisa"<<endl;

            else if(x < n && y > m)
                cout<<"NO"<<endl;

            else if(x > n && y > m)
                cout<<"NE"<<endl;

            else if(x > n && y < m)
                cout<<"SE"<<endl;

            else if(x < n && y < m)
                cout<<"SO"<<endl;
        }
        cin>>cases;
    }

    return 0;
}
