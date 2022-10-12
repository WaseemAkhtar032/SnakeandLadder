public class TwoPlayer {
    static int PLAYER1 = 1;
    static int PLAYER2 = 2;

    static int choice = 0;
    public void twoPlayer() {

        System.out.println("WELCOME TO SNAKE LADDER GAME ..");
        System.out.println("LET'S PLAY!");
        int currentPosition1 = 0,currentPosition2 = 0,count1 = 0/*,count2 = 0*/;
        int currentPLayer = PLAYER1;
        Dice dice = new Dice();
        NoPlayLadderSnake noPlayLadderSnake = new NoPlayLadderSnake();
        int diceValue = 0;

        do{
            diceValue =  dice.rollDice();
            System.out.println("Player"+currentPLayer+ "rolled DICE = "+ diceValue);
            count1++;

            if(currentPLayer == PLAYER1){
                currentPosition1 = noPlayLadderSnake.noplayLadderSnake(currentPosition1, diceValue);
                System.out.println("CHOICE - "+choice);
                if(choice == 2){
                    currentPLayer = PLAYER1;
                }
                else {
                    currentPLayer = PLAYER2;
                }
                System.out.println(/*"Player1 rolled the dice, "+diceValue+*/ "updated position1 =" +currentPosition1);
                count1++;
                if (currentPosition1 < 0){
                    currentPosition1 = 0;
                }
                if (currentPosition1 == 100){
                    System.out.println("PLAYER1 WON ");
                    break;
                }
            }else if(currentPLayer == PLAYER2){
                currentPosition2 = noPlayLadderSnake.noplayLadderSnake(currentPosition2, diceValue);
                System.out.println("CHOICE - "+choice);
                if(choice == 2){
                    currentPLayer = PLAYER2;
                }
                else {
                    currentPLayer = PLAYER1;
                }
                System.out.println(/*"Player2 rolled the dice, "+diceValue+ */"updated position2 =" +currentPosition2);
                count1++;
                if (currentPosition2 < 0){
                    currentPosition2 = 0;
                }
                if (currentPosition2 == 100){
                    System.out.println("PLAYER2 WON ");
                    break;
                }
            }

//            try {
//                Thread.sleep(300);
//            } catch (InterruptedException e) {
//                throw new RuntimeException(e);
//            }
        } while(currentPosition1<=100 || currentPosition2 <= 100);
        System.out.println("THE COUNTER VALUE IS :: "+count1);

    }

}
