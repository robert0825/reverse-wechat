package com.tencent.mm.ad;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.network.q;
import com.tencent.mm.protocal.c.aho;
import com.tencent.mm.protocal.c.apx;
import com.tencent.mm.protocal.c.hz;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.y.au;

public abstract class l
  extends k
  implements com.tencent.mm.network.k
{
  protected int gup;
  private boolean guq;
  
  public l()
  {
    GMTrace.i(308566556672L, 2299);
    this.gup = 3;
    this.guq = false;
    GMTrace.o(308566556672L, 2299);
  }
  
  public abstract void DK();
  
  public abstract e DL();
  
  public final void a(int paramInt1, int paramInt2, int paramInt3, String paramString, q paramq, byte[] paramArrayOfByte)
  {
    GMTrace.i(308700774400L, 2300);
    if ((paramInt2 == 4) && (paramInt3 == 65235))
    {
      w.i("MicroMsg.NetSceneIDCRedirectBase", "alvinluo NetScene pre process MM_ERR_IDC_REDIRECT redirectCount: %d", new Object[] { Integer.valueOf(this.gup) });
      if (paramq != null)
      {
        w.i("MicroMsg.NetSceneIDCRedirectBase", "update idc info");
        au.a(true, c(paramq), d(paramq), e(paramq));
      }
      this.gup -= 1;
      if (this.gup <= 0)
      {
        DK();
        this.guq = false;
        GMTrace.o(308700774400L, 2300);
        return;
      }
      w.d("MicroMsg.NetSceneIDCRedirectBase", "redirect IDC");
      a(this.gtW, DL());
      GMTrace.o(308700774400L, 2300);
      return;
    }
    a(paramInt2, paramInt3, paramString, paramq);
    GMTrace.o(308700774400L, 2300);
  }
  
  public abstract void a(int paramInt1, int paramInt2, String paramString, q paramq);
  
  public abstract hz c(q paramq);
  
  public abstract apx d(q paramq);
  
  public abstract aho e(q paramq);
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\ad\l.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */