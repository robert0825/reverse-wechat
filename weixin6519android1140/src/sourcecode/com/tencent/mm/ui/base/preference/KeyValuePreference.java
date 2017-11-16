package com.tencent.mm.ui.base.preference;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewGroup.LayoutParams;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.LinearLayout.LayoutParams;
import android.widget.TextView;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.br.a;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.v.a.e;
import com.tencent.mm.v.a.g;
import com.tencent.mm.v.a.h;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class KeyValuePreference
  extends Preference
{
  private TextView nNG;
  public String vKN;
  private Drawable wkn;
  public boolean wko;
  private boolean wkp;
  private boolean wkq;
  public boolean wkr;
  private int wks;
  public int wkt;
  public int wku;
  private ImageView wkv;
  public Drawable wkw;
  public List<View> wkx;
  
  public KeyValuePreference(Context paramContext)
  {
    this(paramContext, null);
    GMTrace.i(3227667922944L, 24048);
    GMTrace.o(3227667922944L, 24048);
  }
  
  public KeyValuePreference(Context paramContext, AttributeSet paramAttributeSet)
  {
    this(paramContext, paramAttributeSet, 0);
    GMTrace.i(3227802140672L, 24049);
    GMTrace.o(3227802140672L, 24049);
  }
  
  public KeyValuePreference(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
    GMTrace.i(3227936358400L, 24050);
    this.wkn = null;
    this.wko = true;
    this.wkp = false;
    this.vKN = null;
    this.wkq = false;
    this.wkr = false;
    this.wks = 17;
    this.wkt = 17;
    this.wku = 0;
    this.wkv = null;
    this.wkw = null;
    this.wkx = new LinkedList();
    setLayoutResource(a.h.cBA);
    GMTrace.o(3227936358400L, 24050);
  }
  
  public final void caY()
  {
    GMTrace.i(3228473229312L, 24054);
    this.wkq = true;
    this.wks = 49;
    GMTrace.o(3228473229312L, 24054);
  }
  
  public final void lP(boolean paramBoolean)
  {
    GMTrace.i(3228339011584L, 24053);
    this.wkp = paramBoolean;
    if (this.wkp) {
      setWidgetLayoutResource(a.h.cCj);
    }
    GMTrace.o(3228339011584L, 24053);
  }
  
  public void onBindView(View paramView)
  {
    GMTrace.i(3228204793856L, 24052);
    super.onBindView(paramView);
    this.nNG = ((TextView)paramView.findViewById(16908304));
    this.nNG.setSingleLine(this.wko);
    if (this.wkp) {
      setWidgetLayoutResource(a.h.cCj);
    }
    Object localObject2;
    if (this.wkr)
    {
      localObject2 = (LinearLayout)paramView.findViewById(a.g.brL);
      localObject1 = (LinearLayout.LayoutParams)((LinearLayout)localObject2).getLayoutParams();
      ((LinearLayout.LayoutParams)localObject1).width = -1;
      ((LinearLayout)localObject2).setLayoutParams((ViewGroup.LayoutParams)localObject1);
      localObject2 = (LinearLayout)paramView.findViewById(a.g.ged);
      ((LinearLayout)localObject2).setLayoutParams((ViewGroup.LayoutParams)localObject1);
      ((LinearLayout)localObject2).getChildAt(0).setLayoutParams((ViewGroup.LayoutParams)localObject1);
      this.nNG.setGravity(this.wkt);
    }
    Object localObject1 = (TextView)paramView.findViewById(16908310);
    if (!bg.nm(this.vKN)) {
      ((TextView)localObject1).setText(this.vKN);
    }
    if (localObject1 != null)
    {
      localObject2 = ((TextView)localObject1).getLayoutParams();
      ((ViewGroup.LayoutParams)localObject2).width = a.V(this.mContext, a.e.aQg);
      ((TextView)localObject1).setLayoutParams((ViewGroup.LayoutParams)localObject2);
    }
    if (this.wkn != null) {
      ((ImageView)paramView.findViewById(a.g.gdn)).setImageDrawable(this.wkn);
    }
    this.wkv = ((ImageView)paramView.findViewById(a.g.bGN));
    if (this.wkw != null)
    {
      this.wkv.setVisibility(this.wku);
      this.wkv.setImageDrawable(this.wkw);
    }
    for (;;)
    {
      if (this.wkq)
      {
        localObject1 = (LinearLayout)paramView.findViewById(a.g.brL);
        if (localObject1 != null) {
          ((LinearLayout)localObject1).setGravity(this.wks);
        }
      }
      if (this.wkx.size() <= 0) {
        break;
      }
      paramView = (LinearLayout)paramView.findViewById(a.g.ged);
      paramView.removeAllViews();
      localObject1 = this.wkx.iterator();
      while (((Iterator)localObject1).hasNext())
      {
        localObject2 = (View)((Iterator)localObject1).next();
        ViewGroup localViewGroup = (ViewGroup)((View)localObject2).getParent();
        if (localViewGroup != null) {
          localViewGroup.removeView((View)localObject2);
        }
        paramView.addView((View)localObject2);
      }
      this.wkv.setVisibility(8);
    }
    GMTrace.o(3228204793856L, 24052);
  }
  
  public View onCreateView(ViewGroup paramViewGroup)
  {
    GMTrace.i(3228070576128L, 24051);
    paramViewGroup = super.onCreateView(paramViewGroup);
    LayoutInflater localLayoutInflater = (LayoutInflater)this.mContext.getSystemService("layout_inflater");
    ViewGroup localViewGroup = (ViewGroup)paramViewGroup.findViewById(a.g.content);
    localViewGroup.removeAllViews();
    localLayoutInflater.inflate(a.h.gft, localViewGroup);
    GMTrace.o(3228070576128L, 24051);
    return paramViewGroup;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\ui\base\preference\KeyValuePreference.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */