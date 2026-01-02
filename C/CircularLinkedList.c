#include <stdio.h>
#include <stdlib.h>

struct node {
    int data;
    struct node *next;
};

struct node *head = NULL;
int size = 0;

int isEmpty() {
    return head == NULL;
}

void createList() {
    int n, x;
    struct node *newNode, *temp;

    if (head != NULL) {
        printf("List already exists\n");
        return;
    }

    printf("How many nodes: ");
    scanf("%d", &n);

    if (n <= 0)
        return;

    for (int i = 0; i < n; i++) {
        printf("Enter element: ");
        scanf("%d", &x);

        newNode = malloc(sizeof(struct node));
        newNode->data = x;

        if (head == NULL) {
            head = newNode;
            newNode->next = head;
        } else {
            temp = head;
            while (temp->next != head)
                temp = temp->next;
            temp->next = newNode;
            newNode->next = head;
        }
        size++;
    }
}

void insertAtBeginning(int x) {
    struct node *newNode = malloc(sizeof(struct node));
    newNode->data = x;

    if (isEmpty()) {
        head = newNode;
        newNode->next = head;
    } else {
        struct node *temp = head;
        while (temp->next != head)
            temp = temp->next;
        newNode->next = head;
        temp->next = newNode;
        head = newNode;
    }
    size++;
}

void insertAtEnd(int x) {
    struct node *newNode = malloc(sizeof(struct node));
    newNode->data = x;

    if (isEmpty()) {
        head = newNode;
        newNode->next = head;
    } else {
        struct node *temp = head;
        while (temp->next != head)
            temp = temp->next;
        temp->next = newNode;
        newNode->next = head;
    }
    size++;
}

void insertAtPos(int x, int pos) {
    if (pos < 1 || pos > size + 1) {
        printf("Invalid Position\n");
        return;
    }

    if (pos == 1) {
        insertAtBeginning(x);
        return;
    }

    struct node *newNode = malloc(sizeof(struct node));
    newNode->data = x;

    struct node *temp = head;
    for (int i = 1; i < pos - 1; i++)
        temp = temp->next;

    newNode->next = temp->next;
    temp->next = newNode;
    size++;
}

void deleteAtPos(int pos) {
    if (isEmpty() || pos < 1 || pos > size) {
        printf("Invalid Position\n");
        return;
    }

    struct node *temp = head;

    if (pos == 1) {
        if (head->next == head) {
            free(head);
            head = NULL;
        } else {
            struct node *last = head;
            while (last->next != head)
                last = last->next;
            last->next = head->next;
            free(head);
            head = last->next;
        }
        size--;
        return;
    }

    for (int i = 1; i < pos - 1; i++)
        temp = temp->next;

    struct node *del = temp->next;
    temp->next = del->next;
    free(del);
    size--;
}

void deleteByValue(int x) {
    if (isEmpty())
        return;

    struct node *temp = head, *prev = NULL;

    do {
        if (temp->data == x) {
            if (temp == head) {
                deleteAtPos(1);
                temp = head;
            } else {
                prev->next = temp->next;
                free(temp);
                size--;
                temp = prev->next;
            }
        } else {
            prev = temp;
            temp = temp->next;
        }
    } while (temp != head);
}

int search(int x) {
    if (isEmpty())
        return 0;

    struct node *temp = head;
    do {
        if (temp->data == x)
            return 1;
        temp = temp->next;
    } while (temp != head);

    return 0;
}

void display() {
    if (isEmpty()) {
        printf("List is Empty\n");
        return;
    }

    struct node *temp = head;
    printf("Circular List: ");
    do {
        printf("%d -> ", temp->data);
        temp = temp->next;
    } while (temp != head);
    printf("(HEAD)\n");
}

void clearList() {
    if (isEmpty())
        return;

    struct node *temp = head->next;
    while (temp != head) {
        struct node *next = temp->next;
        free(temp);
        temp = next;
    }
    free(head);
    head = NULL;
    size = 0;
    printf("List Cleared\n");
}

int main() {
    int choice, x, pos;

    while (1) {
        printf("\n===== CIRCULAR LINKED LIST =====\n");
        printf("1. Create\n2. Display\n3. Insert at Beginning\n");
        printf("4. Insert at End\n5. Insert at Position\n");
        printf("6. Delete at Position\n7. Delete by Value\n");
        printf("8. Search\n9. Size\n10. Clear\n11. Exit\n");
        printf("Enter choice: ");
        scanf("%d", &choice);

        switch (choice) {
        case 1: createList(); break;
        case 2: display(); break;
        case 3: scanf("%d", &x); insertAtBeginning(x); break;
        case 4: scanf("%d", &x); insertAtEnd(x); break;
        case 5: scanf("%d%d", &x, &pos); insertAtPos(x, pos); break;
        case 6: scanf("%d", &pos); deleteAtPos(pos); break;
        case 7: scanf("%d", &x); deleteByValue(x); break;
        case 8: scanf("%d", &x); printf(search(x) ? "Found\n" : "Not Found\n"); break;
        case 9: printf("Size = %d\n", size); break;
        case 10: clearList(); break;
        case 11: return 0;
        default: printf("Invalid Choice\n");
        }
    }
}
