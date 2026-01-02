#include <stdio.h>
#include <stdlib.h>

struct node {
    int data;
    struct node *next;
};

struct node *front = NULL;
struct node *rear  = NULL;
int count = 0;

int isEmpty() {
    return front == NULL;
}

void enqueue() {
    int x;
    struct node *newNode = (struct node *)malloc(sizeof(struct node));

    if (newNode == NULL) {
        printf("Memory Allocation Failed\n");
        return;
    }

    printf("Enter the Element: ");
    scanf("%d", &x);

    newNode->data = x;
    newNode->next = NULL;

    if (isEmpty()) {
        front = rear = newNode;
    } else {
        rear->next = newNode;
        rear = newNode;
    }

    count++;
    printf("%d inserted in Queue\n", x);
}

void dequeue() {
    if (isEmpty()) {
        printf("Queue is Empty\n");
        printf("No Elements to Delete.\n");
        return;
    }

    struct node *temp = front;
    front = front->next;

    if (front == NULL)
        rear = NULL;

    free(temp);
    count--;
}

void display() {
    if (isEmpty()) {
        printf("Queue is Empty\n");
        return;
    }

    struct node *temp = front;
    printf("Queue Elements : ");

    while (temp != NULL) {
        printf("%d,  ", temp->data);
        temp = temp->next;
    }
    printf("\n");
}

int peek() {
    return isEmpty() ? -1 : front->data;
}

int last() {
    return isEmpty() ? -1 : rear->data;
}

int size() {
    return count;
}

void clear() {
    struct node *temp;
    while (front != NULL) {
        temp = front;
        front = front->next;
        free(temp);
    }
    rear = NULL;
    count = 0;
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
