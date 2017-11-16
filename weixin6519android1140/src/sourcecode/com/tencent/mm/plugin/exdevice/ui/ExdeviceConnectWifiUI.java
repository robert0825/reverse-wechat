package com.tencent.mm.plugin.exdevice.ui;

import android.app.Dialog;
import android.content.DialogInterface;
import android.content.DialogInterface.OnCancelListener;
import android.content.DialogInterface.OnClickListener;
import android.content.Intent;
import android.net.wifi.WifiInfo;
import android.net.wifi.WifiManager;
import android.net.wifi.WifiManager.MulticastLock;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.text.Editable;
import android.text.Selection;
import android.text.TextWatcher;
import android.text.method.PasswordTransformationMethod;
import android.util.Base64;
import android.view.KeyEvent;
import android.view.MenuItem;
import android.view.MenuItem.OnMenuItemClickListener;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.View.OnKeyListener;
import android.view.View.OnTouchListener;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.TextView.OnEditorActionListener;
import android.widget.Toast;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.R.h;
import com.tencent.mm.R.i;
import com.tencent.mm.R.l;
import com.tencent.mm.a.e;
import com.tencent.mm.bj.d;
import com.tencent.mm.network.n;
import com.tencent.mm.network.n.a;
import com.tencent.mm.plugin.exdevice.d.a;
import com.tencent.mm.plugin.exdevice.jni.Java2CExDevice;
import com.tencent.mm.plugin.exdevice.model.j;
import com.tencent.mm.plugin.exdevice.model.j.a;
import com.tencent.mm.plugin.report.service.g;
import com.tencent.mm.sdk.platformtools.af;
import com.tencent.mm.sdk.platformtools.am;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.base.h;
import com.tencent.mm.ui.base.r;
import com.tencent.mm.ui.p;
import com.tencent.mm.y.at;
import com.tencent.mm.y.c;
import java.util.LinkedList;

public class ExdeviceConnectWifiUI
  extends MMActivity
{
  private TextWatcher WD;
  private WifiManager.MulticastLock kGA;
  private Runnable kGB;
  private View kGb;
  private TextView kGc;
  private View kGd;
  private EditText kGe;
  private View kGf;
  private r kGg;
  private WifiInfo kGh;
  private a kGi;
  private String kGj;
  private boolean kGk;
  private boolean kGl;
  private boolean kGm;
  private int kGn;
  private byte[] kGo;
  private int kGp;
  private int kGq;
  private int kGr;
  private String kGs;
  private int kGt;
  private long kGu;
  boolean kGv;
  private com.tencent.mm.plugin.exdevice.d.b kGw;
  private int kGx;
  private n kGy;
  private j.a kGz;
  private String klj;
  
  public ExdeviceConnectWifiUI()
  {
    GMTrace.i(10999948115968L, 81956);
    this.kGs = "";
    this.klj = "";
    this.kGv = false;
    this.kGB = new Runnable()
    {
      public final void run()
      {
        GMTrace.i(11095242702848L, 82666);
        if (!bg.nm(ExdeviceConnectWifiUI.a(ExdeviceConnectWifiUI.this)))
        {
          w.i("MicroMsg.exdevice.ExdeviceConnectWifiUI", "User has input password.");
          GMTrace.o(11095242702848L, 82666);
          return;
        }
        ExdeviceConnectWifiUI.c(ExdeviceConnectWifiUI.this).setText(ExdeviceConnectWifiUI.b(ExdeviceConnectWifiUI.this).kAY);
        Editable localEditable = ExdeviceConnectWifiUI.c(ExdeviceConnectWifiUI.this).getText();
        if (localEditable != null) {
          Selection.setSelection(localEditable, localEditable.length());
        }
        GMTrace.o(11095242702848L, 82666);
      }
    };
    GMTrace.o(10999948115968L, 81956);
  }
  
  private a L(int paramInt, String paramString)
  {
    GMTrace.i(11001021857792L, 81964);
    if ((bg.nm(paramString)) || (this.kGw == null))
    {
      w.i("MicroMsg.exdevice.ExdeviceConnectWifiUI", "ssid or wifiInfoList is null or nil.");
      GMTrace.o(11001021857792L, 81964);
      return null;
    }
    int i = 0;
    if (i < this.kGw.kAZ.size())
    {
      a locala = (a)this.kGw.kAZ.get(i);
      int j;
      if (locala == null)
      {
        this.kGw.kAZ.remove(i);
        this.kGk = true;
        j = i - 1;
      }
      do
      {
        do
        {
          i = j + 1;
          break;
          j = i;
        } while (locala.kAW != paramInt);
        j = i;
      } while (!paramString.equals(locala.kAX));
      GMTrace.o(11001021857792L, 81964);
      return locala;
    }
    GMTrace.o(11001021857792L, 81964);
    return null;
  }
  
  private void auB()
  {
    GMTrace.i(11001156075520L, 81965);
    if (this.kGh == null)
    {
      w.i("MicroMsg.exdevice.ExdeviceConnectWifiUI", "wifiInfo is null, delay to fill.");
      this.kGl = true;
      GMTrace.o(11001156075520L, 81965);
      return;
    }
    this.kGi.kAY = "";
    this.kGi.kAX = "";
    Object localObject = this.kGh.getSSID();
    localObject = L(this.kGn, (String)localObject);
    if (localObject == null)
    {
      GMTrace.o(11001156075520L, 81965);
      return;
    }
    if (bg.nm(((a)localObject).kAY))
    {
      w.i("MicroMsg.exdevice.ExdeviceConnectWifiUI", "Do not have a local password to fill for the current wifi.");
      this.kGw.kAZ.remove(localObject);
      this.kGk = true;
      GMTrace.o(11001156075520L, 81965);
      return;
    }
    this.kGi.kAY = com.tencent.mm.plugin.base.model.b.bt(((a)localObject).kAY, a.M(this.kGn, ((a)localObject).kAX));
    this.kGi.kAX = ((a)localObject).kAX;
    af.t(this.kGB);
    GMTrace.o(11001156075520L, 81965);
  }
  
  private void b(boolean paramBoolean1, boolean paramBoolean2, boolean paramBoolean3)
  {
    GMTrace.i(11001692946432L, 81969);
    View localView = this.kGb;
    int i;
    if (paramBoolean1)
    {
      i = 0;
      localView.setVisibility(i);
      if (!paramBoolean2) {
        break label83;
      }
      runOnUiThread(new Runnable()
      {
        public final void run()
        {
          GMTrace.i(11093766307840L, 82655);
          ExdeviceConnectWifiUI localExdeviceConnectWifiUI = ExdeviceConnectWifiUI.this;
          ActionBarActivity localActionBarActivity = ExdeviceConnectWifiUI.this.vKB.vKW;
          ExdeviceConnectWifiUI.this.getString(R.l.cUG);
          ExdeviceConnectWifiUI.a(localExdeviceConnectWifiUI, h.a(localActionBarActivity, ExdeviceConnectWifiUI.this.getString(R.l.drW), true, new DialogInterface.OnCancelListener()
          {
            public final void onCancel(DialogInterface paramAnonymous2DialogInterface)
            {
              GMTrace.i(11039810781184L, 82253);
              w.i("MicroMsg.exdevice.ExdeviceConnectWifiUI", "On progress cancel, stop airkiss");
              if (ExdeviceConnectWifiUI.d(ExdeviceConnectWifiUI.this) != ExdeviceConnectWifiUI.b.kGP) {
                ExdeviceConnectWifiUI.r(ExdeviceConnectWifiUI.this);
              }
              GMTrace.o(11039810781184L, 82253);
            }
          }));
          GMTrace.o(11093766307840L, 82655);
        }
      });
    }
    for (;;)
    {
      if (paramBoolean3) {
        Toast.makeText(this.vKB.vKW, R.l.drb, 0).show();
      }
      GMTrace.o(11001692946432L, 81969);
      return;
      i = 8;
      break;
      label83:
      runOnUiThread(new Runnable()
      {
        public final void run()
        {
          GMTrace.i(11052024594432L, 82344);
          if ((ExdeviceConnectWifiUI.g(ExdeviceConnectWifiUI.this) != null) && (ExdeviceConnectWifiUI.g(ExdeviceConnectWifiUI.this).isShowing())) {
            ExdeviceConnectWifiUI.g(ExdeviceConnectWifiUI.this).dismiss();
          }
          GMTrace.o(11052024594432L, 82344);
        }
      });
      if (this.kGA.isHeld()) {
        this.kGA.release();
      }
    }
  }
  
  private void ed(boolean paramBoolean)
  {
    GMTrace.i(11001424510976L, 81967);
    this.kGh = am.getWifiInfo(this);
    if (paramBoolean) {}
    int j;
    for (int i = b.kGM; this.kGh == null; i = this.kGx)
    {
      j = b.kGN;
      nd(j);
      GMTrace.o(11001424510976L, 81967);
      return;
    }
    String str = this.kGh.getSSID();
    w.i("MicroMsg.exdevice.ExdeviceConnectWifiUI", "Get SSID(%s)", new Object[] { str });
    if (!bg.nm(str)) {
      this.kGc.setText(str.replaceAll("\"", ""));
    }
    for (;;)
    {
      j = i;
      if (bg.nm(str)) {
        break;
      }
      j = i;
      if (str.equals(this.kGj)) {
        break;
      }
      this.kGj = str;
      j = i;
      break;
      this.kGc.setText("");
    }
  }
  
  private String getPassword()
  {
    GMTrace.i(11001290293248L, 81966);
    if (this.kGe.getText() != null)
    {
      String str = this.kGe.getText().toString();
      GMTrace.o(11001290293248L, 81966);
      return str;
    }
    GMTrace.o(11001290293248L, 81966);
    return null;
  }
  
  private void nc(int paramInt)
  {
    GMTrace.i(11000887640064L, 81963);
    long l = 0L;
    if (paramInt == 4) {
      l = System.currentTimeMillis() - this.kGu;
    }
    g.ork.i(13503, new Object[] { Integer.valueOf(paramInt), Integer.valueOf(this.kGr), Long.valueOf(l), this.kGs, this.klj, Integer.valueOf(this.kGt) });
    GMTrace.o(11000887640064L, 81963);
  }
  
  protected final void MP()
  {
    GMTrace.i(11000753422336L, 81962);
    oM(R.l.cvF);
    a(new MenuItem.OnMenuItemClickListener()
    {
      public final boolean onMenuItemClick(MenuItem paramAnonymousMenuItem)
      {
        GMTrace.i(11050950852608L, 82336);
        if (!ExdeviceConnectWifiUI.h(ExdeviceConnectWifiUI.this))
        {
          paramAnonymousMenuItem = new Intent();
          if (ExdeviceConnectWifiUI.d(ExdeviceConnectWifiUI.this) == ExdeviceConnectWifiUI.b.kGN) {
            break label75;
          }
        }
        label75:
        for (boolean bool = true;; bool = false)
        {
          paramAnonymousMenuItem.putExtra("is_wifi_connected", bool);
          ExdeviceConnectWifiUI.this.setResult(0, paramAnonymousMenuItem);
          ExdeviceConnectWifiUI.this.finish();
          GMTrace.o(11050950852608L, 82336);
          return false;
        }
      }
    });
    this.kGb = findViewById(R.h.ccp);
    this.kGc = ((TextView)findViewById(R.h.bPo));
    this.kGd = findViewById(R.h.bdM);
    this.kGe = ((EditText)findViewById(R.h.bSV));
    this.kGf = findViewById(R.h.bqh);
    this.WD = new TextWatcher()
    {
      public final void afterTextChanged(Editable paramAnonymousEditable)
      {
        GMTrace.i(11054843166720L, 82365);
        if (paramAnonymousEditable.length() > 31)
        {
          ExdeviceConnectWifiUI.i(ExdeviceConnectWifiUI.this).setVisibility(0);
          ExdeviceConnectWifiUI.j(ExdeviceConnectWifiUI.this).setEnabled(false);
          GMTrace.o(11054843166720L, 82365);
          return;
        }
        ExdeviceConnectWifiUI.i(ExdeviceConnectWifiUI.this).setVisibility(8);
        ExdeviceConnectWifiUI.j(ExdeviceConnectWifiUI.this).setEnabled(true);
        GMTrace.o(11054843166720L, 82365);
      }
      
      public final void beforeTextChanged(CharSequence paramAnonymousCharSequence, int paramAnonymousInt1, int paramAnonymousInt2, int paramAnonymousInt3)
      {
        GMTrace.i(11054574731264L, 82363);
        GMTrace.o(11054574731264L, 82363);
      }
      
      public final void onTextChanged(CharSequence paramAnonymousCharSequence, int paramAnonymousInt1, int paramAnonymousInt2, int paramAnonymousInt3)
      {
        GMTrace.i(11054708948992L, 82364);
        GMTrace.o(11054708948992L, 82364);
      }
    };
    this.kGb.setOnTouchListener(new View.OnTouchListener()
    {
      public final boolean onTouch(View paramAnonymousView, MotionEvent paramAnonymousMotionEvent)
      {
        GMTrace.i(11053635207168L, 82356);
        ExdeviceConnectWifiUI.c(ExdeviceConnectWifiUI.this).clearFocus();
        ExdeviceConnectWifiUI.this.aLo();
        GMTrace.o(11053635207168L, 82356);
        return false;
      }
    });
    this.kGf.setOnClickListener(new View.OnClickListener()
    {
      public final void onClick(View paramAnonymousView)
      {
        GMTrace.i(11098866581504L, 82693);
        w.i("MicroMsg.exdevice.ExdeviceConnectWifiUI", "onClick connectBtn.");
        ExdeviceConnectWifiUI.a(ExdeviceConnectWifiUI.this, ExdeviceConnectWifiUI.k(ExdeviceConnectWifiUI.this));
        GMTrace.o(11098866581504L, 82693);
      }
    });
    this.kGe.setTransformationMethod(new PasswordTransformationMethod());
    this.kGe.addTextChangedListener(this.WD);
    this.kGe.setOnEditorActionListener(new TextView.OnEditorActionListener()
    {
      public final boolean onEditorAction(TextView paramAnonymousTextView, int paramAnonymousInt, KeyEvent paramAnonymousKeyEvent)
      {
        GMTrace.i(10999813898240L, 81955);
        if ((paramAnonymousInt == 6) || (paramAnonymousInt == 5))
        {
          w.i("MicroMsg.exdevice.ExdeviceConnectWifiUI", "on next Key down.");
          ExdeviceConnectWifiUI.a(ExdeviceConnectWifiUI.this, ExdeviceConnectWifiUI.k(ExdeviceConnectWifiUI.this));
          GMTrace.o(10999813898240L, 81955);
          return true;
        }
        GMTrace.o(10999813898240L, 81955);
        return false;
      }
    });
    this.kGe.setOnKeyListener(new View.OnKeyListener()
    {
      public final boolean onKey(View paramAnonymousView, int paramAnonymousInt, KeyEvent paramAnonymousKeyEvent)
      {
        GMTrace.i(11107188080640L, 82755);
        if ((66 == paramAnonymousInt) && (paramAnonymousKeyEvent.getAction() == 0))
        {
          ExdeviceConnectWifiUI.a(ExdeviceConnectWifiUI.this, ExdeviceConnectWifiUI.k(ExdeviceConnectWifiUI.this));
          GMTrace.o(11107188080640L, 82755);
          return true;
        }
        GMTrace.o(11107188080640L, 82755);
        return false;
      }
    });
    this.kGe.requestFocus();
    GMTrace.o(11000753422336L, 81962);
  }
  
  protected final int getLayoutId()
  {
    GMTrace.i(11000082333696L, 81957);
    int i = R.i.cvF;
    GMTrace.o(11000082333696L, 81957);
    return i;
  }
  
  public final void nd(int paramInt)
  {
    for (;;)
    {
      try
      {
        GMTrace.i(11001558728704L, 81968);
        if (paramInt == 0)
        {
          w.e("MicroMsg.exdevice.ExdeviceConnectWifiUI", "Status is null.");
          GMTrace.o(11001558728704L, 81968);
          return;
        }
        this.kGx = paramInt;
        switch (7.kGI[(paramInt - 1)])
        {
        case 1: 
          if (paramInt != b.kGM)
          {
            this.kGe.clearFocus();
            aLo();
          }
          GMTrace.o(11001558728704L, 81968);
          continue;
          b(true, false, false);
        }
      }
      finally {}
      continue;
      b(true, true, false);
      continue;
      b(false, false, false);
      continue;
      nc(5);
      this.kGm = true;
      setResult(1);
      for (;;)
      {
        finish();
        break;
        nc(4);
        b(true, false, true);
        this.kGm = true;
        setResult(-1);
        at.xB().A(new Runnable()
        {
          public final void run()
          {
            GMTrace.i(11084505284608L, 82586);
            ExdeviceConnectWifiUI.q(ExdeviceConnectWifiUI.this);
            GMTrace.o(11084505284608L, 82586);
          }
        });
        if (getIntent().getBooleanExtra("jumpToBindDevice", false))
        {
          Intent localIntent = new Intent();
          localIntent.putExtra("device_scan_mode", getIntent().getStringExtra("device_scan_mode"));
          localIntent.putExtra("device_scan_conn_proto", getIntent().getStringExtra("device_scan_conn_proto"));
          localIntent.putExtra("device_id", getIntent().getStringExtra("device_id"));
          localIntent.putExtra("device_type", getIntent().getStringExtra("device_type"));
          localIntent.putExtra("device_title", getIntent().getStringExtra("device_title"));
          localIntent.putExtra("device_desc", getIntent().getStringExtra("device_desc"));
          localIntent.putExtra("device_icon_url", getIntent().getStringExtra("device_icon_url"));
          localIntent.putExtra("device_category_id", getIntent().getStringExtra("device_category_id"));
          localIntent.putExtra("device_brand_name", getIntent().getStringExtra("device_brand_name"));
          localIntent.putExtra("bind_ticket", getIntent().getStringExtra("bind_ticket"));
          d.b(this.vKB.vKW, "exdevice", ".ui.ExdeviceBindDeviceUI", localIntent);
        }
      }
    }
  }
  
  public void onCreate(Bundle paramBundle)
  {
    GMTrace.i(11000216551424L, 81958);
    super.onCreate(paramBundle);
    this.kGy = new n.a()
    {
      public final void db(int paramAnonymousInt)
      {
        GMTrace.i(11088129163264L, 82613);
        af.t(new Runnable()
        {
          public final void run()
          {
            GMTrace.i(11018470162432L, 82094);
            if (ExdeviceConnectWifiUI.d(ExdeviceConnectWifiUI.this) != ExdeviceConnectWifiUI.b.kGP) {
              ExdeviceConnectWifiUI.e(ExdeviceConnectWifiUI.this);
            }
            GMTrace.o(11018470162432L, 82094);
          }
        });
        GMTrace.o(11088129163264L, 82613);
      }
    };
    this.kGx = b.kGM;
    if (!at.AU())
    {
      finish();
      GMTrace.o(11000216551424L, 81958);
      return;
    }
    this.kGw = new com.tencent.mm.plugin.exdevice.d.b();
    this.kGi = new a();
    at.AR();
    this.kGn = c.ww();
    paramBundle = getIntent().getStringExtra("encryptKey");
    this.kGp = getIntent().getIntExtra("procInterval", 0);
    this.kGq = getIntent().getIntExtra("dataInterval", 0);
    w.d("MicroMsg.exdevice.ExdeviceConnectWifiUI", "Process interval:" + this.kGp + " Data interval:" + this.kGq);
    if (!bg.nm(paramBundle))
    {
      this.kGo = Base64.decode(paramBundle, 0);
      this.kGt = 1;
    }
    this.kGv = false;
    this.kGr = getIntent().getExtras().getInt("exdevice_airkiss_open_type");
    if (this.kGr == 2)
    {
      this.kGs = getIntent().getStringExtra("device_brand_name");
      this.klj = getIntent().getStringExtra("device_category_id");
    }
    this.kGz = new j.a()
    {
      public final void f(int paramAnonymousInt, Object... paramAnonymousVarArgs)
      {
        GMTrace.i(11084773720064L, 82588);
        if ((paramAnonymousInt != 0) || (paramAnonymousVarArgs == null) || (paramAnonymousVarArgs.length < 2) || (!(paramAnonymousVarArgs[0] instanceof Integer)) || (!(paramAnonymousVarArgs[1] instanceof Integer)))
        {
          GMTrace.o(11084773720064L, 82588);
          return;
        }
        paramAnonymousInt = ((Integer)paramAnonymousVarArgs[0]).intValue();
        int i = ((Integer)paramAnonymousVarArgs[1]).intValue();
        if (ExdeviceConnectWifiUI.f(ExdeviceConnectWifiUI.this).isHeld()) {
          ExdeviceConnectWifiUI.f(ExdeviceConnectWifiUI.this).release();
        }
        w.i("MicroMsg.exdevice.ExdeviceConnectWifiUI", "AirKiss jni callback (%d, %d)", new Object[] { Integer.valueOf(paramAnonymousInt), Integer.valueOf(i) });
        if ((paramAnonymousInt == 0) && (i == 0))
        {
          af.t(new Runnable()
          {
            public final void run()
            {
              GMTrace.i(11099403452416L, 82697);
              ExdeviceConnectWifiUI.this.nd(ExdeviceConnectWifiUI.b.kGP);
              GMTrace.o(11099403452416L, 82697);
            }
          });
          GMTrace.o(11084773720064L, 82588);
          return;
        }
        ExdeviceConnectWifiUI.this.runOnUiThread(new Runnable()
        {
          public final void run()
          {
            GMTrace.i(11097524404224L, 82683);
            ExdeviceConnectWifiUI.g(ExdeviceConnectWifiUI.this).dismiss();
            h.a(ExdeviceConnectWifiUI.this.vKB.vKW, ExdeviceConnectWifiUI.this.vKB.vKW.getString(R.l.dqy), "", ExdeviceConnectWifiUI.this.vKB.vKW.getString(R.l.dqX), "", false, new DialogInterface.OnClickListener()
            {
              public final void onClick(DialogInterface paramAnonymous3DialogInterface, int paramAnonymous3Int)
              {
                GMTrace.i(11008001179648L, 82016);
                ExdeviceConnectWifiUI.this.nd(ExdeviceConnectWifiUI.b.kGQ);
                GMTrace.o(11008001179648L, 82016);
              }
            }, null).show();
            GMTrace.o(11097524404224L, 82683);
          }
        });
        GMTrace.o(11084773720064L, 82588);
      }
    };
    j.atI().a(0, this.kGz);
    MP();
    at.xB().A(new Runnable()
    {
      public final void run()
      {
        GMTrace.i(11019275468800L, 82100);
        try
        {
          Object localObject = new StringBuilder();
          at.AR();
          localObject = e.d(c.zo() + "exdevice_wifi_infos", 0, Integer.MAX_VALUE);
          if (localObject != null)
          {
            ExdeviceConnectWifiUI.o(ExdeviceConnectWifiUI.this).aD((byte[])localObject);
            ExdeviceConnectWifiUI.p(ExdeviceConnectWifiUI.this);
          }
        }
        catch (Exception localException)
        {
          for (;;)
          {
            w.d("MicroMsg.exdevice.ExdeviceConnectWifiUI", localException.getMessage());
            w.printErrStackTrace("MicroMsg.exdevice.ExdeviceConnectWifiUI", localException, "", new Object[0]);
          }
        }
        af.i(new Runnable()
        {
          public final void run()
          {
            GMTrace.i(11005048389632L, 81994);
            ExdeviceConnectWifiUI.this.aLs();
            GMTrace.o(11005048389632L, 81994);
          }
        }, 500L);
        GMTrace.o(11019275468800L, 82100);
      }
    });
    nc(1);
    this.kGA = ((WifiManager)getSystemService("wifi")).createMulticastLock("localWifi");
    GMTrace.o(11000216551424L, 81958);
  }
  
  protected void onDestroy()
  {
    GMTrace.i(11000484986880L, 81960);
    super.onDestroy();
    if (!this.kGv) {
      nc(2);
    }
    j.atI().b(0, this.kGz);
    GMTrace.o(11000484986880L, 81960);
  }
  
  protected void onResume()
  {
    GMTrace.i(11000350769152L, 81959);
    super.onResume();
    ed(false);
    at.a(this.kGy);
    if (this.kGl)
    {
      auB();
      this.kGl = false;
    }
    GMTrace.o(11000350769152L, 81959);
  }
  
  protected void onStop()
  {
    GMTrace.i(11000619204608L, 81961);
    super.onStop();
    at.b(this.kGy);
    GMTrace.o(11000619204608L, 81961);
  }
  
  private static final class a
  {
    public static String M(int paramInt, String paramString)
    {
      GMTrace.i(11106516992000L, 82750);
      if (bg.nm(paramString))
      {
        GMTrace.o(11106516992000L, 82750);
        return null;
      }
      paramString = paramInt + "@" + paramString.hashCode();
      GMTrace.o(11106516992000L, 82750);
      return paramString;
    }
  }
  
  public static enum b
  {
    static
    {
      GMTrace.i(11094974267392L, 82664);
      kGM = 1;
      kGN = 2;
      kGO = 3;
      kGP = 4;
      kGQ = 5;
      kGR = new int[] { kGM, kGN, kGO, kGP, kGQ };
      GMTrace.o(11094974267392L, 82664);
    }
    
    public static int[] auC()
    {
      GMTrace.i(11094840049664L, 82663);
      int[] arrayOfInt = (int[])kGR.clone();
      GMTrace.o(11094840049664L, 82663);
      return arrayOfInt;
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\plugin\exdevice\ui\ExdeviceConnectWifiUI.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */