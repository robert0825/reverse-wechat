package com.tencent.mm.plugin.nearby.ui;

import android.app.Activity;
import android.content.Context;
import android.content.DialogInterface;
import android.content.DialogInterface.OnCancelListener;
import android.content.DialogInterface.OnClickListener;
import android.content.Intent;
import android.os.Message;
import android.view.View;
import android.widget.CheckBox;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.R.h;
import com.tencent.mm.R.i;
import com.tencent.mm.R.l;
import com.tencent.mm.R.o;
import com.tencent.mm.ad.e;
import com.tencent.mm.ad.k;
import com.tencent.mm.g.b.af;
import com.tencent.mm.pluginsdk.l;
import com.tencent.mm.pluginsdk.ui.preference.HelperHeaderPreference;
import com.tencent.mm.sdk.e.m;
import com.tencent.mm.sdk.e.m.b;
import com.tencent.mm.sdk.platformtools.ae;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.storage.t;
import com.tencent.mm.storage.x;
import com.tencent.mm.ui.base.h;
import com.tencent.mm.ui.base.i;
import com.tencent.mm.ui.base.r;
import com.tencent.mm.ui.o;
import com.tencent.mm.y.at;
import com.tencent.mm.y.bk;
import com.tencent.mm.y.q;
import com.tencent.mm.y.s;
import java.util.Timer;
import java.util.TimerTask;
import junit.framework.Assert;

public final class a
  implements e, com.tencent.mm.pluginsdk.d.a, m.b
{
  private static boolean ntN;
  public Context context;
  public r hsU;
  private com.tencent.mm.ui.base.preference.f htU;
  private x iBi;
  public com.tencent.mm.plugin.nearby.a.c ntK;
  private View ntL;
  public CheckBox ntM;
  private i ntO;
  
  static
  {
    GMTrace.i(6685116596224L, 49808);
    ntN = true;
    GMTrace.o(6685116596224L, 49808);
  }
  
  public a(Context paramContext)
  {
    GMTrace.i(6683237548032L, 49794);
    this.ntO = null;
    this.context = paramContext;
    this.ntL = View.inflate(paramContext, R.i.cAI, null);
    this.ntM = ((CheckBox)this.ntL.findViewById(R.h.bJR));
    this.ntM.setChecked(false);
    at.wS().a(148, this);
    GMTrace.o(6683237548032L, 49794);
  }
  
  private void ahK()
  {
    boolean bool3 = true;
    GMTrace.i(6683640201216L, 49797);
    Object localObject;
    int i;
    label74:
    boolean bool2;
    if ((q.zP() & 0x200) == 0)
    {
      bool1 = true;
      localObject = (HelperHeaderPreference)this.htU.VG("contact_info_header_helper");
      ((HelperHeaderPreference)localObject).af(this.iBi.field_username, this.iBi.vk(), this.context.getString(R.l.djC));
      if (!bool1) {
        break label173;
      }
      i = 1;
      ((HelperHeaderPreference)localObject).lu(i);
      this.htU.bc("contact_info_lbs_install", bool1);
      localObject = this.htU;
      if (bool1) {
        break label178;
      }
      bool2 = true;
      label104:
      ((com.tencent.mm.ui.base.preference.f)localObject).bc("contact_info_lbs_go_lbs", bool2);
      localObject = this.htU;
      if (bool1) {
        break label183;
      }
      bool2 = true;
      label126:
      ((com.tencent.mm.ui.base.preference.f)localObject).bc("contact_info_lbs_clear_info", bool2);
      localObject = this.htU;
      if (bool1) {
        break label188;
      }
    }
    label173:
    label178:
    label183:
    label188:
    for (boolean bool1 = bool3;; bool1 = false)
    {
      ((com.tencent.mm.ui.base.preference.f)localObject).bc("contact_info_lbs_uninstall", bool1);
      GMTrace.o(6683640201216L, 49797);
      return;
      bool1 = false;
      break;
      i = 0;
      break label74;
      bool2 = false;
      break label104;
      bool2 = false;
      break label126;
    }
  }
  
  public static void f(Context paramContext, boolean paramBoolean)
  {
    GMTrace.i(6683774418944L, 49798);
    if (paramBoolean) {}
    for (final Object localObject = paramContext.getString(R.l.dZZ);; localObject = paramContext.getString(R.l.eag))
    {
      ntN = paramBoolean;
      paramContext.getString(R.l.cUG);
      paramContext = h.a(paramContext, (String)localObject, true, null);
      localObject = new ae()
      {
        public final void handleMessage(Message paramAnonymousMessage)
        {
          GMTrace.i(6694243401728L, 49876);
          int i = q.zP();
          if (this.jqL) {
            i &= 0xFDFF;
          }
          for (;;)
          {
            at.AR();
            com.tencent.mm.y.c.xh().set(34, Integer.valueOf(i));
            at.AR();
            com.tencent.mm.y.c.yJ().b(new com.tencent.mm.av.n("", "", "", "", "", "", "", "", i, "", ""));
            if (!this.jqL) {
              com.tencent.mm.plugin.nearby.a.f.aTI();
            }
            if (this.jqM != null) {
              this.jqM.a(null, null);
            }
            GMTrace.o(6694243401728L, 49876);
            return;
            i |= 0x200;
          }
        }
      };
      new Timer().schedule(new TimerTask()
      {
        public final void run()
        {
          GMTrace.i(6715584020480L, 50035);
          if (this.jqN != null)
          {
            this.jqN.dismiss();
            localObject.sendEmptyMessage(0);
          }
          GMTrace.o(6715584020480L, 50035);
        }
      }, 1500L);
      GMTrace.o(6683774418944L, 49798);
      return;
    }
  }
  
  public final void a(int paramInt1, int paramInt2, String paramString, k paramk)
  {
    GMTrace.i(6684311289856L, 49802);
    if ((this.ntK == null) && (((com.tencent.mm.plugin.nearby.a.c)paramk).CD() == 2))
    {
      GMTrace.o(6684311289856L, 49802);
      return;
    }
    w.i("MicroMsg.ContactWidgetLBS", "onSceneEnd: errType = " + paramInt1 + " errCode = " + paramInt2 + " errMsg = " + paramString);
    if (paramk.getType() != 148)
    {
      GMTrace.o(6684311289856L, 49802);
      return;
    }
    if (this.hsU != null)
    {
      this.hsU.dismiss();
      this.hsU = null;
    }
    if ((paramInt1 == 0) && (paramInt2 == 0)) {}
    for (paramInt1 = R.l.dKE;; paramInt1 = R.l.dKD)
    {
      if ((((com.tencent.mm.plugin.nearby.a.c)paramk).CD() == 2) && (ntN))
      {
        h.a(this.context, paramInt1, R.l.cUG, new DialogInterface.OnClickListener()
        {
          public final void onClick(DialogInterface paramAnonymousDialogInterface, int paramAnonymousInt)
          {
            GMTrace.i(6712631230464L, 50013);
            GMTrace.o(6712631230464L, 50013);
          }
        });
        this.ntK = null;
      }
      GMTrace.o(6684311289856L, 49802);
      return;
    }
  }
  
  public final void a(int paramInt, m paramm, Object paramObject)
  {
    GMTrace.i(6684042854400L, 49800);
    int i = bg.m(paramObject, 0);
    w.d("MicroMsg.ContactWidgetLBS", "onNotifyChange event:%d obj:%d stg:%s", new Object[] { Integer.valueOf(paramInt), Integer.valueOf(i), paramm });
    at.AR();
    if ((paramm != com.tencent.mm.y.c.xh()) || (i <= 0))
    {
      w.e("MicroMsg.ContactWidgetLBS", "onNotifyChange error obj:%d stg:%s", new Object[] { Integer.valueOf(i), paramm });
      GMTrace.o(6684042854400L, 49800);
      return;
    }
    if ((i != 40) && (i != 34) && (i != 7))
    {
      GMTrace.o(6684042854400L, 49800);
      return;
    }
    ahK();
    GMTrace.o(6684042854400L, 49800);
  }
  
  public final boolean a(com.tencent.mm.ui.base.preference.f paramf, x paramx, boolean paramBoolean, int paramInt)
  {
    boolean bool = false;
    GMTrace.i(6683505983488L, 49796);
    if (paramf != null) {}
    for (paramBoolean = true;; paramBoolean = false)
    {
      Assert.assertTrue(paramBoolean);
      paramBoolean = bool;
      if (paramx != null) {
        paramBoolean = true;
      }
      Assert.assertTrue(paramBoolean);
      Assert.assertTrue(s.fQ(paramx.field_username));
      at.AR();
      com.tencent.mm.y.c.xh().a(this);
      w.v("MicroMsg.ContactWidgetLBS", "listener added");
      this.iBi = paramx;
      this.htU = paramf;
      ntN = true;
      paramf.addPreferencesFromResource(R.o.eoz);
      ahK();
      GMTrace.o(6683505983488L, 49796);
      return true;
    }
  }
  
  public final boolean ahL()
  {
    GMTrace.i(6683908636672L, 49799);
    at.AR();
    com.tencent.mm.y.c.xh().b(this);
    at.wS().b(148, this);
    com.tencent.mm.plugin.nearby.a.hnI.pr();
    GMTrace.o(6683908636672L, 49799);
    return true;
  }
  
  public final void onActivityResult(int paramInt1, int paramInt2, Intent paramIntent)
  {
    GMTrace.i(6684177072128L, 49801);
    GMTrace.o(6684177072128L, 49801);
  }
  
  public final boolean tF(String paramString)
  {
    GMTrace.i(6683371765760L, 49795);
    w.d("MicroMsg.ContactWidgetLBS", "handleEvent : key = " + paramString);
    if (bg.nl(paramString).length() <= 0)
    {
      GMTrace.o(6683371765760L, 49795);
      return false;
    }
    if (paramString.equals("contact_info_lbs_go_lbs"))
    {
      at.AR();
      paramString = (Boolean)com.tencent.mm.y.c.xh().get(4103, null);
      if ((paramString == null) || (!paramString.booleanValue())) {
        com.tencent.mm.bj.d.x(this.context, "nearby", ".ui.NearbyFriendsIntroUI");
      }
      for (;;)
      {
        GMTrace.o(6683371765760L, 49795);
        return true;
        paramString = bk.BF();
        if (paramString == null)
        {
          com.tencent.mm.bj.d.x(this.context, "nearby", ".ui.NearbyPersonalInfoUI");
        }
        else
        {
          String str1 = bg.nl(paramString.getProvince());
          String str2 = bg.nl(paramString.getCity());
          int i = paramString.fja;
          if ((str1.equals("")) || (str2.equals("")) || (i == 0))
          {
            com.tencent.mm.bj.d.x(this.context, "nearby", ".ui.NearbyPersonalInfoUI");
          }
          else
          {
            at.AR();
            paramString = (Boolean)com.tencent.mm.y.c.xh().get(4104, null);
            if ((paramString == null) || (!paramString.booleanValue()))
            {
              com.tencent.mm.bh.a.dA(this.context);
              ((Activity)this.context).finish();
            }
            else if (this.ntO == null)
            {
              this.ntO = h.a(this.context, this.context.getString(R.l.cUG), this.ntL, new DialogInterface.OnClickListener()new DialogInterface.OnClickListener
              {
                public final void onClick(DialogInterface paramAnonymousDialogInterface, int paramAnonymousInt)
                {
                  GMTrace.i(6690351087616L, 49847);
                  at.AR();
                  paramAnonymousDialogInterface = com.tencent.mm.y.c.xh();
                  if (!a.this.ntM.isChecked()) {}
                  for (boolean bool = true;; bool = false)
                  {
                    paramAnonymousDialogInterface.set(4104, Boolean.valueOf(bool));
                    com.tencent.mm.bh.a.dA(a.this.context);
                    ((Activity)a.this.context).finish();
                    GMTrace.o(6690351087616L, 49847);
                    return;
                  }
                }
              }, new DialogInterface.OnClickListener()
              {
                public final void onClick(DialogInterface paramAnonymousDialogInterface, int paramAnonymousInt)
                {
                  GMTrace.i(6693706530816L, 49872);
                  GMTrace.o(6693706530816L, 49872);
                }
              });
            }
            else
            {
              this.ntO.show();
            }
          }
        }
      }
    }
    if (paramString.equals("contact_info_lbs_install"))
    {
      f(this.context, true);
      GMTrace.o(6683371765760L, 49795);
      return true;
    }
    if (paramString.equals("contact_info_lbs_clear_info"))
    {
      h.a(this.context, R.l.dKC, R.l.dKB, new DialogInterface.OnClickListener()new DialogInterface.OnClickListener
      {
        public final void onClick(DialogInterface paramAnonymousDialogInterface, int paramAnonymousInt)
        {
          GMTrace.i(6708604698624L, 49983);
          a.this.ntK = new com.tencent.mm.plugin.nearby.a.c(2, 0.0F, 0.0F, 0, 0, "", "");
          at.wS().a(a.this.ntK, 0);
          paramAnonymousDialogInterface = a.this;
          Context localContext = a.this.context;
          a.this.context.getString(R.l.cUG);
          paramAnonymousDialogInterface.hsU = h.a(localContext, a.this.context.getString(R.l.dKF), true, new DialogInterface.OnCancelListener()
          {
            public final void onCancel(DialogInterface paramAnonymous2DialogInterface)
            {
              GMTrace.i(6712899665920L, 50015);
              at.wS().c(a.this.ntK);
              GMTrace.o(6712899665920L, 50015);
            }
          });
          GMTrace.o(6708604698624L, 49983);
        }
      }, new DialogInterface.OnClickListener()
      {
        public final void onClick(DialogInterface paramAnonymousDialogInterface, int paramAnonymousInt)
        {
          GMTrace.i(6712094359552L, 50009);
          GMTrace.o(6712094359552L, 50009);
        }
      });
      GMTrace.o(6683371765760L, 49795);
      return true;
    }
    if (paramString.equals("contact_info_lbs_uninstall"))
    {
      h.a(this.context, this.context.getString(R.l.eac), "", this.context.getString(R.l.cSl), this.context.getString(R.l.cSk), new DialogInterface.OnClickListener()
      {
        public final void onClick(DialogInterface paramAnonymousDialogInterface, int paramAnonymousInt)
        {
          GMTrace.i(6714778714112L, 50029);
          a.f(a.this.context, false);
          GMTrace.o(6714778714112L, 50029);
        }
      }, null);
      GMTrace.o(6683371765760L, 49795);
      return true;
    }
    w.e("MicroMsg.ContactWidgetLBS", "handleEvent : unExpected key = " + paramString);
    GMTrace.o(6683371765760L, 49795);
    return false;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\plugin\nearby\ui\a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */