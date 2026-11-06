# Assignment branch `fc65596`

This branch is yours alone. It contains a small Java 17 / Maven project.

## The bugs

All the bugs are in **`src/main/java/pt/ul/fc/MathKit404.java`**. It has 10 static methods, each documented
with Javadoc. **Exactly two of them do not do what their Javadoc says**:

1. `boolean MathKit404.divisibleByTwo(int number)`: Javadoc says "Returns true if number is even, false otherwise." but the code returns `number % 2 != 0` 
2. `int MathKit404.magnitude(int number)`: Javadoc says "Returns the absolute value of number." but the code returns `-Math.abs(number)` 

The rest are correct.

A few tests for correct methods already exist in `src/test/java/pt/ul/fc/MathKit404Test.java`
(3 tests, all passing): use them as a model.

## What to do

1. **Expose the bugs.** Write **JUnit 5 tests** (in `src/test/java/pt/ul/fc/`)
   that expose each one. Run them with `mvn test`; they must **fail** on the buggy code.
   Commit the tests (without touching `src/main`).
2. **Fix the bugs** in `src/main/java/pt/ul/fc/MathKit404.java` so the Javadoc is respected. All tests must now pass.
   Commit the fixes (without touching `src/test`). Do not change correct methods.
3. **Push** your branch: `git push origin fc65596`.
4. Open a PR to the original repo.

Use meaningful commit messages. Do not rename the class or change method signatures.

If you need to undo the last commit, you can do so with `git reset --soft HEAD~1`.
