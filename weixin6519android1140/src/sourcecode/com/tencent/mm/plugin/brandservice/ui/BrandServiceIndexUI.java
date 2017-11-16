package com.tencent.mm.plugin.brandservice.ui;

import android.content.ComponentName;
import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.MenuItem.OnMenuItemClickListener;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.TextView;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.R.h;
import com.tencent.mm.R.i;
import com.tencent.mm.R.k;
import com.tencent.mm.R.l;
import com.tencent.mm.af.x;
import com.tencent.mm.bj.d;
import com.tencent.mm.plugin.brandservice.ui.base.BrandServiceSortView;
import com.tencent.mm.sdk.e.j.a;
import com.tencent.mm.sdk.e.l;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.storage.t;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.contact.s;
import com.tencent.mm.ui.e.g;
import com.tencent.mm.y.at;
import com.tencent.mm.y.c;

public class BrandServiceIndexUI
  extends MMActivity
  implements j.a
{
  private int gwg;
  private TextView jun;
  private BrandServiceSortView juo;
  private boolean jup;
  private boolean juq;
  
  public BrandServiceIndexUI()
  {
    GMTrace.i(10867609436160L, 80970);
    this.jun = null;
    this.gwg = 251658241;
    this.jup = false;
    this.juq = false;
    GMTrace.o(10867609436160L, 80970);
  }
  
  protected final void MP()
  {
    GMTrace.i(10868414742528L, 80976);
    oM(R.l.cRf);
    this.juo = ((BrandServiceSortView)findViewById(R.h.cfv));
    this.juo.L(true);
    this.juo.juq = this.juq;
    this.jun = ((TextView)findViewById(R.h.bSJ));
    this.jun.setOnClickListener(new View.OnClickListener()
    {
      public final void onClick(View paramAnonymousView)
      {
        GMTrace.i(10871367532544L, 80998);
        GMTrace.o(10871367532544L, 80998);
      }
    });
    this.jun.setVisibility(8);
    a(new MenuItem.OnMenuItemClickListener()
    {
      public final boolean onMenuItemClick(MenuItem paramAnonymousMenuItem)
      {
        GMTrace.i(10861435420672L, 80924);
        BrandServiceIndexUI.this.finish();
        GMTrace.o(10861435420672L, 80924);
        return true;
      }
    });
    a(0, R.l.eey, R.k.cIS, new MenuItem.OnMenuItemClickListener()
    {
      public final boolean onMenuItemClick(MenuItem paramAnonymousMenuItem)
      {
        GMTrace.i(10892037062656L, 81152);
        w.v("MicroMsg.BrandService.BrandServiceIndexUI", "search btn was clicked.");
        paramAnonymousMenuItem = new Intent(BrandServiceIndexUI.this, BrandServiceLocalSearchUI.class);
        paramAnonymousMenuItem.putExtra("is_return_result", BrandServiceIndexUI.a(BrandServiceIndexUI.this));
        paramAnonymousMenuItem.addFlags(67108864);
        BrandServiceIndexUI.this.startActivityForResult(paramAnonymousMenuItem, 1);
        GMTrace.o(10892037062656L, 81152);
        return true;
      }
    });
    a(1, R.l.cQj, R.k.cIG, new MenuItem.OnMenuItemClickListener()
    {
      public final boolean onMenuItemClick(MenuItem paramAnonymousMenuItem)
      {
        GMTrace.i(10857408888832L, 80894);
        if (com.tencent.mm.az.e.Kr())
        {
          paramAnonymousMenuItem = com.tencent.mm.az.e.Kv();
          paramAnonymousMenuItem.putExtra("KRightBtn", true);
          paramAnonymousMenuItem.putExtra("ftsneedkeyboard", true);
          paramAnonymousMenuItem.putExtra("key_load_js_without_delay", true);
          paramAnonymousMenuItem.putExtra("ftsType", 1);
          paramAnonymousMenuItem.putExtra("ftsbizscene", 6);
          paramAnonymousMenuItem.putExtra("rawUrl", com.tencent.mm.az.e.n(com.tencent.mm.az.e.a(6, true, 0)));
          d.b(ab.getContext(), "webview", ".ui.tools.fts.FTSSearchTabWebViewUI", paramAnonymousMenuItem);
        }
        for (;;)
        {
          BrandServiceIndexUI.this.Y(1, false);
          GMTrace.o(10857408888832L, 80894);
          return true;
          w.e("MicroMsg.BrandService.BrandServiceIndexUI", "fts h5 template not avail");
        }
      }
    });
    GMTrace.o(10868414742528L, 80976);
  }
  
  public final void a(String paramString, l paraml)
  {
    GMTrace.i(10868683177984L, 80978);
    w.v("MicroMsg.BrandService.BrandServiceIndexUI", "On Storage Change, event : %s.", new Object[] { paramString });
    this.jup = true;
    GMTrace.o(10868683177984L, 80978);
  }
  
  protected final int getLayoutId()
  {
    GMTrace.i(10867743653888L, 80971);
    int i = R.i.cqy;
    GMTrace.o(10867743653888L, 80971);
    return i;
  }
  
  protected void onActivityResult(int paramInt1, int paramInt2, Intent paramIntent)
  {
    GMTrace.i(10868548960256L, 80977);
    super.onActivityResult(paramInt1, paramInt2, paramIntent);
    if ((paramInt1 == 1) && (paramInt2 == -1) && (this.juq))
    {
      setResult(-1, paramIntent);
      finish();
    }
    GMTrace.o(10868548960256L, 80977);
  }
  
  public void onCreate(Bundle paramBundle)
  {
    GMTrace.i(10867877871616L, 80972);
    super.onCreate(paramBundle);
    this.gwg = getIntent().getIntExtra("intent_service_type", 251658241);
    this.juq = s.ew(getIntent().getIntExtra("list_attr", 0), 16384);
    MP();
    x.FG().c(this);
    GMTrace.o(10867877871616L, 80972);
  }
  
  protected void onDestroy()
  {
    GMTrace.i(10868280524800L, 80975);
    if (at.AU())
    {
      this.juo.release();
      x.FG().j(this);
    }
    super.onDestroy();
    GMTrace.o(10868280524800L, 80975);
  }
  
  protected void onPause()
  {
    GMTrace.i(10868146307072L, 80974);
    at.AR();
    c.xh().set(233474, Long.valueOf(System.currentTimeMillis()));
    at.AR();
    c.xh().set(233473, Long.valueOf(System.currentTimeMillis()));
    at.AR();
    c.xh().set(233476, Long.valueOf(System.currentTimeMillis()));
    super.onPause();
    GMTrace.o(10868146307072L, 80974);
  }
  
  protected void onResume()
  {
    GMTrace.i(10868012089344L, 80973);
    if (this.jup)
    {
      this.jup = false;
      this.juo.refresh();
    }
    super.onResume();
    Intent localIntent = new Intent();
    localIntent.setComponent(new ComponentName(e.g.vGK, "com.tencent.mm.booter.MMReceivers$ToolsProcessReceiver"));
    localIntent.putExtra("tools_process_action_code_key", "com.tencent.mm.intent.ACTION_START_TOOLS_PROCESS");
    sendBroadcast(localIntent);
    Y(1, true);
    GMTrace.o(10868012089344L, 80973);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\plugin\brandservice\ui\BrandServiceIndexUI.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */