public class NoPlayLadderSnake {
    public int noplayLadderSnake(int currentPosition, int diceValue){
        int choice = (int)((Math.random()*10%4));
        int ladderArr[]= {9,50,25};
        int snakeArr[]= {54,67,95};
        TwoPlayer.choice = choice;
        switch (choice){
            case 1 :
                System.out.println("CHOICE IS TO NO PLAY ");
                System.out.println("the current positiion is :: "+currentPosition);

                break;
            case 2:

                //System.out.println("CHOICE IS LADDER ");
                currentPosition = currentPosition + diceValue ;
                if(currentPosition == ladderArr[0]){
                    System.out.println("CHOICE IS LADDER ");
                    currentPosition = 55 ;
                }

                else if(currentPosition == ladderArr[1]){
                    System.out.println("CHOICE IS LADDER ");
                    currentPosition = 85;
                }
                else if(currentPosition == ladderArr[2]){
                    System.out.println("CHOICE IS LADDER ");
                    currentPosition = 63 ;
                }
                System.out.println("the current positiion is :: "+currentPosition);
                if (currentPosition  > 100){
                    currentPosition = currentPosition - diceValue;
                }

                break;
            case 3:
                currentPosition = currentPosition + diceValue ;
                if (currentPosition == snakeArr[0]){
                    System.out.println("CHOICE IS SNAKE ");
                    currentPosition = 26;
                }
                if (currentPosition == snakeArr[1]){
                    System.out.println("CHOICE IS SNAKE ");
                    currentPosition = 34;
                }
                if (currentPosition == snakeArr[2]){
                    System.out.println("CHOICE IS SNAKE ");
                    currentPosition = 45;
                }
                System.out.println("the current positiion is :: "+currentPosition);
                break;

        }
        return currentPosition;
    }
}