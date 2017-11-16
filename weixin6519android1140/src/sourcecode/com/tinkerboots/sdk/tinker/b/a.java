package com.tinkerboots.sdk.tinker.b;

import android.content.Context;
import android.os.Looper;
import android.os.MessageQueue;
import android.os.MessageQueue.IdleHandler;
import com.tencent.tinker.lib.d.d;
import com.tencent.tinker.lib.e.c;
import com.tencent.tinker.loader.shareutil.ShareTinkerInternals;
import java.io.File;

public final class a
  extends com.tencent.tinker.lib.c.a
{
  public a(Context paramContext)
  {
    super(paramContext);
  }
  
  public final void a(File paramFile, int paramInt, long paramLong)
  {
    super.a(paramFile, paramInt, paramLong);
    Looper.getMainLooper();
    Looper.myQueue().addIdleHandler(new MessageQueue.IdleHandler()
    {
      public final boolean queueIdle()
      {
        c.hV(a.this.context).cqJ();
        return false;
      }
    });
  }
  
  public final void a(File paramFile, int paramInt, boolean paramBoolean)
  {
    super.a(paramFile, paramInt, paramBoolean);
    if (paramInt == 1)
    {
      paramFile = com.tencent.tinker.lib.d.a.hQ(this.context).ygx;
      if ((paramFile.ygC != null) && ("00000000000000000000000000000000".equals(paramFile.ygC)))
      {
        com.tencent.tinker.lib.e.a.e("Tinker.ServerLoadReporter", "Roll back patch when restarting main process, restart all other process also!", new Object[0]);
        ShareTinkerInternals.ih(this.context);
      }
    }
  }
  
  public final void a(String paramString1, String paramString2, File paramFile, String paramString3)
  {
    super.a(paramString1, paramString2, paramFile, paramString3);
  }
  
  public final void a(Throwable paramThrowable, int paramInt)
  {
    super.a(paramThrowable, paramInt);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tinkerboots\sdk\tinker\b\a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */