package com.tencent.mm.plugin.scanner.ui;

import android.content.Context;
import android.content.DialogInterface;
import android.content.DialogInterface.OnCancelListener;
import android.content.Intent;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.R.l;
import com.tencent.mm.ad.e;
import com.tencent.mm.ad.k;
import com.tencent.mm.ad.n;
import com.tencent.mm.modelsimple.l;
import com.tencent.mm.plugin.scanner.b;
import com.tencent.mm.pluginsdk.m;
import com.tencent.mm.sdk.platformtools.aj;
import com.tencent.mm.sdk.platformtools.aj.a;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.ui.base.h;
import com.tencent.mm.y.at;

public final class r
  implements e
{
  public Context context;
  public com.tencent.mm.ui.base.r luk;
  aj nPj;
  public l ozU;
  String url;
  
  public r(Context paramContext)
  {
    GMTrace.i(6061675249664L, 45163);
    this.nPj = new aj(new aj.a()
    {
      public final boolean pM()
      {
        GMTrace.i(6132005339136L, 45687);
        r localr = r.this;
        Context localContext = r.this.context;
        r.this.context.getString(R.l.cUG);
        localr.luk = h.a(localContext, r.this.context.getString(R.l.cUV), true, new DialogInterface.OnCancelListener()
        {
          public final void onCancel(DialogInterface paramAnonymous2DialogInterface)
          {
            GMTrace.i(6136031870976L, 45717);
            at.wS().c(r.this.ozU);
            r.this.luk = null;
            GMTrace.o(6136031870976L, 45717);
          }
        });
        GMTrace.o(6132005339136L, 45687);
        return false;
      }
    }, false);
    this.context = paramContext;
    GMTrace.o(6061675249664L, 45163);
  }
  
  public final void a(int paramInt1, int paramInt2, String paramString, k paramk)
  {
    GMTrace.i(6061943685120L, 45165);
    this.nPj.stopTimer();
    if (this.luk != null) {
      this.luk.dismiss();
    }
    at.wS().b(233, this);
    paramString = (l)paramk;
    if ((paramInt1 == 0) && (paramInt2 == 0))
    {
      paramk = paramString.Lc();
      if ((paramk == null) || (paramk.length() == 0))
      {
        b(this.url, paramString.Lk(), paramString.Ll());
        GMTrace.o(6061943685120L, 45165);
        return;
      }
      b(paramk, paramString.Lk(), paramString.Ll());
      GMTrace.o(6061943685120L, 45165);
      return;
    }
    w.e("MicroMsg.scanner.ViewMMURL", "getA8Key fail, errType = " + paramInt1 + ", errCode = " + paramInt2);
    b(this.url, paramString.Lk(), paramString.Ll());
    GMTrace.o(6061943685120L, 45165);
  }
  
  final void b(String paramString, int paramInt, byte[] paramArrayOfByte)
  {
    GMTrace.i(20666443104256L, 153977);
    Intent localIntent = new Intent();
    localIntent.putExtra("rawUrl", paramString);
    localIntent.putExtra("useJs", true);
    localIntent.putExtra("vertical_scroll", true);
    localIntent.putExtra("geta8key_session_id", paramInt);
    localIntent.putExtra("geta8key_cookie", paramArrayOfByte);
    b.hnH.j(localIntent, this.context);
    GMTrace.o(20666443104256L, 153977);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\plugin\scanner\ui\r.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */