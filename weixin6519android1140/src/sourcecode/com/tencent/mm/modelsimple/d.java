package com.tencent.mm.modelsimple;

import android.accounts.Account;
import android.accounts.AccountManager;
import android.content.ContentResolver;
import android.content.ContentValues;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.provider.ContactsContract.Settings;
import com.jg.JgMethodChecked;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.modelfriend.m;
import com.tencent.mm.modelfriend.m.a;
import com.tencent.mm.pluginsdk.h.a;
import com.tencent.mm.sdk.f.e;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.f;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.storage.t;
import com.tencent.mm.storage.x;
import com.tencent.mm.y.at;
import com.tencent.mm.y.c;
import com.tencent.mm.y.q;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public final class d
{
  public static boolean A(Context paramContext, String paramString)
  {
    GMTrace.i(1363383681024L, 10158);
    boolean bool = bg.nm(paramString);
    w.v("MicroMsg.MMAccountManager", "remove account : " + paramString);
    if (paramContext == null)
    {
      w.e("MicroMsg.MMAccountManager", "null context");
      GMTrace.o(1363383681024L, 10158);
      return false;
    }
    for (;;)
    {
      int i;
      try
      {
        Account[] arrayOfAccount = bq(paramContext);
        if ((arrayOfAccount == null) || (arrayOfAccount.length == 0))
        {
          w.d("MicroMsg.MMAccountManager", "get account info is null or nil");
          GMTrace.o(1363383681024L, 10158);
          return true;
        }
        paramContext = AccountManager.get(paramContext);
        int j = arrayOfAccount.length;
        i = 0;
        if (i < j)
        {
          Account localAccount = arrayOfAccount[i];
          if (bool)
          {
            paramContext.removeAccount(localAccount, null, null);
          }
          else if (localAccount.name.equals(paramString))
          {
            paramContext.removeAccount(localAccount, null, null);
            w.i("MicroMsg.MMAccountManager", "remove account success: " + paramString);
          }
        }
      }
      catch (Exception paramContext)
      {
        w.printErrStackTrace("MicroMsg.MMAccountManager", paramContext, "", new Object[0]);
        w.e("MicroMsg.MMAccountManager", "exception in removeAccount() " + paramContext.getMessage());
        GMTrace.o(1363383681024L, 10158);
        return false;
      }
      GMTrace.o(1363383681024L, 10158);
      return true;
      i += 1;
    }
  }
  
  public static void B(Context paramContext, String paramString)
  {
    GMTrace.i(1363920551936L, 10162);
    if (bn(paramContext))
    {
      e.b(new b(paramContext, bp(paramContext), paramString), "MMAccountManager_deleteSpecifiedContact").start();
      GMTrace.o(1363920551936L, 10162);
      return;
    }
    A(paramContext, null);
    w.d("MicroMsg.MMAccountManager", "no account added or not current account");
    GMTrace.o(1363920551936L, 10162);
  }
  
  private static boolean C(Context paramContext, String paramString)
  {
    GMTrace.i(1364591640576L, 10167);
    paramContext = bq(paramContext);
    if ((paramContext == null) || (paramContext.length == 0))
    {
      GMTrace.o(1364591640576L, 10167);
      return false;
    }
    int j = paramContext.length;
    int i = 0;
    while (i < j)
    {
      if (paramContext[i].name.equals(paramString))
      {
        GMTrace.o(1364591640576L, 10167);
        return true;
      }
      i += 1;
    }
    GMTrace.o(1364591640576L, 10167);
    return false;
  }
  
  private static Account[] D(Context paramContext, String paramString)
  {
    GMTrace.i(1364725858304L, 10168);
    Object localObject = null;
    try
    {
      paramContext = AccountManager.get(paramContext).getAccountsByType(paramString);
      GMTrace.o(1364725858304L, 10168);
      return paramContext;
    }
    catch (Exception paramContext)
    {
      for (;;)
      {
        w.e("MicroMsg.MMAccountManager", "get all accounts failed");
        w.printErrStackTrace("MicroMsg.MMAccountManager", paramContext, "", new Object[0]);
        paramContext = (Context)localObject;
      }
    }
  }
  
  private static String KZ()
  {
    GMTrace.i(1363652116480L, 10160);
    if (!at.AU())
    {
      w.e("MicroMsg.MMAccountManager", "getCurrentAccountName MMCore.acc Not Ready");
      GMTrace.o(1363652116480L, 10160);
      return "";
    }
    at.AR();
    Object localObject = (String)c.xh().get(4, null);
    if (!bg.nm((String)localObject)) {}
    for (;;)
    {
      localObject = lo((String)localObject);
      GMTrace.o(1363652116480L, 10160);
      return (String)localObject;
      String str = q.zF();
      localObject = str;
      if (bg.nm(str))
      {
        str = q.zE();
        if (!bg.nm(str))
        {
          localObject = str;
          if (!x.Ts(str)) {}
        }
        else
        {
          localObject = "";
        }
      }
    }
  }
  
  public static int a(Context paramContext, a parama)
  {
    GMTrace.i(1362981027840L, 10155);
    if (paramContext == null)
    {
      w.e("MicroMsg.MMAccountManager", "context is null");
      GMTrace.o(1362981027840L, 10155);
      return 0;
    }
    Object localObject2 = KZ();
    Object localObject1 = localObject2;
    if (bg.nm((String)localObject2))
    {
      w.e("MicroMsg.MMAccountManager", "account username is null or nil");
      at.AR();
      localObject1 = (String)c.xh().get(6, "");
      if (bg.nm((String)localObject1)) {}
    }
    else
    {
      if (!C(paramContext, (String)localObject1)) {
        break label106;
      }
      GMTrace.o(1362981027840L, 10155);
      return 3;
    }
    GMTrace.o(1362981027840L, 10155);
    return 0;
    label106:
    if (!a.aS(paramContext, "android.permission.READ_CONTACTS"))
    {
      GMTrace.o(1362981027840L, 10155);
      return 2;
    }
    try
    {
      paramContext = AccountManager.get(paramContext);
      localObject2 = new Account((String)localObject1, "com.tencent.mm.account");
      if (paramContext.addAccountExplicitly((Account)localObject2, "", null))
      {
        ContentResolver.setSyncAutomatically((Account)localObject2, "com.android.contacts", true);
        paramContext = new Bundle();
        paramContext.putString("authAccount", (String)localObject1);
        paramContext.putString("accountType", "com.tencent.mm.account");
        if (parama != null) {
          parama.o(paramContext);
        }
        GMTrace.o(1362981027840L, 10155);
        return 1;
      }
    }
    catch (Exception paramContext)
    {
      w.printErrStackTrace("MicroMsg.MMAccountManager", paramContext, "", new Object[0]);
      w.e("MicroMsg.MMAccountManager", "exception in addAccountNoNeedBindMobile() " + paramContext.getMessage());
      if (parama != null) {
        parama.o(null);
      }
      GMTrace.o(1362981027840L, 10155);
    }
    return 2;
  }
  
  public static int a(Context paramContext, String paramString, a parama)
  {
    GMTrace.i(1363115245568L, 10156);
    if (paramContext == null)
    {
      w.e("MicroMsg.MMAccountManager", "activity is null");
      GMTrace.o(1363115245568L, 10156);
      return 0;
    }
    if (bg.nm(paramString))
    {
      w.e("MicroMsg.MMAccountManager", "account username is null or nil");
      GMTrace.o(1363115245568L, 10156);
      return 0;
    }
    Object localObject = KZ();
    if (bg.nm((String)localObject)) {}
    for (;;)
    {
      try
      {
        localObject = AccountManager.get(paramContext);
        Account localAccount = new Account(paramString, "com.tencent.mm.account");
        boolean bool = a.aS(paramContext, "android.permission.READ_CONTACTS");
        if (!bool)
        {
          GMTrace.o(1363115245568L, 10156);
          return 2;
        }
        if (C(paramContext, paramString))
        {
          ContentResolver.setSyncAutomatically(localAccount, "com.android.contacts", true);
          GMTrace.o(1363115245568L, 10156);
          return 3;
        }
        A(paramContext, null);
        if (((AccountManager)localObject).addAccountExplicitly(localAccount, "", null))
        {
          ContentResolver.setSyncAutomatically(localAccount, "com.android.contacts", true);
          localObject = new Bundle();
          ((Bundle)localObject).putString("authAccount", paramString);
          ((Bundle)localObject).putString("accountType", "com.tencent.mm.account");
          if (parama != null) {
            parama.o((Bundle)localObject);
          }
          localObject = new ContentValues();
          ((ContentValues)localObject).put("account_name", paramString);
          ((ContentValues)localObject).put("account_type", "com.tencent.mm.account");
          ((ContentValues)localObject).put("should_sync", Integer.valueOf(1));
          ((ContentValues)localObject).put("ungrouped_visible", Integer.valueOf(1));
          paramContext.getContentResolver().insert(ContactsContract.Settings.CONTENT_URI, (ContentValues)localObject);
          GMTrace.o(1363115245568L, 10156);
          return 1;
        }
      }
      catch (Exception paramContext)
      {
        w.printErrStackTrace("MicroMsg.MMAccountManager", paramContext, "", new Object[0]);
        w.e("MicroMsg.MMAccountManager", "exception in addAccount() " + paramContext.getMessage());
        if (parama != null) {
          parama.o(null);
        }
        GMTrace.o(1363115245568L, 10156);
        return 2;
      }
      paramString = (String)localObject;
    }
  }
  
  public static void bk(Context paramContext)
  {
    GMTrace.i(1363249463296L, 10157);
    com.tencent.mm.bj.d.bNA();
    if (f.erb == 0)
    {
      w.d("MicroMsg.MMAccountManager", "do not auto add account");
      GMTrace.o(1363249463296L, 10157);
      return;
    }
    int i;
    if (f.erb == 1)
    {
      if (m.Ho() == m.a.gDm)
      {
        i = a(paramContext, m.Hq(), null);
        w.d("MicroMsg.MMAccountManager", "auto add account result: " + i);
        GMTrace.o(1363249463296L, 10157);
        return;
      }
      w.i("MicroMsg.MMAccountManager", "the user not bind mobile or not aggreed to upload addressbook");
      GMTrace.o(1363249463296L, 10157);
      return;
    }
    if (f.erb == 2)
    {
      i = a(paramContext, null);
      w.d("MicroMsg.MMAccountManager", "auto add account result: " + i);
    }
    GMTrace.o(1363249463296L, 10157);
  }
  
  @JgMethodChecked(author=20, fComment="checked", lastDate="20140429", reviewer=20, vComment={com.jg.EType.INTENTCHECK})
  public static boolean bl(Context paramContext)
  {
    GMTrace.i(1363517898752L, 10159);
    boolean bool1 = false;
    if (paramContext != null)
    {
      Intent localIntent = new Intent("com.tencent.mm.login.ACTION_LOGOUT");
      localIntent.putExtra("accountName", KZ());
      localIntent.putExtra("accountType", "com.tencent.mm.account");
      boolean bool2 = A(paramContext, KZ());
      bool1 = bool2;
      if (bool2)
      {
        paramContext.sendBroadcast(localIntent);
        bool1 = bool2;
      }
    }
    GMTrace.o(1363517898752L, 10159);
    return bool1;
  }
  
  public static void bm(Context paramContext)
  {
    GMTrace.i(1363786334208L, 10161);
    if (bn(paramContext))
    {
      e.b(new b(paramContext, bp(paramContext)), "MMAccountManager_updateAllContact").start();
      GMTrace.o(1363786334208L, 10161);
      return;
    }
    A(paramContext, null);
    w.d("MicroMsg.MMAccountManager", "no account added or not current account");
    GMTrace.o(1363786334208L, 10161);
  }
  
  public static boolean bn(Context paramContext)
  {
    GMTrace.i(1364054769664L, 10163);
    paramContext = bp(paramContext);
    if (paramContext == null)
    {
      GMTrace.o(1364054769664L, 10163);
      return false;
    }
    if (paramContext.name.equals(KZ()))
    {
      GMTrace.o(1364054769664L, 10163);
      return true;
    }
    GMTrace.o(1364054769664L, 10163);
    return false;
  }
  
  public static boolean bo(Context paramContext)
  {
    GMTrace.i(1364188987392L, 10164);
    if (!bn(paramContext))
    {
      w.e("MicroMsg.MMAccountManager", "no account added or not current account");
      GMTrace.o(1364188987392L, 10164);
      return false;
    }
    if (!a.aS(paramContext, "android.permission.READ_CONTACTS"))
    {
      GMTrace.o(1364188987392L, 10164);
      return false;
    }
    paramContext = bp(paramContext);
    if (paramContext != null)
    {
      Bundle localBundle = new Bundle();
      localBundle.putBoolean("expedited", true);
      localBundle.putBoolean("do_not_retry", true);
      ContentResolver.requestSync(paramContext, "com.android.contacts", localBundle);
      GMTrace.o(1364188987392L, 10164);
      return true;
    }
    w.e("MicroMsg.MMAccountManager", "no account added");
    GMTrace.o(1364188987392L, 10164);
    return false;
  }
  
  public static Account bp(Context paramContext)
  {
    GMTrace.i(1364323205120L, 10165);
    String str2 = KZ();
    String str1 = str2;
    if (bg.nm(str2))
    {
      at.AR();
      str1 = (String)c.xh().get(6, "");
    }
    if (!bg.nm(str1))
    {
      paramContext = bq(paramContext);
      if (paramContext == null)
      {
        GMTrace.o(1364323205120L, 10165);
        return null;
      }
      int j = paramContext.length;
      int i = 0;
      while (i < j)
      {
        str2 = paramContext[i];
        if (str2.name.equals(str1))
        {
          GMTrace.o(1364323205120L, 10165);
          return str2;
        }
        i += 1;
      }
    }
    GMTrace.o(1364323205120L, 10165);
    return null;
  }
  
  private static Account[] bq(Context paramContext)
  {
    GMTrace.i(1364457422848L, 10166);
    try
    {
      paramContext = AccountManager.get(paramContext).getAccountsByType("com.tencent.mm.account");
      GMTrace.o(1364457422848L, 10166);
      return paramContext;
    }
    catch (Exception paramContext)
    {
      w.e("MicroMsg.MMAccountManager", "get all accounts failed");
      w.printErrStackTrace("MicroMsg.MMAccountManager", paramContext, "", new Object[0]);
      GMTrace.o(1364457422848L, 10166);
    }
    return null;
  }
  
  public static String br(Context paramContext)
  {
    GMTrace.i(1364860076032L, 10169);
    Account[] arrayOfAccount = D(paramContext, "com.google");
    Object localObject = null;
    String str = null;
    paramContext = (Context)localObject;
    if (arrayOfAccount != null)
    {
      paramContext = (Context)localObject;
      if (arrayOfAccount.length > 0)
      {
        int j = arrayOfAccount.length;
        int i = 0;
        for (paramContext = str; i < j; paramContext = str)
        {
          str = arrayOfAccount[i].name;
          if (!bg.nm(str))
          {
            paramContext = str;
            if (bg.Sj(str)) {
              break;
            }
          }
          i += 1;
        }
      }
    }
    GMTrace.o(1364860076032L, 10169);
    return paramContext;
  }
  
  private static String lo(String paramString)
  {
    GMTrace.i(1364994293760L, 10170);
    try
    {
      String str = Pattern.compile("[`~!@#$%^&*()+=|{}':;',//[//].<>/?~！@#¥￥%……&*（）——+|{}【】‘；：”“’。，、？]").matcher(paramString).replaceAll("_").trim();
      GMTrace.o(1364994293760L, 10170);
      return str;
    }
    catch (Exception localException)
    {
      w.e("MicroMsg.MMAccountManager", "stringFilter failed, %s, %s", new Object[] { paramString, localException.getMessage() });
      w.printErrStackTrace("MicroMsg.MMAccountManager", localException, "", new Object[0]);
      GMTrace.o(1364994293760L, 10170);
    }
    return paramString;
  }
  
  public static abstract interface a
  {
    public abstract void o(Bundle paramBundle);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\modelsimple\d.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */