# Student 1 validation

Validated on 2026-10-14 using Android Studio's bundled JDK and the Pixel 6 emulator (Android API 37.1).

| Check | Initial version (`initial-app`) | Red feature |
| --- | --- | --- |
| `gradlew.bat --offline assembleDebug lintDebug` | Passed | Passed |
| Android lint report | No issues found | No issues found |
| Install and launch on emulator | Passed | Passed |
| Button One shows `Button One pressed` after tapping | Passed | Passed |
| Button Two shows `Button Two pressed` after tapping | Passed | Passed |
| Both buttons show the expected tint | Blue-grey `#607D8B` | Red `#F44336` |

Runtime screenshots are stored in `docs/evidence/`:

- `initial-buttons.png`
- `initial-button-feedback.png`
- `red-buttons.png`
- `red-button-feedback.png`

The red feature changes only the two button tint values in `app/src/main/res/layout/activity_main.xml`; additional files record validation and screenshots.

The red PR remains open until Student 2 is ready. Student 2 must create `feature-green-button` from `initial-app`, using their own Git identity. Green-feature validation, merge-conflict evidence, the agreed resolution, and final-branch validation remain to be completed together.
