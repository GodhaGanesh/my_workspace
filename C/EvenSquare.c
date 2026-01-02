#include <stdio.h>
void main(){
    int n = 0, ele[10][10], i, j, num = 1, temp = 0;

    printf("Enter the even Value : ");
    scanf("%d", &n);

    for ( i = 0; i < n; i++)
        for ( j = 0; j < n; j++){
            ele[i][j] = num;
            num++;
        }
    
    for(i = 0; i < (n/2); i++){
        temp = ele[i][i];
        ele[i][i] = ele[n - i - 1][n - i - 1];
        ele[n - i - 1][n - i - 1] = temp;
    }
    
    for(i = n - 1, j = 0; j<(n/2); i--, j++){
        temp = ele[i][j];
        ele[i][j] = ele[n - i - 1][n - j - 1];
        ele[n - i - 1][n - j - 1] = temp;
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