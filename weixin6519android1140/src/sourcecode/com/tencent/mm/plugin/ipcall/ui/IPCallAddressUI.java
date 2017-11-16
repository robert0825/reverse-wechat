package com.tencent.mm.plugin.ipcall.ui;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.MenuItem.OnMenuItemClickListener;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.TextView;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.R.a;
import com.tencent.mm.R.h;
import com.tencent.mm.R.i;
import com.tencent.mm.R.l;
import com.tencent.mm.ac.d.a;
import com.tencent.mm.ad.k;
import com.tencent.mm.g.a.id;
import com.tencent.mm.pluginsdk.m;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.storage.t;
import com.tencent.mm.storage.w.a;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.p;
import com.tencent.mm.y.at;

public class IPCallAddressUI
  extends MMActivity
  implements com.tencent.mm.ad.e
{
  private ListView moC;
  private e moD;
  private int moE;
  private boolean moF;
  private boolean moG;
  private boolean moH;
  private com.tencent.mm.sdk.b.c moI;
  private Runnable moJ;
  private View moq;
  
  public IPCallAddressUI()
  {
    GMTrace.i(11635469058048L, 86691);
    this.moD = null;
    this.moE = 0;
    this.moF = false;
    this.moG = true;
    this.moH = false;
    this.moI = new com.tencent.mm.sdk.b.c() {};
    this.moJ = new Runnable()
    {
      public final void run()
      {
        GMTrace.i(11662983692288L, 86896);
        com.tencent.mm.plugin.ipcall.a.a.aHY().a(null, true);
        GMTrace.o(11662983692288L, 86896);
      }
    };
    GMTrace.o(11635469058048L, 86691);
  }
  
  private void aJi()
  {
    GMTrace.i(11636005928960L, 86695);
    boolean bool = com.tencent.mm.pluginsdk.h.a.a(this, "android.permission.READ_CONTACTS", 48, null, null);
    w.i("MicroMsg.IPCallAddressUI", "summerper checkPermission checkContacts[%b],stack[%s]", new Object[] { Boolean.valueOf(bool), bg.bQW() });
    if (bool) {
      com.tencent.mm.sdk.f.e.post(this.moJ, "IPCallAddressUI_LoadSystemAddressBook");
    }
    GMTrace.o(11636005928960L, 86695);
  }
  
  protected final int Qf()
  {
    GMTrace.i(11635603275776L, 86692);
    GMTrace.o(11635603275776L, 86692);
    return 1;
  }
  
  public final void a(int paramInt1, int paramInt2, String paramString, k paramk)
  {
    GMTrace.i(11636408582144L, 86698);
    if (((paramk instanceof com.tencent.mm.plugin.ipcall.a.d.g)) && (paramInt1 == 0) && (paramInt2 == 0) && (this.moD != null)) {
      this.moD.aJg();
    }
    GMTrace.o(11636408582144L, 86698);
  }
  
  protected final int getLayoutId()
  {
    GMTrace.i(11635871711232L, 86694);
    int i = R.i.cAb;
    GMTrace.o(11635871711232L, 86694);
    return i;
  }
  
  public void onBackPressed()
  {
    GMTrace.i(11636677017600L, 86700);
    if (this.moE == 1)
    {
      com.tencent.mm.plugin.ipcall.b.hnH.s(new Intent(), this);
      GMTrace.o(11636677017600L, 86700);
      return;
    }
    super.onBackPressed();
    GMTrace.o(11636677017600L, 86700);
  }
  
  public void onCreate(Bundle paramBundle)
  {
    GMTrace.i(11635737493504L, 86693);
    super.onCreate(paramBundle);
    at.AR();
    if (((Boolean)com.tencent.mm.y.c.xh().get(w.a.vsy, Boolean.valueOf(false))).booleanValue())
    {
      at.AR();
      com.tencent.mm.y.c.xh().a(w.a.vsy, Boolean.valueOf(false));
      paramBundle = new Intent();
      paramBundle.setClass(this.vKB.vKW, IPCallAcitivityUI.class);
      this.vKB.vKW.startActivity(paramBundle);
      overridePendingTransition(R.a.aMb, R.a.aMa);
      this.moG = false;
    }
    a(new MenuItem.OnMenuItemClickListener()
    {
      public final boolean onMenuItemClick(MenuItem paramAnonymousMenuItem)
      {
        GMTrace.i(11649159266304L, 86793);
        if (IPCallAddressUI.b(IPCallAddressUI.this) == 1) {
          com.tencent.mm.plugin.ipcall.b.hnH.s(new Intent(), IPCallAddressUI.this);
        }
        for (;;)
        {
          GMTrace.o(11649159266304L, 86793);
          return true;
          IPCallAddressUI.this.finish();
        }
      }
    });
    if (this.moG)
    {
      this.moH = true;
      aJi();
    }
    at.AR();
    this.moF = ((Boolean)com.tencent.mm.y.c.xh().get(w.a.vrU, Boolean.valueOf(true))).booleanValue();
    oM(R.l.dEm);
    this.moC = ((ListView)findViewById(R.h.bcS));
    this.moq = findViewById(R.h.bde);
    this.moD = new e(this, this.moC, this.moq);
    paramBundle = this.moD;
    paramBundle.mop = new h(paramBundle.mor);
    ViewGroup localViewGroup = (ViewGroup)View.inflate(paramBundle.mor, R.i.cAn, null);
    paramBundle.moo.addHeaderView(localViewGroup, null, false);
    paramBundle.moo.setAdapter(paramBundle.mop);
    paramBundle.mot = ((TextView)localViewGroup.findViewById(R.h.bcB));
    paramBundle.mou = ((TextView)localViewGroup.findViewById(R.h.bcE));
    paramBundle.mov = ((LinearLayout)localViewGroup.findViewById(R.h.bcz));
    paramBundle.mow = ((TextView)localViewGroup.findViewById(R.h.bcA));
    paramBundle.mox = ((ImageView)localViewGroup.findViewById(R.h.cjm));
    localViewGroup.findViewById(R.h.bcF).setOnClickListener(new e.1(paramBundle));
    localViewGroup.findViewById(R.h.brw).setOnClickListener(new e.2(paramBundle));
    localViewGroup.findViewById(R.h.bul).setOnClickListener(new e.3(paramBundle));
    paramBundle.moo.setOnItemClickListener(new e.4(paramBundle));
    paramBundle.moo.setOnItemLongClickListener(new e.5(paramBundle));
    at.AR();
    if (((Boolean)com.tencent.mm.y.c.xh().get(w.a.vrU, Boolean.valueOf(true))).booleanValue())
    {
      com.tencent.mm.plugin.ipcall.a.d.aIe().fh(true);
      at.AR();
      com.tencent.mm.y.c.xh().a(w.a.vrU, Boolean.valueOf(false));
      if (paramBundle.mop.getCount() <= 0) {
        break label570;
      }
      paramBundle.moq.setVisibility(8);
    }
    for (;;)
    {
      paramBundle.aJg();
      paramBundle.aJf();
      paramBundle.mos = true;
      at.wS().a(257, this);
      com.tencent.mm.sdk.b.a.vgX.b(this.moI);
      this.moE = getIntent().getIntExtra("IPCallAddressUI_KFrom", 0);
      com.tencent.mm.plugin.report.service.g.ork.a(257L, 0L, 1L, true);
      GMTrace.o(11635737493504L, 86693);
      return;
      com.tencent.mm.plugin.ipcall.a.d.aIe().fh(false);
      break;
      label570:
      paramBundle.moq.setVisibility(0);
    }
  }
  
  public boolean onCreateOptionsMenu(Menu paramMenu)
  {
    GMTrace.i(11636542799872L, 86699);
    w.d("MicroMsg.IPCallAddressUI", "onCreateOptionsMenu");
    boolean bool = super.onCreateOptionsMenu(paramMenu);
    GMTrace.o(11636542799872L, 86699);
    return bool;
  }
  
  protected void onDestroy()
  {
    GMTrace.i(11636140146688L, 86696);
    super.onDestroy();
    if (this.moD != null)
    {
      Object localObject = this.moD;
      ((e)localObject).moo.setOnItemClickListener(null);
      ((e)localObject).moo.setOnItemLongClickListener(null);
      localObject = ((e)localObject).mop;
      com.tencent.mm.ac.n.Dh().b((d.a)localObject);
    }
    at.wS().b(257, this);
    com.tencent.mm.sdk.b.a.vgX.c(this.moI);
    GMTrace.o(11636140146688L, 86696);
  }
  
  public void onRequestPermissionsResult(int paramInt, String[] paramArrayOfString, int[] paramArrayOfInt)
  {
    GMTrace.i(11636811235328L, 86701);
    if ((paramArrayOfInt == null) || (paramArrayOfInt.length <= 0))
    {
      if (paramArrayOfInt == null) {}
      for (int i = -1;; i = paramArrayOfInt.length)
      {
        w.w("MicroMsg.IPCallAddressUI", "summerper onRequestPermissionsResult, grantResults length is:%d requestCode:%d, permissions:%s, stack:%s", new Object[] { Integer.valueOf(i), Integer.valueOf(paramInt), paramArrayOfString, bg.bQW() });
        GMTrace.o(11636811235328L, 86701);
        return;
      }
    }
    w.i("MicroMsg.IPCallAddressUI", "summerper onRequestPermissionsResult requestCode[%d],grantResults[%d] tid[%d]", new Object[] { Integer.valueOf(paramInt), Integer.valueOf(paramArrayOfInt[0]), Long.valueOf(Thread.currentThread().getId()) });
    switch (paramInt)
    {
    }
    for (;;)
    {
      GMTrace.o(11636811235328L, 86701);
      return;
      if ((paramArrayOfInt[0] != 0) && (this.moF))
      {
        this.moF = false;
        com.tencent.mm.ui.base.h.a(this, getString(R.l.dNp), getString(R.l.dNu), getString(R.l.dFX), getString(R.l.cancel), false, new DialogInterface.OnClickListener()new DialogInterface.OnClickListener
        {
          public final void onClick(DialogInterface paramAnonymousDialogInterface, int paramAnonymousInt)
          {
            GMTrace.i(11712241598464L, 87263);
            paramAnonymousDialogInterface.dismiss();
            IPCallAddressUI.this.startActivity(new Intent("android.settings.MANAGE_APPLICATIONS_SETTINGS"));
            GMTrace.o(11712241598464L, 87263);
          }
        }, new DialogInterface.OnClickListener()
        {
          public final void onClick(DialogInterface paramAnonymousDialogInterface, int paramAnonymousInt)
          {
            GMTrace.i(11676405465088L, 86996);
            paramAnonymousDialogInterface.dismiss();
            GMTrace.o(11676405465088L, 86996);
          }
        });
      }
    }
  }
  
  protected void onResume()
  {
    GMTrace.i(11636274364416L, 86697);
    super.onResume();
    e locale;
    if (this.moD != null)
    {
      locale = this.moD;
      if ((locale.mop != null) && (!locale.mos))
      {
        locale.mop.notifyDataSetChanged();
        if (locale.mop.getCount() <= 0) {
          break label107;
        }
        locale.moq.setVisibility(8);
      }
    }
    for (;;)
    {
      locale.mos = false;
      aQ();
      com.tencent.mm.plugin.ipcall.a.f.b.aIT().fs(true);
      if (!this.moH)
      {
        this.moH = true;
        aJi();
      }
      GMTrace.o(11636274364416L, 86697);
      return;
      label107:
      locale.moq.setVisibility(0);
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\plugin\ipcall\ui\IPCallAddressUI.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */