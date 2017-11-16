package com.tencent.mm.plugin.voip.ui;

import android.content.Context;
import android.content.DialogInterface;
import android.content.DialogInterface.OnCancelListener;
import android.content.DialogInterface.OnClickListener;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.provider.Settings;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.R.l;
import com.tencent.mm.compatible.e.b;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.ui.MMBaseActivity;
import com.tencent.mm.ui.base.ac;
import com.tencent.mm.ui.base.i;
import com.tencent.mm.ui.base.i.a;
import java.lang.reflect.Field;

public class VoipWarningDialog
  extends MMBaseActivity
{
  public static int qNI;
  private static a qNJ;
  private i hiJ;
  
  static
  {
    GMTrace.i(5354213605376L, 39892);
    qNI = 1234;
    GMTrace.o(5354213605376L, 39892);
  }
  
  public VoipWarningDialog()
  {
    GMTrace.i(5353139863552L, 39884);
    this.hiJ = null;
    GMTrace.o(5353139863552L, 39884);
  }
  
  private void Pj()
  {
    GMTrace.i(5353810952192L, 39889);
    if (getIntent() == null)
    {
      w.e("MicroMsg.VoipWarningDialog", "Intent is null");
      GMTrace.o(5353810952192L, 39889);
      return;
    }
    Bundle localBundle = getIntent().getExtras();
    if (localBundle == null)
    {
      w.e("MicroMsg.VoipWarningDialog", "invalid params");
      GMTrace.o(5353810952192L, 39889);
      return;
    }
    i.a locala = new i.a(this);
    locala.Vz(getString(R.l.eiz));
    locala.VA(localBundle.getString("warning_content"));
    locala.d(new DialogInterface.OnCancelListener()
    {
      public final void onCancel(DialogInterface paramAnonymousDialogInterface)
      {
        GMTrace.i(5347636936704L, 39843);
        VoipWarningDialog.this.finish();
        GMTrace.o(5347636936704L, 39843);
      }
    });
    if (com.tencent.mm.compatible.util.d.et(23)) {}
    for (int i = R.l.eiy;; i = R.l.eix)
    {
      locala.BQ(i).a(new DialogInterface.OnClickListener()
      {
        public final void onClick(DialogInterface paramAnonymousDialogInterface, int paramAnonymousInt)
        {
          GMTrace.i(5365219459072L, 39974);
          if (com.tencent.mm.compatible.util.d.et(23)) {
            try
            {
              if (!bg.nm((String)Settings.class.getField("ACTION_MANAGE_OVERLAY_PERMISSION").get(Settings.class)))
              {
                VoipWarningDialog.this.startActivityForResult(new Intent("android.settings.action.MANAGE_OVERLAY_PERMISSION", Uri.parse("package:" + ab.getPackageName())), VoipWarningDialog.qNI);
                GMTrace.o(5365219459072L, 39974);
                return;
              }
            }
            catch (Exception paramAnonymousDialogInterface)
            {
              w.e("MicroMsg.VoipWarningDialog", "getField:ACTION_MANAGE_OVERLAY_PERMISSION! Error:%s, etype:%s", new Object[] { paramAnonymousDialogInterface.getMessage(), paramAnonymousDialogInterface.getClass().getCanonicalName() });
            }
          }
          paramAnonymousDialogInterface = VoipWarningDialog.this.getString(R.l.eiA);
          Intent localIntent = new Intent();
          localIntent.putExtra("rawUrl", paramAnonymousDialogInterface);
          localIntent.putExtra("useJs", true);
          localIntent.putExtra("vertical_scroll", true);
          com.tencent.mm.bj.d.b(VoipWarningDialog.this, "webview", ".ui.tools.WebViewUI", localIntent);
          VoipWarningDialog.this.finish();
          GMTrace.o(5365219459072L, 39974);
        }
      });
      this.hiJ = locala.aax();
      this.hiJ.setCanceledOnTouchOutside(false);
      this.hiJ.show();
      GMTrace.o(5353810952192L, 39889);
      return;
    }
  }
  
  public static void a(Context paramContext, a parama)
  {
    GMTrace.i(5354079387648L, 39891);
    qNJ = parama;
    parama = new Intent(paramContext, VoipWarningDialog.class);
    parama.putExtra("warning_content", ab.getContext().getString(R.l.eiw));
    parama.addFlags(805306368);
    paramContext.startActivity(parama);
    GMTrace.o(5354079387648L, 39891);
  }
  
  protected void onActivityResult(int paramInt1, int paramInt2, Intent paramIntent)
  {
    GMTrace.i(5353945169920L, 39890);
    if (qNJ == null)
    {
      GMTrace.o(5353945169920L, 39890);
      return;
    }
    if (paramInt1 == qNI)
    {
      if (b.aH(ab.getContext()))
      {
        qNJ.a(this);
        GMTrace.o(5353945169920L, 39890);
        return;
      }
      qNJ.b(this);
      GMTrace.o(5353945169920L, 39890);
      return;
    }
    qNJ.b(this);
    GMTrace.o(5353945169920L, 39890);
  }
  
  protected void onCreate(Bundle paramBundle)
  {
    GMTrace.i(5353274081280L, 39885);
    super.onCreate(paramBundle);
    requestWindowFeature(1);
    Pj();
    GMTrace.o(5353274081280L, 39885);
  }
  
  protected void onNewIntent(Intent paramIntent)
  {
    GMTrace.i(5353542516736L, 39887);
    super.onNewIntent(paramIntent);
    setIntent(paramIntent);
    if (this.hiJ != null)
    {
      this.hiJ.dismiss();
      this.hiJ = null;
    }
    Pj();
    GMTrace.o(5353542516736L, 39887);
  }
  
  protected void onPause()
  {
    GMTrace.i(5353676734464L, 39888);
    super.onPause();
    ac.a(false, null);
    GMTrace.o(5353676734464L, 39888);
  }
  
  protected void onResume()
  {
    GMTrace.i(5353408299008L, 39886);
    super.onResume();
    ac.a(true, null);
    GMTrace.o(5353408299008L, 39886);
  }
  
  public static abstract interface a
  {
    public abstract void a(VoipWarningDialog paramVoipWarningDialog);
    
    public abstract void b(VoipWarningDialog paramVoipWarningDialog);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\plugin\voip\ui\VoipWarningDialog.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */