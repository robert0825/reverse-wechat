package com.tencent.mm.plugin.voiceprint.model;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.ad.e;
import com.tencent.mm.ad.k;
import com.tencent.mm.ad.n;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.y.at;

public final class l
  implements e
{
  public int qBS;
  public int qCh;
  private String qCi;
  public int qCj;
  public a qCk;
  
  public l()
  {
    GMTrace.i(12498489049088L, 93121);
    this.qCh = 71;
    this.qCi = null;
    this.qCj = 0;
    this.qBS = 0;
    this.qCk = null;
    at.wS().a(611, this);
    at.wS().a(612, this);
    GMTrace.o(12498489049088L, 93121);
  }
  
  public l(a parama)
  {
    this();
    GMTrace.i(12498623266816L, 93122);
    this.qCk = parama;
    GMTrace.o(12498623266816L, 93122);
  }
  
  public final void a(int paramInt1, int paramInt2, String paramString, k paramk)
  {
    GMTrace.i(12498757484544L, 93123);
    w.d("MicroMsg.VoicePrintCreateService", "onSceneEnd, errType:%d, errCode:%d", new Object[] { Integer.valueOf(paramInt1), Integer.valueOf(paramInt2) });
    if ((paramInt1 != 0) && (paramInt2 != 0))
    {
      if (this.qCk != null) {
        this.qCk.btc();
      }
      GMTrace.o(12498757484544L, 93123);
      return;
    }
    if (paramk.getType() == 611)
    {
      paramString = (d)paramk;
      this.qCj = paramString.qBL;
      this.qCi = paramString.qBK;
      w.d("MicroMsg.VoicePrintCreateService", "onFinishGetText, resId:%d, voiceText==null:%b", new Object[] { Integer.valueOf(this.qCj), Boolean.valueOf(bg.nm(this.qCi)) });
      if (this.qCk != null)
      {
        if (this.qCh != 71) {
          break label302;
        }
        this.qCk.JK(this.qCi);
      }
    }
    if (paramk.getType() == 612)
    {
      paramString = (f)paramk;
      if (((paramString.qBU != 72) || (paramString.qBV != 0)) && (paramString.qBU != 71)) {
        break label327;
      }
      paramInt1 = 1;
      label206:
      if (paramInt1 == 0) {
        break label332;
      }
      w.d("MicroMsg.VoicePrintCreateService", "onRegister, ok, step:%d", new Object[] { Integer.valueOf(paramString.qBU) });
      this.qBS = paramString.qBS;
      if (this.qCk != null) {
        this.qCk.s(true, paramString.qBU);
      }
    }
    for (;;)
    {
      if ((paramInt1 != 0) && (paramString.qBU == 71) && (this.qCk != null)) {
        this.qCk.JL(this.qCi);
      }
      GMTrace.o(12498757484544L, 93123);
      return;
      label302:
      if (this.qCh != 72) {
        break;
      }
      this.qCk.JL(this.qCi);
      break;
      label327:
      paramInt1 = 0;
      break label206;
      label332:
      w.d("MicroMsg.VoicePrintCreateService", "onRegister, not ok, step:%d", new Object[] { Integer.valueOf(paramString.qBU) });
      if (this.qCk != null) {
        this.qCk.s(false, paramString.qBU);
      }
    }
  }
  
  public static abstract interface a
  {
    public abstract void JK(String paramString);
    
    public abstract void JL(String paramString);
    
    public abstract void btc();
    
    public abstract void s(boolean paramBoolean, int paramInt);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\plugin\voiceprint\model\l.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */