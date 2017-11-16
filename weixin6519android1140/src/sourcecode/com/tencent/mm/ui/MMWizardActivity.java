package com.tencent.mm.ui;

import android.app.Activity;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;
import java.util.HashMap;
import java.util.Map;
import junit.framework.Assert;

public abstract class MMWizardActivity
  extends MMActivity
{
  public static final Map<String, Intent> vMN;
  
  static
  {
    GMTrace.i(2535372881920L, 18890);
    vMN = new HashMap();
    GMTrace.o(2535372881920L, 18890);
  }
  
  public MMWizardActivity()
  {
    GMTrace.i(2534299140096L, 18882);
    GMTrace.o(2534299140096L, 18882);
  }
  
  public static void A(Context paramContext, Intent paramIntent)
  {
    String str1 = null;
    GMTrace.i(2534567575552L, 18884);
    w.i("MicroMsg.MMWizardActivity", "startWizardActivity()");
    Assert.assertTrue("startWizardActivity: Param context should be a Activity :" + paramContext.toString(), paramContext instanceof Activity);
    Object localObject = ((Activity)paramContext).getIntent();
    if (localObject != null) {
      str1 = ((Intent)localObject).getStringExtra("WizardRootClass");
    }
    for (localObject = ((Intent)localObject).getStringExtra("WizardTransactionId");; localObject = null)
    {
      String str2 = str1;
      if (bg.nm(str1)) {}
      try
      {
        str2 = paramIntent.getComponent().getClassName();
        Assert.assertFalse("startWizardActivity: ERROR in Get Root Class :[" + paramIntent + "][ " + paramIntent.getComponent() + " ]", bg.nm(str2));
        paramIntent.putExtra("WizardRootClass", str2);
        if (localObject != null) {
          paramIntent.putExtra("WizardTransactionId", (String)localObject);
        }
        paramContext.startActivity(paramIntent);
        GMTrace.o(2534567575552L, 18884);
        return;
      }
      catch (Exception localException)
      {
        for (;;)
        {
          w.printErrStackTrace("MicroMsg.MMWizardActivity", localException, "", new Object[0]);
          String str3 = str1;
        }
      }
    }
  }
  
  public static void b(Context paramContext, Intent paramIntent1, Intent paramIntent2)
  {
    GMTrace.i(2534701793280L, 18885);
    try
    {
      String str = "trans." + bg.Pw() + "." + paramIntent2.hashCode();
      vMN.put(str, paramIntent2);
      paramIntent1.putExtra("WizardTransactionId", str);
      paramIntent2 = ((Activity)paramContext).getIntent();
      if (paramIntent2 != null) {
        paramIntent2.putExtra("WizardTransactionId", str);
      }
      A(paramContext, paramIntent1);
      GMTrace.o(2534701793280L, 18885);
      return;
    }
    catch (Exception paramContext)
    {
      w.e("MicroMsg.MMWizardActivity", "%s", new Object[] { bg.f(paramContext) });
      GMTrace.o(2534701793280L, 18885);
    }
  }
  
  public final void Bh(int paramInt)
  {
    GMTrace.i(15687099613184L, 116878);
    w.i("MicroMsg.MMWizardActivity", "finishWizard()");
    Object localObject = getIntent().getExtras().getString("WizardRootClass");
    Assert.assertFalse("finishWizard: ERROR in Get Root Class :[" + (String)localObject + "]", bg.nm((String)localObject));
    localObject = new Intent().setClassName(this, (String)localObject);
    ((Intent)localObject).putExtra("WizardRootClass", getIntent().getStringExtra("WizardRootClass"));
    ((Intent)localObject).putExtra("WizardTransactionId", getIntent().getStringExtra("WizardTransactionId"));
    ((Intent)localObject).putExtra("WizardRootKillSelf", true);
    ((Intent)localObject).putExtra("wizard_activity_result_code", paramInt);
    ((Intent)localObject).addFlags(67108864);
    startActivity((Intent)localObject);
    GMTrace.o(15687099613184L, 116878);
  }
  
  public final void cancel()
  {
    GMTrace.i(2534970228736L, 18887);
    w.i("MicroMsg.MMWizardActivity", "cancel()");
    String str = getIntent().getStringExtra("WizardTransactionId");
    Intent localIntent = (Intent)vMN.get(str);
    vMN.remove(str);
    if (localIntent != null) {
      w.d("MicroMsg.MMWizardActivity", "canceled exit for transaction=" + str + ", intent=" + localIntent);
    }
    GMTrace.o(2534970228736L, 18887);
  }
  
  public final void exit(int paramInt)
  {
    GMTrace.i(2534836011008L, 18886);
    w.i("MicroMsg.MMWizardActivity", "exit()");
    String str = getIntent().getStringExtra("WizardTransactionId");
    Intent localIntent = (Intent)vMN.get(str);
    vMN.remove(str);
    if (localIntent != null)
    {
      w.d("MicroMsg.MMWizardActivity", "doing post exit for transaction=" + str + ", intent=" + localIntent);
      localIntent.putExtra("wizard_activity_result_code", paramInt);
      startActivity(localIntent);
    }
    GMTrace.o(2534836011008L, 18886);
  }
  
  public void finish()
  {
    GMTrace.i(2535238664192L, 18889);
    w.i("MicroMsg.MMWizardActivity", "finish()");
    String str = getIntent().getStringExtra("WizardRootClass");
    if (getComponentName().getClassName().equals(str))
    {
      w.d("MicroMsg.MMWizardActivity", "root wizard activity");
      exit(-1);
    }
    super.finish();
    GMTrace.o(2535238664192L, 18889);
  }
  
  public void onCreate(Bundle paramBundle)
  {
    GMTrace.i(2534433357824L, 18883);
    super.onCreate(paramBundle);
    w.i("MicroMsg.MMWizardActivity", "onCreate()");
    Assert.assertFalse("MMWizardActivity Should Start By startWizardActivity or startWizardNextStep", bg.nm(getIntent().getExtras().getString("WizardRootClass")));
    if (getIntent().getExtras().getBoolean("WizardRootKillSelf", false))
    {
      super.finish();
      w.i("MicroMsg.MMWizardActivity", "finish wizard, root=" + getComponentName().getClassName());
      exit(getIntent().getExtras().getInt("wizard_activity_result_code"));
    }
    GMTrace.o(2534433357824L, 18883);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\ui\MMWizardActivity.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */