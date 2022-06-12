package calculatrice;

import javax.swing.JButton;
import javax.swing.JTextField;


import java.lang.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CalcController implements ActionListener{
	JTextField zoneT;


	public CalcController (JTextField t) {
		zoneT = t;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		Integer n1 = 0; //resultat
		Integer n2 = 0; //the one we're writhing 
		
		if(((JButton)e.getSource()).getText().equals("+")){
			n2 = Integer.parseInt(zoneT.getText());
			n1 = Math.addExact(n1, n2);
			
			zoneT.setText("0");
			}
		//hadou ndirouhoum f le else 
		if(zoneT.getText().equals("0")) {
       zoneT.setText(((JButton) e.getSource()).getText());}
		else {
			String s = zoneT.getText();
			zoneT.setText( s+((JButton) e.getSource()).getText());
		}
		
		
		
	}

}
