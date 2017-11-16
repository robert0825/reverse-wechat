package com.tencent.mm.plugin.exdevice.ui;

import android.annotation.SuppressLint;
import android.app.ProgressDialog;
import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.text.SpannableString;
import android.text.TextPaint;
import android.text.method.LinkMovementMethod;
import android.text.style.ClickableSpan;
import android.text.style.ForegroundColorSpan;
import android.util.Base64;
import android.view.MenuItem;
import android.view.MenuItem.OnMenuItemClickListener;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.ScrollView;
import android.widget.TextView;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.R.e;
import com.tencent.mm.R.h;
import com.tencent.mm.R.i;
import com.tencent.mm.R.k;
import com.tencent.mm.R.l;
import com.tencent.mm.ad.k;
import com.tencent.mm.ao.a.a.c;
import com.tencent.mm.ao.a.a.c.a;
import com.tencent.mm.plugin.exdevice.j.b;
import com.tencent.mm.plugin.exdevice.jni.Java2CExDevice;
import com.tencent.mm.plugin.exdevice.model.ad;
import com.tencent.mm.plugin.exdevice.model.e.b;
import com.tencent.mm.plugin.exdevice.model.f;
import com.tencent.mm.plugin.exdevice.model.h;
import com.tencent.mm.plugin.exdevice.model.j;
import com.tencent.mm.plugin.exdevice.model.j.a;
import com.tencent.mm.plugin.exdevice.model.t;
import com.tencent.mm.plugin.exdevice.model.v;
import com.tencent.mm.protocal.c.agx;
import com.tencent.mm.protocal.c.agy;
import com.tencent.mm.protocal.c.aos;
import com.tencent.mm.sdk.platformtools.af;
import com.tencent.mm.sdk.platformtools.am;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.p;
import com.tencent.mm.y.at;
import java.util.ArrayList;
import java.util.List;
import junit.framework.Assert;
import org.json.JSONObject;

@SuppressLint({"Assert"})
public class ExdeviceBindDeviceUI
  extends MMActivity
  implements com.tencent.mm.ad.e, e.b
{
  private ListView Ev;
  private ProgressDialog htG;
  private TextView jHd;
  private String kEa;
  private TextView kEy;
  private TextView kEz;
  private a kFm;
  private View kFn;
  private TextView kFo;
  private ImageView kFp;
  private ScrollView kFq;
  private View kFr;
  private int kFs;
  private String kFt;
  private String kFu;
  private boolean kFv;
  private j.a kFw;
  private boolean kFx;
  private boolean kFy;
  private String kyK;
  private j.a kzx;
  
  static
  {
    GMTrace.i(11010819751936L, 82037);
    if (!ExdeviceBindDeviceUI.class.desiredAssertionStatus()) {}
    for (boolean bool = true;; bool = false)
    {
      $assertionsDisabled = bool;
      GMTrace.o(11010819751936L, 82037);
      return;
    }
  }
  
  public ExdeviceBindDeviceUI()
  {
    GMTrace.i(11008403832832L, 82019);
    this.kFv = false;
    this.kFx = false;
    this.kFy = false;
    GMTrace.o(11008403832832L, 82019);
  }
  
  private void mZ(int paramInt)
  {
    GMTrace.i(11010148663296L, 82032);
    switch (paramInt)
    {
    default: 
      switch (paramInt)
      {
      default: 
        label76:
        switch (paramInt)
        {
        }
        break;
      }
      break;
    }
    for (;;)
    {
      GMTrace.o(11010148663296L, 82032);
      return;
      String str = getString(R.l.dqH);
      Object localObject = new SpannableString(str);
      ((SpannableString)localObject).setSpan(new ForegroundColorSpan(R.e.aOm), 0, str.length(), 33);
      ((SpannableString)localObject).setSpan(new ClickableSpan()
      {
        public final void onClick(View paramAnonymousView)
        {
          GMTrace.i(11056319561728L, 82376);
          f.S(ExdeviceBindDeviceUI.this.vKB.vKW, "http://o2o.gtimg.com/mydevice/page/deviceHelp.html");
          GMTrace.o(11056319561728L, 82376);
        }
        
        public final void updateDrawState(TextPaint paramAnonymousTextPaint)
        {
          GMTrace.i(11056453779456L, 82377);
          paramAnonymousTextPaint.setColor(paramAnonymousTextPaint.linkColor);
          paramAnonymousTextPaint.setUnderlineText(false);
          GMTrace.o(11056453779456L, 82377);
        }
      }, 0, str.length(), 33);
      this.kFo.setMovementMethod(LinkMovementMethod.getInstance());
      this.kFo.setText((CharSequence)localObject);
      break;
      str = getString(R.l.dqJ);
      localObject = getString(R.l.dqI);
      SpannableString localSpannableString = new SpannableString(str + (String)localObject);
      localSpannableString.setSpan(new ForegroundColorSpan(R.e.aOm), str.length(), str.length() + ((String)localObject).length(), 33);
      localSpannableString.setSpan(new ClickableSpan()
      {
        public final void onClick(View paramAnonymousView)
        {
          GMTrace.i(11014443630592L, 82064);
          ExdeviceBindDeviceUI.this.finish();
          GMTrace.o(11014443630592L, 82064);
        }
        
        public final void updateDrawState(TextPaint paramAnonymousTextPaint)
        {
          GMTrace.i(11014577848320L, 82065);
          paramAnonymousTextPaint.setColor(paramAnonymousTextPaint.linkColor);
          paramAnonymousTextPaint.setUnderlineText(false);
          GMTrace.o(11014577848320L, 82065);
        }
      }, str.length(), str.length() + ((String)localObject).length(), 33);
      this.kFo.setMovementMethod(LinkMovementMethod.getInstance());
      this.kFo.setText(localSpannableString);
      break;
      str = getString(R.l.dqK);
      localObject = getString(R.l.cvF);
      localSpannableString = new SpannableString(str + (String)localObject);
      localSpannableString.setSpan(new ForegroundColorSpan(R.e.aOm), str.length(), str.length() + ((String)localObject).length(), 33);
      localSpannableString.setSpan(new ClickableSpan()
      {
        public final void onClick(View paramAnonymousView)
        {
          GMTrace.i(11054172078080L, 82360);
          ExdeviceBindDeviceUI.this.finish();
          GMTrace.o(11054172078080L, 82360);
        }
        
        public final void updateDrawState(TextPaint paramAnonymousTextPaint)
        {
          GMTrace.i(11054306295808L, 82361);
          paramAnonymousTextPaint.setColor(paramAnonymousTextPaint.linkColor);
          paramAnonymousTextPaint.setUnderlineText(false);
          GMTrace.o(11054306295808L, 82361);
        }
      }, str.length(), str.length() + ((String)localObject).length(), 33);
      this.kFo.setMovementMethod(LinkMovementMethod.getInstance());
      this.kFo.setText(localSpannableString);
      break;
      this.kFp.setImageResource(R.k.cJY);
      this.kEy.setText(R.l.dqQ);
      this.kEz.setText(R.l.dqF);
      break label76;
      this.kFp.setImageResource(R.k.cJY);
      this.kEy.setText(R.l.dqO);
      this.kEz.setText("");
      break label76;
      this.kFp.setImageResource(R.k.cPK);
      this.kEy.setText(R.l.dqQ);
      this.kEz.setText(R.l.dqM);
      break label76;
      this.kFn.setVisibility(0);
      this.Ev.setVisibility(0);
      this.kFo.setVisibility(0);
      this.kFp.setVisibility(8);
      this.kEy.setVisibility(8);
      this.kEz.setVisibility(8);
      GMTrace.o(11010148663296L, 82032);
      return;
      this.kFq.setVisibility(8);
      this.kFn.setVisibility(8);
      this.Ev.setVisibility(8);
      this.kFo.setVisibility(8);
      this.kFp.setVisibility(0);
      this.kEy.setVisibility(0);
      if (paramInt == 4)
      {
        this.kEz.setVisibility(8);
        GMTrace.o(11010148663296L, 82032);
        return;
      }
      this.kEz.setVisibility(0);
    }
  }
  
  protected final void MP()
  {
    GMTrace.i(11008940703744L, 82023);
    this.Ev = ((ListView)findViewById(R.h.bKn));
    View localView = View.inflate(this, R.i.cvE, null);
    this.kFr = View.inflate(this, R.i.cwg, null);
    this.kFn = this.kFr.findViewById(R.h.caR);
    this.jHd = ((TextView)this.kFr.findViewById(R.h.chC));
    this.kFo = ((TextView)findViewById(R.h.bZy));
    this.kFp = ((ImageView)findViewById(R.h.bLA));
    this.kEy = ((TextView)findViewById(R.h.bwY));
    this.kEz = ((TextView)findViewById(R.h.bwZ));
    this.kFq = ((ScrollView)findViewById(R.h.btI));
    this.Ev.addHeaderView(localView, null, false);
    this.Ev.addFooterView(this.kFr, null, false);
    this.kFm = new a(this.kyK, this.kFs, this.kFt);
    this.Ev.setAdapter(this.kFm);
    this.Ev.setOnItemClickListener(new AdapterView.OnItemClickListener()
    {
      public final void onItemClick(AdapterView<?> paramAnonymousAdapterView, View paramAnonymousView, int paramAnonymousInt, long paramAnonymousLong)
      {
        GMTrace.i(11017933291520L, 82090);
        int i = ((ListView)paramAnonymousAdapterView).getHeaderViewsCount();
        paramAnonymousAdapterView = ExdeviceBindDeviceUI.a(ExdeviceBindDeviceUI.this).nb(paramAnonymousInt - i);
        if (paramAnonymousAdapterView.kFX.fsJ != 0)
        {
          ExdeviceBindDeviceUI.a(ExdeviceBindDeviceUI.this, paramAnonymousAdapterView);
          GMTrace.o(11017933291520L, 82090);
          return;
        }
        ExdeviceBindDeviceUI.b(ExdeviceBindDeviceUI.this, paramAnonymousAdapterView);
        GMTrace.o(11017933291520L, 82090);
      }
    });
    if ((this.kFy) && (!this.kFx))
    {
      if (!com.tencent.mm.plugin.g.a.e.a.cc(this.vKB.vKW))
      {
        w.i("MicroMsg.ExdeviceBindDeviceUI", "now sdk version not support ble device : %d", new Object[] { Integer.valueOf(Build.VERSION.SDK_INT) });
        mZ(4);
        GMTrace.o(11008940703744L, 82023);
        return;
      }
      if (!com.tencent.mm.plugin.g.a.e.a.ahp())
      {
        w.i("MicroMsg.ExdeviceBindDeviceUI", "Bluetooth is not open, Just leave");
        mZ(3);
        GMTrace.o(11008940703744L, 82023);
        return;
      }
    }
    if ((!this.kFy) && (this.kFx) && (!am.isWifi(this.vKB.vKW)))
    {
      w.i("MicroMsg.ExdeviceBindDeviceUI", "wifi is not open, Just leave");
      mZ(5);
      GMTrace.o(11008940703744L, 82023);
      return;
    }
    if (this.kFs == e.kFP)
    {
      mZ(0);
      GMTrace.o(11008940703744L, 82023);
      return;
    }
    if (this.kFs == e.kFQ)
    {
      if ((this.kFy) && (this.kFx))
      {
        Assert.assertTrue(false);
        mZ(1);
        GMTrace.o(11008940703744L, 82023);
        return;
      }
      if (this.kFy)
      {
        mZ(2);
        GMTrace.o(11008940703744L, 82023);
        return;
      }
      if (this.kFx)
      {
        mZ(1);
        GMTrace.o(11008940703744L, 82023);
      }
    }
    else
    {
      int i = e.kFO;
      Assert.assertTrue(false);
    }
    GMTrace.o(11008940703744L, 82023);
  }
  
  public final void a(final int paramInt1, final int paramInt2, final String paramString, final k paramk)
  {
    GMTrace.i(11009746010112L, 82029);
    w.i("MicroMsg.ExdeviceBindDeviceUI", "onSceneEnd, errType(%d) errCode(%d) errMsg(%s).", new Object[] { Integer.valueOf(paramInt1), Integer.valueOf(paramInt2), paramString });
    if (paramk == null)
    {
      w.e("MicroMsg.ExdeviceBindDeviceUI", "onSceneEnd, scene is null.");
      GMTrace.o(11009746010112L, 82029);
      return;
    }
    af.t(new Runnable()
    {
      public final void run()
      {
        GMTrace.i(11055782690816L, 82372);
        ExdeviceBindDeviceUI.a(ExdeviceBindDeviceUI.this, paramInt1, paramInt2, paramString, paramk);
        GMTrace.o(11055782690816L, 82372);
      }
    });
    GMTrace.o(11009746010112L, 82029);
  }
  
  final void a(f paramf)
  {
    GMTrace.i(11009880227840L, 82030);
    Object localObject = paramf.getKey();
    if (this.kFm.wZ((String)localObject))
    {
      GMTrace.o(11009880227840L, 82030);
      return;
    }
    w.d("MicroMsg.ExdeviceBindDeviceUI", "Add device: " + paramf.auA());
    localObject = this.kFm;
    if ((paramf != null) && (!((a)localObject).wZ(paramf.getKey())))
    {
      paramf.kFS = ((a)localObject).c(paramf);
      ((a)localObject).kFG.add(paramf);
    }
    this.kFm.notifyDataSetChanged();
    if (paramf.kFT == b.kFL)
    {
      w.i("MicroMsg.ExdeviceBindDeviceUI", "NetSceneSearchBLEHardDevice doScene, mac(%s), brandName(%s),categoryId(%s)", new Object[] { paramf.kFU.aKJ, this.kyK, this.kFt });
      at.wS().a(new t(paramf.kFU.aKJ, this.kyK, this.kFt), 0);
      GMTrace.o(11009880227840L, 82030);
      return;
    }
    if (paramf.kFT == b.kFK)
    {
      w.i("MicroMsg.ExdeviceBindDeviceUI", "NetSceneSearchWiFiHardDevice doScene, deviceType(%s), deviceId(%s)", new Object[] { paramf.kFV.kEa, paramf.kFV.kyL });
      at.wS().a(new v(paramf.kFV.kEa, paramf.kFV.kyL, paramf.kGa), 0);
      GMTrace.o(11009880227840L, 82030);
      return;
    }
    Assert.assertTrue(false);
    GMTrace.o(11009880227840L, 82030);
  }
  
  public final void b(String paramString, byte[] paramArrayOfByte, boolean paramBoolean)
  {
    GMTrace.i(11009611792384L, 82028);
    GMTrace.o(11009611792384L, 82028);
  }
  
  public final void d(String paramString, int paramInt, long paramLong)
  {
    GMTrace.i(11009477574656L, 82027);
    GMTrace.o(11009477574656L, 82027);
  }
  
  protected final int getLayoutId()
  {
    GMTrace.i(11008538050560L, 82020);
    int i = R.i.cvC;
    GMTrace.o(11008538050560L, 82020);
    return i;
  }
  
  public final void k(String paramString1, String paramString2, boolean paramBoolean)
  {
    GMTrace.i(11009343356928L, 82026);
    w.d("MicroMsg.ExdeviceBindDeviceUI", "onScanResult, broadcastName(%s), mac(%s), isCompleted(%b).", new Object[] { paramString1, paramString2, Boolean.valueOf(paramBoolean) });
    if (bg.nm(paramString2))
    {
      w.e("MicroMsg.ExdeviceBindDeviceUI", "onScanResult failed, broadcastName(%s), mac(%s), isCompleted(%b).", new Object[] { paramString1, paramString2, Boolean.valueOf(paramBoolean) });
      GMTrace.o(11009343356928L, 82026);
      return;
    }
    final f localf = new f();
    localf.kFT = b.kFL;
    localf.kFU = new c();
    localf.kFU.kFN = paramString1;
    localf.kFU.aKJ = b.bT(b.xh(paramString2));
    af.t(new Runnable()
    {
      public final void run()
      {
        GMTrace.i(11095511138304L, 82668);
        ExdeviceBindDeviceUI.this.a(localf);
        GMTrace.o(11095511138304L, 82668);
      }
    });
    GMTrace.o(11009343356928L, 82026);
  }
  
  protected void onActivityResult(int paramInt1, int paramInt2, Intent paramIntent)
  {
    GMTrace.i(11010014445568L, 82031);
    this.kFm.auz();
    this.kFm.notifyDataSetChanged();
    GMTrace.o(11010014445568L, 82031);
  }
  
  public void onCreate(Bundle paramBundle)
  {
    GMTrace.i(11008672268288L, 82021);
    super.onCreate(paramBundle);
    a(new MenuItem.OnMenuItemClickListener()
    {
      public final boolean onMenuItemClick(MenuItem paramAnonymousMenuItem)
      {
        GMTrace.i(11061688270848L, 82416);
        ExdeviceBindDeviceUI.this.finish();
        GMTrace.o(11061688270848L, 82416);
        return true;
      }
    });
    Object localObject = getIntent();
    this.kFt = ((Intent)localObject).getStringExtra("device_category_id");
    this.kyK = ((Intent)localObject).getStringExtra("device_brand_name");
    this.kEa = ((Intent)localObject).getStringExtra("device_type");
    if ((this.kEa == null) || (this.kEa.length() == 0)) {
      this.kEa = this.kyK;
    }
    String str2 = ((Intent)localObject).getStringExtra("device_scan_conn_proto");
    String str3 = ((Intent)localObject).getStringExtra("device_scan_mode");
    paramBundle = "";
    String str1 = ((Intent)localObject).getStringExtra("device_title");
    localObject = str1;
    if (bg.nm(str1)) {
      localObject = this.vKB.vKW.getString(R.l.drk);
    }
    if (str3.contains("SCAN_MY_DEVICE"))
    {
      this.kFs = e.kFP;
      paramBundle = this.vKB.vKW.getString(R.l.dqB);
      sq(paramBundle);
      if (this.kFs != e.kFQ) {
        break label444;
      }
      this.kFx = str2.contains("wifi");
      this.kFy = str2.contains("blue");
      w.i("MicroMsg.ExdeviceBindDeviceUI", "mIsScanWifi(%b), mIsScanBlue(%b)", new Object[] { Boolean.valueOf(this.kFx), Boolean.valueOf(this.kFy) });
    }
    for (;;)
    {
      this.kzx = new j.a()
      {
        public final void f(int paramAnonymousInt, Object... paramAnonymousVarArgs)
        {
          GMTrace.i(11031355064320L, 82190);
          if ((paramAnonymousInt != 10) || (paramAnonymousVarArgs == null))
          {
            GMTrace.o(11031355064320L, 82190);
            return;
          }
          paramAnonymousVarArgs = (byte[])paramAnonymousVarArgs[0];
          for (;;)
          {
            try
            {
              JSONObject localJSONObject = new JSONObject(new String(paramAnonymousVarArgs));
              localObject1 = localJSONObject.getJSONObject("deviceInfo");
              paramAnonymousVarArgs = ((JSONObject)localObject1).getString("deviceType");
              Object[] arrayOfObject1;
              w.printErrStackTrace("MicroMsg.ExdeviceBindDeviceUI", localException1, "", new Object[0]);
            }
            catch (Exception localException1)
            {
              try
              {
                localObject1 = ((JSONObject)localObject1).getString("deviceId");
                localObject2 = localObject1;
                arrayOfObject1 = paramAnonymousVarArgs;
              }
              catch (Exception localException2)
              {
                for (;;)
                {
                  final Object localObject2;
                  Object[] arrayOfObject2;
                  Object localObject1 = null;
                }
              }
              try
              {
                if (localJSONObject.isNull("manufacturerData")) {
                  break label157;
                }
                localObject2 = localJSONObject.getString("manufacturerData");
                arrayOfObject1 = paramAnonymousVarArgs;
                paramAnonymousVarArgs = (Object[])localObject2;
                if ((arrayOfObject1 != null) && (localObject1 != null)) {
                  break;
                }
                GMTrace.o(11031355064320L, 82190);
                return;
              }
              catch (Exception localException3)
              {
                break label131;
              }
              localException1 = localException1;
              localObject1 = null;
              paramAnonymousVarArgs = null;
            }
            label131:
            w.e("MicroMsg.ExdeviceBindDeviceUI", "json decode failed: deviceInfo decode");
            arrayOfObject2 = paramAnonymousVarArgs;
            localObject2 = localObject1;
            label157:
            paramAnonymousVarArgs = null;
            localObject1 = localObject2;
          }
          localObject2 = new ExdeviceBindDeviceUI.f(ExdeviceBindDeviceUI.this);
          ((ExdeviceBindDeviceUI.f)localObject2).kFT = ExdeviceBindDeviceUI.b.kFK;
          ((ExdeviceBindDeviceUI.f)localObject2).kFV = new ExdeviceBindDeviceUI.d(ExdeviceBindDeviceUI.this);
          ((ExdeviceBindDeviceUI.f)localObject2).kFV.kEa = arrayOfObject2;
          ((ExdeviceBindDeviceUI.f)localObject2).kFV.kyL = ((String)localObject1);
          if (!bg.nm(paramAnonymousVarArgs))
          {
            ((ExdeviceBindDeviceUI.f)localObject2).kGa = Base64.encodeToString(paramAnonymousVarArgs.getBytes(), 2);
            w.i("MicroMsg.ExdeviceBindDeviceUI", "device.mManufacturerData: %s", new Object[] { ((ExdeviceBindDeviceUI.f)localObject2).kGa });
          }
          for (;;)
          {
            af.t(new Runnable()
            {
              public final void run()
              {
                GMTrace.i(11079270793216L, 82547);
                ExdeviceBindDeviceUI.this.a(localObject2);
                GMTrace.o(11079270793216L, 82547);
              }
            });
            GMTrace.o(11031355064320L, 82190);
            return;
            ((ExdeviceBindDeviceUI.f)localObject2).kGa = null;
          }
        }
      };
      this.kFw = new j.a()
      {
        public final void f(int paramAnonymousInt, Object... paramAnonymousVarArgs)
        {
          GMTrace.i(11092826783744L, 82648);
          GMTrace.o(11092826783744L, 82648);
        }
      };
      MP();
      this.jHd.setText(this.vKB.vKW.getString(R.l.drV, new Object[] { localObject }));
      at.wS().a(1264, this);
      at.wS().a(1706, this);
      at.wS().a(1270, this);
      at.wS().a(1719, this);
      if (this.kFy) {
        ad.auc().a(this);
      }
      if (this.kFx)
      {
        j.atI().a(10, this.kzx);
        j.atI().a(11, this.kFw);
        Java2CExDevice.initWCLanDeviceLib();
      }
      GMTrace.o(11008672268288L, 82021);
      return;
      if (str3.compareTo("SCAN_CATALOG") == 0)
      {
        this.kFs = e.kFQ;
        paramBundle = this.vKB.vKW.getString(R.l.dqz);
        break;
      }
      Assert.assertTrue(false);
      break;
      label444:
      if (this.kFs == e.kFP)
      {
        this.kFy = true;
        this.kFx = true;
      }
    }
  }
  
  protected void onDestroy()
  {
    GMTrace.i(11009209139200L, 82025);
    super.onDestroy();
    if (this.kFx)
    {
      at.xB().A(new Runnable()
      {
        public final void run()
        {
          GMTrace.i(11061956706304L, 82418);
          Java2CExDevice.stopScanWCLanDevice();
          Java2CExDevice.releaseWCLanDeviceLib();
          GMTrace.o(11061956706304L, 82418);
        }
      });
      j.atI().b(10, this.kzx);
      j.atI().b(11, this.kFw);
    }
    if (this.kFy)
    {
      ad.auc().b(this);
      ad.aud().agW();
    }
    at.wS().b(1264, this);
    at.wS().b(1706, this);
    at.wS().b(1270, this);
    at.wS().b(1719, this);
    GMTrace.o(11009209139200L, 82025);
  }
  
  protected void onPause()
  {
    GMTrace.i(11009074921472L, 82024);
    super.onPause();
    w.i("MicroMsg.ExdeviceBindDeviceUI", "onPause stop scan.");
    if (this.kFx) {
      Java2CExDevice.stopScanWCLanDevice();
    }
    if (this.kFy) {
      ad.aud().agW();
    }
    GMTrace.o(11009074921472L, 82024);
  }
  
  protected void onResume()
  {
    GMTrace.i(11008806486016L, 82022);
    super.onResume();
    w.i("MicroMsg.ExdeviceBindDeviceUI", "onResume start scan.");
    if (this.kFy)
    {
      ad.auc();
      com.tencent.mm.plugin.exdevice.model.e.atE();
    }
    if (this.kFx) {
      Java2CExDevice.startScanWCLanDevice(new byte[0], 1000);
    }
    this.kFm.auz();
    this.kFm.notifyDataSetChanged();
    GMTrace.o(11008806486016L, 82022);
  }
  
  private static final class a
    extends BaseAdapter
  {
    private c kEK;
    List<ExdeviceBindDeviceUI.f> kFG;
    private String kFH;
    private int kFI;
    private String kFJ;
    
    public a(String paramString1, int paramInt, String paramString2)
    {
      GMTrace.i(11005182607360L, 81995);
      this.kFH = paramString1;
      this.kFI = paramInt;
      this.kFJ = paramString2;
      this.kFG = new ArrayList();
      paramString1 = new c.a();
      paramString1.gKV = R.e.aOY;
      this.kEK = paramString1.Jn();
      GMTrace.o(11005182607360L, 81995);
    }
    
    private int xb(String paramString)
    {
      GMTrace.i(11006390566912L, 82004);
      int i = 0;
      while (i < this.kFG.size())
      {
        if (((ExdeviceBindDeviceUI.f)this.kFG.get(i)).getKey().compareTo(paramString) == 0)
        {
          GMTrace.o(11006390566912L, 82004);
          return i;
        }
        i += 1;
      }
      GMTrace.o(11006390566912L, 82004);
      return -1;
    }
    
    private static boolean xc(String paramString)
    {
      GMTrace.i(11006793220096L, 82007);
      if ((paramString == null) || (paramString.length() == 0))
      {
        GMTrace.o(11006793220096L, 82007);
        return true;
      }
      GMTrace.o(11006793220096L, 82007);
      return false;
    }
    
    public final void auz()
    {
      GMTrace.i(11005316825088L, 81996);
      int i = 0;
      while (i < this.kFG.size())
      {
        ExdeviceBindDeviceUI.f localf = (ExdeviceBindDeviceUI.f)this.kFG.get(i);
        localf.kFS = c(localf);
        i += 1;
      }
      GMTrace.o(11005316825088L, 81996);
    }
    
    public final boolean b(ExdeviceBindDeviceUI.f paramf)
    {
      GMTrace.i(11005451042816L, 81997);
      if (xb(paramf.getKey()) < 0)
      {
        GMTrace.o(11005451042816L, 81997);
        return false;
      }
      paramf.kFS = c(paramf);
      GMTrace.o(11005451042816L, 81997);
      return true;
    }
    
    final boolean c(ExdeviceBindDeviceUI.f paramf)
    {
      GMTrace.i(11006659002368L, 82006);
      if (paramf.kFX == null)
      {
        GMTrace.o(11006659002368L, 82006);
        return false;
      }
      if (this.kFI == ExdeviceBindDeviceUI.e.kFQ)
      {
        if ((paramf.kFX.uwj == null) || (paramf.kFX.uwj.compareTo(this.kFH) != 0))
        {
          GMTrace.o(11006659002368L, 82006);
          return false;
        }
        if ((paramf.kFX.uws == null) || (paramf.kFX.uws.compareTo(this.kFJ) != 0))
        {
          GMTrace.o(11006659002368L, 82006);
          return false;
        }
      }
      else if (this.kFI == ExdeviceBindDeviceUI.e.kFP)
      {
        if (paramf.kFX.fsJ == 0)
        {
          GMTrace.o(11006659002368L, 82006);
          return false;
        }
      }
      else
      {
        Assert.assertTrue(false);
        GMTrace.o(11006659002368L, 82006);
        return false;
      }
      GMTrace.o(11006659002368L, 82006);
      return true;
    }
    
    final int cb(String paramString1, String paramString2)
    {
      GMTrace.i(11006524784640L, 82005);
      int i = 0;
      while (i < this.kFG.size())
      {
        Object localObject = (ExdeviceBindDeviceUI.f)this.kFG.get(i);
        String str;
        if (((ExdeviceBindDeviceUI.f)localObject).kFW != null)
        {
          str = ((ExdeviceBindDeviceUI.f)localObject).kFW.tSz;
          if (((ExdeviceBindDeviceUI.f)localObject).kFW == null) {
            break label148;
          }
          localObject = ((ExdeviceBindDeviceUI.f)localObject).kFW.jhl;
        }
        for (;;)
        {
          if ((xc(str)) || (xc((String)localObject)) || (paramString1.compareTo(str) != 0) || (paramString2.compareTo((String)localObject) != 0)) {
            break label178;
          }
          GMTrace.o(11006524784640L, 82005);
          return i;
          if (((ExdeviceBindDeviceUI.f)localObject).kFT == ExdeviceBindDeviceUI.b.kFK)
          {
            str = ((ExdeviceBindDeviceUI.f)localObject).kFV.kEa;
            break;
          }
          str = null;
          break;
          label148:
          if (((ExdeviceBindDeviceUI.f)localObject).kFT == ExdeviceBindDeviceUI.b.kFK) {
            localObject = ((ExdeviceBindDeviceUI.f)localObject).kFV.kyL;
          } else {
            localObject = null;
          }
        }
        label178:
        i += 1;
      }
      GMTrace.o(11006524784640L, 82005);
      return -1;
    }
    
    public final int getCount()
    {
      GMTrace.i(11005853696000L, 82000);
      int i = 0;
      int k;
      for (int j = 0; i < this.kFG.size(); j = k)
      {
        k = j;
        if (((ExdeviceBindDeviceUI.f)this.kFG.get(i)).kFS) {
          k = j + 1;
        }
        i += 1;
      }
      GMTrace.o(11005853696000L, 82000);
      return j;
    }
    
    public final long getItemId(int paramInt)
    {
      GMTrace.i(11006122131456L, 82002);
      long l = paramInt;
      GMTrace.o(11006122131456L, 82002);
      return l;
    }
    
    public final View getView(int paramInt, View paramView, ViewGroup paramViewGroup)
    {
      GMTrace.i(11006256349184L, 82003);
      ExdeviceBindDeviceUI.f localf = nb(paramInt);
      a locala;
      View localView;
      if (paramView == null)
      {
        locala = new a();
        localView = View.inflate(paramViewGroup.getContext(), R.i.cvB, null);
        locala.jUm = ((TextView)localView.findViewById(R.h.bPo));
        locala.iub = ((ImageView)localView.findViewById(R.h.bGn));
        localView.setTag(locala);
      }
      while ((localf == null) || (localf.kFX == null))
      {
        Assert.assertTrue(false);
        GMTrace.o(11006256349184L, 82003);
        return localView;
        locala = (a)paramView.getTag();
        localView = paramView;
      }
      Object localObject;
      if (localf.kFT == ExdeviceBindDeviceUI.b.kFL)
      {
        w.d("MicroMsg.ExdeviceBindDeviceUI", "position(%s), broadcastname(%s), mac(%s), deviceTitle(%s).", new Object[] { Integer.valueOf(paramInt), localf.kFU.kFN, localf.kFU.aKJ, localf.kFX.uwq });
        localObject = "";
        paramView = localf.kFX.fsN;
        if ((paramView != null) && (paramView.length() >= 4))
        {
          paramView = paramView.substring(paramView.length() - 4, paramView.length());
          paramView = localf.kFX.uwq + " " + paramView;
          localObject = new SpannableString(paramView);
          ((SpannableString)localObject).setSpan(new ForegroundColorSpan(paramViewGroup.getContext().getResources().getColor(R.e.aOa)), localf.kFX.uwq.length() + 1, paramView.length(), 17);
          locala.jUm.setText((CharSequence)localObject);
        }
      }
      for (;;)
      {
        paramView = localf.kFX.lRV;
        if (!xc(paramView)) {
          com.tencent.mm.ao.n.Jd().a(paramView, locala.iub, this.kEK);
        }
        GMTrace.o(11006256349184L, 82003);
        return localView;
        paramView = (View)localObject;
        if (localf.kFU.aKJ == null) {
          break;
        }
        paramView = (View)localObject;
        if (localf.kFU.aKJ.length() < 4) {
          break;
        }
        paramView = localf.kFU.aKJ;
        paramView = paramView.substring(paramView.length() - 4, paramView.length());
        break;
        if (localf.kFT == ExdeviceBindDeviceUI.b.kFK)
        {
          localObject = "";
          paramView = localf.kFX.fsN;
          if ((paramView != null) && (paramView.length() >= 4)) {
            paramView = paramView.substring(paramView.length() - 4, paramView.length());
          }
          for (;;)
          {
            paramView = localf.kFX.uwq + " " + paramView;
            localObject = new SpannableString(paramView);
            ((SpannableString)localObject).setSpan(new ForegroundColorSpan(paramViewGroup.getContext().getResources().getColor(R.e.aOa)), localf.kFX.uwq.length() + 1, paramView.length(), 17);
            locala.jUm.setText((CharSequence)localObject);
            break;
            paramView = (View)localObject;
            if (localf.kFX.tTU != null)
            {
              paramView = (View)localObject;
              if (localf.kFX.tTU.length() >= 4)
              {
                paramView = localf.kFX.tTU;
                paramView = paramView.substring(paramView.length() - 4, paramView.length());
              }
            }
          }
        }
        Assert.assertTrue(false);
      }
    }
    
    public final ExdeviceBindDeviceUI.f nb(int paramInt)
    {
      GMTrace.i(11005987913728L, 82001);
      int j = -1;
      int i = 0;
      while (i < this.kFG.size())
      {
        int k = j;
        if (((ExdeviceBindDeviceUI.f)this.kFG.get(i)).kFS) {
          k = j + 1;
        }
        if (k == paramInt)
        {
          ExdeviceBindDeviceUI.f localf = (ExdeviceBindDeviceUI.f)this.kFG.get(i);
          GMTrace.o(11005987913728L, 82001);
          return localf;
        }
        i += 1;
        j = k;
      }
      GMTrace.o(11005987913728L, 82001);
      return null;
    }
    
    public final boolean wZ(String paramString)
    {
      GMTrace.i(11005585260544L, 81998);
      if (xb(paramString) >= 0)
      {
        GMTrace.o(11005585260544L, 81998);
        return true;
      }
      GMTrace.o(11005585260544L, 81998);
      return false;
    }
    
    public final ExdeviceBindDeviceUI.f xa(String paramString)
    {
      GMTrace.i(11005719478272L, 81999);
      if ((paramString == null) || (paramString.length() == 0))
      {
        GMTrace.o(11005719478272L, 81999);
        return null;
      }
      int i = 0;
      while (i < this.kFG.size())
      {
        ExdeviceBindDeviceUI.f localf = (ExdeviceBindDeviceUI.f)this.kFG.get(i);
        if ((!xc(localf.auA())) && (paramString.equalsIgnoreCase(localf.auA())))
        {
          GMTrace.o(11005719478272L, 81999);
          return localf;
        }
        i += 1;
      }
      GMTrace.o(11005719478272L, 81999);
      return null;
    }
    
    private static final class a
    {
      ImageView iub;
      TextView jUm;
      
      public a()
      {
        GMTrace.i(11091618824192L, 82639);
        GMTrace.o(11091618824192L, 82639);
      }
    }
  }
  
  static enum b
  {
    static
    {
      GMTrace.i(11004779954176L, 81992);
      kFK = 1;
      kFL = 2;
      kFM = new int[] { kFK, kFL };
      GMTrace.o(11004779954176L, 81992);
    }
  }
  
  private final class c
  {
    public String aKJ;
    public String kFN;
    
    public c()
    {
      GMTrace.i(11063433101312L, 82429);
      GMTrace.o(11063433101312L, 82429);
    }
  }
  
  private final class d
  {
    public String kEa;
    public String kyL;
    
    public d()
    {
      GMTrace.i(11105174814720L, 82740);
      GMTrace.o(11105174814720L, 82740);
    }
  }
  
  private static enum e
  {
    static
    {
      GMTrace.i(11084236849152L, 82584);
      kFO = 1;
      kFP = 2;
      kFQ = 3;
      kFR = new int[] { kFO, kFP, kFQ };
      GMTrace.o(11084236849152L, 82584);
    }
  }
  
  private final class f
  {
    public boolean kFS;
    public int kFT;
    public ExdeviceBindDeviceUI.c kFU;
    public ExdeviceBindDeviceUI.d kFV;
    public agx kFW;
    public agy kFX;
    public int kFY;
    public aos kFZ;
    public String kFa;
    public String kGa;
    
    public f()
    {
      GMTrace.i(11087189639168L, 82606);
      this.kFS = false;
      this.kFT = ExdeviceBindDeviceUI.b.kFK;
      GMTrace.o(11087189639168L, 82606);
    }
    
    public final String auA()
    {
      GMTrace.i(11087458074624L, 82608);
      if (this.kFT == ExdeviceBindDeviceUI.b.kFK)
      {
        if (this.kFX == null)
        {
          GMTrace.o(11087458074624L, 82608);
          return null;
        }
        str = this.kFX.tTU;
        GMTrace.o(11087458074624L, 82608);
        return str;
      }
      String str = this.kFU.aKJ;
      GMTrace.o(11087458074624L, 82608);
      return str;
    }
    
    public final String getKey()
    {
      GMTrace.i(11087323856896L, 82607);
      if (this.kFT == ExdeviceBindDeviceUI.b.kFK)
      {
        str = this.kFV.kEa + this.kFV.kyL;
        GMTrace.o(11087323856896L, 82607);
        return str;
      }
      String str = this.kFU.aKJ;
      GMTrace.o(11087323856896L, 82607);
      return str;
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\plugin\exdevice\ui\ExdeviceBindDeviceUI.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */