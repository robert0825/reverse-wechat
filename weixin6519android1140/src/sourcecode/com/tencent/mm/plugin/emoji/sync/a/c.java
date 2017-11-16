package com.tencent.mm.plugin.emoji.sync.a;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.plugin.emoji.e.l;
import com.tencent.mm.plugin.emoji.model.h;
import com.tencent.mm.plugin.emoji.sync.d;
import com.tencent.mm.plugin.emoji.sync.e;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.storage.emotion.EmojiGroupInfo;
import com.tencent.mm.storage.emotion.a;

public final class c
  extends d
{
  private String klt;
  private e kmL;
  
  public c(String paramString)
  {
    GMTrace.i(11327976243200L, 84400);
    if (bg.nm(paramString)) {
      w.e("MicroMsg.BKGLoader.EmojiStoreTukaziSyncTask", "[cpan] empty productid");
    }
    this.klt = paramString;
    GMTrace.o(11327976243200L, 84400);
  }
  
  public final void a(e parame)
  {
    GMTrace.i(11328378896384L, 84403);
    this.kmL = parame;
    GMTrace.o(11328378896384L, 84403);
  }
  
  public final void cancel()
  {
    GMTrace.i(11328647331840L, 84405);
    GMTrace.o(11328647331840L, 84405);
  }
  
  public final boolean equals(Object paramObject)
  {
    GMTrace.i(11328513114112L, 84404);
    if ((paramObject != null) && ((paramObject instanceof c)))
    {
      paramObject = (c)paramObject;
      if ((!bg.nm(this.klt)) && (!bg.nm(((c)paramObject).getKey())) && (this.klt.equals(((c)paramObject).getKey())))
      {
        GMTrace.o(11328513114112L, 84404);
        return true;
      }
    }
    GMTrace.o(11328513114112L, 84404);
    return false;
  }
  
  public final String getKey()
  {
    GMTrace.i(11328244678656L, 84402);
    if (this.klt == null)
    {
      GMTrace.o(11328244678656L, 84402);
      return "";
    }
    String str = this.klt;
    GMTrace.o(11328244678656L, 84402);
    return str;
  }
  
  public final void run()
  {
    GMTrace.i(11328110460928L, 84401);
    if (this.kmL != null) {
      this.kmL.wp(getKey());
    }
    for (;;)
    {
      EmojiGroupInfo localEmojiGroupInfo = h.arl().kjz.aW(EmojiGroupInfo.vCl, false);
      localEmojiGroupInfo.field_flag = 0;
      h.arl().kjz.a(localEmojiGroupInfo);
      if (this.kmL != null) {
        this.kmL.k(getKey(), 2, true);
      }
      GMTrace.o(11328110460928L, 84401);
      return;
      w.w("MicroMsg.BKGLoader.EmojiStoreTukaziSyncTask", "call back is null");
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\plugin\emoji\sync\a\c.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */