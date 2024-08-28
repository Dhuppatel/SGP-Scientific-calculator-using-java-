import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class Calculator implements ActionListener {
    Double number,answer;

    JFrame frame;
    JLabel label=new JLabel();
    JTextField textField=new JTextField();

    JButton buttonzero=new JButton("0");
    JButton buttonone=new JButton("1");
    JButton buttontwo=new JButton("2");
    JButton buttonthree=new JButton("3");
    JButton buttonfour=new JButton("4");
    JButton buttonfive=new JButton("5");
    JButton buttonsix=new JButton("6");
    JButton buttonseven=new JButton("7");
    JButton buttoneight=new JButton("8");
    JButton buttonnine=new JButton("9");

    JButton buttonPlus =new JButton("+");
    JButton buttonMinus=new JButton("-");
    JButton buttonMultiply=new JButton("*");
    JButton buttonDivide=new JButton("/");
    JButton buttonEqual=new JButton("=");
    JButton buttonClear=new JButton("Clear");
    JButton buttonClearAll=new JButton("Clear All");
    JRadioButton onRadioButton=new JRadioButton("on");
    JRadioButton offRadioButton=new JRadioButton("off");

    JButton pi=new JButton("π");
    JButton e=new JButton("e");
    JButton inverse=new JButton("1/x");
    JButton mod=new JButton("|x|");
    JButton modulas=new JButton("mod");
    JButton squareRoot=new JButton("√x");
    JButton openBracket=new JButton("(");
    JButton closeBracket=new JButton(")");
    JButton factorial=new JButton("n!");
    JButton xRaiseToY=new JButton("x^y");
    JButton tenRaiseToX=new JButton("10^x");
    JButton log=new JButton("log");
    JButton ln=new JButton("ln");


    Calculator() {
        createGUI();
    }

    void createGUI()
    {

        frame = new JFrame("Calculator");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.getContentPane().setLayout(null);
        frame.setSize(700,850);
        frame.setLocationRelativeTo(null);
        frame.setResizable(false);
     frame.getContentPane().setBackground(Color.lightGray);


        addComponents();
        frame.setVisible(true);

    }
    void addComponents()
    {

        label.setBounds(250,0,56,56);
        frame.add(label);


        textField.setBounds(10,40,670,89);
        textField.setText("asdad");
        textField.setEditable(false);

        textField.setFont(new Font("Arial", Font.BOLD, 20));
        textField.setHorizontalAlignment(SwingConstants.RIGHT);
        frame.getContentPane().add(textField,BorderLayout.NORTH);

        onRadioButton.setBounds(10, 140, 50, 25);
        onRadioButton.setSelected(true);
        onRadioButton.setFont(new Font("Arial", Font.BOLD, 14));
        onRadioButton.setBackground(Color.yellow);
        onRadioButton.setForeground(Color.black);
        frame.add(onRadioButton,BorderLayout.NORTH);

        offRadioButton.setBounds(60, 140, 50, 25);
        offRadioButton.setSelected(false);
        offRadioButton.setFont(new Font("Arial", Font.BOLD, 14));
        offRadioButton.setBackground(Color.yellow);
        offRadioButton.setForeground(Color.black);
        frame.add(offRadioButton,BorderLayout.NORTH);
    }
    public static void main(String[] args) {
        new Calculator();
    }

    @Override
    public void actionPerformed(ActionEvent e) {

    }
}


//
//import javax.swing.*;
//import java.awt.*;
//import java.awt.event.ActionEvent;
//import java.awt.event.ActionListener;
//
//class Calculator implements ActionListener {
//    Double number, answer;
//
//    JFrame frame;
//    JTextField textField = new JTextField();
//
//    JButton buttonzero = new JButton("0");
//    JButton buttonone = new JButton("1");
//    JButton buttontwo = new JButton("2");
//    JButton buttonthree = new JButton("3");
//    JButton buttonfour = new JButton("4");
//    JButton buttonfive = new JButton("5");
//    JButton buttonsix = new JButton("6");
//    JButton buttonseven = new JButton("7");
//    JButton buttoneight = new JButton("8");
//    JButton buttonnine = new JButton("9");
//
//    JButton buttonPlus = new JButton("+");
//    JButton buttonMinus = new JButton("-");
//    JButton buttonMultiply = new JButton("*");
//    JButton buttonDivide = new JButton("/");
//    JButton buttonEqual = new JButton("=");
//    JButton buttonClear = new JButton("C");
//    JButton buttonClearAll = new JButton("CE");
//
//    JButton pi = new JButton("π");
//    JButton e = new JButton("e");
//    JButton inverse = new JButton("1/x");
//    JButton mod = new JButton("|x|");
//    JButton modulas = new JButton("mod");
//    JButton squareRoot = new JButton("√x");
//    JButton openBracket = new JButton("(");
//    JButton closeBracket = new JButton(")");
//    JButton factorial = new JButton("n!");
//    JButton xRaiseToY = new JButton("x^y");
//    JButton tenRaiseToX = new JButton("10^x");
//    JButton log = new JButton("log");
//    JButton ln = new JButton("ln");
//
//    Calculator() {
//        createGUI();
//    }
//
//    void createGUI() {
//
//        frame = new JFrame("Scientific Calculator");
//        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//        frame.setSize(400, 600);
//        frame.setLocationRelativeTo(null);
//        frame.setResizable(false);
//        frame.getContentPane().setBackground(Color.DARK_GRAY);
//        frame.setLayout(null);
//
//        addComponents();
//        frame.setVisible(true);
//    }
//
//    void addComponents() {
//
//        textField.setBounds(10, 20, 370, 70);
//        textField.setFont(new Font("Arial", Font.BOLD, 24));
//        textField.setHorizontalAlignment(SwingConstants.RIGHT);
//        textField.setEditable(false);
//        frame.add(textField);
//
//        // Creating a panel to hold the buttons in a grid layout
//        JPanel panel = new JPanel();
//        panel.setBounds(10, 100, 370, 450);
//        panel.setLayout(new GridLayout(6, 5, 10, 10)); // 6 rows, 5 columns with gaps
//        frame.add(panel);
//
//        // Adding buttons to the panel
//        panel.add(new JButton("2ⁿᵈ"));
//        panel.add(pi);
//        panel.add(e);
//        panel.add(buttonClearAll);
//        panel.add(buttonClear);
//
//        panel.add(new JButton("x²"));
//        panel.add(inverse);
//        panel.add(mod);
//        panel.add(new JButton("exp"));
//        panel.add(modulas);
//
//        panel.add(squareRoot);
//        panel.add(openBracket);
//        panel.add(closeBracket);
//        panel.add(factorial);
//        panel.add(buttonDivide);
//
//        panel.add(xRaiseToY);
//        panel.add(buttonseven);
//        panel.add(buttoneight);
//        panel.add(buttonnine);
//        panel.add(buttonMultiply);
//
//        panel.add(tenRaiseToX);
//        panel.add(buttonfour);
//        panel.add(buttonfive);
//        panel.add(buttonsix);
//        panel.add(buttonMinus);
//
//        panel.add(log);
//        panel.add(buttonone);
//        panel.add(buttontwo);
//        panel.add(buttonthree);
//        panel.add(buttonPlus);
//
//        panel.add(ln);
//        panel.add(buttonzero);
//        panel.add(new JButton("M+")); // Placeholder for M+ button
//        panel.add(new JButton("M-")); // Placeholder for M- button
//        panel.add(buttonEqual);
//
//        // Styling the buttons
//        Component[] components = panel.getComponents();
//        for (Component component : components) {
//            if (component instanceof JButton) {
//                JButton button = (JButton) component;
//                button.setFont(new Font("Arial", Font.PLAIN, 18));
//                button.setBackground(Color.BLACK);
//                button.setForeground(Color.WHITE);
//                button.setFocusPainted(false);
//            }
//        }
//    }
//
//    public static void main(String[] args) {
//        new Calculator();
//    }
//
//    @Override
//    public void actionPerformed(ActionEvent e) {
//        // Add action handling logic here
//    }
//}
