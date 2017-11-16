package com.tencent.mm.plugin.facedetect.ui;

import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.os.Messenger;
import android.support.v4.view.ViewPager;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.Window;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.kernel.h;
import com.tencent.mm.plugin.facedetect.a.d;
import com.tencent.mm.plugin.facedetect.a.e;
import com.tencent.mm.plugin.facedetect.a.g;
import com.tencent.mm.plugin.facedetect.a.h;
import com.tencent.mm.plugin.facedetect.b.c;
import com.tencent.mm.plugin.facedetect.b.d;
import com.tencent.mm.plugin.facedetect.b.p;
import com.tencent.mm.plugin.facedetect.model.FaceContextData;
import com.tencent.mm.plugin.facedetect.model.FaceDetectReporter;
import com.tencent.mm.plugin.facedetect.model.n;
import com.tencent.mm.plugin.facedetect.service.FaceDetectProcessService;
import com.tencent.mm.sdk.platformtools.af;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.storage.t;
import com.tencent.mm.storage.w.a;
import com.tencent.mm.ui.MMFragmentActivity;
import java.lang.ref.WeakReference;
import java.security.InvalidParameterException;
import java.util.ArrayList;
import java.util.List;

@com.tencent.mm.ui.base.a(3)
public class FaceDetectPrepareUI
  extends MMFragmentActivity
  implements android.support.v4.app.a.a, com.tencent.mm.plugin.facedetect.c.e
{
  private String fKP;
  private boolean guN;
  private int kRs;
  private d kRt;
  private long kSI;
  private com.tencent.mm.plugin.facedetect.c.a kWc;
  private a kWd;
  private b kWe;
  private boolean kWf;
  private byte[] kWg;
  private boolean kWh;
  private boolean kWi;
  private b kWj;
  private boolean kWk;
  private boolean kWl;
  private long kWm;
  private Messenger kWn;
  private a kWo;
  private int kWp;
  
  public FaceDetectPrepareUI()
  {
    GMTrace.i(5905848467456L, 44002);
    this.kWc = null;
    this.kRt = null;
    this.kWd = null;
    this.kWe = null;
    this.kWh = false;
    this.kWi = false;
    this.guN = false;
    this.kWk = false;
    this.kWl = false;
    this.kWm = -1L;
    this.kWn = null;
    this.kWo = null;
    this.kWp = -1;
    GMTrace.o(5905848467456L, 44002);
  }
  
  private void Q(int paramInt, String paramString)
  {
    GMTrace.i(5907190644736L, 44012);
    if (this.kWc != null) {
      this.kWc.O(paramInt, paramString);
    }
    this.guN = true;
    finish();
    GMTrace.o(5907190644736L, 44012);
  }
  
  private void WG()
  {
    GMTrace.i(19906636546048L, 148316);
    b(4, 90013, "init lib failed", getString(a.h.kQG));
    GMTrace.o(19906636546048L, 148316);
  }
  
  private void a(final int paramInt1, final int paramInt2, final String paramString1, String paramString2, final boolean paramBoolean, final c paramc)
  {
    GMTrace.i(16691182436352L, 124359);
    w.i("MicroMsg.FaceDetectPrepareUI", "alvinluo showFailJumper showErrMsg: %s", new Object[] { paramString2 });
    String str1;
    if (paramBoolean)
    {
      str1 = getResources().getString(a.h.kQU);
      if (!paramBoolean) {
        break label129;
      }
    }
    label129:
    for (String str2 = getResources().getString(a.h.cSk);; str2 = null)
    {
      af.t(new Runnable()
      {
        public final void onClick(View paramAnonymousView)
        {
          GMTrace.i(14527324225536L, 108237);
          if (paramBoolean)
          {
            if (FaceDetectPrepareUI.c(FaceDetectPrepareUI.this) != null)
            {
              FaceDetectPrepareUI.c(FaceDetectPrepareUI.this).avU();
              GMTrace.o(14527324225536L, 108237);
            }
          }
          else
          {
            if (paramc != null) {
              paramc.k(paramInt1, paramInt2, paramString1);
            }
            FaceDetectPrepareUI.this.b(paramInt1, paramInt2, paramString1, null);
          }
          GMTrace.o(14527324225536L, 108237);
        }
      }
      {
        public final void onClick(View paramAnonymousView)
        {
          GMTrace.i(16690914000896L, 124357);
          FaceDetectPrepareUI.this.b(paramInt1, paramInt2, paramString1, null);
          GMTrace.o(16690914000896L, 124357);
        }
      }
      {
        public final void run()
        {
          GMTrace.i(14527861096448L, 108241);
          FaceDetectPrepareUI.this.a(true, this.kWr, this.kVF);
          GMTrace.o(14527861096448L, 108241);
        }
      });
      GMTrace.o(16691182436352L, 124359);
      return;
      str1 = getString(a.h.kQT);
      break;
    }
  }
  
  private void awQ()
  {
    GMTrace.i(14532156063744L, 108273);
    this.kWp = 1;
    this.kWd = new a(this);
    a locala = this.kWd;
    for (;;)
    {
      synchronized ((FaceDetectPrepareUI)locala.kVB.get())
      {
        if (locala.kVB.get() != null)
        {
          locala.kVs = ((RelativeLayout)((FaceDetectPrepareUI)locala.kVB.get()).findViewById(a.e.kQf));
          locala.kVt = ((Button)((FaceDetectPrepareUI)locala.kVB.get()).findViewById(a.e.bQR));
          locala.kVu = ((ImageView)((FaceDetectPrepareUI)locala.kVB.get()).findViewById(a.e.kQi));
          locala.kVv = ((TextView)((FaceDetectPrepareUI)locala.kVB.get()).findViewById(a.e.chF));
          locala.kVz = AnimationUtils.loadAnimation((Context)locala.kVB.get(), com.tencent.mm.plugin.facedetect.a.a.aLh);
          locala.kVA = AnimationUtils.loadAnimation((Context)locala.kVB.get(), com.tencent.mm.plugin.facedetect.a.a.aLi);
          locala.kVx = ((Button)((FaceDetectPrepareUI)locala.kVB.get()).findViewById(a.e.kQe));
          locala.kVy = ((Button)((FaceDetectPrepareUI)locala.kVB.get()).findViewById(a.e.kQh));
          locala.kVw = ((TextView)((FaceDetectPrepareUI)locala.kVB.get()).findViewById(a.e.kQj));
          locala.kVz.setDuration(500L);
          locala.kVA.setDuration(500L);
        }
        if (n.n(this))
        {
          w.i("MicroMsg.FaceDetectPrepareUI", "alvinluo checkFacePermissionAnd Request true and do init ");
          awT();
          if (this.kWk)
          {
            ??? = new Bundle();
            ((Bundle)???).putBoolean("key_is_need_video", this.kWk);
            i(4, (Bundle)???);
          }
          awS();
          GMTrace.o(14532156063744L, 108273);
          return;
        }
      }
      w.i("MicroMsg.FaceDetectPrepareUI", "hy: no camera permission. request permission");
    }
  }
  
  private void awR()
  {
    GMTrace.i(5906787991552L, 44009);
    b(4, 90011, "get image failed", getString(a.h.kQB));
    GMTrace.o(5906787991552L, 44009);
  }
  
  private void awS()
  {
    GMTrace.i(5907459080192L, 44014);
    w.i("MicroMsg.FaceDetectPrepareUI", "hy: start show jumper: %b", new Object[] { Boolean.valueOf(true) });
    this.kWm = bg.Pw();
    com.tencent.mm.sdk.f.e.post(new Runnable()
    {
      public final void run()
      {
        GMTrace.i(14534035111936L, 108287);
        final Bitmap localBitmap = n.xy(FaceDetectPrepareUI.d(FaceDetectPrepareUI.this));
        af.t(new Runnable()
        {
          public final void onClick(View paramAnonymous2View)
          {
            GMTrace.i(14526921572352L, 108234);
            FaceDetectPrepareUI.a(FaceDetectPrepareUI.this, 90003, "user cancel in init");
            GMTrace.o(14526921572352L, 108234);
          }
        }
        {
          public final void run()
          {
            GMTrace.i(14531484975104L, 108268);
            a.b localb = a.a(FaceDetectPrepareUI.this, this.kWx);
            localb.kVN = localBitmap;
            FaceDetectPrepareUI.this.a(false, false, localb);
            GMTrace.o(14531484975104L, 108268);
          }
        });
        GMTrace.o(14534035111936L, 108287);
      }
    }, "face_prepareInit");
    GMTrace.o(5907459080192L, 44014);
  }
  
  private void awT()
  {
    GMTrace.i(5907861733376L, 44017);
    if (this.kWc != null) {
      this.kWc.avU();
    }
    GMTrace.o(5907861733376L, 44017);
  }
  
  private void b(int paramInt1, int paramInt2, String paramString1, String paramString2)
  {
    GMTrace.i(5906922209280L, 44010);
    w.i("MicroMsg.FaceDetectPrepareUI", "onProcessingError errType: %d, errCode: %d, errMsg: %s", new Object[] { Integer.valueOf(paramInt1), Integer.valueOf(paramInt2), paramString1 });
    j(paramInt1, paramInt2, paramString1);
    this.kWi = true;
    a(paramInt1, paramInt2, paramString1, paramString2, false, new c()
    {
      public final void k(int paramAnonymousInt1, int paramAnonymousInt2, String paramAnonymousString)
      {
        GMTrace.i(14529203273728L, 108251);
        if (FaceDetectPrepareUI.c(FaceDetectPrepareUI.this) != null) {
          FaceDetectPrepareUI.c(FaceDetectPrepareUI.this).i(paramAnonymousInt1, paramAnonymousInt2, paramAnonymousString);
        }
        GMTrace.o(14529203273728L, 108251);
      }
    });
    GMTrace.o(5906922209280L, 44010);
  }
  
  private void i(int paramInt, Bundle paramBundle)
  {
    GMTrace.i(5906116902912L, 44004);
    if (paramBundle != null) {}
    for (Object localObject = paramBundle.toString();; localObject = "null")
    {
      w.i("MicroMsg.FaceDetectPrepareUI", "hy: sending msg: cmd: %d, data: %s", new Object[] { Integer.valueOf(paramInt), localObject });
      localObject = paramBundle;
      if (paramBundle == null) {
        localObject = new Bundle();
      }
      ((Bundle)localObject).putInt("k_cmd", paramInt);
      paramBundle = new Intent(this, FaceDetectProcessService.class);
      paramBundle.putExtras((Bundle)localObject);
      startService(paramBundle);
      GMTrace.o(5906116902912L, 44004);
      return;
    }
  }
  
  private void j(int paramInt1, int paramInt2, String paramString)
  {
    GMTrace.i(5907324862464L, 44013);
    if (this.kWj == null) {
      this.kWj = new b();
    }
    this.kWh = true;
    b localb = this.kWj;
    localb.errType = paramInt1;
    localb.errCode = paramInt2;
    localb.eAR = paramString;
    GMTrace.o(5907324862464L, 44013);
  }
  
  public final void a(boolean paramBoolean1, boolean paramBoolean2, a.b paramb)
  {
    GMTrace.i(5908264386560L, 44020);
    if (paramBoolean2)
    {
      w.i("MicroMsg.FaceDetectPrepareUI", "hy: need blur");
      com.tencent.mm.sdk.f.e.post(new Runnable()
      {
        public final void run()
        {
          GMTrace.i(16691048218624L, 124358);
          af.t(new Runnable()
          {
            public final void run()
            {
              GMTrace.i(16691450871808L, 124361);
              FaceDetectPrepareUI.e(FaceDetectPrepareUI.this).w(this.kWs);
              GMTrace.o(16691450871808L, 124361);
            }
          });
          GMTrace.o(16691048218624L, 124358);
        }
      }, "face_refresh_background");
    }
    this.kWd.a(paramb);
    GMTrace.o(5908264386560L, 44020);
  }
  
  public final void avU()
  {
    GMTrace.i(5907995951104L, 44018);
    w.i("MicroMsg.FaceDetectPrepareUI", "alvinluo startFaceDetect");
    w.i("MicroMsg.FaceDetectPrepareUI", "alvinluo preparing");
    Object localObject;
    if (this.kWc != null)
    {
      localObject = getIntent().getExtras().getString("k_ticket");
      if (!bg.nm((String)localObject))
      {
        w.i("MicroMsg.FaceDetectBaseController", "hy: has prepared ticket. force set");
        p.xw((String)localObject);
      }
    }
    if (this.kWj != null)
    {
      localObject = this.kWj;
      ((b)localObject).errType = -1;
      ((b)localObject).errCode = -1;
      ((b)localObject).eAR = "";
    }
    this.kWh = false;
    awS();
    if (this.kWc != null) {
      this.kWc.avT();
    }
    GMTrace.o(5907995951104L, 44018);
  }
  
  public final void avW()
  {
    GMTrace.i(5908130168832L, 44019);
    GMTrace.o(5908130168832L, 44019);
  }
  
  public final void b(int paramInt1, int paramInt2, String paramString, Bundle paramBundle)
  {
    GMTrace.i(5908398604288L, 44021);
    w.i("MicroMsg.FaceDetectPrepareUI", "finishWithResult errType: %d, errCode: %d, errMsg: %s", new Object[] { Integer.valueOf(paramInt1), Integer.valueOf(paramInt2), paramString });
    Bundle localBundle = new Bundle();
    localBundle.putInt("err_code", com.tencent.mm.plugin.facedetect.model.k.nr(paramInt2));
    localBundle.putString("err_msg", paramString);
    if (paramBundle != null) {
      localBundle.putAll(paramBundle);
    }
    paramString = new Intent();
    paramString.putExtras(localBundle);
    setResult(-1, paramString);
    if (this.kWk)
    {
      this.kWl = true;
      i(5, this.kWc.avY());
    }
    finish();
    GMTrace.o(5908398604288L, 44021);
  }
  
  public void finish()
  {
    GMTrace.i(5906653773824L, 44008);
    if ((this.kWd != null) && (this.kWd.awP())) {
      this.kWd.dismiss();
    }
    if (this.kWe != null) {
      this.kWe.dismiss();
    }
    w.v("MicroMsg.FaceDetectPrepareUI", "alvinluo: releaseFaceDetect");
    if (this.kWc != null) {
      this.kWc.avW();
    }
    super.finish();
    GMTrace.o(5906653773824L, 44008);
  }
  
  protected void onActivityResult(int paramInt1, int paramInt2, Intent paramIntent)
  {
    GMTrace.i(5908667039744L, 44023);
    w.i("MicroMsg.FaceDetectPrepareUI", "alvinluo onActivityResult requestCode: %d, resultCode: %d", new Object[] { Integer.valueOf(paramInt1), Integer.valueOf(paramInt2) });
    this.kWp = 1;
    if (paramIntent == null)
    {
      w.e("MicroMsg.FaceDetectPrepareUI", "alvinluo onActivityResult data is null");
      a(4, 90018, "system error", getString(a.h.kQJ), false, new c()
      {
        public final void k(int paramAnonymousInt1, int paramAnonymousInt2, String paramAnonymousString)
        {
          GMTrace.i(14532021846016L, 108272);
          if (FaceDetectPrepareUI.c(FaceDetectPrepareUI.this) != null) {
            FaceDetectPrepareUI.c(FaceDetectPrepareUI.this).i(paramAnonymousInt1, paramAnonymousInt2, paramAnonymousString);
          }
          GMTrace.o(14532021846016L, 108272);
        }
      });
      GMTrace.o(5908667039744L, 44023);
      return;
    }
    Object localObject = (FaceDetectReporter)paramIntent.getParcelableExtra("key_parcelable_reporter");
    if (localObject != null) {
      FaceDetectReporter.aws().a((FaceDetectReporter)localObject);
    }
    paramInt1 = paramIntent.getIntExtra("err_type", -1);
    paramInt2 = paramIntent.getIntExtra("err_code", -1);
    String str = paramIntent.getStringExtra("err_msg");
    if (this.kWc != null)
    {
      localObject = this.kWc;
      paramIntent.getExtras();
      ((com.tencent.mm.plugin.facedetect.c.a)localObject).h(paramInt1, paramInt2, str);
    }
    w.i("MicroMsg.FaceDetectPrepareUI", "alvinluo onActivityResult errType: %d, errCode: %d, errMsg: %s", new Object[] { Integer.valueOf(paramInt1), Integer.valueOf(paramInt2), str });
    if ((paramInt1 == 0) && (paramInt2 == 0))
    {
      paramIntent = getString(a.h.kQI);
      localObject = a.a(a.d.kPm, paramIntent, null, null, getString(a.h.cSk), null, new View.OnClickListener()
      {
        public final void onClick(View paramAnonymousView)
        {
          GMTrace.i(5902224588800L, 43975);
          FaceDetectPrepareUI.a(FaceDetectPrepareUI.this, 90005, "user cancel in uploading");
          GMTrace.o(5902224588800L, 43975);
        }
      });
      ((a.b)localObject).kVL = true;
      ((a.b)localObject).kVM = (paramIntent.length() - 3);
      a(false, true, (a.b)localObject);
      i(1, null);
      GMTrace.o(5908667039744L, 44023);
      return;
    }
    if (paramInt1 == 1)
    {
      if ((paramInt2 == 90004) || (paramInt2 == 90025))
      {
        Q(paramInt2, str);
        GMTrace.o(5908667039744L, 44023);
      }
    }
    else
    {
      localObject = paramIntent.getStringExtra("show_err_msg");
      if (paramInt2 != 90013) {
        break label389;
      }
      paramIntent = getString(a.h.kQG);
      j(paramInt1, paramInt2, str);
      if (paramInt2 != 90023) {
        break label454;
      }
    }
    label389:
    label454:
    for (boolean bool = true;; bool = false)
    {
      a(paramInt1, paramInt2, str, paramIntent, bool, new c()
      {
        public final void k(int paramAnonymousInt1, int paramAnonymousInt2, String paramAnonymousString)
        {
          GMTrace.i(16690645565440L, 124355);
          if (FaceDetectPrepareUI.c(FaceDetectPrepareUI.this) != null) {
            FaceDetectPrepareUI.c(FaceDetectPrepareUI.this).i(paramAnonymousInt1, paramAnonymousInt2, paramAnonymousString);
          }
          GMTrace.o(16690645565440L, 124355);
        }
      });
      GMTrace.o(5908667039744L, 44023);
      return;
      if ((paramInt2 == 90008) || (paramInt2 == 90010))
      {
        paramIntent = getString(a.h.dNn);
        break;
      }
      if (paramInt2 == 90009)
      {
        paramIntent = getString(a.h.dNr);
        break;
      }
      paramIntent = (Intent)localObject;
      if (!bg.nm((String)localObject)) {
        break;
      }
      paramIntent = getString(a.h.kRi);
      break;
    }
  }
  
  public void onBackPressed()
  {
    GMTrace.i(5907056427008L, 44011);
    if (this.kWh)
    {
      if (this.kWc != null)
      {
        this.kWc.i(this.kWj.errType, this.kWj.errCode, this.kWj.eAR);
        GMTrace.o(5907056427008L, 44011);
      }
    }
    else
    {
      if (this.kWp == 1)
      {
        Q(90003, "user cancel in init");
        GMTrace.o(5907056427008L, 44011);
        return;
      }
      if (this.kWp == 3)
      {
        Q(90005, "user cancel in uploading");
        GMTrace.o(5907056427008L, 44011);
        return;
      }
      if (this.kWp == 0)
      {
        Q(90002, "user cancel in tutorial");
        GMTrace.o(5907056427008L, 44011);
        return;
      }
      Q(90050, "user cancel unknown");
    }
    GMTrace.o(5907056427008L, 44011);
  }
  
  public void onCreate(Bundle paramBundle)
  {
    GMTrace.i(5905982685184L, 44003);
    super.onCreate(paramBundle);
    setContentView(a.g.kQr);
    getWindow().addFlags(2097280);
    this.fKP = getIntent().getStringExtra("k_user_name");
    this.kRs = getIntent().getIntExtra("k_server_scene", -1);
    this.kWf = getIntent().getBooleanExtra("k_need_signature", false);
    boolean bool;
    int i;
    if ((com.tencent.mm.plugin.facedetect.model.e.awd()) || (getIntent().getBooleanExtra("key_is_need_video", false)))
    {
      bool = true;
      this.kWk = bool;
      this.kWo = new a(this, (byte)0);
      this.kWn = new Messenger(this.kWo);
      paramBundle = new Intent(this, FaceDetectProcessService.class);
      paramBundle.putExtra("k_messenger", this.kWn);
      startService(paramBundle);
      FaceContextData.a(new FaceContextData());
      n.o(this);
      i = com.tencent.mm.plugin.facedetect.c.b.kSm;
      this.kWc = com.tencent.mm.plugin.facedetect.c.b.a(this, this, this.kRs, getIntent().getExtras());
      if (this.kWc != null) {
        break label297;
      }
      WG();
      label209:
      if ((this.kRs != 2) && (this.kRs != 5)) {
        break label338;
      }
      if (!h.xy().xh().getBoolean(w.a.vwB, false)) {
        break label359;
      }
      i = 0;
    }
    for (;;)
    {
      if (i != 0)
      {
        w.i("MicroMsg.FaceDetectPrepareUI", "hy: need tutorial. show tutorial first");
        this.kWe = new b();
        this.kWp = 0;
        Object localObject = this.kWe;
        if (this == null)
        {
          throw new InvalidParameterException("hy: tutorial context is null");
          bool = false;
          break;
          label297:
          this.kWc.a(new c()
          {
            public final void N(int paramAnonymousInt, String paramAnonymousString)
            {
              GMTrace.i(14531216539648L, 108266);
              w.i("MicroMsg.FaceDetectPrepareUI", "alvinluo onGetConfigFailed, errType: %d, errCode: %d, errMsg: %s", new Object[] { Integer.valueOf(paramAnonymousInt), Integer.valueOf(90015), paramAnonymousString });
              paramAnonymousInt = FaceDetectPrepareUI.nw(paramAnonymousInt);
              FaceDetectPrepareUI.a(FaceDetectPrepareUI.this, paramAnonymousInt, 90015, paramAnonymousString, FaceDetectPrepareUI.this.getString(a.h.kQG));
              GMTrace.o(14531216539648L, 108266);
            }
            
            public final void e(long paramAnonymousLong, byte[] paramAnonymousArrayOfByte)
            {
              GMTrace.i(14531082321920L, 108265);
              w.i("MicroMsg.FaceDetectPrepareUI", "alvinluo onGetConfigSuccess, bioId: %d, isCancel: %b", new Object[] { Long.valueOf(paramAnonymousLong), Boolean.valueOf(FaceDetectPrepareUI.b(FaceDetectPrepareUI.this)) });
              if (FaceDetectPrepareUI.b(FaceDetectPrepareUI.this))
              {
                GMTrace.o(14531082321920L, 108265);
                return;
              }
              FaceDetectPrepareUI.a(FaceDetectPrepareUI.this, paramAnonymousLong);
              FaceDetectPrepareUI.a(FaceDetectPrepareUI.this, paramAnonymousArrayOfByte);
              FaceDetectPrepareUI.a(FaceDetectPrepareUI.this, paramAnonymousLong, paramAnonymousArrayOfByte);
              GMTrace.o(14531082321920L, 108265);
            }
          });
          this.kRt = new d()
          {
            private double kWu;
            
            public final void a(int paramAnonymousInt1, int paramAnonymousInt2, int paramAnonymousInt3, String paramAnonymousString)
            {
              GMTrace.i(14526250483712L, 108229);
              w.i("MicroMsg.FaceDetectPrepareUI", "onError scene: %d, errType: %d, errCode: %d, errMsg: %s", new Object[] { Integer.valueOf(paramAnonymousInt1), Integer.valueOf(paramAnonymousInt2), Integer.valueOf(paramAnonymousInt3), paramAnonymousString });
              FaceDetectPrepareUI.a(FaceDetectPrepareUI.this, paramAnonymousInt2, paramAnonymousInt3, paramAnonymousString, FaceDetectPrepareUI.this.getString(a.h.kRi));
              GMTrace.o(14526250483712L, 108229);
            }
            
            public final void a(int paramAnonymousInt1, int paramAnonymousInt2, String paramAnonymousString, Bundle paramAnonymousBundle)
            {
              GMTrace.i(14526384701440L, 108230);
              w.i("MicroMsg.FaceDetectPrepareUI", "alvinluo onUploadEnd");
              paramAnonymousInt1 = FaceDetectPrepareUI.nw(0);
              if (paramAnonymousInt1 != 0) {
                FaceDetectPrepareUI.a(FaceDetectPrepareUI.this, paramAnonymousInt1, 0, paramAnonymousString);
              }
              if (FaceDetectPrepareUI.c(FaceDetectPrepareUI.this) != null) {
                FaceDetectPrepareUI.c(FaceDetectPrepareUI.this).c(paramAnonymousInt1, 0, paramAnonymousString, paramAnonymousBundle);
              }
              GMTrace.o(14526384701440L, 108230);
            }
            
            public final void g(int paramAnonymousInt1, int paramAnonymousInt2, String paramAnonymousString, com.tencent.mm.ad.k paramAnonymousk)
            {
              GMTrace.i(14526518919168L, 108231);
              w.i("MicroMsg.FaceDetectPrepareUI", "alvinluo onVerifyEnd sceneType: %d, errType: %d, errCode: %d, errMsg: %s", new Object[] { Integer.valueOf(paramAnonymousk.getType()), Integer.valueOf(paramAnonymousInt1), Integer.valueOf(paramAnonymousInt2), paramAnonymousString });
              paramAnonymousInt1 = FaceDetectPrepareUI.nw(paramAnonymousInt1);
              if ((paramAnonymousInt1 != 0) || (paramAnonymousInt2 != 0)) {
                FaceDetectPrepareUI.a(FaceDetectPrepareUI.this, paramAnonymousInt1, paramAnonymousInt2, paramAnonymousString);
              }
              if (FaceDetectPrepareUI.c(FaceDetectPrepareUI.this) != null) {
                FaceDetectPrepareUI.c(FaceDetectPrepareUI.this).g(paramAnonymousInt1, paramAnonymousInt2, paramAnonymousString, paramAnonymousk);
              }
              GMTrace.o(14526518919168L, 108231);
            }
            
            public final void j(double paramAnonymousDouble)
            {
              GMTrace.i(14526116265984L, 108228);
              w.i("MicroMsg.FaceDetectPrepareUI", "hy: reg on process : %f", new Object[] { Double.valueOf(paramAnonymousDouble) });
              this.kWu = (100.0D * paramAnonymousDouble);
              GMTrace.o(14526116265984L, 108228);
            }
          };
          this.kWc.a(this.kRt);
          break label209;
          label338:
          if ((this.kRs != 3) && (this.kRs == 4))
          {
            i = 0;
            continue;
          }
          label359:
          i = 1;
          continue;
        }
        ((b)localObject).kgo = findViewById(a.e.kQa);
        ((b)localObject).kVx = ((Button)((b)localObject).kgo.findViewById(a.e.bJU));
        ((b)localObject).wV = ((ViewPager)((b)localObject).kgo.findViewById(a.e.bSU));
        ((b)localObject).kXg = new b.b((b)localObject, aR());
        ((b)localObject).wV.a(((b)localObject).kXg);
        ((b)localObject).kVx.setOnClickListener(new b.1((b)localObject));
        paramBundle = ((b)localObject).wV;
        localObject = new b.2((b)localObject);
        if (paramBundle.yq == null) {
          paramBundle.yq = new ArrayList();
        }
        paramBundle.yq.add(localObject);
        this.kWe.kXh = new b.a()
        {
          public final void awU()
          {
            GMTrace.i(14525982048256L, 108227);
            w.i("MicroMsg.FaceDetectPrepareUI", "hy: tutorial confirmed. start");
            FaceDetectPrepareUI.a(FaceDetectPrepareUI.this);
            GMTrace.o(14525982048256L, 108227);
          }
          
          public final void onCancel()
          {
            GMTrace.i(14525847830528L, 108226);
            w.i("MicroMsg.FaceDetectPrepareUI", "hy: user cancel in tutorial");
            FaceDetectPrepareUI.a(FaceDetectPrepareUI.this, 90002, "user cancel in tutorial");
            GMTrace.o(14525847830528L, 108226);
          }
        };
        h.xw();
        if (com.tencent.mm.kernel.a.wK()) {
          h.xy().xh().a(w.a.vwB, Boolean.valueOf(true));
        }
        this.kWe.kgo.setVisibility(0);
        GMTrace.o(5905982685184L, 44003);
        return;
      }
    }
    paramBundle = findViewById(a.e.kQa);
    if (paramBundle != null) {
      paramBundle.setVisibility(8);
    }
    awQ();
    GMTrace.o(5905982685184L, 44003);
  }
  
  protected void onDestroy()
  {
    GMTrace.i(5906251120640L, 44005);
    super.onDestroy();
    if (!this.kWl) {
      stopService(new Intent(this, FaceDetectProcessService.class));
    }
    GMTrace.o(5906251120640L, 44005);
  }
  
  public void onRequestPermissionsResult(int paramInt, String[] paramArrayOfString, int[] paramArrayOfInt)
  {
    int i = 90008;
    GMTrace.i(5908532822016L, 44022);
    w.i("MicroMsg.FaceDetectPrepareUI", "alvinluo onRequestPermissionsResult");
    if ((paramArrayOfInt == null) || (paramArrayOfInt.length <= 0))
    {
      GMTrace.o(5908532822016L, 44022);
      return;
    }
    switch (paramInt)
    {
    }
    Object localObject1;
    String str;
    for (;;)
    {
      GMTrace.o(5908532822016L, 44022);
      return;
      localObject1 = "";
      str = "";
      if (paramArrayOfInt.length != 1) {
        break label179;
      }
      if (paramArrayOfInt[0] != 0) {
        break;
      }
      paramInt = 1;
      label94:
      if (paramInt == 0) {
        break label200;
      }
      awT();
    }
    if (paramArrayOfString[0].equals("android.permission.CAMERA"))
    {
      localObject1 = "camera permission not granted";
      paramArrayOfString = getString(a.h.dNn);
      paramInt = i;
    }
    for (;;)
    {
      b(1, paramInt, (String)localObject1, paramArrayOfString);
      paramInt = 0;
      break label94;
      if (paramArrayOfString[0].equals("android.permission.RECORD_AUDIO"))
      {
        paramInt = 90009;
        localObject1 = "audio permission not granted";
        paramArrayOfString = getString(a.h.dNr);
        continue;
        label179:
        if (paramArrayOfInt.length == 2)
        {
          if ((paramArrayOfInt[0] == 0) && (paramArrayOfInt[1] == 0))
          {
            paramInt = 1;
            break label94;
            label200:
            break;
          }
          Object localObject2;
          if (paramArrayOfInt[0] != 0)
          {
            localObject2 = "camera permission not granted";
            str = getString(a.h.dNn);
          }
          for (;;)
          {
            if (paramArrayOfInt[1] != 0)
            {
              i = 90009;
              localObject2 = "audio permission not granted";
              str = getString(a.h.dNr);
            }
            paramArrayOfString = str;
            localObject1 = localObject2;
            paramInt = i;
            if (paramArrayOfInt[0] == 0) {
              break;
            }
            paramArrayOfString = str;
            localObject1 = localObject2;
            paramInt = i;
            if (paramArrayOfInt[1] == 0) {
              break;
            }
            paramInt = 90010;
            localObject1 = "both camera and audio permission not granted";
            paramArrayOfString = getString(a.h.dNn);
            break;
            i = -1;
            localObject2 = localObject1;
          }
        }
      }
      paramInt = -1;
      paramArrayOfString = str;
    }
  }
  
  public void onStart()
  {
    GMTrace.i(5906385338368L, 44006);
    super.onStart();
    GMTrace.o(5906385338368L, 44006);
  }
  
  public void onStop()
  {
    GMTrace.i(5906519556096L, 44007);
    super.onStop();
    finish();
    GMTrace.o(5906519556096L, 44007);
  }
  
  private static final class a
    extends Handler
  {
    private WeakReference<FaceDetectPrepareUI> kVB;
    
    private a(FaceDetectPrepareUI paramFaceDetectPrepareUI)
    {
      GMTrace.i(5894976831488L, 43921);
      this.kVB = null;
      this.kVB = new WeakReference(paramFaceDetectPrepareUI);
      GMTrace.o(5894976831488L, 43921);
    }
    
    public final void handleMessage(Message paramMessage)
    {
      GMTrace.i(5895111049216L, 43922);
      w.i("MicroMsg.FaceDetectPrepareUI", "alvinluo client msg.what: %d", new Object[] { Integer.valueOf(paramMessage.what) });
      if ((this.kVB != null) && (this.kVB.get() != null)) {
        switch (paramMessage.what)
        {
        }
      }
      for (;;)
      {
        GMTrace.o(5895111049216L, 43922);
        return;
        FaceDetectPrepareUI.a((FaceDetectPrepareUI)this.kVB.get(), paramMessage);
        GMTrace.o(5895111049216L, 43922);
        return;
        FaceDetectPrepareUI.b((FaceDetectPrepareUI)this.kVB.get(), paramMessage);
      }
    }
  }
  
  private final class b
  {
    String eAR;
    int errCode;
    int errType;
    
    public b()
    {
      GMTrace.i(5884105195520L, 43840);
      GMTrace.o(5884105195520L, 43840);
    }
  }
  
  private static abstract interface c
  {
    public abstract void k(int paramInt1, int paramInt2, String paramString);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\plugin\facedetect\ui\FaceDetectPrepareUI.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */