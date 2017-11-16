package com.tencent.mm.plugin.scanner.a;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.g.a.al;
import com.tencent.mm.g.a.al.a;
import com.tencent.mm.g.a.mk;
import com.tencent.mm.g.a.mk.a;
import com.tencent.mm.g.a.ml;
import com.tencent.mm.g.a.mm;
import com.tencent.mm.plugin.ab.a.b.2;
import com.tencent.mm.plugin.ab.a.b.a;
import com.tencent.mm.sdk.b.a;
import com.tencent.mm.sdk.platformtools.ae;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;

public final class n
{
  public com.tencent.mm.sdk.b.c otG;
  public com.tencent.mm.sdk.b.c otH;
  b.a otI;
  
  public n()
  {
    GMTrace.i(6056306540544L, 45123);
    this.otG = new com.tencent.mm.sdk.b.c() {};
    this.otH = new com.tencent.mm.sdk.b.c() {};
    this.otI = new b.a()
    {
      public final void Fk(String paramAnonymousString)
      {
        GMTrace.i(6057246064640L, 45130);
        w.i("MicroMsg.RecogQBarOfImageFileListener", "result(failed): %s", new Object[] { paramAnonymousString });
        ml localml = new ml();
        localml.eRs.filePath = paramAnonymousString;
        a.vgX.m(localml);
        GMTrace.o(6057246064640L, 45130);
      }
      
      public final void i(String paramAnonymousString1, String paramAnonymousString2, int paramAnonymousInt1, int paramAnonymousInt2)
      {
        GMTrace.i(6057111846912L, 45129);
        w.i("MicroMsg.RecogQBarOfImageFileListener", "result: %s, codeType: %s, codeVersion: %s, filePath:%s", new Object[] { paramAnonymousString2, Integer.valueOf(paramAnonymousInt1), Integer.valueOf(paramAnonymousInt2), paramAnonymousString1 });
        l.oto.aIS();
        mm localmm = new mm();
        localmm.eRt.filePath = paramAnonymousString1;
        localmm.eRt.result = paramAnonymousString2;
        localmm.eRt.eDg = paramAnonymousInt1;
        localmm.eRt.eDh = paramAnonymousInt2;
        a.vgX.m(localmm);
        GMTrace.o(6057111846912L, 45129);
      }
    };
    GMTrace.o(6056306540544L, 45123);
  }
  
  public final boolean h(com.tencent.mm.sdk.b.b paramb)
  {
    GMTrace.i(6056440758272L, 45124);
    if (paramb == null)
    {
      GMTrace.o(6056440758272L, 45124);
      return false;
    }
    if ((paramb instanceof mk))
    {
      l.oto.reset();
      l.oto.tu(l.otn);
      paramb = (mk)paramb;
      com.tencent.mm.plugin.scanner.c.bcm().osA.a(paramb.eRq.filePath, this.otI, paramb.eRq.eRr);
    }
    for (;;)
    {
      GMTrace.o(6056440758272L, 45124);
      return false;
      if ((paramb instanceof al))
      {
        l.oto.aIS();
        Object localObject = (al)paramb;
        paramb = com.tencent.mm.plugin.scanner.c.bcm().osA;
        localObject = ((al)localObject).eBC.filePath;
        b.a locala = this.otI;
        w.i("MicroMsg.FileScanQueueService", "cancelDecode, fileUri: %s, callback: %x", new Object[] { localObject, Integer.valueOf(locala.hashCode()) });
        if (bg.nm((String)localObject)) {
          w.e("MicroMsg.FileScanQueueService", "cancel failed, uri is null or nil");
        } else {
          paramb.iAX.post(new b.2(paramb, (String)localObject, locala));
        }
      }
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\plugin\scanner\a\n.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */