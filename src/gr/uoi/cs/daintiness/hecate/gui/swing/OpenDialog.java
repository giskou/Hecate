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
				oldFileField.setText(getFilePath(oldFileField.getText()));
			}
		});
		newFileLabel = new JLabel("New Schema : ");
		newFileField = new JTextField();
		openNewFile = new JButton("...");
		openNewFile.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent event) {
				newFileField.setText(getFilePath(newFileField.getText()));
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
					.addGroup(thisLayout.createParallelGroup(Alignment.LEADING)
						.addComponent(newFileLabel, GroupLayout.PREFERRED_SIZE, 98, GroupLayout.PREFERRED_SIZE)
						.addComponent(oldFileLable, GroupLayout.PREFERRED_SIZE, GroupLayout.PREFERRED_SIZE, GroupLayout.PREFERRED_SIZE))
					.addGroup(thisLayout.createParallelGroup(Alignment.LEADING)
						.addGroup(thisLayout.createSequentialGroup()
							.addGroup(thisLayout.createParallelGroup(Alignment.LEADING)
								.addComponent(newFileField, 0, 316, Short.MAX_VALUE)
								.addComponent(oldFileField, 0, 316, Short.MAX_VALUE))
							.addPreferredGap(ComponentPlacement.RELATED)
							.addGroup(thisLayout.createParallelGroup(Alignment.LEADING)
								.addComponent(openNewFile, GroupLayout.PREFERRED_SIZE, 23, GroupLayout.PREFERRED_SIZE)
								.addComponent(openOldFile, GroupLayout.PREFERRED_SIZE, 23, GroupLayout.PREFERRED_SIZE)))
						.addGroup(Alignment.TRAILING, thisLayout.createSequentialGroup()
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(ok, GroupLayout.PREFERRED_SIZE, 83, GroupLayout.PREFERRED_SIZE)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(cancel, GroupLayout.PREFERRED_SIZE, 84, GroupLayout.PREFERRED_SIZE)))
					.addContainerGap())
		);
		thisLayout.setVerticalGroup(
			thisLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(thisLayout.createSequentialGroup()
					.addContainerGap()
					.addGroup(thisLayout.createParallelGroup(Alignment.BASELINE)
						.addComponent(openOldFile, GroupLayout.PREFERRED_SIZE, GroupLayout.PREFERRED_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(oldFileLable, GroupLayout.PREFERRED_SIZE, GroupLayout.PREFERRED_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(oldFileField, GroupLayout.PREFERRED_SIZE, GroupLayout.PREFERRED_SIZE, GroupLayout.PREFERRED_SIZE))
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(thisLayout.createParallelGroup(Alignment.BASELINE)
						.addComponent(newFileField, GroupLayout.PREFERRED_SIZE, GroupLayout.PREFERRED_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(openNewFile, GroupLayout.PREFERRED_SIZE, GroupLayout.PREFERRED_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(newFileLabel, GroupLayout.PREFERRED_SIZE, GroupLayout.PREFERRED_SIZE, GroupLayout.PREFERRED_SIZE))
					.addGap(0, 67, Short.MAX_VALUE)
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
	private String getFilePath(String old) {
		fileopen = new JFileChooser();
		fileopen.setFileFilter(new FileNameExtensionFilter("SQL files", "sql"));
		fileopen.setCurrentDirectory(new File(old));
		fileopen.showDialog(this, "Open");
		File f = fileopen.getSelectedFile();
		if ( f == null) {
			return old;
		}
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