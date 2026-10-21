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

## Resolved green implementation (2026-10-21)

The red PR was merged before opening the green PR. GitHub reported the green PR as conflicting, and a local merge produced conflicts in both button tint attributes. The resolution keeps green buttons, the font preview fix, and the original tested build configuration.

- `gradlew.bat --offline assembleDebug lintDebug`: passed.
- Android lint: no issues found.
- Install and launch the resolved APK on Pixel 6 emulator: passed.
- Button One and Button Two click feedback: passed.
- Final green appearance: verified in `final-green-buttons.png`.
- Real runtime test output: `evidence/final-green-runtime-test.txt`.
- Final runtime screenshots: `evidence/final-green-buttons.png` and `evidence/final-green-button-feedback.png`.

See `RESOLUTION.zh-CN.md` for the actual branch name and captured conflict evidence.
