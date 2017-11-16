package com.tencent.mm.ui.tools;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.R.h;
import com.tencent.mm.R.i;
import com.tencent.mm.R.k;
import com.tencent.mm.R.l;
import com.tencent.mm.platformtools.t;
import com.tencent.mm.storage.RegionCodeDecoder.Region;
import com.tencent.mm.ui.base.preference.Preference;

public class ZoneRecommandPreference
  extends Preference
{
  private TextView hql;
  int status;
  RegionCodeDecoder.Region xka;
  RegionCodeDecoder.Region xkb;
  RegionCodeDecoder.Region xkc;
  private TextView xkd;
  private ImageView xke;
  
  public ZoneRecommandPreference(Context paramContext)
  {
    this(paramContext, null);
    GMTrace.i(1917971333120L, 14290);
    GMTrace.o(1917971333120L, 14290);
  }
  
  public ZoneRecommandPreference(Context paramContext, AttributeSet paramAttributeSet)
  {
    this(paramContext, paramAttributeSet, 0);
    GMTrace.i(1918105550848L, 14291);
    GMTrace.o(1918105550848L, 14291);
  }
  
  public ZoneRecommandPreference(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
    GMTrace.i(1918239768576L, 14292);
    this.status = 0;
    setLayoutResource(R.i.cBA);
    GMTrace.o(1918239768576L, 14292);
  }
  
  final void ciA()
  {
    GMTrace.i(1918642421760L, 14295);
    if ((this.xkd == null) || (this.hql == null))
    {
      GMTrace.o(1918642421760L, 14295);
      return;
    }
    switch (this.status)
    {
    }
    for (;;)
    {
      GMTrace.o(1918642421760L, 14295);
      return;
      this.xkd.setVisibility(8);
      this.hql.setVisibility(0);
      this.hql.setText(R.l.dYk);
      this.xke.setImageResource(R.k.cML);
      setEnabled(false);
      setSelectable(false);
      GMTrace.o(1918642421760L, 14295);
      return;
      this.xkd.setVisibility(8);
      this.hql.setVisibility(0);
      this.hql.setText(R.l.dYh);
      this.xke.setImageResource(R.k.cMK);
      setEnabled(false);
      setSelectable(false);
      GMTrace.o(1918642421760L, 14295);
      return;
      this.xkd.setVisibility(0);
      this.hql.setVisibility(8);
      this.xke.setImageResource(R.k.cML);
      Object localObject2 = "";
      Object localObject1 = localObject2;
      if (this.xka != null)
      {
        localObject1 = localObject2;
        if (!t.nm(this.xka.getName())) {
          localObject1 = "" + this.xka.getName();
        }
      }
      localObject2 = localObject1;
      if (this.xkb != null)
      {
        localObject2 = localObject1;
        if (!t.nm(this.xkb.getName())) {
          localObject2 = (String)localObject1 + " " + this.xkb.getName();
        }
      }
      localObject1 = localObject2;
      if (this.xkc != null)
      {
        localObject1 = localObject2;
        if (!t.nm(this.xkc.getName())) {
          localObject1 = (String)localObject2 + " " + this.xkc.getName();
        }
      }
      this.xkd.setText((CharSequence)localObject1);
      setEnabled(true);
      setSelectable(true);
    }
  }
  
  public final void ciB()
  {
    GMTrace.i(1918776639488L, 14296);
    this.status = 2;
    ciA();
    GMTrace.o(1918776639488L, 14296);
  }
  
  protected final void onBindView(View paramView)
  {
    GMTrace.i(1918508204032L, 14294);
    super.onBindView(paramView);
    ciA();
    GMTrace.o(1918508204032L, 14294);
  }
  
  protected final View onCreateView(ViewGroup paramViewGroup)
  {
    GMTrace.i(1918373986304L, 14293);
    paramViewGroup = super.onCreateView(paramViewGroup);
    LayoutInflater localLayoutInflater = (LayoutInflater)this.mContext.getSystemService("layout_inflater");
    ViewGroup localViewGroup = (ViewGroup)paramViewGroup.findViewById(R.h.content);
    localViewGroup.removeAllViews();
    localLayoutInflater.inflate(R.i.cBX, localViewGroup);
    this.xkd = ((TextView)paramViewGroup.findViewById(R.h.coO));
    this.hql = ((TextView)paramViewGroup.findViewById(R.h.status));
    this.xke = ((ImageView)paramViewGroup.findViewById(R.h.cfO));
    GMTrace.o(1918373986304L, 14293);
    return paramViewGroup;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\ui\tools\ZoneRecommandPreference.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */