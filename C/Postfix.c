#include <ctype.h>
#include <stdio.h>
#include <string.h>

#define MAX 100

char stack[MAX];
char postfix[MAX];
int top = -1;

void push(char ch) { stack[++top] = ch; }

char pop() { return stack[top--]; }

char peek() { return stack[top]; }

int isEmpty() { return top == -1; }

int isOperator(char ch) { return (ch == '+' || ch == '-' || ch == '*' || ch == '/'); }

int precedence(char ch) {
    if (ch == '+' || ch == '-')
        return 1;
    if (ch == '*' || ch == '/')
        return 2;
    return 0;
}

int infixIsValid(char infix[]) {
    int balance = 0;
    int len     = strlen(infix);

    if (isOperator(infix[0]) || isOperator(infix[len - 1]))
        return 0;

    for (int i = 0; i < len; i++) {

        if (isalnum(infix[i])) {
            if (i + 1 < len && infix[i + 1] == '(')
                return 0;
        } else if (infix[i] == '(') {
            balance++;
            if (i + 1 < len && (isOperator(infix[i + 1]) || infix[i + 1] == ')'))
                return 0;
        } else if (infix[i] == ')') {
            balance--;
            if (balance < 0)
                return 0;
            if (i + 1 < len && isalnum(infix[i + 1]))
                return 0;
        } else if (isOperator(infix[i])) {
            if (i + 1 < len && (isOperator(infix[i + 1]) || infix[i + 1] == ')'))
                return 0;
        } else {
            return 0;
        }
    }

    return balance == 0;
}
void infixToPostfix(char infix[]) {
    int i, k = 0;
    top = -1;

    for (i = 0; infix[i] != '\0'; i++) {
        if (isalnum(infix[i])) {
            postfix[k++] = infix[i];
        } else if (infix[i] == '(') {
            push(infix[i]);
        } else if (infix[i] == ')') {
            while (!isEmpty() && peek() != '(')
                postfix[k++] = pop();
            pop();
        } else if (isOperator(infix[i])) {
            while (!isEmpty() && precedence(peek()) >= precedence(infix[i]))
                postfix[k++] = pop();
            push(infix[i]);
        }
    }
    while (!isEmpty())
        postfix[k++] = pop();

    postfix[k] = '\0';
}

int main() {
    char infix[MAX];

    printf("Enter infix expression: ");
    scanf("%99s", infix);

    if (!infixIsValid(infix)) {
        printf("INVALID infix expression\n");
        return 0;
    }

    infixToPostfix(infix);
    printf("VALID infix expression\n");
    printf("Postfix expression: %s\n", postfix);

    return 0;
}