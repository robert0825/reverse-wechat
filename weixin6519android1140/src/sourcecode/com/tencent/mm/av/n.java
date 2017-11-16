package com.tencent.mm.av;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.a.e;
import com.tencent.mm.bm.b;
import com.tencent.mm.plugin.messenger.foundation.a.a.e.b;
import com.tencent.mm.protocal.c.apk;
import com.tencent.mm.protocal.c.azq;
import com.tencent.mm.sdk.platformtools.bg;

@Deprecated
public final class n
  extends e.b
{
  private apk gPA;
  
  public n(String paramString1, String paramString2, String paramString3, String paramString4, String paramString5, String paramString6, String paramString7, String paramString8, int paramInt, String paramString9, String paramString10)
  {
    super(1);
    GMTrace.i(13241652609024L, 98658);
    this.gPA = new apk();
    this.gPA.uFa = 2048;
    this.gPA.ufy = new azq().Rq(bg.nl(paramString1));
    this.gPA.uxT = new azq().Rq(bg.nl(paramString2));
    this.gPA.tOs = 0;
    this.gPA.uFb = new azq().Rq(bg.nl(paramString3));
    this.gPA.uFc = new azq().Rq(bg.nl(paramString4));
    this.gPA.jhA = 0;
    paramString2 = e.c(bg.nl(paramString5), 0, -1);
    paramString3 = this.gPA;
    if (paramString2 == null)
    {
      paramString1 = new byte[0];
      paramString3.uEY = new b(paramString1);
      paramString1 = this.gPA;
      if (paramString2 != null) {
        break label321;
      }
    }
    label321:
    for (int i = 0;; i = paramString2.length)
    {
      paramString1.uEX = i;
      this.gPA.gCx = 0;
      this.gPA.gCB = 0;
      this.gPA.gCA = bg.nl(paramString6);
      this.gPA.gCz = bg.nl(paramString7);
      this.gPA.gCy = bg.nl(paramString8);
      this.gPA.tOv = paramInt;
      this.gPA.uAx = bg.nl(paramString9);
      this.gPA.uFh = 0;
      this.gPA.gCC = bg.nl(paramString10);
      this.gPA.uAz = 0;
      this.gPA.uAy = "";
      this.mVj = this.gPA;
      GMTrace.o(13241652609024L, 98658);
      return;
      paramString1 = paramString2;
      break;
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\av\n.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */