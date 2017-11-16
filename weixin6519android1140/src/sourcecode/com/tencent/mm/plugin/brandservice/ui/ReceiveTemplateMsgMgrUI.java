package com.tencent.mm.plugin.brandservice.ui;

import android.app.ProgressDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.DialogInterface.OnCancelListener;
import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.MenuItem.OnMenuItemClickListener;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.R.h;
import com.tencent.mm.R.i;
import com.tencent.mm.R.l;
import com.tencent.mm.R.o;
import com.tencent.mm.ad.b;
import com.tencent.mm.ad.b.c;
import com.tencent.mm.ad.k;
import com.tencent.mm.ad.n;
import com.tencent.mm.plugin.brandservice.a.l;
import com.tencent.mm.protocal.c.amu;
import com.tencent.mm.protocal.c.amw;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.af;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.ui.base.h;
import com.tencent.mm.ui.base.preference.CheckBoxPreference;
import com.tencent.mm.ui.base.preference.MMPreference;
import com.tencent.mm.ui.base.preference.Preference;
import com.tencent.mm.ui.base.preference.f;
import com.tencent.mm.y.at;
import java.util.Iterator;
import java.util.LinkedList;

public class ReceiveTemplateMsgMgrUI
  extends MMPreference
  implements com.tencent.mm.ad.e
{
  private static LinkedList<amu> jvd;
  private ProgressDialog htG;
  protected f iAA;
  private String jvc;
  private boolean jve;
  
  public ReceiveTemplateMsgMgrUI()
  {
    GMTrace.i(10872709709824L, 81008);
    this.jve = false;
    GMTrace.o(10872709709824L, 81008);
  }
  
  private void cv(boolean paramBoolean)
  {
    GMTrace.i(10874051887104L, 81018);
    View localView1 = findViewById(R.h.bXf);
    View localView2 = findViewById(R.h.bXg);
    if (localView1 != null) {
      if (paramBoolean)
      {
        ((TextView)localView1).setVisibility(0);
        if (localView2 != null)
        {
          localView2.setVisibility(8);
          GMTrace.o(10874051887104L, 81018);
        }
      }
      else
      {
        ((TextView)localView1).setVisibility(8);
        if (localView2 != null) {
          localView2.setVisibility(0);
        }
      }
    }
    GMTrace.o(10874051887104L, 81018);
  }
  
  protected final void MP()
  {
    GMTrace.i(10873649233920L, 81015);
    oM(R.l.dku);
    this.iAA = this.wky;
    this.jvc = getIntent().getStringExtra("enterprise_biz_name");
    if (bg.nm(this.jvc))
    {
      w.e("MicroMsg.brandservice.ReceiveTemplateMsgMgrUI", "bizName is null");
      finish();
      GMTrace.o(10873649233920L, 81015);
      return;
    }
    a(new MenuItem.OnMenuItemClickListener()
    {
      public final boolean onMenuItemClick(MenuItem paramAnonymousMenuItem)
      {
        GMTrace.i(10851234873344L, 80848);
        ReceiveTemplateMsgMgrUI.this.finish();
        GMTrace.o(10851234873344L, 80848);
        return true;
      }
    });
    final com.tencent.mm.plugin.brandservice.a.e locale = new com.tencent.mm.plugin.brandservice.a.e(this.jvc);
    at.wS().a(locale, 0);
    getString(R.l.cUG);
    this.htG = h.a(this, getString(R.l.dQf), true, new DialogInterface.OnCancelListener()
    {
      public final void onCancel(DialogInterface paramAnonymousDialogInterface)
      {
        GMTrace.i(10885728829440L, 81105);
        at.wS().c(locale);
        GMTrace.o(10885728829440L, 81105);
      }
    });
    GMTrace.o(10873649233920L, 81015);
  }
  
  public final int QI()
  {
    GMTrace.i(10872978145280L, 81010);
    int i = R.o.epb;
    GMTrace.o(10872978145280L, 81010);
    return i;
  }
  
  public final void a(int paramInt1, int paramInt2, String paramString, k paramk)
  {
    GMTrace.i(10873917669376L, 81017);
    if (paramk == null)
    {
      w.e("MicroMsg.brandservice.ReceiveTemplateMsgMgrUI", "onSceneEnd: [%d], [%d], [%s], scene is null", new Object[] { Integer.valueOf(paramInt1), Integer.valueOf(paramInt2), paramString });
      GMTrace.o(10873917669376L, 81017);
      return;
    }
    w.i("MicroMsg.brandservice.ReceiveTemplateMsgMgrUI", "onSceneEnd: [%d], [%d], [%s], sceneType[%d]", new Object[] { Integer.valueOf(paramInt1), Integer.valueOf(paramInt2), paramString, Integer.valueOf(paramk.getType()) });
    if (paramk.getType() == 1031)
    {
      if ((this.htG != null) && (this.htG.isShowing()))
      {
        this.htG.dismiss();
        this.htG = null;
      }
      if ((paramInt1 != 0) || (paramInt2 != 0))
      {
        Toast.makeText(ab.getContext(), ab.getContext().getString(R.l.dQd), 1).show();
        cv(true);
        GMTrace.o(10873917669376L, 81017);
        return;
      }
      paramString = (com.tencent.mm.plugin.brandservice.a.e)paramk;
      if ((paramString.fUa != null) && (paramString.fUa.gtD.gtK != null)) {}
      for (paramString = (amw)paramString.fUa.gtD.gtK;; paramString = null)
      {
        jvd = paramString.uBI;
        paramString = jvd;
        this.iAA.removeAll();
        if ((paramString != null) && (paramString.size() > 0)) {
          break;
        }
        w.e("MicroMsg.brandservice.ReceiveTemplateMsgMgrUI", "recvOption is empty");
        cv(true);
        GMTrace.o(10873917669376L, 81017);
        return;
      }
      cv(false);
      w.d("MicroMsg.brandservice.ReceiveTemplateMsgMgrUI", "initBody options.size = %d", new Object[] { Integer.valueOf(paramString.size()) });
      paramString = paramString.iterator();
      if (paramString.hasNext())
      {
        paramk = (amu)paramString.next();
        CheckBoxPreference localCheckBoxPreference = new CheckBoxPreference(this);
        localCheckBoxPreference.wlc = false;
        localCheckBoxPreference.setKey(paramk.uBH);
        localCheckBoxPreference.setTitle(paramk.eBt);
        if (paramk.tPM == 0) {}
        for (boolean bool = true;; bool = false)
        {
          localCheckBoxPreference.sdM = bool;
          this.iAA.a(localCheckBoxPreference);
          break;
        }
      }
      this.iAA.notifyDataSetChanged();
      w.d("MicroMsg.brandservice.ReceiveTemplateMsgMgrUI", "initBodyView finish");
      GMTrace.o(10873917669376L, 81017);
      return;
    }
    if ((paramk.getType() == 1030) && ((paramInt1 != 0) || (paramInt2 != 0)))
    {
      Toast.makeText(ab.getContext(), ab.getContext().getString(R.l.dQe), 0).show();
      GMTrace.o(10873917669376L, 81017);
      return;
    }
    GMTrace.o(10873917669376L, 81017);
  }
  
  public final boolean a(f paramf, Preference paramPreference)
  {
    GMTrace.i(10873783451648L, 81016);
    if (jvd == null)
    {
      w.w("MicroMsg.brandservice.ReceiveTemplateMsgMgrUI", "mRecvOptions == null");
      GMTrace.o(10873783451648L, 81016);
      return false;
    }
    paramf = paramPreference.hiu;
    if (bg.nm(paramf))
    {
      w.e("MicroMsg.brandservice.ReceiveTemplateMsgMgrUI", "key is null");
      GMTrace.o(10873783451648L, 81016);
      return false;
    }
    Iterator localIterator = jvd.iterator();
    amu localamu;
    while (localIterator.hasNext())
    {
      localamu = (amu)localIterator.next();
      if (paramf.equals(bg.nl(localamu.uBH)))
      {
        this.jve = true;
        if (!((CheckBoxPreference)paramPreference).isChecked()) {
          break label168;
        }
      }
    }
    label168:
    for (localamu.tPM = 0;; localamu.tPM = 1)
    {
      if (this.jve)
      {
        w.d("MicroMsg.brandservice.ReceiveTemplateMsgMgrUI", "option change, do scene");
        af.i(new Runnable()
        {
          public final void run()
          {
            GMTrace.i(10857677324288L, 80896);
            if (ReceiveTemplateMsgMgrUI.a(ReceiveTemplateMsgMgrUI.this))
            {
              ReceiveTemplateMsgMgrUI.b(ReceiveTemplateMsgMgrUI.this);
              l locall = new l(ReceiveTemplateMsgMgrUI.c(ReceiveTemplateMsgMgrUI.this), ReceiveTemplateMsgMgrUI.aiu());
              at.wS().a(locall, 0);
            }
            GMTrace.o(10857677324288L, 80896);
          }
        }, 4000L);
      }
      GMTrace.o(10873783451648L, 81016);
      return false;
    }
  }
  
  public final int ait()
  {
    GMTrace.i(10873112363008L, 81011);
    int i = R.i.cEy;
    GMTrace.o(10873112363008L, 81011);
    return i;
  }
  
  protected final int getLayoutId()
  {
    GMTrace.i(10872843927552L, 81009);
    int i = R.i.cEz;
    GMTrace.o(10872843927552L, 81009);
    return i;
  }
  
  public void onCreate(Bundle paramBundle)
  {
    GMTrace.i(10873246580736L, 81012);
    super.onCreate(paramBundle);
    at.wS().a(1031, this);
    at.wS().a(1030, this);
    MP();
    GMTrace.o(10873246580736L, 81012);
  }
  
  protected void onDestroy()
  {
    GMTrace.i(10873515016192L, 81014);
    at.wS().b(1031, this);
    at.wS().b(1030, this);
    super.onDestroy();
    GMTrace.o(10873515016192L, 81014);
  }
  
  protected void onPause()
  {
    GMTrace.i(10873380798464L, 81013);
    if (this.jve)
    {
      w.d("MicroMsg.brandservice.ReceiveTemplateMsgMgrUI", "onPause option change");
      this.jve = false;
      l locall = new l(this.jvc, jvd);
      at.wS().a(locall, 0);
    }
    super.onPause();
    GMTrace.o(10873380798464L, 81013);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\plugin\brandservice\ui\ReceiveTemplateMsgMgrUI.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */