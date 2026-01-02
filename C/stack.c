#include <stdio.h>

#define max 5
int stack[max], top = -1;

int isEmpty()
{
    return top == -1 ? 1 : 0;
}

int isFull()
{
    return top == max - 1 ? 1 : 0;
}

int peek()
{
    if (isEmpty())
    {
        printf("\033[1;31mStack is Empty\033[0m\n");
        return -1;
    }
    return stack[top];
}

void push()
{
    int ele;
    if (isFull())
    {
        printf("\033[1;31mStack OverFlow !!\033[0m");
        printf("\n\033[1;31mYou can't push element\033[0m\n");
        return;
    }
    top++;
    printf("Enter element to push: ");
    scanf("%d", &ele);
    stack[top] = ele;
    printf("\033[1;32m%d Pushed Successfully\033[0m\n", ele);
}

int pop()
{
    if (isEmpty())
    {
        printf("\033[1;31mStack UnderFlow !!\033[0m");
        printf("\n\033[1;31mNo Elements to POP\033[0m\n");
        return -1;
    }
    top--;
    printf("\033[1;32mElement %d popped successfully\033[0m\n", stack[top + 1]);
    return stack[top + 1];
}

int size()
{
    return top + 1;
}

int display()
{
    int index = top, i;
    printf("Stack Elements :- \n");
    for (i = index; i >= 0; i--)
        printf("%d \n", stack[i]);
}

void removeAll()
{
    top = -1;
    printf("\033[1;32mStack Cleared Successfully\033[0m\n");
}

int main()
{
    int choice, element, popped;

    while (1)
    {
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

        switch (choice)
        {

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
            printf("\n\033[1;32m Invalid Choice! Try Again.\033[1;32m\n");
        }
    }

    return 0;
}
