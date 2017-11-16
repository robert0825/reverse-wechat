package com.tencent.mm.plugin.sns.abtest;

import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.Animation.AnimationListener;
import android.view.animation.AnimationUtils;
import android.widget.AbsoluteLayout;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.plugin.sns.i.a;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.af;

public final class b
{
  int LQ;
  int iDc;
  int mScreenHeight;
  NotInterestMenu.c plY;
  public NotInterestMenu pmd;
  ViewGroup pme;
  NotInterestMenu.b pmf;
  Animation pmg;
  Animation pmh;
  private Animation pmi;
  private Animation pmj;
  int pmk;
  int pml;
  int pmm;
  int pmn;
  int pmo;
  public boolean pmp;
  AbsoluteLayout pmq;
  public boolean pmr;
  boolean pms;
  
  public b(ViewGroup paramViewGroup)
  {
    GMTrace.i(8875147264000L, 66125);
    this.pmf = new NotInterestMenu.b()
    {
      public final void bhA()
      {
        GMTrace.i(8878771142656L, 66152);
        b.this.bhB();
        GMTrace.o(8878771142656L, 66152);
      }
    };
    this.pmg = null;
    this.pmh = null;
    this.pmi = null;
    this.pmj = null;
    this.iDc = 0;
    this.LQ = 0;
    this.pmk = 0;
    this.pml = 0;
    this.pmm = 0;
    this.mScreenHeight = 0;
    this.pmn = 0;
    this.pmo = 0;
    this.pmp = false;
    this.pmq = null;
    this.pmr = false;
    this.pms = false;
    this.pme = paramViewGroup;
    this.pmg = AnimationUtils.loadAnimation(ab.getContext(), i.a.oWU);
    this.pmg.setFillAfter(true);
    this.pmg.setDuration(100L);
    this.pmg.setAnimationListener(new Animation.AnimationListener()
    {
      public final void onAnimationEnd(Animation paramAnonymousAnimation)
      {
        GMTrace.i(8873670868992L, 66114);
        if (b.this.pmd != null) {
          b.this.pmd.setVisibility(0);
        }
        b.this.pmr = false;
        b.this.pmp = true;
        GMTrace.o(8873670868992L, 66114);
      }
      
      public final void onAnimationRepeat(Animation paramAnonymousAnimation)
      {
        GMTrace.i(8873805086720L, 66115);
        GMTrace.o(8873805086720L, 66115);
      }
      
      public final void onAnimationStart(Animation paramAnonymousAnimation)
      {
        GMTrace.i(8873536651264L, 66113);
        b.this.pmr = true;
        GMTrace.o(8873536651264L, 66113);
      }
    });
    this.pmh = AnimationUtils.loadAnimation(ab.getContext(), i.a.oWX);
    this.pmh.setFillAfter(true);
    this.pmh.setDuration(100L);
    this.pmh.setAnimationListener(new Animation.AnimationListener()
    {
      public final void onAnimationEnd(Animation paramAnonymousAnimation)
      {
        GMTrace.i(8879173795840L, 66155);
        if (b.this.pmd != null) {
          b.this.pmd.setVisibility(0);
        }
        b.this.pmr = false;
        b.this.pmp = true;
        GMTrace.o(8879173795840L, 66155);
      }
      
      public final void onAnimationRepeat(Animation paramAnonymousAnimation)
      {
        GMTrace.i(8879308013568L, 66156);
        GMTrace.o(8879308013568L, 66156);
      }
      
      public final void onAnimationStart(Animation paramAnonymousAnimation)
      {
        GMTrace.i(8879039578112L, 66154);
        b.this.pmr = true;
        GMTrace.o(8879039578112L, 66154);
      }
    });
    this.pmi = AnimationUtils.loadAnimation(ab.getContext(), i.a.oWV);
    this.pmi.setFillAfter(true);
    this.pmi.setDuration(100L);
    this.pmi.setAnimationListener(new Animation.AnimationListener()
    {
      public final void onAnimationEnd(Animation paramAnonymousAnimation)
      {
        GMTrace.i(8879979102208L, 66161);
        af.t(new Runnable()
        {
          public final void run()
          {
            GMTrace.i(8879576449024L, 66158);
            b.this.bhB();
            GMTrace.o(8879576449024L, 66158);
          }
        });
        b.this.pmr = false;
        GMTrace.o(8879979102208L, 66161);
      }
      
      public final void onAnimationRepeat(Animation paramAnonymousAnimation)
      {
        GMTrace.i(8880113319936L, 66162);
        GMTrace.o(8880113319936L, 66162);
      }
      
      public final void onAnimationStart(Animation paramAnonymousAnimation)
      {
        GMTrace.i(8879844884480L, 66160);
        b.this.pmr = true;
        GMTrace.o(8879844884480L, 66160);
      }
    });
    this.pmj = AnimationUtils.loadAnimation(ab.getContext(), i.a.oWW);
    this.pmj.setFillAfter(true);
    this.pmj.setDuration(100L);
    this.pmj.setAnimationListener(new Animation.AnimationListener()
    {
      public final void onAnimationEnd(Animation paramAnonymousAnimation)
      {
        GMTrace.i(8870852296704L, 66093);
        af.t(new Runnable()
        {
          public final void run()
          {
            GMTrace.i(8877965836288L, 66146);
            b.this.bhB();
            GMTrace.o(8877965836288L, 66146);
          }
        });
        b.this.pmr = false;
        GMTrace.o(8870852296704L, 66093);
      }
      
      public final void onAnimationRepeat(Animation paramAnonymousAnimation)
      {
        GMTrace.i(8870986514432L, 66094);
        GMTrace.o(8870986514432L, 66094);
      }
      
      public final void onAnimationStart(Animation paramAnonymousAnimation)
      {
        GMTrace.i(8870718078976L, 66092);
        b.this.pmr = true;
        GMTrace.o(8870718078976L, 66092);
      }
    });
    GMTrace.o(8875147264000L, 66125);
  }
  
  public final void bhB()
  {
    GMTrace.i(8875281481728L, 66126);
    if ((this.pmq != null) && (this.pme != null) && (this.pmd != null))
    {
      this.pmq.removeView(this.pmd);
      this.pme.removeView(this.pmq);
      this.pmq = null;
      this.pmd = null;
      this.pmp = false;
    }
    GMTrace.o(8875281481728L, 66126);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\plugin\sns\abtest\b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */