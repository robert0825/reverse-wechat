package com.tencent.mm.plugin.brandservice.ui;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.widget.TextView;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.R.h;
import com.tencent.mm.R.i;
import com.tencent.mm.R.l;
import com.tencent.mm.pluginsdk.ui.tools.p.a;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.base.a;

@a(3)
public class EnterpriseBizSearchUI
  extends MMActivity
  implements EnterpriseBizContactListView.b, p.a
{
  private String juZ;
  private com.tencent.mm.pluginsdk.ui.tools.p jus;
  private EnterpriseBizContactListView jux;
  
  public EnterpriseBizSearchUI()
  {
    GMTrace.i(10847745212416L, 80822);
    GMTrace.o(10847745212416L, 80822);
  }
  
  protected final void MP()
  {
    GMTrace.i(10848282083328L, 80826);
    if (bg.nm(this.juZ))
    {
      this.juZ = getIntent().getStringExtra("enterprise_biz_name");
      if (bg.nm(this.juZ)) {
        finish();
      }
    }
    this.jux = ((EnterpriseBizContactListView)findViewById(R.h.cfv));
    this.jux.juv = this.juZ;
    this.jux.juC = true;
    this.jux.refresh();
    this.jux.cbb();
    this.jux.aip();
    this.jux.cbc();
    this.jux.lQ(false);
    this.jux.juF = this;
    ((TextView)this.jux.air()).setText(R.l.dqk);
    this.jus = new com.tencent.mm.pluginsdk.ui.tools.p();
    this.jus.mD(true);
    this.jus.a(this);
    this.jus.tHZ = false;
    GMTrace.o(10848282083328L, 80826);
  }
  
  public final void QA()
  {
    GMTrace.i(10848147865600L, 80825);
    GMTrace.o(10848147865600L, 80825);
  }
  
  public final void QB()
  {
    GMTrace.i(16938008838144L, 126198);
    GMTrace.o(16938008838144L, 126198);
  }
  
  public final void Qy()
  {
    GMTrace.i(10848550518784L, 80828);
    finish();
    GMTrace.o(10848550518784L, 80828);
  }
  
  public final void Qz()
  {
    GMTrace.i(10848416301056L, 80827);
    GMTrace.o(10848416301056L, 80827);
  }
  
  public final void a(boolean paramBoolean, String[] paramArrayOfString, long paramLong, int paramInt)
  {
    GMTrace.i(10849624260608L, 80836);
    GMTrace.o(10849624260608L, 80836);
  }
  
  public final void aim()
  {
    GMTrace.i(10848953171968L, 80831);
    aLo();
    GMTrace.o(10848953171968L, 80831);
  }
  
  public final void ain()
  {
    GMTrace.i(10849087389696L, 80832);
    GMTrace.o(10849087389696L, 80832);
  }
  
  public final boolean aio()
  {
    GMTrace.i(10849892696064L, 80838);
    aLo();
    GMTrace.o(10849892696064L, 80838);
    return false;
  }
  
  protected final int getLayoutId()
  {
    GMTrace.i(10849758478336L, 80837);
    int i = R.i.cvo;
    GMTrace.o(10849758478336L, 80837);
    return i;
  }
  
  public final boolean nC(String paramString)
  {
    GMTrace.i(10848818954240L, 80830);
    aLo();
    GMTrace.o(10848818954240L, 80830);
    return true;
  }
  
  public final void nD(String paramString)
  {
    GMTrace.i(10848684736512L, 80829);
    w.i("MicroMsg.EnterpriseBizSearchUI", "search biz, key word : %s", new Object[] { paramString });
    this.jux.VK(paramString);
    GMTrace.o(10848684736512L, 80829);
  }
  
  public void onCreate(Bundle paramBundle)
  {
    GMTrace.i(10847879430144L, 80823);
    super.onCreate(paramBundle);
    MP();
    GMTrace.o(10847879430144L, 80823);
  }
  
  public boolean onCreateOptionsMenu(Menu paramMenu)
  {
    GMTrace.i(10849355825152L, 80834);
    this.jus.a(this, paramMenu);
    GMTrace.o(10849355825152L, 80834);
    return true;
  }
  
  protected void onDestroy()
  {
    GMTrace.i(10848013647872L, 80824);
    super.onDestroy();
    if (this.jux != null) {
      EnterpriseBizContactListView.release();
    }
    GMTrace.o(10848013647872L, 80824);
  }
  
  protected void onPause()
  {
    GMTrace.i(10849221607424L, 80833);
    super.onPause();
    this.jus.cancel();
    this.jus.clearFocus();
    GMTrace.o(10849221607424L, 80833);
  }
  
  public boolean onPrepareOptionsMenu(Menu paramMenu)
  {
    GMTrace.i(10849490042880L, 80835);
    this.jus.a(this, paramMenu);
    GMTrace.o(10849490042880L, 80835);
    return true;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\plugin\brandservice\ui\EnterpriseBizSearchUI.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */