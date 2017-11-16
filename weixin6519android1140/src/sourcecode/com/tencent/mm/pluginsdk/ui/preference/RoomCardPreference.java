package com.tencent.mm.pluginsdk.ui.preference;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.R.h;
import com.tencent.mm.R.i;
import com.tencent.mm.ui.base.preference.Preference;

public class RoomCardPreference
  extends Preference
{
  public boolean eCg;
  public CharSequence hWo;
  private LinearLayout raU;
  private TextView tDw;
  public CharSequence tDx;
  
  public RoomCardPreference(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
    GMTrace.i(1038710996992L, 7739);
    this.eCg = false;
    GMTrace.o(1038710996992L, 7739);
  }
  
  public RoomCardPreference(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
    GMTrace.i(1038845214720L, 7740);
    this.eCg = false;
    setLayoutResource(R.i.cBA);
    GMTrace.o(1038845214720L, 7740);
  }
  
  protected final void onBindView(View paramView)
  {
    GMTrace.i(1039113650176L, 7742);
    super.onBindView(paramView);
    paramView = (ViewGroup)paramView.findViewById(R.h.content).findViewById(R.h.bXe);
    if (this.raU == null) {
      this.raU = ((LinearLayout)paramView.getChildAt(1));
    }
    if (this.tDw == null) {
      this.tDw = ((TextView)paramView.findViewById(R.h.bYW));
    }
    if (this.eCg)
    {
      this.raU.setVisibility(0);
      this.tDw.setVisibility(0);
    }
    for (;;)
    {
      if (this.tDx != null) {
        this.tDw.setText(this.tDx);
      }
      GMTrace.o(1039113650176L, 7742);
      return;
      this.raU.setVisibility(8);
      this.tDw.setVisibility(8);
    }
  }
  
  protected final View onCreateView(ViewGroup paramViewGroup)
  {
    GMTrace.i(1038979432448L, 7741);
    paramViewGroup = super.onCreateView(paramViewGroup);
    ViewGroup localViewGroup = (ViewGroup)paramViewGroup.findViewById(R.h.content);
    localViewGroup.removeAllViews();
    localViewGroup.setPadding(0, 0, 0, 0);
    View.inflate(this.mContext, R.i.cCh, localViewGroup);
    GMTrace.o(1038979432448L, 7741);
    return paramViewGroup;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\pluginsdk\ui\preference\RoomCardPreference.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */