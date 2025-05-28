# Modular Multiplayer Tower Defense Game Using JavaFX and FXGL

This is a modular multiplayer tower defense game developed as part of the *Advanced Object-Oriented Programming* course. The game leverages modern Java technologies to implement real-time gameplay, cooperative networking, and scalable game systems.

## Overview

Players collaborate (or compete) to defend against waves of enemies by placing and upgrading towers. The game is designed with a modular structure to allow flexibility in adding new towers, enemies, and features in future versions.

## Technologies Used

* Java 17
* JavaFX with Scene Builder (FXML-based UI)
* FXGL Game Development Framework
* Java Sockets (LAN multiplayer)
* Multithreading (enemy logic, networking)
* Secondary Storage (JSON or plain text for persistence)

## Key Features

* **Tower Mechanics**
  Tower placement, upgrades, and type variations.

* **Enemy Waves**
  Real-time spawning and pathfinding using FXGL.

* **Multiplayer Support**
  Java Socket-based networking over LAN.

* **Multithreading**
  Separate threads for networking, enemy logic, and game timers.

* **Save/Load System**
  Player data and game progress stored using secondary storage.

* **JavaFX UI**
  Built using FXML for structured and scalable user interfaces.

## Project Structure (Work in Progress)

```plaintext
/src
 └── main
     ├── java
     │   └── com.modulartd
     │        ├── app       # FXGL Application Launcher
     │        ├── game      # Tower, Enemy, Wave, Map logic
     │        ├── net       # Networking logic (Sockets)
     │        ├── ui        # JavaFX Controllers & UI logic
     │        └── utils     # Helpers, threading, I/O
     └── resources
         ├── fxml          # JavaFX UI Layouts
         ├── assets        # Sprites, sounds, maps
         └── config        # Game data, JSON files, settings
```

## Development Workflow

This project is developed by a team of four students with varying levels of Java experience. To facilitate collaboration and maintain code quality:

* Each feature/module should be developed in its own branch.
* Pull requests will be used for code review and merging.
* Issues will be tracked using GitHub Issues.
* Basic setup and usage instructions will be maintained in `/docs/setup.md`.

## Getting Started

### Prerequisites

* Java 17 SDK
* IntelliJ IDEA or Eclipse (recommended: IntelliJ)
* JavaFX SDK
* FXGL dependency (handled via Maven or Gradle)

### Quick Setup

1. Fork the repository to your own GitHub account.
2. Clone your fork locally:
   `git clone https://github.com/your-username/modular-multiplayer-tower-defense.git`
3. Open the project in IntelliJ or Eclipse.
4. Configure JavaFX and FXGL (see `/docs/setup.md`).
5. Run the main class in `com.modulartd.app.MainApp`.

## Contributing

We welcome contributions from all team members and the wider community. To contribute:

1. Fork the repository to your GitHub account.
2. Create a new branch for your feature or bug fix:
   `git checkout -b feature/your-feature-name`
3. Make your changes and commit them with clear messages.
4. Push your branch to your fork:
   `git push origin feature/your-feature-name`
5. Open a pull request against the main repository’s `main` branch.

All pull requests will be reviewed before merging to maintain code quality and project consistency.

## License

This project is licensed under the MIT License. See the [LICENSE](./LICENSE) file for details.

## Attribution

If you use or extend this project in your own work, please provide clear attribution to the original **Modular Multiplayer Tower Defense** project in your documentation, project credits, or about section. Proper attribution helps recognize the original authors’ effort and supports academic integrity.

## Academic Context

This project is developed as part of a university-level software engineering course. It is intended to demonstrate applied knowledge in object-oriented programming, multithreading, networking, and game development in Java.
