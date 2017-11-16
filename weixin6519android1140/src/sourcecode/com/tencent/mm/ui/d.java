package com.tencent.mm.ui;

import android.annotation.TargetApi;
import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.content.Intent;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Bitmap.Config;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.os.Handler;
import android.os.MessageQueue.IdleHandler;
import android.support.v4.app.Fragment;
import android.support.v4.app.l;
import android.support.v4.app.p;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.util.DisplayMetrics;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnApplyWindowInsetsListener;
import android.view.ViewGroup;
import android.view.ViewGroup.LayoutParams;
import android.view.ViewParent;
import android.view.Window;
import android.view.WindowInsets;
import android.view.animation.Animation;
import android.view.animation.Animation.AnimationListener;
import android.view.animation.AnimationUtils;
import android.widget.FrameLayout.LayoutParams;
import android.widget.ImageView;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.R.f;
import com.tencent.mm.R.h;
import com.tencent.mm.R.i;
import com.tencent.mm.compatible.e.b;
import com.tencent.mm.compatible.h.a;
import com.tencent.mm.platformtools.t;
import com.tencent.mm.sdk.platformtools.af;
import com.tencent.mm.sdk.platformtools.s;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.ui.base.OnLayoutChangedLinearLayout;
import com.tencent.mm.ui.base.OnLayoutChangedLinearLayout.a;
import com.tencent.mm.ui.base.ac;
import com.tencent.mm.ui.chatting.En_5b8fbb1e.a;
import com.tencent.mm.ui.tools.TestTimeForChatting;
import com.tencent.mm.ui.tools.TestTimeForChatting.a;
import com.tencent.mm.ui.widget.k;
import com.tencent.mm.y.aj;
import com.tencent.mm.y.at;
import com.tencent.mm.y.q;
import java.util.Iterator;
import java.util.List;

