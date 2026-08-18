# Music song list project
This is my personal project that connects my passion for music with my journey of learning programming. I wanted a way to make learning OOP concepts more enjoyable by building something that directly helps me in my music life.

The project isn’t meant to impress employers — it’s designed to solve a real problem I face: keeping track of my worship set-lists. Too often I find myself asking, “What songs did I play again?” With this project, I can store and revisit my sets anytime, eliminating the guesswork.

So What's in here:

* `WorshipSet` — Represents a set of songs for a specific event or occasion. Includes:
- Songs
- Musical keys
- Musicians
- Date
- Label (event name)
* `More to come` — This is just V1. I’ll keep adding features as I grow in both music and programming.

---
# Devlog — Day 1 `(8/18/2026)`

## What i built today
Started from five empty class files and ended with a working object model for tracking worship set-lists:

- `Instrument` — name + type, with full validation or constraints.
- `Musician` — name, age, and list of instruments they play.
- `Chord` — a Nashville-number chord symbol.
- `Song` — title, artist, musical key (`MusicalKey` enum), and a chord progression.
- `WorshipSet` — the integration point: a labeled, dated set-list made up of songs and musicians, with `addSong()`, removeSong(), `addMusicians()`, and `totalSongs`.
- `Main` — wires everything together and exercises the whole object graph end to end.

## What I Learned
`Encapsulation` isn't just `Private` fields. Every class valdiates its own state in the constructor and in every setter.

`Defensive Copying`. This was the big one. It's hard to understand it at first, but with few reading and testing i get it. Storing a list directly (`this.songs = songs;`) doesn't store the data — it stores a reference to the caller's actual list. Two objects can end up silently sharing one list in memory, so mutating it through one object (or even from completely outside, back in `Main`) changes the other. The fix is copying the way in (constructor/setter) and copying on the way out (getter).

- new ArrayList<>(source) — an independent list, still mutable.
- List.copyOf(source) — an independed, locked list; useful when nothing should ever add to it after creation.

I proved this and myself by writing a Main that builds a WorshipSet, then calls `x.clear()` and nothing happens.

## What's next
- `equals()`/`hashCode()` on `Song`/`Musician`/`Chord`
- A small `Scanner-based` CLI in `Main` so set-lists can be built interactively instead of hardcoded.
- `File Handling`
- `Inheritance/interface` possible


