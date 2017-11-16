package com.tencent.mm.sdk.d;

import android.os.Message;
import com.tencent.gmtrace.GMTrace;

public class c
  implements a
{
  public c()
  {
    GMTrace.i(17564537192448L, 130866);
    GMTrace.o(17564537192448L, 130866);
  }
  
  public void enter()
  {
    GMTrace.i(17564671410176L, 130867);
    GMTrace.o(17564671410176L, 130867);
  }
  
  public void exit()
  {
    GMTrace.i(17564805627904L, 130868);
    GMTrace.o(17564805627904L, 130868);
  }
  
  public boolean f(Message paramMessage)
  {
    GMTrace.i(17564939845632L, 130869);
    GMTrace.o(17564939845632L, 130869);
    return false;
  }
  
  public String getName()
  {
    GMTrace.i(17565074063360L, 130870);
    String str = getClass().getName();
    str = str.substring(str.lastIndexOf('$') + 1);
    GMTrace.o(17565074063360L, 130870);
    return str;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\sdk\d\c.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */