package com.tencent.mm.plugin.scanner.ui;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.util.AttributeSet;
import android.view.View;
import android.widget.Adapter;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.LinearLayout;
import android.widget.LinearLayout.LayoutParams;
import android.widget.TextView;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.R.g;
import com.tencent.mm.R.h;
import com.tencent.mm.R.i;
import com.tencent.mm.R.l;
import com.tencent.mm.sdk.platformtools.BackwardSupportUtil.b;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.ui.base.MMDotView;
import com.tencent.mm.ui.base.MMFlipper;
import com.tencent.mm.ui.base.MMFlipper.a;
import com.tencent.mm.ui.base.MMFlipper.b;
import java.util.List;

public class SelectScanModePanel
  extends LinearLayout
{
  private static int ozq;
  private static int ozr;
  private Context context;
  private int ozA;
  private boolean ozB;
  private int ozC;
  private int ozD;
  private MMFlipper ozE;
  private MMDotView ozF;
  a ozG;
  private final int ozs;
  private int ozt;
  protected List<SelectScanModeGrid> ozu;
  private int[] ozv;
  private int[] ozw;
  private int[] ozx;
  private int[] ozy;
  private AdapterView.OnItemClickListener ozz;
  
  static
  {
    GMTrace.i(6151869562880L, 45835);
    ozq = 85;
    ozr = 85;
    GMTrace.o(6151869562880L, 45835);
  }
  
  public SelectScanModePanel(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
    GMTrace.i(6150527385600L, 45825);
    this.ozs = 0;
    this.ozt = 0;
    this.ozv = new int[] { R.l.dVe, R.l.dVc, R.l.dVh, R.l.dVd };
    this.ozw = new int[] { R.g.aZC, R.g.aZA, R.g.aZF, R.g.aZH };
    this.ozx = new int[] { R.g.aZD, R.g.aZB, R.g.aZG, R.g.aZI };
    this.ozy = new int[] { 1, 2, 5, 3 };
    this.ozA = 0;
    this.ozB = false;
    this.context = paramContext;
    View.inflate(this.context, R.i.cFO, this);
    this.ozF = ((MMDotView)findViewById(R.h.cbP));
    w.v("MicroMsg.scanner.SelectScanModePanel", "AppPanel initFlipper");
    this.ozE = ((MMFlipper)findViewById(R.h.cbQ));
    paramContext = findViewById(R.h.cbO);
    if (this.context.getResources().getConfiguration().orientation == 2)
    {
      paramAttributeSet = (LinearLayout.LayoutParams)paramContext.getLayoutParams();
      paramAttributeSet.height = BackwardSupportUtil.b.a(this.context, ozr);
      paramContext.setLayoutParams(paramAttributeSet);
    }
    for (;;)
    {
      this.ozE.removeAllViews();
      this.ozE.wbJ = new MMFlipper.a()
      {
        public final void cQ(int paramAnonymousInt1, int paramAnonymousInt2)
        {
          GMTrace.i(6102074785792L, 45464);
          w.v("MicroMsg.scanner.SelectScanModePanel", "onMeasure width:" + paramAnonymousInt1 + " height:" + paramAnonymousInt2 + " isMeasured:" + SelectScanModePanel.a(SelectScanModePanel.this));
          if ((SelectScanModePanel.a(SelectScanModePanel.this)) || (paramAnonymousInt2 == 0) || (paramAnonymousInt1 == 0))
          {
            GMTrace.o(6102074785792L, 45464);
            return;
          }
          SelectScanModePanel.b(SelectScanModePanel.this);
          SelectScanModePanel.a(SelectScanModePanel.this, paramAnonymousInt2);
          SelectScanModePanel.b(SelectScanModePanel.this, paramAnonymousInt1);
          SelectScanModePanel.c(SelectScanModePanel.this);
          GMTrace.o(6102074785792L, 45464);
        }
      };
      this.ozE.wbI = new MMFlipper.b()
      {
        public final void tz(int paramAnonymousInt)
        {
          GMTrace.i(6085834440704L, 45343);
          SelectScanModePanel.d(SelectScanModePanel.this).BV(paramAnonymousInt);
          GMTrace.o(6085834440704L, 45343);
        }
      };
      GMTrace.o(6150527385600L, 45825);
      return;
      paramAttributeSet = (LinearLayout.LayoutParams)paramContext.getLayoutParams();
      paramAttributeSet.height = BackwardSupportUtil.b.a(this.context, ozq);
      paramContext.setLayoutParams(paramAttributeSet);
    }
  }
  
  public final void ty(int paramInt)
  {
    GMTrace.i(6150661603328L, 45826);
    int i = 0;
    while (i < this.ozy.length)
    {
      if (this.ozy[i] == paramInt) {
        this.ozt = i;
      }
      i += 1;
    }
    if (this.ozu != null)
    {
      i = 0;
      while (i < this.ozu.size())
      {
        SelectScanModeGrid.a locala = (SelectScanModeGrid.a)((SelectScanModeGrid)this.ozu.get(i)).getAdapter();
        if (locala != null)
        {
          int j = 0;
          if (j < locala.getCount())
          {
            SelectScanModeGrid.b localb = (SelectScanModeGrid.b)locala.getItem(j);
            if ((localb != null) && (localb.ozp != null))
            {
              if (localb.ozo != paramInt) {
                break label174;
              }
              localb.ozp.setBackgroundResource(localb.ozn);
              if (i > 0)
              {
                this.ozE.BY(i);
                this.ozF.BV(i);
              }
            }
            for (;;)
            {
              j += 1;
              break;
              label174:
              localb.ozp.setBackgroundResource(localb.ozm);
            }
          }
        }
        i += 1;
      }
    }
    GMTrace.o(6150661603328L, 45826);
  }
  
  public static abstract interface a
  {
    public abstract void tx(int paramInt);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\plugin\scanner\ui\SelectScanModePanel.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */