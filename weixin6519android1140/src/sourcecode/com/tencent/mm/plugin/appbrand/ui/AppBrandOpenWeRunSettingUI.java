package com.tencent.mm.plugin.appbrand.ui;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.MenuItem.OnMenuItemClickListener;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.ad.k;
import com.tencent.mm.af.f;
import com.tencent.mm.plugin.appbrand.o.e;
import com.tencent.mm.plugin.appbrand.o.f;
import com.tencent.mm.plugin.appbrand.o.g;
import com.tencent.mm.plugin.appbrand.o.i;
import com.tencent.mm.pluginsdk.ui.a.b;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.storage.ar;
import com.tencent.mm.storage.t;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.p;
import com.tencent.mm.y.ak.a;
import com.tencent.mm.y.ak.b;
import com.tencent.mm.y.ak.b.a;
import com.tencent.mm.y.s;
import java.util.LinkedList;

public class AppBrandOpenWeRunSettingUI
  extends MMActivity
  implements com.tencent.mm.ad.e
{
  private ImageView hqg;
  private TextView hqi;
  private TextView hql;
  private TextView iBg;
  private TextView iBh;
  private com.tencent.mm.storage.x iBi;
  com.tencent.mm.ui.base.r iBj;
  
  public AppBrandOpenWeRunSettingUI()
  {
    GMTrace.i(15509797994496L, 115557);
    this.iBi = null;
    GMTrace.o(15509797994496L, 115557);
  }
  
  private void updateStatus()
  {
    GMTrace.i(15510200647680L, 115560);
    a.b.a(this.hqg, this.iBi.field_username);
    this.iBg.setText(this.iBi.vk());
    if (com.tencent.mm.l.a.eE(this.iBi.field_type))
    {
      this.hql.setTextColor(com.tencent.mm.ui.tools.r.fF(this.vKB.vKW));
      this.hql.setText(((com.tencent.mm.plugin.appbrand.compat.a.a)com.tencent.mm.kernel.h.h(com.tencent.mm.plugin.appbrand.compat.a.a.class)).bF(this));
      this.hql.setCompoundDrawablesWithIntrinsicBounds(o.e.baF, 0, 0, 0);
      this.iBh.setText(((com.tencent.mm.plugin.appbrand.compat.a.a)com.tencent.mm.kernel.h.h(com.tencent.mm.plugin.appbrand.compat.a.a.class)).bF(this));
      this.iBh.setClickable(false);
      GMTrace.o(15510200647680L, 115560);
      return;
    }
    this.hql.setTextColor(com.tencent.mm.ui.tools.r.fG(this.vKB.vKW));
    this.hql.setText(((com.tencent.mm.plugin.appbrand.compat.a.a)com.tencent.mm.kernel.h.h(com.tencent.mm.plugin.appbrand.compat.a.a.class)).bG(this));
    this.hql.setCompoundDrawablesWithIntrinsicBounds(o.e.baE, 0, 0, 0);
    this.iBh.setText(((com.tencent.mm.plugin.appbrand.compat.a.a)com.tencent.mm.kernel.h.h(com.tencent.mm.plugin.appbrand.compat.a.a.class)).bE(this));
    this.iBh.setClickable(true);
    GMTrace.o(15510200647680L, 115560);
  }
  
  public final void a(int paramInt1, int paramInt2, String paramString, k paramk)
  {
    GMTrace.i(15510334865408L, 115561);
    if ((paramk instanceof com.tencent.mm.pluginsdk.model.n))
    {
      com.tencent.mm.kernel.h.xx().fYr.b(30, this);
      if ((paramInt1 == 0) && (paramInt2 == 0)) {
        break label126;
      }
      w.e("MicroMsg.AppBrandOpenWeRunSettingUI", "errType %d | errCode %d | errMsg %s", new Object[] { Integer.valueOf(paramInt1), Integer.valueOf(paramInt2), paramString });
      if ((paramInt1 == 4) && (paramInt2 == -24) && (!bg.nm(paramString))) {
        Toast.makeText(ab.getContext(), paramString, 1).show();
      }
      setResult(1);
    }
    label126:
    com.tencent.mm.storage.x localx;
    for (;;)
    {
      if (this.iBj != null) {
        this.iBj.dismiss();
      }
      updateStatus();
      GMTrace.o(15510334865408L, 115561);
      return;
      paramk = ((com.tencent.mm.pluginsdk.model.n)paramk).bJk();
      w.i("MicroMsg.AppBrandOpenWeRunSettingUI", "bind fitness contact %s success", new Object[] { paramk });
      this.iBi = ((com.tencent.mm.plugin.messenger.foundation.a.h)com.tencent.mm.kernel.h.h(com.tencent.mm.plugin.messenger.foundation.a.h.class)).yK().TE("gh_43f2581f6fd6");
      localx = this.iBi;
      if ((localx != null) && (!bg.nm(paramk))) {
        break;
      }
      w.e("MicroMsg.AppBrandOpenWeRunSettingUI", "respUsername == " + paramk + ", contact = " + localx);
      paramString = com.tencent.mm.af.x.FG().iC(this.iBi.field_username);
      com.tencent.mm.af.x.FG().e(paramString);
      com.tencent.mm.kernel.h.xy().xh().set(327825, Boolean.valueOf(true));
      setResult(-1);
      com.tencent.mm.sdk.platformtools.af.i(new Runnable()
      {
        public final void run()
        {
          GMTrace.i(15509395341312L, 115554);
          AppBrandOpenWeRunSettingUI.this.finish();
          GMTrace.o(15509395341312L, 115554);
        }
      }, 1500L);
    }
    if (s.fB(localx.field_username))
    {
      String str = bg.nl(localx.field_username);
      paramString = f.iK(str);
      if (paramString != null) {
        paramString.field_username = paramk;
      }
      com.tencent.mm.af.x.FG().iD(str);
      localx.cr(str);
    }
    for (;;)
    {
      localx.setUsername(paramk);
      if ((int)localx.fTq == 0) {
        ((com.tencent.mm.plugin.messenger.foundation.a.h)com.tencent.mm.kernel.h.h(com.tencent.mm.plugin.messenger.foundation.a.h.class)).yK().S(localx);
      }
      if ((int)localx.fTq <= 0)
      {
        w.e("MicroMsg.AppBrandOpenWeRunSettingUI", "addContact : insert contact failed");
        break;
      }
      s.p(localx);
      paramk = ((com.tencent.mm.plugin.messenger.foundation.a.h)com.tencent.mm.kernel.h.h(com.tencent.mm.plugin.messenger.foundation.a.h.class)).yK().TE(localx.field_username);
      if (paramString != null)
      {
        com.tencent.mm.af.x.FG().d(paramString);
        break;
      }
      paramString = f.iK(paramk.field_username);
      if ((paramString == null) || (paramString.Ez()))
      {
        w.d("MicroMsg.AppBrandOpenWeRunSettingUI", "shouldUpdate");
        ak.a.gmX.K(paramk.field_username, "");
        com.tencent.mm.ac.b.hR(paramk.field_username);
        break;
      }
      if (!paramk.needUpdate()) {
        break;
      }
      w.d("MicroMsg.AppBrandOpenWeRunSettingUI", "update contact, last check time=%d", new Object[] { Integer.valueOf(paramk.fjr) });
      ak.a.gmX.K(paramk.field_username, "");
      com.tencent.mm.ac.b.hR(paramk.field_username);
      break;
      paramString = null;
    }
  }
  
  protected final int getLayoutId()
  {
    GMTrace.i(15510066429952L, 115559);
    int i = o.g.hCX;
    GMTrace.o(15510066429952L, 115559);
    return i;
  }
  
  public void onCreate(Bundle paramBundle)
  {
    GMTrace.i(15509932212224L, 115558);
    super.onCreate(paramBundle);
    sq(getString(o.i.hFB));
    this.hqg = ((ImageView)findViewById(o.f.hCb));
    this.iBg = ((TextView)findViewById(o.f.hCc));
    this.hql = ((TextView)findViewById(o.f.hCe));
    this.hqi = ((TextView)findViewById(o.f.hCf));
    this.iBh = ((TextView)findViewById(o.f.hCd));
    this.iBh.setOnClickListener(new View.OnClickListener()
    {
      public final void onClick(View paramAnonymousView)
      {
        GMTrace.i(15506442551296L, 115532);
        com.tencent.mm.plugin.sport.b.d.nU(13);
        paramAnonymousView = AppBrandOpenWeRunSettingUI.this;
        paramAnonymousView.getString(o.i.cUG);
        paramAnonymousView.iBj = com.tencent.mm.ui.base.h.a(paramAnonymousView, ((com.tencent.mm.plugin.appbrand.compat.a.a)com.tencent.mm.kernel.h.h(com.tencent.mm.plugin.appbrand.compat.a.a.class)).bD(paramAnonymousView), true, null);
        paramAnonymousView.iBj.show();
        com.tencent.mm.kernel.h.xx().fYr.a(30, paramAnonymousView);
        paramAnonymousView = new LinkedList();
        paramAnonymousView.add("gh_43f2581f6fd6");
        LinkedList localLinkedList = new LinkedList();
        localLinkedList.add(Integer.valueOf(1));
        paramAnonymousView = new com.tencent.mm.pluginsdk.model.n(1, paramAnonymousView, localLinkedList, "", "");
        com.tencent.mm.kernel.h.xx().fYr.a(paramAnonymousView, 0);
        GMTrace.o(15506442551296L, 115532);
      }
    });
    a(new MenuItem.OnMenuItemClickListener()
    {
      public final boolean onMenuItemClick(MenuItem paramAnonymousMenuItem)
      {
        GMTrace.i(15505771462656L, 115527);
        AppBrandOpenWeRunSettingUI.this.finish();
        GMTrace.o(15505771462656L, 115527);
        return true;
      }
    });
    paramBundle = bg.nl(getIntent().getStringExtra("OpenWeRunSettingName"));
    this.iBi = ((com.tencent.mm.plugin.messenger.foundation.a.h)com.tencent.mm.kernel.h.h(com.tencent.mm.plugin.messenger.foundation.a.h.class)).yK().TE("gh_43f2581f6fd6");
    if ((this.iBi == null) || ((int)this.iBi.fTq == 0))
    {
      getString(o.i.cUG);
      this.iBj = com.tencent.mm.ui.base.h.a(this, getString(o.i.cUV), true, null);
      this.iBj.show();
      ak.a.gmX.a("gh_43f2581f6fd6", "", new ak.b.a()
      {
        public final void r(String paramAnonymousString, boolean paramAnonymousBoolean)
        {
          GMTrace.i(15523622420480L, 115660);
          w.i("MicroMsg.AppBrandOpenWeRunSettingUI", "getContactCallBack, suc = %b,user %s", new Object[] { Boolean.valueOf(paramAnonymousBoolean), paramAnonymousString });
          AppBrandOpenWeRunSettingUI.a(AppBrandOpenWeRunSettingUI.this, ((com.tencent.mm.plugin.messenger.foundation.a.h)com.tencent.mm.kernel.h.h(com.tencent.mm.plugin.messenger.foundation.a.h.class)).yK().TE("gh_43f2581f6fd6"));
          AppBrandOpenWeRunSettingUI.a(AppBrandOpenWeRunSettingUI.this);
          AppBrandOpenWeRunSettingUI.b(AppBrandOpenWeRunSettingUI.this).dismiss();
          GMTrace.o(15523622420480L, 115660);
        }
      });
    }
    this.hqi.setText(getString(o.i.hFC, new Object[] { paramBundle }));
    updateStatus();
    GMTrace.o(15509932212224L, 115558);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\plugin\appbrand\ui\AppBrandOpenWeRunSettingUI.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */