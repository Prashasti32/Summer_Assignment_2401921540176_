# AI Agent Instructions

## Project type
- Simple Java application
- Main source directory: `src`
- Optional dependency directory: `lib`
- Default compiled output directory: `bin`

## What matters
- Preserve the existing project layout: source code stays in `src`, libraries in `lib`.
- The entrypoint is `src/App.java` with a standard `public static void main(String[] args)`.
- No explicit build or test configuration is present in the repository.

## How to help
- Use `javac` or VS Code Java support to compile and run code in `src`.
- Keep changes minimal and focused unless the user asks to restructure the project.
- If file system changes are needed, prefer adding source under `src` rather than creating new top-level Java source folders.

## Additional notes
- User-facing documentation is in `README.md`.
- Workspace settings may be customized in `.vscode/settings.json` if the user requests folder structure changes.
