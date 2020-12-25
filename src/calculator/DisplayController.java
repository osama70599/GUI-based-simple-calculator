
package calculator;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.input.KeyEvent;
import javafx.scene.layout.AnchorPane;


public class DisplayController implements Initializable {
    
    float data = 0f;
    int option = -1;
    
   @FXML
    private AnchorPane root;

    @FXML
    private TextField textfield;

    @FXML
    private Button dot;

    @FXML
    private Button double_zero;

    @FXML
    private Button zero;

    @FXML
    private Button plus;

    @FXML
    private Button equals;

    @FXML
    private Button one;

    @FXML
    private Button two;

    @FXML
    private Button three;

    @FXML
    private Button minus;

    @FXML
    private Button four;

    @FXML
    private Button five;

    @FXML
    private Button six;

    @FXML
    private Button seven;

    @FXML
    private Button eight;

    @FXML
    private Button nine;

    @FXML
    private Button multiply;

    @FXML
    private Button divide;

    @FXML
    private Button on_off;

    @FXML
    private Button clear;

    @FXML
    void handleButtonAction(ActionEvent event) {
        if(event.getSource()==one)
        {
            textfield.setText(textfield.getText()+"1");
        }
        else if(event.getSource()==two)
        {
            textfield.setText(textfield.getText()+"2");
        }
        else if(event.getSource()==three)
        {
            textfield.setText(textfield.getText()+"3");
        }
        else if(event.getSource()==four)
        {
            textfield.setText(textfield.getText()+"4");
        }
        else if(event.getSource()==five)
        {
            textfield.setText(textfield.getText()+"5");
        }
        else if(event.getSource()==six)
        {
            textfield.setText(textfield.getText()+"6");
        }
        else if(event.getSource()==seven)
        {
            textfield.setText(textfield.getText()+"7");
        }
        else if(event.getSource()==eight)
        {
            textfield.setText(textfield.getText()+"8");
        }
        else if(event.getSource()==nine)
        {
            textfield.setText(textfield.getText()+"9");
        }
        else if(event.getSource()==zero)
        {
            textfield.setText(textfield.getText()+"0");
        }
        else if(event.getSource()==double_zero)
        {
            textfield.setText(textfield.getText()+"00");
        }
        else if(event.getSource()==clear)
        {
            textfield.setText("");
        }
        else if(event.getSource()==dot)
        {
            textfield.setText(textfield.getText()+".");
        }
        else if(event.getSource()==plus)
        {
            data = Float.parseFloat(textfield.getText());
            option = 1;
            textfield.setText("");
        }
        else if(event.getSource()==minus)
        {
            data = Float.parseFloat(textfield.getText());
            option = 2;
            textfield.setText("");
        }
        else if(event.getSource()==multiply)
        {
            data = Float.parseFloat(textfield.getText());
            option = 3;
            textfield.setText("");
        }
        else if(event.getSource()==divide)
        {
            data = Float.parseFloat(textfield.getText());
            option = 4;
            textfield.setText("");
        }
        else if(event.getSource()==equals)
        {
            float secondOperand = Float.parseFloat(textfield.getText());
            switch(option)
            {
                case 1:
                {
                    float ans = data + secondOperand;
                    textfield.setText(String.valueOf(ans));
                    break;
                }
                case 2:
                {
                    float ans = data - secondOperand;
                    textfield.setText(String.valueOf(ans));
                    break;
                }
                case 3:
                {
                    float ans = data * secondOperand;
                    textfield.setText(String.valueOf(ans));
                    break;
                }
                case 4:
                {
                    float ans = data / secondOperand;
                    textfield.setText(String.valueOf(ans));
                    break;
                }
            }
        }

       
    }
      @FXML
    void handlekeyaction(KeyEvent event) {
        
          System.out.println((int)(event.getCharacter().charAt(0)));
        if(event.getCharacter().charAt(0)=='1')
        {
            textfield.setText(textfield.getText()+"1");
        }
        else if(event.getCharacter().charAt(0)=='2')
        {
            textfield.setText(textfield.getText()+"2");
        }
        else if(event.getCharacter().charAt(0)=='3')
        {
            textfield.setText(textfield.getText()+"3");
        }
        else if(event.getCharacter().charAt(0)=='4')
        {
            textfield.setText(textfield.getText()+"4");
        }
        else if(event.getCharacter().charAt(0)=='5')
        {
            textfield.setText(textfield.getText()+"5");
        }
        else if(event.getCharacter().charAt(0)=='6')
        {
            textfield.setText(textfield.getText()+"6");
        }
        else if(event.getCharacter().charAt(0)=='7')
        {
            textfield.setText(textfield.getText()+"7");
        }
        else if(event.getCharacter().charAt(0)=='8')
        {
            textfield.setText(textfield.getText()+"8");
        }
        else if(event.getCharacter().charAt(0)=='9')
        {
            textfield.setText(textfield.getText()+"9");
        }
        else if(((int)(event.getCharacter().charAt(0)))==8)
        {
            String str = textfield.getText();
            textfield.setText("");
            if ((str != null) && (str.length() > 0)) {
            textfield.setText(str.substring(0, str.length() - 1));
//            textfield.setText(textfield.getText()+"\b");
        }
        }
        else if(event.getCharacter().charAt(0)=='.')
        {
            textfield.setText(textfield.getText()+".");
        }
        else if(event.getCharacter().charAt(0)=='+')
        {
            data = Float.parseFloat(textfield.getText());
            option = 1;
            textfield.setText("");
        }
        else if(event.getCharacter().charAt(0)=='-')
        {
            data = Float.parseFloat(textfield.getText());
            option = 2;
            textfield.setText("");
        }
        else if(event.getCharacter().charAt(0)=='*')
        {
            data = Float.parseFloat(textfield.getText());
            option = 3;
            textfield.setText("");
        }
        else if(event.getCharacter().charAt(0)=='/')
        {
            data = Float.parseFloat(textfield.getText());
            option = 4;
            textfield.setText("");
        }
        else if(((int)(event.getCharacter().charAt(0)))==13)
        {
            float secondOperand = Float.parseFloat(textfield.getText());
            switch(option)
            {
                case 1:
                {
                    float ans = data + secondOperand;
                    textfield.setText(String.valueOf(ans));
                    break;
                }
                case 2:
                {
                    float ans = data - secondOperand;
                    textfield.setText(String.valueOf(ans));
                    break;
                }
                case 3:
                {
                    float ans = data * secondOperand;
                    textfield.setText(String.valueOf(ans));
                    break;
                }
                case 4:
                {
                    float ans = data / secondOperand;
                    textfield.setText(String.valueOf(ans));
                    break;
                }
            }
        }
    }
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        
    }    
    
}
