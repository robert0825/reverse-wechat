package com.tencent.mm.plugin.appbrand.widget.input;

import android.os.Build.VERSION;
import com.tencent.gmtrace.GMTrace;

 enum d
{
  static
  {
    GMTrace.i(10050894561280L, 74885);
    iLj = new d[0];
    GMTrace.o(10050894561280L, 74885);
  }
  
  public static boolean acp()
  {
    GMTrace.i(10050760343552L, 74884);
    if (Build.VERSION.SDK_INT >= 19)
    {
      GMTrace.o(10050760343552L, 74884);
      return true;
    }
    GMTrace.o(10050760343552L, 74884);
    return false;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\plugin\appbrand\widget\input\d.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */