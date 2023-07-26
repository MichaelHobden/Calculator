import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.ArrayList;

/**
 * Write a description of class Calculator here.
 *
 * @author Michael Hobden
 */
public class Calculator extends JFrame {
    //hard coded data for certain features of the application
    private static int PREFERRED_WIDTH = 500;
    private static int PREFERRED_HEIGHT = 600;
    private static final Dimension PREFERRED_SIZE = new Dimension(PREFERRED_WIDTH, PREFERRED_HEIGHT);
    //variables to store data thats displayed and for the future calculation
    private String calculation = "";
    private static String DisplayText = "0";
    private Boolean StartOfSum = true;
    private Boolean onNums = true;
    //asset for the display
    private static JTextField Display = new JTextField();


    public Calculator() {
        setTitle("MyCalculator");
        JPanel contentPane = new JPanel();
        //code to sort out how the panels are orientated to get a desired layout
        GridLayout CalculatorLayout = new GridLayout(4, 3);
        GridLayout GlobalLayout = new GridLayout(2, 1);

        contentPane.setLayout(CalculatorLayout);
        setSize(PREFERRED_SIZE);
        setLayout(GlobalLayout);

        //code to create buttons style them add them to the frame and add action event listeners to them
        //this code also styles the Display Panel
        JButton Button0, Button1, Button2, Button3, Button4, Button5, Button6, Button7, Button8, Button9, ButtonAdd, ButtonSubtract, ButtonDivide, ButtonMultiply, ButtonEquals, ButtonClear;

        Display.setEditable(false);
        Display.setText("0");
        Display.setHorizontalAlignment(SwingConstants.RIGHT);
        Display.setBackground(Color.WHITE);
        Display.setFont(new Font("ARIAL", Font.BOLD, 60));


        Button0 = new JButton("0");
        Button0.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                ButtonPressed(0);
            }
        });
        Button0.setBackground(Color.WHITE);
        Button0.setFont(new Font("ARIAL", Font.BOLD, 40));

        Button1 = new JButton("1");
        Button1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                ButtonPressed(1);
            }
        });
        Button1.setBackground(Color.WHITE);
        Button1.setFont(new Font("ARIAL", Font.BOLD, 40));

        Button2 = new JButton("2");
        Button2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                ButtonPressed(2);
            }
        });
        Button2.setBackground(Color.WHITE);
        Button2.setFont(new Font("ARIAL", Font.BOLD, 40));

        Button3 = new JButton("3");
        Button3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                ButtonPressed(3);
            }
        });
        Button3.setBackground(Color.WHITE);
        Button3.setFont(new Font("ARIAL", Font.BOLD, 40));

        Button4 = new JButton("4");
        Button4.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                ButtonPressed(4);
            }
        });
        Button4.setBackground(Color.WHITE);
        Button4.setFont(new Font("ARIAL", Font.BOLD, 40));

        Button5 = new JButton("5");
        Button5.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                ButtonPressed(5);
            }
        });
        Button5.setBackground(Color.WHITE);
        Button5.setFont(new Font("ARIAL", Font.BOLD, 40));

        Button6 = new JButton("6");
        Button6.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                ButtonPressed(6);
            }
        });
        Button6.setBackground(Color.WHITE);
        Button6.setFont(new Font("ARIAL", Font.BOLD, 40));

        Button7 = new JButton("7");
        Button7.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                ButtonPressed(7);
            }
        });
        Button7.setBackground(Color.WHITE);
        Button7.setFont(new Font("ARIAL", Font.BOLD, 40));

        Button8 = new JButton("8");
        Button8.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                ButtonPressed(8);
            }
        });
        Button8.setBackground(Color.WHITE);
        Button8.setFont(new Font("ARIAL", Font.BOLD, 40));

        Button9 = new JButton("9");
        Button9.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                ButtonPressed(9);
            }
        });
        Button9.setBackground(Color.WHITE);
        Button9.setFont(new Font("ARIAL", Font.BOLD, 40));

        ButtonAdd = new JButton("+");
        ButtonAdd.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                ButtonPressed(10);
            }
        });
        ButtonAdd.setBackground(Color.WHITE);
        ButtonAdd.setFont(new Font("ARIAL", Font.BOLD, 40));
        ButtonAdd.setForeground(Color.BLUE);

        ButtonSubtract = new JButton("-");
        ButtonSubtract.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                ButtonPressed(11);
            }
        });
        ButtonSubtract.setBackground(Color.WHITE);
        ButtonSubtract.setFont(new Font("ARIAL", Font.BOLD, 40));
        ButtonSubtract.setForeground(Color.BLUE);

        ButtonMultiply = new JButton("×");
        ButtonMultiply.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                ButtonPressed(12);
            }
        });
        ButtonMultiply.setBackground(Color.WHITE);
        ButtonMultiply.setFont(new Font("ARIAL", Font.BOLD, 40));
        ButtonMultiply.setForeground(Color.BLUE);

        ButtonDivide = new JButton("÷");
        ButtonDivide.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                ButtonPressed(13);
            }
        });
        ButtonDivide.setBackground(Color.WHITE);
        ButtonDivide.setFont(new Font("ARIAL", Font.BOLD, 40));
        ButtonDivide.setForeground(Color.BLUE);

        ButtonClear = new JButton("AC");
        ButtonClear.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                ButtonPressed(14);
            }
        });
        ButtonClear.setBackground(Color.WHITE);
        ButtonClear.setFont(new Font("ARIAL", Font.BOLD, 40));
        ButtonClear.setForeground(Color.ORANGE);

        ButtonEquals = new JButton("=");
        ButtonEquals.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                ButtonPressed(15);
            }
        });
        ButtonEquals.setBackground(Color.WHITE);
        ButtonEquals.setFont(new Font("ARIAL", Font.BOLD, 40));
        ButtonEquals.setForeground(Color.RED);

        //adding all the buttons to a seperate Panel for orientation purposes.
        contentPane.add(add(Button7));
        contentPane.add(add(Button8));
        contentPane.add(add(Button9));
        contentPane.add(add(ButtonDivide));

        contentPane.add(add(Button4));
        contentPane.add(add(Button5));
        contentPane.add(add(Button6));
        contentPane.add(add(ButtonMultiply));


        contentPane.add(add(Button1));
        contentPane.add(add(Button2));
        contentPane.add(add(Button3));
        contentPane.add(add(ButtonSubtract));

        contentPane.add(add(ButtonClear));
        contentPane.add(add(Button0));
        contentPane.add(add(ButtonEquals));
        contentPane.add(add(ButtonAdd));

        add(Display);
        add(contentPane);

        pack();
        show();

    }

    //this code handles when a button is pressed,  the event is fired and then calls this function passing a value assigned to the button
    //this also houses the logic of the display aswell as the functionality of the clear and equals button
    public void ButtonPressed(int Button) {
        if (Button <= 9) {
            if (StartOfSum) {
                StartOfSum = false;
                DisplayText = "" + Button;

            } else if (DisplayText == "0") {
                DisplayText = "" + Button;

            } else if (onNums) {
                DisplayText += Button;
            } else {
                DisplayText = "" + Button;
            }
            calculation = calculation + Button;
            onNums = true;
        } else if (Button == 10) {
            DisplayText = "+";
            calculation += "+";
            onNums = false;
        } else if (Button == 11) {
            DisplayText = "-";
            calculation += "-";
            onNums = false;
        } else if (Button == 12) {
            DisplayText = "×";
            calculation += "*";
            onNums = false;
        } else if (Button == 13) {
            DisplayText = "÷";
            calculation += "%";
            onNums = false;
        } else if (Button == 14) {
            DisplayText = "0";
            calculation = "";
            onNums = false;
        } else if (Button == 15) {
            DisplayText = CalculateString(calculation);
            calculation = "";
            onNums = false;
            StartOfSum = true;
        }
        Draw();
    }
    //this simple function is called to update the Display
    public static void Draw() {
        Display.setText(DisplayText);
    }
    //this code takes a String that is equal to a calculation 2 other methods are chain fired and then the data is process to be calculated here.
    public static String CalculateString(String str) {
        ArrayList<String> processedSum = ConvertStringToArrayList(str);
        ArrayList<String> processedSumAfterFirstStep = new ArrayList<>();
        //this works out the multiplication and division sums following bodmas and passes the values with the other values and the plus and minus signs to the next ArrayList
        for (int i = 0; i < (int) ((processedSum.size() / 2) + 0.5); i++) {
            int position = (i * 2) + 1;
            String operator = processedSum.get(position);
            for (String test : processedSum
            ) {
                System.out.println(test);
            }
            switch (operator) {
                case "+":
                case "-": {
                    processedSumAfterFirstStep.add(processedSum.get(position - 1));
                    processedSumAfterFirstStep.add(processedSum.get(position));
                    break;
                }
                case "%": {
                    System.out.println("P: " + position);
                    processedSum.set(position - 1, String.valueOf((Double.parseDouble(processedSum.get(position - 1))) / (Double.parseDouble(processedSum.get(position + 1)))));
                    processedSum.remove(position + 1);
                    processedSum.remove(position);
                    i--;
                    break;
                }
                case "*": {
                    processedSum.set(position - 1, String.valueOf((Double.parseDouble(processedSum.get(position - 1))) * (Double.parseDouble(processedSum.get(position + 1)))));
                    processedSum.remove(position + 1);
                    processedSum.remove(position);
                    i--;
                    break;
                }
            }
        }
        processedSumAfterFirstStep.add(processedSum.get(processedSum.size() - 1));
        //this code finishes everything off.  It does the addition and subtraction
        for (int i = 0; i < (int) ((processedSumAfterFirstStep.size() / 2) + 0.5); i++) {
            int position = (i * 2) + 1;
            String operator = processedSumAfterFirstStep.get(position);
            switch (operator) {
                case "+": {
                    processedSumAfterFirstStep.set(position - 1, String.valueOf((Double.parseDouble(processedSumAfterFirstStep.get(position - 1))) + (Double.parseDouble(processedSumAfterFirstStep.get(position + 1)))));
                    processedSumAfterFirstStep.remove(position + 1);
                    processedSumAfterFirstStep.remove(position);
                    i--;
                    break;
                }
                case "-": {
                    processedSumAfterFirstStep.set(position - 1, String.valueOf((Double.parseDouble(processedSumAfterFirstStep.get(position - 1))) - (Double.parseDouble(processedSumAfterFirstStep.get(position + 1)))));
                    processedSumAfterFirstStep.remove(position + 1);
                    processedSumAfterFirstStep.remove(position);
                    i--;
                    break;
                }
            }
        }

        //code to remove the decimal points if a number is round mostly formatting stuff
        double returnValue = Double.parseDouble(processedSumAfterFirstStep.get(0));
        if (returnValue % 1 == 0) {
            return String.valueOf((int) returnValue);
        } else {
            return String.valueOf(returnValue);
        }
    }

    //this code breaks a sum up into numbers and opertations on the understanding that maths works X0X0X x being numbers and 0 being operations.  It has no protection for foreign characters as they are removed in the trim if the user somehow manages to bypass the GUI
    public static ArrayList<String> ConvertStringToArrayList(String str) {
        String trimmedString = TrimString(str);
        ArrayList<String> processedSum = new ArrayList<>();
        int placesInSum = 0;
        boolean holdingNumber = false;
        if (trimmedString.charAt(0) == '-') {
            trimmedString = trimmedString.substring(1);
            processedSum.add("-");
            holdingNumber = true;
        }

        for (int i = 0; i < trimmedString.length(); i++) {
            char currentChar = trimmedString.charAt(i);
            switch (currentChar) {
                case '0':
                case '1':
                case '2':
                case '3':
                case '4':
                case '5':
                case '6':
                case '7':
                case '8':
                case '9': {
                    if (!holdingNumber) {
                        processedSum.add(String.valueOf(currentChar));
                        holdingNumber = true;
                    } else {
                        String currentNumber = processedSum.get(placesInSum);
                        processedSum.remove(placesInSum);
                        processedSum.add(currentNumber + currentChar);
                    }
                    break;
                }
                case '%':
                case '+':
                case '-':
                case '*': {
                    placesInSum += 1;
                    holdingNumber = false;
                    placesInSum += 1;
                    processedSum.add(String.valueOf(currentChar));
                }

            }
        }
        return processedSum;
    }
    //this code trims the code.   It removes errors inputted by the user.
    public static String TrimString(String str) {
        char lastChar = 'q';
        StringBuilder trimmedString = new StringBuilder();
        //code to remove operators at the end of the string
        while (!Character.isDigit(str.charAt(str.length() - 1))) {
            str = str.substring(0, str.length() - 1);
        }
        for (int i = 0; i < str.length(); i++) {
            char currentCharacter = str.charAt(i);
            if (lastChar != 'q') {
                switch (currentCharacter) {
                    case '0':
                    case '1':
                    case '2':
                    case '3':
                    case '4':
                    case '5':
                    case '6':
                    case '7':
                    case '8':
                    case '9': {
                        trimmedString.append(currentCharacter);
                        lastChar = currentCharacter;
                        break;
                    }
                    case '%':
                    case '+':
                    case '-':
                    case '*': {
                        if (!Character.isDigit(lastChar)) {
                            trimmedString = new StringBuilder(trimmedString.substring(0, trimmedString.length() - 1));
                        }
                        trimmedString.append(currentCharacter);
                        lastChar = currentCharacter;
                        break;
                    }
                }
            } else {
                if (Character.isDigit(currentCharacter)) {
                    trimmedString.append(currentCharacter);
                    lastChar = currentCharacter;
                } else if (currentCharacter == '-') {
                    trimmedString.append(currentCharacter);
                } else {
                    str = str.substring(1);
                    i--;
                }
            }
        }

        return trimmedString.toString();
    }
}
