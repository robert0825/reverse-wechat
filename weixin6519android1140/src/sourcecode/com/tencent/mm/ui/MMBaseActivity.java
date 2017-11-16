package com.tencent.mm.ui;

import android.app.Activity;
import android.content.res.Resources;
import android.view.LayoutInflater;
import android.view.Window;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.sdk.platformtools.ab;

@com.tencent.mm.ui.base.a(3)
public class MMBaseActivity
  extends Activity
{
  public MMBaseActivity()
  {
    GMTrace.i(2067489882112L, 15404);
    GMTrace.o(2067489882112L, 15404);
  }
  
  public Resources getResources()
  {
    GMTrace.i(2067624099840L, 15405);
    if ((getAssets() != null) && (ab.getResources() != null))
    {
      localResources = ab.getResources();
      GMTrace.o(2067624099840L, 15405);
      return localResources;
    }
    Resources localResources = super.getResources();
    GMTrace.o(2067624099840L, 15405);
    return localResources;
  }
  
  public Object getSystemService(String paramString)
  {
    GMTrace.i(2067758317568L, 15406);
    Object localObject = super.getSystemService(paramString);
    if ((getAssets() != null) && ("layout_inflater".equals(paramString)))
    {
      paramString = v.b((LayoutInflater)localObject);
      GMTrace.o(2067758317568L, 15406);
      return paramString;
    }
    GMTrace.o(2067758317568L, 15406);
    return localObject;
  }
  
  public void onDestroy()
  {
    GMTrace.i(2067892535296L, 15407);
    super.onDestroy();
    com.tencent.mm.sdk.platformtools.a.cX(getWindow().getDecorView());
    com.tencent.mm.sdk.platformtools.a.ek(this);
    GMTrace.o(2067892535296L, 15407);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\ui\MMBaseActivity.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */