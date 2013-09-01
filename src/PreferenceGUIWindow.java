import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTabbedPane;

import java.awt.Color;

import com.jgoodies.forms.layout.FormLayout;
import com.jgoodies.forms.layout.ColumnSpec;
import com.jgoodies.forms.layout.RowSpec;
import com.jgoodies.forms.factories.FormFactory;

import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;


public class PreferenceGUIWindow extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField txtNotImplementedYet_1;
	private JTextField txtNotImplementedYet;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					PreferenceGUIWindow frame = new PreferenceGUIWindow();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public PreferenceGUIWindow() {
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 413, 208);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		
		JTabbedPane tabbedPane = new JTabbedPane(JTabbedPane.TOP);
		contentPane.add(tabbedPane, BorderLayout.CENTER);
		
		JPanel panel = new JPanel();
		tabbedPane.addTab("Ping", null, panel, null);
		tabbedPane.setBackgroundAt(0, Color.RED);
		panel.setLayout(new FormLayout(new ColumnSpec[] {
				FormFactory.RELATED_GAP_COLSPEC,
				FormFactory.DEFAULT_COLSPEC,
				FormFactory.RELATED_GAP_COLSPEC,
				ColumnSpec.decode("default:grow"),},
			new RowSpec[] {
				FormFactory.RELATED_GAP_ROWSPEC,
				FormFactory.DEFAULT_ROWSPEC,
				FormFactory.RELATED_GAP_ROWSPEC,
				FormFactory.DEFAULT_ROWSPEC,
				FormFactory.RELATED_GAP_ROWSPEC,
				FormFactory.DEFAULT_ROWSPEC,
				FormFactory.RELATED_GAP_ROWSPEC,
				FormFactory.DEFAULT_ROWSPEC,}));
		
		JLabel lblNewLabel = new JLabel("Website");
		panel.add(lblNewLabel, "2, 2, right, default");
		
		textField = new JTextField();
		panel.add(textField, "4, 2, fill, default");
		textField.setColumns(10);
		textField.setText(Pref.get(Pref.WEB_ID, Pref.WEB_DEF)); // TODO 

		JLabel lblNumber = new JLabel("Packet Size (-s)");
		panel.add(lblNumber, "2, 4, right, default");
		
		txtNotImplementedYet_1 = new JTextField();
		panel.add(txtNotImplementedYet_1, "4, 4, fill, default");
		txtNotImplementedYet_1.setColumns(10);
		txtNotImplementedYet_1.setText(Pref.get(Pref.S_ID, Pref.S_DEFAULT));
		JLabel lblPacketSize = new JLabel("Packet No. (-c)");
		panel.add(lblPacketSize, "2, 6, right, default");
		
		txtNotImplementedYet = new JTextField();
		panel.add(txtNotImplementedYet, "4, 6, fill, default");
		txtNotImplementedYet.setColumns(10);
		txtNotImplementedYet.setText(Pref.get(Pref.c_ID, Pref.c_DEFAULT));

		JButton btnNewButton = new JButton("SAVE");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if(PingMonitorTool.enabledPing)
            	PingMonitorTool.togglePinger();
				Pref.set(Pref.WEB_ID, textField.getText());
				Pref.set(Pref.S_ID, txtNotImplementedYet_1.getText());
				Pref.set(Pref.c_ID, txtNotImplementedYet.getText());

			}
		});
		panel.add(btnNewButton, "2, 8, 3, 1");
		
		JPanel panel_2 = new JPanel();
		tabbedPane.addTab("Color", null, panel_2, null);
		tabbedPane.setBackgroundAt(1, Color.GREEN);
		panel_2.setLayout(new FormLayout(new ColumnSpec[] {
				FormFactory.RELATED_GAP_COLSPEC,
				FormFactory.DEFAULT_COLSPEC,
				FormFactory.RELATED_GAP_COLSPEC,
				ColumnSpec.decode("default:grow"),},
			new RowSpec[] {
				FormFactory.RELATED_GAP_ROWSPEC,
				FormFactory.DEFAULT_ROWSPEC,
				FormFactory.RELATED_GAP_ROWSPEC,
				FormFactory.DEFAULT_ROWSPEC,
				FormFactory.RELATED_GAP_ROWSPEC,
				FormFactory.DEFAULT_ROWSPEC,
				FormFactory.RELATED_GAP_ROWSPEC,
				FormFactory.DEFAULT_ROWSPEC,}));
		
		JLabel lblNotavailableyet = new JLabel("NotAvailableYet");
		panel_2.add(lblNotavailableyet, "4, 2");
		
		JLabel lblPingColor = new JLabel("Pings");
		panel_2.add(lblPingColor, "2, 4, right, default");
		
		textField_1 = new JTextField();
		textField_1.setEnabled(false);
		panel_2.add(textField_1, "4, 4, fill, default");
		textField_1.setColumns(10);
		
		JLabel lblErrorColor = new JLabel("Errors");
		panel_2.add(lblErrorColor, "2, 6, right, default");
		
		textField_2 = new JTextField();
		textField_2.setEnabled(false);
		panel_2.add(textField_2, "4, 6, fill, default");
		textField_2.setColumns(10);
		
		JLabel lblTimeout = new JLabel("Timeout");
		panel_2.add(lblTimeout, "2, 8, right, default");
		
		textField_3 = new JTextField();
		textField_3.setEnabled(false);
		panel_2.add(textField_3, "4, 8, fill, default");
		textField_3.setColumns(10);
		
		JPanel panel_1 = new JPanel();
		tabbedPane.addTab("About", null, panel_1, null);
		
		JLabel lblPingMonitorTool = new JLabel("Ping Monitor Tool v6");
		panel_1.add(lblPingMonitorTool);
		tabbedPane.setBackgroundAt(2, Color.BLUE);
	}

}
