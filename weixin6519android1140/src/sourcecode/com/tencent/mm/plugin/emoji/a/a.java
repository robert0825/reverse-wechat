package com.tencent.mm.plugin.emoji.a;

import android.content.Context;
import android.content.res.Resources;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.view.ViewGroup.LayoutParams;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.TextView;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.R.e;
import com.tencent.mm.R.g;
import com.tencent.mm.R.h;
import com.tencent.mm.R.i;
import com.tencent.mm.R.l;
import com.tencent.mm.plugin.emoji.a.a.e;
import com.tencent.mm.plugin.emoji.a.a.f;
import com.tencent.mm.plugin.emoji.model.g.a;
import com.tencent.mm.protocal.c.rh;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;

public abstract class a
{
  private final String TAG;
  protected TextView izE;
  public int jP;
  private View kfS;
  private final int kfT;
  private final int kfU;
  private final int kfV;
  private int[] kfW;
  private int kfX;
  public f kfY;
  protected View kfZ;
  protected ImageView kga;
  protected ImageView kgb;
  protected TextView kgc;
  protected TextView kgd;
  protected ProgressBar kge;
  protected ViewGroup kgf;
  protected View kgg;
  protected TextView kgh;
  protected ImageView kgi;
  protected View kgj;
  protected ProgressBar kgk;
  protected TextView kgl;
  protected TextView kgm;
  protected FrameLayout kgn;
  protected View kgo;
  Context mContext;
  private LayoutInflater mLayoutInflater;
  
  public a(Context paramContext, View paramView)
  {
    this(paramContext, paramView, a.kgs);
    GMTrace.i(11342203322368L, 84506);
    GMTrace.o(11342203322368L, 84506);
  }
  
  private a(Context paramContext, View paramView, int paramInt)
  {
    GMTrace.i(11342337540096L, 84507);
    this.TAG = "MicroMsg.emoji.BaseEmojiItemHolder";
    this.kfT = R.i.cuB;
    this.kfU = R.i.cuM;
    this.kfV = R.i.cuN;
    this.kfW = new int[] { -1, -1 };
    this.kfX = -1;
    this.mContext = paramContext;
    this.mLayoutInflater = LayoutInflater.from(this.mContext);
    paramContext = paramView;
    if (paramView == null) {}
    switch (2.kgr[(paramInt - 1)])
    {
    default: 
      paramContext = mu(this.kfT);
      this.kgo = paramContext;
      if (paramContext != null)
      {
        this.kfS = paramContext;
        this.kfZ = this.kfS.findViewById(R.h.bIE);
        this.kgb = ((ImageView)this.kfS.findViewById(R.h.bJc));
        this.kga = ((ImageView)this.kfS.findViewById(R.h.bIL));
        this.izE = ((TextView)this.kfS.findViewById(R.h.bIS));
        this.kgc = ((TextView)this.kfS.findViewById(R.h.bIG));
        this.kgd = ((TextView)this.kfS.findViewById(R.h.bIN));
        this.kge = ((ProgressBar)this.kfS.findViewById(R.h.bTO));
        this.kgg = this.kfS.findViewById(R.h.bIU);
        this.kgf = ((ViewGroup)this.kfS.findViewById(R.h.bIW));
        this.kgh = ((TextView)this.kfS.findViewById(R.h.bIY));
        this.kgi = ((ImageView)this.kfS.findViewById(R.h.bIZ));
        this.kgj = this.kfS.findViewById(R.h.bIV);
        this.kgk = ((ProgressBar)this.kfS.findViewById(R.h.bII));
        this.kgl = ((TextView)this.kfS.findViewById(R.h.bID));
        this.kgm = ((TextView)this.kfS.findViewById(R.h.bIT));
        this.kgn = ((FrameLayout)this.kfS.findViewById(R.h.bIQ));
      }
      apS();
      if (paramInt == a.kgs)
      {
        paramView = apT();
        if ((this.kga != null) && (paramView[0] >= 0) && (paramView[1] >= 0) && ((paramView[0] != this.kfW[0]) || (paramView[1] != this.kfW[1]))) {
          break label535;
        }
        label461:
        paramInt = apU();
        if ((this.kfS != null) && (paramInt >= 0) && (this.kfX != paramInt)) {
          break label577;
        }
      }
      break;
    }
    for (;;)
    {
      paramContext.setTag(this);
      GMTrace.o(11342337540096L, 84507);
      return;
      paramContext = mu(this.kfT);
      break;
      paramContext = mu(this.kfV);
      break;
      paramContext = mu(this.kfU);
      break;
      label535:
      ViewGroup.LayoutParams localLayoutParams = this.kga.getLayoutParams();
      localLayoutParams.width = paramView[0];
      localLayoutParams.height = paramView[1];
      this.kga.setLayoutParams(localLayoutParams);
      this.kfW = paramView;
      break label461;
      label577:
      this.kfS.setMinimumHeight(paramInt);
      if (this.kfZ != null) {
        this.kfZ.setMinimumHeight(paramInt);
      }
    }
  }
  
