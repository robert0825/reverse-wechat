package com.tencent.mm.plugin.ipcall.ui;

import android.annotation.TargetApi;
import android.app.ProgressDialog;
import android.content.DialogInterface;
import android.content.DialogInterface.OnCancelListener;
import android.content.DialogInterface.OnClickListener;
import android.content.Intent;
import android.os.Bundle;
import android.os.Looper;
import android.os.Message;
import android.support.v7.app.ActionBarActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.MenuItem.OnMenuItemClickListener;
import android.view.View;
import android.widget.AbsListView;
import android.widget.AbsListView.OnScrollListener;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.RelativeLayout;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.R.h;
import com.tencent.mm.R.i;
import com.tencent.mm.R.l;
import com.tencent.mm.plugin.ipcall.a.a.a;
import com.tencent.mm.plugin.ipcall.a.g.b;
import com.tencent.mm.plugin.report.service.g;
import com.tencent.mm.sdk.f.e;
import com.tencent.mm.sdk.platformtools.ae;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.base.VerticalScrollBar;
import com.tencent.mm.ui.base.VerticalScrollBar.a;
import com.tencent.mm.ui.base.h;
import com.tencent.mm.ui.tools.p.b;
import java.util.ArrayList;
import java.util.HashMap;

public class IPCallContactUI
  extends MMActivity
{
  private ae ghS;
  private String htH;
  private com.tencent.mm.ui.tools.p jQL;
  private ListView moC;
  private Runnable moJ;
  private ProgressDialog moR;
  private c moS;
  private RelativeLayout moT;
  private LinearLayout moU;
  private IPCallAddressCountView moV;
  private VerticalScrollBar moW;
  private LinearLayout moX;
  private int moY;
  private int moZ;
  private a.a mpa;
  private Runnable mpb;
  private boolean mpc;
  
  public IPCallContactUI()
  {
    GMTrace.i(11707543977984L, 87228);
    this.jQL = new com.tencent.mm.ui.tools.p(true, true);
    this.moR = null;
    this.moV = null;
    this.moY = -1;
    this.moZ = -1;
    this.mpa = new a.a()
    {
      public final void aEg()
      {
        GMTrace.i(11631039873024L, 86658);
        IPCallContactUI.f(IPCallContactUI.this).sendEmptyMessage(1);
        GMTrace.o(11631039873024L, 86658);
      }
    };
    this.moJ = new Runnable()
    {
      public final void run()
      {
        GMTrace.i(11634932187136L, 86687);
        com.tencent.mm.plugin.ipcall.a.a.aHY().a(IPCallContactUI.g(IPCallContactUI.this), false);
        GMTrace.o(11634932187136L, 86687);
      }
    };
    this.mpb = new Runnable()
    {
      public final void run()
      {
        GMTrace.i(11656943894528L, 86851);
        if ((IPCallContactUI.d(IPCallContactUI.this) != null) && (IPCallContactUI.b(IPCallContactUI.this) != null) && (!IPCallContactUI.d(IPCallContactUI.this).jul))
        {
          IPCallContactUI.d(IPCallContactUI.this).Au(IPCallContactUI.h(IPCallContactUI.this));
          IPCallContactUI.f(IPCallContactUI.this).sendEmptyMessage(2);
          IPCallContactUI.b(IPCallContactUI.this).invalidateViews();
        }
        GMTrace.o(11656943894528L, 86851);
      }
    };
    this.mpc = true;
    this.ghS = new ae(Looper.getMainLooper())
    {
      public final void handleMessage(Message paramAnonymousMessage)
      {
        GMTrace.i(11731166298112L, 87404);
        if (paramAnonymousMessage.what == 1)
        {
          if (IPCallContactUI.k(IPCallContactUI.this) != null) {
            IPCallContactUI.k(IPCallContactUI.this).dismiss();
          }
          IPCallContactUI.l(IPCallContactUI.this).setVisibility(0);
          IPCallContactUI.d(IPCallContactUI.this);
          c.mmO = b.aIV();
          IPCallContactUI.d(IPCallContactUI.this).QF();
          IPCallContactUI.d(IPCallContactUI.this).notifyDataSetChanged();
          IPCallContactUI.b(IPCallContactUI.this).invalidateViews();
          IPCallContactUI.c(IPCallContactUI.this).ps(IPCallContactUI.d(IPCallContactUI.this).getCount());
          com.tencent.mm.plugin.ipcall.a.aHD().Pi();
          GMTrace.o(11731166298112L, 87404);
          return;
        }
        if (paramAnonymousMessage.what == 2)
        {
          if (IPCallContactUI.d(IPCallContactUI.this).getCount() != 0) {
            break label200;
          }
          IPCallContactUI.m(IPCallContactUI.this).setVisibility(0);
        }
        for (;;)
        {
          if ((IPCallContactUI.d(IPCallContactUI.this).getCount() != 0) && (IPCallContactUI.e(IPCallContactUI.this))) {
            IPCallContactUI.d(IPCallContactUI.this).notifyDataSetChanged();
          }
          GMTrace.o(11731166298112L, 87404);
          return;
          label200:
          IPCallContactUI.m(IPCallContactUI.this).setVisibility(8);
        }
      }
    };
    GMTrace.o(11707543977984L, 87228);
  }
  
  public final void Au(String paramString)
  {
    GMTrace.i(11707946631168L, 87231);
    this.htH = paramString;
    this.ghS.removeCallbacks(this.mpb);
    this.ghS.postDelayed(this.mpb, 200L);
    GMTrace.o(11707946631168L, 87231);
  }
  
  protected final int Qf()
  {
    GMTrace.i(11707678195712L, 87229);
    GMTrace.o(11707678195712L, 87229);
    return 1;
  }
  
  public final void fu(boolean paramBoolean)
  {
    GMTrace.i(11708080848896L, 87232);
    this.mpc = paramBoolean;
    if (this.mpc) {
      this.moS.notifyDataSetChanged();
    }
    GMTrace.o(11708080848896L, 87232);
  }
  
  protected final int getLayoutId()
  {
    GMTrace.i(11708215066624L, 87233);
    int i = R.i.cAd;
    GMTrace.o(11708215066624L, 87233);
    return i;
  }
  
  public void onBackPressed()
  {
    GMTrace.i(11708886155264L, 87238);
    super.onBackPressed();
    GMTrace.o(11708886155264L, 87238);
  }
  
  public void onCreate(Bundle paramBundle)
  {
    GMTrace.i(11707812413440L, 87230);
    super.onCreate(paramBundle);
    oM(R.l.dDX);
    a(new MenuItem.OnMenuItemClickListener()
    {
      public final boolean onMenuItemClick(MenuItem paramAnonymousMenuItem)
      {
        GMTrace.i(11622986809344L, 86598);
        IPCallContactUI.this.finish();
        GMTrace.o(11622986809344L, 86598);
        return true;
      }
    });
    boolean bool = com.tencent.mm.pluginsdk.h.a.a(this, "android.permission.READ_CONTACTS", 48, null, null);
    w.i("MicroMsg.IPCallContactUI", "summerper checkPermission checkContacts[%b],stack[%s]", new Object[] { Boolean.valueOf(bool), bg.bQW() });
    if (bool)
    {
      this.moT = ((RelativeLayout)findViewById(R.h.layout));
      this.moU = ((LinearLayout)findViewById(R.h.bdf));
      this.moC = ((ListView)findViewById(R.h.bcS));
      this.moW = ((VerticalScrollBar)findViewById(R.h.bdc));
      this.moX = ((LinearLayout)findViewById(R.h.bde));
      this.jQL.xiS = new p.b()
      {
        public final void QA()
        {
          GMTrace.i(11625536946176L, 86617);
          IPCallContactUI.a(IPCallContactUI.this).setVisibility(0);
          IPCallContactUI.b(IPCallContactUI.this).setVisibility(8);
          IPCallContactUI.c(IPCallContactUI.this).setVisibility(8);
          GMTrace.o(11625536946176L, 86617);
        }
        
        public final void QB()
        {
          GMTrace.i(17093835620352L, 127359);
          GMTrace.o(17093835620352L, 127359);
        }
        
        public final void Qy()
        {
          GMTrace.i(11625134292992L, 86614);
          w.d("MicroMsg.IPCallContactUI", "onQuitSearch");
          IPCallContactUI.this.Au("");
          IPCallContactUI.this.fu(true);
          IPCallContactUI.a(IPCallContactUI.this).setVisibility(8);
          IPCallContactUI.b(IPCallContactUI.this).setVisibility(0);
          IPCallContactUI.c(IPCallContactUI.this).setVisibility(0);
          GMTrace.o(11625134292992L, 86614);
        }
        
        public final void Qz()
        {
          GMTrace.i(11625000075264L, 86613);
          w.d("MicroMsg.IPCallContactUI", "onEnterSearch");
          g.ork.i(12767, new Object[] { Integer.valueOf(1) });
          IPCallContactUI.a(IPCallContactUI.this).setVisibility(0);
          IPCallContactUI.b(IPCallContactUI.this).setVisibility(8);
          IPCallContactUI.c(IPCallContactUI.this).setVisibility(8);
          IPCallContactUI.this.fu(false);
          GMTrace.o(11625000075264L, 86613);
        }
        
        public final boolean nC(String paramAnonymousString)
        {
          GMTrace.i(11625402728448L, 86616);
          w.d("MicroMsg.IPCallContactUI", "onSearchKeyDown");
          GMTrace.o(11625402728448L, 86616);
          return false;
        }
        
        public final void nD(String paramAnonymousString)
        {
          GMTrace.i(11625268510720L, 86615);
          w.d("MicroMsg.IPCallContactUI", "onSearchChange");
          IPCallContactUI.this.Au(paramAnonymousString);
          if (!bg.nm(paramAnonymousString))
          {
            IPCallContactUI.a(IPCallContactUI.this).setVisibility(8);
            IPCallContactUI.b(IPCallContactUI.this).setVisibility(0);
            IPCallContactUI.c(IPCallContactUI.this).setVisibility(8);
          }
          GMTrace.o(11625268510720L, 86615);
        }
      };
      this.jQL.xiX = R.l.cUr;
      a(this.jQL);
      this.moS = new c(this.vKB.vKW);
      c.mmO = b.aIV();
      this.moV = new IPCallAddressCountView(this.vKB.vKW, this.moS.aJd());
      this.moC.addFooterView(this.moV, null, false);
      this.moC.setAdapter(this.moS);
      this.moC.setOnItemClickListener(new AdapterView.OnItemClickListener()
      {
        public final void onItemClick(AdapterView<?> paramAnonymousAdapterView, View paramAnonymousView, int paramAnonymousInt, long paramAnonymousLong)
        {
          GMTrace.i(11698954043392L, 87164);
          if (IPCallContactUI.d(IPCallContactUI.this).oR(paramAnonymousInt))
          {
            GMTrace.o(11698954043392L, 87164);
            return;
          }
          paramAnonymousAdapterView = IPCallContactUI.d(IPCallContactUI.this).pr(paramAnonymousInt);
          if (paramAnonymousAdapterView != null)
          {
            if (!IPCallContactUI.e(IPCallContactUI.this)) {
              g.ork.i(12767, new Object[] { Integer.valueOf(2) });
            }
            paramAnonymousView = new Intent(IPCallContactUI.this.vKB.vKW, IPCallUserProfileUI.class);
            paramAnonymousView.putExtra("IPCallProfileUI_contactid", paramAnonymousAdapterView.field_contactId);
            paramAnonymousView.putExtra("IPCallProfileUI_systemUsername", paramAnonymousAdapterView.field_systemAddressBookUsername);
            paramAnonymousView.putExtra("IPCallProfileUI_wechatUsername", paramAnonymousAdapterView.field_wechatUsername);
            IPCallContactUI.this.vKB.vKW.startActivity(paramAnonymousView);
          }
          GMTrace.o(11698954043392L, 87164);
        }
      });
      this.moW.setVisibility(0);
      this.moC.setOnScrollListener(new AbsListView.OnScrollListener()
      {
        private int mpe;
        
        @TargetApi(11)
        public final void onScroll(AbsListView paramAnonymousAbsListView, int paramAnonymousInt1, int paramAnonymousInt2, int paramAnonymousInt3)
        {
          GMTrace.i(11642985250816L, 86747);
          if (IPCallContactUI.i(IPCallContactUI.this) == -1)
          {
            IPCallContactUI.a(IPCallContactUI.this, paramAnonymousInt1);
            GMTrace.o(11642985250816L, 86747);
            return;
          }
          if (IPCallContactUI.j(IPCallContactUI.this) == -1) {
            IPCallContactUI.b(IPCallContactUI.this, paramAnonymousInt1);
          }
          GMTrace.o(11642985250816L, 86747);
        }
        
        public final void onScrollStateChanged(AbsListView paramAnonymousAbsListView, int paramAnonymousInt)
        {
          GMTrace.i(11642851033088L, 86746);
          this.mpe = paramAnonymousInt;
          IPCallContactUI.this.aLo();
          GMTrace.o(11642851033088L, 86746);
        }
      });
      this.moW.wiZ = new VerticalScrollBar.a()
      {
        public final void uW(String paramAnonymousString)
        {
          GMTrace.i(11675063287808L, 86986);
          if ("↑".equals(paramAnonymousString))
          {
            IPCallContactUI.b(IPCallContactUI.this).setSelection(0);
            GMTrace.o(11675063287808L, 86986);
            return;
          }
          c localc = IPCallContactUI.d(IPCallContactUI.this);
          if (localc.jRG.containsKey(paramAnonymousString)) {}
          for (int i = ((Integer)localc.jRG.get(paramAnonymousString)).intValue();; i = -1)
          {
            if (i != -1) {
              IPCallContactUI.b(IPCallContactUI.this).setSelection(i);
            }
            GMTrace.o(11675063287808L, 86986);
            return;
          }
        }
      };
      if (this.moS.aJd() <= 0)
      {
        this.moT.setVisibility(8);
        paramBundle = this.vKB.vKW;
        this.vKB.vKW.getString(R.l.cUG);
        this.moR = h.a(paramBundle, this.vKB.vKW.getString(R.l.dEl), true, new DialogInterface.OnCancelListener()
        {
          public final void onCancel(DialogInterface paramAnonymousDialogInterface)
          {
            GMTrace.i(11676673900544L, 86998);
            IPCallContactUI.this.finish();
            GMTrace.o(11676673900544L, 86998);
          }
        });
        e.post(this.moJ, "IPCall_LoadSystemAddressBook");
        GMTrace.o(11707812413440L, 87230);
        return;
      }
      com.tencent.mm.plugin.ipcall.a.aHD().Pi();
    }
    GMTrace.o(11707812413440L, 87230);
  }
  
  public boolean onCreateOptionsMenu(Menu paramMenu)
  {
    GMTrace.i(11708751937536L, 87237);
    w.d("MicroMsg.IPCallContactUI", "onCreateOptionsMenu");
    boolean bool = super.onCreateOptionsMenu(paramMenu);
    GMTrace.o(11708751937536L, 87237);
    return bool;
  }
  
  protected void onDestroy()
  {
    GMTrace.i(11708349284352L, 87234);
    super.onDestroy();
    com.tencent.mm.plugin.ipcall.a.a locala = com.tencent.mm.plugin.ipcall.a.a.aHY();
    a.a locala1 = this.mpa;
    if (locala.miu.contains(locala1)) {
      locala.miu.remove(locala1);
    }
    this.ghS.removeMessages(1);
    GMTrace.o(11708349284352L, 87234);
  }
  
  public void onRequestPermissionsResult(int paramInt, String[] paramArrayOfString, int[] paramArrayOfInt)
  {
    GMTrace.i(11709020372992L, 87239);
    w.i("MicroMsg.IPCallContactUI", "summerper onRequestPermissionsResult requestCode[%d],grantResults[%d] tid[%d]", new Object[] { Integer.valueOf(paramInt), Integer.valueOf(paramArrayOfInt[0]), Long.valueOf(Thread.currentThread().getId()) });
    switch (paramInt)
    {
    }
    for (;;)
    {
      GMTrace.o(11709020372992L, 87239);
      return;
      if (paramArrayOfInt[0] != 0) {
        h.a(this, getString(R.l.dNp), getString(R.l.dNu), getString(R.l.dFX), getString(R.l.cancel), false, new DialogInterface.OnClickListener()new DialogInterface.OnClickListener
        {
          public final void onClick(DialogInterface paramAnonymousDialogInterface, int paramAnonymousInt)
          {
            GMTrace.i(11643522121728L, 86751);
            paramAnonymousDialogInterface.dismiss();
            IPCallContactUI.this.finish();
            IPCallContactUI.this.startActivity(new Intent("android.settings.MANAGE_APPLICATIONS_SETTINGS"));
            GMTrace.o(11643522121728L, 86751);
          }
        }, new DialogInterface.OnClickListener()
        {
          public final void onClick(DialogInterface paramAnonymousDialogInterface, int paramAnonymousInt)
          {
            GMTrace.i(11623792115712L, 86604);
            paramAnonymousDialogInterface.dismiss();
            IPCallContactUI.this.finish();
            GMTrace.o(11623792115712L, 86604);
          }
        });
      }
    }
  }
  
  protected void onResume()
  {
    GMTrace.i(11708483502080L, 87235);
    super.onResume();
    aQ();
    GMTrace.o(11708483502080L, 87235);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\plugin\ipcall\ui\IPCallContactUI.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */