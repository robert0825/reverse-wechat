package com.tencent.mm.plugin.backup.bakoldlogic.b;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.a.k;
import com.tencent.mm.plugin.backup.bakoldlogic.bakoldmovemodel.g;
import com.tencent.mm.plugin.backup.h.v;
import com.tencent.mm.sdk.platformtools.bg;

public final class a
  extends com.tencent.mm.plugin.backup.f.b
{
  final int iVq;
  public v jbg;
  public com.tencent.mm.plugin.backup.h.w jbh;
  private boolean jbm;
  final String jeH;
  final String jeI;
  final byte[] key;
  
  public a(String paramString1, String paramString2, byte[] paramArrayOfByte, String paramString3, int paramInt1, int paramInt2)
  {
    GMTrace.i(14807973494784L, 110328);
    this.jbg = new v();
    this.jbh = new com.tencent.mm.plugin.backup.h.w();
    this.jbm = false;
    com.tencent.mm.sdk.platformtools.w.i("MicroMsg.BakOldAuthScene", "summerbak init id:%s,  hello:%s, ok:%s, stack[%s]", new Object[] { paramString3, paramString1, paramString2, bg.bQW() });
    this.jbg.jgP = new com.tencent.mm.bm.b(k.b(paramString1.getBytes(), paramArrayOfByte));
    this.jbg.jhZ = 0;
    this.jbg.ID = paramString3;
    this.jbg.jia = paramInt1;
    this.jeH = paramString2;
    this.jeI = paramString3;
    this.key = paramArrayOfByte;
    this.iVq = paramInt2;
    GMTrace.o(14807973494784L, 110328);
  }
  
  private void kG(int paramInt)
  {
    GMTrace.i(14808644583424L, 110333);
    if (this.iVq == -22) {
      com.tencent.mm.plugin.backup.bakoldlogic.bakoldmovemodel.a.afV().afY().kF(paramInt);
    }
    GMTrace.o(14808644583424L, 110333);
  }
  
  public final com.tencent.mm.bm.a afr()
  {
    GMTrace.i(14808241930240L, 110330);
    com.tencent.mm.plugin.backup.h.w localw = this.jbh;
    GMTrace.o(14808241930240L, 110330);
    return localw;
  }
  
  public final com.tencent.mm.bm.a afs()
  {
    GMTrace.i(14808376147968L, 110331);
    v localv = this.jbg;
    GMTrace.o(14808376147968L, 110331);
    return localv;
  }
  
  public final void aft()
  {
    GMTrace.i(14808510365696L, 110332);
    if (this.jbh.jhA == 0)
    {
      if (this.jeI.equals(this.jbh.ID))
      {
        String str = new String(k.a(this.jbh.jgP.tJp, this.key));
        if (str.length() != this.jeH.length()) {}
        for (boolean bool = false;; bool = str.equals(this.jeH))
        {
          this.jbm = bool;
          com.tencent.mm.sdk.platformtools.w.i("MicroMsg.BakOldAuthScene", "check ok result:%b", new Object[] { Boolean.valueOf(this.jbm) });
          if (!this.jbm) {
            break;
          }
          f(0, 0, "auth ok");
          this.jbg.jgP = new com.tencent.mm.bm.b(k.b(this.jeH.getBytes(), this.key));
          this.jbg.jhZ = 1;
          this.jbg.ID = this.jeI;
          df(true);
          GMTrace.o(14808510365696L, 110332);
          return;
        }
        com.tencent.mm.sdk.platformtools.w.e("MicroMsg.BakOldAuthScene", "check ok failed");
        kG(30050002);
        f(4, 1, "not ok packet");
        GMTrace.o(14808510365696L, 110332);
        return;
      }
      com.tencent.mm.sdk.platformtools.w.e("MicroMsg.BakOldAuthScene", "not the same id");
      kG(30050028);
      f(4, -1, "not the same id");
      GMTrace.o(14808510365696L, 110332);
      return;
    }
    com.tencent.mm.sdk.platformtools.w.e("MicroMsg.BakOldAuthScene", "errType %d", new Object[] { Integer.valueOf(this.jbh.jhA) });
    kG(30050002);
    f(4, this.jbh.jhA, "not not success");
    GMTrace.o(14808510365696L, 110332);
  }
  
  public final int getType()
  {
    GMTrace.i(14808107712512L, 110329);
    GMTrace.o(14808107712512L, 110329);
    return 1;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\plugin\backup\bakoldlogic\b\a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */