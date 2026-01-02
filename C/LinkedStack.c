#include <stdio.h>
#include <stdlib.h>

struct node {
    int data;
    struct node *next;
};

struct node *top = NULL;
int count = 0;

int isEmpty() {
    return top == NULL;
}

int peek() {
    if (isEmpty()) {
        printf("\033[1;31mStack is Empty\033[0m\n");
        return -1;
    }
    return top->data;
}

void push() {
    int ele;
    struct node *newNode = (struct node *)malloc(sizeof(struct node));

    if (newNode == NULL) {
        printf("\033[1;31mHeap Overflow\033[0m\n");
        return;
    }

    printf("Enter element to push: ");
    scanf("%d", &ele);

    newNode->data = ele;
    newNode->next = top;
    top = newNode;
    count++;

    printf("\033[1;32m%d Pushed Successfully\033[0m\n", ele);
}

int pop() {
    if (isEmpty()) {
        printf("\033[1;31mStack UnderFlow !!\033[0m");
        printf("\n\033[1;31mNo Elements to POP\033[0m\n");
        return -1;
    }

    struct node *temp = top;
    int popped = temp->data;

    top = top->next;
    free(temp);
    count--;

    printf("\033[1;32mElement %d popped successfully\033[0m\n", popped);
    return popped;
}

int size() {
    return count;
}

void display() {
    struct node *temp = top;

    if (isEmpty()) {
        printf("\033[1;31mStack is Empty\033[0m\n");
        return;
    }

    printf("Stack Elements :- \n");
    while (temp != NULL) {
        printf("%d\n", temp->data);
        temp = temp->next;
    }
}

void removeAll() {
    struct node *temp;

    while (top != NULL) {
        temp = top;
        top = top->next;
        free(temp);
    }

    count = 0;
    printf("\033[1;32mStack Cleared Successfully\033[0m\n");
}

int main() {
    int choice, element, popped;

    while (1) {
        printf("\n=============================");
        printf("\n         STACK MENU");
        printf("\n=============================");
        printf("\n 1. Push");
        printf("\n 2. Pop");
        printf("\n 3. Peek");
        printf("\n 4. Display");
        printf("\n 5. Size");
        printf("\n 6. Clear Stack");
        printf("\n 7. Exit");
        printf("\n=============================");
        printf("\nEnter your choice: ");
        scanf("%d", &choice);

        switch (choice) {
        case 1:
            push();
            break;

        case 2:
            popped = pop();
            if (popped != -1)
                printf("\nPopped: %d\n", popped);
            break;

        case 3:
            element = peek();
            if (element != -1)
                printf("\nTop Element: %d\n", element);
            break;

        case 4:
            display();
            break;

        case 5:
            printf("\nCurrent Stack Size: %d\n", size());
            break;

        case 6:
            removeAll();
            break;

        case 7:
            printf("\nExiting Stack Program...\n");
            return 0;

        default:
            printf("\n\033[1;31mInvalid Choice! Try Again.\033[0m\n");
        }
    }
}
