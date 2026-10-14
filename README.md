# GitConflictDemo-Practical4

Practical 4: collaborating on an Android application and resolving an intentional Git merge conflict.

## Run the project

Open this directory in Android Studio. Install Android SDK Platform 37 if prompted, sync Gradle, and run `app` on an Android emulator (API 24 or later).

The project uses Java, XML layouts, Android Gradle Plugin 9.3.2, and Gradle 9.5.0. Use Android Studio's bundled JDK (Java 17 or later).

Windows command-line build:

```powershell
.\gradlew.bat assembleDebug lintDebug
```

## Collaboration

| Role | Branch | Change |
| --- | --- | --- |
| Student 1 | `feature-red-button` | Change both button tints to `#F44336` |
| Student 2 | `feature-green-button` | Change both button tints to `#4CAF50` |

Both students must branch from the original `main` commit and modify the same `android:backgroundTint` lines in `app/src/main/res/layout/activity_main.xml`.

1. Student 2 clones the repository, runs the original application, and creates `feature-green-button` from the initial `main`.
2. Student 1 creates a pull request from `feature-red-button` to `main` and merges it. Keep the source branch.
3. Student 2 pushes the green implementation and creates a pull request to `main`. The red and green edits should conflict.
4. Capture the conflicting PR and the XML conflict as evidence before resolving them.
5. Agree on the final colour, remove all conflict markers, build and run the application, then commit `Resolve button color merge conflict` on the green branch.
6. Push the resolution and merge the green PR. Keep both feature branches.
7. Both students update `main` and verify the final app. Each student submits this same repository URL on Canvas.

GitLab's Merge Requests are represented by Pull Requests in this GitHub workflow.

## Evidence to retain

- Initial, red-feature, green-feature, and conflict-resolution commits, with descriptive messages and the correct student authors.
- Both feature branches and both merged pull requests.
- Screenshots of the initial/red/green/final app and the merge-conflict indication; store them in `docs/evidence/`.
- A short explanation of the agreed final colour and validation performed after resolving the conflict.

Student 2's work, the intentional conflict, and the final resolution are completed collaboratively after Student 2 joins. This repository does not claim those steps have already happened.
