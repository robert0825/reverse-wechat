package com.tencent.mm.plugin.emoji.f;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.ad.b.a;
import com.tencent.mm.ad.b.b;
import com.tencent.mm.ad.b.c;
import com.tencent.mm.ad.k.b;
import com.tencent.mm.af.f;
import com.tencent.mm.g.b.ce;
import com.tencent.mm.network.q;
import com.tencent.mm.plugin.emoji.e.l;
import com.tencent.mm.plugin.emoji.model.EmojiLogic;
import com.tencent.mm.plugin.emoji.model.h;
import com.tencent.mm.protocal.c.azp;
import com.tencent.mm.protocal.c.blm;
import com.tencent.mm.protocal.c.bln;
import com.tencent.mm.protocal.c.es;
import com.tencent.mm.protocal.c.qr;
import com.tencent.mm.protocal.c.qs;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.storage.au;
import com.tencent.mm.storage.emotion.EmojiInfo;
import com.tencent.mm.storage.emotion.d;
import com.tencent.mm.x.g;
import com.tencent.mm.y.at;
import com.tencent.mm.y.be;
import java.util.LinkedList;
import junit.framework.Assert;

public final class r
  extends com.tencent.mm.ad.k
  implements com.tencent.mm.network.k
{
  private EmojiInfo eCa;
  private final com.tencent.mm.ad.b fUa;
  private com.tencent.mm.ad.e fUd;
  private long gGZ;
  private boolean kls;
  
  public r(String paramString1, String paramString2, EmojiInfo paramEmojiInfo, long paramLong)
  {
    this(paramString1, paramString2, paramEmojiInfo, paramLong, (byte)0);
    GMTrace.i(11286905618432L, 84094);
    GMTrace.o(11286905618432L, 84094);
  }
  
  private r(String paramString1, String paramString2, EmojiInfo paramEmojiInfo, long paramLong, byte paramByte)
  {
    GMTrace.i(11287039836160L, 84095);
    this.kls = true;
    this.gGZ = 0L;
    boolean bool;
    Object localObject;
    qr localqr;
    if ((paramString2 != null) && (paramString2.length() > 0) && (paramEmojiInfo != null))
    {
      bool = true;
      Assert.assertTrue(bool);
      this.gGZ = paramLong;
      this.eCa = paramEmojiInfo;
      localObject = new b.a();
      ((b.a)localObject).gtF = new blm();
      ((b.a)localObject).gtG = new bln();
      ((b.a)localObject).uri = "/cgi-bin/micromsg-bin/sendemoji";
      ((b.a)localObject).gtE = 175;
      ((b.a)localObject).gtH = 68;
      ((b.a)localObject).gtI = 1000000068;
      this.fUa = ((b.a)localObject).DA();
      h.arl().kjy.a(ab.getContext(), paramEmojiInfo);
      localObject = (blm)this.fUa.gtC.gtK;
      localqr = new qr();
      localqr.ugH = paramEmojiInfo.GS();
      localqr.ugL = paramString1;
      localqr.lSX = paramString2;
      localqr.tRC = paramEmojiInfo.field_size;
      localqr.ugJ = paramEmojiInfo.rc();
      localqr.jib = paramEmojiInfo.field_type;
      localqr.tQb = be.Br();
      localqr.ugM = 0;
      if (!paramString2.endsWith("@chatroom")) {
        break label312;
      }
      paramByte = 2;
      label241:
      if (paramEmojiInfo.field_catalog != EmojiInfo.vCt) {
        break label318;
      }
      localqr.ugK = ("56,2," + paramByte);
    }
    for (;;)
    {
      ((blm)localObject).ugO.add(localqr);
      ((blm)localObject).uVA = ((blm)localObject).ugO.size();
      GMTrace.o(11287039836160L, 84095);
      return;
      bool = false;
      break;
      label312:
      paramByte = 1;
      break label241;
      label318:
      if (paramEmojiInfo.field_catalog == EmojiInfo.vCs) {
        localqr.ugK = ("56,1," + paramByte);
      }
    }
  }
  
  public final int a(com.tencent.mm.network.e parame, com.tencent.mm.ad.e parame1)
  {
    GMTrace.i(11287308271616L, 84097);
    this.fUd = parame1;
    qr localqr = (qr)((blm)this.fUa.gtC.gtK).ugO.get(0);
    if (this.kls)
    {
      w.d("MicroMsg.emoji.NetSceneUploadEmoji", "dispatcher, firstSend. md5=" + localqr.ugH);
      localqr.ugI = new azp();
      localqr.tRD = 0;
      i = a(parame, this.fUa, this);
      GMTrace.o(11287308271616L, 84097);
      return i;
    }
    int j = this.eCa.field_size - this.eCa.field_start;
    int i = j;
    if (j > 8192) {
      i = 8192;
    }
    if ((this.eCa.field_reserved4 & EmojiInfo.vCJ) == EmojiInfo.vCJ)
    {
      byte[] arrayOfByte = com.tencent.mm.plugin.emoji.e.e.aqw().a(this.eCa);
      if (!bg.bq(arrayOfByte))
      {
        parame1 = new byte[i];
        w.d("MicroMsg.emoji.NetSceneUploadEmoji", "total length:%d dataLen:%d", new Object[] { Integer.valueOf(arrayOfByte.length), Integer.valueOf(i) });
        System.arraycopy(arrayOfByte, this.eCa.field_start, parame1, 0, i);
      }
    }
    while ((EmojiLogic.af(parame1) == EmojiInfo.vCk) && (this.kls))
    {
      w.e("MicroMsg.emoji.NetSceneUploadEmoji", "Bitmap type error. delete emoji file.");
      this.eCa.bUO();
      GMTrace.o(11287308271616L, 84097);
      return -1;
      w.w("MicroMsg.emoji.NetSceneUploadEmoji", "buffer is null.");
      parame1 = new byte[0];
      continue;
      parame1 = this.eCa.ee(this.eCa.field_start, i);
    }
    if ((parame1 == null) || (parame1.length <= 0))
    {
      w.e("MicroMsg.emoji.NetSceneUploadEmoji", "readFromFile is null.");
      GMTrace.o(11287308271616L, 84097);
      return -1;
    }
    i = parame1.length;
    localqr.tRD = this.eCa.field_start;
    localqr.ugI = new azp().b(com.tencent.mm.bm.b.aX(parame1));
    if (f.dL(localqr.lSX))
    {
      at.AR();
      localqr.tQb = com.tencent.mm.af.a.e.jj(com.tencent.mm.y.c.yM().cM(this.gGZ).fwv);
      w.d("MicroMsg.emoji.NetSceneUploadEmoji", "MsgSource:%s", new Object[] { localqr.tQb });
    }
    w.d("MicroMsg.emoji.NetSceneUploadEmoji", "dispatcher, start:" + this.eCa.field_start + ", total:" + this.eCa.field_size + ", len:" + i);
    i = a(parame, this.fUa, this);
    GMTrace.o(11287308271616L, 84097);
    return i;
  }
  
  protected final int a(q paramq)
  {
    GMTrace.i(11287710924800L, 84100);
    int i = k.b.gum;
    GMTrace.o(11287710924800L, 84100);
    return i;
  }
  
  public final void a(int paramInt1, int paramInt2, int paramInt3, String paramString, q paramq, byte[] paramArrayOfByte)
  {
    GMTrace.i(11287442489344L, 84098);
    if ((paramInt2 != 0) || (paramInt3 != 0))
    {
      w.e("MicroMsg.emoji.NetSceneUploadEmoji", "onGYNetEnd failed errtype:" + paramInt2 + " errcode:" + paramInt3);
      this.fUd.a(paramInt2, paramInt3, paramString, this);
      GMTrace.o(11287442489344L, 84098);
      return;
    }
    paramArrayOfByte = (blm)((com.tencent.mm.ad.b)paramq).gtC.gtK;
    paramq = (bln)((com.tencent.mm.ad.b)paramq).gtD.gtK;
    if (paramArrayOfByte.ugO.size() != paramq.ugO.size())
    {
      w.e("MicroMsg.emoji.NetSceneUploadEmoji", "onGYNetEnd failed. RequestSize not equal RespSize. req size:" + paramq.ugO.size() + ", resp size:" + paramArrayOfByte.ugO.size());
      this.fUd.a(paramInt2, paramInt3, paramString, this);
      GMTrace.o(11287442489344L, 84098);
      return;
    }
    paramString = (qs)paramq.ugO.get(0);
    if ((paramString.ugH == null) || (!paramString.ugH.equals(this.eCa.GS())) || (paramString.tRD < this.eCa.field_start))
    {
      w.e("MicroMsg.emoji.NetSceneUploadEmoji", "invalid server return value; start=" + paramString.tRD + ", size=" + this.eCa.field_size);
      this.fUd.a(4, -2, "", this);
      this.eCa.field_start = 0;
      h.arl().kjy.q(this.eCa);
      GMTrace.o(11287442489344L, 84098);
      return;
    }
    if (paramq.uND.tST != 0)
    {
      w.e("MicroMsg.emoji.NetSceneUploadEmoji", "onGYNetEnd failed. resp.BaseResponse.Ret:%d", new Object[] { Integer.valueOf(paramq.uND.tST) });
      this.fUd.a(4, -2, "", this);
      GMTrace.o(11287442489344L, 84098);
      return;
    }
    if (this.kls) {
      this.kls = false;
    }
    if (paramString.tRD >= paramString.tRC)
    {
      w.d("MicroMsg.emoji.NetSceneUploadEmoji", "respInfo.getMsgID() " + paramString.ugN);
      at.AR();
      paramq = com.tencent.mm.y.c.yM().cM(this.gGZ);
      w.d("MicroMsg.emoji.NetSceneUploadEmoji", "dkmsgid  set svrmsgid %d -> %d", new Object[] { Integer.valueOf(paramString.ugN), Integer.valueOf(com.tencent.mm.platformtools.r.hkk) });
      if ((10007 == com.tencent.mm.platformtools.r.hkj) && (com.tencent.mm.platformtools.r.hkk != 0))
      {
        paramString.ugN = com.tencent.mm.platformtools.r.hkk;
        com.tencent.mm.platformtools.r.hkk = 0;
      }
      paramq.D(paramString.ugN);
      at.AR();
      com.tencent.mm.y.c.yM().a(this.gGZ, paramq);
      this.eCa.field_start = 0;
      this.eCa.field_lastUseTime = System.currentTimeMillis();
      this.eCa.field_state = EmojiInfo.vCC;
      h.arl().kjy.q(this.eCa);
      if (paramq.aCp()) {
        com.tencent.mm.modelstat.b.gWv.a(paramq, g.g(paramq));
      }
      for (;;)
      {
        this.fUd.a(paramInt2, paramInt3, "", this);
        GMTrace.o(11287442489344L, 84098);
        return;
        com.tencent.mm.modelstat.b.gWv.f(paramq);
      }
    }
    this.eCa.field_start = paramString.tRD;
    this.eCa.field_lastUseTime = System.currentTimeMillis();
    h.arl().kjy.q(this.eCa);
    if (a(this.gtW, this.fUd) < 0) {
      this.fUd.a(3, -1, "", this);
    }
    GMTrace.o(11287442489344L, 84098);
  }
  
  public final int getType()
  {
    GMTrace.i(11287174053888L, 84096);
    GMTrace.o(11287174053888L, 84096);
    return 175;
  }
  
  protected final int vB()
  {
    GMTrace.i(11287576707072L, 84099);
    GMTrace.o(11287576707072L, 84099);
    return 256;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\plugin\emoji\f\r.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */