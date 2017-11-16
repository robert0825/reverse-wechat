package com.tencent.mm.view.c;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.kernel.h;
import com.tencent.mm.plugin.emoji.b.c;
import com.tencent.mm.pluginsdk.ui.chat.j;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.storage.emotion.EmojiGroupInfo;
import com.tencent.mm.view.e.a.a;

public final class a
{
  private final String TAG;
  public int iPp;
  public String klt;
  public int rxD;
  public int rxE;
  public com.tencent.mm.view.e.a xBJ;
  public int xBK;
  public int xBL;
  public boolean xBM;
  public int xBN;
  public com.tencent.mm.view.f.a xzl;
  
  public a(EmojiGroupInfo paramEmojiGroupInfo, int paramInt1, int paramInt2, com.tencent.mm.view.f.a parama, com.tencent.mm.view.e.a parama1, boolean paramBoolean)
  {
    GMTrace.i(20119774298112L, 149904);
    this.TAG = "MicroMsg.emoji.SmileyPanel.SmileyPanelInfo";
    this.xBM = false;
    if ((paramEmojiGroupInfo == null) || (bg.nm(paramEmojiGroupInfo.field_productID)))
    {
      w.i("MicroMsg.emoji.SmileyPanel.SmileyPanelInfo", "catch invalid Smiley Tab want add??!!");
      GMTrace.o(20119774298112L, 149904);
      return;
    }
    this.xBJ = parama1;
    this.xzl = parama;
    this.klt = paramEmojiGroupInfo.field_productID;
    this.iPp = paramInt1;
    this.xBN = paramInt2;
    int i;
    if ((paramBoolean) || (paramEmojiGroupInfo.field_productID.equalsIgnoreCase(String.valueOf(EmojiGroupInfo.vCl))))
    {
      parama = this.xzl;
      if (paramEmojiGroupInfo != null) {
        if (paramEmojiGroupInfo.field_productID.equals("TAG_DEFAULT_TAB"))
        {
          paramInt2 = com.tencent.mm.bt.e.bRA().ado();
          i = paramInt2;
          if (parama.xCB) {
            i = paramInt2 - 1;
          }
          this.xBK = i;
          paramEmojiGroupInfo = this.xzl;
          parama = this.klt;
          if ((paramEmojiGroupInfo.iPJ > 0) && (!bg.nm(parama))) {
            break label520;
          }
          paramInt2 = 1;
          label183:
          this.rxD = paramInt2;
          this.rxE = this.xzl.Xr(this.klt);
        }
      }
    }
    for (this.xBL = this.xzl.dk(this.klt, this.rxD);; this.xBL = this.xzl.dk(this.klt, this.rxD))
    {
      this.xBM = paramBoolean;
      w.i("MicroMsg.emoji.SmileyPanel.SmileyPanelInfo", "smiley panel tab: productId: %s, startIndex: %d mAllEmojiNums: %d mRow:%d mCol:%d mSpacing:%d ", new Object[] { this.klt, Integer.valueOf(paramInt1), Integer.valueOf(this.xBK), Integer.valueOf(this.rxD), Integer.valueOf(this.rxE), Integer.valueOf(this.xBL) });
      GMTrace.o(20119774298112L, 149904);
      return;
      if (paramEmojiGroupInfo.field_productID.equals(String.valueOf(EmojiGroupInfo.vCm)))
      {
        if (com.tencent.mm.view.f.a.isSDCardAvailable())
        {
          paramInt2 = ((c)h.j(c.class)).getProvider().aqF() + 1;
          break;
        }
        paramInt2 = 0;
        break;
      }
      if (paramEmojiGroupInfo.field_productID.equalsIgnoreCase(String.valueOf(EmojiGroupInfo.vCl)))
      {
        if (com.tencent.mm.view.f.a.isSDCardAvailable())
        {
          paramInt2 = 16;
          break;
        }
        paramInt2 = 0;
        break;
      }
      if (com.tencent.mm.view.f.a.d(paramEmojiGroupInfo))
      {
        paramInt2 = 1;
        if (paramEmojiGroupInfo != null)
        {
          if (paramEmojiGroupInfo.field_count <= 0) {
            break label436;
          }
          paramInt2 = paramEmojiGroupInfo.field_count;
        }
        for (;;)
        {
          i = paramInt2;
          if (paramInt2 == 0) {
            i = 1;
          }
          paramInt2 = i;
          if (com.tencent.mm.view.f.a.isSDCardAvailable()) {
            break;
          }
          paramInt2 = 0;
          break;
          label436:
          paramInt2 = ((c)h.j(c.class)).getProvider().vZ(paramEmojiGroupInfo.field_productID);
          paramEmojiGroupInfo.field_count = paramInt2;
          long l = System.currentTimeMillis();
          ((c)h.j(c.class)).getProvider().a(paramEmojiGroupInfo);
          w.d("MicroMsg.emoji.SmileyPanel.SmileyPanelStg", "use time:%d", new Object[] { Long.valueOf(System.currentTimeMillis() - l) });
        }
      }
      paramInt2 = 1;
      break;
      label520:
      if (parama.equals("TAG_STORE_TAB"))
      {
        paramInt2 = 1;
        break label183;
      }
      i = paramEmojiGroupInfo.iPJ / paramEmojiGroupInfo.Xo(parama);
      if (bg.nm(parama))
      {
        paramInt2 = 0;
        label558:
        if (i <= paramInt2) {
          break label600;
        }
        i = paramInt2;
      }
      label600:
      for (;;)
      {
        paramInt2 = i;
        if (i > 0) {
          break;
        }
        paramInt2 = 1;
        break;
        if (parama.equals("TAG_DEFAULT_TAB"))
        {
          paramInt2 = 3;
          break label558;
        }
        paramInt2 = 2;
        break label558;
      }
      this.xBK = 1;
      this.rxD = 1;
      this.rxE = 1;
    }
  }
  
