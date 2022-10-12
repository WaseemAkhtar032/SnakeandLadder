public class Dice {
    public int rollDice() {
       int dice =  (int)((Math.random()*10%6));

        return dice+1;
    }
}
