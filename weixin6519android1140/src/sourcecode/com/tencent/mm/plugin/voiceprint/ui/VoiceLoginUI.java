package com.tencent.mm.plugin.voiceprint.ui;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.content.Intent;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.MenuItem;
import android.view.MenuItem.OnMenuItemClickListener;
import android.view.View;
import android.widget.Button;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.R.h;
import com.tencent.mm.R.l;
import com.tencent.mm.ad.k;
import com.tencent.mm.plugin.report.service.g;
import com.tencent.mm.plugin.voiceprint.model.e;
import com.tencent.mm.plugin.voiceprint.model.n.a;
import com.tencent.mm.pluginsdk.h.a;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.y.at;

public class VoiceLoginUI
  extends BaseVoicePrintUI
  implements n.a
{
  private String iAx;
  private com.tencent.mm.plugin.voiceprint.model.n qDg;
  
  public VoiceLoginUI()
  {
    GMTrace.i(12525601030144L, 93323);
    this.iAx = null;
    this.qDg = null;
    GMTrace.o(12525601030144L, 93323);
  }
  
  private void goBack()
  {
    GMTrace.i(19565052428288L, 145771);
    setResult(0);
    finish();
    GMTrace.o(19565052428288L, 145771);
  }
  
  public final void JM(String paramString)
  {
    GMTrace.i(12526137901056L, 93327);
    w.d("MicroMsg.VoiceLoginUI", "onGetText");
    this.qCi = paramString;
    this.qCD.btu();
    this.qCD.JN(paramString);
    this.qCD.btt();
    this.qCA.setEnabled(true);
    GMTrace.o(12526137901056L, 93327);
  }
  
  protected final void aLn()
  {
    GMTrace.i(12526003683328L, 93326);
    findViewById(R.h.bYP).setVisibility(8);
    this.qCD.bts();
    this.qCD.wb(R.l.egN);
    this.qCD.btv();
    this.qCA.setEnabled(false);
    GMTrace.o(12526003683328L, 93326);
  }
  
  public final void btc()
  {
    GMTrace.i(12526406336512L, 93329);
    wa(R.l.egQ);
    GMTrace.o(12526406336512L, 93329);
  }
  
  public final void bte()
  {
    GMTrace.i(12526540554240L, 93330);
    this.qCA.setEnabled(false);
    this.qCA.setVisibility(4);
    this.qCD.btt();
    this.qCD.wc(R.l.egP);
    this.qCD.btw();
    GMTrace.o(12526540554240L, 93330);
  }
  
  protected final void btj()
  {
    GMTrace.i(12525869465600L, 93325);
    w.d("MicroMsg.VoiceLoginUI", "sendVoice, filename:%s", new Object[] { this.qCF });
    if ((!bg.nm(this.qCF)) && (!bg.nm(this.qCi)))
    {
      Object localObject = this.qDg;
      localObject = new com.tencent.mm.plugin.voiceprint.model.h(this.qCF, ((com.tencent.mm.plugin.voiceprint.model.n)localObject).qCj, ((com.tencent.mm.plugin.voiceprint.model.n)localObject).qCl);
      ((com.tencent.mm.plugin.voiceprint.model.h)localObject).qBP = true;
      at.wS().a((k)localObject, 0);
      this.qCA.setEnabled(false);
      this.qCD.bts();
    }
    GMTrace.o(12525869465600L, 93325);
  }
  
  public final void ir(boolean paramBoolean)
  {
    GMTrace.i(12526272118784L, 93328);
    this.qCD.btt();
    this.qCA.setEnabled(true);
    if (paramBoolean)
    {
      w.i("MicroMsg.VoiceLoginUI", "login success[%s]", new Object[] { bg.SJ(this.qDg.qBY) });
      Intent localIntent = new Intent();
      localIntent.putExtra("VoiceLoginAuthPwd", this.qDg.qBY);
      setResult(-1, localIntent);
      finish();
      GMTrace.o(12526272118784L, 93328);
      return;
    }
    w.i("MicroMsg.VoiceLoginUI", "login failed");
    this.qCD.wc(R.l.egM);
    this.qCD.btw();
    GMTrace.o(12526272118784L, 93328);
  }
  
  public void onCreate(Bundle paramBundle)
  {
    GMTrace.i(12525735247872L, 93324);
    super.onCreate(paramBundle);
    g.ork.i(11557, new Object[] { Integer.valueOf(1) });
    this.iAx = bg.aq(getIntent().getStringExtra("Kusername"), null);
    paramBundle = bg.aq(getIntent().getStringExtra("Kvertify_key"), null);
    w.d("MicroMsg.VoiceLoginUI", "summerauth onCreate, username:%s loginTicket==null:%b", new Object[] { this.iAx, Boolean.valueOf(bg.nm(paramBundle)) });
    if ((bg.nm(this.iAx)) && (bg.nm(paramBundle)))
    {
      w.e("MicroMsg.VoiceLoginUI", "onCreate error, username and ticket are both null");
      GMTrace.o(12525735247872L, 93324);
      return;
    }
    this.qDg = new com.tencent.mm.plugin.voiceprint.model.n();
    this.qDg.iAx = this.iAx;
    this.qDg.qCl = paramBundle;
    this.qDg.qCm = this;
    paramBundle = this.qDg;
    if (bg.nm(paramBundle.qCl))
    {
      paramBundle = new e(paramBundle.iAx);
      at.wS().a(paramBundle, 0);
    }
    for (;;)
    {
      w.i("MicroMsg.VoiceLoginUI", "summerper checkPermission checkmicrophone[%b], stack[%s], activity[%s]", new Object[] { Boolean.valueOf(a.a(this, "android.permission.RECORD_AUDIO", 80, "", "")), bg.bQW(), this });
      a(new MenuItem.OnMenuItemClickListener()
      {
        public final boolean onMenuItemClick(MenuItem paramAnonymousMenuItem)
        {
          GMTrace.i(19564918210560L, 145770);
          VoiceLoginUI.a(VoiceLoginUI.this);
          GMTrace.o(19564918210560L, 145770);
          return true;
        }
      });
      GMTrace.o(12525735247872L, 93324);
      return;
      paramBundle.btd();
    }
  }
  
  protected void onDestroy()
  {
    GMTrace.i(12526674771968L, 93331);
    super.onDestroy();
    if (this.qDg != null)
    {
      com.tencent.mm.plugin.voiceprint.model.n localn = this.qDg;
      at.wS().b(618, localn);
      at.wS().b(616, localn);
      at.wS().b(617, localn);
      localn.qCm = null;
    }
    GMTrace.o(12526674771968L, 93331);
  }
  
  public boolean onKeyDown(int paramInt, KeyEvent paramKeyEvent)
  {
    GMTrace.i(19565186646016L, 145772);
    if (paramInt == 4)
    {
      goBack();
      GMTrace.o(19565186646016L, 145772);
      return true;
    }
    boolean bool = super.onKeyDown(paramInt, paramKeyEvent);
    GMTrace.o(19565186646016L, 145772);
    return bool;
  }
  
  public void onRequestPermissionsResult(int paramInt, String[] paramArrayOfString, int[] paramArrayOfInt)
  {
    GMTrace.i(12526808989696L, 93332);
    w.i("MicroMsg.VoiceLoginUI", "summerper onRequestPermissionsResult requestCode[%d],grantResults[%d] tid[%d]", new Object[] { Integer.valueOf(paramInt), Integer.valueOf(paramArrayOfInt[0]), Long.valueOf(Thread.currentThread().getId()) });
    switch (paramInt)
    {
    }
    for (;;)
    {
      GMTrace.o(12526808989696L, 93332);
      return;
      if (paramArrayOfInt[0] == 0)
      {
        btg();
        GMTrace.o(12526808989696L, 93332);
        return;
      }
      com.tencent.mm.ui.base.h.a(this, getString(R.l.dNr), getString(R.l.dNu), getString(R.l.dFX), getString(R.l.cancel), false, new DialogInterface.OnClickListener()new DialogInterface.OnClickListener
      {
        public final void onClick(DialogInterface paramAnonymousDialogInterface, int paramAnonymousInt)
        {
          GMTrace.i(12505602588672L, 93174);
          paramAnonymousDialogInterface.dismiss();
          VoiceLoginUI.this.startActivity(new Intent("android.settings.MANAGE_APPLICATIONS_SETTINGS"));
          GMTrace.o(12505602588672L, 93174);
        }
      }, new DialogInterface.OnClickListener()
      {
        public final void onClick(DialogInterface paramAnonymousDialogInterface, int paramAnonymousInt)
        {
          GMTrace.i(19564783992832L, 145769);
          paramAnonymousDialogInterface.dismiss();
          GMTrace.o(19564783992832L, 145769);
        }
      });
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\plugin\voiceprint\ui\VoiceLoginUI.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */