import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.JFrame;

public class Simple_Calculator extends JFrame {

    private JTextField textField;
    private double firstNumber;
    private double secondNumber;
    private char operator;

    public Simple_Calculator() {
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setTitle("Calculator");

        textField = new JTextField();
        textField.setEditable(false);

        JButton button0 = new JButton("0");
        JButton button1 = new JButton("1");
        JButton button2 = new JButton("2");
        JButton button3 = new JButton("3");
        JButton button4 = new JButton("4");
        JButton button5 = new JButton("5");
        JButton button6 = new JButton("6");
        JButton button7 = new JButton("7");
        JButton button8 = new JButton("8");
        JButton button9 = new JButton("9");
        JButton buttonDecimal = new JButton(".");
        JButton buttonAdd = new JButton("+");
        JButton buttonSubtract = new JButton("-");
        JButton buttonMultiply = new JButton("*");
        JButton buttonDivide = new JButton("/");
        JButton buttonClear = new JButton("C");
        JButton buttonEqual = new JButton("=");

        button0.addActionListener(evt -> textField.setText(textField.getText() + "0"));

        button1.addActionListener(evt -> textField.setText(textField.getText() + "1"));

        button2.addActionListener(evt -> textField.setText(textField.getText() + "2"));

        button3.addActionListener(evt -> textField.setText(textField.getText() + "3"));

        button4.addActionListener(evt -> textField.setText(textField.getText() + "4"));

        button5.addActionListener(evt -> textField.setText(textField.getText() + "5"));

        button6.addActionListener(evt -> textField.setText(textField.getText() + "6"));

        button7.addActionListener(evt -> textField.setText(textField.getText() + "7"));

        button8.addActionListener(evt -> textField.setText(textField.getText() + "8"));

        button9.addActionListener(evt -> textField.setText(textField.getText() + "9"));

        buttonDecimal.addActionListener(evt -> textField.setText(textField.getText() + "."));

        buttonAdd.addActionListener(evt -> {
            firstNumber = Double.parseDouble(textField.getText());
            operator = '+';
            textField.setText("");
        });

        buttonSubtract.addActionListener(evt -> {
            firstNumber = Double.parseDouble(textField.getText());
            operator = '-';
            textField.setText("");
        });

        buttonMultiply.addActionListener(evt -> {
            firstNumber = Double.parseDouble(textField.getText());
            operator = '*';
            textField.setText("");
        });
        buttonDivide.addActionListener(evt -> {
            firstNumber = Double.parseDouble(textField.getText());
            operator = '/';
            textField.setText("");
        });

        buttonClear.addActionListener(evt -> textField.setText(""));

        buttonEqual.addActionListener(evt -> {
            secondNumber = Double.parseDouble(textField.getText());
            double result = switch (operator) {
                case '+' -> firstNumber + secondNumber;
                case '-' -> firstNumber - secondNumber;
                case '*' -> firstNumber * secondNumber;
                case '/' -> firstNumber / secondNumber;
                default -> 0;
            };
            textField.setText("" + result);
        });

        JPanel panel1 = new JPanel(new GridLayout(4, 3));
        panel1.add(button1);
        panel1.add(button2);
        panel1.add(button3);
        panel1.add(button4);
        panel1.add(button5);
        panel1.add(button6);
        panel1.add(button7);
        panel1.add(button8);
        panel1.add(button9);
        panel1.add(buttonDecimal);
        panel1.add(button0);
        panel1.add(buttonClear);

        JPanel panel2 = new JPanel(new GridLayout(4, 1));
        panel2.add(buttonAdd);
        panel2.add(buttonSubtract);
        panel2.add(buttonMultiply);
        panel2.add(buttonDivide);

        JPanel panel3 = new JPanel(new BorderLayout());
        panel3.add(textField, BorderLayout.NORTH);
        panel3.add(panel1, BorderLayout.CENTER);
        panel3.add(panel2, BorderLayout.EAST);
        panel3.add(buttonEqual, BorderLayout.SOUTH);

        setContentPane(panel3);
        pack();
        setLocationRelativeTo(null);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            Simple_Calculator calculator = new Simple_Calculator();
            calculator.setVisible(true);
        });
    }
}



