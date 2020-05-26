package com.example;

public class Calkulator extends javax.swing.JFrame {
    // Variables declaration - do not modify

    private javax.swing.JPanel mainPanel;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JButton no0;
    private javax.swing.JButton no1;
    private javax.swing.JButton no2;
    private javax.swing.JButton no3;
    private javax.swing.JButton no4;
    private javax.swing.JButton no5;
    private javax.swing.JButton no6;
    private javax.swing.JButton no7;
    private javax.swing.JButton no8;
    private javax.swing.JButton no9;
    private javax.swing.JButton kali;
    private javax.swing.JButton kurang;
    private javax.swing.JButton bagi;
    private javax.swing.JButton samadengan;
    private javax.swing.JButton tambah;
    private javax.swing.JButton titik;
    private javax.swing.JButton clear;
    private javax.swing.JButton delete;
    private javax.swing.JButton exit;
    // End of variables declaration

    double result, a, b;
    String num;
    char i;


    /** Creates new form KALKULATOR */
    public Calkulator() {
        initComponents();
        num = "";

    }

    @SuppressWarnings("unchecked")
    //
    private void initComponents() {

        mainPanel = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        no1 = new javax.swing.JButton();
        no2 = new javax.swing.JButton();
        no3 = new javax.swing.JButton();
        no4 = new javax.swing.JButton();
        no5 = new javax.swing.JButton();
        no6 = new javax.swing.JButton();
        no7 = new javax.swing.JButton();
        no8 = new javax.swing.JButton();
        no9 = new javax.swing.JButton();
        titik = new javax.swing.JButton();
        no0 = new javax.swing.JButton();
        samadengan = new javax.swing.JButton();
        jTextField1 = new javax.swing.JTextField();
        delete = new javax.swing.JButton();
        bagi = new javax.swing.JButton();
        kali = new javax.swing.JButton();
        tambah = new javax.swing.JButton();
        kurang = new javax.swing.JButton();
        clear = new javax.swing.JButton();
        exit = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Java Kalkulator");
        setResizable(false);

        mainPanel.setBackground(new java.awt.Color(51, 51, 51));

        jPanel1.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        jPanel1.setAlignmentX(0.0F);
        jPanel1.setPreferredSize(new java.awt.Dimension(160, 160));

        no1.setBackground(new java.awt.Color(0, 0, 0));
        no1.setFont(new java.awt.Font("Tahoma", 1, 12));
        no1.setForeground(new java.awt.Color(255, 255, 255));
        no1.setText("1");
        no1.setPreferredSize(new java.awt.Dimension(45, 30));
        no1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                no1ActionPerformed(evt);
            }
        });

        no2.setBackground(new java.awt.Color(0, 0, 0));
        no2.setFont(new java.awt.Font("Tahoma", 1, 12));
        no2.setForeground(new java.awt.Color(255, 255, 255));
        no2.setText("2");
        no2.setPreferredSize(new java.awt.Dimension(45, 30));
        no2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                no2ActionPerformed(evt);
            }
        });

        no3.setBackground(new java.awt.Color(0, 0, 0));
        no3.setFont(new java.awt.Font("Tahoma", 1, 12));
        no3.setForeground(new java.awt.Color(255, 255, 255));
        no3.setText("3");
        no3.setPreferredSize(new java.awt.Dimension(45, 30));
        no3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                no3ActionPerformed(evt);
            }
        });

        no4.setBackground(new java.awt.Color(0, 0, 0));
        no4.setFont(new java.awt.Font("Tahoma", 1, 12));
        no4.setForeground(new java.awt.Color(255, 255, 255));
        no4.setText("4");
        no4.setPreferredSize(new java.awt.Dimension(45, 30));
        no4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                no4ActionPerformed(evt);
            }
        });

        no5.setBackground(new java.awt.Color(0, 0, 0));
        no5.setFont(new java.awt.Font("Tahoma", 1, 12));
        no5.setForeground(new java.awt.Color(255, 255, 255));
        no5.setText("5");
        no5.setPreferredSize(new java.awt.Dimension(45, 30));
        no5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                no5ActionPerformed(evt);
            }
        });

        no6.setBackground(new java.awt.Color(0, 0, 0));
        no6.setFont(new java.awt.Font("Tahoma", 1, 12));
        no6.setForeground(new java.awt.Color(255, 255, 255));
        no6.setText("6");
        no6.setPreferredSize(new java.awt.Dimension(45, 30));
        no6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                no6ActionPerformed(evt);
            }
        });

        no7.setBackground(new java.awt.Color(0, 0, 0));
        no7.setFont(new java.awt.Font("Tahoma", 1, 12));
        no7.setForeground(new java.awt.Color(255, 255, 255));
        no7.setText("7");
        no7.setPreferredSize(new java.awt.Dimension(45, 30));
        no7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                no7ActionPerformed(evt);
            }
        });

        no8.setBackground(new java.awt.Color(0, 0, 0));
        no8.setFont(new java.awt.Font("Tahoma", 1, 12));
        no8.setForeground(new java.awt.Color(255, 255, 255));
        no8.setText("8");
        no8.setPreferredSize(new java.awt.Dimension(45, 30));
        no8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                no8ActionPerformed(evt);
            }
        });

        no9.setBackground(new java.awt.Color(0, 0, 0));
        no9.setFont(new java.awt.Font("Tahoma", 1, 12));
        no9.setForeground(new java.awt.Color(255, 255, 255));
        no9.setText("9");
        no9.setPreferredSize(new java.awt.Dimension(45, 30));
        no9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                no9ActionPerformed(evt);
            }
        });

        titik.setBackground(new java.awt.Color(0, 0, 0));
        titik.setFont(new java.awt.Font("Tahoma", 1, 12));
        titik.setForeground(new java.awt.Color(255, 255, 255));
        titik.setText(".");
        titik.setPreferredSize(new java.awt.Dimension(45, 30));
        titik.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                titikActionPerformed(evt);
            }
        });

        no0.setBackground(new java.awt.Color(0, 0, 0));
        no0.setFont(new java.awt.Font("Tahoma", 1, 12));
        no0.setForeground(new java.awt.Color(255, 255, 255));
        no0.setText("0");
        no0.setPreferredSize(new java.awt.Dimension(45, 30));
        no0.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                no0ActionPerformed(evt);
            }
        });

        samadengan.setBackground(new java.awt.Color(0, 0, 0));
        samadengan.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        samadengan.setForeground(new java.awt.Color(255, 255, 255));
        samadengan.setText("=");
        samadengan.setDefaultCapable(false);
        samadengan.setPreferredSize(new java.awt.Dimension(45, 30));
        samadengan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                samadenganActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
                jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(no4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(titik, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(no1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(no7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(no2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(no5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(no8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(no0, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(samadengan, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(no6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(no9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(no3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );
        jPanel1Layout.setVerticalGroup(
                jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(no9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(no6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(no3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(samadengan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(36, 36, 36)
                                .addComponent(no5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(no2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(no0, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addComponent(no8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(no7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(no4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(no1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(titik, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jTextField1.setEditable(false);
        jTextField1.setFont(new java.awt.Font("Comic Sans MS", 1, 14));

        delete.setFont(new java.awt.Font("Tahoma", 1, 12));
        delete.setText("DEL");
        delete.setEnabled(false);
        delete.setPreferredSize(new java.awt.Dimension(58, 30));
        delete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteActionPerformed(evt);
            }
        });

        bagi.setFont(new java.awt.Font("Tahoma", 1, 12));
        bagi.setText("÷");
        bagi.setEnabled(false);
        bagi.setPreferredSize(new java.awt.Dimension(45, 26));
        bagi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bagiActionPerformed(evt);
            }
        });

        kali.setFont(new java.awt.Font("Tahoma", 1, 12));
        kali.setText("*");
        kali.setEnabled(false);
        kali.setPreferredSize(new java.awt.Dimension(45, 26));
        kali.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                kaliActionPerformed(evt);
            }
        });

        tambah.setFont(new java.awt.Font("Tahoma", 1, 12));
        tambah.setText("+");
        tambah.setEnabled(false);
        tambah.setPreferredSize(new java.awt.Dimension(45, 26));
        tambah.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tambahActionPerformed(evt);
            }
        });

        kurang.setFont(new java.awt.Font("Tahoma", 1, 12));
        kurang.setText("-");
        kurang.setPreferredSize(new java.awt.Dimension(45, 26));
        kurang.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                kurangActionPerformed(evt);
            }
        });

        clear.setFont(new java.awt.Font("Tahoma", 1, 12));
        clear.setText("CLEAR");
        clear.setActionCommand("");
        clear.setPreferredSize(new java.awt.Dimension(58, 30));
        clear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clearActionPerformed(evt);
            }
        });

        exit.setFont(new java.awt.Font("Tahoma", 1, 12));
        exit.setText("EXIT");
        exit.setPreferredSize(new java.awt.Dimension(58, 30));
        exit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exitActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout mainPanelLayout = new javax.swing.GroupLayout(mainPanel);
        mainPanel.setLayout(mainPanelLayout);
        mainPanelLayout.setHorizontalGroup(
                mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(mainPanelLayout.createSequentialGroup()
                                .addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(mainPanelLayout.createSequentialGroup()
                                                .addGap(8, 8, 8)
                                                .addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addGroup(mainPanelLayout.createSequentialGroup()
                                                                .addGap(1, 1, 1)
                                                                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                                .addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                                        .addComponent(kurang, javax.swing.GroupLayout.DEFAULT_SIZE, 56, Short.MAX_VALUE)
                                                                        .addComponent(tambah, javax.swing.GroupLayout.DEFAULT_SIZE, 56, Short.MAX_VALUE)
                                                                        .addComponent(kali, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 56, Short.MAX_VALUE)
                                                                        .addComponent(bagi, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 56, Short.MAX_VALUE)))
                                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, mainPanelLayout.createSequentialGroup()
                                                                .addComponent(jTextField1, javax.swing.GroupLayout.DEFAULT_SIZE, 156, Short.MAX_VALUE)
                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                .addComponent(delete, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                        .addGroup(mainPanelLayout.createSequentialGroup()
                                                .addContainerGap()
                                                .addComponent(exit, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 28, Short.MAX_VALUE)
                                                .addComponent(clear, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addContainerGap())
        );
        mainPanelLayout.setVerticalGroup(
                mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(mainPanelLayout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(jTextField1, javax.swing.GroupLayout.DEFAULT_SIZE, 30, Short.MAX_VALUE)
                                        .addComponent(delete, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(mainPanelLayout.createSequentialGroup()
                                                .addGap(15, 15, 15)
                                                .addComponent(bagi, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addComponent(kali, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addComponent(tambah, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addComponent(kurang, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(21, 21, 21))
                                        .addGroup(mainPanelLayout.createSequentialGroup()
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(8, 8, 8)
                                .addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(exit, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(clear, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(mainPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(mainPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
        java.awt.Dimension screenSize = java.awt.Toolkit.getDefaultToolkit().getScreenSize();
        java.awt.Dimension dialogSize = getSize();
        setLocation((screenSize.width-dialogSize.width)/2,(screenSize.height-dialogSize.height)/2);
    }//

    private void kurangActionPerformed(java.awt.event.ActionEvent evt) {
        if (jTextField1.getText().length() == 0){
            num += "-";
            jTextField1.setText(num);
            a = -a;
            delete.setEnabled(true);
        }
        else{
            jTextField1.setText("-");
            a = Double.parseDouble(num);
            num = "";
            i = '-';
            samadengan.setEnabled(true);
            titik.setEnabled(true);
            delete.setEnabled(false);
        }
        // TODO add your handling code here:
    }

    private void tambahActionPerformed(java.awt.event.ActionEvent evt) {
        jTextField1.setText("+");
        a = Double.parseDouble(num);
        num = "";
        i = '+';
        samadengan.setEnabled(true);
        titik.setEnabled(true);
        delete.setEnabled(false);
        // TODO add your handling code here:
    }

    private void kaliActionPerformed(java.awt.event.ActionEvent evt) {
        jTextField1.setText("*");
        a = Double.parseDouble(num);
        num = "";
        i = '*';
        samadengan.setEnabled(true);
        titik.setEnabled(true);
        delete.setEnabled(false);
        // TODO add your handling code here:
    }

    private void bagiActionPerformed(java.awt.event.ActionEvent evt) {
        jTextField1.setText("÷");
        a = Double.parseDouble(num);
        num  = "";
        i = '÷';
        samadengan.setEnabled(true);
        titik.setEnabled(true);
        delete.setEnabled(false);
        // TODO add your handling code here:
    }

    private void deleteActionPerformed(java.awt.event.ActionEvent evt) {
        jTextField1.getText().length();
        StringBuilder all = new StringBuilder (jTextField1.getText());
        char end = all.charAt(all.length()-1);
        all.deleteCharAt(all.length()-1);
        jTextField1.setText(all.toString());
        num = jTextField1.getText();
        if (jTextField1.getText().length() == 0){
            delete.setEnabled(false);
            titik.setEnabled(true);
            bagi.setEnabled(false);
            kali.setEnabled(false);
            tambah.setEnabled(false);
        }
//else if (end == '÷'){

//}
        // TODO add your handling code here:
    }

    private void samadenganActionPerformed(java.awt.event.ActionEvent evt) {
        if (i == '-'){
            b = Double.parseDouble(num);
            result = a - b;
            num = Double.toString(result);
            jTextField1.setText(num);
        }
        else if (i == '+'){
            b = Double.parseDouble(num);
            result = a + b;
            num = Double.toString(result);
            jTextField1.setText(num);
        }
        else if (i == '*'){
            b = Double.parseDouble(num);
            result = a * b;
            num = Double.toString(result);
            jTextField1.setText(num);
        }
        else if (i == '÷'){
            b = Double.parseDouble(num);
            result = a / b;
            num = Double.toString(result);
            jTextField1.setText(num);
        }
        else{
            jTextField1.setText("");
        }
        kurang.setEnabled(true);
        titik.setEnabled(false);
        bagi.setEnabled(true);
        tambah.setEnabled(true);
        delete.setEnabled(true);

        // TODO add your handling code here:
    }

    private void no0ActionPerformed(java.awt.event.ActionEvent evt) {
        num += "0";
        jTextField1.setText(num);
        bagi.setEnabled(true);
        kali.setEnabled(true);
        tambah.setEnabled(true);
        delete.setEnabled(true);

        // TODO add your handling code here:
    }

    private void titikActionPerformed(java.awt.event.ActionEvent evt) {
        num += ".";
        jTextField1.setText(num);
        titik.setEnabled(false);
        delete.setEnabled(true);
        // TODO add your handling code here:
    }

    private void no9ActionPerformed(java.awt.event.ActionEvent evt) {
        num += "9";
        jTextField1.setText(num);
        bagi.setEnabled(true);
        kali.setEnabled(true);
        tambah.setEnabled(true);
        delete.setEnabled(true);
        // TODO add your handling code here:
    }

    private void no8ActionPerformed(java.awt.event.ActionEvent evt) {
        num += "8";
        jTextField1.setText(num);
        bagi.setEnabled(true);
        kali.setEnabled(true);
        tambah.setEnabled(true);
        delete.setEnabled(true);
        // TODO add your handling code here:
    }

    private void no7ActionPerformed(java.awt.event.ActionEvent evt) {
        num += "7";
        jTextField1.setText(num);
        bagi.setEnabled(true);
        kali.setEnabled(true);
        tambah.setEnabled(true);
        delete.setEnabled(true);
        // TODO add your handling code here:
    }

    private void no6ActionPerformed(java.awt.event.ActionEvent evt) {
        num += "6";
        jTextField1.setText(num);
        bagi.setEnabled(true);
        kali.setEnabled(true);
        tambah.setEnabled(true);
        delete.setEnabled(true);
        // TODO add your handling code here:
    }

    private void no5ActionPerformed(java.awt.event.ActionEvent evt) {
        num += "5";
        jTextField1.setText(num);
        bagi.setEnabled(true);
        kali.setEnabled(true);
        tambah.setEnabled(true);
        delete.setEnabled(true);
        // TODO add your handling code here:
    }

    private void no4ActionPerformed(java.awt.event.ActionEvent evt) {
        num += "4";
        jTextField1.setText(num);
        bagi.setEnabled(true);
        kali.setEnabled(true);
        tambah.setEnabled(true);
        delete.setEnabled(true);
        // TODO add your handling code here:
    }

    private void no3ActionPerformed(java.awt.event.ActionEvent evt) {
        num += "3";
        jTextField1.setText(num);
        bagi.setEnabled(true);
        kali.setEnabled(true);
        tambah.setEnabled(true);
        delete.setEnabled(true);
        // TODO add your handling code here:
    }

    private void no2ActionPerformed(java.awt.event.ActionEvent evt) {
        num += "2";
        jTextField1.setText(num);
        bagi.setEnabled(true);
        kali.setEnabled(true);
        tambah.setEnabled(true);
        delete.setEnabled(true);
        // TODO add your handling code here:
    }

    private void no1ActionPerformed(java.awt.event.ActionEvent evt) {
        num += "1";
        jTextField1.setText(num);
        bagi.setEnabled(true);
        kali.setEnabled(true);
        tambah.setEnabled(true);
        delete.setEnabled(true);
        // TODO add your handling code here:
    }

    private void clearActionPerformed(java.awt.event.ActionEvent evt) {
        jTextField1.setText("");
        titik.setEnabled(true);
        num="";
        a = 0.0;
        b = 0.0;
        result = 0.0;
        bagi.setEnabled(false);
        kali.setEnabled(false);
        tambah.setEnabled(false);
        delete.setEnabled(false);
        // TODO add your handling code here:
    }

    private void exitActionPerformed(java.awt.event.ActionEvent evt) {
        this.setVisible(false);
        // TODO add your handling code here:
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Calkulator.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Calkulator.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Calkulator.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Calkulator.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {

            public void run() {
                new Calkulator().setVisible(true);
            }
        });
    }

}