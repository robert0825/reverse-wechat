package com.tencent.mm.view;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.Display;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.WindowManager;
import android.view.WindowManager.LayoutParams;
import android.widget.ListAdapter;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.plugin.m.a.c;
import com.tencent.mm.plugin.m.a.d;
import com.tencent.mm.pluginsdk.ui.emoji.MMEmojiView;
import com.tencent.mm.pluginsdk.ui.emoji.PopEmojiView;
import com.tencent.mm.pluginsdk.ui.emoji.PopEmojiView.a;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.ae;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.storage.emotion.EmojiGroupInfo;
import com.tencent.mm.storage.emotion.EmojiInfo;
import com.tencent.mm.ui.base.CustomViewPager;
import com.tencent.mm.ui.base.MMFlipper;
import java.io.InputStream;

public class SmileySubGrid
  extends SmileyGrid
{
  private int QU;
  int SD;
  private int Sp;
  Rect Sy;
  int XQ;
  private int hQ;
  float kqN;
  float kqO;
  private WindowManager kqV;
  private WindowManager.LayoutParams kvn;
  private int kvp;
  private int kvq;
  private boolean kvr;
  private PopEmojiView kvu;
  private ae mHandler;
  private LayoutInflater mLayoutInflater;
  int waf;
  public boolean xAa;
  private final Object xAb;
  int xzO;
  boolean xzP;
  private c xzQ;
  private int xzR;
  private a xzS;
  private b xzT;
  public View xzU;
  private int xzV;
  private String xzW;
  public boolean xzX;
  public volatile int xzY;
  public volatile boolean xzZ;
  
  public SmileySubGrid(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
    GMTrace.i(20102862864384L, 149778);
    this.waf = 6;
    this.xzO = -1;
    this.Sy = new Rect();
    this.mHandler = new ae();
    this.xzX = false;
    this.xzY = -1;
    this.xzZ = false;
    this.xAa = true;
    this.xAb = new Object();
    this.hQ = ViewConfiguration.get(getContext()).getScaledTouchSlop();
    this.mLayoutInflater = LayoutInflater.from(paramContext);
    this.kqV = ((WindowManager)paramContext.getSystemService("window"));
    this.kvu = new PopEmojiView(getContext());
    this.kvn = new WindowManager.LayoutParams(-1, -1, 2, 8, 1);
    this.xzV = paramContext.getResources().getDimensionPixelSize(a.c.aRZ);
    this.kvn.width = this.xzV;
    this.kvn.height = this.xzV;
    this.kvn.gravity = 17;
    this.Sp = asA();
    this.xzR = ViewConfiguration.getPressedStateDuration();
    this.QU = getResources().getConfiguration().orientation;
    if (this.QU == 2)
    {
      this.kvp = this.kqV.getDefaultDisplay().getHeight();
      this.kvq = this.kqV.getDefaultDisplay().getWidth();
      GMTrace.o(20102862864384L, 149778);
      return;
    }
    this.kvp = this.kqV.getDefaultDisplay().getWidth();
    this.kvq = this.kqV.getDefaultDisplay().getHeight();
    GMTrace.o(20102862864384L, 149778);
  }
  
  private void N(View paramView, int paramInt)
  {
    GMTrace.i(20103131299840L, 149780);
    int i;
    Object localObject;
    if ((paramInt == this.xzY) && (this.kvu.isShown()))
    {
      i = 1;
      if (i != 0) {
        break label290;
      }
      w.d("MicroMsg.emoji.SmileyPanel.SmileySubGrid", "jacks begin show:%d", new Object[] { Integer.valueOf(paramInt) });
      localObject = (EmojiInfo)getAdapter().getItem(paramInt);
      if (this.xzQ == null) {
        this.xzQ = new c();
      }
      s((EmojiInfo)localObject);
      this.kvu.setBackgroundResource(a.d.kvU);
      localObject = new int[2];
      paramView.getLocationOnScreen((int[])localObject);
      if (this.QU != 1) {
        break label217;
      }
      this.kvn.x = (localObject[0] - (this.kvp - paramView.getMeasuredWidth()) / 2 + 0);
      this.kvn.y = (localObject[1] - this.kvq / 2 - paramView.getMeasuredHeight() + 0);
      label169:
      if (this.kvr) {
        break label270;
      }
      this.xzZ = true;
      this.mHandler.postDelayed(this.xzQ, this.xzR);
    }
    for (;;)
    {
      this.xzY = paramInt;
      GMTrace.o(20103131299840L, 149780);
      return;
      i = 0;
      break;
      label217:
      this.kvn.x = (localObject[0] - (this.kvq - paramView.getMeasuredWidth()) / 2 + 0);
      this.kvn.y = (localObject[1] - this.kvp / 2 - paramView.getMeasuredHeight() + 0);
      break label169;
      label270:
      this.kqV.updateViewLayout(this.kvu, this.kvn);
      continue;
      label290:
      w.d("MicroMsg.emoji.SmileyPanel.SmileySubGrid", "jacks already show:%d", new Object[] { Integer.valueOf(paramInt) });
    }
  }
  
  private void ckJ()
  {
    GMTrace.i(20103265517568L, 149781);
    if (this.xzQ != null) {
      this.mHandler.removeCallbacks(this.xzQ);
    }
    if (this.kvr)
    {
      this.kqV.removeView(this.kvu);
      this.kvr = false;
      this.xzZ = false;
    }
    this.xzW = "";
    GMTrace.o(20103265517568L, 149781);
  }
  
  private void dI(View paramView)
  {
    GMTrace.i(20103399735296L, 149782);
    Rect localRect = this.Sy;
    localRect.set(paramView.getLeft(), paramView.getTop(), paramView.getRight(), paramView.getBottom());
    int i = localRect.left;
    int j = localRect.top;
    int k = localRect.right;
    int m = localRect.bottom;
    this.Sy.set(i - getPaddingLeft(), j - getPaddingTop(), k + getPaddingRight(), m + getPaddingBottom());
    boolean bool = this.xzP;
    if (paramView.isEnabled() != bool) {
      if (bool) {
        break label138;
      }
    }
    label138:
    for (bool = true;; bool = false)
    {
      this.xzP = bool;
      refreshDrawableState();
      GMTrace.o(20103399735296L, 149782);
      return;
    }
  }
  
  public int asA()
  {
    GMTrace.i(20103668170752L, 149784);
    int i = ViewConfiguration.getLongPressTimeout();
    GMTrace.o(20103668170752L, 149784);
    return i;
  }
  
  public void dQ(boolean paramBoolean)
  {
    GMTrace.i(20103533953024L, 149783);
    w.d("MicroMsg.emoji.SmileyPanel.SmileySubGrid", "cpan t setScrollEnable:%b", new Object[] { Boolean.valueOf(paramBoolean) });
    if (this.xzU != null)
    {
      if ((this.xzU instanceof MMFlipper))
      {
        ((MMFlipper)this.xzU).wak = paramBoolean;
        GMTrace.o(20103533953024L, 149783);
        return;
      }
      if ((this.xzU instanceof CustomViewPager)) {
        ((CustomViewPager)this.xzU).CR = paramBoolean;
      }
    }
    GMTrace.o(20103533953024L, 149783);
  }
  
  protected void onDetachedFromWindow()
  {
    GMTrace.i(20104070823936L, 149787);
    super.onDetachedFromWindow();
    ckJ();
    GMTrace.o(20104070823936L, 149787);
  }
  
  public boolean onTouchEvent(MotionEvent paramMotionEvent)
  {
    GMTrace.i(20102997082112L, 149779);
    if (!this.xAa)
    {
      ckJ();
      boolean bool = super.onTouchEvent(paramMotionEvent);
      GMTrace.o(20102997082112L, 149779);
      return bool;
    }
    int i = paramMotionEvent.getAction();
    b localb = null;
    switch (i)
    {
    }
    for (;;)
    {
      GMTrace.o(20102997082112L, 149779);
      return true;
      i = (int)paramMotionEvent.getX();
      int j = (int)paramMotionEvent.getY();
      this.kqN = i;
      this.kqO = j;
      i = pointToPosition(i, j);
      if ((i >= 0) && (getAdapter().isEnabled(i))) {
        this.XQ = 0;
      }
      paramMotionEvent = localb;
      if (i >= 0)
      {
        this.xzO = i;
        paramMotionEvent = getChildAt(i - getFirstVisiblePosition());
      }
      if (paramMotionEvent != null)
      {
        paramMotionEvent.setPressed(true);
        paramMotionEvent.setSelected(true);
        dI(paramMotionEvent);
      }
      if (this.xzS == null) {
        this.xzS = new a();
      }
      this.xzS.chO();
      this.SD = i;
      if ((this.xze != 25) || (this.iPw != 0) || (i != 0))
      {
        this.mHandler.postDelayed(this.xzS, this.Sp);
        continue;
        i = (int)paramMotionEvent.getX();
        j = (int)paramMotionEvent.getY();
        if (this.waf == 5)
        {
          i = pointToPosition(i, j);
          this.SD = i;
          if (((i >= 0) && ((this.xze != 25) || (i != 0) || (this.iPw != 0))) || (this.xzX)) {
            if (this.xzO != i)
            {
              this.xzO = i;
              paramMotionEvent = getChildAt(i - getFirstVisiblePosition());
              layoutChildren();
              if (paramMotionEvent != null)
              {
                paramMotionEvent.setPressed(true);
                paramMotionEvent.setSelected(true);
                dI(paramMotionEvent);
                N(paramMotionEvent, this.xzO);
              }
            }
          }
          for (;;)
          {
            this.mHandler.removeCallbacks(this.xzS);
            break;
            ckJ();
            if (this.xzO >= 0)
            {
              paramMotionEvent = getChildAt(this.xzO - getFirstVisiblePosition());
              if (paramMotionEvent != null)
              {
                paramMotionEvent.setPressed(false);
                paramMotionEvent.setSelected(false);
                dI(paramMotionEvent);
              }
            }
          }
        }
        if (Math.abs(this.kqN - i) > this.hQ)
        {
          this.XQ = -1;
          this.mHandler.removeCallbacks(this.xzS);
        }
        ckJ();
        continue;
        j = this.SD;
        paramMotionEvent = getChildAt(j - getFirstVisiblePosition());
        if ((i == 1) && (this.XQ != -1))
        {
          if (this.xzT == null) {
            this.xzT = new b();
          }
          localb = this.xzT;
          localb.xAd = paramMotionEvent;
          localb.xeg = j;
          localb.chO();
          this.mHandler.post(localb);
        }
        this.mHandler.removeCallbacks(this.xzS);
        dQ(true);
        ckJ();
        if (this.xzO >= 0)
        {
          paramMotionEvent = getChildAt(this.xzO - getFirstVisiblePosition());
          if (paramMotionEvent != null)
          {
            paramMotionEvent.setPressed(false);
            paramMotionEvent.setSelected(false);
            dI(paramMotionEvent);
          }
        }
        this.waf = 6;
      }
    }
  }
  
  public final void release()
  {
    GMTrace.i(20103936606208L, 149786);
    super.release();
    ckJ();
    if (this.kvu != null) {
      this.kvu = null;
    }
    GMTrace.o(20103936606208L, 149786);
  }
  
  public final void s(EmojiInfo paramEmojiInfo)
  {
    int j = 1;
    GMTrace.i(20103802388480L, 149785);
    for (;;)
    {
      synchronized (this.xAb)
      {
        if (this.kvu == null) {
          break label322;
        }
        if (paramEmojiInfo == null)
        {
          this.kvu.zC(PopEmojiView.a.tCd);
          w.i("MicroMsg.emoji.SmileyPanel.SmileySubGrid", "emoji is null. set null");
          GMTrace.o(20103802388480L, 149785);
          return;
        }
        if (paramEmojiInfo.GS().equals(this.xzW)) {
          continue;
        }
        this.kvu.zC(PopEmojiView.a.tCe);
        this.xzW = paramEmojiInfo.GS();
        if (paramEmojiInfo.field_catalog == EmojiGroupInfo.vCm)
        {
          i = j;
          if (!paramEmojiInfo.field_content.equals(String.valueOf(EmojiInfo.vCt)))
          {
            if (paramEmojiInfo.field_content.equals(String.valueOf(EmojiInfo.vCs))) {
              i = j;
            }
          }
          else
          {
            if (i == 0) {
              break label222;
            }
            paramEmojiInfo = paramEmojiInfo.getName().split("\\.")[0];
            w.d("MicroMsg.emoji.SmileyPanel.SmileySubGrid", "emoji drawable name is %s", new Object[] { paramEmojiInfo });
            i = getResources().getIdentifier(paramEmojiInfo, "drawable", ab.getPackageName());
            paramEmojiInfo = this.kvu;
            if (paramEmojiInfo.tCa == null) {
              continue;
            }
            paramEmojiInfo.tCa.setImageResource(i);
          }
        }
      }
      int i = 0;
      continue;
      label222:
      PopEmojiView localPopEmojiView;
      if (paramEmojiInfo.bUP())
      {
        localPopEmojiView = this.kvu;
        InputStream localInputStream = EmojiInfo.bd(ab.getContext(), paramEmojiInfo.getName());
        paramEmojiInfo = paramEmojiInfo.getName();
        if (localPopEmojiView.tCa != null) {
          localPopEmojiView.tCa.a(localInputStream, paramEmojiInfo);
        }
      }
      for (;;)
      {
        paramEmojiInfo = this.kvu;
        if (paramEmojiInfo.tCa == null) {
          break;
        }
        paramEmojiInfo.tCa.resume();
        break;
        localPopEmojiView = this.kvu;
        if (localPopEmojiView.tCa != null) {
          localPopEmojiView.tCa.a(paramEmojiInfo, "");
        }
      }
      label322:
      w.i("MicroMsg.emoji.SmileyPanel.SmileySubGrid", "mPopImageView is null.");
    }
  }
  
  private final class a
    extends SmileySubGrid.d
    implements Runnable
  {
    public a()
    {
      super();
      GMTrace.i(20119103209472L, 149899);
      GMTrace.o(20119103209472L, 149899);
    }
    
    public final void run()
    {
      GMTrace.i(20119237427200L, 149900);
      int i = SmileySubGrid.this.SD;
      View localView = SmileySubGrid.this.getChildAt(i - SmileySubGrid.this.getFirstVisiblePosition());
      if (localView != null)
      {
        int j = SmileySubGrid.this.SD;
        long l = SmileySubGrid.this.getAdapter().getItemId(SmileySubGrid.this.SD);
        if (chP())
        {
          w.d("MicroMsg.emoji.SmileyPanel.SmileySubGrid", "CheckForLongPress performLongPress position:[%d] id:[%d]", new Object[] { Integer.valueOf(j), Long.valueOf(l) });
          SmileySubGrid.a(SmileySubGrid.this, localView, i);
          SmileySubGrid.this.XQ = -1;
          SmileySubGrid.this.waf = 5;
          SmileySubGrid.this.dQ(false);
        }
      }
      GMTrace.o(20119237427200L, 149900);
    }
  }
  
  private final class b
    extends SmileySubGrid.d
    implements Runnable
  {
    View xAd;
    int xeg;
    
    public b()
    {
      super();
      GMTrace.i(20101923340288L, 149771);
      GMTrace.o(20101923340288L, 149771);
    }
    
    public final void run()
    {
      GMTrace.i(20102057558016L, 149772);
      ListAdapter localListAdapter = SmileySubGrid.this.getAdapter();
      int i = this.xeg;
      if ((localListAdapter != null) && (SmileySubGrid.this.getCount() > 0) && (i != -1) && (i < localListAdapter.getCount()) && (chP()))
      {
        w.d("MicroMsg.emoji.SmileyPanel.SmileySubGrid", "PerformClick performItemClick position:[%d] id:[%d] ", new Object[] { Integer.valueOf(i), Long.valueOf(localListAdapter.getItemId(i)) });
        SmileySubGrid.this.performItemClick(this.xAd, i, localListAdapter.getItemId(i));
      }
      GMTrace.o(20102057558016L, 149772);
    }
  }
  
  private final class c
    implements Runnable
  {
    public c()
    {
      GMTrace.i(20099507421184L, 149753);
      GMTrace.o(20099507421184L, 149753);
    }
    
    public final void run()
    {
      GMTrace.i(20099641638912L, 149754);
      if (!SmileySubGrid.c(SmileySubGrid.this))
      {
        SmileySubGrid.f(SmileySubGrid.this).addView(SmileySubGrid.d(SmileySubGrid.this), SmileySubGrid.e(SmileySubGrid.this));
        SmileySubGrid.g(SmileySubGrid.this);
      }
      GMTrace.o(20099641638912L, 149754);
    }
  }
  
  private class d
  {
    private int weS;
    
    public d()
    {
      GMTrace.i(20127022055424L, 149958);
      GMTrace.o(20127022055424L, 149958);
    }
    
    public final void chO()
    {
      GMTrace.i(20127156273152L, 149959);
      this.weS = SmileySubGrid.a(SmileySubGrid.this);
      GMTrace.o(20127156273152L, 149959);
    }
    
    public final boolean chP()
    {
      GMTrace.i(20127290490880L, 149960);
      if ((SmileySubGrid.this.hasWindowFocus()) && (SmileySubGrid.b(SmileySubGrid.this) == this.weS))
      {
        GMTrace.o(20127290490880L, 149960);
        return true;
      }
      GMTrace.o(20127290490880L, 149960);
      return false;
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\view\SmileySubGrid.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */