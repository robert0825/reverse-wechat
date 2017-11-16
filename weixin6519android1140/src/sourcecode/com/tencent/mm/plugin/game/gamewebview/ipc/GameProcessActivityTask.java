package com.tencent.mm.plugin.game.gamewebview.ipc;

import android.content.Context;
import android.content.Intent;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Process;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.bj.d;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.MMActivity.a;
import java.lang.ref.WeakReference;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;

public abstract class GameProcessActivityTask
  implements Parcelable
{
  private static Map<String, WeakReference<GameProcessActivityTask>> hWD;
  static final Set<Object> lGl;
  private String hXm;
  private int lGp;
  private MMActivity.a lGq;
  Context mContext;
  
  static
  {
    GMTrace.i(16963375988736L, 126387);
    hWD = new ConcurrentHashMap();
    lGl = new HashSet();
    GMTrace.o(16963375988736L, 126387);
  }
  
  public GameProcessActivityTask()
  {
    GMTrace.i(16962033811456L, 126377);
    this.lGp = -1;
    this.lGq = new MMActivity.a()
    {
      public final void a(int paramAnonymousInt1, int paramAnonymousInt2, Intent paramAnonymousIntent)
      {
        GMTrace.i(16953175441408L, 126311);
        if (paramAnonymousInt1 == (GameProcessActivityTask.this.hashCode() & 0xFFFF))
        {
          if (paramAnonymousIntent == null)
          {
            GMTrace.o(16953175441408L, 126311);
            return;
          }
          GameProcessActivityTask localGameProcessActivityTask = (GameProcessActivityTask)paramAnonymousIntent.getParcelableExtra("task_object");
          paramAnonymousIntent = GameProcessActivityTask.zo(paramAnonymousIntent.getStringExtra("task_id"));
          if (paramAnonymousIntent == null)
          {
            w.e("MicroMsg.GameProcessActivityTask", "task is null");
            GMTrace.o(16953175441408L, 126311);
            return;
          }
          GameProcessActivityTask.a(localGameProcessActivityTask, paramAnonymousIntent);
          GameProcessActivityTask.lGl.remove(paramAnonymousIntent);
          paramAnonymousIntent.VK();
          GameProcessActivityTask.this.mContext = null;
        }
        GMTrace.o(16953175441408L, 126311);
      }
    };
    this.hXm = (Process.myPid() + hashCode());
    GMTrace.o(16962033811456L, 126377);
  }
  
  public GameProcessActivityTask(Context paramContext)
  {
    GMTrace.i(16962168029184L, 126378);
    this.lGp = -1;
    this.lGq = new MMActivity.a()
    {
      public final void a(int paramAnonymousInt1, int paramAnonymousInt2, Intent paramAnonymousIntent)
      {
        GMTrace.i(16953175441408L, 126311);
        if (paramAnonymousInt1 == (GameProcessActivityTask.this.hashCode() & 0xFFFF))
        {
          if (paramAnonymousIntent == null)
          {
            GMTrace.o(16953175441408L, 126311);
            return;
          }
          GameProcessActivityTask localGameProcessActivityTask = (GameProcessActivityTask)paramAnonymousIntent.getParcelableExtra("task_object");
          paramAnonymousIntent = GameProcessActivityTask.zo(paramAnonymousIntent.getStringExtra("task_id"));
          if (paramAnonymousIntent == null)
          {
            w.e("MicroMsg.GameProcessActivityTask", "task is null");
            GMTrace.o(16953175441408L, 126311);
            return;
          }
          GameProcessActivityTask.a(localGameProcessActivityTask, paramAnonymousIntent);
          GameProcessActivityTask.lGl.remove(paramAnonymousIntent);
          paramAnonymousIntent.VK();
          GameProcessActivityTask.this.mContext = null;
        }
        GMTrace.o(16953175441408L, 126311);
      }
    };
    this.hXm = (Process.myPid() + hashCode());
    this.mContext = paramContext;
    GMTrace.o(16962168029184L, 126378);
  }
  
  public static void a(GameProcessActivityTask paramGameProcessActivityTask1, GameProcessActivityTask paramGameProcessActivityTask2)
  {
    GMTrace.i(16963107553280L, 126385);
    Parcel localParcel = Parcel.obtain();
    paramGameProcessActivityTask1.writeToParcel(localParcel, 0);
    localParcel.setDataPosition(0);
    paramGameProcessActivityTask2.f(localParcel);
    localParcel.recycle();
    GMTrace.o(16963107553280L, 126385);
  }
  
  public static GameProcessActivityTask zo(String paramString)
  {
    GMTrace.i(16963241771008L, 126386);
    if (!hWD.containsKey(paramString))
    {
      GMTrace.o(16963241771008L, 126386);
      return null;
    }
    if (((WeakReference)hWD.get(paramString)).get() == null)
    {
      GMTrace.o(16963241771008L, 126386);
      return null;
    }
    paramString = (GameProcessActivityTask)((WeakReference)hWD.get(paramString)).get();
    GMTrace.o(16963241771008L, 126386);
    return paramString;
  }
  
  public void VK()
  {
    GMTrace.i(16962436464640L, 126380);
    GMTrace.o(16962436464640L, 126380);
  }
  
  public abstract void a(Context paramContext, a parama);
  
  public final void aAb()
  {
    GMTrace.i(16962973335552L, 126384);
    if (this.mContext == null)
    {
      GMTrace.o(16962973335552L, 126384);
      return;
    }
    hWD.put(this.hXm, new WeakReference(this));
    Intent localIntent = new Intent();
    localIntent.putExtra("task_object", this);
    localIntent.putExtra("task_id", this.hXm);
    localIntent.putExtra("orientation", this.lGp);
    if ((this.mContext instanceof MMActivity))
    {
      lGl.add(this);
      ((MMActivity)this.mContext).vKC = this.lGq;
      d.b(this.mContext, "game", ".gamewebview.ui.GameIpcProxyUI", localIntent, hashCode() & 0xFFFF);
      GMTrace.o(16962973335552L, 126384);
      return;
    }
    localIntent.addFlags(268435456);
    d.b(this.mContext, "game", ".gamewebview.ui.GameIpcProxyUI", localIntent);
    GMTrace.o(16962973335552L, 126384);
  }
  
  public int describeContents()
  {
    GMTrace.i(16962839117824L, 126383);
    GMTrace.o(16962839117824L, 126383);
    return 0;
  }
  
  public void f(Parcel paramParcel)
  {
    GMTrace.i(16962570682368L, 126381);
    GMTrace.o(16962570682368L, 126381);
  }
  
  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    GMTrace.i(16962704900096L, 126382);
    GMTrace.o(16962704900096L, 126382);
  }
  
  public static abstract interface a
  {
    public abstract void WW();
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\plugin\game\gamewebview\ipc\GameProcessActivityTask.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */