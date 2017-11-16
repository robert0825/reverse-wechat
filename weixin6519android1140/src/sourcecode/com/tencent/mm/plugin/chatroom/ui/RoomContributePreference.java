package com.tencent.mm.plugin.chatroom.ui;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.R.h;
import com.tencent.mm.R.i;
import com.tencent.mm.pluginsdk.ui.a.b;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.ui.base.MaskLayout;
import com.tencent.mm.ui.base.preference.Preference;

public class RoomContributePreference
  extends Preference
{
  private ImageView hqg;
  private MaskLayout jPC;
  private String jPD;
  
  public RoomContributePreference(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet, 0);
    GMTrace.i(9100767264768L, 67806);
    GMTrace.o(9100767264768L, 67806);
  }
  
  public RoomContributePreference(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
    GMTrace.i(9100901482496L, 67807);
    setLayoutResource(R.i.cBA);
    setWidgetLayoutResource(R.i.cCb);
    GMTrace.o(9100901482496L, 67807);
  }
  
  protected final void onBindView(View paramView)
  {
    GMTrace.i(9101169917952L, 67809);
    super.onBindView(paramView);
    if ((this.hqg != null) && (!bg.nm(this.jPD))) {
      a.b.a(this.hqg, this.jPD);
    }
    GMTrace.o(9101169917952L, 67809);
  }
  
  protected final View onCreateView(ViewGroup paramViewGroup)
  {
    GMTrace.i(9101035700224L, 67808);
    paramViewGroup = super.onCreateView(paramViewGroup);
    this.jPC = ((MaskLayout)paramViewGroup.findViewById(R.h.bGT));
    this.hqg = ((ImageView)paramViewGroup.findViewById(R.h.image));
    GMTrace.o(9101035700224L, 67808);
    return paramViewGroup;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\plugin\chatroom\ui\RoomContributePreference.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */