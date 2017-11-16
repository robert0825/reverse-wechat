package com.tencent.mm.ui.base;

import android.app.Activity;
import android.content.Context;
import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.content.Intent;
import android.content.res.Resources;
import android.os.Bundle;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.ae;
import com.tencent.mm.v.a.h;

@a(3)
public class MMSuperAlert
  extends Activity
{
  public MMSuperAlert()
  {
    GMTrace.i(3161230147584L, 23553);
    GMTrace.o(3161230147584L, 23553);
  }
  
  public static void i(Context paramContext, int paramInt1, int paramInt2)
  {
    GMTrace.i(3161498583040L, 23555);
    Intent localIntent = new Intent(paramContext, MMSuperAlert.class);
    localIntent.putExtra("MMSuperAlert_title", paramInt1);
    localIntent.putExtra("MMSuperAlert_msg", paramInt2);
    localIntent.putExtra("MMSuperAlert_cancelable", false);
    paramContext.startActivity(localIntent);
    GMTrace.o(3161498583040L, 23555);
  }
  
  public Resources getResources()
  {
    GMTrace.i(3161632800768L, 23556);
    if ((getAssets() != null) && (ab.getResources() != null))
    {
      localResources = ab.getResources();
      GMTrace.o(3161632800768L, 23556);
      return localResources;
    }
    Resources localResources = super.getResources();
    GMTrace.o(3161632800768L, 23556);
    return localResources;
  }
  
  public void onCreate(Bundle paramBundle)
  {
    GMTrace.i(3161364365312L, 23554);
    super.onCreate(paramBundle);
    setContentView(a.h.gfK);
    final int i = getIntent().getIntExtra("MMSuperAlert_msg", 0);
    final int j = getIntent().getIntExtra("MMSuperAlert_title", 0);
    final boolean bool = getIntent().getBooleanExtra("MMSuperAlert_cancelable", true);
    new ae().postDelayed(new Runnable()
    {
      public final void run()
      {
        GMTrace.i(3315983187968L, 24706);
        String str1;
        if (i == 0)
        {
          str1 = "";
          if (j != 0) {
            break label84;
          }
        }
        label84:
        for (String str2 = "";; str2 = MMSuperAlert.this.getString(j))
        {
          h.a(MMSuperAlert.this, str1, str2, bool, new DialogInterface.OnClickListener()new DialogInterface.OnClickListener
          {
            public final void onClick(DialogInterface paramAnonymous2DialogInterface, int paramAnonymous2Int)
            {
              GMTrace.i(3367522795520L, 25090);
              MMSuperAlert.this.finish();
              GMTrace.o(3367522795520L, 25090);
            }
          }, new DialogInterface.OnClickListener()
          {
            public final void onClick(DialogInterface paramAnonymous2DialogInterface, int paramAnonymous2Int)
            {
              GMTrace.i(3288200118272L, 24499);
              MMSuperAlert.this.finish();
              GMTrace.o(3288200118272L, 24499);
            }
          });
          GMTrace.o(3315983187968L, 24706);
          return;
          str1 = MMSuperAlert.this.getString(i);
          break;
        }
      }
    }, 50L);
    GMTrace.o(3161364365312L, 23554);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\ui\base\MMSuperAlert.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */