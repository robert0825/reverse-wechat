package com.tencent.mm.plugin.wenote.ui.nativenote.b;

import android.view.View;
import android.view.View.OnClickListener;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout.LayoutParams;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.R.h;
import com.tencent.mm.plugin.wenote.model.a.b;
import com.tencent.mm.plugin.wenote.model.nativenote.manager.WXRTEditText;
import com.tencent.mm.plugin.wenote.model.nativenote.manager.k;

public final class j
  extends h
{
  private View sjP;
  
  public j(View paramView, k paramk)
  {
    super(paramView, paramk);
    GMTrace.i(20582959677440L, 153355);
    this.sjw.setVisibility(8);
    this.eId.setVisibility(8);
    this.sjB.setVisibility(8);
    this.sjw.setOnClickListener(null);
    this.sjC.setOnClickListener(new View.OnClickListener()
    {
      public final void onClick(View paramAnonymousView)
      {
        GMTrace.i(20585241378816L, 153372);
        j.this.sjv.bHJ();
        j.this.sjv.requestFocus();
        GMTrace.o(20585241378816L, 153372);
      }
    });
    GMTrace.o(20582959677440L, 153355);
  }
  
  public final void a(b paramb, int paramInt1, int paramInt2)
  {
    GMTrace.i(20583093895168L, 153356);
    super.a(paramb, paramInt1, paramInt2);
    if (paramb.getType() != -1)
    {
      GMTrace.o(20583093895168L, 153356);
      return;
    }
    paramb = (RelativeLayout.LayoutParams)this.sjD.getLayoutParams();
    paramb.bottomMargin = 0;
    paramb.topMargin = 0;
    this.sjD.setLayoutParams(paramb);
    this.sjC.setVisibility(0);
    this.sjP = this.UU.findViewById(R.h.bRK);
    GMTrace.o(20583093895168L, 153356);
  }
  
  public final int bIG()
  {
    GMTrace.i(20583228112896L, 153357);
    GMTrace.o(20583228112896L, 153357);
    return -1;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\plugin\wenote\ui\nativenote\b\j.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */