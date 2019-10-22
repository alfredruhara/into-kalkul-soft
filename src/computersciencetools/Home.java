
package computersciencetools;

import java.awt.Color;
import java.awt.Frame;
import javax.swing.JPanel;


public class Home extends javax.swing.JFrame {

    
    int xx;
    int yy;
    
    public Home() {
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
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();

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
        standard.setBounds(0, 112, 310, 42);

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
        scientific.setBounds(0, 160, 290, 42);

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
        programmer.setBounds(0, 210, 290, 42);

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
        physic.setBounds(0, 260, 290, 42);

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
        chimistry.setBounds(0, 310, 290, 42);

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
        telecom.setBounds(0, 360, 290, 42);

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
        learntosuccess.setBounds(0, 510, 290, 42);

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
        colors.setBounds(0, 410, 290, 42);

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
        braintraining.setBounds(0, 560, 290, 42);

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
        timedata.setBounds(0, 460, 290, 42);

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

        Content.setBackground(new java.awt.Color(255, 255, 255));

        jLabel11.setFont(new java.awt.Font("Agency FB", 1, 24)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(0, 51, 51));
        jLabel11.setText("Let solve problems ");

        jLabel12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/computersciencetools/icons/logo.png"))); // NOI18N

        jLabel13.setFont(new java.awt.Font("Agency FB", 1, 48)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(0, 51, 51));
        jLabel13.setText("CODE@OPEN SOURCE CALCULATIONS WORKPLACE");

        javax.swing.GroupLayout ContentLayout = new javax.swing.GroupLayout(Content);
        Content.setLayout(ContentLayout);
        ContentLayout.setHorizontalGroup(
            ContentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, ContentLayout.createSequentialGroup()
                .addContainerGap(109, Short.MAX_VALUE)
                .addGroup(ContentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, ContentLayout.createSequentialGroup()
                        .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 768, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(53, 53, 53))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, ContentLayout.createSequentialGroup()
                        .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 177, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(341, 341, 341))))
            .addGroup(ContentLayout.createSequentialGroup()
                .addGap(336, 336, 336)
                .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 239, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        ContentLayout.setVerticalGroup(
            ContentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ContentLayout.createSequentialGroup()
                .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 273, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 52, Short.MAX_VALUE)
                .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(165, 165, 165))
        );

        javax.swing.GroupLayout toolbarLayout = new javax.swing.GroupLayout(toolbar);
        toolbar.setLayout(toolbarLayout);
        toolbarLayout.setHorizontalGroup(
            toolbarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(toolbarLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(toolbarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(toolbarLayout.createSequentialGroup()
                        .addComponent(settings1, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(help, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(min, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(close, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(112, 112, 112))
                    .addGroup(toolbarLayout.createSequentialGroup()
                        .addComponent(Content, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jSeparator1, javax.swing.GroupLayout.DEFAULT_SIZE, 105, Short.MAX_VALUE))))
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
                .addGroup(toolbarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Content, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(44, 44, 44))
        );

        javax.swing.GroupLayout bgLayout = new javax.swing.GroupLayout(bg);
        bg.setLayout(bgLayout);
        bgLayout.setHorizontalGroup(
            bgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(bgLayout.createSequentialGroup()
                .addComponent(menu, javax.swing.GroupLayout.PREFERRED_SIZE, 290, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(toolbar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(34, 34, 34))
        );
        bgLayout.setVerticalGroup(
            bgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(menu, javax.swing.GroupLayout.PREFERRED_SIZE, 670, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addComponent(toolbar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(bg, javax.swing.GroupLayout.PREFERRED_SIZE, 1242, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(bg, javax.swing.GroupLayout.PREFERRED_SIZE, 669, Short.MAX_VALUE)
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
        Home home_redirect = new Home();    //current page
        
        
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
        Physic physic_go = new Physic();
               physic_go.setVisible(true);
               this.setVisible(false);
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
            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Home().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Content;
    private javax.swing.JPanel bg;
    private javax.swing.JPanel braintraining;
    private javax.swing.JPanel chimistry;
    private javax.swing.JLabel close;
    private javax.swing.JPanel colors;
    private javax.swing.JLabel footer;
    private javax.swing.JLabel help;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
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
    private javax.swing.JPanel scientific;
    private javax.swing.JLabel settings1;
    private javax.swing.JPanel standard;
    private javax.swing.JPanel telecom;
    private javax.swing.JPanel timedata;
    private javax.swing.JLabel title;
    private javax.swing.JPanel toolbar;
    // End of variables declaration//GEN-END:variables
}
