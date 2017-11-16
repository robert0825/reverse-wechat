package com.tencent.mm.plugin.backup.bakoldlogic.c;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.a.e;
import com.tencent.mm.ad.f;
import com.tencent.mm.bm.a;
import com.tencent.mm.jniinterface.AesEcb;
import com.tencent.mm.kernel.h;
import com.tencent.mm.plugin.backup.h.x;
import com.tencent.mm.plugin.backup.h.y;
import com.tencent.mm.pluginsdk.c.d;
import com.tencent.mm.protocal.c.ek;
import com.tencent.mm.protocal.c.el;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.storage.emotion.EmojiInfo;
import com.tencent.mm.y.at;
import java.io.IOException;
import java.util.LinkedList;

public final class b
  extends com.tencent.mm.plugin.backup.f.b
{
  private static int progress;
  private String filePath;
  private int gsL;
  public x jbv;
  private y jbw;
  private f jev;
  private byte[] jew;
  private byte[] key;
  private int offset;
  private int start;
  private int type;
  
  public b(String paramString1, int paramInt, LinkedList<ek> paramLinkedList, String paramString2, f paramf, byte[] paramArrayOfByte)
  {
    GMTrace.i(14737509187584L, 109803);
    this.jbv = new x();
    this.jbw = new y();
    this.jev = null;
    this.start = 0;
    this.offset = 0;
    this.gsL = 0;
    this.jbv.jie = paramString1;
    this.jbv.jif = paramInt;
    this.type = paramInt;
    if (paramInt == 1)
    {
      paramString1 = new el();
      paramString1.jhd = paramLinkedList;
      paramString1.jhc = paramLinkedList.size();
    }
    for (;;)
    {
      try
      {
        this.jew = paramString1.toByteArray();
        this.gsL = this.jew.length;
        paramInt = this.gsL;
        this.jbv.jig = (16 - paramInt % 16 + this.gsL);
        w.i("MicroMsg.BakSceneDataPush", "BakSceneDataPush init:%s  type:%d, localTotalLen:%d, reqDataSize:%d", new Object[] { this.jbv.jie, Integer.valueOf(this.jbv.jif), Integer.valueOf(this.gsL), Integer.valueOf(this.jbv.jig) });
        this.jev = paramf;
        this.key = paramArrayOfByte;
        GMTrace.o(14737509187584L, 109803);
        return;
      }
      catch (IOException paramString1)
      {
        w.e("MicroMsg.BakSceneDataPush", "backList to buffer error");
        w.printErrStackTrace("MicroMsg.BakSceneDataPush", paramString1, "", new Object[0]);
        continue;
      }
      this.filePath = paramString2;
      this.gsL = e.aY(paramString2);
    }
  }
  
  public static void setProgress(int paramInt)
  {
    GMTrace.i(14737643405312L, 109804);
    w.i("MicroMsg.BakSceneDataPush", "setProgress %d", new Object[] { Integer.valueOf(paramInt) });
    progress = paramInt;
    GMTrace.o(14737643405312L, 109804);
  }
  
  public final a afr()
  {
    GMTrace.i(14737911840768L, 109806);
    y localy = this.jbw;
    GMTrace.o(14737911840768L, 109806);
    return localy;
  }
  
  public final a afs()
  {
    GMTrace.i(14738046058496L, 109807);
    x localx = this.jbv;
    GMTrace.o(14738046058496L, 109807);
    return localx;
  }
  
  public final void aft()
  {
    GMTrace.i(14738180276224L, 109808);
    w.i("MicroMsg.BakSceneDataPush", "onSceneEnd id:%s, type:%d, s:%d, e:%d, status:%d", new Object[] { this.jbw.jie, Integer.valueOf(this.jbw.jif), Integer.valueOf(this.jbw.jih), Integer.valueOf(this.jbw.jii), Integer.valueOf(this.jbw.jhA) });
    if (this.jbw.jhA != 0)
    {
      w.e("MicroMsg.BakSceneDataPush", "status:%d", new Object[] { Integer.valueOf(this.jbw.jhA) });
      f(4, this.jbw.jhA, "error");
      GMTrace.o(14738180276224L, 109808);
      return;
    }
    this.jev.a(this.jbv.jii - this.jbv.jih, this.gsL, this);
    if (this.offset == this.gsL)
    {
      w.i("MicroMsg.BakSceneDataPush", "back complete: %s,  %d", new Object[] { this.jbv.jie, Integer.valueOf(this.gsL) });
      f(0, 0, "success");
      GMTrace.o(14738180276224L, 109808);
      return;
    }
    afx();
    GMTrace.o(14738180276224L, 109808);
  }
  
  public final boolean afx()
  {
    GMTrace.i(14737777623040L, 109805);
    Object localObject1;
    Object localObject2;
    boolean bool;
    label76:
    int j;
    if (this.type == 1)
    {
      i = this.gsL;
      localObject1 = this.jew;
      this.start = this.offset;
      this.offset = (i + this.start);
      localObject2 = localObject1;
      if (this.key != null)
      {
        localObject2 = this.key;
        if (this.offset != this.gsL) {
          break label524;
        }
        bool = true;
        localObject2 = AesEcb.aesCryptEcb((byte[])localObject1, (byte[])localObject2, true, bool);
      }
      this.jbv.jih = this.start;
      localObject1 = this.jbv;
      j = this.start;
      if (localObject2 != null) {
        break label530;
      }
    }
    label485:
    label524:
    label530:
    for (int i = 0;; i = localObject2.length)
    {
      ((x)localObject1).jii = (i + j);
      this.jbv.jgP = new com.tencent.mm.bm.b((byte[])localObject2);
      this.jbv.jik = progress;
      w.i("MicroMsg.BakSceneDataPush", "doSecne %s---total:%d, start:%d, offset:%d, data.len:%d", new Object[] { this.jbv.jie, Integer.valueOf(this.gsL), Integer.valueOf(this.start), Integer.valueOf(this.offset), Integer.valueOf(this.jbv.jii) });
      bool = super.afx();
      GMTrace.o(14737777623040L, 109805);
      return bool;
      long l;
      int k;
      if (this.gsL - this.offset > 524288L)
      {
        l = 524288L;
        k = (int)l;
        localObject1 = null;
        i = 3;
      }
      for (;;)
      {
        j = i - 1;
        if ((i <= 0) || (localObject1 != null)) {
          break label485;
        }
        if (!bg.nm(this.filePath))
        {
          localObject1 = this.filePath;
          at.AR();
          if (((String)localObject1).startsWith(com.tencent.mm.y.c.zb()))
          {
            localObject1 = this.filePath.substring(this.filePath.lastIndexOf("/") + 1);
            w.i("MicroMsg.BakSceneDataPush", "md5:%s", new Object[] { localObject1 });
            localObject1 = ((com.tencent.mm.plugin.emoji.b.c)h.j(com.tencent.mm.plugin.emoji.b.c.class)).getEmojiMgr().vP((String)localObject1);
            if ((localObject1 != null) && ((((EmojiInfo)localObject1).field_reserved4 & EmojiInfo.vCJ) == EmojiInfo.vCJ))
            {
              localObject2 = ((com.tencent.mm.plugin.emoji.b.c)h.j(com.tencent.mm.plugin.emoji.b.c.class)).getEmojiMgr().a((EmojiInfo)localObject1);
              localObject1 = new byte[k];
              System.arraycopy(localObject2, this.offset, localObject1, 0, k);
              i = j;
              continue;
              l = this.gsL - this.offset;
              break;
            }
            localObject1 = e.c(this.filePath, this.offset, k);
            i = j;
            continue;
          }
        }
        localObject1 = e.c(this.filePath, this.offset, k);
        i = j;
      }
      if (localObject1 == null) {
        w.e("MicroMsg.BakSceneDataPush", "read file error, offset%d, len:%d", new Object[] { Integer.valueOf(this.offset), Integer.valueOf(k) });
      }
      i = k;
      break;
      bool = false;
      break label76;
    }
  }
  
  public final int getType()
  {
    GMTrace.i(14738314493952L, 109809);
    GMTrace.o(14738314493952L, 109809);
    return 5;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\plugin\backup\bakoldlogic\c\b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */