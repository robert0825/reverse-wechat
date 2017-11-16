package com.tencent.mm.ui;

import android.content.Context;
import android.content.res.Resources;
import android.os.Message;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.LinearLayout.LayoutParams;
import android.widget.RelativeLayout;
import android.widget.RelativeLayout.LayoutParams;
import android.widget.TextView;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.R.e;
import com.tencent.mm.R.f;
import com.tencent.mm.R.h;
import com.tencent.mm.R.i;
import com.tencent.mm.R.k;
import com.tencent.mm.R.l;
import com.tencent.mm.g.a.jc;
import com.tencent.mm.sdk.platformtools.ae;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.ui.tools.s;

public class LauncherUIBottomTabView
  extends RelativeLayout
  implements c
{
  protected int kWb;
  private long maC;
  private int vJA;
  private int vJB;
  private int vJC;
  private int vJD;
  private int vJE;
  private int vJF;
  private int vJG;
  private int vJH;
  private int vJI;
  private int vJJ;
  protected View.OnClickListener vJK;
  private ae vJL;
  private int vJM;
  private int vJN;
  private int vJO;
  private boolean vJP;
  private int vJQ;
  private boolean vJR;
  private c.a vJs;
  protected a vJt;
  protected a vJu;
  protected a vJv;
  protected a vJw;
  private int vJx;
  private int vJy;
  private int vJz;
  
  public LauncherUIBottomTabView(Context paramContext)
  {
    super(paramContext);
    GMTrace.i(1877437579264L, 13988);
    this.kWb = 0;
    this.vJx = 0;
    this.vJB = 0;
    this.maC = 0L;
    this.vJI = -1;
    this.vJJ = 0;
    this.vJK = new View.OnClickListener()
    {
      private final long pPS;
      
      public final void onClick(View paramAnonymousView)
      {
        GMTrace.i(1604841373696L, 11957);
        int i = ((Integer)paramAnonymousView.getTag()).intValue();
        if ((LauncherUIBottomTabView.a(LauncherUIBottomTabView.this) == i) && (i == 0) && (System.currentTimeMillis() - LauncherUIBottomTabView.b(LauncherUIBottomTabView.this) <= 300L))
        {
          w.v("MicroMsg.LauncherUITabView", "onMainTabDoubleClick");
          LauncherUIBottomTabView.c(LauncherUIBottomTabView.this).removeMessages(0);
          com.tencent.mm.sdk.b.a.vgX.m(new jc());
          LauncherUIBottomTabView.a(LauncherUIBottomTabView.this, System.currentTimeMillis());
          LauncherUIBottomTabView.a(LauncherUIBottomTabView.this, i);
          GMTrace.o(1604841373696L, 11957);
          return;
        }
        if (LauncherUIBottomTabView.d(LauncherUIBottomTabView.this) != null)
        {
          if ((i != 0) || (LauncherUIBottomTabView.a(LauncherUIBottomTabView.this) != 0))
          {
            w.v("MicroMsg.LauncherUITabView", "directly dispatch tab click event");
            LauncherUIBottomTabView.a(LauncherUIBottomTabView.this, System.currentTimeMillis());
            LauncherUIBottomTabView.a(LauncherUIBottomTabView.this, i);
            LauncherUIBottomTabView.d(LauncherUIBottomTabView.this).mS(i);
            GMTrace.o(1604841373696L, 11957);
            return;
          }
          w.v("MicroMsg.LauncherUITabView", "do double click check");
          LauncherUIBottomTabView.c(LauncherUIBottomTabView.this).sendEmptyMessageDelayed(0, 300L);
        }
        LauncherUIBottomTabView.a(LauncherUIBottomTabView.this, System.currentTimeMillis());
        LauncherUIBottomTabView.a(LauncherUIBottomTabView.this, i);
        w.w("MicroMsg.LauncherUITabView", "on tab click, index %d, but listener is null", new Object[] { (Integer)paramAnonymousView.getTag() });
        GMTrace.o(1604841373696L, 11957);
      }
    };
    this.vJL = new ae()
    {
      public final void handleMessage(Message paramAnonymousMessage)
      {
        GMTrace.i(3093315977216L, 23047);
        w.v("MicroMsg.LauncherUITabView", "onMainTabClick");
        LauncherUIBottomTabView.d(LauncherUIBottomTabView.this).mS(0);
        GMTrace.o(3093315977216L, 23047);
      }
    };
    this.vJM = 0;
    this.vJN = 0;
    this.vJO = 0;
    this.vJP = false;
    this.vJQ = 0;
    this.vJR = false;
    init();
    GMTrace.o(1877437579264L, 13988);
  }
  
  public LauncherUIBottomTabView(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
    GMTrace.i(1877571796992L, 13989);
    this.kWb = 0;
    this.vJx = 0;
    this.vJB = 0;
    this.maC = 0L;
    this.vJI = -1;
    this.vJJ = 0;
    this.vJK = new View.OnClickListener()
    {
      private final long pPS;
      
      public final void onClick(View paramAnonymousView)
      {
        GMTrace.i(1604841373696L, 11957);
        int i = ((Integer)paramAnonymousView.getTag()).intValue();
        if ((LauncherUIBottomTabView.a(LauncherUIBottomTabView.this) == i) && (i == 0) && (System.currentTimeMillis() - LauncherUIBottomTabView.b(LauncherUIBottomTabView.this) <= 300L))
        {
          w.v("MicroMsg.LauncherUITabView", "onMainTabDoubleClick");
          LauncherUIBottomTabView.c(LauncherUIBottomTabView.this).removeMessages(0);
          com.tencent.mm.sdk.b.a.vgX.m(new jc());
          LauncherUIBottomTabView.a(LauncherUIBottomTabView.this, System.currentTimeMillis());
          LauncherUIBottomTabView.a(LauncherUIBottomTabView.this, i);
          GMTrace.o(1604841373696L, 11957);
          return;
        }
        if (LauncherUIBottomTabView.d(LauncherUIBottomTabView.this) != null)
        {
          if ((i != 0) || (LauncherUIBottomTabView.a(LauncherUIBottomTabView.this) != 0))
          {
            w.v("MicroMsg.LauncherUITabView", "directly dispatch tab click event");
            LauncherUIBottomTabView.a(LauncherUIBottomTabView.this, System.currentTimeMillis());
            LauncherUIBottomTabView.a(LauncherUIBottomTabView.this, i);
            LauncherUIBottomTabView.d(LauncherUIBottomTabView.this).mS(i);
            GMTrace.o(1604841373696L, 11957);
            return;
          }
          w.v("MicroMsg.LauncherUITabView", "do double click check");
          LauncherUIBottomTabView.c(LauncherUIBottomTabView.this).sendEmptyMessageDelayed(0, 300L);
        }
        LauncherUIBottomTabView.a(LauncherUIBottomTabView.this, System.currentTimeMillis());
        LauncherUIBottomTabView.a(LauncherUIBottomTabView.this, i);
        w.w("MicroMsg.LauncherUITabView", "on tab click, index %d, but listener is null", new Object[] { (Integer)paramAnonymousView.getTag() });
        GMTrace.o(1604841373696L, 11957);
      }
    };
    this.vJL = new ae()
    {
      public final void handleMessage(Message paramAnonymousMessage)
      {
        GMTrace.i(3093315977216L, 23047);
        w.v("MicroMsg.LauncherUITabView", "onMainTabClick");
        LauncherUIBottomTabView.d(LauncherUIBottomTabView.this).mS(0);
        GMTrace.o(3093315977216L, 23047);
      }
    };
    this.vJM = 0;
    this.vJN = 0;
    this.vJO = 0;
    this.vJP = false;
    this.vJQ = 0;
    this.vJR = false;
    init();
    GMTrace.o(1877571796992L, 13989);
  }
  
  public LauncherUIBottomTabView(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
    GMTrace.i(1877706014720L, 13990);
    this.kWb = 0;
    this.vJx = 0;
    this.vJB = 0;
    this.maC = 0L;
    this.vJI = -1;
    this.vJJ = 0;
    this.vJK = new View.OnClickListener()
    {
      private final long pPS;
      
      public final void onClick(View paramAnonymousView)
      {
        GMTrace.i(1604841373696L, 11957);
        int i = ((Integer)paramAnonymousView.getTag()).intValue();
        if ((LauncherUIBottomTabView.a(LauncherUIBottomTabView.this) == i) && (i == 0) && (System.currentTimeMillis() - LauncherUIBottomTabView.b(LauncherUIBottomTabView.this) <= 300L))
        {
          w.v("MicroMsg.LauncherUITabView", "onMainTabDoubleClick");
          LauncherUIBottomTabView.c(LauncherUIBottomTabView.this).removeMessages(0);
          com.tencent.mm.sdk.b.a.vgX.m(new jc());
          LauncherUIBottomTabView.a(LauncherUIBottomTabView.this, System.currentTimeMillis());
          LauncherUIBottomTabView.a(LauncherUIBottomTabView.this, i);
          GMTrace.o(1604841373696L, 11957);
          return;
        }
        if (LauncherUIBottomTabView.d(LauncherUIBottomTabView.this) != null)
        {
          if ((i != 0) || (LauncherUIBottomTabView.a(LauncherUIBottomTabView.this) != 0))
          {
            w.v("MicroMsg.LauncherUITabView", "directly dispatch tab click event");
            LauncherUIBottomTabView.a(LauncherUIBottomTabView.this, System.currentTimeMillis());
            LauncherUIBottomTabView.a(LauncherUIBottomTabView.this, i);
            LauncherUIBottomTabView.d(LauncherUIBottomTabView.this).mS(i);
            GMTrace.o(1604841373696L, 11957);
            return;
          }
          w.v("MicroMsg.LauncherUITabView", "do double click check");
          LauncherUIBottomTabView.c(LauncherUIBottomTabView.this).sendEmptyMessageDelayed(0, 300L);
        }
        LauncherUIBottomTabView.a(LauncherUIBottomTabView.this, System.currentTimeMillis());
        LauncherUIBottomTabView.a(LauncherUIBottomTabView.this, i);
        w.w("MicroMsg.LauncherUITabView", "on tab click, index %d, but listener is null", new Object[] { (Integer)paramAnonymousView.getTag() });
        GMTrace.o(1604841373696L, 11957);
      }
    };
    this.vJL = new ae()
    {
      public final void handleMessage(Message paramAnonymousMessage)
      {
        GMTrace.i(3093315977216L, 23047);
        w.v("MicroMsg.LauncherUITabView", "onMainTabClick");
        LauncherUIBottomTabView.d(LauncherUIBottomTabView.this).mS(0);
        GMTrace.o(3093315977216L, 23047);
      }
    };
    this.vJM = 0;
    this.vJN = 0;
    this.vJO = 0;
    this.vJP = false;
    this.vJQ = 0;
    this.vJR = false;
    init();
    GMTrace.o(1877706014720L, 13990);
  }
  
  private a a(int paramInt, ViewGroup paramViewGroup)
  {
    GMTrace.i(1877974450176L, 13992);
    a locala = new a();
    locala.vJT = v.fb(getContext()).inflate(R.i.cBx, paramViewGroup, false);
    if (com.tencent.mm.br.a.ed(getContext())) {}
    for (locala.vJT = v.fb(getContext()).inflate(R.i.cBy, paramViewGroup, false);; locala.vJT = v.fb(getContext()).inflate(R.i.cBx, paramViewGroup, false))
    {
      locala.vJU = ((TabIconView)locala.vJT.findViewById(R.h.bGr));
      locala.vJV = ((TextView)locala.vJT.findViewById(R.h.bGt));
      locala.vJW = ((TextView)locala.vJT.findViewById(R.h.cjn));
      locala.vJW.setBackgroundResource(s.fH(getContext()));
      locala.vJX = ((ImageView)locala.vJT.findViewById(R.h.buL));
      locala.vJT.setTag(Integer.valueOf(paramInt));
      locala.vJT.setOnClickListener(this.vJK);
      float f1 = com.tencent.mm.br.a.W(getContext(), R.f.aQR);
      float f2 = com.tencent.mm.br.a.eb(getContext());
      locala.vJV.setTextSize(0, f1 * f2);
      GMTrace.o(1877974450176L, 13992);
      return locala;
    }
  }
  
  private void init()
  {
    GMTrace.i(1878108667904L, 13993);
    LinearLayout localLinearLayout = new LinearLayout(getContext());
    localLinearLayout.setOrientation(0);
    addView(localLinearLayout, new RelativeLayout.LayoutParams(-1, -2));
    this.vJJ = ((int)(com.tencent.mm.br.a.W(getContext(), R.f.aPO) * com.tencent.mm.br.a.eb(getContext())));
    a locala = a(0, localLinearLayout);
    locala.vJT.setId(-16777215);
    locala.vJV.setText(R.l.dIf);
    locala.vJV.setTextColor(getResources().getColor(R.e.aOx));
    locala.vJU.g(R.k.cNh, R.k.cNi, R.k.cNj, com.tencent.mm.br.a.ed(getContext()));
    locala.vJW.setVisibility(4);
    LinearLayout.LayoutParams localLayoutParams = new LinearLayout.LayoutParams(0, this.vJJ);
    localLayoutParams.weight = 1.0F;
    localLinearLayout.addView(locala.vJT, localLayoutParams);
    this.vJt = locala;
    locala = a(1, localLinearLayout);
    locala.vJT.setId(-16777214);
    locala.vJV.setText(R.l.dHF);
    locala.vJV.setTextColor(getResources().getColor(R.e.aOy));
    locala.vJU.g(R.k.cNe, R.k.cNf, R.k.cNg, com.tencent.mm.br.a.ed(getContext()));
    locala.vJW.setVisibility(4);
    localLayoutParams = new LinearLayout.LayoutParams(0, this.vJJ);
    localLayoutParams.weight = 1.0F;
    localLinearLayout.addView(locala.vJT, localLayoutParams);
    this.vJv = locala;
    locala = a(2, localLinearLayout);
    locala.vJT.setId(-16777213);
    locala.vJV.setText(R.l.dHD);
    locala.vJV.setTextColor(getResources().getColor(R.e.aOy));
    locala.vJU.g(R.k.cNk, R.k.cNl, R.k.cNm, com.tencent.mm.br.a.ed(getContext()));
    locala.vJW.setVisibility(4);
    localLayoutParams = new LinearLayout.LayoutParams(0, this.vJJ);
    localLayoutParams.weight = 1.0F;
    localLinearLayout.addView(locala.vJT, localLayoutParams);
    this.vJu = locala;
    locala = a(3, localLinearLayout);
    locala.vJT.setId(-16777212);
    locala.vJV.setText(R.l.dId);
    locala.vJV.setTextColor(getResources().getColor(R.e.aOy));
    locala.vJU.g(R.k.cNn, R.k.cNo, R.k.cNp, com.tencent.mm.br.a.ed(getContext()));
    locala.vJW.setVisibility(4);
    localLayoutParams = new LinearLayout.LayoutParams(0, this.vJJ);
    localLayoutParams.weight = 1.0F;
    localLinearLayout.addView(locala.vJT, localLayoutParams);
    this.vJw = locala;
    this.vJx = getResources().getColor(R.e.aOx);
    this.vJy = ((this.vJx & 0xFF0000) >> 16);
    this.vJz = ((this.vJx & 0xFF00) >> 8);
    this.vJA = (this.vJx & 0xFF);
    this.vJB = getResources().getColor(R.e.aOy);
    this.vJC = ((this.vJB & 0xFF0000) >> 16);
    this.vJD = ((this.vJB & 0xFF00) >> 8);
    this.vJE = (this.vJB & 0xFF);
    this.vJF = (this.vJy - this.vJC);
    this.vJG = (this.vJz - this.vJD);
    this.vJH = (this.vJA - this.vJE);
    GMTrace.o(1878108667904L, 13993);
  }
  
  public final void AM(int paramInt)
  {
    GMTrace.i(1878242885632L, 13994);
    w.d("MicroMsg.LauncherUITabView", "updateMainTabUnread %d", new Object[] { Integer.valueOf(paramInt) });
    this.vJM = paramInt;
    if (paramInt > 0)
    {
      if (paramInt > 99)
      {
        this.vJt.vJW.setText(getContext().getString(R.l.efe));
        this.vJt.vJW.setVisibility(0);
        this.vJt.vJX.setVisibility(4);
        GMTrace.o(1878242885632L, 13994);
        return;
      }
      this.vJt.vJW.setText(String.valueOf(paramInt));
      this.vJt.vJW.setVisibility(0);
      this.vJt.vJX.setVisibility(4);
      GMTrace.o(1878242885632L, 13994);
      return;
    }
    this.vJt.vJW.setText("");
    this.vJt.vJW.setVisibility(4);
    GMTrace.o(1878242885632L, 13994);
  }
  
  public final void AN(int paramInt)
  {
    GMTrace.i(1878511321088L, 13996);
    this.vJN = paramInt;
    if (paramInt > 0)
    {
      if (paramInt > 99)
      {
        this.vJv.vJW.setText(getContext().getString(R.l.efe));
        this.vJv.vJW.setVisibility(0);
        this.vJv.vJX.setVisibility(4);
        GMTrace.o(1878511321088L, 13996);
        return;
      }
      this.vJv.vJW.setText(String.valueOf(paramInt));
      this.vJv.vJW.setVisibility(0);
      this.vJv.vJX.setVisibility(4);
      GMTrace.o(1878511321088L, 13996);
      return;
    }
    this.vJv.vJW.setText("");
    this.vJv.vJW.setVisibility(4);
    GMTrace.o(1878511321088L, 13996);
  }
  
  public final void AO(int paramInt)
  {
    GMTrace.i(1878645538816L, 13997);
    this.vJO = paramInt;
    if (paramInt > 0)
    {
      if (paramInt > 99)
      {
        this.vJu.vJW.setText(getContext().getString(R.l.efe));
        this.vJu.vJW.setVisibility(0);
        this.vJu.vJX.setVisibility(4);
        GMTrace.o(1878645538816L, 13997);
        return;
      }
      this.vJu.vJW.setText(String.valueOf(paramInt));
      this.vJu.vJW.setVisibility(0);
      this.vJu.vJX.setVisibility(4);
      GMTrace.o(1878645538816L, 13997);
      return;
    }
    this.vJu.vJW.setText("");
    this.vJu.vJW.setVisibility(4);
    GMTrace.o(1878645538816L, 13997);
  }
  
  public final void AP(int paramInt)
  {
    GMTrace.i(1878913974272L, 13999);
    this.vJQ = paramInt;
    if (paramInt > 0)
    {
      if (paramInt > 99)
      {
        this.vJw.vJW.setText(getContext().getString(R.l.efe));
        this.vJw.vJW.setVisibility(0);
        this.vJw.vJX.setVisibility(4);
        GMTrace.o(1878913974272L, 13999);
        return;
      }
      this.vJw.vJW.setText(String.valueOf(paramInt));
      this.vJw.vJW.setVisibility(0);
      this.vJw.vJX.setVisibility(4);
      GMTrace.o(1878913974272L, 13999);
      return;
    }
    this.vJw.vJW.setText("");
    this.vJw.vJW.setVisibility(4);
    GMTrace.o(1878913974272L, 13999);
  }
  
  public final void a(c.a parama)
  {
    GMTrace.i(1877840232448L, 13991);
    this.vJs = parama;
    GMTrace.o(1877840232448L, 13991);
  }
  
  public final void bVW()
  {
    GMTrace.i(1878377103360L, 13995);
    if ((this.vJt == null) || (this.vJv == null) || (this.vJu == null))
    {
      GMTrace.o(1878377103360L, 13995);
      return;
    }
    GMTrace.o(1878377103360L, 13995);
  }
  
  public final int bVX()
  {
    GMTrace.i(1879585062912L, 14004);
    int i = this.vJM;
    GMTrace.o(1879585062912L, 14004);
    return i;
  }
  
  public final int bVY()
  {
    GMTrace.i(1879719280640L, 14005);
    int i = this.vJN;
    GMTrace.o(1879719280640L, 14005);
    return i;
  }
  
  public final int bVZ()
  {
    GMTrace.i(1879853498368L, 14006);
    int i = this.vJO;
    GMTrace.o(1879853498368L, 14006);
    return i;
  }
  
  public final int bWa()
  {
    GMTrace.i(1879987716096L, 14007);
    int i = this.vJQ;
    GMTrace.o(1879987716096L, 14007);
    return i;
  }
  
  public final boolean bWb()
  {
    GMTrace.i(1880121933824L, 14008);
    boolean bool = this.vJP;
    GMTrace.o(1880121933824L, 14008);
    return bool;
  }
  
  public final boolean bWc()
  {
    GMTrace.i(1880256151552L, 14009);
    boolean bool = this.vJR;
    GMTrace.o(1880256151552L, 14009);
    return bool;
  }
  
  public final int bWd()
  {
    GMTrace.i(1879316627456L, 14002);
    int i = this.kWb;
    GMTrace.o(1879316627456L, 14002);
    return i;
  }
  
  public final void h(int paramInt, float paramFloat)
  {
    GMTrace.i(1879182409728L, 14001);
    int i = (int)(255.0F * paramFloat);
    int j = 255 - i;
    int k = ((int)(this.vJF * paramFloat + this.vJC) << 16) + ((int)(this.vJG * paramFloat + this.vJD) << 8) + (int)(this.vJH * paramFloat + this.vJE) - 16777216;
    int m = ((int)(this.vJF * (1.0F - paramFloat) + this.vJC) << 16) + ((int)(this.vJG * (1.0F - paramFloat) + this.vJD) << 8) + (int)(this.vJH * (1.0F - paramFloat) + this.vJE) - 16777216;
    switch (paramInt)
    {
    }
    for (;;)
    {
      GMTrace.o(1879182409728L, 14001);
      return;
      this.vJt.vJU.Bq(j);
      this.vJv.vJU.Bq(i);
      this.vJt.vJV.setTextColor(m);
      this.vJv.vJV.setTextColor(k);
      GMTrace.o(1879182409728L, 14001);
      return;
      this.vJv.vJU.Bq(j);
      this.vJu.vJU.Bq(i);
      this.vJv.vJV.setTextColor(m);
      this.vJu.vJV.setTextColor(k);
      GMTrace.o(1879182409728L, 14001);
      return;
      this.vJu.vJU.Bq(j);
      this.vJw.vJU.Bq(i);
      this.vJu.vJV.setTextColor(m);
      this.vJw.vJV.setTextColor(k);
    }
  }
  
  public final void kR(boolean paramBoolean)
  {
    int i = 4;
    GMTrace.i(1878779756544L, 13998);
    this.vJP = paramBoolean;
    this.vJu.vJW.setVisibility(4);
    ImageView localImageView = this.vJu.vJX;
    if (paramBoolean) {
      i = 0;
    }
    localImageView.setVisibility(i);
    GMTrace.o(1878779756544L, 13998);
  }
  
  public final void kS(boolean paramBoolean)
  {
    int i = 4;
    GMTrace.i(1879048192000L, 14000);
    this.vJR = paramBoolean;
    this.vJw.vJW.setVisibility(4);
    ImageView localImageView = this.vJw.vJX;
    if (paramBoolean) {
      i = 0;
    }
    localImageView.setVisibility(i);
    GMTrace.o(1879048192000L, 14000);
  }
  
  public final void mR(int paramInt)
  {
    GMTrace.i(1879450845184L, 14003);
    this.kWb = paramInt;
    switch (paramInt)
    {
    }
    for (;;)
    {
      this.maC = System.currentTimeMillis();
      this.vJI = this.kWb;
      GMTrace.o(1879450845184L, 14003);
      return;
      this.vJt.vJU.Bq(255);
      this.vJu.vJU.Bq(0);
      this.vJv.vJU.Bq(0);
      this.vJw.vJU.Bq(0);
      this.vJt.vJV.setTextColor(this.vJx);
      this.vJu.vJV.setTextColor(this.vJB);
      this.vJv.vJV.setTextColor(this.vJB);
      this.vJw.vJV.setTextColor(this.vJB);
      continue;
      this.vJt.vJU.Bq(0);
      this.vJu.vJU.Bq(255);
      this.vJv.vJU.Bq(0);
      this.vJw.vJU.Bq(0);
      this.vJt.vJV.setTextColor(this.vJB);
      this.vJu.vJV.setTextColor(this.vJx);
      this.vJv.vJV.setTextColor(this.vJB);
      this.vJw.vJV.setTextColor(this.vJB);
      continue;
      this.vJt.vJU.Bq(0);
      this.vJu.vJU.Bq(0);
      this.vJv.vJU.Bq(255);
      this.vJw.vJU.Bq(0);
      this.vJt.vJV.setTextColor(this.vJB);
      this.vJu.vJV.setTextColor(this.vJB);
      this.vJv.vJV.setTextColor(this.vJx);
      this.vJw.vJV.setTextColor(this.vJB);
      continue;
      this.vJt.vJU.Bq(0);
      this.vJu.vJU.Bq(0);
      this.vJv.vJU.Bq(0);
      this.vJw.vJU.Bq(255);
      this.vJt.vJV.setTextColor(this.vJB);
      this.vJu.vJV.setTextColor(this.vJB);
      this.vJv.vJV.setTextColor(this.vJB);
      this.vJw.vJV.setTextColor(this.vJx);
    }
  }
  
  protected final class a
  {
    View vJT;
    TabIconView vJU;
    TextView vJV;
    TextView vJW;
    ImageView vJX;
    
    protected a()
    {
      GMTrace.i(3087678832640L, 23005);
      GMTrace.o(3087678832640L, 23005);
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\ui\LauncherUIBottomTabView.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */