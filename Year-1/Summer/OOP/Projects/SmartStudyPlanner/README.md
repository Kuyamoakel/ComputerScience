# Smart Study Planner

## Overview
Smart Study Planner is a Java OOP personal project that helps me to organize my study task, set priorities, and track progress.

---

### DAY 1 - `06-30-2026`
- ✅ Initialized project structure (`Main.java`, `Planner.java`, `Task.java`)
- ✅ Implemented `Priority, Subject` enum (LOW, MEDIUM, HIGH), (MINISTRY, FAITH, MATH, CODING, SQL).
- ✅ Added `addTask()` and `displayTask()` methods

--- 

### DAY 2 - `07-01-2026`

- ✅ Refactored `Planner.addTask()` to accept a `Task` object instead of multiple parameters.
- ✅ Replaced `String completed` with `boolean completed`.
- ✅ Replaced `String` dates with `LocalDate`.
- ✅ Automatically set `createdDate` using `LocalDate.now()`.
- ✅ Added constructor validation using `IllegalArgumentException`.
- ✅ Prevented invalid `Task` objects (empty title, empty description, null priority/subject, past deadline).
- ✅ Refactored `getCompleted()` to `isCompleted()`.
- ✅ Replaced `setCompleted(boolean)` with behavior-driven methods: `complete()` and `reOpen()`.
- ✅ Added validation to `setTitle()` and `setDescription()`.
- ✅ Added null check in `Planner.addTask()`.
- ✅ Improved console output formatting for task display.

### Lessons Learned

- 📚 Constructors should prevent invalid objects from being created.
- 📚 Objects should own their own state and behavior.
- 📚 Use `LocalDate` instead of `String` for dates.
- 📚 Prefer behavior methods (`complete()`) over generic setters (`setCompleted(true)`).
- 📚 Every class should protect its own invariants.
- 📚 IllegalArgumentException is better than printing error.

### DAY 3 - `07-08-2026`

- ✅ Implemented automatic task ID generation.
- ✅ Added `removeTask(String id)` feature.
- ✅ Refactored task removal to use unique IDs instead of task titles.
- ✅ Replaced enhanced `for` loop with an index-based loop for safe removal from `ArrayList`.
- ✅ Refactored `removeTask()` to return `boolean` instead of printing success/failure messages.
- ✅ Improved separation of concerns by moving user feedback to `Main.java`.
- ✅ Added input validation for task IDs.
- ✅ Continued applying defensive programming and object validation principles.

### Lessons Learned

- 📚 Every object should have a unique identifier.
- 📚 Never modify an `ArrayList` inside an enhanced `for` loop.
- 📚 Business logic should return results, while the UI decides how to present them.
- 📚 A method can communicate success or failure through its return value.
- 📚 Simpler code is often better—eliminating unnecessary variables improved readability.
- 📚 Index-based loop, iterator, `removeIf()`. these are advanced future to be applied.

## Completed Features

- [x] Add Task
- [x] Remove Task
- [x] Display Tasks
- [x] Input Validation
- [x] Automatic Task ID Generation
- [x] Task Completion
- [ ] Update Task
- [ ] Search by Subject
- [ ] Search by Priority
- [ ] Sort by Deadline
- [ ] Save/Load Tasks
