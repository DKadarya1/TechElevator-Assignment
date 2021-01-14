package com.techelevator;

public class Exercises {

	public static void main(String[] args) {

        /*
        1. 4 birds are sitting on a branch. 1 flies away. How many birds are left on
        the branch?
        */

		// ### EXAMPLE:
		int initialNumberOfBirds = 4;
		int birdsThatFlewAway = 1;
		int remainingNumberOfBirds = initialNumberOfBirds - birdsThatFlewAway;
		System.out.println(remainingNumberOfBirds);
        /*
        2. There are 6 birds and 3 nests. How many more birds are there than
        nests?
        */

		// ### EXAMPLE:
		int numberOfBirds = 6;
		int numberOfNests = 3;
		int numberOfExtraBirds = numberOfBirds - numberOfNests;
		System.out.println(numberOfExtraBirds);
        /*
        3. 3 raccoons are playing in the woods. 2 go home to eat dinner. How
        many raccoons are left in the woods?
        */
		int raccoonsPlayingIntheWoods = 3;
		int raccoonsThatWentHomeToEatDinner = 2;
		int racconsLeft = raccoonsPlayingIntheWoods - raccoonsThatWentHomeToEatDinner;
		System.out.println(racconsLeft);
        /*
        4. There are 5 flowers and 3 bees. How many less bees than flowers?
        
        */
		int numberOfFlowers = 5;
		int numberOfBees = 3;
		int beeslessThanFlower = numberOfFlowers - numberOfBees;
		System.out.println(beeslessThanFlower);
        /*
        5. 1 lonely pigeon was eating breadcrumbs. Another pigeon came to eat
        breadcrumbs, too. How many pigeons are eating breadcrumbs now?
        */
		int oneLonelyPigeon = 1;
		int anotherPigeon = 1;
		int pigeons = oneLonelyPigeon + anotherPigeon;
		System.out.println(pigeons);
        /*
        6. 3 owls were sitting on the fence. 2 more owls joined them. How many
        owls are on the fence now?
        */
		int owlsSittingOnTheFence = 3;
		int owlsJoinedThem = 2;
		int owlsOnTheFenceNow = owlsSittingOnTheFence + owlsJoinedThem;
		System.out.println(owlsOnTheFenceNow);
        /*
        7. 2 beavers were working on their home. 1 went for a swim. How many
        beavers are still working on their home?
        */
		int beaversWereWorking = 2;
		int beaversWentForSwim = 1;
		int beaverStillWorking = beaversWereWorking - beaversWentForSwim;
		System.out.println(beaverStillWorking);
        /*
        8. 2 toucans are sitting on a tree limb. 1 more toucan joins them. How
        many toucans in all?
        */
		int NumberOfToucansSittingOnTree = 2;
		int numberOfToucansJoin = 1;
		int totalToucans = NumberOfToucansSittingOnTree + numberOfToucansJoin;
		System.out.println(totalToucans);
        /*
        9. There are 4 squirrels in a tree with 2 nuts. How many more squirrels
        are there than nuts?
        */
		int numberOfSquirrels = 4;
		int numberOfNuts = 2;
		int totalSquirrels = numberOfSquirrels - numberOfNuts;
		System.out.println (totalSquirrels);

        /*
        10. Mrs. Hilt found a quarter, 1 dime, and 2 nickels. How much money did
        she find?
        */
		double quarter = .25;
		double dime = .10;
		double nickel = 0.05;
		nickel = nickel * 2;
	
		double totalMoneyFound = quarter + dime + nickel;	
		System.out.println(totalMoneyFound);
        /*
        11. Mrs. Hilt's favorite first grade classes are baking muffins. Mrs. Brier's
        class bakes 18 muffins, Mrs. MacAdams's class bakes 20 muffins, and
        Mrs. Flannery's class bakes 17 muffins. How many muffins does first
        grade bake in all?
        */
		int brier = 25;
		int macAdams = 20;
		int flannery = 17;
		int all = brier + macAdams + flannery;
		System.out.println(all);
        /*
        12. Mrs. Hilt bought a yoyo for 24 cents and a whistle for 14 cents. How
        much did she spend in all for the two toys?
        */
		double yoyo = 0.24;
		double whistle = 0.14;
		double total = yoyo + whistle;
		System.out.println(total);
        /*
        13. Mrs. Hilt made 5 Rice Krispie Treats. She used 8 large marshmallows
        and 10 mini marshmallows.How many marshmallows did she use
        altogether?
        */
		int largeMarshmallows = 8;
		int miniMarshmallows = 10;
		int totalMarshmallows = largeMarshmallows + miniMarshmallows;
		System.out.println(totalMarshmallows);
        /*
        14. At Mrs. Hilt's house, there was 29 inches of snow, and Brecknock
        Elementary School received 17 inches of snow. How much more snow
        did Mrs. Hilt's house have?
        */
		int hiltHouseSnow = 29;
		int elementarySchoolSnow = 17;
		int moreSnowHiltHouse = hiltHouseSnow - elementarySchoolSnow;
		System.out.println(moreSnowHiltHouse);
        /*
        15. Mrs. Hilt has $10. She spends $3 on a toy truck and $2 on a pencil
        case. How much money does she have left?
        */
		int totals = 10;
		int toyTruck = 3;
		int pencilCase = 2;
		int moneyLeft = totals - toyTruck - pencilCase;
		System.out.println(moneyLeft);
		

        /*
        16. Josh had 16 marbles in his collection. He lost 7 marbles. How many
        marbles does he have now?
        */
		int joshMarbles = 16;
		int marblesLost = 7;
		int totalMarbles = joshMarbles - marblesLost;
		System.out.println(totalMarbles);
        /*
        17. Megan has 19 seashells. How many more seashells does she need to
        find to have 25 seashells in her collection?
        */
		int meganSeaShells = 19;
        int wants = 25;
        int totalNeed =  wants - meganSeaShells;
        System.out.println(totalNeed);
        /*
        18. Brad has 17 balloons. 8 balloons are red and the rest are green. How
        many green balloons does Brad have?
        */
        int bradBalloons = 17;
        int redBalloons = 8;
        int totalBalloons = bradBalloons - redBalloons;
        System.out.println(totalBalloons);
        /*
        19. There are 38 books on the shelf. Marta put 10 more books on the shelf.
        How many books are on the shelf now?
        */
        int booksOnShelf = 38;
        int moreBooksOnShelf = 10;
        int booksShelf = booksOnShelf + moreBooksOnShelf;
        System.out.println(booksShelf);
        /*
        20. A bee has 6 legs. How many legs do 8 bees have?
        */
        int beeLegs = 6;
        int bees = 8;
        int totalLegs = beeLegs *bees;
        System.out.println(totalLegs);
        /*
        21. Mrs. Hilt bought an ice cream cone for 99 cents. How much would 2 ice
        cream cones cost?
        */
        double iceCream = 0.99;
        double twoIceCream = 2;
        double totalCost = twoIceCream * iceCream;
        System.out.println(totalCost);
        
        /*
        22. Mrs. Hilt wants to make a border around her garden. She needs 125
        rocks to complete the border. She has 64 rocks. How many more rocks
        does she need to complete the border?
        */
        int rocksNeeded = 125;
        int rocksNow = 64;
        int totalRock = rocksNeeded - rocksNow;
        System.out.println(totalRock);
        /*
        23. Mrs. Hilt had 38 marbles. She lost 15 of them. How many marbles does
        she have left?
        */
        int marbles = 38 - 15;
        System.out.println(marbles);
        /*
        24. Mrs. Hilt and her sister drove to a concert 78 miles away. They drove 32
        miles and then stopped for gas. How many miles did they have left to drive?
        */
        int mileLeft = 78 - 32;
        System.out.println(mileLeft);
        /*
        25. Mrs. Hilt spent 1 hour and 30 minutes shoveling snow on Saturday
        morning and 45 minutes shoveling snow on Saturday afternoon. How
        much total time did she spend shoveling snow?
        */
        int hour = 60;
        int saturdayMorning = hour + 30;
        int saturdayAfternoon = 45;
        int totalTime = saturdayMorning + saturdayAfternoon;
        System.out.println(totalTime);
        

        /*
        26. Mrs. Hilt bought 6 hot dogs. Each hot dog cost 50 cents. How much
        money did she pay for all of the hot dogs?
        */
        double hotDog = 0.50 * 6;
        System.out.println(hotDog);
        
        /*
        27. Mrs. Hilt has 50 cents. A pencil costs 7 cents. How many pencils can
        she buy with the money she has?
        */
		double hiltMoney = 0.50;
		double pencilCost = 0.07;
		int numberOfPencilsSheCanAfford = (int)(hiltMoney / pencilCost);
		System.out.println(numberOfPencilsSheCanAfford);
		

        /*
        28. Mrs. Hilt saw 33 butterflies. Some of the butterflies were red and others
        were orange. If 20 of the butterflies were orange, how many of them
        were red?
        */
		int butterFlies = 33-20;
		System.out.println(butterFlies);
        /*
        29. Kate gave the clerk $1.00. Her candy cost 54 cents. How much change
        should Kate get back?
        */
		double change = 1.00 - 0.54;
		System.out.println(change);

        /*
        30. Mark has 13 trees in his backyard. If he plants 12 more, how many trees
        will he have?
        */
		int trees = 13 + 12;
		System.out.println(trees);
        /*
        31. Joy will see her grandma in two days. How many hours until she sees
        her?
        */
		int hours = 24;
		int hoursToSeeGranny = hours * 2;
		System.out.println(hoursToSeeGranny);
		

        /*
        32. Kim has 4 cousins. She wants to give each one 5 pieces of gum. How
        much gum will she need?
        */
		int cousins = 4;
		int giveGum = 5;
		int totalGum = cousins * giveGum;
		System.out.println(totalGum);

        /*
        33. Dan has $3.00. He bought a candy bar for $1.00. How much money is
        left?
        */
		int money = 3 - 1;
		System.out.println(money);
        /*
        34. 5 boats are in the lake. Each boat has 3 people. How many people are
        on boats in the lake?
        */
		int boats = 5 * 3;
		System.out.println(boats);

        /*
        35. Ellen had 380 legos, but she lost 57 of them. How many legos does she
        have now?
        */
		int legos = 380 - 57;
        System.out.println(legos);
        /*
        36. Arthur baked 35 muffins. How many more muffins does Arthur have to
        bake to have 83 muffins?
        */
        int muffin = 83 -35;
        System.out.println(muffin);
        /*
        37. Willy has 1400 crayons. Lucy has 290 crayons. How many more
        crayons does Willy have then Lucy?
        */
        int crayons = 1400 - 290;
        System.out.println(crayons);
        /*
        38. There are 10 stickers on a page. If you have 22 pages of stickers, how
        many stickers do you have?
        */
        int sticker = 22 * 10;
        System.out.println(sticker);

        /*
        39. There are 96 cupcakes for 8 children to share. How much will each
        person get if they share the cupcakes equally?
        */
        int cupCakes = 96;
        int children = 8;
        int totalCakes = cupCakes / children;
        System.out.println(totalCakes);

        /*
        40. She made 47 gingerbread cookies which she will distribute equally in
        tiny glass jars. If each jar is to contain six cookies each, how many
        cookies will not be placed in a jar?
        */
        int cookie = 47 % 6;
        System.out.println(cookie);
        /*
        41. She also prepared 59 croissants which she plans to give to her 8
        neighbors. If each neighbor received and equal number of croissants,
        how many will be left with Marian?
        */
        int croissants = 59 % 8;
        System.out.println(croissants);
        /*
        42. Marian also baked oatmeal cookies for her classmates. If she can
        place 12 cookies on a tray at a time, how many trays will she need to
        prepare 276 oatmeal cookies at a time?
        */
        int traysNeeded = 276 / 12;
        System.out.println(traysNeeded);
        /*
        43. Marian’s friends were coming over that afternoon so she made 480
        bite-sized pretzels. If one serving is equal to 12 pretzels, how many
        servings of bite-sized pretzels was Marian able to prepare?
        */
        int pretzel = 480 / 12;
        System.out.println(pretzel);
        /*
        44. Lastly, she baked 53 lemon cupcakes for the children living in the city
        orphanage. If two lemon cupcakes were left at home, how many
        boxes with 3 lemon cupcakes each were given away?
        */
        int baked = 53;
        int leftAtHome = 2;
        int givenAway = 3;
        
        int totalGivenAway = baked - leftAtHome /givenAway;
        System.out.println(totalGivenAway);
        /*
        45. Susie's mom prepared 74 carrot sticks for breakfast. If the carrots
        were served equally to 12 people, how many carrot sticks were left
        uneaten?
        */
        
        int uneatenCarrot = 74 % 12;
        System.out.println(uneatenCarrot);
        /*
        46. Susie and her sister gathered all 98 of their teddy bears and placed
        them on the shelves in their bedroom. If every shelf can carry a
        maximum of 7 teddy bears, how many shelves will be filled?
        */
        int bears = 98 / 7;
        System.out.println(bears);

        /*
        47. Susie’s mother collected all family pictures and wanted to place all of
        them in an album. If an album can contain 20 pictures, how many
        albums will she need if there are 480 pictures?
        */
        int albumsNeeded = 480 / 20;
        System.out.println(albumsNeeded);
        /*
        48. Joe, Susie’s brother, collected all 94 trading cards scattered in his
        room and placed them in boxes. If a full box can hold a maximum of 8
        cards, how many boxes were filled and how many cards are there in
        the unfilled box?
        */
        int Cards = 94;
		int fullBox = 8;
		int boxesFilled = Cards / fullBox;
		int unfilledBox = Cards % fullBox;
		 System.out.println("Filled " + boxesFilled + " Unfilled box " + unfilledBox );


        /*
        49. Susie’s father repaired the bookshelves in the reading room. If he has
        210 books to be distributed equally on the 10 shelves he repaired,
        how many books will each shelf contain?
        */
		 int books = 210 / 10;
		 System.out.println(books);
        /*
        50. Cristina baked 17 croissants. If she planned to serve this equally to
        her seven guests, how many will each have?
        */
		  int crossant = 17 / 7;
	         System.out.println(crossant);


        /*
            CHALLENGE PROBLEMS
        */

        /*
        Bill and Jill are house painters. Bill can paint a 12 x 14 room in 2.15 hours, while Jill averages
        1.90 hours. How long will it take the two painter working together to paint 5 12 x 14 rooms?
        Hint: Calculate the hourly rate for each painter, combine them, and then divide the total walls in feet by the combined hourly rate of the painters.
        Challenge: How many days will it take the pair to paint 623 rooms assuming they work 8 hours a day?.
        */

        /*
        Create and assign variables to hold your first name, last name, and middle initial. Using concatenation,
        build an additional variable to hold your full name in the order of last name, first name, middle initial. The
        last and first names should be separated by a comma followed by a space, and the middle initial must end
        with a period.
        Example: "Hopper, Grace B."
        */

        /*
        The distance between New York and Chicago is 800 miles, and the train has already travelled 537 miles.
        What percentage of the trip has been completed?
        Hint: The percent completed is the miles already travelled divided by the total miles.
        Challenge: Display as an integer value between 0 and 100 using casts.
        */


	}

}
