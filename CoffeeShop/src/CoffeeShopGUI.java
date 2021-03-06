import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.JOptionPane; 
import javax.swing.JFrame;
import javax.swing.JButton;

public class CoffeeShopGUI {
	
	public static void main(String[]args)
	{
		
		JFrame frame = new JFrame("Coffee Shop");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(500, 500);
		frame.setLocationRelativeTo(null);
		
		JButton newOrder = new JButton("New Order");
		JButton logOut = new JButton("Log Out");
		
		frame.setLayout(new GridLayout(3, 3));
		frame.add(newOrder);
		frame.add(logOut);
		
		frame.setVisible(true);
		
		ArrayList <Integer> passwords = new ArrayList<Integer>();
		passwords.add(1234);
		int pass;
		boolean valid = false;
		
		while(valid == false)
		{
			
			pass = Integer.parseInt(JOptionPane.showInputDialog("Enter your 4 Digit Password."));
			
			for(int x : passwords)
			{
				
				
				if(x == pass)
				{
					
					valid = true; 
					
				}
				
			}

			if(valid == true)
			{
				
				JOptionPane.showMessageDialog(frame, "Press OK to enter." , "Success", JOptionPane.PLAIN_MESSAGE);
			}
			else 
			{
				
				JOptionPane.showMessageDialog(frame, "Invalid Password", "Failed", JOptionPane.WARNING_MESSAGE );
			}
			
		}
		
		newOrder.addActionListener(new ActionListener(){

			
			public void actionPerformed(ActionEvent arg0) {
				
				
				
			}
			
			
		});
		
		logOut.addActionListener(new ActionListener(){
			
			public void actionPerformed(ActionEvent arg0)
			{
				
				JOptionPane.showMessageDialog(frame, "Press OK to log out." , "Logging out", JOptionPane.PLAIN_MESSAGE);
				frame.dispose();
			}

			
		});
		
	}

}
