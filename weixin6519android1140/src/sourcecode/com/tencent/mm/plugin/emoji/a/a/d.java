package com.tencent.mm.plugin.emoji.a.a;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.plugin.emoji.e.l;
import com.tencent.mm.plugin.emoji.model.e;
import com.tencent.mm.plugin.emoji.model.h;
import com.tencent.mm.protocal.c.rh;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.storage.ak;
import com.tencent.mm.storage.emotion.EmojiGroupInfo;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

public final class d
  extends c
{
  private final String TAG;
  
  public d(e parame)
  {
    super(parame);
    GMTrace.i(11353477611520L, 84590);
    this.TAG = "MicroMsg.emoji.EmojiListMineData";
    GMTrace.o(11353477611520L, 84590);
  }
  
  public final void aqp()
  {
    GMTrace.i(11353880264704L, 84593);
    GMTrace.o(11353880264704L, 84593);
  }
  
  public final void clear()
  {
    GMTrace.i(11353746046976L, 84592);
    super.clear();
    GMTrace.o(11353746046976L, 84592);
  }
  
  public final void notifyDataSetChanged()
  {
    try
    {
      GMTrace.i(11353611829248L, 84591);
      Object localObject1 = h.arl().kjz.bUL();
      boolean bool = com.tencent.mm.plugin.emoji.h.a.asF();
      this.mItemList = new ArrayList();
      w.v("MicroMsg.emoji.EmojiListMineData", "============= refresh Data By DB");
      localObject1 = ((List)localObject1).iterator();
      while (((Iterator)localObject1).hasNext())
      {
        rh localrh = ((EmojiGroupInfo)((Iterator)localObject1).next()).bUt();
        f localf = new f(localrh);
        if ((com.tencent.mm.plugin.emoji.h.a.d(localrh)) && (bool))
        {
          ak localak = new ak(localrh.tRS);
          this.khw.put(localrh.tRS, localak);
        }
        localf.dB(9);
        this.mItemList.add(localf);
      }
      GMTrace.o(11353611829248L, 84591);
    }
    finally {}
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\plugin\emoji\a\a\d.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */