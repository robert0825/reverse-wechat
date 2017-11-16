package com.tencent.mm.plugin.backup.f;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.a.k;
import com.tencent.mm.plugin.backup.a.c;
import com.tencent.mm.plugin.backup.h.v;
import com.tencent.mm.sdk.platformtools.bg;

public final class a
  extends b
{
  private v jbg;
  public com.tencent.mm.plugin.backup.h.w jbh;
  final int jbi;
  final String jbj;
  final byte[] jbk;
  final String jbl;
  private boolean jbm;
  
  public a(String paramString1, String paramString2, byte[] paramArrayOfByte, String paramString3, int paramInt1, int paramInt2)
  {
    GMTrace.i(9502883577856L, 70802);
    this.jbg = new v();
    this.jbh = new com.tencent.mm.plugin.backup.h.w();
    this.jbm = false;
    com.tencent.mm.sdk.platformtools.w.i("MicroMsg.BackupAuthScene", "summerbak BackupAuthScene init, backupType[%d], stack:%s", new Object[] { Integer.valueOf(paramInt2), bg.bQW() });
    this.jbg.jgP = new com.tencent.mm.bm.b(k.b(paramString1.getBytes(), paramArrayOfByte));
    this.jbg.jhZ = 0;
    this.jbg.ID = paramString3;
    this.jbg.jia = paramInt1;
    this.jbj = paramString2;
    this.jbl = paramString3;
    this.jbk = paramArrayOfByte;
    this.jbi = paramInt2;
    GMTrace.o(9502883577856L, 70802);
  }
  
  public final com.tencent.mm.bm.a afr()
  {
    GMTrace.i(9503152013312L, 70804);
    com.tencent.mm.plugin.backup.h.w localw = this.jbh;
    GMTrace.o(9503152013312L, 70804);
    return localw;
  }
  
  public final com.tencent.mm.bm.a afs()
  {
    GMTrace.i(9503286231040L, 70805);
    v localv = this.jbg;
    GMTrace.o(9503286231040L, 70805);
    return localv;
  }
  
  public final void aft()
  {
    GMTrace.i(9503420448768L, 70806);
    if (this.jbh.jhA != 0)
    {
      com.tencent.mm.sdk.platformtools.w.e("MicroMsg.BackupAuthScene", "onSceneEnd errType[%d]", new Object[] { Integer.valueOf(this.jbh.jhA) });
      f(4, this.jbh.jhA, "onSceneEnd status failed");
      GMTrace.o(9503420448768L, 70806);
      return;
    }
    if (!this.jbl.equals(this.jbh.ID))
    {
      com.tencent.mm.sdk.platformtools.w.e("MicroMsg.BackupAuthScene", "onSceneEnd not the same id");
      f(4, -1, "onSceneEnd not the same id");
      GMTrace.o(9503420448768L, 70806);
      return;
    }
    String str = new String(k.a(this.jbh.jgP.tJp, this.jbk));
    if (str.length() != this.jbj.length()) {}
    for (boolean bool = false;; bool = str.equals(this.jbj))
    {
      this.jbm = bool;
      com.tencent.mm.sdk.platformtools.w.i("MicroMsg.BackupAuthScene", "onSceneEnd check ok result[%b]", new Object[] { Boolean.valueOf(this.jbm) });
      if (this.jbm) {
        break;
      }
      com.tencent.mm.sdk.platformtools.w.e("MicroMsg.BackupAuthScene", "onSceneEnd check ok failed");
      f(4, -3, "onSceneEnd check ok failed");
      GMTrace.o(9503420448768L, 70806);
      return;
    }
    f(0, 0, "onSceneEnd auth success");
    this.jbg.jgP = new com.tencent.mm.bm.b(k.b(this.jbj.getBytes(), this.jbk));
    this.jbg.jhZ = 1;
    this.jbg.ID = this.jbl;
    df(true);
    GMTrace.o(9503420448768L, 70806);
  }
  
  public final boolean afu()
  {
    GMTrace.i(9503554666496L, 70807);
    if ((this.jbh.jic & c.iVd) == 0)
    {
      GMTrace.o(9503554666496L, 70807);
      return false;
    }
    GMTrace.o(9503554666496L, 70807);
    return true;
  }
  
  public final void de(boolean paramBoolean)
  {
    GMTrace.i(18462453792768L, 137556);
    if (paramBoolean)
    {
      localv = this.jbg;
      localv.jic |= c.iVd;
    }
    v localv = this.jbg;
    localv.jic |= c.iVe;
    localv = this.jbg;
    localv.jic |= c.iVf;
    GMTrace.o(18462453792768L, 137556);
  }
  
  public final int getType()
  {
    GMTrace.i(9503017795584L, 70803);
    GMTrace.o(9503017795584L, 70803);
    return 1;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\plugin\backup\f\a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */