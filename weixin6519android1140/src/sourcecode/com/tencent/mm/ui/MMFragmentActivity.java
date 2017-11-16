package com.tencent.mm.ui;

import android.annotation.TargetApi;
import android.app.PendingIntent;
import android.content.ComponentName;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.IntentFilter.MalformedMimeTypeException;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.graphics.drawable.ColorDrawable;
import android.nfc.NfcAdapter;
import android.nfc.tech.IsoDep;
import android.nfc.tech.NfcA;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.app.ActionBar;
import android.support.v7.app.ActionBarActivity;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewGroup.LayoutParams;
import android.view.Window;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.compatible.d.t;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.af;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.ui.tools.j;
import com.tencent.mm.ui.widget.SwipeBackLayout;
import com.tencent.mm.ui.widget.SwipeBackLayout.a;
import com.tencent.mm.ui.widget.k;
import com.tencent.mm.ui.widget.k.a;
import com.tencent.mm.v.a.a;
import com.tencent.mm.v.a.d;
import com.tencent.mm.v.a.g;
import com.tencent.mm.v.a.h;
import com.tencent.mm.vending.e.c;
import java.lang.ref.WeakReference;
import java.util.ArrayList;

public class MMFragmentActivity
  extends ActionBarActivity
  implements SwipeBackLayout.a, k.a, com.tencent.mm.vending.e.b
{
  String className;
  public boolean iur;
  public SwipeBackLayout vMl;
  ArrayList<WeakReference<u>> vMr;
  private b vMs;
  private com.tencent.mm.vending.a.a vMt;
  private a vMu;
  private View vMv;
  
  public MMFragmentActivity()
  {
    GMTrace.i(1657320505344L, 12348);
    this.vMr = new ArrayList();
    this.vMt = new com.tencent.mm.vending.a.a();
    this.vMu = new a();
    this.vMv = null;
    GMTrace.o(1657320505344L, 12348);
  }
  
  private void am(Intent paramIntent)
  {
    GMTrace.i(1658662682624L, 12358);
    if (paramIntent == null)
    {
      paramIntent = null;
      if (paramIntent == null) {
        break label152;
      }
      if (!paramIntent.getClassName().startsWith(paramIntent.getPackageName())) {
        break label81;
      }
      paramIntent = paramIntent.getClassName();
      label38:
      if ((com.tencent.mm.ui.base.b.Vx(paramIntent) & 0x2) != 0) {
        break label109;
      }
    }
    label81:
    label109:
    for (int i = 1;; i = 0)
    {
      if (i == 0) {
        break label114;
      }
      super.overridePendingTransition(a.vMB, a.vMC);
      GMTrace.o(1658662682624L, 12358);
      return;
      paramIntent = paramIntent.getComponent();
      break;
      paramIntent = paramIntent.getPackageName() + paramIntent.getClassName();
      break label38;
    }
    label114:
    if ((com.tencent.mm.ui.base.b.Vx(paramIntent) & 0x4) != 0) {}
    for (i = 1; i == 0; i = 0)
    {
      com.tencent.mm.ui.base.b.fk(this);
      GMTrace.o(1658662682624L, 12358);
      return;
    }
    com.tencent.mm.ui.base.b.fn(this);
    label152:
    GMTrace.o(1658662682624L, 12358);
  }
  
  private boolean bXH()
  {
    GMTrace.i(1659870642176L, 12367);
    if ((com.tencent.mm.compatible.util.d.et(19)) && (com.tencent.mm.compatible.h.a.tw()))
    {
      if ((bmX()) && (com.tencent.mm.ui.base.b.B(getClass())))
      {
        GMTrace.o(1659870642176L, 12367);
        return true;
      }
      GMTrace.o(1659870642176L, 12367);
      return false;
    }
    GMTrace.o(1659870642176L, 12367);
    return false;
  }
  
  public void U(float paramFloat)
  {
    GMTrace.i(1660810166272L, 12374);
    w.v("ashutest", "ashutest::on swipe %f, duration %d", new Object[] { Float.valueOf(paramFloat), Long.valueOf(240L) });
    Window localWindow;
    if (this.vMv == null)
    {
      localWindow = getWindow();
      if (cN().cO() == null) {
        break label106;
      }
    }
    label106:
    for (View localView = cN().cO().getCustomView();; localView = null)
    {
      this.vMv = ad.a(localWindow, localView);
      localView = this.vMv;
      if (Float.compare(1.0F, paramFloat) > 0) {
        break;
      }
      j.n(localView, 0.0F);
      GMTrace.o(1660810166272L, 12374);
      return;
    }
    j.n(localView, localView.getWidth() / 4 * (1.0F - paramFloat) * -1.0F);
    GMTrace.o(1660810166272L, 12374);
  }
  
  public boolean Zo()
  {
    GMTrace.i(1661615472640L, 12380);
    GMTrace.o(1661615472640L, 12380);
    return false;
  }
  
  public void Zp()
  {
    GMTrace.i(1661078601728L, 12376);
    if (!isFinishing()) {
      finish();
    }
    overridePendingTransition(0, 0);
    this.iur = false;
    GMTrace.o(1661078601728L, 12376);
  }
  
  public void Zq()
  {
    GMTrace.i(1661347037184L, 12378);
    this.iur = true;
    GMTrace.o(1661347037184L, 12378);
  }
  
  public final void a(Fragment paramFragment, Intent paramIntent, int paramInt)
  {
    GMTrace.i(1659736424448L, 12366);
    super.a(paramFragment, paramIntent, paramInt);
    am(paramIntent);
    GMTrace.o(1659736424448L, 12366);
  }
  
  public void a(com.tencent.mm.vending.e.a parama)
  {
    GMTrace.i(1657454723072L, 12349);
    this.vMt.xwC.a(parama);
    GMTrace.o(1657454723072L, 12349);
  }
  
  public final void aQ()
  {
    GMTrace.i(1661883908096L, 12382);
    if (bXi() != null)
    {
      u localu = bXi();
      if (localu.vKB.bXD()) {
        localu.vKB.aQ();
      }
      for (int i = 1; i != 0; i = 0)
      {
        GMTrace.o(1661883908096L, 12382);
        return;
      }
    }
    super.aQ();
    GMTrace.o(1661883908096L, 12382);
  }
  
  public void aay()
  {
    GMTrace.i(1660407513088L, 12371);
    ViewGroup localViewGroup1 = (ViewGroup)getWindow().getDecorView();
    this.vMl = ((SwipeBackLayout)LayoutInflater.from(this).inflate(a.h.gfR, localViewGroup1, false));
    this.vMl.init();
    getWindow().setBackgroundDrawable(new ColorDrawable(0));
    getWindow().getDecorView().setBackgroundDrawable(null);
    ViewGroup localViewGroup2 = (ViewGroup)localViewGroup1.getChildAt(0);
    localViewGroup2.setBackgroundResource(a.d.transparent);
    localViewGroup1.removeView(localViewGroup2);
    this.vMl.addView(localViewGroup2);
    this.vMl.Hw = localViewGroup2;
    localViewGroup1.addView(this.vMl);
    this.vMl.xsO = this;
    GMTrace.o(1660407513088L, 12371);
  }
  
  public boolean bDR()
  {
    GMTrace.i(1660139077632L, 12369);
    GMTrace.o(1660139077632L, 12369);
    return true;
  }
  
  public final boolean bXM()
  {
    GMTrace.i(1660273295360L, 12370);
    if (com.tencent.mm.compatible.util.d.et(19))
    {
      if ((!com.tencent.mm.ui.base.b.B(getClass())) || (!bDR())) {
        break label67;
      }
      af.t(new Runnable()
      {
        public final void run()
        {
          GMTrace.i(1604572938240L, 11955);
          com.tencent.mm.ui.base.b.Y(MMFragmentActivity.this);
          GMTrace.o(1604572938240L, 11955);
        }
      });
    }
    label67:
    label103:
    while (bXH())
    {
      aay();
      GMTrace.o(1660273295360L, 12370);
      return true;
      if ((com.tencent.mm.ui.base.b.A(getClass()) & 0x10) != 0) {}
      for (int i = 1;; i = 0)
      {
        if (i == 0) {
          break label103;
        }
        af.t(new Runnable()
        {
          public final void run()
          {
            GMTrace.i(2532017438720L, 18865);
            com.tencent.mm.ui.base.b.Y(MMFragmentActivity.this);
            GMTrace.o(2532017438720L, 18865);
          }
        });
        break;
      }
    }
    GMTrace.o(1660273295360L, 12370);
    return false;
  }
  
  public u bXi()
  {
    GMTrace.i(1658394247168L, 12356);
    int i = this.vMr.size();
    if (i == 0)
    {
      GMTrace.o(1658394247168L, 12356);
      return null;
    }
    u localu = (u)((WeakReference)this.vMr.get(i - 1)).get();
    if ((localu != null) && (localu.isShowing()))
    {
      GMTrace.o(1658394247168L, 12356);
      return localu;
    }
    GMTrace.o(1658394247168L, 12356);
    return null;
  }
  
  public boolean bmX()
  {
    GMTrace.i(1660004859904L, 12368);
    GMTrace.o(1660004859904L, 12368);
    return true;
  }
  
  public boolean dispatchKeyEvent(KeyEvent paramKeyEvent)
  {
    GMTrace.i(1661481254912L, 12379);
    if ((bXH()) && (paramKeyEvent.getKeyCode() == 4) && (this.vMl.cjs()))
    {
      w.w("ashutest", "ashutest::IS SwipeBack ING, ignore KeyBack Event");
      GMTrace.o(1661481254912L, 12379);
      return true;
    }
    boolean bool = super.dispatchKeyEvent(paramKeyEvent);
    GMTrace.o(1661481254912L, 12379);
    return bool;
  }
  
  public void f(boolean paramBoolean, int paramInt)
  {
    long l = 120L;
    GMTrace.i(1660944384000L, 12375);
    w.v("ashutest", "ashutest:: on settle %B, speed %d", new Object[] { Boolean.valueOf(paramBoolean), Integer.valueOf(paramInt) });
    if (this.vMv == null) {
      this.vMv = ad.a(getWindow(), cN().cO().getCustomView());
    }
    View localView = this.vMv;
    if (paramBoolean)
    {
      if (paramInt > 0) {}
      for (;;)
      {
        j.a(localView, l, 0.0F, null);
        GMTrace.o(1660944384000L, 12375);
        return;
        l = 240L;
      }
    }
    if (paramInt > 0) {}
    for (;;)
    {
      j.a(localView, l, localView.getWidth() * -1 / 4, null);
      GMTrace.o(1660944384000L, 12375);
      return;
      l = 240L;
    }
  }
  
  public void finish()
  {
    int j = 1;
    GMTrace.i(1658796900352L, 12359);
    super.finish();
    if ((com.tencent.mm.ui.base.b.A(getClass()) & 0x2) == 0) {}
    for (int i = 1; i != 0; i = 0)
    {
      super.overridePendingTransition(a.vMD, a.vME);
      GMTrace.o(1658796900352L, 12359);
      return;
    }
    if ((com.tencent.mm.ui.base.b.A(getClass()) & 0x4) != 0) {}
    for (i = j; i == 0; i = 0)
    {
      com.tencent.mm.ui.base.b.fm(this);
      GMTrace.o(1658796900352L, 12359);
      return;
    }
    com.tencent.mm.ui.base.b.fn(this);
    GMTrace.o(1658796900352L, 12359);
  }
  
  public Resources getResources()
  {
    GMTrace.i(1660675948544L, 12373);
    if ((getAssets() != null) && (ab.getResources() != null))
    {
      localResources = ab.getResources();
      GMTrace.o(1660675948544L, 12373);
      return localResources;
    }
    Resources localResources = super.getResources();
    GMTrace.o(1660675948544L, 12373);
    return localResources;
  }
  
  public Object getSystemService(String paramString)
  {
    GMTrace.i(1660541730816L, 12372);
    Object localObject = super.getSystemService(paramString);
    if ("layout_inflater".equals(paramString))
    {
      paramString = v.b((LayoutInflater)localObject);
      GMTrace.o(1660541730816L, 12372);
      return paramString;
    }
    GMTrace.o(1660541730816L, 12372);
    return localObject;
  }
  
  public void onCancel()
  {
    GMTrace.i(1661212819456L, 12377);
    this.iur = false;
    GMTrace.o(1661212819456L, 12377);
  }
  
  public void onConfigurationChanged(Configuration paramConfiguration)
  {
    GMTrace.i(1661749690368L, 12381);
    super.onConfigurationChanged(paramConfiguration);
    if (cN().cO() != null)
    {
      paramConfiguration = (ViewGroup)findViewById(a.g.decor_content_parent);
      if (paramConfiguration != null)
      {
        paramConfiguration = paramConfiguration.findViewById(a.g.action_bar);
        if ((paramConfiguration != null) && ((paramConfiguration instanceof Toolbar)))
        {
          paramConfiguration = (Toolbar)paramConfiguration;
          ViewGroup.LayoutParams localLayoutParams = paramConfiguration.getLayoutParams();
          if (localLayoutParams != null) {
            localLayoutParams.height = com.tencent.mm.compatible.util.a.f(this);
          }
          paramConfiguration.setLayoutParams(localLayoutParams);
        }
      }
    }
    GMTrace.o(1661749690368L, 12381);
  }
  
  public void onCreate(Bundle paramBundle)
  {
    GMTrace.i(1657588940800L, 12350);
    this.className = getClass().getName();
    ac.aI(3, this.className);
    super.onCreate(paramBundle);
    this.vMs = new b();
    paramBundle = this.vMs;
    paramBundle.vMF = NfcAdapter.getDefaultAdapter(paramBundle.vMw);
    paramBundle.init();
    GMTrace.o(1657588940800L, 12350);
  }
  
  public void onDestroy()
  {
    GMTrace.i(1657723158528L, 12351);
    this.vMt.xwC.dead();
    super.onDestroy();
    GMTrace.o(1657723158528L, 12351);
  }
  
  public void onPause()
  {
    GMTrace.i(1658125811712L, 12354);
    ac.aI(2, this.className);
    super.onPause();
    if (bXH())
    {
      if (this.vMl != null) {
        this.vMl.mEnable = false;
      }
      if (!isFinishing()) {
        k.a(this);
      }
    }
    b localb;
    if (this.vMs != null)
    {
      localb = this.vMs;
      if (localb.vMF == null) {}
    }
    try
    {
      localb.vMF.disableForegroundDispatch(localb.vMw);
      this.vMt.xwD.dead();
      GMTrace.o(1658125811712L, 12354);
      return;
    }
    catch (IllegalStateException localIllegalStateException)
    {
      for (;;)
      {
        w.e("MicroMsg.MMFragmentActivity", "lo-nfc-onPause: exp:" + localIllegalStateException.getLocalizedMessage());
      }
    }
  }
  
  public void onResume()
  {
    GMTrace.i(1658260029440L, 12355);
    ac.aI(1, this.className);
    super.onResume();
    if (bXH())
    {
      k.b(this);
      U(1.0F);
      if (this.vMl != null)
      {
        this.vMl.mEnable = true;
        this.vMl.xpb = false;
      }
    }
    if (this.vMs != null)
    {
      b localb = this.vMs;
      if (localb.vMF != null)
      {
        if ((localb.agA == null) || (localb.vMG == null) || (localb.vMH == null)) {
          localb.init();
        }
        try
        {
          localb.vMF.enableForegroundDispatch(localb.vMw, localb.agA, localb.vMG, localb.vMH);
          GMTrace.o(1658260029440L, 12355);
          return;
        }
        catch (IllegalStateException localIllegalStateException)
        {
          w.e("MicroMsg.MMFragmentActivity", "lo-nfc-onResume: exp:" + localIllegalStateException.getLocalizedMessage());
        }
      }
    }
    GMTrace.o(1658260029440L, 12355);
  }
  
  public void onSaveInstanceState(Bundle paramBundle)
  {
    GMTrace.i(1658528464896L, 12357);
    if (Build.VERSION.SDK_INT < 11) {
      super.onSaveInstanceState(paramBundle);
    }
    GMTrace.o(1658528464896L, 12357);
  }
  
  public void onStart()
  {
    GMTrace.i(1657991593984L, 12353);
    super.onStart();
    GMTrace.o(1657991593984L, 12353);
  }
  
  public void onStop()
  {
    GMTrace.i(1657857376256L, 12352);
    this.vMt.xwE.dead();
    super.onStop();
    GMTrace.o(1657857376256L, 12352);
  }
  
  @TargetApi(11)
  public void startActivities(Intent[] paramArrayOfIntent)
  {
    GMTrace.i(1659065335808L, 12361);
    super.startActivities(paramArrayOfIntent);
    am(null);
    GMTrace.o(1659065335808L, 12361);
  }
  
  @TargetApi(16)
  public void startActivities(Intent[] paramArrayOfIntent, Bundle paramBundle)
  {
    GMTrace.i(1658931118080L, 12360);
    super.startActivities(paramArrayOfIntent, paramBundle);
    am(null);
    GMTrace.o(1658931118080L, 12360);
  }
  
  public void startActivity(Intent paramIntent)
  {
    GMTrace.i(1659199553536L, 12362);
    super.startActivity(paramIntent);
    am(paramIntent);
    GMTrace.o(1659199553536L, 12362);
  }
  
  @TargetApi(16)
  public void startActivity(Intent paramIntent, Bundle paramBundle)
  {
    GMTrace.i(1659333771264L, 12363);
    super.startActivity(paramIntent, paramBundle);
    am(paramIntent);
    GMTrace.o(1659333771264L, 12363);
  }
  
  public void startActivityForResult(Intent paramIntent, int paramInt)
  {
    GMTrace.i(1659467988992L, 12364);
    super.startActivityForResult(paramIntent, paramInt);
    am(paramIntent);
    GMTrace.o(1659467988992L, 12364);
  }
  
  @TargetApi(16)
  public void startActivityForResult(Intent paramIntent, int paramInt, Bundle paramBundle)
  {
    GMTrace.i(1659602206720L, 12365);
    super.startActivityForResult(paramIntent, paramInt, paramBundle);
    am(paramIntent);
    GMTrace.o(1659602206720L, 12365);
  }
  
  public static final class a
  {
    public static int vMA;
    public static int vMB;
    public static int vMC;
    public static int vMD;
    public static int vME;
    public static int vMx;
    public static int vMy;
    public static int vMz;
    
    static
    {
      GMTrace.i(2918430277632L, 21744);
      boolean bool2 = com.tencent.mm.compatible.util.d.et(19);
      boolean bool1 = com.tencent.mm.compatible.h.a.tw() & bool2;
      if (bool1)
      {
        i = a.a.aMb;
        vMx = i;
        if (!bool1) {
          break label110;
        }
        i = a.a.aMa;
        label41:
        vMy = i;
        if (!bool1) {
          break label117;
        }
        i = a.a.gci;
        label53:
        vMz = i;
        if (!bool1) {
          break label124;
        }
      }
      label110:
      label117:
      label124:
      for (int i = a.a.gcj;; i = a.a.aLD)
      {
        vMA = i;
        vMB = vMx;
        vMC = vMy;
        vMD = vMz;
        vME = vMA;
        GMTrace.o(2918430277632L, 21744);
        return;
        i = a.a.aLC;
        break;
        i = a.a.aLj;
        break label41;
        i = a.a.aLj;
        break label53;
      }
    }
    
    public a()
    {
      GMTrace.i(2918161842176L, 21742);
      GMTrace.o(2918161842176L, 21742);
    }
    
    public static void bXN()
    {
      GMTrace.i(2918296059904L, 21743);
      t localt = com.tencent.mm.compatible.d.p.fQH;
      boolean bool = t.tp();
      w.i("MicroMsg.MMFragmentActivity", "lm: setAnimationStyle swipbackType = " + bool);
      if (!bool)
      {
        GMTrace.o(2918296059904L, 21743);
        return;
      }
      bool = com.tencent.mm.compatible.util.d.et(19);
      bool = com.tencent.mm.compatible.h.a.tw() & bool;
      w.i("MicroMsg.MMFragmentActivity", "lm: setAnimationStyle supportSwipe = " + bool);
      if (bool)
      {
        i = a.a.aMb;
        vMx = i;
        if (!bool) {
          break label174;
        }
        i = a.a.aMa;
        label105:
        vMy = i;
        if (!bool) {
          break label181;
        }
        i = a.a.gci;
        label117:
        vMz = i;
        if (!bool) {
          break label188;
        }
      }
      label174:
      label181:
      label188:
      for (int i = a.a.gcj;; i = a.a.aLD)
      {
        vMA = i;
        vMB = vMx;
        vMC = vMy;
        vMD = vMz;
        vME = vMA;
        GMTrace.o(2918296059904L, 21743);
        return;
        i = a.a.aLC;
        break;
        i = a.a.aLj;
        break label105;
        i = a.a.aLj;
        break label117;
      }
    }
  }
  
  private final class b
  {
    PendingIntent agA;
    NfcAdapter vMF;
    IntentFilter[] vMG;
    String[][] vMH;
    
    public b()
    {
      GMTrace.i(2933596880896L, 21857);
      GMTrace.o(2933596880896L, 21857);
    }
    
    final void init()
    {
      GMTrace.i(20287412240384L, 151153);
      Object localObject = new Intent();
      ((Intent)localObject).setClassName(ab.getPackageName(), "com.tencent.mm.plugin.nfc_open.ui.NfcWebViewUI");
      ((Intent)localObject).addFlags(536870912);
      this.agA = PendingIntent.getActivity(MMFragmentActivity.this, 0, (Intent)localObject, 0);
      localObject = new IntentFilter("android.nfc.action.NDEF_DISCOVERED");
      try
      {
        ((IntentFilter)localObject).addDataType("*/*");
        IntentFilter localIntentFilter = new IntentFilter("android.nfc.action.TECH_DISCOVERED");
        localIntentFilter.addDataScheme("vnd.android.nfc");
        this.vMG = new IntentFilter[] { localObject, localIntentFilter, new IntentFilter("android.nfc.action.TAG_DISCOVERED") };
        this.vMH = new String[][] { { NfcA.class.getName(), IsoDep.class.getName() } };
        GMTrace.o(20287412240384L, 151153);
        return;
      }
      catch (IntentFilter.MalformedMimeTypeException localMalformedMimeTypeException)
      {
        throw new RuntimeException("fail", localMalformedMimeTypeException);
      }
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\ui\MMFragmentActivity.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */