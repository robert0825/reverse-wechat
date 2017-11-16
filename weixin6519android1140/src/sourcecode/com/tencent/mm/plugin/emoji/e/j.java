package com.tencent.mm.plugin.emoji.e;

import android.database.Cursor;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.plugin.emoji.model.h;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.storage.emotion.m;
import com.tencent.mm.storage.emotion.n;
import java.util.HashMap;

public final class j
{
  public int jtJ;
  public boolean kjc;
  public long kjd;
  public int kje;
  public m kjf;
  public HashMap<String, m> kjg;
  
  public j()
  {
    GMTrace.i(11544469438464L, 86013);
    this.kjc = true;
    this.kjd = 863913600000L;
    this.kje = 19;
    this.jtJ = 79;
    this.kjg = new HashMap();
    GMTrace.o(11544469438464L, 86013);
  }
  
  public final void a(m paramm, boolean paramBoolean)
  {
    GMTrace.i(11544737873920L, 86015);
    if (paramm == null)
    {
      w.w("MicroMsg.emoji.EmojiRewardTipMgr", "updateLastRewardTipInfo failed. reward tip info is null.");
      GMTrace.o(11544737873920L, 86015);
      return;
    }
    if ((this.kjf == null) || (this.kjf.field_prodcutID.equalsIgnoreCase(paramm.field_prodcutID))) {}
    for (int i = 1;; i = 0)
    {
      if (i == 0)
      {
        this.kjf.field_continuCount = 0;
        this.kjg.put(this.kjf.field_prodcutID, this.kjf);
        h.arl().kjF.a(this.kjf);
      }
      this.kjf = paramm;
      if (!paramBoolean) {
        break;
      }
      this.kjf.field_modifyTime = 0L;
      this.kjf.field_showTipsTime = System.currentTimeMillis();
      this.kjf.field_totalCount = 0;
      this.kjf.field_continuCount = 0;
      this.kjg.put(this.kjf.field_prodcutID, this.kjf);
      h.arl().kjF.a(this.kjf);
      GMTrace.o(11544737873920L, 86015);
      return;
    }
    if (i != 0) {}
    for (this.kjf.field_continuCount += 1;; this.kjf.field_continuCount = 1)
    {
      this.kjf.field_totalCount += 1;
      this.kjf.field_modifyTime = System.currentTimeMillis();
      break;
    }
  }
  
  public final void aP(String paramString, int paramInt)
  {
    GMTrace.i(11544872091648L, 86016);
    if (bg.nm(paramString))
    {
      w.w("MicroMsg.emoji.EmojiRewardTipMgr", "updateProductFlag failed. no such product id.");
      GMTrace.o(11544872091648L, 86016);
      return;
    }
    if ((this.kjg != null) && (this.kjg.containsKey(paramString)))
    {
      ((m)this.kjg.get(paramString)).field_flag = paramInt;
      ((m)this.kjg.get(paramString)).field_setFlagTime = System.currentTimeMillis();
      GMTrace.o(11544872091648L, 86016);
      return;
    }
    w.i("MicroMsg.emoji.EmojiRewardTipMgr", "updateProductFlag map no contains this product id :%s", new Object[] { paramString });
    GMTrace.o(11544872091648L, 86016);
  }
  
  public final void aqO()
  {
    GMTrace.i(11544603656192L, 86014);
    if (this.kjf != null)
    {
      this.kjf.field_continuCount = 0;
      this.kjg.put(this.kjf.field_prodcutID, this.kjf);
      h.arl().kjF.a(this.kjf);
      this.kjf = null;
    }
    GMTrace.o(11544603656192L, 86014);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\plugin\emoji\e\j.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */