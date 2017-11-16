package com.tencent.mm.plugin.safedevice.ui;

import android.app.ProgressDialog;
import android.content.DialogInterface;
import android.content.DialogInterface.OnCancelListener;
import android.content.DialogInterface.OnClickListener;
import android.content.Intent;
import android.os.Bundle;
import android.os.Message;
import android.view.MenuItem;
import android.view.MenuItem.OnMenuItemClickListener;
import android.widget.Toast;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.R.l;
import com.tencent.mm.R.o;
import com.tencent.mm.ad.k;
import com.tencent.mm.ad.n;
import com.tencent.mm.modelsimple.r;
import com.tencent.mm.plugin.safedevice.a.b;
import com.tencent.mm.plugin.safedevice.a.d;
import com.tencent.mm.sdk.e.j.a;
import com.tencent.mm.sdk.platformtools.ae;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.storage.t;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.MMWizardActivity;
import com.tencent.mm.ui.base.h.b;
import com.tencent.mm.ui.base.preference.CheckBoxPreference;
import com.tencent.mm.ui.base.preference.MMPreference;
import com.tencent.mm.ui.base.preference.Preference;
import com.tencent.mm.ui.p;
import com.tencent.mm.y.at;
import com.tencent.mm.y.q;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class MySafeDeviceListUI
  extends MMPreference
  implements com.tencent.mm.ad.e, j.a
{
  private ae handler;
  private ProgressDialog htG;
  private com.tencent.mm.ui.base.preference.f htU;
  private int orP;
  private List<SafeDeviceListPreference> orQ;
  private a orR;
  private boolean orS;
  private List<com.tencent.mm.plugin.safedevice.a.c> orT;
  private MenuItem.OnMenuItemClickListener orU;
  
  public MySafeDeviceListUI()
  {
    GMTrace.i(12878996307968L, 95956);
    this.orP = -2;
    this.orS = true;
    this.htG = null;
    this.orU = new MenuItem.OnMenuItemClickListener()
    {
      public final boolean onMenuItemClick(MenuItem paramAnonymousMenuItem)
      {
        GMTrace.i(12872956510208L, 95911);
        MySafeDeviceListUI.a(MySafeDeviceListUI.this);
        GMTrace.o(12872956510208L, 95911);
        return true;
      }
    };
    this.handler = new ae()
    {
      public final void handleMessage(Message paramAnonymousMessage)
      {
        GMTrace.i(12869869502464L, 95888);
        MySafeDeviceListUI.b(MySafeDeviceListUI.this).notifyDataSetChanged();
        super.handleMessage(paramAnonymousMessage);
        GMTrace.o(12869869502464L, 95888);
      }
    };
    GMTrace.o(12878996307968L, 95956);
  }
  
  private void gX(boolean paramBoolean)
  {
    GMTrace.i(12879935832064L, 95963);
    this.orQ.clear();
    this.orT = com.tencent.mm.plugin.safedevice.a.f.bcf().bcc();
    this.htU.removeAll();
    this.htU.addPreferencesFromResource(R.o.eph);
    Object localObject = (CheckBoxPreference)this.htU.VG("safe_device_verify_check");
    if (localObject != null) {
      ((CheckBoxPreference)localObject).sdM = paramBoolean;
    }
    if (this.orT.size() == 0)
    {
      this.htU.VH("my_safe_device_list_tip");
      lg(false);
      GMTrace.o(12879935832064L, 95963);
      return;
    }
    if (this.orP == 1)
    {
      a(0, getString(R.l.dUt), this.orU);
      this.orP ^= 0xFFFFFFFF;
    }
    localObject = this.orT.iterator();
    while (((Iterator)localObject).hasNext())
    {
      com.tencent.mm.plugin.safedevice.a.c localc = (com.tencent.mm.plugin.safedevice.a.c)((Iterator)localObject).next();
      SafeDeviceListPreference localSafeDeviceListPreference = new SafeDeviceListPreference(this);
      localSafeDeviceListPreference.setKey("mysafedevice_" + localc.field_uid);
      localSafeDeviceListPreference.setTitle(com.tencent.mm.pluginsdk.ui.d.h.a(this, localc.field_name));
      if (!com.tencent.mm.sdk.platformtools.f.vhv) {
        localSafeDeviceListPreference.setSummary(localc.field_devicetype);
      }
      localSafeDeviceListPreference.osc = this.orR;
      localSafeDeviceListPreference.osd = this.orR;
      localSafeDeviceListPreference.osa = localc;
      this.htU.a(localSafeDeviceListPreference, -1);
      this.orQ.add(localSafeDeviceListPreference);
    }
    lg(true);
    GMTrace.o(12879935832064L, 95963);
  }
  
  protected final void MP()
  {
    GMTrace.i(12879801614336L, 95962);
    a(new MenuItem.OnMenuItemClickListener()
    {
      public final boolean onMenuItemClick(MenuItem paramAnonymousMenuItem)
      {
        GMTrace.i(12870674808832L, 95894);
        MySafeDeviceListUI.this.finish();
        GMTrace.o(12870674808832L, 95894);
        return true;
      }
    });
    this.htU = this.wky;
    this.orQ = new LinkedList();
    this.orR = new a();
    a(0, getString(R.l.dUt), this.orU);
    oM(R.l.dUg);
    GMTrace.o(12879801614336L, 95962);
  }
  
  public final int QI()
  {
    GMTrace.i(12879533178880L, 95960);
    GMTrace.o(12879533178880L, 95960);
    return -1;
  }
  
  public final void a(int paramInt1, int paramInt2, String paramString, k paramk)
  {
    GMTrace.i(12880204267520L, 95965);
    if ((this.htG != null) && (this.htG.isShowing()))
    {
      this.htG.dismiss();
      this.htG = null;
    }
    if (paramk.getType() == 302)
    {
      if ((paramInt1 == 0) && (paramInt2 == 0))
      {
        this.orS = q.zM();
        gX(this.orS);
        GMTrace.o(12880204267520L, 95965);
        return;
      }
      if (com.tencent.mm.plugin.c.a.hnI.a(this, paramInt1, paramInt2, paramString))
      {
        GMTrace.o(12880204267520L, 95965);
        return;
      }
      Toast.makeText(this, getString(R.l.dUw, new Object[] { Integer.valueOf(paramInt1), Integer.valueOf(paramInt2) }), 0).show();
      GMTrace.o(12880204267520L, 95965);
      return;
    }
    if (paramk.getType() == 361)
    {
      if ((paramInt1 == 0) && (paramInt2 == 0))
      {
        paramString = (b)paramk;
        paramk = new com.tencent.mm.plugin.safedevice.a.c();
        paramk.field_devicetype = paramString.eEl;
        paramk.field_name = paramString.deviceName;
        paramk.field_uid = paramString.esG;
        paramk.field_createtime = 0L;
        com.tencent.mm.plugin.safedevice.a.f.bcf().c(paramk, new String[0]);
        com.tencent.mm.ui.base.h.bm(this, com.tencent.mm.br.a.X(this, R.l.dUz));
        GMTrace.o(12880204267520L, 95965);
        return;
      }
      if (com.tencent.mm.plugin.c.a.hnI.a(this, paramInt1, paramInt2, paramString))
      {
        GMTrace.o(12880204267520L, 95965);
        return;
      }
    }
    GMTrace.o(12880204267520L, 95965);
  }
  
  public final void a(String paramString, com.tencent.mm.sdk.e.l paraml)
  {
    GMTrace.i(12880070049792L, 95964);
    w.i("MicroMsg.MySafeDeviceListUI", "notify " + paramString);
    this.handler.post(new Runnable()
    {
      public final void run()
      {
        GMTrace.i(12868795760640L, 95880);
        MySafeDeviceListUI.b(MySafeDeviceListUI.this, MySafeDeviceListUI.c(MySafeDeviceListUI.this));
        GMTrace.o(12868795760640L, 95880);
      }
    });
    GMTrace.o(12880070049792L, 95964);
  }
  
  public final boolean a(final com.tencent.mm.ui.base.preference.f paramf, Preference paramPreference)
  {
    GMTrace.i(12879667396608L, 95961);
    paramf = paramPreference.hiu;
    if (bg.nm(paramf))
    {
      w.e("MicroMsg.MySafeDeviceListUI", "null key");
      GMTrace.o(12879667396608L, 95961);
      return false;
    }
    final boolean bool;
    if (paramf.equals("safe_device_verify_check"))
    {
      bool = ((CheckBoxPreference)paramPreference).isChecked();
      if (!bool) {
        com.tencent.mm.ui.base.h.b(this, R.l.dUp, R.l.dUo, new DialogInterface.OnClickListener()new DialogInterface.OnClickListener
        {
          public final void onClick(DialogInterface paramAnonymousDialogInterface, int paramAnonymousInt)
          {
            GMTrace.i(12878325219328L, 95951);
            MySafeDeviceListUI.a(MySafeDeviceListUI.this, bool);
            MySafeDeviceListUI.b(MySafeDeviceListUI.this, MySafeDeviceListUI.c(MySafeDeviceListUI.this));
            MySafeDeviceListUI.bch();
            GMTrace.o(12878325219328L, 95951);
          }
        }, new DialogInterface.OnClickListener()
        {
          public final void onClick(DialogInterface paramAnonymousDialogInterface, int paramAnonymousInt)
          {
            GMTrace.i(12868527325184L, 95878);
            MySafeDeviceListUI.b(MySafeDeviceListUI.this, MySafeDeviceListUI.c(MySafeDeviceListUI.this));
            if (MySafeDeviceListUI.d(MySafeDeviceListUI.this) == 1)
            {
              paramAnonymousDialogInterface = MySafeDeviceListUI.e(MySafeDeviceListUI.this).iterator();
              while (paramAnonymousDialogInterface.hasNext()) {
                ((SafeDeviceListPreference)paramAnonymousDialogInterface.next()).ts(MySafeDeviceListUI.d(MySafeDeviceListUI.this));
              }
              MySafeDeviceListUI.f(MySafeDeviceListUI.this).sendEmptyMessage(0);
            }
            GMTrace.o(12868527325184L, 95878);
          }
        });
      }
    }
    for (;;)
    {
      GMTrace.o(12879667396608L, 95961);
      return true;
      if (!this.orS)
      {
        at.AR();
        if (((Integer)com.tencent.mm.y.c.xh().get(64, Integer.valueOf(-1))).intValue() != 1)
        {
          com.tencent.mm.ui.base.h.b(this, R.l.dUG, R.l.dUH, new DialogInterface.OnClickListener()new DialogInterface.OnClickListener
          {
            public final void onClick(DialogInterface paramAnonymousDialogInterface, int paramAnonymousInt)
            {
              GMTrace.i(12864903446528L, 95851);
              at.AR();
              paramAnonymousDialogInterface = (String)com.tencent.mm.y.c.xh().get(6, null);
              if (bg.nm(paramAnonymousDialogInterface))
              {
                w.d("MicroMsg.MySafeDeviceListUI", "not bind mobile");
                GMTrace.o(12864903446528L, 95851);
                return;
              }
              Intent localIntent = new Intent(MySafeDeviceListUI.this, SecurityAccountIntroUI.class);
              localIntent.putExtra("binded_mobile", paramAnonymousDialogInterface);
              localIntent.putExtra("re_open_verify", true);
              MMWizardActivity.A(MySafeDeviceListUI.this, localIntent);
              GMTrace.o(12864903446528L, 95851);
            }
          }, new DialogInterface.OnClickListener()
          {
            public final void onClick(DialogInterface paramAnonymousDialogInterface, int paramAnonymousInt)
            {
              GMTrace.i(12869601067008L, 95886);
              MySafeDeviceListUI.b(MySafeDeviceListUI.this, MySafeDeviceListUI.c(MySafeDeviceListUI.this));
              GMTrace.o(12869601067008L, 95886);
            }
          });
        }
        else
        {
          this.orS = bool;
          gX(this.orS);
          com.tencent.mm.plugin.safedevice.a.e.r(true, true);
          continue;
          if (paramf.startsWith("mysafedevice_"))
          {
            paramf = (SafeDeviceListPreference)paramPreference;
            if (paramf != null)
            {
              paramf = paramf.osa;
              com.tencent.mm.ui.base.h.a(this.vKB.vKW, getString(R.l.dUv), paramf.field_name, getString(R.l.dUy), -1, new h.b()
              {
                public final boolean v(final CharSequence paramAnonymousCharSequence)
                {
                  GMTrace.i(12878862090240L, 95955);
                  if (paramAnonymousCharSequence == null) {}
                  for (paramAnonymousCharSequence = ""; paramAnonymousCharSequence.equals(paramf.field_name); paramAnonymousCharSequence = paramAnonymousCharSequence.toString().trim())
                  {
                    GMTrace.o(12878862090240L, 95955);
                    return true;
                  }
                  if (paramAnonymousCharSequence.length() <= 0)
                  {
                    com.tencent.mm.ui.base.h.bm(MySafeDeviceListUI.this.vKB.vKW, MySafeDeviceListUI.this.getString(R.l.dUu));
                    GMTrace.o(12878862090240L, 95955);
                    return false;
                  }
                  paramAnonymousCharSequence = new b(paramf.field_uid, paramAnonymousCharSequence, paramf.field_devicetype);
                  at.wS().a(paramAnonymousCharSequence, 0);
                  if (MySafeDeviceListUI.g(MySafeDeviceListUI.this) != null) {
                    MySafeDeviceListUI.g(MySafeDeviceListUI.this).dismiss();
                  }
                  MySafeDeviceListUI.a(MySafeDeviceListUI.this, com.tencent.mm.ui.base.h.a(MySafeDeviceListUI.this, com.tencent.mm.br.a.X(MySafeDeviceListUI.this, R.l.cUV), true, new DialogInterface.OnCancelListener()
                  {
                    public final void onCancel(DialogInterface paramAnonymous2DialogInterface)
                    {
                      GMTrace.i(12872151203840L, 95905);
                      at.wS().c(paramAnonymousCharSequence);
                      GMTrace.o(12872151203840L, 95905);
                    }
                  }));
                  GMTrace.o(12878862090240L, 95955);
                  return true;
                }
              });
            }
          }
        }
      }
    }
  }
  
  public void onCreate(final Bundle paramBundle)
  {
    GMTrace.i(12879130525696L, 95957);
    super.onCreate(paramBundle);
    at.wS().a(302, this);
    at.wS().a(361, this);
    com.tencent.mm.plugin.safedevice.a.f.bcf().c(this);
    MP();
    paramBundle = new r(q.zE());
    at.wS().a(paramBundle, 0);
    getString(R.l.cUG);
    this.htG = com.tencent.mm.ui.base.h.a(this, getString(R.l.cUV), true, new DialogInterface.OnCancelListener()
    {
      public final void onCancel(DialogInterface paramAnonymousDialogInterface)
      {
        GMTrace.i(12868258889728L, 95876);
        at.wS().c(paramBundle);
        GMTrace.o(12868258889728L, 95876);
      }
    });
    GMTrace.o(12879130525696L, 95957);
  }
  
  protected void onDestroy()
  {
    GMTrace.i(12879264743424L, 95958);
    super.onDestroy();
    at.wS().b(302, this);
    at.wS().b(361, this);
    com.tencent.mm.plugin.safedevice.a.f.bcf().j(this);
    GMTrace.o(12879264743424L, 95958);
  }
  
  protected void onResume()
  {
    GMTrace.i(12879398961152L, 95959);
    super.onResume();
    this.orS = q.zM();
    gX(this.orS);
    GMTrace.o(12879398961152L, 95959);
  }
  
  private final class a
    implements SafeDeviceListPreference.a, SafeDeviceListPreference.b
  {
    public a()
    {
      GMTrace.i(12873090727936L, 95912);
      GMTrace.o(12873090727936L, 95912);
    }
    
    public final void FK(String paramString)
    {
      GMTrace.i(12873224945664L, 95913);
      MySafeDeviceListUI.b(MySafeDeviceListUI.this).VH(paramString);
      MySafeDeviceListUI.f(MySafeDeviceListUI.this).sendEmptyMessage(0);
      MySafeDeviceListUI.this.a(0, MySafeDeviceListUI.this.getString(R.l.dUt), MySafeDeviceListUI.h(MySafeDeviceListUI.this));
      MySafeDeviceListUI.a(MySafeDeviceListUI.this, MySafeDeviceListUI.d(MySafeDeviceListUI.this) ^ 0xFFFFFFFF);
      MySafeDeviceListUI.b(MySafeDeviceListUI.this, MySafeDeviceListUI.c(MySafeDeviceListUI.this));
      GMTrace.o(12873224945664L, 95913);
    }
    
    public final void FL(String paramString)
    {
      GMTrace.i(12873359163392L, 95914);
      w.e("MicroMsg.MySafeDeviceListUI", "delete safedevice failed" + paramString);
      GMTrace.o(12873359163392L, 95914);
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\plugin\safedevice\ui\MySafeDeviceListUI.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */