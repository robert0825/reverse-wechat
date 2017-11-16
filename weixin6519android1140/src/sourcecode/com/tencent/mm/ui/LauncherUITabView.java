package com.tencent.mm.ui;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Bitmap.Config;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.os.Message;
import android.util.AttributeSet;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup.LayoutParams;
import android.widget.ImageView;
import android.widget.ImageView.ScaleType;
import android.widget.LinearLayout;
import android.widget.LinearLayout.LayoutParams;
import android.widget.RelativeLayout;
import android.widget.RelativeLayout.LayoutParams;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.R.e;
import com.tencent.mm.R.f;
import com.tencent.mm.R.l;
import com.tencent.mm.g.a.jc;
import com.tencent.mm.sdk.platformtools.ae;
import com.tencent.mm.sdk.platformtools.w;

public class LauncherUITabView
  extends RelativeLayout
  implements c
{
  protected int kWb;
  private Matrix mLh;
  private long maC;
  private int vJI;
  protected View.OnClickListener vJK;
  private ae vJL;
  private int vJM;
  private int vJN;
  private int vJO;
  private boolean vJP;
  private int vJQ;
  private boolean vJR;
  private c.a vJs;
  private int vKa;
  private Bitmap vKb;
  private ImageView vKc;
  protected a vKd;
  protected a vKe;
  protected a vKf;
  protected a vKg;
  
  public LauncherUITabView(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
    GMTrace.i(3471273099264L, 25863);
    this.kWb = 0;
    this.mLh = new Matrix();
    this.maC = 0L;
    this.vJI = -1;
    this.vJK = new View.OnClickListener()
    {
      private final long pPS;
      
      public final void onClick(View paramAnonymousView)
      {
        GMTrace.i(2905276940288L, 21646);
        int i = ((Integer)paramAnonymousView.getTag()).intValue();
        if ((LauncherUITabView.a(LauncherUITabView.this) == i) && (i == 0) && (System.currentTimeMillis() - LauncherUITabView.b(LauncherUITabView.this) <= 300L))
        {
          w.v("MicroMsg.LauncherUITabView", "onMainTabDoubleClick");
          LauncherUITabView.c(LauncherUITabView.this).removeMessages(0);
          com.tencent.mm.sdk.b.a.vgX.m(new jc());
          LauncherUITabView.a(LauncherUITabView.this, System.currentTimeMillis());
          LauncherUITabView.a(LauncherUITabView.this, i);
          GMTrace.o(2905276940288L, 21646);
          return;
        }
        if (LauncherUITabView.d(LauncherUITabView.this) != null)
        {
          if ((i != 0) || (LauncherUITabView.a(LauncherUITabView.this) != 0))
          {
            LauncherUITabView.a(LauncherUITabView.this, System.currentTimeMillis());
            LauncherUITabView.a(LauncherUITabView.this, i);
            LauncherUITabView.d(LauncherUITabView.this).mS(i);
            GMTrace.o(2905276940288L, 21646);
            return;
          }
          LauncherUITabView.c(LauncherUITabView.this).sendEmptyMessageDelayed(0, 300L);
        }
        LauncherUITabView.a(LauncherUITabView.this, System.currentTimeMillis());
        LauncherUITabView.a(LauncherUITabView.this, i);
        w.w("MicroMsg.LauncherUITabView", "on tab click, index %d, but listener is null", new Object[] { (Integer)paramAnonymousView.getTag() });
        GMTrace.o(2905276940288L, 21646);
      }
    };
    this.vJL = new ae()
    {
      public final void handleMessage(Message paramAnonymousMessage)
      {
        GMTrace.i(2901384626176L, 21617);
        w.v("MicroMsg.LauncherUITabView", "onMainTabClick");
        LauncherUITabView.d(LauncherUITabView.this).mS(0);
        GMTrace.o(2901384626176L, 21617);
      }
    };
    this.vJM = 0;
    this.vJN = 0;
    this.vJO = 0;
    this.vJQ = 0;
    this.vJP = false;
    this.vJR = false;
    init();
    GMTrace.o(3471273099264L, 25863);
  }
  
  public LauncherUITabView(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
    GMTrace.i(3471407316992L, 25864);
    this.kWb = 0;
    this.mLh = new Matrix();
    this.maC = 0L;
    this.vJI = -1;
    this.vJK = new View.OnClickListener()
    {
      private final long pPS;
      
      public final void onClick(View paramAnonymousView)
      {
        GMTrace.i(2905276940288L, 21646);
        int i = ((Integer)paramAnonymousView.getTag()).intValue();
        if ((LauncherUITabView.a(LauncherUITabView.this) == i) && (i == 0) && (System.currentTimeMillis() - LauncherUITabView.b(LauncherUITabView.this) <= 300L))
        {
          w.v("MicroMsg.LauncherUITabView", "onMainTabDoubleClick");
          LauncherUITabView.c(LauncherUITabView.this).removeMessages(0);
          com.tencent.mm.sdk.b.a.vgX.m(new jc());
          LauncherUITabView.a(LauncherUITabView.this, System.currentTimeMillis());
          LauncherUITabView.a(LauncherUITabView.this, i);
          GMTrace.o(2905276940288L, 21646);
          return;
        }
        if (LauncherUITabView.d(LauncherUITabView.this) != null)
        {
          if ((i != 0) || (LauncherUITabView.a(LauncherUITabView.this) != 0))
          {
            LauncherUITabView.a(LauncherUITabView.this, System.currentTimeMillis());
            LauncherUITabView.a(LauncherUITabView.this, i);
            LauncherUITabView.d(LauncherUITabView.this).mS(i);
            GMTrace.o(2905276940288L, 21646);
            return;
          }
          LauncherUITabView.c(LauncherUITabView.this).sendEmptyMessageDelayed(0, 300L);
        }
        LauncherUITabView.a(LauncherUITabView.this, System.currentTimeMillis());
        LauncherUITabView.a(LauncherUITabView.this, i);
        w.w("MicroMsg.LauncherUITabView", "on tab click, index %d, but listener is null", new Object[] { (Integer)paramAnonymousView.getTag() });
        GMTrace.o(2905276940288L, 21646);
      }
    };
    this.vJL = new ae()
    {
      public final void handleMessage(Message paramAnonymousMessage)
      {
        GMTrace.i(2901384626176L, 21617);
        w.v("MicroMsg.LauncherUITabView", "onMainTabClick");
        LauncherUITabView.d(LauncherUITabView.this).mS(0);
        GMTrace.o(2901384626176L, 21617);
      }
    };
    this.vJM = 0;
    this.vJN = 0;
    this.vJO = 0;
    this.vJQ = 0;
    this.vJP = false;
    this.vJR = false;
    init();
    GMTrace.o(3471407316992L, 25864);
  }
  
  private a AR(int paramInt)
  {
    GMTrace.i(3471675752448L, 25866);
    a locala = new a();
    locala.vKi = new MMTabView(getContext(), paramInt);
    locala.vKi.setTag(Integer.valueOf(paramInt));
    locala.vKi.setOnClickListener(this.vJK);
    GMTrace.o(3471675752448L, 25866);
    return locala;
  }
  
  private void init()
  {
    GMTrace.i(3471809970176L, 25867);
    LinearLayout localLinearLayout = new LinearLayout(getContext());
    localLinearLayout.setBackgroundResource(R.e.white);
    localLinearLayout.setId(2307141);
    localLinearLayout.setOrientation(0);
    addView(localLinearLayout, new RelativeLayout.LayoutParams(-1, -2));
    this.vKc = new ImageView(getContext());
    this.vKc.setImageMatrix(this.mLh);
    this.vKc.setScaleType(ImageView.ScaleType.MATRIX);
    this.vKc.setId(2307142);
    Object localObject = new RelativeLayout.LayoutParams(-1, com.tencent.mm.br.a.fromDPToPix(getContext(), 3));
    ((RelativeLayout.LayoutParams)localObject).addRule(8, 2307141);
    addView(this.vKc, (ViewGroup.LayoutParams)localObject);
    localObject = AR(0);
    ((a)localObject).vKi.setText(R.l.dHE);
    LinearLayout.LayoutParams localLayoutParams = new LinearLayout.LayoutParams(0, getResources().getDimensionPixelSize(R.f.aSW));
    localLayoutParams.weight = 1.0F;
    localLinearLayout.addView(((a)localObject).vKi, localLayoutParams);
    this.vKd = ((a)localObject);
    localObject = AR(1);
    ((a)localObject).vKi.setText(R.l.dHF);
    localLayoutParams = new LinearLayout.LayoutParams(0, getResources().getDimensionPixelSize(R.f.aSW));
    localLayoutParams.weight = 1.0F;
    localLinearLayout.addView(((a)localObject).vKi, localLayoutParams);
    this.vKe = ((a)localObject);
    localObject = AR(2);
    ((a)localObject).vKi.setText(R.l.dHD);
    localLayoutParams = new LinearLayout.LayoutParams(0, getResources().getDimensionPixelSize(R.f.aSW));
    localLayoutParams.weight = 1.0F;
    localLinearLayout.addView(((a)localObject).vKi, localLayoutParams);
    this.vKf = ((a)localObject);
    localObject = AR(3);
    ((a)localObject).vKi.setText(R.l.dId);
    localLayoutParams = new LinearLayout.LayoutParams(0, getResources().getDimensionPixelSize(R.f.aSW));
    localLayoutParams.weight = 1.0F;
    localLinearLayout.addView(((a)localObject).vKi, localLayoutParams);
    this.vKg = ((a)localObject);
    GMTrace.o(3471809970176L, 25867);
  }
  
  public final void AM(int paramInt)
  {
    GMTrace.i(3472078405632L, 25869);
    w.d("MicroMsg.LauncherUITabView", "updateMainTabUnread %d", new Object[] { Integer.valueOf(paramInt) });
    this.vJM = paramInt;
    if (paramInt > 0)
    {
      if (paramInt > 99)
      {
        this.vKd.vKi.Vh(getContext().getString(R.l.efe));
        GMTrace.o(3472078405632L, 25869);
        return;
      }
      this.vKd.vKi.Vh(String.valueOf(paramInt));
      GMTrace.o(3472078405632L, 25869);
      return;
    }
    this.vKd.vKi.Vh(null);
    GMTrace.o(3472078405632L, 25869);
  }
  
  public final void AN(int paramInt)
  {
    GMTrace.i(3472346841088L, 25871);
    this.vJN = paramInt;
    if (paramInt > 0)
    {
      if (paramInt > 99)
      {
        this.vKe.vKi.Vh(getContext().getString(R.l.efe));
        GMTrace.o(3472346841088L, 25871);
        return;
      }
      this.vKe.vKi.Vh(String.valueOf(paramInt));
      GMTrace.o(3472346841088L, 25871);
      return;
    }
    this.vKe.vKi.Vh(null);
    GMTrace.o(3472346841088L, 25871);
  }
  
  public final void AO(int paramInt)
  {
    GMTrace.i(3472481058816L, 25872);
    this.vJO = paramInt;
    if (paramInt > 0)
    {
      if (paramInt > 99)
      {
        this.vKf.vKi.Vh(getContext().getString(R.l.efe));
        GMTrace.o(3472481058816L, 25872);
        return;
      }
      this.vKf.vKi.Vh(String.valueOf(paramInt));
      GMTrace.o(3472481058816L, 25872);
      return;
    }
    this.vKf.vKi.Vh(null);
    GMTrace.o(3472481058816L, 25872);
  }
  
  public final void AP(int paramInt)
  {
    GMTrace.i(3472615276544L, 25873);
    this.vJQ = paramInt;
    if (paramInt > 0)
    {
      if (paramInt > 99)
      {
        this.vKg.vKi.Vh(getContext().getString(R.l.efe));
        GMTrace.o(3472615276544L, 25873);
        return;
      }
      this.vKg.vKi.Vh(String.valueOf(paramInt));
      GMTrace.o(3472615276544L, 25873);
      return;
    }
    this.vKg.vKi.Vh(null);
    GMTrace.o(3472615276544L, 25873);
  }
  
  public final void a(c.a parama)
  {
    GMTrace.i(3471541534720L, 25865);
    this.vJs = parama;
    GMTrace.o(3471541534720L, 25865);
  }
  
  public final void bVW()
  {
    GMTrace.i(3472212623360L, 25870);
    if ((this.vKd == null) || (this.vKe == null) || (this.vKf == null) || (this.vKg == null))
    {
      GMTrace.o(3472212623360L, 25870);
      return;
    }
    this.vKd.vKi.bXO();
    this.vKe.vKi.bXO();
    this.vKf.vKi.bXO();
    this.vKg.vKi.bXO();
    GMTrace.o(3472212623360L, 25870);
  }
  
  public final int bVX()
  {
    GMTrace.i(3473420582912L, 25879);
    int i = this.vJM;
    GMTrace.o(3473420582912L, 25879);
    return i;
  }
  
  public final int bVY()
  {
    GMTrace.i(3473554800640L, 25880);
    int i = this.vJN;
    GMTrace.o(3473554800640L, 25880);
    return i;
  }
  
  public final int bVZ()
  {
    GMTrace.i(3473689018368L, 25881);
    int i = this.vJO;
    GMTrace.o(3473689018368L, 25881);
    return i;
  }
  
  public final int bWa()
  {
    GMTrace.i(3473823236096L, 25882);
    int i = this.vJQ;
    GMTrace.o(3473823236096L, 25882);
    return i;
  }
  
  public final boolean bWb()
  {
    GMTrace.i(3473957453824L, 25883);
    boolean bool = this.vJP;
    GMTrace.o(3473957453824L, 25883);
    return bool;
  }
  
  public final boolean bWc()
  {
    GMTrace.i(3474091671552L, 25884);
    boolean bool = this.vJR;
    GMTrace.o(3474091671552L, 25884);
    return bool;
  }
  
  public final int bWd()
  {
    GMTrace.i(3473152147456L, 25877);
    int i = this.kWb;
    GMTrace.o(3473152147456L, 25877);
    return i;
  }
  
  public final void h(int paramInt, float paramFloat)
  {
    GMTrace.i(3473017929728L, 25876);
    this.mLh.setTranslate(this.vKa * (paramInt + paramFloat), 0.0F);
    this.vKc.setImageMatrix(this.mLh);
    GMTrace.o(3473017929728L, 25876);
  }
  
  public final void kR(boolean paramBoolean)
  {
    GMTrace.i(3472749494272L, 25874);
    this.vJP = paramBoolean;
    this.vKf.vKi.ln(paramBoolean);
    GMTrace.o(3472749494272L, 25874);
  }
  
  public final void kS(boolean paramBoolean)
  {
    GMTrace.i(3472883712000L, 25875);
    this.vJR = paramBoolean;
    this.vKg.vKi.ln(paramBoolean);
    GMTrace.o(3472883712000L, 25875);
  }
  
  public final void mR(int paramInt)
  {
    GMTrace.i(3473286365184L, 25878);
    this.kWb = paramInt;
    MMTabView localMMTabView = this.vKd.vKi;
    if (paramInt == 0)
    {
      localColorStateList = getResources().getColorStateList(R.e.aPp);
      localMMTabView.setTextColor(localColorStateList);
      localMMTabView = this.vKe.vKi;
      if (paramInt != 1) {
        break label168;
      }
      localColorStateList = getResources().getColorStateList(R.e.aPp);
      label66:
      localMMTabView.setTextColor(localColorStateList);
      localMMTabView = this.vKf.vKi;
      if (paramInt != 2) {
        break label182;
      }
      localColorStateList = getResources().getColorStateList(R.e.aPp);
      label95:
      localMMTabView.setTextColor(localColorStateList);
      localMMTabView = this.vKg.vKi;
      if (paramInt != 3) {
        break label196;
      }
    }
    label168:
    label182:
    label196:
    for (ColorStateList localColorStateList = getResources().getColorStateList(R.e.aPp);; localColorStateList = getResources().getColorStateList(R.e.aOi))
    {
      localMMTabView.setTextColor(localColorStateList);
      this.maC = System.currentTimeMillis();
      this.vJI = this.kWb;
      GMTrace.o(3473286365184L, 25878);
      return;
      localColorStateList = getResources().getColorStateList(R.e.aOi);
      break;
      localColorStateList = getResources().getColorStateList(R.e.aOi);
      break label66;
      localColorStateList = getResources().getColorStateList(R.e.aOi);
      break label95;
    }
  }
  
  protected void onLayout(boolean paramBoolean, int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    GMTrace.i(3471944187904L, 25868);
    super.onLayout(paramBoolean, paramInt1, paramInt2, paramInt3, paramInt4);
    w.d("MicroMsg.LauncherUITabView", "on layout, width %d", new Object[] { Integer.valueOf(paramInt3 - paramInt1) });
    this.vKa = ((paramInt3 - paramInt1) / 4);
    paramInt2 = this.vKa;
    if ((this.vKb == null) || (this.vKb.getWidth() != paramInt2)) {
      if (this.vKb != null) {
        break label193;
      }
    }
    label193:
    for (paramInt1 = -1;; paramInt1 = this.vKb.getWidth())
    {
      w.w("MicroMsg.LauncherUITabView", "sharp width changed, from %d to %d", new Object[] { Integer.valueOf(paramInt1), Integer.valueOf(paramInt2) });
      this.vKb = Bitmap.createBitmap(paramInt2, com.tencent.mm.br.a.fromDPToPix(getContext(), 3), Bitmap.Config.ARGB_8888);
      new Canvas(this.vKb).drawColor(getResources().getColor(R.e.aPp));
      h(this.kWb, 0.0F);
      this.vKc.setImageBitmap(this.vKb);
      mR(this.kWb);
      GMTrace.o(3471944187904L, 25868);
      return;
    }
  }
  
  protected final class a
  {
    MMTabView vKi;
    
    protected a()
    {
      GMTrace.i(1605244026880L, 11960);
      GMTrace.o(1605244026880L, 11960);
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes4-dex2jar.jar!\com\tencent\mm\ui\LauncherUITabView.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */