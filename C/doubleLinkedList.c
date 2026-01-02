#include <stdio.h>
#include <stdlib.h>

struct node {
    int value;
    struct node* next;
    struct node* prev;
};

struct node* head = NULL;
int size          = 0;

void createList() {
    int n, i;
    struct node *newNode, *temp;

    if (head != NULL) {
        printf("List already exists!\n");
        return;
    }

    printf("How many nodes you want: ");
    scanf("%d", &n);

    if (n <= 0)
        return;

    size = n;

    newNode = (struct node*)malloc(sizeof(struct node));
    printf("Enter the element: ");
    scanf("%d", &newNode->value);

    newNode->prev = NULL;
    newNode->next = NULL;
    head          = newNode;
    temp          = head;

    for (i = 1; i < n; i++) {
        newNode = (struct node*)malloc(sizeof(struct node));
        printf("Enter the element: ");
        scanf("%d", &newNode->value);

        newNode->next = NULL;
        newNode->prev = temp;
        temp->next    = newNode;
        temp          = newNode;
    }
}

void insertAtBeginning(int x) {
    struct node* newNode = malloc(sizeof(struct node));
    newNode->value       = x;
    newNode->prev        = NULL;
    newNode->next        = head;

    if (head != NULL)
        head->prev = newNode;

    head = newNode;
    size++;
}

void insertAtEnd(int x) {
    struct node* newNode = malloc(sizeof(struct node));
    struct node* temp    = head;

    newNode->value = x;
    newNode->next  = NULL;

    if (head == NULL) {
        newNode->prev = NULL;
        head          = newNode;
    } else {
        while (temp->next != NULL)
            temp = temp->next;

        temp->next    = newNode;
        newNode->prev = temp;
    }
    size++;
}

void display() {
    struct node* temp = head;

    if (head == NULL) {
        printf("List is Empty\n");
        return;
    }

    while (temp != NULL) {
        printf(" %d ", temp->value);
        if (temp->next != NULL)
            printf("<->");
        temp = temp->next;
    }
    printf("\n");
}

void insertAtPos(int x, int pos) {
    if (pos < 1 || pos > size + 1) {
        printf("Position Out of Bound\n");
        return;
    }

    if (pos == 1) {
        insertAtBeginning(x);
        return;
    }

    struct node* temp    = head;
    struct node* newNode = malloc(sizeof(struct node));

    for (int i = 1; i < pos - 1; i++)
        temp = temp->next;

    newNode->value = x;
    newNode->next  = temp->next;
    newNode->prev  = temp;

    if (temp->next != NULL)
        temp->next->prev = newNode;

    temp->next = newNode;
    size++;
}

int search(int x) {
    struct node* temp = head;

    while (temp != NULL) {
        if (temp->value == x) {
            printf("Element Found\n");
            return 1;
        }
        temp = temp->next;
    }

    printf("Element Not Found\n");
    return 0;
}

void deleteByPos(int pos) {
    if (head == NULL || pos < 1 || pos > size) {
        printf("Invalid Position\n");
        return;
    }

    struct node* temp = head;

    if (pos == 1) {
        head = head->next;
        if (head != NULL)
            head->prev = NULL;
        free(temp);
        size--;
        return;
    }

    for (int i = 1; i < pos; i++)
        temp = temp->next;

    temp->prev->next = temp->next;

    if (temp->next != NULL)
        temp->next->prev = temp->prev;

    free(temp);
    size--;
}

void deleteByValue(int x) {
    struct node* temp = head;

    while (temp != NULL) {
        if (temp->value == x) {
            struct node* del = temp;

            if (temp->prev != NULL)
                temp->prev->next = temp->next;
            else
                head = temp->next;

            if (temp->next != NULL)
                temp->next->prev = temp->prev;

            temp = temp->next;
            free(del);
            size--;
        } else {
            temp = temp->next;
        }
    }
}

void clearList() {
    struct node* temp = head;

    while (temp != NULL) {
        struct node* nextNode = temp->next;
        free(temp);
        temp = nextNode;
    }

    head = NULL;
    size = 0;
}

int main() {
    int choice, ele, pos;

    while (1) {
        printf("\n========= Double Linked List =========\n");
        printf("1. Create\n2. Display\n3. Size\n4. Insert at Beginning\n");
        printf("5. Insert at End\n6. Search\n7. Insert at Position\n");
        printf("8. Delete at Position\n9. Delete by Value\n");
        printf("10. Clear List\n11. Exit\n");
        printf("Enter choice: ");
        scanf("%d", &choice);

        switch (choice) {
        case 1:
            createList();
            break;
        case 2:
            display();
            break;
        case 3:
            printf("Size: %d\n", size);
            break;
        case 4:
            scanf("%d", &ele);
            insertAtBeginning(ele);
            break;
        case 5:
            scanf("%d", &ele);
            insertAtEnd(ele);
            break;
        case 6:
            scanf("%d", &ele);
            search(ele);
            break;
        case 7:
            scanf("%d%d", &ele, &pos);
            insertAtPos(ele, pos);
            break;
        case 8:
            scanf("%d", &pos);
            deleteByPos(pos);
            break;
        case 9:
            scanf("%d", &ele);
            deleteByValue(ele);
            break;
        case 10:
            clearList();
            printf("List Cleared\n");
            break;
        case 11:
            return 0;
        default:
            printf("Invalid Choice\n");
        }
    }
}
