package com.tencent.tinker.lib.service;

import android.app.IntentService;
import android.content.Context;
import android.content.Intent;
import com.tencent.tinker.loader.TinkerRuntimeException;
import com.tencent.tinker.loader.shareutil.ShareIntentUtil;

public abstract class AbstractResultService
  extends IntentService
{
  public AbstractResultService()
  {
    super(AbstractResultService.class.getSimpleName());
  }
  
  public static void a(Context paramContext, a parama, String paramString)
  {
    if (paramString == null) {
      throw new TinkerRuntimeException("resultServiceClass is null.");
    }
    try
    {
      Intent localIntent = new Intent();
      localIntent.setClassName(paramContext, paramString);
      localIntent.putExtra("result_extra", parama);
      paramContext.startService(localIntent);
      return;
    }
    catch (Throwable paramContext)
    {
      com.tencent.tinker.lib.e.a.e("Tinker.AbstractResultService", "run result service fail, exception:" + paramContext, new Object[0]);
    }
  }
  
  public abstract void a(a parama);
  
  protected void onHandleIntent(Intent paramIntent)
  {
    if (paramIntent == null)
    {
      com.tencent.tinker.lib.e.a.e("Tinker.AbstractResultService", "AbstractResultService received a null intent, ignoring.", new Object[0]);
      return;
    }
    a((a)ShareIntentUtil.n(paramIntent, "result_extra"));
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\tinker\lib\service\AbstractResultService.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */