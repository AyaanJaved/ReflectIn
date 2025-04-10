# ReflectIn ⏳🪞

> *“Quick check-in — is this how you meant to spend the last hour?”* 👀

---

You know those moments when you look up and realize you’ve been doom-scrolling for 45 minutes?  
Yeah... this app wants to catch you **before** that happens.

**ReflectIn** is like a soft nudge from a future version of you —  
the one who’s a little more intentional, a little more aware of where their time is going. 🧠✨

---

### What ReflectIn *doesn't* do:

- ❌ Shout
- ❌ Guilt-trip
- ❌ Throw behavior graphs from 2016 at you

---

### What it *does* do:

- 🧘‍♀️ Gently interrupts autopilot
- 🕒 Nudges you to check in at just the right time
- 🪞 Helps you realign with your intentions

---

### Peek behind the curtain 🔍

Curious how this whole thing came together?  
I’ve laid out the design process, ideas, and thought experiments over here:  
👉 [Notion Page](https://www.notion.so/ReflectIn-Software-Requirements-and-Design-Document-SRDD-1cfce6046a1580629dd0ed588e44131b?pvs=4)

---

### 🛠️ Android Tech Stack

ReflectIn is powered by a modern, modular architecture that prioritizes clarity and shared logic:

- **Kotlin Multiplatform** — Shared business logic across Android and iOS
- **Compose Multiplatform** — Shared UI written once, rendered natively
- **Jetpack Compose** — Declarative UI on Android
- **Kotlin Coroutines** — For asynchronous and reactive programming
- **StateFlow & Flow** — Reactive streams for state management
- **ViewModel (Multiplatform)** — To hold UI state across platforms
- **Koin** — Lightweight dependency injection
- **Gradle Kotlin DSL** — For a cleaner build configuration

> 🧩 Clean, layered architecture — presentation, domain, and data layers, all testable and decoupled.