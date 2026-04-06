import json
import tkinter as tk
from tkinter import messagebox

tasks = []
run = True
TASKS_FILE = "tasks.json" #give the file a name / the name of the file we’ll save tasks in

def load_tasks():#function that loads tasks from the file when you start the program
    global tasks
    try:
        with open(TASKS_FILE, "r", encoding="utf-8") as f: #Opens the file for reading ("r"). f is just a name we give to the opened file.
            tasks = json.load(f) #Reads all lines from the file and returns them as a list. Example: ["Clean room\n", "Study Python\n"]

    except FileNotFoundError: #This happens if the file doesn’t exist yet (like the first time you run the program). Then we just say tasks = [] (start empty).
        tasks = []

    except json.JSONDecodeError:
        print("Warning: tasks.json is empty or broken. Starting with an empty list.")
        tasks = []
        

def save_tasks():
    with open(TASKS_FILE, "w", encoding="utf-8") as f: #Opens the file for writing ("w" means overwrite everything with new data).
        json.dump(tasks, f, ensure_ascii=False, indent=2)

def add_task():
    global tasks
    task = input("Input new task: ")
    tasks.append(task)
    save_tasks()
    print("Task Added!")

def view_task():
    global tasks
    print("\nYour Tasks!:")
    if not tasks:
        print("No tasks yet:")
    else:
        for i, t in enumerate(tasks, 0):
            print(f"{i}. {t}")

def remove_task():
    global tasks
    num = int(input("Enter task number to remove: "))
    if 0 < num <= len(tasks):
        tasks.pop(num - 1) #remove the chose task #number should greaterthan 0 kase nag start tayo sa 1 / tasks.pop is a list method removes an item from a list by its index.
        save_tasks() #update the file
        print("Task removed!")
    else:
        print("invalid task number.")

def goodbye():
    global run
    save_tasks()
    print("GOODBYE!")
    run = False

load_tasks()

while run:
    print("\n==== TO-DO LIST ====")
    print("1. Add Task")
    print("2. View Tasks")
    print("3. Remove Task")
    print("4. Exit")
    
    choice = input("Choose an Option: ")

    if choice == "1":
        add_task()
    elif choice == "2":
        view_task()
    elif choice == "3":
        remove_task()
    elif choice == "4":
        goodbye()
    else:
        print("Invalid Input ya!")