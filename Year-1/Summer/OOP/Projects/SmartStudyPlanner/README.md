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

## Completed Features
- [x] Add Task
- [x] Display Tasks
- [x] Input Validation
- [x] Task Completion
- [ ] Remove Task
- [ ] Update Task
- [ ] Search by Subject
- [ ] Search by Priority
- [ ] Sort by Deadline
- [ ] Save/Load Tasks