public final class d
  implements LauncherUI.a
{
  public MMFragmentActivity vFP;
  public LauncherUI.b vFQ;
  public long vFR;
  MessageQueue.IdleHandler vFS;
  a vFT;
  public String vFU;
  private int vFV;
  public View vFW;
  public View vFX;
  public En_5b8fbb1e.a vFY;
  public TestTimeForChatting vFZ;
  public OnLayoutChangedLinearLayout vGa;
  public OnLayoutChangedLinearLayout.a vGb;
  String vGc;
  Bundle vGd;
  Runnable vGe;
  Animation vGf;
  public boolean vGg;
  public Animation vGh;
  public boolean vGi;
  Bitmap yvF;
  
  public d(LauncherUI.b paramb)
  {
    GMTrace.i(19032476483584L, 141803);
    this.vFR = 0L;
    this.vFT = new a();
    this.vFV = -1;
    this.vGb = new OnLayoutChangedLinearLayout.a()
    {
      long start;
      
      public final void bWl()
      {
        GMTrace.i(19102403919872L, 142324);
        if (d.this.vGh == null)
        {
          d.this.vGh = AnimationUtils.loadAnimation(d.this.vFP, MMFragmentActivity.a.vMx);
          d.this.vGh.setAnimationListener(new Animation.AnimationListener()
          {
            public final void onAnimationEnd(Animation paramAnonymous2Animation)
            {
              GMTrace.i(19110993854464L, 142388);
              w.i("MicroMsg.LauncherUI.ChattingTabUI", "klem animationEnd");
              d.this.bWg();
              GMTrace.o(19110993854464L, 142388);
            }
            
            public final void onAnimationRepeat(Animation paramAnonymous2Animation)
            {
              GMTrace.i(19110859636736L, 142387);
              GMTrace.o(19110859636736L, 142387);
            }
            
            public final void onAnimationStart(Animation paramAnonymous2Animation)
            {
              GMTrace.i(19110725419008L, 142386);
              w.i("MicroMsg.LauncherUI.ChattingTabUI", "klem onAnimationStart onDrawed->onAnimationStart:%sms", new Object[] { Long.valueOf(System.currentTimeMillis() - d.15.this.start) });
              d.this.bWf();
              d.this.kT(false);
              GMTrace.o(19110725419008L, 142386);
            }
          });
        }
        if (d.this.vGg)
        {
          d.this.vFZ.yvL = new TestTimeForChatting.a()
          {
            public final void cuc()
            {
              GMTrace.i(21036884033536L, 156737);
              w.i("MicroMsg.LauncherUI.ChattingTabUI", "[onDrawed]");
              d.15.this.start = System.currentTimeMillis();
              d.this.vFY.mView.startAnimation(d.this.vGh);
              d.this.vFZ.yvL = null;
              GMTrace.o(21036884033536L, 156737);
            }
          };
          d.this.vGg = false;
        }
        for (;;)
        {
          d.this.vGa.wia = null;
          w.i("MicroMsg.LauncherUI.ChattingTabUI", "klem CHATTING ONLAYOUT ");
          GMTrace.o(19102403919872L, 142324);
          return;
          d.this.bWf();
          d.this.bWg();
        }
      }
    };
    this.vGe = new Runnable()
    {
      public final void run()
      {
        GMTrace.i(19106833104896L, 142357);
        d.this.vGi = false;
        if (d.this.vFP.isFinishing())
        {
          GMTrace.o(19106833104896L, 142357);
          return;
        }
        boolean bool;
        if (d.this.vFZ == null)
        {
          bool = false;
          w.i("MicroMsg.LauncherUI.ChattingTabUI", "ashutest::startChatting, ishow:%b", new Object[] { Boolean.valueOf(bool) });
          Intent localIntent = new Intent().putExtra("Chat_User", d.this.vGc);
          if (d.this.vGd != null) {
            localIntent.putExtras(d.this.vGd);
          }
          localIntent.putExtra("img_gallery_enter_from_chatting_ui", true);
          d.this.ai(localIntent);
          d.this.vGa.wia = d.this.vGb;
          d.this.vFZ.setVisibility(0);
          if (d.this.vFP.getWindow().getDecorView().getWidth() != 0) {
            break label274;
          }
        }
        label274:
        for (float f = d.this.vFP.getResources().getDisplayMetrics().widthPixels;; f = d.this.vFP.getWindow().getDecorView().getWidth())
        {
          d.this.vFZ.setTranslationX(f - 0.1F);
          com.tencent.mm.sdk.f.e.post(new Runnable()
          {
            public final void run()
            {
              GMTrace.i(19039187369984L, 141853);
              com.tencent.mm.modelstat.d.a(3, "En_5b8fbb1e" + d.this.vFY.cdL(), d.this.vFY.hashCode());
              GMTrace.o(19039187369984L, 141853);
            }
          }, "directReport_startChattingRunnable");
          d.this.vFR = t.Pu();
          if (d.this.vFY.bXH()) {
            k.a(d.this.vFP);
          }
          GMTrace.o(19106833104896L, 142357);
          return;
          bool = d.this.vFZ.isShown();
          break;
        }
      }
      
      public final String toString()
      {
        GMTrace.i(19106967322624L, 142358);
        String str = super.toString() + "|startChattingRunnable";
        GMTrace.o(19106967322624L, 142358);
        return str;
      }
    };
    this.vGg = false;
    this.vGi = true;
    this.vFQ = paramb;
    GMTrace.o(19032476483584L, 141803);
  }
  
  private boolean bWh()
  {
    GMTrace.i(19033147572224L, 141808);
    Object localObject = this.vFP.aR().aW();
    if (localObject == null)
    {
      w.i("MicroMsg.LauncherUI.ChattingTabUI", "fragments is null");
      GMTrace.o(19033147572224L, 141808);
      return true;
    }
    if (((List)localObject).size() >= 5)
    {
      w.e("MicroMsg.LauncherUI.ChattingTabUI", "fragments more than 5! %s", new Object[] { Integer.valueOf(((List)localObject).size()) });
      localObject = ((List)localObject).iterator();
      do
      {
        if (!((Iterator)localObject).hasNext()) {
          break;
        }
      } while (!((Fragment)((Iterator)localObject).next() instanceof En_5b8fbb1e.a));
      w.e("MicroMsg.LauncherUI.ChattingTabUI", "fragments more than 5 and find a ChattingUIFragmet!!");
      GMTrace.o(19033147572224L, 141808);
      return false;
    }
    w.i("MicroMsg.LauncherUI.ChattingTabUI", "fragments size %s", new Object[] { Integer.valueOf(((List)localObject).size()) });
    GMTrace.o(19033147572224L, 141808);
    return true;
  }
  
  private ViewGroup bWk()
  {
    GMTrace.i(19033952878592L, 141814);
    Object localObject1 = this.vFP.cN().cO().getCustomView().getParent();
    Object localObject2 = null;
    ViewGroup localViewGroup = (ViewGroup)this.vFP.getWindow().getDecorView();
    while ((localObject1 != localViewGroup) && (localObject1 != null))
    {
      ViewParent localViewParent = ((ViewParent)localObject1).getParent();
      localObject2 = localObject1;
      localObject1 = localViewParent;
    }
    localObject1 = (ViewGroup)localObject2;
    GMTrace.o(19033952878592L, 141814);
    return (ViewGroup)localObject1;
  }
  
  public final void a(String paramString, Bundle paramBundle, boolean paramBoolean)
  {
    GMTrace.i(19033013354496L, 141807);
    if (this.vFZ == null) {}
    for (boolean bool = false;; bool = this.vFZ.isShown())
    {
      w.i("MicroMsg.LauncherUI.ChattingTabUI", "try startChatting, ishow:%b", new Object[] { Boolean.valueOf(bool) });
      at.getNotification().aE(false);
      this.vGd = paramBundle;
      this.vGc = paramString;
      this.vGg = paramBoolean;
      at.xB().bQe();
      af.Am(-8);
      af.t(this.vGe);
      GMTrace.o(19033013354496L, 141807);
      return;
    }
  }
  
  @TargetApi(16)
  public final void ai(Intent paramIntent)
  {
    GMTrace.i(19033281789952L, 141809);
    long l = System.currentTimeMillis();
    if (this.vFY == null)
    {
      this.vFY = En_5b8fbb1e.a.cdt();
      this.vFY.e(this.vFW, this.vFX);
      this.vFW = null;
      this.vFX = null;
    }
    for (boolean bool = true;; bool = false)
    {
      if (this.vFZ == null) {
        if (!this.vFY.bXH())
        {
          this.vFZ = ((TestTimeForChatting)this.vFP.findViewById(R.h.bmR));
          this.vFV = this.vFZ.getId();
          if (!bool) {
            break label1110;
          }
          this.vFY.gOF = true;
          this.vFY.mDe = false;
          this.vFY.setArguments(s.ah(paramIntent));
          if (!bWh()) {
            break label1082;
          }
          this.vFP.aR().aV().a(this.vFV, this.vFY).commitAllowingStateLoss();
          this.vFP.aR().executePendingTransactions();
          label176:
          this.vGa = ((OnLayoutChangedLinearLayout)this.vFY.mView.findViewById(R.h.bnb));
          this.vFY.md(true);
        }
      }
      for (;;)
      {
        if (this.vFY.bXH()) {
          this.vFY.vMl.xsJ = false;
        }
        w.i("MicroMsg.LauncherUI.ChattingTabUI", "ashu::prepareChattingFragment use %dms, needInit %B, Intent %s", new Object[] { Long.valueOf(System.currentTimeMillis() - l), Boolean.valueOf(bool), paramIntent });
        GMTrace.o(19033281789952L, 141809);
        return;
        final Object localObject3 = new int[2];
        this.vFP.cN().cO().getCustomView().getLocationInWindow((int[])localObject3);
        Object localObject4 = new TestTimeForChatting(this.vFP);
        Object localObject1 = new FrameLayout.LayoutParams(-1, -1);
        ((TestTimeForChatting)localObject4).setId(R.h.bnp);
        this.vFV = ((TestTimeForChatting)localObject4).getId();
        ((TestTimeForChatting)localObject4).setOrientation(1);
        ((TestTimeForChatting)localObject4).setLayoutParams((ViewGroup.LayoutParams)localObject1);
        final Object localObject5 = new HomeUI.FitSystemWindowLayoutView(this.vFP);
        ((HomeUI.FitSystemWindowLayoutView)localObject5).setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
        Object localObject2 = bWk();
        localObject1 = localObject2;
        if (localObject2 == null) {
          localObject1 = ((ViewGroup)this.vFP.getWindow().getDecorView()).getChildAt(0);
        }
        localObject2 = new ImageView(this.vFP);
        ((ImageView)localObject2).setId(R.h.gFJ);
        ((ImageView)localObject2).setLayoutParams(((TestTimeForChatting)localObject4).getLayoutParams());
        ((ImageView)localObject2).setVisibility(8);
        w.i("MicroMsg.LauncherUI.ChattingTabUI", "[prepareChattingFragment] prepareView GONE");
        final ViewGroup localViewGroup = (ViewGroup)localObject1;
        ((ViewGroup)this.vFP.getWindow().getDecorView()).removeView((View)localObject1);
        ((View)localObject1).setId(R.h.bJJ);
        ((HomeUI.FitSystemWindowLayoutView)localObject5).addView((View)localObject1);
        ((HomeUI.FitSystemWindowLayoutView)localObject5).addView((View)localObject2);
        ((HomeUI.FitSystemWindowLayoutView)localObject5).addView((View)localObject4);
        ((ViewGroup)this.vFP.getWindow().getDecorView()).addView((View)localObject5);
        this.vFP.getWindow().getDecorView().requestFitSystemWindows();
        int i = localObject3[1];
        w.i("MicroMsg.LauncherUI.ChattingTabUI", "ashu::fitSystemWindows. statusBarHeight:%d", new Object[] { Integer.valueOf(i) });
        if (i > 0) {
          this.vFQ.a((HomeUI.FitSystemWindowLayoutView)localObject5, new Rect(0, i, 0, 0), localViewGroup);
        }
        for (;;)
        {
          this.vFZ = ((TestTimeForChatting)this.vFP.findViewById(this.vFV));
          w.i("MicroMsg.LauncherUI.ChattingTabUI", "ashu::prepareChattingFragment init chattingView, top %s", new Object[] { Integer.valueOf(localObject3[1]) });
          break;
          this.vFP.cN().cO().getCustomView().post(new Runnable()
          {
            public final void run()
            {
              GMTrace.i(19097169428480L, 142285);
              d.this.vFP.cN().cO().getCustomView().getLocationInWindow(localObject3);
              int i = localObject3[1];
              if (i > 0)
              {
                d.this.vFQ.a(localObject5, new Rect(0, i, 0, 0), localViewGroup);
                GMTrace.o(19097169428480L, 142285);
                return;
              }
              if (com.tencent.mm.compatible.util.d.et(20)) {
                localObject5.setOnApplyWindowInsetsListener(new View.OnApplyWindowInsetsListener()
                {
                  @TargetApi(20)
                  public final WindowInsets onApplyWindowInsets(View paramAnonymous2View, WindowInsets paramAnonymous2WindowInsets)
                  {
                    GMTrace.i(19099048476672L, 142299);
                    if (paramAnonymous2WindowInsets == null)
                    {
                      GMTrace.o(19099048476672L, 142299);
                      return paramAnonymous2WindowInsets;
                    }
                    w.i("MicroMsg.LauncherUI.ChattingTabUI", "OnApplyWindowInsetsListener %s", new Object[] { paramAnonymous2WindowInsets });
                    paramAnonymous2WindowInsets.consumeSystemWindowInsets();
                    paramAnonymous2View = d.this.vFQ;
                    HomeUI.FitSystemWindowLayoutView localFitSystemWindowLayoutView = d.16.this.vGo;
                    paramAnonymous2WindowInsets.getSystemWindowInsetTop();
                    paramAnonymous2View.a(localFitSystemWindowLayoutView, new Rect(paramAnonymous2WindowInsets.getSystemWindowInsetLeft(), paramAnonymous2WindowInsets.getSystemWindowInsetTop(), paramAnonymous2WindowInsets.getSystemWindowInsetRight(), paramAnonymous2WindowInsets.getSystemWindowInsetBottom()), d.16.this.vGp);
                    GMTrace.o(19099048476672L, 142299);
                    return paramAnonymous2WindowInsets;
                  }
                });
              }
              GMTrace.o(19097169428480L, 142285);
            }
          });
        }
        if (!this.vFY.bXH()) {
          break;
        }
        localObject1 = new int[2];
        this.vFZ.getLocationInWindow((int[])localObject1);
        if (localObject1[1] == 0)
        {
          localObject2 = (ViewGroup)this.vFP.getWindow().getDecorView();
          i = 0;
        }
        for (;;)
        {
          if (i < ((ViewGroup)localObject2).getChildCount())
          {
            localObject3 = ((ViewGroup)this.vFP.getWindow().getDecorView()).getChildAt(i);
            if (!(localObject3 instanceof HomeUI.FitSystemWindowLayoutView)) {
              break label1056;
            }
            this.vFP.cN().cO().getCustomView().getLocationInWindow((int[])localObject1);
            localObject3 = (HomeUI.FitSystemWindowLayoutView)localObject3;
            localObject2 = (ViewGroup)this.vFP.findViewById(R.h.bJJ);
            i = ((ViewGroup)localObject2).getPaddingTop();
            int j = com.tencent.mm.ui.base.u.ad(this.vFP, -1);
            localObject4 = new Rect();
            localObject5 = this.vFP.getWindow();
            ((Window)localObject5).getDecorView().getWindowVisibleDisplayFrame((Rect)localObject4);
            int k = ((Window)localObject5).getDecorView().getHeight();
            w.i("MicroMsg.LauncherUI.ChattingTabUI", "rootLayout2 fitSystemWindows detect: ActionBar's CustomView location[1]:%d, paddingTop:%d getStatusBarHeight():%d, heightFromSysR:%d, rectangle.top:%d, rectangle.height:%d, DecorHeight:%d, cacheInsetsTop:%d", new Object[] { Integer.valueOf(localObject1[1]), Integer.valueOf(i), Integer.valueOf(com.tencent.mm.pluginsdk.e.dH(this.vFP)), Integer.valueOf(j), Integer.valueOf(((Rect)localObject4).top), Integer.valueOf(((Rect)localObject4).height()), Integer.valueOf(k), Integer.valueOf(((HomeUI.FitSystemWindowLayoutView)localObject3).vIW) });
            ((HomeUI.FitSystemWindowLayoutView)localObject3).fitSystemWindows(new Rect(0, ((HomeUI.FitSystemWindowLayoutView)localObject3).vIW, 0, 0));
            localObject3 = (ImageView)((HomeUI.FitSystemWindowLayoutView)localObject3).findViewById(R.h.gFJ);
            ((ImageView)localObject3).setTag(localObject2);
            ((ImageView)localObject3).setLayoutParams(((ViewGroup)localObject2).getLayoutParams());
            localObject4 = dM((View)localObject2);
            if (localObject4 != null)
            {
              ((ImageView)localObject3).setImageBitmap((Bitmap)localObject4);
              ((ViewGroup)localObject2).setVisibility(8);
              ((ImageView)localObject3).setVisibility(0);
              w.i("MicroMsg.LauncherUI.ChattingTabUI", "[prepareChattingFragment] prepareView VISIBLE");
            }
          }
          w.i("MicroMsg.LauncherUI.ChattingTabUI", "ashu::prepareChattingFragment has chattingView, top %s", new Object[] { Integer.valueOf(localObject1[1]) });
          break;
          label1056:
          w.e("MicroMsg.LauncherUI.ChattingTabUI", "on position %d, rootLayout not found!", new Object[] { Integer.valueOf(i) });
          i += 1;
        }
        label1082:
        this.vFP.aR().aV().b(this.vFV, this.vFY).commitAllowingStateLoss();
        break label176;
        label1110:
        this.vFY.gOF = true;
        this.vFY.mDe = false;
        this.vFY.ol.putAll(s.ah(paramIntent));
        this.vFY.cbG();
        this.vFY.onResume();
        this.vFY.md(true);
      }
    }
  }
  
  public final boolean bWe()
  {
    GMTrace.i(19032610701312L, 141804);
    if (this.vFY == null)
    {
      GMTrace.o(19032610701312L, 141804);
      return false;
    }
    boolean bool = this.vFY.gOF;
    GMTrace.o(19032610701312L, 141804);
    return bool;
  }
  
  public final void bWf()
  {
    GMTrace.i(19032744919040L, 141805);
    this.vFZ.setTranslationX(0.0F);
    this.vFZ.gbf = 0;
    GMTrace.o(19032744919040L, 141805);
  }
  
  public final void bWg()
  {
    GMTrace.i(19032879136768L, 141806);
    this.vFZ.postDelayed(new Runnable()
    {
      public final void run()
      {
        GMTrace.i(19107504193536L, 142362);
        long l = System.currentTimeMillis();
        at.xB().bQh();
        af.Am(0);
        d.this.vFP.U(1.0F);
        if (d.this.bWj())
        {
          ImageView localImageView = (ImageView)d.this.vFP.getWindow().getDecorView().findViewById(R.h.gFJ);
          if ((localImageView != null) && (localImageView.getTag() != null))
          {
            ((View)localImageView.getTag()).setVisibility(0);
            localImageView.setVisibility(8);
            w.i("MicroMsg.LauncherUI.ChattingTabUI", "[doJobOnChattingAnimEnd] prepareView GONE");
          }
        }
        d.this.vFZ.ciy();
        d.this.vFY.mDe = true;
        d.this.vFY.cdG();
        d.this.vFY.md(false);
        d.this.bWi();
        w.i("MicroMsg.LauncherUI.ChattingTabUI", "doJobOnChattingAnimEnd cost:%s", new Object[] { Long.valueOf(System.currentTimeMillis() - l) });
        GMTrace.o(19107504193536L, 142362);
      }
      
      public final String toString()
      {
        GMTrace.i(19107638411264L, 142363);
        String str = super.toString() + "|chattingView_onAnimationEnd";
        GMTrace.o(19107638411264L, 142363);
        return str;
      }
    }, 60L);
    GMTrace.o(19032879136768L, 141806);
  }
  
  public final void bWi()
  {
    boolean bool = true;
    GMTrace.i(19033550225408L, 141811);
    if (!bWj())
    {
      GMTrace.o(19033550225408L, 141811);
      return;
    }
    if (this.vFY == null) {}
    for (;;)
    {
      w.i("MicroMsg.LauncherUI.ChattingTabUI", "ashutest: tryResetChattingSwipeStatus, chattingFragment NULL ? %B", new Object[] { Boolean.valueOf(bool) });
      if (this.vFY != null) {
        this.vFY.vMl.xpb = false;
      }
      GMTrace.o(19033550225408L, 141811);
      return;
      bool = false;
    }
  }
  
  public final boolean bWj()
  {
    GMTrace.i(19033684443136L, 141812);
    if ((com.tencent.mm.compatible.util.d.et(19)) && (a.tw()) && (!b.aF(this.vFP)))
    {
      GMTrace.o(19033684443136L, 141812);
      return true;
    }
    GMTrace.o(19033684443136L, 141812);
    return false;
  }
  
  public final Bitmap dM(View paramView)
  {
    GMTrace.i(21069364723712L, 156979);
    long l = System.currentTimeMillis();
    int i = paramView.getWidth();
    int j = paramView.getHeight();
    if (i <= 0) {
      i = paramView.getMeasuredWidth();
    }
    for (;;)
    {
      if (j <= 0) {
        j = paramView.getMeasuredHeight();
      }
      for (;;)
      {
        if ((i <= 0) || (j <= 0))
        {
          w.e("MicroMsg.LauncherUI.ChattingTabUI", "viewWidth:%s viewHeight:%s", new Object[] { Integer.valueOf(i), Integer.valueOf(j) });
          GMTrace.o(21069364723712L, 156979);
          return null;
        }
        if ((this.yvF == null) || (this.yvF.isRecycled()) || (this.yvF.getWidth() != i) || (this.yvF.getHeight() != j)) {
          this.yvF = Bitmap.createBitmap(i, j, Bitmap.Config.ARGB_4444);
        }
        for (;;)
        {
          Canvas localCanvas = new Canvas(this.yvF);
          int k = (int)this.vFP.getResources().getDimension(R.f.aTi);
          int m = (int)this.vFP.getResources().getDimension(R.f.aPO);
          Paint localPaint = new Paint();
          localPaint.setColor(-1);
          localCanvas.drawRect(0.0F, k, i, j - m, localPaint);
          paramView.draw(localCanvas);
          w.i("MicroMsg.LauncherUI.ChattingTabUI", "[getMagicDrawingCache] cost%sms", new Object[] { Long.valueOf(System.currentTimeMillis() - l) });
          paramView = this.yvF;
          GMTrace.o(21069364723712L, 156979);
          return paramView;
          this.yvF.eraseColor(0);
        }
      }
    }
  }
  
  public final String getString(int paramInt)
  {
    GMTrace.i(19033818660864L, 141813);
    String str = this.vFP.getString(paramInt);
    GMTrace.o(19033818660864L, 141813);
    return str;
  }
  
  public final void kT(boolean paramBoolean)
  {
    GMTrace.i(19033416007680L, 141810);
    if (!this.vFQ.bWY())
    {
      GMTrace.o(19033416007680L, 141810);
      return;
    }
    this.vFP.f(paramBoolean, 0);
    GMTrace.o(19033416007680L, 141810);
  }
  
  private final class a
    implements Runnable
  {
    int aGY;
    int eLN;
    Intent eLO;
    int vGs;
    
    public a()
    {
      GMTrace.i(19030731653120L, 141790);
      this.vGs = 0;
      GMTrace.o(19030731653120L, 141790);
    }
    
    public final void run()
    {
      GMTrace.i(19030865870848L, 141791);
      if ((at.AU()) && (d.this.vFP != null))
      {
        w.i("MicroMsg.LauncherUI.ChattingTabUI", "on post select image job, acc has ready, retry count %d", new Object[] { Integer.valueOf(this.vGs) });
        d.this.a(d.this.vFU, null, false);
        af.t(new Runnable()
        {
          public final void run()
          {
            boolean bool = true;
            GMTrace.i(19103880314880L, 142335);
            if (d.this.vFY == null) {}
            for (;;)
            {
              w.d("MicroMsg.LauncherUI.ChattingTabUI", "on select image ActivityResult. after creat chattingUI, chatting fragment is null? %B", new Object[] { Boolean.valueOf(bool) });
              if (d.this.vFY != null)
              {
                w.d("MicroMsg.LauncherUI.ChattingTabUI", "on select image ActivityResult. do post activity result");
                d.this.vFY.onActivityResult(d.a.this.eLN & 0xFFFF, d.a.this.aGY, d.a.this.eLO);
              }
              GMTrace.o(19103880314880L, 142335);
              return;
              bool = false;
            }
          }
          
          public final String toString()
          {
            GMTrace.i(19104014532608L, 142336);
            String str = super.toString() + "|PostSelectImageJob_onActivityResult";
            GMTrace.o(19104014532608L, 142336);
            return str;
          }
        });
        GMTrace.o(19030865870848L, 141791);
        return;
      }
      if (this.vGs >= 3)
      {
        w.w("MicroMsg.LauncherUI.ChattingTabUI", "on post select image job, match max retry count");
        GMTrace.o(19030865870848L, 141791);
        return;
      }
      if (d.this.vFP != null) {}
      for (boolean bool = true;; bool = false)
      {
        w.w("MicroMsg.LauncherUI.ChattingTabUI", "on post select image job, acc not ready or view init(%B), cur retry count %d", new Object[] { Boolean.valueOf(bool), Integer.valueOf(this.vGs) });
        this.vGs += 1;
        af.i(this, 300L);
        GMTrace.o(19030865870848L, 141791);
        return;
      }
    }
    
    public final String toString()
    {
      GMTrace.i(19031000088576L, 141792);
      String str = super.toString() + "|PostSelectImageJob";
      GMTrace.o(19031000088576L, 141792);
      return str;
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\ui\d.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */