package com.tencent.mm.plugin.webview.ui.tools.game;

import android.annotation.TargetApi;
import android.content.Intent;
import android.content.SharedPreferences;
import android.graphics.Bitmap;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.os.RemoteException;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.view.MenuItem;
import android.view.MenuItem.OnMenuItemClickListener;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewGroup.LayoutParams;
import android.view.ViewGroup.MarginLayoutParams;
import android.view.WindowInsets;
import android.widget.ProgressBar;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.R.e;
import com.tencent.mm.plugin.report.service.g;
import com.tencent.mm.plugin.webview.model.aj;
import com.tencent.mm.plugin.webview.model.aj.c;
import com.tencent.mm.plugin.webview.ui.tools.WebViewUI;
import com.tencent.mm.plugin.webview.ui.tools.WebViewUI.h;
import com.tencent.mm.plugin.webview.ui.tools.e;
import com.tencent.mm.plugin.webview.ui.tools.game.menu.GameMenuImageButton;
import com.tencent.mm.plugin.webview.ui.tools.game.menu.GameMenuImageButton.a;
import com.tencent.mm.plugin.webview.ui.tools.game.menu.b.b;
import com.tencent.mm.plugin.webview.ui.tools.game.menu.b.c;
import com.tencent.mm.plugin.webview.ui.tools.game.menu.c;
import com.tencent.mm.plugin.webview.ui.tools.jsapi.d.48;
import com.tencent.mm.plugin.webview.ui.tools.jsapi.i.a;
import com.tencent.mm.plugin.webview.ui.tools.widget.MovingImageButton;
import com.tencent.mm.plugin.webview.ui.tools.widget.WebViewSearchContentInputFooter;
import com.tencent.mm.plugin.webview.wepkg.a.a;
import com.tencent.mm.plugin.webview.wepkg.a.b;
import com.tencent.mm.plugin.webview.wepkg.a.c;
import com.tencent.mm.protocal.GeneralControlWrapper;
import com.tencent.mm.protocal.c.agw;
import com.tencent.mm.protocal.c.aob;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.af;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.base.n;
import com.tencent.mm.ui.p;
import com.tencent.mm.ui.widget.MMWebView;
import com.tencent.xweb.WebView;
import com.tencent.xweb.j;
import com.tencent.xweb.k;
import com.tencent.xweb.m;
import java.net.URI;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

public class GameWebViewUI
  extends GameBaseWebViewUI
{
  private static String rQK;
  private Map<Integer, aob> lKA;
  private boolean lMy;
  private int rQI;
  private boolean rQJ;
  private HashMap<String, String> rQL;
  private Drawable rQM;
  private Drawable rQN;
  private String rQO;
  private String rQP;
  private GameMenuImageButton rQQ;
  private boolean rQR;
  private com.tencent.mm.plugin.webview.wepkg.a rQx;
  
  static
  {
    GMTrace.i(12338098864128L, 91926);
    rQK = "wx_fullscreen";
    GMTrace.o(12338098864128L, 91926);
  }
  
  public GameWebViewUI()
  {
    GMTrace.i(12332327501824L, 91883);
    this.lMy = false;
    this.rQJ = false;
    this.rQL = new HashMap();
    this.rQO = null;
    this.lKA = new HashMap();
    GMTrace.o(12332327501824L, 91883);
  }
  
  private void a(URI paramURI)
  {
    GMTrace.i(12333401243648L, 91891);
    paramURI = bg.nl(paramURI.getQuery()).split("&");
    if ((paramURI == null) || (paramURI.length == 0))
    {
      GMTrace.o(12333401243648L, 91891);
      return;
    }
    int j = paramURI.length;
    int i = 0;
    while (i < j)
    {
      String[] arrayOfString = paramURI[i].split("=");
      if ((arrayOfString != null) && (arrayOfString.length == 2)) {
        this.rQL.put(arrayOfString[0], arrayOfString[1]);
      }
      i += 1;
    }
    GMTrace.o(12333401243648L, 91891);
  }
  
  private n aEH()
  {
    GMTrace.i(18067719454720L, 134615);
    for (;;)
    {
      Object localObject3;
      try
      {
        localObject3 = com.tencent.mm.plugin.webview.ui.tools.game.menu.a.rQV;
        Object localObject1 = new Bundle();
        ((Bundle)localObject1).putString("game_hv_menu_appid", this.rQP);
        if (this.ioh == null) {
          break label233;
        }
        localObject1 = this.ioh.d(92, (Bundle)localObject1);
        if (localObject1 == null) {
          break label228;
        }
        localObject1 = ((Bundle)localObject1).getString("game_hv_menu_pbcache");
        if (bg.nm((String)localObject1)) {
          break label228;
        }
        localObject1 = ((String)localObject1).getBytes("ISO-8859-1");
        Object localObject4 = new agw();
        ((agw)localObject4).aD((byte[])localObject1);
        if (bg.cc(((agw)localObject4).uwi)) {
          break label228;
        }
        localObject1 = ((agw)localObject4).uwi;
        w.i("MicroMsg.Wepkg.GameWebViewUI", "use net menu data");
        this.lKA.clear();
        localObject3 = ((List)localObject1).iterator();
        if (((Iterator)localObject3).hasNext())
        {
          localObject4 = (aob)((Iterator)localObject3).next();
          this.lKA.put(Integer.valueOf(((aob)localObject4).uDY), localObject4);
          continue;
        }
        localObject2 = c.bFj().f(localException, Ok());
      }
      catch (Exception localException)
      {
        w.e("MicroMsg.Wepkg.GameWebViewUI", "get cache hv game menu fail! exception:%s", new Object[] { localException.getMessage() });
        GMTrace.o(18067719454720L, 134615);
        return null;
      }
      GMTrace.o(18067719454720L, 134615);
      return (n)localObject2;
      label228:
      Object localObject2 = localObject3;
      continue;
      label233:
      localObject2 = null;
    }
  }
  
  private void yh(int paramInt)
  {
    GMTrace.i(12333938114560L, 91895);
    if (paramInt < 10)
    {
      AX(8);
      if (paramInt >= 255) {
        break label66;
      }
    }
    label66:
    for (this.rQJ = true;; this.rQJ = false)
    {
      if (this.rQM != null) {
        this.rQM.setAlpha(paramInt);
      }
      GMTrace.o(12333938114560L, 91895);
      return;
      AX(0);
      break;
    }
  }
  
  public void MP()
  {
    GMTrace.i(12332864372736L, 91887);
    super.MP();
    this.rQM = new ColorDrawable(android.support.v4.content.a.c(this, R.e.aMD));
    this.rQN = new ColorDrawable(android.support.v4.content.a.c(this, R.e.aMD));
    GMTrace.o(12332864372736L, 91887);
  }
  
  protected final boolean Mg(String paramString)
  {
    GMTrace.i(12332998590464L, 91888);
    boolean bool = this.rQx.rWJ;
    GMTrace.o(12332998590464L, 91888);
    return bool;
  }
  
  protected final void W(Bundle paramBundle)
  {
    GMTrace.i(18068390543360L, 134620);
    super.W(paramBundle);
    GMTrace.o(18068390543360L, 134620);
  }
  
  public final void a(int paramInt1, int paramInt2, MenuItem.OnMenuItemClickListener paramOnMenuItemClickListener)
  {
    GMTrace.i(19384261148672L, 144424);
    if (this.rQR) {
      super.a(paramInt1, paramInt2, paramOnMenuItemClickListener);
    }
    GMTrace.o(19384261148672L, 144424);
  }
  
  protected final void a(ViewGroup paramViewGroup, WindowInsets paramWindowInsets)
  {
    GMTrace.i(19384395366400L, 144425);
    super.a(paramViewGroup, paramWindowInsets);
    if ((this.lMy) && (this.nXD.isX5Kernel)) {
      bDZ();
    }
    GMTrace.o(19384395366400L, 144425);
  }
  
  protected final void aEG()
  {
    GMTrace.i(18067853672448L, 134616);
    if ((this.rQQ == null) || (!this.rQQ.rQW))
    {
      super.aEG();
      GMTrace.o(18067853672448L, 134616);
      return;
    }
    final com.tencent.mm.plugin.webview.ui.tools.game.menu.d locald = new com.tencent.mm.plugin.webview.ui.tools.game.menu.d(this.vKB.vKW);
    locald.a(new b.c()
    {
      public final void g(MenuItem paramAnonymousMenuItem)
      {
        GMTrace.i(18089462726656L, 134777);
        paramAnonymousMenuItem = (aob)GameWebViewUI.b(GameWebViewUI.this).get(Integer.valueOf(paramAnonymousMenuItem.getItemId()));
        if (paramAnonymousMenuItem == null)
        {
          GMTrace.o(18089462726656L, 134777);
          return;
        }
        switch (GameWebViewUI.8.lKD[com.tencent.mm.plugin.webview.ui.tools.game.menu.c.a.yj(paramAnonymousMenuItem.und).ordinal()])
        {
        }
        for (;;)
        {
          GMTrace.o(18089462726656L, 134777);
          return;
          Object localObject = new Intent();
          ((Intent)localObject).putExtra("rawUrl", paramAnonymousMenuItem.une);
          com.tencent.mm.bj.d.b(GameWebViewUI.this.vKB.vKW, "webview", ".ui.tools.game.GameWebViewUI", (Intent)localObject);
          GMTrace.o(18089462726656L, 134777);
          return;
          paramAnonymousMenuItem = GameWebViewUI.d(GameWebViewUI.this).bCC();
          paramAnonymousMenuItem.rFe = new Object[] { GameWebViewUI.this.eVw, Integer.valueOf(32), Integer.valueOf(1) };
          paramAnonymousMenuItem.b(GameWebViewUI.c(GameWebViewUI.this));
          if (!GameWebViewUI.e(GameWebViewUI.this))
          {
            GameWebViewUI.this.finish();
            GMTrace.o(18089462726656L, 134777);
            return;
            paramAnonymousMenuItem = GameWebViewUI.this.getIntent().getStringExtra("KPublisherId");
            localObject = GameWebViewUI.this.getIntent().getStringExtra("KAppId");
            String str = GameWebViewUI.this.getIntent().getStringExtra("srcUsername");
            aj.c localc = GameWebViewUI.g(GameWebViewUI.this).bCC();
            localc.rFe = new Object[] { GameWebViewUI.this.eVw, Integer.valueOf(1), Integer.valueOf(1), paramAnonymousMenuItem, localObject, str };
            localc.b(GameWebViewUI.f(GameWebViewUI.this));
            GameWebViewUI.a(GameWebViewUI.this, GameWebViewUI.h(GameWebViewUI.this).bDN().bOf());
            GameWebViewUI.i(GameWebViewUI.this);
            GMTrace.o(18089462726656L, 134777);
            return;
            paramAnonymousMenuItem = GameWebViewUI.k(GameWebViewUI.this).bCC();
            paramAnonymousMenuItem.rFe = new Object[] { GameWebViewUI.this.eVw, Integer.valueOf(3), Integer.valueOf(1) };
            paramAnonymousMenuItem.b(GameWebViewUI.j(GameWebViewUI.this));
            g.ork.a(157L, 6L, 1L, false);
            GameWebViewUI.b(GameWebViewUI.this, GameWebViewUI.l(GameWebViewUI.this).bDN().bOf());
            GameWebViewUI.m(GameWebViewUI.this);
            GMTrace.o(18089462726656L, 134777);
            return;
            paramAnonymousMenuItem = GameWebViewUI.o(GameWebViewUI.this).bCC();
            paramAnonymousMenuItem.rFe = new Object[] { GameWebViewUI.this.eVw, Integer.valueOf(29), Integer.valueOf(1) };
            paramAnonymousMenuItem.b(GameWebViewUI.n(GameWebViewUI.this));
            GameWebViewUI.p(GameWebViewUI.this);
            GMTrace.o(18089462726656L, 134777);
            return;
            paramAnonymousMenuItem = GameWebViewUI.r(GameWebViewUI.this).bCC();
            paramAnonymousMenuItem.rFe = new Object[] { GameWebViewUI.this.eVw, Integer.valueOf(30), Integer.valueOf(1) };
            paramAnonymousMenuItem.b(GameWebViewUI.q(GameWebViewUI.this));
            GameWebViewUI.s(GameWebViewUI.this);
            GMTrace.o(18089462726656L, 134777);
            return;
            paramAnonymousMenuItem = GameWebViewUI.u(GameWebViewUI.this).bCC();
            paramAnonymousMenuItem.rFe = new Object[] { GameWebViewUI.this.eVw, Integer.valueOf(10), Integer.valueOf(1) };
            paramAnonymousMenuItem.b(GameWebViewUI.t(GameWebViewUI.this));
            if (GameWebViewUI.v(GameWebViewUI.this) != null)
            {
              GameWebViewUI.w(GameWebViewUI.this).reload();
              GMTrace.o(18089462726656L, 134777);
              return;
              paramAnonymousMenuItem = GameWebViewUI.y(GameWebViewUI.this).bCC();
              paramAnonymousMenuItem.rFe = new Object[] { GameWebViewUI.this.eVw, Integer.valueOf(31), Integer.valueOf(1) };
              paramAnonymousMenuItem.b(GameWebViewUI.x(GameWebViewUI.this));
              GameWebViewUI.z(GameWebViewUI.this);
              GMTrace.o(18089462726656L, 134777);
              return;
              paramAnonymousMenuItem = GameWebViewUI.B(GameWebViewUI.this).bCC();
              paramAnonymousMenuItem.rFe = new Object[] { GameWebViewUI.this.eVw, Integer.valueOf(11), Integer.valueOf(1) };
              paramAnonymousMenuItem.b(GameWebViewUI.A(GameWebViewUI.this));
              GameWebViewUI.C(GameWebViewUI.this);
              GMTrace.o(18089462726656L, 134777);
              return;
              if (GameWebViewUI.D(GameWebViewUI.this) != null)
              {
                localObject = GameWebViewUI.E(GameWebViewUI.this);
                int i = paramAnonymousMenuItem.uDY;
                w.i("MicroMsg.JsApiHandler", "onCustomGameMenuClicked");
                paramAnonymousMenuItem = new HashMap();
                paramAnonymousMenuItem.put("itemId", Integer.valueOf(i));
                af.t(new d.48((com.tencent.mm.plugin.webview.ui.tools.jsapi.d)localObject, i.a.a("onCustomGameMenuClicked", paramAnonymousMenuItem, ((com.tencent.mm.plugin.webview.ui.tools.jsapi.d)localObject).rSc, ((com.tencent.mm.plugin.webview.ui.tools.jsapi.d)localObject).rSd)));
              }
            }
          }
        }
      }
    });
    locald.rRp = new b.b()
    {
      public final void a(n paramAnonymousn)
      {
        GMTrace.i(18067182583808L, 134611);
        g.ork.a(480L, 0L, 1L, false);
        n localn = GameWebViewUI.F(GameWebViewUI.this);
        if (localn != null) {
          paramAnonymousn.wdA.addAll(localn.wdA);
        }
        GMTrace.o(18067182583808L, 134611);
      }
    };
    if (this.rKE) {
      locald.rRu = true;
    }
    for (locald.rRv = true; (this.rKH != null) && (this.rKH.isShown()); locald.rRv = false)
    {
      this.rKH.hide();
      af.i(new Runnable()
      {
        public final void run()
        {
          GMTrace.i(18067451019264L, 134613);
          if ((GameWebViewUI.this.isFinishing()) || (GameWebViewUI.G(GameWebViewUI.this)))
          {
            w.i("MicroMsg.Wepkg.GameWebViewUI", "tryShow bottom sheet failed, the activity has been destroyed.");
            GMTrace.o(18067451019264L, 134613);
            return;
          }
          locald.bFk();
          GMTrace.o(18067451019264L, 134613);
        }
      }, 100L);
      GMTrace.o(18067853672448L, 134616);
      return;
      locald.rRu = false;
    }
    aLo();
    af.i(new Runnable()
    {
      public final void run()
      {
        GMTrace.i(18087315243008L, 134761);
        if ((GameWebViewUI.this.isFinishing()) || (GameWebViewUI.H(GameWebViewUI.this)))
        {
          w.i("MicroMsg.Wepkg.GameWebViewUI", "tryShow bottom sheet failed, the activity has been destroyed.");
          GMTrace.o(18087315243008L, 134761);
          return;
        }
        locald.bFk();
        GMTrace.o(18087315243008L, 134761);
      }
    }, 100L);
    GMTrace.o(18067853672448L, 134616);
  }
  
  protected final void aEa()
  {
    GMTrace.i(15164858433536L, 112987);
    if (Build.VERSION.SDK_INT > 10)
    {
      if (this.screenOrientation == -1)
      {
        this.vKA = getSharedPreferences(ab.bPU(), 4).getBoolean("settings_landscape_mode", false);
        if (this.vKA)
        {
          setRequestedOrientation(2);
          GMTrace.o(15164858433536L, 112987);
          return;
        }
        setRequestedOrientation(1);
        GMTrace.o(15164858433536L, 112987);
        return;
      }
      setRequestedOrientation(this.screenOrientation);
      GMTrace.o(15164858433536L, 112987);
      return;
    }
    super.aEa();
    GMTrace.o(15164858433536L, 112987);
  }
  
  protected final void aaO()
  {
    GMTrace.i(18068524761088L, 134621);
    super.aaO();
    this.rQR = true;
    for (;;)
    {
      try
      {
        localObject = this.ioh.d(141, null);
        ((Bundle)localObject).setClassLoader(GameSettingParams.class.getClassLoader());
        localObject = (GameSettingParams)((Bundle)localObject).getParcelable("game_setting_params");
        if ((this.lMy) || (this.lUJ != null)) {
          break label326;
        }
        if (this.lUI == 0) {
          continue;
        }
      }
      catch (Exception localException)
      {
        Object localObject;
        boolean bool;
        w.e("MicroMsg.Wepkg.GameWebViewUI", localException.getMessage());
        continue;
        try
        {
          Bundle localBundle = new Bundle();
          localBundle.putInt("game_sourceScene", i);
          if (this.ioh != null) {
            this.ioh.d(91, localBundle);
          }
          GMTrace.o(18068524761088L, 134621);
          return;
        }
        catch (RemoteException localRemoteException) {}
        GMTrace.o(18068524761088L, 134621);
        return;
      }
      if (i != 0)
      {
        bool = bg.nm(((GameSettingParams)localObject).eKs);
        if (bool) {}
      }
      try
      {
        this.lUI = Color.parseColor(((GameSettingParams)localObject).eKs);
        this.lUJ = ((GameSettingParams)localObject).eKt;
        bDY();
        jy(true);
        localObject = getIntent();
        if ((localObject != null) && (((Intent)localObject).getBooleanExtra("game_check_float", false)))
        {
          i = ((Intent)localObject).getIntExtra("game_sourceScene", 0);
          this.rQO = ((Intent)localObject).getStringExtra("game_transparent_float_url");
          if (bg.nm(this.rQO))
          {
            localObject = new Intent();
            ((Intent)localObject).putExtra("game_check_float", true);
            ((Intent)localObject).putExtra("game_sourceScene", i);
            com.tencent.mm.bj.d.b(this, "game", ".ui.GameCenterUI", (Intent)localObject);
            GMTrace.o(18068524761088L, 134621);
            return;
            i = 1;
          }
        }
      }
      catch (IllegalArgumentException localIllegalArgumentException)
      {
        w.e("MicroMsg.Wepkg.GameWebViewUI", "parse color: " + localIllegalArgumentException.getMessage());
        continue;
      }
      label326:
      int i = 0;
    }
  }
  
  protected final boolean bDT()
  {
    GMTrace.i(12333535461376L, 91892);
    GMTrace.o(12333535461376L, 91892);
    return true;
  }
  
  protected boolean bDW()
  {
    GMTrace.i(12333669679104L, 91893);
    GMTrace.o(12333669679104L, 91893);
    return true;
  }
  
  protected final void bDZ()
  {
    GMTrace.i(12333803896832L, 91894);
    this.rQJ = true;
    this.rMf = true;
    Object localObject = cN().cO();
    if (localObject != null)
    {
      ((ActionBar)localObject).setBackgroundDrawable(this.rQM);
      this.rQM.setAlpha(0);
      if (((ActionBar)localObject).getCustomView() != null)
      {
        ((ActionBar)localObject).getCustomView().setBackground(this.rQN);
        this.rQN.setAlpha(0);
        ((ActionBar)localObject).getCustomView().invalidate();
      }
    }
    setStatusBarColor(0);
    if (this.lUG != null)
    {
      localObject = (ViewGroup.MarginLayoutParams)this.lUG.getLayoutParams();
      ((ViewGroup.MarginLayoutParams)localObject).topMargin = this.iDc;
      this.lUG.setLayoutParams((ViewGroup.LayoutParams)localObject);
    }
    AX(8);
    GMTrace.o(12333803896832L, 91894);
  }
  
  protected final int bEc()
  {
    GMTrace.i(18068256325632L, 134619);
    int i = super.bEc();
    GMTrace.o(18068256325632L, 134619);
    return i;
  }
  
  protected final void bEd()
  {
    GMTrace.i(15642002456576L, 116542);
    super.bEd();
    this.rQP = getIntent().getStringExtra("game_hv_menu_appid");
    if ((this.rKD) && (!bg.nm(this.rQP)))
    {
      if (this.rKC != null) {
        this.rKC.setVisibility(8);
      }
      this.rQQ.a(this.rKA, new GameMenuImageButton.a()
      {
        public final void aEF()
        {
          GMTrace.i(18092147081216L, 134797);
          GameWebViewUI.this.aEG();
          GMTrace.o(18092147081216L, 134797);
        }
      });
    }
    GMTrace.o(15642002456576L, 116542);
  }
  
  protected final void bEn()
  {
    GMTrace.i(18067987890176L, 134617);
    if (!bg.nm(this.rQO))
    {
      a locala = this.rQm;
      String str = this.rQO;
      locala.rQx.onCreate(str);
      if ((locala.inX != null) && (locala.inX.getParent() == null))
      {
        ViewGroup.LayoutParams localLayoutParams = new ViewGroup.LayoutParams(-1, -1);
        locala.Ep.addView(locala.inX, localLayoutParams);
      }
      if ((locala.inX != null) && (locala.rQy != null)) {
        locala.inX.post(new a.2(locala, str));
      }
      this.rQO = null;
    }
    GMTrace.o(18067987890176L, 134617);
  }
  
  protected final void cl(String paramString, int paramInt)
  {
    GMTrace.i(18068122107904L, 134618);
    super.cl(paramString, paramInt);
    GMTrace.o(18068122107904L, 134618);
  }
  
  protected final void jy(boolean paramBoolean)
  {
    GMTrace.i(19384126930944L, 144423);
    super.jy(paramBoolean);
    jB(false);
    GMTrace.o(19384126930944L, 144423);
  }
  
  public void onCreate(Bundle paramBundle)
  {
    GMTrace.i(12332461719552L, 91884);
    super.onCreate(paramBundle);
    w.i("MicroMsg.Wepkg.GameWebViewUI", "GameWebViewUI oncreate");
    w.i("MicroMsg.Wepkg.GameWebViewUI", "rawUrl rid:%s, pkgId:%s", new Object[] { com.tencent.mm.plugin.webview.wepkg.utils.d.Nh(this.eVw), com.tencent.mm.plugin.webview.wepkg.utils.d.Nf(this.eVw) });
    paramBundle = getIntent();
    if (paramBundle != null)
    {
      com.tencent.mm.plugin.webview.wepkg.utils.b.rZp = paramBundle.getBooleanExtra("disable_wepkg", false);
      if (paramBundle.getBooleanExtra("disable_progress_bar", false))
      {
        this.rKv.wbD = false;
        if (this.rKw != null) {
          this.rKw.setVisibility(0);
        }
      }
    }
    this.rMd = new m()
    {
      public final boolean A(MotionEvent paramAnonymousMotionEvent)
      {
        GMTrace.i(18090536468480L, 134785);
        if (GameWebViewUI.aa(GameWebViewUI.this) == null)
        {
          GMTrace.o(18090536468480L, 134785);
          return false;
        }
        boolean bool = GameWebViewUI.ab(GameWebViewUI.this).M(paramAnonymousMotionEvent);
        GMTrace.o(18090536468480L, 134785);
        return bool;
      }
      
      public final void XY()
      {
        GMTrace.i(18089999597568L, 134781);
        if (GameWebViewUI.O(GameWebViewUI.this) == null)
        {
          GMTrace.o(18089999597568L, 134781);
          return;
        }
        GameWebViewUI.P(GameWebViewUI.this).cjn();
        GMTrace.o(18089999597568L, 134781);
      }
      
      public final boolean a(int paramAnonymousInt1, int paramAnonymousInt2, int paramAnonymousInt3, int paramAnonymousInt4, int paramAnonymousInt5, int paramAnonymousInt6, int paramAnonymousInt7, int paramAnonymousInt8, boolean paramAnonymousBoolean)
      {
        GMTrace.i(18089865379840L, 134780);
        if (GameWebViewUI.M(GameWebViewUI.this) == null)
        {
          GMTrace.o(18089865379840L, 134780);
          return false;
        }
        paramAnonymousBoolean = GameWebViewUI.N(GameWebViewUI.this).b(paramAnonymousInt1, paramAnonymousInt2, paramAnonymousInt3, paramAnonymousInt4, paramAnonymousInt5, paramAnonymousInt6, paramAnonymousInt7, paramAnonymousInt8, paramAnonymousBoolean);
        GMTrace.o(18089865379840L, 134780);
        return paramAnonymousBoolean;
      }
      
      @TargetApi(9)
      public final void b(int paramAnonymousInt1, int paramAnonymousInt2, boolean paramAnonymousBoolean1, boolean paramAnonymousBoolean2)
      {
        GMTrace.i(18090133815296L, 134782);
        if (GameWebViewUI.Q(GameWebViewUI.this) == null)
        {
          GMTrace.o(18090133815296L, 134782);
          return;
        }
        GameWebViewUI.R(GameWebViewUI.this).c(paramAnonymousInt1, paramAnonymousInt2, paramAnonymousBoolean1, paramAnonymousBoolean2);
        GMTrace.o(18090133815296L, 134782);
      }
      
      public final void onScrollChanged(int paramAnonymousInt1, int paramAnonymousInt2, int paramAnonymousInt3, int paramAnonymousInt4, View paramAnonymousView)
      {
        GMTrace.i(18090268033024L, 134783);
        if (GameWebViewUI.S(GameWebViewUI.this) == null)
        {
          GMTrace.o(18090268033024L, 134783);
          return;
        }
        GameWebViewUI.T(GameWebViewUI.this).w(paramAnonymousInt1, paramAnonymousInt2, paramAnonymousInt3, paramAnonymousInt4);
        if (GameWebViewUI.U(GameWebViewUI.this)) {
          if (paramAnonymousInt2 >= GameWebViewUI.V(GameWebViewUI.this))
          {
            if (GameWebViewUI.W(GameWebViewUI.this))
            {
              GameWebViewUI.X(GameWebViewUI.this);
              GMTrace.o(18090268033024L, 134783);
            }
          }
          else if (paramAnonymousInt2 < GameWebViewUI.V(GameWebViewUI.this))
          {
            paramAnonymousInt1 = (int)(paramAnonymousInt2 / GameWebViewUI.V(GameWebViewUI.this) * 255.0F);
            GameWebViewUI.a(GameWebViewUI.this, paramAnonymousInt1);
          }
        }
        GMTrace.o(18090268033024L, 134783);
      }
      
      public final boolean y(MotionEvent paramAnonymousMotionEvent)
      {
        GMTrace.i(18089731162112L, 134779);
        if (GameWebViewUI.K(GameWebViewUI.this) == null)
        {
          GMTrace.o(18089731162112L, 134779);
          return false;
        }
        boolean bool = GameWebViewUI.L(GameWebViewUI.this).K(paramAnonymousMotionEvent);
        GMTrace.o(18089731162112L, 134779);
        return bool;
      }
      
      public final boolean z(MotionEvent paramAnonymousMotionEvent)
      {
        GMTrace.i(18090402250752L, 134784);
        if (GameWebViewUI.Y(GameWebViewUI.this) == null)
        {
          GMTrace.o(18090402250752L, 134784);
          return false;
        }
        boolean bool = GameWebViewUI.Z(GameWebViewUI.this).L(paramAnonymousMotionEvent);
        GMTrace.o(18090402250752L, 134784);
        return bool;
      }
    };
    if (!bg.nm(this.eVw)) {}
    try
    {
      a(new URI(this.eVw));
      this.rQI = bDU();
      if ((this.rQL.containsKey(rQK)) && (((String)this.rQL.get(rQK)).equals("1"))) {
        this.lMy = true;
      }
      this.nXD.setWebViewClient(new b());
      if (this.nXD.isX5Kernel) {
        this.nXD.setWebViewClientExtension(new a());
      }
      this.rQx = new com.tencent.mm.plugin.webview.wepkg.a(this, this.nXD);
      this.rQx.rWO = new a.a()
      {
        public final boolean aEE()
        {
          GMTrace.i(18067585236992L, 134614);
          boolean bool = GameWebViewUI.a(GameWebViewUI.this);
          GMTrace.o(18067585236992L, 134614);
          return bool;
        }
      };
      this.rQx.onCreate(this.eVw);
      this.rQm = new a(this, this.rKB);
      this.rQQ = new GameMenuImageButton(this.vKB.vKW);
      GMTrace.o(12332461719552L, 91884);
      return;
    }
    catch (Exception paramBundle)
    {
      for (;;)
      {
        w.e("MicroMsg.Wepkg.GameWebViewUI", "parseUrl error, %s,  rawUrl = %s", new Object[] { paramBundle.getMessage(), this.eVw });
      }
    }
  }
  
  protected void onDestroy()
  {
    GMTrace.i(12332730155008L, 91886);
    super.onDestroy();
    this.rQx.onDestroy();
    GMTrace.o(12332730155008L, 91886);
  }
  
  public void onResume()
  {
    GMTrace.i(12332595937280L, 91885);
    super.onResume();
    GMTrace.o(12332595937280L, 91885);
  }
  
  protected final void zz(String paramString)
  {
    GMTrace.i(12333132808192L, 91889);
    if (this.rQx.bGb())
    {
      this.nXD.loadUrl(paramString);
      GMTrace.o(12333132808192L, 91889);
      return;
    }
    super.zz(paramString);
    GMTrace.o(12333132808192L, 91889);
  }
  
  private final class a
    extends WebViewUI.h
  {
    public a()
    {
      super();
      GMTrace.i(15163382038528L, 112976);
      GMTrace.o(15163382038528L, 112976);
    }
    
    public final Object onMiscCallBack(String paramString, Bundle paramBundle)
    {
      GMTrace.i(15163516256256L, 112977);
      Object localObject = GameWebViewUI.I(GameWebViewUI.this).rWR.onMiscCallBack(paramString, paramBundle);
      if (localObject != null)
      {
        GMTrace.o(15163516256256L, 112977);
        return localObject;
      }
      paramString = super.onMiscCallBack(paramString, paramBundle);
      GMTrace.o(15163516256256L, 112977);
      return paramString;
    }
  }
  
  private final class b
    extends GameBaseWebViewUI.a
  {
    public b()
    {
      super();
      GMTrace.i(12330448453632L, 91869);
      GMTrace.o(12330448453632L, 91869);
    }
    
    public final k a(WebView paramWebView, j paramj)
    {
      GMTrace.i(19389898293248L, 144466);
      k localk = GameWebViewUI.I(GameWebViewUI.this).rWQ.a(paramWebView, paramj);
      if (localk != null)
      {
        GMTrace.o(19389898293248L, 144466);
        return localk;
      }
      paramWebView = super.a(paramWebView, paramj);
      GMTrace.o(19389898293248L, 144466);
      return paramWebView;
    }
    
    public final k a(WebView paramWebView, j paramj, Bundle paramBundle)
    {
      GMTrace.i(19390032510976L, 144467);
      k localk = GameWebViewUI.I(GameWebViewUI.this).rWQ.a(paramWebView, paramj, paramBundle);
      if (localk != null)
      {
        GMTrace.o(19390032510976L, 144467);
        return localk;
      }
      paramWebView = super.a(paramWebView, paramj, paramBundle);
      GMTrace.o(19390032510976L, 144467);
      return paramWebView;
    }
    
    public final void a(WebView paramWebView, int paramInt, String paramString1, String paramString2)
    {
      GMTrace.i(19389629857792L, 144464);
      GameWebViewUI.J(GameWebViewUI.this);
      super.a(paramWebView, paramInt, paramString1, paramString2);
      GMTrace.o(19389629857792L, 144464);
    }
    
    public final void a(WebView paramWebView, String paramString)
    {
      GMTrace.i(19389495640064L, 144463);
      GameWebViewUI.J(GameWebViewUI.this);
      GameWebViewUI.I(GameWebViewUI.this).rWQ.a(paramWebView, paramString);
      super.a(paramWebView, paramString);
      GMTrace.o(19389495640064L, 144463);
    }
    
    public final void b(WebView paramWebView, String paramString, Bitmap paramBitmap)
    {
      GMTrace.i(19389361422336L, 144462);
      GameWebViewUI.I(GameWebViewUI.this).rWQ.b(paramWebView, paramString, paramBitmap);
      super.b(paramWebView, paramString, paramBitmap);
      GMTrace.o(19389361422336L, 144462);
    }
    
    public final k e(WebView paramWebView, String paramString)
    {
      GMTrace.i(19389764075520L, 144465);
      k localk = GameWebViewUI.I(GameWebViewUI.this).rWQ.e(paramWebView, paramString);
      if (localk != null)
      {
        GMTrace.o(19389764075520L, 144465);
        return localk;
      }
      paramWebView = super.e(paramWebView, paramString);
      GMTrace.o(19389764075520L, 144465);
      return paramWebView;
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\plugin\webview\ui\tools\game\GameWebViewUI.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */