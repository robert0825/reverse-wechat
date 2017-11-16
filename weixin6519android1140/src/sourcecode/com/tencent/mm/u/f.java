package com.tencent.mm.u;

import android.util.Log;
import com.tencent.gmtrace.GMTrace;
import org.json.JSONException;

public final class f
  extends JSONException
{
  public f(String paramString)
  {
    super(paramString);
    GMTrace.i(20811129815040L, 155055);
    GMTrace.o(20811129815040L, 155055);
  }
  
  public f(Throwable paramThrowable)
  {
    super(Log.getStackTraceString(paramThrowable));
    GMTrace.i(20811264032768L, 155056);
    GMTrace.o(20811264032768L, 155056);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\u\f.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */