package OOD.Snake_and_Ladder.Entities;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeSet;

public class Board {
    
    Integer numberOfPlayers;
    Map<Integer,Player> playerIdMap;
    Integer currentPlayer;
    TreeSet<Snake> snakeList;
    TreeSet<Ladder> ladderList;
    Integer diceRollValue;
    Integer numberOfDiceRolls;
    Integer boardSize;
    Boolean continueGameTillLastPlayer;

    public Board() {
        playerIdMap = new HashMap<>();
        snakeList = new TreeSet<Snake>();
        ladderList = new TreeSet<Ladder>();
        currentPlayer = -1;
        diceRollValue = 0;
        numberOfDiceRolls = 1;
        boardSize = 100;
    }

    public Integer getcurrentPlayer(){
        return currentPlayer;
    }

    public void setnumberOfPlayers(Integer numberOfPlayers){
        this.numberOfPlayers=numberOfPlayers;
    }

    public void addPlayer(Integer id,String name){
        Player player=new Player(id,name);
        playerIdMap.put(id,player); 
    }

    public void setCurrentPlayer(Integer currentPlayer) {
        this.currentPlayer = currentPlayer;
    }

    public Player getNextPlayer(){
        Integer player = (this.currentPlayer + 1) % numberOfPlayers;
        while (playerIdMap.get(player).getGanmeOver()) {
            player = (player + 1) % numberOfPlayers;
        }
        setCurrentPlayer(player);
        return this.playerIdMap.getOrDefault(this.currentPlayer, null);
    }

    public void addSnake(Snake snake) {
        snakeList.add(snake);
    }

    public void addLadder(Ladder ladder) {
        ladderList.add(ladder);
    }

    public TreeSet<Snake> getSnakeList() {
        return snakeList;
    }

    public TreeSet<Ladder> getLadderList() {
        return ladderList;
    }

    public Player getPlayerById(Integer playerId) {
        return playerIdMap.getOrDefault(playerId, null);
    }

    public Integer getDiceRollValue() {
        return diceRollValue;
    }

    public void setDiceRollValue(Integer diceRollValue) {
        this.diceRollValue = diceRollValue;
    }

    public Integer getNumberOfDiceRolls() {
        return numberOfDiceRolls;
    }

    public void setNumberOfDiceRolls(Integer numberOfDiceRolls) {
        this.numberOfDiceRolls = numberOfDiceRolls;
    }

    public Integer getBoardSize() {
        return boardSize;
    }

    public void setBoardSize(Integer boardSize) {
        this.boardSize = boardSize;
    }

    public Map<Integer, Player> getPlayerIdMap() {
        return playerIdMap;
    }

    public Boolean getContinueGameTillLastPlayer() {
        return continueGameTillLastPlayer;
    }

    public void setContinueGameTillLastPlayer(Boolean continueGameTillLastPlayer) {
        this.continueGameTillLastPlayer = continueGameTillLastPlayer;
    }

    
}
