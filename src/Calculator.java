import java.lang.*;
import java.util.Stack;

public class Calculator extends javax.swing.JFrame {

    Double ans;
    String result;
    Stack<Double> values;
    Stack<String> ops;
    public Calculator() {
        initComponents();
    }

    private void initComponents() {  // launches the user interface
        clear = new javax.swing.JButton();
        backspace = new javax.swing.JButton();
        n0 = new javax.swing.JButton();
        n1 = new javax.swing.JButton();
        n2 = new javax.swing.JButton();
        n3 = new javax.swing.JButton();
        n4 = new javax.swing.JButton();
        n5 = new javax.swing.JButton();
        n6 = new javax.swing.JButton();
        n7 = new javax.swing.JButton();
        n8 = new javax.swing.JButton();
        n9 = new javax.swing.JButton();
        plus = new javax.swing.JButton();
        minus = new javax.swing.JButton();
        mult = new javax.swing.JButton();
        disp = new javax.swing.JLabel();
        div = new javax.swing.JButton();
        eq = new javax.swing.JButton();
        percentage = new javax.swing.JButton();
        dec = new javax.swing.JButton();
        power = new javax.swing.JButton();
        facto = new javax.swing.JButton();
        root = new javax.swing.JButton();
        pi = new javax.swing.JButton();
        sin = new javax.swing.JButton();
        cos = new javax.swing.JButton();
        tan = new javax.swing.JButton();
        cot = new javax.swing.JButton();
        ln = new javax.swing.JButton();
        log = new javax.swing.JButton();
        exp = new javax.swing.JButton();
        Operationlabel = new javax.swing.JLabel();
        closingbrac = new javax.swing.JButton();
        Openingbrac = new javax.swing.JButton();

        // Swing window properties code section (color, font, border...)
        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(204, 204, 204));

        disp.setBackground(new java.awt.Color(54, 54, 54));
        disp.setFont(new java.awt.Font("Garamond", 0, 36));
        disp.setForeground(new java.awt.Color(255, 255, 255));
        disp.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(54, 54, 54), 2, true));
        disp.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        disp.setOpaque(true);

        clear.setBackground(new java.awt.Color(42, 209, 100));
        clear.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        clear.setText("AC");
        clear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clearActionPerformed(evt);
            }
        });

        plus.setBackground(new java.awt.Color(255, 109, 0));
        plus.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        plus.setForeground(new java.awt.Color(255, 255, 255));
        plus.setText("+");
        plus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {plusActionPerformed(evt);}
        });

        minus.setBackground(new java.awt.Color(255, 109, 0));
        minus.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        minus.setForeground(new java.awt.Color(255, 255, 255));
        minus.setText("-");
        minus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                minusActionPerformed(evt);
            }
        });

        backspace.setBackground(new java.awt.Color(42, 209, 100));
        backspace.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        backspace.setText("CE");
        backspace.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backspaceActionPerformed(evt);
            }
        });

        div.setBackground(new java.awt.Color(255, 109, 0));
        div.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        div.setForeground(new java.awt.Color(255, 255, 255));
        div.setText("/");
        div.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                divActionPerformed(evt);
            }
        });

        mult.setBackground(new java.awt.Color(255, 109, 0));
        mult.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        mult.setForeground(new java.awt.Color(255, 255, 255));
        mult.setText("x");
        mult.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                multActionPerformed(evt);
            }
        });

        n6.setBackground(new java.awt.Color(102, 102, 102));
        n6.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        n6.setForeground(new java.awt.Color(255, 255, 255));
        n6.setText("6");
        n6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                n6ActionPerformed(evt);
            }
        });

        n3.setBackground(new java.awt.Color(102, 102, 102));
        n3.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        n3.setForeground(new java.awt.Color(255, 255, 255));
        n3.setText("3");
        n3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                n3ActionPerformed(evt);
            }
        });

        n9.setBackground(new java.awt.Color(102, 102, 102));
        n9.setFont(new java.awt.Font("Arial", 0, 18));
        n9.setForeground(new java.awt.Color(255, 255, 255));
        n9.setText("9");
        n9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                n9ActionPerformed(evt);
            }
        });

        eq.setBackground(new java.awt.Color(42, 209, 100));
        eq.setFont(new java.awt.Font("Arial", 0, 18));
        eq.setText("=");
        eq.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                eqActionPerformed(evt);
            }
        });

        percentage.setBackground(new java.awt.Color(255, 109, 0));
        percentage.setFont(new java.awt.Font("Arial", 0, 18));
        percentage.setForeground(new java.awt.Color(255, 255, 255));
        percentage.setText("%");
        percentage.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                percentageActionPerformed(evt);
            }
        });

        dec.setBackground(new java.awt.Color(60, 60, 60));
        dec.setFont(new java.awt.Font("Arial", 0, 18));
        dec.setForeground(new java.awt.Color(255, 255, 255));
        dec.setText(".");
        dec.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                decActionPerformed(evt);
            }
        });

        n2.setBackground(new java.awt.Color(102, 102, 102));
        n2.setFont(new java.awt.Font("Arial", 0, 18));
        n2.setForeground(new java.awt.Color(255, 255, 255));
        n2.setText("2");
        n2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                n2ActionPerformed(evt);
            }
        });

        n5.setBackground(new java.awt.Color(102, 102, 102));
        n5.setFont(new java.awt.Font("Arial", 0, 18));
        n5.setForeground(new java.awt.Color(255, 255, 255));
        n5.setText("5");
        n5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                n5ActionPerformed(evt);
            }
        });

        n8.setBackground(new java.awt.Color(102, 102, 102));
        n8.setFont(new java.awt.Font("Arial", 0, 18));
        n8.setForeground(new java.awt.Color(255, 255, 255));
        n8.setText("8");
        n8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                n8ActionPerformed(evt);
            }
        });

        power.setBackground(new java.awt.Color(255, 109, 0));
        power.setFont(new java.awt.Font("Arial", 0, 18));
        power.setForeground(new java.awt.Color(255, 255, 255));
        power.setText("^");
        power.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                powerActionPerformed(evt);
            }
        });

        n0.setBackground(new java.awt.Color(102, 102, 102));
        n0.setFont(new java.awt.Font("Arial", 0, 18));
        n0.setForeground(new java.awt.Color(255, 255, 255));
        n0.setText("0");
        n0.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                n0ActionPerformed(evt);
            }
        });

        n1.setBackground(new java.awt.Color(102, 102, 102));
        n1.setFont(new java.awt.Font("Arial", 0, 18));
        n1.setForeground(new java.awt.Color(255, 255, 255));
        n1.setText("1");
        n1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                n1ActionPerformed(evt);
            }
        });

        n4.setBackground(new java.awt.Color(102, 102, 102));
        n4.setFont(new java.awt.Font("Arial", 0, 18));
        n4.setForeground(new java.awt.Color(255, 255, 255));
        n4.setText("4");
        n4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                n4ActionPerformed(evt);
            }
        });

        n7.setBackground(new java.awt.Color(102, 102, 102));
        n7.setFont(new java.awt.Font("Arial", 0, 18));
        n7.setForeground(new java.awt.Color(255, 255, 255));
        n7.setText("7");
        n7.setMaximumSize(new java.awt.Dimension(63, 36));
        n7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                n7ActionPerformed(evt);
            }
        });

        facto.setBackground(new java.awt.Color(255, 109, 0));
        facto.setFont(new java.awt.Font("Arial", 0, 18));
        facto.setForeground(new java.awt.Color(255, 255, 255));
        facto.setText("x!");
        facto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                factoActionPerformed(evt);
            }
        });

        root.setBackground(new java.awt.Color(255, 109, 0));
        root.setFont(new java.awt.Font("Arial", 0, 18));
        root.setForeground(new java.awt.Color(255, 255, 255));
        root.setText("√");
        root.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rootActionPerformed(evt);
            }
        });

        pi.setBackground(new java.awt.Color(255, 109, 0));
        pi.setFont(new java.awt.Font("Arial", 0, 18));
        pi.setForeground(new java.awt.Color(255, 255, 255));
        pi.setText("π");
        pi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                piActionPerformed(evt);
            }
        });

        tan.setBackground(new java.awt.Color(255, 109, 0));
        tan.setFont(new java.awt.Font("Arial", 0, 18));
        tan.setForeground(new java.awt.Color(255, 255, 255));
        tan.setText("tan");
        tan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tanActionPerformed(evt);
            }
        });

        cot.setBackground(new java.awt.Color(255, 109, 0));
        cot.setFont(new java.awt.Font("Arial", 0, 18));
        cot.setForeground(new java.awt.Color(255, 255, 255));
        cot.setText("cot");
        cot.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cotActionPerformed(evt);
            }
        });

        sin.setBackground(new java.awt.Color(255, 109, 0));
        sin.setFont(new java.awt.Font("Arial", 0, 18));
        sin.setForeground(new java.awt.Color(255, 255, 255));
        sin.setText("sin");
        sin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sinActionPerformed(evt);
            }
        });

        ln.setBackground(new java.awt.Color(255, 109, 0));
        ln.setFont(new java.awt.Font("Arial", 0, 18));
        ln.setForeground(new java.awt.Color(255, 255, 255));
        ln.setText("ln");
        ln.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                lnActionPerformed(evt);
            }
        });

        log.setBackground(new java.awt.Color(255, 109, 0));
        log.setFont(new java.awt.Font("Arial", 0, 18));
        log.setForeground(new java.awt.Color(255, 255, 255));
        log.setText("log");
        log.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                logActionPerformed(evt);
            }
        });

        exp.setBackground(new java.awt.Color(255, 109, 0));
        exp.setFont(new java.awt.Font("Arial", 0, 18));
        exp.setForeground(new java.awt.Color(255, 255, 255));
        exp.setText("e");
        exp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                expActionPerformed(evt);
            }
        });

        Operationlabel.setBackground(new java.awt.Color(193, 193, 193));
        Operationlabel.setFont(new java.awt.Font("Georgia", 0, 20));
        Operationlabel.setOpaque(true);

        cos.setBackground(new java.awt.Color(255, 109, 0));
        cos.setFont(new java.awt.Font("Arial", 0, 18));
        cos.setForeground(new java.awt.Color(255, 255, 255));
        cos.setText("cos");
        cos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cosActionPerformed(evt);
            }
        });

        closingbrac.setBackground(new java.awt.Color(60, 60, 60));
        closingbrac.setFont(new java.awt.Font("Arial", 0, 18));
        closingbrac.setForeground(new java.awt.Color(255, 255, 255));
        closingbrac.setText(")");
        closingbrac.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                closingbracActionPerformed(evt);
            }
        });

        Openingbrac.setBackground(new java.awt.Color(60, 60, 60));
        Openingbrac.setFont(new java.awt.Font("Arial", 0, 18));
        Openingbrac.setForeground(new java.awt.Color(255, 255, 255));
        Openingbrac.setText("(");
        Openingbrac.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                OpeningbracActionPerformed(evt);
            }
        });

        // Code of Swing container structure
        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addComponent(log, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(ln, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                                        .addGroup(layout.createSequentialGroup()
                                                                .addComponent(root, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                                .addComponent(power, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                                .addComponent(percentage, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                                .addComponent(facto, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                        .addGroup(layout.createSequentialGroup()
                                                                .addComponent(Openingbrac, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                                .addComponent(closingbrac, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                                .addComponent(backspace, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                                .addComponent(clear, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                        .addComponent(tan, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(pi, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                        .addGroup(layout.createSequentialGroup()
                                                                .addComponent(n0, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                                .addComponent(dec, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                                .addComponent(eq, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                        .addGroup(layout.createSequentialGroup()
                                                                .addComponent(n1, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                                .addComponent(n2, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                                .addComponent(n3, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                        .addComponent(plus, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                        .addComponent(minus, javax.swing.GroupLayout.DEFAULT_SIZE, 63, Short.MAX_VALUE)))
                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                                        .addComponent(sin, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                        .addComponent(cos, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                                        .addComponent(n4, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(n7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                                                .addComponent(n8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                                .addComponent(n9, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                                .addComponent(div, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                                                .addComponent(n5, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                                .addComponent(n6, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                                .addComponent(mult, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                        .addComponent(disp, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(Operationlabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addContainerGap())
        );
        layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(Operationlabel, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(disp, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE, false)
                                        .addComponent(percentage, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(power)
                                        .addComponent(root, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(ln)
                                        .addComponent(facto))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 10, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                .addComponent(Openingbrac, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addComponent(log, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                                .addComponent(closingbrac, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                        .addComponent(clear, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(backspace, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                .addComponent(div, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addComponent(n9, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addComponent(n8, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addComponent(sin, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addComponent(n7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                .addComponent(mult, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addComponent(n6, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addComponent(n5, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addComponent(n4, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addComponent(cos, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(tan, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                .addComponent(minus, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addComponent(n3, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addComponent(n2, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addComponent(n1, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(plus, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(eq, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(dec, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(n0, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(pi, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addContainerGap())
        );

        pack();}

    // Button code actions section
    private void n5ActionPerformed(java.awt.event.ActionEvent evt) {
        String s= disp.getText()+n5.getText();
        disp.setText(s);
        String s2=Operationlabel.getText()+n5.getText();
        Operationlabel.setText(s2);
    }

    private void n8ActionPerformed(java.awt.event.ActionEvent evt) {
        String s= disp.getText()+n8.getText();
        disp.setText(s);
        String s2=Operationlabel.getText()+n8.getText();
        Operationlabel.setText(s2);
    }

    private void tanActionPerformed(java.awt.event.ActionEvent evt) {
        disp.setText("tan ( ");
        String s= Operationlabel.getText()+"tan ( ";
        Operationlabel.setText(s);
    }

    private void cotActionPerformed(java.awt.event.ActionEvent evt) {
        disp.setText("cot ( ");
        String s= Operationlabel.getText()+"cot ( ";
        Operationlabel.setText(s);
    }

    private void n0ActionPerformed(java.awt.event.ActionEvent evt) {
        String s= disp.getText()+n0.getText();
        disp.setText(s);
        String s2=Operationlabel.getText()+n0.getText();
        Operationlabel.setText(s2);
    }

    private void n1ActionPerformed(java.awt.event.ActionEvent evt) {
        String s= disp.getText()+n1.getText();
        disp.setText(s);
        String s2=Operationlabel.getText()+n1.getText();
        Operationlabel.setText(s2);
    }

    private void n2ActionPerformed(java.awt.event.ActionEvent evt) {
        String s= disp.getText()+n2.getText();
        disp.setText(s);
        String s2=Operationlabel.getText()+n2.getText();
        Operationlabel.setText(s2);
    }

    private void n3ActionPerformed(java.awt.event.ActionEvent evt) {
        String s= disp.getText()+n3.getText();
        disp.setText(s);
        String s2=Operationlabel.getText()+n3.getText();
        Operationlabel.setText(s2);
    }

    private void n4ActionPerformed(java.awt.event.ActionEvent evt) {
        String s= disp.getText()+n4.getText();
        disp.setText(s);
        String s2=Operationlabel.getText()+n4.getText();
        Operationlabel.setText(s2);
    }

    private void n6ActionPerformed(java.awt.event.ActionEvent evt) {
        String s= disp.getText()+n6.getText();
        disp.setText(s);
        String s2=Operationlabel.getText()+n6.getText();
        Operationlabel.setText(s2);
    }

    private void n7ActionPerformed(java.awt.event.ActionEvent evt) {
        String s= disp.getText()+n7.getText();
        disp.setText(s);
        String s2=Operationlabel.getText()+n7.getText();
        Operationlabel.setText(s2);
    }

    private void n9ActionPerformed(java.awt.event.ActionEvent evt) {
        String s= disp.getText()+n9.getText();
        disp.setText(s);
        String s2=Operationlabel.getText()+n9.getText();
        Operationlabel.setText(s2);
    }

    private void plusActionPerformed(java.awt.event.ActionEvent evt) {
        String s= Operationlabel.getText()+" + ";
        Operationlabel.setText(s);
        disp.setText("");
    }

    private void minusActionPerformed(java.awt.event.ActionEvent evt) {
        String s= Operationlabel.getText()+" - ";
        Operationlabel.setText(s);
        disp.setText("");
    }

    private void multActionPerformed(java.awt.event.ActionEvent evt) {
        String s= Operationlabel.getText()+" * ";
        Operationlabel.setText(s);
        disp.setText("");
    }

    private void divActionPerformed(java.awt.event.ActionEvent evt) {
        String s= Operationlabel.getText()+" / ";
        Operationlabel.setText(s);
        disp.setText("");
    }

    private void powerActionPerformed(java.awt.event.ActionEvent evt) {
        String s= Operationlabel.getText()+" ^ ";
        Operationlabel.setText(s);
        disp.setText("");
    }

    private Double applyOpr1(String opr, Double n)
    {
        Double nd;
        switch(opr)
        {
            case "log":
                return Math.log(n)/Math.log(10);
            case "ln":
                return Math.log(n);
            case "e":
                return Math.exp(n);
            case "sin":
                nd= Math.toRadians(n);
                return Math.sin(nd);
            case "cos":
                nd= Math.toRadians(n);
                return Math.cos(nd);
            case "tan":
                nd= Math.toRadians(n);
                return Math.tan(nd);
            case "cot":
                nd= Math.toRadians(n);
                return 1/Math.tan(nd);
            case "√":
                return Math.sqrt(n);
            case "!":
                if(n%1==0 && n>=0)
                {
                    if(n==0)
                    {
                        disp.setText("1");
                    }
                    else
                    {
                        ans=1.0;
                        for(int i=1;i<=n;i++)
                            ans=ans*i;
                        return ans;
                    }
                }
                else
                    disp.setText("Error");
            default:
                return 0.0;
        }
    }
    private Double applyOpr2(String opr, Double n2, Double n1)
    {
        switch(opr)
        {
            case "+":
                return n1+n2;
            case "-":
                return n1-n2;
            case "*":
                return n1*n2;
            case "/":
                if (n2 == 0)
                {
                    disp.setText("Error");
                }
                return n1/n2;
            case "^":
                return Math.pow(n1,n2);
            default:
                return 0.0;
        }
    }

    private static int prec(String opr) //returns the precedence of respective operators
    {
        if(opr.equals("+") || opr.equals("-"))
            return 1;
        else if(opr.equals("*") || opr.equals("/"))
            return 2;
        else if(opr.equals("^"))
            return 3;
        else if(opr.equals("sin") || opr.equals("cos") || opr.equals("tan") ||opr.equals("cot") || opr.equals("log") || opr.equals("e") || opr.equals("ln"))
            return 4;
        else if(opr.equals("√") || opr.equals("!"))
            return 5;
        else
            return 0;
    }
    private static Double ExpressionSolver(String exp){
        Calculator cal= new Calculator();
        String[] elements = exp.trim().split(" ",0);

        Stack<Double> values = new Stack<Double>();
        Stack<String> ops = new Stack<String>();

        for(int i=0;i<elements.length;i++)
        {
            if(elements[i].equals("") || elements[i].equals(" ")) //ignoring null elements or whitespaces
                continue;

            boolean isNum = elements[i].matches("[-+]?[0-9]*\\.?[0-9]+"); //checks if it is a number
            if(isNum)
            {
                values.push(Double.parseDouble(elements[i]));           //pushing operands into values stack
            }

            else if(elements[i].equals("("))
            {
                ops.push(elements[i]);
            }

            else if(elements[i].equals(")"))
            {
                while(!ops.peek().equals("("))    //all equations inside the brackets are solved
                {
                    if(ops.peek().equals("+") || ops.peek().equals("-") || ops.peek().equals("*") || ops.peek().equals("/") || ops.peek().equals("^") )
                    {
                        values.push(cal.applyOpr2(ops.pop(),values.pop(),values.pop()));
                    }
                    else
                    {
                        values.push(cal.applyOpr1(ops.pop(),values.pop()));
                    }
                }
                ops.pop();
            }

            else{     //if it is an operator
                while(!ops.empty() && prec(elements[i])<=prec(ops.peek()))
                {
                    if(ops.peek().equals("+") || ops.peek().equals("-") || ops.peek().equals("*") || ops.peek().equals("/") || ops.peek().equals("^") )
                    {
                        values.push(cal.applyOpr2(ops.pop(),values.pop(),values.pop()));
                    }
                    else
                    {
                        values.push(cal.applyOpr1(ops.pop(),values.pop()));
                    }
                }
                ops.push(elements[i]);
            }
        }
        while (!ops.empty())
        {
            if(ops.peek().equals("+") || ops.peek().equals("-") || ops.peek().equals("*") || ops.peek().equals("/") || ops.peek().equals("^") )
            {
                values.push(cal.applyOpr2(ops.pop(),values.pop(),values.pop()));
            }
            else
            {
                values.push(cal.applyOpr1(ops.pop(),values.pop()));
            }
        }

        return values.pop();
    }

    private void eqActionPerformed(java.awt.event.ActionEvent evt) {
        ans=ExpressionSolver(Operationlabel.getText());
        result= String.format("%.4f", ans);
        disp.setText(result);
    }

    private void piActionPerformed(java.awt.event.ActionEvent evt) {
        Double p=Math.PI;
        String x= disp.getText()+String.valueOf(p);
        String s= disp.getText()+String.valueOf(p);
        Operationlabel.setText(s);
        disp.setText(x);
    }

    private void rootActionPerformed(java.awt.event.ActionEvent evt) {
        String s= Operationlabel.getText()+"√ ( ";
        Operationlabel.setText(s);
        disp.setText("√ ( ");
    }

    private void logActionPerformed(java.awt.event.ActionEvent evt) {
        String s= Operationlabel.getText()+"log ( ";
        Operationlabel.setText(s);
        disp.setText("log ( ");
    }

    private void expActionPerformed(java.awt.event.ActionEvent evt) {
        String s= Operationlabel.getText()+"exp ( ";
        Operationlabel.setText(s);
        disp.setText("e( ");
    }

    private void lnActionPerformed(java.awt.event.ActionEvent evt) {
        String s= Operationlabel.getText()+"ln ( ";
        Operationlabel.setText(s);
        disp.setText("ln ( ");
    }

    private void sinActionPerformed(java.awt.event.ActionEvent evt) {
        String s= Operationlabel.getText()+"sin ( ";
        Operationlabel.setText(s);
        disp.setText("sin ( ");
    }

    private void percentageActionPerformed(java.awt.event.ActionEvent evt) {
        Double d = Double.parseDouble(disp.getText());
        ans = d / 100;
        result = String.valueOf(ans);
        Operationlabel.setText("%");
        disp.setText(result);
    }

    private void clearActionPerformed(java.awt.event.ActionEvent evt) {
        disp.setText("");
        Operationlabel.setText("");
        values.clear();
        ops.clear();
    }

    private void factoActionPerformed(java.awt.event.ActionEvent evt) {
        String s= "( "+Operationlabel.getText()+" ) !";
        Operationlabel.setText(s);
        disp.setText("");
    }

    private void decActionPerformed(java.awt.event.ActionEvent evt) {
        result= disp.getText()+".";
        String s= Operationlabel.getText()+".";
        disp.setText(result);
        Operationlabel.setText(s);
    }

    private void backspaceActionPerformed(java.awt.event.ActionEvent evt) {
        if(!Operationlabel.getText().equals(""))
        {
            if(!disp.getText().equals(""))
                disp.setText(disp.getText().substring(0, disp.getText().length()-1));
            String s=Operationlabel.getText().trim();
            Operationlabel.setText(s.substring(0, s.length()-1));
        }
    }

    private void cosActionPerformed(java.awt.event.ActionEvent evt) {
        String s= Operationlabel.getText()+"cos ( ";
        Operationlabel.setText(s);
        disp.setText("cos ( ");
    }

    private void OpeningbracActionPerformed(java.awt.event.ActionEvent evt) {
        String s= Operationlabel.getText()+"( ";
        Operationlabel.setText(s);
        result= disp.getText()+"( ";
        disp.setText(result);
    }

    private void closingbracActionPerformed(java.awt.event.ActionEvent evt) {
        String s= Operationlabel.getText()+" ) ";
        Operationlabel.setText(s);
        result= disp.getText()+" ) ";
        disp.setText(result);
    }

    public static void main(String args[]) {

        // Create and display the form
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Calculator().setVisible(true);
            }
        });
    }
    // Variables declaration
    private javax.swing.JButton Openingbrac;
    private javax.swing.JLabel Operationlabel;
    private javax.swing.JButton n0;
    private javax.swing.JButton n1;
    private javax.swing.JButton n2;
    private javax.swing.JButton n3;
    private javax.swing.JButton n4;
    private javax.swing.JButton n5;
    private javax.swing.JButton n6;
    private javax.swing.JButton n7;
    private javax.swing.JButton n8;
    private javax.swing.JButton n9;
    private javax.swing.JButton backspace;
    private javax.swing.JButton clear;
    private javax.swing.JButton closingbrac;
    private javax.swing.JButton sin;
    private javax.swing.JButton cos;
    private javax.swing.JButton tan;
    private javax.swing.JButton cot;
    private javax.swing.JButton dec;
    private javax.swing.JLabel disp;
    private javax.swing.JButton div;
    private javax.swing.JButton eq;
    private javax.swing.JButton facto;
    private javax.swing.JButton percentage;
    private javax.swing.JButton ln;
    private javax.swing.JButton log;
    private javax.swing.JButton exp;
    private javax.swing.JButton minus;
    private javax.swing.JButton mult;
    private javax.swing.JButton pi;
    private javax.swing.JButton plus;
    private javax.swing.JButton power;
    private javax.swing.JButton root;
}