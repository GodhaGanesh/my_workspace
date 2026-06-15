#include <stdio.h>

int main() {
    int n, quantum;

    printf("Enter number of processes: ");
    scanf("%d", &n);

    int at[n], bt[n], remaining_bt[n];
    int ct[n], tat[n], wt[n];
    int completed = 0, time = 0;

    printf("\nEnter Arrival Time and Burst Time:\n");
    for (int i = 0; i < n; i++) {
        printf("P%d Arrival Time: ", i + 1);
        scanf("%d", &at[i]);
        printf("P%d Burst Time: ", i + 1);
        scanf("%d", &bt[i]);
        remaining_bt[i] = bt[i];
    }

    printf("\nEnter Time Quantum: ");
    scanf("%d", &quantum);

    printf("\nGantt Chart:\n");

    while (completed < n) {
        int executed = 0;

        for (int i = 0; i < n; i++) {
            if (remaining_bt[i] > 0 && at[i] <= time) {
                executed = 1;

                if (remaining_bt[i] <= quantum) {
                    printf("P%d (%d-%d) ", i + 1, time, time + remaining_bt[i]);
                    time += remaining_bt[i];
                    ct[i] = time;
                    remaining_bt[i] = 0;
                    completed++;
                } else {
                    printf("P%d (%d-%d) ", i + 1, time, time + quantum);
                    time += quantum;
                    remaining_bt[i] -= quantum;
                }
            }
        }

        // If no process is ready, move time forward
        if (!executed) {
            time++;
        }
    }

    float avg_tat = 0, avg_wt = 0;

    printf("\n\nProcess\tAT\tBT\tCT\tTAT\tWT\n");

    for (int i = 0; i < n; i++) {
        tat[i] = ct[i] - at[i];
        wt[i] = tat[i] - bt[i];

        printf("P%d\t%d\t%d\t%d\t%d\t%d\n",
               i + 1, at[i], bt[i], ct[i], tat[i], wt[i]);

        avg_tat += tat[i];
        avg_wt += wt[i];
    }

    printf("\nAverage Turnaround Time: %.2f", avg_tat / n);
    printf("\nAverage Waiting Time: %.2f\n", avg_wt / n);

    return 0;
}