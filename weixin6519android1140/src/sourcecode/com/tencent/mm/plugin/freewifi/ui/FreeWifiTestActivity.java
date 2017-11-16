package com.tencent.mm.plugin.freewifi.ui;

import android.app.Activity;
import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Toast;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.R.h;
import com.tencent.mm.R.i;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.ui.base.h;

public class FreeWifiTestActivity
  extends Activity
{
  public FreeWifiTestActivity()
  {
    GMTrace.i(7161052659712L, 53354);
    GMTrace.o(7161052659712L, 53354);
  }
  
  public void onCreate(Bundle paramBundle)
  {
    GMTrace.i(7161186877440L, 53355);
    super.onCreate(paramBundle);
    setContentView(R.i.cxB);
    findViewById(R.h.bBQ).setOnClickListener(new View.OnClickListener()
    {
      public final void onClick(View paramAnonymousView)
      {
        GMTrace.i(7188969947136L, 53562);
        Toast.makeText(ab.getContext(), "test message", 0).show();
        GMTrace.o(7188969947136L, 53562);
      }
    });
    findViewById(R.h.bBR).setOnClickListener(new View.OnClickListener()
    {
      public final void onClick(View paramAnonymousView)
      {
        GMTrace.i(7171924295680L, 53435);
        h.a(FreeWifiTestActivity.this, "t12345", "t54331", new DialogInterface.OnClickListener()
        {
          public final void onClick(DialogInterface paramAnonymous2DialogInterface, int paramAnonymous2Int)
          {
            GMTrace.i(7180111577088L, 53496);
            GMTrace.o(7180111577088L, 53496);
          }
        }, null);
        GMTrace.o(7171924295680L, 53435);
      }
    });
    GMTrace.o(7161186877440L, 53355);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes4-dex2jar.jar!\com\tencent\mm\plugin\freewifi\ui\FreeWifiTestActivity.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */