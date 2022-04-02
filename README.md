# Final_Project
## Pong game in java
![image](https://user-images.githubusercontent.com/79136459/156768669-bb6fe9f7-8521-4c87-a6bd-66ff105ba40b.png)

The package will consist of six classes:
1)PongGame    2) GameFrame    3) GamePanel    4) Paddle   5) Ball   6) Score


This project is highly Object-oriented programming (OOP) material and includes graphics, getters & setters, jpanel & jframe, inheritance & composition.

About the game
The ball moves in the rectangle of play and a goal is scored if the ball reaches one of the right or left sides, and it is calculated using a counting system.

I'm a fan of table tennis or Ping Pong. This game was one of the first games that were programmed, as it was released by Atari in 1972, which was one of the most famous games at the time, and it took its name Pong from Ping Pong.


-	The problem
Because of the recent epidemic conditions, it was difficult to go out to play Ping Pong in the playgrounds, so programming a model of it today is fun.

___________________________________

## Classes Description
1)	GamePanel class:
This class creates a rectangular playing board according to the lengths set, and creates a playing rackets and a ball.
it  also shows the rackets and the ball and moves them.

- Methods name 

newBall() : Will create a new ball on the screen.

newPaddles() : Create two paddles to the game.

print(Graphics g) : To print every thing on the screen with one parameter G

draw(Graphics g) : To draw the item like paddle or ball, with one parameter G

checkCollision() : Checks that the paddles do not cross the entire screen, checks that the ball hits the edges of the panel or is blocked by the paddle.

run() : Create a game loop with 60 frames.


- There's inner class

Class AL extends KeyAdapter (inner class)

//ALr short for action listener

Method name:

keyPressed(KeyEvent e) : Handle the key pressed event, with one parameter e.

keyReleased(KeyEvent e) : Handle the key released event, with one parameter e.

___________________________________

2) Paddle class:
- Constructors
Paddel(int x, int y, int PaddleWidth, PaddleHeight, int id) : Create paddle with id number according to the lengths set, there is 5 parameters.

- Methods

| Return Type  | Method name  |  Operation |
| :---         |     :---:      |          ---: |
| void | keyPressed(KeyEvent e) |  The paddle 1 moves up if the letter w is pressed on the keyboard and down s in the y direction   Paddle 2 moves up if the up arrow is pressed on the keyboard, and the down arrow is down |
| void | keyReleased(KeyEvent e) | We set the value to zero so that it does not move |
| void | setY (int yDirection) | set y direction that y Velocity equals it |
| void | move() | The paddle moves as the y-value increases in its direction |
| void | draw(Graphics g) | Draws the paddle according to the id number and gives it a color |

___________________________________

3)	Ball class:
- Constructors
Ball(int x, int y, int width, int height) : It builds the shape of the ball according to its size and launches it each time in a random direction.

- Methods

| Return Type  | Method name  |  Operation |
| :---         |     :---:      |          ---: |
| void | setX( int randomXDirection) |  It gives a random direction on the x-coordinates |
| void | setY( int randomYDirection) | It gives a random direction on the y-coordinates |
| void | move() | Move the ball, the speed of the ball increases as it is moved with the racket |
| void | draw(Graphics g) | Draw the ball and give it a color |

___________________________________

4)	Score class:
- Constructors
Score(int GameWidth, int GameHeight) : Showing the score and drawing on the playing board such as pitch lines, etc.

- Methods

| Return Type  | Method name  |  Operation |
| :---         |     :---:      |          ---: |
| void | draw(Graphics g) |   Draw the result and some other things |


___________________________________

5)	GameFrame class:
- Constructors
GameFrame() : Create object from GamePanel()It controls the pop-up interface like its color and title.


___________________________________

![image](https://user-images.githubusercontent.com/79136459/161394087-cfa5100f-84a0-4949-b8dc-5d7a077c3a09.png)


When the project is fully completed, I will add some secondary things, such as the sound that comes out when a goal is scored, as the original sound was in the game in its original version in 1972.



Advanced Programming Lab

Final Project
Dima Alhajajlah

dima.alhajajlah@students.alquds.edu
