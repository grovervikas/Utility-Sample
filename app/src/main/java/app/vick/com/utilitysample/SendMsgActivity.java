package app.vick.com.utilitysample;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class SendMsgActivity extends AppCompatActivity implements View.OnClickListener{

    private static final String TAG     =       SendMsgActivity.class.getSimpleName();
    private EditText enterMsgEditText;
    private TextView sendMsgTextView;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_send_msg);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        enterMsgEditText        =       (EditText)findViewById(R.id.enterMsgEditText);
        sendMsgTextView         =       (TextView)findViewById(R.id.sendMsgTextView);
        sendMsgTextView.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {
        if(v.getId()==R.id.sendMsgTextView){
            Intent intent = new Intent(Intent.ACTION_SENDTO);
            intent.setData(Uri.parse("smsto:" + Uri.encode("+917503298590")));
            startActivity(intent);
        }
    }
}
