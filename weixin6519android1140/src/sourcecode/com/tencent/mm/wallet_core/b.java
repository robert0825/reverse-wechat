package com.tencent.mm.wallet_core;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.ad.n;
import com.tencent.mm.kernel.h;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.wallet_core.c.i;
import com.tencent.mm.wallet_core.d.f;
import com.tencent.mm.wallet_core.ui.WalletBaseUI;

public abstract class b
{
  public Bundle ler;
  protected a xCX;
  
  public b()
  {
    GMTrace.i(1456530784256L, 10852);
    this.ler = new Bundle();
    GMTrace.o(1456530784256L, 10852);
  }
  
  private static String cb(Object paramObject)
  {
    GMTrace.i(1457470308352L, 10859);
    if (paramObject == null)
    {
      GMTrace.o(1457470308352L, 10859);
      return "";
    }
    if ((paramObject instanceof Bundle))
    {
      paramObject = String.format("Bundle: %s, ", new Object[] { paramObject.toString() });
      GMTrace.o(1457470308352L, 10859);
      return (String)paramObject;
    }
    if ((paramObject instanceof Context))
    {
      paramObject = String.format("Context: %s, ", new Object[] { paramObject.toString() });
      GMTrace.o(1457470308352L, 10859);
      return (String)paramObject;
    }
    if ((paramObject instanceof Class))
    {
      paramObject = String.format("Class: %s, ", new Object[] { ((Class)paramObject).getSimpleName() });
      GMTrace.o(1457470308352L, 10859);
      return (String)paramObject;
    }
    paramObject = String.format("Value: %s, ", new Object[] { paramObject.toString() });
    GMTrace.o(1457470308352L, 10859);
    return (String)paramObject;
  }
  
  public void B(Activity paramActivity)
  {
    GMTrace.i(1458141396992L, 10864);
    w(new Object[] { "finishActivity", paramActivity });
    if ((!paramActivity.isFinishing()) && ((paramActivity instanceof MMActivity))) {
      ((MMActivity)paramActivity).finish();
    }
    GMTrace.o(1458141396992L, 10864);
  }
  
  public b a(Activity paramActivity, Bundle paramBundle)
  {
    GMTrace.i(1458409832448L, 10866);
    GMTrace.o(1458409832448L, 10866);
    return this;
  }
  
  public com.tencent.mm.wallet_core.d.d a(MMActivity paramMMActivity, f paramf)
  {
    GMTrace.i(1460423098368L, 10881);
    GMTrace.o(1460423098368L, 10881);
    return null;
  }
  
  public abstract void a(Activity paramActivity, int paramInt, Bundle paramBundle);
  
  public final void a(Activity paramActivity, Class<?> paramClass, int paramInt)
  {
    GMTrace.i(1458275614720L, 10865);
    w(new Object[] { "finishActivity", paramActivity, paramClass, "errCode " + paramInt });
    paramClass = new Intent(paramActivity, paramClass);
    paramClass.putExtra("process_id", getClass().hashCode());
    paramClass.addFlags(67108864);
    paramActivity.startActivity(paramClass);
    this.ler.putInt("key_err_code", paramInt);
    GMTrace.o(1458275614720L, 10865);
  }
  
  public final void a(Activity paramActivity, Class<?> paramClass, int paramInt, Intent paramIntent, boolean paramBoolean)
  {
    GMTrace.i(1458812485632L, 10869);
    w(new Object[] { "endProcess2", paramActivity, paramClass, Integer.valueOf(paramInt), paramIntent, Boolean.valueOf(paramBoolean) });
    if (this.xCX != null) {
      paramIntent = this.xCX.k(paramInt, this.ler);
    }
    for (;;)
    {
      if (paramIntent != null)
      {
        paramClass = paramIntent;
        if (paramIntent.getExtras() != null)
        {
          paramClass = paramIntent;
          if (!paramIntent.getExtras().containsKey("key_process_is_stay"))
          {
            paramIntent.putExtra("key_process_is_stay", true);
            paramClass = paramIntent;
          }
        }
      }
      for (;;)
      {
        paramClass.addFlags(67108864);
        paramClass.putExtra("key_process_is_end", true);
        paramActivity.startActivity(paramClass);
        if (this.ler != null) {
          this.ler.clear();
        }
        a.remove(getClass().hashCode());
        GMTrace.o(1458812485632L, 10869);
        return;
        paramClass = new Intent(paramActivity, paramClass);
        paramClass.putExtra("key_process_is_stay", paramBoolean);
      }
    }
  }
  
  public final void a(Activity paramActivity, Class<?> paramClass, int paramInt, boolean paramBoolean)
  {
    GMTrace.i(1459349356544L, 10873);
    a(paramActivity, paramClass, paramInt, null, paramBoolean);
    GMTrace.o(1459349356544L, 10873);
  }
  
  public final void a(Activity paramActivity, Class<?> paramClass, Intent paramIntent)
  {
    GMTrace.i(1459215138816L, 10872);
    a(paramActivity, paramClass, -1, paramIntent, true);
    GMTrace.o(1459215138816L, 10872);
  }
  
  public final void a(Activity paramActivity, Class<?> paramClass, Bundle paramBundle, int paramInt)
  {
    GMTrace.i(1458007179264L, 10863);
    w(new Object[] { "startActivityForResult1", paramActivity, paramClass, paramBundle, Integer.valueOf(paramInt) });
    paramClass = new Intent(paramActivity, paramClass);
    paramClass.putExtra("process_id", getClass().hashCode());
    paramClass.addFlags(67108864);
    paramActivity.startActivityForResult(paramClass, paramInt);
    if (paramBundle != null) {
      this.ler.putAll(paramBundle);
    }
    GMTrace.o(1458007179264L, 10863);
  }
  
  public final void a(Activity paramActivity, String paramString1, String paramString2, int paramInt, Intent paramIntent, boolean paramBoolean)
  {
    GMTrace.i(1459080921088L, 10871);
    w(new Object[] { "endProcess3", paramActivity, paramString1, paramString2, Integer.valueOf(paramInt), paramIntent, Boolean.valueOf(paramBoolean) });
    if (this.xCX != null) {
      paramIntent = this.xCX.k(paramInt, this.ler);
    }
    for (;;)
    {
      Intent localIntent;
      if (paramIntent != null)
      {
        localIntent = paramIntent;
        if (paramIntent.getExtras() != null)
        {
          localIntent = paramIntent;
          if (!paramIntent.getExtras().containsKey("key_process_is_stay"))
          {
            paramIntent.putExtra("key_process_is_stay", true);
            localIntent = paramIntent;
          }
        }
      }
      for (;;)
      {
        localIntent.addFlags(67108864);
        localIntent.putExtra("key_process_is_end", true);
        com.tencent.mm.bj.d.b(paramActivity, paramString1, paramString2, localIntent);
        if (this.ler != null) {
          this.ler.clear();
        }
        a.remove(getClass().hashCode());
        GMTrace.o(1459080921088L, 10871);
        return;
        localIntent = new Intent();
        localIntent.putExtra("key_process_is_stay", paramBoolean);
      }
    }
  }
  
  public final void a(Activity paramActivity, String paramString1, String paramString2, int paramInt, boolean paramBoolean)
  {
    GMTrace.i(1458946703360L, 10870);
    a(paramActivity, paramString1, paramString2, paramInt, null, paramBoolean);
    GMTrace.o(1458946703360L, 10870);
  }
  
  public final void a(Activity paramActivity, String paramString1, String paramString2, Bundle paramBundle)
  {
    GMTrace.i(1457872961536L, 10862);
    w(new Object[] { "startActivity3", paramActivity, paramString1, paramString2, paramBundle });
    Class localClass = com.tencent.mm.bj.d.eM(paramString1, paramString2);
    if (localClass != null)
    {
      c(paramActivity, localClass, paramBundle);
      GMTrace.o(1457872961536L, 10862);
      return;
    }
    w.e("MicroMsg.ProcessManager", " Class Not Found! can't startActivity to " + paramString1 + paramString2);
    GMTrace.o(1457872961536L, 10862);
  }
  
  public final void a(a parama)
  {
    GMTrace.i(1458544050176L, 10867);
    this.xCX = parama;
    GMTrace.o(1458544050176L, 10867);
  }
  
  public boolean a(WalletBaseUI paramWalletBaseUI, int paramInt, String paramString)
  {
    GMTrace.i(1460959969280L, 10885);
    GMTrace.o(1460959969280L, 10885);
    return false;
  }
  
  public abstract String aAd();
  
  public final void ae(Activity paramActivity)
  {
    GMTrace.i(1458678267904L, 10868);
    w(new Object[] { "endProcess1", paramActivity });
    if ((!paramActivity.isFinishing()) && ((paramActivity instanceof MMActivity))) {
      ((MMActivity)paramActivity).finish();
    }
    if (this.ler != null) {
      this.ler.clear();
    }
    a.remove(getClass().hashCode());
    GMTrace.o(1458678267904L, 10868);
  }
  
  public final b an(Bundle paramBundle)
  {
    GMTrace.i(1456665001984L, 10853);
    this.ler.putAll(paramBundle);
    GMTrace.o(1456665001984L, 10853);
    return this;
  }
  
  public int b(MMActivity paramMMActivity, int paramInt)
  {
    GMTrace.i(1460825751552L, 10884);
    GMTrace.o(1460825751552L, 10884);
    return -1;
  }
  
  public abstract void b(Activity paramActivity, Bundle paramBundle);
  
  public final void b(Activity paramActivity, Class<?> paramClass, Bundle paramBundle)
  {
    GMTrace.i(19125623586816L, 142497);
    w(new Object[] { "startActivity1", paramActivity, paramClass, null });
    paramClass = new Intent(paramActivity, paramClass);
    paramClass.putExtra("process_id", getClass().hashCode());
    if (paramBundle != null)
    {
      paramClass.putExtras(paramBundle);
      w.d("MicroMsg.ProcessManager", "put bundle: %s", new Object[] { paramClass.getExtras().toString() });
    }
    paramActivity.startActivity(paramClass);
    w.d("MicroMsg.ProcessManager", "bankcard tag :" + clz());
    GMTrace.o(19125623586816L, 142497);
  }
  
  public abstract void c(Activity paramActivity, int paramInt);
  
  public final void c(Activity paramActivity, Class<?> paramClass)
  {
    GMTrace.i(1459483574272L, 10874);
    a(paramActivity, paramClass, -1, null, true);
    GMTrace.o(1459483574272L, 10874);
  }
  
  public final void c(Activity paramActivity, Class<?> paramClass, Bundle paramBundle)
  {
    GMTrace.i(1457738743808L, 10861);
    w(new Object[] { "startActivity1", paramActivity, paramClass, paramBundle });
    paramClass = new Intent(paramActivity, paramClass);
    paramClass.putExtra("process_id", getClass().hashCode());
    paramActivity.startActivity(paramClass);
    if (paramBundle != null) {
      this.ler.putAll(paramBundle);
    }
    w.d("MicroMsg.ProcessManager", "bankcard tag :" + clz());
    GMTrace.o(1457738743808L, 10861);
  }
  
  public abstract boolean c(Activity paramActivity, Bundle paramBundle);
  
  public final boolean clA()
  {
    GMTrace.i(1459886227456L, 10877);
    boolean bool = this.ler.getBoolean("key_is_oversea", false);
    GMTrace.o(1459886227456L, 10877);
    return bool;
  }
  
  public final boolean clB()
  {
    GMTrace.i(1460020445184L, 10878);
    if (this.ler.getInt("key_pay_flag", 0) == 2)
    {
      GMTrace.o(1460020445184L, 10878);
      return true;
    }
    GMTrace.o(1460020445184L, 10878);
    return false;
  }
  
  public final boolean clC()
  {
    GMTrace.i(1460154662912L, 10879);
    if (this.ler.getInt("key_pay_flag", 0) == 1)
    {
      GMTrace.o(1460154662912L, 10879);
      return true;
    }
    GMTrace.o(1460154662912L, 10879);
    return false;
  }
  
  public final boolean clD()
  {
    GMTrace.i(1460288880640L, 10880);
    if (this.ler.getInt("key_pay_flag", 0) == 3)
    {
      GMTrace.o(1460288880640L, 10880);
      return true;
    }
    GMTrace.o(1460288880640L, 10880);
    return false;
  }
  
  public final boolean clE()
  {
    GMTrace.i(1460691533824L, 10883);
    String str = this.ler.getString("key_bank_username");
    w.i("MicroMsg.ProcessManager", "follow bank account : isFollow " + this.ler.getBoolean("key_is_follow_bank_username", false) + ", username : " + str);
    if ((this.ler.getBoolean("key_is_follow_bank_username", false)) && (!bg.nm(str)))
    {
      h.xz();
      h.xx().fYr.a(new i(str), 0);
      GMTrace.o(1460691533824L, 10883);
      return true;
    }
    GMTrace.o(1460691533824L, 10883);
    return false;
  }
  
  public final int clz()
  {
    GMTrace.i(1459752009728L, 10876);
    int i = this.ler.getInt("key_support_bankcard", 1);
    GMTrace.o(1459752009728L, 10876);
    return i;
  }
  
  public final void d(Activity paramActivity, String paramString1, String paramString2)
  {
    GMTrace.i(1459617792000L, 10875);
    a(paramActivity, paramString1, paramString2, -1, true);
    GMTrace.o(1459617792000L, 10875);
  }
  
  public boolean g(Activity paramActivity, Bundle paramBundle)
  {
    GMTrace.i(1460557316096L, 10882);
    GMTrace.o(1460557316096L, 10882);
    return false;
  }
  
  public final void k(Activity paramActivity, Bundle paramBundle)
  {
    GMTrace.i(19125757804544L, 142498);
    w(new Object[] { "endProcess1", paramActivity });
    if ((!paramActivity.isFinishing()) && ((paramActivity instanceof MMActivity))) {
      ((MMActivity)paramActivity).finish();
    }
    if (this.xCX != null) {
      this.xCX.k(0, paramBundle);
    }
    paramBundle.clear();
    a.remove(getClass().hashCode());
    GMTrace.o(19125757804544L, 142498);
  }
  
  public final void w(Object... paramVarArgs)
  {
    GMTrace.i(1457604526080L, 10860);
    StringBuilder localStringBuilder = new StringBuilder();
    localStringBuilder.append(String.format("this %s, procname %s", new Object[] { this, aAd() }));
    if (paramVarArgs.length <= 0) {
      w.w("MicroMsg.ProcessManager", "vals is null, use '' as value");
    }
    for (paramVarArgs = localStringBuilder.toString();; paramVarArgs = localStringBuilder.toString())
    {
      w.i("MicroMsg.ProcessManager", "__CURRENT__ %s", new Object[] { paramVarArgs });
      GMTrace.o(1457604526080L, 10860);
      return;
      int j = paramVarArgs.length - 1;
      int i = 0;
      while (i < j)
      {
        localStringBuilder.append(cb(paramVarArgs[i])).append(',');
        i += 1;
      }
      localStringBuilder.append(cb(paramVarArgs[j]));
    }
  }
  
  public static abstract interface a
  {
    public abstract Intent k(int paramInt, Bundle paramBundle);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\wallet_core\b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */