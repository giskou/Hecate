package gr.uoi.cs.daintiness.hecate.gui.swing;

import java.awt.Dimension;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;

import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JButton;
import javax.swing.JComponent;
import javax.swing.JDialog;
import javax.swing.JFileChooser;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.LayoutStyle.ComponentPlacement;

/**
 * A dialog for opening a folder for recursive diff-ing
 * @author giskou
 *
 */
@SuppressWarnings("serial")
public class OpenFolderDialog extends JDialog{
	
	private JLabel folderLabel;
	private JTextField folderField;
	private JButton ok;
	private JButton cancel;
	private JButton openFolder;
	private JFileChooser fileopen;
	private int status;
	
	/**
	 * Default Constructor
	 */
	OpenFolderDialog(){
		initialize();
		
		folderLabel = new JLabel("Folder : ");
		folderField = new JTextField();
		openFolder = new JButton("...");
		openFolder.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent event) {
				folderField.setText(getFolderPath(folderField.getText()));
			}
		});
		cancel = new JButton("Cancel");
		cancel.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent event) {
				setVisible(false);
				status = 0;
			}
		});
		ok = new JButton("OK");
		ok.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent event) {
				setVisible(false);
				status = 1;
			}
		});
		
		GroupLayout thisLayout = new GroupLayout((JComponent)getContentPane());
		thisLayout.setHorizontalGroup(
			thisLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(thisLayout.createSequentialGroup()
					.addContainerGap()
					.addComponent(folderLabel, GroupLayout.PREFERRED_SIZE, GroupLayout.PREFERRED_SIZE, GroupLayout.PREFERRED_SIZE)
					.addGap(12)
					.addGroup(thisLayout.createParallelGroup(Alignment.LEADING)
						.addGroup(thisLayout.createSequentialGroup()
							.addComponent(folderField, 0, 316, Short.MAX_VALUE)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(openFolder, GroupLayout.PREFERRED_SIZE, 23, GroupLayout.PREFERRED_SIZE))
						.addGroup(Alignment.TRAILING, thisLayout.createSequentialGroup()
							.addComponent(ok, GroupLayout.PREFERRED_SIZE, 79, GroupLayout.PREFERRED_SIZE)
							.addGap(4)
							.addComponent(cancel)))
					.addContainerGap())
		);
		thisLayout.setVerticalGroup(
			thisLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(thisLayout.createSequentialGroup()
					.addContainerGap()
					.addGroup(thisLayout.createParallelGroup(Alignment.BASELINE)
						.addComponent(openFolder, GroupLayout.PREFERRED_SIZE, GroupLayout.PREFERRED_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(folderLabel, GroupLayout.PREFERRED_SIZE, GroupLayout.PREFERRED_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(folderField, GroupLayout.PREFERRED_SIZE, GroupLayout.PREFERRED_SIZE, GroupLayout.PREFERRED_SIZE))
					.addPreferredGap(ComponentPlacement.RELATED, 67, Short.MAX_VALUE)
					.addGroup(thisLayout.createParallelGroup(Alignment.BASELINE)
						.addComponent(cancel, GroupLayout.PREFERRED_SIZE, GroupLayout.PREFERRED_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(ok, GroupLayout.PREFERRED_SIZE, GroupLayout.PREFERRED_SIZE, GroupLayout.PREFERRED_SIZE))
					.addContainerGap())
		);
		getContentPane().setLayout(thisLayout);
		
		draw();
	}
	
	/**
	 * Sets the dialog's title, default close operation and modality type
	 */
	private void initialize() {
		setTitle("Open") ;
		setModalityType(ModalityType.APPLICATION_MODAL);
		setDefaultCloseOperation(HIDE_ON_CLOSE);
	}
	
	/**
	 * Sets the size of the dialog and centers it to the screen
	 */
	private void draw() {
		pack();
		// center on screen
		Toolkit toolkit = getToolkit();
		Dimension size = toolkit.getScreenSize();
		setLocation(size.width/2 - getWidth()/2, 
		            size.height/2 - getHeight()/2);
	}
	
	/**
	 * Opens a {@link JFileChooser} and returns the path of the
	 * chosen folder
	 * @return the path of the chosen folder
	 */
	private String getFolderPath(String old) {
		fileopen = new JFileChooser();
		fileopen.setFileSelectionMode(JFileChooser.DIRECTORIES_ONLY);
		fileopen.setCurrentDirectory(new File(old));
		fileopen.showDialog(this, "Open");
		File f = fileopen.getSelectedFile();
		if (f == null) {
			return old;
		}
		return f.getPath();
	}
	
	/**
	 * Indicates whether or not the dialog is capable of opening a folder.
	 * The <code>status</code> field becomes 1 when the text field is full.
	 * @return The status of the dialog.
	 */
	public int getStatus() {
		return this.status;
	}
	
	/**
	 * 
	 * @return The path of the chosen folder
	 */
	public String getFolder() {
		return folderField.getText();
	}
	
}
