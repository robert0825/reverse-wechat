package com.tencent.mm.plugin.fingerprint.ui;

import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Toast;
import com.tencent.d.b.a.c;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.ad.e;
import com.tencent.mm.ad.k;
import com.tencent.mm.ad.n;
import com.tencent.mm.kernel.h;
import com.tencent.mm.plugin.wxpay.a.f;
import com.tencent.mm.plugin.wxpay.a.g;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.base.u;

public class SoterPayTestUI
  extends MMActivity
  implements e
{
  public SoterPayTestUI()
  {
    GMTrace.i(10755537633280L, 80135);
    GMTrace.o(10755537633280L, 80135);
  }
  
  public final void a(int paramInt1, int paramInt2, String paramString, k paramk)
  {
    GMTrace.i(10755940286464L, 80138);
    w.i("MicroMsg.SoterPayTestUI", "hy: on scene end: errType: %d, errCode: %d, errMsg: %s", new Object[] { Integer.valueOf(paramInt1), Integer.valueOf(paramInt2), paramString });
    u.makeText(this, String.format("on scene end: errType: %d, errCode: %d, errMsg: %s", new Object[] { Integer.valueOf(paramInt1), Integer.valueOf(paramInt2), paramString }), 1).show();
    h.xz();
    h.xx().fYr.b(paramk.getType(), this);
    GMTrace.o(10755940286464L, 80138);
  }
  
  protected final int getLayoutId()
  {
    GMTrace.i(10755806068736L, 80137);
    int i = a.g.sMw;
    GMTrace.o(10755806068736L, 80137);
    return i;
  }
  
  public void onCreate(Bundle paramBundle)
  {
    GMTrace.i(10755671851008L, 80136);
    super.onCreate(paramBundle);
    findViewById(a.f.sHh).setOnClickListener(new View.OnClickListener()
    {
      public final void onClick(View paramAnonymousView)
      {
        GMTrace.i(10761711648768L, 80181);
        w.i("MicroMsg.SoterPayTestUI", "hy: start get challenge");
        h.xz();
        h.xx().fYr.a(1586, SoterPayTestUI.this);
        h.xz();
        h.xx().fYr.a(new com.tencent.mm.plugin.fingerprint.c.a(), 0);
        GMTrace.o(10761711648768L, 80181);
      }
    });
    findViewById(a.f.sGb).setOnClickListener(new View.OnClickListener()
    {
      public final void onClick(View paramAnonymousView)
      {
        GMTrace.i(10769227841536L, 80237);
        w.i("MicroMsg.SoterPayTestUI", "hy: regen and upload ask");
        com.tencent.d.b.a.a(new com.tencent.d.b.a.b() {}, false, null);
        GMTrace.o(10769227841536L, 80237);
      }
    });
    findViewById(a.f.sGc).setOnClickListener(new View.OnClickListener()
    {
      public final void onClick(View paramAnonymousView)
      {
        GMTrace.i(10756477157376L, 80142);
        GMTrace.o(10756477157376L, 80142);
      }
    });
    GMTrace.o(10755671851008L, 80136);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\plugin\fingerprint\ui\SoterPayTestUI.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */