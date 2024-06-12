//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Calculator extends JFrame implements ActionListener {

    //                  Common keys
    private JButton buttonOne = new JButton("1");
    private JButton buttonTwo = new JButton("2");
    private JButton buttonThree = new JButton("3");
    private JButton buttonFour = new JButton("4");
    private JButton buttonFive = new JButton("5");
    private JButton buttonSix = new JButton("6");
    private JButton buttonSeven = new JButton("7");
    private JButton buttonEight = new JButton("8");
    private JButton buttonNine = new JButton("9");
    private JButton buttonZero = new JButton("0");
    private JButton buttonbMul = new JButton("\u00D7");
    private JButton buttonDiv = new JButton("\u00F7");
    private JButton buttonAdd = new JButton("+");
    private JButton buttonSub = new JButton("˗");
    private JButton buttonEqual = new JButton("=");
    private JButton buttonPoint = new JButton(".");
    private JButton buttonDel = new JButton("DE");
    private JButton buttonClear = new JButton("C");
    private JButton buttonSquare = new JButton("x²");
    private JButton buttonCube = new JButton("x³");
    private JButton buttonSqrt = new JButton("√");
    private JButton buttonPercent = new JButton("%");
    private JButton buttonMod = new JButton("Mod");
    private JButton buttonOneByN = new JButton("1/n");
    private JButton buttonPlusMinus = new JButton("±");

    //          Scientific Keys
    private JButton buttonSin = new JButton("sin");
    private JButton buttonCos = new JButton("cos");
    private JButton buttonTan = new JButton("tan");
    private JButton buttonAsin = new JButton("asin");
    private JButton buttonAcos = new JButton("acos");
    private JButton buttonAtan = new JButton("atan");
    private JButton buttonSinH = new JButton("sinh");
    private JButton buttonCosH = new JButton("cosh");
    private JButton buttonTanH = new JButton("tanh");
    private JButton buttonPowerOfTen = new JButton("10^n");
    private JButton buttonLog = new JButton("log");
    private JButton buttonLn = new JButton("ln");
    private JButton buttonAbs = new JButton("abs");
    private JButton buttonExit = new JButton("EXIT");

    //      Container variables

    private JTextField textFieldDisplay = new JTextField(); //result screen
    private JTextField textFieldRawInput = new JTextField();
    private String stringRawInput = "";
    private String stringDisplay = "";//Input String
    private boolean isPlus = true; // Is the sign of operand is plus
    private boolean isPoint = false;//Is the operant contains decimal
    private boolean isOperation = false;
    private double number1 = 0;//1st operand
    private double number2 = 0;//2nd operand
    private double result = 0;//Result
    private char operation = ' ';//Operation
    static Color windowColor = new Color(34, 90, 156);

    public Calculator() {
        setBackground(windowColor);
        setLayout(null);
        JPanel panelScreen1 = new JPanel();//input display screen
        JPanel panelScreen2 = new JPanel();//result display screen
        JPanel panelKeypad1 = new JPanel();//Common Keys Keypad
        JPanel panelKeypad2 = new JPanel();// Scientific Keys Keypad


        //Fonts and Colors
        Font fontResultDisplay = new Font("Times New Roman", Font.BOLD, 35);
        Font fontKeypad = new Font("Times New Roman", Font.PLAIN, 20);
        Font fontKeypad1 = new Font("Times New Roman", Font.PLAIN, 15);

        Color screenColor = new Color(91, 178, 91);
        Color numberKeyColor = new Color(212, 212, 212);
        Color equalColor = new Color(63, 132, 243);
        Color exitColor = new Color(224, 67, 67);
        Color otherColor = new Color(247, 247, 247);
        Color copyRightColor = new Color(0, 0, 255);


        // Designing the result Screen of the Calculator
        add(panelScreen1).setBounds(0, 0, 343, 30);
        panelScreen1.add(textFieldRawInput);
        panelScreen1.setLayout(null);
        textFieldRawInput.setBounds(0, 0, 343, 30);
        textFieldRawInput.setHorizontalAlignment(JTextField.LEFT);
        textFieldRawInput.setFont(new Font("Times New Roman", Font.PLAIN, 20));
        textFieldRawInput.setText("0");
        textFieldRawInput.setEditable(false);
        textFieldRawInput.setBackground(screenColor);
        textFieldRawInput.setForeground(Color.BLACK);

        //Designing the Result screen of the calculator
        add(panelScreen2).setBounds(0, 30, 343, 50);
        panelScreen2.setLayout(null);
        panelScreen2.add(textFieldDisplay);
        textFieldDisplay.setBounds(0, 0, 343, 50);
        textFieldDisplay.setHorizontalAlignment(JTextField.RIGHT);
        textFieldDisplay.setFont(fontResultDisplay);
        textFieldDisplay.setText("0");
        textFieldDisplay.setEditable(false);
        textFieldDisplay.setBackground(screenColor);
        textFieldDisplay.setForeground(Color.BLACK);

        //Designing the Common Keys
        add(panelKeypad1).setBounds(0, 100, 343, 190);
        panelKeypad1.setLayout(null);
        panelKeypad1.setBackground(windowColor);

        //Font, color, and style of Common keys

        buttonOne.setFont(fontKeypad);
        buttonOne.setBackground(numberKeyColor);
        buttonOne.setFocusable(false);
        buttonTwo.setFont(fontKeypad);
        buttonTwo.setBackground(numberKeyColor);
        buttonTwo.setFocusable(false);
        buttonThree.setFont(fontKeypad);
        buttonThree.setBackground(numberKeyColor);
        buttonThree.setFocusable(false);
        buttonFour.setFont(fontKeypad);
        buttonFour.setBackground(numberKeyColor);
        buttonFour.setFocusable(false);
        buttonFive.setFont(fontKeypad);
        buttonFive.setBackground(numberKeyColor);
        buttonFive.setFocusable(false);
        buttonSix.setFont(fontKeypad);
        buttonSix.setBackground(numberKeyColor);
        buttonSix.setFocusable(false);
        buttonSeven.setFont(fontKeypad);
        buttonSeven.setBackground(numberKeyColor);
        buttonSeven.setFocusable(false);
        buttonEight.setFont(fontKeypad);
        buttonEight.setBackground(numberKeyColor);
        buttonEight.setFocusable(false);
        buttonNine.setFont(fontKeypad);
        buttonNine.setBackground(numberKeyColor);
        buttonNine.setFocusable(false);
        buttonZero.setFont(fontKeypad);
        buttonZero.setBackground(numberKeyColor);
        buttonZero.setFocusable(false);
        buttonAdd.setFont(fontKeypad);
        buttonAdd.setBackground(otherColor);
        buttonAdd.setFocusable(false);
        buttonSub.setFont(fontKeypad);
        buttonSub.setBackground(otherColor);
        buttonSub.setFocusable(false);
        buttonbMul.setFont(fontKeypad);
        buttonbMul.setBackground(otherColor);
        buttonbMul.setFocusable(false);
        buttonDiv.setFont(fontKeypad);
        buttonDiv.setBackground(otherColor);
        buttonDiv.setFocusable(false);
        buttonPoint.setFont(fontKeypad);
        buttonPoint.setBackground(numberKeyColor);
        buttonPoint.setFocusable(false);
        buttonEqual.setFont(new Font("Times New Roman", Font.PLAIN, 40));
        buttonEqual.setBackground(equalColor);
        buttonEqual.setFocusable(false);
        buttonDel.setFont(fontKeypad);
        buttonDel.setBackground(Color.ORANGE);
        buttonDel.setFocusable(false);
        buttonClear.setFont(fontKeypad);
        buttonClear.setBackground(exitColor);
        buttonClear.setFocusable(false);
        buttonSquare.setFont(fontKeypad);
        buttonSquare.setBackground(otherColor);
        buttonSquare.setFocusable(false);
        buttonCube.setFont(fontKeypad);
        buttonCube.setBackground(otherColor);
        buttonCube.setFocusable(false);
        buttonPercent.setFont(fontKeypad);
        buttonPercent.setBackground(otherColor);
        buttonPercent.setFocusable(false);
        buttonMod.setFont(new Font("Times New Roman", Font.PLAIN, 10));
        buttonMod.setBackground(otherColor);
        buttonMod.setFocusable(false);
        buttonOneByN.setFont(fontKeypad);
        buttonOneByN.setBackground(otherColor);
        buttonOneByN.setFocusable(false);
        buttonPlusMinus.setFont(fontKeypad);
        buttonPlusMinus.setBackground(numberKeyColor);
        buttonPlusMinus.setFocusable(false);


        //          placing common keys

        //1st row
        panelKeypad1.add(buttonDel).setBounds(226, 0, 54, 38);
        panelKeypad1.add(buttonClear).setBounds(280, 0, 54, 38);
        // 2nd row
        panelKeypad1.add(buttonSeven).setBounds(10, 38, 54, 38);
        panelKeypad1.add(buttonEight).setBounds(64, 38, 54, 38);
        panelKeypad1.add(buttonNine).setBounds(118, 38, 54, 38);
        panelKeypad1.add(buttonbMul).setBounds(172, 38, 54, 38);
        panelKeypad1.add(buttonDiv).setBounds(226, 38, 54, 38);
        panelKeypad1.add(buttonSquare).setBounds(280, 38, 54, 38);
        // 3rd row
        panelKeypad1.add(buttonFour).setBounds(10, 76, 54, 38);
        panelKeypad1.add(buttonFive).setBounds(64, 76, 54, 38);
        panelKeypad1.add(buttonSix).setBounds(118, 76, 54, 38);
        panelKeypad1.add(buttonAdd).setBounds(172, 76, 54, 38);
        panelKeypad1.add(buttonSub).setBounds(226, 76, 54, 38);
        panelKeypad1.add(buttonCube).setBounds(280, 76, 54, 38);
        // 4th row
        panelKeypad1.add(buttonOne).setBounds(10, 114, 54, 38);
        panelKeypad1.add(buttonTwo).setBounds(64, 114, 54, 38);
        panelKeypad1.add(buttonThree).setBounds(118, 114, 54, 38);
        panelKeypad1.add(buttonEqual).setBounds(172, 114, 108, 38);
        panelKeypad1.add(buttonMod).setBounds(280, 114, 54, 38);
        // 5th row
        panelKeypad1.add(buttonZero).setBounds(10, 152, 54, 38);
        panelKeypad1.add(buttonPoint).setBounds(64, 152, 54, 38);
        panelKeypad1.add(buttonPlusMinus).setBounds(118, 152, 54, 38);
        panelKeypad1.add(buttonOneByN).setBounds(172, 152, 54, 38);
        panelKeypad1.add(buttonPercent).setBounds(226, 152, 54, 38);
        panelKeypad1.add(buttonSqrt).setBounds(280, 152, 54, 38);

        //          Designing Scientific Keys

        add(panelKeypad2).setBounds(0, 310, 343, 145);
        panelKeypad2.setLayout(null);
        panelKeypad2.setBackground(windowColor);

        //          placing scientific keys

        //	1st row
        panelKeypad2.add(buttonSin).setBounds(10, 0, 65, 38);
        panelKeypad2.add(buttonCos).setBounds(75, 0, 65, 38);
        panelKeypad2.add(buttonTan).setBounds(140, 0, 65, 38);
        panelKeypad2.add(buttonLog).setBounds(205, 0, 65, 38);
        panelKeypad2.add(buttonLn).setBounds(270, 0, 64, 38);
        //	2nd row
        panelKeypad2.add(buttonAsin).setBounds(10, 38, 65, 38);
        panelKeypad2.add(buttonAcos).setBounds(75, 38, 65, 38);
        panelKeypad2.add(buttonAtan).setBounds(140, 38, 65, 38);
        panelKeypad2.add(buttonPowerOfTen).setBounds(205, 38, 65, 38);
        panelKeypad2.add(buttonAbs).setBounds(270, 38, 64, 38);
        //	3rd row
        panelKeypad2.add(buttonSinH).setBounds(10, 76, 65, 38);
        panelKeypad2.add(buttonCosH).setBounds(75, 76, 65, 38);
        panelKeypad2.add(buttonTanH).setBounds(140, 76, 65, 38);
        panelKeypad2.add(buttonExit).setBounds(205, 76, 130, 38);

        //Font, color, and style of Scientific keys

        buttonSin.setFont(fontKeypad);
        buttonSin.setBackground(otherColor);
        buttonSin.setFocusable(false);
        buttonCos.setFont(fontKeypad);
        buttonCos.setBackground(otherColor);
        buttonCos.setFocusable(false);
        buttonTan.setFont(fontKeypad);
        buttonTan.setBackground(otherColor);
        buttonTan.setFocusable(false);
        buttonAsin.setFont(fontKeypad1);
        buttonAsin.setBackground(otherColor);
        buttonAsin.setFocusable(false);
        buttonAcos.setFont(fontKeypad1);
        buttonAcos.setBackground(otherColor);
        buttonAcos.setFocusable(false);
        buttonAtan.setFont(fontKeypad1);
        buttonAtan.setBackground(otherColor);
        buttonAtan.setFocusable(false);
        buttonSinH.setFont(fontKeypad1);
        buttonSinH.setBackground(otherColor);
        buttonSinH.setFocusable(false);
        buttonCosH.setFont(fontKeypad1);
        buttonCosH.setBackground(otherColor);
        buttonCosH.setFocusable(false);
        buttonTanH.setFont(fontKeypad1);
        buttonTanH.setBackground(otherColor);
        buttonTanH.setFocusable(false);
        buttonLog.setFont(fontKeypad);
        buttonLog.setBackground(otherColor);
        buttonLog.setFocusable(false);
        buttonLn.setFont(fontKeypad);
        buttonLn.setBackground(otherColor);
        buttonLn.setFocusable(false);
        buttonAbs.setFont(fontKeypad);
        buttonAbs.setBackground(otherColor);
        buttonAbs.setFocusable(false);
        buttonExit.setFont(fontKeypad);
        buttonExit.setBackground(exitColor);
        buttonExit.setFocusable(false);
        buttonPowerOfTen.setFont(fontKeypad1);
        buttonPowerOfTen.setBackground(otherColor);
        buttonPowerOfTen.setFocusable(false);

        //------------------------------------Adding ActionListener----------------------------------->


        //Common Keys
        buttonOne.addActionListener(this);
        buttonTwo.addActionListener(this);
        buttonThree.addActionListener(this);
        buttonFour.addActionListener(this);
        buttonFive.addActionListener(this);
        buttonSix.addActionListener(this);
        buttonSeven.addActionListener(this);
        buttonEight.addActionListener(this);
        buttonNine.addActionListener(this);
        buttonZero.addActionListener(this);
        buttonAdd.addActionListener(this);
        buttonSub.addActionListener(this);
        buttonbMul.addActionListener(this);
        buttonDiv.addActionListener(this);
        buttonPoint.addActionListener(this);
        buttonEqual.addActionListener(this);
        buttonDel.addActionListener(this);
        buttonClear.addActionListener(this);
        buttonSquare.addActionListener(this);
        buttonSqrt.addActionListener(this);
        buttonCube.addActionListener(this);
        buttonPercent.addActionListener(this);
        buttonMod.addActionListener(this);
        buttonOneByN.addActionListener(this);
        buttonPlusMinus.addActionListener(this);

        //Scientific Keys
        buttonSin.addActionListener(this);
        buttonCos.addActionListener(this);
        buttonTan.addActionListener(this);
        buttonAsin.addActionListener(this);
        buttonAcos.addActionListener(this);
        buttonAtan.addActionListener(this);
        buttonSinH.addActionListener(this);
        buttonCosH.addActionListener(this);
        buttonTanH.addActionListener(this);
        buttonPowerOfTen.addActionListener(this);
        buttonLog.addActionListener(this);
        buttonLn.addActionListener(this);
        buttonAbs.addActionListener(this);
        buttonExit.addActionListener(this);


    }

    public static void main(String[] args) {

        Calculator frame = new Calculator();
        frame.setTitle("Calculator");
        frame.setSize(350, 500);
        frame.getContentPane().setBackground(windowColor);
        frame.setLocationRelativeTo(null);
        frame.setResizable(false);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {

        if (e.getSource() == buttonOne) {
            if (operation == '=') {
                stringDisplay = "1";
                stringRawInput = "1";
                textFieldRawInput.setText(stringRawInput);
                operation = ' ';
            } else {
                stringDisplay = stringDisplay + "1";
                stringRawInput += "1";
                textFieldRawInput.setText(stringRawInput);
            }
        } else if (e.getSource() == buttonTwo) {
            if (operation == '=') {
                stringDisplay = "2";
                stringRawInput = "2";
                textFieldRawInput.setText(stringRawInput);
                operation = ' ';
            } else {
                stringDisplay = stringDisplay + "2";
                stringRawInput += "2";
                textFieldRawInput.setText(stringRawInput);
            }
        } else if (e.getSource() == buttonThree) {
            if (operation == '=') {
                stringDisplay = "3";
                stringRawInput = "3";
                textFieldRawInput.setText(stringRawInput);
                operation = ' ';
            } else {
                stringDisplay = stringDisplay + "3";
                stringRawInput += "3";
                textFieldRawInput.setText(stringRawInput);
            }
        } else if (e.getSource() == buttonFour) {
            if (operation == '=') {
                stringDisplay = "4";
                stringRawInput = "4";
                textFieldRawInput.setText(stringRawInput);
                operation = ' ';
            } else {
                stringDisplay = stringDisplay + "4";
                stringRawInput += "4";
                textFieldRawInput.setText(stringRawInput);
            }
        } else if (e.getSource() == buttonFive) {
            if (operation == '=') {
                stringDisplay = "5";
                stringRawInput = "5";
                textFieldRawInput.setText(stringRawInput);
                operation = ' ';
            } else {
                stringDisplay = stringDisplay + "5";
                stringRawInput += "5";
                textFieldRawInput.setText(stringRawInput);
            }
        } else if (e.getSource() == buttonSix) {
            if (operation == '=') {
                stringDisplay = "6";
                stringRawInput = "6";
                textFieldRawInput.setText(stringRawInput);
                operation = ' ';
            } else {
                stringDisplay = stringDisplay + "6";
                stringRawInput += "6";
                textFieldRawInput.setText(stringRawInput);
            }
        } else if (e.getSource() == buttonSeven) {
            if (operation == '=') {
                stringDisplay = "7";
                stringRawInput = "7";
                textFieldRawInput.setText(stringRawInput);
                operation = ' ';
            } else {
                stringDisplay = stringDisplay + "7";
                stringRawInput += "7";
                textFieldRawInput.setText(stringRawInput);
            }
        } else if (e.getSource() == buttonEight) {
            if (operation == '=') {
                stringDisplay = "8";
                stringRawInput = "8";
                textFieldRawInput.setText(stringRawInput);
                operation = ' ';
            } else {
                stringDisplay = stringDisplay + "8";
                stringRawInput += "8";
                textFieldRawInput.setText(stringRawInput);
            }
        } else if (e.getSource() == buttonNine) {
            if (operation == '=') {
                stringDisplay = "9";
                stringRawInput = "9";
                textFieldRawInput.setText(stringRawInput);
                operation = ' ';
            } else {
                stringDisplay = stringDisplay + "9";
                stringRawInput += "9";
                textFieldRawInput.setText(stringRawInput);
            }
        } else if (e.getSource() == buttonZero) {
            if (stringDisplay.equals("")) {
                stringDisplay = "0";
                stringRawInput += "0";
                textFieldRawInput.setText(stringRawInput);
            } else {
                stringDisplay = stringDisplay + "0";
                stringRawInput += "0";
                textFieldRawInput.setText(stringRawInput);
            }
        } else if (e.getSource() == buttonPoint) {
            if (stringDisplay.equals("")) {
                stringDisplay = "0.";
                stringRawInput += "0.";
                textFieldRawInput.setText(stringRawInput);
            } else if (!isPoint) {
                stringDisplay = stringDisplay + ".";
                stringRawInput += ".";
                textFieldRawInput.setText(stringRawInput);
            }
            isPoint = true;
        } else if (e.getSource() == buttonPlusMinus && !stringDisplay.equals("") && !isOperation) {
            if (isPlus) {
                stringDisplay = "-" + stringDisplay;
                stringRawInput = stringDisplay;
                textFieldRawInput.setText(stringRawInput);
                isPlus = false;
            } else {
                stringDisplay = stringDisplay.substring(1, stringDisplay.length());
                stringRawInput = stringDisplay.substring(1, stringDisplay.length());
                textFieldRawInput.setText(stringRawInput);
                isPlus = true;
            }
        } else if (e.getSource() == buttonAdd && (!stringDisplay.equals("") || operation == '=')) {
            if (!isOperation) {
                number1 = Double.parseDouble(stringDisplay);
                stringDisplay = "";
                operation = '+';
                isPlus = true;
                stringRawInput += " + ";
                textFieldRawInput.setText(stringRawInput);
                if (isPoint) {
                    textFieldDisplay.setText("" + number1);
                } else if (!isPoint) {
                    textFieldDisplay.setText("" + (long) number1);
                }
            } else if (isOperation && operation != '=') {
                number2 = Double.parseDouble(stringDisplay);

                if (operation == '+') {
                    result = number1 + number2;
                } else if (operation == '-') {
                    result = number1 - number2;
                } else if (operation == '*') {
                    result = number1 * number2;
                } else if (operation == '/') {
                    result = number1 / number2;
                } else if (operation == '%') {
                    result = number1 % number2;
                } else {
                    result = number2;
                }

                String temp = "";
                if (isPoint || operation == '/') {
                    textFieldDisplay.setText("" + result);
                    temp = "" + result;
                } else if (!isPoint) {
                    textFieldDisplay.setText("" + (long) result);
                    temp = "" + (long) result;
                }

                operation = '+';
                stringDisplay = "";
                number1 = result;
                isPlus = true;
                isPoint = false;
                stringRawInput += " + ";
                textFieldRawInput.setText(stringRawInput);
                stringRawInput = temp + " + ";
            } else if (operation == '=') {
                stringDisplay = "";
                operation = '+';
                isPlus = true;
                isOperation = true;
                stringRawInput += " + ";
                textFieldRawInput.setText(stringRawInput);
            }
            isOperation = true;
        } else if (e.getSource() == buttonSub && (!stringDisplay.equals("") || operation == '=')) {
            if (!isOperation) {
                number1 = Double.parseDouble(stringDisplay);
                stringDisplay = "";
                operation = '-';
                isPlus = true;
                stringRawInput += " - ";
                textFieldRawInput.setText(stringRawInput);

                if (isPoint) {
                    textFieldDisplay.setText("" + number1);
                } else if (!isPoint) {
                    textFieldDisplay.setText("" + (long) number1);
                }
            } else if (isOperation && operation != '=') {
                number2 = Double.parseDouble(stringDisplay);

                if (operation == '+') {
                    result = number1 + number2;
                } else if (operation == '-') {
                    result = number1 - number2;
                } else if (operation == '*') {
                    result = number1 * number2;
                } else if (operation == '/') {
                    result = number1 / number2;
                } else if (operation == '%') {
                    result = number1 % number2;
                } else {
                    result = number2;
                }

                String temp = "";
                if (isPoint || operation == '/') {
                    textFieldDisplay.setText("" + result);
                    temp = "" + result;
                } else if (!isPoint) {
                    textFieldDisplay.setText("" + (long) result);
                    temp = "" + (long) result;
                }

                operation = '-';
                stringDisplay = "";
                number1 = result;
                isPlus = true;
                isPoint = false;
                stringRawInput += " - ";
                textFieldRawInput.setText(stringRawInput);
                stringRawInput = temp + " + ";
            } else if (operation == '=') {
                stringDisplay = "";
                operation = '-';
                isPlus = true;
                isOperation = true;
                stringRawInput += " - ";
                textFieldRawInput.setText(stringRawInput);
            }
            isOperation = true;
        } else if (e.getSource() == buttonbMul && (!stringDisplay.equals("") || operation == '=')) {
            if (!isOperation) {
                number1 = Double.parseDouble(stringDisplay);
                stringDisplay = "";
                operation = '*';
                isPlus = true;
                stringRawInput += " \u00D7 ";
                textFieldRawInput.setText(stringRawInput);

                if (isPoint) {
                    textFieldDisplay.setText("" + number1);
                } else if (!isPoint) {
                    textFieldDisplay.setText("" + (long) number1);
                }
            } else if (isOperation && operation != '=') {
                number2 = Double.parseDouble(stringDisplay);

                if (operation == '+') {
                    result = number1 + number2;
                } else if (operation == '-') {
                    result = number1 - number2;
                } else if (operation == '*') {
                    result = number1 * number2;
                } else if (operation == '/') {
                    result = number1 / number2;
                } else if (operation == '%') {
                    result = number1 % number2;
                } else {
                    result = number2;
                }

                String temp = "";
                if (isPoint || operation == '/') {
                    textFieldDisplay.setText("" + result);
                    temp = "" + result;
                } else if (!isPoint) {
                    textFieldDisplay.setText("" + (long) result);
                    temp = "" + (long) result;
                }

                operation = '*';
                stringDisplay = "";
                number1 = result;
                isPlus = true;
                isPoint = false;
                stringRawInput += " \u00D7 ";
                textFieldRawInput.setText(stringRawInput);
                stringRawInput = temp + " \u00D7 ";
            } else if (operation == '=') {
                stringDisplay = "";
                operation = '*';
                isPlus = true;
                isOperation = true;
                stringRawInput += " \u00D7 ";
                textFieldRawInput.setText(stringRawInput);
            }
            isOperation = true;
        } else if (e.getSource() == buttonDiv && (!stringDisplay.equals("") || operation == '=')) {
            if (!isOperation) {
                number1 = Double.parseDouble(stringDisplay);
                stringDisplay = "";
                operation = '/';
                isPlus = true;
                stringRawInput += " / ";
                textFieldRawInput.setText(stringRawInput);

                if (isPoint) {
                    textFieldDisplay.setText("" + number1);
                } else if (!isPoint) {
                    textFieldDisplay.setText("" + (long) number1);
                }
            } else if (isOperation && operation != '=') {
                number2 = Double.parseDouble(stringDisplay);

                if (operation == '+') {
                    result = number1 + number2;
                } else if (operation == '-') {
                    result = number1 - number2;
                } else if (operation == '*') {
                    result = number1 * number2;
                } else if (operation == '/') {
                    result = number1 / number2;
                } else if (operation == '%') {
                    result = number1 % number2;
                } else {
                    result = number2;
                }

                String temp = "";
                if (isPoint || operation == '/') {
                    textFieldDisplay.setText("" + result);
                    temp = "" + result;
                } else if (!isPoint) {
                    textFieldDisplay.setText("" + (long) result);
                    temp = "" + (long) result;
                }

                operation = '*';
                stringDisplay = "";
                number1 = result;
                isPlus = true;
                isPoint = false;
                stringRawInput += " / ";
                textFieldRawInput.setText(stringRawInput);
                stringRawInput = temp + " / ";
            } else if (operation == '=') {
                stringDisplay = "";
                operation = '/';
                isPlus = true;
                isOperation = true;
                stringRawInput += " / ";
                textFieldRawInput.setText(stringRawInput);
            }
            isOperation = true;
        } else if (e.getSource() == buttonMod && (!stringDisplay.equals("") || operation == '=')) {
            if (!isOperation) {
                number1 = Double.parseDouble(stringDisplay);
                stringDisplay = "";
                operation = '%';
                isPlus = true;
                stringRawInput += " mod ";
                textFieldRawInput.setText(stringRawInput);

                if (isPoint) {
                    textFieldDisplay.setText("" + number1);
                } else if (!isPoint) {
                    textFieldDisplay.setText("" + (long) number1);
                }
            } else if (isOperation && operation != '=') {
                number2 = Double.parseDouble(stringDisplay);

                if (operation == '+') {
                    result = number1 + number2;
                } else if (operation == '-') {
                    result = number1 - number2;
                } else if (operation == '*') {
                    result = number1 * number2;
                } else if (operation == '/') {
                    result = number1 / number2;
                } else if (operation == '%') {
                    result = number1 % number2;
                } else {
                    result = number2;
                }

                String temp = "";
                if (isPoint || operation == '/') {
                    textFieldDisplay.setText("" + result);
                    temp = "" + result;
                } else if (!isPoint) {
                    textFieldDisplay.setText("" + (long) result);
                    temp = "" + (long) result;
                }

                operation = '%';
                stringDisplay = "";
                number1 = result;
                isPlus = true;
                isPoint = false;
                stringRawInput += " mod ";
                textFieldRawInput.setText(stringRawInput);
                stringRawInput = temp + " * ";
            } else if (operation == '=') {
                stringDisplay = "";
                operation = '%';
                isPlus = true;
                isOperation = true;
                stringRawInput += " mod ";
                textFieldRawInput.setText(stringRawInput);
            }
            isOperation = true;
        } else if (e.getSource() == buttonEqual && !stringDisplay.equals("")) {

            number2 = Double.parseDouble(stringDisplay);

            if (operation == '+') {
                result = number1 + number2;
            } else if (operation == '-') {
                result = number1 - number2;
            } else if (operation == '*') {
                result = number1 * number2;
            } else if (operation == '/') {
                result = number1 / number2;
            } else if (operation == '%') {
                result = number1 % number2;
            } else {
                result = number2;
            }

            String temp = "";
            if (isPoint || operation == '/') {
                textFieldDisplay.setText("" + result);
                temp = "" + result;
            } else if (!isPoint) {
                textFieldDisplay.setText("" + (long) result);
                temp = "" + (long) result;
            }

            operation = '=';
            isOperation = true;
            stringDisplay = "";
            number1 = result;
            isPlus = true;
            isPoint = false;
            stringRawInput += " = ";
            textFieldRawInput.setText(stringRawInput);
            stringRawInput = temp;
        } else if (e.getSource() == buttonDel && !stringDisplay.equals("")) {
            stringDisplay = stringDisplay.substring(0, stringDisplay.length() - 1);
            stringRawInput = stringRawInput.substring(0, stringRawInput.length() - 1);
            if (stringRawInput.equals("")) {
                textFieldRawInput.setText("0");
            } else {
                textFieldRawInput.setText(stringRawInput);
            }
        } else if (e.getSource() == buttonClear) {
            number1 = number2 = result = 0;
            stringDisplay = "";
            operation = ' ';
            textFieldDisplay.setText("0");
            isPoint = false;
            isPlus = true;
            isOperation = false;
            stringRawInput = "";
            textFieldRawInput.setText("0");
        } else if (e.getSource() == buttonSquare && !stringDisplay.equals("")) {
            number1 = Double.parseDouble(stringDisplay);
            result = Math.pow(number1, 2);
            String temp = "";
            if (!isPoint) {
                textFieldDisplay.setText("" + (long) result);
                temp = "" + (long) result;
            } else {
                textFieldDisplay.setText("" + result);
                temp = "" + result;
            }

            stringRawInput += "^2 = ";
            textFieldRawInput.setText(stringRawInput);
            stringRawInput = temp;
            stringDisplay = "";
            number1 = result;
            operation = '=';
            isPlus = true;
            isOperation = true;
            isPoint = false;
        } else if (e.getSource() == buttonSqrt && !stringDisplay.equals("")) {
            number1 = Double.parseDouble(stringDisplay);
            result = Math.sqrt(number1);
            stringRawInput = "√" + stringRawInput;
            textFieldRawInput.setText(stringRawInput);
            textFieldDisplay.setText("" + result);
            stringRawInput = "" + result;
            stringDisplay = "";
            number1 = result;
            operation = '=';
            isPoint = true;
            isOperation = true;
            isPlus = true;
        } else if (e.getSource() == buttonCube && !stringDisplay.equals("")) {
            number1 = Double.parseDouble(stringDisplay);
            result = Math.pow(number1, 3);
            String temp = "";
            if (!isPoint) {
                textFieldDisplay.setText("" + (long) result);
                temp = "" + (long) result;

            } else {
                textFieldDisplay.setText("" + result);
                temp = "" + result;
            }

            stringRawInput += "^3 = ";
            textFieldRawInput.setText(stringRawInput);
            stringRawInput = temp;
            stringDisplay = "";
            number1 = result;
            operation = '=';
            isPoint = false;
            isOperation = true;
            isPlus = true;
        } else if (e.getSource() == buttonOneByN && !stringDisplay.equals("")) {
            number1 = Double.parseDouble(stringDisplay);
            result = 1 / number1;
            if (isPoint) {
                stringRawInput = "1 / " + number1;
            } else {
                stringRawInput = "1 / " + (long) number1;
            }

            textFieldRawInput.setText(stringRawInput);
            textFieldDisplay.setText("" + result);
            stringDisplay = "";
            stringRawInput = "" + result;
            number1 = result;
            operation = '=';
            isPoint = true;
            isOperation = true;
            isPlus = true;
        } else if (e.getSource() == buttonPercent && !stringDisplay.equals("") && operation == '*') {
            number2 = Double.parseDouble(stringDisplay);
            result = number1 * (number2 / 100);
            stringRawInput = number1 + " \u00D7 " + number2 + "%";
            textFieldRawInput.setText(stringRawInput);
            textFieldDisplay.setText("" + result);
            stringDisplay = "";
            number1 = result;
            operation = '=';
            isPlus = true;
            isOperation = true;
            isPoint = true;
            stringRawInput = "" + result;
        } else if (e.getSource() == buttonSin && !stringDisplay.equals(""))//sin function
        {
            number1 = Double.parseDouble(stringDisplay);
            if (number1 == 30) {
                result = Math.sin(Math.toRadians(number1)) + 0.0000000000000001;
            } else {
                result = Math.sin(Math.toRadians(number1));
            }
            stringRawInput = "sin(" + stringRawInput + ")";
            textFieldRawInput.setText(stringRawInput);
            textFieldDisplay.setText("" + result);
            stringRawInput = "" + result;
            stringDisplay = "";
            number1 = result;
            operation = '=';
            isPoint = true;
            isOperation = true;
            isPlus = true;
        } else if (e.getSource() == buttonCos && !stringDisplay.equals(""))//cosine function
        {
            number1 = Double.parseDouble(stringDisplay);
            if (number1 == 60) {
                result = Math.cos(Math.toRadians(number1)) - 0.0000000000000001;
            } else if (number1 == 90) {
                result = 0;
            } else {
                result = Math.cos(Math.toRadians(number1));
            }
            stringRawInput = "cos(" + stringRawInput + ")";
            textFieldRawInput.setText(stringRawInput);
            textFieldDisplay.setText("" + result);
            stringRawInput = "" + result;
            stringDisplay = "";
            number1 = result;
            operation = '=';
            isPoint = true;
            isOperation = true;
            isPlus = true;
        } else if (e.getSource() == buttonTan && !stringDisplay.equals(""))//tan function
        {
            number1 = Double.parseDouble(stringDisplay);
            if (number1 == 45) {
                result = Math.tan(Math.toRadians(number1)) + 0.0000000000000001;
            } else if (number1 == 90) {
                result = 0;
                textFieldDisplay.setText("Invalid");
            } else {
                result = Math.tan(Math.toRadians(number1));
            }
            stringRawInput = "tan(" + stringRawInput + ")";
            textFieldRawInput.setText(stringRawInput);
            if (number1 != 90) {
                textFieldDisplay.setText("" + result);
            }
            stringRawInput = "" + result;
            stringDisplay = "";
            number1 = result;
            operation = '=';
            isPoint = true;
            isOperation = true;
            isPlus = true;
        } else if (e.getSource() == buttonSinH && !stringDisplay.equals(""))//sinh function
        {
            number1 = Double.parseDouble(stringDisplay);
            result = Math.sinh(Math.toRadians(number1));
            stringRawInput = "sinh(" + stringRawInput + ")";
            textFieldRawInput.setText(stringRawInput);
            textFieldDisplay.setText("" + result);
            stringRawInput = "" + result;
            stringDisplay = "";
            number1 = result;
            operation = '=';
            isPoint = true;
            isOperation = true;
            isPlus = true;
        } else if (e.getSource() == buttonCosH && !stringDisplay.equals(""))//cosh function
        {
            number1 = Double.parseDouble(stringDisplay);
            result = Math.cosh(Math.toRadians(number1));
            stringRawInput = "cosh(" + stringRawInput + ")";
            textFieldRawInput.setText(stringRawInput);
            textFieldDisplay.setText("" + result);
            stringRawInput = "" + result;
            stringDisplay = "";
            number1 = result;
            operation = '=';
            isPoint = true;
            isOperation = true;
            isPlus = true;
        } else if (e.getSource() == buttonTanH && !stringDisplay.equals(""))//tanh function
        {
            number1 = Double.parseDouble(stringDisplay);
            result = Math.tanh(Math.toRadians(number1));
            stringRawInput = "tanH(" + stringRawInput + ")";
            textFieldRawInput.setText(stringRawInput);
            textFieldDisplay.setText("" + result);
            stringRawInput = "" + result;
            stringDisplay = "";
            number1 = result;
            operation = '=';
            isPoint = true;
            isOperation = true;
            isPlus = true;
        } else if (e.getSource() == buttonAsin && !stringDisplay.equals(""))//asin function
        {
            number1 = Double.parseDouble(stringDisplay);
            result = Math.asin(Math.toRadians(number1));
            stringRawInput = "asin(" + stringRawInput + ")";
            textFieldRawInput.setText(stringRawInput);
            textFieldDisplay.setText("" + result);
            stringRawInput = "" + result;
            stringDisplay = "";
            number1 = result;
            operation = '=';
            isPoint = true;
            isOperation = true;
            isPlus = true;
        } else if (e.getSource() == buttonAcos && !stringDisplay.equals(""))//acos function
        {
            number1 = Double.parseDouble(stringDisplay);
            result = Math.acos(Math.toRadians(number1));
            stringRawInput = "acos(" + stringRawInput + ")";
            textFieldRawInput.setText(stringRawInput);
            textFieldDisplay.setText("" + result);
            stringRawInput = "" + result;
            stringDisplay = "";
            number1 = result;
            operation = '=';
            isPoint = true;
            isOperation = true;
            isPlus = true;
        } else if (e.getSource() == buttonAtan && !stringDisplay.equals(""))//atan function
        {
            number1 = Double.parseDouble(stringDisplay);
            result = Math.atan(Math.toRadians(number1));
            stringRawInput = "atan(" + stringRawInput + ")";
            textFieldRawInput.setText(stringRawInput);
            textFieldDisplay.setText("" + result);
            stringRawInput = "" + result;
            stringDisplay = "";
            number1 = result;
            operation = '=';
            isPoint = true;
            isOperation = true;
            isPlus = true;
        } else if (e.getSource() == buttonLog && !stringDisplay.equals(""))//log function
        {
            number1 = Double.parseDouble(stringDisplay);
            result = Math.log10(number1);
            stringRawInput = "log" + stringRawInput;
            textFieldRawInput.setText(stringRawInput);
            textFieldDisplay.setText("" + result);
            stringRawInput = "" + result;
            stringDisplay = "";
            number1 = result;
            operation = '=';
            isPoint = true;
            isOperation = true;
            isPlus = true;
        } else if (e.getSource() == buttonLn && !stringDisplay.equals(""))//ln function
        {
            number1 = Double.parseDouble(stringDisplay);
            result = Math.log(number1);
            stringRawInput = "ln" + stringRawInput;
            textFieldRawInput.setText(stringRawInput);
            textFieldDisplay.setText("" + result);
            stringRawInput = "" + result;
            stringDisplay = "";
            number1 = result;
            operation = '=';
            isPoint = true;
            isOperation = true;
            isPlus = true;
        } else if (e.getSource() == buttonAbs && !stringDisplay.equals(""))//abs function
        {
            number1 = Double.parseDouble(stringDisplay);
            result = Math.abs(number1);
            stringRawInput = "abs(" + stringRawInput + ")";
            textFieldRawInput.setText(stringRawInput);
            textFieldDisplay.setText("" + result);
            stringRawInput = "" + result;
            stringDisplay = "";
            number1 = result;
            operation = '=';
            isPoint = true;
            isOperation = true;
            isPlus = true;
        } else if (e.getSource() == buttonPowerOfTen && !stringDisplay.equals(""))//power of ten function
        {
            number1 = Double.parseDouble(stringDisplay);
            result = Math.pow(10, number1);
            stringRawInput = "10^" + stringRawInput;
            textFieldRawInput.setText(stringRawInput);
            textFieldDisplay.setText("" + result);
            stringRawInput = "" + result;
            stringDisplay = "";
            number1 = result;
            operation = '=';
            isPoint = true;
            isOperation = true;
            isPlus = true;
        } else if (e.getSource() == buttonExit)//exit button
        {
            System.exit(0);
        }

    }
}