public class SinglePlayer {
    public void singlePlayer() {

        System.out.println("WELCOME TO SNAKE LADDER GAME ..");
        System.out.println("LET'S PLAY!");
        int currentPosition = 0, count = 0;
        Dice dice = new Dice();
        NoPlayLadderSnake noPlayLadderSnake = new NoPlayLadderSnake();
        int diceValue = 0;
        do{
            diceValue =  dice.rollDice();
            count++;
            System.out.println("diceValue = "+diceValue);
            currentPosition = noPlayLadderSnake.noplayLadderSnake(currentPosition, diceValue);
            System.out.println("currentPosition =" +currentPosition);
            if (currentPosition < 0){
                currentPosition = 0;
            }
            if (currentPosition == 100){
                System.out.println("PLAYER WoN ");
                break;
            }
//            try {
//                Thread.sleep(300);
//            } catch (InterruptedException e) {
//                throw new RuntimeException(e);
//            }
        } while(currentPosition<=100);
        System.out.println("THE COUNTER VALUE IS :: "+count);

    }
}
