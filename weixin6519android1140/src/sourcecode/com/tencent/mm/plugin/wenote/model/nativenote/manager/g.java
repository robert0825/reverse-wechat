package com.tencent.mm.plugin.wenote.model.nativenote.manager;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.MeasureSpec;
import android.view.View.OnClickListener;
import android.widget.PopupWindow;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.R.h;
import com.tencent.mm.R.i;

public final class g
{
  public View mParentView;
  public PopupWindow sex;
  public a sey;
  
  public g(Context paramContext, View paramView)
  {
    GMTrace.i(17223624163328L, 128326);
    this.mParentView = paramView;
    paramContext = LayoutInflater.from(paramContext).inflate(R.i.cIc, null);
    paramContext.measure(View.MeasureSpec.makeMeasureSpec(0, 0), View.MeasureSpec.makeMeasureSpec(0, 0));
    this.sex = new PopupWindow(paramContext, -2, -2, false);
    this.sex.setClippingEnabled(false);
    paramContext.findViewById(R.h.cov).setOnClickListener(new View.OnClickListener()
    {
      public final void onClick(View paramAnonymousView)
      {
        GMTrace.i(17226174300160L, 128345);
        g.this.sex.dismiss();
        g.this.mParentView.setVisibility(8);
        if (g.this.sey != null) {
          g.this.sey.bHD();
        }
        GMTrace.o(17226174300160L, 128345);
      }
    });
    paramContext.findViewById(R.h.cos).setOnClickListener(new View.OnClickListener()
    {
      public final void onClick(View paramAnonymousView)
      {
        GMTrace.i(17231811444736L, 128387);
        g.this.sex.dismiss();
        g.this.mParentView.setVisibility(8);
        if (g.this.sey != null) {
          g.this.sey.bHE();
        }
        GMTrace.o(17231811444736L, 128387);
      }
    });
    paramContext.findViewById(R.h.cou).setOnClickListener(new View.OnClickListener()
    {
      public final void onClick(View paramAnonymousView)
      {
        GMTrace.i(17225905864704L, 128343);
        g.this.sex.dismiss();
        g.this.mParentView.setVisibility(8);
        if (g.this.sey != null) {
          g.this.sey.bHF();
        }
        GMTrace.o(17225905864704L, 128343);
      }
    });
    paramContext.findViewById(R.h.coB).setOnClickListener(new View.OnClickListener()
    {
      public final void onClick(View paramAnonymousView)
      {
        GMTrace.i(17225637429248L, 128341);
        g.this.sex.dismiss();
        g.this.mParentView.setVisibility(8);
        if (g.this.sey != null) {
          g.this.sey.bHG();
        }
        GMTrace.o(17225637429248L, 128341);
      }
    });
    GMTrace.o(17223624163328L, 128326);
  }
  
  public static abstract interface a
  {
    public abstract void bHD();
    
    public abstract void bHE();
    
    public abstract void bHF();
    
    public abstract void bHG();
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\plugin\wenote\model\nativenote\manager\g.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */