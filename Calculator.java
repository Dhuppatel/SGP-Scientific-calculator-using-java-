import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import static javax.swing.text.StyleConstants.setBackground;

class Calculator implements ActionListener {
    Double number,answer;
    double a,b,c;
    String operation;
    JFrame frame;
    JLabel label=new JLabel();
    JTextField textField=new JTextField();

    private javax.swing.JButton Underroot;
    private javax.swing.JButton ac;
    private javax.swing.JButton clr;
    private javax.swing.JButton cos;
    private javax.swing.JButton cosh;
    private javax.swing.JButton divide;
    private javax.swing.JButton dot;
    private javax.swing.JButton equalTo;
    private javax.swing.JButton equation;
    private javax.swing.JButton exp;
    private javax.swing.JButton factorial;
    private javax.swing.JButton inverse;
    private javax.swing.JButton jButton20;
    private javax.swing.JButton jButton21;
    private javax.swing.JButton jButton22;
    private javax.swing.JButton jButton23;
    private javax.swing.JButton jButton28;
    private javax.swing.JButton jButton29;
    private javax.swing.JButton jButton30;
    private javax.swing.JButton jButton31;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton6;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JButton log;
    private javax.swing.JButton minus;
    private javax.swing.JButton modulo;
    private javax.swing.JButton multiply;
    private javax.swing.JButton num0;
    private javax.swing.JButton num1;
    private javax.swing.JButton num2;
    private javax.swing.JButton num3;
    private javax.swing.JButton num4;
    private javax.swing.JButton num5;
    private javax.swing.JButton num6;
    private javax.swing.JButton num7;
    private javax.swing.JButton num8;
    private javax.swing.JButton num9;
    private javax.swing.JRadioButton offRadioButton;
    private javax.swing.JRadioButton onRadioButton;
    private javax.swing.JButton parenthasisClose;
    private javax.swing.JButton parenthesisOpen;
    private javax.swing.JButton plus;
    private javax.swing.JButton plusorminus;
    private javax.swing.JButton sin;
    private javax.swing.JButton sinh;
    private javax.swing.JButton tan;
    private javax.swing.JButton tanh;
    private javax.swing.JButton xQube;
    private javax.swing.JButton xSquare;
    private javax.swing.JButton xraisetoy;

    Calculator() {
        createGUI();
        addActionEvents();
    }

