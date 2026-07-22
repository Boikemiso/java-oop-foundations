# Module 4: Polymorphism — Post-Solutions and Best Use Cases

This document is for **after** you attempt all TODOs in:
- `src/main/java/com/oop/module4/PolymorphismExercises.java`
- `src/test/java/com/oop/module4/PolymorphismExercisesTest.java`

It shows **3+ solution styles** with best use cases and level tags.

---

## Solution A — Direct & Clear (Beginner)

**Level:** Beginner  
**When to use:** Learning phase, interviews, codebases that prioritize explicitness over abstraction.

### Characteristics
- Straightforward loops (`for`) for aggregation.
- Explicit `instanceof` checks where needed.
- String building with simple concatenation or `StringBuilder`.

### Why it's good
- Easy to debug.
- Easy for new developers to follow.
- Minimizes conceptual overhead.

---

## Solution B — Stream-Oriented (Intermediate)

**Level:** Intermediate  
**When to use:** Teams comfortable with Java Streams and functional style.

### Characteristics
- `shapes.stream().mapToDouble(Shape::area).sum()` for total area.
- `shapes.stream().map(Shape::describe).collect(joining("\n"))` for reports.
- `methods.stream().map(...)` for processing payment lines.

### Why it's good
- Concise and expressive for collection transformations.
- Reduces boilerplate in map/filter/reduce style operations.

### Tradeoff
- Can be harder for beginners to debug step-by-step.

---

## Solution C — OOP + Strategy-Enriched (Advanced)

**Level:** Advanced  
**When to use:** Larger systems where reporting/formatting/fee rules evolve frequently.

### Characteristics
- Introduce collaborators such as:
  - `ShapeReportFormatter`
  - `PaymentSummaryFormatter`
  - `FeePolicy`
- Keep domain objects focused on domain behavior; formatting delegated out.

### Why it's good
- High maintainability for changing requirements.
- Easier unit testing at component boundaries.
- Aligns with SOLID (especially Single Responsibility + Open/Closed).

### Tradeoff
- More files and abstraction than small exercises require.

---

## Solution D — Defensive/Contract-Heavy (Intermediate → Advanced)

**Level:** Intermediate to Advanced  
**When to use:** Production services with strict input contracts.

### Characteristics
- Validate null/negative inputs early (`Objects.requireNonNull`, argument checks).
- Explicitly document behavior for empty collections.
- Use stable deterministic formatting contracts.

### Why it's good
- Prevents hidden runtime bugs.
- Improves API reliability and predictability.

### Tradeoff
- More verbose code and tests.

---

## Suggested Path by Level

1. **Beginner:** Implement Solution A first.  
2. **Intermediate:** Refactor to Solution B and compare readability/perf tradeoffs.  
3. **Advanced:** Extract strategies/formatters (Solution C) and strengthen contracts (Solution D).

---

## Testing Guidance by Level

- **Beginner:** Happy-path constructor/method assertions.
- **Intermediate:** Add edge cases (empty collections, boundary values).
- **Advanced:** Add behavioral contracts, format exactness, and mutation/failure scenario tests.

---

## Reminder

There is no single "perfect" implementation. The "best" solution depends on:
- team skill level,
- codebase complexity,
- frequency of requirement changes,
- maintainability needs.
