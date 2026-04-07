#!/bin/bash
read -p "Enter three Numbers: " a b c
[ $a -gt $b ]&&{[ $a -gt $c ]&&largest=$a||largest=$c}||{[ $b -gt $c ]&&largest=$b||largest=$c}
echo "Largest : $largest"
