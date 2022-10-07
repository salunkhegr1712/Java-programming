// Online C compiler to run C program online
#include <stdio.h>

void arrayupdate(int a[]){
    a[0]=12;
}
int main() {
    // Write C code here
    // printf("Hello world");
    int arr[]={1,4,15,1,78,1,85};
    for(int x=0;x<7;x++){
        printf(" %d ",arr[x]);
    }
    printf("\n");
    arrayupdate(arr);
    for(int x=0;x<7;x++){
        printf(" %d ",arr[x]);
    }
    return 0;
}