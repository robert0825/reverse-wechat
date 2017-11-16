package com.tencent.mm.plugin.gwallet.a;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.os.IBinder;
import android.os.RemoteException;
import android.text.TextUtils;
import com.a.a.a.a.a;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.sdk.platformtools.ae;
import com.tencent.mm.sdk.platformtools.w;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.json.JSONException;

public final class b
{
  public Context mContext;
  public com.a.a.a.a mgs;
  private ServiceConnection mgt;
  public boolean mgu;
  public boolean mgv;
  public int mgw;
  public b mgx;
  public String mgy;
  
  public b(Context paramContext)
  {
    GMTrace.i(8972455116800L, 66850);
    this.mgu = false;
    this.mgv = false;
    this.mContext = paramContext;
    GMTrace.o(8972455116800L, 66850);
  }
  
  public static void Ac(String paramString)
  {
    GMTrace.i(8973394640896L, 66857);
    w.e("MicroMsg.IabHelper", "In-app billing error: " + paramString);
    GMTrace.o(8973394640896L, 66857);
  }
  
  public static int D(Bundle paramBundle)
  {
    GMTrace.i(8973260423168L, 66856);
    paramBundle = paramBundle.get("RESPONSE_CODE");
    if (paramBundle == null)
    {
      w.d("MicroMsg.IabHelper", "Bundle with null response code, assuming OK (known issue)");
      GMTrace.o(8973260423168L, 66856);
      return 0;
    }
    int i;
    if ((paramBundle instanceof Integer))
    {
      i = ((Integer)paramBundle).intValue();
      GMTrace.o(8973260423168L, 66856);
      return i;
    }
    if ((paramBundle instanceof Long))
    {
      i = (int)((Long)paramBundle).longValue();
      GMTrace.o(8973260423168L, 66856);
      return i;
    }
    Ac("Unexpected type for bundle response code.");
    Ac(paramBundle.getClass().getName());
    throw new RuntimeException("Unexpected type for bundle response code: " + paramBundle.getClass().getName());
  }
  
  public static String oZ(int paramInt)
  {
    GMTrace.i(8973126205440L, 66855);
    Object localObject = "0:OK/1:User Canceled/2:Unknown/3:Billing Unavailable/4:Item unavailable/5:Developer Error/6:Error/7:Item Already Owned/8:Item not owned".split("/");
    String[] arrayOfString = "0:OK/-1001:Remote exception during initialization/-1002:Bad response received/-1003:Purchase signature verification failed/-1004:Send intent failed/-1005:User cancelled/-1006:Unknown purchase response/-1007:Missing token/-1008:Unknown error/-1009:Subscriptions not available/-1010:Invalid consumption attempt".split("/");
    if (paramInt <= 64536)
    {
      int i = 64536 - paramInt;
      if ((i >= 0) && (i < arrayOfString.length))
      {
        localObject = arrayOfString[i];
        GMTrace.o(8973126205440L, 66855);
        return (String)localObject;
      }
      localObject = String.valueOf(paramInt) + ":Unknown IAB Helper Error";
      GMTrace.o(8973126205440L, 66855);
      return (String)localObject;
    }
    if ((paramInt < 0) || (paramInt >= localObject.length))
    {
      localObject = String.valueOf(paramInt) + ":Unknown";
      GMTrace.o(8973126205440L, 66855);
      return (String)localObject;
    }
    localObject = localObject[paramInt];
    GMTrace.o(8973126205440L, 66855);
    return (String)localObject;
  }
  
  public final void Ab(String paramString)
  {
    GMTrace.i(8972857769984L, 66853);
    if (!this.mgu)
    {
      w.e("MicroMsg.IabHelper", "Illegal state for operation (" + paramString + "): IAB helper is not set up.");
      throw new IllegalStateException("IAB helper is not set up. Can't perform operation: " + paramString);
    }
    GMTrace.o(8972857769984L, 66853);
  }
  
  public final void a(final a parama)
  {
    GMTrace.i(8972589334528L, 66851);
    if (this.mgu) {
      throw new IllegalStateException("IAB helper is already set up.");
    }
    w.d("MicroMsg.IabHelper", "Starting in-app billing setup.");
    this.mgt = new ServiceConnection()
    {
      public final void onServiceConnected(ComponentName paramAnonymousComponentName, IBinder paramAnonymousIBinder)
      {
        GMTrace.i(8974871035904L, 66868);
        w.d("MicroMsg.IabHelper", "Billing service connected.");
        b.this.mgs = a.a.c(paramAnonymousIBinder);
        paramAnonymousComponentName = b.this.mContext.getPackageName();
        try
        {
          w.d("MicroMsg.IabHelper", "Checking for in-app billing 3 support.");
          int i = b.this.mgs.b(3, paramAnonymousComponentName, "inapp");
          if (i != 0)
          {
            if (parama != null) {
              parama.a(new c(i, "Error checking for billing v3 support."));
            }
            b.this.mgv = false;
            GMTrace.o(8974871035904L, 66868);
            return;
          }
          w.d("MicroMsg.IabHelper", "In-app billing version 3 supported for " + paramAnonymousComponentName);
          i = b.this.mgs.b(3, paramAnonymousComponentName, "subs");
          if (i == 0)
          {
            w.d("MicroMsg.IabHelper", "Subscriptions AVAILABLE.");
            b.this.mgv = true;
          }
          for (;;)
          {
            b.this.mgu = true;
            if (parama != null) {
              parama.a(new c(0, "Setup successful."));
            }
            GMTrace.o(8974871035904L, 66868);
            return;
            w.d("MicroMsg.IabHelper", "Subscriptions NOT AVAILABLE. Response: " + i);
          }
          return;
        }
        catch (RemoteException paramAnonymousComponentName)
        {
          if (parama != null) {
            parama.a(new c(64535, "RemoteException while setting up in-app billing."));
          }
          w.printErrStackTrace("MicroMsg.IabHelper", paramAnonymousComponentName, "", new Object[0]);
          GMTrace.o(8974871035904L, 66868);
        }
      }
      
      public final void onServiceDisconnected(ComponentName paramAnonymousComponentName)
      {
        GMTrace.i(8974736818176L, 66867);
        w.d("MicroMsg.IabHelper", "Billing service disconnected.");
        b.this.mgs = null;
        GMTrace.o(8974736818176L, 66867);
      }
    };
    Intent localIntent = new Intent("com.android.vending.billing.InAppBillingService.BIND");
    localIntent.setPackage("com.android.vending");
    if ((this.mContext != null) && (this.mContext.getPackageManager() != null) && (this.mContext.getPackageManager().queryIntentServices(localIntent, 0) != null) && (!this.mContext.getPackageManager().queryIntentServices(localIntent, 0).isEmpty()))
    {
      this.mContext.bindService(localIntent, this.mgt, 1);
      GMTrace.o(8972589334528L, 66851);
      return;
    }
    parama.a(new c(63535, "Google play not installed!"));
    GMTrace.o(8972589334528L, 66851);
  }
  
  public final boolean a(ArrayList<String> paramArrayList, c paramc)
  {
    GMTrace.i(8972991987712L, 66854);
    Ab("query details");
    Intent localIntent = new Intent();
    if ((paramArrayList == null) || (paramArrayList.size() == 0))
    {
      w.e("MicroMsg.IabHelper", "query list is empty!");
      paramArrayList = new c(5, "no query list or is empty");
      localIntent.putExtra("RESPONSE_CODE", 5);
      localIntent.putExtra("QUERY_DETAIL_INFO", new ArrayList());
      paramc.a(paramArrayList, localIntent);
      GMTrace.o(8972991987712L, 66854);
      return true;
    }
    try
    {
      w.d("MicroMsg.IabHelper", "query detail list with the size is " + paramArrayList.size());
      Object localObject = new Bundle();
      ((Bundle)localObject).putStringArrayList("ITEM_ID_LIST", paramArrayList);
      paramArrayList = this.mgs.a(3, this.mContext.getPackageName(), "inapp", (Bundle)localObject);
      int i = D(paramArrayList);
      w.d("MicroMsg.IabHelper", "detail response: " + String.valueOf(i));
      if (i != 0)
      {
        w.d("MicroMsg.IabHelper", "cannot query details");
        paramArrayList = new c(i, "cannot query details");
        localIntent.putExtra("RESPONSE_CODE", i);
        paramc.a(paramArrayList, localIntent);
        GMTrace.o(8972991987712L, 66854);
        return true;
      }
      localObject = new c(i, "query list ok!");
      w.d("MicroMsg.IabHelper", "result code : " + i);
      localIntent.putExtra("RESPONSE_CODE", i);
      localIntent.putExtra("RESPONSE_QUERY_DETAIL_INFO", paramArrayList.getStringArrayList("DETAILS_LIST"));
      paramc.a((c)localObject, localIntent);
      paramArrayList = paramArrayList.getStringArrayList("DETAILS_LIST").iterator();
      while (paramArrayList.hasNext()) {
        w.d("MicroMsg.IabHelper", (String)paramArrayList.next());
      }
      GMTrace.o(8972991987712L, 66854);
    }
    catch (RemoteException paramArrayList)
    {
      Ac("RemoteException while launching query details ");
      w.printErrStackTrace("MicroMsg.IabHelper", paramArrayList, "", new Object[0]);
      paramArrayList = new c(64535, "Remote exception while starting purchase flow");
      localIntent.putExtra("RESPONSE_CODE", 6);
      localIntent.putExtra("QUERY_DETAIL_INFO", new ArrayList());
      paramc.a(paramArrayList, localIntent);
      GMTrace.o(8972991987712L, 66854);
      return false;
    }
    return true;
  }
  
  public final void dispose()
  {
    GMTrace.i(8972723552256L, 66852);
    w.d("MicroMsg.IabHelper", "Disposing.");
    this.mgu = false;
    if (this.mgt != null) {
      w.d("MicroMsg.IabHelper", "Unbinding from service.");
    }
    try
    {
      if (this.mContext != null) {
        this.mContext.unbindService(this.mgt);
      }
      this.mgt = null;
      this.mgs = null;
      GMTrace.o(8972723552256L, 66852);
      return;
    }
    catch (IllegalArgumentException localIllegalArgumentException)
    {
      for (;;)
      {
        w.e("MicroMsg.IabHelper", localIllegalArgumentException.toString());
      }
    }
  }
  
  public final int e(Intent paramIntent, String paramString)
  {
    GMTrace.i(16048011083776L, 119567);
    w.d("MicroMsg.IabHelper", "Querying owned items, item type: " + paramString);
    w.d("MicroMsg.IabHelper", "Package name: " + this.mContext.getPackageName());
    Object localObject = null;
    ArrayList localArrayList1 = new ArrayList();
    ArrayList localArrayList2 = new ArrayList();
    ArrayList localArrayList3 = new ArrayList();
    String str;
    do
    {
      w.d("MicroMsg.IabHelper", "Calling getPurchases with continuation token: " + (String)localObject);
      localObject = this.mgs.a(3, this.mContext.getPackageName(), paramString, (String)localObject);
      int i = D((Bundle)localObject);
      w.d("MicroMsg.IabHelper", "Owned items response: " + String.valueOf(i));
      if (i != 0)
      {
        w.d("MicroMsg.IabHelper", "getPurchases() failed: " + i);
        GMTrace.o(16048011083776L, 119567);
        return i;
      }
      if ((!((Bundle)localObject).containsKey("INAPP_PURCHASE_ITEM_LIST")) || (!((Bundle)localObject).containsKey("INAPP_PURCHASE_DATA_LIST")) || (!((Bundle)localObject).containsKey("INAPP_DATA_SIGNATURE_LIST")))
      {
        Ac("Bundle returned from getPurchases() doesn't contain required fields.");
        GMTrace.o(16048011083776L, 119567);
        return 64534;
      }
      localArrayList1.addAll(((Bundle)localObject).getStringArrayList("INAPP_PURCHASE_ITEM_LIST"));
      localArrayList2.addAll(((Bundle)localObject).getStringArrayList("INAPP_PURCHASE_DATA_LIST"));
      localArrayList3.addAll(((Bundle)localObject).getStringArrayList("INAPP_DATA_SIGNATURE_LIST"));
      str = ((Bundle)localObject).getString("INAPP_CONTINUATION_TOKEN");
      w.d("MicroMsg.IabHelper", "Continuation token: " + str);
      localObject = str;
    } while (!TextUtils.isEmpty(str));
    paramIntent.putStringArrayListExtra("INAPP_PURCHASE_ITEM_LIST", localArrayList1);
    paramIntent.putStringArrayListExtra("INAPP_PURCHASE_DATA_LIST", localArrayList2);
    paramIntent.putStringArrayListExtra("INAPP_DATA_SIGNATURE_LIST", localArrayList3);
    GMTrace.o(16048011083776L, 119567);
    return 0;
  }
  
  public static abstract interface a
  {
    public abstract void a(c paramc);
  }
  
  public static abstract interface b
  {
    public abstract void b(c paramc, Intent paramIntent);
  }
  
  public static abstract interface c
  {
    public abstract void a(c paramc, Intent paramIntent);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\plugin\gwallet\a\b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */