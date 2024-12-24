#include <iostream>
using namespace std;

int probo(int arr[100][100], int h, int w, int m, int n) {
    int i = 0, j = 0;
    int res = 0, maxSum = 0;

    while (i < m && i + h <= m) {
        while (j < n && j + w <= n) {
            res = 0;
            for (int x = i; x < i + h; x++) {
                for (int y = j; y < j + w; y++) {
                    // Điều kiện kiểm tra các phần tử ở viền hình chữ nhật
                    if (y == j || y == j + w - 1) { 
                        if (arr[x][y] % 2 == 0) res += arr[x][y];
                    } else if (x == i || x == i + h - 1) { 
                        if (arr[x][y] % 2 == 0) res += arr[x][y];
                    }
                }
            }
            if (res > maxSum) maxSum = res;
            j++;
        }
        j = 0; // Reset j về 0 sau mỗi lần tăng i
        i++;
    }
    return maxSum;
}

int main() {
    int t;
    cin >> t;

    for (int i = 0; i < t; i++) {
        int h, w, m, n;
        cin >> h >> w >> m >> n;

        int arr[100][100]; // Giới hạn mảng 2 chiều kích thước tối đa 100x100

        for (int j = 0; j < m; j++) {
            for (int k = 0; k < n; k++) {
                cin >> arr[j][k];
            }
        }

        cout << "#" << (i + 1) << " " << probo(arr, h, w, m, n) << endl;
    }

    return 0;
}
