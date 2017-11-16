package com.tencent.mm.plugin.emoji.a;

import android.app.ProgressDialog;
import android.content.Context;
import android.content.res.Resources;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.TextView;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.R.e;
import com.tencent.mm.R.f;
import com.tencent.mm.R.g;
import com.tencent.mm.R.l;
import com.tencent.mm.ao.n;
import com.tencent.mm.g.a.cs;
import com.tencent.mm.plugin.emoji.a.a.d;
import com.tencent.mm.plugin.emoji.model.e;
import com.tencent.mm.plugin.emoji.model.g.a;
import com.tencent.mm.protocal.c.rh;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;

public final class c
  extends com.tencent.mm.plugin.emoji.a.a.a
{
  private final String TAG;
  private ProgressDialog kgz;
  
  public c(Context paramContext)
  {
    super(paramContext);
    GMTrace.i(11332673863680L, 84435);
    this.TAG = "MicroMsg.emoji.EmojiMineAdapter";
    GMTrace.o(11332673863680L, 84435);
  }
  
  protected final com.tencent.mm.plugin.emoji.a.a.c a(e parame)
  {
    GMTrace.i(11333210734592L, 84439);
    parame = new d(parame);
    GMTrace.o(11333210734592L, 84439);
    return parame;
  }
  
  public final void aN(String paramString, int paramInt)
  {
    GMTrace.i(11333344952320L, 84440);
    if (paramInt == 7) {
      super.aN(paramString, paramInt);
    }
    GMTrace.o(11333344952320L, 84440);
  }
  
  protected final void aqi()
  {
    GMTrace.i(11333613387776L, 84442);
    super.aqi();
    GMTrace.o(11333613387776L, 84442);
  }
  
  public final int aqj()
  {
    GMTrace.i(11333747605504L, 84443);
    GMTrace.o(11333747605504L, 84443);
    return 0;
  }
  
  public final int aqk()
  {
    GMTrace.i(11334016040960L, 84445);
    GMTrace.o(11334016040960L, 84445);
    return 0;
  }
  
  public final int aql()
  {
    GMTrace.i(11334284476416L, 84447);
    GMTrace.o(11334284476416L, 84447);
    return 0;
  }
  
  public final View b(int paramInt, View paramView, ViewGroup paramViewGroup)
  {
    GMTrace.i(11332942299136L, 84437);
    paramViewGroup = (a)paramView.getTag();
    Object localObject = mC(paramInt);
    if ((paramViewGroup != null) && (localObject != null))
    {
      localObject = ((com.tencent.mm.plugin.emoji.a.a.f)localObject).khA;
      if (localObject != null)
      {
        if (!com.tencent.mm.plugin.emoji.h.a.d((rh)localObject)) {
          break label96;
        }
        paramViewGroup.setTitle(R.l.dpp);
        paramViewGroup.mv(R.g.aXk);
        if (paramInt + 1 != getCount()) {
          break label180;
        }
        paramViewGroup.kfZ.setBackgroundResource(R.g.aVP);
      }
    }
    for (;;)
    {
      GMTrace.o(11332942299136L, 84437);
      return paramView;
      label96:
      if (!bg.nm(((rh)localObject).uhe)) {
        paramViewGroup.setTitle(((rh)localObject).uhe);
      }
      for (;;)
      {
        if (bg.nm(((rh)localObject).lRV)) {
          break label170;
        }
        n.Jd().a(((rh)localObject).lRV, paramViewGroup.apV(), com.tencent.mm.plugin.emoji.e.f.bQ(((rh)localObject).tRS, ((rh)localObject).lRV));
        break;
        paramViewGroup.setTitle(((rh)localObject).tRS);
      }
      label170:
      w.i("MicroMsg.emoji.EmojiMineAdapter", "Icon rul is null");
      break;
      label180:
      paramViewGroup.kfZ.setBackgroundResource(R.g.aVO);
    }
  }
  
  protected final a c(Context paramContext, View paramView)
  {
    GMTrace.i(11333076516864L, 84438);
    paramContext = new a(paramContext, paramView);
    paramContext.a(this.khp);
    GMTrace.o(11333076516864L, 84438);
    return paramContext;
  }
  
  public final void clear()
  {
    GMTrace.i(11333479170048L, 84441);
    if (this.kgz != null) {
      this.kgz.cancel();
    }
    super.clear();
    GMTrace.o(11333479170048L, 84441);
  }
  
  public final void mA(int paramInt)
  {
    GMTrace.i(11334150258688L, 84446);
    GMTrace.o(11334150258688L, 84446);
  }
  
  public final void mB(int paramInt)
  {
    GMTrace.i(11334418694144L, 84448);
    GMTrace.o(11334418694144L, 84448);
  }
  
  public final void mz(int paramInt)
  {
    GMTrace.i(11333881823232L, 84444);
    GMTrace.o(11333881823232L, 84444);
  }
  
  public final void notifyDataSetChanged()
  {
    GMTrace.i(11332808081408L, 84436);
    if (this.kho == null) {
      this.kho = a(null);
    }
    super.notifyDataSetChanged();
    GMTrace.o(11332808081408L, 84436);
  }
  
  public final class a
    extends a
  {
    public a(Context paramContext, View paramView)
    {
      super(paramView);
      GMTrace.i(11330660597760L, 84420);
      GMTrace.o(11330660597760L, 84420);
    }
    
    protected final boolean a(g.a parama, View paramView)
    {
      GMTrace.i(11330929033216L, 84422);
      apZ();
      boolean bool = super.a(parama, paramView);
      GMTrace.o(11330929033216L, 84422);
      return bool;
    }
    
    protected final void apS()
    {
      GMTrace.i(11330794815488L, 84421);
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
      GMTrace.o(11330794815488L, 84421);
    }
    
    protected final int[] apT()
    {
      GMTrace.i(11331197468672L, 84424);
      int i = this.mContext.getResources().getDimensionPixelSize(R.f.aPx);
      GMTrace.o(11331197468672L, 84424);
      return new int[] { i, i };
    }
    
    protected final int apU()
    {
      GMTrace.i(11331331686400L, 84425);
      GMTrace.o(11331331686400L, 84425);
      return -1;
    }
    
    protected final boolean aqb()
    {
      GMTrace.i(11331465904128L, 84426);
      GMTrace.o(11331465904128L, 84426);
      return true;
    }
    
    public final void aqe()
    {
      GMTrace.i(11331600121856L, 84427);
      if (this.kfY == null)
      {
        GMTrace.o(11331600121856L, 84427);
        return;
      }
      switch (apZ())
      {
      default: 
        this.kge.setVisibility(8);
        this.kgf.setBackgroundResource(R.g.aUI);
        this.kgf.setVisibility(0);
        this.kgh.setVisibility(0);
        this.kgh.setText(R.l.dpq);
        this.kgh.setTextColor(this.mContext.getResources().getColorStateList(R.e.aMV));
        this.kgi.setVisibility(4);
        this.kgi.setImageResource(R.g.aWf);
        this.kgj.setVisibility(4);
        GMTrace.o(11331600121856L, 84427);
        return;
      case 0: 
      case 3: 
        this.kge.setVisibility(8);
        this.kgf.setBackgroundResource(R.g.aUF);
        this.kgf.setVisibility(0);
        this.kgh.setVisibility(0);
        this.kgh.setText(R.l.doD);
        this.kgh.setTextColor(this.mContext.getResources().getColorStateList(R.e.aPs));
        this.kgi.setVisibility(4);
        this.kgi.setImageResource(R.g.aWf);
        this.kgj.setVisibility(4);
        GMTrace.o(11331600121856L, 84427);
        return;
      }
      aqc();
      GMTrace.o(11331600121856L, 84427);
    }
    
    protected final void b(g.a parama, View paramView)
    {
      GMTrace.i(11331063250944L, 84423);
      super.b(parama, paramView);
      if (com.tencent.mm.plugin.emoji.h.a.wB(apY()))
      {
        parama = new cs();
        parama.eDZ.eEa = apY();
        paramView = parama.eDZ;
        if (!com.tencent.mm.plugin.emoji.h.a.asF()) {
          break label104;
        }
      }
      label104:
      for (int i = 7;; i = 3)
      {
        paramView.status = i;
        parama.eDZ.progress = getProgress();
        parama.eDZ.eEb = this.kfY.khD;
        com.tencent.mm.sdk.b.a.vgX.m(parama);
        GMTrace.o(11331063250944L, 84423);
        return;
      }
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\plugin\emoji\a\c.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */