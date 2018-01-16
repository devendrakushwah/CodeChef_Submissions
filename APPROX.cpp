#include <bits/stdc++.h>

int main() {
	int t;
	scanf("%d", &t);
	while(t--) {
		int k;
		scanf("%d", &k);
		int a = 103993, b = 33102;
		for (int i = 0; i <= k; ++i) {
			printf("%d", a / b);
			if (i == 0 && k > 0) {
				printf(".");
			}
			a = a % b * 10;
		}
		printf("\n");
	}
	return 0;
}
