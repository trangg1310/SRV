#include <iostream>
#include <algorithm>
#include <cstring>

using namespace std;
const int MAX=1001;
int arr[MAX];
int high_index[100005];
int finalpos[MAX];
int main()
{
    int T;
    scanf(" %d",&T);
    while(T--){
    int N;
    scanf(" %d",&N);
        int i,j;
        // reset gia tri cua mang ket qua
        memset(finalpos,0,sizeof(finalpos));
        for(i=0;i<N;i++) scanf(" %d",&arr[i]);
        for(i=0;i<N;i++) scanf(" %d",&high_index[arr[i]]);
        sort(arr,arr+N);
        for(i=0;i<N;i++){
 
			int cnt=high_index[arr[i]];
			// tim vi tri
            for(j=0;j<N;j++){
            	// khi nao bien dem bang 0 thi dien no vao
                if(cnt==0 && finalpos[j]==0) {
                    finalpos[j]=arr[i];
                    break;
                }
                // khi o truoc trong thi giam bien dem
                if(finalpos[j]==0) cnt--;
            }
 
        }
        for(i=0;i<N;i++) printf("%d ",finalpos[i]);
        printf("\n");
    }
    return 0;
}