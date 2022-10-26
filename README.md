# Java-Code-Challenge
### Challenge 1 - Even or odd
> Create a function that verifies if a number is even. 
If the number is even, the function should return true. 
If odd, the function should return false. 
The input will always be an integer. Write unit tests - all should pass.
- [x] Implementation
- [x] Unit tests
### Challenge 2 - Password complexity
> Create a function that verifies password complexity. 
> In order for a password to be valid, it must have at least six characters, one upper case letter, 
> one lowercase letter, and one number. The function will take a string as input and output a Boolean, 
> representing whether the password is complex enough.
- [x] Implementation
- [x] Unit tests
### Challenge 3 - Double or nothing
>A user will start off with 10 points and throughout the game, 
> the user has the option to take a chance to double their points. 
> Or, walk away with their current point value. 
> If the user decides to gamble their points in the chance of doubling, 
> the program should use randomness to decide whether the points get doubled or the user loses it all.
- [x] Implementation
- [ ] Unit tests
### Challenge 4 - Calculate water bill
>Calculate the amount owed, given the water usage.
> It's time to calculate the water bill for your apartment. 
> Your water bill consists of two parts. 
> First, there is a minimum charge of $18.84. This includes 1,496 gallons of water, or two CCFs. One CCF is equal to 748 gallons. 
> If you use more than the included two CCFs, you are charged an extra $3.90 per additional CCF. 
> This means if you use 1800 gallons of water in a given month, you will be charged the minimum $18.84, 
> as well as an additional $3.90 for the extra volume of water used. 
> For simplicity, we're not including tax in these calculations.
- [ ] Implementation
- [ ] Unit tests
### Challenge 5 - Model a person
> Write a Java class that represents a person. 
> The Person class should have a first name, last name, and age attribute with their own getters and setters. 
> It should also have functionality for the person to introduce themselves. 
> Using the Person class, you will create several Person instances that introduce themselves.
- [x] Implementation
- [x] Unit tests
### Challenge 6 - 100 days from now
>  Create a program that tells us what day it is 100 days from today.
- [x] Implementation
- [x] Unit tests
### Challenge 7 - Student volunteers
> Each year every student must volunteer for at least two events. In this challenge, 
> the school needs to find out which students still need to finish their volunteering. 
> In starter code file, we have a list of students as well as a map that contains each 
> event with the students that attended that event. 
> Your job is to implement the find with incomplete events function.
- [x] Implementation
- [x] Unit tests
### Challenge 8 - Letter points
>Let's play a word game. Each letter in a word is worth a certain number of points. 
> To calculate the score for a word, you add up the points of each letter, the bigger the score, the better. 
> For this challenge you will create an algorithm that calculates the score for a given word. 
> In the exercise files, we have a map called letter points that contains mappings from each valid letter 
> to an associated point value. If a given character is not in the map, it gets zero points. 
- [ ] Implementation
- [ ] Unit tests
### Challenge 9 - End-of-the-year sale
> Let's say you work at a retail store. 
> There's a sale and items are marked off at different rates. 
> In this challenge, can you identify the least expensive item in a collection? 
> It's the end-of-year sale and items in the store are marked off at varying rates. 
> Each store item has a name, retail price and discount. 
> As a part of this challenge, you'll model the store item objects using Java. 
> Then you'll create an algorithm that calculates the least expensive store item in a collection of items.
- [ ] Implementation
- [ ] Unit tests
### Challenge 10 - Investing change
>You want to start investing, so you decide for every purchase, you'll invest the change. 
> In this challenge, your job is to figure out the average amount invested per purchase. 
> This month, you decided to invest the leftover change from each purchase into the stock market. 
> For example, when you purchase your $5.20 coffee, you put 73 cents into your investment account. 
> Given a list of each purchase made, your challenge is to create a function that returns the average amount 
> you invested in the stock market. To start you off, we have a main class that has a list of purchases. 
> We could create a class to represent a given purchase and make a more elaborate object but to keep things simple, 
> we'll use a double to represent the cost of each purchase. Your job is to implement calculate average change invested.
- [ ] Implementation
- [ ] Unit tests
### Challenge 11 - Elevator algorithm
>An elevator can move up and down visiting floors to pick people up and drop people off along the way. 
> Think you can simulate an elevator? 
> Most of the time in software development, you won't be creating the program from scratch. 
> So in this challenge, you'll be tasked to implement a few functions to simulate an elevator. 
> Let's take a look Here we have our elevator class that keeps track of the current floor and the elevator direction. 
> Remember, when an elevator starts going up, it continues to go up until there are no drop-off or pickup requests 
> in that direction. Our program also keeps track of the people waiting with the request paths map. 
> These are the requested paths that people are waiting to take. 
> The key is the starting floor and the value is all the destination floors requested from that starting floor. 
> Once the people at a given floor have boarded the elevator, the current destinations array keeps track of the 
> floors the elevator will visit by setting the value at the appropriate index to true. 
> Your job is to implement the process floor, call elevator and move elevator functions. 
> We also have a main function that provides an easy way to manually test your elevator implementation.
- [ ] Implementation
- [ ] Unit tests
### Challenge 12 - Determine the winner
> It's the holidays, your family's in town and you just played a few rounds of a guessing game. 
> Can you write a program that identifies the winner and also prints out the final scores in order? 
> The game had a series of rounds and during each round, 
> a given player and their partner got a series of points. 
> Given the team results from each round, your challenge is to write a program that automatically 
> determines the overall winner and prints out the final score results in descending order. 
> We start you off with a bit of sample code with the team class for representing each team 
> as well as the main class for running your program. 
> We also have a utility function in team utils that generates and sets some sample round scores for each team. 
> Your challenge is to implement the reveal results function so that it prints out the winner as well as the rest 
> of the game results in descending order.
- [ ] Implementation
- [ ] Unit tests
### Challenge 13 - Joke generator
>Many developers extend their program's functionality by calling APIs. 
> So in this challenge, you'll use an API to tell some jokes with Java.
> In order to create more complex applications, many developers extend their 
> programs functionality by calling APIs. An API is an application programming interface 
> and it allows you to access and manipulate data from external programs created by other developers. 
> In this challenge you'll create a joke generator. You should use a joke generator API to come up with the jokes. 
> Your program should call this API and display the joke to the user.
- [ ] Implementation
- [ ] Unit tests
### Challenge 14 - Redact a secret message
>You have to send a secret text file to a fellow employee but they don't have the same security clearance as you. 
> So in this challenge, you'll write a program that redacts a list of words from a given text file. 
> The program should read in the original file and create a new file with the same contents. 
> But the redacted words should be overwritten with the word redacted in all uppercase.
- [ ] Implementation
- [ ] Unit tests
### Challenge 15 - Parse a CSV file
> It's Friday night and there's a concert downtown. 
> Before they let anyone in, security needs to make sure each person reserved a ticket in advance. 
> Let's help them out with this challenge. 
> Security has a CSV file with each ticket holder name along with the number of tickets they bought. 
> Your challenge is to create a program that imports the CSV and checks if a given person bought a ticket, 
> as well as how many tickets they bought. If the person is not on the list or they did not buy enough 
> tickets for their whole party, they should not be let in.
- [ ] Implementation
- [ ] Unit tests