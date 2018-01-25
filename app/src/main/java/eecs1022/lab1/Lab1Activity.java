package eecs1022.lab1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;

public class Lab1Activity extends AppCompatActivity
{

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lab1);
    }

    private void setTextViewById(int ID, String text) {
        TextView view = (TextView) findViewById(ID);
        view.setText(text);
    }

    private String getInputById(int ID) {
        EditText view = (EditText) findViewById(ID);
        return view.getText().toString();
    }

    private String getItemSelectedById(int ID) {
        Spinner spinner = (Spinner) findViewById(ID);
        return spinner.getSelectedItem().toString();
    }

    public void computeBMIButtonClicked(View view) {
        // get user informations
        String name = getInputById(R.id.inputName);
        double height = Double.parseDouble(getInputById(R.id.inputHeight));
        double weight = Double.parseDouble(getInputById(R.id.inputWeight));

        // check the unit
        if (getItemSelectedById(R.id.spinnerWeight).equals("Pounds"))
            weight = weight * 0.45359237;

        if (getItemSelectedById(R.id.spinnerHeight).equals("Inches"))
            height = height * 0.0254;

        if (getItemSelectedById(R.id.spinnerHeight).equals("Centimetre"))
            height = height / 100;

        // calculate with model
        Person user = new Person(name, weight, height);

        // show result
        setTextViewById(R.id.labelAnswer, user.toString());
    }
}
