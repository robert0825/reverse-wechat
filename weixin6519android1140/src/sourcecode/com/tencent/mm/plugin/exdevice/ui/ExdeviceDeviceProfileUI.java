package com.tencent.mm.plugin.exdevice.ui;

import android.content.DialogInterface;
import android.content.DialogInterface.OnCancelListener;
import android.content.Intent;
import android.content.res.Resources;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.MenuItem.OnMenuItemClickListener;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.TextView;
import android.widget.Toast;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.R.l;
import com.tencent.mm.R.o;
import com.tencent.mm.ad.k;
import com.tencent.mm.ad.n;
import com.tencent.mm.bj.d;
import com.tencent.mm.g.a.ct;
import com.tencent.mm.g.a.ct.b;
import com.tencent.mm.g.b.af;
import com.tencent.mm.g.b.bp;
import com.tencent.mm.plugin.exdevice.model.ad;
import com.tencent.mm.plugin.exdevice.model.l;
import com.tencent.mm.plugin.exdevice.model.y;
import com.tencent.mm.protocal.c.agx;
import com.tencent.mm.sdk.platformtools.aj;
import com.tencent.mm.sdk.platformtools.aj.a;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.storage.ar;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.base.h.b;
import com.tencent.mm.ui.base.preference.KeyValuePreference;
import com.tencent.mm.ui.base.preference.MMPreference;
import com.tencent.mm.ui.base.preference.Preference;
import com.tencent.mm.ui.base.r;
import com.tencent.mm.ui.p;
import com.tencent.mm.y.at;
import java.util.Iterator;
import java.util.List;

public class ExdeviceDeviceProfileUI
  extends MMPreference
  implements com.tencent.mm.ad.e
{
  private String aKJ;
  private r ihl;
  private String kEZ;
  private String kEa;
  private String kEs;
  private int kFY;
  private String kFa;
  private r kGg;
  private String kHd;
  private String kHe;
  private boolean kHf;
  private String kHg;
  private boolean kHh;
  private String kHi;
  private h.b kHj;
  private String kyK;
  private String kyL;
  private long kzU;
  
  public ExdeviceDeviceProfileUI()
  {
    GMTrace.i(11057393303552L, 82384);
    this.kGg = null;
    GMTrace.o(11057393303552L, 82384);
  }
  
  private void a(DeviceProfileHeaderPreference paramDeviceProfileHeaderPreference)
  {
    GMTrace.i(11057795956736L, 82387);
    String str;
    if (bg.nm(this.kEZ))
    {
      str = this.kyK;
      if (bg.nm(this.kHe)) {
        break label120;
      }
      paramDeviceProfileHeaderPreference.setName(this.kHe);
      paramDeviceProfileHeaderPreference.wW(getString(R.l.drl, new Object[] { str }));
      paramDeviceProfileHeaderPreference.w(3, true);
      paramDeviceProfileHeaderPreference.w(4, true);
      paramDeviceProfileHeaderPreference.w(1, false);
    }
    for (;;)
    {
      str = this.kEs;
      paramDeviceProfileHeaderPreference.kEs = str;
      if (paramDeviceProfileHeaderPreference.kEp != null) {
        paramDeviceProfileHeaderPreference.kEp.setText(str);
      }
      GMTrace.o(11057795956736L, 82387);
      return;
      str = this.kEZ;
      break;
      label120:
      paramDeviceProfileHeaderPreference.setName(str);
      paramDeviceProfileHeaderPreference.wW("");
      paramDeviceProfileHeaderPreference.w(3, false);
      paramDeviceProfileHeaderPreference.w(4, false);
      paramDeviceProfileHeaderPreference.w(1, this.kHf);
    }
  }
  
  private void auE()
  {
    GMTrace.i(11057661739008L, 82386);
    com.tencent.mm.ui.base.preference.h localh = this.wky;
    Object localObject = (DeviceProfileHeaderPreference)localh.VG("device_profile_header");
    ((DeviceProfileHeaderPreference)localObject).a(1, new View.OnClickListener()
    {
      public final void onClick(View paramAnonymousView)
      {
        GMTrace.i(11105577467904L, 82743);
        com.tencent.mm.ui.base.h.a(ExdeviceDeviceProfileUI.this, ExdeviceDeviceProfileUI.this.getString(R.l.drq), "", "", 50, ExdeviceDeviceProfileUI.e(ExdeviceDeviceProfileUI.this));
        GMTrace.o(11105577467904L, 82743);
      }
    });
    ((DeviceProfileHeaderPreference)localObject).a(4, new View.OnClickListener()
    {
      public final void onClick(View paramAnonymousView)
      {
        GMTrace.i(10997397979136L, 81937);
        com.tencent.mm.ui.base.h.a(ExdeviceDeviceProfileUI.this, ExdeviceDeviceProfileUI.this.getString(R.l.drq), ExdeviceDeviceProfileUI.d(ExdeviceDeviceProfileUI.this), "", 50, ExdeviceDeviceProfileUI.e(ExdeviceDeviceProfileUI.this));
        GMTrace.o(10997397979136L, 81937);
      }
    });
    a((DeviceProfileHeaderPreference)localObject);
    ((DeviceProfileHeaderPreference)localObject).cS(this.kHg);
    localObject = (KeyValuePreference)localh.VG("message_manage");
    KeyValuePreference localKeyValuePreference1 = (KeyValuePreference)localh.VG("connect_setting");
    KeyValuePreference localKeyValuePreference2 = (KeyValuePreference)localh.VG("user_list");
    ((KeyValuePreference)localObject).lP(true);
    localKeyValuePreference1.lP(true);
    localKeyValuePreference2.lP(true);
    localh.bc("message_manage", true);
    localh.bc("connect_setting", true);
    localh.bc("user_list", true);
    boolean bool;
    if (this.kHh)
    {
      localh.bc("sub_device_desc", false);
      localh.VG("sub_device_desc").setTitle(getResources().getString(R.l.drZ, new Object[] { this.kHi }));
      localh.bc("bind_device", true);
      bool = true;
    }
    for (;;)
    {
      localh.bc("unbind_device", bool);
      if (bg.nm(this.kHd)) {
        localh.bc("open_device_panel", true);
      }
      GMTrace.o(11057661739008L, 82386);
      return;
      localh.bc("sub_device_desc", true);
      localh.bc("bind_device", this.kHf);
      if (!this.kHf) {
        bool = true;
      } else {
        bool = false;
      }
    }
  }
  
  private void auF()
  {
    GMTrace.i(11058601263104L, 82393);
    runOnUiThread(new Runnable()
    {
      public final void run()
      {
        GMTrace.i(11015651590144L, 82073);
        com.tencent.mm.ui.base.h.b(ExdeviceDeviceProfileUI.this, ExdeviceDeviceProfileUI.this.getString(R.l.dqG), ExdeviceDeviceProfileUI.this.getString(R.l.cUG), true);
        GMTrace.o(11015651590144L, 82073);
      }
    });
    GMTrace.o(11058601263104L, 82393);
  }
  
  private void auG()
  {
    GMTrace.i(11058735480832L, 82394);
    runOnUiThread(new Runnable()
    {
      public final void run()
      {
        GMTrace.i(11064775278592L, 82439);
        ExdeviceDeviceProfileUI localExdeviceDeviceProfileUI = ExdeviceDeviceProfileUI.this;
        ExdeviceDeviceProfileUI.this.getString(R.l.cUG);
        new aj(new aj.a()
        {
          public final boolean pM()
          {
            GMTrace.i(11092021477376L, 82642);
            ExdeviceDeviceProfileUI.this.runOnUiThread(new Runnable()
            {
              public final void run()
              {
                GMTrace.i(11053903642624L, 82358);
                ExdeviceDeviceProfileUI.4.1.this.jrr.dismiss();
                GMTrace.o(11053903642624L, 82358);
              }
            });
            GMTrace.o(11092021477376L, 82642);
            return true;
          }
        }, false).z(1000L, 1000L);
        GMTrace.o(11064775278592L, 82439);
      }
    });
    GMTrace.o(11058735480832L, 82394);
  }
  
  private void auy()
  {
    GMTrace.i(11058467045376L, 82392);
    runOnUiThread(new Runnable()
    {
      public final void run()
      {
        GMTrace.i(11097255968768L, 82681);
        if ((ExdeviceDeviceProfileUI.g(ExdeviceDeviceProfileUI.this) != null) && (ExdeviceDeviceProfileUI.g(ExdeviceDeviceProfileUI.this).isShowing())) {
          ExdeviceDeviceProfileUI.g(ExdeviceDeviceProfileUI.this).dismiss();
        }
        if ((ExdeviceDeviceProfileUI.h(ExdeviceDeviceProfileUI.this) != null) && (ExdeviceDeviceProfileUI.h(ExdeviceDeviceProfileUI.this).isShowing())) {
          ExdeviceDeviceProfileUI.h(ExdeviceDeviceProfileUI.this).dismiss();
        }
        GMTrace.o(11097255968768L, 82681);
      }
    });
    GMTrace.o(11058467045376L, 82392);
  }
  
  private void f(com.tencent.mm.plugin.exdevice.h.b paramb)
  {
    GMTrace.i(11058332827648L, 82391);
    if (paramb != null)
    {
      this.kyL = paramb.field_deviceID;
      this.kEa = paramb.field_deviceType;
      this.kHe = bg.nl(paramb.fsF);
      this.kEZ = bg.nl(paramb.fsG);
      this.kyK = bg.nl(paramb.field_brandName);
      this.kEs = bg.nl(paramb.fsH);
      this.kHg = bg.nl(paramb.iconUrl);
      this.kHd = bg.nl(paramb.jumpUrl);
    }
    GMTrace.o(11058332827648L, 82391);
  }
  
  private void j(final k paramk)
  {
    GMTrace.i(11058869698560L, 82395);
    runOnUiThread(new Runnable()
    {
      public final void run()
      {
        GMTrace.i(11015920025600L, 82075);
        ExdeviceDeviceProfileUI.a(ExdeviceDeviceProfileUI.this, com.tencent.mm.ui.base.h.a(ExdeviceDeviceProfileUI.this.vKB.vKW, ExdeviceDeviceProfileUI.this.getString(R.l.cUV), true, new DialogInterface.OnCancelListener()
        {
          public final void onCancel(DialogInterface paramAnonymous2DialogInterface)
          {
            GMTrace.i(11014175195136L, 82062);
            at.wS().c(ExdeviceDeviceProfileUI.5.this.ezf);
            GMTrace.o(11014175195136L, 82062);
          }
        }));
        GMTrace.o(11015920025600L, 82075);
      }
    });
    GMTrace.o(11058869698560L, 82395);
  }
  
  public final int QI()
  {
    GMTrace.i(11057930174464L, 82388);
    int i = R.o.eoO;
    GMTrace.o(11057930174464L, 82388);
    return i;
  }
  
  public final void a(int paramInt1, int paramInt2, String paramString, k paramk)
  {
    GMTrace.i(11058198609920L, 82390);
    w.d("MicroMsg.ExdeviceDeviceProfileUI", "onSceneEnd errType = %d, errCode = %d ,errMsg = %s", new Object[] { Integer.valueOf(paramInt1), Integer.valueOf(paramInt2), paramString });
    if (paramk == null)
    {
      w.e("MicroMsg.ExdeviceDeviceProfileUI", "scene is null.");
      GMTrace.o(11058198609920L, 82390);
      return;
    }
    w.d("MicroMsg.ExdeviceDeviceProfileUI", "type = %s", new Object[] { Integer.valueOf(paramk.getType()) });
    if ((paramk instanceof l))
    {
      auy();
      at.wS().b(paramk.getType(), this);
      if ((paramInt1 != 0) || (paramInt2 != 0))
      {
        w.e("MicroMsg.ExdeviceDeviceProfileUI", "onSceneEnd error(%d, %d, %s).(type : %d)", new Object[] { Integer.valueOf(paramInt2), Integer.valueOf(paramInt1), paramString, Integer.valueOf(paramk.getType()) });
        auF();
        GMTrace.o(11058198609920L, 82390);
        return;
      }
      auG();
      f(ad.atR().bY(this.kyL, this.kEa));
      runOnUiThread(new Runnable()
      {
        public final void run()
        {
          GMTrace.i(11080344535040L, 82555);
          ExdeviceDeviceProfileUI.a(ExdeviceDeviceProfileUI.this, true);
          ExdeviceDeviceProfileUI.f(ExdeviceDeviceProfileUI.this);
          ExdeviceDeviceProfileUI.this.wky.notifyDataSetChanged();
          GMTrace.o(11080344535040L, 82555);
        }
      });
      GMTrace.o(11058198609920L, 82390);
      return;
    }
    if ((paramk instanceof com.tencent.mm.plugin.exdevice.model.m))
    {
      auy();
      at.wS().b(paramk.getType(), this);
      com.tencent.mm.plugin.exdevice.h.b localb = ad.atR().bR(com.tencent.mm.plugin.exdevice.j.b.xh(this.aKJ));
      if ((paramInt1 != 0) || (paramInt2 != 0) || (localb == null))
      {
        w.e("MicroMsg.ExdeviceDeviceProfileUI", "onSceneEnd error(%d, %d, %s).(type : %d)", new Object[] { Integer.valueOf(paramInt2), Integer.valueOf(paramInt1), paramString, Integer.valueOf(paramk.getType()) });
        auF();
        GMTrace.o(11058198609920L, 82390);
        return;
      }
      f(localb);
      runOnUiThread(new Runnable()
      {
        public final void run()
        {
          GMTrace.i(11004645736448L, 81991);
          ExdeviceDeviceProfileUI.a(ExdeviceDeviceProfileUI.this, true);
          ExdeviceDeviceProfileUI.f(ExdeviceDeviceProfileUI.this);
          ExdeviceDeviceProfileUI.this.wky.notifyDataSetChanged();
          GMTrace.o(11004645736448L, 81991);
        }
      });
      auG();
      GMTrace.o(11058198609920L, 82390);
      return;
    }
    if ((paramk instanceof y))
    {
      auy();
      at.wS().b(1263, this);
      if ((paramInt1 != 0) || (paramInt2 != 0))
      {
        w.e("MicroMsg.ExdeviceDeviceProfileUI", "onSceneEnd error(%d, %d, %s).(type : %d)", new Object[] { Integer.valueOf(paramInt2), Integer.valueOf(paramInt1), paramString, Integer.valueOf(paramk.getType()) });
        Toast.makeText(this.vKB.vKW, getString(R.l.drp), 1).show();
        GMTrace.o(11058198609920L, 82390);
        return;
      }
      this.kHe = ((y)paramk).fsF;
      runOnUiThread(new Runnable()
      {
        public final void run()
        {
          GMTrace.i(11077660180480L, 82535);
          ExdeviceDeviceProfileUI.a(ExdeviceDeviceProfileUI.this, (DeviceProfileHeaderPreference)ExdeviceDeviceProfileUI.this.wky.VG("device_profile_header"));
          GMTrace.o(11077660180480L, 82535);
        }
      });
      paramString = ad.atR().bY(this.kyL, this.kEa);
      if (paramString == null)
      {
        w.i("MicroMsg.ExdeviceDeviceProfileUI", "hard device info is null.(deviceId:%s, deviceType:%s)", new Object[] { this.kyL, this.kEa });
        GMTrace.o(11058198609920L, 82390);
        return;
      }
      paramString.ci(this.kHe);
      ad.atR().c(paramString, new String[0]);
      GMTrace.o(11058198609920L, 82390);
      return;
    }
    if ((paramk instanceof com.tencent.mm.plugin.exdevice.model.x))
    {
      auy();
      if ((paramInt1 != 0) || (paramInt2 != 0))
      {
        w.e("MicroMsg.ExdeviceDeviceProfileUI", "onSceneEnd, unbind failed (%d, %d, %s).(type : %d)", new Object[] { Integer.valueOf(paramInt2), Integer.valueOf(paramInt1), paramString, Integer.valueOf(paramk.getType()) });
        runOnUiThread(new Runnable()
        {
          public final void run()
          {
            GMTrace.i(11093095219200L, 82650);
            Toast.makeText(ExdeviceDeviceProfileUI.this.vKB.vKW, R.l.dsa, 1).show();
            GMTrace.o(11093095219200L, 82650);
          }
        });
        GMTrace.o(11058198609920L, 82390);
        return;
      }
      runOnUiThread(new Runnable()
      {
        public final void run()
        {
          GMTrace.i(11031891935232L, 82194);
          ExdeviceDeviceProfileUI.a(ExdeviceDeviceProfileUI.this, null);
          ExdeviceDeviceProfileUI.a(ExdeviceDeviceProfileUI.this, false);
          ExdeviceDeviceProfileUI.f(ExdeviceDeviceProfileUI.this);
          ExdeviceDeviceProfileUI.this.wky.notifyDataSetChanged();
          GMTrace.o(11031891935232L, 82194);
        }
      });
      finish();
    }
    GMTrace.o(11058198609920L, 82390);
  }
  
  public final boolean a(final com.tencent.mm.ui.base.preference.f paramf, Preference paramPreference)
  {
    GMTrace.i(11058064392192L, 82389);
    w.d("MicroMsg.ExdeviceDeviceProfileUI", "onPreferenceTreeClcik.(key : %s)", new Object[] { paramPreference.hiu });
    if ("bind_device".equals(paramPreference.hiu)) {
      if (bg.nm(this.kFa))
      {
        w.i("MicroMsg.ExdeviceDeviceProfileUI", "Do unauth bind device.");
        paramf = new com.tencent.mm.plugin.exdevice.model.m(com.tencent.mm.plugin.exdevice.j.b.xh(this.aKJ), this.kyK, "3", this.kzU);
        j(paramf);
        at.wS().a(1262, this);
        at.wS().a(paramf, 0);
      }
    }
    do
    {
      for (;;)
      {
        GMTrace.o(11058064392192L, 82389);
        return true;
        w.i("MicroMsg.ExdeviceDeviceProfileUI", "Do normal bind device.");
        paramf = this.kFa;
        int i = this.kFY;
        at.wS().a(536, this);
        paramPreference = new ct();
        paramPreference.eEc.eEe = paramf;
        paramPreference.eEc.opType = 1;
        paramPreference.eEc.eEf = i;
        com.tencent.mm.sdk.b.a.vgX.m(paramPreference);
        paramf = paramPreference.eEd.eEg;
        getString(R.l.cUG);
        this.kGg = com.tencent.mm.ui.base.h.a(this, getString(R.l.dqN), true, new DialogInterface.OnCancelListener()
        {
          public final void onCancel(DialogInterface paramAnonymousDialogInterface)
          {
            GMTrace.i(11106114338816L, 82747);
            at.wS().b(536, ExdeviceDeviceProfileUI.this);
            paramAnonymousDialogInterface = new ct();
            paramAnonymousDialogInterface.eEc.opType = 2;
            paramAnonymousDialogInterface.eEc.eEg = paramf;
            com.tencent.mm.sdk.b.a.vgX.m(paramAnonymousDialogInterface);
            GMTrace.o(11106114338816L, 82747);
          }
        });
        continue;
        if ("unbind_device".equals(paramPreference.hiu))
        {
          paramf = new agx();
          paramf.jhl = this.kyL;
          paramf.tSz = this.kEa;
          paramPreference = ad.atR().bY(this.kyL, this.kEa);
          if (paramPreference != null)
          {
            paramPreference = paramPreference.fsO;
            if ((paramPreference != null) && (paramPreference.length() > 0))
            {
              paramPreference = paramPreference.split(",");
              i = 0;
              while (i < paramPreference.length)
              {
                ad.atR().ca(paramPreference[i], this.kEa);
                i += 1;
              }
            }
          }
          paramf = new com.tencent.mm.plugin.exdevice.model.x(paramf, 2);
          j(paramf);
          at.wS().a(537, this);
          at.wS().a(paramf, 0);
        }
        else if ("open_device_panel".equals(paramPreference.hiu))
        {
          com.tencent.mm.plugin.exdevice.model.f.S(this.vKB.vKW, this.kHd);
        }
        else
        {
          if (!"contact_info_biz_go_chatting".equals(paramPreference.hiu)) {
            break;
          }
          at.AR();
          paramf = com.tencent.mm.y.c.yK().TE(this.kyK);
          paramPreference = new Intent();
          paramPreference.putExtra("device_id", this.kyL);
          paramPreference.putExtra("device_type", this.kEa);
          paramPreference.putExtra("KIsHardDevice", true);
          paramPreference.putExtra("KHardDeviceBindTicket", this.kFa);
          if (paramf != null) {
            if ((com.tencent.mm.l.a.eE(paramf.field_type)) && (paramf.bSA()))
            {
              com.tencent.mm.af.x.FG().iC(paramf.field_username);
              paramPreference.putExtra("Chat_User", this.kyK);
              paramPreference.putExtra("finish_direct", true);
              com.tencent.mm.plugin.exdevice.a.kwJ.e(paramPreference, this.vKB.vKW);
            }
            else
            {
              paramPreference.putExtra("Contact_User", this.kyK);
              paramPreference.putExtra("force_get_contact", true);
              d.b(this.vKB.vKW, "profile", ".ui.ContactInfoUI", paramPreference);
            }
          }
        }
      }
    } while (("message_manage".equals(paramPreference.hiu)) || ("connect_setting".equals(paramPreference.hiu)) || ("user_list".equals(paramPreference.hiu)));
    GMTrace.o(11058064392192L, 82389);
    return false;
  }
  
  public void onCreate(Bundle paramBundle)
  {
    int i = 0;
    GMTrace.i(11057527521280L, 82385);
    super.onCreate(paramBundle);
    a(new MenuItem.OnMenuItemClickListener()
    {
      public final boolean onMenuItemClick(MenuItem paramAnonymousMenuItem)
      {
        GMTrace.i(11069741334528L, 82476);
        ExdeviceDeviceProfileUI.this.finish();
        GMTrace.o(11069741334528L, 82476);
        return false;
      }
    });
    oM(R.l.dqL);
    this.kHj = new h.b()
    {
      public final boolean v(CharSequence paramAnonymousCharSequence)
      {
        GMTrace.i(11106382774272L, 82749);
        w.d("MicroMsg.ExdeviceDeviceProfileUI", "result : %s.", new Object[] { paramAnonymousCharSequence });
        String str = "";
        if (paramAnonymousCharSequence != null) {
          str = paramAnonymousCharSequence.toString();
        }
        if (ExdeviceDeviceProfileUI.a(ExdeviceDeviceProfileUI.this))
        {
          ExdeviceDeviceProfileUI.a(ExdeviceDeviceProfileUI.this, str);
          ExdeviceDeviceProfileUI.this.runOnUiThread(new Runnable()
          {
            public final void run()
            {
              GMTrace.i(11104503726080L, 82735);
              ExdeviceDeviceProfileUI.a(ExdeviceDeviceProfileUI.this, (DeviceProfileHeaderPreference)ExdeviceDeviceProfileUI.this.wky.VG("device_profile_header"));
              GMTrace.o(11104503726080L, 82735);
            }
          });
          paramAnonymousCharSequence = ad.atR().bY(ExdeviceDeviceProfileUI.b(ExdeviceDeviceProfileUI.this), ExdeviceDeviceProfileUI.c(ExdeviceDeviceProfileUI.this));
          if (paramAnonymousCharSequence == null)
          {
            w.i("MicroMsg.ExdeviceDeviceProfileUI", "hard device info is null.(deviceId:%s, deviceType:%s)", new Object[] { ExdeviceDeviceProfileUI.b(ExdeviceDeviceProfileUI.this), ExdeviceDeviceProfileUI.c(ExdeviceDeviceProfileUI.this) });
            GMTrace.o(11106382774272L, 82749);
            return false;
          }
          paramAnonymousCharSequence.ci(ExdeviceDeviceProfileUI.d(ExdeviceDeviceProfileUI.this));
          ad.atR().c(paramAnonymousCharSequence, new String[0]);
        }
        for (;;)
        {
          GMTrace.o(11106382774272L, 82749);
          return true;
          paramAnonymousCharSequence = new y(ExdeviceDeviceProfileUI.b(ExdeviceDeviceProfileUI.this), ExdeviceDeviceProfileUI.c(ExdeviceDeviceProfileUI.this), str);
          ExdeviceDeviceProfileUI.a(ExdeviceDeviceProfileUI.this, paramAnonymousCharSequence);
          at.wS().a(1263, ExdeviceDeviceProfileUI.this);
          at.wS().a(paramAnonymousCharSequence, 0);
        }
      }
    };
    paramBundle = getIntent();
    this.aKJ = paramBundle.getStringExtra("device_mac");
    this.kzU = paramBundle.getLongExtra("device_ble_simple_proto", 0L);
    this.kHd = paramBundle.getStringExtra("device_jump_url");
    this.kyK = paramBundle.getStringExtra("device_brand_name");
    this.kyL = paramBundle.getStringExtra("device_id");
    this.kEa = paramBundle.getStringExtra("device_type");
    this.kFa = paramBundle.getStringExtra("bind_ticket");
    this.kFY = paramBundle.getIntExtra("subscribe_flag", 0);
    this.kHf = paramBundle.getBooleanExtra("device_has_bound", false);
    this.kEZ = paramBundle.getStringExtra("device_title");
    this.kHe = paramBundle.getStringExtra("device_alias");
    this.kEs = paramBundle.getStringExtra("device_desc");
    this.kHg = paramBundle.getStringExtra("device_icon_url");
    if ((bg.nm(this.kyL)) || (bg.nm(this.kEa))) {
      w.e("MicroMsg.ExdeviceDeviceProfileUI", "deviceId or deviceType is null.", new Object[] { this.kyL, this.kEa });
    }
    while (i == 0)
    {
      Toast.makeText(this.vKB.vKW, R.l.drs, 1).show();
      finish();
      GMTrace.o(11057527521280L, 82385);
      return;
      paramBundle = ad.atR().bY(this.kyL, this.kEa);
      if (paramBundle != null)
      {
        this.kHf = true;
        if (bg.nm(this.kHe)) {
          this.kHe = bg.nl(paramBundle.fsF);
        }
        if (bg.nm(this.kEZ)) {
          this.kEZ = bg.nl(paramBundle.fsG);
        }
        if (bg.nm(this.kyK)) {
          this.kyK = bg.nl(paramBundle.field_brandName);
        }
        if (bg.nm(this.kEs)) {
          this.kEs = bg.nl(paramBundle.fsH);
        }
        if (bg.nm(this.kHg)) {
          this.kHg = bg.nl(paramBundle.iconUrl);
        }
        if (bg.nm(this.kHd)) {
          this.kHd = bg.nl(paramBundle.jumpUrl);
        }
        if (paramBundle.fsJ == 2)
        {
          this.kHh = true;
          this.kHi = this.kEZ;
          paramBundle = ad.atR().auw().iterator();
          com.tencent.mm.plugin.exdevice.h.b localb;
          do
          {
            do
            {
              if (!paramBundle.hasNext()) {
                break;
              }
              localb = (com.tencent.mm.plugin.exdevice.h.b)paramBundle.next();
            } while (!localb.field_deviceType.equals(this.kEa));
            localObject = localb.fsO;
          } while ((localObject == null) || (((String)localObject).length() <= 0));
          Object localObject = ((String)localObject).split(",");
          i = 0;
          label527:
          if (i < localObject.length) {
            if (localObject[i].equals(this.kyL)) {
              if (!bg.nm(localb.fsF)) {
                break label593;
              }
            }
          }
          label593:
          for (this.kHi = localb.fsG;; this.kHi = localb.fsF)
          {
            w.i("MicroMsg.ExdeviceDeviceProfileUI", "mGateWayTitle %s", new Object[] { this.kHi });
            i += 1;
            break label527;
            break;
          }
        }
      }
      else
      {
        if (bg.nm(this.kFa)) {
          continue;
        }
      }
      i = 1;
    }
    auE();
    GMTrace.o(11057527521280L, 82385);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\plugin\exdevice\ui\ExdeviceDeviceProfileUI.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */