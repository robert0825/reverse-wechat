package com.tencent.mm.plugin.subapp.jdbiz;

import android.content.Context;
import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.content.Intent;
import android.os.Bundle;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.bj.d;
import com.tencent.mm.plugin.report.service.g;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.ui.MMBaseActivity;
import com.tencent.mm.ui.base.ac;
import com.tencent.mm.ui.base.i;
import com.tencent.mm.ui.base.i.a;

public class JDRemindDialog
  extends MMBaseActivity
{
  private i hiJ;
  
  public JDRemindDialog()
  {
    GMTrace.i(5856724779008L, 43636);
    this.hiJ = null;
    GMTrace.o(5856724779008L, 43636);
  }
  
  private void Pj()
  {
    GMTrace.i(5857395867648L, 43641);
    if (getIntent() == null)
    {
      GMTrace.o(5857395867648L, 43641);
      return;
    }
    Bundle localBundle = getIntent().getExtras();
    if (localBundle == null)
    {
      GMTrace.o(5857395867648L, 43641);
      return;
    }
    i.a locala = new i.a(this);
    locala.Vz("");
    locala.VA(localBundle.getString("alertcontent"));
    locala.VC(localBundle.getString("alertconfirm")).a(new DialogInterface.OnClickListener()
    {
      public final void onClick(DialogInterface paramAnonymousDialogInterface, int paramAnonymousInt)
      {
        GMTrace.i(5852429811712L, 43604);
        Object localObject2 = null;
        String str = "";
        Object localObject1 = str;
        paramAnonymousDialogInterface = (DialogInterface)localObject2;
        if (JDRemindDialog.this.getIntent() != null)
        {
          localObject1 = str;
          paramAnonymousDialogInterface = (DialogInterface)localObject2;
          if (JDRemindDialog.this.getIntent().getExtras() != null)
          {
            paramAnonymousDialogInterface = JDRemindDialog.this.getIntent().getExtras().getString("alertjumpurl");
            localObject1 = JDRemindDialog.this.getIntent().getExtras().getString("alert_activityid");
          }
        }
        if ((((String)localObject1).equals(c.brr().brw().qrG)) && (c.brr().brs()))
        {
          c.brr().brv();
          c.brr().bru();
        }
        if (!bg.nm(paramAnonymousDialogInterface))
        {
          localObject1 = new Intent();
          ((Intent)localObject1).putExtra("rawUrl", paramAnonymousDialogInterface);
          ((Intent)localObject1).putExtra("useJs", true);
          ((Intent)localObject1).putExtra("vertical_scroll", true);
          d.b(JDRemindDialog.this, "webview", ".ui.tools.WebViewUI", (Intent)localObject1);
          g.ork.i(11179, new Object[] { paramAnonymousDialogInterface, c.brr().brw().qrG, Integer.valueOf(5) });
        }
        JDRemindDialog.this.finish();
        GMTrace.o(5852429811712L, 43604);
      }
    });
    locala.VD(localBundle.getString("alert_cancel")).b(new DialogInterface.OnClickListener()
    {
      public final void onClick(DialogInterface paramAnonymousDialogInterface, int paramAnonymousInt)
      {
        GMTrace.i(5850819198976L, 43592);
        JDRemindDialog.this.finish();
        GMTrace.o(5850819198976L, 43592);
      }
    });
    this.hiJ = locala.aax();
    this.hiJ.setCanceledOnTouchOutside(false);
    this.hiJ.show();
    GMTrace.o(5857395867648L, 43641);
  }
  
  public static void a(Context paramContext, String paramString1, String paramString2, String paramString3, String paramString4, String paramString5)
  {
    GMTrace.i(5857530085376L, 43642);
    Intent localIntent = new Intent(paramContext, JDRemindDialog.class);
    localIntent.putExtra("alertcontent", paramString1);
    localIntent.putExtra("alertconfirm", paramString2);
    localIntent.putExtra("alert_cancel", paramString3);
    localIntent.putExtra("alertjumpurl", paramString4);
    localIntent.putExtra("alert_activityid", paramString5);
    localIntent.addFlags(805306368);
    paramContext.startActivity(localIntent);
    GMTrace.o(5857530085376L, 43642);
  }
  
  protected void onCreate(Bundle paramBundle)
  {
    GMTrace.i(5856858996736L, 43637);
    super.onCreate(paramBundle);
    requestWindowFeature(1);
    Pj();
    GMTrace.o(5856858996736L, 43637);
  }
  
  protected void onNewIntent(Intent paramIntent)
  {
    GMTrace.i(5857127432192L, 43639);
    super.onNewIntent(paramIntent);
    setIntent(paramIntent);
    if (this.hiJ != null)
    {
      this.hiJ.dismiss();
      this.hiJ = null;
    }
    Pj();
    GMTrace.o(5857127432192L, 43639);
  }
  
  protected void onPause()
  {
    GMTrace.i(5857261649920L, 43640);
    super.onPause();
    ac.a(false, null);
    GMTrace.o(5857261649920L, 43640);
  }
  
  protected void onResume()
  {
    GMTrace.i(5856993214464L, 43638);
    super.onResume();
    ac.a(true, null);
    GMTrace.o(5856993214464L, 43638);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\plugin\subapp\jdbiz\JDRemindDialog.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */