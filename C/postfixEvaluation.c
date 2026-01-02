#include <ctype.h>
#include <stdio.h>
#include <string.h>

#define MAX 100

char stack[MAX];
int top = -1;

int numStack[MAX];
int numTop = -1;

char postfix[MAX];

void push(char ch) { stack[++top] = ch; }
char pop() { return stack[top--]; }
char peek() { return stack[top]; }
int isEmpty() { return top == -1; }

void numPush(int x) { numStack[++numTop] = x; }
int numPop() { return numStack[numTop--]; }

int isOperator(char ch) { return ch == '+' || ch == '-' || ch == '*' || ch == '/'; }
int precedence(char ch) { return (ch == '+' || ch == '-') ? 1 : (ch == '*' || ch == '/') ? 2 : 0; }

int infixIsValid(char infix[]) {
    int balance = 0, len = strlen(infix);
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
        } else
            return 0;
    }
    return balance == 0;
}

void infixToPostfix(char infix[]) {
    int k = 0;
    top   = -1;
    for (int i = 0; infix[i] != '\0'; i++) {
        if (isalnum(infix[i]))
            postfix[k++] = infix[i];
        else if (infix[i] == '(')
            push(infix[i]);
        else if (infix[i] == ')') {
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

int evaluatePostfix() {
    for (int i = 0; postfix[i] != '\0'; i++) {
        if (isdigit(postfix[i]))
            numPush(postfix[i] - '0');
        else {
            int b = numPop();
            int a = numPop();
            switch (postfix[i]) {
            case '+':
                numPush(a + b);
                break;
            case '-':
                numPush(a - b);
                break;
            case '*':
                numPush(a * b);
                break;
            case '/':
                numPush(a / b);
                break;
            }
        }
    }
    return numPop();
}

int main() {
    char infix[MAX];
    printf("Enter infix expression: ");
    scanf("%s", infix);

    if (!infixIsValid(infix)) {
        printf("INVALID infix expression\n");
        return 0;
    }

    infixToPostfix(infix);
    printf("Postfix expression: %s\n", postfix);

    int result = evaluatePostfix();
    printf("Evaluation Result: %d\n", result);

    return 0;
}
