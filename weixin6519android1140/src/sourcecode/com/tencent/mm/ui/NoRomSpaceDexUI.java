package com.tencent.mm.ui;

import android.app.Activity;
import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.os.Bundle;
import android.os.Process;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.R.i;
import com.tencent.mm.R.l;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bg;

public class NoRomSpaceDexUI
  extends Activity
{
  public NoRomSpaceDexUI()
  {
    GMTrace.i(3087007744000L, 23000);
    GMTrace.o(3087007744000L, 23000);
  }
  
  public void onCreate(Bundle paramBundle)
  {
    GMTrace.i(3087276179456L, 23002);
    super.onCreate(paramBundle);
    bg.eJ(ab.getContext());
    setContentView(R.i.cDg);
    String str = getString(R.l.dhL);
    paramBundle = new n(this);
    paramBundle.setTitle(R.l.dhM);
    paramBundle.vKn.setVisibility(0);
    paramBundle.vKl.setVisibility(0);
    paramBundle.vKl.setText(str);
    str = getString(R.l.dhJ);
    DialogInterface.OnClickListener local1 = new DialogInterface.OnClickListener()
    {
      public final void onClick(DialogInterface paramAnonymousDialogInterface, int paramAnonymousInt)
      {
        GMTrace.i(1605915115520L, 11965);
        Process.killProcess(Process.myPid());
        GMTrace.o(1605915115520L, 11965);
      }
    };
    if (paramBundle.rot != null)
    {
      paramBundle.rot.setVisibility(0);
      paramBundle.rot.setText(str);
      paramBundle.rot.setOnClickListener(new n.1(paramBundle, local1, true));
    }
    paramBundle.setCancelable(false);
    paramBundle.bXj();
    paramBundle.show();
    GMTrace.o(3087276179456L, 23002);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\ui\NoRomSpaceDexUI.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */