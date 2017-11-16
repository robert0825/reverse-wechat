package com.tencent.mm.plugin.gwallet;

import android.app.Activity;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Bundle;
import com.jg.JgClassChecked;
import com.jg.JgMethodChecked;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.plugin.gwallet.a.b;
import com.tencent.mm.plugin.gwallet.a.b.2;
import com.tencent.mm.plugin.gwallet.a.b.3;
import com.tencent.mm.plugin.gwallet.a.b.a;
import com.tencent.mm.plugin.gwallet.a.b.b;
import com.tencent.mm.plugin.gwallet.a.c;
import com.tencent.mm.sdk.f.e;
import com.tencent.mm.sdk.platformtools.ae;
import com.tencent.mm.sdk.platformtools.w;
import java.util.ArrayList;

@JgClassChecked(author=31, fComment="checked", lastDate="20140422", reviewer=20, vComment={com.jg.EType.ACTIVITYCHECK, com.jg.EType.RECEIVERCHECK})
public class GWalletUI
  extends Activity
{
  BroadcastReceiver idj;
  private b mgf;
  
  public GWalletUI()
  {
    GMTrace.i(8966281101312L, 66804);
    this.mgf = null;
    this.idj = new BroadcastReceiver()
    {
      public final void onReceive(Context paramAnonymousContext, Intent paramAnonymousIntent)
      {
        GMTrace.i(8968697020416L, 66822);
        if ("com.tencent.mm.gwallet.ACTION_CONSUME_REQUEST".equals(paramAnonymousIntent.getAction()))
        {
          paramAnonymousContext = paramAnonymousIntent.getStringArrayListExtra("tokens");
          final boolean bool = paramAnonymousIntent.getBooleanExtra("IS_FAILED_CONSUME", false);
          if ((paramAnonymousContext == null) || (paramAnonymousContext.size() == 0))
          {
            GWalletUI.a(GWalletUI.this, 0, null);
            GMTrace.o(8968697020416L, 66822);
            return;
          }
          e.post(new b.2(GWalletUI.b(GWalletUI.this), paramAnonymousContext, new b.b()new ae
          {
            public final void b(c paramAnonymous2c, Intent paramAnonymous2Intent)
            {
              GMTrace.i(8971515592704L, 66843);
              w.d("MicroMsg.GWalletUI", "Purchase finished: " + paramAnonymous2c + ", purchase: " + paramAnonymous2Intent);
              paramAnonymous2c = new Intent("com.tencent.mm.gwallet.ACTION_CONSUME_RESPONSE");
              if (bool) {
                paramAnonymous2c.putExtra("RESPONSE_CODE", 62536);
              }
              for (;;)
              {
                GWalletUI.a(GWalletUI.this, -1, paramAnonymous2c);
                GMTrace.o(8971515592704L, 66843);
                return;
                paramAnonymous2c.putExtra("RESPONSE_CODE", 0);
              }
            }
          }, new ae()), "IabHelper_consumeAsync");
        }
        GMTrace.o(8968697020416L, 66822);
      }
    };
    GMTrace.o(8966281101312L, 66804);
  }
  
  public final void fd(final boolean paramBoolean)
  {
    GMTrace.i(8966549536768L, 66806);
    b localb = this.mgf;
    b.b local4 = new b.b()
    {
      @JgMethodChecked(author=20, fComment="checked", lastDate="20140429", reviewer=20, vComment={com.jg.EType.INTENTCHECK})
      public final void b(c paramAnonymousc, Intent paramAnonymousIntent)
      {
        GMTrace.i(8971247157248L, 66841);
        w.d("MicroMsg.GWalletUI", "Query inventory finished. data : " + paramAnonymousIntent);
        if (paramAnonymousIntent == null)
        {
          paramAnonymousIntent = new Intent("com.tencent.mm.gwallet.ACTION_QUERY_RESPONSE");
          paramAnonymousIntent.putExtra("RESPONSE_CODE", paramAnonymousc.mgK);
        }
        for (;;)
        {
          if (!paramBoolean) {
            paramAnonymousIntent.putExtra("is_direct", false);
          }
          GWalletUI.this.sendBroadcast(paramAnonymousIntent);
          GMTrace.o(8971247157248L, 66841);
          return;
          paramAnonymousIntent.setAction("com.tencent.mm.gwallet.ACTION_QUERY_RESPONSE");
        }
      }
    };
    ae localae = new ae();
    localb.Ab("queryInventory");
    e.post(new b.3(localb, "inapp", localae, local4), "IabHelper_queryInventoryAsync");
    GMTrace.o(8966549536768L, 66806);
  }
  
  public void onActivityResult(int paramInt1, int paramInt2, Intent paramIntent)
  {
    GMTrace.i(8967086407680L, 66810);
    b localb = this.mgf;
    Object localObject;
    if (paramInt1 == localb.mgw)
    {
      localb.Ab("handleActivityResult");
      if (paramIntent == null)
      {
        b.Ac("Null data in IAB activity result.");
        paramIntent = new c(64534, "Null data in IAB result");
        if (localb.mgx != null) {
          localb.mgx.b(paramIntent, null);
        }
        GMTrace.o(8967086407680L, 66810);
        return;
      }
      localObject = paramIntent.getExtras().get("RESPONSE_CODE");
      if (localObject != null) {
        break label270;
      }
      b.Ac("Intent with no response code, assuming OK (known issue)");
      paramInt1 = 0;
    }
    for (;;)
    {
      localObject = paramIntent.getStringExtra("INAPP_PURCHASE_DATA");
      String str = paramIntent.getStringExtra("INAPP_DATA_SIGNATURE");
      w.d("MicroMsg.IabHelper", "Purchase data: " + (String)localObject);
      w.d("MicroMsg.IabHelper", "Data signature: " + str);
      w.d("MicroMsg.IabHelper", "Extras: " + paramIntent.getExtras());
      w.d("MicroMsg.IabHelper", "Expected item type: " + localb.mgy);
      localObject = new c(paramInt1, "Null data in IAB result");
      if (localb.mgx != null) {
        localb.mgx.b((c)localObject, paramIntent);
      }
      GMTrace.o(8967086407680L, 66810);
      return;
      label270:
      if ((localObject instanceof Integer))
      {
        paramInt1 = ((Integer)localObject).intValue();
      }
      else
      {
        if (!(localObject instanceof Long)) {
          break;
        }
        paramInt1 = (int)((Long)localObject).longValue();
      }
    }
    b.Ac("Unexpected type for intent response code.");
    b.Ac(localObject.getClass().getName());
    throw new RuntimeException("Unexpected type for intent response code: " + localObject.getClass().getName());
  }
  
  public void onCreate(Bundle paramBundle)
  {
    GMTrace.i(8966415319040L, 66805);
    super.onCreate(paramBundle);
    requestWindowFeature(1);
    w.d("MicroMsg.GWalletUI", "Creating IAB helper.");
    this.mgf = new b(this);
    w.d("MicroMsg.GWalletUI", "Starting setup.");
    this.mgf.a(new b.a()
    {
      public final void a(c paramAnonymousc)
      {
        GMTrace.i(8975944777728L, 66876);
        w.d("MicroMsg.GWalletUI", "Setup finished.");
        if (!paramAnonymousc.isSuccess())
        {
          w.e("MicroMsg.GWalletUI", "Problem setting up in-app billing: " + paramAnonymousc);
          Intent localIntent = new Intent();
          localIntent.putExtra("RESPONSE_CODE", paramAnonymousc.mgK);
          GWalletUI.a(GWalletUI.this, -1, localIntent);
          GMTrace.o(8975944777728L, 66876);
          return;
        }
        if ("com.tencent.mm.gwallet.ACTION_PAY_REQUEST".equals(GWalletUI.this.getIntent().getAction()))
        {
          GWalletUI.a(GWalletUI.this);
          GMTrace.o(8975944777728L, 66876);
          return;
        }
        GWalletUI.this.fd(GWalletUI.this.getIntent().getBooleanExtra("is_direct", true));
        GMTrace.o(8975944777728L, 66876);
      }
    });
    GMTrace.o(8966415319040L, 66805);
  }
  
  protected void onDestroy()
  {
    GMTrace.i(8967220625408L, 66811);
    w.d("MicroMsg.GWalletUI", "Destroying helper.");
    if (this.mgf != null) {
      this.mgf.dispose();
    }
    this.mgf = null;
    super.onDestroy();
    GMTrace.o(8967220625408L, 66811);
  }
  
  protected void onNewIntent(Intent paramIntent)
  {
    GMTrace.i(8966683754496L, 66807);
    if ("com.tencent.mm.gwallet.ACTION_QUERY_REQUEST".equals(paramIntent.getAction())) {
      fd(paramIntent.getBooleanExtra("is_direct", true));
    }
    super.onNewIntent(paramIntent);
    GMTrace.o(8966683754496L, 66807);
  }
  
  public void onStart()
  {
    GMTrace.i(8966817972224L, 66808);
    super.onStart();
    IntentFilter localIntentFilter = new IntentFilter();
    localIntentFilter.addAction("com.tencent.mm.gwallet.ACTION_CONSUME_REQUEST");
    registerReceiver(this.idj, localIntentFilter);
    GMTrace.o(8966817972224L, 66808);
  }
  
  protected void onStop()
  {
    GMTrace.i(8966952189952L, 66809);
    super.onStop();
    unregisterReceiver(this.idj);
    GMTrace.o(8966952189952L, 66809);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\plugin\gwallet\GWalletUI.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */