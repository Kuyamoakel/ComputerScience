# Simple SIM Card Loading System

**Course:** DCIT23
**Language:** Java
**Type:** Console Application

## Description

This Java console program simulates a simple SIM card loading system.
It validates the phone number, detects the SIM network, verifies the load amount, and checks if the payment is sufficient before completing the transaction.

## Features

* Phone number validation
* SIM network detection using prefix
* Load amount validation
* Payment validation
* Error handling using loops
* Simple transaction simulation

## Network Detection

The program determines the network based on the phone number prefix.

| Network         | Prefix Range |
| --------------- | ------------ |
| **GLOBE / TM**  | 0901 – 0950  |
| **SMART / SUN** | 0951 – 0999  |

## Sample Program Output

### Invalid Phone Number

![Invalid Phone](screenshots/programoutput1.png)

### Invalid Load Amount

![Invalid Load](screenshots/programoutput2.png)

### Insufficient Payment

![Payment Error](screenshots/programoutput3.png)

### Successful Transaction

![Success](screenshots/programoutput4.png)

## Concepts Used

* Conditional Statements (`if`, `else`)
* Loops (`while`)
* String manipulation
* Input validation
* Basic program structure

## Author

**Akel Almozara**
