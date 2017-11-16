package com.tencent.mm.plugin.game.gamewebview.ipc;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.plugin.game.gamewebview.model.b;
import com.tencent.mm.sdk.platformtools.bg;
import java.util.ArrayList;
import java.util.Iterator;

public class SetGameWebTaskManagerTask
  extends GWMainProcessTask
{
  public static final Parcelable.Creator<SetGameWebTaskManagerTask> CREATOR;
  public String className;
  public int type;
  public ArrayList<String> urlList;
  
  static
  {
    GMTrace.i(16945256595456L, 126252);
    CREATOR = new Parcelable.Creator() {};
    GMTrace.o(16945256595456L, 126252);
  }
  
  public SetGameWebTaskManagerTask()
  {
    GMTrace.i(16944988160000L, 126250);
    GMTrace.o(16944988160000L, 126250);
  }
  
  public SetGameWebTaskManagerTask(Parcel paramParcel)
  {
    GMTrace.i(16945122377728L, 126251);
    f(paramParcel);
    GMTrace.o(16945122377728L, 126251);
  }
  
  public final void RY()
  {
    GMTrace.i(16944451289088L, 126246);
    switch (this.type)
    {
    }
    for (;;)
    {
      GMTrace.o(16944451289088L, 126246);
      return;
      if (!bg.cc(this.urlList))
      {
        Iterator localIterator = this.urlList.iterator();
        while (localIterator.hasNext()) {
          b.zs((String)localIterator.next());
        }
        GMTrace.o(16944451289088L, 126246);
        return;
        if (!bg.cc(this.urlList))
        {
          localIterator = this.urlList.iterator();
          while (localIterator.hasNext()) {
            b.co((String)localIterator.next(), this.className);
          }
        }
      }
    }
  }
  
  public int describeContents()
  {
    GMTrace.i(16944853942272L, 126249);
    GMTrace.o(16944853942272L, 126249);
    return 0;
  }
  
  public final void f(Parcel paramParcel)
  {
    GMTrace.i(16944585506816L, 126247);
    this.type = paramParcel.readInt();
    this.className = paramParcel.readString();
    this.urlList = paramParcel.readArrayList(SetGameWebTaskManagerTask.class.getClassLoader());
    GMTrace.o(16944585506816L, 126247);
  }
  
  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    GMTrace.i(16944719724544L, 126248);
    paramParcel.writeInt(this.type);
    paramParcel.writeString(this.className);
    paramParcel.writeList(this.urlList);
    GMTrace.o(16944719724544L, 126248);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\plugin\game\gamewebview\ipc\SetGameWebTaskManagerTask.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */