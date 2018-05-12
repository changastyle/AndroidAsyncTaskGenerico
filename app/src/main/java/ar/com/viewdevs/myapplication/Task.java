package ar.com.viewdevs.myapplication;

import android.content.Context;
import android.os.AsyncTask;

import org.json.JSONObject;

import java.util.HashMap;
import java.util.Iterator;


public class Task extends AsyncTask<String, Void, String>
{

    public Retorno retorno;

    String mTypeOfRequest;
    String mStrToBeAppended = "";
    boolean isPostDataInJSONFormat = false;
    JSONObject mJSONPostData = null;

    public Task(Retorno retorno)
    {
        this.retorno = retorno;
    }


    @Override
    protected String doInBackground(String... baseUrls) {

        publishProgress(null);

        for (int i = 0 ; i < 100; i ++)
        {
            try
            {
                Thread.sleep(100);
                System.out.println(i);
            } catch (InterruptedException e)
            {
                e.printStackTrace();
            }

        }

        return null;

    }
    // onPostExecute displays the results of the AsyncTask.
    @Override
    protected void onPostExecute(String result)
    {
        retorno.onResult(result);


    }

    @Override
    protected void onProgressUpdate(Void...voids )
    {
        retorno.onProgress();
    }
}