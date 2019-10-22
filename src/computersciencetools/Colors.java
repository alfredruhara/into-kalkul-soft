
package computersciencetools;

import java.awt.Color;
import java.util.ArrayList;
import javax.swing.JPanel;

public class Colors extends javax.swing.JFrame {
    
    int xx;
    int yy;
    double num1;
    double num2;
    double ans;
    String operator;
    private Object math;
    Brain brain= new Brain();
    
    
    private void ChadaApplyRgb() {
    //Var declaration
     int R,G,B;
     //Var initialization with Jslider value
     R= sliderred_col.getValue();
     G= slidergreen_col.getValue();
     B= sliderblue_col.getValue();
     colorOutput_col.setBackground(new Color(R,G,B));
    
     //Search the Rgb Color Name
    Colors rgb = new Colors();
    String keep =rgb.getColorNameFromRgb(R,G,B);
    colornameOutput_col.setText(keep);
   
    //Printing the Rga code
    String red= String.valueOf(R);
    String green= String.valueOf(G);
    String blue= String.valueOf(B);
    
    rbaOutput_col.setText(red+","+green+","+blue);
    }
    
    /*
      WORKING ON COLORS LOGIC 
    */
            // DataBase 
             private ArrayList<ColorServerReturn> initColorList() {
        
		ArrayList<ColorServerReturn> colorList = new ArrayList<ColorServerReturn>();
                
		colorList.add(new ColorServerReturn("AliceBlue", 0xF0, 0xF8, 0xFF));
		colorList.add(new ColorServerReturn("AntiqueWhite", 0xFA, 0xEB, 0xD7));
		colorList.add(new ColorServerReturn("Aqua", 0x00, 0xFF, 0xFF));
		colorList.add(new ColorServerReturn("Aquamarine", 0x7F, 0xFF, 0xD4));
		colorList.add(new ColorServerReturn("Azure", 0xF0, 0xFF, 0xFF));
		colorList.add(new ColorServerReturn("Beige", 0xF5, 0xF5, 0xDC));
		colorList.add(new ColorServerReturn("Bisque", 0xFF, 0xE4, 0xC4));
		colorList.add(new ColorServerReturn("Black", 0x00, 0x00, 0x00));
		colorList.add(new ColorServerReturn("BlanchedAlmond", 0xFF, 0xEB, 0xCD));
		colorList.add(new ColorServerReturn("Blue", 0x00, 0x00, 0xFF));
		colorList.add(new ColorServerReturn("BlueViolet", 0x8A, 0x2B, 0xE2));
		colorList.add(new ColorServerReturn("Brown", 0xA5, 0x2A, 0x2A));
		colorList.add(new ColorServerReturn("BurlyWood", 0xDE, 0xB8, 0x87));
		colorList.add(new ColorServerReturn("CadetBlue", 0x5F, 0x9E, 0xA0));
		colorList.add(new ColorServerReturn("Chartreuse", 0x7F, 0xFF, 0x00));
		colorList.add(new ColorServerReturn("Chocolate", 0xD2, 0x69, 0x1E));
		colorList.add(new ColorServerReturn("Coral", 0xFF, 0x7F, 0x50));
		colorList.add(new ColorServerReturn("CornflowerBlue", 0x64, 0x95, 0xED));
		colorList.add(new ColorServerReturn("Cornsilk", 0xFF, 0xF8, 0xDC));
		colorList.add(new ColorServerReturn("Crimson", 0xDC, 0x14, 0x3C));
		colorList.add(new ColorServerReturn("Cyan", 0x00, 0xFF, 0xFF));
		colorList.add(new ColorServerReturn("DarkBlue", 0x00, 0x00, 0x8B));
		colorList.add(new ColorServerReturn("DarkCyan", 0x00, 0x8B, 0x8B));
		colorList.add(new ColorServerReturn("DarkGoldenRod", 0xB8, 0x86, 0x0B));
		colorList.add(new ColorServerReturn("DarkGray", 0xA9, 0xA9, 0xA9));
		colorList.add(new ColorServerReturn("DarkGreen", 0x00, 0x64, 0x00));
		colorList.add(new ColorServerReturn("DarkKhaki", 0xBD, 0xB7, 0x6B));
		colorList.add(new ColorServerReturn("DarkMagenta", 0x8B, 0x00, 0x8B));
		colorList.add(new ColorServerReturn("DarkOliveGreen", 0x55, 0x6B, 0x2F));
		colorList.add(new ColorServerReturn("DarkOrange", 0xFF, 0x8C, 0x00));
		colorList.add(new ColorServerReturn("DarkOrchid", 0x99, 0x32, 0xCC));
		colorList.add(new ColorServerReturn("DarkRed", 0x8B, 0x00, 0x00));
		colorList.add(new ColorServerReturn("DarkSalmon", 0xE9, 0x96, 0x7A));
		colorList.add(new ColorServerReturn("DarkSeaGreen", 0x8F, 0xBC, 0x8F));
		colorList.add(new ColorServerReturn("DarkSlateBlue", 0x48, 0x3D, 0x8B));
		colorList.add(new ColorServerReturn("DarkSlateGray", 0x2F, 0x4F, 0x4F));
		colorList.add(new ColorServerReturn("DarkTurquoise", 0x00, 0xCE, 0xD1));
		colorList.add(new ColorServerReturn("DarkViolet", 0x94, 0x00, 0xD3));
		colorList.add(new ColorServerReturn("DeepPink", 0xFF, 0x14, 0x93));
		colorList.add(new ColorServerReturn("DeepSkyBlue", 0x00, 0xBF, 0xFF));
		colorList.add(new ColorServerReturn("DimGray", 0x69, 0x69, 0x69));
		colorList.add(new ColorServerReturn("DodgerBlue", 0x1E, 0x90, 0xFF));
		colorList.add(new ColorServerReturn("FireBrick", 0xB2, 0x22, 0x22));
		colorList.add(new ColorServerReturn("FloralWhite", 0xFF, 0xFA, 0xF0));
		colorList.add(new ColorServerReturn("ForestGreen", 0x22, 0x8B, 0x22));
		colorList.add(new ColorServerReturn("Fuchsia", 0xFF, 0x00, 0xFF));
		colorList.add(new ColorServerReturn("Gainsboro", 0xDC, 0xDC, 0xDC));
		colorList.add(new ColorServerReturn("GhostWhite", 0xF8, 0xF8, 0xFF));
		colorList.add(new ColorServerReturn("Gold", 0xFF, 0xD7, 0x00));
		colorList.add(new ColorServerReturn("GoldenRod", 0xDA, 0xA5, 0x20));
		colorList.add(new ColorServerReturn("Gray", 0x80, 0x80, 0x80));
		colorList.add(new ColorServerReturn("Green", 0x00, 0x80, 0x00));
		colorList.add(new ColorServerReturn("GreenYellow", 0xAD, 0xFF, 0x2F));
		colorList.add(new ColorServerReturn("HoneyDew", 0xF0, 0xFF, 0xF0));
		colorList.add(new ColorServerReturn("HotPink", 0xFF, 0x69, 0xB4));
		colorList.add(new ColorServerReturn("IndianRed", 0xCD, 0x5C, 0x5C));
		colorList.add(new ColorServerReturn("Indigo", 0x4B, 0x00, 0x82));
		colorList.add(new ColorServerReturn("Ivory", 0xFF, 0xFF, 0xF0));
		colorList.add(new ColorServerReturn("Khaki", 0xF0, 0xE6, 0x8C));
		colorList.add(new ColorServerReturn("Lavender", 0xE6, 0xE6, 0xFA));
		colorList.add(new ColorServerReturn("LavenderBlush", 0xFF, 0xF0, 0xF5));
		colorList.add(new ColorServerReturn("LawnGreen", 0x7C, 0xFC, 0x00));
		colorList.add(new ColorServerReturn("LemonChiffon", 0xFF, 0xFA, 0xCD));
		colorList.add(new ColorServerReturn("LightBlue", 0xAD, 0xD8, 0xE6));
		colorList.add(new ColorServerReturn("LightCoral", 0xF0, 0x80, 0x80));
		colorList.add(new ColorServerReturn("LightCyan", 0xE0, 0xFF, 0xFF));
		colorList.add(new ColorServerReturn("LightGoldenRodYellow", 0xFA, 0xFA, 0xD2));
		colorList.add(new ColorServerReturn("LightGray", 0xD3, 0xD3, 0xD3));
		colorList.add(new ColorServerReturn("LightGreen", 0x90, 0xEE, 0x90));
		colorList.add(new ColorServerReturn("LightPink", 0xFF, 0xB6, 0xC1));
		colorList.add(new ColorServerReturn("LightSalmon", 0xFF, 0xA0, 0x7A));
		colorList.add(new ColorServerReturn("LightSeaGreen", 0x20, 0xB2, 0xAA));
		colorList.add(new ColorServerReturn("LightSkyBlue", 0x87, 0xCE, 0xFA));
		colorList.add(new ColorServerReturn("LightSlateGray", 0x77, 0x88, 0x99));
		colorList.add(new ColorServerReturn("LightSteelBlue", 0xB0, 0xC4, 0xDE));
		colorList.add(new ColorServerReturn("LightYellow", 0xFF, 0xFF, 0xE0));
		colorList.add(new ColorServerReturn("Lime", 0x00, 0xFF, 0x00));
		colorList.add(new ColorServerReturn("LimeGreen", 0x32, 0xCD, 0x32));
		colorList.add(new ColorServerReturn("Linen", 0xFA, 0xF0, 0xE6));
		colorList.add(new ColorServerReturn("Magenta", 0xFF, 0x00, 0xFF));
		colorList.add(new ColorServerReturn("Maroon", 0x80, 0x00, 0x00));
		colorList.add(new ColorServerReturn("MediumAquaMarine", 0x66, 0xCD, 0xAA));
		colorList.add(new ColorServerReturn("MediumBlue", 0x00, 0x00, 0xCD));
		colorList.add(new ColorServerReturn("MediumOrchid", 0xBA, 0x55, 0xD3));
		colorList.add(new ColorServerReturn("MediumPurple", 0x93, 0x70, 0xDB));
		colorList.add(new ColorServerReturn("MediumSeaGreen", 0x3C, 0xB3, 0x71));
		colorList.add(new ColorServerReturn("MediumSlateBlue", 0x7B, 0x68, 0xEE));
		colorList.add(new ColorServerReturn("MediumSpringGreen", 0x00, 0xFA, 0x9A));
		colorList.add(new ColorServerReturn("MediumTurquoise", 0x48, 0xD1, 0xCC));
		colorList.add(new ColorServerReturn("MediumVioletRed", 0xC7, 0x15, 0x85));
		colorList.add(new ColorServerReturn("MidnightBlue", 0x19, 0x19, 0x70));
		colorList.add(new ColorServerReturn("MintCream", 0xF5, 0xFF, 0xFA));
		colorList.add(new ColorServerReturn("MistyRose", 0xFF, 0xE4, 0xE1));
		colorList.add(new ColorServerReturn("Moccasin", 0xFF, 0xE4, 0xB5));
		colorList.add(new ColorServerReturn("NavajoWhite", 0xFF, 0xDE, 0xAD));
		colorList.add(new ColorServerReturn("Navy", 0x00, 0x00, 0x80));
		colorList.add(new ColorServerReturn("OldLace", 0xFD, 0xF5, 0xE6));
		colorList.add(new ColorServerReturn("Olive", 0x80, 0x80, 0x00));
		colorList.add(new ColorServerReturn("OliveDrab", 0x6B, 0x8E, 0x23));
		colorList.add(new ColorServerReturn("Orange", 0xFF, 0xA5, 0x00));
		colorList.add(new ColorServerReturn("OrangeRed", 0xFF, 0x45, 0x00));
		colorList.add(new ColorServerReturn("Orchid", 0xDA, 0x70, 0xD6));
		colorList.add(new ColorServerReturn("PaleGoldenRod", 0xEE, 0xE8, 0xAA));
		colorList.add(new ColorServerReturn("PaleGreen", 0x98, 0xFB, 0x98));
		colorList.add(new ColorServerReturn("PaleTurquoise", 0xAF, 0xEE, 0xEE));
		colorList.add(new ColorServerReturn("PaleVioletRed", 0xDB, 0x70, 0x93));
		colorList.add(new ColorServerReturn("PapayaWhip", 0xFF, 0xEF, 0xD5));
		colorList.add(new ColorServerReturn("PeachPuff", 0xFF, 0xDA, 0xB9));
		colorList.add(new ColorServerReturn("Peru", 0xCD, 0x85, 0x3F));
		colorList.add(new ColorServerReturn("Pink", 0xFF, 0xC0, 0xCB));
		colorList.add(new ColorServerReturn("Plum", 0xDD, 0xA0, 0xDD));
		colorList.add(new ColorServerReturn("PowderBlue", 0xB0, 0xE0, 0xE6));
		colorList.add(new ColorServerReturn("Purple", 0x80, 0x00, 0x80));
		colorList.add(new ColorServerReturn("Red", 0xFF, 0x00, 0x00));
		colorList.add(new ColorServerReturn("RosyBrown", 0xBC, 0x8F, 0x8F));
		colorList.add(new ColorServerReturn("RoyalBlue", 0x41, 0x69, 0xE1));
		colorList.add(new ColorServerReturn("SaddleBrown", 0x8B, 0x45, 0x13));
		colorList.add(new ColorServerReturn("Salmon", 0xFA, 0x80, 0x72));
		colorList.add(new ColorServerReturn("SandyBrown", 0xF4, 0xA4, 0x60));
		colorList.add(new ColorServerReturn("SeaGreen", 0x2E, 0x8B, 0x57));
		colorList.add(new ColorServerReturn("SeaShell", 0xFF, 0xF5, 0xEE));
		colorList.add(new ColorServerReturn("Sienna", 0xA0, 0x52, 0x2D));
		colorList.add(new ColorServerReturn("Silver", 0xC0, 0xC0, 0xC0));
		colorList.add(new ColorServerReturn("SkyBlue", 0x87, 0xCE, 0xEB));
		colorList.add(new ColorServerReturn("SlateBlue", 0x6A, 0x5A, 0xCD));
		colorList.add(new ColorServerReturn("SlateGray", 0x70, 0x80, 0x90));
		colorList.add(new ColorServerReturn("Snow", 0xFF, 0xFA, 0xFA));
		colorList.add(new ColorServerReturn("SpringGreen", 0x00, 0xFF, 0x7F));
		colorList.add(new ColorServerReturn("SteelBlue", 0x46, 0x82, 0xB4));
		colorList.add(new ColorServerReturn("Tan", 0xD2, 0xB4, 0x8C));
		colorList.add(new ColorServerReturn("Teal", 0x00, 0x80, 0x80));
		colorList.add(new ColorServerReturn("Thistle", 0xD8, 0xBF, 0xD8));
		colorList.add(new ColorServerReturn("Tomato", 0xFF, 0x63, 0x47));
		colorList.add(new ColorServerReturn("Turquoise", 0x40, 0xE0, 0xD0));
		colorList.add(new ColorServerReturn("Violet", 0xEE, 0x82, 0xEE));
		colorList.add(new ColorServerReturn("Wheat", 0xF5, 0xDE, 0xB3));
		colorList.add(new ColorServerReturn("White", 0xFF, 0xFF, 0xFF));
		colorList.add(new ColorServerReturn("WhiteSmoke", 0xF5, 0xF5, 0xF5));
		colorList.add(new ColorServerReturn("Yellow", 0xFF, 0xFF, 0x00));
		colorList.add(new ColorServerReturn("YellowGreen", 0x9A, 0xCD, 0x32));
		return colorList;
        }
             
       //Math calculation and sample algo ::::: chadaaa ooooooooee     
       
        public String getColorNameFromRgb(int r, int g, int b) {
		ArrayList<ColorServerReturn> colorList = initColorList();
		ColorServerReturn closestMatch = null;
		int minMSE = Integer.MAX_VALUE;
		int mse;
		for (ColorServerReturn c : colorList) {
			mse = c.computeMSE(r, g, b);
			if (mse < minMSE) {
				minMSE = mse;
				closestMatch = c;
			}
		}

		if (closestMatch != null) {
			return closestMatch.getName();
		} else {
			return "No matched color name,check yiur rgb";
		}
	}
    
	public String getColorNameFromHex(int hexColor) {
		int r = (hexColor & 0xFF0000) >> 16;
		int g = (hexColor & 0xFF00) >> 8;
		int b = (hexColor & 0xFF);
		return getColorNameFromRgb(r, g, b);
	}

	public int colorToHex(Color c) {
		return Integer.decode("0x"
				+ Integer.toHexString(c.getRGB()).substring(2));
	}

	public String getColorNameFromColor(Color color) {
		return getColorNameFromRgb(color.getRed(), color.getGreen(),
				color.getBlue());
        }
    
   /*
      FIN D'ALGORITHM SUR LES COULEURS | END OF ALL METHODS NEEDED
    */ 
    public Colors() {
        initComponents();
        this.setLocationRelativeTo(null);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        bg = new javax.swing.JPanel();
        menu = new javax.swing.JPanel();
        title = new javax.swing.JLabel();
        standard = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        scientific = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        programmer = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        physic = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        chimistry = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        telecom = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        learntosuccess = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        colors = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        braintraining = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        timedata = new javax.swing.JPanel();
        jLabel10 = new javax.swing.JLabel();
        footer = new javax.swing.JLabel();
        toolbar = new javax.swing.JPanel();
        close = new javax.swing.JLabel();
        min = new javax.swing.JLabel();
        settings1 = new javax.swing.JLabel();
        help = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        Content = new javax.swing.JPanel();
        colo_nam_col = new javax.swing.JLabel();
        jLabel11_col = new javax.swing.JLabel();
        jLabel12_col = new javax.swing.JLabel();
        colornameInput_col = new javax.swing.JTextField();
        jLabel13_col = new javax.swing.JLabel();
        rgbInputa_col = new javax.swing.JTextField();
        jLabel14_col = new javax.swing.JLabel();
        hexaInput_col = new javax.swing.JTextField();
        clear_col = new javax.swing.JLabel();
        colorOutput_col = new javax.swing.JLabel();
        get_col = new javax.swing.JLabel();
        jLabel16_col = new javax.swing.JLabel();
        rgbOutput_col = new javax.swing.JLabel();
        jLabel18_col = new javax.swing.JLabel();
        colornameOutput_col = new javax.swing.JLabel();
        rbaOutput_col = new javax.swing.JLabel();
        hexaOutput_col = new javax.swing.JLabel();
        btn11_col = new javax.swing.JLabel();
        rgbInputb_col = new javax.swing.JTextField();
        rgbInputc_col = new javax.swing.JTextField();
        jLabel19_col = new javax.swing.JLabel();
        sliderred_col = new javax.swing.JSlider();
        redslider_col = new javax.swing.JLabel();
        greenslider_col = new javax.swing.JLabel();
        blueslider_col = new javax.swing.JLabel();
        slidergreen_col = new javax.swing.JSlider();
        sliderblue_col = new javax.swing.JSlider();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("standard");
        setBackground(new java.awt.Color(255, 255, 255));
        setName("standard"); // NOI18N
        setUndecorated(true);

        bg.setBackground(new java.awt.Color(255, 255, 255));

        menu.setBackground(new java.awt.Color(0, 51, 51));
        menu.setLayout(null);

        title.setFont(new java.awt.Font("Agency FB", 0, 48)); // NOI18N
        title.setForeground(new java.awt.Color(0, 102, 102));
        title.setText("Calculations");
        title.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                titleMousePressed(evt);
            }
        });
        menu.add(title);
        title.setBounds(10, 30, 230, 70);

        standard.setBackground(new java.awt.Color(0, 153, 153));
        standard.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                standardMousePressed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Agency FB", 0, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Standard");

        javax.swing.GroupLayout standardLayout = new javax.swing.GroupLayout(standard);
        standard.setLayout(standardLayout);
        standardLayout.setHorizontalGroup(
            standardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(standardLayout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 187, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(83, Short.MAX_VALUE))
        );
        standardLayout.setVerticalGroup(
            standardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, standardLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        menu.add(standard);
        standard.setBounds(0, 112, 310, 51);

        scientific.setBackground(new java.awt.Color(0, 102, 102));
        scientific.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                scientificMousePressed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Agency FB", 0, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Scienific ");

        javax.swing.GroupLayout scientificLayout = new javax.swing.GroupLayout(scientific);
        scientific.setLayout(scientificLayout);
        scientificLayout.setHorizontalGroup(
            scientificLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(scientificLayout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 187, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(63, Short.MAX_VALUE))
        );
        scientificLayout.setVerticalGroup(
            scientificLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, scientificLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        menu.add(scientific);
        scientific.setBounds(0, 160, 290, 51);

        programmer.setBackground(new java.awt.Color(0, 102, 102));
        programmer.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                programmerMousePressed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Agency FB", 0, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Programmer");

        javax.swing.GroupLayout programmerLayout = new javax.swing.GroupLayout(programmer);
        programmer.setLayout(programmerLayout);
        programmerLayout.setHorizontalGroup(
            programmerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(programmerLayout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 187, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(63, Short.MAX_VALUE))
        );
        programmerLayout.setVerticalGroup(
            programmerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, programmerLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        menu.add(programmer);
        programmer.setBounds(0, 210, 290, 51);

        physic.setBackground(new java.awt.Color(0, 102, 102));
        physic.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                physicMousePressed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Agency FB", 0, 24)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Physic");

        javax.swing.GroupLayout physicLayout = new javax.swing.GroupLayout(physic);
        physic.setLayout(physicLayout);
        physicLayout.setHorizontalGroup(
            physicLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(physicLayout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 187, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(63, Short.MAX_VALUE))
        );
        physicLayout.setVerticalGroup(
            physicLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, physicLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        menu.add(physic);
        physic.setBounds(0, 260, 290, 51);

        chimistry.setBackground(new java.awt.Color(0, 102, 102));
        chimistry.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                chimistryMousePressed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Agency FB", 0, 24)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Chimistry");

        javax.swing.GroupLayout chimistryLayout = new javax.swing.GroupLayout(chimistry);
        chimistry.setLayout(chimistryLayout);
        chimistryLayout.setHorizontalGroup(
            chimistryLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(chimistryLayout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 187, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(63, Short.MAX_VALUE))
        );
        chimistryLayout.setVerticalGroup(
            chimistryLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, chimistryLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        menu.add(chimistry);
        chimistry.setBounds(0, 310, 290, 51);

        telecom.setBackground(new java.awt.Color(0, 102, 102));
        telecom.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                telecomMousePressed(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Agency FB", 0, 24)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Telecom");

        javax.swing.GroupLayout telecomLayout = new javax.swing.GroupLayout(telecom);
        telecom.setLayout(telecomLayout);
        telecomLayout.setHorizontalGroup(
            telecomLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(telecomLayout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 187, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(63, Short.MAX_VALUE))
        );
        telecomLayout.setVerticalGroup(
            telecomLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, telecomLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        menu.add(telecom);
        telecom.setBounds(0, 360, 290, 51);

        learntosuccess.setBackground(new java.awt.Color(0, 102, 102));
        learntosuccess.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                learntosuccessMousePressed(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Agency FB", 0, 24)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Learn to Success");

        javax.swing.GroupLayout learntosuccessLayout = new javax.swing.GroupLayout(learntosuccess);
        learntosuccess.setLayout(learntosuccessLayout);
        learntosuccessLayout.setHorizontalGroup(
            learntosuccessLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(learntosuccessLayout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 187, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(66, Short.MAX_VALUE))
        );
        learntosuccessLayout.setVerticalGroup(
            learntosuccessLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, learntosuccessLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        menu.add(learntosuccess);
        learntosuccess.setBounds(0, 510, 290, 51);

        colors.setBackground(new java.awt.Color(0, 102, 102));
        colors.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                colorsMousePressed(evt);
            }
        });

        jLabel8.setFont(new java.awt.Font("Agency FB", 0, 24)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Colors");

        javax.swing.GroupLayout colorsLayout = new javax.swing.GroupLayout(colors);
        colors.setLayout(colorsLayout);
        colorsLayout.setHorizontalGroup(
            colorsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(colorsLayout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 187, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(63, Short.MAX_VALUE))
        );
        colorsLayout.setVerticalGroup(
            colorsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, colorsLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        menu.add(colors);
        colors.setBounds(0, 410, 290, 51);

        braintraining.setBackground(new java.awt.Color(0, 102, 102));

        jLabel9.setFont(new java.awt.Font("Agency FB", 0, 24)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("Brain Training");

        javax.swing.GroupLayout braintrainingLayout = new javax.swing.GroupLayout(braintraining);
        braintraining.setLayout(braintrainingLayout);
        braintrainingLayout.setHorizontalGroup(
            braintrainingLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(braintrainingLayout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 187, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(66, Short.MAX_VALUE))
        );
        braintrainingLayout.setVerticalGroup(
            braintrainingLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, braintrainingLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        menu.add(braintraining);
        braintraining.setBounds(0, 560, 290, 51);

        timedata.setBackground(new java.awt.Color(0, 102, 102));
        timedata.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                timedataMousePressed(evt);
            }
        });

        jLabel10.setFont(new java.awt.Font("Agency FB", 0, 24)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("Time & Data");

        javax.swing.GroupLayout timedataLayout = new javax.swing.GroupLayout(timedata);
        timedata.setLayout(timedataLayout);
        timedataLayout.setHorizontalGroup(
            timedataLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(timedataLayout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 187, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(66, Short.MAX_VALUE))
        );
        timedataLayout.setVerticalGroup(
            timedataLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, timedataLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        menu.add(timedata);
        timedata.setBounds(0, 460, 290, 51);

        footer.setFont(new java.awt.Font("Agency FB", 0, 18)); // NOI18N
        footer.setForeground(new java.awt.Color(0, 102, 102));
        footer.setText("Version 0.01  | CoopyRight 2017 | Eyesnet");
        menu.add(footer);
        footer.setBounds(30, 630, 250, 30);

        toolbar.setBackground(new java.awt.Color(255, 255, 255));
        toolbar.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                toolbarMouseDragged(evt);
            }
        });
        toolbar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                toolbarMousePressed(evt);
            }
        });

        close.setBackground(new java.awt.Color(255, 255, 255));
        close.setFont(new java.awt.Font("Cambria", 0, 36)); // NOI18N
        close.setForeground(new java.awt.Color(0, 51, 51));
        close.setIcon(new javax.swing.ImageIcon(getClass().getResource("/computersciencetools/icons/close.png"))); // NOI18N
        close.setText("X");
        close.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                closeMouseClicked(evt);
            }
        });

        min.setBackground(new java.awt.Color(255, 255, 255));
        min.setFont(new java.awt.Font("Cambria", 0, 36)); // NOI18N
        min.setForeground(new java.awt.Color(0, 51, 51));
        min.setIcon(new javax.swing.ImageIcon(getClass().getResource("/computersciencetools/icons/mino.png"))); // NOI18N
        min.setText("X");

        settings1.setBackground(new java.awt.Color(255, 255, 255));
        settings1.setFont(new java.awt.Font("Cambria", 0, 36)); // NOI18N
        settings1.setForeground(new java.awt.Color(0, 51, 51));
        settings1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/computersciencetools/icons/sett.png"))); // NOI18N
        settings1.setText("X");

        help.setBackground(new java.awt.Color(255, 255, 255));
        help.setFont(new java.awt.Font("Cambria", 0, 36)); // NOI18N
        help.setForeground(new java.awt.Color(0, 51, 51));
        help.setIcon(new javax.swing.ImageIcon(getClass().getResource("/computersciencetools/icons/help.png"))); // NOI18N
        help.setText("X");

        jSeparator1.setBackground(new java.awt.Color(0, 51, 51));
        jSeparator1.setForeground(new java.awt.Color(0, 51, 51));
        jSeparator1.setPreferredSize(new java.awt.Dimension(50, 40));

        javax.swing.GroupLayout toolbarLayout = new javax.swing.GroupLayout(toolbar);
        toolbar.setLayout(toolbarLayout);
        toolbarLayout.setHorizontalGroup(
            toolbarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, toolbarLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(settings1, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(help, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(min, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(close, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(6, 6, 6))
            .addComponent(jSeparator1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        toolbarLayout.setVerticalGroup(
            toolbarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(toolbarLayout.createSequentialGroup()
                .addGroup(toolbarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(toolbarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(settings1, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(help, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(toolbarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(close, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(min, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        Content.setBackground(new java.awt.Color(255, 255, 255));
        Content.setFocusTraversalPolicyProvider(true);
        Content.setFont(new java.awt.Font("Agency FB", 0, 18)); // NOI18N
        Content.setInheritsPopupMenu(true);
        Content.setName("content"); // NOI18N
        Content.setOpaque(false);

        colo_nam_col.setFont(new java.awt.Font("Agency FB", 1, 18)); // NOI18N
        colo_nam_col.setText("Color Name :");

        jLabel11_col.setFont(new java.awt.Font("Agency FB", 1, 24)); // NOI18N
        jLabel11_col.setForeground(new java.awt.Color(0, 51, 51));
        jLabel11_col.setText("Colors Calculator");

        jLabel12_col.setFont(new java.awt.Font("Agency FB", 1, 18)); // NOI18N
        jLabel12_col.setForeground(new java.awt.Color(0, 51, 51));
        jLabel12_col.setText("Color Name :");

        colornameInput_col.setFont(new java.awt.Font("Agency FB", 0, 24)); // NOI18N
        colornameInput_col.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        colornameInput_col.setFocusCycleRoot(true);
        colornameInput_col.setFocusTraversalPolicyProvider(true);

        jLabel13_col.setFont(new java.awt.Font("Agency FB", 1, 18)); // NOI18N
        jLabel13_col.setForeground(new java.awt.Color(0, 51, 51));
        jLabel13_col.setText("Or Color RGB :");

        rgbInputa_col.setFont(new java.awt.Font("Agency FB", 0, 24)); // NOI18N
        rgbInputa_col.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        rgbInputa_col.setFocusCycleRoot(true);
        rgbInputa_col.setFocusTraversalPolicyProvider(true);

        jLabel14_col.setFont(new java.awt.Font("Agency FB", 1, 18)); // NOI18N
        jLabel14_col.setForeground(new java.awt.Color(0, 51, 51));
        jLabel14_col.setText("Or Color Hex:");

        hexaInput_col.setFont(new java.awt.Font("Agency FB", 0, 24)); // NOI18N
        hexaInput_col.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        hexaInput_col.setFocusCycleRoot(true);
        hexaInput_col.setFocusTraversalPolicyProvider(true);

        clear_col.setBackground(new java.awt.Color(204, 102, 0));
        clear_col.setFont(new java.awt.Font("Agency FB", 0, 36)); // NOI18N
        clear_col.setForeground(new java.awt.Color(255, 255, 255));
        clear_col.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        clear_col.setText("Clear");
        clear_col.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, null, new java.awt.Color(204, 102, 0), new java.awt.Color(204, 102, 0), new java.awt.Color(204, 102, 0)));
        clear_col.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        clear_col.setFocusable(false);
        clear_col.setOpaque(true);
        clear_col.setRequestFocusEnabled(false);
        clear_col.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                clear_colMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                clear_colMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                clear_colMousePressed(evt);
            }
        });

        colorOutput_col.setBackground(new java.awt.Color(153, 153, 153));
        colorOutput_col.setFont(new java.awt.Font("Agency FB", 1, 36)); // NOI18N
        colorOutput_col.setForeground(new java.awt.Color(255, 255, 255));
        colorOutput_col.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        colorOutput_col.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        colorOutput_col.setFocusable(false);
        colorOutput_col.setOpaque(true);
        colorOutput_col.setRequestFocusEnabled(false);
        colorOutput_col.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                colorOutput_colMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                colorOutput_colMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                colorOutput_colMousePressed(evt);
            }
        });

        get_col.setBackground(new java.awt.Color(0, 102, 102));
        get_col.setFont(new java.awt.Font("Agency FB", 0, 36)); // NOI18N
        get_col.setForeground(new java.awt.Color(255, 255, 255));
        get_col.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        get_col.setText("Get");
        get_col.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, null, new java.awt.Color(0, 102, 102), new java.awt.Color(0, 102, 102), new java.awt.Color(0, 102, 102)));
        get_col.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        get_col.setFocusable(false);
        get_col.setOpaque(true);
        get_col.setRequestFocusEnabled(false);
        get_col.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                get_colMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                get_colMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                get_colMousePressed(evt);
            }
        });

        jLabel16_col.setFont(new java.awt.Font("Agency FB", 0, 18)); // NOI18N
        jLabel16_col.setText("Input  the color name or color RBA code or HexaDecimal code , specify one of them and click GET button to get all details about that color , the output will be given below");

        rgbOutput_col.setFont(new java.awt.Font("Agency FB", 1, 18)); // NOI18N
        rgbOutput_col.setText("Color RGB   :");

        jLabel18_col.setFont(new java.awt.Font("Agency FB", 1, 18)); // NOI18N
        jLabel18_col.setText("Color Hexa :");

        colornameOutput_col.setFont(new java.awt.Font("Agency FB", 1, 18)); // NOI18N
        colornameOutput_col.setForeground(new java.awt.Color(0, 102, 102));

        rbaOutput_col.setFont(new java.awt.Font("Agency FB", 1, 18)); // NOI18N
        rbaOutput_col.setForeground(new java.awt.Color(0, 102, 102));

        hexaOutput_col.setFont(new java.awt.Font("Agency FB", 1, 18)); // NOI18N
        hexaOutput_col.setForeground(new java.awt.Color(0, 102, 102));

        btn11_col.setBackground(new java.awt.Color(153, 153, 153));
        btn11_col.setFont(new java.awt.Font("Agency FB", 1, 36)); // NOI18N
        btn11_col.setForeground(new java.awt.Color(255, 255, 255));
        btn11_col.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btn11_col.setText("7");
        btn11_col.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, null, new java.awt.Color(153, 153, 153), new java.awt.Color(153, 153, 153), new java.awt.Color(153, 153, 153)));
        btn11_col.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn11_col.setFocusable(false);
        btn11_col.setOpaque(true);
        btn11_col.setRequestFocusEnabled(false);
        btn11_col.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btn11_colMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btn11_colMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btn11_colMousePressed(evt);
            }
        });

        rgbInputb_col.setFont(new java.awt.Font("Agency FB", 0, 24)); // NOI18N
        rgbInputb_col.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        rgbInputb_col.setFocusCycleRoot(true);
        rgbInputb_col.setFocusTraversalPolicyProvider(true);

        rgbInputc_col.setFont(new java.awt.Font("Agency FB", 0, 24)); // NOI18N
        rgbInputc_col.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        rgbInputc_col.setFocusCycleRoot(true);
        rgbInputc_col.setFocusTraversalPolicyProvider(true);

        jLabel19_col.setFont(new java.awt.Font("Agency FB", 0, 18)); // NOI18N
        jLabel19_col.setText("Some Familly of Calors ");

        sliderred_col.setBackground(new java.awt.Color(255, 255, 255));
        sliderred_col.setForeground(new java.awt.Color(204, 0, 0));
        sliderred_col.setMajorTickSpacing(50);
        sliderred_col.setMaximum(255);
        sliderred_col.setPaintLabels(true);
        sliderred_col.setPaintTicks(true);
        sliderred_col.setValue(0);
        sliderred_col.setFocusable(false);
        sliderred_col.setRequestFocusEnabled(false);
        sliderred_col.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                sliderred_colStateChanged(evt);
            }
        });

        redslider_col.setFont(new java.awt.Font("Agency FB", 1, 18)); // NOI18N
        redslider_col.setText("Red");

        greenslider_col.setFont(new java.awt.Font("Agency FB", 1, 18)); // NOI18N
        greenslider_col.setText("Green");

        blueslider_col.setFont(new java.awt.Font("Agency FB", 1, 18)); // NOI18N
        blueslider_col.setText("Blue");

        slidergreen_col.setBackground(new java.awt.Color(255, 255, 255));
        slidergreen_col.setForeground(new java.awt.Color(0, 153, 0));
        slidergreen_col.setMajorTickSpacing(50);
        slidergreen_col.setMaximum(255);
        slidergreen_col.setPaintLabels(true);
        slidergreen_col.setPaintTicks(true);
        slidergreen_col.setValue(0);
        slidergreen_col.setFocusable(false);
        slidergreen_col.setRequestFocusEnabled(false);
        slidergreen_col.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                slidergreen_colStateChanged(evt);
            }
        });

        sliderblue_col.setBackground(new java.awt.Color(255, 255, 255));
        sliderblue_col.setForeground(new java.awt.Color(0, 0, 153));
        sliderblue_col.setMajorTickSpacing(50);
        sliderblue_col.setMaximum(255);
        sliderblue_col.setPaintLabels(true);
        sliderblue_col.setPaintTicks(true);
        sliderblue_col.setValue(0);
        sliderblue_col.setFocusable(false);
        sliderblue_col.setRequestFocusEnabled(false);
        sliderblue_col.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                sliderblue_col_colStateChanged(evt);
            }
        });

        javax.swing.GroupLayout ContentLayout = new javax.swing.GroupLayout(Content);
        Content.setLayout(ContentLayout);
        ContentLayout.setHorizontalGroup(
            ContentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ContentLayout.createSequentialGroup()
                .addGroup(ContentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, ContentLayout.createSequentialGroup()
                        .addComponent(colorOutput_col, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(ContentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(ContentLayout.createSequentialGroup()
                                .addGroup(ContentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, ContentLayout.createSequentialGroup()
                                        .addComponent(colo_nam_col, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED))
                                    .addGroup(ContentLayout.createSequentialGroup()
                                        .addComponent(rgbOutput_col, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(10, 10, 10)))
                                .addGroup(ContentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(colornameOutput_col, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(rbaOutput_col, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(ContentLayout.createSequentialGroup()
                                .addComponent(jLabel18_col, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(hexaOutput_col, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(62, 62, 62)
                        .addGroup(ContentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(greenslider_col, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(blueslider_col, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(redslider_col, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(ContentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(sliderblue_col, javax.swing.GroupLayout.PREFERRED_SIZE, 286, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(slidergreen_col, javax.swing.GroupLayout.PREFERRED_SIZE, 286, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(sliderred_col, javax.swing.GroupLayout.PREFERRED_SIZE, 286, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jLabel11_col, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(ContentLayout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addGroup(ContentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel16_col, javax.swing.GroupLayout.PREFERRED_SIZE, 916, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(ContentLayout.createSequentialGroup()
                                .addComponent(clear_col, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(4, 4, 4)
                                .addComponent(jLabel12_col)
                                .addGap(31, 31, 31)
                                .addComponent(colornameInput_col, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jLabel13_col, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(rgbInputa_col, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(rgbInputb_col, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(rgbInputc_col, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel14_col, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(hexaInput_col, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(get_col, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                    .addComponent(btn11_col, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel19_col, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(27, Short.MAX_VALUE))
        );
        ContentLayout.setVerticalGroup(
            ContentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ContentLayout.createSequentialGroup()
                .addComponent(jLabel11_col, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(ContentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(ContentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(jLabel12_col, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(clear_col, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 52, Short.MAX_VALUE))
                    .addComponent(get_col, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(ContentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(hexaInput_col, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel14_col, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(rgbInputa_col, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel13_col, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(colornameInput_col, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(rgbInputb_col, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(rgbInputc_col, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(1, 1, 1)
                .addComponent(jLabel16_col, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(ContentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(ContentLayout.createSequentialGroup()
                        .addGroup(ContentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(colornameOutput_col, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(colo_nam_col, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(16, 16, 16)
                        .addGroup(ContentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(ContentLayout.createSequentialGroup()
                                .addComponent(rgbOutput_col, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel18_col, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(ContentLayout.createSequentialGroup()
                                .addComponent(rbaOutput_col, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(hexaOutput_col, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(ContentLayout.createSequentialGroup()
                        .addGroup(ContentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(ContentLayout.createSequentialGroup()
                                .addComponent(sliderred_col, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(slidergreen_col, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(ContentLayout.createSequentialGroup()
                                .addComponent(redslider_col)
                                .addGap(29, 29, 29)
                                .addComponent(greenslider_col)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(ContentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(blueslider_col)
                            .addComponent(sliderblue_col, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(colorOutput_col, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel19_col, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btn11_col)
                .addGap(248, 248, 248))
        );

        javax.swing.GroupLayout bgLayout = new javax.swing.GroupLayout(bg);
        bg.setLayout(bgLayout);
        bgLayout.setHorizontalGroup(
            bgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(bgLayout.createSequentialGroup()
                .addComponent(menu, javax.swing.GroupLayout.PREFERRED_SIZE, 290, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(bgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(toolbar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(Content, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );
        bgLayout.setVerticalGroup(
            bgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, bgLayout.createSequentialGroup()
                .addComponent(toolbar, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(Content, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addComponent(menu, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(bg, javax.swing.GroupLayout.PREFERRED_SIZE, 1242, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(bg, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void toolbarMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_toolbarMousePressed
        xx = evt.getX();
        yy = evt.getY();
    }//GEN-LAST:event_toolbarMousePressed

    private void toolbarMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_toolbarMouseDragged
      int x= evt.getXOnScreen();
      int y= evt.getYOnScreen();
       
      this.setLocation(x-xx, y-yy);
    }//GEN-LAST:event_toolbarMouseDragged

    private void closeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_closeMouseClicked
          System.exit(0);
    }//GEN-LAST:event_closeMouseClicked

    private void scientificMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_scientificMousePressed
        Scientific go_to= new Scientific();
        go_to.setVisible(true);
        this.setVisible(false);
        
        
         DefaultColorEffect(standard);
         
         setColorEffect(scientific);
         
         DefaultColorEffect(programmer);
         DefaultColorEffect(physic);
         DefaultColorEffect(chimistry);
         DefaultColorEffect(telecom);
         DefaultColorEffect(programmer);
         DefaultColorEffect(colors);
         DefaultColorEffect(timedata);
         DefaultColorEffect(learntosuccess);
         DefaultColorEffect(braintraining);
         
    }//GEN-LAST:event_scientificMousePressed

    private void standardMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_standardMousePressed
         
        
        
        DefaultColorEffect(scientific);
         
         setColorEffect(standard);
         
         DefaultColorEffect(programmer);
         DefaultColorEffect(physic);
         DefaultColorEffect(chimistry);
         DefaultColorEffect(telecom);
         DefaultColorEffect(programmer);
         DefaultColorEffect(colors);
         DefaultColorEffect(timedata);
         DefaultColorEffect(learntosuccess);
         DefaultColorEffect(braintraining);
    }//GEN-LAST:event_standardMousePressed

    private void programmerMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_programmerMousePressed
        Physic physici = new Physic();
              physic.setVisible(true);
              this.setVisible(false);
              
         Programmer go_Programmer = new Programmer ();
        go_Programmer.setVisible(true);
        
        this.setVisible(false);
        
        
        DefaultColorEffect(standard);
         
         setColorEffect(programmer);
        
         DefaultColorEffect(physic);
         DefaultColorEffect(chimistry);
         DefaultColorEffect(telecom);
         DefaultColorEffect(scientific);
         DefaultColorEffect(colors);
         DefaultColorEffect(timedata);
         DefaultColorEffect(learntosuccess);
         DefaultColorEffect(braintraining);
    }//GEN-LAST:event_programmerMousePressed

    private void physicMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_physicMousePressed
        DefaultColorEffect(standard);
         
         setColorEffect(physic);
        
         DefaultColorEffect(programmer);
         DefaultColorEffect(chimistry);
         DefaultColorEffect(telecom);
         DefaultColorEffect(scientific);
         DefaultColorEffect(colors);
         DefaultColorEffect(timedata);
         DefaultColorEffect(learntosuccess);
         DefaultColorEffect(braintraining);
    }//GEN-LAST:event_physicMousePressed

    private void chimistryMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_chimistryMousePressed
                DefaultColorEffect(standard);
         
         setColorEffect(chimistry);
        
         DefaultColorEffect(physic);
         DefaultColorEffect(programmer);
         DefaultColorEffect(telecom);
         DefaultColorEffect(scientific);
         DefaultColorEffect(colors);
         DefaultColorEffect(timedata);
         DefaultColorEffect(learntosuccess);
         DefaultColorEffect(braintraining);
    }//GEN-LAST:event_chimistryMousePressed

    private void telecomMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_telecomMousePressed
         DefaultColorEffect(standard);
         
         setColorEffect(telecom);
        
         DefaultColorEffect(physic);
         DefaultColorEffect(chimistry);
         DefaultColorEffect(programmer);
         DefaultColorEffect(scientific);
         DefaultColorEffect(colors);
         DefaultColorEffect(timedata);
         DefaultColorEffect(learntosuccess);
         DefaultColorEffect(braintraining);
    }//GEN-LAST:event_telecomMousePressed

    private void colorsMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_colorsMousePressed
         DefaultColorEffect(standard);
         
         setColorEffect(colors);
        
         DefaultColorEffect(physic);
         DefaultColorEffect(chimistry);
         DefaultColorEffect(telecom);
         DefaultColorEffect(scientific);
         DefaultColorEffect(programmer);
         DefaultColorEffect(timedata);
         DefaultColorEffect(learntosuccess);
         DefaultColorEffect(braintraining);
    }//GEN-LAST:event_colorsMousePressed

    private void timedataMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_timedataMousePressed
         DefaultColorEffect(standard);
         
         setColorEffect(timedata);
        
         DefaultColorEffect(physic);
         DefaultColorEffect(chimistry);
         DefaultColorEffect(telecom);
         DefaultColorEffect(scientific);
         DefaultColorEffect(colors);
         DefaultColorEffect(programmer);
         DefaultColorEffect(learntosuccess);
         DefaultColorEffect(braintraining);
    }//GEN-LAST:event_timedataMousePressed

    private void learntosuccessMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_learntosuccessMousePressed
         DefaultColorEffect(standard);
         
         setColorEffect(learntosuccess);
        
         DefaultColorEffect(physic);
         DefaultColorEffect(chimistry);
         DefaultColorEffect(telecom);
         DefaultColorEffect(scientific);
         DefaultColorEffect(colors);
         DefaultColorEffect(timedata);
         DefaultColorEffect(programmer);
         DefaultColorEffect(braintraining);
    }//GEN-LAST:event_learntosuccessMousePressed

    private void titleMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_titleMousePressed
       
        Home home_redirect = new Home();    //current page
        home_redirect.setVisible(true);   //new
        this.setVisible(false);     //current windows
        
    }//GEN-LAST:event_titleMousePressed

    private void get_colMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_get_colMouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_get_colMouseEntered

    private void get_colMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_get_colMouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_get_colMouseExited

    private void get_colMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_get_colMousePressed
       if( (!colornameInput_col.getText().isEmpty()) 
               && hexaInput_col.getText().isEmpty() 
               && rgbInputa_col.getText().isEmpty() ){
            //The user have specify the Color name   | Converting Color name to Hex and rgb
            
            Colors chada = new Colors();
            String getColorname = colornameInput_col.getText();  
//            Color color =Color.getColor(getColorname);
//            int returnRgb =chada.colorToHex(color);
//            System.out.println(returnRgb);
//            colornameOutput.setText(String.valueOf(returnRgb));


           
       }else if( ( ! hexaInput_col.getText().isEmpty() )
               && colornameInput_col.getText().isEmpty() 
               && rgbInputa_col.getText().isEmpty()  ){


           //The user have specify the Hexa decimal value  | Converting Hexa to Color name and Rgb
         Colors chada = new Colors();
               
         String keep =chada.getColorNameFromHex(Integer.parseInt(hexaInput_col.getText()));
         colornameOutput_col.setText(keep);
         
                
                
           
       }else if( (! rgbInputa_col.getText().isEmpty() )
               && colornameInput_col.getText().isEmpty() 
               && hexaInput_col.getText().isEmpty()  ){
           //The user have specify the Rba code       | Converting Rgb to color name and Hexdecimal
          Colors rgb = new Colors();
         String rgcode = rgbInputa_col.getText();
         int a=Integer.parseInt(rgbInputa_col.getText());
         int b=Integer.parseInt(rgbInputb_col.getText());;
         int c=Integer.parseInt(rgbInputc_col.getText());;
         String keep =rgb.getColorNameFromRgb(a,b,c);
         colornameOutput_col.setText(keep);
         rbaOutput_col.setText(rgbInputa_col.getText()+","+ rgbInputb_col.getText()+","+rgbInputc_col.getText());
         colorOutput_col.setBackground(new Color(a,b,c));
         
         rgb.getColorNameFromRgb(255,255,255);
       }else if(colornameInput_col.getText().isEmpty() 
               && hexaInput_col.getText().isEmpty() 
               && rgbInputa_col.getText().isEmpty()){
           //All fields the are EMPTY                  | error
       }else{
          //if the user have fill more than one field  | Error
       }
    }//GEN-LAST:event_get_colMousePressed

    private void clear_colMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_clear_colMouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_clear_colMouseEntered

    private void clear_colMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_clear_colMouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_clear_colMouseExited

    private void clear_colMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_clear_colMousePressed
        // TODO add your handling code here:
    }//GEN-LAST:event_clear_colMousePressed

    private void colorOutput_colMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_colorOutput_colMouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_colorOutput_colMouseEntered

    private void colorOutput_colMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_colorOutput_colMouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_colorOutput_colMouseExited

    private void colorOutput_colMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_colorOutput_colMousePressed
        // TODO add your handling code here:
    }//GEN-LAST:event_colorOutput_colMousePressed

    private void btn11_colMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn11_colMouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_btn11_colMouseEntered

    private void btn11_colMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn11_colMouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_btn11_colMouseExited

    private void btn11_colMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn11_colMousePressed
        // TODO add your handling code here:
    }//GEN-LAST:event_btn11_colMousePressed

    private void sliderred_colStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_sliderred_colStateChanged
        ChadaApplyRgb();
    }//GEN-LAST:event_sliderred_colStateChanged

    private void slidergreen_colStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_slidergreen_colStateChanged
        ChadaApplyRgb();
    }//GEN-LAST:event_slidergreen_colStateChanged

    private void sliderblue_col_colStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_sliderblue_col_colStateChanged
       ChadaApplyRgb();
    }//GEN-LAST:event_sliderblue_col_colStateChanged
   

   //this take effect like hover 
   public void setColorEffect(JPanel panel){
       
       panel.setBackground(new Color(0,153,153));
   }
   public void DefaultColorEffect(JPanel panel){
       
       panel.setBackground(new Color(0,102,102));
   }
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Windows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Colors.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Colors.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Colors.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Colors.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Colors().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Content;
    private javax.swing.JPanel bg;
    private javax.swing.JLabel blueslider_col;
    private javax.swing.JPanel braintraining;
    private javax.swing.JLabel btn11_col;
    private javax.swing.JPanel chimistry;
    private javax.swing.JLabel clear_col;
    private javax.swing.JLabel close;
    private javax.swing.JLabel colo_nam_col;
    private javax.swing.JLabel colorOutput_col;
    private javax.swing.JTextField colornameInput_col;
    private javax.swing.JLabel colornameOutput_col;
    private javax.swing.JPanel colors;
    private javax.swing.JLabel footer;
    private javax.swing.JLabel get_col;
    private javax.swing.JLabel greenslider_col;
    private javax.swing.JLabel help;
    private javax.swing.JTextField hexaInput_col;
    private javax.swing.JLabel hexaOutput_col;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11_col;
    private javax.swing.JLabel jLabel12_col;
    private javax.swing.JLabel jLabel13_col;
    private javax.swing.JLabel jLabel14_col;
    private javax.swing.JLabel jLabel16_col;
    private javax.swing.JLabel jLabel18_col;
    private javax.swing.JLabel jLabel19_col;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JPanel learntosuccess;
    private javax.swing.JPanel menu;
    private javax.swing.JLabel min;
    private javax.swing.JPanel physic;
    private javax.swing.JPanel programmer;
    private javax.swing.JLabel rbaOutput_col;
    private javax.swing.JLabel redslider_col;
    private javax.swing.JTextField rgbInputa_col;
    private javax.swing.JTextField rgbInputb_col;
    private javax.swing.JTextField rgbInputc_col;
    private javax.swing.JLabel rgbOutput_col;
    private javax.swing.JPanel scientific;
    private javax.swing.JLabel settings1;
    private javax.swing.JSlider sliderblue_col;
    private javax.swing.JSlider slidergreen_col;
    private javax.swing.JSlider sliderred_col;
    private javax.swing.JPanel standard;
    private javax.swing.JPanel telecom;
    private javax.swing.JPanel timedata;
    private javax.swing.JLabel title;
    private javax.swing.JPanel toolbar;
    // End of variables declaration//GEN-END:variables


}
