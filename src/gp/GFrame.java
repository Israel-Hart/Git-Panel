package gp;
import javax.swing.JFrame; 
import javax.swing.JPanel;
import javax.swing.JLabel; 
import java.awt.event.ActionEvent; 
import java.awt.event.ActionListener; 
import java.awt.Color;
import java.awt.GridLayout;
import java.awt.Font; 

public class GFrame extends JFrame implements ActionListener {
	
	GFrame window = null;
	JPanel panel = null; 
	JLabel label = null; 
	
	public void setupWindow() {
		window = this; 
		this.setSize(600,400);
		this.setResizable(false); 
		this.setTitle("Git Panel");
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 
		this.setLayout(null);
	}
	
	public void addComp() {
		panel = new JPanel();
		label = new JLabel(); 
		
		panel.setLayout(null);
		panel.setBackground(new Color(233,233,233));
		panel.setBounds(0,0,600,400);
		
		label.setText("Git Panel");
		label.setFont(new Font("Charcoal", Font.BOLD, 32));
		label.setForeground(Color.red);
		label.setBounds(0,0,600,400);
		label.setVerticalTextPosition(JLabel.CENTER);
		label.setHorizontalAlignment(JLabel.CENTER);
		
		panel.add(label); 
		this.add(panel);
		this.setVisible(true);
	}
	
	public void init() {
		this.setupWindow(); 
		this.addComp();
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		
	}
}

