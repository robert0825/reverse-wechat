package com.tencent.mm.plugin.backup.bakoldlogic.bakoldmovemodel;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.a.e;
import com.tencent.mm.ad.f;
import com.tencent.mm.bm.a;
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

public final class h
  extends com.tencent.mm.plugin.backup.f.b
{
  private static int progress;
  private String filePath;
  private int gsL;
  x jbv;
  private y jbw;
  private f jev;
  private byte[] jew;
  private int offset;
  private int start;
  private int type;
  
  public h(String paramString1, int paramInt, LinkedList<ek> paramLinkedList, String paramString2, f paramf)
  {
    GMTrace.i(14754017968128L, 109926);
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
        GMTrace.o(14754017968128L, 109926);
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
    GMTrace.i(14754152185856L, 109927);
    w.i("MicroMsg.BakSceneDataPush", "setProgress %d", new Object[] { Integer.valueOf(paramInt) });
    progress = paramInt;
    GMTrace.o(14754152185856L, 109927);
  }
  
  public final a afr()
  {
    GMTrace.i(14754420621312L, 109929);
    y localy = this.jbw;
    GMTrace.o(14754420621312L, 109929);
    return localy;
  }
  
  public final a afs()
  {
    GMTrace.i(14754554839040L, 109930);
    x localx = this.jbv;
    GMTrace.o(14754554839040L, 109930);
    return localx;
  }
  
  public final void aft()
  {
    GMTrace.i(14754689056768L, 109931);
    w.i("MicroMsg.BakSceneDataPush", "onSceneEnd id:%s, type:%d, s:%d, e:%d, status:%d", new Object[] { this.jbw.jie, Integer.valueOf(this.jbw.jif), Integer.valueOf(this.jbw.jih), Integer.valueOf(this.jbw.jii), Integer.valueOf(this.jbw.jhA) });
    if (this.jbw.jhA != 0)
    {
      w.e("MicroMsg.BakSceneDataPush", "status:%d", new Object[] { Integer.valueOf(this.jbw.jhA) });
      f(4, this.jbw.jhA, "error");
      GMTrace.o(14754689056768L, 109931);
      return;
    }
    this.jev.a(this.jbv.jii - this.jbv.jih, this.gsL, this);
    if (this.offset == this.gsL)
    {
      w.i("MicroMsg.BakSceneDataPush", "back complete: %s,  %d", new Object[] { this.jbv.jie, Integer.valueOf(this.gsL) });
      f(0, 0, "success");
      GMTrace.o(14754689056768L, 109931);
      return;
    }
    afx();
    GMTrace.o(14754689056768L, 109931);
  }
  
  public final boolean afx()
  {
    GMTrace.i(14754286403584L, 109928);
    int i;
    Object localObject1;
    if (this.type == 1)
    {
      i = this.gsL;
      localObject1 = this.jew;
    }
    for (;;)
    {
      this.start = this.offset;
      this.offset = (i + this.start);
      this.jbv.jih = this.start;
      Object localObject2 = this.jbv;
      int j = this.start;
      if (localObject1 == null) {}
      int k;
      for (i = 0;; i = localObject1.length)
      {
        ((x)localObject2).jii = (i + j);
        this.jbv.jgP = new com.tencent.mm.bm.b((byte[])localObject1);
        this.jbv.jik = progress;
        w.i("MicroMsg.BakSceneDataPush", "doSecne %s---total:%d, start:%d, offset:%d, data.len:%d", new Object[] { this.jbv.jie, Integer.valueOf(this.gsL), Integer.valueOf(this.start), Integer.valueOf(this.offset), Integer.valueOf(localObject1.length) });
        boolean bool = super.afx();
        GMTrace.o(14754286403584L, 109928);
        return bool;
        long l;
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
            break label436;
          }
          if (!bg.nm(this.filePath))
          {
            localObject1 = this.filePath;
            at.AR();
            if (((String)localObject1).startsWith(com.tencent.mm.y.c.zb()))
            {
              localObject1 = this.filePath.substring(this.filePath.lastIndexOf("/") + 1);
              w.i("MicroMsg.BakSceneDataPush", "md5:%s", new Object[] { localObject1 });
              localObject1 = ((com.tencent.mm.plugin.emoji.b.c)com.tencent.mm.kernel.h.j(com.tencent.mm.plugin.emoji.b.c.class)).getEmojiMgr().vP((String)localObject1);
              if ((localObject1 != null) && ((((EmojiInfo)localObject1).field_reserved4 & EmojiInfo.vCJ) == EmojiInfo.vCJ))
              {
                localObject2 = ((com.tencent.mm.plugin.emoji.b.c)com.tencent.mm.kernel.h.j(com.tencent.mm.plugin.emoji.b.c.class)).getEmojiMgr().a((EmojiInfo)localObject1);
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
        label436:
        if (localObject1 != null) {
          break label487;
        }
        w.e("MicroMsg.BakSceneDataPush", "read file error, offset%d, len:%d", new Object[] { Integer.valueOf(this.offset), Integer.valueOf(k) });
        localObject1 = new byte[0];
        i = k;
        break;
      }
      label487:
      i = k;
    }
  }
  
  public final int getType()
  {
    GMTrace.i(14754823274496L, 109932);
    GMTrace.o(14754823274496L, 109932);
    return 6;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\plugin\backup\bakoldlogic\bakoldmovemodel\h.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */