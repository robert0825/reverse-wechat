package com.tencent.mm.plugin.favorite.ui.base;

import android.content.Context;
import android.content.Intent;
import android.util.AttributeSet;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.LinearLayout;
import android.widget.LinearLayout.LayoutParams;
import android.widget.TextView;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.R.h;
import com.tencent.mm.R.i;
import com.tencent.mm.R.l;
import com.tencent.mm.bj.d;
import com.tencent.mm.plugin.favorite.b.x;

public class FavCapacityPanel
  extends LinearLayout
{
  private LinearLayout lgp;
  public long lgq;
  public TextView lgr;
  public int lgs;
  public long lgt;
  private View.OnClickListener lgu;
  
  public FavCapacityPanel(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
    GMTrace.i(6456141152256L, 48102);
    this.lgs = 0;
    this.lgu = new View.OnClickListener()
    {
      public final void onClick(View paramAnonymousView)
      {
        GMTrace.i(6457080676352L, 48109);
        paramAnonymousView = new Intent();
        if (FavCapacityPanel.this.lgs == 0) {
          paramAnonymousView.putExtra("key_enter_fav_cleanui_from", 1);
        }
        for (;;)
        {
          d.b(FavCapacityPanel.this.getContext(), "favorite", ".ui.FavCleanUI", paramAnonymousView);
          GMTrace.o(6457080676352L, 48109);
          return;
          paramAnonymousView.putExtra("key_enter_fav_cleanui_from", 2);
        }
      }
    };
    this.lgp = this;
    paramContext = View.inflate(getContext(), R.i.cwI, null);
    paramContext.measure(-2, -2);
    paramAttributeSet = paramContext.findViewById(R.h.byA);
    View localView = paramContext.findViewById(R.h.byB);
    this.lgr = ((TextView)paramContext.findViewById(R.h.byz));
    LinearLayout.LayoutParams localLayoutParams = (LinearLayout.LayoutParams)paramAttributeSet.getLayoutParams();
    localLayoutParams.width = paramContext.getMeasuredWidth();
    paramAttributeSet.setLayoutParams(localLayoutParams);
    localView.setOnClickListener(this.lgu);
    paramAttributeSet = new LinearLayout.LayoutParams(0, -2);
    paramAttributeSet.weight = 1.0F;
    this.lgp.addView(paramContext, paramAttributeSet);
    this.lgq = (x.aye() / 1048576L);
    this.lgt = (x.ayf() / 1048576L);
    paramContext = this.lgr;
    paramAttributeSet = this.lgr.getContext();
    int i = R.l.dsJ;
    if (this.lgt - this.lgq > 0L) {}
    for (long l = this.lgt - this.lgq;; l = 0L)
    {
      paramContext.setText(paramAttributeSet.getString(i, new Object[] { Long.valueOf(l), Long.valueOf(this.lgq) }));
      GMTrace.o(6456141152256L, 48102);
      return;
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\plugin\favorite\ui\base\FavCapacityPanel.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */