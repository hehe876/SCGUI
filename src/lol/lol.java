package lol;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.JFileChooser;

import java.awt.BorderLayout;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JLabel;
import java.awt.Color;
import javax.swing.JTextField;

public class lol {

	private JFrame frmSharpAndClefer;
	private JTextField txtLoad;
	private JTextField txtSave;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					lol window = new lol();
					window.frmSharpAndClefer.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public lol() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmSharpAndClefer = new JFrame();
		frmSharpAndClefer.setTitle("Sharp and Clefer");
		frmSharpAndClefer.setBounds(100, 100, 412, 221);
		frmSharpAndClefer.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmSharpAndClefer.getContentPane().setLayout(null);
		
		JButton btnLoad = new JButton("Set Load Location");
		btnLoad.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				JButton open = new JButton("Browse");
				JFileChooser fc = new JFileChooser();
				fc.setCurrentDirectory(new java.io.File("C:/Users"));
				fc.setDialogTitle("Set Load Location");
				fc.setFileSelectionMode(JFileChooser.DIRECTORIES_ONLY);
				if (fc.showOpenDialog(open) == JFileChooser.APPROVE_OPTION) {
					//
				}
				txtLoad.setText(fc.getSelectedFile().getAbsolutePath());
			}
		});
		btnLoad.setBounds(10, 70, 182, 45);
		frmSharpAndClefer.getContentPane().add(btnLoad);
		
		txtLoad = new JTextField();
		txtLoad.setBounds(112, 11, 272, 20);
		frmSharpAndClefer.getContentPane().add(txtLoad);
		txtLoad.setColumns(10);
		
		JButton btnSave = new JButton("Set Save Location");
		btnSave.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				JButton open = new JButton("Browse");
				JFileChooser fc = new JFileChooser();
				fc.setCurrentDirectory(new java.io.File("C:/Users"));
				fc.setDialogTitle("Set Save Location");
				fc.setFileSelectionMode(JFileChooser.DIRECTORIES_ONLY);
				if (fc.showOpenDialog(open) == JFileChooser.APPROVE_OPTION) {
					//
				}
				txtSave.setText(fc.getSelectedFile().getAbsolutePath());
			}
		});
		btnSave.setBounds(202, 70, 182, 45);
		frmSharpAndClefer.getContentPane().add(btnSave);
		
		JLabel lblLoadLocation = new JLabel("Load Location:");
		lblLoadLocation.setLabelFor(txtLoad);
		lblLoadLocation.setBounds(10, 14, 92, 14);
		frmSharpAndClefer.getContentPane().add(lblLoadLocation);
		
		JLabel lblSaveLocation = new JLabel("Save Location:");
		lblSaveLocation.setBounds(10, 45, 92, 14);
		frmSharpAndClefer.getContentPane().add(lblSaveLocation);
		
		txtSave = new JTextField();
		lblSaveLocation.setLabelFor(txtSave);
		txtSave.setColumns(10);
		txtSave.setBounds(112, 39, 272, 20);
		frmSharpAndClefer.getContentPane().add(txtSave);
		
		JButton btnStart = new JButton("Start");
		btnStart.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				
			}
		});
		btnStart.setBounds(10, 126, 374, 45);
		frmSharpAndClefer.getContentPane().add(btnStart);
	}
}
