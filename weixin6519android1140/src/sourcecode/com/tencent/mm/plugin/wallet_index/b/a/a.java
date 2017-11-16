package com.tencent.mm.plugin.wallet_index.b.a;

import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.plugin.wallet_index.ui.WalletIapUI.c;
import com.tencent.mm.sdk.platformtools.w;
import java.util.ArrayList;
import java.util.Map;
import org.json.JSONException;

public final class a
{
  public a()
  {
    GMTrace.i(7589341429760L, 56545);
    GMTrace.o(7589341429760L, 56545);
  }
  
  private static void Ac(String paramString)
  {
    GMTrace.i(7589744082944L, 56548);
    w.e("MicroMsg.IabResolver", "In-app billing error: " + paramString);
    GMTrace.o(7589744082944L, 56548);
  }
  
  public static int Z(Intent paramIntent)
  {
    GMTrace.i(7589878300672L, 56549);
    if (paramIntent == null)
    {
      Ac("Intent with no response code, assuming OK (known issue)");
      GMTrace.o(7589878300672L, 56549);
      return 1;
    }
    paramIntent = paramIntent.getExtras().get("RESPONSE_CODE");
    if (paramIntent == null)
    {
      Ac("Intent with no response code, assuming OK (known issue)");
      GMTrace.o(7589878300672L, 56549);
      return 0;
    }
    int i;
    if ((paramIntent instanceof Integer))
    {
      i = ((Integer)paramIntent).intValue();
      GMTrace.o(7589878300672L, 56549);
      return i;
    }
    if ((paramIntent instanceof Long))
    {
      i = (int)((Long)paramIntent).longValue();
      GMTrace.o(7589878300672L, 56549);
      return i;
    }
    Ac("Unexpected type for intent response code.");
    Ac(paramIntent.getClass().getName());
    throw new RuntimeException("Unexpected type for intent response code: " + paramIntent.getClass().getName());
  }
  
  public static c a(Intent paramIntent, WalletIapUI.c paramc)
  {
    GMTrace.i(7589475647488L, 56546);
    if (paramIntent == null)
    {
      Ac("Null data in IAB activity result.");
      paramIntent = b.xa(64534);
      if (paramc != null) {
        paramc.a(paramIntent, null);
      }
      GMTrace.o(7589475647488L, 56546);
      return null;
    }
    int i = paramIntent.getIntExtra("RESPONSE_CODE", 0);
    String str1 = paramIntent.getStringExtra("INAPP_PURCHASE_DATA");
    String str2 = paramIntent.getStringExtra("INAPP_DATA_SIGNATURE");
    if (i == 0)
    {
      w.d("MicroMsg.IabResolver", "Successful resultcode from purchase activity.");
      w.d("MicroMsg.IabResolver", "Purchase data: " + str1);
      w.d("MicroMsg.IabResolver", "Data signature: " + str2);
      w.d("MicroMsg.IabResolver", "Extras: " + paramIntent.getExtras());
      if ((str1 == null) || (str2 == null))
      {
        Ac("BUG: either purchaseData or dataSignature is null.");
        paramIntent = b.xa(64528);
        if (paramc != null) {
          paramc.a(paramIntent, null);
        }
        GMTrace.o(7589475647488L, 56546);
        return null;
      }
      try
      {
        paramIntent = new d("inapp", str1, str2);
        str1 = paramIntent.klt;
        w.d("MicroMsg.IabResolver", "Purchase signature successfully verified.");
        if (paramc != null) {
          paramc.a(b.xa(0), paramIntent);
        }
        paramIntent = new c(str1, paramIntent);
        GMTrace.o(7589475647488L, 56546);
        return paramIntent;
      }
      catch (JSONException paramIntent)
      {
        Ac("Failed to parse purchase data.");
        w.printErrStackTrace("MicroMsg.IabResolver", paramIntent, "", new Object[0]);
        paramIntent = b.xa(64534);
        if (paramc != null) {
          paramc.a(paramIntent, null);
        }
        GMTrace.o(7589475647488L, 56546);
        return null;
      }
    }
    Ac("Purchase failed. Response: " + i);
    paramIntent = b.xa(i);
    if (paramc != null) {
      paramc.a(paramIntent, null);
    }
    GMTrace.o(7589475647488L, 56546);
    return null;
  }
  
  public final int a(Intent paramIntent, a parama)
  {
    GMTrace.i(7589609865216L, 56547);
    localc = new c();
    int i = Z(paramIntent);
    w.d("MicroMsg.IabResolver", "Owned items response: " + String.valueOf(i));
    if (i != 0)
    {
      parama.a(b.xa(i), null);
      GMTrace.o(7589609865216L, 56547);
      return i;
    }
    if ((!paramIntent.hasExtra("INAPP_PURCHASE_ITEM_LIST")) || (!paramIntent.hasExtra("INAPP_PURCHASE_DATA_LIST")) || (!paramIntent.hasExtra("INAPP_DATA_SIGNATURE_LIST")))
    {
      Ac("Bundle returned from getPurchases() doesn't contain required fields.");
      parama.a(b.xa(64534), null);
      GMTrace.o(7589609865216L, 56547);
      return 64534;
    }
    ArrayList localArrayList1 = paramIntent.getStringArrayListExtra("INAPP_PURCHASE_ITEM_LIST");
    ArrayList localArrayList2 = paramIntent.getStringArrayListExtra("INAPP_PURCHASE_DATA_LIST");
    paramIntent = paramIntent.getStringArrayListExtra("INAPP_DATA_SIGNATURE_LIST");
    i = 0;
    try
    {
      while (i < localArrayList2.size())
      {
        String str1 = (String)localArrayList2.get(i);
        Object localObject = (String)paramIntent.get(i);
        String str2 = (String)localArrayList1.get(i);
        w.d("MicroMsg.IabResolver", "Sku is owned: " + str2);
        localObject = new d("inapp", str1, (String)localObject);
        if (TextUtils.isEmpty(((d)localObject).mToken))
        {
          w.w("MicroMsg.IabResolver", "In-app billing warning: " + "BUG: empty/null token!");
          w.d("MicroMsg.IabResolver", "Purchase data: " + str1);
        }
        localc.rrU.put(((d)localObject).klt, localObject);
        i += 1;
      }
      parama.a(b.xa(0), localc);
    }
    catch (JSONException paramIntent)
    {
      for (;;)
      {
        w.printErrStackTrace("MicroMsg.IabResolver", paramIntent, "", new Object[0]);
        parama.a(b.xa(64534), localc);
      }
    }
    GMTrace.o(7589609865216L, 56547);
    return 0;
  }
  
  public static abstract interface a
  {
    public abstract void a(b paramb, c paramc);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\plugin\wallet_index\b\a\a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */