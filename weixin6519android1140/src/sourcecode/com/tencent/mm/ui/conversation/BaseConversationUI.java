package com.tencent.mm.ui.conversation;

import android.annotation.TargetApi;
import android.content.Intent;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Bitmap.Config;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.os.Looper;
import android.os.MessageQueue;
import android.os.MessageQueue.IdleHandler;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentActivity;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.util.DisplayMetrics;
import android.view.ActionMode;
import android.view.ActionMode.Callback;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnApplyWindowInsetsListener;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.Window;
import android.view.WindowInsets;
import android.view.animation.Animation;
import android.view.animation.Animation.AnimationListener;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.R.f;
import com.tencent.mm.R.h;
import com.tencent.mm.R.i;
import com.tencent.mm.compatible.h.a;
import com.tencent.mm.platformtools.t;
import com.tencent.mm.sdk.platformtools.af;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.ui.HomeUI.FitSystemWindowLayoutView;
import com.tencent.mm.ui.MMFragmentActivity;
import com.tencent.mm.ui.MMFragmentActivity.a;
import com.tencent.mm.ui.b;
import com.tencent.mm.ui.b.c;
import com.tencent.mm.ui.base.OnLayoutChangedLinearLayout;
import com.tencent.mm.ui.base.OnLayoutChangedLinearLayout.a;
import com.tencent.mm.ui.chatting.En_5b8fbb1e.a;
import com.tencent.mm.ui.tools.TestTimeForChatting;
import com.tencent.mm.ui.tools.TestTimeForChatting.a;
import com.tencent.mm.ui.tools.j;
import com.tencent.mm.ui.u;
import com.tencent.mm.ui.v;
import com.tencent.mm.ui.widget.k;
import com.tencent.mm.y.at;
import com.tencent.mm.y.r;

public class BaseConversationUI
  extends MMFragmentActivity
{
  private ActionBar FM;
  b krS;
  String title;
  private long vFR;
  private String vFU;
  private int vFV;
  private View vFW;
  private View vFX;
  private En_5b8fbb1e.a vFY;
  private TestTimeForChatting vFZ;
  private OnLayoutChangedLinearLayout vGa;
  private OnLayoutChangedLinearLayout.a vGb;
  String vGc;
  Bundle vGd;
  Runnable vGe;
  private Animation vGf;
  private boolean vGg;
  private Animation vGh;
  public boolean vGi;
  private boolean wEv;
  private long wEx;
  public b wVK;
  private a wVL;
  private c wVM;
  private Bitmap yvF;
  
  public BaseConversationUI()
  {
    GMTrace.i(3430873563136L, 25562);
    this.vFR = 0L;
    this.wVL = a.wVS;
    this.vGg = false;
    this.vGi = true;
    this.vFV = -1;
    this.vGb = new OnLayoutChangedLinearLayout.a()
    {
      long start;
      
      public final void bWl()
      {
        GMTrace.i(21072317513728L, 157001);
        if (BaseConversationUI.g(BaseConversationUI.this) == null)
        {
          BaseConversationUI.a(BaseConversationUI.this, AnimationUtils.loadAnimation(BaseConversationUI.this, MMFragmentActivity.a.vMx));
          BaseConversationUI.g(BaseConversationUI.this).setAnimationListener(new Animation.AnimationListener()
          {
            public final void onAnimationEnd(Animation paramAnonymous2Animation)
            {
              GMTrace.i(21071780642816L, 156997);
              w.i("MicroMsg.BaseConversationUI", "klem animationEnd");
              BaseConversationUI.i(BaseConversationUI.this);
              GMTrace.o(21071780642816L, 156997);
            }
            
            public final void onAnimationRepeat(Animation paramAnonymous2Animation)
            {
              GMTrace.i(21071646425088L, 156996);
              GMTrace.o(21071646425088L, 156996);
            }
            
            public final void onAnimationStart(Animation paramAnonymous2Animation)
            {
              GMTrace.i(21071512207360L, 156995);
              w.i("MicroMsg.BaseConversationUI", "klem onAnimationStart onDrawed->onAnimationStart:%sms", new Object[] { Long.valueOf(System.currentTimeMillis() - BaseConversationUI.9.this.start) });
              BaseConversationUI.h(BaseConversationUI.this);
              BaseConversationUI.a(BaseConversationUI.this, false);
              GMTrace.o(21071512207360L, 156995);
            }
          });
        }
        if (BaseConversationUI.j(BaseConversationUI.this))
        {
          BaseConversationUI.b(BaseConversationUI.this).yvL = new TestTimeForChatting.a()
          {
            public final void cuc()
            {
              GMTrace.i(21070975336448L, 156991);
              w.i("MicroMsg.BaseConversationUI", "[onDrawed]");
              BaseConversationUI.9.this.start = System.currentTimeMillis();
              BaseConversationUI.a(BaseConversationUI.this).mView.startAnimation(BaseConversationUI.g(BaseConversationUI.this));
              BaseConversationUI.b(BaseConversationUI.this).yvL = null;
              GMTrace.o(21070975336448L, 156991);
            }
          };
          BaseConversationUI.k(BaseConversationUI.this);
        }
        for (;;)
        {
          BaseConversationUI.l(BaseConversationUI.this).wia = null;
          w.i("MicroMsg.BaseConversationUI", "klem CHATTING ONLAYOUT ");
          GMTrace.o(21072317513728L, 157001);
          return;
          BaseConversationUI.h(BaseConversationUI.this);
          BaseConversationUI.i(BaseConversationUI.this);
        }
      }
    };
    this.vGe = new Runnable()
    {
      public final void run()
      {
        GMTrace.i(21071914860544L, 156998);
        BaseConversationUI.this.vGi = false;
        if (BaseConversationUI.this.isFinishing())
        {
          GMTrace.o(21071914860544L, 156998);
          return;
        }
        boolean bool;
        Object localObject;
        if (BaseConversationUI.b(BaseConversationUI.this) == null)
        {
          bool = false;
          w.i("MicroMsg.BaseConversationUI", "ashutest::startChatting, ishow:%b", new Object[] { Boolean.valueOf(bool) });
          localObject = new Intent().putExtra("Chat_User", BaseConversationUI.this.vGc);
          if (BaseConversationUI.this.vGd != null) {
            ((Intent)localObject).putExtras(BaseConversationUI.this.vGd);
          }
          ((Intent)localObject).putExtra("img_gallery_enter_from_chatting_ui", true);
          BaseConversationUI.a(BaseConversationUI.this, (Intent)localObject);
          BaseConversationUI.l(BaseConversationUI.this).wia = BaseConversationUI.m(BaseConversationUI.this);
          if (BaseConversationUI.this.getWindow().getDecorView().getWidth() != 0) {
            break label293;
          }
        }
        label293:
        for (float f = BaseConversationUI.this.getResources().getDisplayMetrics().widthPixels;; f = BaseConversationUI.this.getWindow().getDecorView().getWidth())
        {
          BaseConversationUI.b(BaseConversationUI.this).setTranslationX(f - 0.1F);
          BaseConversationUI.b(BaseConversationUI.this).setVisibility(0);
          localObject = BaseConversationUI.this;
          if ((((BaseConversationUI)localObject).wVK != null) && (!((BaseConversationUI)localObject).wVK.bXH())) {
            ((BaseConversationUI)localObject).wVK.lg(false);
          }
          if (BaseConversationUI.a(BaseConversationUI.this).bXH()) {
            k.a(BaseConversationUI.this);
          }
          com.tencent.mm.sdk.f.e.post(new Runnable()
          {
            public final void run()
            {
              GMTrace.i(21070706900992L, 156989);
              com.tencent.mm.modelstat.d.a(4, BaseConversationUI.this.getLocalClassName(), BaseConversationUI.this.hashCode());
              com.tencent.mm.modelstat.d.a(3, "En_5b8fbb1e" + BaseConversationUI.a(BaseConversationUI.this).cdL(), BaseConversationUI.a(BaseConversationUI.this).hashCode());
              GMTrace.o(21070706900992L, 156989);
            }
          }, "directReport_startChattingRunnable");
          BaseConversationUI.a(BaseConversationUI.this, bg.Pu());
          GMTrace.o(21071914860544L, 156998);
          return;
          bool = BaseConversationUI.b(BaseConversationUI.this).isShown();
          break;
        }
      }
      
      public final String toString()
      {
        GMTrace.i(21072049078272L, 156999);
        String str = super.toString() + "|startChattingRunnable";
        GMTrace.o(21072049078272L, 156999);
        return str;
      }
    };
    this.wVM = new c();
    this.wEv = false;
    this.wEx = 0L;
    GMTrace.o(3430873563136L, 25562);
  }
  
  private void a(HomeUI.FitSystemWindowLayoutView paramFitSystemWindowLayoutView, int paramInt, Rect paramRect, ViewGroup paramViewGroup)
  {
    GMTrace.i(14995341443072L, 111724);
    int j = getWindow().getDecorView().getBottom();
    int k = cN().cO().getCustomView().getBottom();
    if ((this.wVK != null) && (this.wVK.mView != null)) {}
    for (int i = j - (paramInt + k + this.wVK.mView.getBottom());; i = 0)
    {
      w.i("MicroMsg.BaseConversationUI", "ashu::fitSystemWindows 2. decorBottom:%d, statusBarHeight:%d, actionBarHeight:%d, paddingForNavBar:%d", new Object[] { Integer.valueOf(j), Integer.valueOf(paramInt), Integer.valueOf(k), Integer.valueOf(i) });
      paramFitSystemWindowLayoutView.vIX = paramViewGroup;
      paramFitSystemWindowLayoutView.fitSystemWindows(paramRect);
      GMTrace.o(14995341443072L, 111724);
      return;
    }
  }
  
  private void bWZ()
  {
    GMTrace.i(3432752611328L, 25576);
    if ((this.vFY != null) && (this.vFY.gOF))
    {
      GMTrace.o(3432752611328L, 25576);
      return;
    }
    View localView = v.fb(this).inflate(R.i.coP, null);
    this.krS = new b(localView);
    this.FM.setLogo(new ColorDrawable(getResources().getColor(17170445)));
    this.FM.cJ();
    this.FM.setDisplayHomeAsUpEnabled(false);
    this.FM.cI();
    this.FM.cK();
    this.FM.setCustomView(localView);
    anv();
    this.krS.h(new View.OnClickListener()
    {
      public final void onClick(View paramAnonymousView)
      {
        GMTrace.i(21070035812352L, 156984);
        BaseConversationUI.this.finish();
        GMTrace.o(21070035812352L, 156984);
      }
    });
    GMTrace.o(3432752611328L, 25576);
  }
  
  private void bWi()
  {
    boolean bool = true;
    GMTrace.i(3431947304960L, 25570);
    if ((!com.tencent.mm.compatible.util.d.et(19)) || (!a.tw()))
    {
      GMTrace.o(3431947304960L, 25570);
      return;
    }
    if (this.vFY == null) {}
    for (;;)
    {
      w.i("MicroMsg.BaseConversationUI", "ashutest: tryResetChattingSwipeStatus, chattingFragment NULL ? %B", new Object[] { Boolean.valueOf(bool) });
      if (this.vFY != null) {
        this.vFY.vMl.xpb = false;
      }
      GMTrace.o(3431947304960L, 25570);
      return;
      bool = false;
    }
  }
  
  private ViewGroup cgR()
  {
    GMTrace.i(3432349958144L, 25573);
    Object localObject1 = this.FM.getCustomView().getParent();
    Object localObject2 = null;
    ViewGroup localViewGroup = (ViewGroup)getWindow().getDecorView();
    while ((localObject1 != localViewGroup) && (localObject1 != null))
    {
      ViewParent localViewParent = ((ViewParent)localObject1).getParent();
      localObject2 = localObject1;
      localObject1 = localViewParent;
    }
    localObject1 = (ViewGroup)localObject2;
    GMTrace.o(3432349958144L, 25573);
    return (ViewGroup)localObject1;
  }
  
  public final void U(float paramFloat)
  {
    GMTrace.i(3431678869504L, 25568);
    w.v("MicroMsg.BaseConversationUI", "ashutest::on swipe %f, duration %d, status %s", new Object[] { Float.valueOf(paramFloat), Long.valueOf(240L), this.wVL });
    if ((!com.tencent.mm.compatible.util.d.et(19)) || (!a.tw()))
    {
      GMTrace.o(3431678869504L, 25568);
      return;
    }
    if ((paramFloat == 0.0F) && (!this.vGi))
    {
      localObject = (ImageView)getWindow().getDecorView().findViewById(R.h.gFJ);
      if (localObject != null)
      {
        final ViewGroup localViewGroup = (ViewGroup)((ImageView)localObject).getTag();
        if (localViewGroup != null) {
          localViewGroup.post(new Runnable()
          {
            public final void run()
            {
              GMTrace.i(3405506412544L, 25373);
              localObject.setVisibility(0);
              localObject.setImageBitmap(BaseConversationUI.this.dM(localViewGroup));
              localViewGroup.setVisibility(8);
              GMTrace.o(3405506412544L, 25373);
            }
          });
        }
      }
    }
    if (a.wVT != this.wVL)
    {
      super.U(paramFloat);
      if (Float.compare(1.0F, paramFloat) > 0)
      {
        GMTrace.o(3431678869504L, 25568);
        return;
      }
    }
    final Object localObject = findViewById(R.h.gFJ);
    if (Float.compare(1.0F, paramFloat) <= 0)
    {
      j.n((View)localObject, 0.0F);
      GMTrace.o(3431678869504L, 25568);
      return;
    }
    j.n((View)localObject, ((View)localObject).getWidth() / 4 * (1.0F - paramFloat) * -1.0F);
    GMTrace.o(3431678869504L, 25568);
  }
  
  public final void a(String paramString, Bundle paramBundle, boolean paramBoolean)
  {
    GMTrace.i(3432081522688L, 25571);
    if (this.vFZ == null) {}
    for (boolean bool = false;; bool = this.vFZ.isShown())
    {
      w.i("MicroMsg.BaseConversationUI", "try startChatting, ishow:%b", new Object[] { Boolean.valueOf(bool) });
      this.vGd = paramBundle;
      this.vGc = paramString;
      this.vGg = paramBoolean;
      at.xB().bQe();
      af.Am(-8);
      af.t(this.vGe);
      GMTrace.o(3432081522688L, 25571);
      return;
    }
  }
  
  public final void anv()
  {
    GMTrace.i(3432886829056L, 25577);
    if (this.krS != null) {
      this.krS.setTitle(r.fs(this.title));
    }
    GMTrace.o(3432886829056L, 25577);
  }
  
  protected En_5b8fbb1e.a cgN()
  {
    GMTrace.i(3433692135424L, 25583);
    En_5b8fbb1e.a locala = En_5b8fbb1e.a.cdt();
    GMTrace.o(3433692135424L, 25583);
    return locala;
  }
  
  public final void cgS()
  {
    GMTrace.i(3432484175872L, 25574);
    if (this.wVK != null)
    {
      this.wVK.onResume();
      if (!this.wVK.bXH()) {
        this.wVK.lg(true);
      }
    }
    GMTrace.o(3432484175872L, 25574);
  }
  
  public final Bitmap dM(View paramView)
  {
    GMTrace.i(21072451731456L, 157002);
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
          w.e("MicroMsg.BaseConversationUI", "viewWidth:%s viewHeight:%s", new Object[] { Integer.valueOf(i), Integer.valueOf(j) });
          GMTrace.o(21072451731456L, 157002);
          return null;
        }
        Canvas localCanvas;
        int k;
        Paint localPaint;
        if ((this.yvF == null) || (this.yvF.isRecycled()) || (this.yvF.getWidth() != i) || (this.yvF.getHeight() != j))
        {
          this.yvF = Bitmap.createBitmap(i, j, Bitmap.Config.ARGB_4444);
          localCanvas = new Canvas(this.yvF);
          k = (int)getResources().getDimension(R.f.aTi);
          localPaint = new Paint();
          localPaint.setColor(-1);
          if (i <= j) {
            break label259;
          }
          localCanvas.drawRect(0.0F, k, i - k, j, localPaint);
        }
        for (;;)
        {
          paramView.draw(localCanvas);
          w.i("MicroMsg.BaseConversationUI", "[getMagicDrawingCache] cost%sms", new Object[] { Long.valueOf(System.currentTimeMillis() - l) });
          paramView = this.yvF;
          GMTrace.o(21072451731456L, 157002);
          return paramView;
          this.yvF.eraseColor(0);
          break;
          label259:
          localCanvas.drawRect(0.0F, k, i, j - k, localPaint);
        }
      }
    }
  }
  
  public boolean dispatchKeyEvent(KeyEvent paramKeyEvent)
  {
    GMTrace.i(3433557917696L, 25582);
    w.i("MicroMsg.BaseConversationUI", "ui group onKeyDown, code:%d action:%d", new Object[] { Integer.valueOf(paramKeyEvent.getKeyCode()), Integer.valueOf(paramKeyEvent.getAction()) });
    if ((paramKeyEvent.getKeyCode() == 4) && (paramKeyEvent.getAction() == 0)) {
      af.F(this.vGe);
    }
    boolean bool;
    if ((this.vFY != null) && (this.vFY.gOF) && (!this.vFY.wEw))
    {
      if (this.vFY.onKeyDown(paramKeyEvent.getKeyCode(), paramKeyEvent))
      {
        GMTrace.o(3433557917696L, 25582);
        return true;
      }
      try
      {
        bool = super.dispatchKeyEvent(paramKeyEvent);
        GMTrace.o(3433557917696L, 25582);
        return bool;
      }
      catch (Exception paramKeyEvent)
      {
        w.w("MicroMsg.BaseConversationUI", "dispatch key event catch exception %s", new Object[] { paramKeyEvent.getMessage() });
        w.printErrStackTrace("MicroMsg.BaseConversationUI", paramKeyEvent, "", new Object[0]);
        GMTrace.o(3433557917696L, 25582);
        return false;
      }
    }
    if (paramKeyEvent.getKeyCode() == 4)
    {
      if (paramKeyEvent.getAction() == 0)
      {
        this.wEv = true;
        this.wEx = System.currentTimeMillis();
      }
      if (paramKeyEvent.getAction() == 1)
      {
        w.d("MicroMsg.BaseConversationUI", "hasBack %B, %d", new Object[] { Boolean.valueOf(this.wEv), Long.valueOf(System.currentTimeMillis() - this.wEx) });
        if ((!this.wEv) || (System.currentTimeMillis() - this.wEx > 30000L))
        {
          GMTrace.o(3433557917696L, 25582);
          return true;
        }
        finish();
      }
      GMTrace.o(3433557917696L, 25582);
      return true;
    }
    try
    {
      bool = super.dispatchKeyEvent(paramKeyEvent);
      GMTrace.o(3433557917696L, 25582);
      return bool;
    }
    catch (Exception paramKeyEvent)
    {
      w.w("MicroMsg.BaseConversationUI", "dispatch key event catch exception %s", new Object[] { paramKeyEvent.getMessage() });
      w.printErrStackTrace("MicroMsg.BaseConversationUI", paramKeyEvent, "", new Object[0]);
      GMTrace.o(3433557917696L, 25582);
    }
    return false;
  }
  
  public final void f(boolean paramBoolean, int paramInt)
  {
    long l = 120L;
    GMTrace.i(3433423699968L, 25581);
    w.v("MicroMsg.BaseConversationUI", "ashutest: on settle %B, speed %d, status %s", new Object[] { Boolean.valueOf(paramBoolean), Integer.valueOf(paramInt), this.wVL });
    if ((!com.tencent.mm.compatible.util.d.et(19)) || (!a.tw()))
    {
      GMTrace.o(3433423699968L, 25581);
      return;
    }
    if (a.wVT != this.wVL)
    {
      super.f(paramBoolean, paramInt);
      GMTrace.o(3433423699968L, 25581);
      return;
    }
    View localView = findViewById(R.h.gFJ);
    if (paramBoolean)
    {
      if (paramInt > 0) {}
      for (;;)
      {
        j.a(localView, l, 0.0F, 0.125F);
        GMTrace.o(3433423699968L, 25581);
        return;
        l = 240L;
      }
    }
    if (paramInt > 0) {}
    for (;;)
    {
      j.a(localView, l, localView.getWidth() * -1 / 4, 0.75F);
      GMTrace.o(3433423699968L, 25581);
      return;
      l = 240L;
    }
  }
  
  public final void la(boolean paramBoolean)
  {
    GMTrace.i(3432618393600L, 25575);
    if (this.vFZ == null) {}
    for (boolean bool = false;; bool = this.vFZ.isShown())
    {
      w.i("MicroMsg.BaseConversationUI", "try closeChatting, ishow:%b", new Object[] { Boolean.valueOf(bool) });
      if ((this.vFY != null) && (this.vFY.bXH())) {
        k.b(this);
      }
      if ((this.vFZ != null) && (this.vFZ.getVisibility() != 8) && (this.vFY != null)) {
        break;
      }
      GMTrace.o(3432618393600L, 25575);
      return;
    }
    w.i("MicroMsg.BaseConversationUI", "closeChatting");
    this.vFZ.setVisibility(8);
    this.vGi = true;
    if (this.vGf == null)
    {
      this.vGf = AnimationUtils.loadAnimation(this, MMFragmentActivity.a.vMA);
      this.vGf.setAnimationListener(new Animation.AnimationListener()
      {
        public final void onAnimationEnd(Animation paramAnonymousAnimation)
        {
          GMTrace.i(21070438465536L, 156987);
          at.xB().bQh();
          af.Am(0);
          BaseConversationUI.f(BaseConversationUI.this);
          w.i("MicroMsg.BaseConversationUI", "klem pop out onAnimationEnd");
          GMTrace.o(21070438465536L, 156987);
        }
        
        public final void onAnimationRepeat(Animation paramAnonymousAnimation)
        {
          GMTrace.i(21070304247808L, 156986);
          GMTrace.o(21070304247808L, 156986);
        }
        
        public final void onAnimationStart(Animation paramAnonymousAnimation)
        {
          GMTrace.i(21070170030080L, 156985);
          at.xB().bQe();
          af.Am(-8);
          w.i("MicroMsg.BaseConversationUI", "klem pop out onAnimationStart");
          BaseConversationUI.a(BaseConversationUI.this, true);
          GMTrace.o(21070170030080L, 156985);
        }
      });
    }
    this.vFY.onPause();
    this.vFY.cdE();
    this.vFY.gOF = false;
    if (this.vFY.bXH())
    {
      ImageView localImageView = (ImageView)getWindow().getDecorView().findViewById(R.h.gFJ);
      if ((localImageView != null) && (localImageView.getVisibility() == 0))
      {
        localImageView.setVisibility(8);
        if (localImageView.getTag() != null) {
          ((View)localImageView.getTag()).setVisibility(0);
        }
      }
    }
    if (paramBoolean) {
      this.vFZ.startAnimation(this.vGf);
    }
    for (;;)
    {
      if (!this.vFY.bXH()) {
        bWZ();
      }
      aQ();
      cgS();
      com.tencent.mm.sdk.f.e.post(new Runnable()
      {
        public final void run()
        {
          GMTrace.i(21069767376896L, 156982);
          com.tencent.mm.modelstat.d.a(4, "En_5b8fbb1e" + BaseConversationUI.a(BaseConversationUI.this).cdL(), BaseConversationUI.a(BaseConversationUI.this).hashCode());
          com.tencent.mm.modelstat.d.e("En_5b8fbb1e" + BaseConversationUI.a(BaseConversationUI.this).cdL(), BaseConversationUI.e(BaseConversationUI.this), t.Pu());
          com.tencent.mm.modelstat.d.a(3, BaseConversationUI.this.getLocalClassName(), BaseConversationUI.this.hashCode());
          GMTrace.o(21069767376896L, 156982);
        }
      }, "directReport_closeChatting");
      GMTrace.o(3432618393600L, 25575);
      return;
      U(1.0F);
      bWi();
    }
  }
  
  protected void onActivityResult(int paramInt1, int paramInt2, Intent paramIntent)
  {
    int i = 1;
    GMTrace.i(3431813087232L, 25569);
    super.onActivityResult(paramInt1, paramInt2, paramIntent);
    if (this.wVK != null) {
      this.wVK.onActivityResult(paramInt1, paramInt2, paramIntent);
    }
    if (paramInt2 != -1)
    {
      GMTrace.o(3431813087232L, 25569);
      return;
    }
    if ((paramInt1 == 2001) && (this.vFY != null)) {
      this.vFY.onActivityResult(paramInt1, paramInt2, paramIntent);
    }
    int j = 0xFFFF & paramInt1;
    w.w("MicroMsg.BaseConversationUI", "check request code %d", new Object[] { Integer.valueOf(j) });
    switch (j)
    {
    default: 
      i = 0;
    }
    if ((i != 0) && (this.vFY == null))
    {
      w.i("MicroMsg.BaseConversationUI", "on select image ActivityResult. the chattingUI maybe kill in the background.");
      af.F(this.wVM);
      this.wVM.vGs = 0;
      this.wVM.eLN = paramInt1;
      this.wVM.aGY = paramInt2;
      this.wVM.eLO = paramIntent;
      af.t(this.wVM);
      GMTrace.o(3431813087232L, 25569);
      return;
    }
    GMTrace.o(3431813087232L, 25569);
  }
  
  public void onCreate(Bundle paramBundle)
  {
    GMTrace.i(3431007780864L, 25563);
    getWindow().setFormat(-2);
    com.tencent.mm.pluginsdk.e.O(this);
    super.onCreate(paramBundle);
    getWindow().setCallback(new c(getWindow().getCallback(), this));
    this.FM = cN().cO();
    bXM();
    GMTrace.o(3431007780864L, 25563);
  }
  
  protected void onDestroy()
  {
    GMTrace.i(3431544651776L, 25567);
    super.onDestroy();
    if ((this.yvF != null) && (!this.yvF.isRecycled())) {
      this.yvF.recycle();
    }
    this.vFY = null;
    this.vGa = null;
    this.vFZ = null;
    this.wVK = null;
    this.krS = null;
    this.vGh = null;
    this.vGf = null;
    GMTrace.o(3431544651776L, 25567);
  }
  
  protected void onNewIntent(Intent paramIntent)
  {
    GMTrace.i(3431141998592L, 25564);
    super.onNewIntent(paramIntent);
    w.i("MicroMsg.BaseConversationUI", "onNewIntent");
    setIntent(paramIntent);
    GMTrace.o(3431141998592L, 25564);
  }
  
  protected void onPause()
  {
    GMTrace.i(3431410434048L, 25566);
    w.i("MicroMsg.BaseConversationUI", "on pause");
    super.onPause();
    if (!isFinishing()) {
      k.a(this);
    }
    this.wVL = a.wVU;
    if ((this.vFZ != null) && (this.vFZ.isShown())) {}
    for (final boolean bool = true;; bool = false)
    {
      com.tencent.mm.sdk.f.e.post(new Runnable()
      {
        public final void run()
        {
          GMTrace.i(14678990258176L, 109367);
          String str;
          if (bool)
          {
            str = "En_5b8fbb1e" + BaseConversationUI.a(BaseConversationUI.this).cdL();
            if (!bool) {
              break label130;
            }
          }
          label130:
          for (int i = BaseConversationUI.a(BaseConversationUI.this).hashCode();; i = BaseConversationUI.this.hashCode())
          {
            com.tencent.mm.modelstat.d.a(4, str, i);
            if (bool) {
              com.tencent.mm.modelstat.d.e("En_5b8fbb1e" + BaseConversationUI.a(BaseConversationUI.this).cdL(), BaseConversationUI.e(BaseConversationUI.this), t.Pu());
            }
            GMTrace.o(14678990258176L, 109367);
            return;
            str = BaseConversationUI.this.getLocalClassName();
            break;
          }
        }
      }, "directReport_onPause");
      if ((this.vFY != null) && (this.vFY.bXH())) {
        this.vFY.vMl.mEnable = false;
      }
      GMTrace.o(3431410434048L, 25566);
      return;
    }
  }
  
  protected void onRestoreInstanceState(Bundle paramBundle)
  {
    GMTrace.i(3433155264512L, 25579);
    super.onRestoreInstanceState(paramBundle);
    this.vFU = paramBundle.getString("last_restore_talker");
    w.d("MicroMsg.BaseConversationUI", "onRestoreInstantceState:%s", new Object[] { this.vFU });
    GMTrace.o(3433155264512L, 25579);
  }
  
  protected void onResume()
  {
    GMTrace.i(3431276216320L, 25565);
    super.onResume();
    k.b(this);
    U(1.0F);
    this.wVL = a.wVT;
    if ((this.vFZ != null) && (this.vFZ.isShown())) {}
    for (final boolean bool = true;; bool = false)
    {
      com.tencent.mm.sdk.f.e.post(new Runnable()
      {
        public final void run()
        {
          GMTrace.i(14682211483648L, 109391);
          String str;
          if (bool)
          {
            str = "En_5b8fbb1e" + BaseConversationUI.a(BaseConversationUI.this).cdL();
            if (!bool) {
              break label85;
            }
          }
          label85:
          for (int i = BaseConversationUI.a(BaseConversationUI.this).hashCode();; i = BaseConversationUI.this.hashCode())
          {
            com.tencent.mm.modelstat.d.a(3, str, i);
            GMTrace.o(14682211483648L, 109391);
            return;
            str = BaseConversationUI.this.getLocalClassName();
            break;
          }
        }
      }, "directReport_onResume");
      if (!bool) {
        this.vFR = bg.Pu();
      }
      if ((com.tencent.mm.compatible.util.d.et(19)) && (a.tw()))
      {
        Looper.myQueue().addIdleHandler(new MessageQueue.IdleHandler()
        {
          public final boolean queueIdle()
          {
            GMTrace.i(3421344104448L, 25491);
            long l = System.currentTimeMillis();
            if (BaseConversationUI.b(BaseConversationUI.this) == null)
            {
              if (BaseConversationUI.c(BaseConversationUI.this) == null) {
                BaseConversationUI.a(BaseConversationUI.this, v.fb(BaseConversationUI.this).inflate(R.i.crP, null));
              }
              if (BaseConversationUI.d(BaseConversationUI.this) == null) {
                BaseConversationUI.b(BaseConversationUI.this, v.fb(BaseConversationUI.this).inflate(R.i.coP, null));
              }
            }
            w.d("MicroMsg.BaseConversationUI", "prepare chattingUI view use %dms", new Object[] { Long.valueOf(System.currentTimeMillis() - l) });
            GMTrace.o(3421344104448L, 25491);
            return false;
          }
        });
        if ((this.vFY != null) && (this.vFY.bXH())) {
          this.vFY.vMl.mEnable = true;
        }
        Looper.myQueue().addIdleHandler(new MessageQueue.IdleHandler()
        {
          public final boolean queueIdle()
          {
            GMTrace.i(14679527129088L, 109371);
            long l = System.currentTimeMillis();
            if (BaseConversationUI.b(BaseConversationUI.this) == null) {
              if ((BaseConversationUI.this.wVK == null) || (bg.nm(BaseConversationUI.this.wVK.getUserName()))) {
                break label213;
              }
            }
            label213:
            for (Object localObject = BaseConversationUI.this.wVK.getUserName();; localObject = com.tencent.mm.y.q.zE())
            {
              localObject = new Intent().putExtra("Chat_User", (String)localObject);
              BaseConversationUI.a(BaseConversationUI.this, (Intent)localObject);
              BaseConversationUI.a(BaseConversationUI.this).mDe = true;
              BaseConversationUI.a(BaseConversationUI.this).cdG();
              BaseConversationUI.b(BaseConversationUI.this).setVisibility(8);
              BaseConversationUI.a(BaseConversationUI.this).vMk = true;
              BaseConversationUI.a(BaseConversationUI.this).onPause();
              BaseConversationUI.a(BaseConversationUI.this).cdE();
              BaseConversationUI.a(BaseConversationUI.this).gOF = false;
              BaseConversationUI.this.cgS();
              BaseConversationUI.a(BaseConversationUI.this, null);
              BaseConversationUI.b(BaseConversationUI.this, null);
              w.d("MicroMsg.BaseConversationUI", "prepare chattingUI logic use %dms", new Object[] { Long.valueOf(System.currentTimeMillis() - l) });
              GMTrace.o(14679527129088L, 109371);
              return false;
            }
          }
        });
      }
      bWZ();
      this.FM.show();
      GMTrace.o(3431276216320L, 25565);
      return;
    }
  }
  
  protected void onSaveInstanceState(Bundle paramBundle)
  {
    GMTrace.i(3433289482240L, 25580);
    if ((this.vFY != null) && (!bg.nm(this.vFY.cci())))
    {
      w.d("MicroMsg.BaseConversationUI", "onSaveInstanceState:%s", new Object[] { this.vFY.cci() });
      paramBundle.putString("last_restore_talker", this.vFY.cci());
    }
    GMTrace.o(3433289482240L, 25580);
  }
  
  public ActionMode onWindowStartingActionMode(ActionMode.Callback paramCallback)
  {
    GMTrace.i(3433021046784L, 25578);
    if ((this.vFY == null) || (this.vFY.wDR == null) || (!this.vFY.bXH()))
    {
      paramCallback = super.onWindowStartingActionMode(paramCallback);
      GMTrace.o(3433021046784L, 25578);
      return paramCallback;
    }
    if (com.tencent.mm.compatible.util.d.ev(22))
    {
      paramCallback = super.onWindowStartingActionMode(paramCallback);
      GMTrace.o(3433021046784L, 25578);
      return paramCallback;
    }
    ActionMode localActionMode = this.vFY.wDR.startActionMode(paramCallback);
    if (localActionMode == null)
    {
      paramCallback = super.onWindowStartingActionMode(paramCallback);
      GMTrace.o(3433021046784L, 25578);
      return paramCallback;
    }
    GMTrace.o(3433021046784L, 25578);
    return localActionMode;
  }
  
  private static enum a
  {
    static
    {
      GMTrace.i(3463488471040L, 25805);
      wVS = new a("ACTIVITY_CREATE", 0);
      wVT = new a("ACTIVITY_RESUME", 1);
      wVU = new a("ACTIVITY_PAUSE", 2);
      wVV = new a[] { wVS, wVT, wVU };
      GMTrace.o(3463488471040L, 25805);
    }
    
    private a()
    {
      GMTrace.i(3463354253312L, 25804);
      GMTrace.o(3463354253312L, 25804);
    }
  }
  
  public static class b
    extends u
  {
    public BaseConversationUI wVW;
    private BaseConversationUI.a wVX;
    
    public b()
    {
      GMTrace.i(3422552064000L, 25500);
      this.wVX = BaseConversationUI.a.wVS;
      GMTrace.o(3422552064000L, 25500);
    }
    
    public final void finish()
    {
      GMTrace.i(3423088934912L, 25504);
      bWQ().finish();
      GMTrace.o(3423088934912L, 25504);
    }
    
    public int getLayoutId()
    {
      GMTrace.i(3422686281728L, 25501);
      GMTrace.o(3422686281728L, 25501);
      return 0;
    }
    
    public String getUserName()
    {
      GMTrace.i(3423625805824L, 25508);
      GMTrace.o(3423625805824L, 25508);
      return null;
    }
    
    public final View onCreateView(LayoutInflater paramLayoutInflater, ViewGroup paramViewGroup, Bundle paramBundle)
    {
      GMTrace.i(3422820499456L, 25502);
      this.wVX = BaseConversationUI.a.wVS;
      this.wVW = ((BaseConversationUI)bWQ());
      paramLayoutInflater = paramLayoutInflater.inflate(getLayoutId(), paramViewGroup, false);
      aH();
      GMTrace.o(3422820499456L, 25502);
      return paramLayoutInflater;
    }
    
    public void onDestroy()
    {
      GMTrace.i(3423491588096L, 25507);
      if (this.wVX != BaseConversationUI.a.wVU)
      {
        w.w("MicroMsg.BaseConversationUI", "fmStatus != ActivityStatus.ACTIVITY_PAUSE when fm onDestroy");
        onPause();
      }
      super.onDestroy();
      GMTrace.o(3423491588096L, 25507);
    }
    
    public void onPause()
    {
      GMTrace.i(3423357370368L, 25506);
      super.onPause();
      this.wVX = BaseConversationUI.a.wVU;
      GMTrace.o(3423357370368L, 25506);
    }
    
    public void onResume()
    {
      GMTrace.i(3423223152640L, 25505);
      super.onResume();
      this.wVX = BaseConversationUI.a.wVT;
      GMTrace.o(3423223152640L, 25505);
    }
    
    public final void sq(String paramString)
    {
      GMTrace.i(3422954717184L, 25503);
      if (this.wVW != null)
      {
        BaseConversationUI localBaseConversationUI = this.wVW;
        localBaseConversationUI.title = paramString;
        if (localBaseConversationUI.krS != null) {
          localBaseConversationUI.anv();
        }
      }
      GMTrace.o(3422954717184L, 25503);
    }
  }
  
  private final class c
    implements Runnable
  {
    int aGY;
    int eLN;
    Intent eLO;
    int vGs;
    
    public c()
    {
      GMTrace.i(3408861855744L, 25398);
      this.vGs = 0;
      GMTrace.o(3408861855744L, 25398);
    }
    
    public final void run()
    {
      GMTrace.i(3408996073472L, 25399);
      if (at.AU())
      {
        w.i("MicroMsg.BaseConversationUI", "on post select image job, acc has ready, retry count %d", new Object[] { Integer.valueOf(this.vGs) });
        BaseConversationUI.this.a(BaseConversationUI.n(BaseConversationUI.this), null, false);
        af.t(new Runnable()
        {
          public final void run()
          {
            boolean bool = true;
            GMTrace.i(3406982807552L, 25384);
            if (BaseConversationUI.a(BaseConversationUI.this) == null) {}
            for (;;)
            {
              w.d("MicroMsg.BaseConversationUI", "on select image ActivityResult. after creat chattingUI, chatting fragment is null? %B", new Object[] { Boolean.valueOf(bool) });
              if (BaseConversationUI.a(BaseConversationUI.this) != null)
              {
                w.d("MicroMsg.BaseConversationUI", "on select image ActivityResult. do post activity result");
                BaseConversationUI.a(BaseConversationUI.this).onActivityResult(BaseConversationUI.c.this.eLN & 0xFFFF, BaseConversationUI.c.this.aGY, BaseConversationUI.c.this.eLO);
              }
              GMTrace.o(3406982807552L, 25384);
              return;
              bool = false;
            }
          }
          
          public final String toString()
          {
            GMTrace.i(3407117025280L, 25385);
            String str = super.toString() + "|PostSelectImageJob_onActivityResult";
            GMTrace.o(3407117025280L, 25385);
            return str;
          }
        });
        GMTrace.o(3408996073472L, 25399);
        return;
      }
      if (this.vGs >= 3)
      {
        w.w("MicroMsg.BaseConversationUI", "on post select image job, match max retry count");
        GMTrace.o(3408996073472L, 25399);
        return;
      }
      w.w("MicroMsg.BaseConversationUI", "on post select image job, acc not ready, cur retry count %d", new Object[] { Integer.valueOf(this.vGs) });
      this.vGs += 1;
      af.i(this, 300L);
      GMTrace.o(3408996073472L, 25399);
    }
    
    public final String toString()
    {
      GMTrace.i(3409130291200L, 25400);
      String str = super.toString() + "|PostSelectImageJob";
      GMTrace.o(3409130291200L, 25400);
      return str;
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\ui\conversation\BaseConversationUI.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */