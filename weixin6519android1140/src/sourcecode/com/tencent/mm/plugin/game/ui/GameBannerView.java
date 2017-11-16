package com.tencent.mm.plugin.game.ui;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.support.v4.view.ViewPager;
import android.support.v4.view.ViewPager.e;
import android.support.v4.view.u;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.ImageView;
import android.widget.LinearLayout;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.R.h;
import com.tencent.mm.R.i;
import com.tencent.mm.plugin.game.d.c;
import com.tencent.mm.plugin.game.model.ai;
import com.tencent.mm.pluginsdk.model.app.f;
import com.tencent.mm.sdk.platformtools.aj;
import com.tencent.mm.sdk.platformtools.aj.a;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.ui.base.MMDotView;
import com.tencent.mm.y.at;
import java.util.LinkedList;

public class GameBannerView
  extends LinearLayout
  implements ViewPager.e, View.OnClickListener
{
  private MMDotView iPE;
  private float jqu;
  private ViewPager kqK;
  int lNQ;
  private b lUk;
  LinkedList<a> lUl;
  aj lUm;
  private float lUn;
  private Context mContext;
  
  public GameBannerView(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
    GMTrace.i(12764240150528L, 95101);
    this.lNQ = 0;
    this.lUm = new aj(new aj.a()
    {
      public final boolean pM()
      {
        GMTrace.i(12720082518016L, 94772);
        if ((GameBannerView.a(GameBannerView.this) != null) && (GameBannerView.b(GameBannerView.this).size() > 1))
        {
          GameBannerView.a(GameBannerView.this).c(GameBannerView.a(GameBannerView.this).xI + 1, true);
          GMTrace.o(12720082518016L, 94772);
          return true;
        }
        GameBannerView.c(GameBannerView.this).stopTimer();
        GMTrace.o(12720082518016L, 94772);
        return false;
      }
    }, true);
    this.lUn = 0.0F;
    this.jqu = 0.0F;
    this.mContext = paramContext;
    inflate(paramContext, R.i.cyf, this);
    this.lUl = new LinkedList();
    GMTrace.o(12764240150528L, 95101);
  }
  
  private void fa(boolean paramBoolean)
  {
    GMTrace.i(12765179674624L, 95108);
    ViewParent localViewParent = getParent();
    if (localViewParent != null) {
      localViewParent.requestDisallowInterceptTouchEvent(paramBoolean);
    }
    GMTrace.o(12765179674624L, 95108);
  }
  
  public final void R(LinkedList<a> paramLinkedList)
  {
    GMTrace.i(12764508585984L, 95103);
    if ((paramLinkedList == null) || (paramLinkedList.size() == 0))
    {
      w.e("MicroMsg.GameBannerView", "Empty banner list");
      setVisibility(8);
      GMTrace.o(12764508585984L, 95103);
      return;
    }
    w.i("MicroMsg.GameBannerView", "bannerList size", new Object[] { Integer.valueOf(paramLinkedList.size()) });
    this.lUm.stopTimer();
    this.lUl.clear();
    this.lUl.addAll(paramLinkedList);
    this.kqK.a(this.lUk);
    this.kqK.c(paramLinkedList.size() * 1000, false);
    if (this.lUl.size() > 1) {
      this.lUm.z(5000L, 5000L);
    }
    this.iPE.setVisibility(8);
    setVisibility(0);
    GMTrace.o(12764508585984L, 95103);
  }
  
  public final void V(int paramInt)
  {
    GMTrace.i(12764911239168L, 95106);
    int i = paramInt % this.lUl.size();
    w.i("MicroMsg.GameBannerView", "now selected page %d, now exactly positon : %d", new Object[] { Integer.valueOf(paramInt), Integer.valueOf(i) });
    if ((((a)this.lUl.get(i)).lUp != null) && (at.AU())) {
      ai.a(this.mContext, 11, 1101, i + 1, 1, this.lNQ, null);
    }
    GMTrace.o(12764911239168L, 95106);
  }
  
  public final void W(int paramInt)
  {
    GMTrace.i(12764642803712L, 95104);
    GMTrace.o(12764642803712L, 95104);
  }
  
  public final void a(int paramInt1, float paramFloat, int paramInt2)
  {
    GMTrace.i(12764777021440L, 95105);
    GMTrace.o(12764777021440L, 95105);
  }
  
  public void onClick(View paramView)
  {
    GMTrace.i(12765313892352L, 95109);
    if (!(paramView.getTag() instanceof a))
    {
      GMTrace.o(12765313892352L, 95109);
      return;
    }
    Object localObject = (a)paramView.getTag();
    paramView = ((a)localObject).lUp;
    if (!bg.nm(((a)localObject).lLy))
    {
      paramView = ((a)localObject).lLy;
      i = c.aa(this.mContext, paramView);
      ai.a(this.mContext, 11, 1101, 1, i, this.lNQ, null);
      GMTrace.o(12765313892352L, 95109);
      return;
    }
    w.i("MicroMsg.GameBannerView", "null or nil url");
    localObject = new Bundle();
    ((Bundle)localObject).putCharSequence("game_app_id", paramView.field_appId);
    ((Bundle)localObject).putInt("game_report_from_scene", 5);
    int i = c.a(this.mContext, paramView.field_appId, null, (Bundle)localObject);
    ai.a(this.mContext, 11, 1101, 1, i, this.lNQ, null);
    GMTrace.o(12765313892352L, 95109);
  }
  
  protected void onFinishInflate()
  {
    GMTrace.i(12764374368256L, 95102);
    super.onFinishInflate();
    this.iPE = ((MMDotView)findViewById(R.h.bCA));
    this.kqK = ((ViewPager)findViewById(R.h.bCB));
    this.kqK.yr = this;
    this.lUk = new b();
    GMTrace.o(12764374368256L, 95102);
  }
  
  public boolean onInterceptTouchEvent(MotionEvent paramMotionEvent)
  {
    GMTrace.i(12765045456896L, 95107);
    int i = paramMotionEvent.getAction();
    float f1 = paramMotionEvent.getRawX();
    float f2 = paramMotionEvent.getRawY();
    switch (i)
    {
    default: 
      switch (paramMotionEvent.getAction())
      {
      }
      break;
    }
    for (;;)
    {
      boolean bool = super.onInterceptTouchEvent(paramMotionEvent);
      GMTrace.o(12765045456896L, 95107);
      return bool;
      this.lUn = f1;
      this.jqu = f2;
      break;
      i = (int)(f1 - this.lUn);
      int j = (int)(f2 - this.jqu);
      if (Math.abs(i) <= Math.abs(j)) {
        break;
      }
      fa(true);
      break;
      fa(false);
      this.lUn = 0.0F;
      this.jqu = 0.0F;
      break;
      this.lUm.stopTimer();
      continue;
      this.lUm.z(5000L, 5000L);
    }
  }
  
  public static final class a
  {
    public String grD;
    public int index;
    public String lLy;
    public f lUp;
    
    public a()
    {
      GMTrace.i(12673374748672L, 94424);
      GMTrace.o(12673374748672L, 94424);
    }
  }
  
  private final class b
    extends u
  {
    public b()
    {
      GMTrace.i(12776722399232L, 95194);
      GMTrace.o(12776722399232L, 95194);
    }
    
    public final void a(ViewGroup paramViewGroup, int paramInt, Object paramObject)
    {
      GMTrace.i(12776856616960L, 95195);
      int i = GameBannerView.b(GameBannerView.this).size();
      paramViewGroup.removeView((View)paramObject);
      w.i("MicroMsg.GameBannerView", "destroyItem : new positon = %d, now position = %d", new Object[] { Integer.valueOf(paramInt % i), Integer.valueOf(paramInt) });
      GMTrace.o(12776856616960L, 95195);
    }
    
    public final boolean a(View paramView, Object paramObject)
    {
      GMTrace.i(12777259270144L, 95198);
      if (paramView == paramObject)
      {
        GMTrace.o(12777259270144L, 95198);
        return true;
      }
      GMTrace.o(12777259270144L, 95198);
      return false;
    }
    
    public final Object b(ViewGroup paramViewGroup, int paramInt)
    {
      GMTrace.i(12776990834688L, 95196);
      int i = paramInt % GameBannerView.b(GameBannerView.this).size();
      View localView = View.inflate(GameBannerView.d(GameBannerView.this), R.i.cyg, null);
      localView.setTag(GameBannerView.b(GameBannerView.this).get(i));
      localView.setOnClickListener(GameBannerView.this);
      ImageView localImageView = (ImageView)localView.findViewById(R.h.bCC);
      String str = ((GameBannerView.a)GameBannerView.b(GameBannerView.this).get(i)).grD;
      Drawable localDrawable = localImageView.getDrawable();
      if ((localDrawable != null) && ((localDrawable instanceof i))) {
        ((i)localDrawable).setUrl(str);
      }
      try
      {
        for (;;)
        {
          paramViewGroup.addView(localView, 0);
          w.i("MicroMsg.GameBannerView", "instantiateItem : new positon = %d, now position = %d", new Object[] { Integer.valueOf(i), Integer.valueOf(paramInt) });
          GMTrace.o(12776990834688L, 95196);
          return localView;
          localImageView.setImageDrawable(new i(str, (byte)0));
        }
      }
      catch (Exception paramViewGroup)
      {
        for (;;)
        {
          w.e("MicroMsg.GameBannerView", "add view failed, " + paramViewGroup.getMessage());
        }
      }
    }
    
    public final int getCount()
    {
      GMTrace.i(12777125052416L, 95197);
      if (GameBannerView.b(GameBannerView.this).size() <= 1)
      {
        i = GameBannerView.b(GameBannerView.this).size();
        GMTrace.o(12777125052416L, 95197);
        return i;
      }
      int i = GameBannerView.b(GameBannerView.this).size();
      GMTrace.o(12777125052416L, 95197);
      return i * 1000 * 2;
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\plugin\game\ui\GameBannerView.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */