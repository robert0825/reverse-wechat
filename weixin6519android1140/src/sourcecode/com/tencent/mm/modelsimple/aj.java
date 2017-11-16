package com.tencent.mm.modelsimple;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.a.o;
import com.tencent.mm.ad.b.a;
import com.tencent.mm.ad.b.b;
import com.tencent.mm.ad.b.c;
import com.tencent.mm.ad.v;
import com.tencent.mm.kernel.a;
import com.tencent.mm.kernel.h;
import com.tencent.mm.platformtools.n;
import com.tencent.mm.protocal.c.azp;
import com.tencent.mm.protocal.c.azq;
import com.tencent.mm.protocal.c.bng;
import com.tencent.mm.protocal.c.bnh;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.storage.s;
import com.tencent.mm.storage.t;

public final class aj
  extends com.tencent.mm.ad.k
  implements com.tencent.mm.network.k
{
  public com.tencent.mm.ad.b fUa;
  private com.tencent.mm.ad.e fUd;
  public long gvv;
  
  public aj(int paramInt1, String paramString1, String paramString2, String paramString3, String paramString4, boolean paramBoolean, int paramInt2)
  {
    this(paramInt1, paramString1, paramString2, paramString3, paramString4, paramBoolean, paramInt2, true);
    GMTrace.i(13292521127936L, 99037);
    GMTrace.o(13292521127936L, 99037);
  }
  
  public aj(int paramInt1, String paramString1, String paramString2, String paramString3, String paramString4, boolean paramBoolean1, int paramInt2, boolean paramBoolean2)
  {
    GMTrace.i(13292655345664L, 99038);
    this.gvv = 0L;
    Object localObject = new b.a();
    ((b.a)localObject).gtF = new bng();
    ((b.a)localObject).gtG = new bnh();
    ((b.a)localObject).uri = "/cgi-bin/micromsg-bin/newverifypasswd";
    ((b.a)localObject).gtE = 384;
    ((b.a)localObject).gtH = 182;
    ((b.a)localObject).gtI = 1000000182;
    this.fUa = ((b.a)localObject).DA();
    localObject = (bng)this.fUa.gtC.gtK;
    ((bng)localObject).tMX = paramInt1;
    ((bng)localObject).uPl = paramInt2;
    ((bng)localObject).uXh = bg.Ss(paramString1);
    ((bng)localObject).tVd = bg.Sr(paramString1);
    ((bng)localObject).uuK = new azq().Rq(paramString2);
    ((bng)localObject).uXi = new azq().Rq(paramString3);
    ((bng)localObject).tVh = new azq().Rq(paramString4);
    if ((paramInt1 == 5) || (paramInt1 == 2))
    {
      this.gvv = new o(com.tencent.mm.y.q.zD()).longValue();
      if (paramBoolean1)
      {
        paramString1 = h.xw().fXT.c(this.gvv, paramString3);
        ((bng)localObject).tTt = new azp().be(paramString1);
      }
    }
    else
    {
      paramString1 = bg.nl((String)h.xy().xh().get(47, null));
      ((bng)localObject).tVi = new azp().be(bg.St(paramString1));
      paramInt2 = ((bng)localObject).tMX;
      if (((bng)localObject).tTt != null) {
        break label393;
      }
      paramInt1 = -1;
      label304:
      if (((bng)localObject).tTt != null) {
        break label405;
      }
    }
    label393:
    label405:
    for (paramString1 = "null";; paramString1 = bg.SJ(bg.bp(((bng)localObject).tTt.uNP.tJp)))
    {
      w.i("MicroMsg.NetSceneVerifyPswd", "summerauth opCode[%d], hasSecCode[%b], isManualAuth[%b], len:%d, content:[%s]", new Object[] { Integer.valueOf(paramInt2), Boolean.valueOf(paramBoolean1), Boolean.valueOf(paramBoolean2), Integer.valueOf(paramInt1), paramString1 });
      GMTrace.o(13292655345664L, 99038);
      return;
      paramString1 = h.xw().fXT.a(this.gvv, bg.Ss(paramString1), paramBoolean2);
      break;
      paramInt1 = ((bng)localObject).tTt.uNN;
      break label304;
    }
  }
  
  public aj(String paramString1, String paramString2, String paramString3, String paramString4)
  {
    this(1, paramString1, paramString2, paramString3, paramString4, false, 0);
    GMTrace.i(13292386910208L, 99036);
    GMTrace.o(13292386910208L, 99036);
  }
  
  public final String Hx()
  {
    GMTrace.i(13293057998848L, 99041);
    try
    {
      String str = ((bnh)this.fUa.gtD.gtK).ugx;
      GMTrace.o(13293057998848L, 99041);
      return str;
    }
    catch (Exception localException)
    {
      w.printErrStackTrace("MicroMsg.NetSceneVerifyPswd", localException, "", new Object[0]);
      GMTrace.o(13293057998848L, 99041);
    }
    return null;
  }
  
  public final int a(com.tencent.mm.network.e parame, com.tencent.mm.ad.e parame1)
  {
    GMTrace.i(13292789563392L, 99039);
    this.fUd = parame1;
    int i = a(parame, this.fUa, this);
    GMTrace.o(13292789563392L, 99039);
    return i;
  }
  
  public final void a(int paramInt1, int paramInt2, int paramInt3, String paramString, com.tencent.mm.network.q paramq, byte[] paramArrayOfByte)
  {
    GMTrace.i(13293192216576L, 99042);
    paramArrayOfByte = (bng)this.fUa.gtC.gtK;
    paramq = (bnh)this.fUa.gtD.gtK;
    if ((paramq.tSd != null) && (paramq.tSd.uNN > 0)) {
      w.i("MicroMsg.NetSceneVerifyPswd", "summerauth parseRet[%b], len[%d]", new Object[] { Boolean.valueOf(h.xw().fXT.a(this.gvv, n.a(paramq.tSd))), Integer.valueOf(paramq.tSd.uNN) });
    }
    int i;
    label267:
    int j;
    if ((paramInt2 == 0) && (paramInt3 == 0))
    {
      h.xy().xh().set(77830, paramq.ugx);
      h.xy().xh().set(32, paramArrayOfByte.uXh);
      h.xy().xh().set(33, paramArrayOfByte.tVd);
      h.xy().xh().set(46, bg.bs(n.a(paramq.tSj)));
      paramArrayOfByte = bg.bs(n.a(paramArrayOfByte.tVi));
      h.xy().xh().set(47, paramArrayOfByte);
      h.xy().fYL.set(18, paramArrayOfByte);
      h.xy().xh().set(-1535680990, paramq.tSi);
      if (paramq.tSj == null)
      {
        paramInt1 = 0;
        if (paramq.tSi != null) {
          break label349;
        }
        i = 0;
        if (paramq.ugx != null) {
          break label362;
        }
        j = 0;
        label278:
        w.i("MicroMsg.NetSceneVerifyPswd", "A2Key.len %d, authKey.len: %d, ticketLen:%d", new Object[] { Integer.valueOf(paramInt1), Integer.valueOf(i), Integer.valueOf(j) });
      }
    }
    for (;;)
    {
      this.fUd.a(paramInt2, paramInt3, paramString, this);
      GMTrace.o(13293192216576L, 99042);
      return;
      paramInt1 = paramq.tSj.uNN;
      break;
      label349:
      i = paramq.tSi.length();
      break label267;
      label362:
      j = paramq.ugx.length();
      break label278;
      if (paramInt2 == 4)
      {
        h.xy().xh().set(32, "");
        h.xy().xh().set(33, "");
      }
    }
  }
  
  public final int getType()
  {
    GMTrace.i(13292923781120L, 99040);
    GMTrace.o(13292923781120L, 99040);
    return 384;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\modelsimple\aj.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */