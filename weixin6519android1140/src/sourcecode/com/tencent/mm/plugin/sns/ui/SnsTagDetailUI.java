package com.tencent.mm.plugin.sns.ui;

import android.content.DialogInterface;
import android.content.DialogInterface.OnCancelListener;
import android.content.DialogInterface.OnClickListener;
import android.content.Intent;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.MenuItem;
import android.view.MenuItem.OnMenuItemClickListener;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.ad.k;
import com.tencent.mm.ad.n;
import com.tencent.mm.g.b.af;
import com.tencent.mm.kernel.b;
import com.tencent.mm.plugin.sns.i.j;
import com.tencent.mm.plugin.sns.i.m;
import com.tencent.mm.plugin.sns.model.ae;
import com.tencent.mm.plugin.sns.model.ai;
import com.tencent.mm.plugin.sns.model.u;
import com.tencent.mm.plugin.sns.model.v;
import com.tencent.mm.plugin.sns.storage.s;
import com.tencent.mm.pluginsdk.ui.applet.ContactListExpandPreference;
import com.tencent.mm.pluginsdk.ui.applet.ContactListExpandPreference.a;
import com.tencent.mm.pluginsdk.ui.applet.g;
import com.tencent.mm.pluginsdk.ui.applet.i.b;
import com.tencent.mm.sdk.e.m.b;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.storage.ar;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.base.preference.MMPreference;
import com.tencent.mm.ui.base.preference.Preference;
import com.tencent.mm.ui.base.preference.f;
import com.tencent.mm.ui.base.r;
import com.tencent.mm.ui.p;
import com.tencent.mm.ui.p.b;
import com.tencent.mm.y.q;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class SnsTagDetailUI
  extends MMPreference
  implements com.tencent.mm.ad.e, m.b
{
  protected String eDW;
  protected r hsU;
  protected f htU;
  protected ContactListExpandPreference jNs;
  protected long psT;
  protected List<String> qfY;
  protected String qfZ;
  private boolean qga;
  protected ContactListExpandPreference.a qgb;
  protected int scene;
  
  public SnsTagDetailUI()
  {
    GMTrace.i(8499203407872L, 63324);
    this.hsU = null;
    this.qfY = new ArrayList();
    this.qfZ = "";
    this.eDW = "";
    this.qga = false;
    this.scene = 0;
    this.qgb = new ContactListExpandPreference.a()
    {
      public final void anE()
      {
        GMTrace.i(8433705156608L, 62836);
        if (SnsTagDetailUI.this.jNs != null) {
          SnsTagDetailUI.this.jNs.bLL();
        }
        GMTrace.o(8433705156608L, 62836);
      }
      
      public final void ma(int paramAnonymousInt)
      {
        GMTrace.i(8433302503424L, 62833);
        String str = SnsTagDetailUI.this.jNs.zk(paramAnonymousInt);
        com.tencent.mm.sdk.platformtools.w.d("MicroMsg.SnsTagDetailUI", "roomPref del " + paramAnonymousInt + " userName : " + str);
        com.tencent.mm.kernel.h.xz();
        if (bg.aq((String)com.tencent.mm.kernel.h.xy().xh().get(2, null), "").equals(str))
        {
          com.tencent.mm.ui.base.h.h(SnsTagDetailUI.this.vKB.vKW, i.j.dSV, i.j.cUG);
          GMTrace.o(8433302503424L, 62833);
          return;
        }
        SnsTagDetailUI.this.uT(str);
        if (((SnsTagDetailUI.this.qfZ + " " + bg.c(SnsTagDetailUI.this.qfY, ",")).equals(SnsTagDetailUI.this.eDW)) && (SnsTagDetailUI.this.psT != 0L))
        {
          SnsTagDetailUI.this.lf(false);
          GMTrace.o(8433302503424L, 62833);
          return;
        }
        SnsTagDetailUI.this.lf(true);
        GMTrace.o(8433302503424L, 62833);
      }
      
      public final void mb(int paramAnonymousInt)
      {
        GMTrace.i(8433570938880L, 62835);
        String str = SnsTagDetailUI.this.jNs.zk(paramAnonymousInt);
        Intent localIntent = new Intent();
        localIntent.putExtra("Contact_User", str);
        com.tencent.mm.plugin.sns.c.a.hnH.d(localIntent, SnsTagDetailUI.this);
        GMTrace.o(8433570938880L, 62835);
      }
      
      public final void mc(int paramAnonymousInt)
      {
        GMTrace.i(8433436721152L, 62834);
        com.tencent.mm.sdk.platformtools.w.d("MicroMsg.SnsTagDetailUI", "roomPref add " + paramAnonymousInt);
        SnsTagDetailUI.a(SnsTagDetailUI.this);
        GMTrace.o(8433436721152L, 62834);
      }
    };
    GMTrace.o(8499203407872L, 63324);
  }
  
  private void bpu()
  {
    GMTrace.i(8500545585152L, 63334);
    Preference localPreference = this.htU.VG("settings_tag_name");
    if (localPreference != null)
    {
      if (this.qfZ.length() > 20) {
        this.qfZ = this.qfZ.substring(0, 20);
      }
      localPreference.setSummary(this.qfZ);
      this.htU.notifyDataSetChanged();
    }
    GMTrace.o(8500545585152L, 63334);
  }
  
  protected final void MP()
  {
    GMTrace.i(8500814020608L, 63336);
    this.htU = this.wky;
    this.jNs = ((ContactListExpandPreference)this.htU.VG("roominfo_contact_anchor"));
    if (this.jNs != null)
    {
      this.jNs.a(this.htU, this.jNs.hiu);
      this.jNs.kf(true).kg(true);
      this.jNs.m(null, this.qfY);
      this.jNs.a(new i.b()
      {
        public final boolean lZ(int paramAnonymousInt)
        {
          GMTrace.i(8349819076608L, 62211);
          ContactListExpandPreference localContactListExpandPreference = SnsTagDetailUI.this.jNs;
          if (localContactListExpandPreference.txK != null) {}
          for (boolean bool = localContactListExpandPreference.txK.twX.zi(paramAnonymousInt);; bool = true)
          {
            if (!bool) {
              com.tencent.mm.sdk.platformtools.w.d("MicroMsg.SnsTagDetailUI", "onItemLongClick " + paramAnonymousInt);
            }
            GMTrace.o(8349819076608L, 62211);
            return true;
          }
        }
      });
      this.jNs.a(this.qgb);
    }
    getIntent().getIntExtra("k_sns_from_settings_about_sns", 0);
    a(new MenuItem.OnMenuItemClickListener()
    {
      public final boolean onMenuItemClick(MenuItem paramAnonymousMenuItem)
      {
        GMTrace.i(8339350093824L, 62133);
        if (((SnsTagDetailUI.this.qfZ + " " + bg.c(SnsTagDetailUI.this.qfY, ",")).equals(SnsTagDetailUI.this.eDW)) && (SnsTagDetailUI.this.psT != 0L))
        {
          SnsTagDetailUI.this.finish();
          GMTrace.o(8339350093824L, 62133);
          return true;
        }
        com.tencent.mm.ui.base.h.a(SnsTagDetailUI.this, i.j.pkD, i.j.cUG, new DialogInterface.OnClickListener()
        {
          public final void onClick(DialogInterface paramAnonymous2DialogInterface, int paramAnonymous2Int)
          {
            GMTrace.i(8599329832960L, 64070);
            SnsTagDetailUI.this.finish();
            GMTrace.o(8599329832960L, 64070);
          }
        }, null);
        GMTrace.o(8339350093824L, 62133);
        return true;
      }
    });
    a(0, getString(i.j.cTh), new MenuItem.OnMenuItemClickListener()
    {
      public final boolean onMenuItemClick(MenuItem paramAnonymousMenuItem)
      {
        GMTrace.i(8494505787392L, 63289);
        SnsTagDetailUI.this.aLm();
        GMTrace.o(8494505787392L, 63289);
        return true;
      }
    }, p.b.vLG);
    GMTrace.o(8500814020608L, 63336);
  }
  
  public final int QI()
  {
    GMTrace.i(8500008714240L, 63330);
    int i = i.m.plK;
    GMTrace.o(8500008714240L, 63330);
    return i;
  }
  
  public void a(int paramInt1, int paramInt2, String paramString, k paramk)
  {
    GMTrace.i(8501753544704L, 63343);
    com.tencent.mm.sdk.platformtools.w.i("MicroMsg.SnsTagDetailUI", "onSceneEnd: errType = " + paramInt1 + " errCode = " + paramInt2 + " errMsg = " + paramString);
    if (this.hsU != null) {
      this.hsU.dismiss();
    }
    switch (paramk.getType())
    {
    }
    for (;;)
    {
      GMTrace.o(8501753544704L, 63343);
      return;
      finish();
      GMTrace.o(8501753544704L, 63343);
      return;
      finish();
      GMTrace.o(8501753544704L, 63343);
      return;
      if ((this.jNs != null) && (this.qga) && (!(this instanceof SnsBlackDetailUI)))
      {
        com.tencent.mm.sdk.platformtools.w.d("MicroMsg.SnsTagDetailUI", "update form net");
        paramString = (u)paramk;
        this.eDW = (this.qfZ + " " + bg.c(paramString.dE(this.psT), ","));
        new LinkedList();
        paramString = this.qfY;
        this.qfY = bow();
        if (paramString != null)
        {
          paramString = paramString.iterator();
          while (paramString.hasNext())
          {
            paramk = (String)paramString.next();
            if (!this.qfY.contains(paramk)) {
              this.qfY.add(paramk);
            }
          }
        }
        this.jNs.aQ(this.qfY);
        this.jNs.notifyChanged();
      }
    }
  }
  
  public final void a(int paramInt, com.tencent.mm.sdk.e.m paramm, Object paramObject)
  {
    GMTrace.i(8499874496512L, 63329);
    GMTrace.o(8499874496512L, 63329);
  }
  
  public final boolean a(f paramf, Preference paramPreference)
  {
    GMTrace.i(8500277149696L, 63332);
    paramf = paramPreference.hiu;
    if ((paramf.equals("settings_tag_name")) && ((this.psT >= 6L) || (this.psT == 0L)))
    {
      paramPreference = new Intent();
      paramPreference.putExtra("Contact_mode_name_type", 3);
      paramPreference.putExtra("Contact_Nick", bg.aq(this.qfZ, " "));
      com.tencent.mm.plugin.sns.c.a.hnH.a(paramPreference, this);
    }
    if (paramf.equals("delete_tag_name")) {
      com.tencent.mm.ui.base.h.a(this, i.j.pig, i.j.cUG, new DialogInterface.OnClickListener()new DialogInterface.OnClickListener
      {
        public final void onClick(DialogInterface paramAnonymousDialogInterface, int paramAnonymousInt)
        {
          GMTrace.i(8492089868288L, 63271);
          SnsTagDetailUI.this.bov();
          GMTrace.o(8492089868288L, 63271);
        }
      }, new DialogInterface.OnClickListener()
      {
        public final void onClick(DialogInterface paramAnonymousDialogInterface, int paramAnonymousInt)
        {
          GMTrace.i(8563627917312L, 63804);
          GMTrace.o(8563627917312L, 63804);
        }
      });
    }
    GMTrace.o(8500277149696L, 63332);
    return false;
  }
  
  protected void aLm()
  {
    GMTrace.i(8501082456064L, 63338);
    if (((this.qfZ + " " + bg.c(this.qfY, ",")).equals(this.eDW)) && (this.psT != 0L))
    {
      finish();
      GMTrace.o(8501082456064L, 63338);
      return;
    }
    if (ae.bjj().p(this.psT, this.qfZ))
    {
      com.tencent.mm.ui.base.h.b(this, getString(i.j.pkE, new Object[] { this.qfZ }), getString(i.j.cUG), true);
      GMTrace.o(8501082456064L, 63338);
      return;
    }
    final v localv = new v(3, this.psT, this.qfZ, this.qfY.size(), this.qfY, this.scene);
    com.tencent.mm.kernel.h.xz();
    com.tencent.mm.kernel.h.xx().fYr.a(localv, 0);
    getString(i.j.cUG);
    this.hsU = com.tencent.mm.ui.base.h.a(this, getString(i.j.pkM), true, new DialogInterface.OnCancelListener()
    {
      public final void onCancel(DialogInterface paramAnonymousDialogInterface)
      {
        GMTrace.i(8468870201344L, 63098);
        com.tencent.mm.kernel.h.xz();
        com.tencent.mm.kernel.h.xx().fYr.c(localv);
        GMTrace.o(8468870201344L, 63098);
      }
    });
    GMTrace.o(8501082456064L, 63338);
  }
  
  protected final void anv()
  {
    GMTrace.i(8500411367424L, 63333);
    sq(this.qfZ + "(" + this.qfY.size() + ")");
    GMTrace.o(8500411367424L, 63333);
  }
  
  protected void bF(List<String> paramList)
  {
    GMTrace.i(8501485109248L, 63341);
    ar localar = ae.biR();
    String str1 = q.zE();
    paramList = paramList.iterator();
    while (paramList.hasNext())
    {
      String str2 = (String)paramList.next();
      if ((!this.qfY.contains(str2)) && (com.tencent.mm.l.a.eE(localar.TE(str2).field_type)) && (!str1.equals(str2))) {
        this.qfY.add(str2);
      }
    }
    if (this.jNs != null)
    {
      this.jNs.aQ(this.qfY);
      this.jNs.notifyChanged();
    }
    if (this.qfY.size() > 0) {
      this.jNs.kf(true).kg(true);
    }
    for (;;)
    {
      anv();
      GMTrace.o(8501485109248L, 63341);
      return;
      this.jNs.kf(true).kg(false);
    }
  }
  
  protected void bot()
  {
    GMTrace.i(8499337625600L, 63325);
    com.tencent.mm.sdk.platformtools.w.d("MicroMsg.SnsTagDetailUI", "Base __onCreate");
    com.tencent.mm.kernel.h.xz();
    com.tencent.mm.kernel.h.xx().fYr.a(290, this);
    com.tencent.mm.kernel.h.xz();
    com.tencent.mm.kernel.h.xx().fYr.a(291, this);
    com.tencent.mm.kernel.h.xz();
    com.tencent.mm.kernel.h.xx().fYr.a(292, this);
    com.tencent.mm.kernel.h.xz();
    com.tencent.mm.kernel.h.xx().fYr.a(293, this);
    com.tencent.mm.kernel.h.xz();
    ((com.tencent.mm.plugin.messenger.foundation.a.h)com.tencent.mm.kernel.h.h(com.tencent.mm.plugin.messenger.foundation.a.h.class)).yK().a(this);
    if (ae.bjj().bmA().size() == 0)
    {
      com.tencent.mm.kernel.h.xz();
      com.tencent.mm.kernel.h.xx().fYr.a(new u(1), 0);
      this.qga = true;
    }
    GMTrace.o(8499337625600L, 63325);
  }
  
  protected void bou()
  {
    GMTrace.i(8499606061056L, 63327);
    com.tencent.mm.sdk.platformtools.w.d("MicroMsg.SnsTagDetailUI", "Base __onDestroy");
    com.tencent.mm.kernel.h.xz();
    com.tencent.mm.kernel.h.xx().fYr.b(290, this);
    com.tencent.mm.kernel.h.xz();
    com.tencent.mm.kernel.h.xx().fYr.b(291, this);
    com.tencent.mm.kernel.h.xz();
    com.tencent.mm.kernel.h.xx().fYr.b(292, this);
    com.tencent.mm.kernel.h.xz();
    com.tencent.mm.kernel.h.xx().fYr.b(293, this);
    com.tencent.mm.kernel.h.xz();
    if (com.tencent.mm.kernel.h.xw().wL())
    {
      com.tencent.mm.kernel.h.xz();
      ((com.tencent.mm.plugin.messenger.foundation.a.h)com.tencent.mm.kernel.h.h(com.tencent.mm.plugin.messenger.foundation.a.h.class)).yK().b(this);
    }
    GMTrace.o(8499606061056L, 63327);
  }
  
  protected void bov()
  {
    GMTrace.i(8500679802880L, 63335);
    if (this.psT != 0L)
    {
      com.tencent.mm.kernel.h.xz();
      com.tencent.mm.kernel.h.xx().fYr.a(new com.tencent.mm.plugin.sns.model.w(this.psT, this.qfZ), 0);
    }
    getString(i.j.cUG);
    this.hsU = com.tencent.mm.ui.base.h.a(this, getString(i.j.pkM), true, new DialogInterface.OnCancelListener()
    {
      public final void onCancel(DialogInterface paramAnonymousDialogInterface)
      {
        GMTrace.i(8514101575680L, 63435);
        GMTrace.o(8514101575680L, 63435);
      }
    });
    GMTrace.o(8500679802880L, 63335);
  }
  
  protected List<String> bow()
  {
    GMTrace.i(8501216673792L, 63339);
    LinkedList localLinkedList = new LinkedList();
    s locals = ae.bjj().dW(this.psT);
    Object localObject = localLinkedList;
    if (locals.field_memberList != null)
    {
      localObject = localLinkedList;
      if (!locals.field_memberList.equals("")) {
        localObject = bg.g(locals.field_memberList.split(","));
      }
    }
    GMTrace.o(8501216673792L, 63339);
    return (List<String>)localObject;
  }
  
  public boolean dispatchKeyEvent(KeyEvent paramKeyEvent)
  {
    GMTrace.i(8500948238336L, 63337);
    if ((paramKeyEvent.getKeyCode() == 4) && (paramKeyEvent.getAction() == 0))
    {
      if (((this.qfZ + " " + bg.c(this.qfY, ",")).equals(this.eDW)) && (this.psT != 0L)) {
        finish();
      }
      for (;;)
      {
        GMTrace.o(8500948238336L, 63337);
        return true;
        com.tencent.mm.ui.base.h.a(this, i.j.pkD, i.j.cUG, new DialogInterface.OnClickListener()
        {
          public final void onClick(DialogInterface paramAnonymousDialogInterface, int paramAnonymousInt)
          {
            GMTrace.i(8315593555968L, 61956);
            SnsTagDetailUI.this.finish();
            GMTrace.o(8315593555968L, 61956);
          }
        }, null);
      }
    }
    boolean bool = super.dispatchKeyEvent(paramKeyEvent);
    GMTrace.o(8500948238336L, 63337);
    return bool;
  }
  
  protected void onActivityResult(int paramInt1, int paramInt2, Intent paramIntent)
  {
    GMTrace.i(8501619326976L, 63342);
    super.onActivityResult(paramInt1, paramInt2, paramIntent);
    if (paramInt2 != -1)
    {
      GMTrace.o(8501619326976L, 63342);
      return;
    }
    switch (paramInt1)
    {
    default: 
      GMTrace.o(8501619326976L, 63342);
      return;
    case 1: 
      if (paramIntent == null)
      {
        GMTrace.o(8501619326976L, 63342);
        return;
      }
      paramIntent = paramIntent.getStringExtra("Select_Contact");
      if (bg.nl(q.zE()).equals(paramIntent)) {
        paramInt2 = 1;
      }
      while (paramInt2 != 0)
      {
        com.tencent.mm.ui.base.h.b(this, getString(i.j.cQz, new Object[] { Integer.valueOf(0), Integer.valueOf(0) }), getString(i.j.cUG), true);
        GMTrace.o(8501619326976L, 63342);
        return;
        if (this.qfY == null)
        {
          paramInt2 = 0;
        }
        else
        {
          Iterator localIterator = this.qfY.iterator();
          paramInt1 = 0;
          paramInt2 = paramInt1;
          if (localIterator.hasNext())
          {
            if (!((String)localIterator.next()).equals(paramIntent)) {
              break label376;
            }
            paramInt1 = 1;
          }
        }
      }
    }
    label376:
    for (;;)
    {
      break;
      paramIntent = bg.g(paramIntent.split(","));
      if (paramIntent == null)
      {
        GMTrace.o(8501619326976L, 63342);
        return;
      }
      bF(paramIntent);
      while (((this.qfZ + " " + bg.c(this.qfY, ",")).equals(this.eDW)) && (this.psT != 0L))
      {
        lf(false);
        GMTrace.o(8501619326976L, 63342);
        return;
        paramIntent = paramIntent.getStringExtra("k_sns_tag_name");
        if (paramIntent != null) {
          this.qfZ = paramIntent;
        }
        anv();
        com.tencent.mm.sdk.platformtools.w.d("MicroMsg.SnsTagDetailUI", "updateName " + this.qfZ);
      }
      lf(true);
      GMTrace.o(8501619326976L, 63342);
      return;
    }
  }
  
  public void onCreate(Bundle paramBundle)
  {
    GMTrace.i(8499471843328L, 63326);
    super.onCreate(paramBundle);
    bot();
    this.scene = getIntent().getIntExtra("k_tag_detail_sns_block_scene", 0);
    this.psT = getIntent().getLongExtra("k_sns_tag_id", 0L);
    if (this.psT == 4L) {
      this.qfZ = getString(i.j.pkH);
    }
    while (this.psT == 0L)
    {
      Object localObject = getIntent().getStringExtra("k_sns_tag_list");
      this.qfZ = bg.aq(getIntent().getStringExtra("k_sns_tag_name"), "");
      paramBundle = ae.biR();
      String str1 = q.zE();
      localObject = bg.g(((String)localObject).split(","));
      if (localObject == null) {
        break label266;
      }
      localObject = ((List)localObject).iterator();
      while (((Iterator)localObject).hasNext())
      {
        String str2 = (String)((Iterator)localObject).next();
        if ((!this.qfY.contains(str2)) && (com.tencent.mm.l.a.eE(paramBundle.TE(str2).field_type)) && (!str1.equals(str2))) {
          this.qfY.add(str2);
        }
      }
      if (this.psT == 5L) {
        this.qfZ = getString(i.j.pkP);
      } else {
        this.qfZ = ae.bjj().dW(this.psT).field_tagName;
      }
    }
    this.qfY = bow();
    label266:
    if ((this.qfZ == null) || (this.qfZ.equals("")))
    {
      this.qfZ = getString(i.j.pkG);
      this.qfZ = ai.Hw(getString(i.j.pkG));
    }
    MP();
    bpu();
    anv();
    if (this.psT < 6L)
    {
      this.htU.VH("delete_tag_name");
      this.htU.VH("delete_tag_name_category");
      if (this.psT > 0L)
      {
        this.htU.VH("settings_tag_name");
        this.htU.VH("settings_tag_name_category");
      }
    }
    if (this.psT == 4L)
    {
      this.htU.VH("black");
      this.htU.VH("group");
      if (this.psT != 0L) {
        break label562;
      }
      lf(true);
    }
    for (;;)
    {
      this.eDW = (this.qfZ + " " + bg.c(this.qfY, ","));
      GMTrace.o(8499471843328L, 63326);
      return;
      if (this.psT == 5L)
      {
        this.htU.VH("outside");
        this.htU.VH("group");
        break;
      }
      this.htU.VH("black");
      this.htU.VH("outside");
      break;
      label562:
      lf(false);
    }
  }
  
  public void onDestroy()
  {
    GMTrace.i(8499740278784L, 63328);
    if (this.hsU != null) {
      this.hsU.dismiss();
    }
    bou();
    super.onDestroy();
    GMTrace.o(8499740278784L, 63328);
  }
  
  public void onResume()
  {
    GMTrace.i(8500142931968L, 63331);
    super.onResume();
    bpu();
    GMTrace.o(8500142931968L, 63331);
  }
  
  protected void uT(String paramString)
  {
    GMTrace.i(8501350891520L, 63340);
    if ((paramString == null) || (paramString.equals("")))
    {
      GMTrace.o(8501350891520L, 63340);
      return;
    }
    this.qfY.remove(paramString);
    if (this.jNs != null)
    {
      this.jNs.aQ(this.qfY);
      this.jNs.notifyChanged();
    }
    if ((this.qfY.size() == 0) && (this.jNs != null))
    {
      this.jNs.bLL();
      this.jNs.kf(true).kg(false);
      this.htU.notifyDataSetChanged();
    }
    for (;;)
    {
      anv();
      GMTrace.o(8501350891520L, 63340);
      return;
      if (this.jNs != null) {
        this.jNs.kf(true).kg(true);
      }
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes4-dex2jar.jar!\com\tencent\mm\plugin\sns\ui\SnsTagDetailUI.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */