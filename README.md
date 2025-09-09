[![Open in Codespaces](https://classroom.github.com/assets/launch-codespace-2972f46106e565e64193e422d61a12cf1da4916b45550586e14ef0a7c637dd04.svg)](https://classroom.github.com/open-in-codespaces?assignment_repo_id=20408814)
# unit-1-6-assignment

## Git Config
```
git config user.name "userName"
git config user.email "userEmail"
```

## Running Java Programs
1. Compile with `javac FileName.java`
2. Run with `java FileName`

## Problem1
Try to run the following code:
```java
double x = 5 / 20;
System.out.println(x);
```
What answer do you get? The answer is imprecise!

Write a Java program that precisely calculates the decimal value of a fraction, and prints the answer to the screen. The value displayed must be accurate.

Sample Run:
```
numerator: 5
denominator: 20
The decimal value is: 0.25
```

## Problem2
Write a program which takes two doubles and then prints the sum of the numbers when they are both rounded to their nearest whole number. You may assume the doubles are always positive.

Hint: Remember not to just truncate the number - look back at the slides from the lesson if you don't remember how to ensure the number is rounded, not just truncated.

Sample run:
```
Two original numbers:
57.3934
22.5211
Answer: 57 + 23 = 80
```

## Problem3
Create a double and print the first three digits after the decimal point with a space between them.

Sample run:
```
decimal number: 67.3424
Answer: 3 4 2
```
Hint - to complete the second coding activity in lesson 5 you had to learn how to get individual digits from an int value. You can reuse this method once you convert the user input to an appropriate int value (you will need both multiplication and casting for this).
