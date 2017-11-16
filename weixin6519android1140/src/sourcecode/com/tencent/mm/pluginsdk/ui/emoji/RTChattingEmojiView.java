package com.tencent.mm.pluginsdk.ui.emoji;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View.MeasureSpec;
import android.widget.FrameLayout;
import android.widget.FrameLayout.LayoutParams;
import android.widget.ProgressBar;
import android.widget.TextView;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.a.e;
import com.tencent.mm.a.f;
import com.tencent.mm.g.a.cn;
import com.tencent.mm.kernel.h;
import com.tencent.mm.plugin.emoji.PluginEmoji;
import com.tencent.mm.plugin.gif.MMAnimateView;
import com.tencent.mm.plugin.gif.b;
import com.tencent.mm.plugin.m.a.b;
import com.tencent.mm.plugin.m.a.c;
import com.tencent.mm.plugin.m.a.d;
import com.tencent.mm.plugin.m.a.h;
import com.tencent.mm.sdk.b.a;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.o;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.storage.aj;
import com.tencent.mm.storage.emotion.EmojiInfo;
import java.lang.ref.WeakReference;

public class RTChattingEmojiView
  extends FrameLayout
{
  private EmojiInfo koe;
  private int mStatus;
  private TextView qCQ;
  private int tCg;
  private int tCh;
  private int tCi;
  private int tCj;
  private int tCk;
  public ChattingEmojiView tCl;
  private ProgressBar tCm;
  private FrameLayout.LayoutParams tCn;
  FrameLayout.LayoutParams tCo;
  
  public RTChattingEmojiView(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
    GMTrace.i(1196551045120L, 8915);
    this.mStatus = -1;
    GMTrace.o(1196551045120L, 8915);
  }
  
  public RTChattingEmojiView(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
    GMTrace.i(1196685262848L, 8916);
    this.mStatus = -1;
    GMTrace.o(1196685262848L, 8916);
  }
  
  private void bMT()
  {
    GMTrace.i(1197490569216L, 8922);
    cn localcn = new cn();
    localcn.eDQ.eDR = this.koe;
    localcn.eDQ.scene = 0;
    a.vgX.m(localcn);
    GMTrace.o(1197490569216L, 8922);
  }
  
  private void zD(int paramInt)
  {
    GMTrace.i(1197624786944L, 8923);
    this.mStatus = paramInt;
    switch (paramInt)
    {
    }
    for (;;)
    {
      GMTrace.o(1197624786944L, 8923);
      return;
      this.tCm.setVisibility(0);
      this.qCQ.setVisibility(4);
      this.tCl.setVisibility(4);
      setBackgroundResource(a.d.bbj);
      GMTrace.o(1197624786944L, 8923);
      return;
      this.tCm.setVisibility(0);
      this.qCQ.setVisibility(4);
      this.tCl.setVisibility(4);
      setBackgroundResource(a.d.kvT);
      GMTrace.o(1197624786944L, 8923);
      return;
      Drawable localDrawable = getResources().getDrawable(a.d.kvW);
      localDrawable.setBounds(0, 0, this.tCi, this.tCi);
      w.d("MicroMsg.emoji.RTChattingEmojiView", "iconSize:%d hashcode:%d", new Object[] { Integer.valueOf(this.tCi), Integer.valueOf(hashCode()) });
      this.qCQ.setCompoundDrawables(null, localDrawable, null, null);
      this.qCQ.setText(a.h.kwE);
      this.qCQ.setVisibility(0);
      this.tCm.setVisibility(4);
      this.tCl.setVisibility(4);
      setBackgroundResource(a.d.kvT);
      GMTrace.o(1197624786944L, 8923);
      return;
      this.tCl.setVisibility(0);
      this.tCm.setVisibility(4);
      this.qCQ.setVisibility(4);
      setBackgroundResource(a.d.bbj);
    }
  }
  
  public void MP()
  {
    GMTrace.i(1196819480576L, 8917);
    this.tCg = getContext().getResources().getDimensionPixelSize(a.c.kbm);
    this.tCh = getContext().getResources().getDimensionPixelSize(a.c.kvM);
    this.tCj = getContext().getResources().getDimensionPixelSize(a.c.kvP);
    this.tCk = getContext().getResources().getDimensionPixelSize(a.c.kvO);
    this.tCl = new ChattingEmojiView(getContext());
    this.tCm = new ProgressBar(getContext());
    this.tCm.setIndeterminateDrawable(getResources().getDrawable(a.d.kvY));
    this.qCQ = new TextView(getContext());
    this.qCQ.setText(a.h.kwE);
    this.qCQ.setTextColor(getResources().getColor(a.b.kvI));
    this.tCn = new FrameLayout.LayoutParams(-2, -2);
    this.tCo = new FrameLayout.LayoutParams(-2, -2);
    this.tCn.gravity = 17;
    addView(this.tCm, this.tCn);
    addView(this.qCQ, this.tCn);
    GMTrace.o(1196819480576L, 8917);
  }
  
  public final void a(EmojiInfo paramEmojiInfo, long paramLong)
  {
    GMTrace.i(1196953698304L, 8918);
    a(paramEmojiInfo, paramLong, new aj(""));
    GMTrace.o(1196953698304L, 8918);
  }
  
  public final void a(EmojiInfo paramEmojiInfo, long paramLong, aj paramaj)
  {
    GMTrace.i(1197087916032L, 8919);
    w.d("MicroMsg.emoji.RTChattingEmojiView", "setEmojiInfo");
    this.koe = paramEmojiInfo;
    ChattingEmojiView localChattingEmojiView;
    boolean bool;
    int i;
    int[] arrayOfInt;
    String str1;
    String str2;
    b localb;
    Context localContext;
    if (this.koe.bJs())
    {
      zD(2);
      localChattingEmojiView = this.tCl;
      if (!paramaj.hco) {}
      for (bool = true;; bool = false)
      {
        i = ((PluginEmoji)h.j(PluginEmoji.class)).getEmojiMgr().e(paramEmojiInfo);
        arrayOfInt = ((PluginEmoji)h.j(PluginEmoji.class)).getEmojiMgr().f(paramEmojiInfo);
        str1 = paramEmojiInfo.getName();
        str2 = String.valueOf(paramLong + paramEmojiInfo.getName());
        if (bg.nm(str2)) {
          break label322;
        }
        localChattingEmojiView.kgw = str2;
        localb = b.aHd();
        localContext = localChattingEmojiView.getContext();
        if (!TextUtils.isEmpty(str1)) {
          break;
        }
        paramEmojiInfo = null;
        if (bool != paramEmojiInfo.mIsPlaying) {
          break label300;
        }
        paramEmojiInfo.start();
        label176:
        localChattingEmojiView.setImageDrawable(paramEmojiInfo);
        GMTrace.o(1197087916032L, 8919);
        return;
      }
      if ((localb.mfd.get(str2) == null) || (((WeakReference)localb.mfd.get(str2)).get() == null)) {
        break label571;
      }
    }
    label300:
    label322:
    label571:
    for (paramaj = (com.tencent.mm.plugin.gif.d)((WeakReference)localb.mfd.get(str2)).get();; paramaj = null)
    {
      paramEmojiInfo = paramaj;
      if (paramaj != null) {
        break;
      }
      paramEmojiInfo = new com.tencent.mm.plugin.gif.d(localContext, false, bool, i, arrayOfInt, str1);
      localb.mfd.put(str2, new WeakReference(paramEmojiInfo));
      break;
      paramEmojiInfo.kuY = 0;
      paramEmojiInfo.mfR = 0;
      paramEmojiInfo.mIsPlaying = true;
      paramEmojiInfo.start();
      break label176;
      paramEmojiInfo = new com.tencent.mm.plugin.gif.d(localChattingEmojiView.getContext(), false, bool, i, arrayOfInt, str1);
      paramEmojiInfo.start();
      localChattingEmojiView.setImageDrawable(paramEmojiInfo);
      GMTrace.o(1197087916032L, 8919);
      return;
      if (this.koe.bUP())
      {
        zD(2);
        this.tCl.a(EmojiInfo.bd(getContext(), paramEmojiInfo.getName()), String.valueOf(paramLong));
        GMTrace.o(1197087916032L, 8919);
        return;
      }
      paramaj = this.koe.bUU();
      if (e.aY(paramaj) > 0)
      {
        zD(2);
        paramEmojiInfo = e.c(paramaj, 0, 10);
        if ((paramEmojiInfo != null) && (!o.bj(paramEmojiInfo)))
        {
          this.tCl.a(this.koe, ((PluginEmoji)h.j(PluginEmoji.class)).getEmojiMgr().a(this.koe), String.valueOf(paramLong));
          GMTrace.o(1197087916032L, 8919);
          return;
        }
        this.tCl.cy(paramaj, String.valueOf(paramLong));
        GMTrace.o(1197087916032L, 8919);
        return;
      }
      if (paramEmojiInfo.field_state == EmojiInfo.vCE)
      {
        zD(0);
        bMT();
      }
      for (;;)
      {
        this.tCl.setImageBitmap(null);
        GMTrace.o(1197087916032L, 8919);
        return;
        zD(3);
        bMT();
      }
    }
  }
  
  protected void onAttachedToWindow()
  {
    GMTrace.i(1197893222400L, 8925);
    super.onAttachedToWindow();
    GMTrace.o(1197893222400L, 8925);
  }
  
  protected void onDetachedFromWindow()
  {
    GMTrace.i(1198027440128L, 8926);
    super.onDetachedFromWindow();
    GMTrace.o(1198027440128L, 8926);
  }
  
  protected void onMeasure(int paramInt1, int paramInt2)
  {
    GMTrace.i(1197759004672L, 8924);
    if ((this.mStatus == 0) || (this.mStatus == 1) || (this.mStatus == 3))
    {
      if ((this.koe != null) && (this.koe.field_height != 0))
      {
        paramInt1 = (int)(this.koe.field_height * this.tCl.aHe());
        if (paramInt1 < this.tCh) {}
      }
      for (;;)
      {
        paramInt2 = paramInt1;
        if (paramInt1 > this.tCg) {
          paramInt2 = this.tCg;
        }
        this.tCi = this.tCj;
        if ((paramInt2 >= this.tCh) && (paramInt2 < this.tCh + (this.tCj - this.tCk))) {
          this.tCi = (this.tCk + (paramInt2 - this.tCh));
        }
        paramInt1 = this.tCg;
        setMeasuredDimension(paramInt1, paramInt2);
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(paramInt1, 1073741824), View.MeasureSpec.makeMeasureSpec(paramInt2, 1073741824));
        zD(this.mStatus);
        GMTrace.o(1197759004672L, 8924);
        return;
        paramInt1 = this.tCh;
        continue;
        paramInt1 = this.tCh;
      }
    }
    super.onMeasure(paramInt1, paramInt2);
    GMTrace.o(1197759004672L, 8924);
  }
  
  public boolean performClick()
  {
    GMTrace.i(1197356351488L, 8921);
    if (this.mStatus == 3)
    {
      zD(1);
      bMT();
      GMTrace.o(1197356351488L, 8921);
      return true;
    }
    if (this.mStatus == 2)
    {
      boolean bool = super.performClick();
      GMTrace.o(1197356351488L, 8921);
      return bool;
    }
    w.d("MicroMsg.emoji.RTChattingEmojiView", "do nothing when loading");
    GMTrace.o(1197356351488L, 8921);
    return true;
  }
  
  public final void setImageBitmap(Bitmap paramBitmap)
  {
    GMTrace.i(1197222133760L, 8920);
    zD(2);
    if ((this.tCl != null) && (paramBitmap != null) && (!paramBitmap.isRecycled()))
    {
      paramBitmap.setDensity(320);
      this.tCl.setImageBitmap(paramBitmap);
    }
    GMTrace.o(1197222133760L, 8920);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\pluginsdk\ui\emoji\RTChattingEmojiView.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */