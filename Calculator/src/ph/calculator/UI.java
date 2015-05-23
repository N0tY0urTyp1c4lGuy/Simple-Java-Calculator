/**
 * @name        Simple Java Calculator
 * @package     ph.calculator
 * @file        UI.java
 * @author      SORIA Pierre-Henry
 * @email       pierrehs@hotmail.com
 * @link        http://github.com/pH-7
 * @copyright   Copyright Pierre-Henry SORIA, All Rights Reserved.
 * @license     Apache (http://www.apache.org/licenses/LICENSE-2.0)
 * @create      2012-03-30
 */

package ph.calculator;

import java.awt.FlowLayout;
import javax.swing.*;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class UI extends JFrame implements ActionListener {

    private JFrame frame;
    private JPanel panel;
    private JTextArea text;
    private JButton but1, but2, but3, but4, but5, but6, but7, but8, but9, but0, butAdd, butMinus, butMultiply, butDivide, butEqual, butCancel;
    private double num1, num2, result;
    private int add = 0, minus = 0, multiply = 0, divide = 0;
    
	public newUI() {
		setFrame();
		setPanel();
		initialize();
		setActionListener();
		
		setVisible(true);
	}

	public void setFrame(){
		setTitle("Caculator PH");
		setSize(250,250);
		setDefaultCloseOperation(DISPOSE_ON_CLOSE)
	}

	public void setPanel(){

		panel = new JPanel(new FlowLayout());

		panel.add(text);
		panel.add(but1);
		panel.add(but2);
		panel.add(but3);
		panel.add(but4);
		panel.add(but5);
		panel.add(but6);
		panel.add(but7);
		panel.add(but8);
		panel.add(but9);
		panel.add(but0);
		panel.add(butCancel);
		panel.add(butAdd);
		panel.add(butMinus);
		panel.add(butMultiply);
		panel.add(butDivide);
		panel.add(butEqual);
	}

	public void initialize(){

		text = new JTextArea(1,20);
		but1 = new JButton("1");
	    but2 = new JButton("2");
		but3 = new JButton("3");
		but4 = new JButton("4");
		but5 = new JButton("5");
		but6 = new JButton("6");
	    but7 = new JButton("7");
		but8 = new JButton("8");
		but9 = new JButton("9");
		but0 = new JButton("0");
		butAdd = new JButton("+");
		butMinus = new JButton("-");
		butMultiply = new JButton("*");
		butDivide = new JButton("/");
		butEqual = new JButton("=");
		butCancel = new JButton("C");
	}
	
	public void setActionListener() {
		
		but1.addActionListener(this);
		but2.addActionListener(this);
		but3.addActionListener(this);
		but4.addActionListener(this);
		but5.addActionListener(this);
		but6.addActionListener(this);
		but7.addActionListener(this);
		but8.addActionListener(this);
		but9.addActionListener(this);
		but0.addActionListener(this);
		butAdd.addActionListener(this);
		butMinus.addActionListener(this);
		butMultiply.addActionListener(this);
		butDivide.addActionListener(this);
		butEqual.addActionListener(this);
		butCancel.addActionListener(this);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		
		if(but1 == e.getSource())
			text.append("1");
		else if(but2 == e.getSource())
			text.append("2");
		else if(but3 == e.getSource())
			text.append("3");
		else if(but4 == e.getSource())
			text.append("4");
		else if(but5 == e.getSource()) 
			text.append("5");
		else if(but6 == e.getSource()) 
			text.append("6");
		else if(but7 == e.getSource()) 
			text.append("7");
		else if(but8 == e.getSource()) 
			text.append("8");
		else if(but9 == e.getSource()) 
			text.append("9");
		else if(but0 == e.getSource()) 
			text.append("0");
		else if(butAdd == e.getSource()) {
			num1 = reader();
			text.setText("");
			add += 1;
		}
		else if(butMinus == e.getSource()) {
			num1 = reader();
			text.setText("");
			minus += 1;
		}
		else if(butMultiply == e.getSource()) {
			num1 = reader();
			text.setText("");
			multiply += 1;
		}
		else if(butDivide == e.getSource()) {
			num1 = reader();
			text.setText("");
			divide += 1;
		}
		else if(butEqual == e.getSource()) {
			num2 = reader();
			
			if(add > 0) {
				result = num1+num2;
				text.setText(Double.toString(result));
			}
			else if(minus > 0) {
				result = num1-num2;
				text.setText(Double.toString(result));
			}
			else if(multiply > 0) {
				result = num1*num2;
				text.setText(Double.toString(result));
			}
			else(divide > 0) {
				result = num1/num2;
				text.setText(Double.toString(result));
			}
			
		}
		else{
			num1 = 0.0;
			num2 = 0.0;
			text.setText("");
		}
	
	}
	
	public double reader() {
		double num;
		String str;
		str = text.getText();
		num = double.valueOf(str);
		
		return num;	
	}
}