package gr.uoi.cs.daintiness.hecate.gui.swing;

import java.awt.Dimension;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;

import javax.swing.GroupLayout;
import javax.swing.JButton;
import javax.swing.JComponent;
import javax.swing.JDialog;
import javax.swing.JFileChooser;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.LayoutStyle;

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
		getContentPane().setLayout(thisLayout);
		thisLayout.setVerticalGroup(thisLayout.createSequentialGroup()
			.addContainerGap()
			.addGroup(thisLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
			    .addComponent(openFolder, GroupLayout.Alignment.BASELINE, GroupLayout.PREFERRED_SIZE, GroupLayout.PREFERRED_SIZE, GroupLayout.PREFERRED_SIZE)
			    .addComponent(folderLabel, GroupLayout.Alignment.BASELINE, GroupLayout.PREFERRED_SIZE, GroupLayout.PREFERRED_SIZE, GroupLayout.PREFERRED_SIZE)
			    .addComponent(folderField, GroupLayout.Alignment.BASELINE, GroupLayout.PREFERRED_SIZE, GroupLayout.PREFERRED_SIZE, GroupLayout.PREFERRED_SIZE))
			.addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
			.addGap(0, 67, Short.MAX_VALUE)
			.addGroup(thisLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
			    .addComponent(cancel, GroupLayout.Alignment.BASELINE, GroupLayout.PREFERRED_SIZE, GroupLayout.PREFERRED_SIZE, GroupLayout.PREFERRED_SIZE)
			    .addComponent(ok, GroupLayout.Alignment.BASELINE, GroupLayout.PREFERRED_SIZE, GroupLayout.PREFERRED_SIZE, GroupLayout.PREFERRED_SIZE))
			.addContainerGap());
		thisLayout.setHorizontalGroup(thisLayout.createSequentialGroup()
			.addContainerGap()
			.addGroup(thisLayout.createParallelGroup()
			    .addGroup(GroupLayout.Alignment.LEADING, thisLayout.createSequentialGroup()
			        .addComponent(folderLabel, GroupLayout.PREFERRED_SIZE, GroupLayout.PREFERRED_SIZE, GroupLayout.PREFERRED_SIZE)
			        .addGap(12)))
			.addGroup(thisLayout.createParallelGroup()
			    .addGroup(thisLayout.createSequentialGroup()
			        .addGroup(thisLayout.createParallelGroup()
			            .addComponent(folderField, GroupLayout.Alignment.LEADING, 0, 315, Short.MAX_VALUE))
			        .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
			        .addGroup(thisLayout.createParallelGroup()
			            .addComponent(openFolder, GroupLayout.Alignment.LEADING, GroupLayout.PREFERRED_SIZE, 23, GroupLayout.PREFERRED_SIZE)))
			    .addGroup(GroupLayout.Alignment.LEADING, thisLayout.createSequentialGroup()
			        .addGap(0, 199, Short.MAX_VALUE)
			        .addComponent(ok, GroupLayout.PREFERRED_SIZE, 67, GroupLayout.PREFERRED_SIZE)
			        .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED, 1, GroupLayout.PREFERRED_SIZE)
			        .addComponent(cancel, GroupLayout.PREFERRED_SIZE, 67, GroupLayout.PREFERRED_SIZE)))
			.addContainerGap());
		
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