  public final int adv()
  {
    GMTrace.i(20120042733568L, 149906);
    int i = this.rxD;
    int j = this.rxE;
    GMTrace.o(20120042733568L, 149906);
    return i * j;
  }
  
  public final j ckH()
  {
    GMTrace.i(20120445386752L, 149909);
    Object localObject = this.xBJ;
    if (((com.tencent.mm.view.e.a)localObject).xCd == null)
    {
      GMTrace.o(20120445386752L, 149909);
      return null;
    }
    localObject = ((com.tencent.mm.view.e.a)localObject).xCd.ckH();
    GMTrace.o(20120445386752L, 149909);
    return (j)localObject;
  }
  
  public final int cld()
  {
    GMTrace.i(20120176951296L, 149907);
    if (adv() <= 0)
    {
      GMTrace.o(20120176951296L, 149907);
      return 0;
    }
    if ("TAG_DEFAULT_TAB".equals(this.klt))
    {
      i = (int)Math.ceil(this.xBK / (adv() - 1));
      GMTrace.o(20120176951296L, 149907);
      return i;
    }
    int i = (int)Math.ceil(this.xBK / adv());
    GMTrace.o(20120176951296L, 149907);
    return i;
  }
  
  public final int getColumnWidth()
  {
    GMTrace.i(20120311169024L, 149908);
    int i = this.xzl.cln() / (this.xzl.cln() / this.xzl.xCq);
    GMTrace.o(20120311169024L, 149908);
    return i;
  }
  
  public final int getType()
  {
    GMTrace.i(20119908515840L, 149905);
    String str = this.klt;
    if (str.equals("TAG_DEFAULT_TAB"))
    {
      GMTrace.o(20119908515840L, 149905);
      return 20;
    }
    if (str.equals(String.valueOf(EmojiGroupInfo.vCm)))
    {
      GMTrace.o(20119908515840L, 149905);
      return 25;
    }
    GMTrace.o(20119908515840L, 149905);
    return 23;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\view\c\a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */