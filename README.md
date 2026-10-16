Java implementation exploring the **`Comparable`** and **`Comparator`** interfaces using an Uno-style card game model. 

## Project Components

* **`Card` Class:** Manages card color and value with accessors, mutators, a custom `toString()` method, and natural sorting via the `Comparable` interface (sorting primarily by color, then by value).
* **`Deck` Class:** Automatically populates an `ArrayList` with 76 Uno cards, implements a nested-loop shuffle method, and supports standard sorting as well as custom value sorting.
* **`ValueComparator` Class:** Implements the `Comparator` interface to provide custom sorting by card value only.
* **`Main` Class:** A driver program that exercises the deck, shuffling and sorting the cards, and displaying the results using `JOptionPane` dialog boxes.
