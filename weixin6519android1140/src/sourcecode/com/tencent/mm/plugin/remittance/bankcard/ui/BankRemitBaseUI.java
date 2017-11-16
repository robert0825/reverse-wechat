package com.tencent.mm.plugin.remittance.bankcard.ui;

import android.app.Activity;
import android.content.res.Resources;
import android.graphics.drawable.ColorDrawable;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.app.d;
import android.view.MenuItem;
import android.view.MenuItem.OnMenuItemClickListener;
import android.view.View;
import android.view.Window;
import android.view.WindowManager.LayoutParams;
import android.widget.TextView;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.plugin.wxpay.a.c;
import com.tencent.mm.plugin.wxpay.a.f;
import com.tencent.mm.plugin.wxpay.a.h;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.p;
import com.tencent.mm.wallet_core.ui.WalletBaseUI;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

public abstract class BankRemitBaseUI
  extends WalletBaseUI
{
  public BankRemitBaseUI()
  {
    GMTrace.i(20909645627392L, 155789);
    GMTrace.o(20909645627392L, 155789);
  }
  
  public static int H(Activity paramActivity)
  {
    GMTrace.i(20910048280576L, 155792);
    int j = 0;
    int i = j;
    if (Build.VERSION.SDK_INT >= 19)
    {
      if (Build.VERSION.SDK_INT < 23) {
        break label53;
      }
      paramActivity.getWindow().getDecorView().setSystemUiVisibility(8192);
      i = 3;
    }
    for (;;)
    {
      GMTrace.o(20910048280576L, 155792);
      return i;
      label53:
      if (I(paramActivity))
      {
        i = 1;
      }
      else
      {
        i = j;
        if (d(paramActivity.getWindow())) {
          i = 2;
        }
      }
    }
  }
  
  private static boolean I(Activity paramActivity)
  {
    boolean bool2 = true;
    GMTrace.i(20910316716032L, 155794);
    Window localWindow = paramActivity.getWindow();
    Class localClass1;
    if (localWindow != null) {
      localClass1 = localWindow.getClass();
    }
    for (;;)
    {
      try
      {
        Class localClass2 = Class.forName("android.view.MiuiWindowManager$LayoutParams");
        int i = localClass2.getField("EXTRA_FLAG_STATUS_BAR_DARK_MODE").getInt(localClass2);
        localClass1.getMethod("setExtraFlags", new Class[] { Integer.TYPE, Integer.TYPE }).invoke(localWindow, new Object[] { Integer.valueOf(i), Integer.valueOf(i) });
        bool1 = bool2;
      }
      catch (Exception paramActivity)
      {
        bool1 = false;
        continue;
      }
      try
      {
        if (Build.VERSION.SDK_INT >= 23)
        {
          paramActivity.getWindow().getDecorView().setSystemUiVisibility(8192);
          bool1 = bool2;
        }
      }
      catch (Exception paramActivity)
      {
        bool1 = bool2;
        continue;
      }
      GMTrace.o(20910316716032L, 155794);
      return bool1;
      boolean bool1 = false;
    }
  }
  
  private static boolean d(Window paramWindow)
  {
    boolean bool = true;
    GMTrace.i(20910182498304L, 155793);
    if (paramWindow != null) {}
    for (;;)
    {
      try
      {
        WindowManager.LayoutParams localLayoutParams = paramWindow.getAttributes();
        Field localField1 = WindowManager.LayoutParams.class.getDeclaredField("MEIZU_FLAG_DARK_STATUS_BAR_ICON");
        Field localField2 = WindowManager.LayoutParams.class.getDeclaredField("meizuFlags");
        localField1.setAccessible(true);
        localField2.setAccessible(true);
        localField2.setInt(localLayoutParams, localField1.getInt(null) | localField2.getInt(localLayoutParams));
        paramWindow.setAttributes(localLayoutParams);
        GMTrace.o(20910182498304L, 155793);
        return bool;
      }
      catch (Exception paramWindow) {}
      bool = false;
    }
  }
  
  protected void aoI()
  {
    GMTrace.i(20909914062848L, 155791);
    cN().cO().setBackgroundDrawable(new ColorDrawable(getResources().getColor(a.c.sma)));
    Object localObject = cN().cO().getCustomView();
    if (localObject != null)
    {
      View localView = ((View)localObject).findViewById(a.f.divider);
      if (localView != null) {
        localView.setBackgroundColor(getResources().getColor(a.c.black));
      }
      localObject = ((View)localObject).findViewById(16908308);
      if ((localObject != null) && ((localObject instanceof TextView))) {
        ((TextView)localObject).setTextColor(getResources().getColor(a.c.black));
      }
    }
    if (Build.VERSION.SDK_INT >= 21)
    {
      localObject = getWindow();
      ((Window)localObject).addFlags(Integer.MIN_VALUE);
      ((Window)localObject).setStatusBarColor(getResources().getColor(a.c.sma));
    }
    w.i("BankRemitBase", "ret: %s", new Object[] { Integer.valueOf(H(this)) });
    this.vKB.hqF.setFitsSystemWindows(true);
    GMTrace.o(20909914062848L, 155791);
  }
  
  public void onCreate(Bundle paramBundle)
  {
    GMTrace.i(20909779845120L, 155790);
    super.onCreate(paramBundle);
    aoI();
    a(new MenuItem.OnMenuItemClickListener()
    {
      public final boolean onMenuItemClick(MenuItem paramAnonymousMenuItem)
      {
        GMTrace.i(20943200059392L, 156039);
        if (BankRemitBaseUI.a(BankRemitBaseUI.this))
        {
          BankRemitBaseUI.this.aLo();
          BankRemitBaseUI.this.showDialog(1000);
        }
        for (;;)
        {
          GMTrace.o(20943200059392L, 156039);
          return true;
          BankRemitBaseUI.this.finish();
        }
      }
    }, a.h.cJD);
    GMTrace.o(20909779845120L, 155790);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\plugin\remittance\bankcard\ui\BankRemitBaseUI.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */