package com.tencent.mm.ui.chatting.gallery;

import android.app.ProgressDialog;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.RecyclerView.a;
import android.support.v7.widget.RecyclerView.b;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.MenuItem;
import android.view.MenuItem.OnMenuItemClickListener;
import android.view.View;
import android.widget.TextView;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.R.h;
import com.tencent.mm.R.i;
import com.tencent.mm.R.l;
import com.tencent.mm.az.e;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.storage.q;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.base.r;
import com.tencent.mm.ui.chatting.c.b.a;
import com.tencent.mm.ui.chatting.c.b.b;
import com.tencent.mm.ui.chatting.d.d;
import com.tencent.mm.y.ae;
import com.tencent.mm.y.at;
import com.tencent.mm.y.c;
import java.util.List;

public class MediaHistoryListUI
  extends MMActivity
  implements b.b
{
  private RecyclerView Ub;
  private String iGc;
  private TextView jQZ;
  private ProgressDialog rxx;
  private b.a wKp;
  private com.tencent.mm.pluginsdk.ui.tools.p wOo;
  
  public MediaHistoryListUI()
  {
    GMTrace.i(14962726535168L, 111481);
    GMTrace.o(14962726535168L, 111481);
  }
  
  private void du(boolean paramBoolean)
  {
    GMTrace.i(14963800276992L, 111489);
    w.i("MicroMsg.MediaHistoryListUI", "[setProgress] isVisible:%s", new Object[] { Boolean.valueOf(paramBoolean) });
    if (paramBoolean)
    {
      this.rxx = r.b(this, getString(R.l.bKJ), true, 0, null);
      GMTrace.o(14963800276992L, 111489);
      return;
    }
    if ((this.rxx != null) && (this.rxx.isShowing()))
    {
      this.rxx.dismiss();
      this.rxx = null;
    }
    GMTrace.o(14963800276992L, 111489);
  }
  
  protected final void MP()
  {
    GMTrace.i(14962994970624L, 111483);
    this.wOo = new com.tencent.mm.pluginsdk.ui.tools.p();
    this.wOo.mD(false);
    this.wOo.a(this.wKp.cfb());
    this.wOo.tHZ = false;
    this.jQZ = ((TextView)findViewById(R.h.caE));
    this.Ub = ((RecyclerView)findViewById(R.h.bGh));
    findViewById(R.h.brS).setBackgroundColor(-1);
    this.Ub.setBackgroundColor(-1);
    this.Ub.a(this.wKp.fv(this));
    this.Ub.a(this.wKp.ceY());
    this.Ub.a(this.wKp.Wr(this.iGc));
    this.Ub.Tc = true;
    sq(this.wKp.Qb());
    a(new MenuItem.OnMenuItemClickListener()
    {
      public final boolean onMenuItemClick(MenuItem paramAnonymousMenuItem)
      {
        GMTrace.i(14962055446528L, 111476);
        MediaHistoryListUI.this.finish();
        GMTrace.o(14962055446528L, 111476);
        return true;
      }
    });
    GMTrace.o(14962994970624L, 111483);
  }
  
  public final void aoK()
  {
    GMTrace.i(16790906208256L, 125102);
    super.aoK();
    if (this.vKB.vLo == 2) {
      this.wOo.clearFocus();
    }
    GMTrace.o(16790906208256L, 125102);
  }
  
  public final void bf(String paramString, boolean paramBoolean)
  {
    GMTrace.i(16439389978624L, 122483);
    if (paramBoolean)
    {
      String str = getString(R.l.dha, new Object[] { paramString });
      this.jQZ.setVisibility(0);
      this.Ub.setVisibility(8);
      TextView localTextView = this.jQZ;
      this.jQZ.getContext();
      localTextView.setText(e.a(str, paramString));
      GMTrace.o(16439389978624L, 122483);
      return;
    }
    this.jQZ.setVisibility(8);
    this.Ub.setVisibility(0);
    GMTrace.o(16439389978624L, 122483);
  }
  
  public final void cfd()
  {
    GMTrace.i(14963531841536L, 111487);
    du(true);
    GMTrace.o(14963531841536L, 111487);
  }
  
  protected final int getLayoutId()
  {
    GMTrace.i(14963397623808L, 111486);
    int i = R.i.cBq;
    GMTrace.o(14963397623808L, 111486);
    return i;
  }
  
  public void onBackPressed()
  {
    GMTrace.i(14963129188352L, 111484);
    super.onBackPressed();
    finish();
    GMTrace.o(14963129188352L, 111484);
  }
  
  public void onCreate(Bundle paramBundle)
  {
    GMTrace.i(14962860752896L, 111482);
    super.onCreate(paramBundle);
    this.iGc = getIntent().getStringExtra("kintent_talker");
    int i = getIntent().getIntExtra("key_media_type", -1);
    paramBundle = null;
    switch (i)
    {
    }
    while (paramBundle == null)
    {
      w.e("MicroMsg.MediaHistoryListUI", "[onCreate] presenter is null!");
      GMTrace.o(14962860752896L, 111482);
      return;
      paramBundle = a.ah(this, 6);
      continue;
      paramBundle = a.ah(this, 5);
      continue;
      paramBundle = a.ah(this, 3);
    }
    paramBundle.a(this);
    MP();
    this.wKp.ceZ();
    boolean bool = this.iGc.contains("@");
    at.AR();
    paramBundle = c.yT().gD(this.iGc);
    if (bool)
    {
      if (this.wKp.getType() == 6)
      {
        com.tencent.mm.plugin.report.service.g.ork.i(14569, new Object[] { Integer.valueOf(0), Integer.valueOf(0), Integer.valueOf(0), Integer.valueOf(0), Integer.valueOf(1), Integer.valueOf(0), Integer.valueOf(0), Integer.valueOf(paramBundle.FT().size()), Integer.valueOf(1) });
        GMTrace.o(14962860752896L, 111482);
        return;
      }
      if (this.wKp.getType() == -1)
      {
        com.tencent.mm.plugin.report.service.g.ork.i(14569, new Object[] { Integer.valueOf(0), Integer.valueOf(0), Integer.valueOf(0), Integer.valueOf(0), Integer.valueOf(0), Integer.valueOf(1), Integer.valueOf(0), Integer.valueOf(paramBundle.FT().size()), Integer.valueOf(1) });
        GMTrace.o(14962860752896L, 111482);
        return;
      }
      if (this.wKp.getType() == 3)
      {
        com.tencent.mm.plugin.report.service.g.ork.i(14569, new Object[] { Integer.valueOf(0), Integer.valueOf(0), Integer.valueOf(0), Integer.valueOf(0), Integer.valueOf(0), Integer.valueOf(0), Integer.valueOf(1), Integer.valueOf(paramBundle.FT().size()), Integer.valueOf(1) });
        GMTrace.o(14962860752896L, 111482);
      }
    }
    else
    {
      if (this.wKp.getType() == 6)
      {
        com.tencent.mm.plugin.report.service.g.ork.i(14569, new Object[] { Integer.valueOf(0), Integer.valueOf(0), Integer.valueOf(0), Integer.valueOf(0), Integer.valueOf(1), Integer.valueOf(0), Integer.valueOf(0), Integer.valueOf(0), Integer.valueOf(0) });
        GMTrace.o(14962860752896L, 111482);
        return;
      }
      if (this.wKp.getType() == -1)
      {
        com.tencent.mm.plugin.report.service.g.ork.i(14569, new Object[] { Integer.valueOf(0), Integer.valueOf(0), Integer.valueOf(0), Integer.valueOf(0), Integer.valueOf(0), Integer.valueOf(1), Integer.valueOf(0), Integer.valueOf(0), Integer.valueOf(0) });
        GMTrace.o(14962860752896L, 111482);
        return;
      }
      if (this.wKp.getType() == 3) {
        com.tencent.mm.plugin.report.service.g.ork.i(14569, new Object[] { Integer.valueOf(0), Integer.valueOf(0), Integer.valueOf(0), Integer.valueOf(0), Integer.valueOf(0), Integer.valueOf(0), Integer.valueOf(1), Integer.valueOf(0), Integer.valueOf(0) });
      }
    }
    GMTrace.o(14962860752896L, 111482);
  }
  
  public boolean onCreateOptionsMenu(Menu paramMenu)
  {
    GMTrace.i(16438853107712L, 122479);
    this.wOo.a(this, paramMenu);
    paramMenu = this.wOo;
    String str = this.wKp.cfc();
    if ((paramMenu.xiR != null) && (!bg.nm(str))) {
      paramMenu.xiR.WQ(str);
    }
    this.vKB.hqF.postDelayed(new Runnable()
    {
      public final void run()
      {
        GMTrace.i(16790637772800L, 125100);
        MediaHistoryListUI.a(MediaHistoryListUI.this).clearFocus();
        GMTrace.o(16790637772800L, 125100);
      }
    }, 200L);
    GMTrace.o(16438853107712L, 122479);
    return true;
  }
  
  protected void onDestroy()
  {
    GMTrace.i(16790771990528L, 125101);
    super.onDestroy();
    this.wKp.onDetach();
    GMTrace.o(16790771990528L, 125101);
  }
  
  public final void onFinish()
  {
    GMTrace.i(16439255760896L, 122482);
    w.i("MicroMsg.MediaHistoryListUI", "[onFinish]");
    finish();
    GMTrace.o(16439255760896L, 122482);
  }
  
  public boolean onKeyDown(int paramInt, KeyEvent paramKeyEvent)
  {
    GMTrace.i(16439121543168L, 122481);
    if (paramKeyEvent.getAction() == 4)
    {
      finish();
      GMTrace.o(16439121543168L, 122481);
      return true;
    }
    boolean bool = super.onKeyDown(paramInt, paramKeyEvent);
    GMTrace.o(16439121543168L, 122481);
    return bool;
  }
  
  public boolean onPrepareOptionsMenu(Menu paramMenu)
  {
    GMTrace.i(16438987325440L, 122480);
    this.wOo.a(this, paramMenu);
    GMTrace.o(16438987325440L, 122480);
    return true;
  }
  
  public final void v(boolean paramBoolean, int paramInt)
  {
    GMTrace.i(17804786925568L, 132656);
    du(false);
    w.i("MicroMsg.MediaHistoryListUI", "[onDataLoaded] isFirst:%s addCount:%s", new Object[] { Boolean.valueOf(paramBoolean), Integer.valueOf(paramInt) });
    if (paramInt <= 0)
    {
      this.jQZ.setVisibility(0);
      this.Ub.setVisibility(8);
      this.jQZ.setText(getString(R.l.dgY));
      GMTrace.o(17804786925568L, 132656);
      return;
    }
    this.jQZ.setVisibility(8);
    this.Ub.setVisibility(0);
    this.Ub.fl().TS.notifyChanged();
    GMTrace.o(17804786925568L, 132656);
  }
  
  private static final class a
  {
    public static b.a ah(Context paramContext, int paramInt)
    {
      GMTrace.i(16438718889984L, 122478);
      Object localObject2 = null;
      Object localObject1 = localObject2;
      switch (paramInt)
      {
      default: 
        localObject1 = localObject2;
      }
      for (;;)
      {
        GMTrace.o(16438718889984L, 122478);
        return (b.a)localObject1;
        localObject1 = new d(paramContext);
        continue;
        localObject1 = new com.tencent.mm.ui.chatting.d.g(paramContext);
        continue;
        localObject1 = new com.tencent.mm.ui.chatting.d.f(paramContext);
      }
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\ui\chatting\gallery\MediaHistoryListUI.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */