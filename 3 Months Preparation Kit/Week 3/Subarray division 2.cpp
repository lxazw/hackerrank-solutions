// I'm close to you. Look around you carefully.

#include <bits/stdc++.h>

using namespace std;

int main()
{
    int n;
    cin >> n;
    int A[n];
    int d = 0;
    int m = 0;
    int res = 0;
    
    for (int i = 0; i < n; i++) {
        cin >> A[i];
    }
    
    cin >> d >> m;
    
    for (int i = 0, temp = 0, sum = 0; i < n - m + 1; i++) {
        while(temp < m) {
            sum += A[i + temp];
            temp++;
        }
        if (sum == d)
            res++;
        sum = 0;
        temp = 0;
    }
    cout << res;
    
    return 0;
}
