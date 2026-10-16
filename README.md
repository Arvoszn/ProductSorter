# Product Count Sorter (Java)

QuickSort applied to a product catalog: sorts `Product` records from the lowest
stock count to the highest, then prints the three lowest. A second, traced
variant prints every partition and pivot choice while it sorts.

## Two entry points

| Class | What it does |
| --- | --- |
| `TestClass` | Sorts 8 products by quantity and lists the 3 lowest |
| `QuickSort` | Static `sort(Product[])` — median-free Lomuto-style partition on quantity |
| `ProductCountSorter` | Same algorithm, but logs each sub-array, pivot, and partition result |

## What it demonstrates

- Recursive divide and conquer on objects, not just integers
- A comparator applied inside the partition step (`Product` quantity)
- Instrumented sorting — printing the sub-array and pivot at every step is how
  the algorithm was traced by hand in class
- Table formatting for console reports

## Run

```bash
javac -d out productcountsorter/*.java
java -cp out TestClass               # the catalog demo
java -cp out QuickSort.ProductCountSorter   # the step-by-step trace
```

> Note: `ProductCountSorter.java` declares `package QuickSort;` while its
> siblings sit in the default package, so it must be launched by its fully
> qualified name after compiling with `-d out`.

Java 8+. No dependencies.

---

Coursework by **Argelo Nuñez** · [argelo.spawntel.com](https://argelo.spawntel.com) · © 2026, shared for reference — all rights reserved.
