package com.tencent.mm.plugin.exdevice.ui;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.location.LocationManager;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.MenuItem;
import android.view.MenuItem.OnMenuItemClickListener;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.ScrollView;
import android.widget.TextView;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.R.h;
import com.tencent.mm.R.i;
import com.tencent.mm.R.k;
import com.tencent.mm.R.l;
import com.tencent.mm.ad.e;
import com.tencent.mm.ad.k;
import com.tencent.mm.bj.d;
import com.tencent.mm.compatible.util.f;
import com.tencent.mm.plugin.g.a.e.a;
import com.tencent.mm.sdk.platformtools.am;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.p;
import java.util.ArrayList;
import junit.framework.Assert;

public class ExdeviceBindDeviceGuideUI
  extends MMActivity
  implements e
{
  private ListView Ev;
  BroadcastReceiver idj;
  private LocationManager kEB;
  private boolean kEC;
  private a kEQ;
  private Button kER;
  private Button kES;
  private TextView kET;
  private ScrollView kEU;
  private ImageView kEV;
  private TextView kEW;
  private String kEX;
  private String kEY;
  private String kEZ;
  private String kEa;
  private String kEs;
  private String kEt;
  private TextView kEy;
  private String kFa;
  private long kFb;
  private ArrayList<String> kFc;
  private String kFd;
  private boolean kFe;
  private boolean kFf;
  private String kyK;
  private String kyL;
  private String mTitle;
  private String ry;
  
  public ExdeviceBindDeviceGuideUI()
  {
    GMTrace.i(11032697241600L, 82200);
    this.kFe = false;
    this.kFf = false;
    this.kEC = false;
    this.idj = new BroadcastReceiver()
    {
      public final void onReceive(Context paramAnonymousContext, Intent paramAnonymousIntent)
      {
        GMTrace.i(10997934850048L, 81941);
        w.i("MicroMsg.ExdeviceBindDeviceGuideUI", "Action broadcast receive...");
        if (paramAnonymousIntent == null)
        {
          GMTrace.o(10997934850048L, 81941);
          return;
        }
        paramAnonymousContext = paramAnonymousIntent.getAction();
        w.d("MicroMsg.ExdeviceBindDeviceGuideUI", "Receiver action(%s)", new Object[] { paramAnonymousContext });
        int i;
        if (("android.bluetooth.adapter.action.STATE_CHANGED".equals(paramAnonymousContext)) && (ExdeviceBindDeviceGuideUI.m(ExdeviceBindDeviceGuideUI.this)))
        {
          i = paramAnonymousIntent.getIntExtra("android.bluetooth.adapter.extra.STATE", -1);
          if (i == 12)
          {
            if ((!ExdeviceBindDeviceGuideUI.o(ExdeviceBindDeviceGuideUI.this)) || (ExdeviceBindDeviceGuideUI.p(ExdeviceBindDeviceGuideUI.this).isProviderEnabled("gps")))
            {
              ExdeviceBindDeviceGuideUI.a(ExdeviceBindDeviceGuideUI.this, 2);
              GMTrace.o(10997934850048L, 81941);
            }
          }
          else
          {
            if (i == 10) {
              ExdeviceBindDeviceGuideUI.a(ExdeviceBindDeviceGuideUI.this, 3);
            }
            GMTrace.o(10997934850048L, 81941);
          }
        }
        else
        {
          if (("android.net.wifi.WIFI_STATE_CHANGED".equals(paramAnonymousContext)) && (ExdeviceBindDeviceGuideUI.n(ExdeviceBindDeviceGuideUI.this)))
          {
            i = paramAnonymousIntent.getIntExtra("wifi_state", -1);
            w.i("MicroMsg.ExdeviceBindDeviceGuideUI", "Wifi state changed action: wifiState(%d)", new Object[] { Integer.valueOf(i) });
            if (i == 3)
            {
              ExdeviceBindDeviceGuideUI.a(ExdeviceBindDeviceGuideUI.this, 1);
              GMTrace.o(10997934850048L, 81941);
              return;
            }
            if (i == 1) {
              ExdeviceBindDeviceGuideUI.a(ExdeviceBindDeviceGuideUI.this, 5);
            }
            GMTrace.o(10997934850048L, 81941);
            return;
          }
          if ((!ExdeviceBindDeviceGuideUI.o(ExdeviceBindDeviceGuideUI.this)) || (!"android.location.MODE_CHANGED".equals(paramAnonymousContext))) {
            break label318;
          }
          if (ExdeviceBindDeviceGuideUI.p(ExdeviceBindDeviceGuideUI.this).isProviderEnabled("gps"))
          {
            if (!a.ahp())
            {
              ExdeviceBindDeviceGuideUI.a(ExdeviceBindDeviceGuideUI.this, 3);
              GMTrace.o(10997934850048L, 81941);
              return;
            }
            ExdeviceBindDeviceGuideUI.a(ExdeviceBindDeviceGuideUI.this, 2);
            GMTrace.o(10997934850048L, 81941);
            return;
          }
        }
        ExdeviceBindDeviceGuideUI.a(ExdeviceBindDeviceGuideUI.this, 6);
        label318:
        GMTrace.o(10997934850048L, 81941);
      }
    };
    GMTrace.o(11032697241600L, 82200);
  }
  
  private void mZ(int paramInt)
  {
    GMTrace.i(11033368330240L, 82205);
    switch (paramInt)
    {
    default: 
      switch (paramInt)
      {
      }
      break;
    }
    for (;;)
    {
      GMTrace.o(11033368330240L, 82205);
      return;
      this.kER.setText(this.vKB.vKW.getString(R.l.dqU));
      this.kES.setVisibility(8);
      this.kET.setText(this.vKB.vKW.getString(R.l.dqT));
      break;
      this.kER.setText(this.vKB.vKW.getString(R.l.cvF));
      this.kES.setText(this.vKB.vKW.getString(R.l.dqE));
      this.kET.setText(this.vKB.vKW.getString(R.l.dra));
      break;
      this.kEV.setImageResource(R.k.cJY);
      this.kEy.setText(R.l.dqQ);
      this.kEW.setText(R.l.dqF);
      break;
      this.kEV.setImageResource(R.k.cJY);
      this.kEy.setText(R.l.dqO);
      this.kEW.setText("");
      break;
      this.kEV.setImageResource(R.k.cPK);
      this.kEy.setText(R.l.dqQ);
      this.kEW.setText(R.l.dqM);
      break;
      this.kEV.setImageResource(R.k.cJY);
      this.kEy.setText(R.l.dqQ);
      this.kEW.setText(R.l.drr);
      break;
      this.kEV.setVisibility(8);
      this.kEy.setVisibility(8);
      this.kEW.setVisibility(8);
      this.Ev.setVisibility(0);
      this.kEU.setVisibility(0);
      GMTrace.o(11033368330240L, 82205);
      return;
      this.kEV.setVisibility(0);
      this.kEy.setVisibility(0);
      this.Ev.setVisibility(8);
      this.kEU.setVisibility(8);
      if (paramInt == 4)
      {
        this.kEW.setVisibility(8);
        GMTrace.o(11033368330240L, 82205);
        return;
      }
      this.kEW.setVisibility(0);
    }
  }
  
  public final void a(int paramInt1, int paramInt2, String paramString, k paramk)
  {
    GMTrace.i(11033234112512L, 82204);
    GMTrace.o(11033234112512L, 82204);
  }
  
  protected final int getLayoutId()
  {
    GMTrace.i(11032831459328L, 82201);
    int i = R.i.cvA;
    GMTrace.o(11032831459328L, 82201);
    return i;
  }
  
  public void onCreate(Bundle paramBundle)
  {
    GMTrace.i(11032965677056L, 82202);
    super.onCreate(paramBundle);
    a(new MenuItem.OnMenuItemClickListener()
    {
      public final boolean onMenuItemClick(MenuItem paramAnonymousMenuItem)
      {
        GMTrace.i(11027999621120L, 82165);
        ExdeviceBindDeviceGuideUI.this.finish();
        GMTrace.o(11027999621120L, 82165);
        return true;
      }
    });
    if ((f.et(23)) && (!Build.VERSION.RELEASE.equalsIgnoreCase("6.0")) && (!Build.VERSION.RELEASE.equalsIgnoreCase("6.0.0")))
    {
      w.i("MicroMsg.ExdeviceBindDeviceGuideUI", "Bluetooth limited version(%s)", new Object[] { Build.VERSION.RELEASE });
      this.kEC = true;
    }
    paramBundle = getIntent();
    this.kEX = paramBundle.getStringExtra("device_scan_mode");
    this.kEY = paramBundle.getStringExtra("device_scan_conn_proto");
    this.kyL = paramBundle.getStringExtra("device_id");
    this.kEa = paramBundle.getStringExtra("device_type");
    this.kEZ = paramBundle.getStringExtra("device_title");
    this.kEs = paramBundle.getStringExtra("device_desc");
    this.kEt = paramBundle.getStringExtra("device_icon_url");
    this.ry = paramBundle.getStringExtra("device_category_id");
    this.kyK = paramBundle.getStringExtra("device_brand_name");
    this.kFa = paramBundle.getStringExtra("bind_ticket");
    this.kFb = paramBundle.getLongExtra("device_ble_simple_proto", -1L);
    this.kFc = paramBundle.getStringArrayListExtra("device_airkiss_steps");
    this.kFd = paramBundle.getStringExtra("device_airkiss_key");
    this.mTitle = paramBundle.getStringExtra("device_airkiss_title");
    w.i("MicroMsg.ExdeviceBindDeviceGuideUI", "Category config guide steps(%d)", new Object[] { Integer.valueOf(this.kFc.size()) });
    this.kEB = ((LocationManager)this.vKB.vKW.getSystemService("location"));
    this.Ev = ((ListView)findViewById(R.h.brO));
    paramBundle = View.inflate(this, R.i.cvu, null);
    this.kET = ((TextView)paramBundle.findViewById(R.h.chH));
    this.kEQ = new a(this.kFc);
    this.Ev.addHeaderView(paramBundle);
    this.Ev.setDividerHeight(0);
    this.Ev.setClickable(false);
    this.Ev.setFooterDividersEnabled(false);
    this.Ev.setAdapter(this.kEQ);
    this.kEV = ((ImageView)findViewById(R.h.bLA));
    this.kEU = ((ScrollView)findViewById(R.h.bFK));
    this.kER = ((Button)findViewById(R.h.bqe));
    this.kES = ((Button)findViewById(R.h.bQQ));
    this.kEy = ((TextView)findViewById(R.h.bwY));
    this.kEW = ((TextView)findViewById(R.h.bwZ));
    paramBundle = "";
    if (this.kEX.compareTo("SCAN_CATALOG") == 0) {
      if (this.kEY.contains("wifi"))
      {
        this.kFe = true;
        paramBundle = this.vKB.vKW.getString(R.l.cvF);
        sq(paramBundle);
        if ((!this.kFf) || (this.kFe)) {
          break label779;
        }
        if (a.cc(this.vKB.vKW)) {
          break label711;
        }
        w.i("MicroMsg.ExdeviceBindDeviceGuideUI", "now sdk version not support ble device : %d", new Object[] { Integer.valueOf(Build.VERSION.SDK_INT) });
        mZ(4);
      }
    }
    for (;;)
    {
      this.kER.setOnClickListener(new View.OnClickListener()
      {
        public final void onClick(View paramAnonymousView)
        {
          GMTrace.i(11056856432640L, 82380);
          paramAnonymousView = new Intent();
          paramAnonymousView.putExtra("device_scan_mode", ExdeviceBindDeviceGuideUI.a(ExdeviceBindDeviceGuideUI.this));
          paramAnonymousView.putExtra("device_scan_conn_proto", ExdeviceBindDeviceGuideUI.b(ExdeviceBindDeviceGuideUI.this));
          paramAnonymousView.putExtra("device_id", ExdeviceBindDeviceGuideUI.c(ExdeviceBindDeviceGuideUI.this));
          paramAnonymousView.putExtra("device_type", ExdeviceBindDeviceGuideUI.d(ExdeviceBindDeviceGuideUI.this));
          paramAnonymousView.putExtra("device_title", ExdeviceBindDeviceGuideUI.e(ExdeviceBindDeviceGuideUI.this));
          paramAnonymousView.putExtra("device_desc", ExdeviceBindDeviceGuideUI.f(ExdeviceBindDeviceGuideUI.this));
          paramAnonymousView.putExtra("device_icon_url", ExdeviceBindDeviceGuideUI.g(ExdeviceBindDeviceGuideUI.this));
          paramAnonymousView.putExtra("device_category_id", ExdeviceBindDeviceGuideUI.h(ExdeviceBindDeviceGuideUI.this));
          paramAnonymousView.putExtra("device_brand_name", ExdeviceBindDeviceGuideUI.i(ExdeviceBindDeviceGuideUI.this));
          paramAnonymousView.putExtra("bind_ticket", ExdeviceBindDeviceGuideUI.j(ExdeviceBindDeviceGuideUI.this));
          paramAnonymousView.putExtra("device_ble_simple_proto", ExdeviceBindDeviceGuideUI.k(ExdeviceBindDeviceGuideUI.this));
          paramAnonymousView.putExtra("encryptKey", ExdeviceBindDeviceGuideUI.l(ExdeviceBindDeviceGuideUI.this));
          paramAnonymousView.putExtra("jumpToBindDevice", true);
          if ((ExdeviceBindDeviceGuideUI.m(ExdeviceBindDeviceGuideUI.this)) && (!ExdeviceBindDeviceGuideUI.n(ExdeviceBindDeviceGuideUI.this)))
          {
            d.b(ExdeviceBindDeviceGuideUI.this.vKB.vKW, "exdevice", ".ui.ExdeviceBindDeviceUI", paramAnonymousView);
            GMTrace.o(11056856432640L, 82380);
            return;
          }
          if ((ExdeviceBindDeviceGuideUI.n(ExdeviceBindDeviceGuideUI.this)) && (!ExdeviceBindDeviceGuideUI.m(ExdeviceBindDeviceGuideUI.this)))
          {
            paramAnonymousView.putExtra("exdevice_airkiss_open_type", 2);
            d.b(ExdeviceBindDeviceGuideUI.this.vKB.vKW, "exdevice", ".ui.ExdeviceConnectWifiUI", paramAnonymousView);
          }
          GMTrace.o(11056856432640L, 82380);
        }
      });
      this.kES.setOnClickListener(new View.OnClickListener()
      {
        public final void onClick(View paramAnonymousView)
        {
          GMTrace.i(11072157253632L, 82494);
          if ((ExdeviceBindDeviceGuideUI.n(ExdeviceBindDeviceGuideUI.this)) && (!ExdeviceBindDeviceGuideUI.m(ExdeviceBindDeviceGuideUI.this)))
          {
            paramAnonymousView = new Intent();
            paramAnonymousView.putExtra("device_scan_mode", ExdeviceBindDeviceGuideUI.a(ExdeviceBindDeviceGuideUI.this));
            paramAnonymousView.putExtra("device_scan_conn_proto", ExdeviceBindDeviceGuideUI.b(ExdeviceBindDeviceGuideUI.this));
            paramAnonymousView.putExtra("device_id", ExdeviceBindDeviceGuideUI.c(ExdeviceBindDeviceGuideUI.this));
            paramAnonymousView.putExtra("device_type", ExdeviceBindDeviceGuideUI.d(ExdeviceBindDeviceGuideUI.this));
            paramAnonymousView.putExtra("device_title", ExdeviceBindDeviceGuideUI.e(ExdeviceBindDeviceGuideUI.this));
            paramAnonymousView.putExtra("device_desc", ExdeviceBindDeviceGuideUI.f(ExdeviceBindDeviceGuideUI.this));
            paramAnonymousView.putExtra("device_icon_url", ExdeviceBindDeviceGuideUI.g(ExdeviceBindDeviceGuideUI.this));
            paramAnonymousView.putExtra("device_category_id", ExdeviceBindDeviceGuideUI.h(ExdeviceBindDeviceGuideUI.this));
            paramAnonymousView.putExtra("device_brand_name", ExdeviceBindDeviceGuideUI.i(ExdeviceBindDeviceGuideUI.this));
            paramAnonymousView.putExtra("bind_ticket", ExdeviceBindDeviceGuideUI.j(ExdeviceBindDeviceGuideUI.this));
            d.b(ExdeviceBindDeviceGuideUI.this.vKB.vKW, "exdevice", ".ui.ExdeviceBindDeviceUI", paramAnonymousView);
          }
          GMTrace.o(11072157253632L, 82494);
        }
      });
      paramBundle = new IntentFilter();
      paramBundle.addAction("android.bluetooth.adapter.action.STATE_CHANGED");
      paramBundle.addAction("android.net.wifi.WIFI_STATE_CHANGED");
      paramBundle.addAction("android.location.MODE_CHANGED");
      this.vKB.vKW.registerReceiver(this.idj, paramBundle);
      GMTrace.o(11032965677056L, 82202);
      return;
      if (this.kEY.contains("blue"))
      {
        this.kFf = true;
        paramBundle = this.vKB.vKW.getString(R.l.dqI);
        break;
      }
      Assert.assertTrue(false);
      break;
      Assert.assertTrue(false);
      break;
      label711:
      if (!a.ahp())
      {
        w.i("MicroMsg.ExdeviceBindDeviceGuideUI", "Bluetooth is not open, Just leave");
        mZ(3);
      }
      else if ((this.kEB != null) && (this.kEC) && (!this.kEB.isProviderEnabled("gps")))
      {
        w.i("MicroMsg.ExdeviceBindDeviceGuideUI", "BLE limited version, GPS do not open");
        mZ(6);
      }
      else
      {
        label779:
        if ((!this.kFf) && (this.kFe) && (!am.isWifi(this.vKB.vKW)))
        {
          w.i("MicroMsg.ExdeviceBindDeviceGuideUI", "wifi is not open, Just leave");
          mZ(5);
        }
        else if ((this.kFe) && (!this.kFf))
        {
          mZ(1);
        }
        else if ((this.kFf) && (!this.kFe))
        {
          mZ(2);
        }
      }
    }
  }
  
  protected void onDestroy()
  {
    GMTrace.i(11033099894784L, 82203);
    super.onDestroy();
    this.vKB.vKW.unregisterReceiver(this.idj);
    GMTrace.o(11033099894784L, 82203);
  }
  
  private static final class a
    extends BaseAdapter
  {
    private ArrayList<String> kFh;
    
    public a(ArrayList<String> paramArrayList)
    {
      GMTrace.i(11086115897344L, 82598);
      this.kFh = paramArrayList;
      GMTrace.o(11086115897344L, 82598);
    }
    
    private String iH(int paramInt)
    {
      GMTrace.i(11086384332800L, 82600);
      if ((this.kFh != null) && (this.kFh.size() > 0))
      {
        String str = (String)this.kFh.get(paramInt);
        GMTrace.o(11086384332800L, 82600);
        return str;
      }
      GMTrace.o(11086384332800L, 82600);
      return null;
    }
    
    public final int getCount()
    {
      GMTrace.i(11086250115072L, 82599);
      if (this.kFh != null)
      {
        int i = this.kFh.size();
        GMTrace.o(11086250115072L, 82599);
        return i;
      }
      GMTrace.o(11086250115072L, 82599);
      return 0;
    }
    
    public final long getItemId(int paramInt)
    {
      GMTrace.i(11086518550528L, 82601);
      long l = paramInt;
      GMTrace.o(11086518550528L, 82601);
      return l;
    }
    
    public final View getView(int paramInt, View paramView, ViewGroup paramViewGroup)
    {
      GMTrace.i(11086652768256L, 82602);
      if ((this.kFh == null) || (this.kFh.size() <= 0))
      {
        GMTrace.o(11086652768256L, 82602);
        return null;
      }
      String str = iH(paramInt);
      View localView;
      if (paramView == null)
      {
        paramView = new a();
        localView = View.inflate(paramViewGroup.getContext(), R.i.cvz, null);
        paramView.kFj = ((TextView)localView.findViewById(R.h.brP));
        paramView.kFi = ((TextView)localView.findViewById(R.h.cfU));
        paramView.kFk = localView.findViewById(R.h.chZ);
        paramView.kFl = localView.findViewById(R.h.bip);
        localView.setTag(paramView);
        paramViewGroup = paramView;
        paramViewGroup.kFi.setText(Integer.toString(paramInt + 1));
        paramViewGroup.kFj.setText(str);
        if ((paramInt != 0) || (this.kFh.size() != 1)) {
          break label207;
        }
        paramViewGroup.kFk.setVisibility(4);
        paramViewGroup.kFl.setVisibility(4);
      }
      for (;;)
      {
        GMTrace.o(11086652768256L, 82602);
        return localView;
        paramViewGroup = (a)paramView.getTag();
        localView = paramView;
        break;
        label207:
        if (paramInt == 0)
        {
          paramViewGroup.kFk.setVisibility(4);
          paramViewGroup.kFl.setVisibility(0);
        }
        else if (paramInt == this.kFh.size() - 1)
        {
          paramViewGroup.kFl.setVisibility(4);
          paramViewGroup.kFk.setVisibility(0);
        }
      }
    }
    
    private static final class a
    {
      TextView kFi;
      TextView kFj;
      View kFk;
      View kFl;
      
      public a()
      {
        GMTrace.i(11017530638336L, 82087);
        GMTrace.o(11017530638336L, 82087);
      }
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\plugin\exdevice\ui\ExdeviceBindDeviceGuideUI.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */