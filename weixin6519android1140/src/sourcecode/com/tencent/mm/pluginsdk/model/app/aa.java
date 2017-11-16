package com.tencent.mm.pluginsdk.model.app;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.ad.b;
import com.tencent.mm.ad.b.a;
import com.tencent.mm.ad.b.b;
import com.tencent.mm.ad.b.c;
import com.tencent.mm.network.q;
import com.tencent.mm.protocal.c.me;
import com.tencent.mm.protocal.c.mf;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;

public final class aa
  extends com.tencent.mm.ad.k
  implements com.tencent.mm.network.k
{
  private b fUa;
  private com.tencent.mm.ad.e fUd;
  private a tok;
  
  public aa(String paramString1, String paramString2, String paramString3, int paramInt, a parama)
  {
    GMTrace.i(828123381760L, 6170);
    Object localObject = new b.a();
    ((b.a)localObject).gtF = new me();
    ((b.a)localObject).gtG = new mf();
    ((b.a)localObject).uri = "/cgi-bin/micromsg-bin/checkmd5";
    ((b.a)localObject).gtE = 939;
    ((b.a)localObject).gtH = 0;
    ((b.a)localObject).gtI = 0;
    this.fUa = ((b.a)localObject).DA();
    localObject = (me)this.fUa.gtC.gtK;
    ((me)localObject).fileid = paramString1;
    ((me)localObject).eDW = paramString2;
    ((me)localObject).ucW = paramString3;
    ((me)localObject).ucX = paramInt;
    this.tok = parama;
    w.i("MicroMsg.NetSceneCheckMd5", "summersafecdn NetSceneCheckMd5 fileid[%s], md5[%s], newmd5[%s], crc[%d], stack[%s]", new Object[] { ((me)localObject).fileid, ((me)localObject).eDW, ((me)localObject).ucW, Integer.valueOf(((me)localObject).ucX), bg.bQW() });
    GMTrace.o(828123381760L, 6170);
  }
  
  public final int a(com.tencent.mm.network.e parame, com.tencent.mm.ad.e parame1)
  {
    GMTrace.i(828391817216L, 6172);
    this.fUd = parame1;
    int i = a(parame, this.fUa, this);
    GMTrace.o(828391817216L, 6172);
    return i;
  }
  
  public final void a(int paramInt1, int paramInt2, int paramInt3, String paramString, q paramq, byte[] paramArrayOfByte)
  {
    GMTrace.i(828526034944L, 6173);
    w.i("MicroMsg.NetSceneCheckMd5", "summersafecdn onGYNetEnd [%d, %d, %s]", new Object[] { Integer.valueOf(paramInt2), Integer.valueOf(paramInt3), paramString });
    this.fUd.a(paramInt2, paramInt3, paramString, this);
    if (this.tok != null)
    {
      if ((paramInt2 == 0) && (paramInt3 == 0)) {
        break label99;
      }
      paramString = this.tok;
    }
    for (;;)
    {
      for (paramq = "";; paramq = paramq.aeskey)
      {
        paramString.M(paramq, paramInt2, paramInt3);
        GMTrace.o(828526034944L, 6173);
        return;
        label99:
        paramq = (mf)((b)paramq).gtD.gtK;
        paramString = this.tok;
        if (paramq == null) {
          break;
        }
      }
    }
  }
  
  public final int getType()
  {
    GMTrace.i(828257599488L, 6171);
    GMTrace.o(828257599488L, 6171);
    return 939;
  }
  
  public static abstract interface a
  {
    public abstract void M(String paramString, int paramInt1, int paramInt2);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\pluginsdk\model\app\aa.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */