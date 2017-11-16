package com.tencent.mm.ui.fts.widget;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View.OnClickListener;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.tencent.gmtrace.GMTrace;
import java.util.ArrayList;
import java.util.List;

public class FTSMainUIHotWordLayout
  extends LinearLayout
{
  private TextView hqH;
  protected View.OnClickListener oDx;
  protected List<LinearLayout> xde;
  protected int xdo;
  protected boolean xdp;
  public b xdq;
  
  public FTSMainUIHotWordLayout(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
    GMTrace.i(17921959002112L, 133529);
    this.xde = null;
    this.xdo = 2;
    this.xdp = true;
    this.hqH = null;
    this.xdq = null;
    MP();
    GMTrace.o(17921959002112L, 133529);
  }
  
  public FTSMainUIHotWordLayout(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
    GMTrace.i(17922093219840L, 133530);
    this.xde = null;
    this.xdo = 2;
    this.xdp = true;
    this.hqH = null;
    this.xdq = null;
    MP();
    GMTrace.o(17922093219840L, 133530);
  }
  
  private void MP()
  {
    GMTrace.i(17922227437568L, 133531);
    setOrientation(1);
    this.xde = new ArrayList();
    GMTrace.o(17922227437568L, 133531);
  }
  
  public final String chH()
  {
    GMTrace.i(17922764308480L, 133535);
    if ((this.xdq != null) && (this.xdq.hSv != null))
    {
      String str = this.xdq.hSv;
      GMTrace.o(17922764308480L, 133535);
      return str;
    }
    GMTrace.o(17922764308480L, 133535);
    return "";
  }
  
  public final void i(View.OnClickListener paramOnClickListener)
  {
    GMTrace.i(17922630090752L, 133534);
    this.oDx = paramOnClickListener;
    GMTrace.o(17922630090752L, 133534);
  }
  
  public void setVisibility(int paramInt)
  {
    GMTrace.i(17922898526208L, 133536);
    int i;
    if (this.xde.size() > 0)
    {
      i = 1;
      if (i == 0) {
        break label45;
      }
    }
    for (;;)
    {
      super.setVisibility(paramInt);
      GMTrace.o(17922898526208L, 133536);
      return;
      i = 0;
      break;
      label45:
      paramInt = 8;
    }
  }
  
  public static final class a
  {
    public int eSe;
    public String jumpUrl;
    public String xdr;
    public int xds;
  }
  
  private static final class b
  {
    public String hSv;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\ui\fts\widget\FTSMainUIHotWordLayout.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */