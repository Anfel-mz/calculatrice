package calculatrice;
import java.awt.*;

import javax.swing.*;

public class Calculatrice extends JFrame {//we can extends jpanel it resonates more
	
  

		// attributs de object Graphique

		//JTextField

		// 16 boutton de commande (JButton

		
	   
		 JPanel contenuFenêtre;//the window 

		 JTextField champAffichage= new JTextField("0");//the text feild 

		 JButton bouton0;

		 JButton bouton1;

		 JButton bouton2;

		 JButton bouton3;

		 JButton bouton4;

		 JButton bouton5;

		 JButton bouton6;

		 JButton bouton7;

		 JButton bouton8;

		 JButton bouton9;

		 JButton boutonVirgule;

		 JButton boutonEgale;
		


		 JButton plus;

		 JButton moins;

		 JButton fois;

		 JButton div;

		

		public Calculatrice()

		{

			 CalcController ecouteurE = new CalcController(champAffichage);
		
			this.setTitle("calculatrice");//change the window's name
			this.setLocationRelativeTo(null); //so it shows in the center
			this.setSize(200, 300);
			

			contenuFenêtre = new JPanel();//create the window
			

			this.getContentPane().add(contenuFenêtre); //mettre le contenue de la fenetre calculatrice qu'on vient de créer au contenu dans créer dans la var contenue fenetre 

		    contenuFenêtre.setLayout(new BorderLayout()); //this deletes the margines between the buttons 

			 //l'affichage de la calcul va etre à 0

			contenuFenêtre.add(BorderLayout.NORTH,champAffichage); //we add it to la fenaitre 

			bouton0 = new JButton("O");
			bouton1 = new JButton("1");
			bouton2 = new JButton("2");
			bouton3 = new JButton("3");
			bouton4 = new JButton("4");
			bouton5 = new JButton("5");
			bouton6 = new JButton("6");
			bouton7 = new JButton("7");
			bouton8 = new JButton("8");
			bouton9 = new JButton("9");
			boutonVirgule = new JButton(",");
	        boutonEgale = new JButton("=");
			plus = new JButton("+");
		    moins = new JButton("-");
			fois = new JButton("x");
			div = new JButton("/");
			
			 bouton0.addActionListener(ecouteurE);
			 bouton1.addActionListener(ecouteurE);
			 bouton2.addActionListener(ecouteurE);
			 bouton3.addActionListener(ecouteurE);
			 bouton4.addActionListener(ecouteurE);
			 bouton5.addActionListener(ecouteurE);
			 bouton6.addActionListener(ecouteurE);
			 bouton7.addActionListener(ecouteurE);
			 bouton8.addActionListener(ecouteurE);
			 bouton9.addActionListener(ecouteurE);
			 boutonVirgule.addActionListener(ecouteurE);
			 
			
			  JPanel panneauChiffres = new JPanel();

			  GridLayout disposition2 = new GridLayout(4, 3); 

			  panneauChiffres.setLayout(disposition2);

				

			  panneauChiffres.add(bouton1);

			  panneauChiffres.add(bouton2);

			  panneauChiffres.add(bouton3);

			  panneauChiffres.add(bouton4);

			  panneauChiffres.add(bouton5);

			  panneauChiffres.add(bouton6);

			  panneauChiffres.add(bouton7);

			  panneauChiffres.add(bouton8);

			  panneauChiffres.add(bouton9);

			  panneauChiffres.add(bouton0);

			  panneauChiffres.add(boutonVirgule);

			  panneauChiffres.add(boutonEgale);

			   

			  contenuFenêtre.add(BorderLayout.CENTER, panneauChiffres);

			  
				
			  JPanel panneauSignes = new JPanel();

			  GridLayout disposition3 = new GridLayout(4, 1); 

			  panneauSignes.setLayout(disposition3);
			  
			  panneauSignes.add(plus);

			  panneauSignes.add(moins);

			  panneauSignes.add(fois);

			  panneauSignes.add(div);
			  
			  contenuFenêtre.add(BorderLayout.EAST, panneauSignes);

			  this.setVisible(true);

			 // this.pack(); //automatically adapt the size of the window to its componments 
			  
		}

			

			public static void main(String[] args) {
				
				
				
				
				new Calculatrice();
				

			}
			

		}





