/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MangMayTinh.Chess.Model;

import java.awt.Point;
import java.awt.image.BufferedImage;

/**
 *
 * @author thinhle
 */
public class Knight extends Piece {
    static String className = "knight";

    public Knight(Point nowPosition, BufferedImage image, boolean isBelongToFirstPlayer) {
        super(nowPosition, image, isBelongToFirstPlayer);
    }
    
    @Override
    public boolean isMoveAccepted(Move move) {
        return true;
    }
}