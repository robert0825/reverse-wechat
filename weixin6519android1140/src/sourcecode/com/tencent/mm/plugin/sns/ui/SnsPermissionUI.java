package com.tencent.mm.plugin.sns.ui;

import android.content.DialogInterface;
import android.content.DialogInterface.OnCancelListener;
import android.content.Intent;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.MenuItem;
import android.view.MenuItem.OnMenuItemClickListener;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.ad.e;
import com.tencent.mm.ad.k;
import com.tencent.mm.ad.n;
import com.tencent.mm.g.a.pj;
import com.tencent.mm.g.a.pu;
import com.tencent.mm.g.b.af;
import com.tencent.mm.kernel.b;
import com.tencent.mm.plugin.sns.i.j;
import com.tencent.mm.plugin.sns.i.m;
import com.tencent.mm.plugin.sns.model.ae;
import com.tencent.mm.plugin.sns.model.v;
import com.tencent.mm.plugin.sns.storage.t;
import com.tencent.mm.pluginsdk.l;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.storage.ar;
import com.tencent.mm.storage.x;
import com.tencent.mm.ui.base.preference.CheckBoxPreference;
import com.tencent.mm.ui.base.preference.MMPreference;
import com.tencent.mm.ui.base.preference.Preference;
import com.tencent.mm.ui.base.preference.f;
import com.tencent.mm.ui.base.r;
import java.util.LinkedList;
import java.util.List;

public class SnsPermissionUI
  extends MMPreference
  implements e
{
  public r hsU;
  private f htU;
  private boolean qdI;
  private x qdJ;
  private boolean qdK;
  private boolean qdL;
  private long qdM;
  private int scene;
  private String userName;
  
  public SnsPermissionUI()
  {
    GMTrace.i(8472628297728L, 63126);
    this.hsU = null;
    this.userName = "";
    this.qdI = false;
    this.qdJ = null;
    this.qdK = false;
    this.qdL = false;
    this.qdM = 0L;
    this.scene = 0;
    GMTrace.o(8472628297728L, 63126);
  }
  
  private static boolean Jg(String paramString)
  {
    GMTrace.i(8473567821824L, 63133);
    com.tencent.mm.plugin.sns.storage.s locals = ae.bjj().dW(5L);
    if (bg.nm(locals.field_memberList))
    {
      GMTrace.o(8473567821824L, 63133);
      return false;
    }
    boolean bool = bg.g(locals.field_memberList.split(",")).contains(paramString);
    GMTrace.o(8473567821824L, 63133);
    return bool;
  }
  
  private void beH()
  {
    GMTrace.i(8473433604096L, 63132);
    com.tencent.mm.kernel.h.xz();
    this.qdJ = ((com.tencent.mm.plugin.messenger.foundation.a.h)com.tencent.mm.kernel.h.h(com.tencent.mm.plugin.messenger.foundation.a.h.class)).yK().TE(this.userName);
    this.qdJ.setUsername(this.userName);
    boolean bool1 = this.qdJ.ve();
    boolean bool2 = Jg(this.userName);
    CheckBoxPreference localCheckBoxPreference = (CheckBoxPreference)this.htU.VG("sns_outside_permiss");
    localCheckBoxPreference.sdM = bool1;
    int i = this.qdJ.fja;
    w.d("MicroMsg.SnsPermissionUI", "sex:%d", new Object[] { Integer.valueOf(i) });
    if (i == 1)
    {
      localCheckBoxPreference.setTitle(i.j.pkh);
      localCheckBoxPreference = (CheckBoxPreference)this.htU.VG("sns_black_permiss");
      if (i != 1) {
        break label220;
      }
      localCheckBoxPreference.setTitle(i.j.piI);
    }
    for (;;)
    {
      localCheckBoxPreference.sdM = bool2;
      if (!com.tencent.mm.l.a.eE(this.qdJ.field_type)) {
        this.htU.VH("sns_black_permiss");
      }
      this.htU.notifyDataSetChanged();
      GMTrace.o(8473433604096L, 63132);
      return;
      if (i != 2) {
        break;
      }
      localCheckBoxPreference.setTitle(i.j.pkg);
      break;
      label220:
      if (i == 2) {
        localCheckBoxPreference.setTitle(i.j.piH);
      }
    }
  }
  
  protected final void MP()
  {
    GMTrace.i(8473299386368L, 63131);
    this.htU = this.wky;
    oM(i.j.pki);
    a(new MenuItem.OnMenuItemClickListener()
    {
      public final boolean onMenuItemClick(MenuItem paramAnonymousMenuItem)
      {
        GMTrace.i(8714085990400L, 64925);
        SnsPermissionUI.this.aLo();
        SnsPermissionUI.this.setResult(-1, new Intent());
        SnsPermissionUI.this.finish();
        GMTrace.o(8714085990400L, 64925);
        return true;
      }
    });
    beH();
    GMTrace.o(8473299386368L, 63131);
  }
  
  public final int QI()
  {
    GMTrace.i(8473165168640L, 63130);
    int i = i.m.plJ;
    GMTrace.o(8473165168640L, 63130);
    return i;
  }
  
  public final void a(int paramInt1, int paramInt2, String paramString, k paramk)
  {
    GMTrace.i(8473702039552L, 63134);
    w.i("MicroMsg.SnsPermissionUI", "onSceneEnd: errType = " + paramInt1 + " errCode = " + paramInt2 + " errMsg = " + paramString + " " + paramk.getType());
    if (paramk.getType() == 291)
    {
      paramString = new StringBuilder("tipDialog ");
      if (this.hsU != null) {
        break label156;
      }
    }
    label156:
    for (boolean bool = true;; bool = false)
    {
      w.d("MicroMsg.SnsPermissionUI", bool);
      if (this.hsU != null)
      {
        this.hsU.dismiss();
        this.hsU = null;
      }
      beH();
      if (this.qdK) {
        this.qdL = true;
      }
      GMTrace.o(8473702039552L, 63134);
      return;
    }
  }
  
  public final boolean a(final f paramf, Preference paramPreference)
  {
    GMTrace.i(8473836257280L, 63135);
    paramf = paramPreference.hiu;
    if (paramf.equals("sns_outside_permiss"))
    {
      paramf = new pu();
      paramf.eUx.eUz = true;
      paramf.eUx.eUy = false;
      paramf.eUx.username = this.userName;
      com.tencent.mm.sdk.b.a.vgX.m(paramf);
      if (this.qdJ.ve()) {
        com.tencent.mm.y.s.k(this.qdJ);
      }
      for (;;)
      {
        GMTrace.o(8473836257280L, 63135);
        return true;
        com.tencent.mm.y.s.j(this.qdJ);
      }
    }
    if (paramf.equals("sns_black_permiss"))
    {
      paramf = new pu();
      paramf.eUx.eUz = false;
      paramf.eUx.eUy = true;
      paramf.eUx.username = this.userName;
      com.tencent.mm.sdk.b.a.vgX.m(paramf);
      boolean bool = Jg(this.userName);
      paramf = this.userName;
      int i;
      if (bool)
      {
        i = 2;
        if ((i != 1) || (5L != 5L)) {
          break label304;
        }
        this.qdK = true;
      }
      for (this.qdL = false;; this.qdL = false)
      {
        paramPreference = new LinkedList();
        paramPreference.add(paramf);
        paramf = new v(i, 5L, "", paramPreference.size(), paramPreference, this.scene);
        com.tencent.mm.kernel.h.xz();
        com.tencent.mm.kernel.h.xx().fYr.a(paramf, 0);
        getString(i.j.cUG);
        this.hsU = com.tencent.mm.ui.base.h.a(this, getString(i.j.pkM), true, new DialogInterface.OnCancelListener()
        {
          public final void onCancel(DialogInterface paramAnonymousDialogInterface)
          {
            GMTrace.i(8551011450880L, 63710);
            SnsPermissionUI.a(SnsPermissionUI.this);
            com.tencent.mm.kernel.h.xz();
            com.tencent.mm.kernel.h.xx().fYr.c(paramf);
            GMTrace.o(8551011450880L, 63710);
          }
        });
        GMTrace.o(8473836257280L, 63135);
        return true;
        i = 1;
        break;
        label304:
        this.qdK = false;
      }
    }
    GMTrace.o(8473836257280L, 63135);
    return false;
  }
  
  public boolean dispatchKeyEvent(KeyEvent paramKeyEvent)
  {
    GMTrace.i(8472896733184L, 63128);
    if ((paramKeyEvent.getKeyCode() == 4) && (paramKeyEvent.getAction() == 0))
    {
      w.d("MicroMsg.SnsPermissionUI", "dispatchKeyEvent");
      setResult(-1, new Intent());
      finish();
      GMTrace.o(8472896733184L, 63128);
      return true;
    }
    boolean bool = super.dispatchKeyEvent(paramKeyEvent);
    GMTrace.o(8472896733184L, 63128);
    return bool;
  }
  
  public void onCreate(Bundle paramBundle)
  {
    GMTrace.i(8472762515456L, 63127);
    super.onCreate(paramBundle);
    com.tencent.mm.kernel.h.xz();
    com.tencent.mm.kernel.h.xx().fYr.a(291, this);
    this.userName = getIntent().getStringExtra("sns_permission_userName");
    this.qdI = getIntent().getBooleanExtra("sns_permission_anim", false);
    this.qdM = getIntent().getLongExtra("sns_permission_snsinfo_svr_id", 0L);
    this.scene = getIntent().getIntExtra("sns_permission_block_scene", 0);
    w.d("MicroMsg.SnsPermissionUI", "SnsPermissionUI, scene:%d", new Object[] { Integer.valueOf(this.scene) });
    com.tencent.mm.kernel.h.xz();
    this.qdJ = ((com.tencent.mm.plugin.messenger.foundation.a.h)com.tencent.mm.kernel.h.h(com.tencent.mm.plugin.messenger.foundation.a.h.class)).yK().TE(this.userName);
    if (this.qdJ == null)
    {
      w.e("MicroMsg.SnsPermissionUI", "the error cause by get contact by %s", new Object[] { this.userName });
      finish();
    }
    this.qdJ.setUsername(this.userName);
    MP();
    GMTrace.o(8472762515456L, 63127);
  }
  
  public void onDestroy()
  {
    GMTrace.i(8473030950912L, 63129);
    super.onDestroy();
    com.tencent.mm.plugin.sns.c.a.hnI.pr();
    com.tencent.mm.kernel.h.xz();
    com.tencent.mm.kernel.h.xx().fYr.b(291, this);
    if ((this.qdM != 0L) && (this.qdM != -1L))
    {
      pj localpj = new pj();
      localpj.eUi.eUj = this.qdL;
      localpj.eUi.eJl = this.qdM;
      com.tencent.mm.sdk.b.a.vgX.m(localpj);
    }
    GMTrace.o(8473030950912L, 63129);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\plugin\sns\ui\SnsPermissionUI.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */