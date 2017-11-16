package com.tencent.mm.ui.contact;

import android.content.Context;
import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.content.Intent;
import android.os.Bundle;
import android.widget.ListAdapter;
import android.widget.ListView;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.R.l;
import com.tencent.mm.g.a.si;
import com.tencent.mm.g.b.af;
import com.tencent.mm.k.e;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.ui.LauncherUI;
import com.tencent.mm.ui.base.h;
import java.util.ArrayList;
import java.util.List;

public class VoipAddressUI
  extends MMBaseSelectContactUI
{
  private String eDs;
  private List<String> iVA;
  private boolean wUC;
  private boolean wUD;
  private com.tencent.mm.sdk.b.c wUE;
  
  public VoipAddressUI()
  {
    GMTrace.i(1750333390848L, 13041);
    this.wUC = false;
    this.wUD = false;
    this.eDs = "";
    this.wUE = new com.tencent.mm.sdk.b.c() {};
    GMTrace.o(1750333390848L, 13041);
  }
  
  private void aXL()
  {
    GMTrace.i(1750736044032L, 13044);
    boolean bool = com.tencent.mm.pluginsdk.h.a.a(this, "android.permission.RECORD_AUDIO", 82, "", "");
    w.i("MicroMsg.VoipAddressUI", "summerper checkPermission checkmicrophone[%b], stack[%s], activity[%s]", new Object[] { Boolean.valueOf(bool), bg.bQW(), this });
    if (!bool)
    {
      GMTrace.o(1750736044032L, 13044);
      return;
    }
    si localsi = new si();
    localsi.eXf.eHJ = 5;
    localsi.eXf.eDs = this.eDs;
    localsi.eXf.context = this;
    if (this.wUC) {}
    for (int i = 2;; i = 1)
    {
      localsi.eXf.eXa = 3;
      com.tencent.mm.plugin.report.service.g.ork.i(11033, new Object[] { Integer.valueOf(i), Integer.valueOf(2), Integer.valueOf(0) });
      com.tencent.mm.sdk.b.a.vgX.m(localsi);
      aLo();
      GMTrace.o(1750736044032L, 13044);
      return;
    }
  }
  
  private void aXM()
  {
    GMTrace.i(1750870261760L, 13045);
    boolean bool = com.tencent.mm.pluginsdk.h.a.a(this, "android.permission.CAMERA", 19, "", "");
    w.i("MicroMsg.VoipAddressUI", "summerper checkPermission checkCamera[%b], stack[%s], activity[%s]", new Object[] { Boolean.valueOf(bool), bg.bQW(), this });
    if (!bool)
    {
      GMTrace.o(1750870261760L, 13045);
      return;
    }
    bool = com.tencent.mm.pluginsdk.h.a.a(this, "android.permission.RECORD_AUDIO", 19, "", "");
    w.i("MicroMsg.VoipAddressUI", "summerper checkPermission checkmicrophone[%b], stack[%s], activity[%s]", new Object[] { Boolean.valueOf(bool), bg.bQW(), this });
    if (!bool)
    {
      GMTrace.o(1750870261760L, 13045);
      return;
    }
    si localsi = new si();
    localsi.eXf.eHJ = 5;
    localsi.eXf.eDs = this.eDs;
    localsi.eXf.context = this;
    if (this.wUC) {}
    for (int i = 2;; i = 1)
    {
      localsi.eXf.eXa = 2;
      com.tencent.mm.plugin.report.service.g.ork.i(11033, new Object[] { Integer.valueOf(i), Integer.valueOf(1), Integer.valueOf(0) });
      com.tencent.mm.sdk.b.a.vgX.m(localsi);
      aLo();
      GMTrace.o(1750870261760L, 13045);
      return;
    }
  }
  
  public static void fx(Context paramContext)
  {
    int i = 0;
    GMTrace.i(1751407132672L, 13049);
    boolean bool;
    if (1 == bg.getInt(com.tencent.mm.k.g.ut().getValue("VOIPCallType"), 0))
    {
      bool = true;
      Intent localIntent = new Intent(paramContext, VoipAddressUI.class);
      localIntent.putExtra("Add_address_titile", paramContext.getString(R.l.cRp));
      localIntent.putExtra("voip_video", bool);
      paramContext.startActivity(localIntent);
      paramContext = com.tencent.mm.plugin.report.service.g.ork;
      if (!bool) {
        break label115;
      }
    }
    for (;;)
    {
      paramContext.i(11034, new Object[] { Integer.valueOf(1), Integer.valueOf(i) });
      GMTrace.o(1751407132672L, 13049);
      return;
      bool = false;
      break;
      label115:
      i = 1;
    }
  }
  
  protected final void PY()
  {
    GMTrace.i(1751004479488L, 13046);
    super.PY();
    String str = getIntent().getStringExtra("LauncherUI.Shortcut.LaunchType");
    this.wUD = getIntent().getBooleanExtra("voip_video", true);
    if (str != null)
    {
      this.wUC = true;
      if (!str.equals("launch_type_voip")) {
        break label107;
      }
      this.wUD = true;
    }
    for (;;)
    {
      this.iVA = new ArrayList();
      this.iVA.addAll(s.cgI());
      this.iVA.addAll(s.cgJ());
      GMTrace.o(1751004479488L, 13046);
      return;
      label107:
      if (str.equals("launch_type_voip_audio")) {
        this.wUD = false;
      }
    }
  }
  
  protected final boolean PZ()
  {
    GMTrace.i(1752212439040L, 13055);
    GMTrace.o(1752212439040L, 13055);
    return false;
  }
  
  protected final boolean Qa()
  {
    GMTrace.i(1751541350400L, 13050);
    GMTrace.o(1751541350400L, 13050);
    return true;
  }
  
  protected final String Qb()
  {
    GMTrace.i(1752078221312L, 13054);
    String str2 = getIntent().getStringExtra("Add_address_titile");
    String str1 = str2;
    if (!bg.nm(str2)) {
      str1 = getString(R.l.cRp);
    }
    GMTrace.o(1752078221312L, 13054);
    return str1;
  }
  
  protected final o Qc()
  {
    GMTrace.i(1751138697216L, 13047);
    Object localObject = new c.a();
    ((c.a)localObject).wQA = true;
    ((c.a)localObject).wQz = true;
    localObject = new c(this, this.iVA, false, (c.a)localObject);
    GMTrace.o(1751138697216L, 13047);
    return (o)localObject;
  }
  
  protected final m Qd()
  {
    GMTrace.i(1751272914944L, 13048);
    q localq = new q(this, this.iVA, false, this.scene);
    GMTrace.o(1751272914944L, 13048);
    return localq;
  }
  
  public final int[] aMW()
  {
    GMTrace.i(1751675568128L, 13051);
    GMTrace.o(1751675568128L, 13051);
    return new int[] { 131072 };
  }
  
  protected final void aMX()
  {
    GMTrace.i(1751944003584L, 13053);
    if (this.wUC)
    {
      Intent localIntent = new Intent(this, LauncherUI.class);
      localIntent.addFlags(67108864);
      startActivity(localIntent);
    }
    aLo();
    finish();
    GMTrace.o(1751944003584L, 13053);
  }
  
  public final void hF(int paramInt)
  {
    GMTrace.i(1750601826304L, 13043);
    com.tencent.mm.ui.contact.a.a locala = (com.tencent.mm.ui.contact.a.a)this.nVC.getAdapter().getItem(paramInt);
    if (locala == null)
    {
      GMTrace.o(1750601826304L, 13043);
      return;
    }
    if (locala.iBi == null)
    {
      GMTrace.o(1750601826304L, 13043);
      return;
    }
    this.eDs = locala.iBi.field_username;
    if (this.wUD)
    {
      aXM();
      GMTrace.o(1750601826304L, 13043);
      return;
    }
    aXL();
    GMTrace.o(1750601826304L, 13043);
  }
  
  public void onCreate(Bundle paramBundle)
  {
    GMTrace.i(1750467608576L, 13042);
    super.onCreate(paramBundle);
    com.tencent.mm.sdk.b.a.vgX.b(this.wUE);
    GMTrace.o(1750467608576L, 13042);
  }
  
  public void onDestroy()
  {
    GMTrace.i(1751809785856L, 13052);
    com.tencent.mm.sdk.b.a.vgX.c(this.wUE);
    super.onDestroy();
    GMTrace.o(1751809785856L, 13052);
  }
  
  public void onRequestPermissionsResult(int paramInt, String[] paramArrayOfString, int[] paramArrayOfInt)
  {
    GMTrace.i(1752346656768L, 13056);
    w.i("MicroMsg.VoipAddressUI", "summerper onRequestPermissionsResult requestCode[%d],grantResults[%d] tid[%d]", new Object[] { Integer.valueOf(paramInt), Integer.valueOf(paramArrayOfInt[0]), Long.valueOf(Thread.currentThread().getId()) });
    switch (paramInt)
    {
    }
    for (;;)
    {
      GMTrace.o(1752346656768L, 13056);
      return;
      if (paramArrayOfInt[0] == 0)
      {
        aXM();
        GMTrace.o(1752346656768L, 13056);
        return;
      }
      if ("android.permission.CAMERA".equals(paramArrayOfString[0])) {}
      for (paramInt = R.l.dNn;; paramInt = R.l.dNr)
      {
        if (paramArrayOfInt[0] != 0) {
          h.a(this, getString(paramInt), getString(R.l.dNu), getString(R.l.dFX), getString(R.l.cancel), false, new DialogInterface.OnClickListener()new DialogInterface.OnClickListener
          {
            public final void onClick(DialogInterface paramAnonymousDialogInterface, int paramAnonymousInt)
            {
              GMTrace.i(1829790285824L, 13633);
              paramAnonymousDialogInterface.dismiss();
              VoipAddressUI.this.startActivity(new Intent("android.settings.MANAGE_APPLICATIONS_SETTINGS"));
              GMTrace.o(1829790285824L, 13633);
            }
          }, new DialogInterface.OnClickListener()
          {
            public final void onClick(DialogInterface paramAnonymousDialogInterface, int paramAnonymousInt)
            {
              GMTrace.i(1781471903744L, 13273);
              paramAnonymousDialogInterface.dismiss();
              GMTrace.o(1781471903744L, 13273);
            }
          });
        }
        GMTrace.o(1752346656768L, 13056);
        return;
      }
      if (paramArrayOfInt[0] == 0)
      {
        aXL();
        GMTrace.o(1752346656768L, 13056);
        return;
      }
      h.a(this, getString(R.l.dNq), getString(R.l.dNu), getString(R.l.dFX), getString(R.l.cancel), false, new DialogInterface.OnClickListener()
      {
        public final void onClick(DialogInterface paramAnonymousDialogInterface, int paramAnonymousInt)
        {
          GMTrace.i(1811805110272L, 13499);
          VoipAddressUI.this.startActivity(new Intent("android.settings.MANAGE_APPLICATIONS_SETTINGS"));
          GMTrace.o(1811805110272L, 13499);
        }
      }, null);
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\ui\contact\VoipAddressUI.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */