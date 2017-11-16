package com.tencent.mm.plugin.card.ui.view;

import android.content.res.Resources;
import android.view.View;
import android.view.ViewStub;
import android.widget.LinearLayout;
import android.widget.LinearLayout.LayoutParams;
import android.widget.TextView;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.R.f;
import com.tencent.mm.R.h;
import com.tencent.mm.plugin.card.base.b;
import com.tencent.mm.plugin.card.ui.a.g;
import com.tencent.mm.plugin.card.ui.n;
import com.tencent.mm.protocal.c.jm;
import com.tencent.mm.protocal.c.np;
import com.tencent.mm.ui.MMActivity;

public final class z
  extends i
{
  private View jKV;
  
  public z()
  {
    GMTrace.i(4997999755264L, 37238);
    GMTrace.o(4997999755264L, 37238);
  }
  
  public final void MP()
  {
    GMTrace.i(4998133972992L, 37239);
    GMTrace.o(4998133972992L, 37239);
  }
  
  public final void amM()
  {
    GMTrace.i(4998402408448L, 37241);
    if (this.jKV != null) {
      this.jKV.setVisibility(8);
    }
    GMTrace.o(4998402408448L, 37241);
  }
  
  public final void update()
  {
    GMTrace.i(4998268190720L, 37240);
    if (this.jKV == null) {
      this.jKV = ((ViewStub)findViewById(R.h.blH)).inflate();
    }
    np localnp = this.jKl.alv().ajw().tZk;
    if (this.jKV != null)
    {
      ((TextView)this.jKV.findViewById(R.h.cgY)).setText(localnp.title);
      ((TextView)this.jKV.findViewById(R.h.cgX)).setText(localnp.jxI);
      if ((!this.jKl.alA().amf()) || (!this.jKl.alA().amg())) {}
      for (int i = 1; i != 0; i = 0)
      {
        ((LinearLayout.LayoutParams)((LinearLayout)this.jKV).getLayoutParams()).bottomMargin = 0;
        GMTrace.o(4998268190720L, 37240);
        return;
      }
      ((LinearLayout.LayoutParams)((LinearLayout)this.jKV).getLayoutParams()).bottomMargin = this.jKl.aly().getResources().getDimensionPixelSize(R.f.aQK);
    }
    GMTrace.o(4998268190720L, 37240);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\plugin\card\ui\view\z.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */