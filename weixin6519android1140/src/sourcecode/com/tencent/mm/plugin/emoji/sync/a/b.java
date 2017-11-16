package com.tencent.mm.plugin.emoji.sync.a;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.ad.k;
import com.tencent.mm.ad.n;
import com.tencent.mm.g.a.cq;
import com.tencent.mm.modelcdntran.c;
import com.tencent.mm.plugin.emoji.model.h;
import com.tencent.mm.plugin.emoji.sync.d;
import com.tencent.mm.plugin.emoji.sync.e;
import com.tencent.mm.protocal.c.zy;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.storage.emotion.EmojiGroupInfo;
import com.tencent.mm.storage.emotion.i;
import com.tencent.mm.storage.emotion.j;
import com.tencent.mm.y.at;
import java.io.IOException;

public final class b
  extends d
{
  private boolean klO;
  private String klt;
  private e kmL;
  private com.tencent.mm.plugin.emoji.f.g kmT;
  
  public b(String paramString)
  {
    GMTrace.i(11325291888640L, 84380);
    this.klO = false;
    if (bg.nm(paramString)) {
      w.e("MicroMsg.BKGLoader.EmojiStoreEmojiSyncTask", "[cpan]");
    }
    this.klt = paramString;
    GMTrace.o(11325291888640L, 84380);
  }
  
  public b(String paramString, byte paramByte)
  {
    GMTrace.i(11325426106368L, 84381);
    this.klO = false;
    if (bg.nm(paramString)) {
      w.e("MicroMsg.BKGLoader.EmojiStoreEmojiSyncTask", "[cpan]");
    }
    this.klt = paramString;
    this.klO = true;
    GMTrace.o(11325426106368L, 84381);
  }
  
  public final void a(e parame)
  {
    GMTrace.i(11325828759552L, 84384);
    this.kmL = parame;
    GMTrace.o(11325828759552L, 84384);
  }
  
  public final void cancel()
  {
    GMTrace.i(11326097195008L, 84386);
    if ((this.kmT != null) && (!bg.nm(this.kmT.gIp)))
    {
      com.tencent.mm.modelcdntran.g.Gk().jz(this.kmT.gIp);
      w.i("MicroMsg.BKGLoader.EmojiStoreEmojiSyncTask", "success cancel exchange emotion pack clientid:%s", new Object[] { this.kmT.gIp });
      GMTrace.o(11326097195008L, 84386);
      return;
    }
    w.i("MicroMsg.BKGLoader.EmojiStoreEmojiSyncTask", "failed cancel exchange emotion pack.");
    GMTrace.o(11326097195008L, 84386);
  }
  
  public final boolean equals(Object paramObject)
  {
    GMTrace.i(11325962977280L, 84385);
    if ((paramObject != null) && ((paramObject instanceof b)))
    {
      paramObject = (b)paramObject;
      if ((!bg.nm(this.klt)) && (!bg.nm(((b)paramObject).getKey())) && (this.klt.equals(((b)paramObject).getKey())))
      {
        GMTrace.o(11325962977280L, 84385);
        return true;
      }
    }
    GMTrace.o(11325962977280L, 84385);
    return false;
  }
  
  public final String getKey()
  {
    GMTrace.i(11325694541824L, 84383);
    if (this.klt == null)
    {
      GMTrace.o(11325694541824L, 84383);
      return "";
    }
    String str = this.klt;
    GMTrace.o(11325694541824L, 84383);
    return str;
  }
  
  public final void run()
  {
    GMTrace.i(11325560324096L, 84382);
    if (this.kmL != null) {
      this.kmL.wp(getKey());
    }
    for (;;)
    {
      localObject = h.arl().kjz.aW(getKey(), true);
      if ((this.klO) || (localObject == null) || (((EmojiGroupInfo)localObject).field_sync != 2) || (((EmojiGroupInfo)localObject).field_status != 7)) {
        break;
      }
      localObject = new cq();
      ((cq)localObject).eDV.eDW = getKey();
      ((cq)localObject).eDV.eCx = 2;
      ((cq)localObject).eDV.success = true;
      com.tencent.mm.sdk.b.a.vgX.m((com.tencent.mm.sdk.b.b)localObject);
      GMTrace.o(11325560324096L, 84382);
      return;
      w.w("MicroMsg.BKGLoader.EmojiStoreEmojiSyncTask", "call back is null");
    }
    this.kmT = new com.tencent.mm.plugin.emoji.f.g(this.klt);
    at.wS().a(this.kmT, 0);
    Object localObject = new zy();
    i locali = h.arl().kjC.UP(this.klt);
    if ((locali != null) && (locali.field_content != null)) {}
    try
    {
      ((zy)localObject).aD(locali.field_content);
      if (((zy)localObject).uqD == null)
      {
        localObject = new com.tencent.mm.plugin.emoji.f.l(this.klt, 15);
        at.wS().a((k)localObject, 0);
      }
      GMTrace.o(11325560324096L, 84382);
      return;
    }
    catch (IOException localIOException)
    {
      for (;;)
      {
        w.e("MicroMsg.BKGLoader.EmojiStoreEmojiSyncTask", "exception:%s", new Object[] { bg.f(localIOException) });
      }
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\plugin\emoji\sync\a\b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */