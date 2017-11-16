package com.tencent.mm.ui.base.preference;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.ImageView;
import android.widget.TextView;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.v.a.g;
import com.tencent.mm.v.a.h;

public class PreferenceInfoCategory
  extends Preference
{
  public int vLA;
  public View.OnClickListener wll;
  public View.OnClickListener wlm;
  
  public PreferenceInfoCategory(Context paramContext, AttributeSet paramAttributeSet)
  {
    this(paramContext, paramAttributeSet, 0);
    GMTrace.i(3238539558912L, 24129);
    GMTrace.o(3238539558912L, 24129);
  }
  
  public PreferenceInfoCategory(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
    GMTrace.i(3238673776640L, 24130);
    this.wll = null;
    this.wlm = null;
    this.vLA = 0;
    setLayoutResource(a.h.gfB);
    GMTrace.o(3238673776640L, 24130);
  }
  
  protected final void onBindView(View paramView)
  {
    GMTrace.i(3238807994368L, 24131);
    super.onBindView(paramView);
    TextView localTextView = (TextView)paramView.findViewById(16908310);
    if (localTextView == null)
    {
      GMTrace.o(3238807994368L, 24131);
      return;
    }
    if ((getTitle() == null) || (getTitle().length() <= 0)) {
      localTextView.setVisibility(8);
    }
    for (;;)
    {
      paramView = (ImageView)paramView.findViewById(a.g.gcU);
      paramView.setOnClickListener(this.wll);
      if (this.vLA <= 0) {
        break;
      }
      paramView.setImageResource(this.vLA);
      paramView.setVisibility(0);
      GMTrace.o(3238807994368L, 24131);
      return;
      localTextView.setVisibility(0);
      localTextView.setText(getTitle());
      localTextView.setOnClickListener(this.wlm);
    }
    paramView.setVisibility(8);
    GMTrace.o(3238807994368L, 24131);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\ui\base\preference\PreferenceInfoCategory.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */