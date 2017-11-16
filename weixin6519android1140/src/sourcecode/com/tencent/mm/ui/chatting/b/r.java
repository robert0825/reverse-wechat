package com.tencent.mm.ui.chatting.b;

import android.app.Activity;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.view.ViewGroup.LayoutParams;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.FrameLayout.LayoutParams;
import android.widget.TextView;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.R.a;
import com.tencent.mm.R.g;
import com.tencent.mm.R.h;
import com.tencent.mm.R.i;
import com.tencent.mm.R.l;
import com.tencent.mm.plugin.report.service.g;
import com.tencent.mm.pluginsdk.ui.chat.ChatFooter;
import com.tencent.mm.pluginsdk.ui.chat.ChatFooter.b;
import com.tencent.mm.storage.t;
import com.tencent.mm.ui.p;
import com.tencent.mm.ui.u;
import com.tencent.mm.y.at;
import com.tencent.mm.y.c;

public final class r
{
  private View wJD;
  private ViewGroup wJE;
  public boolean wJF;
  public boolean wJG;
  private final long wJH;
  public ChatFooter.b wJI;
  public h wtd;
  
  public r(h paramh)
  {
    GMTrace.i(19210180755456L, 143127);
    this.wJH = 259200000L;
    this.wJI = new ChatFooter.b()
    {
      public final void a(Boolean paramAnonymousBoolean1, Boolean paramAnonymousBoolean2)
      {
        GMTrace.i(19203067215872L, 143074);
        if (paramAnonymousBoolean1.booleanValue())
        {
          if (paramAnonymousBoolean2.booleanValue())
          {
            r.this.c(Boolean.valueOf(true), Boolean.valueOf(true));
            GMTrace.o(19203067215872L, 143074);
            return;
          }
          r.this.c(Boolean.valueOf(false), Boolean.valueOf(true));
        }
        GMTrace.o(19203067215872L, 143074);
      }
      
      public final void b(Boolean paramAnonymousBoolean1, Boolean paramAnonymousBoolean2)
      {
        GMTrace.i(19203201433600L, 143075);
        if (paramAnonymousBoolean1.booleanValue())
        {
          if (paramAnonymousBoolean2.booleanValue())
          {
            r.this.c(Boolean.valueOf(true), Boolean.valueOf(false));
            GMTrace.o(19203201433600L, 143075);
            return;
          }
          r.this.c(Boolean.valueOf(false), Boolean.valueOf(false));
        }
        GMTrace.o(19203201433600L, 143075);
      }
    };
    this.wtd = paramh;
    GMTrace.o(19210180755456L, 143127);
  }
  
  public final void c(Boolean paramBoolean1, Boolean paramBoolean2)
  {
    GMTrace.i(19210449190912L, 143129);
    if (this.wJD != null)
    {
      this.wJD.clearAnimation();
      this.wJD.setVisibility(8);
      if (paramBoolean2.booleanValue())
      {
        if (paramBoolean1.booleanValue())
        {
          at.AR();
          c.xh().set(340228, Boolean.valueOf(true));
          g.ork.a(232L, 1L, 1L, false);
          GMTrace.o(19210449190912L, 143129);
        }
      }
      else if (paramBoolean1.booleanValue())
      {
        at.AR();
        c.xh().set(340229, Boolean.valueOf(true));
        g.ork.a(232L, 2L, 1L, false);
      }
    }
    GMTrace.o(19210449190912L, 143129);
  }
  
  public final void h(final Boolean paramBoolean)
  {
    GMTrace.i(19210314973184L, 143128);
    this.wJE = ((ViewGroup)this.wtd.cdg().findViewById(R.h.bnf));
    this.wJD = View.inflate(this.wtd.cdg().vKB.vKW, R.i.cDf, null);
    Object localObject = (TextView)this.wJD.findViewById(R.h.bQO);
    if (paramBoolean.booleanValue())
    {
      ((TextView)localObject).setText(this.wtd.cdg().vKB.vKW.getString(R.l.dXA));
      this.wJD.setBackgroundResource(R.g.aYJ);
    }
    for (localObject = new FrameLayout.LayoutParams(-2, -2, 85);; localObject = new FrameLayout.LayoutParams(-2, -2, 83))
    {
      if ((this.wJE != null) && (this.wJD != null))
      {
        this.wJE.addView(this.wJD, (ViewGroup.LayoutParams)localObject);
        localObject = AnimationUtils.loadAnimation(this.wtd.cdg().vKB.vKW, R.a.aLX);
        this.wJD.startAnimation((Animation)localObject);
        this.wJD.setOnClickListener(new View.OnClickListener()
        {
          public final void onClick(View paramAnonymousView)
          {
            GMTrace.i(19204006739968L, 143081);
            if (paramBoolean.booleanValue())
            {
              r.this.c(Boolean.valueOf(true), Boolean.valueOf(true));
              r.this.wtd.cdq().bLZ();
              GMTrace.o(19204006739968L, 143081);
              return;
            }
            r.this.c(Boolean.valueOf(true), Boolean.valueOf(false));
            r.this.wtd.cdq().V(2, true);
            GMTrace.o(19204006739968L, 143081);
          }
        });
      }
      GMTrace.o(19210314973184L, 143128);
      return;
      ((TextView)localObject).setText(this.wtd.cdg().vKB.vKW.getString(R.l.dXC));
      this.wJD.setBackgroundResource(R.g.aYI);
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\ui\chatting\b\r.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */