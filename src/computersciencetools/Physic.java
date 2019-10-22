
package computersciencetools;

import java.awt.Color;
import javax.swing.JPanel;


public class Physic extends javax.swing.JFrame {

    
    int xx;
    int yy;
    String dst="";
    
    public Physic() {
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
        amplaire_phy = new javax.swing.JLabel();
        jLabel14_phy = new javax.swing.JLabel();
        speed_phy = new javax.swing.JLabel();
        distance_phy = new javax.swing.JLabel();
        time_phy = new javax.swing.JLabel();
        val1_phy = new javax.swing.JTextField();
        val2_phy = new javax.swing.JTextField();
        screen2_phy = new javax.swing.JTextField();
        screen_phy = new javax.swing.JTextField();
        calc_phy = new javax.swing.JLabel();
        distance1_phy = new javax.swing.JLabel();
        sval3_phy = new javax.swing.JTextField();
        sval1_phy = new javax.swing.JTextField();
        sval2_phy = new javax.swing.JTextField();
        jTextField6_phy = new javax.swing.JTextField();
        jScrollPane1_phy = new javax.swing.JScrollPane();
        desc = new javax.swing.JTextArea();
        jLabel15_phy = new javax.swing.JLabel();
        jLabel16_phy = new javax.swing.JLabel();
        jLabel17_phy = new javax.swing.JLabel();
        bmi_phy = new javax.swing.JLabel();
        velocity_phy = new javax.swing.JLabel();
        force_phy = new javax.swing.JLabel();
        gravity_phy = new javax.swing.JLabel();
        accleration_phy = new javax.swing.JLabel();
        f0f_gravity_phy = new javax.swing.JLabel();
        work_phy = new javax.swing.JLabel();
        frequency_phy = new javax.swing.JLabel();
        faradays_law_phy = new javax.swing.JLabel();
        power_phy = new javax.swing.JLabel();
        density_phy = new javax.swing.JLabel();
        ohms_law_phy = new javax.swing.JLabel();
        energy_phy = new javax.swing.JLabel();
        snells_law_phy = new javax.swing.JLabel();
        gausss_law = new javax.swing.JLabel();
        evaluate_phy = new javax.swing.JLabel();
        _phy = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setName("home"); // NOI18N
        setUndecorated(true);

        bg.setBackground(new java.awt.Color(255, 255, 255));

        menu.setBackground(new java.awt.Color(0, 51, 51));
        menu.setLayout(null);

        title.setFont(new java.awt.Font("Agency FB", 0, 36)); // NOI18N
        title.setForeground(new java.awt.Color(0, 102, 102));
        title.setText("Code@Open source");
        menu.add(title);
        title.setBounds(20, 20, 230, 70);

        standard.setBackground(new java.awt.Color(0, 102, 102));
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

        physic.setBackground(new java.awt.Color(0, 153, 153));
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
        footer.setText("Version 0.01  | Code@Open Source 2018");
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
        min.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                minMousePressed(evt);
            }
        });

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
            .addGroup(toolbarLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(settings1, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(help, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(min, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(close, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(414, 414, 414))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, toolbarLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 1356, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        toolbarLayout.setVerticalGroup(
            toolbarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(toolbarLayout.createSequentialGroup()
                .addGroup(toolbarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(toolbarLayout.createSequentialGroup()
                        .addGroup(toolbarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(settings1, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(help, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, toolbarLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(toolbarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(min, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(close, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        Content.setBackground(new java.awt.Color(255, 255, 255));

        amplaire_phy.setFont(new java.awt.Font("Agency FB", 1, 24)); // NOI18N
        amplaire_phy.setForeground(new java.awt.Color(0, 51, 51));
        amplaire_phy.setText("Programmer Calculator");

        jLabel14_phy.setBackground(new java.awt.Color(255, 255, 255));
        jLabel14_phy.setFont(new java.awt.Font("Agency FB", 0, 18)); // NOI18N
        jLabel14_phy.setText("Distance, Speed and Time");

        speed_phy.setBackground(new java.awt.Color(153, 153, 153));
        speed_phy.setFont(new java.awt.Font("Agency FB", 0, 24)); // NOI18N
        speed_phy.setForeground(new java.awt.Color(255, 255, 255));
        speed_phy.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        speed_phy.setText("Speed");
        speed_phy.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, null, new java.awt.Color(153, 153, 153), new java.awt.Color(153, 153, 153), new java.awt.Color(153, 153, 153)));
        speed_phy.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        speed_phy.setFocusable(false);
        speed_phy.setOpaque(true);
        speed_phy.setRequestFocusEnabled(false);
        speed_phy.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                speed_phyMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                speed_phyMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                speed_phyMousePressed(evt);
            }
        });

        distance_phy.setBackground(new java.awt.Color(153, 153, 153));
        distance_phy.setFont(new java.awt.Font("Agency FB", 0, 24)); // NOI18N
        distance_phy.setForeground(new java.awt.Color(255, 255, 255));
        distance_phy.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        distance_phy.setText("Distance");
        distance_phy.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, null, new java.awt.Color(153, 153, 153), new java.awt.Color(153, 153, 153), new java.awt.Color(153, 153, 153)));
        distance_phy.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        distance_phy.setFocusable(false);
        distance_phy.setOpaque(true);
        distance_phy.setRequestFocusEnabled(false);
        distance_phy.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                distance_phyMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                distance_phyMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                distance_phyMousePressed(evt);
            }
        });

        time_phy.setBackground(new java.awt.Color(153, 153, 153));
        time_phy.setFont(new java.awt.Font("Agency FB", 0, 24)); // NOI18N
        time_phy.setForeground(new java.awt.Color(255, 255, 255));
        time_phy.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        time_phy.setText("Time");
        time_phy.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, null, new java.awt.Color(153, 153, 153), new java.awt.Color(153, 153, 153), new java.awt.Color(153, 153, 153)));
        time_phy.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        time_phy.setFocusable(false);
        time_phy.setOpaque(true);
        time_phy.setRequestFocusEnabled(false);
        time_phy.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                time_phyMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                time_phyMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                time_phyMousePressed(evt);
            }
        });

        val1_phy.setFont(new java.awt.Font("Agency FB", 0, 24)); // NOI18N
        val1_phy.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                val1_phyActionPerformed(evt);
            }
        });

        val2_phy.setFont(new java.awt.Font("Agency FB", 0, 24)); // NOI18N

        screen2_phy.setBackground(new java.awt.Color(240, 240, 240));
        screen2_phy.setFont(new java.awt.Font("Agency FB", 0, 24)); // NOI18N
        screen2_phy.setBorder(null);

        screen_phy.setBackground(new java.awt.Color(240, 240, 240));
        screen_phy.setFont(new java.awt.Font("Agency FB", 0, 36)); // NOI18N
        screen_phy.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        screen_phy.setText("0");
        screen_phy.setBorder(null);

        calc_phy.setBackground(new java.awt.Color(153, 153, 153));
        calc_phy.setFont(new java.awt.Font("Agency FB", 0, 24)); // NOI18N
        calc_phy.setForeground(new java.awt.Color(255, 255, 255));
        calc_phy.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        calc_phy.setText("Find");
        calc_phy.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, null, new java.awt.Color(153, 153, 153), new java.awt.Color(153, 153, 153), new java.awt.Color(153, 153, 153)));
        calc_phy.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        calc_phy.setFocusable(false);
        calc_phy.setOpaque(true);
        calc_phy.setRequestFocusEnabled(false);
        calc_phy.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                calc_phyMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                calc_phyMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                calc_phyMousePressed(evt);
            }
        });

        distance1_phy.setBackground(new java.awt.Color(204, 102, 0));
        distance1_phy.setFont(new java.awt.Font("Agency FB", 0, 24)); // NOI18N
        distance1_phy.setForeground(new java.awt.Color(255, 255, 255));
        distance1_phy.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        distance1_phy.setText("Clear");
        distance1_phy.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, null, new java.awt.Color(204, 102, 0), new java.awt.Color(204, 102, 0), new java.awt.Color(204, 102, 0)));
        distance1_phy.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        distance1_phy.setFocusable(false);
        distance1_phy.setOpaque(true);
        distance1_phy.setRequestFocusEnabled(false);
        distance1_phy.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                distance1_phyMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                distance1_phyMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                distance1_phyMousePressed(evt);
            }
        });

        sval1_phy.setEditable(false);
        sval1_phy.setFont(new java.awt.Font("Agency FB", 0, 24)); // NOI18N
        sval1_phy.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        sval1_phy.setBorder(null);

        sval2_phy.setEditable(false);
        sval2_phy.setFont(new java.awt.Font("Agency FB", 0, 24)); // NOI18N
        sval2_phy.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        sval2_phy.setBorder(null);

        jTextField6_phy.setEditable(false);
        jTextField6_phy.setFont(new java.awt.Font("Agency FB", 0, 24)); // NOI18N
        jTextField6_phy.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        jTextField6_phy.setBorder(null);

        desc.setColumns(20);
        desc.setFont(new java.awt.Font("Agency FB", 0, 18)); // NOI18N
        desc.setRows(5);
        jScrollPane1_phy.setViewportView(desc);

        jLabel15_phy.setBackground(new java.awt.Color(255, 255, 255));
        jLabel15_phy.setFont(new java.awt.Font("Agency FB", 1, 18)); // NOI18N
        jLabel15_phy.setText("Description Area ");

        jLabel16_phy.setBackground(new java.awt.Color(255, 255, 255));
        jLabel16_phy.setFont(new java.awt.Font("Agency FB", 1, 18)); // NOI18N
        jLabel16_phy.setText("Learn Area");

        jLabel17_phy.setBackground(new java.awt.Color(255, 255, 255));
        jLabel17_phy.setFont(new java.awt.Font("Agency FB", 1, 18)); // NOI18N
        jLabel17_phy.setText("Input Problem");

        bmi_phy.setBackground(new java.awt.Color(153, 153, 153));
        bmi_phy.setFont(new java.awt.Font("Agency FB", 0, 24)); // NOI18N
        bmi_phy.setForeground(new java.awt.Color(255, 255, 255));
        bmi_phy.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        bmi_phy.setText("BMI");
        bmi_phy.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, null, new java.awt.Color(153, 153, 153), new java.awt.Color(153, 153, 153), new java.awt.Color(153, 153, 153)));
        bmi_phy.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        bmi_phy.setFocusable(false);
        bmi_phy.setOpaque(true);
        bmi_phy.setRequestFocusEnabled(false);
        bmi_phy.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                bmi_phyMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                bmi_phyMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                bmi_phyMousePressed(evt);
            }
        });

        velocity_phy.setBackground(new java.awt.Color(153, 153, 153));
        velocity_phy.setFont(new java.awt.Font("Agency FB", 0, 24)); // NOI18N
        velocity_phy.setForeground(new java.awt.Color(255, 255, 255));
        velocity_phy.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        velocity_phy.setText("Velocity");
        velocity_phy.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, null, new java.awt.Color(153, 153, 153), new java.awt.Color(153, 153, 153), new java.awt.Color(153, 153, 153)));
        velocity_phy.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        velocity_phy.setFocusable(false);
        velocity_phy.setOpaque(true);
        velocity_phy.setRequestFocusEnabled(false);
        velocity_phy.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                velocity_phyMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                velocity_phyMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                velocity_phyMousePressed(evt);
            }
        });

        force_phy.setBackground(new java.awt.Color(153, 153, 153));
        force_phy.setFont(new java.awt.Font("Agency FB", 0, 24)); // NOI18N
        force_phy.setForeground(new java.awt.Color(255, 255, 255));
        force_phy.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        force_phy.setText("Force");
        force_phy.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, null, new java.awt.Color(153, 153, 153), new java.awt.Color(153, 153, 153), new java.awt.Color(153, 153, 153)));
        force_phy.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        force_phy.setFocusable(false);
        force_phy.setOpaque(true);
        force_phy.setRequestFocusEnabled(false);
        force_phy.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                force_phyMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                force_phyMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                force_phyMousePressed(evt);
            }
        });

        gravity_phy.setBackground(new java.awt.Color(153, 153, 153));
        gravity_phy.setFont(new java.awt.Font("Agency FB", 0, 24)); // NOI18N
        gravity_phy.setForeground(new java.awt.Color(255, 255, 255));
        gravity_phy.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        gravity_phy.setText("Gravity");
        gravity_phy.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, null, new java.awt.Color(153, 153, 153), new java.awt.Color(153, 153, 153), new java.awt.Color(153, 153, 153)));
        gravity_phy.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        gravity_phy.setFocusable(false);
        gravity_phy.setOpaque(true);
        gravity_phy.setRequestFocusEnabled(false);
        gravity_phy.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                gravity_phyMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                gravity_phyMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                gravity_phyMousePressed(evt);
            }
        });

        accleration_phy.setBackground(new java.awt.Color(153, 153, 153));
        accleration_phy.setFont(new java.awt.Font("Agency FB", 0, 24)); // NOI18N
        accleration_phy.setForeground(new java.awt.Color(255, 255, 255));
        accleration_phy.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        accleration_phy.setText("Acceleration ");
        accleration_phy.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, null, new java.awt.Color(153, 153, 153), new java.awt.Color(153, 153, 153), new java.awt.Color(153, 153, 153)));
        accleration_phy.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        accleration_phy.setFocusable(false);
        accleration_phy.setOpaque(true);
        accleration_phy.setRequestFocusEnabled(false);
        accleration_phy.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                accleration_phyMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                accleration_phyMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                accleration_phyMousePressed(evt);
            }
        });

        f0f_gravity_phy.setBackground(new java.awt.Color(153, 153, 153));
        f0f_gravity_phy.setFont(new java.awt.Font("Agency FB", 0, 24)); // NOI18N
        f0f_gravity_phy.setForeground(new java.awt.Color(255, 255, 255));
        f0f_gravity_phy.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        f0f_gravity_phy.setText("F of gravity");
        f0f_gravity_phy.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, null, new java.awt.Color(153, 153, 153), new java.awt.Color(153, 153, 153), new java.awt.Color(153, 153, 153)));
        f0f_gravity_phy.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        f0f_gravity_phy.setFocusable(false);
        f0f_gravity_phy.setOpaque(true);
        f0f_gravity_phy.setRequestFocusEnabled(false);
        f0f_gravity_phy.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                f0f_gravity_phyMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                f0f_gravity_phyMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                f0f_gravity_phyMousePressed(evt);
            }
        });

        work_phy.setBackground(new java.awt.Color(153, 153, 153));
        work_phy.setFont(new java.awt.Font("Agency FB", 0, 24)); // NOI18N
        work_phy.setForeground(new java.awt.Color(255, 255, 255));
        work_phy.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        work_phy.setText("Work");
        work_phy.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, null, new java.awt.Color(153, 153, 153), new java.awt.Color(153, 153, 153), new java.awt.Color(153, 153, 153)));
        work_phy.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        work_phy.setFocusable(false);
        work_phy.setOpaque(true);
        work_phy.setRequestFocusEnabled(false);
        work_phy.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                work_phyMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                work_phyMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                work_phyMousePressed(evt);
            }
        });

        frequency_phy.setBackground(new java.awt.Color(153, 153, 153));
        frequency_phy.setFont(new java.awt.Font("Agency FB", 0, 24)); // NOI18N
        frequency_phy.setForeground(new java.awt.Color(255, 255, 255));
        frequency_phy.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        frequency_phy.setText("frequency");
        frequency_phy.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, null, new java.awt.Color(153, 153, 153), new java.awt.Color(153, 153, 153), new java.awt.Color(153, 153, 153)));
        frequency_phy.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        frequency_phy.setFocusable(false);
        frequency_phy.setOpaque(true);
        frequency_phy.setRequestFocusEnabled(false);
        frequency_phy.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                frequency_phyMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                frequency_phyMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                frequency_phyMousePressed(evt);
            }
        });

        faradays_law_phy.setBackground(new java.awt.Color(153, 153, 153));
        faradays_law_phy.setFont(new java.awt.Font("Agency FB", 0, 24)); // NOI18N
        faradays_law_phy.setForeground(new java.awt.Color(255, 255, 255));
        faradays_law_phy.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        faradays_law_phy.setText("faraday's law");
        faradays_law_phy.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, null, new java.awt.Color(153, 153, 153), new java.awt.Color(153, 153, 153), new java.awt.Color(153, 153, 153)));
        faradays_law_phy.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        faradays_law_phy.setFocusable(false);
        faradays_law_phy.setOpaque(true);
        faradays_law_phy.setRequestFocusEnabled(false);
        faradays_law_phy.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                faradays_law_phyMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                faradays_law_phyMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                faradays_law_phyMousePressed(evt);
            }
        });

        power_phy.setBackground(new java.awt.Color(153, 153, 153));
        power_phy.setFont(new java.awt.Font("Agency FB", 0, 24)); // NOI18N
        power_phy.setForeground(new java.awt.Color(255, 255, 255));
        power_phy.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        power_phy.setText("Power");
        power_phy.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, null, new java.awt.Color(153, 153, 153), new java.awt.Color(153, 153, 153), new java.awt.Color(153, 153, 153)));
        power_phy.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        power_phy.setFocusable(false);
        power_phy.setOpaque(true);
        power_phy.setRequestFocusEnabled(false);
        power_phy.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                power_phyMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                power_phyMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                power_phyMousePressed(evt);
            }
        });

        density_phy.setBackground(new java.awt.Color(153, 153, 153));
        density_phy.setFont(new java.awt.Font("Agency FB", 0, 24)); // NOI18N
        density_phy.setForeground(new java.awt.Color(255, 255, 255));
        density_phy.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        density_phy.setText("density");
        density_phy.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, null, new java.awt.Color(153, 153, 153), new java.awt.Color(153, 153, 153), new java.awt.Color(153, 153, 153)));
        density_phy.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        density_phy.setFocusable(false);
        density_phy.setOpaque(true);
        density_phy.setRequestFocusEnabled(false);
        density_phy.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                density_phyMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                density_phyMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                density_phyMousePressed(evt);
            }
        });

        ohms_law_phy.setBackground(new java.awt.Color(153, 153, 153));
        ohms_law_phy.setFont(new java.awt.Font("Agency FB", 0, 24)); // NOI18N
        ohms_law_phy.setForeground(new java.awt.Color(255, 255, 255));
        ohms_law_phy.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        ohms_law_phy.setText("ohm's law");
        ohms_law_phy.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, null, new java.awt.Color(153, 153, 153), new java.awt.Color(153, 153, 153), new java.awt.Color(153, 153, 153)));
        ohms_law_phy.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        ohms_law_phy.setFocusable(false);
        ohms_law_phy.setOpaque(true);
        ohms_law_phy.setRequestFocusEnabled(false);
        ohms_law_phy.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                ohms_law_phyMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                ohms_law_phyMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                ohms_law_phyMousePressed(evt);
            }
        });

        energy_phy.setBackground(new java.awt.Color(153, 153, 153));
        energy_phy.setFont(new java.awt.Font("Agency FB", 0, 24)); // NOI18N
        energy_phy.setForeground(new java.awt.Color(255, 255, 255));
        energy_phy.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        energy_phy.setText("Energy");
        energy_phy.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, null, new java.awt.Color(153, 153, 153), new java.awt.Color(153, 153, 153), new java.awt.Color(153, 153, 153)));
        energy_phy.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        energy_phy.setFocusable(false);
        energy_phy.setOpaque(true);
        energy_phy.setRequestFocusEnabled(false);
        energy_phy.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                energy_phyMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                energy_phyMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                energy_phyMousePressed(evt);
            }
        });

        snells_law_phy.setBackground(new java.awt.Color(153, 153, 153));
        snells_law_phy.setFont(new java.awt.Font("Agency FB", 0, 24)); // NOI18N
        snells_law_phy.setForeground(new java.awt.Color(255, 255, 255));
        snells_law_phy.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        snells_law_phy.setText("snell's law");
        snells_law_phy.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, null, new java.awt.Color(153, 153, 153), new java.awt.Color(153, 153, 153), new java.awt.Color(153, 153, 153)));
        snells_law_phy.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        snells_law_phy.setFocusable(false);
        snells_law_phy.setOpaque(true);
        snells_law_phy.setRequestFocusEnabled(false);
        snells_law_phy.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                snells_law_phyMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                snells_law_phyMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                snells_law_phyMousePressed(evt);
            }
        });

        gausss_law.setBackground(new java.awt.Color(153, 153, 153));
        gausss_law.setFont(new java.awt.Font("Agency FB", 0, 24)); // NOI18N
        gausss_law.setForeground(new java.awt.Color(255, 255, 255));
        gausss_law.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        gausss_law.setText("gauss's law");
        gausss_law.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, null, new java.awt.Color(153, 153, 153), new java.awt.Color(153, 153, 153), new java.awt.Color(153, 153, 153)));
        gausss_law.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        gausss_law.setFocusable(false);
        gausss_law.setOpaque(true);
        gausss_law.setRequestFocusEnabled(false);
        gausss_law.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                gausss_lawMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                gausss_lawMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                gausss_lawMousePressed(evt);
            }
        });

        evaluate_phy.setBackground(new java.awt.Color(153, 153, 153));
        evaluate_phy.setFont(new java.awt.Font("Agency FB", 0, 24)); // NOI18N
        evaluate_phy.setForeground(new java.awt.Color(255, 255, 255));
        evaluate_phy.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        evaluate_phy.setText("Evauate");
        evaluate_phy.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, null, new java.awt.Color(153, 153, 153), new java.awt.Color(153, 153, 153), new java.awt.Color(153, 153, 153)));
        evaluate_phy.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        evaluate_phy.setFocusable(false);
        evaluate_phy.setOpaque(true);
        evaluate_phy.setRequestFocusEnabled(false);
        evaluate_phy.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                evaluate_phyMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                evaluate_phyMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                evaluate_phyMousePressed(evt);
            }
        });

        _phy.setEditable(false);
        _phy.setFont(new java.awt.Font("Agency FB", 0, 24)); // NOI18N
        _phy.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        _phy.setBorder(null);

        javax.swing.GroupLayout ContentLayout = new javax.swing.GroupLayout(Content);
        Content.setLayout(ContentLayout);
        ContentLayout.setHorizontalGroup(
            ContentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ContentLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(ContentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(amplaire_phy, javax.swing.GroupLayout.PREFERRED_SIZE, 203, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(ContentLayout.createSequentialGroup()
                        .addComponent(distance1_phy, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(9, 9, 9)
                        .addComponent(screen_phy, javax.swing.GroupLayout.PREFERRED_SIZE, 463, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(screen2_phy, javax.swing.GroupLayout.PREFERRED_SIZE, 355, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel14_phy, javax.swing.GroupLayout.PREFERRED_SIZE, 332, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(ContentLayout.createSequentialGroup()
                        .addGroup(ContentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(sval1_phy, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel15_phy, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel16_phy, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel17_phy, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(ContentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(ContentLayout.createSequentialGroup()
                                .addComponent(val2_phy, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(sval2_phy, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(val1_phy, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jTextField6_phy, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(sval3_phy, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jScrollPane1_phy)))
                    .addGroup(ContentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(_phy, javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, ContentLayout.createSequentialGroup()
                            .addGroup(ContentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, ContentLayout.createSequentialGroup()
                                    .addComponent(bmi_phy, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(18, 18, 18)
                                    .addComponent(velocity_phy, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(accleration_phy, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(18, 18, 18)
                                    .addComponent(faradays_law_phy, javax.swing.GroupLayout.DEFAULT_SIZE, 125, Short.MAX_VALUE))
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, ContentLayout.createSequentialGroup()
                                    .addGroup(ContentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(distance_phy, javax.swing.GroupLayout.DEFAULT_SIZE, 104, Short.MAX_VALUE)
                                        .addComponent(force_phy, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                    .addGap(18, 18, 18)
                                    .addGroup(ContentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(f0f_gravity_phy, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(speed_phy, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGap(18, 18, 18)
                                    .addGroup(ContentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addGroup(ContentLayout.createSequentialGroup()
                                            .addComponent(time_phy, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGap(18, 18, 18)
                                            .addComponent(work_phy, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(ContentLayout.createSequentialGroup()
                                            .addComponent(gravity_phy, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGap(18, 18, 18)
                                            .addComponent(frequency_phy, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addGroup(ContentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(density_phy, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(power_phy, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(ohms_law_phy, javax.swing.GroupLayout.DEFAULT_SIZE, 131, Short.MAX_VALUE))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addGroup(ContentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(ContentLayout.createSequentialGroup()
                                    .addGroup(ContentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(gausss_law, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(snells_law_phy, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(calc_phy, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(ContentLayout.createSequentialGroup()
                                    .addComponent(energy_phy, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(evaluate_phy, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                .addContainerGap(1244, Short.MAX_VALUE))
        );
        ContentLayout.setVerticalGroup(
            ContentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ContentLayout.createSequentialGroup()
                .addComponent(amplaire_phy, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(ContentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(distance1_phy, javax.swing.GroupLayout.DEFAULT_SIZE, 49, Short.MAX_VALUE)
                    .addGroup(ContentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(screen2_phy, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(screen_phy, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(12, 12, 12)
                .addGroup(ContentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(ContentLayout.createSequentialGroup()
                        .addGroup(ContentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(val2_phy, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(sval1_phy, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(sval2_phy, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(ContentLayout.createSequentialGroup()
                                .addGap(2, 2, 2)
                                .addComponent(jTextField6_phy, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(sval3_phy, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(5, 5, 5)
                        .addGroup(ContentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(ContentLayout.createSequentialGroup()
                                .addComponent(jLabel15_phy, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel17_phy, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel16_phy, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jScrollPane1_phy))
                        .addGroup(ContentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(ContentLayout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addComponent(jLabel14_phy, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addGroup(ContentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(distance_phy, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(speed_phy, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(time_phy, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(work_phy, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(energy_phy, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(power_phy, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(ContentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(ContentLayout.createSequentialGroup()
                                        .addGap(86, 86, 86)
                                        .addComponent(gausss_law, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, ContentLayout.createSequentialGroup()
                                        .addGap(18, 18, 18)
                                        .addGroup(ContentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                            .addComponent(force_phy, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(f0f_gravity_phy, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(gravity_phy, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(frequency_phy, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(density_phy, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(snells_law_phy, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(27, 27, 27)
                                        .addGroup(ContentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                            .addComponent(bmi_phy, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(velocity_phy, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(accleration_phy, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(faradays_law_phy, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(ohms_law_phy, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                            .addGroup(ContentLayout.createSequentialGroup()
                                .addGap(70, 70, 70)
                                .addComponent(evaluate_phy, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(calc_phy, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addComponent(val1_phy, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 20, Short.MAX_VALUE)
                .addComponent(_phy, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout bgLayout = new javax.swing.GroupLayout(bg);
        bg.setLayout(bgLayout);
        bgLayout.setHorizontalGroup(
            bgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(bgLayout.createSequentialGroup()
                .addComponent(menu, javax.swing.GroupLayout.PREFERRED_SIZE, 290, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(bgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(bgLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(toolbar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(841, 841, 841))
                    .addGroup(bgLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Content, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        bgLayout.setVerticalGroup(
            bgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(bgLayout.createSequentialGroup()
                .addComponent(toolbar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Content, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addComponent(menu, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(bg, javax.swing.GroupLayout.PREFERRED_SIZE, 1248, javax.swing.GroupLayout.PREFERRED_SIZE)
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
         Scientific scientific_go = new Scientific();
              scientific_go.setVisible(true);
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
        
        Standard standard_redirect = new Standard(); //new page
        Physic home_redirect = new Physic();    //current page
        
        
        standard_redirect.setVisible(true);   //new
        this.setVisible(false);     //current windows
        
        
        
        
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

    private void speed_phyMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_speed_phyMouseEntered
        if(!dst.equals("speed")){
           speed_phy.setBackground(new Color(0,102,102));
        }
    }//GEN-LAST:event_speed_phyMouseEntered

    private void speed_phyMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_speed_phyMouseExited
       if(!dst.equals("speed")){
           speed_phy.setBackground(new Color(153,153,153));
        }
    }//GEN-LAST:event_speed_phyMouseExited

    private void speed_phyMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_speed_phyMousePressed
         dst = "speed";
        speed_phy.setBackground(new Color(204,102,0));
        distance_phy.setBackground(new Color(153,153,153));
        time_phy.setBackground(new Color(153,153,153));
        sval1_phy.setText("Distance :");
        sval2_phy.setText("Time  :");
        desc.setText("Specify the Distance value and Time to find the Speed !"
                + "\n Average speed = total distance / total time. ");
        screen2_phy.setText("Speed = distance / Time");
        
    }//GEN-LAST:event_speed_phyMousePressed

    private void distance_phyMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_distance_phyMouseEntered
        if(!dst.equals("distance")){
           distance_phy.setBackground(new Color(0,102,102));
        }
    }//GEN-LAST:event_distance_phyMouseEntered

    private void distance_phyMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_distance_phyMouseExited
        if(!dst.equals("distance")){
            
             distance_phy.setBackground(new Color(153,153,153));
             
        }
    }//GEN-LAST:event_distance_phyMouseExited

    private void distance_phyMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_distance_phyMousePressed
        dst = "distance";
        distance_phy.setBackground(new Color(204,102,0));
        time_phy.setBackground(new Color(153,153,153));
        speed_phy.setBackground(new Color(153,153,153));
        sval1_phy.setText("Speed :");
        sval2_phy.setText("Time  :");
        desc.setText("Specify the Speed value and Time to find the Distance !");
        screen2_phy.setText("Dist = Speed*Time");
    }//GEN-LAST:event_distance_phyMousePressed

    private void time_phyMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_time_phyMouseEntered
         if(!dst.equals("time")){
           time_phy.setBackground(new Color(0,102,102));
        }
    }//GEN-LAST:event_time_phyMouseEntered

    private void time_phyMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_time_phyMouseExited
        if(!dst.equals("time")){
            time_phy.setBackground(new Color(153,153,153));
        }
    }//GEN-LAST:event_time_phyMouseExited

    private void time_phyMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_time_phyMousePressed
        dst = "time";
        time_phy.setBackground(new Color(204,102,0));
        distance_phy.setBackground(new Color(153,153,153));
        speed_phy.setBackground(new Color(153,153,153));
        
        sval1_phy.setText("Distance :");
        sval2_phy.setText("Speed  :");
        desc.setText("Specify the Distance value and Speeed to find the Time !");
        screen2_phy.setText("Time = distance / Speed");
    }//GEN-LAST:event_time_phyMousePressed

    private void calc_phyMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_calc_phyMouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_calc_phyMouseEntered

    private void calc_phyMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_calc_phyMouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_calc_phyMouseExited

    private void calc_phyMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_calc_phyMousePressed
       double first =Double.parseDouble(val1_phy.getText());
       double second =Double.parseDouble(val2_phy.getText());
       double res;
       
       if(val1_phy.getText().equals("") || val2_phy.getText().equals("")){
           
       }else{
           
       }
       
       if(dst.equals("distance")){
           //Formula is: distance = speed * time 
           res = first * second ;
           String value = String.format("%.2f" , res);
           screen_phy.setText(value);
       }
       if(dst.equals("speed")){
           //Formula is: speed = distance / time 
           res = first / second ;
           String value = String.format("%.2f" , res);
           screen_phy.setText(value);
           screen2_phy.setText("m/s or cm/s");
       }
       if(dst.equals("time")){
           //Formula is: time = distance / speed 
           res = first / second ;
           String value = String.format("%.2f" , res);
           screen_phy.setText(value);
        }
       if(dst.equals("bosdymassindex")){
           //Formula is: time = distance / speed 
           res = second / (first * first) ;
           String value = String.format("%.2f" , res);
           screen_phy.setText(value);
        }
    }//GEN-LAST:event_calc_phyMousePressed

    private void distance1_phyMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_distance1_phyMouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_distance1_phyMouseEntered

    private void distance1_phyMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_distance1_phyMouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_distance1_phyMouseExited

    private void distance1_phyMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_distance1_phyMousePressed
        // TODO add your handling code here:
    }//GEN-LAST:event_distance1_phyMousePressed

    private void val1_phyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_val1_phyActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_val1_phyActionPerformed

    private void bmi_phyMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bmi_phyMouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_bmi_phyMouseEntered

    private void bmi_phyMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bmi_phyMouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_bmi_phyMouseExited

    private void bmi_phyMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bmi_phyMousePressed
        dst="bodymassindex";
        
        sval1_phy.setText("Height :");
        sval2_phy.setText("Weight  :");
        desc.setText("To calculate the Body mass Index , you have to specify\n"
                + "the Height(in meters)  and the Weight(in Kg) ");
        screen2_phy.setText("bmi = weight / (height*height");
    }//GEN-LAST:event_bmi_phyMousePressed

    private void velocity_phyMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_velocity_phyMouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_velocity_phyMouseEntered

    private void velocity_phyMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_velocity_phyMouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_velocity_phyMouseExited

    private void velocity_phyMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_velocity_phyMousePressed
        dst="velocity";
      sval1_phy.setText("displacement :");
      sval2_phy.setText("time  :");
      desc.setText("Velocity= displacement / time .\n" +
"(m/s + direction)");
      screen2_phy.setText("Velocity=displacement/time ");
    }//GEN-LAST:event_velocity_phyMousePressed

    private void force_phyMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_force_phyMouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_force_phyMouseEntered

    private void force_phyMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_force_phyMouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_force_phyMouseExited

    private void force_phyMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_force_phyMousePressed
        dst="force";
        sval1_phy.setText("Mass :");
      sval2_phy.setText("Acceleration  :");
      desc.setText("Newton's 2nd Law; the force on an object is equal to the product of its mass and acceleration.\n" +
"(Newtons (N)) \n"
              + "First you have to find the Object mass and calculate the is acceleration \n"
              + "using formula.");
      screen2_phy.setText("F=mass * acceler");
    }//GEN-LAST:event_force_phyMousePressed

    private void gravity_phyMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_gravity_phyMouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_gravity_phyMouseEntered

    private void gravity_phyMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_gravity_phyMouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_gravity_phyMouseExited

    private void gravity_phyMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_gravity_phyMousePressed
        dst="gravity";
        sval1_phy.setText("");
        sval2_phy.setText("");
        sval3_phy.setText("");
         desc.setText("Gravity; acceleration of a free falling object is 10 m/s².\n" +
"(m/s² or N/kg)");
         screen_phy.setText("10");
        screen2_phy.setText("(m/s² or N/kg)");
    }//GEN-LAST:event_gravity_phyMousePressed

    private void accleration_phyMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_accleration_phyMouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_accleration_phyMouseEntered

    private void accleration_phyMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_accleration_phyMouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_accleration_phyMouseExited

    private void accleration_phyMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_accleration_phyMousePressed
         dst="acceleration";
        sval1_phy.setText("final v :");
        sval2_phy.setText("initial v :");
        sval3_phy.setText("time");
         desc.setText("Acceleration is equal to (final v - initial v) / time.\n" +
"(m/s²)"
              + "First you have to find the Object mass and calculate the is acceleration \n"
              + "using formula.");
      screen2_phy.setText("a=(vf-vi)/t or Δv/t");
    }//GEN-LAST:event_accleration_phyMousePressed

    private void f0f_gravity_phyMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_f0f_gravity_phyMouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_f0f_gravity_phyMouseEntered

    private void f0f_gravity_phyMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_f0f_gravity_phyMouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_f0f_gravity_phyMouseExited

    private void f0f_gravity_phyMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_f0f_gravity_phyMousePressed
      dst="forceofgravity";
      sval1_phy.setText("Mass :");
      sval2_phy.setText("Acceleration  :");
      desc.setText("Force of gravity on an object is the product of the mass and gravity, which is its weight.\n" +
"(N).");
      screen2_phy.setText("Fg=mg=W");
    }//GEN-LAST:event_f0f_gravity_phyMousePressed

    private void work_phyMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_work_phyMouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_work_phyMouseEntered

    private void work_phyMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_work_phyMouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_work_phyMouseExited

    private void work_phyMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_work_phyMousePressed
        // TODO add your handling code here:
    }//GEN-LAST:event_work_phyMousePressed

    private void frequency_phyMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_frequency_phyMouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_frequency_phyMouseEntered

    private void frequency_phyMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_frequency_phyMouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_frequency_phyMouseExited

    private void frequency_phyMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_frequency_phyMousePressed
        // TODO add your handling code here:
    }//GEN-LAST:event_frequency_phyMousePressed

    private void faradays_law_phyMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_faradays_law_phyMouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_faradays_law_phyMouseEntered

    private void faradays_law_phyMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_faradays_law_phyMouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_faradays_law_phyMouseExited

    private void faradays_law_phyMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_faradays_law_phyMousePressed
        // TODO add your handling code here:
    }//GEN-LAST:event_faradays_law_phyMousePressed

    private void power_phyMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_power_phyMouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_power_phyMouseEntered

    private void power_phyMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_power_phyMouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_power_phyMouseExited

    private void power_phyMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_power_phyMousePressed
        // TODO add your handling code here:
    }//GEN-LAST:event_power_phyMousePressed

    private void density_phyMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_density_phyMouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_density_phyMouseEntered

    private void density_phyMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_density_phyMouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_density_phyMouseExited

    private void density_phyMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_density_phyMousePressed
        // TODO add your handling code here:
    }//GEN-LAST:event_density_phyMousePressed

    private void ohms_law_phyMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ohms_law_phyMouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_ohms_law_phyMouseEntered

    private void ohms_law_phyMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ohms_law_phyMouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_ohms_law_phyMouseExited

    private void ohms_law_phyMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ohms_law_phyMousePressed
        // TODO add your handling code here:
    }//GEN-LAST:event_ohms_law_phyMousePressed

    private void energy_phyMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_energy_phyMouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_energy_phyMouseEntered

    private void energy_phyMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_energy_phyMouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_energy_phyMouseExited

    private void energy_phyMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_energy_phyMousePressed
        // TODO add your handling code here:
    }//GEN-LAST:event_energy_phyMousePressed

    private void snells_law_phyMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_snells_law_phyMouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_snells_law_phyMouseEntered

    private void snells_law_phyMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_snells_law_phyMouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_snells_law_phyMouseExited

    private void snells_law_phyMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_snells_law_phyMousePressed
        // TODO add your handling code here:
    }//GEN-LAST:event_snells_law_phyMousePressed

    private void gausss_lawMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_gausss_lawMouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_gausss_lawMouseEntered

    private void gausss_lawMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_gausss_lawMouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_gausss_lawMouseExited

    private void gausss_lawMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_gausss_lawMousePressed
        // TODO add your handling code here:
    }//GEN-LAST:event_gausss_lawMousePressed

    private void evaluate_phyMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_evaluate_phyMouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_evaluate_phyMouseEntered

    private void evaluate_phyMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_evaluate_phyMouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_evaluate_phyMouseExited

    private void evaluate_phyMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_evaluate_phyMousePressed
        // TODO add your handling code here:
    }//GEN-LAST:event_evaluate_phyMousePressed

    private void minMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_minMousePressed
         setState(javax.swing.JFrame.ICONIFIED);
    }//GEN-LAST:event_minMousePressed
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
            java.util.logging.Logger.getLogger(Physic.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Physic.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Physic.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Physic.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Physic().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Content;
    private javax.swing.JTextField _phy;
    private javax.swing.JLabel accleration_phy;
    private javax.swing.JLabel amplaire_phy;
    private javax.swing.JPanel bg;
    private javax.swing.JLabel bmi_phy;
    private javax.swing.JPanel braintraining;
    private javax.swing.JLabel calc_phy;
    private javax.swing.JPanel chimistry;
    private javax.swing.JLabel close;
    private javax.swing.JPanel colors;
    private javax.swing.JLabel density_phy;
    private javax.swing.JTextArea desc;
    private javax.swing.JLabel distance1_phy;
    private javax.swing.JLabel distance_phy;
    private javax.swing.JLabel energy_phy;
    private javax.swing.JLabel evaluate_phy;
    private javax.swing.JLabel f0f_gravity_phy;
    private javax.swing.JLabel faradays_law_phy;
    private javax.swing.JLabel footer;
    private javax.swing.JLabel force_phy;
    private javax.swing.JLabel frequency_phy;
    private javax.swing.JLabel gausss_law;
    private javax.swing.JLabel gravity_phy;
    private javax.swing.JLabel help;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel14_phy;
    private javax.swing.JLabel jLabel15_phy;
    private javax.swing.JLabel jLabel16_phy;
    private javax.swing.JLabel jLabel17_phy;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1_phy;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTextField jTextField6_phy;
    private javax.swing.JPanel learntosuccess;
    private javax.swing.JPanel menu;
    private javax.swing.JLabel min;
    private javax.swing.JLabel ohms_law_phy;
    private javax.swing.JPanel physic;
    private javax.swing.JLabel power_phy;
    private javax.swing.JPanel programmer;
    private javax.swing.JPanel scientific;
    private javax.swing.JTextField screen2_phy;
    private javax.swing.JTextField screen_phy;
    private javax.swing.JLabel settings1;
    private javax.swing.JLabel snells_law_phy;
    private javax.swing.JLabel speed_phy;
    private javax.swing.JPanel standard;
    private javax.swing.JTextField sval1_phy;
    private javax.swing.JTextField sval2_phy;
    private javax.swing.JTextField sval3_phy;
    private javax.swing.JPanel telecom;
    private javax.swing.JLabel time_phy;
    private javax.swing.JPanel timedata;
    private javax.swing.JLabel title;
    private javax.swing.JPanel toolbar;
    private javax.swing.JTextField val1_phy;
    private javax.swing.JTextField val2_phy;
    private javax.swing.JLabel velocity_phy;
    private javax.swing.JLabel work_phy;
    // End of variables declaration//GEN-END:variables
}
