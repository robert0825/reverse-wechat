package com.tencent.mm.plugin.setting.ui.setting;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.R.h;
import com.tencent.mm.R.i;
import com.tencent.mm.ui.base.preference.Preference;

public final class PluginEmptyTextPreference
  extends Preference
{
  private Context context;
  private TextView jPE;
  private String text;
  
  public PluginEmptyTextPreference(Context paramContext, int paramInt)
  {
    this(paramContext, null, 0);
    GMTrace.i(4660307951616L, 34722);
    this.text = paramContext.getString(paramInt);
    GMTrace.o(4660307951616L, 34722);
  }
  
  public PluginEmptyTextPreference(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
    GMTrace.i(4660442169344L, 34723);
    this.jPE = null;
    this.context = paramContext;
    setLayoutResource(R.i.cDo);
    GMTrace.o(4660442169344L, 34723);
  }
  
  protected final void onBindView(View paramView)
  {
    GMTrace.i(4660710604800L, 34725);
    super.onBindView(paramView);
    this.jPE = ((TextView)paramView.findViewById(R.h.bwM));
    this.jPE.setText(this.text);
    GMTrace.o(4660710604800L, 34725);
  }
  
  protected final View onCreateView(ViewGroup paramViewGroup)
  {
    GMTrace.i(4660576387072L, 34724);
    paramViewGroup = super.onCreateView(paramViewGroup);
    View.inflate(this.context, R.i.cDo, null);
    GMTrace.o(4660576387072L, 34724);
    return paramViewGroup;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\plugin\setting\ui\setting\PluginEmptyTextPreference.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */