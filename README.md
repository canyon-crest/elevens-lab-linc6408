[![Review Assignment Due Date](https://classroom.github.com/assets/deadline-readme-button-22041afd0340ce965d47ae6ef1cefeee28c7c493a6346c4f15d667ab976d596c.svg)](https://classroom.github.com/a/6JhiEIJo)
# Elevens Project

## Introduction
This project involves implementing and testing a simplified solitaire game called Elevens. Each activity in this project guides you through creating, shuffling, and dealing cards, as well as adding functionality to determine valid plays. You’ll learn to work with Object-Oriented Principles, implement unit tests, and understand debugging strategies.

## Activities Overview
Each activity builds on the previous one, focusing on different components of the game. Here’s a summary of each activity:

### Activity 1: Card1 Class
Develop a `Card1` class to represent individual cards. Methods include:
- `rank`, `suit`, and `pointValue` accessor methods.
- `matches`: checks if two cards have the same attributes.
- `toString`: provides a formatted string of card details.

### Activity 2: Deck2 Class
Implement a `Deck2` class that contains:
- `isEmpty`: checks if the deck is empty.
- `size`: returns the number of remaining undealt cards.
- `deal`: removes and returns the top card.
- `shuffle`: randomizes the deck order.

### Activity 3: Shuffler3 Class
Explore shuffling algorithms:
- `perfectShuffle`: splits the deck in half and interleaves cards.
- `selectionShuffle`: randomly swaps cards to create a randomized deck.

### Activity 4: Deck4 with Shuffle
Expand the `Deck4` class to include the shuffle method using the `selectionShuffle` algorithm.

### Activity 9: ElevensBoard9 Class
Implement the `ElevensBoard9` class:
- `isLegal`: checks if a selection of cards forms a valid play.
- `anotherPlayIsPossible`: determines if there are valid plays left on the board.

### Activity 10: ThirteensBoard10 Class
Implement a `ThirteensBoard10` class:
- `isLegal`: checks if a selection of cards forms a valid play based on the rules of Thirteens.
- `anotherPlayIsPossible`: determines if there are valid plays left.

### Activity 11: ElevensSimulation11
Simulate noninteractive games of Elevens and track the percentage of games won. Run multiple games in a loop to get consistent win statistics.

## Unit Testing Overview
The project includes unit tests for Activities 1-4 and Activities 9-11, designed to verify the functionality of each component. Below is a summary of each unit test with the associated activity, description, and points.

| Test Method                     | Description                                                                               | Points |
|---------------------------------|-------------------------------------------------------------------------------------------|--------|
| `testCardClass`                 | Validates the `Card1` class, including `rank`, `suit`, `pointValue`, `matches`, and `toString` | 10     |
| `testDeckClassActivity2`        | Tests the `Deck2` class, including `isEmpty`, `size`, `deal`, and `shuffle` methods       | 15     |
| `testShufflerClass`             | Verifies the `perfectShuffle` and `selectionShuffle` methods, ensuring correct shuffle logic | 10     |
| `testDeckClassActivity4`        | Tests the `Deck4` class with shuffle functionality as implemented in Activity 4           | 10     |
| `testElevensBoardClassActivity9`| Runs `ElevensBoard9` functionality, checking if at least one valid play is found in 100 trials | 15     |
| `testThirteensBoardClassActivity10` | Runs `ThirteensBoard10` functionality, checking if at least one valid play is found in 100 trials | 15     |
| `testElevensSimulationClassActivity11` | Simulates 100 noninteractive games of Elevens, checking for at least one game win     | 25     |

## Contact Information
For questions or assistance with this project, please contact Kevin at [kevin@csplusplus.com](mailto:kevin@csplusplus.com).
