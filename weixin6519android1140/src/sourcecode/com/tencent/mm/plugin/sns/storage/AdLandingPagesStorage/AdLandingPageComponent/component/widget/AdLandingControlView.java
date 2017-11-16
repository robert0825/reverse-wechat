package com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.ImageView;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.plugin.sns.i.f;
import com.tencent.mm.ui.base.MMPageControlView;
import java.util.Map;

public class AdLandingControlView
  extends MMPageControlView
{
  public AdLandingControlView(Context paramContext)
  {
    super(paramContext);
    GMTrace.i(8227009855488L, 61296);
    GMTrace.o(8227009855488L, 61296);
  }
  
  public AdLandingControlView(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
    GMTrace.i(8227144073216L, 61297);
    GMTrace.o(8227144073216L, 61297);
  }
  
  protected final void uN(int paramInt)
  {
    GMTrace.i(8227278290944L, 61298);
    removeAllViews();
    if (paramInt >= this.count)
    {
      GMTrace.o(8227278290944L, 61298);
      return;
    }
    int j = this.count;
    int i = 0;
    if (i < j)
    {
      this.eId = null;
      if (paramInt == i)
      {
        if (this.map.size() > i) {
          this.eId = ((ImageView)this.map.get(Integer.valueOf(i)));
        }
        if (this.eId == null)
        {
          this.eId = ((ImageView)View.inflate(this.context, this.wdF, null).findViewById(i.f.gdE));
          this.map.put(Integer.valueOf(i), this.eId);
        }
        this.eId.setSelected(true);
      }
      for (;;)
      {
        addView(this.eId);
        i += 1;
        break;
        if (this.map.size() > i) {
          this.eId = ((ImageView)this.map.get(Integer.valueOf(i)));
        }
        if (this.eId == null)
        {
          this.eId = ((ImageView)View.inflate(this.context, this.wdF, null).findViewById(i.f.gdE));
          this.map.put(Integer.valueOf(i), this.eId);
        }
        this.eId.setSelected(false);
      }
    }
    GMTrace.o(8227278290944L, 61298);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\plugin\sns\storage\AdLandingPagesStorage\AdLandingPageComponent\component\widget\AdLandingControlView.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */