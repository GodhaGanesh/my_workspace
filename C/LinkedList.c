#include <stdio.h>
#include <stdlib.h>

struct node {
    int value;
    struct node *next;
};
struct node *head = NULL;

void createList() {
    int n,i;
    struct node *newNode, *temp;
    if (head != NULL) {
        printf("List Already exist !!");
        return;
    }
    printf("How many nodes you want : ");
    scanf("%d", &n);
    if (n <= 0) return;
    newNode = (struct node*)malloc(sizeof(struct node));
    printf("Enter the element: ");
    scanf("%d", &(newNode->value));
    newNode ->next = NULL;
    head = newNode;
    for ( i = 1; i < n; i++) {
        temp = newNode;
        newNode = (struct node*)malloc(sizeof(struct node));
        printf("Enter the element: ");
        scanf("%d", &(newNode->value));
        newNode ->next = NULL;
        temp ->next = newNode;
    }
    
}

void size(){
    if (head == NULL) {
        printf("List is Empty");
        return;
    }
    struct node *temp;
    int count = 0;
    temp = head;
    while (temp != NULL) {
        count++;
        temp = temp -> next;
    }
    printf("The size of LinkedList is %d\n", count);
}

void insertAtBeginning(int x){
    struct node *newNode;
    newNode = malloc(sizeof(struct node));
    newNode ->value = x;
    newNode -> next = head;
    head = newNode;
}

void insertAtEnd(int x){
    struct node *newNode, *temp;
    newNode = malloc(sizeof(struct node));
    newNode -> value = x;
    newNode -> next = NULL;
    if(head == NULL){
        head = newNode;
        return;
    }
        
    temp = head;
    while(temp ->next != NULL){
        temp = temp -> next;
    }
    temp -> next = newNode;
}

void display(){
    if (head == NULL){
        printf("List is Empty\n");
        return;
    }
    struct node *temp;
    temp = head;
    while (temp != NULL){
        if (temp != head){
            printf("->");
        }
        printf(" %d ",temp ->value);
        temp = temp -> next;
    }
     
}

void insertAtPos(int x, int pos){
    int i = 0;
    struct node *temp, *newNode;
    if(pos == 1) {
        insertAtBeginning(x);
        return;
    }
    newNode = malloc(sizeof(struct node));
    newNode -> value = x;
    temp = head;
    for(i = 1; temp != NULL && i < pos - 1; i++) temp = temp -> next;

    if(temp == NULL){
        printf("Position Out of Bound");
        return;
    }

    newNode -> next = temp -> next;
    temp -> next = newNode;
}


int search(int x){
    if (head == NULL){
        printf("Not Found, List is Empty\n");
        return 0;
    }
    struct node *temp;
    temp = head;
    while(temp != NULL){
        if(temp -> value == x){
            printf("Element Found in List");
            return 1;
        }
        temp = temp ->next;
    }
    printf("Element Not Found in List");
    return 0;
}

void deleteByPos(int pos){
    struct node *temp, *delete;
    int i = 0;
    if (head == NULL) {
        printf("List is empty, nothing to delete\n");
        return;
    }
    if(pos == 1) {
        delete = head;
        head = head -> next;
        free(delete);
        return;
    }
    temp = head;
    for(i = 1; temp != NULL && i < pos - 1; i++) temp = temp -> next;

    if(temp == NULL || temp -> next ==NULL){
        printf("Position Out of Bound\n");
        return;
    }
    delete = temp -> next;
    temp -> next = temp -> next -> next;
    free(delete);
}

void deleteByValue(int x){
    struct node *temp, *delete;

    if (head == NULL) {
        printf("List is empty, nothing to delete\n");
        return;
    }

    if(head -> value == x){
        delete = head;
        head = head -> next;
        free(delete);
        return;
    }
    temp = head;
    while(temp -> next != NULL){
        if(temp -> next -> value == x){
            delete = temp -> next;
            temp -> next = temp -> next -> next;
            free(delete);
        } else {
            temp = temp -> next;
        }
    }
}

void clearList(){
    struct node *temp, *nextNode;
    temp = head;
    while (temp != NULL){
        nextNode = temp -> next;
        free(temp);
        temp = nextNode;
    }
    head = NULL;
}

int main()
{
    int choice, ele, pos;
    while(1){
        printf("\n\n=========Linked List=========\n\n");
        printf("1. Create\n");
        printf("2. Display\n");
        printf("3. Size\n");
        printf("4. insertAtBeginning\n");
        printf("5. insertAtEnd\n");
        printf("6. Search\n");
        printf("7. InsertAtPos\n");
        printf("8. Delete At Pos\n");
        printf("9. Delete By Value\n");
        printf("10. Clear the List\n");
        printf("11. exit\n");
        printf("Enter the Choice: ");
        scanf("%d", &choice);

        switch (choice) {
            case 1 :
                createList();
                break;
            case 2 :
                display();
                break;
            case 3 :
                size();
                break;
            case 4 :
                printf("Enter the element : ");
                scanf("%d", &ele);
                insertAtBeginning(ele);
                break;
            case 5 :
                printf("Enter the element : ");
                scanf("%d", &ele);
                insertAtEnd(ele);
                break;
            case 6 :
                printf("Which Element you want to search : ");
                scanf("%d", &ele);
                search(ele);
                break;
            case 7 :
                printf("Enter the element : ");
                scanf("%d", &ele);
                printf("Enter the Position : ");
                scanf("%d", &pos);
                insertAtPos(ele, pos);
                break;
            case 8 :
                printf("Enter the Position : ");
                scanf("%d", &pos);
                deleteByPos(pos);
                break;
            case 9 :
                printf("Enter the Value : ");
                scanf("%d", &ele);
                deleteByValue(ele);
                break;
            case 10 :
                clearList();
                printf("List Cleared !!");
                break;
            case 11 :
                return 0;
            default:
                printf("\n\n!! Enter the Valid Value !!\n\n");
                break;
        }
    }
    return 0;
}
