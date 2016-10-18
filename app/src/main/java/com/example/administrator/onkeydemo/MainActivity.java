package com.example.administrator.onkeydemo;

        import android.support.v7.app.AppCompatActivity;
        import android.os.Bundle;
        import android.view.KeyEvent;
        import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
private TextView tView;
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        tView=new TextView(this);
        tView.setText("请单击按键或者屏幕");
        setContentView(tView);
    }
    public boolean onKeyDown(int keyCode,KeyEvent event){
        switch(keyCode){
            case KeyEvent.KEYCODE_HOME:
                SetMessae("按下：Home键");
                break;
            case KeyEvent.KEYCODE_MENU:
                SetMessae("按下：菜单键");
               return true;
            case KeyEvent.KEYCODE_BACK:
                SetMessae("按下：回退键");
              break;
            case KeyEvent.KEYCODE_VOLUME_UP:
                SetMessae("按下：音量加键");
                break;
            case KeyEvent.KEYCODE_VOLUME_DOWN:
                SetMessae("按下：音量减键");
                event.startTracking();
                return true;
                default:
                    SetMessae("按下的键码是"+keyCode);
                    break;
        }
        return super.onKeyDown(keyCode,event);
    }

    public void SetMessae(String str) {
      String oldStr=tView.getText().toString();
        String newStr=oldStr+"\n"+str;

        tView.setText(newStr);
    }
}
