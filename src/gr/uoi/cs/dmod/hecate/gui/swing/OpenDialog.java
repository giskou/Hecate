package gr.uoi.cs.dmod.hecate.gui.swing;

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
import javax.swing.filechooser.FileNameExtensionFilter;

/**
 * A dialog to choose the original and modified file
 * @author giskou
 *
 */
@SuppressWarnings("serial")
public class OpenDialog extends JDialog {
	
	private JLabel oldFileLable;
	private JLabel newFileLabel;
	private JTextField oldFileField;
	private JTextField newFileField;
	private JButton ok;
	private JButton cancel;
	private JButton openOldFile;
	private JButton openNewFile;
	private JFileChooser fileopen;
	private File oldFile;
	private File newFile;
	private int status;
	
	/**
	 * Default Constructor
	 */
	public OpenDialog() {
		initialize();
		
		oldFileLable = new JLabel("Old Schema : ");
		oldFileField = new JTextField();
		openOldFile = new JButton("...");
		openOldFile.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent event) {
				oldFileField.setText(getFilePath());
			}
		});
		newFileLabel = new JLabel("New Schema : ");
		newFileField = new JTextField();
		openNewFile = new JButton("...");
		openNewFile.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent event) {
				newFileField.setText(getFilePath());
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
			    .addComponent(openOldFile, GroupLayout.Alignment.BASELINE, GroupLayout.PREFERRED_SIZE, GroupLayout.PREFERRED_SIZE, GroupLayout.PREFERRED_SIZE)
			    .addComponent(oldFileLable, GroupLayout.Alignment.BASELINE, GroupLayout.PREFERRED_SIZE, GroupLayout.PREFERRED_SIZE, GroupLayout.PREFERRED_SIZE)
			    .addComponent(oldFileField, GroupLayout.Alignment.BASELINE, GroupLayout.PREFERRED_SIZE, GroupLayout.PREFERRED_SIZE, GroupLayout.PREFERRED_SIZE))
			.addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
			.addGroup(thisLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
			    .addComponent(newFileField, GroupLayout.Alignment.BASELINE, GroupLayout.PREFERRED_SIZE, GroupLayout.PREFERRED_SIZE, GroupLayout.PREFERRED_SIZE)
			    .addComponent(openNewFile, GroupLayout.Alignment.BASELINE, GroupLayout.PREFERRED_SIZE, GroupLayout.PREFERRED_SIZE, GroupLayout.PREFERRED_SIZE)
			    .addComponent(newFileLabel, GroupLayout.Alignment.BASELINE, GroupLayout.PREFERRED_SIZE, GroupLayout.PREFERRED_SIZE, GroupLayout.PREFERRED_SIZE))
			.addGap(0, 67, Short.MAX_VALUE)
			.addGroup(thisLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
			    .addComponent(cancel, GroupLayout.Alignment.BASELINE, GroupLayout.PREFERRED_SIZE, GroupLayout.PREFERRED_SIZE, GroupLayout.PREFERRED_SIZE)
			    .addComponent(ok, GroupLayout.Alignment.BASELINE, GroupLayout.PREFERRED_SIZE, GroupLayout.PREFERRED_SIZE, GroupLayout.PREFERRED_SIZE))
			.addContainerGap());
		thisLayout.setHorizontalGroup(thisLayout.createSequentialGroup()
			.addContainerGap()
			.addGroup(thisLayout.createParallelGroup()
			    .addComponent(newFileLabel, GroupLayout.Alignment.LEADING, GroupLayout.PREFERRED_SIZE, 98, GroupLayout.PREFERRED_SIZE)
			    .addGroup(GroupLayout.Alignment.LEADING, thisLayout.createSequentialGroup()
			        .addComponent(oldFileLable, GroupLayout.PREFERRED_SIZE, GroupLayout.PREFERRED_SIZE, GroupLayout.PREFERRED_SIZE)
			        .addGap(12)))
			.addGroup(thisLayout.createParallelGroup()
			    .addGroup(thisLayout.createSequentialGroup()
			        .addGroup(thisLayout.createParallelGroup()
			            .addComponent(newFileField, GroupLayout.Alignment.LEADING, 0, 315, Short.MAX_VALUE)
			            .addComponent(oldFileField, GroupLayout.Alignment.LEADING, 0, 315, Short.MAX_VALUE))
			        .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
			        .addGroup(thisLayout.createParallelGroup()
			            .addComponent(openNewFile, GroupLayout.Alignment.LEADING, GroupLayout.PREFERRED_SIZE, 23, GroupLayout.PREFERRED_SIZE)
			            .addComponent(openOldFile, GroupLayout.Alignment.LEADING, GroupLayout.PREFERRED_SIZE, 23, GroupLayout.PREFERRED_SIZE)))
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
	 * 
	 * @return The path of the original file.
	 */
	public File getOldFile() {
		oldFile = new File(oldFileField.getText());
		return oldFile;
	}
	
	/**
	 * 
	 * @return The path of the modified file.
	 */
	public File getNewFile() {
		newFile = new File(newFileField.getText());
		return newFile;
	}
	
	/**
	 * Opens a {@link JFileChooser} and returns the path of the
	 * chosen file
	 * @return the path of the chosen file
	 */
	private String getFilePath() {
		fileopen = new JFileChooser();
		fileopen.setFileFilter(new FileNameExtensionFilter("SQL files", "sql"));
		fileopen.showDialog(this, "Open");
		File f = fileopen.getSelectedFile();
		return f.getPath();
	}
	
	/**
	 * Indicates whether or not the dialog is capable of opening a file.
	 * The <code>status</code> field becomes 1 when both text fields are
	 * full.
	 * @return The status of the dialog.
	 */
	public int getStatus() {
		return this.status;
	}
}