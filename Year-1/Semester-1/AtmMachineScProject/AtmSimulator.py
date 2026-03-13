import time
import json
import os
import sys
from datetime import datetime

class BankAccount:
    def __init__(self, staff, filename="ACCOUNTS.json"):
        self.filename = filename
        self.staff = staff
        self.accounts = self.load_accounts() or []
        self.current_account = None

    def load_accounts(self):
        try:
            with open(self.filename, "r") as f:
                return json.load(f)
        except FileNotFoundError:
            print("NO ACCOUTNS YET!")
            return None

    def save_accounts(self, data):
        with open(self.filename, "w") as f:
            json.dump(data, f, indent=4)
        
    def refresh(self):
        command = 'cls' if os.name == 'nt' else 'clear'
        os.system(command)

    def type(self, text, speed=0.02):
        for char in text:
            sys.stdout.write(char)
            sys.stdout.flush()
            time.sleep(speed)
        print()
    
    def time(self):
        return datetime.now().strftime("%Y-%m-%d|%H:%M:%S")

    def loading(self):
        self.refresh()
        for x in range(2):
            for load in [".", "..", "..."]:
                print(f"Loading{load}")
                time.sleep(0.3)
                self.refresh()

    def intro_start(self):
        time.sleep(2)
        self.refresh()
        for x in range(2):
            for dots in [".", "..", "..."]:
                print("Going to the Bank")
                print(f"~ Walking{dots} ")
                time.sleep(0.3)
                self.refresh()
        self.login_interface()

    def login_interface(self):
        while True:
            print("======== WELCOME TO WADER-BANK ========")
            print("""[1] Make a Transaction~(Insert ATM Card)
[2] Open An Account~(Get ATM Card) 
[3] Exit        """)
            choice = input("CHOICE HERE: ")
            if choice == "1":
                self.transaction()
            elif choice == "2":
                self.staff_evaluation()
            elif choice == "3":
                break
            else:
                print("Invalid Input")

    def staff_evaluation(self):
        self.refresh()
        self.type("Anne: Alright! Hello my Name is Anne!")
        time.sleep(0.5)
        user_name = input(f"{self.staff}: What's your Name? ")
        time.sleep(0.3)
        self.type(f"{self.staff}: Oh, Nice to meet you {user_name}!")
        time.sleep(0.5)
        self.refresh()
        self.type(f"{self.staff}: Before we Proceed to opening your Account {user_name}.")
        time.sleep(1)
        self.type(f"{self.staff}: I want to inform you that You Need to pay ₱500 for the fee, and that money will go straight to your Balance.")
        time.sleep(0.5)
        user_choice = input(f"{self.staff}: Are you ready to Proceed and Pay the ₱500 fee later (Yes or No): ").lower()
        
        if user_choice == "yes":
            self.creating_atm_account()
        elif user_choice == "no":
            self.refresh()
            print("Alright! Thank You for Coming!")
            time.sleep(1)
            return
    def creating_atm_account(self):
        self.refresh()
        self.type(f"{self.staff}: Alright! Please fill up this Form.")
        fullname = input("Full Name: ")       
        date_of_birth = input("Date of Birth (Ex. DD/MM/YYYY): ")      
        sex = input("Sex: ")      
        occupation = input("Occupation (Ex. House wife, Professional, and Others): ")       
        email = input("E-Mail Address: ")       
        telephone = input("Telephone Number: ")
        self.type("ALRIGHT, PROCESSING!")
        self.refresh()
        self.loading()
        #SEPERATE 1
        self.type("SUCCESSFULLY ADDED!")
        self.type("Let's set up your Account ID and Change your Default Pin Password (s13j5F9U)")
        #SEPERATE 2 LANG PARA DI MAGULO
        account_key = input("Choose an account ID (Ex. Akel): ")
        new_password = input("Input New Password (Atleast 6): ")
        payment = input("Payment of the ₱500 Fee (Press Enter to Pay): ")
        self.money = 500


        trans_history = []

        new_acc = [
                account_key,
                fullname,
                date_of_birth,
                sex,
                occupation,
                email,
                telephone,
                new_password,
                self.money,
                trans_history
        ]
        self.accounts.append(new_acc)
        self.save_accounts(self.accounts)

        self.refresh()
        self.type("Done, Thank you!")
        self.type("You can now Open your Account.")
        time.sleep(1)
        self.login_interface()

    def transaction(self):
        self.refresh()
        self.type("Inserting Your Card!")
        time.sleep(0.5)
        self.loading()
    
        print("======== LOGIN ATM ========")
        user_account_id = input("Account ID: ")
        user_pin_pass = input("Pin Password: ")

        for account in self.accounts:
            if account[0] == user_account_id and account[7] == user_pin_pass:
                self.current_account = account
                self.type("WELCOME TO YOUR ACCOUNT!")
                time.sleep(1)
                self.main_dashboard()
                return
        self.type("WRONG ACCOUNT ID OR PIN!")
        time.sleep(1)

            

    def withdraw(self):
        self.refresh()
        print("======== WITHDRAW ========")
        try:
            user_withdraw = int(input("Input the Desired Amount: "))
        except ValueError:
            self.type("Invalid Number!")
            time.sleep(1)
            return
        
        balance = self.current_account[8]
        timestamp = self.time()

        if balance - user_withdraw < 500:
            self.current_account[9].append(f"{timestamp} - User tried to withdraw ₱{user_withdraw} with ₱{balance} balance")
            self.save_accounts(self.accounts)
            self.type("Insufficient Balance!")
            self.type("Must maintain at least ₱500 Balance!")
            time.sleep(1)
            return
        
        self.current_account[8] -= user_withdraw
        self.current_account[9].append(f"{timestamp} - Withdrew ₱{user_withdraw}")

        self.save_accounts(self.accounts)
        self.type(f"Successfully Withdrew ₱{user_withdraw}")
        input("\nPress Enter to return to dashboard.")


    def deposit(self):
        self.refresh()
        print("======== DEPOSIT =========")
        try:
            user_deposit = int(input("Input the Desired Amount: "))
        except ValueError:
            self.type("Invalid Number!")
            time.sleep(1)
            return
        
        timestamp = self.time()
        
        self.current_account[8] += user_deposit
        self.current_account[9].append(f"{timestamp} - Deposited ₱{user_deposit}")
        self.save_accounts(self.accounts)  
        self.type(f"Successfully deposited ₱{user_deposit}")
        input("\nPress Enter to return to dashboard.")

    def check_bal(self):
        timestamp = self.time()
        self.refresh()
        self.type(f"Your Current Balance Right Now is ₱{self.current_account[8]}.")
        self.current_account[9].append(f"{timestamp} - Balance Checked ₱{self.current_account[8]}")
        self.save_accounts(self.accounts)
        input("\nPress Enter to return to dashboard.")

    def trans_history(self):
        self.refresh()
        print("======== TRANSACTION HISTORY ========")

        history = self.current_account[9]

        if len(history) == 0:
            self.type("There isn't Transaction yet!")
            time.sleep(2)
            return
        
        for his in history:
            print(f"- {his}")
        input("\nPress Enter to return to dashboard.")

    def main_dashboard(self):
        while True:
            self.refresh()
            self.type("======== DASHBOARD =======")
            self.type("[1] Withdraw")
            self.type("[2] Deposit")
            self.type("[3] Check Balance")
            self.type("[4] Transaction History")
            self.type("[5] Exit")
            user_choice = input("CHOICE HERE: ")

            if user_choice == "1":
                self.withdraw()
            elif user_choice == "2":
                self.deposit()
            elif user_choice == "3":
                self.check_bal()
            elif user_choice == "4":
                self.trans_history()
            elif user_choice == "5":
                self.refresh()
                self.type("ALRIGHT THANK YOU SO MUCH, BABUSHH~!")
                time.sleep(1)
                sys.exit()

    def clearr(self):
        self.accounts.clear()
        self.save_accounts(self.accounts)


if __name__ == "__main__":
    bank_almozara_fulay = BankAccount("Anne")
    bank_almozara_fulay.intro_start()