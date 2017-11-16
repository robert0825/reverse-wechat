package com.tencent.mm.plugin.voiceprint.model;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.ad.k;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.y.at;

public final class n
  implements com.tencent.mm.ad.e
{
  public String iAx;
  public String qBY;
  private String qCi;
  public int qCj;
  public String qCl;
  public a qCm;
  
  public n()
  {
    GMTrace.i(12503320887296L, 93157);
    this.qCl = null;
    this.qCm = null;
    this.qCj = -1;
    this.qCi = null;
    this.qBY = null;
    this.iAx = null;
    at.wS().a(618, this);
    at.wS().a(616, this);
    at.wS().a(617, this);
    GMTrace.o(12503320887296L, 93157);
  }
  
  public final void a(int paramInt1, int paramInt2, String paramString, k paramk)
  {
    GMTrace.i(12503589322752L, 93159);
    w.d("MicroMsg.VoicePrintLoginService", "onSceneEnd, errType:%d, errCode:%d", new Object[] { Integer.valueOf(paramInt1), Integer.valueOf(paramInt2) });
    if ((paramInt1 != 0) && (paramInt2 != 0))
    {
      if ((paramInt2 == -34) && (paramk.getType() == 617))
      {
        w.d("MicroMsg.VoicePrintLoginService", "blocked by limit");
        if (this.qCm != null) {
          this.qCm.bte();
        }
        GMTrace.o(12503589322752L, 93159);
        return;
      }
      if (this.qCm != null) {
        this.qCm.btc();
      }
      GMTrace.o(12503589322752L, 93159);
      return;
    }
    if (paramk.getType() == 618)
    {
      this.qCl = ((e)paramk).jQv;
      w.d("MicroMsg.VoicePrintLoginService", "onGetTicket, loginTicket==null:%b", new Object[] { Boolean.valueOf(bg.nm(this.qCl)) });
      if (!bg.nm(this.qCl)) {
        btd();
      }
    }
    if (paramk.getType() == 616)
    {
      paramString = (g)paramk;
      this.qCj = paramString.qBL;
      this.qCi = paramString.qBK;
      w.d("MicroMsg.VoicePrintLoginService", "onFinishGetText, resId:%d, voiceText==null:%b", new Object[] { Integer.valueOf(this.qCj), Boolean.valueOf(bg.nm(this.qCi)) });
      if (this.qCm != null) {
        this.qCm.JM(this.qCi);
      }
    }
    if (paramk.getType() == 617)
    {
      paramString = (h)paramk;
      if (paramString.qBV == 0)
      {
        w.d("MicroMsg.VoicePrintLoginService", "onFinishVerify, success");
        this.qBY = paramString.qBY;
        if (this.qCm != null)
        {
          this.qCm.ir(true);
          GMTrace.o(12503589322752L, 93159);
        }
      }
      else
      {
        w.d("MicroMsg.VoicePrintLoginService", "onFinishVerify, failed");
        if (this.qCm != null) {
          this.qCm.ir(false);
        }
      }
    }
    GMTrace.o(12503589322752L, 93159);
  }
  
  public final void btd()
  {
    GMTrace.i(12503455105024L, 93158);
    at.wS().a(new g(this.qCl), 0);
    GMTrace.o(12503455105024L, 93158);
  }
  
  public static abstract interface a
  {
    public abstract void JM(String paramString);
    
    public abstract void btc();
    
    public abstract void bte();
    
    public abstract void ir(boolean paramBoolean);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\plugin\voiceprint\model\n.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */