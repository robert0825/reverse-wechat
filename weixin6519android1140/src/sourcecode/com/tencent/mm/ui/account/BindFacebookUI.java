package com.tencent.mm.ui.account;

import android.app.ProgressDialog;
import android.content.DialogInterface;
import android.content.DialogInterface.OnCancelListener;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.MenuItem.OnMenuItemClickListener;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.R.h;
import com.tencent.mm.R.i;
import com.tencent.mm.R.l;
import com.tencent.mm.ad.e;
import com.tencent.mm.ad.k;
import com.tencent.mm.ad.n;
import com.tencent.mm.modelsimple.g;
import com.tencent.mm.plugin.c.a;
import com.tencent.mm.pluginsdk.l;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.storage.as;
import com.tencent.mm.storage.t;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.MMWizardActivity;
import com.tencent.mm.ui.base.h;
import com.tencent.mm.ui.g.a.b;
import com.tencent.mm.ui.g.a.c.a;
import com.tencent.mm.ui.g.a.d;
import com.tencent.mm.ui.p;
import com.tencent.mm.y.at;

public class BindFacebookUI
  extends MMWizardActivity
  implements e
{
  private DialogInterface.OnCancelListener iKE;
  private com.tencent.mm.ui.g.a.c vPk;
  private ProgressDialog vPl;
  private g vPm;
  
  public BindFacebookUI()
  {
    GMTrace.i(2707440009216L, 20172);
    GMTrace.o(2707440009216L, 20172);
  }
  
  protected final void MP()
  {
    GMTrace.i(2708245315584L, 20178);
    this.vPk = new com.tencent.mm.ui.g.a.c("290293790992170");
    this.iKE = new DialogInterface.OnCancelListener()
    {
      public final void onCancel(DialogInterface paramAnonymousDialogInterface)
      {
        GMTrace.i(2755087302656L, 20527);
        if (BindFacebookUI.a(BindFacebookUI.this) != null) {
          at.wS().c(BindFacebookUI.a(BindFacebookUI.this));
        }
        GMTrace.o(2755087302656L, 20527);
      }
    };
    a(0, getString(R.l.cTq), new MenuItem.OnMenuItemClickListener()
    {
      public final boolean onMenuItemClick(MenuItem paramAnonymousMenuItem)
      {
        GMTrace.i(2771327647744L, 20648);
        BindFacebookUI.b(BindFacebookUI.this);
        GMTrace.o(2771327647744L, 20648);
        return true;
      }
    });
    oM(R.l.cYV);
    Object localObject = (TextView)findViewById(R.h.ccy);
    ((TextView)localObject).setVisibility(4);
    ((TextView)localObject).setText(R.l.cYU);
    localObject = (Button)findViewById(R.h.bgE);
    ((Button)localObject).setVisibility(0);
    ((Button)localObject).setOnClickListener(new View.OnClickListener()
    {
      public final void onClick(View paramAnonymousView)
      {
        GMTrace.i(2683683471360L, 19995);
        BindFacebookUI.c(BindFacebookUI.this).a(BindFacebookUI.this, FacebookAuthUI.vPD, new BindFacebookUI.a(BindFacebookUI.this));
        GMTrace.o(2683683471360L, 19995);
      }
    });
    GMTrace.o(2708245315584L, 20178);
  }
  
  public final void a(int paramInt1, int paramInt2, String paramString, k paramk)
  {
    GMTrace.i(2708379533312L, 20179);
    if (paramk.getType() != 183)
    {
      GMTrace.o(2708379533312L, 20179);
      return;
    }
    if (this.vPl != null) {
      this.vPl.dismiss();
    }
    if (a.hnI.a(this.vKB.vKW, paramInt1, paramInt2, paramString))
    {
      GMTrace.o(2708379533312L, 20179);
      return;
    }
    int i = ((g)paramk).opType;
    if ((paramInt1 == 0) && (paramInt2 == 0))
    {
      if (i == 1)
      {
        at.AR();
        com.tencent.mm.y.c.yP().TN("facebookapp");
        at.AR();
        com.tencent.mm.y.c.yM().Cg("facebookapp");
      }
      Bh(1);
      GMTrace.o(2708379533312L, 20179);
      return;
    }
    if ((paramInt1 == 4) && (paramInt2 == -67))
    {
      Toast.makeText(this, R.l.dsr, 1).show();
      GMTrace.o(2708379533312L, 20179);
      return;
    }
    if ((paramInt1 == 4) && (paramInt2 == -5))
    {
      if (i == 1) {}
      for (paramInt1 = R.l.dsn;; paramInt1 = R.l.dss)
      {
        Toast.makeText(this, paramInt1, 1).show();
        GMTrace.o(2708379533312L, 20179);
        return;
      }
    }
    if (i == 0) {}
    for (paramInt1 = R.l.djn;; paramInt1 = R.l.djk)
    {
      Toast.makeText(this, paramInt1, 1).show();
      GMTrace.o(2708379533312L, 20179);
      return;
    }
  }
  
  protected final int getLayoutId()
  {
    GMTrace.i(2708111097856L, 20177);
    int i = R.i.cpY;
    GMTrace.o(2708111097856L, 20177);
    return i;
  }
  
  public void onCreate(Bundle paramBundle)
  {
    GMTrace.i(2707574226944L, 20173);
    super.onCreate(paramBundle);
    GMTrace.o(2707574226944L, 20173);
  }
  
  protected void onDestroy()
  {
    GMTrace.i(2707708444672L, 20174);
    super.onDestroy();
    GMTrace.o(2707708444672L, 20174);
  }
  
  protected void onPause()
  {
    GMTrace.i(2707976880128L, 20176);
    super.onPause();
    at.wS().b(183, this);
    GMTrace.o(2707976880128L, 20176);
  }
  
  protected void onResume()
  {
    GMTrace.i(2707842662400L, 20175);
    super.onResume();
    at.wS().a(183, this);
    MP();
    GMTrace.o(2707842662400L, 20175);
  }
  
  private final class a
    implements c.a
  {
    public a()
    {
      GMTrace.i(2660463804416L, 19822);
      GMTrace.o(2660463804416L, 19822);
    }
    
    public final void a(b paramb)
    {
      GMTrace.i(2660866457600L, 19825);
      w.d("MicroMsg.BindFacebookUI", "onError:" + paramb.getMessage());
      h.b(BindFacebookUI.this, paramb.getMessage(), BindFacebookUI.this.getString(R.l.djk), true);
      BindFacebookUI.lq(false);
      GMTrace.o(2660866457600L, 19825);
    }
    
    public final void a(d paramd)
    {
      GMTrace.i(2660732239872L, 19824);
      w.d("MicroMsg.BindFacebookUI", "onFacebookError:" + paramd.xbb);
      h.b(BindFacebookUI.this, paramd.getMessage(), BindFacebookUI.this.getString(R.l.djk), true);
      BindFacebookUI.lq(false);
      GMTrace.o(2660732239872L, 19824);
    }
    
    public final void m(Bundle paramBundle)
    {
      GMTrace.i(2660598022144L, 19823);
      w.d("MicroMsg.BindFacebookUI", "token:" + BindFacebookUI.c(BindFacebookUI.this).wlZ);
      at.AR();
      com.tencent.mm.y.c.xh().set(65830, BindFacebookUI.c(BindFacebookUI.this).wlZ);
      if (BindFacebookUI.c(BindFacebookUI.this).xaU != 0L)
      {
        at.AR();
        com.tencent.mm.y.c.xh().set(65832, Long.valueOf(BindFacebookUI.c(BindFacebookUI.this).xaU));
      }
      paramBundle = BindFacebookUI.this.getString(R.l.cUG);
      String str = BindFacebookUI.this.getString(R.l.dsp);
      BindFacebookUI.a(BindFacebookUI.this, ProgressDialog.show(BindFacebookUI.this, paramBundle, str, true));
      BindFacebookUI.e(BindFacebookUI.this).setOnCancelListener(BindFacebookUI.d(BindFacebookUI.this));
      BindFacebookUI.a(BindFacebookUI.this, new g(1, BindFacebookUI.c(BindFacebookUI.this).wlZ));
      at.wS().a(BindFacebookUI.a(BindFacebookUI.this), 0);
      BindFacebookUI.lq(true);
      GMTrace.o(2660598022144L, 19823);
    }
    
    public final void onCancel()
    {
      GMTrace.i(2661000675328L, 19826);
      w.d("MicroMsg.BindFacebookUI", "onCancel");
      BindFacebookUI.lq(false);
      GMTrace.o(2661000675328L, 19826);
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\ui\account\BindFacebookUI.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */