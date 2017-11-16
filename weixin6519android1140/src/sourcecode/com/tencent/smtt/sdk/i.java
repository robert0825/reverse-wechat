package com.tencent.smtt.sdk;

import android.content.Context;
import android.util.Log;
import com.tencent.smtt.utils.TbsLog;

public final class i
{
  public static volatile int xVa = -1;
  private static i xVb = null;
  a xUX = null;
  boolean xUY = false;
  private final int xUZ = 3;
  
  public static i cnZ()
  {
    if (xVb == null) {
      xVb = new i();
    }
    return xVb;
  }
  
  final void a(Context paramContext, int paramInt, Throwable paramThrowable)
  {
    for (;;)
    {
      try
      {
        if (xVa == -1)
        {
          xVa = paramInt;
          TbsLog.addLog(998, "code=%d,desc=%s", new Object[] { Integer.valueOf(paramInt), String.valueOf(paramThrowable) });
          if (paramThrowable != null)
          {
            r localr = r.gR(paramContext);
            paramContext = "NULL";
            if (paramThrowable != null)
            {
              paramThrowable = "msg: " + paramThrowable.getMessage() + "; err: " + paramThrowable + "; cause: " + Log.getStackTraceString(paramThrowable.getCause());
              paramContext = paramThrowable;
              if (paramThrowable.length() > 1024) {
                paramContext = paramThrowable.substring(0, 1024);
              }
            }
            localr.aT(paramInt, paramContext);
          }
        }
        else
        {
          paramContext = new StringBuilder("setLoadErrorCode :: error(");
          paramContext.append(xVa);
          paramContext.append(") was already reported; ");
          paramContext.append(paramInt);
          paramContext.append(" is duplicated. Try to remove it!");
          TbsLog.w("TbsCoreLoadStat", paramContext.toString());
          continue;
        }
        TbsLog.e("TbsCoreLoadStat", "setLoadErrorCode :: error is null with errorCode: " + paramInt + "; Check & correct it!");
      }
      finally {}
    }
  }
  
  final void ak(Context paramContext, int paramInt)
  {
    a(paramContext, paramInt, null);
    TbsLog.e("loaderror", String.valueOf(paramInt));
  }
  
  public final class a
  {
    int[] xVc;
    int xVd;
    int xVe;
    
    public final String toString()
    {
      if (this.xVe == this.xVd) {}
      for (int i = 1; i != 0; i = 0) {
        return "";
      }
      StringBuilder localStringBuilder = new StringBuilder("[");
      i = this.xVd;
      while (i < this.xVe)
      {
        localStringBuilder.append(String.valueOf(this.xVc[i]) + ",");
        i += 1;
      }
      i = localStringBuilder.length();
      return "]";
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\smtt\sdk\i.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */