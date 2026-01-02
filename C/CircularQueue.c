#include <stdio.h>
#define SIZE 5

int cqueue[SIZE], front = -1, rear = -1;

int isEmpty() {
    return (front == -1);
}

int isFull() {
    return ((rear + 1) % SIZE == front);
}

void enqueue() {
    if (isFull()) {
        printf("Queue is Full\n");
        return;
    }

    int x;
    printf("Enter the Element: ");
    scanf("%d", &x);

    if (front == -1)  // first element
        front = 0;

    rear = (rear + 1) % SIZE;
    cqueue[rear] = x;

    printf("%d inserted into Queue\n", x);
}

void dequeue() {
    if (isEmpty()) {
        printf("Queue is Empty\n");
        return;
    }

    int deleted = cqueue[front];

    if (front == rear) {
        // Only one element was present
        front = rear = -1;
    } else {
        front = (front + 1) % SIZE;
    }

    printf("Deleted: %d\n", deleted);
}

void display() {
    if (isEmpty()) {
        printf("Queue is Empty\n");
        return;
    }

    printf("Queue Elements: ");
    int i = front;

    while (1) {
        printf("%d ", cqueue[i]);
        if (i == rear)
            break;
        i = (i + 1) % SIZE;
    }
    printf("\n");
}

int peek() {
    return isEmpty() ? -1 : cqueue[front];
}

int last() {
    return isEmpty() ? -1 : cqueue[rear];
}

int size() {
    if (isEmpty())
        return 0;

    return ((rear - front + SIZE) % SIZE) + 1;
}

void clear() {
    front = rear = -1;
    printf("Queue Cleared Successfully!\n");
}

int main() {
    int choice;

    while (1) {
        printf("\n\n===== CIRCULAR QUEUE MENU =====\n");
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

            case 1: enqueue(); break;
            case 2: dequeue(); break;
            case 3: display(); break;

            case 4:
                if (!isEmpty()) printf("Front = %d\n", peek());
                else printf("Queue is Empty\n");
                break;

            case 5:
                if (!isEmpty()) printf("Last = %d\n", last());
                else printf("Queue is Empty\n");
                break;

            case 6:
                printf("Size = %d\n", size());
                break;

            case 7: clear(); break;

            case 8:
                printf("Exiting...\n");
                return 0;

            default:
                printf("Invalid Choice!\n");
        }
    }
}