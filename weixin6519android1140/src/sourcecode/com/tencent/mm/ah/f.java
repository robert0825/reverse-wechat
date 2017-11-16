package com.tencent.mm.ah;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.y.af;

public final class f
  extends af
{
  public f()
  {
    GMTrace.i(4500857290752L, 33534);
    GMTrace.o(4500857290752L, 33534);
  }
  
  public final boolean fq(int paramInt)
  {
    GMTrace.i(4501125726208L, 33536);
    if ((paramInt == 0) || (paramInt <= 604372991)) {}
    for (boolean bool = true;; bool = false)
    {
      w.i("MicroMsg.EmojiInfoDataTransfer", "in needTransfer, sVer = %d, result = %b", new Object[] { Integer.valueOf(paramInt), Boolean.valueOf(bool) });
      GMTrace.o(4501125726208L, 33536);
      return bool;
    }
  }
  
  public final String getTag()
  {
    GMTrace.i(4501259943936L, 33537);
    GMTrace.o(4501259943936L, 33537);
    return "MicroMsg.EmojiInfoDataTransfer";
  }
  
  public final void transfer(int paramInt)
  {
    GMTrace.i(4500991508480L, 33535);
    w.i("MicroMsg.EmojiInfoDataTransfer", "start transfer EmojiInfoStorage and EmojiGroupInfoStorage");
    w.i("MicroMsg.EmojiInfoDataTransfer", "end transfer EmojiInfoStorage and EmojiGroupInfoStorage");
    GMTrace.o(4500991508480L, 33535);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\ah\f.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */