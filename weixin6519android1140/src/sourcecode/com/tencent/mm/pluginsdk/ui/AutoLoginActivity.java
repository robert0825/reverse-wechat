package com.tencent.mm.pluginsdk.ui;

import android.content.Context;
import android.content.Intent;
import android.content.pm.Signature;
import android.os.Bundle;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.a.g;
import com.tencent.mm.bj.d;
import com.tencent.mm.g.a.gq;
import com.tencent.mm.kernel.h;
import com.tencent.mm.pluginsdk.model.app.f;
import com.tencent.mm.pluginsdk.model.app.p;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.s;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.ui.MMActivity;
import org.json.JSONObject;

@com.tencent.mm.ui.base.a(3)
public abstract class AutoLoginActivity
  extends MMActivity
{
  public AutoLoginActivity()
  {
    GMTrace.i(1162191306752L, 8659);
    GMTrace.o(1162191306752L, 8659);
  }
  
  public static void a(Context paramContext, f paramf, String paramString, int paramInt)
  {
    GMTrace.i(1162862395392L, 8664);
    Signature[] arrayOfSignature = p.aQ(paramContext, paramString);
    Object localObject = "";
    paramContext = (Context)localObject;
    if (arrayOfSignature != null)
    {
      paramContext = (Context)localObject;
      if (arrayOfSignature.length > 0)
      {
        int j = arrayOfSignature.length;
        int i = 0;
        for (;;)
        {
          paramContext = (Context)localObject;
          if (i >= j) {
            break;
          }
          paramContext = arrayOfSignature[i];
          localObject = (String)localObject + p.OC(g.n(paramContext.toByteArray())) + "|";
          i += 1;
        }
      }
    }
    localObject = paramContext;
    if (paramContext.length() > 1) {
      localObject = paramContext.substring(0, paramContext.length() - 1);
    }
    paramContext = new JSONObject();
    try
    {
      paramContext.put("raw_package_name", bg.aq(paramString, ""));
      paramContext.put("package_name", bg.aq(paramf.field_packageName, ""));
      paramContext.put("raw_signature", localObject);
      paramContext.put("signature", bg.aq(paramf.field_signature, ""));
      paramContext.put("scene", paramInt);
      paramString = new gq();
      paramString.eJK.appId = paramf.field_appId;
      paramString.eJK.opType = 3;
      paramString.eJK.eDk = paramContext.toString();
      com.tencent.mm.sdk.b.a.vgX.m(paramString);
      GMTrace.o(1162862395392L, 8664);
      return;
    }
    catch (Exception paramString)
    {
      for (;;)
      {
        w.i("MicroMsg.AutoLoginActivity", "doIfAppInValid, jsonException = " + paramString.getMessage());
      }
    }
  }
  
  private void yZ(int paramInt)
  {
    GMTrace.i(1162593959936L, 8662);
    switch (paramInt)
    {
    default: 
      w.e("MicroMsg.AutoLoginActivity", "onNewIntent, should not reach here, resultCode = " + paramInt);
      a(a.tsH, getIntent());
      GMTrace.o(1162593959936L, 8662);
      return;
    case -1: 
      a(a.tsG, getIntent());
      GMTrace.o(1162593959936L, 8662);
      return;
    case 0: 
      aUi();
      GMTrace.o(1162593959936L, 8662);
      return;
    }
    a(a.tsI, getIntent());
    GMTrace.o(1162593959936L, 8662);
  }
  
  public abstract void a(a parama, Intent paramIntent);
  
  public boolean aUi()
  {
    GMTrace.i(1162728177664L, 8663);
    h.xw();
    if ((!com.tencent.mm.kernel.a.wK()) || (com.tencent.mm.kernel.a.wF()))
    {
      w.w("MicroMsg.AutoLoginActivity", "not login");
      Intent localIntent1 = new Intent(this, getClass());
      localIntent1.putExtras(getIntent());
      localIntent1.addFlags(67108864);
      localIntent1.setDataAndType(getIntent().getData(), getIntent().getType());
      localIntent1.setAction(getIntent().getAction());
      Intent localIntent2 = new Intent();
      localIntent2.putExtras(getIntent());
      d.a(this, "accountsync", "com.tencent.mm.ui.account.SimpleLoginUI", localIntent2, localIntent1);
      GMTrace.o(1162728177664L, 8663);
      return true;
    }
    GMTrace.o(1162728177664L, 8663);
    return false;
  }
  
  public int getLayoutId()
  {
    GMTrace.i(1162996613120L, 8665);
    GMTrace.o(1162996613120L, 8665);
    return -1;
  }
  
  public void onCreate(Bundle paramBundle)
  {
    GMTrace.i(1162325524480L, 8660);
    super.onCreate(paramBundle);
    AU(8);
    paramBundle = getIntent();
    if (paramBundle == null)
    {
      w.e("MicroMsg.AutoLoginActivity", "onCreate intent is null");
      finish();
      GMTrace.o(1162325524480L, 8660);
      return;
    }
    d.bNA();
    w.i("MicroMsg.AutoLoginActivity", "onCreate, intent action = " + paramBundle.getAction());
    int i = s.a(paramBundle, "wizard_activity_result_code", -2);
    w.i("MicroMsg.AutoLoginActivity", "onCreate, resultCode = " + i);
    if (i != -2)
    {
      yZ(i);
      GMTrace.o(1162325524480L, 8660);
      return;
    }
    if (!y(paramBundle))
    {
      w.e("MicroMsg.AutoLoginActivity", "preLogin fail, no need to process");
      finish();
      GMTrace.o(1162325524480L, 8660);
      return;
    }
    if (aUi())
    {
      finish();
      w.w("MicroMsg.AutoLoginActivity", "not login, go to SimpleLogin");
      GMTrace.o(1162325524480L, 8660);
      return;
    }
    a(a.tsG, paramBundle);
    GMTrace.o(1162325524480L, 8660);
  }
  
  public void onDestroy()
  {
    GMTrace.i(17761971470336L, 132337);
    super.onDestroy();
    GMTrace.o(17761971470336L, 132337);
  }
  
  protected void onNewIntent(Intent paramIntent)
  {
    GMTrace.i(1162459742208L, 8661);
    if (paramIntent == null)
    {
      GMTrace.o(1162459742208L, 8661);
      return;
    }
    super.onNewIntent(paramIntent);
    setIntent(paramIntent);
    int i = s.a(paramIntent, "wizard_activity_result_code", 0);
    w.i("MicroMsg.AutoLoginActivity", "onNewIntent, resultCode = " + i);
    yZ(i);
    GMTrace.o(1162459742208L, 8661);
  }
  
  public abstract boolean y(Intent paramIntent);
  
  public static enum a
  {
    static
    {
      GMTrace.i(1225139421184L, 9128);
      tsG = new a("LOGIN_OK", 0);
      tsH = new a("LOGIN_FAIL", 1);
      tsI = new a("LOGIN_CANCEL", 2);
      tsJ = new a[] { tsG, tsH, tsI };
      GMTrace.o(1225139421184L, 9128);
    }
    
    private a()
    {
      GMTrace.i(1225005203456L, 9127);
      GMTrace.o(1225005203456L, 9127);
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\pluginsdk\ui\AutoLoginActivity.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */