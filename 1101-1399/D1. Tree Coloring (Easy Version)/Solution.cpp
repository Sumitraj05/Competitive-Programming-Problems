#include <iostream>
#include <vector>
#include <algorithm>

using namespace std;


void solve() {
    int n;
    cin >> n;

    vector<vector<int>> adj(n + 1);
    vector<int> children_count(n + 1, 0);
    
    for (int i = 0; i < n - 1; ++i) {
        int u, v;
        cin >> u >> v;
        adj[u].push_back(v);
        adj[v].push_back(u);
    }

    if (n == 1) {
        cout << 1 << endl;
        return;
    }

    vector<int> parent(n + 1, 0);
    vector<int> q;
    q.push_back(1);
    parent[1] = -1; 

    int head = 0;
    while(head < q.size()){
        int u = q[head++];
        for(int v : adj[u]){
            if(parent[v] == 0){
                parent[v] = u;
                children_count[u]++;
                q.push_back(v);
            }
        }
    }

    int max_ops = 0;
    for (int i = 1; i <= n; ++i) {
        int current_needed;
        if (i == 1) {

            current_needed = children_count[i] + 1;
        } else {

            current_needed = children_count[i] + 1;
        }
        max_ops = max(max_ops, current_needed);
    }

    vector<int> depth_count(n + 1, 0);
    vector<int> dist(n + 1, 0);
    q.clear();
    q.push_back(1);
    dist[1] = 1;
    depth_count[1] = 1;
    head = 0;
    
    int max_depth_width = 1;
    while(head < q.size()){
        int u = q[head++];
        for(int v : adj[u]){
            if(dist[v] == 0){
                dist[v] = dist[u] + 1;
                depth_count[dist[v]]++;
                max_depth_width = max(max_depth_width, depth_count[dist[v]]);
                q.push_back(v);
            }
        }
    }

    cout << max(max_ops, max_depth_width) << endl;
}

int main() {
    ios_base::sync_with_stdio(false);
    cin.tie(NULL);
    int t;
    cin >> t;
    while (t--) {
        solve();
    }
    return 0;
}
