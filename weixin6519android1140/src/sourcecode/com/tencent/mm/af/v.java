package com.tencent.mm.af;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.ad.b;
import com.tencent.mm.ad.b.a;
import com.tencent.mm.ad.b.b;
import com.tencent.mm.ad.b.c;
import com.tencent.mm.network.q;
import com.tencent.mm.protocal.c.akm;
import com.tencent.mm.protocal.c.akn;
import com.tencent.mm.sdk.platformtools.w;
import java.util.LinkedList;

public final class v
  extends com.tencent.mm.ad.k
  implements com.tencent.mm.network.k
{
  public b fUa;
  private com.tencent.mm.ad.e fUd;
  public String gxy;
  public int gxz;
  public String tag;
  
  public v(String paramString, LinkedList<String> paramLinkedList)
  {
    this(paramString, paramLinkedList, (byte)0);
    GMTrace.i(4549578326016L, 33897);
    GMTrace.o(4549578326016L, 33897);
  }
  
  private v(String paramString, LinkedList<String> paramLinkedList, byte paramByte)
  {
    GMTrace.i(4549712543744L, 33898);
    this.gxz = 1;
    Object localObject = new b.a();
    ((b.a)localObject).gtF = new akm();
    ((b.a)localObject).gtG = new akn();
    ((b.a)localObject).uri = "/cgi-bin/mmkf-bin/kfgetinfolist";
    ((b.a)localObject).gtE = 675;
    ((b.a)localObject).gtH = 0;
    ((b.a)localObject).gtI = 0;
    this.fUa = ((b.a)localObject).DA();
    localObject = (akm)this.fUa.gtC.gtK;
    ((akm)localObject).uzI = paramString;
    ((akm)localObject).uzL = paramLinkedList;
    this.gxy = paramString;
    this.gxz = 1;
    GMTrace.o(4549712543744L, 33898);
  }
  
  public final akn FD()
  {
    GMTrace.i(4550249414656L, 33902);
    if ((this.fUa != null) && (this.fUa.gtD.gtK != null))
    {
      akn localakn = (akn)this.fUa.gtD.gtK;
      GMTrace.o(4550249414656L, 33902);
      return localakn;
    }
    GMTrace.o(4550249414656L, 33902);
    return null;
  }
  
  public final int a(com.tencent.mm.network.e parame, com.tencent.mm.ad.e parame1)
  {
    GMTrace.i(4550115196928L, 33901);
    this.fUd = parame1;
    w.i("MicroMsg.NetSceneKFGetInfoList", "do scene");
    int i = a(parame, this.fUa, this);
    GMTrace.o(4550115196928L, 33901);
    return i;
  }
  
  public final void a(int paramInt1, int paramInt2, int paramInt3, String paramString, q paramq, byte[] paramArrayOfByte)
  {
    GMTrace.i(4549846761472L, 33899);
    w.i("MicroMsg.NetSceneKFGetInfoList", "onGYNetEnd code(%d, %d)", new Object[] { Integer.valueOf(paramInt2), Integer.valueOf(paramInt3) });
    if (this.fUd != null) {
      this.fUd.a(paramInt2, paramInt3, paramString, this);
    }
    GMTrace.o(4549846761472L, 33899);
  }
  
  public final int getType()
  {
    GMTrace.i(4549980979200L, 33900);
    GMTrace.o(4549980979200L, 33900);
    return 675;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\af\v.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */