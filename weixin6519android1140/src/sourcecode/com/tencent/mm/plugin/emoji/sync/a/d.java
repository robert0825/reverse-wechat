package com.tencent.mm.plugin.emoji.sync.a;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.ad.k;
import com.tencent.mm.ad.n;
import com.tencent.mm.plugin.emoji.e.l;
import com.tencent.mm.plugin.emoji.f.f;
import com.tencent.mm.plugin.emoji.model.h;
import com.tencent.mm.plugin.emoji.sync.e;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.storage.emotion.EmojiInfo;
import com.tencent.mm.y.at;

public final class d
  extends com.tencent.mm.plugin.emoji.sync.d
{
  private String hiu;
  private e kmL;
  private k kmU;
  private EmojiInfo kmV;
  
  public d(String paramString)
  {
    GMTrace.i(11326231412736L, 84387);
    if (bg.nm(paramString)) {
      w.e("MicroMsg.BKGLoader.EmojiUploadTask", "[cpan] can not create task. md5 is null.");
    }
    this.hiu = paramString;
    this.kmV = h.arl().kjy.UK(this.hiu);
    GMTrace.o(11326231412736L, 84387);
  }
  
  public final void a(e parame)
  {
    GMTrace.i(11326634065920L, 84390);
    this.kmL = parame;
    GMTrace.o(11326634065920L, 84390);
  }
  
  public final void cancel()
  {
    GMTrace.i(11326902501376L, 84392);
    GMTrace.o(11326902501376L, 84392);
  }
  
  public final boolean equals(Object paramObject)
  {
    GMTrace.i(11326768283648L, 84391);
    if ((paramObject != null) && ((paramObject instanceof d)))
    {
      paramObject = (d)paramObject;
      if ((!bg.nm(this.hiu)) && (!bg.nm(((d)paramObject).hiu)) && (this.hiu.equals(((d)paramObject).hiu)))
      {
        GMTrace.o(11326768283648L, 84391);
        return true;
      }
    }
    GMTrace.o(11326768283648L, 84391);
    return false;
  }
  
  public final String getKey()
  {
    GMTrace.i(15572343455744L, 116023);
    String str = this.hiu;
    GMTrace.o(15572343455744L, 116023);
    return str;
  }
  
  public final void run()
  {
    GMTrace.i(11326365630464L, 84388);
    if (this.kmL != null) {
      this.kmL.wp(this.hiu);
    }
    while (this.kmV == null)
    {
      this.kmL.k(this.hiu, 1, false);
      GMTrace.o(11326365630464L, 84388);
      return;
      w.w("MicroMsg.BKGLoader.EmojiUploadTask", "call back is null.");
    }
    this.kmU = new f(this.kmV);
    at.wS().a(this.kmU, 0);
    GMTrace.o(11326365630464L, 84388);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\plugin\emoji\sync\a\d.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */