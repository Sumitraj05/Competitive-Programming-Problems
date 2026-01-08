#include <bits/stdc++.h>
using namespace std;

int main() {
    ios::sync_with_stdio(false);
    cin.tie(NULL);

    int t;
    cin >> t;
    while (t--) {
        int n, k;
        cin >> n >> k;
        vector<int> b(n + 2, 0);
        for (int i = 0; i < n; i++) {
            int x;
            cin >> x;
            if (x <= n) b[x] = 1;
        }
        int m = 0;
        while (b[m]) m++;
        cout << min(m, k - 1) << '\n';
    }
    return 0;
}
