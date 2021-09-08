package rshm.mylibrary;

import android.content.Context;
import android.widget.Toast;

public class MsgUtils {

    public static MsgUtils getInstance() {
        return new MsgUtils();
    }

    public void toast(Context context, String msg) {
        Toast.makeText(context, msg, Toast.LENGTH_LONG).show();
    }

}
