package com.tencent.mm.plugin.voiceprint.ui;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.R.h;
import com.tencent.mm.R.l;
import com.tencent.mm.ad.k;
import com.tencent.mm.ad.n;
import com.tencent.mm.plugin.voiceprint.model.d;
import com.tencent.mm.plugin.voiceprint.model.j;
import com.tencent.mm.plugin.voiceprint.model.q;
import com.tencent.mm.plugin.voiceprint.model.q.a;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.y.at;

public class VoiceUnLockUI
  extends BaseVoicePrintUI
  implements q.a
{
  private q qDO;
  
  public VoiceUnLockUI()
  {
    GMTrace.i(12520232321024L, 93283);
    GMTrace.o(12520232321024L, 93283);
  }
  
  public final void JM(String paramString)
  {
    GMTrace.i(12520769191936L, 93287);
    this.qCi = paramString;
    this.qCD.btu();
    this.qCD.JN(paramString);
    this.qCD.btt();
    this.qCA.setEnabled(true);
    GMTrace.o(12520769191936L, 93287);
  }
  
  protected final void aLn()
  {
    GMTrace.i(12520634974208L, 93286);
    findViewById(R.h.bYP).setVisibility(8);
    this.qCD.bts();
    this.qCD.wb(R.l.egN);
    this.qCD.btv();
    this.qCA.setEnabled(false);
    GMTrace.o(12520634974208L, 93286);
  }
  
  public final void btc()
  {
    GMTrace.i(12521171845120L, 93290);
    bti();
    GMTrace.o(12521171845120L, 93290);
  }
  
  protected final void btj()
  {
    GMTrace.i(12520500756480L, 93285);
    w.d("MicroMsg.VoiceUnLockUI", "sendVoice, filename:%s", new Object[] { this.qCF });
    if ((!bg.nm(this.qCF)) && (!bg.nm(this.qDO.qCi)))
    {
      Object localObject = this.qDO;
      localObject = new j(this.qCF, ((q)localObject).qCj);
      ((j)localObject).qBP = true;
      at.wS().a((k)localObject, 0);
      this.qCA.setEnabled(false);
      this.qCD.bts();
    }
    GMTrace.o(12520500756480L, 93285);
  }
  
  protected void btr()
  {
    GMTrace.i(12521037627392L, 93289);
    Intent localIntent = new Intent();
    localIntent.putExtra("kscene_type", 73);
    localIntent.setClass(this, VoicePrintFinishUI.class);
    startActivity(localIntent);
    finish();
    GMTrace.o(12521037627392L, 93289);
  }
  
  public final void is(boolean paramBoolean)
  {
    GMTrace.i(12520903409664L, 93288);
    this.qCD.btt();
    this.qCA.setEnabled(true);
    if (paramBoolean)
    {
      w.d("MicroMsg.VoiceUnLockUI", "unlock success");
      btr();
      GMTrace.o(12520903409664L, 93288);
      return;
    }
    this.qCD.wc(R.l.egM);
    this.qCD.btw();
    GMTrace.o(12520903409664L, 93288);
  }
  
  public void onCreate(Bundle paramBundle)
  {
    GMTrace.i(12520366538752L, 93284);
    super.onCreate(paramBundle);
    this.qDO = new q(this);
    w.d("MicroMsg.VoicePrintUnLockService", "getVoiceText");
    at.wS().a(new d(73, ""), 0);
    GMTrace.o(12520366538752L, 93284);
  }
  
  protected void onDestroy()
  {
    GMTrace.i(12521306062848L, 93291);
    super.onDestroy();
    q localq = this.qDO;
    at.wS().b(611, localq);
    at.wS().b(613, localq);
    localq.qCz = null;
    GMTrace.o(12521306062848L, 93291);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\plugin\voiceprint\ui\VoiceUnLockUI.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */