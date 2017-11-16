package com.tencent.mm.ui.base.preference;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.v.a.g;
import com.tencent.mm.v.a.h;
import com.tencent.mm.v.a.m;

public final class PluginTextPreference
  extends Preference
{
  private TextView jPE;
  private ImageView nNH;
  private String text;
  private int textColor;
  public int visibility;
  public int wkU;
  
  public PluginTextPreference(Context paramContext)
  {
    this(paramContext, null);
    GMTrace.i(3224044044288L, 24021);
    GMTrace.o(3224044044288L, 24021);
  }
  
  public PluginTextPreference(Context paramContext, AttributeSet paramAttributeSet)
  {
    this(paramContext, paramAttributeSet, 0);
    GMTrace.i(3224178262016L, 24022);
    GMTrace.o(3224178262016L, 24022);
  }
  
  public PluginTextPreference(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
    GMTrace.i(3224312479744L, 24023);
    this.nNH = null;
    this.jPE = null;
    setLayoutResource(a.h.gfu);
    paramContext = paramContext.obtainStyledAttributes(paramAttributeSet, a.m.enU);
    this.wkU = paramContext.getResourceId(a.m.ggX, 0);
    this.text = paramContext.getString(a.m.ggY);
    this.textColor = paramContext.getColor(a.m.ggZ, -7039852);
    paramContext.recycle();
    GMTrace.o(3224312479744L, 24023);
  }
  
  public final void Cu(int paramInt)
  {
    GMTrace.i(3224446697472L, 24024);
    this.text = this.mContext.getString(paramInt);
    GMTrace.o(3224446697472L, 24024);
  }
  
  protected final void onBindView(View paramView)
  {
    GMTrace.i(3224580915200L, 24025);
    super.onBindView(paramView);
    this.nNH = ((ImageView)paramView.findViewById(a.g.bGN));
    this.nNH.setImageResource(this.wkU);
    this.nNH.setVisibility(this.visibility);
    this.jPE = ((TextView)paramView.findViewById(a.g.cgP));
    this.jPE.setText(this.text);
    this.jPE.setTextColor(this.textColor);
    GMTrace.o(3224580915200L, 24025);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\ui\base\preference\PluginTextPreference.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */