package com.tencent.mm.plugin.webview.ui.tools.game.menu;

import android.content.Context;
import android.content.res.Resources;
import android.database.DataSetObserver;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.LinearLayout;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.R.h;
import com.tencent.mm.R.i;
import com.tencent.mm.ui.base.o;

public class GameMenuView
  extends LinearLayout
{
  private LayoutInflater CJ;
  private Context mContext;
  f rRA;
  b.c rRB;
  b.a rRC;
  private boolean rRs;
  private View rRx;
  private LinearLayout rRy;
  private LinearLayout rRz;
  
  public GameMenuView(Context paramContext)
  {
    super(paramContext, null);
    GMTrace.i(18080335921152L, 134709);
    this.rRs = false;
    this.mContext = paramContext;
    this.CJ = LayoutInflater.from(this.mContext);
    paramContext = this.mContext.getResources().getDisplayMetrics();
    if (paramContext.widthPixels > paramContext.heightPixels) {
      bool = true;
    }
    this.rRs = bool;
    MP();
    GMTrace.o(18080335921152L, 134709);
  }
  
  public GameMenuView(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet, 0);
    GMTrace.i(18080470138880L, 134710);
    this.rRs = false;
    this.mContext = paramContext;
    MP();
    GMTrace.o(18080470138880L, 134710);
  }
  
  private void MP()
  {
    GMTrace.i(18080604356608L, 134711);
    if (this.rRs)
    {
      setOrientation(0);
      this.CJ.inflate(R.i.czb, this, true);
    }
    for (View localView = this.CJ.inflate(R.i.cyY, this, true);; localView = this.CJ.inflate(R.i.cyZ, this, true))
    {
      this.rRx = localView.findViewById(R.h.bEz);
      this.rRy = ((LinearLayout)localView.findViewById(R.h.bEy));
      this.rRz = ((LinearLayout)localView.findViewById(R.h.bEA));
      GMTrace.o(18080604356608L, 134711);
      return;
      setOrientation(1);
      this.CJ.inflate(R.i.czc, this, true);
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\plugin\webview\ui\tools\game\menu\GameMenuView.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */