import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Tictactoe extends JFrame implements ActionListener {
    private JButton[][] buttons = new JButton[3][3];
    private char currentPlayer = 'X';

    public Tictactoe() {
        setTitle("Tic Tac Toe");
        setSize(400, 400);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLayout(new GridLayout(3, 3));

        // Initialize buttons
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                buttons[i][j] = new JButton("");
                buttons[i][j].setFont(new Font("Arial", Font.BOLD, 60));
                buttons[i][j].addActionListener(this);
                add(buttons[i][j]);
            }
        }
    }

    public void actionPerformed(ActionEvent e) {
        JButton btn = (JButton) e.getSource();
        if (btn.getText().equals("")) {
            btn.setText(String.valueOf(currentPlayer));
            if (checkForWinner()) {
                JOptionPane.showMessageDialog(this, "Player " + currentPlayer + " wins!");
                resetBoard();
            } else if (isBoardFull()) {
                JOptionPane.showMessageDialog(this, "It's a draw!");
                resetBoard();
            } else {
                currentPlayer = (currentPlayer == 'X') ? 'O' : 'X';
            }
        }
    }

    private boolean checkForWinner() {
        // Check rows, columns, and diagonals
        for (int i = 0; i < 3; i++) {
            if (checkLine(buttons[i][0], buttons[i][1], buttons[i][2])) return true;
            if (checkLine(buttons[0][i], buttons[1][i], buttons[2][i])) return true;
        }
        return checkLine(buttons[0][0], buttons[1][1], buttons[2][2]) ||
               checkLine(buttons[0][2], buttons[1][1], buttons[2][0]);
    }

    private boolean checkLine(JButton b1, JButton b2, JButton b3) {
        String t1 = b1.getText(), t2 = b2.getText(), t3 = b3.getText();
        return !t1.equals("") && t1.equals(t2) && t2.equals(t3);
    }

    private boolean isBoardFull() {
        for (JButton[] row : buttons)
            for (JButton btn : row)
                if (btn.getText().equals("")) return false;
        return true;
    }

    private void resetBoard() {
        for (JButton[] row : buttons)
            for (JButton btn : row)
                btn.setText("");
        currentPlayer = 'X';
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> new Tictactoe().setVisible(true));
    }
}