  private void aqd()
  {
    GMTrace.i(11345692983296L, 84532);
    this.kge.setVisibility(8);
    this.kgf.setBackgroundResource(R.g.aUF);
    this.kgf.setVisibility(0);
    this.kgg.setEnabled(true);
    this.kgh.setText("");
    if (this.kgj == null) {
      this.kgk.setVisibility(4);
    }
    for (;;)
    {
      this.kgh.setVisibility(0);
      this.kgh.setText(R.l.doD);
      this.kgh.setTextColor(this.mContext.getResources().getColorStateList(R.e.aPs));
      this.kgi.setVisibility(8);
      GMTrace.o(11345692983296L, 84532);
      return;
      this.kgj.setVisibility(4);
    }
  }
  
  private View mu(int paramInt)
  {
    GMTrace.i(11342471757824L, 84508);
    if ((this.mLayoutInflater == null) || (paramInt <= 0))
    {
      GMTrace.o(11342471757824L, 84508);
      return null;
    }
    View localView = this.mLayoutInflater.inflate(paramInt, null);
    GMTrace.o(11342471757824L, 84508);
    return localView;
  }
  
  public final void a(final g.a parama)
  {
    GMTrace.i(11344485023744L, 84523);
    if (this.kgg != null) {
      this.kgg.setOnClickListener(new View.OnClickListener()
      {
        public final void onClick(View paramAnonymousView)
        {
          GMTrace.i(11335895089152L, 84459);
          if (a.this.a(parama, paramAnonymousView)) {
            a.this.b(parama, paramAnonymousView);
          }
          GMTrace.o(11335895089152L, 84459);
        }
      });
    }
    GMTrace.o(11344485023744L, 84523);
  }
  
  protected boolean a(g.a parama, View paramView)
  {
    GMTrace.i(11344619241472L, 84524);
    GMTrace.o(11344619241472L, 84524);
    return true;
  }
  
  protected abstract void apS();
  
  protected abstract int[] apT();
  
  protected abstract int apU();
  
  public final ImageView apV()
  {
    GMTrace.i(11343277064192L, 84514);
    ImageView localImageView = this.kga;
    GMTrace.o(11343277064192L, 84514);
    return localImageView;
  }
  
  public final ImageView apW()
  {
    GMTrace.i(11343545499648L, 84516);
    ImageView localImageView = this.kgb;
    GMTrace.o(11343545499648L, 84516);
    return localImageView;
  }
  
  public final void apX()
  {
    GMTrace.i(11344082370560L, 84520);
    this.kgc.setVisibility(8);
    this.kgd.setVisibility(8);
    GMTrace.o(11344082370560L, 84520);
  }
  
  public final String apY()
  {
    GMTrace.i(11344887676928L, 84526);
    if (this.kfY == null)
    {
      GMTrace.o(11344887676928L, 84526);
      return null;
    }
    if (this.kfY.khA == null)
    {
      GMTrace.o(11344887676928L, 84526);
      return null;
    }
    String str = this.kfY.khA.tRS;
    GMTrace.o(11344887676928L, 84526);
    return str;
  }
  
  public final int apZ()
  {
    GMTrace.i(11345021894656L, 84527);
    if (this.kfY == null) {}
    for (Integer localInteger = null;; localInteger = Integer.valueOf(this.kfY.mStatus))
    {
      int i = localInteger.intValue();
      GMTrace.o(11345021894656L, 84527);
      return i;
    }
  }
  
  public final String aqa()
  {
    GMTrace.i(11345156112384L, 84528);
    if (this.kfY == null)
    {
      GMTrace.o(11345156112384L, 84528);
      return null;
    }
    if (this.kfY.khA == null)
    {
      GMTrace.o(11345156112384L, 84528);
      return null;
    }
    String str = this.kfY.khA.uhh;
    GMTrace.o(11345156112384L, 84528);
    return str;
  }
  
  protected abstract boolean aqb();
  
  protected final void aqc()
  {
    GMTrace.i(11345558765568L, 84531);
    this.kge.setVisibility(8);
    this.kgf.setVisibility(8);
    this.kgg.setEnabled(false);
    this.kgi.setVisibility(8);
    this.kgk.setVisibility(0);
    this.kgk.setProgress(getProgress());
    if (this.kgj == null)
    {
      this.kgk.setVisibility(0);
      GMTrace.o(11345558765568L, 84531);
      return;
    }
    this.kgj.setVisibility(0);
    GMTrace.o(11345558765568L, 84531);
  }
  
  public void aqe()
  {
    GMTrace.i(11345827201024L, 84533);
    if (this.kfY == null)
    {
      GMTrace.o(11345827201024L, 84533);
      return;
    }
    if (!aqb())
    {
      GMTrace.o(11345827201024L, 84533);
      return;
    }
    this.kgh.setVisibility(8);
    this.kgh.setTextColor(this.mContext.getResources().getColorStateList(R.e.aMV));
    switch (apZ())
    {
    case 1: 
    case 2: 
    case 5: 
    case 9: 
    default: 
      w.w("MicroMsg.emoji.BaseEmojiItemHolder", "unknow product status:%d", new Object[] { Integer.valueOf(apZ()) });
      GMTrace.o(11345827201024L, 84533);
      return;
    case 8: 
      this.kge.setVisibility(8);
      this.kgf.setBackgroundDrawable(null);
      this.kgf.setVisibility(0);
      this.kgg.setEnabled(false);
      this.kgh.setVisibility(0);
      this.kgh.setText(R.l.doG);
      this.kgi.setVisibility(4);
      if (this.kgj == null)
      {
        this.kgk.setVisibility(4);
        GMTrace.o(11345827201024L, 84533);
        return;
      }
      this.kgj.setVisibility(4);
      GMTrace.o(11345827201024L, 84533);
      return;
    case 0: 
      aqd();
      GMTrace.o(11345827201024L, 84533);
      return;
    case 6: 
      aqc();
      GMTrace.o(11345827201024L, 84533);
      return;
    case 7: 
      if (this.kfY.khE)
      {
        w.d("MicroMsg.emoji.BaseEmojiItemHolder", "jacks use emoji");
        this.kge.setVisibility(8);
        this.kgf.setBackgroundResource(R.g.aUF);
        this.kgf.setVisibility(0);
        this.kgf.setTag(apY());
        this.kgg.setEnabled(true);
        this.kgh.setVisibility(0);
        this.kgh.setText(R.l.dpr);
        this.kgh.setTextColor(this.mContext.getResources().getColorStateList(R.e.aPs));
        this.kgi.setVisibility(4);
        if (this.kgj == null)
        {
          this.kgk.setVisibility(4);
          GMTrace.o(11345827201024L, 84533);
          return;
        }
        this.kgj.setVisibility(4);
        GMTrace.o(11345827201024L, 84533);
        return;
      }
      if ((this.kfY.khG) && (e.bU(this.kfY.khA.uhj, 64)))
      {
        this.kgf.setVisibility(0);
        this.kgf.setBackgroundResource(R.g.aUH);
        this.kgh.setVisibility(0);
        this.kgh.setText(R.l.doU);
        this.kgh.setTextColor(this.mContext.getResources().getColorStateList(R.e.aPs));
        this.kgi.setVisibility(4);
        this.kgg.setEnabled(true);
        if (this.kgj == null)
        {
          this.kgk.setVisibility(4);
          GMTrace.o(11345827201024L, 84533);
          return;
        }
        this.kgj.setVisibility(4);
        GMTrace.o(11345827201024L, 84533);
        return;
      }
      this.kge.setVisibility(8);
      this.kgf.setVisibility(0);
      this.kgf.setBackgroundResource(R.g.aUI);
      this.kgh.setVisibility(0);
      this.kgh.setText(R.l.doF);
      this.kgh.setTextColor(this.mContext.getResources().getColorStateList(R.e.aMU));
      this.kgi.setVisibility(4);
      this.kgg.setEnabled(false);
      if (this.kgj == null)
      {
        this.kgk.setVisibility(4);
        GMTrace.o(11345827201024L, 84533);
        return;
      }
      this.kgj.setVisibility(4);
      GMTrace.o(11345827201024L, 84533);
      return;
    case 3: 
      aqd();
      GMTrace.o(11345827201024L, 84533);
      return;
    case 4: 
    case 12: 
      this.kge.setVisibility(8);
      this.kgf.setBackgroundResource(R.g.aUI);
      this.kgf.setVisibility(0);
      if (this.kgj == null) {
        this.kgk.setVisibility(4);
      }
      for (;;)
      {
        this.kgg.setEnabled(true);
        this.kgi.setVisibility(4);
        this.kgh.setVisibility(0);
        if (this.kfY.khA != null) {
          this.kgh.setText(this.kfY.khA.uhh);
        }
        GMTrace.o(11345827201024L, 84533);
        return;
        this.kgj.setVisibility(4);
      }
    case 10: 
      this.kge.setVisibility(8);
      this.kgf.setBackgroundResource(R.g.aUI);
      this.kgf.setVisibility(0);
      this.kgh.setVisibility(0);
      this.kgh.setText(R.l.doP);
      this.kgi.setVisibility(4);
      this.kgg.setEnabled(true);
      if (this.kgj == null)
      {
        this.kgk.setVisibility(4);
        GMTrace.o(11345827201024L, 84533);
        return;
      }
      this.kgj.setVisibility(4);
      GMTrace.o(11345827201024L, 84533);
      return;
    }
    this.kge.setVisibility(0);
    this.kgf.setBackgroundResource(R.g.aUI);
    this.kgf.setVisibility(0);
    this.kgh.setVisibility(0);
    this.kgh.setText("");
    this.kgg.setEnabled(false);
    this.kgi.setVisibility(4);
    if (this.kgj == null)
    {
      this.kgk.setVisibility(4);
      GMTrace.o(11345827201024L, 84533);
      return;
    }
    this.kgj.setVisibility(4);
    GMTrace.o(11345827201024L, 84533);
  }
  
  public final View aqf()
  {
    GMTrace.i(11345961418752L, 84534);
    View localView = this.kgo;
    GMTrace.o(11345961418752L, 84534);
    return localView;
  }
  
  protected void b(g.a parama, View paramView)
  {
    GMTrace.i(11344753459200L, 84525);
    if (parama != null) {
      parama.a(this);
    }
    GMTrace.o(11344753459200L, 84525);
  }
  
  public final int getProgress()
  {
    GMTrace.i(11345290330112L, 84529);
    if (this.kfY == null)
    {
      GMTrace.o(11345290330112L, 84529);
      return 0;
    }
    int i = this.kfY.rr;
    GMTrace.o(11345290330112L, 84529);
    return i;
  }
  
  public final void mv(int paramInt)
  {
    GMTrace.i(11343411281920L, 84515);
    this.kga.setImageResource(paramInt);
    GMTrace.o(11343411281920L, 84515);
  }
  
  public final void mw(int paramInt)
  {
    GMTrace.i(11343679717376L, 84517);
    this.kgb.setVisibility(paramInt);
    GMTrace.o(11343679717376L, 84517);
  }
  
  public final void mx(int paramInt)
  {
    GMTrace.i(11343813935104L, 84518);
    this.kgb.setImageResource(paramInt);
    GMTrace.o(11343813935104L, 84518);
  }
  
  public final void my(int paramInt)
  {
    GMTrace.i(11343948152832L, 84519);
    this.kgg.setVisibility(paramInt);
    GMTrace.o(11343948152832L, 84519);
  }
  
  public final void setTitle(int paramInt)
  {
    GMTrace.i(11343142846464L, 84513);
    this.izE.setText(paramInt);
    GMTrace.o(11343142846464L, 84513);
  }
  
  public final void setTitle(String paramString)
  {
    GMTrace.i(11343008628736L, 84512);
    this.izE.setText(paramString);
    GMTrace.o(11343008628736L, 84512);
  }
  
  public final void vE(String paramString)
  {
    GMTrace.i(11344216588288L, 84521);
    this.kgc.setText(paramString);
    GMTrace.o(11344216588288L, 84521);
  }
  
  public final void vF(String paramString)
  {
    GMTrace.i(11344350806016L, 84522);
    if (bg.nm(paramString))
    {
      this.kgd.setVisibility(8);
      GMTrace.o(11344350806016L, 84522);
      return;
    }
    this.kgd.setVisibility(0);
    this.kgd.setText(paramString);
    GMTrace.o(11344350806016L, 84522);
  }
  
  public static enum a
  {
    static
    {
      GMTrace.i(11336297742336L, 84462);
      kgs = 1;
      kgt = 2;
      kgu = 3;
      kgv = new int[] { kgs, kgt, kgu };
      GMTrace.o(11336297742336L, 84462);
    }
    
    public static int[] aqg()
    {
      GMTrace.i(11336163524608L, 84461);
      int[] arrayOfInt = (int[])kgv.clone();
      GMTrace.o(11336163524608L, 84461);
      return arrayOfInt;
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\plugin\emoji\a\a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */