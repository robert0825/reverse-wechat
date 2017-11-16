package com.tencent.mm.plugin.exdevice.ui;

import android.app.Dialog;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.DialogInterface;
import android.content.DialogInterface.OnCancelListener;
import android.content.DialogInterface.OnClickListener;
import android.content.Intent;
import android.content.IntentFilter;
import android.location.LocationManager;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.text.SpannableString;
import android.text.TextPaint;
import android.text.method.LinkMovementMethod;
import android.text.style.ClickableSpan;
import android.text.style.ForegroundColorSpan;
import android.view.MenuItem;
import android.view.MenuItem.OnMenuItemClickListener;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.R.e;
import com.tencent.mm.R.g;
import com.tencent.mm.R.h;
import com.tencent.mm.R.i;
import com.tencent.mm.R.l;
import com.tencent.mm.ad.k;
import com.tencent.mm.ao.a.a.c.a;
import com.tencent.mm.g.a.ef;
import com.tencent.mm.g.a.qq;
import com.tencent.mm.plugin.exdevice.j.b;
import com.tencent.mm.plugin.exdevice.model.ad;
import com.tencent.mm.plugin.exdevice.model.e.b;
import com.tencent.mm.plugin.exdevice.model.l;
import com.tencent.mm.plugin.exdevice.model.t;
import com.tencent.mm.protocal.c.agx;
import com.tencent.mm.protocal.c.agy;
import com.tencent.mm.protocal.c.aos;
import com.tencent.mm.protocal.c.bah;
import com.tencent.mm.protocal.c.gi;
import com.tencent.mm.sdk.platformtools.af;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.base.r;
import com.tencent.mm.ui.p;
import com.tencent.mm.y.at;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class ExdeviceAddDataSourceUI
  extends MMActivity
  implements com.tencent.mm.ad.e, e.b
{
  private ListView Ev;
  private final BroadcastReceiver idj;
  private r ihl;
  private RelativeLayout kEA;
  private LocationManager kEB;
  private boolean kEC;
  private l kED;
  private a kEv;
  private List<b> kEw;
  private TextView kEx;
  private TextView kEy;
  private TextView kEz;
  private View koo;
  
  public ExdeviceAddDataSourceUI()
  {
    GMTrace.i(11072559906816L, 82497);
    this.kEC = false;
    this.idj = new BroadcastReceiver()
    {
      public final void onReceive(Context paramAnonymousContext, Intent paramAnonymousIntent)
      {
        GMTrace.i(11051219288064L, 82338);
        if (paramAnonymousIntent == null)
        {
          w.i("MicroMsg.ExdeviceAddDataSourceUI", "Receive action broadcast failed...");
          GMTrace.o(11051219288064L, 82338);
          return;
        }
        paramAnonymousContext = paramAnonymousIntent.getAction();
        if ("android.bluetooth.adapter.action.STATE_CHANGED".equals(paramAnonymousContext))
        {
          if (paramAnonymousIntent.getIntExtra("android.bluetooth.adapter.extra.STATE", Integer.MIN_VALUE) != 12) {
            break label181;
          }
          if (com.tencent.mm.plugin.g.a.e.a.ahp())
          {
            ExdeviceAddDataSourceUI.this.runOnUiThread(new Runnable()
            {
              public final void run()
              {
                GMTrace.i(11051487723520L, 82340);
                if ((ExdeviceAddDataSourceUI.a(ExdeviceAddDataSourceUI.this)) && (!ExdeviceAddDataSourceUI.b(ExdeviceAddDataSourceUI.this).isProviderEnabled("gps")))
                {
                  ExdeviceAddDataSourceUI.a(ExdeviceAddDataSourceUI.this, 4);
                  GMTrace.o(11051487723520L, 82340);
                  return;
                }
                ExdeviceAddDataSourceUI.a(ExdeviceAddDataSourceUI.this, 3);
                w.i("MicroMsg.ExdeviceAddDataSourceUI", "Start scan...");
                GMTrace.o(11051487723520L, 82340);
              }
            });
            if ((!ExdeviceAddDataSourceUI.a(ExdeviceAddDataSourceUI.this)) || (ExdeviceAddDataSourceUI.b(ExdeviceAddDataSourceUI.this).isProviderEnabled("gps")))
            {
              ad.auc();
              com.tencent.mm.plugin.exdevice.model.e.atE();
            }
          }
        }
        while ((ExdeviceAddDataSourceUI.a(ExdeviceAddDataSourceUI.this)) && ("android.location.MODE_CHANGED".equals(paramAnonymousContext))) {
          if (ExdeviceAddDataSourceUI.b(ExdeviceAddDataSourceUI.this).isProviderEnabled("gps"))
          {
            ExdeviceAddDataSourceUI.this.runOnUiThread(new Runnable()
            {
              public final void run()
              {
                GMTrace.i(11014846283776L, 82067);
                if (com.tencent.mm.plugin.g.a.e.a.ahp())
                {
                  ExdeviceAddDataSourceUI.a(ExdeviceAddDataSourceUI.this, 3);
                  w.i("MicroMsg.ExdeviceAddDataSourceUI", "Start scan...");
                  GMTrace.o(11014846283776L, 82067);
                  return;
                }
                ExdeviceAddDataSourceUI.a(ExdeviceAddDataSourceUI.this, 1);
                GMTrace.o(11014846283776L, 82067);
              }
            });
            if (com.tencent.mm.plugin.g.a.e.a.ahp())
            {
              ad.auc();
              com.tencent.mm.plugin.exdevice.model.e.atE();
              GMTrace.o(11051219288064L, 82338);
              return;
              label181:
              if ((paramAnonymousIntent.getIntExtra("android.bluetooth.adapter.extra.STATE", Integer.MIN_VALUE) == 10) && (!com.tencent.mm.plugin.g.a.e.a.ahp()))
              {
                ExdeviceAddDataSourceUI.this.runOnUiThread(new Runnable()
                {
                  public final void run()
                  {
                    GMTrace.i(11076854874112L, 82529);
                    ExdeviceAddDataSourceUI.a(ExdeviceAddDataSourceUI.this, 1);
                    w.i("MicroMsg.ExdeviceAddDataSourceUI", "Stop scan...");
                    GMTrace.o(11076854874112L, 82529);
                  }
                });
                ad.aud().agW();
              }
            }
          }
          else
          {
            ExdeviceAddDataSourceUI.this.runOnUiThread(new Runnable()
            {
              public final void run()
              {
                GMTrace.i(11055514255360L, 82370);
                ExdeviceAddDataSourceUI.a(ExdeviceAddDataSourceUI.this, 4);
                w.i("MicroMsg.ExdeviceAddDataSourceUI", "Stop scan...");
                GMTrace.o(11055514255360L, 82370);
              }
            });
            ad.aud().agW();
          }
        }
        GMTrace.o(11051219288064L, 82338);
      }
    };
    GMTrace.o(11072559906816L, 82497);
  }
  
  private static boolean aa(String paramString, boolean paramBoolean)
  {
    GMTrace.i(11073902084096L, 82507);
    ef localef = new ef();
    localef.eFY.mac = paramString;
    localef.eFY.eEt = paramBoolean;
    if (!com.tencent.mm.sdk.b.a.vgX.m(localef))
    {
      w.i("MicroMsg.ExdeviceAddDataSourceUI", "connect failed, mac(%s).", new Object[] { paramString });
      GMTrace.o(11073902084096L, 82507);
      return false;
    }
    GMTrace.o(11073902084096L, 82507);
    return true;
  }
  
  private void auy()
  {
    GMTrace.i(11074036301824L, 82508);
    runOnUiThread(new Runnable()
    {
      public final void run()
      {
        GMTrace.i(11063030448128L, 82426);
        if ((ExdeviceAddDataSourceUI.f(ExdeviceAddDataSourceUI.this) != null) && (ExdeviceAddDataSourceUI.f(ExdeviceAddDataSourceUI.this).isShowing())) {
          ExdeviceAddDataSourceUI.f(ExdeviceAddDataSourceUI.this).dismiss();
        }
        GMTrace.o(11063030448128L, 82426);
      }
    });
    GMTrace.o(11074036301824L, 82508);
  }
  
  private void mZ(int paramInt)
  {
    GMTrace.i(11072962560000L, 82500);
    switch (paramInt)
    {
    }
    for (;;)
    {
      GMTrace.o(11072962560000L, 82500);
      return;
      this.kEA.setVisibility(8);
      this.kEy.setText(R.l.dqO);
      this.kEz.setText("");
      GMTrace.o(11072962560000L, 82500);
      return;
      this.kEA.setVisibility(8);
      this.kEy.setText(R.l.dqQ);
      this.kEz.setText(R.l.dqF);
      GMTrace.o(11072962560000L, 82500);
      return;
      this.kEA.setVisibility(8);
      this.kEy.setText(R.l.dqQ);
      this.kEz.setText(R.l.drr);
      GMTrace.o(11072962560000L, 82500);
      return;
      this.kEA.setVisibility(0);
      this.koo.setVisibility(0);
    }
  }
  
  protected final void MP()
  {
    GMTrace.i(11073096777728L, 82501);
    this.Ev = ((ListView)findViewById(R.h.bKn));
    View localView = View.inflate(this, R.i.cvy, null);
    this.kEA = ((RelativeLayout)findViewById(R.h.bZU));
    this.koo = View.inflate(this, R.i.cvx, null);
    this.kEx = ((TextView)findViewById(R.h.bZy));
    this.kEy = ((TextView)findViewById(R.h.bwY));
    this.kEz = ((TextView)findViewById(R.h.bwZ));
    String str1 = getString(R.l.drU);
    String str2 = getString(R.l.dqV);
    SpannableString localSpannableString = new SpannableString(str1 + str2);
    localSpannableString.setSpan(new ForegroundColorSpan(R.e.aOm), str1.length(), str1.length() + str2.length(), 33);
    localSpannableString.setSpan(new ClickableSpan()
    {
      public final void onClick(View paramAnonymousView)
      {
        GMTrace.i(11068533374976L, 82467);
        com.tencent.mm.plugin.exdevice.model.f.S(ExdeviceAddDataSourceUI.this.vKB.vKW, "https://hw.weixin.qq.com/steprank/step/connect-help.html");
        GMTrace.o(11068533374976L, 82467);
      }
      
      public final void updateDrawState(TextPaint paramAnonymousTextPaint)
      {
        GMTrace.i(11068667592704L, 82468);
        paramAnonymousTextPaint.setColor(paramAnonymousTextPaint.linkColor);
        paramAnonymousTextPaint.setUnderlineText(false);
        GMTrace.o(11068667592704L, 82468);
      }
    }, str1.length(), str1.length() + str2.length(), 33);
    this.kEx.setMovementMethod(LinkMovementMethod.getInstance());
    this.kEx.setText(localSpannableString);
    this.Ev.addHeaderView(localView, null, false);
    this.Ev.addFooterView(this.koo, null, false);
    this.kEv = new a();
    this.Ev.setAdapter(this.kEv);
    this.Ev.setOnItemClickListener(new AdapterView.OnItemClickListener()
    {
      public final void onItemClick(AdapterView<?> paramAnonymousAdapterView, View paramAnonymousView, int paramAnonymousInt, long paramAnonymousLong)
      {
        GMTrace.i(11085713244160L, 82595);
        int i = ((ListView)paramAnonymousAdapterView).getHeaderViewsCount();
        paramAnonymousAdapterView = ExdeviceAddDataSourceUI.c(ExdeviceAddDataSourceUI.this).na(paramAnonymousInt - i);
        if (paramAnonymousAdapterView.kEL != ExdeviceAddDataSourceUI.c.kEM)
        {
          GMTrace.o(11085713244160L, 82595);
          return;
        }
        if (!ExdeviceAddDataSourceUI.wX(paramAnonymousAdapterView.mac))
        {
          w.i("MicroMsg.ExdeviceAddDataSourceUI", "try connect device failed.");
          GMTrace.o(11085713244160L, 82595);
          return;
        }
        ExdeviceAddDataSourceUI.a(ExdeviceAddDataSourceUI.this, paramAnonymousAdapterView.mac);
        paramAnonymousAdapterView.kEL = ExdeviceAddDataSourceUI.c.kEN;
        ExdeviceAddDataSourceUI.c(ExdeviceAddDataSourceUI.this).notifyDataSetChanged();
        GMTrace.o(11085713244160L, 82595);
      }
    });
    GMTrace.o(11073096777728L, 82501);
  }
  
  public final void a(int paramInt1, int paramInt2, String paramString, k paramk)
  {
    GMTrace.i(11073365213184L, 82503);
    w.i("MicroMsg.ExdeviceAddDataSourceUI", "errType(%d), errCode(%d), errMsg(%s).", new Object[] { Integer.valueOf(paramInt1), Integer.valueOf(paramInt2), paramString });
    if (paramk == null)
    {
      w.e("MicroMsg.ExdeviceAddDataSourceUI", "netscene is null.");
      GMTrace.o(11073365213184L, 82503);
      return;
    }
    if (paramk.getType() == 536)
    {
      auy();
      this.kED = null;
      paramString = ((l)paramk).atK();
      if ((paramInt1 != 0) || (paramInt2 != 0))
      {
        paramString = this.kEv.wY(b.xi(paramString.tUu.tTU));
        if (paramString != null)
        {
          paramString.kEL = c.kEM;
          aa(paramString.mac, false);
        }
        w.e("MicroMsg.ExdeviceAddDataSourceUI", "doScene failed.");
        GMTrace.o(11073365213184L, 82503);
        return;
      }
      paramk = new Intent();
      paramk.putExtra("device_mac", b.xh(b.xi(paramString.tUu.tTU)));
      aa(b.xi(paramString.tUu.tTU), false);
      setResult(-1, paramk);
      finish();
      GMTrace.o(11073365213184L, 82503);
      return;
    }
    b localb;
    if (paramk.getType() == 1706)
    {
      paramk = ((t)paramk).atN();
      if ((paramInt1 != 0) || (paramInt2 != 0))
      {
        w.e("MicroMsg.ExdeviceAddDataSourceUI", "NetSceneSearchBLEHardDevice onSceneEnd, errType(%d) errCode(%d) errMsg(%s).", new Object[] { Integer.valueOf(paramInt1), Integer.valueOf(paramInt2), paramString });
        GMTrace.o(11073365213184L, 82503);
        return;
      }
      w.i("MicroMsg.ExdeviceAddDataSourceUI", "HardDeviceAttr_bleSimpleProtol(%d)", new Object[] { Long.valueOf(paramk.tUu.fsK) });
      if (0L != (paramk.tUu.fsK & 1L))
      {
        if (ad.atR().bY(paramk.tUt.jhl, paramk.tUt.tSz) != null)
        {
          w.i("MicroMsg.ExdeviceAddDataSourceUI", "(%s)has been bound.", new Object[] { paramk.tUu.tTU });
          GMTrace.o(11073365213184L, 82503);
          return;
        }
        localb = new b();
        if (paramk.tUa.uxT != null) {
          break label520;
        }
      }
    }
    label520:
    for (paramString = "";; paramString = com.tencent.mm.platformtools.n.a(paramk.tUa.uxT))
    {
      localb.name = paramString;
      localb.mac = b.xi(paramk.tUu.tTU);
      localb.eEU = paramk.tTZ;
      localb.iconUrl = paramk.tUu.lRV;
      this.kEw.add(localb);
      w.i("MicroMsg.ExdeviceAddDataSourceUI", "Add device, mac(%s), name(%s)", new Object[] { localb.mac, localb.name });
      runOnUiThread(new Runnable()
      {
        public final void run()
        {
          GMTrace.i(11097792839680L, 82685);
          ExdeviceAddDataSourceUI.c(ExdeviceAddDataSourceUI.this).at(ExdeviceAddDataSourceUI.d(ExdeviceAddDataSourceUI.this));
          ExdeviceAddDataSourceUI.c(ExdeviceAddDataSourceUI.this).notifyDataSetChanged();
          GMTrace.o(11097792839680L, 82685);
        }
      });
      GMTrace.o(11073365213184L, 82503);
      return;
    }
  }
  
  public final void b(String paramString, byte[] paramArrayOfByte, boolean paramBoolean)
  {
    GMTrace.i(11073767866368L, 82506);
    GMTrace.o(11073767866368L, 82506);
  }
  
  public final void d(String paramString, int paramInt, long paramLong)
  {
    GMTrace.i(11073633648640L, 82505);
    if (bg.nm(paramString))
    {
      w.e("MicroMsg.ExdeviceAddDataSourceUI", "onConnectStateChanged, mac is null or nil.");
      GMTrace.o(11073633648640L, 82505);
      return;
    }
    final b localb = this.kEv.wY(paramString);
    if (localb == null)
    {
      w.w("MicroMsg.ExdeviceAddDataSourceUI", "onConnectStateChanged, info is null.(%s)", new Object[] { paramString });
      GMTrace.o(11073633648640L, 82505);
      return;
    }
    if ((localb.kEL == c.kEN) && (paramInt == 4))
    {
      localb.kEL = c.kEM;
      auy();
      runOnUiThread(new Runnable()
      {
        public final void run()
        {
          GMTrace.i(11095779573760L, 82670);
          com.tencent.mm.ui.base.h.a(ExdeviceAddDataSourceUI.this, R.l.dqY, R.l.dqW, R.l.dqX, R.l.dqZ, false, new DialogInterface.OnClickListener()new DialogInterface.OnClickListener
          {
            public final void onClick(DialogInterface paramAnonymous2DialogInterface, int paramAnonymous2Int)
            {
              GMTrace.i(11062225141760L, 82420);
              ExdeviceAddDataSourceUI.d(ExdeviceAddDataSourceUI.this).remove(ExdeviceAddDataSourceUI.10.this.kEI);
              ExdeviceAddDataSourceUI.c(ExdeviceAddDataSourceUI.this).at(ExdeviceAddDataSourceUI.d(ExdeviceAddDataSourceUI.this));
              ExdeviceAddDataSourceUI.c(ExdeviceAddDataSourceUI.this).notifyDataSetChanged();
              GMTrace.o(11062225141760L, 82420);
            }
          }, new DialogInterface.OnClickListener()
          {
            public final void onClick(DialogInterface paramAnonymous2DialogInterface, int paramAnonymous2Int)
            {
              GMTrace.i(11070009769984L, 82478);
              com.tencent.mm.plugin.exdevice.model.f.S(ExdeviceAddDataSourceUI.this.vKB.vKW, "https://hw.weixin.qq.com/steprank/step/connect-help.html");
              GMTrace.o(11070009769984L, 82478);
            }
          }).show();
          GMTrace.o(11095779573760L, 82670);
        }
      });
    }
    for (;;)
    {
      runOnUiThread(new Runnable()
      {
        public final void run()
        {
          GMTrace.i(11053366771712L, 82354);
          ExdeviceAddDataSourceUI.c(ExdeviceAddDataSourceUI.this).notifyDataSetChanged();
          GMTrace.o(11053366771712L, 82354);
        }
      });
      GMTrace.o(11073633648640L, 82505);
      return;
      if (paramInt == 2)
      {
        if (localb.kEL == c.kEN)
        {
          localb.kEL = c.kEO;
          w.i("MicroMsg.ExdeviceAddDataSourceUI", "Bind Hard device, mac(%s), name(%s)", new Object[] { localb.mac, localb.name });
          if (localb.eEU != null)
          {
            this.kED = new l(localb.eEU, 0);
            at.wS().a(this.kED, 0);
          }
        }
        else
        {
          w.i("MicroMsg.ExdeviceAddDataSourceUI", "try to disconnect, mac : %s.", new Object[] { paramString });
          aa(paramString, false);
        }
      }
      else
      {
        if ((paramInt == 1) || (paramInt == 2)) {
          break;
        }
        localb.kEL = c.kEM;
      }
    }
    GMTrace.o(11073633648640L, 82505);
  }
  
  protected final int getLayoutId()
  {
    GMTrace.i(11072694124544L, 82498);
    int i = R.i.cvw;
    GMTrace.o(11072694124544L, 82498);
    return i;
  }
  
  public final void k(String paramString1, String paramString2, boolean paramBoolean)
  {
    GMTrace.i(11073499430912L, 82504);
    w.d("MicroMsg.ExdeviceAddDataSourceUI", "onScanResult, broadcastName(%s), mac(%s), isCompleted(%b).", new Object[] { paramString1, paramString2, Boolean.valueOf(paramBoolean) });
    if (paramBoolean) {
      runOnUiThread(new Runnable()
      {
        public final void run()
        {
          GMTrace.i(11031623499776L, 82192);
          ExdeviceAddDataSourceUI.e(ExdeviceAddDataSourceUI.this).setVisibility(8);
          ExdeviceAddDataSourceUI.c(ExdeviceAddDataSourceUI.this).notifyDataSetChanged();
          GMTrace.o(11031623499776L, 82192);
        }
      });
    }
    if (bg.nm(paramString2))
    {
      w.e("MicroMsg.ExdeviceAddDataSourceUI", "onScanResult failed, broadcastName(%s), mac(%s), isCompleted(%b).", new Object[] { paramString1, paramString2, Boolean.valueOf(paramBoolean) });
      GMTrace.o(11073499430912L, 82504);
      return;
    }
    int i = 0;
    if (i < this.kEw.size())
    {
      paramString1 = (b)this.kEw.get(i);
      if ((paramString1 == null) || (bg.nm(paramString1.mac)))
      {
        paramString1 = this.kEw;
        int j = i - 1;
        paramString1.remove(i);
        i = j;
      }
    }
    for (;;)
    {
      i += 1;
      break;
      if (paramString1.mac.equalsIgnoreCase(paramString2))
      {
        w.i("MicroMsg.ExdeviceAddDataSourceUI", "the device(%s) has added into the list before.", new Object[] { paramString2 });
        GMTrace.o(11073499430912L, 82504);
        return;
        w.i("MicroMsg.ExdeviceAddDataSourceUI", "SearchBLEHardDevice doScene result(%s), mac(%s)", new Object[] { Boolean.valueOf(at.wS().a(new t(paramString2.replaceAll(":", ""), null, null), 0)), paramString2 });
        GMTrace.o(11073499430912L, 82504);
        return;
      }
    }
  }
  
  public void onCreate(Bundle paramBundle)
  {
    GMTrace.i(11072828342272L, 82499);
    super.onCreate(paramBundle);
    a(new MenuItem.OnMenuItemClickListener()
    {
      public final boolean onMenuItemClick(MenuItem paramAnonymousMenuItem)
      {
        GMTrace.i(11071351947264L, 82488);
        ExdeviceAddDataSourceUI.this.finish();
        GMTrace.o(11071351947264L, 82488);
        return true;
      }
    });
    oM(R.l.dqA);
    if ((com.tencent.mm.compatible.util.f.et(23)) && (!Build.VERSION.RELEASE.equalsIgnoreCase("6.0")) && (!Build.VERSION.RELEASE.equalsIgnoreCase("6.0.0"))) {
      this.kEC = true;
    }
    this.kEw = new LinkedList();
    this.kEB = ((LocationManager)this.vKB.vKW.getSystemService("location"));
    MP();
    paramBundle = new IntentFilter();
    paramBundle.addAction("android.bluetooth.adapter.action.STATE_CHANGED");
    paramBundle.addAction("android.location.MODE_CHANGED");
    this.vKB.vKW.registerReceiver(this.idj, paramBundle);
    at.wS().a(536, this);
    at.wS().a(1706, this);
    ad.auc().a(this);
    if (!com.tencent.mm.plugin.g.a.e.a.cc(this.vKB.vKW))
    {
      w.i("MicroMsg.ExdeviceAddDataSourceUI", "now sdk version not support ble device : %d", new Object[] { Integer.valueOf(Build.VERSION.SDK_INT) });
      mZ(2);
      GMTrace.o(11072828342272L, 82499);
      return;
    }
    if (!com.tencent.mm.plugin.g.a.e.a.ahp())
    {
      w.i("MicroMsg.ExdeviceAddDataSourceUI", "Bluetooth is not open, Just leave");
      mZ(1);
      GMTrace.o(11072828342272L, 82499);
      return;
    }
    if ((this.kEB != null) && (this.kEC) && (!this.kEB.isProviderEnabled("gps")))
    {
      w.i("MicroMsg.ExdeviceAddDataSourceUI", "Android 6.0.1, gps not open");
      mZ(4);
      GMTrace.o(11072828342272L, 82499);
      return;
    }
    ad.auc();
    com.tencent.mm.plugin.exdevice.model.e.atE();
    GMTrace.o(11072828342272L, 82499);
  }
  
  protected void onDestroy()
  {
    GMTrace.i(11073230995456L, 82502);
    super.onDestroy();
    at.xB().A(new Runnable()
    {
      public final void run()
      {
        GMTrace.i(11088397598720L, 82615);
        w.d("MicroMsg.ExdeviceAddDataSourceUI", "stopAllChannelEvent! ");
        qq localqq = new qq();
        com.tencent.mm.sdk.b.a.vgX.m(localqq);
        GMTrace.o(11088397598720L, 82615);
      }
    });
    at.wS().b(536, this);
    at.wS().b(1706, this);
    this.vKB.vKW.unregisterReceiver(this.idj);
    ad.auc().b(this);
    ad.aud().agW();
    GMTrace.o(11073230995456L, 82502);
  }
  
  private static final class a
    extends BaseAdapter
  {
    private com.tencent.mm.ao.a.a.c kEK;
    private List<ExdeviceAddDataSourceUI.b> kEw;
    
    public a()
    {
      GMTrace.i(11081686712320L, 82565);
      this.kEw = new LinkedList();
      c.a locala = new c.a();
      locala.gKR = R.g.aWr;
      this.kEK = locala.Jn();
      GMTrace.o(11081686712320L, 82565);
    }
    
    public final void at(List<ExdeviceAddDataSourceUI.b> paramList)
    {
      GMTrace.i(11081820930048L, 82566);
      this.kEw.clear();
      if ((paramList == null) || (paramList.size() == 0))
      {
        GMTrace.o(11081820930048L, 82566);
        return;
      }
      this.kEw.addAll(paramList);
      GMTrace.o(11081820930048L, 82566);
    }
    
    public final int getCount()
    {
      GMTrace.i(11082089365504L, 82568);
      int i = this.kEw.size();
      GMTrace.o(11082089365504L, 82568);
      return i;
    }
    
    public final long getItemId(int paramInt)
    {
      GMTrace.i(11082357800960L, 82570);
      long l = paramInt;
      GMTrace.o(11082357800960L, 82570);
      return l;
    }
    
    public final View getView(int paramInt, View paramView, ViewGroup paramViewGroup)
    {
      GMTrace.i(11082492018688L, 82571);
      ExdeviceAddDataSourceUI.b localb = na(paramInt);
      View localView;
      if (paramView == null)
      {
        paramView = new a();
        localView = View.inflate(paramViewGroup.getContext(), R.i.cvv, null);
        paramView.iub = ((ImageView)localView.findViewById(R.h.bGn));
        paramView.jUm = ((TextView)localView.findViewById(R.h.bPo));
        localView.setTag(paramView);
        paramViewGroup = paramView;
      }
      for (;;)
      {
        w.d("MicroMsg.ExdeviceAddDataSourceUI", "position(%s), name(%s), mac(%s).", new Object[] { Integer.valueOf(paramInt), localb.name, localb.mac });
        paramViewGroup.jUm.setText(localb.name);
        com.tencent.mm.ao.n.Jd().a(localb.iconUrl, paramViewGroup.iub, this.kEK);
        GMTrace.o(11082492018688L, 82571);
        return localView;
        paramViewGroup = (a)paramView.getTag();
        localView = paramView;
      }
    }
    
    public final ExdeviceAddDataSourceUI.b na(int paramInt)
    {
      GMTrace.i(11082223583232L, 82569);
      ExdeviceAddDataSourceUI.b localb = (ExdeviceAddDataSourceUI.b)this.kEw.get(paramInt);
      GMTrace.o(11082223583232L, 82569);
      return localb;
    }
    
    public final ExdeviceAddDataSourceUI.b wY(String paramString)
    {
      GMTrace.i(11081955147776L, 82567);
      if (!bg.nm(paramString))
      {
        Iterator localIterator = this.kEw.iterator();
        while (localIterator.hasNext())
        {
          ExdeviceAddDataSourceUI.b localb = (ExdeviceAddDataSourceUI.b)localIterator.next();
          if (paramString.equalsIgnoreCase(localb.mac))
          {
            GMTrace.o(11081955147776L, 82567);
            return localb;
          }
        }
      }
      GMTrace.o(11081955147776L, 82567);
      return null;
    }
    
    private static final class a
    {
      ImageView iub;
      TextView jUm;
      
      public a()
      {
        GMTrace.i(11089605558272L, 82624);
        GMTrace.o(11089605558272L, 82624);
      }
    }
  }
  
  private static final class b
  {
    String eEU;
    public String iconUrl;
    int kEL;
    String mac;
    String name;
    
    public b()
    {
      GMTrace.i(11064909496320L, 82440);
      this.kEL = ExdeviceAddDataSourceUI.c.kEM;
      GMTrace.o(11064909496320L, 82440);
    }
  }
  
  private static enum c
  {
    static
    {
      GMTrace.i(11038602821632L, 82244);
      kEM = 1;
      kEN = 2;
      kEO = 3;
      kEP = new int[] { kEM, kEN, kEO };
      GMTrace.o(11038602821632L, 82244);
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\plugin\exdevice\ui\ExdeviceAddDataSourceUI.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */