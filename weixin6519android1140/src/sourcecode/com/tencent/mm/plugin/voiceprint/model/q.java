package com.tencent.mm.plugin.voiceprint.model;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.ad.e;
import com.tencent.mm.ad.k;
import com.tencent.mm.ad.n;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.y.at;

public final class q
  implements e
{
  private String qBM;
  private int qBS;
  public String qCi;
  public int qCj;
  public a qCz;
  
  public q()
  {
    GMTrace.i(12492046598144L, 93073);
    this.qCz = null;
    this.qCj = -1;
    this.qCi = null;
    this.qBM = null;
    this.qBS = 0;
    at.wS().a(611, this);
    at.wS().a(613, this);
    GMTrace.o(12492046598144L, 93073);
  }
  
  public q(a parama)
  {
    this();
    GMTrace.i(12492180815872L, 93074);
    this.qCz = parama;
    GMTrace.o(12492180815872L, 93074);
  }
  
  public final void a(int paramInt1, int paramInt2, String paramString, k paramk)
  {
    GMTrace.i(12492315033600L, 93075);
    w.d("MicroMsg.VoicePrintUnLockService", "onSceneEnd, errType:%d, errCode:%d", new Object[] { Integer.valueOf(paramInt1), Integer.valueOf(paramInt2) });
    if ((paramInt1 != 0) && (paramInt2 != 0))
    {
      if (this.qCz != null) {
        this.qCz.btc();
      }
      GMTrace.o(12492315033600L, 93075);
      return;
    }
    if (paramk.getType() == 611)
    {
      paramString = (d)paramk;
      this.qCj = paramString.qBL;
      this.qCi = paramString.qBK;
      this.qBM = paramString.qBM;
      w.d("MicroMsg.VoicePrintUnLockService", "onGetVoiceText, resId:%d, verifyKey:%s, voiceText==null:%b", new Object[] { Integer.valueOf(this.qCj), this.qBM, Boolean.valueOf(bg.nm(this.qCi)) });
      if (this.qCz != null) {
        this.qCz.JM(this.qCi);
      }
    }
    if (paramk.getType() == 613) {
      if (((j)paramk).qBV == 0)
      {
        w.d("MicroMsg.VoicePrintUnLockService", "onVerify, success");
        if (this.qCz != null)
        {
          this.qCz.is(true);
          GMTrace.o(12492315033600L, 93075);
        }
      }
      else
      {
        w.d("MicroMsg.VoicePrintUnLockService", "onVerify, failed");
        if (this.qCz != null) {
          this.qCz.is(false);
        }
      }
    }
    GMTrace.o(12492315033600L, 93075);
  }
  
  public static abstract interface a
  {
    public abstract void JM(String paramString);
    
    public abstract void btc();
    
    public abstract void is(boolean paramBoolean);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\plugin\voiceprint\model\q.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */