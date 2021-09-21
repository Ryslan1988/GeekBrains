package HW8;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.geom.Ellipse2D;

public class BattleMap extends JPanel {
    private GameWindow gameWindow;
    private int fieldSize;
    private int winLength;

    private boolean isInit;

    private int cellWidth;
    private int cellHeight;

    public BattleMap(GameWindow gameWindow) {
        this.gameWindow = gameWindow;
        setBackground(Color.GRAY);

        addMouseListener(new MouseAdapter() {
            @Override
            public void mouseReleased(MouseEvent e) {
                int cellX = e.getX() / cellWidth;
                int cellY = e.getY() / cellHeight;

                if (isInit && !GameCode.isGameFinished) {
                    GameCode.humanTurn(cellY, cellX);

                }
                repaint();
            }
        });
    }

    void startNewGame(int fieldSize, int winLength) {
        this.fieldSize = fieldSize;
        this.winLength = winLength;

        isInit = true;
        repaint();
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        if (!isInit) {
            return;
        }

        int panelWidth = getWidth();
        int panelHeight = getHeight();

        cellWidth = panelWidth / fieldSize;
        cellHeight = panelHeight / fieldSize;

        g.setColor(Color.WHITE);
        ((Graphics2D) g).setStroke(new BasicStroke(2f));

        for (int i = 1; i < fieldSize; i++) {
            int y = i * cellHeight;
            g.drawLine(0, y, panelWidth, y);
        }

        for (int i = 1; i < fieldSize; i++) {
            int x = i * cellWidth;
            g.drawLine(x, 0, x, panelHeight);
        }
//Условия прорисовки х и 0 надо сделать циклом
        int i;
        int j;
        for (i = 0; i < GameCode.SIZE; i++) {
            for (j = 0; j < GameCode.SIZE; j++)
                if(GameCode.map[i][j]!=GameCode.DOT_EMPTY){
                if (GameCode.map[i][j] == GameCode.DOT_X) {
                    drawX(g, i, j);
                }
            if (GameCode.map[i][j] == GameCode.DOT_O) {
                draw0(g, i, j);
            }
            }
        }

   }


//
//        if (GameCode.map[1][0] == GameCode.DOT_O) {
//            draw0(g, 1, 0);
//        }

// Прорисовка готова не трогать!
        private void drawX (Graphics g,int y, int x){
            g.setColor(Color.BLACK);
            ((Graphics2D) g).setStroke(new BasicStroke(3f));

            g.drawLine(x * cellWidth, y * cellHeight,
                    (x + 1) * cellWidth, (y + 1) * cellHeight);

            g.drawLine((x + 1) * cellWidth, y * cellHeight,
                    (x) * cellWidth, (y + 1) * cellHeight);


        }

        private void draw0 (Graphics g,int y, int x){
            g.setColor(Color.BLACK);
            ((Graphics2D) g).setStroke(new BasicStroke(3f));

            Shape circleShape = new Ellipse2D.Double((x) * cellWidth, (y) * cellHeight, cellWidth, cellHeight);
            ((Graphics2D) g).draw(circleShape);
        }

    }



