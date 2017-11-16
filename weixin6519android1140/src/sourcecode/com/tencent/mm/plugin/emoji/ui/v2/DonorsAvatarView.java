package com.tencent.mm.plugin.emoji.ui.v2;

import android.content.Context;
import android.content.res.AssetManager;
import android.util.AttributeSet;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.LinearLayout.LayoutParams;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.R.f;
import com.tencent.mm.ao.n;
import com.tencent.mm.plugin.emoji.e.f;
import com.tencent.mm.protocal.c.re;
import com.tencent.mm.sdk.platformtools.BackwardSupportUtil.b;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;
import java.io.IOException;
import java.util.LinkedList;

public class DonorsAvatarView
  extends LinearLayout
{
  private int krM;
  private int krN;
  private int krO;
  private int krP;
  private LinearLayout.LayoutParams krQ;
  private int mMaxCount;
  
  public DonorsAvatarView(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
    GMTrace.i(11534805762048L, 85941);
    init();
    GMTrace.o(11534805762048L, 85941);
  }
  
  public DonorsAvatarView(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
    GMTrace.i(11534939979776L, 85942);
    init();
    GMTrace.o(11534939979776L, 85942);
  }
  
  private void init()
  {
    GMTrace.i(11535074197504L, 85943);
    setOrientation(0);
    this.krM = com.tencent.mm.br.a.ef(getContext());
    this.krN = com.tencent.mm.br.a.V(getContext(), R.f.aRQ);
    this.krO = com.tencent.mm.br.a.V(getContext(), R.f.aPv);
    this.krP = com.tencent.mm.br.a.V(getContext(), R.f.aQE);
    this.krQ = new LinearLayout.LayoutParams(this.krN, this.krN);
    this.krQ.leftMargin = this.krO;
    this.krQ.rightMargin = this.krO;
    this.mMaxCount = ((this.krM - this.krP * 2) / (this.krN + this.krO * 2));
    w.i("MicroMsg.emoji.DonorsAvatarView", "max count:%d", new Object[] { Integer.valueOf(this.mMaxCount) });
    GMTrace.o(11535074197504L, 85943);
  }
  
  public final void b(String paramString, LinkedList<re> paramLinkedList)
  {
    GMTrace.i(11535208415232L, 85944);
    removeAllViews();
    if ((paramLinkedList != null) && (paramLinkedList.size() > 0))
    {
      int i;
      int j;
      label42:
      ImageView localImageView;
      if (paramLinkedList.size() > this.mMaxCount)
      {
        i = this.mMaxCount;
        j = 0;
        if (j >= i) {
          break label190;
        }
        re localre = (re)paramLinkedList.get(j);
        if (localre != null)
        {
          localImageView = new ImageView(getContext());
          localImageView.setLayoutParams(this.krQ);
          if (bg.nm(localre.uhA)) {
            break label146;
          }
          n.Jd().a(localre.uhA, localImageView, f.h(paramString, localre.uhA, new Object[0]));
        }
      }
      for (;;)
      {
        addView(localImageView);
        j += 1;
        break label42;
        i = paramLinkedList.size();
        break;
        try
        {
          label146:
          localImageView.setImageBitmap(BackwardSupportUtil.b.a(ab.getContext().getAssets().open("avatar/default_nor_avatar.png"), com.tencent.mm.br.a.getDensity(null)));
        }
        catch (IOException localIOException)
        {
          w.printErrStackTrace("MicroMsg.emoji.DonorsAvatarView", localIOException, "", new Object[0]);
        }
      }
    }
    label190:
    GMTrace.o(11535208415232L, 85944);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\plugin\emoji\ui\v2\DonorsAvatarView.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */