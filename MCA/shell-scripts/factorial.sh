#!/bin/bash

# Check if arguments are given
if [ $# -eq 0 ]; then
    echo "Usage: $0 number1 number2 ..."
    exit 1
fi

for num in "$@"
do
    fact=1

    if [ $num -lt 0 ]; then
        echo "Factorial of $num is not defined"
        continue
    fi

    for (( i=1; i<=num; i++ ))
    do
        fact=$((fact * i))
    done

    echo "Factorial of $num = $fact"
done