    void createGUI()
    {

        frame = new JFrame("Calculator");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        addComponents();
        frame.setVisible(true);

        ImageIcon logo = new ImageIcon(getClass().getResource("/CalciLogo.png"));
        frame.setIconImage(logo.getImage());

    };
    private void addComponents() {
        jButton20 = new javax.swing.JButton();
        jButton21 = new javax.swing.JButton();
        jButton22 = new javax.swing.JButton();
        jButton23 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton28 = new javax.swing.JButton();
        jButton29 = new javax.swing.JButton();
        jButton30 = new javax.swing.JButton();
        jButton31 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jTextField1 = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        Underroot = new javax.swing.JButton();
        exp = new javax.swing.JButton();
        sin = new javax.swing.JButton();
        cos = new javax.swing.JButton();
        tan = new javax.swing.JButton();
        log = new javax.swing.JButton();
        sinh = new javax.swing.JButton();
        cosh = new javax.swing.JButton();
        tanh = new javax.swing.JButton();
        inverse = new javax.swing.JButton();
        modulo = new javax.swing.JButton();
        ac = new javax.swing.JButton();
        clr = new javax.swing.JButton();
        multiply = new javax.swing.JButton();
        xraisetoy = new javax.swing.JButton();
        num7 = new javax.swing.JButton();
        num8 = new javax.swing.JButton();
        num4 = new javax.swing.JButton();
        num5 = new javax.swing.JButton();
        num9 = new javax.swing.JButton();
        num6 = new javax.swing.JButton();
        divide = new javax.swing.JButton();
        minus = new javax.swing.JButton();
        xSquare = new javax.swing.JButton();
        num1 = new javax.swing.JButton();
        num2 = new javax.swing.JButton();
        num3 = new javax.swing.JButton();
        plus = new javax.swing.JButton();
        factorial = new javax.swing.JButton();
        xQube = new javax.swing.JButton();
        num0 = new javax.swing.JButton();
        dot = new javax.swing.JButton();
        equalTo = new javax.swing.JButton();
        plusorminus = new javax.swing.JButton();
        offRadioButton = new javax.swing.JRadioButton();
        onRadioButton = new javax.swing.JRadioButton();
        parenthesisOpen = new javax.swing.JButton();
        parenthasisClose = new javax.swing.JButton();
        equation = new javax.swing.JButton();

        jButton20.setText("jButton1");


        jButton21.setText("jButton1");


        jButton22.setText("jButton1");


        jButton23.setText("jButton1");


        jButton4.setText("jButton1");


        jButton28.setText("jButton1");


        jButton29.setText("jButton1");


        jButton30.setText("jButton1");

        jButton31.setText("jButton1");

        jButton6.setText("jButton1");

        frame.setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        frame.setBackground(new java.awt.Color(255, 153, 51));

        jTextField1.setBackground(new java.awt.Color(204, 204, 204));
        jTextField1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jTextField1.setText("");
        jTextField1.setHorizontalAlignment(SwingConstants.RIGHT);
        jTextField1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel1.setText("");
        jLabel1.setHorizontalAlignment(SwingConstants.RIGHT);

        Underroot.setBackground(new java.awt.Color(204, 204, 204));
        Underroot.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        Underroot.setText("√");
        Underroot.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true));


        exp.setBackground(new java.awt.Color(204, 204, 204));
        exp.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        exp.setText("exp");
        exp.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));


        sin.setBackground(new java.awt.Color(204, 204, 204));
        sin.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        sin.setText("sin");
        sin.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));


        cos.setBackground(new java.awt.Color(204, 204, 204));
        cos.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        cos.setText("cos");
        cos.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true));
        cos.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));


        tan.setBackground(new java.awt.Color(204, 204, 204));
        tan.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        tan.setText("tan");
        tan.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true));


        log.setBackground(new java.awt.Color(204, 204, 204));
        log.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        log.setText("log");
        log.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));


        sinh.setBackground(new java.awt.Color(204, 204, 204));
        sinh.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        sinh.setText("sinh");
        sinh.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));


        cosh.setBackground(new java.awt.Color(204, 204, 204));
        cosh.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        cosh.setText("cosh");
        cosh.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true));
        cosh.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));


        tanh.setBackground(new java.awt.Color(204, 204, 204));
        tanh.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        tanh.setText("tanh");
        tanh.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true));


        inverse.setBackground(new java.awt.Color(204, 204, 204));
        inverse.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        inverse.setText("1/x");
        inverse.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true));


        modulo.setBackground(new java.awt.Color(204, 204, 204));
        modulo.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        modulo.setText("%");
        modulo.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));


        ac.setBackground(new java.awt.Color(204, 204, 204));
        ac.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        ac.setText("AC");
        ac.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));


        clr.setBackground(new java.awt.Color(204, 204, 204));
        clr.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        clr.setText("CLR");
        clr.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true));
        clr.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));


        multiply.setBackground(new java.awt.Color(204, 204, 204));
        multiply.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        multiply.setText("*");
        multiply.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true));


        xraisetoy.setBackground(new java.awt.Color(204, 204, 204));
        xraisetoy.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        xraisetoy.setText("x^y");
        xraisetoy.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true));


        num7.setBackground(new java.awt.Color(204, 204, 204));
        num7.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        num7.setText("7");
        num7.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));


        num8.setBackground(new java.awt.Color(204, 204, 204));
        num8.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        num8.setText("8");
        num8.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));


        num4.setBackground(new java.awt.Color(204, 204, 204));
        num4.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        num4.setText("4");
        num4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));


        num5.setBackground(new java.awt.Color(204, 204, 204));
        num5.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        num5.setText("5");
        num5.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));


        num9.setBackground(new java.awt.Color(204, 204, 204));
        num9.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        num9.setText("9");
        num9.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true));
        num9.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));


        num6.setBackground(new java.awt.Color(204, 204, 204));
        num6.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        num6.setText("6");
        num6.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true));
        num6.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));


        divide.setBackground(new java.awt.Color(204, 204, 204));
        divide.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        divide.setText("/");
        divide.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true));


        minus.setBackground(new java.awt.Color(204, 204, 204));
        minus.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        minus.setText("-");
        minus.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true));


        xSquare.setBackground(new java.awt.Color(204, 204, 204));
        xSquare.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        xSquare.setText("x^2");
        xSquare.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true));


        num1.setBackground(new java.awt.Color(204, 204, 204));
        num1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        num1.setText("1");
        num1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));


        num2.setBackground(new java.awt.Color(204, 204, 204));
        num2.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        num2.setText("2");
        num2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));


        num3.setBackground(new java.awt.Color(204, 204, 204));
        num3.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        num3.setText("3");
        num3.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true));
        num3.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));


        plus.setBackground(new java.awt.Color(204, 204, 204));
        plus.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        plus.setText("+");
        plus.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true));


        factorial.setBackground(new java.awt.Color(204, 204, 204));
        factorial.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        factorial.setText("n!");
        factorial.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true));


        xQube.setBackground(new java.awt.Color(204, 204, 204));
        xQube.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        xQube.setText("x^3");
        xQube.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true));


        num0.setBackground(new java.awt.Color(204, 204, 204));
        num0.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        num0.setText("0");
        num0.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));


        dot.setBackground(new java.awt.Color(204, 204, 204));
        dot.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        dot.setText(".");
        dot.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));


        equalTo.setBackground(new java.awt.Color(204, 204, 204));
        equalTo.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        equalTo.setText("=");
        equalTo.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true));
        equalTo.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));


        plusorminus.setBackground(new java.awt.Color(204, 204, 204));
        plusorminus.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        plusorminus.setText("+/-");
        plusorminus.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true));


        offRadioButton.setText("OFF");


        onRadioButton.setSelected(true);
        onRadioButton.setText("ON");

        ButtonGroup radioButttonGroup = new ButtonGroup();
        radioButttonGroup.add(offRadioButton);
        radioButttonGroup.add(onRadioButton);


        parenthesisOpen.setBackground(new java.awt.Color(204, 204, 204));
        parenthesisOpen.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        parenthesisOpen.setText("(");
        parenthesisOpen.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true));


        parenthasisClose.setBackground(new java.awt.Color(204, 204, 204));
        parenthasisClose.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        parenthasisClose.setText(")");
        parenthasisClose.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));

        equation.setBackground(new java.awt.Color(204, 204, 204));
        equation.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        equation.setText("equation");
        equation.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));


        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(frame.getContentPane());
        frame.getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(layout.createSequentialGroup()
                                                .addComponent(parenthesisOpen, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(parenthasisClose, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(equation, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                        .addComponent(jTextField1)
                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                                .addGap(0, 0, Short.MAX_VALUE)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                                                .addComponent(inverse, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                .addComponent(log, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                .addComponent(sinh, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                .addComponent(cosh, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                .addComponent(tanh, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                                                .addComponent(xraisetoy, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                .addComponent(modulo, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                .addComponent(ac, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                .addComponent(clr, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                .addComponent(multiply, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                                .addGroup(layout.createSequentialGroup()
                                                                        .addComponent(xQube, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                        .addComponent(num7, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                        .addComponent(num8, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                        .addComponent(num9, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                        .addComponent(divide, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                                .addGroup(layout.createSequentialGroup()
                                                                        .addComponent(xSquare, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                        .addComponent(num4, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                        .addComponent(num5, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                        .addComponent(num6, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                        .addComponent(minus, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                                                        .addComponent(factorial, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                        .addComponent(num1, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                        .addComponent(num2, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                        .addComponent(num3, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                        .addComponent(plus, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                                                .addComponent(plusorminus, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                .addComponent(num0, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                .addComponent(dot, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                .addComponent(equalTo, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                        .addGroup(layout.createSequentialGroup()
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                        .addGroup(layout.createSequentialGroup()
                                                                .addComponent(Underroot, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                .addComponent(exp, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                .addComponent(sin, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                .addComponent(cos, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                .addComponent(tan, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                        .addGroup(layout.createSequentialGroup()
                                                                .addComponent(offRadioButton)
                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                .addComponent(onRadioButton)
                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                                .addGap(0, 0, Short.MAX_VALUE)))
                                .addGap(12, 12, 12))
        );
        layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addGap(15, 15, 15)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(layout.createSequentialGroup()
                                                .addGap(1, 1, 1)
                                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED))
                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                        .addComponent(offRadioButton)
                                                        .addComponent(onRadioButton))
                                                .addGap(23, 23, 23)))
                                .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(equation, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(parenthasisClose, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(parenthesisOpen, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 8, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(cos, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(sin, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(exp, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(Underroot, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(tan, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(cosh, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(sinh, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(log, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(inverse, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(tanh, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(clr, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(ac, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(modulo, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(xraisetoy, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(multiply, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(num9, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(num8, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(num7, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(xQube, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(divide, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(num6, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(num5, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(num4, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(xSquare, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(minus, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(num3, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(num2, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(num1, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(factorial, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(plus, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                .addComponent(dot, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addComponent(num0, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addComponent(plusorminus, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addComponent(equalTo, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(14, 14, 14))
        );

        frame.pack();

    }// </editor-fold>
    private void toggleCalculator(boolean enable) {
        // Toggle all buttons and fields based on enable (true for enable, false for disable)
        Underroot.setEnabled(enable);
        ac.setEnabled(enable);
        clr.setEnabled(enable);
        cos.setEnabled(enable);
        cosh.setEnabled(enable);
        divide.setEnabled(enable);
        dot.setEnabled(enable);
        equalTo.setEnabled(enable);
        equation.setEnabled(enable);
        exp.setEnabled(enable);
        factorial.setEnabled(enable);
        inverse.setEnabled(enable);
        jButton20.setEnabled(enable);
        jButton21.setEnabled(enable);
        jButton22.setEnabled(enable);
        jButton23.setEnabled(enable);
        jButton28.setEnabled(enable);
        jButton29.setEnabled(enable);
        jButton30.setEnabled(enable);
        jButton31.setEnabled(enable);
        jButton4.setEnabled(enable);
        jButton6.setEnabled(enable);
        log.setEnabled(enable);
        minus.setEnabled(enable);
        modulo.setEnabled(enable);
        multiply.setEnabled(enable);
        num0.setEnabled(enable);
        num1.setEnabled(enable);
        num2.setEnabled(enable);
        num3.setEnabled(enable);
        num4.setEnabled(enable);
        num5.setEnabled(enable);
        num6.setEnabled(enable);
        num7.setEnabled(enable);
        num8.setEnabled(enable);
        num9.setEnabled(enable);
        parenthasisClose.setEnabled(enable);
        parenthesisOpen.setEnabled(enable);
        plus.setEnabled(enable);
        plusorminus.setEnabled(enable);
        sin.setEnabled(enable);
        sinh.setEnabled(enable);
        tan.setEnabled(enable);
        tanh.setEnabled(enable);
        xQube.setEnabled(enable);
        xSquare.setEnabled(enable);
        xraisetoy.setEnabled(enable);
        jTextField1.setEnabled(enable); // Text field
        label.setEnabled(enable); // Label (if necessary)

        // Optionally, reset text when turning off
        if (!enable) {
            jTextField1.setText(""); // Clear text field when disabled
            label.setText(""); // Clear label text
        }
    }

    //adding action listner to all the buttons using for each loop to increase code readiblity.
    public void addActionEvents() {
        AbstractButton[] buttons = { // Use AbstractButton to include both JButtons and JRadioButtons
                Underroot, ac, clr, cos, cosh, dot, divide, equalTo, exp, equation,
                factorial, inverse, log, minus, modulo, multiply, num0, num1, num2,
                num3, num4, num5, num6, num7, num8, num9, offRadioButton, onRadioButton,
                parenthasisClose, parenthesisOpen, plus, plusorminus, sin, sinh, tan,
                tanh, xQube, xSquare, xraisetoy
        };

        for (AbstractButton button : buttons) {
            button.addActionListener(this);
        }
    }
    public static void main(String[] args) {
        new Calculator();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        Object source = e.getSource();



        if(source==equation)
        {
            jLabel1.setText("Enter coefficents");
            number=answer=0.00;
            operation="equation";
            jTextField1.setText("a=");
        }

        else if (source==num0)
        {

            jTextField1.setText(jTextField1.getText()+"0");
        }else if (source==num1) {
            jTextField1.setText(jTextField1.getText()+"1");
        }else if (source==num2) {
            jTextField1.setText(jTextField1.getText()+"2");
        }else if (source==num3) {
            jTextField1.setText(jTextField1.getText()+"3");
        }else if (source==num4) {
            jTextField1.setText(jTextField1.getText()+"4");
        }else if (source==num5) {
            jTextField1.setText(jTextField1.getText()+"5");
        }else if (source==num6) {
            jTextField1.setText(jTextField1.getText()+"6");
        }else if (source==num7) {
            jTextField1.setText(jTextField1.getText()+"7");
        }else if (source==num8) {
            jTextField1.setText(jTextField1.getText()+"8");
        }else if (source==num9) {
            jTextField1.setText(jTextField1.getText()+"9");
        }
        else if (source==plus) {

            number=Double.parseDouble(jTextField1.getText());
            jTextField1.setText("");
            jLabel1.setText(number+"+");
            operation="+";
        }else if (source==modulo) {
            number=Double.parseDouble(jTextField1.getText());
            jTextField1.setText("");
            jLabel1.setText(number+"%");
            operation="%";
        }else if (source==minus) {
            if (jTextField1.getText().equals(""))
            {
                jTextField1.setText("-");
            }else {
                number = Double.parseDouble(jTextField1.getText());
                jTextField1.setText("");
                jLabel1.setText(number + "-");
                operation = "-";
            }
        }else if (source==divide) {
            number=Double.parseDouble(jTextField1.getText());
            jTextField1.setText("");
            jLabel1.setText(number+"/");
            operation="/";
        }
        else if (source==multiply) {

            number=Double.parseDouble(jTextField1.getText());
            jTextField1.setText("");
            jLabel1.setText(number+"*");
            operation="*";
        }else if (source==equalTo) {//=
//            jLabel1.setText("");

            switch (operation) {
                case "equation":
                    try {
                        if (a!=0&&b!=0&&c!=0) {
                            String roots = findroots(a, b, c);
                            // Set the roots output in the text field here
                            jTextField1.setText(roots);
                            jLabel1.setText("Ans :");
                            a=b=c=0;
                        }
                        else if (jTextField1.getText().startsWith("a=")) {
                            a = Integer.parseInt(jTextField1.getText().substring(2));
                            jTextField1.setText("b=");
                        } else if (jTextField1.getText().startsWith("b=")) {
                            b = Integer.parseInt(jTextField1.getText().substring(2));
                            jTextField1.setText("c=");
                        } else if (jTextField1.getText().startsWith("c=")) {
                            c = Integer.parseInt(jTextField1.getText().substring(2));

                        }
                    } catch (NumberFormatException e1) {
                        jTextField1.setText("Invalid input! Please enter numbers.");
                    }

                    break;

                case "+":
                    answer = number + Double.parseDouble(jTextField1.getText());
                    jTextField1.setText("" + answer);
                    break;
                case "-":
                    answer = number - Double.parseDouble(jTextField1.getText());
                    jTextField1.setText("" + answer);
                    break;
                case "*":
                    answer = number * Double.parseDouble(jTextField1.getText());
                    jTextField1.setText("" + answer);
                    break;
                case "/":
                    answer = number / Double.parseDouble(jTextField1.getText());
                    jTextField1.setText("" + answer);
                    break;
                case "%":
                    //percentage = ( part / total ) × 100
                    answer = (Double.parseDouble(jTextField1.getText()) / number) * 100;
                    jTextField1.setText("" + answer);
                    break;
                case "^":
                    answer=Math.pow(number, Double.parseDouble(jTextField1.getText()));
                    jTextField1.setText("" + answer);
                    break;

            }


        }else if (source==dot) {
            if(jTextField1.getText().contains("."))
            {   //do nothing
                return;
            }else{
                jTextField1.setText(jTextField1.getText()+".");
            }
        } else if (source==clr) {//CLR
            jTextField1.setText(jTextField1.getText().substring(0,jTextField1.getText().length()-1));
        }else if (source==ac) {//AC
            jTextField1.setText("");
            jLabel1.setText("");
            number=answer=0.0;
        }else if(source==inverse) {// 1/x
            jTextField1.setText("" +1/Double.parseDouble(jTextField1.getText()));
        } else if (source==xSquare) {// x^2
            jTextField1.setText("" +Double.parseDouble(jTextField1.getText())*Double.parseDouble(jTextField1.getText()));
        }else if (source==plusorminus) {// +/-
            if(jTextField1.getText().startsWith("-"))
            {
                jTextField1.setText(jTextField1.getText().substring(1,jTextField1.getText().length()));
            } else{
                jTextField1.setText("-"+jTextField1.getText());
            }
        }




        else if (source == Underroot) { // √x
            answer = Math.sqrt(Double.parseDouble(jTextField1.getText()));
            jTextField1.setText("" + answer);
        } else if (source == sin) { // sin(x)
            answer = Math.sin(Math.toRadians(Double.parseDouble(jTextField1.getText()))); // Convert degrees to radians
            jTextField1.setText("" + answer);
        } else if (source == cos) { // cos(x)
            answer = Math.cos(Math.toRadians(Double.parseDouble(jTextField1.getText())));
            jTextField1.setText("" + answer);
        } else if (source == tan) { // tan(x)
            answer = Math.tan(Math.toRadians(Double.parseDouble(jTextField1.getText())));
            jTextField1.setText("" + answer);
        } else if (source == sinh) { // sinh(x)
            answer = Math.sinh(Double.parseDouble(jTextField1.getText()));
            jTextField1.setText("" + answer);
        } else if (source == cosh) { // cosh(x)
            answer = Math.cosh(Double.parseDouble(jTextField1.getText()));
            jTextField1.setText("" + answer);
        } else if (source == tanh) { // tanh(x)
            answer = Math.tanh(Double.parseDouble(jTextField1.getText()));
            jTextField1.setText("" + answer);
        } else if (source == log) { // log(x)
            answer = Math.log10(Double.parseDouble(jTextField1.getText()));
            jTextField1.setText("" + answer);
        } else if (source == exp) { // e^x
            answer = Math.exp(Double.parseDouble(jTextField1.getText()));
            jTextField1.setText("" + answer);
        } else if (source == factorial) { // x!
            int num = Integer.parseInt(jTextField1.getText());
            answer = 1.0;
            for (int i = 1; i <= num; i++) {
                answer *= i;
            }
            jTextField1.setText("" + answer);
        } else if (source == xSquare) { // x^2
            answer = Math.pow(Double.parseDouble(jTextField1.getText()), 2);
            jTextField1.setText("" + answer);
        } else if (source == xQube) { // x^3
            answer = Math.pow(Double.parseDouble(jTextField1.getText()), 3);
            jTextField1.setText("" + answer);
        } else if (source == xraisetoy) { // x^y
            number = Double.parseDouble(jTextField1.getText());
            jTextField1.setText("");
            operation = "^";
            jLabel1.setText(number + "^");
        } else if (source == equalTo && operation.equals("^")) { // x^y
            answer = Math.pow(number, Double.parseDouble(jTextField1.getText()));
            jTextField1.setText("" + answer);
        }


       else if (offRadioButton.isSelected())
        {
            jTextField1.setText("");
            jLabel1.setText("");
            number=answer=0.0;
            toggleCalculator(false);

        }
       else if (onRadioButton.isSelected())
        {
            toggleCalculator(true);
        }
    }
    public static String findroots(double a, double b, double c) {

        double firstRoot, secondRoot;

        // determinant (b^2 - 4ac)
        double det = b * b - 4 * a * c;

        // check if determinant is greater than 0
        if (det > 0) {
            // two real and distinct roots
            firstRoot = (-b + Math.sqrt(det)) / (2 * a);
            secondRoot = (-b - Math.sqrt(det)) / (2 * a);

            return "Real Roots: " + firstRoot + " and " + secondRoot;
        }
        // check if determinant is equal to 0
        else if (det == 0) {
            // two real and equal roots
            firstRoot = -b / (2 * a);

            return "Equal Real Roots: " + firstRoot;
        }
        // if determinant is less than zero
        else {
            // roots are complex numbers and distinct
            double realPart = -b / (2 * a);
            double imaginaryPart = Math.sqrt(-det) / (2 * a);

            return "Complex Roots: " + realPart + " + " + imaginaryPart + "i and "
                    + realPart + " - " + imaginaryPart + "i";
        }
    }
}
