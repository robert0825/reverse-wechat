package com.tencent.mm.view.a;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.ListAdapter;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.kernel.h;
import com.tencent.mm.plugin.m.a.d;
import com.tencent.mm.plugin.m.a.e;
import com.tencent.mm.plugin.m.a.f;
import com.tencent.mm.pluginsdk.ui.ChatFooterPanel.RecommendView;
import com.tencent.mm.pluginsdk.ui.ChatFooterPanel.a;
import com.tencent.mm.pluginsdk.ui.chat.e.a;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.storage.emotion.EmojiGroupInfo;
import com.tencent.mm.ui.base.y;
import com.tencent.mm.view.SmileySubGrid;

public final class d
  extends y
{
  private final String TAG;
  private Context mContext;
  public int mCount;
  public boolean xAm;
  private View xAn;
  private com.tencent.mm.view.f.a xzl;
  
  public d(com.tencent.mm.view.f.a parama, Context paramContext)
  {
    GMTrace.i(20110244839424L, 149833);
    this.TAG = "MicroMsg.emoji.SmileyPanel.SmileyPanelViewPagerAdapter";
    this.mContext = paramContext;
    this.xzl = parama;
    GMTrace.o(20110244839424L, 149833);
  }
  
  public final View c(int paramInt, View paramView)
  {
    GMTrace.i(20110379057152L, 149834);
    com.tencent.mm.view.c.a locala1 = this.xzl.EJ(paramInt);
    Object localObject = locala1.klt;
    boolean bool = locala1.xBM;
    label111:
    a locala;
    if ("TAG_DEFAULT_TAB".equals(localObject))
    {
      localObject = com.tencent.mm.view.f.a.a.xCS;
      if ((paramView != null) && (paramView.getTag() != null) && (paramView.getTag(a.e.kwl) == localObject)) {
        break label271;
      }
      switch (1.xAo[localObject.ordinal()])
      {
      default: 
        paramView = LayoutInflater.from(this.mContext).inflate(a.f.kwv, null);
        locala = new a(paramView, (com.tencent.mm.view.f.a.a)localObject);
        paramView.setTag(locala);
        paramView.setTag(a.e.kwl, localObject);
        label139:
        switch (1.xAo[localObject.ordinal()])
        {
        }
        break;
      }
    }
    for (;;)
    {
      this.xAn = paramView;
      GMTrace.o(20110379057152L, 149834);
      return paramView;
      if ((String.valueOf(EmojiGroupInfo.vCm).equals(localObject)) || (String.valueOf(EmojiGroupInfo.vCl).equals(localObject)))
      {
        localObject = com.tencent.mm.view.f.a.a.xCT;
        break;
      }
      if (!bool)
      {
        localObject = com.tencent.mm.view.f.a.a.xCR;
        break;
      }
      localObject = com.tencent.mm.view.f.a.a.xCT;
      break;
      paramView = com.tencent.mm.pluginsdk.ui.chat.e.tAN.g(this.mContext, this.xzl.clw());
      break label111;
      label271:
      locala = (a)paramView.getTag();
      paramView.setTag(a.e.kwl, localObject);
      break label139;
      locala.xAp.wA(locala1.klt);
      continue;
      b localb = new b(this.mContext, this.xzl);
      locala.xAq.setAdapter(localb);
      locala.xAq.ckF();
      locala.xAq.tBe = locala1.ckH();
      SmileySubGrid localSmileySubGrid = locala.xAq;
      localObject = locala1.xBJ;
      if (((com.tencent.mm.view.e.a)localObject).xCd == null)
      {
        localObject = null;
        label381:
        localSmileySubGrid.xzh = ((ChatFooterPanel.a)localObject);
        locala.xAq.setNumColumns(locala1.rxE);
        locala.xAq.setColumnWidth(locala1.getColumnWidth());
        locala.xAq.setScrollbarFadingEnabled(false);
        locala.xAq.setVerticalScrollBarEnabled(false);
        locala.xAq.setSelector(a.d.aXW);
        locala.xAq.setHorizontalScrollBarEnabled(false);
        locala.xAq.setVerticalScrollBarEnabled(false);
        locala.xAq.setLongClickable(false);
        locala.xAq.ckF();
        j = this.xzl.Xq(locala1.klt).xBL;
        if (j != 0) {
          break label661;
        }
      }
      label661:
      for (int i = this.xzl.xCx;; i = j)
      {
        locala.xAq.setPadding(0, i, 0, 0);
        locala.xAq.setVerticalSpacing(j / 2);
        locala.xAq.h(locala1.getType(), paramInt - locala1.iPp, locala1.xBK, locala1.adv(), locala1.cld());
        locala.xAq.xAa = false;
        locala.xAq.gRb = this.xzl.gRb;
        localb.b(locala1.getType(), locala1.xBK, locala1.adv(), locala1.cld(), paramInt - locala1.iPp, locala1.rxD, locala1.rxE);
        localb.xAg = locala1.klt;
        break;
        localObject = ((com.tencent.mm.view.e.a)localObject).xCd.ckG();
        break label381;
      }
      localObject = new c(this.mContext, this.xzl);
      locala.xAq.setAdapter((ListAdapter)localObject);
      locala.xAq.ckF();
      locala.xAq.setNumColumns(locala1.rxE);
      locala.xAq.setColumnWidth(locala1.getColumnWidth());
      locala.xAq.setScrollbarFadingEnabled(false);
      locala.xAq.setHorizontalScrollBarEnabled(false);
      locala.xAq.setVerticalScrollBarEnabled(false);
      locala.xAq.tBe = locala1.ckH();
      locala.xAq.setFastScrollEnabled(false);
      locala.xAq.xzU = locala1.xBJ.xBS;
      locala.xAq.ckF();
      int j = this.xzl.Xq(locala1.klt).xBL;
      if (j == 0) {}
      for (i = this.xzl.xCx;; i = j)
      {
        locala.xAq.setPadding(0, i, 0, 0);
        locala.xAq.setVerticalSpacing(j / 2);
        locala.xAq.xAa = true;
        locala.xAq.gRb = this.xzl.gRb;
        locala.xAq.h(locala1.getType(), paramInt - locala1.iPp, locala1.xBK, locala1.adv(), locala1.cld());
        i = locala1.getType();
        j = locala1.xBK;
        int k = locala1.rxD;
        ((c)localObject).b(i, j, locala1.rxE * k, locala1.cld(), paramInt - locala1.iPp, locala1.rxD, locala1.rxE);
        ((a)localObject).xAg = locala1.klt;
        if (((c)localObject).xze != 23) {
          break label1030;
        }
        ((c)localObject).kqB = ((com.tencent.mm.plugin.emoji.b.c)h.j(com.tencent.mm.plugin.emoji.b.c.class)).getProvider().wa(((c)localObject).xAg);
        break;
      }
      label1030:
      if (((c)localObject).xze == 25) {
        ((c)localObject).kqB = ((com.tencent.mm.plugin.emoji.b.c)h.j(com.tencent.mm.plugin.emoji.b.c.class)).getProvider().aqI();
      }
    }
  }
  
  public final void ckK()
  {
    GMTrace.i(20110781710336L, 149837);
    com.tencent.mm.view.f.a locala = this.xzl;
    if (locala.xCA) {}
    for (int i = locala.Xq("TAG_DEFAULT_TAB").cld();; i = locala.lyd)
    {
      this.mCount = i;
      w.d("MicroMsg.emoji.SmileyPanel.SmileyPanelViewPagerAdapter", "refresh data mCount:%d", new Object[] { Integer.valueOf(this.mCount) });
      GMTrace.o(20110781710336L, 149837);
      return;
    }
  }
  
  public final int getCount()
  {
    GMTrace.i(20110513274880L, 149835);
    int i = this.mCount;
    GMTrace.o(20110513274880L, 149835);
    return i;
  }
  
  public final int j(Object paramObject)
  {
    GMTrace.i(20110647492608L, 149836);
    if (this.xAm)
    {
      w.d("MicroMsg.emoji.SmileyPanel.SmileyPanelViewPagerAdapter", "get item position always changed");
      GMTrace.o(20110647492608L, 149836);
      return -2;
    }
    int i = super.j(paramObject);
    GMTrace.o(20110647492608L, 149836);
    return i;
  }
  
  final class a
  {
    ChatFooterPanel.RecommendView xAp;
    SmileySubGrid xAq;
    
    public a(View paramView, com.tencent.mm.view.f.a.a parama)
    {
      GMTrace.i(20110915928064L, 149838);
      switch (d.1.xAo[parama.ordinal()])
      {
      }
      for (;;)
      {
        GMTrace.o(20110915928064L, 149838);
        return;
        this.xAp = ((ChatFooterPanel.RecommendView)paramView);
        GMTrace.o(20110915928064L, 149838);
        return;
        this.xAq = ((SmileySubGrid)paramView.findViewById(a.e.kwk));
      }
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\view\a\d.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */