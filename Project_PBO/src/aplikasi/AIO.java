package aplikasi;
import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JButton;
import java.awt.Toolkit;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.LayoutStyle.ComponentPlacement;
import java.awt.Component;
import javax.swing.JPanel;
import javax.swing.JLayeredPane;
import javax.swing.JPopupMenu;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.CardLayout;
import javax.swing.border.TitledBorder;
import javax.swing.border.EtchedBorder;
import javax.swing.JLabel;
import java.awt.FlowLayout;
import javax.swing.SwingConstants;
import java.awt.Font;
import java.awt.SystemColor;
import javax.swing.JTextArea;
import javax.swing.JTabbedPane;
import java.awt.BorderLayout;
import javax.swing.ImageIcon;
import java.awt.GridLayout;

public class AIO {

	private JFrame AIO;
	private JLabel lbl_welcome;
	private JButton btn_saktikepala;
	private JPanel Welcome;
	private JPanel Sakit_Kepala;
	private JPanel Mual;
	private JPanel Batuk;
	private JPanel Diare;
	private JPanel Masuk_angin;


	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					AIO window = new AIO();
					window.AIO.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public AIO() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		AIO = new JFrame();
		AIO.getContentPane().setForeground(Color.WHITE);
		AIO.getContentPane().setBackground(Color.WHITE);
		AIO.setForeground(Color.WHITE);
		AIO.setBackground(Color.WHITE);
		AIO.setTitle("AIO | Aplikasi Informasi Obat");
		AIO.setIconImage(Toolkit.getDefaultToolkit().getImage("D:\\Programming\\eclipse-workspace\\Project_PBO\\download.png"));
		AIO.setBounds(100, 100, 600, 450);
		AIO.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
//		Menu Utama
		JLayeredPane layeredPane = new JLayeredPane();
		
		btn_saktikepala = new JButton("Sakit Kepala");
		btn_saktikepala.setToolTipText("Show obat sakit kepala");
		btn_saktikepala.setForeground(Color.BLACK);
		btn_saktikepala.setBackground(SystemColor.menu);
		btn_saktikepala.setFont(new Font("Sakkal Majalla", Font.BOLD, 14));
		btn_saktikepala.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				layeredPane.removeAll();
				layeredPane.add(Sakit_Kepala);
				layeredPane.repaint();
				layeredPane.revalidate();
			}
		});
		
		JButton btn_mual = new JButton("Mual");
		btn_mual.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				layeredPane.removeAll();
				layeredPane.add(Mual);
				layeredPane.repaint();
				layeredPane.revalidate();
			}
		});
		btn_mual.setToolTipText("Show obat mual");
		btn_mual.setForeground(Color.BLACK);
		btn_mual.setBackground(SystemColor.menu);
		btn_mual.setFont(new Font("Sakkal Majalla", Font.BOLD, 14));
		
		JButton btn_batuk = new JButton("Batuk");
		btn_batuk.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				layeredPane.removeAll();
				layeredPane.add(Batuk);
				layeredPane.repaint();
				layeredPane.revalidate();
			}
		});
		btn_batuk.setToolTipText("Show obat batuk");
		btn_batuk.setForeground(Color.BLACK);
		btn_batuk.setBackground(SystemColor.menu);
		btn_batuk.setFont(new Font("Sakkal Majalla", Font.BOLD, 14));
		
		JButton btn_diare = new JButton("Diare");
		btn_diare.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				layeredPane.removeAll();
				layeredPane.add(Diare);
				layeredPane.repaint();
				layeredPane.revalidate();
			}
		});
		btn_diare.setToolTipText("Show obat diare");
		btn_diare.setForeground(Color.BLACK);
		btn_diare.setBackground(SystemColor.menu);
		btn_diare.setFont(new Font("Sakkal Majalla", Font.BOLD, 14));
		
		JButton btn_masukangin = new JButton("Masuk Angin");
		btn_masukangin.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				layeredPane.removeAll();
				layeredPane.add(Masuk_angin);
				layeredPane.repaint();
				layeredPane.revalidate();
			}
		});
		btn_masukangin.setToolTipText("Show obat masuk angin");
		btn_masukangin.setForeground(Color.BLACK);
		btn_masukangin.setBackground(SystemColor.menu);
		btn_masukangin.setFont(new Font("Sakkal Majalla", Font.BOLD, 14));
		
		JLabel Pilih_gejala = new JLabel("Pilih gejala anda : ");
		Pilih_gejala.setFont(new Font("Segoe UI", Font.BOLD, 17));
		
		JButton kembali = new JButton("X");
		kembali.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
				layeredPane.removeAll();
				layeredPane.add(Welcome);
				layeredPane.repaint();
				layeredPane.revalidate();
			}
		});
		kembali.setForeground(Color.WHITE);
		kembali.setBackground(Color.RED);
		kembali.setFont(new Font("Segoe UI", Font.BOLD, 8));
		
		JPanel panel = new JPanel();
		panel.setBackground(Color.LIGHT_GRAY);
		GroupLayout groupLayout = new GroupLayout(AIO.getContentPane());
		groupLayout.setHorizontalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(Alignment.TRAILING, groupLayout.createSequentialGroup()
					.addContainerGap()
					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
						.addGroup(groupLayout.createSequentialGroup()
							.addComponent(Pilih_gejala, GroupLayout.DEFAULT_SIZE, 481, Short.MAX_VALUE)
							.addGap(93))
						.addComponent(layeredPane, GroupLayout.DEFAULT_SIZE, 574, Short.MAX_VALUE)
						.addGroup(groupLayout.createSequentialGroup()
							.addComponent(btn_saktikepala, GroupLayout.PREFERRED_SIZE, 99, GroupLayout.PREFERRED_SIZE)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(btn_mual, GroupLayout.PREFERRED_SIZE, 99, GroupLayout.PREFERRED_SIZE)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(btn_batuk, GroupLayout.PREFERRED_SIZE, 99, GroupLayout.PREFERRED_SIZE)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(btn_diare, GroupLayout.PREFERRED_SIZE, 99, GroupLayout.PREFERRED_SIZE)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(btn_masukangin, GroupLayout.PREFERRED_SIZE, 101, GroupLayout.PREFERRED_SIZE)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(kembali, GroupLayout.DEFAULT_SIZE, 47, Short.MAX_VALUE)))
					.addContainerGap())
				.addComponent(panel, GroupLayout.DEFAULT_SIZE, 584, Short.MAX_VALUE)
		);
		groupLayout.setVerticalGroup(
			groupLayout.createParallelGroup(Alignment.TRAILING)
				.addGroup(groupLayout.createSequentialGroup()
					.addComponent(panel, GroupLayout.PREFERRED_SIZE, 69, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.RELATED, 44, Short.MAX_VALUE)
					.addComponent(Pilih_gejala, GroupLayout.PREFERRED_SIZE, 30, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(groupLayout.createParallelGroup(Alignment.TRAILING, false)
						.addComponent(kembali, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
						.addComponent(btn_masukangin, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
						.addComponent(btn_diare, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
						.addComponent(btn_batuk, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
						.addComponent(btn_mual, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
						.addComponent(btn_saktikepala, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(layeredPane, GroupLayout.PREFERRED_SIZE, 263, GroupLayout.PREFERRED_SIZE)
					.addContainerGap())
		);
		panel.setLayout(null);
		
		JLabel title = new JLabel("Aplikasi Informasi Obat Sesuai Gejala");
		title.setBounds(117, 21, 354, 27);
		panel.add(title);
		title.setFont(new Font("Segoe UI", Font.BOLD, 20));
		title.setHorizontalAlignment(SwingConstants.CENTER);
		
		JLabel lblNewLabel_1 = new JLabel("");
		lblNewLabel_1.setIcon(new ImageIcon("D:\\Programming\\eclipse-workspace\\Project_PBO\\boards-with-fuzzy-vegetables-background.jpg"));
		lblNewLabel_1.setBounds(0, 0, 583, 69);
		panel.add(lblNewLabel_1);
		layeredPane.setLayout(new CardLayout(0, 0));
		
		Welcome = new JPanel();
		Welcome.setBorder(null);
		layeredPane.add(Welcome, "name_89731132424400");
		
		lbl_welcome = new JLabel("Selamat Datang");
		lbl_welcome.setFont(new Font("Segoe UI", Font.BOLD, 20));
		lbl_welcome.setLabelFor(Welcome);
		lbl_welcome.setHorizontalAlignment(SwingConstants.CENTER);
		
		JLabel lblNewLabel = new JLabel("Untuk memulai, klik pada tombol diatas sesuai gejala yang anda alami");
		GroupLayout gl_Welcome = new GroupLayout(Welcome);
		gl_Welcome.setHorizontalGroup(
			gl_Welcome.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_Welcome.createSequentialGroup()
					.addContainerGap(346, Short.MAX_VALUE)
					.addGroup(gl_Welcome.createParallelGroup(Alignment.LEADING)
						.addGroup(Alignment.TRAILING, gl_Welcome.createSequentialGroup()
							.addComponent(lbl_welcome, GroupLayout.PREFERRED_SIZE, 427, GroupLayout.PREFERRED_SIZE)
							.addGap(66))
						.addGroup(Alignment.TRAILING, gl_Welcome.createSequentialGroup()
							.addComponent(lblNewLabel)
							.addGap(108))))
		);
		gl_Welcome.setVerticalGroup(
			gl_Welcome.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_Welcome.createSequentialGroup()
					.addContainerGap()
					.addComponent(lbl_welcome, GroupLayout.PREFERRED_SIZE, 158, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(lblNewLabel)
					.addContainerGap(74, Short.MAX_VALUE))
		);
		Welcome.setLayout(gl_Welcome);
		
//		Tampilan Obat Sakit Kepala
		Sakit_Kepala = new JPanel();
		Sakit_Kepala.setBackground(SystemColor.menu);
		Sakit_Kepala.setBorder(new TitledBorder(new EtchedBorder(EtchedBorder.LOWERED, new Color(255, 255, 255), new Color(160, 160, 160)), "Obat Sakit kepala", TitledBorder.LEFT, TitledBorder.TOP, null, new Color(0, 0, 0)));
		layeredPane.setLayer(Sakit_Kepala, 1);
		layeredPane.add(Sakit_Kepala, "name_88477788261000");
		Sakit_Kepala.setLayout(null);
		
		JTextArea penjelasan_sakitkepala = new JTextArea();
		penjelasan_sakitkepala.setLineWrap(true);
		penjelasan_sakitkepala.setForeground(Color.BLACK);
		penjelasan_sakitkepala.setBackground(SystemColor.menu);
		penjelasan_sakitkepala.setWrapStyleWord(true);
		penjelasan_sakitkepala.setTabSize(13);
		penjelasan_sakitkepala.setRows(1);
		penjelasan_sakitkepala.setColumns(1);
		penjelasan_sakitkepala.setEditable(false);
		penjelasan_sakitkepala.setFont(new Font("Monospaced", Font.PLAIN, 11));
		penjelasan_sakitkepala.setText("\"Sakit kepala adalah kondisi ketika timbul rasa sakit dan tidak nyaman di kepala. sebagian besar sakit kepala tidak parah dan bisa diatasi sendiri dengan meminum obat pereda sakit, minum air putih yang cukup, dan banyak beristirahat\"\r\n\r\n\r\n\r\nsumber : halodoc.com");
		penjelasan_sakitkepala.setBounds(10, 24, 191, 228);
		Sakit_Kepala.add(penjelasan_sakitkepala);
		
		JLayeredPane layeredPane_obat_sakitkepala = new JLayeredPane();
		layeredPane_obat_sakitkepala.setBounds(211, 52, 343, 200);
		Sakit_Kepala.add(layeredPane_obat_sakitkepala);
		layeredPane_obat_sakitkepala.setLayout(new CardLayout(0, 0));
		
		JPanel Home_obat_sakitkepala = new JPanel();
		layeredPane_obat_sakitkepala.add(Home_obat_sakitkepala, "name_134093515910800");
		
		JLabel lblsakitkepala = new JLabel("Berikut 3 obat yang umum digunakan oleh masyarakat");
		
		JLabel lblsakitkepala2 = new JLabel("Klik pada tombol diatas untuk melihat informasi obat");
		GroupLayout gl_Home_obat_sakitkepala = new GroupLayout(Home_obat_sakitkepala);
		gl_Home_obat_sakitkepala.setHorizontalGroup(
			gl_Home_obat_sakitkepala.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_Home_obat_sakitkepala.createSequentialGroup()
					.addContainerGap()
					.addGroup(gl_Home_obat_sakitkepala.createParallelGroup(Alignment.LEADING)
						.addComponent(lblsakitkepala)
						.addComponent(lblsakitkepala2))
					.addContainerGap(74, Short.MAX_VALUE))
		);
		gl_Home_obat_sakitkepala.setVerticalGroup(
			gl_Home_obat_sakitkepala.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_Home_obat_sakitkepala.createSequentialGroup()
					.addContainerGap()
					.addComponent(lblsakitkepala)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(lblsakitkepala2)
					.addContainerGap(155, Short.MAX_VALUE))
		);
		Home_obat_sakitkepala.setLayout(gl_Home_obat_sakitkepala);
		
		JPanel Paracetamol = new JPanel();
		Paracetamol.setBorder(new TitledBorder(null, "Paracetemol Tab", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		layeredPane_obat_sakitkepala.add(Paracetamol, "name_132323669926600");
		Paracetamol.setLayout(new BorderLayout(0, 0));
		
		JTabbedPane tabbedPane_pct = new JTabbedPane(JTabbedPane.TOP);
		Paracetamol.add(tabbedPane_pct);
		
		JPanel indikasi_pct = new JPanel();
		indikasi_pct.setBorder(null);
		indikasi_pct.setBackground(Color.WHITE);
		tabbedPane_pct.addTab("Indikasi", null, indikasi_pct, null);
		tabbedPane_pct.setForegroundAt(0, Color.BLACK);
		tabbedPane_pct.setBackgroundAt(0, Color.LIGHT_GRAY);
		indikasi_pct.setLayout(new GridLayout(0, 1, 0, 0));
		
		JTextArea txtpct = new JTextArea();
		txtpct.setText("Paracetamol adalah obat penurun demam dan pereda nyeri, seperti nyeri haid dan sakit gigi, diminum dengan air putih untuk menelan tablet paracetamol, simpan pada suhu ruangan dan terhindar dari panas dan lembab.");
		txtpct.setWrapStyleWord(true);
		txtpct.setLineWrap(true);
		txtpct.setEditable(false);
		indikasi_pct.add(txtpct);
		
		JPanel kandungan_pct = new JPanel();
		kandungan_pct.setBorder(null);
		kandungan_pct.setBackground(Color.WHITE);
		tabbedPane_pct.addTab("Kandungan", null, kandungan_pct, null);
		kandungan_pct.setLayout(new GridLayout(0, 1, 0, 0));
		
		JTextArea txtrTiapTabletParacetamol = new JTextArea();
		txtrTiapTabletParacetamol.setText("Tiap Tablet paracetamol mengandung 500mg paracetamol");
		txtrTiapTabletParacetamol.setWrapStyleWord(true);
		txtrTiapTabletParacetamol.setLineWrap(true);
		txtrTiapTabletParacetamol.setEditable(false);
		kandungan_pct.add(txtrTiapTabletParacetamol);
		tabbedPane_pct.setForegroundAt(1, Color.BLACK);
		tabbedPane_pct.setBackgroundAt(1, Color.LIGHT_GRAY);
		
		JPanel Aturanpakai_pct = new JPanel();
		Aturanpakai_pct.setBorder(null);
		Aturanpakai_pct.setBackground(Color.WHITE);
		tabbedPane_pct.addTab("Aturan Pakai", null, Aturanpakai_pct, null);
		Aturanpakai_pct.setLayout(new GridLayout(0, 1, 0, 0));
		
		JTextArea txtrTablet = new JTextArea();
		txtrTablet.setText("1 tablet, 3-4 kali sehari");
		txtrTablet.setWrapStyleWord(true);
		txtrTablet.setLineWrap(true);
		txtrTablet.setEditable(false);
		Aturanpakai_pct.add(txtrTablet);
		tabbedPane_pct.setForegroundAt(2, Color.BLACK);
		tabbedPane_pct.setBackgroundAt(2, Color.LIGHT_GRAY);
		
		JPanel Bodrex = new JPanel();
		Bodrex.setBorder(new TitledBorder(null, "Bodrex Tab", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		layeredPane_obat_sakitkepala.add(Bodrex, "name_132335092459000");
		Bodrex.setLayout(new BorderLayout(0, 0));
		
		JTabbedPane tabbedPane_brx = new JTabbedPane(JTabbedPane.TOP);
		
		JPanel indikasi_brx = new JPanel();
		indikasi_brx.setBorder(null);
		indikasi_brx.setBackground(Color.WHITE);
		tabbedPane_brx.addTab("Indikasi", null, indikasi_brx, null);
		indikasi_brx.setLayout(new GridLayout(0, 1, 0, 0));
		
		JTextArea txtbrx = new JTextArea();
		txtbrx.setWrapStyleWord(true);
		txtbrx.setToolTipText("");
		txtbrx.setText("Bodrex Bermanfaat untuk mengatasi sakit kepala, gunakan bodrex sesuai keterangan yang tertera dalam kemasan, dapat dikonsumsi sebelum atau setelah makan dan sebaiknya dikonsumsi dengan minum air putih.");
		txtbrx.setLineWrap(true);
		txtbrx.setEditable(false);
		indikasi_brx.add(txtbrx);
		tabbedPane_brx.setForegroundAt(0, Color.BLACK);
		tabbedPane_brx.setBackgroundAt(0, Color.LIGHT_GRAY);
		
		JPanel kandungan_brx = new JPanel();
		kandungan_brx.setBorder(null);
		kandungan_brx.setBackground(Color.WHITE);
		tabbedPane_brx.addTab("Kandungan", null, kandungan_brx, null);
		kandungan_brx.setLayout(new GridLayout(0, 1, 0, 0));
		
		JTextArea txtkandunganbrx = new JTextArea();
		txtkandunganbrx.setWrapStyleWord(true);
		txtkandunganbrx.setText("Tiap Tablet Bodrex mengandung 500mg paracetamol dan 50mg kafein");
		txtkandunganbrx.setLineWrap(true);
		txtkandunganbrx.setEditable(false);
		kandungan_brx.add(txtkandunganbrx);
		tabbedPane_brx.setForegroundAt(1, Color.BLACK);
		tabbedPane_brx.setBackgroundAt(1, Color.LIGHT_GRAY);
		
		JPanel Aturanpakai_brx = new JPanel();
		Aturanpakai_brx.setBorder(null);
		Aturanpakai_brx.setBackground(Color.WHITE);
		tabbedPane_brx.addTab("Aturan Pakai", null, Aturanpakai_brx, null);
		Aturanpakai_brx.setLayout(new GridLayout(0, 1, 0, 0));
		
		JTextArea txtaturanbrx = new JTextArea();
		txtaturanbrx.setWrapStyleWord(true);
		txtaturanbrx.setText("1 tablet, 3-4 kali sehari");
		txtaturanbrx.setLineWrap(true);
		txtaturanbrx.setEditable(false);
		Aturanpakai_brx.add(txtaturanbrx);
		tabbedPane_brx.setForegroundAt(2, Color.BLACK);
		tabbedPane_brx.setBackgroundAt(2, Color.LIGHT_GRAY);
		Bodrex.add(tabbedPane_brx);
		
		JPanel Paramex = new JPanel();
		Paramex.setBorder(new TitledBorder(null, "Paramex Tab", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		layeredPane_obat_sakitkepala.add(Paramex, "name_132343266571399");
		Paramex.setLayout(new BorderLayout(0, 0));
		
		JTabbedPane tabbedPane_prx = new JTabbedPane(JTabbedPane.TOP);
		Paramex.add(tabbedPane_prx);
		
		JPanel indikasi_prx = new JPanel();
		indikasi_prx.setBorder(null);
		indikasi_prx.setBackground(Color.WHITE);
		tabbedPane_prx.addTab("Indikasi", null, indikasi_prx, null);
		tabbedPane_prx.setForegroundAt(0, Color.BLACK);
		tabbedPane_prx.setBackgroundAt(0, Color.LIGHT_GRAY);
		indikasi_prx.setLayout(new GridLayout(0, 1, 0, 0));
		
		JTextArea txtrParamexBermanfaatUntuk = new JTextArea();
		txtrParamexBermanfaatUntuk.setText("Paramex Bermanfaat untuk meredakan sakit kepala, sakit gigi, hingga nyeri sendi. paramex hanya meredakan rasa sakit tidak menyembuhkan penyebab munculnya rasa sakit.");
		txtrParamexBermanfaatUntuk.setWrapStyleWord(true);
		txtrParamexBermanfaatUntuk.setLineWrap(true);
		txtrParamexBermanfaatUntuk.setEditable(false);
		indikasi_prx.add(txtrParamexBermanfaatUntuk);
		
		JPanel kandungan_prx = new JPanel();
		kandungan_prx.setBorder(null);
		kandungan_prx.setBackground(Color.WHITE);
		tabbedPane_prx.addTab("Kandungan", null, kandungan_prx, null);
		kandungan_prx.setLayout(new GridLayout(0, 1, 0, 0));
		
		JTextArea txtrTiapTabletParamex = new JTextArea();
		txtrTiapTabletParamex.setText("Tiap Tablet paramex mengandung paracetamol, propyphenazone, kafein, dan dexchlorpheniramine maleate.");
		txtrTiapTabletParamex.setWrapStyleWord(true);
		txtrTiapTabletParamex.setEditable(false);
		txtrTiapTabletParamex.setLineWrap(true);
		kandungan_prx.add(txtrTiapTabletParamex);
		tabbedPane_prx.setForegroundAt(1, Color.BLACK);
		tabbedPane_prx.setBackgroundAt(1, Color.LIGHT_GRAY);
		
		JPanel Aturanpakai_prx = new JPanel();
		Aturanpakai_prx.setBorder(null);
		Aturanpakai_prx.setBackground(Color.WHITE);
		tabbedPane_prx.addTab("Aturan Pakai", null, Aturanpakai_prx, null);
		Aturanpakai_prx.setLayout(new GridLayout(0, 1, 0, 0));
		
		JTextArea txtrTablet_1 = new JTextArea();
		txtrTablet_1.setText("1 tablet, 2-3 kali sehari");
		txtrTablet_1.setWrapStyleWord(true);
		txtrTablet_1.setLineWrap(true);
		txtrTablet_1.setEditable(false);
		Aturanpakai_prx.add(txtrTablet_1);
		tabbedPane_prx.setForegroundAt(2, Color.BLACK);
		tabbedPane_prx.setBackgroundAt(2, Color.LIGHT_GRAY);
		
		JButton btn_paracetamol = new JButton("Paracetamol");
		btn_paracetamol.setForeground(Color.WHITE);
		btn_paracetamol.setBackground(new Color(64, 64, 64));
		btn_paracetamol.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				layeredPane_obat_sakitkepala.removeAll();
				layeredPane_obat_sakitkepala.add(Paracetamol);
				layeredPane_obat_sakitkepala.repaint();
				layeredPane_obat_sakitkepala.revalidate();
			}
		});
		btn_paracetamol.setFont(new Font("Segoe UI", Font.BOLD, 12));
		btn_paracetamol.setBounds(211, 22, 112, 23);
		Sakit_Kepala.add(btn_paracetamol);
		
		JButton btn_bodrex = new JButton("Bodrex");
		btn_bodrex.setForeground(Color.WHITE);
		btn_bodrex.setBackground(new Color(64, 64, 64));
		btn_bodrex.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				layeredPane_obat_sakitkepala.removeAll();
				layeredPane_obat_sakitkepala.add(Bodrex);
				layeredPane_obat_sakitkepala.repaint();
				layeredPane_obat_sakitkepala.revalidate();
			}
		});
		btn_bodrex.setFont(new Font("Segoe UI", Font.BOLD, 12));
		btn_bodrex.setBounds(322, 22, 112, 23);
		Sakit_Kepala.add(btn_bodrex);
		
		JButton btn_paramex = new JButton("Paramex");
		btn_paramex.setForeground(Color.WHITE);
		btn_paramex.setBackground(new Color(64, 64, 64));
		btn_paramex.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				layeredPane_obat_sakitkepala.removeAll();
				layeredPane_obat_sakitkepala.add(Paramex);
				layeredPane_obat_sakitkepala.repaint();
				layeredPane_obat_sakitkepala.revalidate();
			}
		});
		btn_paramex.setFont(new Font("Segoe UI", Font.BOLD, 12));
		btn_paramex.setBounds(431, 22, 112, 23);
		Sakit_Kepala.add(btn_paramex);
		
//		Tampilan Obat Mual
		Mual = new JPanel();
		Mual.setBackground(SystemColor.menu);
		Mual.setBorder(new TitledBorder(null, "Obat Mual", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		layeredPane.setLayer(Mual, 2);
		layeredPane.add(Mual, "name_88500065802800");
		Mual.setLayout(null);
		
		JTextArea penjelasan_mual = new JTextArea();
		penjelasan_mual.setWrapStyleWord(true);
		penjelasan_mual.setText("\"Mual adalah mekanisme pertahanan diri yang menyebabkan sensasi tidak nyaman di perut dan merasa ingin muntah, umumnya mual bukanlah kondisi yang serius dan penanganannya disesuaikan dengan penyebab terjadinya mual\"\r\n\r\n\r\n\r\n\r\nsumber : halodoc.com");
		penjelasan_mual.setTabSize(13);
		penjelasan_mual.setRows(1);
		penjelasan_mual.setLineWrap(true);
		penjelasan_mual.setForeground(Color.BLACK);
		penjelasan_mual.setFont(new Font("Monospaced", Font.PLAIN, 11));
		penjelasan_mual.setEditable(false);
		penjelasan_mual.setColumns(1);
		penjelasan_mual.setBackground(SystemColor.menu);
		penjelasan_mual.setBounds(10, 24, 191, 228);
		Mual.add(penjelasan_mual);
		
		JLayeredPane layeredPane_obat_mual = new JLayeredPane();
		layeredPane_obat_mual.setBounds(211, 52, 343, 200);
		Mual.add(layeredPane_obat_mual);
		layeredPane_obat_mual.setLayout(new CardLayout(0, 0));
		
		JPanel Home_obat_mual = new JPanel();
		layeredPane_obat_mual.add(Home_obat_mual, "name_138050563550100");
		
		JLabel lblmual = new JLabel("Berikut 3 obat yang umum digunakan oleh masyarakat");
		
		JLabel lblmual2 = new JLabel("Klik pada tombol diatas untuk melihat informasi obat");
		GroupLayout gl_Home_obat_mual = new GroupLayout(Home_obat_mual);
		gl_Home_obat_mual.setHorizontalGroup(
			gl_Home_obat_mual.createParallelGroup(Alignment.LEADING)
				.addGap(0, 343, Short.MAX_VALUE)
				.addGroup(gl_Home_obat_mual.createSequentialGroup()
					.addContainerGap()
					.addGroup(gl_Home_obat_mual.createParallelGroup(Alignment.LEADING)
						.addComponent(lblmual)
						.addComponent(lblmual2))
					.addContainerGap(74, Short.MAX_VALUE))
		);
		gl_Home_obat_mual.setVerticalGroup(
			gl_Home_obat_mual.createParallelGroup(Alignment.LEADING)
				.addGap(0, 200, Short.MAX_VALUE)
				.addGroup(gl_Home_obat_mual.createSequentialGroup()
					.addContainerGap()
					.addComponent(lblmual)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(lblmual2)
					.addContainerGap(155, Short.MAX_VALUE))
		);
		Home_obat_mual.setLayout(gl_Home_obat_mual);
		
		JPanel Domperidone = new JPanel();
		Domperidone.setBorder(new TitledBorder(new EtchedBorder(EtchedBorder.LOWERED, new Color(255, 255, 255), new Color(160, 160, 160)), "Domperidone Tab", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(0, 0, 0)));
		layeredPane_obat_mual.add(Domperidone, "name_138051142166000");
		Domperidone.setLayout(new BorderLayout(0, 0));
		
		JTabbedPane tabbedPane_dmp = new JTabbedPane(JTabbedPane.TOP);
		Domperidone.add(tabbedPane_dmp);
		
		JPanel indikasi_dmp = new JPanel();
		indikasi_dmp.setBorder(null);
		indikasi_dmp.setBackground(Color.WHITE);
		tabbedPane_dmp.addTab("Indikasi", null, indikasi_dmp, null);
		indikasi_dmp.setLayout(new GridLayout(0, 1, 0, 0));
		
		JTextArea txtrDomperidoneAdalahObat = new JTextArea();
		txtrDomperidoneAdalahObat.setText("Domperidone adalah obat untuk meredakan mual dan muntah. pengobatan dengan domperidone biasanya tidak lebih dari 1 minggu pastikan selalu mengikuti anjuran dokter.");
		txtrDomperidoneAdalahObat.setWrapStyleWord(true);
		txtrDomperidoneAdalahObat.setLineWrap(true);
		txtrDomperidoneAdalahObat.setEditable(false);
		indikasi_dmp.add(txtrDomperidoneAdalahObat);
		tabbedPane_dmp.setForegroundAt(0, Color.BLACK);
		tabbedPane_dmp.setBackgroundAt(0, Color.LIGHT_GRAY);
		
		JPanel kandungan_dmp = new JPanel();
		kandungan_dmp.setBorder(null);
		kandungan_dmp.setBackground(Color.WHITE);
		tabbedPane_dmp.addTab("Kandungan", null, kandungan_dmp, null);
		kandungan_dmp.setLayout(new GridLayout(0, 1, 0, 0));
		
		JTextArea txtrTiapTabletMengandung = new JTextArea();
		txtrTiapTabletMengandung.setText("Tiap tablet mengandung 10mg domperidone");
		txtrTiapTabletMengandung.setWrapStyleWord(true);
		txtrTiapTabletMengandung.setLineWrap(true);
		txtrTiapTabletMengandung.setEditable(false);
		kandungan_dmp.add(txtrTiapTabletMengandung);
		tabbedPane_dmp.setForegroundAt(1, Color.BLACK);
		tabbedPane_dmp.setBackgroundAt(1, Color.LIGHT_GRAY);
		
		JPanel Aturanpakai_dmp = new JPanel();
		Aturanpakai_dmp.setBorder(null);
		Aturanpakai_dmp.setBackground(Color.WHITE);
		tabbedPane_dmp.addTab("Aturan Pakai", null, Aturanpakai_dmp, null);
		Aturanpakai_dmp.setLayout(new GridLayout(0, 1, 0, 0));
		
		JTextArea txtrTabletmg = new JTextArea();
		txtrTabletmg.setText("1 tablet 10mg, 3 kali sehari");
		txtrTabletmg.setWrapStyleWord(true);
		txtrTabletmg.setEditable(false);
		Aturanpakai_dmp.add(txtrTabletmg);
		tabbedPane_dmp.setForegroundAt(2, Color.BLACK);
		tabbedPane_dmp.setBackgroundAt(2, Color.LIGHT_GRAY);
		
		JPanel Vometa = new JPanel();
		Vometa.setBorder(new TitledBorder(new EtchedBorder(EtchedBorder.LOWERED, new Color(255, 255, 255), new Color(160, 160, 160)), "Vometa Tab", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(0, 0, 0)));
		layeredPane_obat_mual.add(Vometa, "name_138051329288100");
		Vometa.setLayout(new BorderLayout(0, 0));
		
		JTabbedPane tabbedPane_vmt = new JTabbedPane(JTabbedPane.TOP);
		Vometa.add(tabbedPane_vmt);
		
		JPanel indikasi_vmt = new JPanel();
		indikasi_vmt.setBorder(null);
		indikasi_vmt.setBackground(Color.WHITE);
		tabbedPane_vmt.addTab("Indikasi", null, indikasi_vmt, null);
		indikasi_vmt.setLayout(new GridLayout(0, 1, 0, 0));
		
		JTextArea txtrVometaAdalahObat = new JTextArea();
		txtrVometaAdalahObat.setText("Vometa adalah obat untuk mengatasi mual akut dan muntah-muntah, terutama disebabkan terapi sitotoksik. dalam menggunakan obat ini harus dikonsultasikan terlebih dahulu dengan dokter.");
		txtrVometaAdalahObat.setWrapStyleWord(true);
		txtrVometaAdalahObat.setLineWrap(true);
		txtrVometaAdalahObat.setEditable(false);
		indikasi_vmt.add(txtrVometaAdalahObat);
		tabbedPane_vmt.setForegroundAt(0, Color.BLACK);
		tabbedPane_vmt.setBackgroundAt(0, Color.LIGHT_GRAY);
		
		JPanel kandungan_vmt = new JPanel();
		kandungan_vmt.setBorder(null);
		kandungan_vmt.setBackground(Color.WHITE);
		tabbedPane_vmt.addTab("Kandungan", null, kandungan_vmt, null);
		kandungan_vmt.setLayout(new GridLayout(0, 1, 0, 0));
		
		JTextArea txtrTiapTabletMengandung_1 = new JTextArea();
		txtrTiapTabletMengandung_1.setText("Tiap Tablet mengandung 10mg domperidone");
		txtrTiapTabletMengandung_1.setWrapStyleWord(true);
		txtrTiapTabletMengandung_1.setLineWrap(true);
		txtrTiapTabletMengandung_1.setEditable(false);
		kandungan_vmt.add(txtrTiapTabletMengandung_1);
		tabbedPane_vmt.setForegroundAt(1, Color.BLACK);
		tabbedPane_vmt.setBackgroundAt(1, Color.LIGHT_GRAY);
		
		JPanel Aturanpakai_vmt = new JPanel();
		Aturanpakai_vmt.setBorder(null);
		Aturanpakai_vmt.setBackground(Color.WHITE);
		tabbedPane_vmt.addTab("Aturan Pakai", null, Aturanpakai_vmt, null);
		Aturanpakai_vmt.setLayout(new GridLayout(0, 1, 0, 0));
		
		JTextArea txtrTablet_2 = new JTextArea();
		txtrTablet_2.setText("1 tablet, 3 kali sehari");
		txtrTablet_2.setWrapStyleWord(true);
		txtrTablet_2.setLineWrap(true);
		txtrTablet_2.setEditable(false);
		Aturanpakai_vmt.add(txtrTablet_2);
		tabbedPane_vmt.setForegroundAt(2, Color.BLACK);
		tabbedPane_vmt.setBackgroundAt(2, Color.LIGHT_GRAY);
		
		JPanel Ondansentron = new JPanel();
		Ondansentron.setBorder(new TitledBorder(new EtchedBorder(EtchedBorder.LOWERED, new Color(255, 255, 255), new Color(160, 160, 160)), "Ondansentron Tab", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(0, 0, 0)));
		layeredPane_obat_mual.add(Ondansentron, "name_138051561118799");
		Ondansentron.setLayout(null);
		
		JTabbedPane tabbedPane_ods = new JTabbedPane(JTabbedPane.TOP);
		tabbedPane_ods.setBounds(6, 16, 331, 176);
		Ondansentron.add(tabbedPane_ods);
		
		JPanel indikasi_ods = new JPanel();
		indikasi_ods.setBorder(null);
		indikasi_ods.setBackground(Color.WHITE);
		tabbedPane_ods.addTab("Indikasi", null, indikasi_ods, null);
		tabbedPane_ods.setForegroundAt(0, Color.BLACK);
		tabbedPane_ods.setBackgroundAt(0, Color.LIGHT_GRAY);
		indikasi_ods.setLayout(new GridLayout(0, 1, 0, 0));
		
		JTextArea txtrOndansentronAdalahObat = new JTextArea();
		txtrOndansentronAdalahObat.setText("Ondansentron adalah obat yang digunakan untuk mencegah serta mengobati mual dan muntah yang disebabkan efek samping dari kemoterapi, radioterapi, atau operasi");
		txtrOndansentronAdalahObat.setWrapStyleWord(true);
		txtrOndansentronAdalahObat.setLineWrap(true);
		txtrOndansentronAdalahObat.setEditable(false);
		indikasi_ods.add(txtrOndansentronAdalahObat);
		
		JPanel kandungan_ods = new JPanel();
		kandungan_ods.setBorder(null);
		kandungan_ods.setBackground(Color.WHITE);
		tabbedPane_ods.addTab("Kandungan", null, kandungan_ods, null);
		kandungan_ods.setLayout(new GridLayout(0, 1, 0, 0));
		
		JTextArea txtrKandunganUntukObat = new JTextArea();
		txtrKandunganUntukObat.setText("kandungan untuk obat minum mengandung 8mg ondansentron");
		txtrKandunganUntukObat.setWrapStyleWord(true);
		txtrKandunganUntukObat.setLineWrap(true);
		txtrKandunganUntukObat.setEditable(false);
		kandungan_ods.add(txtrKandunganUntukObat);
		tabbedPane_ods.setForegroundAt(1, Color.BLACK);
		tabbedPane_ods.setBackgroundAt(1, Color.LIGHT_GRAY);
		
		JPanel Aturanpakai_ods = new JPanel();
		Aturanpakai_ods.setBorder(null);
		Aturanpakai_ods.setBackground(Color.WHITE);
		tabbedPane_ods.addTab("Aturan Pakai", null, Aturanpakai_ods, null);
		Aturanpakai_ods.setLayout(new GridLayout(0, 1, 0, 0));
		
		JTextArea txtrDiminumJam = new JTextArea();
		txtrDiminumJam.setText("diminum 1-2 jam sebelum pelaksanaan terapi");
		txtrDiminumJam.setWrapStyleWord(true);
		txtrDiminumJam.setLineWrap(true);
		txtrDiminumJam.setEditable(false);
		Aturanpakai_ods.add(txtrDiminumJam);
		tabbedPane_ods.setForegroundAt(2, Color.BLACK);
		tabbedPane_ods.setBackgroundAt(2, Color.LIGHT_GRAY);
		
		JButton btn_dompe = new JButton("Domperidone");
		btn_dompe.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				layeredPane_obat_mual.removeAll();
				layeredPane_obat_mual.add(Domperidone);
				layeredPane_obat_mual.repaint();
				layeredPane_obat_mual.revalidate();
			}
		});
		btn_dompe.setForeground(Color.WHITE);
		btn_dompe.setFont(new Font("Segoe UI", Font.BOLD, 12));
		btn_dompe.setBackground(Color.DARK_GRAY);
		btn_dompe.setBounds(211, 22, 112, 23);
		Mual.add(btn_dompe);
		
		JButton btn_vometa = new JButton("Vometa");
		btn_vometa.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				layeredPane_obat_mual.removeAll();
				layeredPane_obat_mual.add(Vometa);
				layeredPane_obat_mual.repaint();
				layeredPane_obat_mual.revalidate();
			}
		});
		btn_vometa.setForeground(Color.WHITE);
		btn_vometa.setFont(new Font("Segoe UI", Font.BOLD, 12));
		btn_vometa.setBackground(Color.DARK_GRAY);
		btn_vometa.setBounds(321, 22, 112, 23);
		Mual.add(btn_vometa);
		
		JButton btn_Ondans = new JButton("Ondansentron");
		btn_Ondans.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				layeredPane_obat_mual.removeAll();
				layeredPane_obat_mual.add(Ondansentron);
				layeredPane_obat_mual.repaint();
				layeredPane_obat_mual.revalidate();
			}
		});
		btn_Ondans.setForeground(Color.WHITE);
		btn_Ondans.setFont(new Font("Segoe UI", Font.BOLD, 12));
		btn_Ondans.setBackground(Color.DARK_GRAY);
		btn_Ondans.setBounds(430, 22, 112, 23);
		Mual.add(btn_Ondans);
		
//		Tampilan Obat Batuk
		Batuk = new JPanel();
		Batuk.setBackground(SystemColor.menu);
		Batuk.setBorder(new TitledBorder(null, "Obat Batuk", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		layeredPane.setLayer(Batuk, 3);
		layeredPane.add(Batuk, "name_88503858601100");
		Batuk.setLayout(null);
		
		JTextArea penjelasan_batuk = new JTextArea();
		penjelasan_batuk.setWrapStyleWord(true);
		penjelasan_batuk.setText("\"Batuk adalah respon alami yang diberikan tubuh saat sistem pertahanan saluran napas terganggu, batuk umumnya dapat sembuh dalam 3 minggu dan jarang diindikasikan penyakit tertentu, namun apabila terjadi terus menerus segera hubungi dokter\"\r\n\r\n\r\n\r\nsumber : halodoc.com");
		penjelasan_batuk.setTabSize(13);
		penjelasan_batuk.setRows(1);
		penjelasan_batuk.setLineWrap(true);
		penjelasan_batuk.setForeground(Color.BLACK);
		penjelasan_batuk.setFont(new Font("Monospaced", Font.PLAIN, 11));
		penjelasan_batuk.setEditable(false);
		penjelasan_batuk.setColumns(1);
		penjelasan_batuk.setBackground(SystemColor.menu);
		penjelasan_batuk.setBounds(10, 24, 191, 228);
		Batuk.add(penjelasan_batuk);
		
		JLayeredPane layeredPane_obat_batuk = new JLayeredPane();
		layeredPane_obat_batuk.setBounds(211, 52, 343, 200);
		Batuk.add(layeredPane_obat_batuk);
		layeredPane_obat_batuk.setLayout(new CardLayout(0, 0));
		
		JPanel Home_obat_batuk = new JPanel();
		layeredPane_obat_batuk.add(Home_obat_batuk, "name_140448388728099");
		
		JLabel lblbatuk = new JLabel("Berikut 3 obat yang umum digunakan oleh masyarakat");
		
		JLabel lblbatuk2 = new JLabel("Klik pada tombol diatas untuk melihat informasi obat");
		GroupLayout gl_Home_obat_batuk = new GroupLayout(Home_obat_batuk);
		gl_Home_obat_batuk.setHorizontalGroup(
			gl_Home_obat_batuk.createParallelGroup(Alignment.LEADING)
				.addGap(0, 343, Short.MAX_VALUE)
				.addGroup(gl_Home_obat_batuk.createSequentialGroup()
					.addContainerGap()
					.addGroup(gl_Home_obat_batuk.createParallelGroup(Alignment.LEADING)
						.addComponent(lblbatuk)
						.addComponent(lblbatuk2))
					.addContainerGap(74, Short.MAX_VALUE))
		);
		gl_Home_obat_batuk.setVerticalGroup(
			gl_Home_obat_batuk.createParallelGroup(Alignment.LEADING)
				.addGap(0, 200, Short.MAX_VALUE)
				.addGroup(gl_Home_obat_batuk.createSequentialGroup()
					.addContainerGap()
					.addComponent(lblbatuk)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(lblbatuk2)
					.addContainerGap(155, Short.MAX_VALUE))
		);
		Home_obat_batuk.setLayout(gl_Home_obat_batuk);
		
		JPanel Obh = new JPanel();
		Obh.setBorder(new TitledBorder(new EtchedBorder(EtchedBorder.LOWERED, new Color(255, 255, 255), new Color(160, 160, 160)), "OBH Combi Syrup", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(0, 0, 0)));
		layeredPane_obat_batuk.add(Obh, "name_140448410318100");
		Obh.setLayout(new BorderLayout(0, 0));
		
		JTabbedPane tabbedPane_obh = new JTabbedPane(JTabbedPane.TOP);
		Obh.add(tabbedPane_obh);
		
		JPanel indikasi_obh = new JPanel();
		indikasi_obh.setBorder(null);
		indikasi_obh.setBackground(Color.WHITE);
		tabbedPane_obh.addTab("Indikasi", null, indikasi_obh, null);
		tabbedPane_obh.setForegroundAt(0, Color.BLACK);
		tabbedPane_obh.setBackgroundAt(0, Color.LIGHT_GRAY);
		indikasi_obh.setLayout(new GridLayout(0, 1, 0, 0));
		
		JTextArea txtrObhCombiAdalah = new JTextArea();
		txtrObhCombiAdalah.setText("OBH Combi adalah obat untuk meredakan batuk yang disertai gejala-gejala flu seperti demam, sakit kepala, dsb");
		txtrObhCombiAdalah.setWrapStyleWord(true);
		txtrObhCombiAdalah.setLineWrap(true);
		txtrObhCombiAdalah.setEditable(false);
		indikasi_obh.add(txtrObhCombiAdalah);
		
		JPanel kandungan_obh = new JPanel();
		kandungan_obh.setBorder(null);
		kandungan_obh.setBackground(Color.WHITE);
		tabbedPane_obh.addTab("Kandungan", null, kandungan_obh, null);
		kandungan_obh.setLayout(new GridLayout(0, 1, 0, 0));
		
		JTextArea txtrTiapmlSirup = new JTextArea();
		txtrTiapmlSirup.setText("tiap 5ml sirup mengandung Succus Liquirtae Extract 167mg, Paracetamol 150mg, Ammonium Chloride 50mg, Ephedrine HCl 2.5mg, dan Chlorampeniramini maleat 1mg");
		txtrTiapmlSirup.setWrapStyleWord(true);
		txtrTiapmlSirup.setLineWrap(true);
		txtrTiapmlSirup.setEditable(false);
		kandungan_obh.add(txtrTiapmlSirup);
		tabbedPane_obh.setForegroundAt(1, Color.BLACK);
		tabbedPane_obh.setBackgroundAt(1, Color.LIGHT_GRAY);
		
		JPanel Aturanpakai_obh = new JPanel();
		Aturanpakai_obh.setBorder(null);
		Aturanpakai_obh.setBackground(Color.WHITE);
		tabbedPane_obh.addTab("Aturan Pakai", null, Aturanpakai_obh, null);
		Aturanpakai_obh.setLayout(new GridLayout(0, 1, 0, 0));
		
		JTextArea txtrKaliSehari = new JTextArea();
		txtrKaliSehari.setText("3 kali sehari, 3 sendok takar");
		txtrKaliSehari.setWrapStyleWord(true);
		txtrKaliSehari.setLineWrap(true);
		txtrKaliSehari.setEditable(false);
		Aturanpakai_obh.add(txtrKaliSehari);
		tabbedPane_obh.setForegroundAt(2, Color.BLACK);
		tabbedPane_obh.setBackgroundAt(2, Color.LIGHT_GRAY);
		
		JPanel Konidin = new JPanel();
		Konidin.setBorder(new TitledBorder(new EtchedBorder(EtchedBorder.LOWERED, new Color(255, 255, 255), new Color(160, 160, 160)), "Konidin Tab", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(0, 0, 0)));
		layeredPane_obat_batuk.add(Konidin, "name_140448432653400");
		Konidin.setLayout(null);
		
		JTabbedPane tabbedPane_kdn = new JTabbedPane(JTabbedPane.TOP);
		tabbedPane_kdn.setBounds(6, 16, 331, 173);
		Konidin.add(tabbedPane_kdn);
		
		JPanel indikasi_kdn = new JPanel();
		indikasi_kdn.setBorder(null);
		indikasi_kdn.setBackground(Color.WHITE);
		tabbedPane_kdn.addTab("Indikasi", null, indikasi_kdn, null);
		tabbedPane_kdn.setForegroundAt(0, Color.BLACK);
		tabbedPane_kdn.setBackgroundAt(0, Color.LIGHT_GRAY);
		indikasi_kdn.setLayout(new GridLayout(0, 1, 0, 0));
		
		JTextArea txtrKonidinAdalahObat = new JTextArea();
		txtrKonidinAdalahObat.setText("Konidin adalah obat yang digunakan untuk meredakan batuk yang terkait influenza, masuk angin, bronkitis, radang saluran pernapasan, umumnya mengatasi batuk alergi, flu, dll");
		txtrKonidinAdalahObat.setWrapStyleWord(true);
		txtrKonidinAdalahObat.setLineWrap(true);
		txtrKonidinAdalahObat.setEditable(false);
		indikasi_kdn.add(txtrKonidinAdalahObat);
		
		JPanel kandungan_kdn = new JPanel();
		kandungan_kdn.setBorder(null);
		kandungan_kdn.setBackground(Color.WHITE);
		tabbedPane_kdn.addTab("Kandungan", null, kandungan_kdn, null);
		kandungan_kdn.setLayout(new GridLayout(0, 1, 0, 0));
		
		JTextArea txtrTiapTabletMengandung_2 = new JTextArea();
		txtrTiapTabletMengandung_2.setText("Tiap tablet mengandung guaifenesin 100mg, dextromethorphan HBr 5mg, Chlorpeniramine maleat 2mg");
		txtrTiapTabletMengandung_2.setWrapStyleWord(true);
		txtrTiapTabletMengandung_2.setLineWrap(true);
		txtrTiapTabletMengandung_2.setEditable(false);
		kandungan_kdn.add(txtrTiapTabletMengandung_2);
		tabbedPane_kdn.setForegroundAt(1, Color.BLACK);
		tabbedPane_kdn.setBackgroundAt(1, Color.LIGHT_GRAY);
		
		JPanel Aturanpakai_kdn = new JPanel();
		Aturanpakai_kdn.setBorder(null);
		Aturanpakai_kdn.setBackground(Color.WHITE);
		tabbedPane_kdn.addTab("Aturan Pakai", null, Aturanpakai_kdn, null);
		Aturanpakai_kdn.setLayout(new GridLayout(0, 1, 0, 0));
		
		JTextArea txtrXSehari = new JTextArea();
		txtrXSehari.setText("3 x sehari 1-2 tablet");
		txtrXSehari.setWrapStyleWord(true);
		txtrXSehari.setLineWrap(true);
		txtrXSehari.setEditable(false);
		Aturanpakai_kdn.add(txtrXSehari);
		tabbedPane_kdn.setForegroundAt(2, Color.BLACK);
		tabbedPane_kdn.setBackgroundAt(2, Color.LIGHT_GRAY);
		
		JPanel Ambroxol = new JPanel();
		Ambroxol.setBorder(new TitledBorder(new EtchedBorder(EtchedBorder.LOWERED, new Color(255, 255, 255), new Color(160, 160, 160)), "Ambroxol Tab", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(0, 0, 0)));
		layeredPane_obat_batuk.add(Ambroxol, "name_140448454718200");
		Ambroxol.setLayout(new CardLayout(0, 0));
		
		JTabbedPane tabbedPane_abx = new JTabbedPane(JTabbedPane.TOP);
		Ambroxol.add(tabbedPane_abx, "name_141530479879200");
		
		JPanel indikasi_abx = new JPanel();
		indikasi_abx.setBorder(null);
		indikasi_abx.setBackground(Color.WHITE);
		tabbedPane_abx.addTab("Indikasi", null, indikasi_abx, null);
		tabbedPane_abx.setForegroundAt(0, Color.BLACK);
		tabbedPane_abx.setBackgroundAt(0, Color.LIGHT_GRAY);
		indikasi_abx.setLayout(new GridLayout(0, 1, 0, 0));
		
		JTextArea txtrAmbroxolAdalahObat = new JTextArea();
		txtrAmbroxolAdalahObat.setText("Ambroxol adalah obat batuk berdahak yang berfungsi sebagai mukolitik yang dapat mengencerkan dahak akibat gannguan saluran nafas akut, bronkitis asmat, dll");
		txtrAmbroxolAdalahObat.setWrapStyleWord(true);
		txtrAmbroxolAdalahObat.setLineWrap(true);
		txtrAmbroxolAdalahObat.setEditable(false);
		indikasi_abx.add(txtrAmbroxolAdalahObat);
		
		JPanel kandungan_abx = new JPanel();
		kandungan_abx.setBorder(null);
		kandungan_abx.setBackground(Color.WHITE);
		tabbedPane_abx.addTab("Kandungan", null, kandungan_abx, null);
		kandungan_abx.setLayout(new GridLayout(0, 1, 0, 0));
		
		JTextArea txtrTiapTabletMengandung_3 = new JTextArea();
		txtrTiapTabletMengandung_3.setText("Tiap Tablet mengandung Ambroxol 30mg");
		txtrTiapTabletMengandung_3.setWrapStyleWord(true);
		txtrTiapTabletMengandung_3.setLineWrap(true);
		txtrTiapTabletMengandung_3.setEditable(false);
		kandungan_abx.add(txtrTiapTabletMengandung_3);
		tabbedPane_abx.setForegroundAt(1, Color.BLACK);
		tabbedPane_abx.setBackgroundAt(1, Color.LIGHT_GRAY);
		
		JPanel Aturanpakai_abx = new JPanel();
		Aturanpakai_abx.setBorder(null);
		Aturanpakai_abx.setBackground(Color.WHITE);
		tabbedPane_abx.addTab("Aturan Pakai", null, Aturanpakai_abx, null);
		Aturanpakai_abx.setLayout(new GridLayout(0, 1, 0, 0));
		
		JTextArea txtrDiminumTablet = new JTextArea();
		txtrDiminumTablet.setText("Diminum 1 tablet 2-3 x sehari");
		txtrDiminumTablet.setWrapStyleWord(true);
		txtrDiminumTablet.setLineWrap(true);
		txtrDiminumTablet.setEditable(false);
		Aturanpakai_abx.add(txtrDiminumTablet);
		tabbedPane_abx.setForegroundAt(2, Color.BLACK);
		tabbedPane_abx.setBackgroundAt(2, Color.LIGHT_GRAY);
		
		JButton btn_Obh = new JButton("OBH");
		btn_Obh.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				layeredPane_obat_batuk.removeAll();
				layeredPane_obat_batuk.add(Obh);
				layeredPane_obat_batuk.repaint();
				layeredPane_obat_batuk.revalidate();
			}
		});
		btn_Obh.setForeground(Color.WHITE);
		btn_Obh.setFont(new Font("Segoe UI", Font.BOLD, 12));
		btn_Obh.setBackground(Color.DARK_GRAY);
		btn_Obh.setBounds(211, 22, 112, 23);
		Batuk.add(btn_Obh);
		
		JButton btn_Konidin = new JButton("Konidin");
		btn_Konidin.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				layeredPane_obat_batuk.removeAll();
				layeredPane_obat_batuk.add(Konidin);
				layeredPane_obat_batuk.repaint();
				layeredPane_obat_batuk.revalidate();
			}
		});
		btn_Konidin.setForeground(Color.WHITE);
		btn_Konidin.setFont(new Font("Segoe UI", Font.BOLD, 12));
		btn_Konidin.setBackground(Color.DARK_GRAY);
		btn_Konidin.setBounds(321, 22, 112, 23);
		Batuk.add(btn_Konidin);
		
		JButton btn_Ambroxol = new JButton("Ambroxol");
		btn_Ambroxol.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				layeredPane_obat_batuk.removeAll();
				layeredPane_obat_batuk.add(Ambroxol);
				layeredPane_obat_batuk.repaint();
				layeredPane_obat_batuk.revalidate();
			}
		});
		btn_Ambroxol.setForeground(Color.WHITE);
		btn_Ambroxol.setFont(new Font("Segoe UI", Font.BOLD, 12));
		btn_Ambroxol.setBackground(Color.DARK_GRAY);
		btn_Ambroxol.setBounds(430, 22, 112, 23);
		Batuk.add(btn_Ambroxol);
		
//		Tampilan Obat Diare
		Diare = new JPanel();
		Diare.setBackground(SystemColor.menu);
		Diare.setBorder(new TitledBorder(null, "Obat Diare", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(0, 0, 0)));
		layeredPane.setLayer(Diare, 4);
		layeredPane.add(Diare, "name_88506583912700");
		Diare.setLayout(null);
		
		JTextArea penjelasan_diare = new JTextArea();
		penjelasan_diare.setWrapStyleWord(true);
		penjelasan_diare.setText("\"Diare adalah kondisi ketika BAB lebih sering dari biasanya, feses dari pengidap diare lebih encer, pengobatan diare disesuaikan dengan penyebabnya, apabila terjadi terus menerus segera hubungi dokter\"\r\n\r\n\r\n\r\n\r\nsumber : halodoc.com");
		penjelasan_diare.setTabSize(13);
		penjelasan_diare.setRows(1);
		penjelasan_diare.setLineWrap(true);
		penjelasan_diare.setForeground(Color.BLACK);
		penjelasan_diare.setFont(new Font("Monospaced", Font.PLAIN, 11));
		penjelasan_diare.setEditable(false);
		penjelasan_diare.setColumns(1);
		penjelasan_diare.setBackground(SystemColor.menu);
		penjelasan_diare.setBounds(10, 24, 191, 228);
		Diare.add(penjelasan_diare);
		
		JLayeredPane layeredPane_obat_diare = new JLayeredPane();
		layeredPane_obat_diare.setBounds(211, 52, 343, 200);
		Diare.add(layeredPane_obat_diare);
		layeredPane_obat_diare.setLayout(new CardLayout(0, 0));
		
		JPanel Home_obat_diare = new JPanel();
		layeredPane_obat_diare.add(Home_obat_diare, "name_140618234599500");
		
		JLabel lbldiare = new JLabel("Berikut 3 obat yang umum digunakan oleh masyarakat");
		
		JLabel lbldiare2 = new JLabel("Klik pada tombol diatas untuk melihat informasi obat");
		GroupLayout gl_Home_obat_diare = new GroupLayout(Home_obat_diare);
		gl_Home_obat_diare.setHorizontalGroup(
			gl_Home_obat_diare.createParallelGroup(Alignment.LEADING)
				.addGap(0, 343, Short.MAX_VALUE)
				.addGroup(gl_Home_obat_diare.createSequentialGroup()
					.addContainerGap()
					.addGroup(gl_Home_obat_diare.createParallelGroup(Alignment.LEADING)
						.addComponent(lbldiare)
						.addComponent(lbldiare2))
					.addContainerGap(74, Short.MAX_VALUE))
		);
		gl_Home_obat_diare.setVerticalGroup(
			gl_Home_obat_diare.createParallelGroup(Alignment.LEADING)
				.addGap(0, 200, Short.MAX_VALUE)
				.addGroup(gl_Home_obat_diare.createSequentialGroup()
					.addContainerGap()
					.addComponent(lbldiare)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(lbldiare2)
					.addContainerGap(155, Short.MAX_VALUE))
		);
		Home_obat_diare.setLayout(gl_Home_obat_diare);
		
		JPanel Diapet = new JPanel();
		Diapet.setBorder(new TitledBorder(new EtchedBorder(EtchedBorder.LOWERED, new Color(255, 255, 255), new Color(160, 160, 160)), "Diapet NR Tab", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(0, 0, 0)));
		layeredPane_obat_diare.add(Diapet, "name_140618259318000");
		Diapet.setLayout(null);
		
		JTabbedPane tabbedPane_dpt = new JTabbedPane(JTabbedPane.TOP);
		tabbedPane_dpt.setBounds(6, 16, 331, 173);
		Diapet.add(tabbedPane_dpt);
		
		JPanel indikasi_dpt = new JPanel();
		indikasi_dpt.setBorder(null);
		indikasi_dpt.setBackground(Color.WHITE);
		tabbedPane_dpt.addTab("Indikasi", null, indikasi_dpt, null);
		tabbedPane_dpt.setForegroundAt(0, Color.BLACK);
		tabbedPane_dpt.setBackgroundAt(0, Color.LIGHT_GRAY);
		indikasi_dpt.setLayout(new GridLayout(0, 1, 0, 0));
		
		JTextArea txtrDiapetNrnyerapRacun = new JTextArea();
		txtrDiapetNrnyerapRacun.setText("Diapet NR(Nyerap Racun) adalah kombinasi diapet kapsul dengan karbon aktif dan attapulgite, dapat mengobati mencret dan memadatkan kembali feces yang cair");
		txtrDiapetNrnyerapRacun.setWrapStyleWord(true);
		txtrDiapetNrnyerapRacun.setLineWrap(true);
		txtrDiapetNrnyerapRacun.setEditable(false);
		indikasi_dpt.add(txtrDiapetNrnyerapRacun);
		
		JPanel kandungan_dpt = new JPanel();
		kandungan_dpt.setBorder(null);
		kandungan_dpt.setBackground(Color.WHITE);
		tabbedPane_dpt.addTab("Kandungan", null, kandungan_dpt, null);
		kandungan_dpt.setLayout(new GridLayout(0, 1, 0, 0));
		
		JTextArea txtrTiapTabletMengandung_4 = new JTextArea();
		txtrTiapTabletMengandung_4.setText("Tiap tablet mengandung ekstrak psidii folium 23.5% , ekstrak curcumae domesticae rhizoma 12.5% , ekstrak coix lacrima jobi semen 18% , ekstrak phellodendri radix 23% , ekstrak coptidis rhizoma 23%");
		txtrTiapTabletMengandung_4.setWrapStyleWord(true);
		txtrTiapTabletMengandung_4.setLineWrap(true);
		txtrTiapTabletMengandung_4.setEditable(false);
		kandungan_dpt.add(txtrTiapTabletMengandung_4);
		tabbedPane_dpt.setForegroundAt(1, Color.BLACK);
		tabbedPane_dpt.setBackgroundAt(1, Color.LIGHT_GRAY);
		
		JPanel Aturanpakai_dpt = new JPanel();
		Aturanpakai_dpt.setBorder(null);
		Aturanpakai_dpt.setBackground(Color.WHITE);
		tabbedPane_dpt.addTab("Aturan Pakai", null, Aturanpakai_dpt, null);
		Aturanpakai_dpt.setLayout(new GridLayout(0, 1, 0, 0));
		
		JTextArea txtrDiminumX = new JTextArea();
		txtrDiminumX.setText("Diminum 2-3 x sehari 2 kapsul setelah makan");
		txtrDiminumX.setWrapStyleWord(true);
		txtrDiminumX.setLineWrap(true);
		txtrDiminumX.setEditable(false);
		Aturanpakai_dpt.add(txtrDiminumX);
		tabbedPane_dpt.setForegroundAt(2, Color.BLACK);
		tabbedPane_dpt.setBackgroundAt(2, Color.LIGHT_GRAY);
		
		JPanel Diatabs = new JPanel();
		Diatabs.setBorder(new TitledBorder(new EtchedBorder(EtchedBorder.LOWERED, new Color(255, 255, 255), new Color(160, 160, 160)), "New Diatabs Tab", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(0, 0, 0)));
		layeredPane_obat_diare.add(Diatabs, "name_140618286326300");
		Diatabs.setLayout(null);
		
		JTabbedPane tabbedPane_dtb = new JTabbedPane(JTabbedPane.TOP);
		tabbedPane_dtb.setBounds(6, 16, 331, 178);
		Diatabs.add(tabbedPane_dtb);
		
		JPanel indikasi_dtb = new JPanel();
		indikasi_dtb.setBorder(null);
		indikasi_dtb.setBackground(Color.WHITE);
		tabbedPane_dtb.addTab("Indikasi", null, indikasi_dtb, null);
		tabbedPane_dtb.setForegroundAt(0, Color.BLACK);
		tabbedPane_dtb.setBackgroundAt(0, Color.LIGHT_GRAY);
		indikasi_dtb.setLayout(new GridLayout(0, 1, 0, 0));
		
		JTextArea txtrNewDiatabsAdalah = new JTextArea();
		txtrNewDiatabsAdalah.setText("New Diatabs adalah obat antidiare untuk pengobatan simtomatik pada diare non-spesifik yaitu diare yang tidak diketahui penyebabnya dengan jelas");
		txtrNewDiatabsAdalah.setWrapStyleWord(true);
		txtrNewDiatabsAdalah.setLineWrap(true);
		txtrNewDiatabsAdalah.setEditable(false);
		indikasi_dtb.add(txtrNewDiatabsAdalah);
		
		JPanel kandungan_dtb = new JPanel();
		kandungan_dtb.setBorder(null);
		kandungan_dtb.setBackground(Color.WHITE);
		tabbedPane_dtb.addTab("Kandungan", null, kandungan_dtb, null);
		kandungan_dtb.setLayout(new GridLayout(0, 1, 0, 0));
		
		JTextArea txtrTiapTabletMengandung_5 = new JTextArea();
		txtrTiapTabletMengandung_5.setText("Tiap tablet mengandung Activated attapulgite 600mg");
		txtrTiapTabletMengandung_5.setWrapStyleWord(true);
		txtrTiapTabletMengandung_5.setLineWrap(true);
		txtrTiapTabletMengandung_5.setEditable(false);
		kandungan_dtb.add(txtrTiapTabletMengandung_5);
		tabbedPane_dtb.setForegroundAt(1, Color.BLACK);
		tabbedPane_dtb.setBackgroundAt(1, Color.LIGHT_GRAY);
		
		JPanel Aturanpakai_dtb = new JPanel();
		Aturanpakai_dtb.setBorder(null);
		Aturanpakai_dtb.setBackground(Color.WHITE);
		tabbedPane_dtb.addTab("Aturan Pakai", null, Aturanpakai_dtb, null);
		Aturanpakai_dtb.setLayout(new GridLayout(0, 1, 0, 0));
		
		JTextArea txtrDiminumTablet_1 = new JTextArea();
		txtrDiminumTablet_1.setText("Diminum 2 tablet setiap setelah BAB, maksimum penggunaan 12 tablet dalam waktu 24 jam");
		txtrDiminumTablet_1.setWrapStyleWord(true);
		txtrDiminumTablet_1.setLineWrap(true);
		txtrDiminumTablet_1.setEditable(false);
		Aturanpakai_dtb.add(txtrDiminumTablet_1);
		tabbedPane_dtb.setForegroundAt(2, Color.BLACK);
		tabbedPane_dtb.setBackgroundAt(2, Color.LIGHT_GRAY);
		
		JPanel Oralit = new JPanel();
		Oralit.setBorder(new TitledBorder(new EtchedBorder(EtchedBorder.LOWERED, new Color(255, 255, 255), new Color(160, 160, 160)), "Oralit sachet", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(0, 0, 0)));
		layeredPane_obat_diare.add(Oralit, "name_140618310074600");
		Oralit.setLayout(null);
		
		JTabbedPane tabbedPane_ort = new JTabbedPane(JTabbedPane.TOP);
		tabbedPane_ort.setBounds(6, 16, 331, 178);
		Oralit.add(tabbedPane_ort);
		
		JPanel indikasi_ort = new JPanel();
		indikasi_ort.setBorder(null);
		indikasi_ort.setBackground(Color.WHITE);
		tabbedPane_ort.addTab("Indikasi", null, indikasi_ort, null);
		tabbedPane_ort.setForegroundAt(0, Color.BLACK);
		tabbedPane_ort.setBackgroundAt(0, Color.LIGHT_GRAY);
		indikasi_ort.setLayout(new GridLayout(0, 1, 0, 0));
		
		JTextArea txtrOralitAdalahObat = new JTextArea();
		txtrOralitAdalahObat.setText("Oralit adalah obat dalam bentuk serbuk yang digunakan untuk mengobati dehidrasi akibat diare dan muntah");
		txtrOralitAdalahObat.setWrapStyleWord(true);
		txtrOralitAdalahObat.setLineWrap(true);
		txtrOralitAdalahObat.setEditable(false);
		indikasi_ort.add(txtrOralitAdalahObat);
		
		JPanel kandungan_ort = new JPanel();
		kandungan_ort.setBorder(null);
		kandungan_ort.setBackground(Color.WHITE);
		tabbedPane_ort.addTab("Kandungan", null, kandungan_ort, null);
		kandungan_ort.setLayout(new GridLayout(0, 1, 0, 0));
		
		JTextArea txtrTiapSachetmg = new JTextArea();
		txtrTiapSachetmg.setText("Tiap sachet 200mg mengandung natrium klorida 0.52g, kalium klorida 0.3g, trisodium sitrat dihidrat 0.58g, glukosa anhidrat 2.7g");
		txtrTiapSachetmg.setWrapStyleWord(true);
		txtrTiapSachetmg.setLineWrap(true);
		txtrTiapSachetmg.setEditable(false);
		kandungan_ort.add(txtrTiapSachetmg);
		tabbedPane_ort.setForegroundAt(1, Color.BLACK);
		tabbedPane_ort.setBackgroundAt(1, Color.LIGHT_GRAY);
		
		JPanel Aturanpakai_ort = new JPanel();
		Aturanpakai_ort.setBorder(null);
		Aturanpakai_ort.setBackground(Color.WHITE);
		tabbedPane_ort.addTab("Aturan Pakai", null, Aturanpakai_ort, null);
		Aturanpakai_ort.setLayout(new GridLayout(0, 1, 0, 0));
		
		JTextArea txtrLarutkanDenganAir = new JTextArea();
		txtrLarutkanDenganAir.setText("Larutkan dengan air matang, berikan oralit sedikit demi sedikit dengan sendok, 3 jam pertama 12 gelas, selanjutnya 2 gelas tiap kali mencret");
		txtrLarutkanDenganAir.setWrapStyleWord(true);
		txtrLarutkanDenganAir.setLineWrap(true);
		txtrLarutkanDenganAir.setEditable(false);
		Aturanpakai_ort.add(txtrLarutkanDenganAir);
		tabbedPane_ort.setForegroundAt(2, Color.BLACK);
		tabbedPane_ort.setBackgroundAt(2, Color.LIGHT_GRAY);
		
		JButton btn_Diapet = new JButton("Diapet NR");
		btn_Diapet.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				layeredPane_obat_diare.removeAll();
				layeredPane_obat_diare.add(Diapet);
				layeredPane_obat_diare.repaint();
				layeredPane_obat_diare.revalidate();
			}
		});
		btn_Diapet.setForeground(Color.WHITE);
		btn_Diapet.setFont(new Font("Segoe UI", Font.BOLD, 12));
		btn_Diapet.setBackground(Color.DARK_GRAY);
		btn_Diapet.setBounds(211, 22, 112, 23);
		Diare.add(btn_Diapet);
		
		JButton btn_diatabs = new JButton("Diatabs");
		btn_diatabs.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				layeredPane_obat_diare.removeAll();
				layeredPane_obat_diare.add(Diatabs);
				layeredPane_obat_diare.repaint();
				layeredPane_obat_diare.revalidate();
			}
		});
		btn_diatabs.setForeground(Color.WHITE);
		btn_diatabs.setFont(new Font("Segoe UI", Font.BOLD, 12));
		btn_diatabs.setBackground(Color.DARK_GRAY);
		btn_diatabs.setBounds(321, 22, 112, 23);
		Diare.add(btn_diatabs);
		
		JButton btn_Oralit = new JButton("Oralit");
		btn_Oralit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				layeredPane_obat_diare.removeAll();
				layeredPane_obat_diare.add(Oralit);
				layeredPane_obat_diare.repaint();
				layeredPane_obat_diare.revalidate();
			}
		});
		btn_Oralit.setForeground(Color.WHITE);
		btn_Oralit.setFont(new Font("Segoe UI", Font.BOLD, 12));
		btn_Oralit.setBackground(Color.DARK_GRAY);
		btn_Oralit.setBounds(431, 22, 112, 23);
		Diare.add(btn_Oralit);
		
//		Tampilan Obat Masuk Angin
		Masuk_angin = new JPanel();
		Masuk_angin.setBackground(SystemColor.menu);
		Masuk_angin.setBorder(new TitledBorder(null, "Obat Masuk Angin", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		layeredPane.setLayer(Masuk_angin, 5);
		layeredPane.add(Masuk_angin, "name_88510522107900");
		Masuk_angin.setLayout(null);
		
		JTextArea penjelasan_masukangin = new JTextArea();
		penjelasan_masukangin.setWrapStyleWord(true);
		penjelasan_masukangin.setText("\"Masuk Angin adalah kondisi tubuh yang sedang drop disebabkan oleh berbagai macam hal, contohnya hujan-hujanan, berada diruangan AC terlalu lama, dsb. pengobatan sederhana dapat dilakukan untuk menyembuhkannya seperti meminum jamu\"\r\n\r\n\r\nsumber halodoc.com");
		penjelasan_masukangin.setTabSize(13);
		penjelasan_masukangin.setRows(1);
		penjelasan_masukangin.setLineWrap(true);
		penjelasan_masukangin.setForeground(Color.BLACK);
		penjelasan_masukangin.setFont(new Font("Monospaced", Font.PLAIN, 11));
		penjelasan_masukangin.setEditable(false);
		penjelasan_masukangin.setColumns(1);
		penjelasan_masukangin.setBackground(SystemColor.menu);
		penjelasan_masukangin.setBounds(10, 24, 191, 228);
		Masuk_angin.add(penjelasan_masukangin);
		
		JLayeredPane layeredPane_obat_masukangin = new JLayeredPane();
		layeredPane_obat_masukangin.setBounds(211, 52, 343, 200);
		Masuk_angin.add(layeredPane_obat_masukangin);
		layeredPane_obat_masukangin.setLayout(new CardLayout(0, 0));
		
		JPanel Home_obat_masukangin = new JPanel();
		layeredPane_obat_masukangin.add(Home_obat_masukangin, "name_140817531611500");
		
		JLabel lblmasukangin = new JLabel("Berikut 3 obat yang umum digunakan oleh masyarakat");
		
		JLabel lblmasukangin2 = new JLabel("Klik pada tombol diatas untuk melihat informasi obat");
		GroupLayout gl_Home_obat_masukangin = new GroupLayout(Home_obat_masukangin);
		gl_Home_obat_masukangin.setHorizontalGroup(
			gl_Home_obat_masukangin.createParallelGroup(Alignment.LEADING)
				.addGap(0, 343, Short.MAX_VALUE)
				.addGroup(gl_Home_obat_masukangin.createSequentialGroup()
					.addContainerGap()
					.addGroup(gl_Home_obat_masukangin.createParallelGroup(Alignment.LEADING)
						.addComponent(lblmasukangin)
						.addComponent(lblmasukangin2))
					.addContainerGap(74, Short.MAX_VALUE))
		);
		gl_Home_obat_masukangin.setVerticalGroup(
			gl_Home_obat_masukangin.createParallelGroup(Alignment.LEADING)
				.addGap(0, 200, Short.MAX_VALUE)
				.addGroup(gl_Home_obat_masukangin.createSequentialGroup()
					.addContainerGap()
					.addComponent(lblmasukangin)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(lblmasukangin2)
					.addContainerGap(155, Short.MAX_VALUE))
		);
		Home_obat_masukangin.setLayout(gl_Home_obat_masukangin);
		
		JPanel Antangin = new JPanel();
		Antangin.setBorder(new TitledBorder(new EtchedBorder(EtchedBorder.LOWERED, new Color(255, 255, 255), new Color(160, 160, 160)), "Antangin Tab", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(0, 0, 0)));
		layeredPane_obat_masukangin.add(Antangin, "name_140817555200800");
		Antangin.setLayout(null);
		
		JTabbedPane tabbedPane_dpt_1 = new JTabbedPane(JTabbedPane.TOP);
		tabbedPane_dpt_1.setBounds(6, 16, 331, 178);
		Antangin.add(tabbedPane_dpt_1);
		
		JPanel indikasi_atn = new JPanel();
		indikasi_atn.setBorder(null);
		indikasi_atn.setBackground(Color.WHITE);
		tabbedPane_dpt_1.addTab("Indikasi", null, indikasi_atn, null);
		tabbedPane_dpt_1.setForegroundAt(0, Color.BLACK);
		tabbedPane_dpt_1.setBackgroundAt(0, Color.LIGHT_GRAY);
		indikasi_atn.setLayout(new GridLayout(0, 1, 0, 0));
		
		JTextArea txtrAntanginJrgAdalah = new JTextArea();
		txtrAntanginJrgAdalah.setText("Antangin JRG adalah obat herbal untuk mengatasi masuk angin, mual, mabuk perjalanan, dll");
		txtrAntanginJrgAdalah.setWrapStyleWord(true);
		txtrAntanginJrgAdalah.setLineWrap(true);
		txtrAntanginJrgAdalah.setEditable(false);
		indikasi_atn.add(txtrAntanginJrgAdalah);
		
		JPanel kandungan_atn = new JPanel();
		kandungan_atn.setBorder(null);
		kandungan_atn.setBackground(Color.WHITE);
		tabbedPane_dpt_1.addTab("Kandungan", null, kandungan_atn, null);
		kandungan_atn.setLayout(new GridLayout(0, 1, 0, 0));
		
		JTextArea txtrTiapTabletMengandung_6 = new JTextArea();
		txtrTiapTabletMengandung_6.setText("Tiap tablet mengandung zingiberis rhizoma 0.743, royal jelly 0.65, panax ginseng extract 0.13, blumeae folia 0.2476, menthae folia 0.495");
		txtrTiapTabletMengandung_6.setWrapStyleWord(true);
		txtrTiapTabletMengandung_6.setLineWrap(true);
		txtrTiapTabletMengandung_6.setEditable(false);
		kandungan_atn.add(txtrTiapTabletMengandung_6);
		tabbedPane_dpt_1.setForegroundAt(1, Color.BLACK);
		tabbedPane_dpt_1.setBackgroundAt(1, Color.LIGHT_GRAY);
		
		JPanel Aturanpakai_atn = new JPanel();
		Aturanpakai_atn.setBorder(null);
		Aturanpakai_atn.setBackground(Color.WHITE);
		tabbedPane_dpt_1.addTab("Aturan Pakai", null, Aturanpakai_atn, null);
		Aturanpakai_atn.setLayout(new GridLayout(0, 1, 0, 0));
		
		JTextArea txtrDiminumX_1 = new JTextArea();
		txtrDiminumX_1.setText("Diminum 3 x sehari 2 tablet setelah makan");
		txtrDiminumX_1.setWrapStyleWord(true);
		txtrDiminumX_1.setLineWrap(true);
		txtrDiminumX_1.setEditable(false);
		Aturanpakai_atn.add(txtrDiminumX_1);
		tabbedPane_dpt_1.setForegroundAt(2, Color.BLACK);
		tabbedPane_dpt_1.setBackgroundAt(2, Color.LIGHT_GRAY);
		
		JPanel Ibuprofen = new JPanel();
		Ibuprofen.setBorder(new TitledBorder(new EtchedBorder(EtchedBorder.LOWERED, new Color(255, 255, 255), new Color(160, 160, 160)), "Ibuprofen Tab", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(0, 0, 0)));
		layeredPane_obat_masukangin.add(Ibuprofen, "name_140817579417800");
		Ibuprofen.setLayout(null);
		
		JTabbedPane tabbedPane_ibn = new JTabbedPane(JTabbedPane.TOP);
		tabbedPane_ibn.setBounds(6, 16, 331, 178);
		Ibuprofen.add(tabbedPane_ibn);
		
		JPanel indikasi_ibn = new JPanel();
		indikasi_ibn.setBorder(null);
		indikasi_ibn.setBackground(Color.WHITE);
		tabbedPane_ibn.addTab("Indikasi", null, indikasi_ibn, null);
		tabbedPane_ibn.setForegroundAt(0, Color.BLACK);
		tabbedPane_ibn.setBackgroundAt(0, Color.LIGHT_GRAY);
		indikasi_ibn.setLayout(new GridLayout(0, 1, 0, 0));
		
		JTextArea txtrIbuprofenAdalahObat = new JTextArea();
		txtrIbuprofenAdalahObat.setText("Ibuprofen adalah obat generik yang digunakan untuk meringankan nyeri ringan sampai sedang dan meringankan demam akibat masuk angin, dll");
		txtrIbuprofenAdalahObat.setWrapStyleWord(true);
		txtrIbuprofenAdalahObat.setLineWrap(true);
		txtrIbuprofenAdalahObat.setEditable(false);
		indikasi_ibn.add(txtrIbuprofenAdalahObat);
		
		JPanel kandungan_ibn = new JPanel();
		kandungan_ibn.setBorder(null);
		kandungan_ibn.setBackground(Color.WHITE);
		tabbedPane_ibn.addTab("Kandungan", null, kandungan_ibn, null);
		kandungan_ibn.setLayout(new GridLayout(0, 1, 0, 0));
		
		JTextArea txtrTiapTabletMengandung_7 = new JTextArea();
		txtrTiapTabletMengandung_7.setText("Tiap tablet mengandung ibuprofen 400mg");
		txtrTiapTabletMengandung_7.setWrapStyleWord(true);
		txtrTiapTabletMengandung_7.setLineWrap(true);
		txtrTiapTabletMengandung_7.setEditable(false);
		kandungan_ibn.add(txtrTiapTabletMengandung_7);
		tabbedPane_ibn.setForegroundAt(1, Color.BLACK);
		tabbedPane_ibn.setBackgroundAt(1, Color.LIGHT_GRAY);
		
		JPanel Aturanpakai_ibn = new JPanel();
		Aturanpakai_ibn.setBorder(null);
		Aturanpakai_ibn.setBackground(Color.WHITE);
		tabbedPane_ibn.addTab("Aturan Pakai", null, Aturanpakai_ibn, null);
		Aturanpakai_ibn.setLayout(new GridLayout(0, 1, 0, 0));
		
		JTextArea txtrDiminumX_2 = new JTextArea();
		txtrDiminumX_2.setText("Diminum 3-4 x sehari setelah makan");
		txtrDiminumX_2.setWrapStyleWord(true);
		txtrDiminumX_2.setLineWrap(true);
		txtrDiminumX_2.setEditable(false);
		Aturanpakai_ibn.add(txtrDiminumX_2);
		tabbedPane_ibn.setForegroundAt(2, Color.BLACK);
		tabbedPane_ibn.setBackgroundAt(2, Color.LIGHT_GRAY);
		
		JPanel Tolakangin = new JPanel();
		Tolakangin.setBorder(new TitledBorder(new EtchedBorder(EtchedBorder.LOWERED, new Color(255, 255, 255), new Color(160, 160, 160)), "Tolak Angin JRG Tab", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(0, 0, 0)));
		layeredPane_obat_masukangin.add(Tolakangin, "name_140817603717200");
		Tolakangin.setLayout(null);
		
		JTabbedPane tabbedPane_tkn = new JTabbedPane(JTabbedPane.TOP);
		tabbedPane_tkn.setBounds(6, 16, 331, 178);
		Tolakangin.add(tabbedPane_tkn);
		
		JPanel indikasi_tkn = new JPanel();
		indikasi_tkn.setBorder(null);
		indikasi_tkn.setBackground(Color.WHITE);
		tabbedPane_tkn.addTab("Indikasi", null, indikasi_tkn, null);
		indikasi_tkn.setLayout(new GridLayout(0, 1, 0, 0));
		
		JTextArea txtrTolakAnginAdalah = new JTextArea();
		txtrTolakAnginAdalah.setText("Tolak angin adalah obat herbal yang dapat mengatasi masuk angin dan mampu menjaga daya tahan tubuh saat perjalanan jauh");
		txtrTolakAnginAdalah.setWrapStyleWord(true);
		txtrTolakAnginAdalah.setLineWrap(true);
		txtrTolakAnginAdalah.setEditable(false);
		indikasi_tkn.add(txtrTolakAnginAdalah);
		tabbedPane_tkn.setForegroundAt(0, Color.BLACK);
		tabbedPane_tkn.setBackgroundAt(0, Color.LIGHT_GRAY);
		
		JPanel kandungan_tkn = new JPanel();
		kandungan_tkn.setBorder(null);
		kandungan_tkn.setBackground(Color.WHITE);
		tabbedPane_tkn.addTab("Kandungan", null, kandungan_tkn, null);
		kandungan_tkn.setLayout(new GridLayout(0, 1, 0, 0));
		
		JTextArea txtrTiapTabletMengandung_8 = new JTextArea();
		txtrTiapTabletMengandung_8.setText("Tiap tablet mengandung campuran rempah kapulaga, adas, kayu ules, pala, daun mint, kayu manis, pegagan, cengkeh, kedawung, beras, poko, kayu angin, jahe merah, ginseng, dan royal jelly");
		txtrTiapTabletMengandung_8.setWrapStyleWord(true);
		txtrTiapTabletMengandung_8.setLineWrap(true);
		txtrTiapTabletMengandung_8.setEditable(false);
		kandungan_tkn.add(txtrTiapTabletMengandung_8);
		tabbedPane_tkn.setForegroundAt(1, Color.BLACK);
		tabbedPane_tkn.setBackgroundAt(1, Color.LIGHT_GRAY);
		
		JPanel Aturanpakai_tkn = new JPanel();
		Aturanpakai_tkn.setBorder(null);
		Aturanpakai_tkn.setBackground(Color.WHITE);
		tabbedPane_tkn.addTab("Aturan Pakai", null, Aturanpakai_tkn, null);
		Aturanpakai_tkn.setLayout(new GridLayout(0, 1, 0, 0));
		
		JTextArea txtrDiminumTablet_2 = new JTextArea();
		txtrDiminumTablet_2.setText("Diminum 1 tablet saat badan terasa tidak enak setelah makan");
		txtrDiminumTablet_2.setWrapStyleWord(true);
		txtrDiminumTablet_2.setLineWrap(true);
		txtrDiminumTablet_2.setEditable(false);
		Aturanpakai_tkn.add(txtrDiminumTablet_2);
		tabbedPane_tkn.setForegroundAt(2, Color.BLACK);
		tabbedPane_tkn.setBackgroundAt(2, Color.LIGHT_GRAY);
		
		JButton btn_Antangin = new JButton("Antangin");
		btn_Antangin.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				layeredPane_obat_masukangin.removeAll();
				layeredPane_obat_masukangin.add(Antangin);
				layeredPane_obat_masukangin.repaint();
				layeredPane_obat_masukangin.revalidate();
			}
		});
		btn_Antangin.setForeground(Color.WHITE);
		btn_Antangin.setFont(new Font("Segoe UI", Font.BOLD, 12));
		btn_Antangin.setBackground(Color.DARK_GRAY);
		btn_Antangin.setBounds(211, 22, 112, 23);
		Masuk_angin.add(btn_Antangin);
		
		JButton btn_Ibuprofen = new JButton("Ibuprofen");
		btn_Ibuprofen.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				layeredPane_obat_masukangin.removeAll();
				layeredPane_obat_masukangin.add(Ibuprofen);
				layeredPane_obat_masukangin.repaint();
				layeredPane_obat_masukangin.revalidate();
			}
		});
		btn_Ibuprofen.setForeground(Color.WHITE);
		btn_Ibuprofen.setFont(new Font("Segoe UI", Font.BOLD, 12));
		btn_Ibuprofen.setBackground(Color.DARK_GRAY);
		btn_Ibuprofen.setBounds(322, 22, 112, 23);
		Masuk_angin.add(btn_Ibuprofen);
		
		JButton btn_Tolakangin = new JButton("Tolak Angin");
		btn_Tolakangin.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				layeredPane_obat_masukangin.removeAll();
				layeredPane_obat_masukangin.add(Tolakangin);
				layeredPane_obat_masukangin.repaint();
				layeredPane_obat_masukangin.revalidate();
			}
		});
		btn_Tolakangin.setForeground(Color.WHITE);
		btn_Tolakangin.setFont(new Font("Segoe UI", Font.BOLD, 12));
		btn_Tolakangin.setBackground(Color.DARK_GRAY);
		btn_Tolakangin.setBounds(430, 22, 112, 23);
		Masuk_angin.add(btn_Tolakangin);
		
		
		AIO.getContentPane().setLayout(groupLayout);
	}
	private static void addPopup(Component component, final JPopupMenu popup) {
		component.addMouseListener(new MouseAdapter() {
			public void mousePressed(MouseEvent e) {
				if (e.isPopupTrigger()) {
					showMenu(e);
				}
			}
			public void mouseReleased(MouseEvent e) {
				if (e.isPopupTrigger()) {
					showMenu(e);
				}
			}
			private void showMenu(MouseEvent e) {
				popup.show(e.getComponent(), e.getX(), e.getY());
			}
		});
	}
}
