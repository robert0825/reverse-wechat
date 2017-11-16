package com.tencent.mm.view;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Rect;
import android.util.DisplayMetrics;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewTreeObserver;
import android.view.ViewTreeObserver.OnGlobalLayoutListener;
import android.view.animation.Animation;
import android.view.animation.Animation.AnimationListener;
import android.view.animation.AnimationUtils;
import android.widget.EditText;
import android.widget.FrameLayout.LayoutParams;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.api.d;
import com.tencent.mm.api.e;
import com.tencent.mm.api.i;
import com.tencent.mm.api.m.a;
import com.tencent.mm.api.n;
import com.tencent.mm.api.n.a;
import com.tencent.mm.api.o;
import com.tencent.mm.api.o.a;
import com.tencent.mm.bg.a.a;
import com.tencent.mm.bg.a.c;
import com.tencent.mm.bg.a.d;
import com.tencent.mm.bg.a.e;
import com.tencent.mm.bg.a.f;
import com.tencent.mm.compatible.util.j;
import com.tencent.mm.pluginsdk.ui.ChatFooterPanel;
import com.tencent.mm.pluginsdk.ui.chat.f;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.view.footer.SelectColorBar;
import com.tencent.mm.view.footer.SelectColorBar.a;

public abstract class a
  extends com.tencent.mm.api.b
  implements ViewTreeObserver.OnGlobalLayoutListener
{
  private m.a eqF;
  private com.tencent.mm.view.b.a eqo;
  private com.tencent.mm.bl.b evi;
  protected d[] xyU;
  private View xyV;
  private com.tencent.mm.view.footer.a xyW;
  private View xyX;
  private View xyY;
  private View xyZ;
  private ChatFooterPanel xza;
  private EditText xzb;
  
  public a(Context paramContext, m.a parama)
  {
    super(paramContext);
    GMTrace.i(19638335307776L, 146317);
    this.eqF = parama;
    ckE().a(this.eqF);
    removeAllViews();
    paramContext = new FrameLayout.LayoutParams(-1, -1);
    addView(cky(), paramContext);
    paramContext = new FrameLayout.LayoutParams(-1, (int)getResources().getDimension(a.c.tkR));
    paramContext.gravity = 80;
    addView(ckz(), paramContext);
    addView(ckx(), paramContext);
    paramContext = new FrameLayout.LayoutParams(-1, -1);
    ckB().setVisibility(8);
    addView(ckB(), paramContext);
    getViewTreeObserver().addOnGlobalLayoutListener(this);
    paramContext = new FrameLayout.LayoutParams(-1, -2);
    paramContext.gravity = 80;
    ckC().setVisibility(8);
    addView(ckC(), paramContext);
    paramContext = new FrameLayout.LayoutParams(-1, (int)getResources().getDimension(a.c.tkP));
    paramContext.gravity = 80;
    addView(ckD(), paramContext);
    paramContext = new FrameLayout.LayoutParams(-1, (int)getResources().getDimension(a.c.aPM));
    paramContext.gravity = 48;
    if (this.eqF.eqJ) {
      addView(ckA(), paramContext);
    }
    GMTrace.o(19638335307776L, 146317);
  }
  
  public final void a(e parame)
  {
    GMTrace.i(19639677485056L, 146327);
    ckE().a(parame);
    GMTrace.o(19639677485056L, 146327);
  }
  
  public final void am(boolean paramBoolean)
  {
    GMTrace.i(19639811702784L, 146328);
    ckE().am(paramBoolean);
    GMTrace.o(19639811702784L, 146328);
  }
  
  public final void an(boolean paramBoolean)
  {
    GMTrace.i(19639945920512L, 146329);
    Object localObject = ckx();
    ((com.tencent.mm.view.footer.a)localObject).evi.bNL().cky().xAy = paramBoolean;
    Animation localAnimation;
    if (paramBoolean)
    {
      localAnimation = AnimationUtils.loadAnimation(((com.tencent.mm.view.footer.a)localObject).getContext(), a.a.aLh);
      localAnimation.setAnimationListener(new com.tencent.mm.view.footer.a.1((com.tencent.mm.view.footer.a)localObject));
      ((com.tencent.mm.view.footer.a)localObject).startAnimation(localAnimation);
    }
    while (paramBoolean)
    {
      localObject = AnimationUtils.loadAnimation(getContext(), a.a.aLh);
      ((Animation)localObject).setAnimationListener(new Animation.AnimationListener()
      {
        public final void onAnimationEnd(Animation paramAnonymousAnimation)
        {
          GMTrace.i(19648938508288L, 146396);
          a.this.ckz().setVisibility(0);
          GMTrace.o(19648938508288L, 146396);
        }
        
        public final void onAnimationRepeat(Animation paramAnonymousAnimation)
        {
          GMTrace.i(19649072726016L, 146397);
          GMTrace.o(19649072726016L, 146397);
        }
        
        public final void onAnimationStart(Animation paramAnonymousAnimation)
        {
          GMTrace.i(19648804290560L, 146395);
          GMTrace.o(19648804290560L, 146395);
        }
      });
      ckA().startAnimation((Animation)localObject);
      GMTrace.o(19639945920512L, 146329);
      return;
      localAnimation = AnimationUtils.loadAnimation(((com.tencent.mm.view.footer.a)localObject).getContext(), a.a.aLi);
      localAnimation.setAnimationListener(new com.tencent.mm.view.footer.a.2((com.tencent.mm.view.footer.a)localObject));
      ((com.tencent.mm.view.footer.a)localObject).startAnimation(localAnimation);
    }
    localObject = AnimationUtils.loadAnimation(getContext(), a.a.aLi);
    ((Animation)localObject).setAnimationListener(new Animation.AnimationListener()
    {
      public final void onAnimationEnd(Animation paramAnonymousAnimation)
      {
        GMTrace.i(19647596331008L, 146386);
        a.this.ckz().setVisibility(8);
        GMTrace.o(19647596331008L, 146386);
      }
      
      public final void onAnimationRepeat(Animation paramAnonymousAnimation)
      {
        GMTrace.i(19647730548736L, 146387);
        GMTrace.o(19647730548736L, 146387);
      }
      
      public final void onAnimationStart(Animation paramAnonymousAnimation)
      {
        GMTrace.i(19647462113280L, 146385);
        GMTrace.o(19647462113280L, 146385);
      }
    });
    ckA().startAnimation((Animation)localObject);
    GMTrace.o(19639945920512L, 146329);
  }
  
  public final void ao(boolean paramBoolean)
  {
    GMTrace.i(19640080138240L, 146330);
    if (paramBoolean)
    {
      localAnimation = AnimationUtils.loadAnimation(getContext(), a.a.aLh);
      localAnimation.setAnimationListener(new Animation.AnimationListener()
      {
        public final void onAnimationEnd(Animation paramAnonymousAnimation)
        {
          GMTrace.i(19648401637376L, 146392);
          a.this.ckA().setVisibility(0);
          GMTrace.o(19648401637376L, 146392);
        }
        
        public final void onAnimationRepeat(Animation paramAnonymousAnimation)
        {
          GMTrace.i(19648535855104L, 146393);
          GMTrace.o(19648535855104L, 146393);
        }
        
        public final void onAnimationStart(Animation paramAnonymousAnimation)
        {
          GMTrace.i(19648267419648L, 146391);
          GMTrace.o(19648267419648L, 146391);
        }
      });
      ckA().startAnimation(localAnimation);
      GMTrace.o(19640080138240L, 146330);
      return;
    }
    Animation localAnimation = AnimationUtils.loadAnimation(getContext(), a.a.aLi);
    localAnimation.setAnimationListener(new Animation.AnimationListener()
    {
      public final void onAnimationEnd(Animation paramAnonymousAnimation)
      {
        GMTrace.i(19650951774208L, 146411);
        a.this.ckA().setVisibility(8);
        GMTrace.o(19650951774208L, 146411);
      }
      
      public final void onAnimationRepeat(Animation paramAnonymousAnimation)
      {
        GMTrace.i(19651085991936L, 146412);
        GMTrace.o(19651085991936L, 146412);
      }
      
      public final void onAnimationStart(Animation paramAnonymousAnimation)
      {
        GMTrace.i(19650817556480L, 146410);
        GMTrace.o(19650817556480L, 146410);
      }
    });
    ckA().startAnimation(localAnimation);
    GMTrace.o(19640080138240L, 146330);
  }
  
  public abstract d[] bNI();
  
  public final View ckA()
  {
    GMTrace.i(19638872178688L, 146321);
    if (this.xyX == null)
    {
      this.xyX = LayoutInflater.from(getContext()).inflate(a.f.tln, null);
      this.xyX.findViewById(a.e.nkF).setOnClickListener(new View.OnClickListener()
      {
        public final void onClick(View paramAnonymousView)
        {
          GMTrace.i(19640885444608L, 146336);
          if (a.this.ckB().getVisibility() == 0)
          {
            a.this.ckE().a(a.b(a.this).getText(), a.b(a.this).getCurrentTextColor());
            GMTrace.o(19640885444608L, 146336);
            return;
          }
          a.this.ckE().onFinish();
          GMTrace.o(19640885444608L, 146336);
        }
      });
      this.xyX.findViewById(a.e.nkE).setOnClickListener(new View.OnClickListener()
      {
        public final void onClick(View paramAnonymousView)
        {
          GMTrace.i(19650549121024L, 146408);
          if (a.this.ckB().getVisibility() == 0)
          {
            a.this.ckE().bNK();
            GMTrace.o(19650549121024L, 146408);
            return;
          }
          a.this.ckE().ow();
          GMTrace.o(19650549121024L, 146408);
        }
      });
    }
    View localView = this.xyX;
    GMTrace.o(19638872178688L, 146321);
    return localView;
  }
  
  public final View ckB()
  {
    GMTrace.i(19639006396416L, 146322);
    if (this.xyY == null)
    {
      this.xyY = LayoutInflater.from(getContext()).inflate(a.f.tll, null);
      this.xzb = ((EditText)this.xyY.findViewById(a.e.gei));
      ((SelectColorBar)this.xyY.findViewById(a.e.tlk)).xBF = new SelectColorBar.a()
      {
        public final void EB(int paramAnonymousInt)
        {
          GMTrace.i(19641153880064L, 146338);
          a.b(a.this).setTextColor(paramAnonymousInt);
          GMTrace.o(19641153880064L, 146338);
        }
      };
    }
    View localView = this.xyY;
    GMTrace.o(19639006396416L, 146322);
    return localView;
  }
  
  public final View ckC()
  {
    GMTrace.i(19639140614144L, 146323);
    if (this.xyY == null) {
      this.xyZ = LayoutInflater.from(getContext()).inflate(a.f.tlo, null);
    }
    View localView = this.xyZ;
    GMTrace.o(19639140614144L, 146323);
    return localView;
  }
  
  public final View ckD()
  {
    boolean bool = false;
    GMTrace.i(19639274831872L, 146324);
    if (this.xza == null) {}
    try
    {
      Object localObject = getContext();
      this.xza = o.eqQ.af((Context)localObject);
      this.xza.cU(ChatFooterPanel.ttf);
      this.xza.setBackgroundResource(a.d.aUC);
      this.xza.oK();
      this.xza.ar(true);
      this.xza.d(true, true);
      this.xza.setVisibility(8);
      this.xza.onResume();
      localObject = o.eqQ.oN();
      ((n)localObject).eqP = new n.a()
      {
        public final void a(i paramAnonymousi)
        {
          GMTrace.i(19650146467840L, 146405);
          w.i("MicroMsg.BaseDrawingView", "[onSelectedEmoji] emojiInfo:%s", new Object[] { paramAnonymousi });
          a.this.ckE().c(paramAnonymousi);
          onHide();
          GMTrace.o(19650146467840L, 146405);
        }
        
        public final void onHide()
        {
          GMTrace.i(19650280685568L, 146406);
          a.this.ao(true);
          a.this.mP(true);
          a.this.an(true);
          GMTrace.o(19650280685568L, 146406);
        }
      };
      this.xza.a((f)localObject);
      localObject = this.xza;
      GMTrace.o(19639274831872L, 146324);
      return (View)localObject;
    }
    catch (Exception localException)
    {
      String str = localException.getMessage();
      if (getContext() == null) {
        bool = true;
      }
      w.e("MicroMsg.BaseDrawingView", "exception:%s,getContext() is null?", new Object[] { str, Boolean.valueOf(bool) });
      throw localException;
    }
  }
  
  public final com.tencent.mm.bl.b ckE()
  {
    GMTrace.i(19639543267328L, 146326);
    if (this.evi == null)
    {
      this.evi = new com.tencent.mm.bl.a();
      this.evi.a(this);
    }
    com.tencent.mm.bl.b localb = this.evi;
    GMTrace.o(19639543267328L, 146326);
    return localb;
  }
  
  protected abstract com.tencent.mm.view.b.a ckv();
  
  protected abstract com.tencent.mm.view.footer.a ckw();
  
  public final <T extends com.tencent.mm.view.footer.a> T ckx()
  {
    GMTrace.i(19638469525504L, 146318);
    if (this.xyW == null) {
      this.xyW = ckw();
    }
    com.tencent.mm.view.footer.a locala = this.xyW;
    GMTrace.o(19638469525504L, 146318);
    return locala;
  }
  
  public final <T extends com.tencent.mm.view.b.a> T cky()
  {
    GMTrace.i(19638603743232L, 146319);
    if (this.eqo == null) {
      this.eqo = ckv();
    }
    com.tencent.mm.view.b.a locala = this.eqo;
    GMTrace.o(19638603743232L, 146319);
    return locala;
  }
  
  public final View ckz()
  {
    GMTrace.i(19638737960960L, 146320);
    if (this.xyV == null)
    {
      this.xyV = LayoutInflater.from(getContext()).inflate(a.f.tlm, null);
      this.xyV.setVisibility(0);
    }
    View localView = this.xyV;
    GMTrace.o(19638737960960L, 146320);
    return localView;
  }
  
  public final void mP(boolean paramBoolean)
  {
    GMTrace.i(19640214355968L, 146331);
    w.i("MicroMsg.BaseDrawingView", "[hideSimleyPanel] isHide:%s", new Object[] { Boolean.valueOf(paramBoolean) });
    Animation localAnimation;
    if ((this.xza.getVisibility() == 0) && (paramBoolean))
    {
      localAnimation = AnimationUtils.loadAnimation(getContext(), a.a.aLE);
      localAnimation.setAnimationListener(new Animation.AnimationListener()
      {
        public final void onAnimationEnd(Animation paramAnonymousAnimation)
        {
          GMTrace.i(19649743814656L, 146402);
          a.c(a.this).setVisibility(8);
          GMTrace.o(19649743814656L, 146402);
        }
        
        public final void onAnimationRepeat(Animation paramAnonymousAnimation)
        {
          GMTrace.i(19649878032384L, 146403);
          GMTrace.o(19649878032384L, 146403);
        }
        
        public final void onAnimationStart(Animation paramAnonymousAnimation)
        {
          GMTrace.i(19649609596928L, 146401);
          GMTrace.o(19649609596928L, 146401);
        }
      });
      this.xza.startAnimation(localAnimation);
      GMTrace.o(19640214355968L, 146331);
      return;
    }
    if ((this.xza.getVisibility() == 8) && (!paramBoolean))
    {
      localAnimation = AnimationUtils.loadAnimation(getContext(), a.a.aLG);
      localAnimation.setAnimationListener(new Animation.AnimationListener()
      {
        public final void onAnimationEnd(Animation paramAnonymousAnimation)
        {
          GMTrace.i(19637127348224L, 146308);
          a.c(a.this).setVisibility(0);
          GMTrace.o(19637127348224L, 146308);
        }
        
        public final void onAnimationRepeat(Animation paramAnonymousAnimation)
        {
          GMTrace.i(19637261565952L, 146309);
          GMTrace.o(19637261565952L, 146309);
        }
        
        public final void onAnimationStart(Animation paramAnonymousAnimation)
        {
          GMTrace.i(19636993130496L, 146307);
          GMTrace.o(19636993130496L, 146307);
        }
      });
      this.xza.startAnimation(localAnimation);
    }
    GMTrace.o(19640214355968L, 146331);
  }
  
  protected void onAttachedToWindow()
  {
    GMTrace.i(19639409049600L, 146325);
    super.onAttachedToWindow();
    post(new Runnable()
    {
      public final void run()
      {
        GMTrace.i(19647998984192L, 146389);
        a.this.ckE().onAttachedToWindow();
        GMTrace.o(19647998984192L, 146389);
      }
    });
    GMTrace.o(19639409049600L, 146325);
  }
  
  public void onGlobalLayout()
  {
    GMTrace.i(19640348573696L, 146332);
    if (ckB().getVisibility() == 0)
    {
      getViewTreeObserver().removeOnGlobalLayoutListener(this);
      this.xzb.postDelayed(new Runnable()
      {
        public final void run()
        {
          GMTrace.i(19649341161472L, 146399);
          Object localObject = new Rect();
          a.this.getWindowVisibleDisplayFrame((Rect)localObject);
          if (a.this.getBottom() - ((Rect)localObject).bottom >= 300)
          {
            i = 1;
            localObject = a.this.getResources().getDisplayMetrics();
            if (i != 0) {
              break label146;
            }
          }
          label146:
          for (int i = ((DisplayMetrics)localObject).heightPixels - (int)a.this.getResources().getDimension(a.c.tkH);; i = ((DisplayMetrics)localObject).heightPixels - j.b(a.this.getContext(), false) - (int)a.this.getResources().getDimension(a.c.tkH))
          {
            if (a.b(a.this).getHeight() != i) {
              a.b(a.this).setHeight(i);
            }
            a.this.getViewTreeObserver().removeOnGlobalLayoutListener(a.this);
            a.this.getViewTreeObserver().addOnGlobalLayoutListener(a.this);
            GMTrace.o(19649341161472L, 146399);
            return;
            i = 0;
            break;
          }
        }
      }, 160L);
    }
    GMTrace.o(19640348573696L, 146332);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\view\a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */