#include <stdio.h>
void main(){
    int n = 0, ele[20][20], i, j, num = 1;

    printf("Enter the Odd Value : ");
    scanf("%d", &n);

    for ( i = 0; i < n; i++)
        for ( j = 0; j < n; j++)
            ele[i][j] = 0;
            
    i = 0, j = (n/2);
    while(num <= n*n){
        ele[i][j] = num;
        num++;
        i = (i - 1 < 0) ? n - 1 : i - 1;
        j = (j + 1 >= n) ? 0 : j + 1;
        if (ele[i][j] != 0)
        {
            i = (i + 2 >= n) ? 0 : i + 2;
            j = (j - 1 < 0) ? n - 1 : j - 1;
            if (ele[i][j] != 0)
                i++;
        }
    }
    for ( i = 0; i < n; i++){
        for ( j = 0; j < n; j++){
            if(ele[i][j]<10)
                printf(" 0%d ", ele[i][j]);
            else
                printf(" %d ", ele[i][j]);
        }
        printf("\n");
    }
}