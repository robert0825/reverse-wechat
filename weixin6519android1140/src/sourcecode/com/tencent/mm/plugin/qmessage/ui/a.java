package com.tencent.mm.plugin.qmessage.ui;

import android.app.ProgressDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.DialogInterface.OnCancelListener;
import android.content.Intent;
import android.widget.Toast;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.R.l;
import com.tencent.mm.R.o;
import com.tencent.mm.ad.k;
import com.tencent.mm.ad.n;
import com.tencent.mm.g.b.af;
import com.tencent.mm.platformtools.r;
import com.tencent.mm.plugin.qmessage.a.b;
import com.tencent.mm.plugin.qmessage.a.d;
import com.tencent.mm.plugin.qmessage.a.g;
import com.tencent.mm.pluginsdk.ui.preference.NormalUserHeaderPreference;
import com.tencent.mm.sdk.platformtools.ae;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.bh;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.storage.x;
import com.tencent.mm.ui.base.h;
import com.tencent.mm.ui.base.preference.Preference;
import com.tencent.mm.ui.base.preference.f;
import com.tencent.mm.y.at;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import junit.framework.Assert;

public final class a
  implements com.tencent.mm.ad.e, com.tencent.mm.pluginsdk.d.a
{
  public Context context;
  private ProgressDialog htG;
  private f htU;
  private x iBi;
  
  public a(Context paramContext)
  {
    GMTrace.i(8951517151232L, 66694);
    this.context = paramContext;
    GMTrace.o(8951517151232L, 66694);
  }
  
  private void ahK()
  {
    GMTrace.i(8951919804416L, 66697);
    Object localObject = g.aYk().EQ(this.iBi.field_username);
    if ((localObject == null) || (bg.nl(((d)localObject).getUsername()).length() <= 0))
    {
      w.e("MicroMsg.ContactWidgetQContact", "updateProfile : Qcontact is null");
      GMTrace.o(8951919804416L, 66697);
      return;
    }
    if (bg.nl(((d)localObject).aYi()).length() <= 0) {
      w.e("MicroMsg.ContactWidgetQContact", "updateProfile: QContact extInfo is null");
    }
    Preference localPreference4 = this.htU.VG("contact_info_qcontact_sex");
    Preference localPreference3 = this.htU.VG("contact_info_qcontact_age");
    Preference localPreference2 = this.htU.VG("contact_info_qcontact_birthday");
    Preference localPreference1 = this.htU.VG("contact_info_qcontact_address");
    a locala = new a();
    localObject = ((d)localObject).aYi();
    if (bg.nl((String)localObject).length() <= 0)
    {
      w.e("MicroMsg.ContactWidgetQContact", "QExtInfoContent : parse xml, but xml is null");
      if (localPreference4 != null)
      {
        if (locala.nRz != null) {
          break label558;
        }
        localObject = "";
        label173:
        localPreference4.setSummary((CharSequence)localObject);
      }
      if (localPreference3 != null)
      {
        if (locala.nRA != null) {
          break label567;
        }
        localObject = "";
        label195:
        localPreference3.setSummary((CharSequence)localObject);
      }
      if (localPreference2 != null)
      {
        if (locala.nRB != null) {
          break label576;
        }
        localObject = "";
        label216:
        localPreference2.setSummary((CharSequence)localObject);
      }
      if (localPreference1 != null) {
        if (locala.gEy != null) {
          break label585;
        }
      }
    }
    label558:
    label567:
    label576:
    label585:
    for (localObject = "";; localObject = locala.gEy)
    {
      localPreference1.setSummary((CharSequence)localObject);
      this.htU.notifyDataSetChanged();
      GMTrace.o(8951919804416L, 66697);
      return;
      localObject = bh.q((String)localObject, "extinfo");
      if (localObject != null)
      {
        locala.nRz = ((String)((Map)localObject).get(".extinfo.sex"));
        locala.nRA = ((String)((Map)localObject).get(".extinfo.age"));
        locala.nRB = ((String)((Map)localObject).get(".extinfo.bd"));
        locala.country = ((String)((Map)localObject).get(".extinfo.country"));
        locala.fjk = ((String)((Map)localObject).get(".extinfo.province"));
        locala.fjl = ((String)((Map)localObject).get(".extinfo.city"));
      }
      if ((locala.nRz != null) && (locala.nRz.equals("1"))) {}
      for (locala.nRz = locala.nRy.context.getString(R.l.ebq);; locala.nRz = locala.nRy.context.getString(R.l.ebp))
      {
        if (locala.country != null) {
          locala.gEy = (locala.gEy + locala.country + " ");
        }
        if (locala.fjk != null) {
          locala.gEy = (locala.gEy + locala.fjk + " ");
        }
        if (locala.fjl == null) {
          break;
        }
        locala.gEy += locala.fjl;
        break;
      }
      localObject = locala.nRz;
      break label173;
      localObject = locala.nRA;
      break label195;
      localObject = locala.nRB;
      break label216;
    }
  }
  
  public final void a(int paramInt1, int paramInt2, String paramString, k paramk)
  {
    int i = 1;
    GMTrace.i(8952188239872L, 66699);
    if (paramk.getType() != 140)
    {
      GMTrace.o(8952188239872L, 66699);
      return;
    }
    if (this.htG != null)
    {
      this.htG.dismiss();
      this.htG = null;
      switch (paramInt1)
      {
      default: 
        i = 0;
      }
      for (;;)
      {
        if (i == 0) {
          break label189;
        }
        GMTrace.o(8952188239872L, 66699);
        return;
        if (!r.hjx) {
          break;
        }
        Toast.makeText(this.context, this.context.getString(R.l.dwH, new Object[] { Integer.valueOf(1), Integer.valueOf(paramInt2) }), 3000).show();
        continue;
        if (!r.hjx) {
          break;
        }
        Toast.makeText(this.context, this.context.getString(R.l.dwI, new Object[] { Integer.valueOf(2), Integer.valueOf(paramInt2) }), 3000).show();
      }
    }
    label189:
    if ((paramInt1 == 0) && (paramInt2 == 0))
    {
      paramString = g.aYk().EQ(this.iBi.field_username);
      if ((paramString != null) && (bg.nl(paramString.getUsername()).length() > 0)) {
        break label269;
      }
      w.e("MicroMsg.ContactWidgetQContact", "resetUpdateStatus: did not find this QContact, username = " + this.iBi.field_username);
    }
    for (;;)
    {
      ahK();
      GMTrace.o(8952188239872L, 66699);
      return;
      label269:
      paramString.eQl = 8;
      paramString.nRm = 0;
      if (!g.aYk().a(this.iBi.field_username, paramString)) {
        w.e("MicroMsg.ContactWidgetQContact", "resetUpdateStatus: update Qcontact failed, username = " + this.iBi.field_username);
      }
    }
  }
  
  public final boolean a(final f paramf, x paramx, boolean paramBoolean, int paramInt)
  {
    boolean bool = false;
    GMTrace.i(8951785586688L, 66696);
    if (paramf != null)
    {
      paramBoolean = true;
      Assert.assertTrue(paramBoolean);
      if (paramx == null) {
        break label340;
      }
      paramBoolean = true;
      label28:
      Assert.assertTrue(paramBoolean);
      Assert.assertTrue(x.Tq(paramx.field_username));
      at.wS().a(140, this);
      this.iBi = paramx;
      this.htU = paramf;
      paramf.addPreferencesFromResource(R.o.eoE);
      paramf = (NormalUserHeaderPreference)paramf.VG("contact_info_header_normal");
      if (paramf != null)
      {
        paramf.tDu = "ContactWidgetQContact";
        paramf.a(paramx, 0, null);
      }
      ahK();
      paramx = g.aYk().EQ(this.iBi.field_username);
      if (paramx != null)
      {
        paramf = paramx;
        if (bg.nl(paramx.getUsername()).length() > 0) {}
      }
      else
      {
        w.e("MicroMsg.ContactWidgetQContact", "getProfileOrNot: QContact is null, should not in this way");
        paramf = new d();
        paramf.username = this.iBi.field_username;
        paramf.eQl = -1;
        g.aYk().a(paramf);
      }
      if (paramf.nRm == 1)
      {
        paramx = this.iBi.field_username;
        if (bg.nl(paramf.aYi()).length() > 0) {
          break label345;
        }
      }
    }
    label340:
    label345:
    for (paramInt = 1;; paramInt = 0)
    {
      paramBoolean = bool;
      if (bg.nl(paramx).length() > 0) {
        paramBoolean = true;
      }
      Assert.assertTrue(paramBoolean);
      paramf = new HashSet();
      paramf.add(paramx);
      paramf = new b(paramf);
      new ae().post(new Runnable()
      {
        public final void run()
        {
          GMTrace.i(8944000958464L, 66638);
          at.wS().a(paramf, 0);
          GMTrace.o(8944000958464L, 66638);
        }
      });
      if (paramInt != 0)
      {
        paramx = this.context;
        this.context.getString(R.l.cUG);
        this.htG = h.a(paramx, this.context.getString(R.l.cTt), true, new DialogInterface.OnCancelListener()
        {
          public final void onCancel(DialogInterface paramAnonymousDialogInterface)
          {
            GMTrace.i(8950309191680L, 66685);
            at.wS().c(paramf);
            GMTrace.o(8950309191680L, 66685);
          }
        });
      }
      GMTrace.o(8951785586688L, 66696);
      return true;
      paramBoolean = false;
      break;
      paramBoolean = false;
      break label28;
    }
  }
  
  public final boolean ahL()
  {
    GMTrace.i(8952054022144L, 66698);
    at.wS().b(140, this);
    NormalUserHeaderPreference localNormalUserHeaderPreference = (NormalUserHeaderPreference)this.htU.VG("contact_info_header_normal");
    if (localNormalUserHeaderPreference != null) {
      localNormalUserHeaderPreference.onDetach();
    }
    GMTrace.o(8952054022144L, 66698);
    return true;
  }
  
  public final void onActivityResult(int paramInt1, int paramInt2, Intent paramIntent)
  {
    GMTrace.i(8952322457600L, 66700);
    GMTrace.o(8952322457600L, 66700);
  }
  
  public final boolean tF(String paramString)
  {
    GMTrace.i(8951651368960L, 66695);
    GMTrace.o(8951651368960L, 66695);
    return true;
  }
  
  public final class a
  {
    String country;
    String fjk;
    String fjl;
    String gEy;
    String nRA;
    String nRB;
    String nRz;
    
    public a()
    {
      GMTrace.i(8948161708032L, 66669);
      this.nRz = "";
      this.nRA = "";
      this.gEy = "";
      this.nRB = "";
      this.country = "";
      this.fjl = "";
      this.fjk = "";
      GMTrace.o(8948161708032L, 66669);
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\plugin\qmessage\ui\a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */