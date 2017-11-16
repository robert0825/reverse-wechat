package com.tencent.mm.ui.chatting.gallery;

import android.app.ProgressDialog;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.RecyclerView.a;
import android.support.v7.widget.RecyclerView.b;
import android.view.MenuItem;
import android.view.MenuItem.OnMenuItemClickListener;
import android.widget.TextView;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.R.h;
import com.tencent.mm.R.i;
import com.tencent.mm.R.l;
import com.tencent.mm.plugin.report.service.g;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.base.r;
import com.tencent.mm.ui.chatting.c.b.a;
import com.tencent.mm.ui.chatting.c.b.b;
import com.tencent.mm.ui.chatting.d.a;
import com.tencent.mm.y.s;

public class AppBrandHistoryListUI
  extends MMActivity
  implements b.b
{
  private RecyclerView Ub;
  private String iGc;
  private TextView jQZ;
  private ProgressDialog rxx;
  private b.a wKp;
  
  public AppBrandHistoryListUI()
  {
    GMTrace.i(17912161107968L, 133456);
    GMTrace.o(17912161107968L, 133456);
  }
  
  private void du(boolean paramBoolean)
  {
    GMTrace.i(17913369067520L, 133465);
    w.i("MicroMsg.AppBrandHistoryListUI", "[setProgress] isVisible:%s", new Object[] { Boolean.valueOf(paramBoolean) });
    if (paramBoolean)
    {
      this.rxx = r.b(this, getString(R.l.bKJ), true, 0, null);
      GMTrace.o(17913369067520L, 133465);
      return;
    }
    if ((this.rxx != null) && (this.rxx.isShowing()))
    {
      this.rxx.dismiss();
      this.rxx = null;
    }
    GMTrace.o(17913369067520L, 133465);
  }
  
  protected final void MP()
  {
    GMTrace.i(17912429543424L, 133458);
    sq(getString(R.l.dep));
    this.jQZ = ((TextView)findViewById(R.h.caE));
    this.Ub = ((RecyclerView)findViewById(R.h.bGh));
    this.Ub.setBackgroundColor(-1);
    this.Ub.a(this.wKp.fv(this));
    this.Ub.a(this.wKp.Wr(this.iGc));
    this.Ub.Tc = true;
    a(new MenuItem.OnMenuItemClickListener()
    {
      public final boolean onMenuItemClick(MenuItem paramAnonymousMenuItem)
      {
        GMTrace.i(17915516551168L, 133481);
        AppBrandHistoryListUI.this.finish();
        GMTrace.o(17915516551168L, 133481);
        return true;
      }
    });
    GMTrace.o(17912429543424L, 133458);
  }
  
  public final void bf(String paramString, boolean paramBoolean)
  {
    GMTrace.i(17913234849792L, 133464);
    GMTrace.o(17913234849792L, 133464);
  }
  
  public final void cfd()
  {
    GMTrace.i(17912832196608L, 133461);
    du(true);
    GMTrace.o(17912832196608L, 133461);
  }
  
  protected final int getLayoutId()
  {
    GMTrace.i(17912697978880L, 133460);
    int i = R.i.cpp;
    GMTrace.o(17912697978880L, 133460);
    return i;
  }
  
  public void onCreate(Bundle paramBundle)
  {
    GMTrace.i(17912295325696L, 133457);
    super.onCreate(paramBundle);
    this.iGc = getIntent().getStringExtra("Chat_User");
    new a(this).a(this);
    MP();
    this.wKp.ceZ();
    if (s.eb(this.iGc))
    {
      g.ork.i(14562, new Object[] { this.iGc, Integer.valueOf(0) });
      GMTrace.o(17912295325696L, 133457);
      return;
    }
    g.ork.i(14562, new Object[] { this.iGc, Integer.valueOf(1) });
    GMTrace.o(17912295325696L, 133457);
  }
  
  protected void onDestroy()
  {
    GMTrace.i(17912563761152L, 133459);
    super.onDestroy();
    GMTrace.o(17912563761152L, 133459);
  }
  
  public final void onFinish()
  {
    GMTrace.i(17913100632064L, 133463);
    w.i("MicroMsg.AppBrandHistoryListUI", "[onFinish]");
    finish();
    GMTrace.o(17913100632064L, 133463);
  }
  
  public final void v(boolean paramBoolean, int paramInt)
  {
    GMTrace.i(17912966414336L, 133462);
    du(false);
    w.i("MicroMsg.AppBrandHistoryListUI", "[onDataLoaded] isFirst:%s addCount:%s", new Object[] { Boolean.valueOf(paramBoolean), Integer.valueOf(paramInt) });
    if (paramInt <= 0)
    {
      this.jQZ.setVisibility(0);
      this.Ub.setVisibility(8);
      this.jQZ.setText(getString(R.l.dgY));
      GMTrace.o(17912966414336L, 133462);
      return;
    }
    this.jQZ.setVisibility(8);
    this.Ub.setVisibility(0);
    this.Ub.fl().TS.notifyChanged();
    GMTrace.o(17912966414336L, 133462);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\ui\chatting\gallery\AppBrandHistoryListUI.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */