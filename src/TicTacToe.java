import java.awt.*;
import java.awt.event.*;
import java.util.*;
import javax.swing.*;

public class TicTacToe implements ActionListener{

	Random random = new Random();
	JFrame frame = new JFrame();
	JPanel title_panel = new JPanel();
	JPanel button_panel = new JPanel();
	JLabel texfield = new JLabel();
	JButton[] buttons = new JButton[9];
	boolean player1_turn;
	
	TicTacToe(){
		
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(800, 800);
		frame.getContentPane().setBackground(new Color(50, 50, 50));
		frame.setLayout(new BorderLayout());
		frame.setVisible(true);
		
		texfield.setBackground(new Color(25, 25, 25));
		texfield.setForeground(new Color(25, 255, 0));
		texfield.setFont(new Font("Ink Free", Font.BOLD, 75));
		texfield.setHorizontalAlignment(JLabel.CENTER);
		texfield.setText("Tic-Tac-Toe");
		texfield.setOpaque(true);
		
		title_panel.setLayout(new BorderLayout());
		title_panel.setBounds(0, 0, 800, 100);
		
		button_panel.setLayout(new GridLayout(3,3));
		button_panel.setBackground(Color.black);
		for(int i = 0; i < 9; i++) {
			buttons[i] = new JButton();
			button_panel.add(buttons[i]);
			buttons[i].setFont(new Font("MV Boli", Font.BOLD, 120));
			buttons[i].setFocusable(false);
			buttons[i].addActionListener(this);
		}
		
		
		title_panel.add(texfield);
	//	button_panel.add(texfield);
		frame.add(title_panel, BorderLayout.NORTH);
		frame.add(button_panel);
		
		firstTurn();
		
		
	}
	
	
		
	@Override
	public void actionPerformed(ActionEvent e) {
		for(int i=0; i<9; i++) {
			if(e.getSource() == buttons[i]) {
				/*if(player1_turn ) {
					buttons[i].setText("X");
					texfield.setText("O turn ");
					player1_turn = false;  				//aafule sochera code
				}
				else {
					buttons[i].setText("O");
					texfield.setText("X turn ");
					player1_turn = true;
				}*/
				if(player1_turn) {
					if(buttons[i].getText() == "") {
						buttons[i].setForeground(new Color(255, 0, 0));
						buttons[i].setText("X");
						player1_turn = false;
						texfield.setText("O turn");
					}
				}
				else {
					if(buttons[i].getText() == "") {
						buttons[i].setForeground(new Color(0, 255, 0));
						buttons[i].setText("O");
						player1_turn = true;
						texfield.setText("X turn");
					}
				}
			}
		}
		
	}
	
	public void firstTurn() {
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		if(random.nextInt(2) == 0) {
			player1_turn = true;
			
		}else {
			player1_turn = false;
			texfield.setText("O turn ");
		}
			
	}
	
	public void check() {
		
	}
	public void xWins(int a, int b, int c) {
		
	}
	public void yWins(int a, int b, int c) {
		
	}
	
	
	
}
