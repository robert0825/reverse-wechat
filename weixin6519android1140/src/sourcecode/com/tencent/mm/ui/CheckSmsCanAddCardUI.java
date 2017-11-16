package com.tencent.mm.ui;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.widget.Toast;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.R.i;
import com.tencent.mm.R.l;
import com.tencent.mm.ad.b;
import com.tencent.mm.ad.b.a;
import com.tencent.mm.ad.b.b;
import com.tencent.mm.ad.b.c;
import com.tencent.mm.ad.e;
import com.tencent.mm.ad.k;
import com.tencent.mm.ad.n;
import com.tencent.mm.ad.u;
import com.tencent.mm.bj.d;
import com.tencent.mm.protocal.c.mm;
import com.tencent.mm.protocal.c.mn;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.ui.account.SimpleLoginUI;
import com.tencent.mm.y.at;

public class CheckSmsCanAddCardUI
  extends MMActivity
  implements e
{
  private b fUa;
  private String vGD;
  
  public CheckSmsCanAddCardUI()
  {
    GMTrace.i(2904068980736L, 21637);
    GMTrace.o(2904068980736L, 21637);
  }
  
  private void bWq()
  {
    GMTrace.i(2904740069376L, 21642);
    Toast.makeText(this, getString(R.l.efW), 1).show();
    LauncherUI.eW(this);
    finish();
    GMTrace.o(2904740069376L, 21642);
  }
  
  public final void a(int paramInt1, int paramInt2, String paramString, k paramk)
  {
    GMTrace.i(2904605851648L, 21641);
    w.i("MicroMsg.CheckSmsCanAddCardUI", "onSceneEnd errType = %d, errCode = %d, errMsg = %s", new Object[] { Integer.valueOf(paramInt1), Integer.valueOf(paramInt2), paramString });
    if ((paramInt1 == 0) && (paramInt2 == 0))
    {
      paramk = (mn)this.fUa.gtD.gtK;
      paramString = paramk.eTJ;
      paramk = paramk.eTK;
      w.i("MicroMsg.CheckSmsCanAddCardUI", "onSceneEnd cardid:%s extMsg:%s", new Object[] { paramString, paramk });
      Intent localIntent = new Intent();
      localIntent.putExtra("key_card_id", paramString);
      localIntent.putExtra("key_card_ext", paramk);
      localIntent.putExtra("key_from_scene", 8);
      localIntent.putExtra("key_is_sms_add_card", true);
      d.a(this, "card", ".ui.CardDetailUI", localIntent, false);
      finish();
      GMTrace.o(2904605851648L, 21641);
      return;
    }
    bWq();
    GMTrace.o(2904605851648L, 21641);
  }
  
  protected final int getLayoutId()
  {
    GMTrace.i(2904337416192L, 21639);
    int i = R.i.cAC;
    GMTrace.o(2904337416192L, 21639);
    return i;
  }
  
  public void onCreate(Bundle paramBundle)
  {
    GMTrace.i(2904203198464L, 21638);
    super.onCreate(paramBundle);
    this.vKB.bXF();
    if ((!at.AT()) || (at.wF()))
    {
      MMWizardActivity.b(this, new Intent(this, SimpleLoginUI.class), getIntent());
      finish();
      GMTrace.o(2904203198464L, 21638);
      return;
    }
    paramBundle = getIntent().getData();
    if (paramBundle != null)
    {
      String str = paramBundle.getHost();
      if ((!bg.nm(str)) && (str.equals("cardpackage"))) {
        break label240;
      }
      w.e("MicroMsg.CheckSmsCanAddCardUI", "err host, host = %s", new Object[] { str });
    }
    for (int i = 0;; i = 1)
    {
      if (i == 0) {
        break label285;
      }
      at.wS().a(1038, this);
      paramBundle = new b.a();
      paramBundle.gtF = new mm();
      paramBundle.gtG = new mn();
      paramBundle.gtE = 1038;
      paramBundle.uri = "/cgi-bin/mmbiz-bin/api/checksmscanaddcard";
      this.fUa = paramBundle.DA();
      ((mm)this.fUa.gtC.gtK).udo = this.vGD;
      w.i("MicroMsg.CheckSmsCanAddCardUI", "encry value is %s", new Object[] { this.vGD });
      this.fUa = u.a(this.fUa);
      GMTrace.o(2904203198464L, 21638);
      return;
      label240:
      this.vGD = paramBundle.getQueryParameter("encrystr");
      w.i("MicroMsg.CheckSmsCanAddCardUI", "encryptCardInfo = %s", new Object[] { this.vGD });
      if (bg.nm(this.vGD)) {
        break;
      }
    }
    label285:
    bWq();
    GMTrace.o(2904203198464L, 21638);
  }
  
  protected void onDestroy()
  {
    GMTrace.i(2904471633920L, 21640);
    super.onDestroy();
    at.wS().b(1038, this);
    GMTrace.o(2904471633920L, 21640);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes4-dex2jar.jar!\com\tencent\mm\ui\CheckSmsCanAddCardUI.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */