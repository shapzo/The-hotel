package POO;

/* paneles color negro *
 * paneles centrados al centro *
 * fuentes usadas Tahoma, Segoe UI Semibold, Lucida Console, Candara Regular *
 * imagenes con un tamaño no mayor a -300 px,  100 px- salvo algunas ecepciones *
 * paneles centralisados y sin posibilidad de redimensionarse -esto se hace para que no pierda estetica el programa- *
 */

import java.awt.Checkbox;
import java.awt.Color;
import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

import javax.swing.ButtonGroup;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;

public class elHotel extends JFrame {
	/* variables de los cuartos */
	ButtonGroup grupoDeBotones = new ButtonGroup();
	Checkbox cuartoA1 = new Checkbox("Sencillo");
	Checkbox cuartoA2 = new Checkbox("Doble");
	Checkbox cuartoA3 = new Checkbox("Suit");

	/*
	 * variables de la reservacion del cuarto *
	 */
	JLabel Nom;
	JLabel NoPer;
	JLabel FechIni;
	JLabel FechSal;
	JLabel Origen;
	JTextField Orig;
	JTextField nom;
	JTextField noper;
	JTextField fechin;
	JTextField fechsal;

	/*
	 * variables del restaurante*
	 */
	Checkbox a1 = new Checkbox("Vino Espumoso Lunato Lambrusco Rosado - 750 ml - 750$");
	Checkbox a2 = new Checkbox("Vino Tinto Campo Viejo Gran Reserva Rioja - 750 ml - 1750$");
	Checkbox a3 = new Checkbox("Oporto Royal 10 Años - 750 ml - 3860$");
	Checkbox a4 = new Checkbox("Whisky Chivas Regal 12 años - 750 ml - 6380$");
	Checkbox a5 = new Checkbox("Brandy Gran Duque D Alba - 700 ml - 10580$");
	Checkbox b1 = new Checkbox("Empanadas - 100$");
	Checkbox b2 = new Checkbox("Jugo de carne - 300$");
	Checkbox b3 = new Checkbox("Ensaladas - 100$");
	Checkbox b4 = new Checkbox("Milanesas - 150$");
	Checkbox b5 = new Checkbox("Postre italiano de la Nonna - 500$");
	Checkbox c1 = new Checkbox("Filete T-Bone/Porterhouse - 1500$");
	Checkbox c2 = new Checkbox("Bife Ancho (Rib Eye Steak) - 3400$");
	Checkbox c3 = new Checkbox("Asado de Tira (Back Ribs) - 2600$");
	Checkbox c4 = new Checkbox("Wagyu - 5500$");
	Checkbox c5 = new Checkbox("Kobe - 10000$");

	/* variables de la guarderia */

	ButtonGroup grupoDeBotonesguarderia = new ButtonGroup(); // se inicializan las variables
	Checkbox guarderiaA1 = new Checkbox("1 a 5 niños"); // el static es para poder llamar los valores que se guardan en
														// ellos
	Checkbox guarderiaA2 = new Checkbox("5 niños o mas");
	Checkbox guarderiaA3 = new Checkbox("1 a 3 años de edad");
	Checkbox guarderiaA4 = new Checkbox("4 a 7 años de edad");
	Checkbox guarderiaA5 = new Checkbox("7 a 11 años de edad");

	/* variables de los trips Fam */
	ButtonGroup grupoDeTrips = new ButtonGroup();
	Checkbox tripSa1 = new Checkbox("2 horas");
	Checkbox tripSa2 = new Checkbox("5 horas");
	Checkbox tripSa3 = new Checkbox("8 horas");

	Checkbox tripSb1 = new Checkbox("2 horas");
	Checkbox tripSb2 = new Checkbox("5 horas");
	Checkbox tripSb3 = new Checkbox("8 horas");

	Checkbox tripSc1 = new Checkbox("2 horas");
	Checkbox tripSc2 = new Checkbox("5 horas");
	Checkbox tripSc3 = new Checkbox("8 horas");

	/* variables de romm service */
	ButtonGroup grupoDeBotonesRomm = new ButtonGroup(); // se inicializan las variables
	Checkbox RomMa1 = new Checkbox("Tequila"); // el static es para poder llamar los valores que se guardan en ellos
	Checkbox RomMa2 = new Checkbox("Wisky");
	Checkbox RomMa3 = new Checkbox("Pau Pau");

	Checkbox RomMb1 = new Checkbox("Nachos");
	Checkbox RomMb2 = new Checkbox("Canape de cangrejo");
	Checkbox RomMb3 = new Checkbox("Nachos");

	Checkbox RomMc1 = new Checkbox("Marihuna");
	Checkbox RomMc2 = new Checkbox("Hongos");
	Checkbox RomMc3 = new Checkbox("Condones y lubricantes");

	/****************************************************************/
	double res = 0; // se inicializa a cero
	public JPanel p = new JPanel();
	protected String[] servicios;

	public elHotel() throws IOException {
		JButton boton;
		JButton boton1;
		JLabel etiqueta;
		JLabel etiqueta1;
		JTextField campo;

		setTitle("Real Hotel Marcona");
		setSize(500, 600);
		p.setBackground(Color.black);
		p.setLayout(null);
		setLocationRelativeTo(null);

		Container zona = getContentPane();

		zona.add(p);

		etiqueta = new JLabel(new ImageIcon("logo.jpg"));
		etiqueta1 = new JLabel("Usuario");
		campo = new JTextField();

		boton = new JButton(" OK "); // hay k poner imagenes alucivas
		boton1 = new JButton("Limpiar"); // para usar el formato PNG se ponen dobles diagonales

		/************** personalisacion *****************/
		etiqueta1.setForeground(Color.lightGray);
		etiqueta1.setFont(new java.awt.Font("Tahoma", 5, 15));

		campo.setBorder(new javax.swing.border.LineBorder(Color.gray, 3, true));
		campo.setBackground(Color.black);
		campo.setFont(new java.awt.Font("Segoe UI Semibold", 3, 14));
		campo.setForeground(Color.white);

		boton.setFont(new java.awt.Font("Segoe UI Semibold", 4, 15));
		boton.setBackground(new java.awt.Color(140, 149, 153));

		boton1.setFont(new java.awt.Font("Segoe UI Semibold", 4, 15));
		boton1.setBackground(new java.awt.Color(140, 149, 153));

		/******** posicion de los elementos ***************/
		boton.setBounds(150, 440, 70, 30); // hay k acomodar
		boton1.setBounds(250, 440, 100, 30);

		etiqueta.setBounds(150, 150, 200, 200); // imagen de logo
		etiqueta1.setBounds(220, 360, 150, 30); // usuario
		campo.setBounds(150, 400, 200, 25); // pa k llene el usuario

		p.add(boton); // se agregan los botones al panel
		p.add(boton1);
		p.add(etiqueta);
		p.add(etiqueta1);
		p.add(campo);

		boton.addActionListener(new ActionListener() { // se usa el ActionListener con sus metodos abstractos peros
														// usando solo botones
			public void actionPerformed(ActionEvent v) { // se crea la clase o el evento
				/* DECLARA VARIABLE CADENA */

				String cad1 = campo.getText();
				String s1 = new String("poo");

				if (cad1.compareTo(s1) == 0)/* COMPARA SI LA CLAVE ES CORRECTA */
				{
					JOptionPane.showMessageDialog(null,
							"Contraseña correcta ");/* SI LA CLAVE ES INCORRECTA TERMINA EL PROGRAMA */
					servicios abrir = new servicios(); // se manda a llamar a la clase servicios
					abrir.main(servicios);
				} // fin
				else {
					JOptionPane.showMessageDialog(null, "Contaseña incorrecta ");
				}

			}
		});

		boton1.addActionListener(new ActionListener() { // se usa el ActionListener con sus metodos abstractos peros
														// usando solo botones
			public void actionPerformed(ActionEvent m) { // se crea la clase o el evento
				campo.setText(null);
				JOptionPane.showMessageDialog(null, "Se a borrado satisfactoriamente"); // con esto se muestra un cuadro
																						// de dialogo
			}
		});

	}

	public class servicios extends JFrame {

		ButtonGroup grupoDeBotones = new ButtonGroup();
		JButton boton; // botones pra ir a las otras ventanas
		JButton boton1;
		JButton boton2;
		JButton boton3;
		JButton boton4;
		JButton boton5;
		JButton boton6;

		JButton salir; // boton para salir

		JLabel image; // pa las imagenes
		JLabel image1;
		JLabel image2;
		JLabel image3;
		JLabel image4;
		JLabel image5;
		JLabel image6;

		protected String[] cuartos;
		protected String[] reservacio;
		protected String[] restaurant;
		protected String[] guarderia;
		protected String[] trips;
		protected String[] romm;
		protected String[] pago;

		public JPanel p = new JPanel();

		public servicios() {

			setTitle("Servicios Real Hotel");
			setSize(1000, 700);
			p.setBackground(Color.black);
			p.setLayout(null);
			setLocationRelativeTo(null);

			Container zona = getContentPane();

			zona.add(p);

			boton = new JButton("Reservacion");
			boton1 = new JButton("Habitaciones");
			boton2 = new JButton("Restaurante");
			boton3 = new JButton("Guarderia");
			boton4 = new JButton("Trips");
			boton5 = new JButton("Room service");
			boton6 = new JButton("Forma de pago");

			image = new JLabel(new ImageIcon("reservacion.jpg"));
			image1 = new JLabel(new ImageIcon("habitacion.jpg"));
			image2 = new JLabel(new ImageIcon("restaurante.jpg"));
			image3 = new JLabel(new ImageIcon("guarderia.jpg"));
			image4 = new JLabel(new ImageIcon("famtrip.jpg"));
			image5 = new JLabel(new ImageIcon("romm.jpg"));
			image6 = new JLabel(new ImageIcon("pago.png"));

			salir = new JButton(new ImageIcon("atras.png"));

			/****************** personalisacion ******************/
			boton.setFont(new java.awt.Font("Segoe UI Semibold", 4, 15));
			boton.setBackground(new java.awt.Color(140, 141, 141));
			boton1.setFont(new java.awt.Font("Segoe UI Semibold", 4, 15));
			boton1.setBackground(new java.awt.Color(140, 141, 141));
			boton2.setFont(new java.awt.Font("Segoe UI Semibold", 4, 15));
			boton2.setBackground(new java.awt.Color(140, 141, 141));
			boton3.setFont(new java.awt.Font("Segoe UI Semibold", 4, 15));
			boton3.setBackground(new java.awt.Color(140, 141, 141));
			boton4.setFont(new java.awt.Font("Segoe UI Semibold", 4, 15));
			boton4.setBackground(new java.awt.Color(140, 141, 141));
			boton5.setFont(new java.awt.Font("Segoe UI Semibold", 4, 15));
			boton5.setBackground(new java.awt.Color(140, 141, 141));
			boton6.setFont(new java.awt.Font("Segoe UI Semibold", 4, 15));
			boton6.setBackground(new java.awt.Color(140, 141, 141));

			salir.setBorderPainted(false);
			salir.setContentAreaFilled(false);
			salir.setFocusPainted(false);
			salir.setOpaque(false);

			/******** posicion de los elementos ***************/

			image.setBounds(50, 50, 300, 100); // se les da posicion a los elementos
			boton.setBounds(100, 155, 130, 40);

			image1.setBounds(50, 200, 300, 100);
			boton1.setBounds(100, 305, 130, 40);

			image2.setBounds(50, 350, 300, 100);
			boton2.setBounds(100, 455, 130, 40);

			image3.setBounds(650, 50, 300, 100);
			boton3.setBounds(700, 155, 130, 40);

			image4.setBounds(650, 200, 300, 100);
			boton4.setBounds(700, 305, 130, 40);

			image5.setBounds(650, 350, 300, 100);
			boton5.setBounds(700, 455, 130, 40);

			image6.setBounds(350, 220, 300, 252);
			boton6.setBounds(400, 505, 140, 40);

			salir.setBounds(400, 600, 100, 50);

			p.add(boton); // se agragan los elementos a la panel
			p.add(boton1);
			p.add(boton2);
			p.add(boton3);
			p.add(boton4);
			p.add(boton5);
			p.add(boton6);

			p.add(image);
			p.add(image1);
			p.add(image2);
			p.add(image3);
			p.add(image4);
			p.add(image5);
			p.add(image6);

			p.add(salir);

			boton.addActionListener(new ActionListener() { // se usa el ActionListener con sus metodos abstractos peros
															// usando solo botones
				public void actionPerformed(ActionEvent v) {

					reservacio abrir = new reservacio(); // se manda a llamar a la clase habitacion
					abrir.main(reservacio); // se abre el panel

				}
			});

			boton1.addActionListener(new ActionListener() { // se usa el ActionListener con sus metodos abstractos peros
															// usando solo botones
				public void actionPerformed(ActionEvent v) {
					cuartos abrir = new cuartos(); // se manda a llamar a la clase habitacion
					abrir.main(cuartos); // se abre el panel

				}
			});

			boton2.addActionListener(new ActionListener() { // se usa el ActionListener con sus metodos abstractos peros
															// usando solo botones
				public void actionPerformed(ActionEvent v) {
					restaurant abrir = new restaurant(); // se manda a llamar a la clase habitacion
					abrir.main(restaurant); // se abre el panel

				}
			});

			boton3.addActionListener(new ActionListener() { // se usa el ActionListener con sus metodos abstractos peros
															// usando solo botones
				public void actionPerformed(ActionEvent v) {
					guarderia abrir = new guarderia(); // se manda a llamar a la clase habitacion
					abrir.main(guarderia); // se abre el panel

				}
			});

			boton4.addActionListener(new ActionListener() { // se usa el ActionListener con sus metodos abstractos peros
															// usando solo botones
				public void actionPerformed(ActionEvent v) {
					trips abrir = new trips(); // se manda a llamar a la clase habitacion
					abrir.main(trips); // se abre el panel

				}
			});

			boton5.addActionListener(new ActionListener() { // se usa el ActionListener con sus metodos abstractos peros
															// usando solo botones
				public void actionPerformed(ActionEvent v) {
					romm abrir = new romm(); // se manda a llamar a la clase habitacion
					abrir.main(romm); // se abre el panel

				}
			});

			boton6.addActionListener(new ActionListener() { // se usa el ActionListener con sus metodos abstractos peros
															// usando solo botones
				public void actionPerformed(ActionEvent v) {
					pago abrir = new pago(); // se manda a llamar a la clase habitacion
					abrir.main(pago); // se abre el panel

				}
			});

			salir.addActionListener(new ActionListener() { // se usa el ActionListener con sus metodos abstractos peros
															// usando solo botones
				public void actionPerformed(ActionEvent v) {
					dispose(); // para regresar al estado anterior

				}
			});

		}

		public void main(String[] arg) {
			servicios abrir = new servicios();
			abrir.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			abrir.setVisible(true);
			abrir.setResizable(false);
		}

	}

	public class cuartos extends JFrame {

		Container contenedor; // se inicializan las variables
		JPanel panel;

		JLabel letrero;

		JLabel image;
		JLabel image1;
		JLabel image2;

		JButton salir;

		public JPanel p = new JPanel();

		public cuartos() {

			// DELCARACION DE PANELES
			setTitle("Habitaciones Real Hotel"); // se le da nombre al panel o ventana
			setSize(550, 700); // se le otorgan las dimenciones
			p.setBackground(Color.black); // se le da color al panel en este caso es negro
			p.setLayout(null); // se inicia en null
			Container zona = getContentPane(); // constructor y todo lo que aparece en el panel
			setLocationRelativeTo(null);

			zona.add(p); // espara que aparesca todo en el panel

			letrero = new JLabel("Habitaciones");

			image = new JLabel(new ImageIcon("cuarto1.jpg")); // se crean los constructores y se les asigna su funcion
																// si son
			image1 = new JLabel(new ImageIcon("cuarto2.jpg")); // imagenes o dicen informacion
			image2 = new JLabel(new ImageIcon("cuarto3.png"));
			salir = new JButton(new ImageIcon("atras.png"));

			/************** personalisacion *****************/
			letrero.setForeground(Color.lightGray);
			letrero.setFont(new java.awt.Font("Segoe UI Semibold", 5, 30));

			cuartoA1.setForeground(Color.WHITE);
			cuartoA1.setFont(new java.awt.Font("Candara Regular", 4, 15));

			cuartoA2.setForeground(Color.WHITE);
			cuartoA2.setFont(new java.awt.Font("Candara Regular", 4, 15));

			cuartoA3.setForeground(Color.WHITE);
			cuartoA3.setFont(new java.awt.Font("Candara Regular", 4, 15));

			salir.setBorderPainted(false);
			salir.setContentAreaFilled(false);
			salir.setFocusPainted(false);
			salir.setOpaque(false);

			/******** posicion de los elementos ***************/

			letrero.setBounds(50, 5, 350, 40);

			cuartoA1.setBounds(50, 100, 150, 40); // se les da posicion a los elementos en el panel
			cuartoA2.setBounds(50, 250, 100, 40);
			cuartoA3.setBounds(50, 400, 120, 40);

			salir.setBounds(250, 550, 100, 50);

			p.add(cuartoA1); // se agregan los elementos al panel
			p.add(cuartoA2);
			p.add(cuartoA3);
			p.add(salir);
			p.add(letrero);

			cuartoA1.addItemListener(new ItemListener() { // se usa el ItemListener con sus metodos abstractos peros
															// usando solo checkbox
				public void itemStateChanged(ItemEvent v) {

					p.add(image); // se agrega al panel

					image.setBounds(250, 100, 200, 100); // se posicionan en el panel

				}
			});

			cuartoA2.addItemListener(new ItemListener() { // se usa el ItemListener con sus metodos abstractos peros
															// usando solo checkbox
				public void itemStateChanged(ItemEvent v) {

					p.add(image1); // se agrega al panel

					image1.setBounds(250, 250, 200, 100); // se posicionan en el panel

				}
			});

			cuartoA3.addItemListener(new ItemListener() { // se usa el ItemListener con sus metodos abstractos peros
															// usando solo checkbox
				public void itemStateChanged(ItemEvent v) {

					p.add(image2); // se agrega al panel

					image2.setBounds(250, 400, 200, 100); // se posicionan en el panel

				}
			});

			salir.addActionListener(new ActionListener() { // se usa el ActionListener con sus metodos abstractos peros
															// usando solo botones
				public void actionPerformed(ActionEvent evt) {
					dispose(); // es para cerrar el panel
				}
			});

		}

		public void main(String... POO) {
			cuartos abrir = new cuartos();
			abrir.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			abrir.setVisible(true);
			abrir.setResizable(false);
		}

	}

	public class reservacio extends JFrame {

		JLabel letrero;
		JLabel Mascota;

		ButtonGroup a = new ButtonGroup();
		JRadioButton a1 = new JRadioButton("Si", false);
		JRadioButton a2 = new JRadioButton("No", false);

		JButton Salir;

		public JPanel p = new JPanel();

		public reservacio() {
			setTitle("Reservaciones Real Hotel");
			setSize(450, 480);
			p.setBackground(Color.black);
			p.setLayout(null);
			setLocationRelativeTo(null);
			Container zona = getContentPane();

			zona.add(p);

			letrero = new JLabel("Reservacion de cuartos");

			Nom = new JLabel("Nombre: ");
			NoPer = new JLabel("Apellido: ");
			FechIni = new JLabel("Fecha de inicio: ");
			FechSal = new JLabel("Fecha de salida: ");
			Origen = new JLabel("Origen del huesped: ");
			Mascota = new JLabel("Trae alguna mascota: ");

			nom = new JTextField();
			noper = new JTextField();
			fechin = new JTextField();
			fechsal = new JTextField();
			Orig = new JTextField();

			Salir = new JButton(new ImageIcon("atras.png"));

			/************** personalisacion *****************/
			letrero.setForeground(Color.lightGray);
			letrero.setFont(new java.awt.Font("Segoe UI Semibold", 5, 30));

			Nom.setForeground(Color.WHITE);
			Nom.setFont(new java.awt.Font("Candara Regular", 4, 15));

			nom.setBorder(new javax.swing.border.LineBorder(Color.gray, 3, true));
			nom.setBackground(Color.black);
			nom.setFont(new java.awt.Font("Lucida Console", 3, 14));
			nom.setForeground(Color.white);

			NoPer.setForeground(Color.WHITE);
			NoPer.setFont(new java.awt.Font("Candara Regular", 4, 15));

			noper.setBorder(new javax.swing.border.LineBorder(Color.gray, 3, true));
			noper.setBackground(Color.black);
			noper.setFont(new java.awt.Font("Lucida Console", 3, 14));
			noper.setForeground(Color.white);

			FechIni.setForeground(Color.WHITE);
			FechIni.setFont(new java.awt.Font("Candara Regular", 4, 15));

			fechin.setBorder(new javax.swing.border.LineBorder(Color.gray, 3, true));
			fechin.setBackground(Color.black);
			fechin.setFont(new java.awt.Font("Lucida Console", 3, 14));
			fechin.setForeground(Color.white);

			FechSal.setForeground(Color.WHITE);
			FechSal.setFont(new java.awt.Font("Candara Regular", 4, 15));

			fechsal.setBorder(new javax.swing.border.LineBorder(Color.gray, 3, true));
			fechsal.setBackground(Color.black);
			fechsal.setFont(new java.awt.Font("Lucida Console", 3, 14));
			fechsal.setForeground(Color.white);

			Origen.setForeground(Color.WHITE);
			Origen.setFont(new java.awt.Font("Candara Regular", 4, 15));

			Orig.setBorder(new javax.swing.border.LineBorder(Color.gray, 3, true));
			Orig.setBackground(Color.black);
			Orig.setFont(new java.awt.Font("Lucida Console", 3, 14));
			Orig.setForeground(Color.white);

			Mascota.setForeground(Color.WHITE);
			Mascota.setFont(new java.awt.Font("Candara Regular", 4, 15));

			a1.setForeground(Color.black);
			a1.setFont(new java.awt.Font("Candara Regular", 4, 14));
			a1.setBackground(new java.awt.Color(168, 170, 171));
			a2.setForeground(Color.black);
			a2.setFont(new java.awt.Font("Candara Regular", 4, 14));
			a2.setBackground(new java.awt.Color(168, 170, 171));

			Salir.setBorderPainted(false);
			Salir.setContentAreaFilled(false);
			Salir.setFocusPainted(false);
			Salir.setOpaque(false);

			/******** posicion de los elementos ***************/
			letrero.setBounds(50, 5, 350, 40);

			Nom.setBounds(25, 50, 70, 20);
			NoPer.setBounds(25, 80, 150, 20);
			FechIni.setBounds(25, 110, 150, 20);
			FechSal.setBounds(25, 140, 150, 20);
			Origen.setBounds(25, 205, 150, 20);

			nom.setBounds(200, 50, 170, 25);
			noper.setBounds(200, 80, 170, 25);
			fechin.setBounds(200, 110, 170, 25);
			fechsal.setBounds(200, 140, 170, 25);
			Orig.setBounds(200, 200, 170, 25);

			Mascota.setBounds(25, 170, 150, 30);
			a1.setBounds(200, 170, 70, 25);
			a2.setBounds(300, 170, 70, 25);

			Salir.setBounds(150, 300, 100, 50);

			p.add(Origen);
			p.add(Orig);
			p.add(FechIni);
			p.add(FechSal);
			p.add(Mascota);
			p.add(NoPer);
			p.add(Nom);
			p.add(fechsal);
			p.add(fechin);
			p.add(nom);
			p.add(noper);
			p.add(Salir);
			p.add(a1);
			p.add(a2);
			p.add(letrero);

			Salir.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent evt) {
					dispose();

				}
			});
		}

		public void main(String... POO) {
			reservacio abrir = new reservacio();
			abrir.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			abrir.setVisible(true);
			abrir.setResizable(false);
		}

	}

	public class restaurant extends JFrame {

		ButtonGroup grupoDeBotonesRestaurante = new ButtonGroup(); // se inicializan las variables y en este caso se
																	// aplican valores
		JButton a = new JButton("Vinos y Licores");
		JButton b = new JButton("Platillos");
		JButton c = new JButton("Cortes De Carne");

		JButton image;// imagenes
		JButton image1;
		JButton image2;
		JLabel letrero;

		JButton x = new JButton(new ImageIcon("atras.png"));

		JLabel etq1 = new JLabel("desayuno");

		public JPanel p = new JPanel();

		public restaurant() {

			setTitle("Restaurante Real Hotel"); // asignaciion del titulo
			setSize(650, 650); // tamaño del panel
			p.setBackground(Color.black); // se le da color al panel
			setLocationRelativeTo(null);
			;
			p.setLayout(null); // no deve de haver nada fuera del panel

			Container zona = getContentPane();

			zona.add(p); // zona es para hacer referencia al contenido y signofica añadir al panel el
// contenido de zona

			image = new JButton(new ImageIcon("restor1.jpg")); // se le asignan valores a los elementos
			image1 = new JButton(new ImageIcon("restor2.jpg"));
			image2 = new JButton(new ImageIcon("restor3.jpg"));

			letrero = new JLabel("Restaurante");

			/************** personalisacion *****************/
			letrero.setForeground(Color.lightGray);
			letrero.setFont(new java.awt.Font("Segoe UI Semibold", 5, 30));

			a.setForeground(Color.WHITE);
			a.setFont(new java.awt.Font("Tahoma", 3, 15));
			a.setBackground(new java.awt.Color(140, 141, 141));

			b.setForeground(Color.WHITE);
			b.setFont(new java.awt.Font("Tahoma", 3, 15));
			b.setBackground(new java.awt.Color(140, 141, 141));

			c.setForeground(Color.WHITE);
			c.setFont(new java.awt.Font("Tahoma", 3, 15));
			c.setBackground(new java.awt.Color(140, 141, 141));

			a1.setForeground(Color.WHITE);
			a1.setFont(new java.awt.Font("Candara Regular", 4, 12));
			a2.setForeground(Color.WHITE);
			a2.setFont(new java.awt.Font("Candara Regular", 4, 12));
			a3.setForeground(Color.WHITE);
			a3.setFont(new java.awt.Font("Candara Regular", 4, 12));
			a4.setForeground(Color.WHITE);
			a4.setFont(new java.awt.Font("Candara Regular", 4, 12));
			a5.setForeground(Color.WHITE);
			a5.setFont(new java.awt.Font("Candara Regular", 4, 12));

			c1.setForeground(Color.WHITE);
			c1.setFont(new java.awt.Font("Candara Regular", 4, 12));
			c2.setForeground(Color.WHITE);
			c2.setFont(new java.awt.Font("Candara Regular", 4, 12));
			c3.setForeground(Color.WHITE);
			c3.setFont(new java.awt.Font("Candara Regular", 4, 12));
			c4.setForeground(Color.WHITE);
			c4.setFont(new java.awt.Font("Candara Regular", 4, 12));
			c5.setForeground(Color.WHITE);
			c5.setFont(new java.awt.Font("Candara Regular", 4, 12));

			b1.setForeground(Color.WHITE);
			b1.setFont(new java.awt.Font("Candara Regular", 4, 12));
			b2.setForeground(Color.WHITE);
			b2.setFont(new java.awt.Font("Candara Regular", 4, 12));
			b3.setForeground(Color.WHITE);
			b3.setFont(new java.awt.Font("Candara Regular", 4, 12));
			b4.setForeground(Color.WHITE);
			b4.setFont(new java.awt.Font("Candara Regular", 4, 12));
			b5.setForeground(Color.WHITE);
			b5.setFont(new java.awt.Font("Candara Regular", 4, 12));

			x.setBorderPainted(false);
			x.setContentAreaFilled(false);
			x.setFocusPainted(false);
			x.setOpaque(false);

			/******** posicion de los elementos ***************/

			x.setBounds(250, 550, 100, 50);

			letrero.setBounds(50, 5, 350, 40);

			a.setBounds(30, 60, 170, 30); // el setBounds es para posicionar los botones dentro del panel poniendo
											// cordenadas
			b.setBounds(240, 60, 100, 30); // y darle tamaño al los botones
			c.setBounds(390, 60, 170, 30); // el primer numero es para hacerlo a la izquierd a o la dercha, el 2 es para
											// harriba o abajo, el 3 es para el tmaño a lo largo del boton, el 4 es para
											// el tamaño del boton a lo ancho

			p.add(a); // para añadoir a boton -a- al panel
			p.add(b);
			p.add(c);
			p.add(letrero);
			p.add(x);
			grupoDeBotonesRestaurante.add(a);
			grupoDeBotonesRestaurante.add(b);
			grupoDeBotonesRestaurante.add(c);
			a.addActionListener(new ActionListener() { // añadir a la lista
				public void actionPerformed(ActionEvent v) { // es la accion de como va a trabajar, del evento a usar
// por Ejm al pasar el mouse cambie de color
					p.add(image); // para añadoir a boton -a- al panel
					p.add(a1);
					p.add(a2);
					p.add(a3);
					p.add(a4);
					p.add(a5);

					image.setBounds(400, 110, 220, 120); // se posicionan el el panel

					a1.setBounds(30, 110, 380, 20);
					a2.setBounds(30, 130, 380, 20);
					a3.setBounds(30, 150, 380, 20);
					a4.setBounds(30, 170, 380, 20);
					a5.setBounds(30, 190, 380, 20);
				}

			});
			b.addActionListener(new ActionListener() { // se usa el ActionListener con sus metodos abstractos peros
// usando solo botones
				public void actionPerformed(ActionEvent v) {
					p.add(image1);
					p.add(b1); // se agragan al panel
					p.add(b2);
					p.add(b3);
					p.add(b4);
					p.add(b5);

					image1.setBounds(400, 250, 220, 120);

					b1.setBounds(30, 250, 380, 20); // se posocionan en el panel
					b2.setBounds(30, 270, 380, 20);
					b3.setBounds(30, 290, 380, 20);
					b4.setBounds(30, 310, 280, 20);
					b5.setBounds(30, 330, 280, 20);
				}
			});
			c.addActionListener(new ActionListener() { // se usa el ActionListener con sus metodos abstractos peros
// usando solo botones
				public void actionPerformed(ActionEvent v) {
					p.add(image2); // se agragan al panel
					p.add(c1);
					p.add(c2);
					p.add(c3);
					p.add(c4);
					p.add(c5);

					image2.setBounds(400, 390, 220, 120); // se posicionan dentro del panel

					c1.setBounds(30, 390, 380, 20);
					c2.setBounds(30, 410, 380, 20);
					c3.setBounds(30, 430, 280, 20);
					c4.setBounds(30, 450, 100, 20);
					c5.setBounds(30, 470, 100, 20);
				}
			});

			x.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent evt) {
					dispose(); // es para serrar la ventana
				}
			});

		}

		public void main(String... POO) {
			restaurant abrir = new restaurant();
			abrir.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			abrir.setVisible(true);
			abrir.setResizable(false);
		}

	}

	public class guarderia extends JFrame {

		JButton salir;
		JLabel Letrero;
		JButton boton2;
		JButton boton3;

		public JPanel p = new JPanel();

		public guarderia() {
			// DELCARACION DE PANELES
			setTitle("Guarderias Real Hotel"); // se le da nombre al panel o ventana
			setSize(530, 600); // se le otorgan las dimenciones
			p.setBackground(Color.black); // se le da color al panel en este caso es negro
			p.setLayout(null); // se inicia en null
			Container zona = getContentPane(); // constructor y todo lo que aparece en el panel
			// para que aparesca el panel
			setLocationRelativeTo(null);
			zona.add(p); // espara que aparesca todo en el panel

			salir = new JButton(new ImageIcon("atras.png")); // se les asigna su funcion a los constructores
			Letrero = new JLabel("Horario de 8pm a 6am");
			boton2 = new JButton("No de niños");
			boton3 = new JButton("Edad de los niños");

			/************** personalisacion *****************/
			Letrero.setForeground(Color.lightGray);
			Letrero.setFont(new java.awt.Font("Segoe UI Semibold", 5, 30));

			boton2.setFont(new java.awt.Font("Segoe UI Semibold", 4, 15));
			boton2.setBackground(new java.awt.Color(140, 141, 141));

			boton3.setFont(new java.awt.Font("Segoe UI Semibold", 4, 15));
			boton3.setBackground(new java.awt.Color(140, 141, 141));

			guarderiaA1.setForeground(Color.WHITE);
			guarderiaA1.setFont(new java.awt.Font("Candara Regular", 3, 14));
			guarderiaA2.setForeground(Color.WHITE);
			guarderiaA2.setFont(new java.awt.Font("Candara Regular", 3, 14));
			guarderiaA3.setForeground(Color.WHITE);
			guarderiaA3.setFont(new java.awt.Font("Candara Regular", 3, 14));
			guarderiaA4.setForeground(Color.WHITE);
			guarderiaA4.setFont(new java.awt.Font("Candara Regular", 3, 14));
			guarderiaA5.setForeground(Color.WHITE);
			guarderiaA5.setFont(new java.awt.Font("Candara Regular", 3, 14));

			salir.setBorderPainted(false);
			salir.setContentAreaFilled(false);
			salir.setFocusPainted(false);
			salir.setOpaque(false);

			/******** posicion de los elementos ***************/

			p.add(salir); // se agragan al panel
			p.add(Letrero);
			p.add(boton2);
			p.add(boton3);

			Letrero.setBounds(100, 30, 350, 70); // se les da posicion en el panel
			boton2.setBounds(50, 150, 150, 40);
			boton3.setBounds(300, 150, 180, 40);

			salir.setBounds(200, 450, 100, 50);

			boton2.addActionListener(new ActionListener() { // se usa el ActionListener con sus metodos abstractos peros
															// usando solo botones
				public void actionPerformed(ActionEvent v) {

					p.add(guarderiaA1); // se agragan al panel
					p.add(guarderiaA2);
					guarderiaA1.setBounds(50, 210, 150, 20); // se les da posicion en el panel
					guarderiaA2.setBounds(50, 260, 150, 20);

				}
			});
			boton3.addActionListener(new ActionListener() { // se usa el ActionListener con sus metodos abstractos peros
															// usando solo botones
				public void actionPerformed(ActionEvent v) {

					p.add(guarderiaA3); // se agragan al panel
					p.add(guarderiaA4);
					p.add(guarderiaA5);
					guarderiaA3.setBounds(300, 210, 150, 20); // se les da posicion en el panel
					guarderiaA4.setBounds(300, 260, 150, 20);
					guarderiaA5.setBounds(300, 310, 150, 20);
				}
			});

			salir.addActionListener(new ActionListener() { // se usa el ActionListener con sus metodos abstractos peros
															// usando solo botones
				public void actionPerformed(ActionEvent v) {

					dispose(); // es para cerrar la ventana
				}
			});
		}

		public void main(String... POO) {
			guarderia abrir = new guarderia();
			abrir.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			abrir.setVisible(true);
			abrir.setResizable(false);
		}

	}

	public class trips extends JFrame {

		JButton boton;
		JButton boton1;
		JButton boton2;

		JButton salir;

		JLabel image;
		JLabel image1;
		JLabel image2;

		JLabel letrero;

		Container contenedor; // se inicializan las variables
		JPanel panel;

		public JPanel p = new JPanel();

		public trips() {
			setTitle("Trips Fam Real Hotel");
			setSize(500, 700);
			p.setBackground(Color.black);
			p.setLayout(null);
			setLocationRelativeTo(null);
			Container zona = getContentPane();

			zona.add(p);

			image = new JLabel(new ImageIcon("trip1.jpg"));
			image1 = new JLabel(new ImageIcon("trip2.jpg"));
			image2 = new JLabel(new ImageIcon("trip3.jpg"));

			boton = new JButton("Globo"); // hay k poner imagenes alucivas
			boton1 = new JButton("Camioneta"); // para usar el formato PNG se ponen dobles diagonales
			boton2 = new JButton("Lancha");

			salir = new JButton(new ImageIcon("atras.png"));

			letrero = new JLabel("Trip´s Fam");

			/************** personalisacion *****************/
			letrero.setForeground(Color.lightGray);
			letrero.setFont(new java.awt.Font("Segoe UI Semibold", 5, 30));

			boton.setFont(new java.awt.Font("Segoe UI Semibold", 3, 15));
			boton.setBackground(new java.awt.Color(140, 141, 141));
			boton1.setFont(new java.awt.Font("Segoe UI Semibold", 3, 15));
			boton1.setBackground(new java.awt.Color(140, 141, 141));
			boton2.setFont(new java.awt.Font("Segoe UI Semibold", 3, 15));
			boton2.setBackground(new java.awt.Color(140, 141, 141));

			tripSa1.setForeground(Color.WHITE);
			tripSa1.setFont(new java.awt.Font("Candara Regular", 4, 14));
			tripSa2.setForeground(Color.WHITE);
			tripSa2.setFont(new java.awt.Font("Candara Regular", 4, 14));
			tripSa3.setForeground(Color.WHITE);
			tripSa3.setFont(new java.awt.Font("Candara Regular", 4, 14));

			tripSb1.setForeground(Color.WHITE);
			tripSb1.setFont(new java.awt.Font("Candara Regular", 4, 14));
			tripSb2.setForeground(Color.WHITE);
			tripSb2.setFont(new java.awt.Font("Candara Regular", 4, 14));
			tripSb3.setForeground(Color.WHITE);
			tripSb3.setFont(new java.awt.Font("Candara Regular", 4, 14));

			tripSc1.setForeground(Color.WHITE);
			tripSc1.setFont(new java.awt.Font("Candara Regular", 4, 14));
			tripSc2.setForeground(Color.WHITE);
			tripSc2.setFont(new java.awt.Font("Candara Regular", 4, 14));
			tripSc3.setForeground(Color.WHITE);
			tripSc3.setFont(new java.awt.Font("Candara Regular", 4, 14));

			salir.setBorderPainted(false);
			salir.setContentAreaFilled(false);
			salir.setFocusPainted(false);
			salir.setOpaque(false);

			/******** posicion de los elementos ***************/

			image.setBounds(250, 90, 200, 130);
			image1.setBounds(250, 260, 200, 130);
			image2.setBounds(250, 430, 200, 130);

			boton.setBounds(40, 90, 150, 30);
			boton1.setBounds(40, 250, 150, 30);
			boton2.setBounds(40, 400, 150, 30);

			salir.setBounds(120, 580, 100, 50);

			letrero.setBounds(200, 20, 350, 70);

			p.add(boton); // se agregan los botones al panel
			p.add(boton1);
			p.add(boton2);
			p.add(image);
			p.add(image1);
			p.add(image2);
			p.add(salir);
			p.add(letrero);

			boton.addActionListener(new ActionListener() { // añadir a la lista
				public void actionPerformed(ActionEvent v) {

					tripSa1.setBounds(50, 130, 100, 30);
					tripSa2.setBounds(50, 160, 100, 30);
					tripSa3.setBounds(50, 190, 100, 30);

					p.add(tripSa1);
					p.add(tripSa2);
					p.add(tripSa3);

				}

			});

			boton1.addActionListener(new ActionListener() { // añadir a la lista
				public void actionPerformed(ActionEvent v) {

					tripSb1.setBounds(50, 280, 100, 30);
					tripSb2.setBounds(50, 310, 100, 30);
					tripSb3.setBounds(50, 340, 100, 30);

					p.add(tripSb1);
					p.add(tripSb2);
					p.add(tripSb3);

				}

			});

			boton2.addActionListener(new ActionListener() { // añadir a la lista
				public void actionPerformed(ActionEvent v) {

					tripSc1.setBounds(50, 450, 100, 30);
					tripSc2.setBounds(50, 480, 100, 30);
					tripSc3.setBounds(50, 510, 100, 30);

					p.add(tripSc1);
					p.add(tripSc2);
					p.add(tripSc3);

				}

			});

			salir.addActionListener(new ActionListener() { // se usa el ActionListener con sus metodos abstractos peros
															// usando solo botones
				public void actionPerformed(ActionEvent evt) {
					dispose(); // es para cerrar el panel
				}
			});

		}

		public void main(String... POO) {
			trips abrir = new trips();
			abrir.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			abrir.setVisible(true);
			abrir.setResizable(false);
		}

	}

	public class romm extends JFrame {

		JButton salir;
		JLabel Letrero;
		JButton boton2;
		JButton boton3;
		JButton boton4;

		public JPanel p = new JPanel();

		public romm() {
			// DELCARACION DE PANELES
			setTitle("Room Service Real Hotel"); // se le da nombre al panel o ventana
			setSize(770, 500); // se le otorgan las dimenciones
			p.setBackground(Color.black); // se le da color al panel en este caso es negro
			p.setLayout(null); // se inicia en null
			Container zona = getContentPane(); // constructor y todo lo que aparece en el panel
			// para que aparesca el panel
			setLocationRelativeTo(null);
			zona.add(p); // espara que aparesca todo en el panel

			salir = new JButton(new ImageIcon("atras.png")); // se les asigna su funcion a los constructores
			Letrero = new JLabel("Room service");
			boton2 = new JButton("Bebidas");
			boton3 = new JButton("Aperitivos");
			boton4 = new JButton("Recreativos");

			/************** personalisacion *****************/
			Letrero.setForeground(Color.lightGray);
			Letrero.setFont(new java.awt.Font("Segoe UI Semibold", 5, 30));

			boton2.setFont(new java.awt.Font("Segoe UI Semibold", 4, 15));
			boton2.setBackground(new java.awt.Color(140, 141, 141));

			boton3.setFont(new java.awt.Font("Segoe UI Semibold", 4, 15));
			boton3.setBackground(new java.awt.Color(140, 141, 141));

			boton4.setFont(new java.awt.Font("Segoe UI Semibold", 4, 15));
			boton4.setBackground(new java.awt.Color(140, 141, 141));

			RomMa1.setForeground(Color.WHITE);
			RomMa1.setFont(new java.awt.Font("Candara Regular", 3, 14));
			RomMa2.setForeground(Color.WHITE);
			RomMa2.setFont(new java.awt.Font("Candara Regular", 3, 14));
			RomMa3.setForeground(Color.WHITE);
			RomMa3.setFont(new java.awt.Font("Candara Regular", 3, 14));

			RomMb1.setForeground(Color.WHITE);
			RomMb1.setFont(new java.awt.Font("Candara Regular", 3, 14));
			RomMb2.setForeground(Color.WHITE);
			RomMb2.setFont(new java.awt.Font("Candara Regular", 3, 14));
			RomMb3.setForeground(Color.WHITE);
			RomMb3.setFont(new java.awt.Font("Candara Regular", 3, 14));

			RomMc1.setForeground(Color.WHITE);
			RomMc1.setFont(new java.awt.Font("Candara Regular", 3, 14));
			RomMc2.setForeground(Color.WHITE);
			RomMc2.setFont(new java.awt.Font("Candara Regular", 3, 14));
			RomMc3.setForeground(Color.WHITE);
			RomMc3.setFont(new java.awt.Font("Candara Regular", 3, 14));

			salir.setBorderPainted(false);
			salir.setContentAreaFilled(false);
			salir.setFocusPainted(false);
			salir.setOpaque(false);

			/******** posicion de los elementos ***************/

			p.add(salir); // se agragan al panel
			p.add(Letrero);
			p.add(boton2);
			p.add(boton3);
			p.add(boton4);

			Letrero.setBounds(200, 30, 350, 70); // se les da posicion en el panel
			boton2.setBounds(50, 150, 100, 50);
			boton3.setBounds(290, 150, 150, 50);
			boton4.setBounds(550, 150, 150, 50);

			salir.setBounds(300, 370, 100, 50);

			boton2.addActionListener(new ActionListener() { // se usa el ActionListener con sus metodos abstractos peros
															// usando solo botones
				public void actionPerformed(ActionEvent v) {

					p.add(RomMa1); // se agragan al panel
					p.add(RomMa2);
					p.add(RomMa3);
					RomMa1.setBounds(50, 210, 150, 20); // se les da posicion en el panel
					RomMa2.setBounds(50, 260, 150, 20);
					RomMa3.setBounds(50, 310, 150, 20);

				}
			});

			boton3.addActionListener(new ActionListener() { // se usa el ActionListener con sus metodos abstractos peros
															// usando solo botones
				public void actionPerformed(ActionEvent v) {

					p.add(RomMb1); // se agragan al panel
					p.add(RomMb2);
					p.add(RomMb3);
					RomMb1.setBounds(290, 210, 150, 20); // se les da posicion en el panel
					RomMb2.setBounds(290, 260, 150, 20);
					RomMb3.setBounds(290, 310, 150, 20);
				}
			});

			boton4.addActionListener(new ActionListener() { // se usa el ActionListener con sus metodos abstractos peros
															// usando solo botones
				public void actionPerformed(ActionEvent v) {
					p.add(RomMc1); // se agragan al panel
					p.add(RomMc2);
					p.add(RomMc3);
					RomMc1.setBounds(550, 210, 150, 20); // se les da posicion en el panel
					RomMc2.setBounds(550, 260, 150, 20);
					RomMc3.setBounds(550, 310, 150, 20);

				}
			});

			salir.addActionListener(new ActionListener() { // se usa el ActionListener con sus metodos abstractos peros
															// usando solo botones
				public void actionPerformed(ActionEvent v) {

					dispose(); // es para cerrar la ventana
				}
			});
		}

		public void main(String... POO) {
			romm abrir = new romm();
			abrir.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			abrir.setVisible(true);
			abrir.setResizable(false);
		}

	} // fin de la clase romm servise

	public class pago extends JFrame {

		JButton salir;
		JLabel Letrero;
		JButton boton2;
		JButton boton3;

		JButton total1;
		JTextField ToT1;
		JButton tiked1;
		JButton Limpiar1;

		JButton total2;
		JTextField ToT2;
		JButton tiked2;
		JButton Limpiar2;

		JLabel tarj1;
		JLabel tarj2;

		JTextField tarjeti1;
		JTextField tarjeti2;

		JLabel efec1;

		JTextField efe1;

		public JPanel p = new JPanel();

		public pago() {
			// DELCARACION DE PANELES
			setTitle("Forma de Pago Real Hotel"); // se le da nombre al panel o ventana
			setSize(770, 600); // se le otorgan las dimenciones
			p.setBackground(new java.awt.Color(54, 55, 56)); // se le da color al panel en este caso es negro
			p.setLayout(null); // se inicia en null
			Container zona = getContentPane(); // constructor y todo lo que aparece en el panel
			// para que aparesca el panel
			setLocationRelativeTo(null);
			zona.add(p); // espara que aparesca todo en el panel

			salir = new JButton(new ImageIcon("atras.png")); // se les asigna su funcion a los constructores
			Letrero = new JLabel("Forma de Pago");
			boton2 = new JButton("Efectivo");
			boton3 = new JButton("Tarjeta");

			efec1 = new JLabel("Recibi");
			efe1 = new JTextField();

			tarj1 = new JLabel("Ingresa el nombre del banco");
			tarj2 = new JLabel("Ingresa el numero de tarjeta");

			tarjeti1 = new JTextField();
			tarjeti2 = new JTextField();

			total1 = new JButton("Total");
			ToT1 = new JTextField();
			tiked1 = new JButton("Imprimir Tiket");
			Limpiar1 = new JButton("Limpiar");

			total2 = new JButton("Total");
			ToT2 = new JTextField();
			tiked2 = new JButton("Imprimir Tiket");
			Limpiar2 = new JButton("Limpiar");

			/************** personalisacion *****************/
			Letrero.setForeground(new java.awt.Color(1, 196, 134));
			Letrero.setFont(new java.awt.Font("Segoe UI Semibold", 5, 32));

			boton2.setFont(new java.awt.Font("Segoe UI Semibold", 4, 15));
			boton2.setBackground(new java.awt.Color(15, 75, 3));
			boton2.setForeground(new java.awt.Color(107, 209, 176));

			boton3.setFont(new java.awt.Font("Segoe UI Semibold", 4, 15));
			boton3.setBackground(new java.awt.Color(15, 75, 3));
			boton3.setForeground(new java.awt.Color(107, 209, 176));

			total1.setFont(new java.awt.Font("Segoe UI Semibold", 4, 15));
			total1.setBackground(new java.awt.Color(134, 0, 0));
			total1.setForeground(new java.awt.Color(2, 176, 36));

			total2.setFont(new java.awt.Font("Segoe UI Semibold", 4, 15));
			total2.setBackground(new java.awt.Color(134, 0, 0));
			total2.setForeground(new java.awt.Color(2, 176, 36));

			tiked1.setFont(new java.awt.Font("Segoe UI Semibold", 4, 15));
			tiked1.setBackground(new java.awt.Color(255, 228, 0));
			tiked1.setForeground(new java.awt.Color(102, 108, 130));

			tiked2.setFont(new java.awt.Font("Segoe UI Semibold", 4, 15));
			tiked2.setBackground(new java.awt.Color(255, 228, 0));
			tiked2.setForeground(new java.awt.Color(102, 108, 130));

			Limpiar1.setFont(new java.awt.Font("Segoe UI Semibold", 4, 15));
			Limpiar1.setBackground(new java.awt.Color(13, 145, 202));
			Limpiar1.setForeground(new java.awt.Color(3, 45, 64));

			Limpiar2.setFont(new java.awt.Font("Segoe UI Semibold", 4, 15));
			Limpiar2.setBackground(new java.awt.Color(13, 145, 202));
			Limpiar2.setForeground(new java.awt.Color(3, 45, 64));

			efec1.setForeground(new java.awt.Color(232, 17, 144));
			efec1.setFont(new java.awt.Font("Candara Regular", 4, 18));

			tarj1.setForeground(new java.awt.Color(232, 17, 144));
			tarj1.setFont(new java.awt.Font("Candara Regular", 4, 15));

			tarj2.setForeground(new java.awt.Color(232, 17, 144));
			tarj2.setFont(new java.awt.Font("Candara Regular", 4, 15));

			ToT1.setBorder(new javax.swing.border.LineBorder(Color.red, 3, true));
			ToT1.setBackground(new java.awt.Color(126, 70, 0));
			ToT1.setFont(new java.awt.Font("Lucida Console", 3, 14));
			ToT1.setForeground(Color.magenta);

			ToT2.setBorder(new javax.swing.border.LineBorder(Color.red, 3, true));
			ToT2.setBackground(new java.awt.Color(126, 70, 0));
			ToT2.setFont(new java.awt.Font("Lucida Console", 3, 14));
			ToT2.setForeground(Color.magenta);

			tarjeti1.setBorder(new javax.swing.border.LineBorder(Color.magenta, 3, true));
			tarjeti1.setBackground(new java.awt.Color(131, 16, 220));
			tarjeti1.setFont(new java.awt.Font("Lucida Console", 3, 14));
			tarjeti1.setForeground(Color.yellow);

			tarjeti2.setBorder(new javax.swing.border.LineBorder(Color.magenta, 3, true));
			tarjeti2.setBackground(new java.awt.Color(131, 16, 220));
			tarjeti2.setFont(new java.awt.Font("Lucida Console", 3, 14));
			tarjeti2.setForeground(Color.yellow);

			efe1.setBorder(new javax.swing.border.LineBorder(Color.magenta, 3, true));
			efe1.setBackground(new java.awt.Color(131, 16, 220));
			efe1.setFont(new java.awt.Font("Lucida Console", 3, 14));
			efe1.setForeground(Color.yellow);

			salir.setBorderPainted(false);
			salir.setContentAreaFilled(false);
			salir.setFocusPainted(false);
			salir.setOpaque(false);

			/******** posicion de los elementos ***************/

			p.add(salir); // se agragan al panel
			p.add(Letrero);
			p.add(boton2);
			p.add(boton3);

			Letrero.setBounds(250, 20, 350, 70); // se les da posicion en el panel
			boton2.setBounds(70, 100, 100, 40);
			boton3.setBounds(350, 100, 100, 40);

			salir.setBounds(300, 450, 100, 50);

			/* area de operaciones */
			if (cuartoA1.getState() == true) {
				res = res + 5500;
			}
			if (cuartoA2.getState() == true) {
				res = res + 15750;
			}
			if (cuartoA3.getState() == true) {
				res = res + 1000;
			}

			/* operaciones del restaurante */
			if (a1.getState() == true) { // inician las operaciones
				res = res + 750;
			}
			if (a2.getState() == true) {
				res = res + 1750;
			}
			if (a3.getState() == true) {
				res = res + 3680;
			}
			if (a4.getState() == true) {
				res = res + 6380;
			}
			if (a5.getState() == true) {
				res = res + 10580;
			}
			if (b1.getState() == true) {
				res = res + 100;
			}
			if (b2.getState() == true) {
				res = res + 300;
			}
			if (b3.getState() == true) {
				res = res + 50;
			}
			if (b4.getState() == true) {
				res = res + 150;
			}
			if (b5.getState() == true) {
				res = res + 500;
			}
			if (c1.getState() == true) {
				res = res + 1500;
			}
			if (c2.getState() == true) {
				res = res + 3400;
			}
			if (c3.getState() == true) {
				res = res + 2600;
			}
			if (c4.getState() == true) {
				res = res + 5500;
			}
			if (c5.getState() == true) {
				res = res + 10000;
			}

			/* operaciones de la guarderia */
			if (guarderiaA1.getState() == true) {
				res = res + 500;
			}
			if (guarderiaA2.getState() == true) {
				res = res + 1000;
			}
			if (guarderiaA3.getState() == true) {
				res = res + 1500;
			}
			if (guarderiaA4.getState() == true) {
				res = res + 2000;
			}
			if (guarderiaA5.getState() == true) {
				res = res + 2500;
			}

			/* operaciones de los trips Fam */
			if (tripSa1.getState() == true) {
				res = res + 7895;
			}
			if (tripSa2.getState() == true) {
				res = res + 5644;
			}
			if (tripSa2.getState() == true) {
				res = res + 8449;
			}
			if (tripSb1.getState() == true) {
				res = res + 9874;
			}
			if (tripSb2.getState() == true) {
				res = res + 16515;
			}
			if (tripSb3.getState() == true) {
				res = res + 2449;
			}
			if (tripSc1.getState() == true) {
				res = res + 9844;
			}
			if (tripSc2.getState() == true) {
				res = res + 1651;
			}
			if (tripSc3.getState() == true) {
				res = res + 1314;
			}

			/* operaciones de romm service */
			if (RomMa1.getState() == true) {
				res = res + 874984;
			}
			if (RomMa2.getState() == true) {
				res = res + 979444;
			}
			if (RomMa3.getState() == true) {
				res = res + 489444;
			}
			if (RomMb1.getState() == true) {
				res = res + 484494;
			}
			if (RomMb2.getState() == true) {
				res = res + 465165;
			}
			if (RomMb3.getState() == true) {
				res = res + 979844;
			}
			if (RomMc1.getState() == true) {
				res = res + 464446;
			}
			if (RomMc2.getState() == true) {
				res = res + 544646;
			}
			if (RomMc3.getState() == true) {
				res = res + 241650;
			}
			/***************************************/

			boton2.addActionListener(new ActionListener() { // se usa el ActionListener con sus metodos abstractos peros
				// usando solo botones
				public void actionPerformed(ActionEvent v) {
					p.add(efec1);
					p.add(efe1);

					efec1.setBounds(70, 200, 100, 30);
					efe1.setBounds(200, 200, 100, 25);

					p.add(total1);
					p.add(ToT1);
					p.add(tiked1);
					p.add(Limpiar1);

					total1.setBounds(70, 160, 100, 30);
					ToT1.setBounds(200, 160, 100, 25);
					tiked1.setBounds(70, 250, 150, 30);
					Limpiar1.setBounds(70, 310, 150, 30);

				}
			});

			boton3.addActionListener(new ActionListener() { // se usa el ActionListener con sus metodos abstractos peros
				// usando solo botones
				public void actionPerformed(ActionEvent v) {
					p.add(tarj1);
					p.add(tarj2);
					p.add(tarjeti1);
					p.add(tarjeti2);

					tarj1.setBounds(350, 200, 200, 30);
					tarj2.setBounds(350, 250, 200, 30);
					tarjeti1.setBounds(550, 200, 100, 25);
					tarjeti2.setBounds(550, 250, 100, 25);

					p.add(total2);
					p.add(ToT2);
					p.add(tiked2);
					p.add(Limpiar2);

					total2.setBounds(350, 160, 100, 30);
					ToT2.setBounds(550, 160, 100, 25);
					tiked2.setBounds(350, 300, 150, 30);
					Limpiar2.setBounds(350, 350, 150, 30);

				}
			});

			/****** pago en fecfectivo ************************************/

			total1.addActionListener(new ActionListener() { // se usa el ActionListener con sus metodos abstractos peros
				// usando solo botones
				public void actionPerformed(ActionEvent v) {
					JOptionPane.showMessageDialog(null, "Descuento del 10% en presio total!!!");
					double a, b;
					a = res * 0.20;
					b = res - a;
					ToT1.setText("$" + b);
				}
			});

			tiked1.addActionListener(new ActionListener() { // se usa el ActionListener con sus metodos abstractos peros
				// usando solo botones
				public void actionPerformed(ActionEvent v) {
					String ruta1 = "C:\\Users\\Rodrigo\\Desktop\\Tiked_de_pago_efectivo.txt";
					try {
						File arch1 = new File(ruta1);
						FileWriter ro1 = new FileWriter(arch1, true);

						ro1.write("-----------Tiked de pago----------------\n");
						ro1.write("-----------Real Hotel Marcona-----------\n");
						ro1.write("------Los mejores hoteles de México-----\n");
						ro1.write("-------senñor@: " + nom.getText() + "-------\n");
						ro1.write("-------Numero de personas: " + noper.getText() + "-------\n");
						ro1.write("-------Fecha de ingreso: " + fechin.getText() + "-------\n");
						ro1.write("-------Fecha de salida: " + fechsal.getText() + "-------\n");
						ro1.write("-------Origen del huesped: " + Orig.getText() + "-------\n\n");
						ro1.write("\n-------EL PRECIO A PAGAR ES: -----------\n");
						ro1.write("-------Sin descuento es de: " + res + " pesos-------\n");
						ro1.write("-------Ya con descuento es: " + ToT1.getText() + " pesos-------\n");
						ro1.write("-------Recibi: " + efe1.getText() + " pesos-------\n");

						ro1.write("\n------------Gracias por su preferencia------------");
						ro1.close();
					} catch (Exception er) {
						System.out.println("error" + er);

					}

				}
			});

			Limpiar1.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent v) {
					ToT1.setText(null);
					efe1.setText(null);
				}
			});

			/***************** pago con tarjeta **********************************/

			total2.addActionListener(new ActionListener() { // se usa el ActionListener con sus metodos abstractos peros
// usando solo botones
				public void actionPerformed(ActionEvent v) {
					JOptionPane.showMessageDialog(null, "Descuento del 30% en presio total!!!");
					double c, d;
					c = res * 0.30;
					d = res - c;
					ToT2.setText("$" + d);
				}
			});

			tiked2.addActionListener(new ActionListener() { // se usa el ActionListener con sus metodos abstractos peros
// usando solo botones
				public void actionPerformed(ActionEvent v) {
					String ruta2 = "C:\\Users\\Rodrigo\\Desktop\\Tiked_de_pago_tarjeta.txt";
					try {
						File arch2 = new File(ruta2);
						FileWriter ro2 = new FileWriter(arch2, true);

						ro2.write("-----------Tiked de pago----------------\n");
						ro2.write("-----------Real Hotel Marcona-----------\n");
						ro2.write("------Los mejores hoteles de México-----\n");
						ro2.write("-------senñor@: " + nom.getText() + "-----------------\n");
						ro2.write("-------Numero de personas: " + noper.getText() + "-------\n");
						ro2.write("-------Fecha de ingreso: " + fechin.getText() + "-------\n");
						ro2.write("-------Fecha de salida: " + fechsal.getText() + "-------\n");
						ro2.write("-------Origen del huesped: " + Orig.getText() + "-------\n\n");
						ro2.write("\n-------EL PRECIO A PAGAR ES: -----------\n");
						ro2.write("-------Sin descuento es de: " + res + " pesos-------\n");
						ro2.write("-------Ya con descuento es: " + ToT2.getText() + " pesos-------\n");
						ro2.write("-------Banco: " + tarjeti1.getText() + " ------------\n");
						ro2.write("-------NO de tarjeta: " + tarjeti2.getText() + " -----------\n");
						ro2.write("------------Gracias por su preferencia------------");
						ro2.close();
					} catch (Exception er) {
						System.out.println("error" + er);

					}

				}
			});

			Limpiar2.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent v) {
					ToT2.setText(null);
					tarjeti1.setText(null);
					tarjeti2.setText(null);
				}
			});

			salir.addActionListener(new ActionListener() { // se usa el ActionListener con sus metodos abstractos peros
															// usando solo botones
				public void actionPerformed(ActionEvent v) {

					dispose(); // es para cerrar la ventana
				}
			});
		}

		public void main(String... POO) {
			pago abrir = new pago();
			abrir.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			abrir.setVisible(true);
			abrir.setResizable(false);
		}

	} // fin clase forma de pago

	public static void main(String... POO) throws IOException {
		elHotel Rodrigo = new elHotel();
		Rodrigo.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Rodrigo.setVisible(true);
		Rodrigo.setResizable(false);
	}

}// fin de la clase proncipal OSEA LA CHIDA
