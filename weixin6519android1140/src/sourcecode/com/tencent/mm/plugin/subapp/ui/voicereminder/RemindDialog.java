package com.tencent.mm.plugin.subapp.ui.voicereminder;

import android.app.Activity;
import android.content.Context;
import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.content.DialogInterface.OnDismissListener;
import android.content.Intent;
import android.os.Bundle;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.R.l;
import com.tencent.mm.ad.n;
import com.tencent.mm.plugin.subapp.b;
import com.tencent.mm.plugin.subapp.c.d;
import com.tencent.mm.pluginsdk.m;
import com.tencent.mm.sdk.platformtools.ae;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.ui.base.a;
import com.tencent.mm.ui.base.i;
import com.tencent.mm.ui.base.i.a;
import com.tencent.mm.y.aj;
import com.tencent.mm.y.ak.d;
import com.tencent.mm.y.at;
import com.tencent.mm.y.s;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

@a(3)
public class RemindDialog
  extends Activity
{
  private static boolean eCg;
  private static List<String> quM;
  private String eDs;
  private ae handler;
  private i oaD;
  private List<String> quL;
  private ak.d quN;
  
  static
  {
    GMTrace.i(5812835581952L, 43309);
    quM = new ArrayList();
    eCg = false;
    GMTrace.o(5812835581952L, 43309);
  }
  
  public RemindDialog()
  {
    GMTrace.i(5811493404672L, 43299);
    this.eDs = "";
    this.quL = new ArrayList();
    this.handler = new ae();
    this.quN = new ak.d()
    {
      public final void j(String paramAnonymousString, long paramAnonymousLong)
      {
        GMTrace.i(5813104017408L, 43311);
        w.d("MicroMsg.RemindDialog", "onVoiceRemind " + paramAnonymousString);
        RemindDialog.a(RemindDialog.this).add(paramAnonymousString);
        RemindDialog.b(RemindDialog.this);
        GMTrace.o(5813104017408L, 43311);
      }
    };
    GMTrace.o(5811493404672L, 43299);
  }
  
  private void brM()
  {
    GMTrace.i(5811761840128L, 43301);
    this.handler.post(new Runnable()
    {
      public final void run()
      {
        GMTrace.i(5813909323776L, 43317);
        StringBuffer localStringBuffer = new StringBuffer();
        Iterator localIterator = RemindDialog.a(RemindDialog.this).iterator();
        while (localIterator.hasNext())
        {
          String str = (String)localIterator.next();
          if (bg.nm(str)) {
            localStringBuffer.append("\n\n");
          } else {
            localStringBuffer.append(str + "\n\n");
          }
        }
        if (RemindDialog.d(RemindDialog.this) != null) {
          RemindDialog.d(RemindDialog.this).setMessage(localStringBuffer);
        }
        GMTrace.o(5813909323776L, 43317);
      }
    });
    GMTrace.o(5811761840128L, 43301);
  }
  
  public static void t(Context paramContext, String paramString1, String paramString2)
  {
    GMTrace.i(5812164493312L, 43304);
    w.d("MicroMsg.RemindDialog", "show " + eCg + " remind " + paramString2);
    if (eCg)
    {
      quM.add(paramString2);
      GMTrace.o(5812164493312L, 43304);
      return;
    }
    quM.clear();
    eCg = true;
    if (at.wS().foreground)
    {
      localIntent = new Intent(paramContext, RemindDialog.class);
      localIntent.putExtra("_RemindDialog_User", paramString1);
      localIntent.putExtra("_RemindDialog_Remind", paramString2);
      localIntent.setFlags(603979776);
      localIntent.addFlags(268435456);
      paramContext.startActivity(localIntent);
      GMTrace.o(5812164493312L, 43304);
      return;
    }
    Intent localIntent = new Intent(paramContext, RemindDialog.class);
    localIntent.putExtra("_RemindDialog_User", paramString1);
    localIntent.putExtra("_RemindDialog_Remind", paramString2);
    localIntent.setFlags(604012544);
    localIntent.addFlags(268435456);
    paramContext.startActivity(localIntent);
    GMTrace.o(5812164493312L, 43304);
  }
  
  public void onCreate(Bundle paramBundle)
  {
    GMTrace.i(5811627622400L, 43300);
    super.onCreate(paramBundle);
    requestWindowFeature(1);
    paramBundle = new i.a(this);
    paramBundle.BN(R.l.ehd);
    paramBundle.VA(" ");
    paramBundle.BQ(R.l.eha).a(new DialogInterface.OnClickListener()
    {
      public final void onClick(DialogInterface paramAnonymousDialogInterface, int paramAnonymousInt)
      {
        GMTrace.i(5811359186944L, 43298);
        paramAnonymousDialogInterface = d.brD();
        if (paramAnonymousDialogInterface != null) {
          paramAnonymousDialogInterface.gK(RemindDialog.c(RemindDialog.this));
        }
        if (s.ga(at.getNotification().rx()))
        {
          RemindDialog.this.finish();
          GMTrace.o(5811359186944L, 43298);
          return;
        }
        b.hnH.e(new Intent().putExtra("Chat_User", RemindDialog.c(RemindDialog.this)), RemindDialog.this);
        RemindDialog.this.finish();
        GMTrace.o(5811359186944L, 43298);
      }
    });
    paramBundle.BR(R.l.ehc).b(new DialogInterface.OnClickListener()
    {
      public final void onClick(DialogInterface paramAnonymousDialogInterface, int paramAnonymousInt)
      {
        GMTrace.i(5813640888320L, 43315);
        paramAnonymousDialogInterface = d.brD();
        if (paramAnonymousDialogInterface != null) {
          paramAnonymousDialogInterface.gK(RemindDialog.c(RemindDialog.this));
        }
        RemindDialog.this.finish();
        GMTrace.o(5813640888320L, 43315);
      }
    });
    paramBundle.a(new DialogInterface.OnDismissListener()
    {
      public final void onDismiss(DialogInterface paramAnonymousDialogInterface)
      {
        GMTrace.i(5813372452864L, 43313);
        RemindDialog.this.finish();
        GMTrace.o(5813372452864L, 43313);
      }
    });
    this.eDs = getIntent().getStringExtra("_RemindDialog_User");
    Object localObject = getIntent().getStringExtra("_RemindDialog_Remind");
    this.quL.clear();
    this.quL.add(localObject);
    localObject = quM.iterator();
    while (((Iterator)localObject).hasNext())
    {
      String str = (String)((Iterator)localObject).next();
      this.quL.add(str);
    }
    this.oaD = paramBundle.aax();
    this.oaD.setCanceledOnTouchOutside(false);
    this.oaD.show();
    brM();
    GMTrace.o(5811627622400L, 43300);
  }
  
  public void onPause()
  {
    GMTrace.i(5812030275584L, 43303);
    eCg = false;
    d locald = d.brD();
    if (locald != null) {
      locald.b(this.quN);
    }
    super.onPause();
    GMTrace.o(5812030275584L, 43303);
  }
  
  public void onResume()
  {
    GMTrace.i(5811896057856L, 43302);
    eCg = true;
    d locald = d.brD();
    if (locald != null) {
      locald.a(this.quN);
    }
    super.onResume();
    GMTrace.o(5811896057856L, 43302);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\plugin\subapp\ui\voicereminder\RemindDialog.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */