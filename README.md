# Assignment branch `fc65580`

This branch is yours alone. It contains a small Java 17 / Maven project.

## The bugs

All the bugs are in **`src/main/java/pt/ul/fc/Toolbox543.java`**. It has 10 static methods, each documented
with Javadoc. **Exactly two of them do not do what their Javadoc says**:

1. `int Toolbox543.magnitude(int n)`: Javadoc says "Returns the absolute value of n." but the code returns `-Math.abs(n)` 
2. `int Toolbox543.area(int base, int side)`: Javadoc says "Returns the area of a rectangle with the given base and side." but the code returns `2 * (base + side)` 

The rest are correct.

A few tests for correct methods already exist in `src/test/java/pt/ul/fc/Toolbox543Test.java`
(3 tests, all passing): use them as a model.

## What to do

1. **Expose the bugs.** Write **JUnit 5 tests** (in `src/test/java/pt/ul/fc/`)
   that expose each one. Run them with `mvn test`; they must **fail** on the buggy code.
   Commit the tests (without touching `src/main`).
2. **Fix the bugs** in `src/main/java/pt/ul/fc/Toolbox543.java` so the Javadoc is respected. All tests must now pass.
   Commit the fixes (without touching `src/test`). Do not change correct methods.
3. **Push** your branch: `git push origin fc65580`.
4. Open a PR to the original repo.

Use meaningful commit messages. Do not rename the class or change method signatures.

If you need to undo the last commit, you can do so with `git reset --soft HEAD~1`.
