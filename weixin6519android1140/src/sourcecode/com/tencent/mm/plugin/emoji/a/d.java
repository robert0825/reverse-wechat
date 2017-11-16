package com.tencent.mm.plugin.emoji.a;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.TextView;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.R.f;
import com.tencent.mm.protocal.c.rh;

public final class d
  extends com.tencent.mm.plugin.emoji.a.a.a
{
  public d(Context paramContext)
  {
    super(paramContext);
    GMTrace.i(11356967272448L, 84616);
    GMTrace.o(11356967272448L, 84616);
  }
  
  public final int aqj()
  {
    GMTrace.i(11357369925632L, 84619);
    GMTrace.o(11357369925632L, 84619);
    return 0;
  }
  
  public final int aqk()
  {
    GMTrace.i(11357638361088L, 84621);
    GMTrace.o(11357638361088L, 84621);
    return 0;
  }
  
  public final int aql()
  {
    GMTrace.i(11357906796544L, 84623);
    GMTrace.o(11357906796544L, 84623);
    return 0;
  }
  
  public final View b(int paramInt, View paramView, ViewGroup paramViewGroup)
  {
    GMTrace.i(11357235707904L, 84618);
    paramViewGroup = (a)paramView.getTag();
    Object localObject = mC(paramInt);
    if ((paramViewGroup != null) && (localObject != null))
    {
      ((com.tencent.mm.plugin.emoji.a.a.f)localObject).khE = false;
      ((com.tencent.mm.plugin.emoji.a.a.f)localObject).khF = false;
      localObject = ((com.tencent.mm.plugin.emoji.a.a.f)localObject).khA;
      if (localObject != null)
      {
        paramViewGroup.setTitle(((rh)localObject).uhe);
        com.tencent.mm.ao.n.Jd().a(((rh)localObject).lRV, paramViewGroup.apV(), com.tencent.mm.plugin.emoji.e.f.bQ(((rh)localObject).tRS, ((rh)localObject).lRV));
        paramViewGroup.vE(com.tencent.mm.pluginsdk.i.n.ad("yyyy-MM-dd", ((rh)localObject).uhM * 1000L));
      }
    }
    GMTrace.o(11357235707904L, 84618);
    return paramView;
  }
  
  protected final a c(Context paramContext, View paramView)
  {
    GMTrace.i(11357101490176L, 84617);
    paramContext = new a(paramContext, paramView);
    paramContext.a(this.khp);
    GMTrace.o(11357101490176L, 84617);
    return paramContext;
  }
  
  public final void mA(int paramInt)
  {
    GMTrace.i(11357772578816L, 84622);
    GMTrace.o(11357772578816L, 84622);
  }
  
  public final void mB(int paramInt)
  {
    GMTrace.i(11358041014272L, 84624);
    GMTrace.o(11358041014272L, 84624);
  }
  
  public final void mz(int paramInt)
  {
    GMTrace.i(11357504143360L, 84620);
    GMTrace.o(11357504143360L, 84620);
  }
  
  public final class a
    extends a
  {
    public a(Context paramContext, View paramView)
    {
      super(paramView);
      GMTrace.i(11338445225984L, 84478);
      GMTrace.o(11338445225984L, 84478);
    }
    
    protected final void apS()
    {
      GMTrace.i(11338579443712L, 84479);
      this.kgb.setVisibility(8);
      this.kgd.setVisibility(8);
      this.kgc.setVisibility(0);
      this.kge.setVisibility(8);
      this.kgi.setVisibility(8);
      this.kgj.setVisibility(8);
      this.kga.setVisibility(0);
      this.izE.setVisibility(0);
      this.kgg.setVisibility(0);
      this.kgf.setVisibility(0);
      this.kgf.setBackgroundDrawable(null);
      this.kgh.setVisibility(0);
      GMTrace.o(11338579443712L, 84479);
    }
    
    protected final int[] apT()
    {
      GMTrace.i(11338713661440L, 84480);
      int i = com.tencent.mm.br.a.V(this.mContext, R.f.aRW);
      GMTrace.o(11338713661440L, 84480);
      return new int[] { i, i };
    }
    
    protected final int apU()
    {
      GMTrace.i(11338847879168L, 84481);
      int i = com.tencent.mm.br.a.V(this.mContext, R.f.aRX);
      GMTrace.o(11338847879168L, 84481);
      return i;
    }
    
    protected final boolean aqb()
    {
      GMTrace.i(11338982096896L, 84482);
      GMTrace.o(11338982096896L, 84482);
      return true;
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\plugin\emoji\a\d.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */