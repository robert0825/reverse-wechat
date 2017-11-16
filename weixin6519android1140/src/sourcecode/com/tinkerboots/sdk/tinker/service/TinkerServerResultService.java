package com.tinkerboots.sdk.tinker.service;

import android.os.Process;
import com.tencent.tinker.lib.e.b;
import com.tencent.tinker.lib.service.DefaultTinkerResultService;
import com.tinkerboots.sdk.b.c.a;
import com.tinkerboots.sdk.b.c.b;
import java.io.File;

public class TinkerServerResultService
  extends DefaultTinkerResultService
{
  private static boolean yqM = false;
  private static com.tinkerboots.sdk.tinker.a.a yqN = null;
  
  static void restartProcess()
  {
    com.tencent.tinker.lib.e.a.i("Tinker.TinkerServerResultService", "app is background now, i can kill quietly", new Object[0]);
    Process.killProcess(Process.myPid());
  }
  
  public final void a(com.tencent.tinker.lib.service.a parama)
  {
    if (parama == null) {
      com.tencent.tinker.lib.e.a.e("Tinker.TinkerServerResultService", "received null result!!!!", new Object[0]);
    }
    do
    {
      return;
      com.tencent.tinker.lib.e.a.i("Tinker.TinkerServerResultService", "receive result: %s", new Object[] { parama.toString() });
      b.hR(getApplicationContext());
      if (!parama.eFN) {
        break label131;
      }
      com.tencent.tinker.lib.e.a.i("Tinker.TinkerServerResultService", "patch success, please restart process", new Object[0]);
      T(new File(parama.ygk));
      if (!b(parama)) {
        break;
      }
    } while (!yqM);
    com.tencent.tinker.lib.e.a.i("Tinker.TinkerServerResultService", "tinker wait screen to restart process", new Object[0]);
    new c.b(getApplicationContext(), new c.a()
    {
      public final void Th() {}
    });
    return;
    com.tencent.tinker.lib.e.a.i("Tinker.TinkerServerResultService", "I have already install the newly patch version!", new Object[0]);
    return;
    label131:
    com.tencent.tinker.lib.e.a.i("Tinker.TinkerServerResultService", "patch fail, please check reason", new Object[0]);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tinkerboots\sdk\tinker\service\TinkerServerResultService.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */