package com.tencent.mm.plugin.emoji.f;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.ad.b.a;
import com.tencent.mm.ad.b.b;
import com.tencent.mm.ad.b.c;
import com.tencent.mm.ad.k.b;
import com.tencent.mm.g.a.cq;
import com.tencent.mm.network.q;
import com.tencent.mm.plugin.emoji.e.l;
import com.tencent.mm.plugin.emoji.model.h;
import com.tencent.mm.protocal.c.blk;
import com.tencent.mm.protocal.c.bll;
import com.tencent.mm.protocal.c.es;
import com.tencent.mm.protocal.c.qt;
import com.tencent.mm.protocal.c.qu;
import com.tencent.mm.sdk.b.a;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.storage.emotion.EmojiInfo;
import com.tencent.mm.storage.emotion.d;
import java.util.LinkedList;

public final class f
  extends com.tencent.mm.ad.k
  implements com.tencent.mm.network.k
{
  private EmojiInfo eCa;
  private final com.tencent.mm.ad.b fUa;
  private com.tencent.mm.ad.e fUd;
  private boolean kls;
  
  public f(EmojiInfo paramEmojiInfo)
  {
    GMTrace.i(11298179907584L, 84178);
    this.kls = true;
    this.eCa = paramEmojiInfo;
    paramEmojiInfo = new b.a();
    paramEmojiInfo.gtF = new qt();
    paramEmojiInfo.gtG = new qu();
    paramEmojiInfo.uri = "/cgi-bin/micromsg-bin/mmemojiupload";
    paramEmojiInfo.gtE = 703;
    paramEmojiInfo.gtH = 0;
    paramEmojiInfo.gtI = 0;
    this.fUa = paramEmojiInfo.DA();
    paramEmojiInfo = (qt)this.fUa.gtC.gtK;
    blk localblk = new blk();
    if (this.eCa != null)
    {
      h.arl().kjy.a(ab.getContext(), this.eCa);
      localblk.ugH = this.eCa.GS();
      localblk.tRC = this.eCa.field_size;
      paramEmojiInfo.ugO.add(localblk);
    }
    GMTrace.o(11298179907584L, 84178);
  }
  
  private void arv()
  {
    GMTrace.i(11298985213952L, 84184);
    this.eCa.field_start = 0;
    h.arl().kjy.p(this.eCa);
    GMTrace.o(11298985213952L, 84184);
  }
  
  private static void d(EmojiInfo paramEmojiInfo, boolean paramBoolean)
  {
    GMTrace.i(11299119431680L, 84185);
    if ((paramEmojiInfo != null) && (!bg.nm(paramEmojiInfo.GS())))
    {
      w.i("MicroMsg.emoji.NetSceneEmojiUpload", "[cpan] publicEmojiSyncTaskEvent emoji md5:%s success:%b", new Object[] { paramEmojiInfo.GS(), Boolean.valueOf(paramBoolean) });
      cq localcq = new cq();
      localcq.eDV.eDW = paramEmojiInfo.GS();
      localcq.eDV.eCx = 0;
      localcq.eDV.success = paramBoolean;
      a.vgX.m(localcq);
    }
    GMTrace.o(11299119431680L, 84185);
  }
  
  public final int a(com.tencent.mm.network.e parame, com.tencent.mm.ad.e parame1)
  {
    GMTrace.i(11298448343040L, 84180);
    this.fUd = parame1;
    blk localblk = (blk)((qt)this.fUa.gtC.gtK).ugO.get(0);
    byte[] arrayOfByte;
    if (this.kls)
    {
      w.d("MicroMsg.emoji.NetSceneEmojiUpload", "dispatcher, firstSend. md5=" + localblk.ugH);
      localblk.tRD = 0;
      j = this.eCa.field_size + 0;
      i = j;
      if (j > 8192) {
        i = 8192;
      }
      if ((this.eCa.field_reserved4 & EmojiInfo.vCJ) == EmojiInfo.vCJ)
      {
        arrayOfByte = com.tencent.mm.plugin.emoji.e.e.aqw().a(this.eCa);
        if (!bg.bq(arrayOfByte))
        {
          parame1 = new byte[i];
          w.d("MicroMsg.emoji.NetSceneEmojiUpload", "total length:%d dataLen:%d ", new Object[] { Integer.valueOf(arrayOfByte.length), Integer.valueOf(i) });
          System.arraycopy(arrayOfByte, 0, parame1, 0, i);
        }
      }
      while ((parame1 == null) || (parame1.length <= 0))
      {
        w.e("MicroMsg.emoji.NetSceneEmojiUpload", "readFromFile is null.");
        GMTrace.o(11298448343040L, 84180);
        return -1;
        w.w("MicroMsg.emoji.NetSceneEmojiUpload", "buffer is null.");
        parame1 = new byte[0];
        continue;
        parame1 = this.eCa.ee(0, i);
      }
      localblk.tRD = 0;
      localblk.uVz = new com.tencent.mm.bm.b(parame1);
      int k = parame1.length;
      int m = localblk.uVz.tJp.length;
      if (this.eCa == null)
      {
        i = -1;
        if (this.eCa != null) {
          break label362;
        }
      }
      label362:
      for (j = -1;; j = this.eCa.field_size)
      {
        w.i("MicroMsg.emoji.NetSceneEmojiUpload", "buf len:%d, string len:%d dispatcher, first emoji start:%d emoji total:%d", new Object[] { Integer.valueOf(k), Integer.valueOf(m), Integer.valueOf(i), Integer.valueOf(j) });
        i = a(parame, this.fUa, this);
        GMTrace.o(11298448343040L, 84180);
        return i;
        i = this.eCa.field_start;
        break;
      }
    }
    if ((this.eCa == null) || (this.eCa.field_start == 0))
    {
      w.e("MicroMsg.emoji.NetSceneEmojiUpload", "emoji info is null. or start position is 0.");
      GMTrace.o(11298448343040L, 84180);
      return -1;
    }
    int j = this.eCa.field_size - this.eCa.field_start;
    int i = j;
    if (j > 8192) {
      i = 8192;
    }
    if ((this.eCa.field_reserved4 & EmojiInfo.vCJ) == EmojiInfo.vCJ)
    {
      arrayOfByte = com.tencent.mm.plugin.emoji.e.e.aqw().a(this.eCa);
      if (!bg.bq(arrayOfByte))
      {
        parame1 = new byte[i];
        w.d("MicroMsg.emoji.NetSceneEmojiUpload", "total length:%d dataLen:%d", new Object[] { Integer.valueOf(arrayOfByte.length), Integer.valueOf(i) });
        System.arraycopy(arrayOfByte, this.eCa.field_start, parame1, 0, i);
      }
    }
    while ((parame1 == null) || (parame1.length <= 0))
    {
      w.e("MicroMsg.emoji.NetSceneEmojiUpload", "readFromFile is null.");
      GMTrace.o(11298448343040L, 84180);
      return -1;
      w.w("MicroMsg.emoji.NetSceneEmojiUpload", "buffer is null.");
      parame1 = new byte[0];
      continue;
      parame1 = this.eCa.ee(this.eCa.field_start, i);
    }
    i = parame1.length;
    localblk.tRD = this.eCa.field_start;
    localblk.uVz = new com.tencent.mm.bm.b(parame1);
    w.i("MicroMsg.emoji.NetSceneEmojiUpload", "buf len:%d, string len:%d", new Object[] { Integer.valueOf(parame1.length), Integer.valueOf(localblk.uVz.tJp.length) });
    w.d("MicroMsg.emoji.NetSceneEmojiUpload", "dispatcher, start:" + this.eCa.field_start + ", total:" + this.eCa.field_size + ", len:" + i);
    i = a(parame, this.fUa, this);
    GMTrace.o(11298448343040L, 84180);
    return i;
  }
  
  protected final int a(q paramq)
  {
    GMTrace.i(11298850996224L, 84183);
    int i = k.b.gum;
    GMTrace.o(11298850996224L, 84183);
    return i;
  }
  
  public final void a(int paramInt1, int paramInt2, int paramInt3, String paramString, q paramq, byte[] paramArrayOfByte)
  {
    GMTrace.i(11298582560768L, 84181);
    w.i("MicroMsg.emoji.NetSceneEmojiUpload", "onGYNetEnd  errtype:" + paramInt2 + " errcode:" + paramInt3);
    if ((paramInt2 != 0) || (paramInt3 != 0))
    {
      arv();
      this.fUd.a(paramInt2, paramInt3, paramString, this);
      d(this.eCa, false);
      GMTrace.o(11298582560768L, 84181);
      return;
    }
    qt localqt = (qt)((com.tencent.mm.ad.b)paramq).gtC.gtK;
    paramArrayOfByte = (qu)((com.tencent.mm.ad.b)paramq).gtD.gtK;
    if (localqt.ugO.size() != paramArrayOfByte.ugO.size())
    {
      w.e("MicroMsg.emoji.NetSceneEmojiUpload", "onGYNetEnd failed. RequestSize not equal RespSize. req size:" + localqt.ugO.size() + ", resp size:" + paramArrayOfByte.ugO.size());
      arv();
      this.fUd.a(paramInt2, paramInt3, paramString, this);
      d(this.eCa, false);
      GMTrace.o(11298582560768L, 84181);
      return;
    }
    paramq = null;
    paramString = paramq;
    if (paramArrayOfByte.ugO != null)
    {
      paramString = paramq;
      if (paramArrayOfByte.ugO.size() > 0) {
        paramString = (bll)paramArrayOfByte.ugO.get(0);
      }
    }
    int i;
    if ((paramString == null) || (paramString.ugH == null) || (!paramString.ugH.equals(this.eCa.GS())) || (paramString.tRD < this.eCa.field_start))
    {
      paramq = paramString.ugH;
      i = paramString.tRC;
      if (paramString == null)
      {
        paramInt1 = -1;
        if (this.eCa != null) {
          break label440;
        }
        paramInt2 = -1;
        label338:
        if (this.eCa != null) {
          break label451;
        }
      }
      label440:
      label451:
      for (paramInt3 = -1;; paramInt3 = this.eCa.field_size)
      {
        w.e("MicroMsg.emoji.NetSceneEmojiUpload", "md5:%s invalid server return value. respInfo.TotalLen:%d respInfo.StartPos:%d emoji.getStart():%d emoji total:%d", new Object[] { paramq, Integer.valueOf(i), Integer.valueOf(paramInt1), Integer.valueOf(paramInt2), Integer.valueOf(paramInt3) });
        arv();
        this.fUd.a(4, -2, "", this);
        d(this.eCa, false);
        GMTrace.o(11298582560768L, 84181);
        return;
        paramInt1 = paramString.tRD;
        break;
        paramInt2 = this.eCa.field_start;
        break label338;
      }
    }
    if ((paramString != null) && (this.eCa != null) && (paramString.tST != 0) && (paramString.tRD == paramString.tRC) && (paramString.tRD > 0))
    {
      w.i("MicroMsg.emoji.NetSceneEmojiUpload", "[cpan] emoji upload success, but md5 backup faild.try to do batch emoji backup. %s respInfo.Ret:%d respInfo.StartPos:%d respInfo.TotalLen:%d", new Object[] { this.eCa.GS(), Integer.valueOf(paramString.tST), Integer.valueOf(paramString.tRD), Integer.valueOf(paramString.tRC) });
      arv();
      this.fUd.a(paramInt2, paramInt3, "", this);
      GMTrace.o(11298582560768L, 84181);
      return;
    }
    if ((paramArrayOfByte.uND.tST != 0) || ((paramString != null) && (paramString.tST != 0)))
    {
      i = paramArrayOfByte.uND.tST;
      if (paramString == null) {}
      for (paramInt1 = -1;; paramInt1 = paramString.tST)
      {
        w.e("MicroMsg.emoji.NetSceneEmojiUpload", "onGYNetEnd failed. resp.BaseResponse.Ret:%d respInfo.Ret:%d", new Object[] { Integer.valueOf(i), Integer.valueOf(paramInt1) });
        arv();
        this.fUd.a(paramInt2, paramInt3, "", this);
        GMTrace.o(11298582560768L, 84181);
        return;
      }
    }
    if (this.kls) {
      this.kls = false;
    }
    if (paramString.tRD >= paramString.tRC)
    {
      this.eCa.field_start = 0;
      this.eCa.field_state = EmojiInfo.vCC;
      this.eCa.field_needupload = EmojiInfo.vCH;
      h.arl().kjy.p(this.eCa);
      this.fUd.a(paramInt2, paramInt3, "", this);
      d(this.eCa, true);
      w.i("MicroMsg.emoji.NetSceneEmojiUpload", "[cpan] emoji upload success.");
      GMTrace.o(11298582560768L, 84181);
      return;
    }
    w.i("MicroMsg.emoji.NetSceneEmojiUpload", "next start pos is :%d", new Object[] { Integer.valueOf(paramString.tRD) });
    this.eCa.field_start = paramString.tRD;
    h.arl().kjy.p(this.eCa);
    if (a(this.gtW, this.fUd) < 0)
    {
      this.fUd.a(3, -1, "", this);
      d(this.eCa, false);
    }
    GMTrace.o(11298582560768L, 84181);
  }
  
  public final int getType()
  {
    GMTrace.i(11298314125312L, 84179);
    GMTrace.o(11298314125312L, 84179);
    return 703;
  }
  
  protected final int vB()
  {
    GMTrace.i(11298716778496L, 84182);
    GMTrace.o(11298716778496L, 84182);
    return 256;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\plugin\emoji\f\f.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */