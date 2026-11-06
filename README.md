# Assignment branch `fc65665`

This branch is yours alone. It contains a small Java 17 / Maven project.

## The bugs

All the bugs are in **`src/main/java/pt/ul/fc/Toolbox702.java`**. It has 10 static methods, each documented
with Javadoc. **Exactly two of them do not do what their Javadoc says**:

1. `double Toolbox702.toFahrenheit(double degrees)`: Javadoc says "Converts a temperature from Celsius to Fahrenheit (F = C * 9 / 5 + 32)." but the code returns `degrees * 9.0 / 5.0` 
2. `int Toolbox702.add(int x, int y)`: Javadoc says "Returns the sum of x and y." but the code returns `x - y` 

The rest are correct.

A few tests for correct methods already exist in `src/test/java/pt/ul/fc/Toolbox702Test.java`
(3 tests, all passing): use them as a model.

## What to do

1. **Expose the bugs.** Write **JUnit 5 tests** (in `src/test/java/pt/ul/fc/`)
   that expose each one. Run them with `mvn test`; they must **fail** on the buggy code.
   Commit the tests (without touching `src/main`).
2. **Fix the bugs** in `src/main/java/pt/ul/fc/Toolbox702.java` so the Javadoc is respected. All tests must now pass.
   Commit the fixes (without touching `src/test`). Do not change correct methods.
3. **Push** your branch: `git push origin fc65665`.
4. Open a PR to the original repo.

Use meaningful commit messages. Do not rename the class or change method signatures.

If you need to undo the last commit, you can do so with `git reset --soft HEAD~1`.
