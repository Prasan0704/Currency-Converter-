import java.applet.*;
import java.awt.*;
import java.awt.event.*;
public class Main extends Applet implements ActionListener {
	public void init() {
		
		inp = new TextField("Hello");
		inp.setText("0.0");
		result = new Label("Your result will show here");
		
		

		button1 = new Button("Japanese YEN");
		button1.addActionListener(this);

		button2 = new Button("dollar");
		button2.addActionListener(this);

		button3 = new Button("euro");
		button3.addActionListener(this);

		add(inp);
		add(button1);
		add(button2);
		add(button3);
		add(result);
	}

	public void actionPerformed(ActionEvent e) {
	    try
	{
	        	if (e.getSource() == button1)
            			result.setText("japanese YEN = "+((Integer.parseInt(inp.getText()))*1.50));
		else if (e.getSource() == button2)
            			result.setText("dollar = "+((Integer.parseInt(inp.getText()))*0.013));
		else if (e.getSource() == button3)
            			result.setText("Euro = "+((Integer.parseInt(inp.getText()))*0.012));
	 }
	    catch(Exception ec){
		System.out.println(ec);
            		result.setText("invalid text");
	    }

	}

	Button button1, button2,button3;
	TextField inp;
	Label result ;
	
}
