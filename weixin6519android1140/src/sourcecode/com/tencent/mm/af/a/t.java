package com.tencent.mm.af.a;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.ad.b;
import com.tencent.mm.ad.b.a;
import com.tencent.mm.ad.b.b;
import com.tencent.mm.ad.b.c;
import com.tencent.mm.network.q;
import com.tencent.mm.protocal.c.aik;
import com.tencent.mm.protocal.c.ail;
import com.tencent.mm.sdk.platformtools.w;
import java.util.LinkedList;

public final class t
  extends com.tencent.mm.ad.k
  implements com.tencent.mm.network.k
{
  Object data;
  public b fUa;
  private com.tencent.mm.ad.e fUd;
  public String gyM;
  
  public t(String paramString1, String paramString2, LinkedList<String> paramLinkedList, Object paramObject)
  {
    GMTrace.i(4577495613440L, 34105);
    Object localObject = new b.a();
    ((b.a)localObject).gtF = new aik();
    ((b.a)localObject).gtG = new ail();
    ((b.a)localObject).uri = "/cgi-bin/mmocbiz-bin/initiatebizchat";
    ((b.a)localObject).gtE = 1389;
    ((b.a)localObject).gtH = 0;
    ((b.a)localObject).gtI = 0;
    this.fUa = ((b.a)localObject).DA();
    localObject = (aik)this.fUa.gtC.gtK;
    ((aik)localObject).ufb = paramString1;
    paramString1 = paramString2;
    if (paramString2 == null) {
      paramString1 = "";
    }
    ((aik)localObject).uxN = paramString1;
    ((aik)localObject).uxO = paramLinkedList;
    this.data = paramObject;
    GMTrace.o(4577495613440L, 34105);
  }
  
  public final ail Gc()
  {
    GMTrace.i(4578032484352L, 34109);
    if ((this.fUa != null) && (this.fUa.gtD.gtK != null))
    {
      ail localail = (ail)this.fUa.gtD.gtK;
      GMTrace.o(4578032484352L, 34109);
      return localail;
    }
    GMTrace.o(4578032484352L, 34109);
    return null;
  }
  
  public final int a(com.tencent.mm.network.e parame, com.tencent.mm.ad.e parame1)
  {
    GMTrace.i(4577898266624L, 34108);
    this.fUd = parame1;
    w.i("MicroMsg.NetSceneInitiateBizChat", "do scene");
    int i = a(parame, this.fUa, this);
    GMTrace.o(4577898266624L, 34108);
    return i;
  }
  
  public final void a(int paramInt1, int paramInt2, int paramInt3, String paramString, q paramq, byte[] paramArrayOfByte)
  {
    GMTrace.i(4577629831168L, 34106);
    w.d("MicroMsg.NetSceneInitiateBizChat", "onGYNetEnd code(%d, %d)", new Object[] { Integer.valueOf(paramInt2), Integer.valueOf(paramInt3) });
    if (this.fUd != null) {
      this.fUd.a(paramInt2, paramInt3, paramString, this);
    }
    GMTrace.o(4577629831168L, 34106);
  }
  
  public final int getType()
  {
    GMTrace.i(4577764048896L, 34107);
    GMTrace.o(4577764048896L, 34107);
    return 1389;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\af\a\t.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */