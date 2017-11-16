package com.tencent.mm.plugin.talkroom.component;

import android.app.Notification;
import android.app.Service;
import android.content.Intent;
import android.os.Build.VERSION;
import android.os.IBinder;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.sdk.platformtools.w;

public class TalkRoomService
  extends Service
{
  private g qwN;
  
  static
  {
    GMTrace.i(5187380969472L, 38649);
    w.i("MicroMsg.TalkRoomService", Thread.currentThread().getId());
    GMTrace.o(5187380969472L, 38649);
  }
  
  public TalkRoomService()
  {
    GMTrace.i(5186575663104L, 38643);
    GMTrace.o(5186575663104L, 38643);
  }
  
  public IBinder onBind(Intent paramIntent)
  {
    GMTrace.i(5187112534016L, 38647);
    w.d("MicroMsg.TalkRoomService", "onBind~~~ threadID:" + Thread.currentThread());
    paramIntent = this.qwN;
    GMTrace.o(5187112534016L, 38647);
    return paramIntent;
  }
  
  public void onCreate()
  {
    GMTrace.i(5186709880832L, 38644);
    w.d("MicroMsg.TalkRoomService", "onCreate~~~threadID:" + Thread.currentThread());
    super.onCreate();
    if (Build.VERSION.SDK_INT < 18) {
      startForeground(9999, new Notification());
    }
    if (this.qwN == null) {
      this.qwN = new g();
    }
    GMTrace.o(5186709880832L, 38644);
  }
  
  public void onDestroy()
  {
    GMTrace.i(5186844098560L, 38645);
    w.d("MicroMsg.TalkRoomService", "onDestroy~~~ threadID:" + Thread.currentThread());
    super.onDestroy();
    GMTrace.o(5186844098560L, 38645);
  }
  
  public void onRebind(Intent paramIntent)
  {
    GMTrace.i(5187246751744L, 38648);
    w.d("MicroMsg.TalkRoomService", "onRebind~~~ threadID:" + Thread.currentThread());
    super.onRebind(paramIntent);
    GMTrace.o(5187246751744L, 38648);
  }
  
  public boolean onUnbind(Intent paramIntent)
  {
    GMTrace.i(5186978316288L, 38646);
    w.d("MicroMsg.TalkRoomService", "onUnbind~~~ threadID:" + Thread.currentThread());
    boolean bool = super.onUnbind(paramIntent);
    GMTrace.o(5186978316288L, 38646);
    return bool;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\plugin\talkroom\component\TalkRoomService.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */