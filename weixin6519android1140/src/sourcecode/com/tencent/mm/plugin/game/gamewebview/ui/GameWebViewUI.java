package com.tencent.mm.plugin.game.gamewebview.ui;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.os.Handler;
import android.view.KeyEvent;
import android.view.View;
import android.view.Window;
import android.widget.FrameLayout;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.R.h;
import com.tencent.mm.plugin.game.gamewebview.ipc.CommonLogicTask;
import com.tencent.mm.plugin.game.gamewebview.ipc.GameWebViewMainProcessService;
import com.tencent.mm.plugin.game.gamewebview.model.a;
import com.tencent.mm.plugin.game.model.GameFloatLayerInfo;
import com.tencent.mm.plugin.game.model.GameWebViewLaunchParams;
import com.tencent.mm.plugin.webview.ui.tools.game.GameSettingParams;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.MMFragmentActivity;
import com.tencent.mm.ui.p;

public class GameWebViewUI
  extends MMActivity
{
  protected c lIW;
  protected int lKU;
  private boolean lKV;
  private boolean lKW;
  GameSettingParams lKX;
  
  public GameWebViewUI()
  {
    GMTrace.i(17002701783040L, 126680);
    this.lKU = -1;
    GMTrace.o(17002701783040L, 126680);
  }
  
  private boolean aEX()
  {
    GMTrace.i(19288698126336L, 143712);
    boolean bool = getIntent().getBooleanExtra("from_shortcut", false);
    GMTrace.o(19288698126336L, 143712);
    return bool;
  }
  
  private void d(final Intent paramIntent, boolean paramBoolean)
  {
    GMTrace.i(17990007390208L, 134036);
    w.d("MicroMsg.GameWebViewUI", "loadIntent: " + System.currentTimeMillis());
    setIntent(paramIntent);
    this.lIW.c(paramIntent, paramBoolean);
    this.lKU = paramIntent.getIntExtra("screen_orientation", -1);
    paramIntent.setExtrasClassLoader(GameWebViewLaunchParams.class.getClassLoader());
    paramIntent = (GameWebViewLaunchParams)paramIntent.getParcelableExtra("launchParams");
    if (paramIntent != null)
    {
      paramIntent = paramIntent.lOx;
      if (paramIntent != null) {
        new Handler().postDelayed(new Runnable()
        {
          public final void run()
          {
            GMTrace.i(19291382480896L, 143732);
            Intent localIntent = new Intent();
            localIntent.putExtra("rawUrl", paramIntent.url);
            localIntent.putExtra("show_full_screen", paramIntent.lMy);
            localIntent.putExtra("screen_orientation", paramIntent.orientation);
            localIntent.putExtra("transparent_page", true);
            localIntent.putExtra("needAnimation", false);
            GameWebViewUI.a(GameWebViewUI.this, localIntent);
            GMTrace.o(19291382480896L, 143732);
          }
        }, 200L);
      }
    }
    if (aEX())
    {
      com.tencent.mm.plugin.game.gamewebview.a.d.bU(this.vKB.vKW);
      GMTrace.o(17990007390208L, 134036);
      return;
    }
    com.tencent.mm.plugin.game.gamewebview.a.d.bW(this.vKB.vKW);
    GMTrace.o(17990007390208L, 134036);
  }
  
  public final void J(final Intent paramIntent)
  {
    GMTrace.i(19288429690880L, 143710);
    runOnUiThread(new Runnable()
    {
      public final void run()
      {
        GMTrace.i(17009815322624L, 126733);
        GameWebViewUI.a(GameWebViewUI.this, paramIntent);
        GMTrace.o(17009815322624L, 126733);
      }
    });
    GMTrace.o(19288429690880L, 143710);
  }
  
  protected void MP()
  {
    GMTrace.i(17004178178048L, 126691);
    FrameLayout localFrameLayout = new FrameLayout(this);
    localFrameLayout.setBackgroundResource(17170443);
    localFrameLayout.setId(R.h.bCF);
    setContentView(localFrameLayout);
    this.lIW = new c(this);
    this.lIW.setBackgroundResource(17170443);
    this.lIW.setId(R.h.bCP);
    localFrameLayout.addView(this.lIW);
    d(getIntent(), true);
    GMTrace.o(17004178178048L, 126691);
  }
  
  protected final void VC()
  {
    GMTrace.i(17003909742592L, 126689);
    super.VC();
    getWindow().requestFeature(10);
    getWindow().getDecorView().setFitsSystemWindows(true);
    aq(10);
    aq(1);
    GMTrace.o(17003909742592L, 126689);
  }
  
  protected final void aEa()
  {
    GMTrace.i(19288832344064L, 143713);
    if (this.lKU != -1)
    {
      setRequestedOrientation(this.lKU);
      GMTrace.o(19288832344064L, 143713);
      return;
    }
    this.vKA = getSharedPreferences(ab.bPU(), 4).getBoolean("settings_landscape_mode", false);
    if (this.vKA)
    {
      setRequestedOrientation(-1);
      GMTrace.o(19288832344064L, 143713);
      return;
    }
    setRequestedOrientation(1);
    GMTrace.o(19288832344064L, 143713);
  }
  
  public final boolean aaS()
  {
    GMTrace.i(17990275825664L, 134038);
    GMTrace.o(17990275825664L, 134038);
    return true;
  }
  
  protected final int getLayoutId()
  {
    GMTrace.i(17006191443968L, 126706);
    GMTrace.o(17006191443968L, 126706);
    return -1;
  }
  
  public final void oF(int paramInt)
  {
    GMTrace.i(19288563908608L, 143711);
    if (this.lKV)
    {
      GMTrace.o(19288563908608L, 143711);
      return;
    }
    if (this.vMl == null)
    {
      GMTrace.o(19288563908608L, 143711);
      return;
    }
    if ((aEX()) || (paramInt > 1))
    {
      this.lKW = false;
      this.vMl.mEnable = false;
      GMTrace.o(19288563908608L, 143711);
      return;
    }
    this.lKW = true;
    this.vMl.mEnable = true;
    GMTrace.o(19288563908608L, 143711);
  }
  
  public final void oG(int paramInt)
  {
    GMTrace.i(19288966561792L, 143714);
    this.lKU = paramInt;
    aEa();
    GMTrace.o(19288966561792L, 143714);
  }
  
  protected void onActivityResult(int paramInt1, int paramInt2, Intent paramIntent)
  {
    GMTrace.i(17003775524864L, 126688);
    super.onActivityResult(paramInt1, paramInt2, paramIntent);
    if (this.lIW != null)
    {
      Object localObject = (b)this.lIW.lJa.peek();
      if (localObject != null)
      {
        localObject = ((b)localObject).lHe;
        if ((((d)localObject).lJJ != null) && (((d)localObject).lJJ.a(((d)localObject).lJb, paramInt1, paramInt2, paramIntent))) {
          paramInt1 = 1;
        }
      }
      while (paramInt1 != 0)
      {
        GMTrace.o(17003775524864L, 126688);
        return;
        if (((d)localObject).lJm != null)
        {
          localObject = ((d)localObject).lJm;
          if (((e)localObject).lKw != null) {}
          for (boolean bool = ((e)localObject).lKw.onActivityResult(paramInt1, paramInt2, paramIntent);; bool = false)
          {
            if (!bool) {
              break label145;
            }
            paramInt1 = 1;
            break;
          }
        }
        label145:
        paramInt1 = 0;
        continue;
        paramInt1 = 0;
      }
    }
    GMTrace.o(17003775524864L, 126688);
  }
  
  public void onBackPressed()
  {
    GMTrace.i(17990141607936L, 134037);
    this.lIW.eS(true);
    GMTrace.o(17990141607936L, 134037);
  }
  
  public void onCreate(final Bundle paramBundle)
  {
    GMTrace.i(17002836000768L, 126681);
    super.onCreate(paramBundle);
    w.i("MicroMsg.GameWebViewUI", "onCreate");
    if (Build.VERSION.SDK_INT >= 11) {
      getWindow().setFlags(16777216, 16777216);
    }
    getWindow().setFormat(-3);
    paramBundle = new CommonLogicTask();
    paramBundle.type = 10;
    paramBundle.lGk = new Runnable()
    {
      public final void run()
      {
        GMTrace.i(17988665212928L, 134026);
        paramBundle.VN();
        paramBundle.ler.setClassLoader(GameSettingParams.class.getClassLoader());
        GameWebViewUI.a(GameWebViewUI.this, (GameSettingParams)paramBundle.ler.getParcelable("game_setting_params"));
        GameWebViewUI.a(GameWebViewUI.this);
        GMTrace.o(17988665212928L, 134026);
      }
    };
    paramBundle.VM();
    GameWebViewMainProcessService.a(paramBundle);
    this.lKV = getIntent().getBooleanExtra("disable_swipe_back", false);
    MP();
    GMTrace.o(17002836000768L, 126681);
  }
  
  public void onDestroy()
  {
    GMTrace.i(17003641307136L, 126687);
    super.onDestroy();
    w.i("MicroMsg.GameWebViewUI", "onDestroy");
    a.cleanup();
    this.lIW.cleanup();
    System.gc();
    GMTrace.o(17003641307136L, 126687);
  }
  
  public boolean onKeyDown(int paramInt, KeyEvent paramKeyEvent)
  {
    GMTrace.i(17005520355328L, 126701);
    if (this.lIW.onKeyDown(paramInt, paramKeyEvent))
    {
      GMTrace.o(17005520355328L, 126701);
      return true;
    }
    boolean bool = super.onKeyDown(paramInt, paramKeyEvent);
    GMTrace.o(17005520355328L, 126701);
    return bool;
  }
  
  public void onNewIntent(Intent paramIntent)
  {
    GMTrace.i(17003372871680L, 126685);
    w.i("MicroMsg.GameWebViewUI", "onNewIntent: " + System.currentTimeMillis());
    d(paramIntent, false);
    GMTrace.o(17003372871680L, 126685);
  }
  
  public void onPause()
  {
    GMTrace.i(17003507089408L, 126686);
    super.onPause();
    w.i("MicroMsg.GameWebViewUI", "onPause");
    b localb = (b)this.lIW.lJa.peek();
    if (localb != null) {
      localb.eR(true);
    }
    GMTrace.o(17003507089408L, 126686);
  }
  
  protected void onResume()
  {
    GMTrace.i(17003238653952L, 126684);
    super.onResume();
    w.i("MicroMsg.GameWebViewUI", "onResume");
    if (this.vMl != null) {
      if (!this.lKV) {
        break label79;
      }
    }
    label79:
    for (this.vMl.mEnable = false;; this.vMl.mEnable = this.lKW)
    {
      aEa();
      b localb = (b)this.lIW.lJa.peek();
      if (localb != null) {
        localb.Ze();
      }
      GMTrace.o(17003238653952L, 126684);
      return;
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\plugin\game\gamewebview\ui\GameWebViewUI.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */