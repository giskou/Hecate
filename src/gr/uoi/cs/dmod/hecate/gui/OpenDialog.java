package gr.uoi.cs.dmod.hecate.gui;

import java.awt.Dimension;
import java.awt.Insets;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.Box;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;

@SuppressWarnings("serial")
public class OpenDialog extends JDialog {
	
	public OpenDialog() {
		setTitle("Open Files") ;
		
		setSize(500, 120);
		// center on screen
		Toolkit toolkit = getToolkit();
		Dimension size = toolkit.getScreenSize();
		setLocation(size.width/2 - getWidth()/2, 
		            size.height/2 - getHeight()/2);
		
		JPanel mainPanel = new JPanel();
		mainPanel.setLayout(new BoxLayout(mainPanel, BoxLayout.Y_AXIS));
		mainPanel.setBorder(new EmptyBorder(new Insets(5, 5, 5, 5)));
		add(mainPanel);
		
		JPanel oldFilePanel = new JPanel();
		oldFilePanel.setLayout(new BoxLayout(oldFilePanel, BoxLayout.X_AXIS));
		JLabel oldFileLabel = new JLabel("Old Schema :") ;
		JTextField oldFileTextField = new JTextField() ;
		oldFilePanel.add(oldFileLabel);
		oldFilePanel.add(oldFileTextField);
		mainPanel.add(oldFilePanel);
		mainPanel.add(Box.createRigidArea(new Dimension(0, 5)));
		
		JPanel newFilePanel = new JPanel();
		newFilePanel.setLayout(new BoxLayout(newFilePanel, BoxLayout.X_AXIS));
		JLabel newFileLabel = new JLabel("New Schema :") ;
		JTextField newFileTextField = new JTextField() ;
		newFilePanel.add(newFileLabel);
		newFilePanel.add(newFileTextField);
		mainPanel.add(newFilePanel);
		mainPanel.add(Box.createRigidArea(new Dimension(0, 5)));

		JPanel bottomPanel = new JPanel();
		bottomPanel.setLayout(new BoxLayout(bottomPanel, BoxLayout.X_AXIS));
		bottomPanel.add(Box.createHorizontalGlue());
		JButton okButton = new JButton("OK");
		// TODO button listener
		bottomPanel.add(okButton);
		bottomPanel.add(Box.createRigidArea(new Dimension(5, 0)));

		JButton cancelButton = new JButton("Cancel");
		cancelButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent event) {
				dispose();
			}
		});
		bottomPanel.add(cancelButton);
		mainPanel.add(bottomPanel);

		setModalityType(ModalityType.APPLICATION_MODAL);
		setDefaultCloseOperation(DISPOSE_ON_CLOSE);
	}
}