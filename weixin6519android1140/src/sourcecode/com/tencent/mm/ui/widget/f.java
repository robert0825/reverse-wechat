package com.tencent.mm.ui.widget;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.DialogInterface.OnDismissListener;
import android.content.res.Resources;
import android.graphics.Rect;
import android.os.Build.VERSION;
import android.support.design.widget.BottomSheetBehavior;
import android.support.design.widget.BottomSheetBehavior.a;
import android.support.design.widget.c;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.RecyclerView.a;
import android.support.v7.widget.RecyclerView.b;
import android.support.v7.widget.RecyclerView.t;
import android.util.DisplayMetrics;
import android.view.Display;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.view.ViewTreeObserver.OnGlobalLayoutListener;
import android.view.Window;
import android.view.WindowManager;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.FrameLayout.LayoutParams;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RadioButton;
import android.widget.TextView;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.bx.a.c;
import com.tencent.mm.bx.a.e;
import com.tencent.mm.bx.a.f;
import com.tencent.mm.ui.base.n;
import com.tencent.mm.ui.base.o;
import com.tencent.mm.ui.base.p.a;
import com.tencent.mm.ui.base.p.b;
import com.tencent.mm.ui.base.p.c;
import com.tencent.mm.ui.base.p.d;
import java.util.List;

public final class f
  implements ViewTreeObserver.OnGlobalLayoutListener
{
  public static int xpP;
  public static int xpQ;
  public static int xpR;
  private ViewTreeObserver Le;
  public RecyclerView Ub;
  private View gO;
  private View koX;
  public Context mContext;
  public boolean ofX;
  public p.c qik;
  public p.d qil;
  public n qim;
  private boolean rRs;
  private boolean rRt;
  public boolean rRu;
  public boolean rRv;
  public p.a xhT;
  public p.b xhU;
  public Dialog xpC;
  public p.d xpD;
  public n xpE;
  public Boolean xpF;
  private LinearLayout xpG;
  private LinearLayout xpH;
  public b xpI;
  public boolean xpJ;
  public boolean xpK;
  public boolean xpL;
  private int xpM;
  private BottomSheetBehavior xpN;
  public ImageView xpO;
  private int xpS;
  private int xpT;
  private int xpU;
  public int xpV;
  public boolean xpW;
  public boolean xpX;
  public boolean xpY;
  public boolean xpZ;
  public int xqa;
  private boolean xqb;
  public a xqc;
  private int yvM;
  
  static
  {
    GMTrace.i(13076699021312L, 97429);
    xpP = 0;
    xpQ = 1;
    xpR = 2;
    GMTrace.o(13076699021312L, 97429);
  }
  
  public f(Context paramContext, int paramInt, boolean paramBoolean)
  {
    GMTrace.i(13072940924928L, 97401);
    this.xpF = Boolean.valueOf(false);
    this.xpJ = false;
    this.xpK = false;
    this.xpL = false;
    this.rRs = false;
    this.xpS = 4;
    this.xpT = (this.xpS * 3);
    this.xpU = 6;
    this.ofX = false;
    this.xpX = false;
    this.rRv = false;
    this.xpY = false;
    this.xpZ = false;
    this.xqa = 0;
    this.xqb = false;
    this.xpV = paramInt;
    this.mContext = paramContext;
    this.xpW = paramBoolean;
    this.xpZ = false;
    if ((this.mContext instanceof Activity))
    {
      paramContext = (ViewGroup)((Activity)this.mContext).getWindow().getDecorView();
      if (paramContext.getChildCount() > 0) {
        this.gO = paramContext.getChildAt(0);
      }
    }
    else
    {
      paramContext = this.mContext;
      this.qim = new n();
      this.xpE = new n();
      if (!this.xqb) {
        break label637;
      }
      this.xpC = new a(paramContext);
      label205:
      this.koX = View.inflate(paramContext, a.f.xvq, null);
      this.xpG = ((LinearLayout)this.koX.findViewById(a.e.xvi));
      this.xpH = ((LinearLayout)this.koX.findViewById(a.e.xvg));
      this.xpO = ((ImageView)this.koX.findViewById(a.e.xvk));
      this.Ub = ((RecyclerView)this.koX.findViewById(a.e.xvh));
      this.Ub.Tc = true;
      this.rRs = aOU();
      if (this.xpV != xpP) {
        break label680;
      }
      if (!this.rRs) {
        break label652;
      }
      this.xpS = 7;
      this.xpT = (this.xpS * 2);
      this.xpM = (com.tencent.mm.br.a.W(this.mContext, a.c.xuU) + com.tencent.mm.br.a.W(this.mContext, a.c.aSq));
      label359:
      if (this.xpW) {
        this.xpM += com.tencent.mm.br.a.W(this.mContext, a.c.aSq);
      }
      label385:
      if ((this.xpW) && (this.xpO != null) && (this.xpZ)) {
        this.xpO.setVisibility(0);
      }
      if (this.xpV != xpP) {
        break label936;
      }
      this.Ub.a(new GridLayoutManager(this.mContext, this.xpS));
      int i = com.tencent.mm.br.a.W(this.mContext, a.c.aSp);
      paramInt = com.tencent.mm.br.a.W(this.mContext, a.c.aSq);
      if (this.xpW) {
        paramInt = com.tencent.mm.br.a.fromDPToPix(this.mContext, 0);
      }
      this.Ub.setPadding(i, paramInt, i, 0);
    }
    for (;;)
    {
      this.xpI = new b();
      this.xpI.RZ = new AdapterView.OnItemClickListener()
      {
        public final void onItemClick(AdapterView<?> paramAnonymousAdapterView, View paramAnonymousView, int paramAnonymousInt, long paramAnonymousLong)
        {
          GMTrace.i(13077504327680L, 97435);
          paramAnonymousAdapterView = (o)f.this.qim.wdA.get(paramAnonymousInt);
          if ((paramAnonymousAdapterView != null) && (paramAnonymousAdapterView.uTG))
          {
            GMTrace.o(13077504327680L, 97435);
            return;
          }
          if (paramAnonymousInt < f.this.qim.size()) {
            if (f.this.qil != null) {
              f.this.qil.c(f.this.qim.getItem(paramAnonymousInt), paramAnonymousInt);
            }
          }
          for (;;)
          {
            if (!f.this.ofX) {
              f.this.bFl();
            }
            f.this.xpX = true;
            f.this.xqa = paramAnonymousInt;
            f.this.xpI.TS.notifyChanged();
            GMTrace.o(13077504327680L, 97435);
            return;
            if ((f.this.xpE.size() > 0) && (paramAnonymousInt < f.this.qim.size() + f.this.xpE.size()) && (f.this.xpD != null)) {
              f.this.xpD.c(f.this.xpE.getItem(paramAnonymousInt - f.this.qim.size()), paramAnonymousInt);
            }
          }
        }
      };
      this.Ub.a(this.xpI);
      this.Ub.setOverScrollMode(1);
      this.xpC.setContentView(this.koX);
      if (!this.xqb)
      {
        this.xpN = BottomSheetBehavior.i((View)this.koX.getParent());
        this.xpN.g(this.xpM);
        this.xpN.ey = new BottomSheetBehavior.a()
        {
          public final void d(float paramAnonymousFloat)
          {
            GMTrace.i(13055761055744L, 97273);
            if ((f.this.xpO != null) && (!f.this.xpZ))
            {
              if (!f.this.Ub.canScrollVertically(-1))
              {
                f.this.xpO.setVisibility(4);
                GMTrace.o(13055761055744L, 97273);
                return;
              }
              if ((f.this.xpW) && (paramAnonymousFloat != 0.0F))
              {
                f.this.xpO.setVisibility(0);
                GMTrace.o(13055761055744L, 97273);
                return;
              }
              f.this.xpO.setVisibility(4);
            }
            GMTrace.o(13055761055744L, 97273);
          }
          
          public final void k(int paramAnonymousInt)
          {
            GMTrace.i(13055626838016L, 97272);
            GMTrace.o(13055626838016L, 97272);
          }
        };
      }
      this.xpC.setOnDismissListener(new DialogInterface.OnDismissListener()
      {
        public final void onDismiss(DialogInterface paramAnonymousDialogInterface)
        {
          GMTrace.i(13069719699456L, 97377);
          f.this.xpC = null;
          GMTrace.o(13069719699456L, 97377);
        }
      });
      GMTrace.o(13072940924928L, 97401);
      return;
      this.gO = paramContext;
      break;
      label637:
      this.xpC = new c(paramContext);
      break label205;
      label652:
      this.xpM = (com.tencent.mm.br.a.W(this.mContext, a.c.xuT) + com.tencent.mm.br.a.W(this.mContext, a.c.aSq));
      break label359;
      label680:
      if (this.xpV == xpR)
      {
        this.xpK = true;
        paramInt = com.tencent.mm.br.a.W(this.mContext, a.c.xuZ);
        if (this.rRs) {
          this.xpU = 2;
        }
        for (this.xpM = ((int)(paramInt * 2.5D) + com.tencent.mm.br.a.W(this.mContext, a.c.xuY));; this.xpM = ((int)(paramInt * 3.5D) + com.tencent.mm.br.a.W(this.mContext, a.c.xuY)))
        {
          if (!this.xpW) {
            break label796;
          }
          this.xpM += com.tencent.mm.br.a.fromDPToPix(this.mContext, 88);
          break;
          this.xpU = 3;
        }
        label796:
        break label385;
      }
      this.xpL = true;
      paramInt = com.tencent.mm.br.a.W(this.mContext, a.c.xva);
      if (this.rRs) {
        this.xpU = 4;
      }
      for (this.xpM = ((int)(paramInt * 4.5D) + com.tencent.mm.br.a.W(this.mContext, a.c.xuY));; this.xpM = ((int)(paramInt * 6.5D) + com.tencent.mm.br.a.W(this.mContext, a.c.xuY)))
      {
        if (this.xpW) {
          this.xpM += com.tencent.mm.br.a.W(this.mContext, a.c.aSq);
        }
        if (!this.xqb) {
          break;
        }
        paramInt = com.tencent.mm.br.a.fromDPToPix(this.mContext, 24);
        this.xpO.setPadding(paramInt, 0, paramInt, 0);
        break;
        this.xpU = 6;
      }
      label936:
      this.Ub.a(new LinearLayoutManager());
    }
  }
  
  private boolean aOU()
  {
    GMTrace.i(13073746231296L, 97407);
    DisplayMetrics localDisplayMetrics = this.mContext.getResources().getDisplayMetrics();
    if (localDisplayMetrics.widthPixels > localDisplayMetrics.heightPixels)
    {
      GMTrace.o(13073746231296L, 97407);
      return true;
    }
    GMTrace.o(13073746231296L, 97407);
    return false;
  }
  
  @SuppressLint({"WrongConstant"})
  private int getRotation()
  {
    GMTrace.i(21068559417344L, 156973);
    int i = 0;
    if ((this.mContext instanceof Activity)) {
      i = ((Activity)this.mContext).getWindow().getWindowManager().getDefaultDisplay().getRotation();
    }
    GMTrace.o(21068559417344L, 156973);
    return i;
  }
  
  public final void bFk()
  {
    GMTrace.i(13073343578112L, 97404);
    this.rRs = aOU();
    this.yvM = getRotation();
    if (this.qik != null) {
      this.qik.a(this.qim);
    }
    FrameLayout.LayoutParams localLayoutParams;
    int j;
    label143:
    label176:
    Rect localRect;
    if (this.xpC != null)
    {
      localLayoutParams = (FrameLayout.LayoutParams)this.koX.getLayoutParams();
      j = this.qim.size();
      if (!this.xpJ) {
        break label557;
      }
      i = j + 1;
      if (this.xqb)
      {
        j = com.tencent.mm.br.a.W(this.mContext, a.c.xva);
        if (!this.xpW) {
          break label582;
        }
        int k = com.tencent.mm.br.a.fromDPToPix(this.mContext, 132);
        this.xpM = ((int)(j * 4.0D) + k + com.tencent.mm.br.a.W(this.mContext, a.c.xuY));
      }
      if (this.xpV != xpP) {
        break label596;
      }
      if (this.xpI.getItemCount() > this.xpT) {
        localLayoutParams.height = this.xpM;
      }
      if ((this.rRs) && (this.gO != null))
      {
        localRect = new Rect();
        this.gO.getWindowVisibleDisplayFrame(localRect);
        if (!this.xqb) {
          break label668;
        }
        localLayoutParams.width = ((int)(localRect.right * 1.0F / 2.0F));
        localLayoutParams.height = localRect.bottom;
        if (this.xpW)
        {
          j = com.tencent.mm.br.a.W(this.mContext, a.c.xva);
          if (i > this.xpU) {
            break label652;
          }
          i = localLayoutParams.height - i * j;
          label277:
          if (this.xpG != null) {
            this.xpG.setMinimumHeight(i);
          }
        }
      }
      label292:
      this.koX.setLayoutParams(localLayoutParams);
      if ((this.xpE != null) && (this.xpI != null)) {
        this.xpI.TS.notifyChanged();
      }
      if (Build.VERSION.SDK_INT >= 21) {
        this.xpC.getWindow().addFlags(Integer.MIN_VALUE);
      }
      if ((this.rRt) && (Build.VERSION.SDK_INT >= 23) && (this.xpC != null))
      {
        this.xpC.getWindow().getDecorView().setSystemUiVisibility(9216);
        this.xpC.getWindow().setStatusBarColor(0);
      }
      if (this.rRu) {
        this.xpC.getWindow().addFlags(1024);
      }
      if (!this.rRv) {
        break label681;
      }
      this.xpC.getWindow().setFlags(8, 8);
      this.xpC.getWindow().addFlags(131200);
      this.xpC.getWindow().getDecorView().setSystemUiVisibility(6);
      label464:
      if (this.xpN != null) {
        this.xpN.eq = false;
      }
      if (this.xqc != null) {
        this.xpC.setOnDismissListener(new DialogInterface.OnDismissListener()
        {
          public final void onDismiss(DialogInterface paramAnonymousDialogInterface)
          {
            GMTrace.i(13048647516160L, 97220);
            if (!f.this.xpX) {
              f.this.xqc.onDismiss();
            }
            GMTrace.o(13048647516160L, 97220);
          }
        });
      }
      if (this.gO != null) {
        if (this.Le != null) {
          break label736;
        }
      }
    }
    label557:
    label582:
    label596:
    label652:
    label668:
    label681:
    label736:
    for (int i = 1;; i = 0)
    {
      this.Le = this.gO.getViewTreeObserver();
      if (i != 0) {
        this.Le.addOnGlobalLayoutListener(this);
      }
      this.xpC.show();
      GMTrace.o(13073343578112L, 97404);
      return;
      i = j;
      if (this.xpE.size() <= 0) {
        break;
      }
      i = j + this.xpE.size();
      break;
      this.xpM = ((int)(j * 6.5D));
      break label143;
      if (i > this.xpU) {
        localLayoutParams.height = this.xpM;
      }
      if ((!this.xqb) || (!this.xpW)) {
        break label176;
      }
      this.xpU = 4;
      if (i < this.xpU) {
        break label176;
      }
      localLayoutParams.height = this.xpM;
      break label176;
      i = localLayoutParams.height - j * this.xpU;
      break label277;
      localLayoutParams.width = localRect.right;
      break label292;
      this.xpC.getWindow().clearFlags(8);
      this.xpC.getWindow().clearFlags(131072);
      this.xpC.getWindow().clearFlags(128);
      this.xpC.getWindow().getDecorView().setSystemUiVisibility(0);
      break label464;
    }
  }
  
  public final void bFl()
  {
    GMTrace.i(13073477795840L, 97405);
    if (this.Le != null)
    {
      if (!this.Le.isAlive()) {
        this.Le = this.gO.getViewTreeObserver();
      }
      this.Le.removeGlobalOnLayoutListener(this);
      this.Le = null;
    }
    if (this.xpC != null)
    {
      if (this.xpN != null) {
        this.xpN.eq = true;
      }
      this.xpC.dismiss();
    }
    GMTrace.o(13073477795840L, 97405);
  }
  
  public final void d(CharSequence paramCharSequence, int paramInt)
  {
    GMTrace.i(13073209360384L, 97403);
    if ((this.xpG != null) && (this.xpW))
    {
      this.xpG.setVisibility(0);
      this.xpG.removeAllViews();
      this.xpG.setGravity(paramInt);
      View localView = LayoutInflater.from(this.mContext).inflate(a.f.xvu, null);
      TextView localTextView = (TextView)localView.findViewById(a.e.geB);
      localTextView.setText(paramCharSequence);
      localTextView.setGravity(paramInt | 0x50);
      this.xpG.addView(localView, -1, -2);
    }
    GMTrace.o(13073209360384L, 97403);
  }
  
  public final void dH(View paramView)
  {
    GMTrace.i(13073075142656L, 97402);
    if (paramView == null)
    {
      GMTrace.o(13073075142656L, 97402);
      return;
    }
    this.xpW = true;
    if (this.xpO != null) {
      this.xpO.setVisibility(0);
    }
    if (this.xpG != null)
    {
      this.xpG.setVisibility(0);
      this.xpG.removeAllViews();
      this.xpG.setGravity(17);
      this.xpG.addView(paramView, -1, -2);
    }
    GMTrace.o(13073075142656L, 97402);
  }
  
  public final boolean isShowing()
  {
    GMTrace.i(13073612013568L, 97406);
    if (this.xpC != null)
    {
      if (this.xpC.isShowing())
      {
        GMTrace.o(13073612013568L, 97406);
        return true;
      }
      GMTrace.o(13073612013568L, 97406);
      return false;
    }
    GMTrace.o(13073612013568L, 97406);
    return false;
  }
  
  public final void onGlobalLayout()
  {
    GMTrace.i(13072806707200L, 97400);
    if (isShowing())
    {
      View localView = this.gO;
      if ((localView == null) || (!localView.isShown()))
      {
        bFl();
        GMTrace.o(13072806707200L, 97400);
        return;
      }
      if ((isShowing()) && ((this.rRs != aOU()) || (this.yvM != getRotation()))) {
        bFl();
      }
    }
    GMTrace.o(13072806707200L, 97400);
  }
  
  public static abstract interface a
  {
    public abstract void onDismiss();
  }
  
  public final class b
    extends RecyclerView.a<a>
  {
    AdapterView.OnItemClickListener RZ;
    
    public b()
    {
      GMTrace.i(13081128206336L, 97462);
      GMTrace.o(13081128206336L, 97462);
    }
    
    public final int getItemCount()
    {
      GMTrace.i(13081262424064L, 97463);
      if (f.this.xpJ)
      {
        i = f.this.qim.size();
        j = f.this.xpE.size();
        GMTrace.o(13081262424064L, 97463);
        return i + j + 1;
      }
      int i = f.this.qim.size();
      int j = f.this.xpE.size();
      GMTrace.o(13081262424064L, 97463);
      return i + j;
    }
    
    public final class a
      extends RecyclerView.t
      implements View.OnClickListener
    {
      ImageView iCr;
      TextView ikm;
      TextView pGE;
      RadioButton xqe;
      ImageView xqf;
      LinearLayout xqg;
      
      public a(View paramView)
      {
        super();
        GMTrace.i(13071732965376L, 97392);
        paramView.setOnClickListener(this);
        this.ikm = ((TextView)paramView.findViewById(a.e.title));
        this.iCr = ((ImageView)paramView.findViewById(a.e.icon));
        this.xqg = ((LinearLayout)paramView.findViewById(a.e.bZf));
        if ((f.this.xpK) || (f.this.xpL))
        {
          this.pGE = ((TextView)paramView.findViewById(a.e.btg));
          this.xqe = ((RadioButton)paramView.findViewById(a.e.radio));
          this.xqf = ((ImageView)paramView.findViewById(a.e.divider));
        }
        GMTrace.o(13071732965376L, 97392);
      }
      
      public final void onClick(View paramView)
      {
        GMTrace.i(13071867183104L, 97393);
        if (f.b.this.RZ != null) {
          f.b.this.RZ.onItemClick(null, paramView, getPosition(), getPosition());
        }
        GMTrace.o(13071867183104L, 97393);
      }
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\ui\widget\f.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */