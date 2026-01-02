#include <stdio.h>
#define SIZE 5

int queue[SIZE], front = -1, rear = -1;

int isEmpty(){
    return (front == -1 || front > rear);
}

int isFull(){
    return (rear == SIZE - 1);
}

void enqueue(){
    if(isFull()){
        printf("Queue is Filled\n");
        printf("You can't insert Values\n");
        return;
    }
    int x;
    printf("Enter the Element: ");
    scanf("%d", &x);
    if(front == -1) front = 0;
    rear++;
    queue[rear] = x;
    printf("%d inserted in Queue\n", x);

}

void dequeue(){
    if (isEmpty()) {
        printf("Queue is Empty\n");
        printf("No Elements to Delete.\n");
        return;
    }
    front++;
}

void display(){
    if(isEmpty()){
        printf("Queue is Empty\n");
        return;
    }
    int i;
    printf("Queue Elements : ");
    for(i = front; i<=rear; i++)
        printf("%d,  ",queue[i]);
    printf("\n");
}

int peek(){
    return isEmpty() ? -1 : queue[front];
}

int last(){
    return isEmpty() ? -1 : queue[rear];
}

int size(){
    return rear - front + 1;
}

void clear(){
    front = rear = -1;
    printf("Queue Cleared Successfully !!!\n");
}

int main() {
    int choice;

    while (1) {
        printf("\n\n===== QUEUE MENU =====\n");
        printf("1. Enqueue\n");
        printf("2. Dequeue\n");
        printf("3. Display\n");
        printf("4. Peek (Front Element)\n");
        printf("5. Last (Rear Element)\n");
        printf("6. Size\n");
        printf("7. Clear Queue\n");
        printf("8. Exit\n");
        printf("Enter your choice: ");
        scanf("%d", &choice);

        switch (choice) {

            case 1:
                enqueue();
                break;

            case 2:
                dequeue();
                break;

            case 3:
                display();
                break;

            case 4:
                if (!isEmpty())
                    printf("Front Element = %d\n", peek());
                else
                    printf("Queue is Empty\n");
                break;

            case 5:
                if (!isEmpty())
                    printf("Last Element = %d\n", last());
                else
                    printf("Queue is Empty\n");
                break;

            case 6:
                if (!isEmpty())
                    printf("Size = %d\n", size());
                else
                    printf("Queue is Empty\n");
                break;

            case 7:
                clear();
                break;
            
            case 8:
                printf("Exiting...\n");
                return 0;

            default:
                printf("Invalid Choice! Try Again.\n");
        }
    }
}
