package com.tencent.mm.plugin.game.gamewebview.ipc;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.plugin.game.gamewebview.b.a.c;
import com.tencent.mm.plugin.game.gamewebview.b.a.e;
import com.tencent.mm.plugin.game.gamewebview.ui.h;
import com.tencent.mm.plugin.game.gamewebview.ui.h.3;
import com.tencent.mm.plugin.webview.modeltools.g;
import com.tencent.mm.sdk.platformtools.ae;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;
import java.util.HashMap;
import java.util.Map;

public class GameMMToClientEvent
  extends GWMainProcessTask
{
  public static Parcelable.Creator<GameMMToClientEvent> CREATOR;
  private static GameMMToClientEvent lGo;
  private int hXb;
  private String hXc;
  public Object hXd;
  int lGn;
  public Bundle ler;
  
  static
  {
    GMTrace.i(16955591360512L, 126329);
    CREATOR = new Parcelable.Creator() {};
    GMTrace.o(16955591360512L, 126329);
  }
  
  public GameMMToClientEvent()
  {
    GMTrace.i(16954249183232L, 126319);
    GMTrace.o(16954249183232L, 126319);
  }
  
  public GameMMToClientEvent(Parcel paramParcel)
  {
    GMTrace.i(16955457142784L, 126328);
    f(paramParcel);
    GMTrace.o(16955457142784L, 126328);
  }
  
  private static GameMMToClientEvent aDK()
  {
    GMTrace.i(16954383400960L, 126320);
    if (lGo == null) {}
    try
    {
      if (lGo == null) {
        lGo = new GameMMToClientEvent();
      }
      GameMMToClientEvent localGameMMToClientEvent = lGo;
      GMTrace.o(16954383400960L, 126320);
      return localGameMMToClientEvent;
    }
    finally {}
  }
  
  public static void ox(int paramInt)
  {
    GMTrace.i(16954517618688L, 126321);
    aDK().hXb = 1;
    aDK().lGn = paramInt;
    GameWebViewMainProcessService.a(aDK());
    GMTrace.o(16954517618688L, 126321);
  }
  
  public static void oy(int paramInt)
  {
    GMTrace.i(16954651836416L, 126322);
    aDK().hXb = 2;
    aDK().lGn = paramInt;
    GameWebViewMainProcessService.a(aDK());
    GMTrace.o(16954651836416L, 126322);
  }
  
  public final void RY()
  {
    GMTrace.i(16954786054144L, 126323);
    switch (this.hXb)
    {
    }
    for (;;)
    {
      GMTrace.o(16954786054144L, 126323);
      return;
      a.a(this.lGn, this);
      GMTrace.o(16954786054144L, 126323);
      return;
      a.oz(this.lGn);
    }
  }
  
  public final void VK()
  {
    GMTrace.i(16954920271872L, 126324);
    int i = this.ler.getInt("mm_to_client_notify_type");
    w.i("MicroMsg.GameMMToClientEvent", "notifyType = " + i);
    switch (i)
    {
    }
    for (;;)
    {
      GMTrace.o(16954920271872L, 126324);
      return;
      Object localObject1 = this.ler.getString("js_event_name");
      if (!bg.nm((String)localObject1))
      {
        if ((com.tencent.mm.plugin.game.gamewebview.b.b.lIj == null) || (com.tencent.mm.plugin.game.gamewebview.b.b.lIj.size() == 0))
        {
          com.tencent.mm.plugin.game.gamewebview.b.b.lIj = new HashMap();
          com.tencent.mm.plugin.game.gamewebview.b.b.a(new c());
          com.tencent.mm.plugin.game.gamewebview.b.b.a(new com.tencent.mm.plugin.game.gamewebview.b.a.b());
          com.tencent.mm.plugin.game.gamewebview.b.b.a(new e());
          com.tencent.mm.plugin.game.gamewebview.b.b.a(new com.tencent.mm.plugin.game.gamewebview.b.a.d());
          com.tencent.mm.plugin.game.gamewebview.b.b.a(new com.tencent.mm.plugin.game.gamewebview.b.a.a());
        }
        localObject1 = (com.tencent.mm.plugin.game.gamewebview.b.a)com.tencent.mm.plugin.game.gamewebview.b.b.lIj.get(localObject1);
        if (localObject1 != null) {
          ((com.tencent.mm.plugin.game.gamewebview.b.a)localObject1).j(this.lGn, this.ler);
        }
      }
      GMTrace.o(16954920271872L, 126324);
      return;
      Object localObject2 = com.tencent.mm.plugin.game.gamewebview.model.a.oA(this.lGn);
      if (localObject2 != null)
      {
        localObject1 = this.ler.getString("file_path");
        String str = this.ler.getString("result");
        i = this.ler.getInt("code_type");
        int j = this.ler.getInt("code_version");
        if (((com.tencent.mm.plugin.game.gamewebview.ui.d)localObject2).lJQ != null)
        {
          localObject2 = ((com.tencent.mm.plugin.game.gamewebview.ui.d)localObject2).lJQ;
          w.d("MicroMsg.GameWebViewMenuListHelper", "result: " + str);
          if ((((h)localObject2).ioo == null) || (localObject1 == null) || (!((String)localObject1).equals(((h)localObject2).ioo.rHl)))
          {
            GMTrace.o(16954920271872L, 126324);
            return;
          }
          if (((h)localObject2).ioo != null) {
            ((h)localObject2).ioo.bDa();
          }
          ((h)localObject2).iom = i;
          ((h)localObject2).ion = j;
          if ((str == null) || (((h)localObject2).iok == null))
          {
            GMTrace.o(16954920271872L, 126324);
            return;
          }
          new ae().post(new h.3((h)localObject2, str));
        }
      }
    }
  }
  
  public int describeContents()
  {
    GMTrace.i(16955322925056L, 126327);
    GMTrace.o(16955322925056L, 126327);
    return 0;
  }
  
  public final void f(Parcel paramParcel)
  {
    GMTrace.i(16955054489600L, 126325);
    this.hXb = paramParcel.readInt();
    this.lGn = paramParcel.readInt();
    this.ler = paramParcel.readBundle(getClass().getClassLoader());
    try
    {
      this.hXc = paramParcel.readString();
      if (!bg.nm(this.hXc))
      {
        Class localClass = Class.forName(this.hXc);
        if (localClass != null) {
          this.hXd = paramParcel.readParcelable(localClass.getClassLoader());
        }
      }
      GMTrace.o(16955054489600L, 126325);
      return;
    }
    catch (Exception paramParcel)
    {
      w.e("MicroMsg.GameMMToClientEvent", "can't parcel data ex: " + paramParcel.getMessage());
      GMTrace.o(16955054489600L, 126325);
    }
  }
  
  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    GMTrace.i(16955188707328L, 126326);
    paramParcel.writeInt(this.hXb);
    paramParcel.writeInt(this.lGn);
    paramParcel.writeBundle(this.ler);
    if ((!bg.nm(this.hXc)) && (this.hXd != null))
    {
      paramParcel.writeString(this.hXc);
      paramParcel.writeParcelable((Parcelable)this.hXd, paramInt);
    }
    GMTrace.o(16955188707328L, 126326);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\plugin\game\gamewebview\ipc\GameMMToClientEvent.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */