package com.tencent.pb.common.c;

import android.os.Handler;
import android.os.Looper;

public final class i
{
  public static Handler iw = new Handler(Looper.getMainLooper());
  
  public static void Z(Runnable paramRunnable)
  {
    if (Looper.getMainLooper().getThread() == Thread.currentThread()) {}
    for (int i = 1; i != 0; i = 0)
    {
      paramRunnable.run();
      return;
    }
    iw.post(paramRunnable);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\pb\common\c\i.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */