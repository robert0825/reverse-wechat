package com.tencent.mm.plugin.emoji.a;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.TextView;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.R.f;
import com.tencent.mm.R.g;
import com.tencent.mm.ao.n;
import com.tencent.mm.plugin.emoji.a.a.e;
import com.tencent.mm.protocal.c.qy;
import com.tencent.mm.protocal.c.rh;
import com.tencent.mm.sdk.platformtools.bg;

public class f
  extends com.tencent.mm.plugin.emoji.a.a.a
{
  private final String TAG;
  public boolean kgI;
  public boolean kgJ;
  public boolean kgK;
  public boolean kgL;
  
  public f(Context paramContext)
  {
    super(paramContext);
    GMTrace.i(11339250532352L, 84484);
    this.TAG = "MicroMsg.emoji.EmojiStoreMainAdapter";
    this.kgI = false;
    this.kgJ = true;
    this.kgK = false;
    this.kgL = true;
    GMTrace.o(11339250532352L, 84484);
  }
  
  public int aqj()
  {
    GMTrace.i(11339787403264L, 84488);
    GMTrace.o(11339787403264L, 84488);
    return 0;
  }
  
  public int aqk()
  {
    GMTrace.i(11340055838720L, 84490);
    GMTrace.o(11340055838720L, 84490);
    return 0;
  }
  
  public int aql()
  {
    GMTrace.i(11340324274176L, 84492);
    GMTrace.o(11340324274176L, 84492);
    return 0;
  }
  
  public View b(int paramInt, View paramView, ViewGroup paramViewGroup)
  {
    GMTrace.i(11339653185536L, 84487);
    paramViewGroup = (a)paramView.getTag();
    Object localObject = mC(paramInt);
    if (this.kgK)
    {
      ((com.tencent.mm.plugin.emoji.a.a.f)localObject).khG = true;
      ((com.tencent.mm.plugin.emoji.a.a.f)localObject).khE = false;
      ((com.tencent.mm.plugin.emoji.a.a.f)localObject).khF = false;
    }
    qy localqy;
    label137:
    boolean bool;
    if ((paramViewGroup != null) && (localObject != null))
    {
      ((com.tencent.mm.plugin.emoji.a.a.f)localObject).khF = this.kgL;
      localqy = ((com.tencent.mm.plugin.emoji.a.a.f)localObject).khB;
      if (localqy != null) {
        break label243;
      }
      paramViewGroup.my(0);
      paramInt = 0;
      if (paramInt == 0)
      {
        localObject = ((com.tencent.mm.plugin.emoji.a.a.f)localObject).khA;
        if (localObject != null)
        {
          paramViewGroup.setTitle(((rh)localObject).uhe);
          if (!com.tencent.mm.plugin.emoji.h.a.d((rh)localObject)) {
            break label358;
          }
          n.Jd().a("", paramViewGroup.apV());
          paramViewGroup.mv(R.g.aXk);
          bool = e.bU(((rh)localObject).uhi, 2);
          if (TextUtils.isEmpty(((rh)localObject).uhP)) {
            break label389;
          }
          paramViewGroup.apW().setImageDrawable(null);
          paramViewGroup.apW().setVisibility(0);
          n.Jd().a(((rh)localObject).uhP, paramViewGroup.apW(), com.tencent.mm.plugin.emoji.e.f.bQ("", ((rh)localObject).uhP));
        }
      }
    }
    for (;;)
    {
      paramViewGroup.vF(((rh)localObject).uhO);
      if ((this.kgI) && (paramViewGroup.kfZ != null)) {
        paramViewGroup.kfZ.setBackgroundResource(R.g.aVP);
      }
      GMTrace.o(11339653185536L, 84487);
      return paramView;
      label243:
      paramViewGroup.setTitle(localqy.eBt);
      paramViewGroup.vF(localqy.lPj);
      if (!bg.nm(localqy.lRV)) {
        n.Jd().a(localqy.lRV, paramViewGroup.apV(), com.tencent.mm.plugin.emoji.e.f.bQ("", localqy.lRV));
      }
      if (!bg.nm(localqy.ugY))
      {
        n.Jd().a(localqy.ugY, paramViewGroup.apW(), com.tencent.mm.plugin.emoji.e.f.bQ("", localqy.ugY));
        paramViewGroup.mw(0);
      }
      for (;;)
      {
        paramViewGroup.my(8);
        paramInt = 1;
        break;
        paramViewGroup.mw(8);
      }
      label358:
      n.Jd().a(((rh)localObject).lRV, paramViewGroup.apV(), com.tencent.mm.plugin.emoji.e.f.bQ(((rh)localObject).tRS, ((rh)localObject).lRV));
      break label137;
      label389:
      if (bool)
      {
        paramViewGroup.mw(0);
        paramViewGroup.mx(R.g.aWp);
      }
      else
      {
        paramViewGroup.mw(8);
      }
    }
  }
  
  protected final a c(Context paramContext, View paramView)
  {
    GMTrace.i(11339384750080L, 84485);
    paramContext = new a(paramContext, paramView);
    paramContext.a(this.khp);
    GMTrace.o(11339384750080L, 84485);
    return paramContext;
  }
  
  public final void clear()
  {
    GMTrace.i(11339518967808L, 84486);
    super.clear();
    GMTrace.o(11339518967808L, 84486);
  }
  
  public void mA(int paramInt)
  {
    GMTrace.i(11340190056448L, 84491);
    GMTrace.o(11340190056448L, 84491);
  }
  
  public void mB(int paramInt)
  {
    GMTrace.i(11340458491904L, 84493);
    GMTrace.o(11340458491904L, 84493);
  }
  
  public void mz(int paramInt)
  {
    GMTrace.i(11339921620992L, 84489);
    GMTrace.o(11339921620992L, 84489);
  }
  
  public final class a
    extends a
  {
    public a(Context paramContext, View paramView)
    {
      super(paramView);
      GMTrace.i(11334552911872L, 84449);
      GMTrace.o(11334552911872L, 84449);
    }
    
    protected final void apS()
    {
      GMTrace.i(11334687129600L, 84450);
      this.kgb.setVisibility(8);
      apX();
      this.kge.setVisibility(8);
      this.kgi.setVisibility(8);
      this.kgj.setVisibility(8);
      this.kga.setVisibility(0);
      this.izE.setVisibility(0);
      this.kgg.setVisibility(0);
      this.kgf.setVisibility(0);
      this.kgh.setVisibility(0);
      GMTrace.o(11334687129600L, 84450);
    }
    
    protected final int[] apT()
    {
      GMTrace.i(11334821347328L, 84451);
      int i = com.tencent.mm.br.a.V(this.mContext, R.f.aRU);
      GMTrace.o(11334821347328L, 84451);
      return new int[] { i, i };
    }
    
    protected final int apU()
    {
      GMTrace.i(11334955565056L, 84452);
      int i = com.tencent.mm.br.a.V(this.mContext, R.f.aRT);
      GMTrace.o(11334955565056L, 84452);
      return i;
    }
    
    protected final boolean aqb()
    {
      GMTrace.i(11335089782784L, 84453);
      boolean bool = f.a(f.this);
      GMTrace.o(11335089782784L, 84453);
      return bool;
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\plugin\emoji\a\f.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */