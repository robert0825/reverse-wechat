package com.tencent.mm.ui;

import android.annotation.TargetApi;
import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.graphics.PorterDuff.Mode;
import android.graphics.drawable.Drawable;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.support.v7.app.ActionBar;
import android.support.v7.app.ActionBarActivity;
import android.view.KeyCharacterMap;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.MenuItem;
import android.view.MenuItem.OnMenuItemClickListener;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewGroup.LayoutParams;
import android.view.Window;
import android.view.inputmethod.InputMethodManager;
import android.widget.FrameLayout;
import android.widget.FrameLayout.LayoutParams;
import android.widget.ImageView;
import android.widget.TextView;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.s;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.v.a.d;
import com.tencent.mm.v.a.e;
import com.tencent.mm.v.a.g;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Locale;

@com.tencent.mm.ui.base.a(0)
public abstract class MMActivity
  extends MMFragmentActivity
{
  private static String vKF;
  String className;
  public boolean vKA;
  public p vKB;
  public a vKC;
  public boolean vKD;
  private View vKE;
  
  static
  {
    GMTrace.i(20289425506304L, 151168);
    if (Build.VERSION.SDK_INT >= 19) {
      try
      {
        Method localMethod = Class.forName("android.os.SystemProperties").getDeclaredMethod("get", new Class[] { String.class });
        localMethod.setAccessible(true);
        vKF = (String)localMethod.invoke(null, new Object[] { "qemu.hw.mainkeys" });
        GMTrace.o(20289425506304L, 151168);
        return;
      }
      catch (Throwable localThrowable)
      {
        vKF = null;
      }
    }
    GMTrace.o(20289425506304L, 151168);
  }
  
  public MMActivity()
  {
    GMTrace.i(2091246419968L, 15581);
    this.vKA = false;
    this.vKB = new p()
    {
      protected final void VC()
      {
        GMTrace.i(2085340839936L, 15537);
        MMActivity.this.VC();
        GMTrace.o(2085340839936L, 15537);
      }
      
      protected final String aJX()
      {
        GMTrace.i(2084938186752L, 15534);
        String str = MMActivity.this.aJX();
        GMTrace.o(2084938186752L, 15534);
        return str;
      }
      
      public final boolean aaS()
      {
        GMTrace.i(2085743493120L, 15540);
        boolean bool = MMActivity.this.aaS();
        GMTrace.o(2085743493120L, 15540);
        return bool;
      }
      
      public final void aoK()
      {
        GMTrace.i(2085206622208L, 15536);
        MMActivity.this.aoK();
        GMTrace.o(2085206622208L, 15536);
      }
      
      public final boolean bEh()
      {
        GMTrace.i(2085877710848L, 15541);
        boolean bool = MMActivity.this.bEh();
        GMTrace.o(2085877710848L, 15541);
        return bool;
      }
      
      protected final void bH(View paramAnonymousView)
      {
        GMTrace.i(2084803969024L, 15533);
        MMActivity.this.bH(paramAnonymousView);
        GMTrace.o(2084803969024L, 15533);
      }
      
      protected final boolean bXl()
      {
        GMTrace.i(2085609275392L, 15539);
        boolean bool = MMActivity.this.bXl();
        GMTrace.o(2085609275392L, 15539);
        return bool;
      }
      
      protected final View bXo()
      {
        GMTrace.i(2085072404480L, 15535);
        View localView = MMActivity.bXo();
        GMTrace.o(2085072404480L, 15535);
        return localView;
      }
      
      protected final String getClassName()
      {
        GMTrace.i(2085475057664L, 15538);
        String str = MMActivity.this.getClass().getName();
        GMTrace.o(2085475057664L, 15538);
        return str;
      }
      
      protected final int getLayoutId()
      {
        GMTrace.i(2084669751296L, 15532);
        int i = MMActivity.this.getLayoutId();
        GMTrace.o(2084669751296L, 15532);
        return i;
      }
    };
    this.vKC = null;
    this.vKD = false;
    GMTrace.o(2091246419968L, 15581);
  }
  
  public static void G(Activity paramActivity)
  {
    GMTrace.i(2101044314112L, 15654);
    InputMethodManager localInputMethodManager = (InputMethodManager)paramActivity.getSystemService("input_method");
    if (localInputMethodManager == null)
    {
      GMTrace.o(2101044314112L, 15654);
      return;
    }
    paramActivity = paramActivity.getCurrentFocus();
    if (paramActivity == null)
    {
      GMTrace.o(2101044314112L, 15654);
      return;
    }
    if (paramActivity.getWindowToken() == null)
    {
      GMTrace.o(2101044314112L, 15654);
      return;
    }
    localInputMethodManager.toggleSoftInput(0, 2);
    GMTrace.o(2101044314112L, 15654);
  }
  
  public static void bXn()
  {
    GMTrace.i(2094736080896L, 15607);
    p.bXn();
    GMTrace.o(2094736080896L, 15607);
  }
  
  protected static View bXo()
  {
    GMTrace.i(20288620199936L, 151162);
    GMTrace.o(20288620199936L, 151162);
    return null;
  }
  
  public static Locale eJ(Context paramContext)
  {
    GMTrace.i(2091649073152L, 15584);
    paramContext = p.eJ(paramContext);
    GMTrace.o(2091649073152L, 15584);
    return paramContext;
  }
  
  public static boolean eX(Context paramContext)
  {
    GMTrace.i(20289291288576L, 151167);
    Resources localResources = paramContext.getResources();
    boolean bool2 = KeyCharacterMap.deviceHasKey(4);
    int i = localResources.getIdentifier("config_showNavigationBar", "bool", "android");
    if (i != 0)
    {
      boolean bool1 = localResources.getBoolean(i);
      if ("1".equals(vKF)) {
        bool1 = false;
      }
      while ((bool1) && (!bool2) && (!ViewConfiguration.get(paramContext).hasPermanentMenuKey()))
      {
        GMTrace.o(20289291288576L, 151167);
        return true;
        if ("0".equals(vKF)) {
          bool1 = true;
        }
      }
      GMTrace.o(20289291288576L, 151167);
      return false;
    }
    if ((!ViewConfiguration.get(paramContext).hasPermanentMenuKey()) && (!bool2))
    {
      GMTrace.o(20289291288576L, 151167);
      return true;
    }
    GMTrace.o(20289291288576L, 151167);
    return false;
  }
  
  public final void AT(int paramInt)
  {
    GMTrace.i(2091514855424L, 15583);
    p localp = this.vKB;
    if (localp.hqF != null)
    {
      if (localp.vKL == null) {
        localp.vKL = ((FrameLayout)localp.hqF.findViewById(a.g.bNr));
      }
      localp.vKL.setBackgroundResource(paramInt);
      localp.vKI.setBackgroundResource(paramInt);
    }
    GMTrace.o(2091514855424L, 15583);
  }
  
  public final void AU(int paramInt)
  {
    GMTrace.i(2095944040448L, 15616);
    p localp = this.vKB;
    if (localp.FM != null) {
      if (paramInt == 0)
      {
        localp.FM.show();
        if (Build.VERSION.SDK_INT >= 21)
        {
          localp.vKW.getWindow().setStatusBarColor(localp.vKW.getResources().getColor(a.d.aPb));
          GMTrace.o(2095944040448L, 15616);
        }
      }
      else
      {
        localp.FM.hide();
        if (Build.VERSION.SDK_INT >= 21) {
          localp.vKW.getWindow().setStatusBarColor(localp.vKW.getResources().getColor(a.d.black));
        }
      }
    }
    GMTrace.o(2095944040448L, 15616);
  }
  
  public final void AV(int paramInt)
  {
    GMTrace.i(2096078258176L, 15617);
    p localp = this.vKB;
    if (localp.FM != null) {
      localp.vLd.setTextColor(paramInt);
    }
    GMTrace.o(2096078258176L, 15617);
  }
  
  public final void AW(int paramInt)
  {
    GMTrace.i(2096749346816L, 15622);
    this.vKB.AW(paramInt);
    GMTrace.o(2096749346816L, 15622);
  }
  
  public final void AX(int paramInt)
  {
    GMTrace.i(2096883564544L, 15623);
    this.vKB.vLd.setVisibility(paramInt);
    GMTrace.o(2096883564544L, 15623);
  }
  
  public final void AY(int paramInt)
  {
    GMTrace.i(2097017782272L, 15624);
    p localp = this.vKB;
    if (localp.FM == null)
    {
      GMTrace.o(2097017782272L, 15624);
      return;
    }
    localp.vKO = 0;
    localp.vKQ = null;
    if (paramInt == 0)
    {
      localp.vKP = 0;
      localp.vKR = null;
    }
    for (;;)
    {
      localp.bXC();
      GMTrace.o(2097017782272L, 15624);
      return;
      if (localp.vKP != paramInt)
      {
        localp.vKP = paramInt;
        localp.vKR = localp.eg(localp.mContext.getResources().getDimensionPixelSize(a.e.aPz), localp.vKP);
      }
    }
  }
  
  public final boolean AZ(int paramInt)
  {
    GMTrace.i(2099970572288L, 15646);
    boolean bool = this.vKB.AZ(paramInt);
    GMTrace.o(2099970572288L, 15646);
    return bool;
  }
  
  public final void Ba(int paramInt)
  {
    GMTrace.i(2100507443200L, 15650);
    this.vKB.Ba(paramInt);
    GMTrace.o(2100507443200L, 15650);
  }
  
  public final void Bb(int paramInt)
  {
    GMTrace.i(20289157070848L, 151166);
    if (this.vKE != null) {
      this.vKE.setVisibility(paramInt);
    }
    GMTrace.o(20289157070848L, 151166);
  }
  
  @Deprecated
  public void MP()
  {
    GMTrace.i(2091380637696L, 15582);
    GMTrace.o(2091380637696L, 15582);
  }
  
  public final void N(CharSequence paramCharSequence)
  {
    GMTrace.i(2096346693632L, 15619);
    this.vKB.N(paramCharSequence);
    GMTrace.o(2096346693632L, 15619);
  }
  
  public int Qf()
  {
    GMTrace.i(2093393903616L, 15597);
    GMTrace.o(2093393903616L, 15597);
    return -1;
  }
  
  public void VC()
  {
    GMTrace.i(2091783290880L, 15585);
    GMTrace.o(2091783290880L, 15585);
  }
  
  public final void Ve(String paramString)
  {
    GMTrace.i(2096615129088L, 15621);
    this.vKB.Ve(paramString);
    GMTrace.o(2096615129088L, 15621);
  }
  
  public final void W(Runnable paramRunnable)
  {
    GMTrace.i(2099433701376L, 15642);
    p localp = this.vKB;
    if (localp.FM == null)
    {
      GMTrace.o(2099433701376L, 15642);
      return;
    }
    localp.FM.getCustomView().setOnClickListener(new p.2(localp, paramRunnable));
    GMTrace.o(2099433701376L, 15642);
  }
  
  public final void Y(int paramInt, boolean paramBoolean)
  {
    GMTrace.i(2097688870912L, 15629);
    this.vKB.a(false, paramInt, paramBoolean);
    GMTrace.o(2097688870912L, 15629);
  }
  
  public final void Z(int paramInt, boolean paramBoolean)
  {
    GMTrace.i(2097957306368L, 15631);
    this.vKB.b(false, paramInt, paramBoolean);
    GMTrace.o(2097957306368L, 15631);
  }
  
  public void Zp()
  {
    GMTrace.i(2093125468160L, 15595);
    if (!bEg()) {
      this.vKB.bXB();
    }
    super.Zp();
    GMTrace.o(2093125468160L, 15595);
  }
  
  public final void a(int paramInt1, int paramInt2, int paramInt3, MenuItem.OnMenuItemClickListener paramOnMenuItemClickListener)
  {
    GMTrace.i(2099031048192L, 15639);
    this.vKB.a(paramInt1, paramInt2, paramInt3, paramOnMenuItemClickListener);
    GMTrace.o(2099031048192L, 15639);
  }
  
  public void a(int paramInt1, int paramInt2, MenuItem.OnMenuItemClickListener paramOnMenuItemClickListener)
  {
    GMTrace.i(2098762612736L, 15637);
    this.vKB.a(paramInt1, paramInt2, paramOnMenuItemClickListener);
    GMTrace.o(2098762612736L, 15637);
  }
  
  public final void a(int paramInt, String paramString, Drawable paramDrawable, MenuItem.OnMenuItemClickListener paramOnMenuItemClickListener)
  {
    GMTrace.i(20288754417664L, 151163);
    this.vKB.a(paramInt, paramString, paramDrawable, paramOnMenuItemClickListener);
    GMTrace.o(20288754417664L, 151163);
  }
  
  public void a(int paramInt, String paramString, MenuItem.OnMenuItemClickListener paramOnMenuItemClickListener)
  {
    GMTrace.i(2098494177280L, 15635);
    this.vKB.a(paramInt, 0, paramString, paramOnMenuItemClickListener, null, p.b.vLF);
    GMTrace.o(2098494177280L, 15635);
  }
  
  public final void a(int paramInt1, String paramString, MenuItem.OnMenuItemClickListener paramOnMenuItemClickListener, int paramInt2)
  {
    GMTrace.i(2098628395008L, 15636);
    this.vKB.a(paramInt1, paramString, paramOnMenuItemClickListener, null, paramInt2);
    GMTrace.o(2098628395008L, 15636);
  }
  
  public final void a(Dialog paramDialog)
  {
    GMTrace.i(2094333427712L, 15604);
    p localp = this.vKB;
    if (paramDialog != null)
    {
      if (localp.vLb == null) {
        localp.vLb = new ArrayList();
      }
      localp.vLb.add(paramDialog);
    }
    GMTrace.o(2094333427712L, 15604);
  }
  
  public void a(MenuItem.OnMenuItemClickListener paramOnMenuItemClickListener)
  {
    GMTrace.i(2099567919104L, 15643);
    this.vKB.a(paramOnMenuItemClickListener, 0);
    GMTrace.o(2099567919104L, 15643);
  }
  
  public void a(MenuItem.OnMenuItemClickListener paramOnMenuItemClickListener, int paramInt)
  {
    GMTrace.i(2099702136832L, 15644);
    this.vKB.a(paramOnMenuItemClickListener, paramInt);
    GMTrace.o(2099702136832L, 15644);
  }
  
  public final void a(a parama, Intent paramIntent, int paramInt)
  {
    GMTrace.i(2101581185024L, 15658);
    this.vKC = parama;
    startActivityForResult(paramIntent, paramInt);
    GMTrace.o(2101581185024L, 15658);
  }
  
  public final void a(com.tencent.mm.ui.tools.p paramp)
  {
    GMTrace.i(2098359959552L, 15634);
    this.vKB.a(true, paramp);
    GMTrace.o(2098359959552L, 15634);
  }
  
  public final void a(Class<?> paramClass, Intent paramIntent)
  {
    GMTrace.i(2101446967296L, 15657);
    paramIntent.setClass(this, paramClass);
    startActivity(paramIntent);
    GMTrace.o(2101446967296L, 15657);
  }
  
  public void aEa()
  {
    GMTrace.i(2093528121344L, 15598);
    if (Qf() == -1)
    {
      this.vKA = getSharedPreferences(ab.bPU(), 0).getBoolean("settings_landscape_mode", false);
      if (this.vKA)
      {
        setRequestedOrientation(-1);
        GMTrace.o(2093528121344L, 15598);
        return;
      }
      setRequestedOrientation(1);
      GMTrace.o(2093528121344L, 15598);
      return;
    }
    setRequestedOrientation(Qf());
    GMTrace.o(2093528121344L, 15598);
  }
  
  public final void aH(int paramInt, String paramString)
  {
    GMTrace.i(2099165265920L, 15640);
    p localp = this.vKB;
    p.a locala = localp.Bd(paramInt);
    if ((locala != null) && (!bg.aq(paramString, "").equals(locala.text)))
    {
      locala.text = paramString;
      localp.aQ();
    }
    GMTrace.o(2099165265920L, 15640);
  }
  
  public String aJX()
  {
    GMTrace.i(2095407169536L, 15612);
    GMTrace.o(2095407169536L, 15612);
    return "";
  }
  
  public void aLo()
  {
    GMTrace.i(2100641660928L, 15651);
    this.vKB.avJ();
    GMTrace.o(2100641660928L, 15651);
  }
  
  public void aLs()
  {
    GMTrace.i(2100910096384L, 15653);
    this.vKB.aLs();
    GMTrace.o(2100910096384L, 15653);
  }
  
  public boolean aaS()
  {
    GMTrace.i(2092454379520L, 15590);
    GMTrace.o(2092454379520L, 15590);
    return false;
  }
  
  public void aoK()
  {
    GMTrace.i(2092588597248L, 15591);
    GMTrace.o(2092588597248L, 15591);
  }
  
  public final void b(MenuItem.OnMenuItemClickListener paramOnMenuItemClickListener)
  {
    GMTrace.i(2099299483648L, 15641);
    p.a locala = this.vKB.Bd(1);
    if (locala != null)
    {
      locala.orU = paramOnMenuItemClickListener;
      locala.lit = null;
    }
    GMTrace.o(2099299483648L, 15641);
  }
  
  public boolean bEg()
  {
    GMTrace.i(2093259685888L, 15596);
    GMTrace.o(2093259685888L, 15596);
    return false;
  }
  
  public boolean bEh()
  {
    GMTrace.i(2094064992256L, 15602);
    GMTrace.o(2094064992256L, 15602);
    return true;
  }
  
  public void bH(View paramView)
  {
    GMTrace.i(2092320161792L, 15589);
    setContentView(paramView);
    GMTrace.o(2092320161792L, 15589);
  }
  
  public boolean bXl()
  {
    GMTrace.i(2091917508608L, 15586);
    GMTrace.o(2091917508608L, 15586);
    return false;
  }
  
  public final ActionBarActivity bXm()
  {
    GMTrace.i(2094467645440L, 15605);
    ActionBarActivity localActionBarActivity = this.vKB.vKW;
    GMTrace.o(2094467645440L, 15605);
    return localActionBarActivity;
  }
  
  public final void bXp()
  {
    GMTrace.i(2097152000000L, 15625);
    p localp = this.vKB;
    if (localp.vLc == null)
    {
      GMTrace.o(2097152000000L, 15625);
      return;
    }
    localp.vLc.setVisibility(8);
    GMTrace.o(2097152000000L, 15625);
  }
  
  public final boolean bXq()
  {
    GMTrace.i(2098091524096L, 15632);
    Iterator localIterator = this.vKB.vKZ.iterator();
    while (localIterator.hasNext())
    {
      p.a locala = (p.a)localIterator.next();
      if (locala.vLz == 0)
      {
        boolean bool = locala.eDU;
        GMTrace.o(2098091524096L, 15632);
        return bool;
      }
    }
    GMTrace.o(2098091524096L, 15632);
    return false;
  }
  
  public final boolean bXr()
  {
    GMTrace.i(2098225741824L, 15633);
    Iterator localIterator = this.vKB.vKZ.iterator();
    while (localIterator.hasNext())
    {
      p.a locala = (p.a)localIterator.next();
      if (locala.vLz == 0)
      {
        boolean bool = locala.visible;
        GMTrace.o(2098225741824L, 15633);
        return bool;
      }
    }
    GMTrace.o(2098225741824L, 15633);
    return false;
  }
  
  public final void bXs()
  {
    GMTrace.i(20288888635392L, 151164);
    p localp = this.vKB;
    if (localp.vLf != null) {
      localp.vLf.setColorFilter(-16777216, PorterDuff.Mode.SRC_ATOP);
    }
    GMTrace.o(20288888635392L, 151164);
  }
  
  public final CharSequence bXt()
  {
    GMTrace.i(2100104790016L, 15647);
    Object localObject = this.vKB;
    if (((p)localObject).FM == null)
    {
      GMTrace.o(2100104790016L, 15647);
      return null;
    }
    if (((p)localObject).vKN != null)
    {
      localObject = ((p)localObject).vKN;
      GMTrace.o(2100104790016L, 15647);
      return (CharSequence)localObject;
    }
    localObject = ((p)localObject).FM.getTitle();
    GMTrace.o(2100104790016L, 15647);
    return (CharSequence)localObject;
  }
  
  public final void bXu()
  {
    boolean bool = true;
    GMTrace.i(2100239007744L, 15648);
    p localp = this.vKB;
    if (localp.FM != null) {}
    for (;;)
    {
      w.v("MicroMsg.MMActivityController", "showTitleView hasTitle:%b", new Object[] { Boolean.valueOf(bool) });
      if (localp.FM != null) {
        localp.FM.show();
      }
      GMTrace.o(2100239007744L, 15648);
      return;
      bool = false;
    }
  }
  
  public final boolean bXv()
  {
    boolean bool = true;
    GMTrace.i(2100373225472L, 15649);
    p localp = this.vKB;
    if (localp.FM != null) {}
    for (;;)
    {
      w.v("MicroMsg.MMActivityController", "isTitleShowing hasTitle:%b", new Object[] { Boolean.valueOf(bool) });
      if (localp.FM != null) {
        break;
      }
      GMTrace.o(2100373225472L, 15649);
      return false;
      bool = false;
    }
    bool = localp.FM.isShowing();
    GMTrace.o(2100373225472L, 15649);
    return bool;
  }
  
  public final void bXw()
  {
    GMTrace.i(2101849620480L, 15660);
    p localp = this.vKB;
    localp.vLg.setVisibility(0);
    localp.vLf.setVisibility(8);
    localp.vLe.setVisibility(8);
    GMTrace.o(2101849620480L, 15660);
  }
  
  public final void bXx()
  {
    GMTrace.i(2101983838208L, 15661);
    p localp = this.vKB;
    if (localp.mContext != null) {
      localp.U(localp.vKW);
    }
    GMTrace.o(2101983838208L, 15661);
  }
  
  public final void bXy()
  {
    int k = 0;
    GMTrace.i(20289022853120L, 151165);
    if (!eX(this.vKB.vKW))
    {
      w.w("MicroMsg.MMActivity", "has not NavigationBar!");
      GMTrace.o(20289022853120L, 151165);
      return;
    }
    if (this.vKE == null)
    {
      this.vKE = new View(this.vKB.vKW);
      ((ViewGroup)getWindow().getDecorView()).addView(this.vKE);
    }
    Object localObject = this.vKB.vKW;
    Resources localResources = ((Context)localObject).getResources();
    int j;
    int i;
    if (localResources.getConfiguration().orientation == 1)
    {
      j = 1;
      i = k;
      if (Build.VERSION.SDK_INT >= 14)
      {
        i = k;
        if (eX((Context)localObject)) {
          if (j == 0) {
            break label231;
          }
        }
      }
    }
    label231:
    for (localObject = "navigation_bar_height";; localObject = "navigation_bar_height_landscape")
    {
      j = localResources.getIdentifier((String)localObject, "dimen", "android");
      i = k;
      if (j > 0) {
        i = localResources.getDimensionPixelSize(j);
      }
      localObject = new FrameLayout.LayoutParams(-1, i);
      ((FrameLayout.LayoutParams)localObject).gravity = 80;
      this.vKE.setLayoutParams((ViewGroup.LayoutParams)localObject);
      this.vKE.setBackgroundColor(-637534208);
      this.vKE.setVisibility(8);
      GMTrace.o(20289022853120L, 151165);
      return;
      j = 0;
      break;
    }
  }
  
  public final void db(View paramView)
  {
    GMTrace.i(2100775878656L, 15652);
    this.vKB.da(paramView);
    GMTrace.o(2100775878656L, 15652);
  }
  
  public final void dp(boolean paramBoolean)
  {
    GMTrace.i(2092857032704L, 15593);
    this.vKB.dp(paramBoolean);
    GMTrace.o(2092857032704L, 15593);
  }
  
  public void finish()
  {
    GMTrace.i(2101178531840L, 15655);
    super.finish();
    int i = s.a(getIntent(), "MMActivity.OverrideEnterAnimation", -1);
    int j = s.a(getIntent(), "MMActivity.OverrideExitAnimation", -1);
    if (i != -1) {
      super.overridePendingTransition(i, j);
    }
    GMTrace.o(2101178531840L, 15655);
  }
  
  public abstract int getLayoutId();
  
  public final void lc(boolean paramBoolean)
  {
    GMTrace.i(2095675604992L, 15614);
    this.vKB.lc(paramBoolean);
    GMTrace.o(2095675604992L, 15614);
  }
  
  public final void ld(boolean paramBoolean)
  {
    int j = 8;
    GMTrace.i(21007356133376L, 156517);
    Object localObject = this.vKB;
    if (((p)localObject).FM != null)
    {
      ((p)localObject).FM.setDisplayHomeAsUpEnabled(paramBoolean);
      if ((((p)localObject).vLe != null) && (((p)localObject).vLg != null))
      {
        View localView = ((p)localObject).vLe;
        if (!paramBoolean) {
          break label99;
        }
        i = 0;
        localView.setVisibility(i);
        localObject = ((p)localObject).vLg;
        if (!paramBoolean) {
          break label105;
        }
      }
    }
    label99:
    label105:
    for (int i = j;; i = 0)
    {
      ((View)localObject).setVisibility(i);
      GMTrace.o(21007356133376L, 156517);
      return;
      i = 8;
      break;
    }
  }
  
  public final void le(boolean paramBoolean)
  {
    GMTrace.i(2097420435456L, 15627);
    this.vKB.le(paramBoolean);
    GMTrace.o(2097420435456L, 15627);
  }
  
  public final void lf(boolean paramBoolean)
  {
    GMTrace.i(2097554653184L, 15628);
    this.vKB.a(true, -1, paramBoolean);
    GMTrace.o(2097554653184L, 15628);
  }
  
  public final void lg(boolean paramBoolean)
  {
    GMTrace.i(2097823088640L, 15630);
    this.vKB.b(true, -1, paramBoolean);
    GMTrace.o(2097823088640L, 15630);
  }
  
  public final void lh(boolean paramBoolean)
  {
    GMTrace.i(2099836354560L, 15645);
    p localp = this.vKB;
    if (localp.vLf != null)
    {
      if (paramBoolean)
      {
        localp.vLf.setVisibility(0);
        GMTrace.o(2099836354560L, 15645);
        return;
      }
      localp.vLf.setVisibility(8);
    }
    GMTrace.o(2099836354560L, 15645);
  }
  
  public void oM(int paramInt)
  {
    GMTrace.i(2096480911360L, 15620);
    this.vKB.oM(paramInt);
    GMTrace.o(2096480911360L, 15620);
  }
  
  public void onActivityResult(int paramInt1, int paramInt2, Intent paramIntent)
  {
    GMTrace.i(2101715402752L, 15659);
    super.onActivityResult(paramInt1, paramInt2, paramIntent);
    if (this.vKC != null) {
      this.vKC.a(paramInt1, paramInt2, paramIntent);
    }
    this.vKC = null;
    GMTrace.o(2101715402752L, 15659);
  }
  
  public void onCreate(Bundle paramBundle)
  {
    GMTrace.i(2092051726336L, 15587);
    super.onCreate(paramBundle);
    this.vKB.a(getBaseContext(), this);
    w.i("MicroMsg.MMActivity", "checktask onCreate:%s#0x%x, taskid:%d, task:%s", new Object[] { getClass().getSimpleName(), Integer.valueOf(hashCode()), Integer.valueOf(getTaskId()), bg.eG(this) });
    bXM();
    GMTrace.o(2092051726336L, 15587);
  }
  
  public boolean onCreateOptionsMenu(Menu paramMenu)
  {
    GMTrace.i(2095004516352L, 15609);
    if (this.vKB.onCreateOptionsMenu(paramMenu))
    {
      GMTrace.o(2095004516352L, 15609);
      return true;
    }
    boolean bool = super.onCreateOptionsMenu(paramMenu);
    GMTrace.o(2095004516352L, 15609);
    return bool;
  }
  
  public void onDestroy()
  {
    GMTrace.i(2094601863168L, 15606);
    w.i("MicroMsg.MMActivity", "checktask onDestroy:%s#0x%x task:%s ", new Object[] { getClass().getSimpleName(), Integer.valueOf(hashCode()), bg.eG(this) });
    super.onDestroy();
    com.tencent.mm.sdk.platformtools.a.cX(this.vKB.hqF);
    com.tencent.mm.sdk.platformtools.a.ek(this.vKB.vKW);
    this.vKB.onDestroy();
    this.vKD = true;
    GMTrace.o(2094601863168L, 15606);
  }
  
  public boolean onKeyDown(int paramInt, KeyEvent paramKeyEvent)
  {
    GMTrace.i(2093930774528L, 15601);
    if (this.vKB.onKeyDown(paramInt, paramKeyEvent))
    {
      GMTrace.o(2093930774528L, 15601);
      return true;
    }
    boolean bool = super.onKeyDown(paramInt, paramKeyEvent);
    GMTrace.o(2093930774528L, 15601);
    return bool;
  }
  
  @TargetApi(17)
  public boolean onKeyUp(int paramInt, KeyEvent paramKeyEvent)
  {
    GMTrace.i(2093796556800L, 15600);
    if (this.vKB.onKeyUp(paramInt, paramKeyEvent))
    {
      GMTrace.o(2093796556800L, 15600);
      return true;
    }
    try
    {
      boolean bool = super.onKeyUp(paramInt, paramKeyEvent);
      GMTrace.o(2093796556800L, 15600);
      return bool;
    }
    catch (Exception paramKeyEvent)
    {
      w.printErrStackTrace("MicroMsg.MMActivity", paramKeyEvent, "java.lang.IllegalStateException: Can not perform this action after onSaveInstanceState", new Object[0]);
      GMTrace.o(2093796556800L, 15600);
    }
    return true;
  }
  
  public boolean onOptionsItemSelected(MenuItem paramMenuItem)
  {
    GMTrace.i(2095272951808L, 15611);
    boolean bool = this.vKB.onOptionsItemSelected(paramMenuItem);
    GMTrace.o(2095272951808L, 15611);
    return bool;
  }
  
  public void onPause()
  {
    GMTrace.i(2094870298624L, 15608);
    long l = System.currentTimeMillis();
    ac.aI(2, this.className);
    super.onPause();
    this.vKB.onPause();
    boolean bool = isFinishing();
    w.v("MicroMsg.INIT", "KEVIN MMActivity onPause: %d ms, isFinishing %B, hash:#0x%x", new Object[] { Long.valueOf(System.currentTimeMillis() - l), Boolean.valueOf(bool), Integer.valueOf(hashCode()) });
    GMTrace.o(2094870298624L, 15608);
  }
  
  public boolean onPrepareOptionsMenu(Menu paramMenu)
  {
    GMTrace.i(2095138734080L, 15610);
    this.vKB.onPrepareOptionsMenu(paramMenu);
    boolean bool = super.onPrepareOptionsMenu(paramMenu);
    GMTrace.o(2095138734080L, 15610);
    return bool;
  }
  
  public void onResume()
  {
    GMTrace.i(2094199209984L, 15603);
    long l = System.currentTimeMillis();
    ac.aI(1, this.className);
    super.onResume();
    w.v("MicroMsg.INIT", "KEVIN MMActivity super.onResume " + (System.currentTimeMillis() - l));
    this.vKB.onResume();
    w.v("MicroMsg.INIT", "KEVIN MMActivity onResume :%dms, hash:#0x%x", new Object[] { Long.valueOf(System.currentTimeMillis() - l), Integer.valueOf(hashCode()) });
    GMTrace.o(2094199209984L, 15603);
  }
  
  public void onSaveInstanceState(Bundle paramBundle)
  {
    GMTrace.i(2092722814976L, 15592);
    if (Build.VERSION.SDK_INT < 11) {
      super.onSaveInstanceState(paramBundle);
    }
    GMTrace.o(2092722814976L, 15592);
  }
  
  public void onStart()
  {
    GMTrace.i(2093662339072L, 15599);
    aEa();
    super.onStart();
    GMTrace.o(2093662339072L, 15599);
  }
  
  public void sq(String paramString)
  {
    GMTrace.i(2096212475904L, 15618);
    this.vKB.sq(paramString);
    GMTrace.o(2096212475904L, 15618);
  }
  
  public void sv(int paramInt)
  {
    GMTrace.i(2092991250432L, 15594);
    this.vKB.hqF.setVisibility(paramInt);
    if (paramInt == 0)
    {
      bXu();
      GMTrace.o(2092991250432L, 15594);
      return;
    }
    this.vKB.bXF();
    GMTrace.o(2092991250432L, 15594);
  }
  
  public final void z(Class<?> paramClass)
  {
    GMTrace.i(2101312749568L, 15656);
    Intent localIntent = new Intent();
    localIntent.setClass(this, paramClass);
    startActivity(localIntent);
    GMTrace.o(2101312749568L, 15656);
  }
  
  public static abstract interface a
  {
    public abstract void a(int paramInt1, int paramInt2, Intent paramIntent);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\ui\MMActivity.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */