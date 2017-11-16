package com.tencent.mm.ui.base;

import android.annotation.TargetApi;
import android.content.Context;
import android.content.res.Configuration;
import android.os.Looper;
import android.util.AttributeSet;
import android.view.Display;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.widget.LinearLayout;
import android.widget.LinearLayout.LayoutParams;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.br.a;
import com.tencent.mm.sdk.platformtools.ae;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.v.a.g;
import com.tencent.mm.v.a.h;
import junit.framework.Assert;

public final class MMGridPaper
  extends LinearLayout
{
  protected View Ks;
  protected MMDotView iPE;
  protected int jSB;
  protected int mNumColumns;
  protected ae ohR;
  protected int vZj;
  protected int vZk;
  final MMFlipper.b wbI;
  final MMFlipper.a wbJ;
  protected int wcA;
  protected int wcB;
  protected boolean wcC;
  protected int wcD;
  protected int wcE;
  protected MMFlipper wcf;
  protected l wcg;
  protected int wch;
  protected int wci;
  protected int wcj;
  protected int wck;
  protected int wcl;
  protected int wcm;
  protected int wcn;
  protected int wco;
  protected boolean wcp;
  protected int wcq;
  protected int wcr;
  protected int wcs;
  protected int wct;
  protected int wcu;
  protected boolean wcv;
  protected boolean wcw;
  protected int wcx;
  protected int wcy;
  protected int wcz;
  
  public MMGridPaper(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
    GMTrace.i(3305782640640L, 24630);
    this.wcj = 0;
    this.wck = 0;
    this.wcl = 3;
    this.wcm = 0;
    this.wcn = (this.wcl - 1);
    this.wco = 0;
    this.mNumColumns = 0;
    this.jSB = 0;
    this.wcp = false;
    this.wcq = 9;
    this.wcr = -1;
    this.wcs = -1;
    this.wct = 96;
    this.wcu = 96;
    this.vZj = 10;
    this.vZk = 10;
    this.wcv = false;
    this.wcw = false;
    this.wcx = -1;
    this.wcy = -1;
    this.wcz = 0;
    this.wcA = -1;
    this.wcB = -1;
    this.wcC = false;
    this.wcD = 0;
    this.wcE = 0;
    this.wbJ = new MMFlipper.a()
    {
      public final void cQ(int paramAnonymousInt1, int paramAnonymousInt2)
      {
        GMTrace.i(3351148232704L, 24968);
        w.v("MicroMsg.MMGridPaper", "onMeasure width:[new %d, old %d] height:[new %d, old %d], dialogMode[%B], orientationChange[%B]", new Object[] { Integer.valueOf(paramAnonymousInt1), Integer.valueOf(MMGridPaper.this.wch), Integer.valueOf(paramAnonymousInt2), Integer.valueOf(MMGridPaper.this.wci), Boolean.valueOf(MMGridPaper.this.wcw), Boolean.valueOf(MMGridPaper.this.wcv) });
        if (((Math.abs(MMGridPaper.this.wci - paramAnonymousInt2) < 50) && (Math.abs(MMGridPaper.this.wch - paramAnonymousInt1) < 50)) || (paramAnonymousInt2 == 0) || (paramAnonymousInt1 == 0))
        {
          w.d("MicroMsg.MMGridPaper", "match width height limit, return");
          GMTrace.o(3351148232704L, 24968);
          return;
        }
        if ((MMGridPaper.this.wcw) && (MMGridPaper.this.wch > paramAnonymousInt1) && (!MMGridPaper.this.wcv))
        {
          w.d("MicroMsg.MMGridPaper", "match ori limit, return");
          GMTrace.o(3351148232704L, 24968);
          return;
        }
        w.v("MicroMsg.MMGridPaper", "onMeasure: match");
        w.v("MicroMsg.MMGridPaper", "onMeasure: mIsManualMeasureMode[%b]", new Object[] { Boolean.valueOf(MMGridPaper.this.wcC) });
        MMGridPaper.this.wcv = false;
        if (!MMGridPaper.this.wcC)
        {
          MMGridPaper.this.wci = paramAnonymousInt2;
          MMGridPaper.this.wch = paramAnonymousInt1;
        }
        MMGridPaper.this.refresh();
        GMTrace.o(3351148232704L, 24968);
      }
    };
    this.wbI = new MMFlipper.b()
    {
      public final void tz(final int paramAnonymousInt)
      {
        GMTrace.i(3284710457344L, 24473);
        w.d("MicroMsg.MMGridPaper", "onScreenChanged:curScreen[%d], topEdge[%d], bottomEdge[%d], virtualPage[%d]", new Object[] { Integer.valueOf(paramAnonymousInt), Integer.valueOf(MMGridPaper.this.wcm), Integer.valueOf(MMGridPaper.this.wcn), Integer.valueOf(MMGridPaper.this.wco) });
        if ((paramAnonymousInt <= MMGridPaper.this.wcm) && (MMGridPaper.this.wcm > 0)) {
          MMGridPaper.this.ohR.post(new Runnable()
          {
            public final void run()
            {
              GMTrace.i(3285381545984L, 24478);
              MMGridPaperGridView localMMGridPaperGridView = (MMGridPaperGridView)MMGridPaper.this.wcf.getChildAt(MMGridPaper.this.wcf.getChildCount() - 1);
              int i = paramAnonymousInt - (MMGridPaper.this.wcf.getChildCount() >> 1);
              w.i("MicroMsg.MMGridPaper", "move up, old index[%d], new index[%d]", new Object[] { Integer.valueOf(MMGridPaper.this.wcf.getChildCount() - 1), Integer.valueOf(i) });
              MMGridPaper.this.wcf.removeViewAt(MMGridPaper.this.wcf.getChildCount() - 1);
              localMMGridPaperGridView.a(i, MMGridPaper.this.jSB, MMGridPaper.this.mNumColumns, MMGridPaper.this.wcg);
              MMGridPaper.this.wcf.addView(localMMGridPaperGridView, 0);
              i = MMGridPaper.this.wcf.getChildCount();
              MMGridPaper.this.wcf.BW(i >> 1);
              MMGridPaper.a(MMGridPaper.this, -1);
              GMTrace.o(3285381545984L, 24478);
            }
          });
        }
        for (;;)
        {
          MMGridPaper.this.wck = paramAnonymousInt;
          MMGridPaper.this.iPE.BV(paramAnonymousInt);
          GMTrace.o(3284710457344L, 24473);
          return;
          if ((paramAnonymousInt >= MMGridPaper.this.wcn) && (MMGridPaper.this.wcn < MMGridPaper.this.wco - 1)) {
            MMGridPaper.this.ohR.post(new Runnable()
            {
              public final void run()
              {
                GMTrace.i(3326317953024L, 24783);
                MMGridPaperGridView localMMGridPaperGridView = (MMGridPaperGridView)MMGridPaper.this.wcf.getChildAt(0);
                int i = paramAnonymousInt + (MMGridPaper.this.wcf.getChildCount() >> 1);
                w.i("MicroMsg.MMGridPaper", "move down, old index[0], new index[%d]", new Object[] { Integer.valueOf(i) });
                MMGridPaper.this.wcf.removeViewAt(0);
                localMMGridPaperGridView.a(i, MMGridPaper.this.jSB, MMGridPaper.this.mNumColumns, MMGridPaper.this.wcg);
                MMGridPaper.this.wcf.addView(localMMGridPaperGridView);
                i = MMGridPaper.this.wcf.getChildCount();
                MMGridPaper.this.wcf.BW(i >> 1);
                MMGridPaper.a(MMGridPaper.this, 1);
                GMTrace.o(3326317953024L, 24783);
              }
            });
          }
        }
      }
    };
    this.ohR = new ae(Looper.getMainLooper());
    View.inflate(getContext(), a.h.gfj, this);
    this.wcz = bLR();
    GMTrace.o(3305782640640L, 24630);
  }
  
  private int bLR()
  {
    GMTrace.i(3307259035648L, 24641);
    Display localDisplay = ((WindowManager)getContext().getSystemService("window")).getDefaultDisplay();
    if (localDisplay.getWidth() < localDisplay.getHeight()) {}
    for (int i = 1;; i = 2)
    {
      GMTrace.o(3307259035648L, 24641);
      return i;
    }
  }
  
  private void bLS()
  {
    GMTrace.i(3307527471104L, 24643);
    w.v("MicroMsg.MMGridPaper", "MMGridPaper initFlipper");
    if (this.iPE == null)
    {
      this.iPE = ((MMDotView)findViewById(a.g.gdk));
      MMDotView localMMDotView = this.iPE;
      int i = this.wcq;
      w.d("MicroMsg.MMDotView", "setMaxCount:%d", new Object[] { Integer.valueOf(i) });
      localMMDotView.fMw = i;
    }
    if (this.wcf == null)
    {
      this.wcf = ((MMFlipper)findViewById(a.g.gdl));
      this.wcf.wbJ = this.wbJ;
      this.wcf.wbI = this.wbI;
    }
    bZS();
    bZT();
    GMTrace.o(3307527471104L, 24643);
  }
  
  private void bZS()
  {
    GMTrace.i(3307393253376L, 24642);
    View localView;
    LinearLayout.LayoutParams localLayoutParams;
    int i;
    if ((-1 != this.wcr) && (bLR() == 2))
    {
      localView = findViewById(a.g.gdj);
      localLayoutParams = (LinearLayout.LayoutParams)localView.getLayoutParams();
      i = a.fromDPToPix(getContext(), this.wcr);
      if (i != localLayoutParams.height)
      {
        w.i("MicroMsg.MMGridPaper", "set land mode, special height is %d", new Object[] { Integer.valueOf(this.wcr) });
        localLayoutParams.height = i;
        localView.setLayoutParams(localLayoutParams);
        this.ohR.post(new Runnable()
        {
          public final void run()
          {
            GMTrace.i(3336518500352L, 24859);
            w.w("MicroMsg.MMGridPaper", "post do setDotView");
            MMGridPaper.a(MMGridPaper.this);
            GMTrace.o(3336518500352L, 24859);
          }
        });
      }
      GMTrace.o(3307393253376L, 24642);
      return;
    }
    if ((-1 != this.wcs) && (bLR() == 1))
    {
      localView = findViewById(a.g.gdj);
      localLayoutParams = (LinearLayout.LayoutParams)localView.getLayoutParams();
      i = a.fromDPToPix(getContext(), this.wcs);
      if (i != localLayoutParams.height)
      {
        w.i("MicroMsg.MMGridPaper", "set port mode, special height is %d", new Object[] { Integer.valueOf(this.wcs) });
        localLayoutParams.height = i;
        localView.setLayoutParams(localLayoutParams);
        this.ohR.post(new Runnable()
        {
          public final void run()
          {
            GMTrace.i(3158545793024L, 23533);
            w.w("MicroMsg.MMGridPaper", "post do setDotView");
            MMGridPaper.a(MMGridPaper.this);
            GMTrace.o(3158545793024L, 23533);
          }
        });
      }
    }
    GMTrace.o(3307393253376L, 24642);
  }
  
  private void bZT()
  {
    GMTrace.i(3307661688832L, 24644);
    w.v("MicroMsg.MMGridPaper", "initSubGrid, grid width %d, grid height %d", new Object[] { Integer.valueOf(this.wch), Integer.valueOf(this.wci) });
    if ((this.wch == 0) || (this.wci == 0))
    {
      w.w("MicroMsg.MMGridPaper", "initSubGrid:gridWithd or gridHeight is 0");
      GMTrace.o(3307661688832L, 24644);
      return;
    }
    int j = a.fromDPToPix(getContext(), this.wct);
    int i = a.fromDPToPix(getContext(), this.wcu);
    j = Math.max(this.wch / j, 1);
    i = Math.max(this.wci / i, 1);
    if ((j != this.mNumColumns) || (i != this.jSB)) {
      this.wcp = true;
    }
    this.mNumColumns = j;
    if (this.wcA != -1) {
      this.mNumColumns = Math.min(this.mNumColumns, this.wcA);
    }
    this.jSB = i;
    if (this.wcB != -1) {
      this.jSB = Math.min(this.jSB, this.wcB);
    }
    int m = this.mNumColumns * this.jSB;
    this.wco = 0;
    boolean bool;
    if (this.wcg == null)
    {
      i = 0;
      j = i + 0;
      w.d("MicroMsg.MMGridPaper", "totalCount is %d, dialogMode is %B", new Object[] { Integer.valueOf(j), Boolean.valueOf(this.wcw) });
      if (j < 0) {
        break label343;
      }
      bool = true;
      label261:
      Assert.assertTrue(bool);
      if (this.wcw)
      {
        k = el(j, this.mNumColumns);
        i = bLR();
      }
      switch (i)
      {
      default: 
        i = 1;
      }
    }
    for (;;)
    {
      if (i != 0) {
        break label553;
      }
      bZS();
      GMTrace.o(3307661688832L, 24644);
      return;
      i = this.wcg.getCount();
      break;
      label343:
      bool = false;
      break label261;
      k = Math.min(k, this.wcy);
      n = (this.wcu + 10) * k + 8;
      w.d("MicroMsg.MMGridPaper", "orientation[%d], minRows[%d], targetHeight[%d], displayHeight[%d], orientationChange[%B]", new Object[] { Integer.valueOf(i), Integer.valueOf(k), Integer.valueOf(n), Integer.valueOf(this.wcr), Boolean.valueOf(this.wcv) });
      if (this.wcr != n)
      {
        this.wcr = n;
        i = 0;
      }
      else
      {
        i = 1;
        continue;
        k = Math.min(k, this.wcx);
        n = (this.wcu + 10) * k + 8;
        w.d("MicroMsg.MMGridPaper", "orientation[%d], minRows[%d], targetHeight[%d], displayHeight[%d], orientationChange[%B]", new Object[] { Integer.valueOf(i), Integer.valueOf(k), Integer.valueOf(n), Integer.valueOf(this.wcs), Boolean.valueOf(this.wcv) });
        if (this.wcs != n)
        {
          this.wcs = n;
          i = 0;
        }
        else
        {
          i = 1;
        }
      }
    }
    label553:
    this.wco = el(j, m);
    int n = this.wco;
    int k = this.wcj;
    MMGridPaperGridView localMMGridPaperGridView;
    if ((k == 0) || (m <= 0))
    {
      w.w("MicroMsg.MMGridPaper", "floor:total[%d], length[%d]", new Object[] { Integer.valueOf(k), Integer.valueOf(m) });
      i = 0;
      this.wck = Math.min(n - 1, i);
      this.wcl = Math.min(3, this.wco);
      this.wcm = Math.min(this.wco - this.wcl, Math.max(0, this.wck - (this.wcl >> 1)));
      this.wcn = (this.wcm + this.wcl - 1);
      w.d("MicroMsg.MMGridPaper", "initSubGrid:item[%ddp,%ddp], row[%d], column[%d], activePage[%d], virtualPage[%d], curVirtualPage[%d], edge[%d, %d]", new Object[] { Integer.valueOf(this.wct), Integer.valueOf(this.wcu), Integer.valueOf(this.jSB), Integer.valueOf(this.mNumColumns), Integer.valueOf(this.wcl), Integer.valueOf(this.wco), Integer.valueOf(this.wck), Integer.valueOf(this.wcm), Integer.valueOf(this.wcn) });
      if ((this.wcf.getChildCount() != this.wcl) || (this.wcp))
      {
        w.w("MicroMsg.MMGridPaper", "error child count or RowOrColChanged(%B), reset child view", new Object[] { Boolean.valueOf(this.wcp) });
        this.wcp = false;
        this.wcf.removeAllViews();
        i = this.wcm;
        while (i <= this.wcn)
        {
          localMMGridPaperGridView = (MMGridPaperGridView)inflate(getContext(), a.h.gfh, null);
          localMMGridPaperGridView.a(i, this.jSB, this.mNumColumns, this.wcg);
          localMMGridPaperGridView.setHorizontalSpacing(a.fromDPToPix(getContext(), this.vZj));
          localMMGridPaperGridView.setVerticalSpacing(a.fromDPToPix(getContext(), this.vZk));
          this.wcf.addView(localMMGridPaperGridView, new LinearLayout.LayoutParams(-1, -1));
          i += 1;
        }
      }
    }
    for (;;)
    {
      if (j >= m)
      {
        j -= m;
        i += 1;
      }
      else
      {
        w.i("MicroMsg.MMGridPaper", "floor:num[%d], length[%d], result[%d]", new Object[] { Integer.valueOf(k), Integer.valueOf(m), Integer.valueOf(i) });
        break;
        i = this.wcm;
        if (i <= this.wcn)
        {
          localMMGridPaperGridView = (MMGridPaperGridView)this.wcf.getChildAt(i - this.wcm);
          if (localMMGridPaperGridView.mIndex != i)
          {
            w.w("MicroMsg.MMGridPaper", "old index %d, new index %d, reset it", new Object[] { Integer.valueOf(localMMGridPaperGridView.mIndex), Integer.valueOf(i) });
            localMMGridPaperGridView.a(i, this.jSB, this.mNumColumns, this.wcg);
            if (localMMGridPaperGridView.wcO != null) {
              localMMGridPaperGridView.wcO.notifyDataSetChanged();
            }
          }
          for (;;)
          {
            i += 1;
            break;
            w.v("MicroMsg.MMGridPaper", "same grid index, continus");
          }
        }
        bZU();
        GMTrace.o(3307661688832L, 24644);
        return;
        j = k;
        i = 0;
      }
    }
  }
  
  private void bZU()
  {
    GMTrace.i(3307930124288L, 24646);
    w.v("MicroMsg.MMGridPaper", "set DotView");
    boolean bool;
    if (this.wco >= 0)
    {
      bool = true;
      Assert.assertTrue(bool);
      this.iPE.BU(this.wco);
      if ((this.wcg != null) && (this.wco > 1)) {
        break label147;
      }
      this.iPE.setVisibility(8);
      w.v("MicroMsg.MMGridPaper", "set DotView gone");
    }
    for (;;)
    {
      if (this.wck >= this.wco) {
        this.wck = (this.wco - 1);
      }
      this.wcf.BW(this.wck - this.wcm);
      this.wcf.BX(this.wck);
      this.iPE.BV(this.wck);
      GMTrace.o(3307930124288L, 24646);
      return;
      bool = false;
      break;
      label147:
      this.iPE.setVisibility(0);
      w.v("MicroMsg.MMGridPaper", "set DotView visible");
    }
  }
  
  private static int el(int paramInt1, int paramInt2)
  {
    GMTrace.i(3307795906560L, 24645);
    if (paramInt2 <= 0)
    {
      w.w("MicroMsg.MMGridPaper", "ceil:total[%d], length[%d]", new Object[] { Integer.valueOf(paramInt1), Integer.valueOf(paramInt2) });
      GMTrace.o(3307795906560L, 24645);
      return 0;
    }
    for (;;)
    {
      int j;
      int i;
      if (j > 0)
      {
        j -= paramInt2;
        i += 1;
      }
      else
      {
        w.i("MicroMsg.MMGridPaper", "ceil:num[%d], length[%d], result[%d]", new Object[] { Integer.valueOf(paramInt1), Integer.valueOf(paramInt2), Integer.valueOf(i) });
        GMTrace.o(3307795906560L, 24645);
        return i;
        j = paramInt1;
        i = 0;
      }
    }
  }
  
  public final void BZ(int paramInt)
  {
    GMTrace.i(3306319511552L, 24634);
    this.wcA = paramInt;
    GMTrace.o(3306319511552L, 24634);
  }
  
  public final void a(l paraml)
  {
    boolean bool = true;
    GMTrace.i(3306990600192L, 24639);
    this.wcg = paraml;
    if (paraml == null) {}
    for (;;)
    {
      w.d("MicroMsg.MMGridPaper", "setGridPaperAdapter:adapter is null[%B]", new Object[] { Boolean.valueOf(bool) });
      if (this.wcg != null) {
        this.wcg.wcI = new l.a()
        {
          public final void bZV()
          {
            GMTrace.i(3335847411712L, 24854);
            MMGridPaper.this.refresh();
            GMTrace.o(3335847411712L, 24854);
          }
        };
      }
      bLS();
      GMTrace.o(3306990600192L, 24639);
      return;
      bool = false;
    }
  }
  
  public final void bZL()
  {
    GMTrace.i(3305916858368L, 24631);
    this.wct = 70;
    GMTrace.o(3305916858368L, 24631);
  }
  
  public final void bZM()
  {
    GMTrace.i(3306051076096L, 24632);
    this.wcu = 70;
    GMTrace.o(3306051076096L, 24632);
  }
  
  public final void bZN()
  {
    GMTrace.i(3306185293824L, 24633);
    this.wcB = 3;
    GMTrace.o(3306185293824L, 24633);
  }
  
  public final void bZO()
  {
    GMTrace.i(3306453729280L, 24635);
    this.wcw = true;
    GMTrace.o(3306453729280L, 24635);
  }
  
  public final void bZP()
  {
    GMTrace.i(3306587947008L, 24636);
    this.wcy = 3;
    this.wcx = 3;
    GMTrace.o(3306587947008L, 24636);
  }
  
  public final void bZQ()
  {
    GMTrace.i(3306722164736L, 24637);
    this.vZj = 8;
    this.vZk = 15;
    GMTrace.o(3306722164736L, 24637);
  }
  
  public final void bZR()
  {
    GMTrace.i(3306856382464L, 24638);
    this.Ks = null;
    ViewGroup localViewGroup = (ViewGroup)findViewById(a.g.gdm);
    localViewGroup.removeAllViews();
    if (this.Ks != null) {
      localViewGroup.addView(this.Ks);
    }
    GMTrace.o(3306856382464L, 24638);
  }
  
  @TargetApi(8)
  public final void onConfigurationChanged(Configuration paramConfiguration)
  {
    GMTrace.i(3308198559744L, 24648);
    if ((paramConfiguration.orientation == 1) || (paramConfiguration.orientation == 2))
    {
      w.d("MicroMsg.MMGridPaper", "onConfigChanged:" + paramConfiguration.orientation);
      this.wcv = true;
    }
    GMTrace.o(3308198559744L, 24648);
  }
  
  protected final void onLayout(boolean paramBoolean, int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    GMTrace.i(3308064342016L, 24647);
    w.d("MicroMsg.MMGridPaper", "onLayout left=%s top=%s right=%s bottom=%s", new Object[] { Integer.valueOf(paramInt1), Integer.valueOf(paramInt2), Integer.valueOf(paramInt3), Integer.valueOf(paramInt4) });
    if (this.wcz != bLR())
    {
      this.wcz = bLR();
      w.d("MicroMsg.MMGridPaper", "onLayout, currentOrientation changed, reAdjustDisplayArea");
      this.wcv = true;
      clearAnimation();
      bZS();
      bZT();
    }
    super.onLayout(paramBoolean, paramInt1, paramInt2, paramInt3, paramInt4);
    GMTrace.o(3308064342016L, 24647);
  }
  
  public final void refresh()
  {
    GMTrace.i(3307124817920L, 24640);
    this.wcj = (this.wck * this.mNumColumns * this.jSB);
    w.v("MicroMsg.MMGridPaper", "refreshed:virtualPage[%d], col[%d], row[%d], scrollCount[%d]", new Object[] { Integer.valueOf(this.wck), Integer.valueOf(this.mNumColumns), Integer.valueOf(this.jSB), Integer.valueOf(this.wcj) });
    bLS();
    GMTrace.o(3307124817920L, 24640);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\ui\base\MMGridPaper.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */