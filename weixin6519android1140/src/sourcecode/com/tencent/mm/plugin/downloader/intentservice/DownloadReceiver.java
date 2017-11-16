package com.tencent.mm.plugin.downloader.intentservice;

import android.os.Bundle;
import android.os.ResultReceiver;
import android.support.v4.app.y.d;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.plugin.notification.b;
import com.tencent.mm.y.al;

public class DownloadReceiver
  extends ResultReceiver
{
  private static final String TAG;
  private y.d kep;
  
  static
  {
    GMTrace.i(18591839682560L, 138520);
    TAG = DownloadReceiver.class.getSimpleName();
    GMTrace.o(18591839682560L, 138520);
  }
  
  protected void onReceiveResult(int paramInt, Bundle paramBundle)
  {
    GMTrace.i(18591705464832L, 138519);
    super.onReceiveResult(paramInt, paramBundle);
    if (paramInt == 4657)
    {
      paramInt = paramBundle.getInt("progress");
      if (b.nxW == null)
      {
        GMTrace.o(18591705464832L, 138519);
        return;
      }
      if (paramInt < 100)
      {
        this.kep.a(100, paramInt, false).b("Download in progress:" + paramInt);
        b.nxW.notify(4657, this.kep.build());
        GMTrace.o(18591705464832L, 138519);
        return;
      }
      this.kep.a(0, 0, false).b("Download Complete");
      b.nxW.notify(4658, this.kep.build());
    }
    GMTrace.o(18591705464832L, 138519);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes4-dex2jar.jar!\com\tencent\mm\plugin\downloader\intentservice\DownloadReceiver.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */