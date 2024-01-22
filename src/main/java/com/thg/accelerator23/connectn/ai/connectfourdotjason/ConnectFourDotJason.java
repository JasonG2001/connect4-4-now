package com.thg.accelerator23.connectn.ai.connectfourdotjason;

import com.thehutgroup.accelerator.connectn.player.Board;
import com.thehutgroup.accelerator.connectn.player.Counter;
import com.thehutgroup.accelerator.connectn.player.Player;


public class ConnectFourDotJason extends Player {
  public ConnectFourDotJason(Counter counter) {
    //TODO: fill in your name here
    super(counter, ConnectFourDotJason.class.getName());
  }

  @Override
  public int makeMove(Board board) {
    final int FIRST_COL = 1, LAST_COL = board.getConfig().getWidth();
    int random_col = (int) Math.floor(Math.random() * (LAST_COL - FIRST_COL + 1) + FIRST_COL);
    return random_col;
  }
}