# TCSS305-Group-Project

TCSS 305 Tetris

Autumn 2023

## Sprint 1 Contribution
- Tyler
  - Created the TetrisGUI and Menu classes.
  - Initially created a rough draft layout for the GUI.
  - Created the main frame and all buttons pertaining to the frame and menu.
- James
  - Utilized paintComponent and 2DGraphics to draw a single square sized according to the tetris board,
  - this single square was then used to draw all 7 tetrinomes within the GamePanel and the NextPiecePanel.
- Josh
  - Seperated the GUI components into seperate classes.
  - Utilized layout managers to create the current version of the GUI.
- Cam

## Sprint 2 Contribution
 - Meeting Minutes: https://docs.google.com/document/d/1IfSivwr1jRjmUcQRhgPw4htbOL42FdTojRXSS8SrZr4/edit

- Tyler
  - Implemented the Observer Design Pattern throughout the Project
  - Worked on the NextPiecePanel with James
  - Implemented the Timer and refactored it with Josh
- James
  - Refactored the graphical implemention of the tetriminos
  - Worked on the NextPiecePanel with Tyler
- Josh
  - Implemented the KeyListeners used for the controls
  - Worked on the Timer implementation with Tyler
- Cam
  - Implemented the notifyBoardChanges method in Board and called it in down() and checkRows()
 
## Sprint 3 Contribution
- Tyler
  - implemented Frozen Blocks
  - Movable tetris pieces
  - Checkstyle
- James
  - Implemented Paint Tetriminos package
  - Implemented Music and Sound Effects
  - Checkstyle
- Josh
  - Implemented Scoring algorithm, Level change
  - Worked on Frozen Blocks
  - Checkstyle

## Sprint 3 Meetings
 - Meeting Minutes: https://docs.google.com/document/d/1_QcnD_l412rijxIYXIzFufNI4wChT8nzERGTuX_RlQY/edit?usp=sharing
 - After our meetings, some members would run into problems or have challenges. When this occurred, we described our issue and included where the code was located in the project. Other members would then contribute in helping out if they were available. For example, Josh was having some struggles with adding the scorePanel as a listener for the board, with the help of the group, the problem that the listener was added twice was discovered.

## Sprint 3 Comments
 - Comments:
   - Edited the public board API with the addition of the setGameOver() method.
   - JAR file doesn't contain music as it wouldn't run with it implemented.
 - Extra Feature: Usage of Gradients in our panels.
 - Extra Credit:
   - Music implemented at the start of a new game
   - Sound effects implemented on row clear
   - Jar File (this is located in .idea/artifacts - no music)
   - The ability for the user to select between easy, medium, and hard difficulty before starting a new game

## Executive Summary
 - https://docs.google.com/document/d/19B5Ntb2H0IOf_1yJ93-WRcpIdumobKiRWU8DvGEeU9w/edit


Included:

- Checkstyle rule structure
- IntelliJ Clean-code rules
- Package structure
- Driver class with LOGGER object and examples
- Unit test folder
- .gitignore and README.md
