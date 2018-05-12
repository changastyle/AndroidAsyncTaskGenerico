package ar.com.viewdevs.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;
import android.widget.Toast;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity
{

    TextView txt;
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        txt = (TextView) findViewById(R.id.txt);

        final Retorno retorno = new Retorno()
        {
            @Override
            public void onProgress()
            {
                // TODO Auto-generated method stub
                //mProgressDialog.show();
            }

            @Override
            public void onResult(String result)
            {
                // TODO Auto-generated method stub
//                mProgressDialog.dismiss();
//                mStrResult = result;
                Toast.makeText(getApplicationContext(), "LISTORTI", Toast.LENGTH_SHORT).show();
                txt.setText("LISTO");

            }

            @Override
            public void onCancel()
            {
                // TODO Auto-generated method stub

            }
        };
        Task task = new Task(retorno);
        task.execute();
    }
}
