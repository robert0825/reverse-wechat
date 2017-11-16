package com.tencent.mm.plugin.backup.bakoldlogic.c;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.a.e;
import com.tencent.mm.ad.f;
import com.tencent.mm.bm.a;
import com.tencent.mm.jniinterface.AesEcb;
import com.tencent.mm.plugin.backup.bakoldlogic.a.d;
import com.tencent.mm.plugin.backup.h.ad;
import com.tencent.mm.plugin.backup.h.ae;
import com.tencent.mm.sdk.platformtools.w;
import java.io.File;

public final class c
  extends com.tencent.mm.plugin.backup.f.b
{
  private static int progress;
  private int gsL;
  public String id;
  private f jev;
  private ad jgl;
  private ae jgm;
  private String jgn;
  private byte[] key;
  private int offset;
  private int start;
  
  public c(String paramString1, String paramString2, int paramInt1, int paramInt2, f paramf, byte[] paramArrayOfByte)
  {
    GMTrace.i(14738448711680L, 109810);
    this.jgl = new ad();
    this.jgm = new ae();
    this.jev = null;
    this.start = 0;
    this.offset = 0;
    if (paramInt1 == 1) {}
    for (this.jgn = (paramString1 + "backupItem/" + d.ti(paramString2));; this.jgn = (paramString1 + "backupMeida/" + d.ti(paramString2)))
    {
      this.id = paramString2;
      this.jgl.jie = paramString2;
      this.jgl.jif = paramInt1;
      this.gsL = paramInt2;
      w.i("MicroMsg.BakSceneRestoreData", "BakSceneRestoreData init, %s, type:%d, totalLen:%d", new Object[] { this.jgl.jie, Integer.valueOf(this.jgl.jif), Integer.valueOf(this.gsL) });
      this.jev = paramf;
      this.key = paramArrayOfByte;
      GMTrace.o(14738448711680L, 109810);
      return;
    }
  }
  
  public static void setProgress(int paramInt)
  {
    GMTrace.i(14738717147136L, 109812);
    w.i("MicroMsg.BakSceneRestoreData", "setProgress %d", new Object[] { Integer.valueOf(paramInt) });
    progress = paramInt;
    GMTrace.o(14738717147136L, 109812);
  }
  
  public final a afr()
  {
    GMTrace.i(14738851364864L, 109813);
    ae localae = this.jgm;
    GMTrace.o(14738851364864L, 109813);
    return localae;
  }
  
  public final a afs()
  {
    GMTrace.i(14738985582592L, 109814);
    ad localad = this.jgl;
    GMTrace.o(14738985582592L, 109814);
    return localad;
  }
  
  public final void aft()
  {
    GMTrace.i(14739119800320L, 109815);
    w.i("MicroMsg.BakSceneRestoreData", "onSceneEnd id:%s, type:%d, s:%d, e:%d, status:%d", new Object[] { this.jgm.jie, Integer.valueOf(this.jgm.jif), Integer.valueOf(this.jgm.jih), Integer.valueOf(this.jgm.jii), Integer.valueOf(this.jgm.jhA) });
    if ((this.jgm.jhA != 0) && (this.jgm.jhA != 10))
    {
      f(4, this.jgm.jhA, "error");
      GMTrace.o(14739119800320L, 109815);
      return;
    }
    if ((this.jgm.jih != this.start) || (this.jgm.jii != this.offset))
    {
      w.e("MicroMsg.BakSceneRestoreData", "err local:%d, %d;   server:%d,%d", new Object[] { Integer.valueOf(this.start), Integer.valueOf(this.offset), Integer.valueOf(this.jgm.jih), Integer.valueOf(this.jgm.jii) });
      f(3, -1, "error");
      GMTrace.o(14739119800320L, 109815);
      return;
    }
    this.jev.a(this.jgl.jii - this.jgl.jih, this.gsL, this);
    byte[] arrayOfByte = this.jgm.jgP.tJp;
    Object localObject;
    boolean bool;
    if (this.key != null)
    {
      localObject = this.key;
      if (this.offset == this.gsL)
      {
        bool = true;
        arrayOfByte = AesEcb.aesCryptEcb(arrayOfByte, (byte[])localObject, false, bool);
      }
    }
    for (;;)
    {
      localObject = this.jgn;
      String str = this.id;
      File localFile = new File((String)localObject + str);
      long l1;
      label361:
      long l2;
      if (localFile.exists())
      {
        l1 = localFile.length();
        e.a((String)localObject, str, arrayOfByte);
        localFile = new File((String)localObject + str);
        if (!localFile.exists()) {
          break label557;
        }
        l2 = localFile.length();
        label415:
        if (l1 == l2)
        {
          w.e("MicroMsg.BakSceneRestoreData", "append failed and try again:%s", new Object[] { (String)localObject + str });
          e.a((String)localObject, str, arrayOfByte);
        }
        if (arrayOfByte != null) {
          break label563;
        }
      }
      label557:
      label563:
      for (int i = 0;; i = arrayOfByte.length)
      {
        w.i("MicroMsg.BakSceneRestoreData", "onSceneEnd appendbuf len:%d", new Object[] { Integer.valueOf(i) });
        if (this.offset != this.gsL) {
          break label570;
        }
        w.i("MicroMsg.BakSceneRestoreData", "recover cmoplete:%s  %d", new Object[] { this.id, Integer.valueOf(this.gsL) });
        f(0, 0, "success");
        GMTrace.o(14739119800320L, 109815);
        return;
        bool = false;
        break;
        l1 = 0L;
        break label361;
        l2 = 0L;
        break label415;
      }
      label570:
      afx();
      GMTrace.o(14739119800320L, 109815);
      return;
    }
  }
  
  public final boolean afx()
  {
    long l = 524288L;
    GMTrace.i(14738582929408L, 109811);
    w.i("MicroMsg.BakSceneRestoreData", "doSecne");
    int i = this.gsL;
    if (this.jgl.jif == 2) {
      if (this.gsL - this.offset > 524288L) {
        i = (int)l;
      }
    }
    for (;;)
    {
      this.start = this.offset;
      this.offset = (i + this.start);
      this.jgl.jih = this.start;
      this.jgl.jii = this.offset;
      this.jgl.jik = progress;
      boolean bool = super.afx();
      GMTrace.o(14738582929408L, 109811);
      return bool;
      l = this.gsL - this.offset;
      break;
    }
  }
  
  public final int getType()
  {
    GMTrace.i(14739254018048L, 109816);
    GMTrace.o(14739254018048L, 109816);
    return 7;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\plugin\backup\bakoldlogic\c\c.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */