# Assignment branch `fc65651`

This branch is yours alone. It contains a small Java 17 / Maven project.

## The bugs

All the bugs are in **`src/main/java/pt/ul/fc/Basics135.java`**. It has 10 static methods, each documented
with Javadoc. **Exactly two of them do not do what their Javadoc says**:

1. `double Basics135.celsiusToF(double degrees)`: Javadoc says "Converts a temperature from Celsius to Fahrenheit (F = C * 9 / 5 + 32)." but the code returns `degrees * 9.0 / 5.0` 
2. `int Basics135.rectArea(int w, int h)`: Javadoc says "Returns the area of a rectangle with the given w and h." but the code returns `2 * (w + h)` 

The rest are correct.

A few tests for correct methods already exist in `src/test/java/pt/ul/fc/Basics135Test.java`
(3 tests, all passing): use them as a model.

## What to do

1. **Expose the bugs.** Write **JUnit 5 tests** (in `src/test/java/pt/ul/fc/`)
   that expose each one. Run them with `mvn test`; they must **fail** on the buggy code.
   Commit the tests (without touching `src/main`).
2. **Fix the bugs** in `src/main/java/pt/ul/fc/Basics135.java` so the Javadoc is respected. All tests must now pass.
   Commit the fixes (without touching `src/test`). Do not change correct methods.
3. **Push** your branch: `git push origin fc65651`.
4. Open a PR to the original repo.

Use meaningful commit messages. Do not rename the class or change method signatures.

If you need to undo the last commit, you can do so with `git reset --soft HEAD~1`.
