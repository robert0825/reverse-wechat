package com.tencent.mm.plugin.downloader.ipc;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import com.tencent.gmtrace.GMTrace;

public class CDNTaskState
  implements Parcelable
{
  public static final Parcelable.Creator<CDNTaskState> CREATOR;
  public int completeSize;
  public int fileTotalSize;
  public int taskState;
  
  static
  {
    GMTrace.i(20084206600192L, 149639);
    CREATOR = new Parcelable.Creator() {};
    GMTrace.o(20084206600192L, 149639);
  }
  
  public CDNTaskState()
  {
    GMTrace.i(20083803947008L, 149636);
    this.taskState = -100;
    this.completeSize = 0;
    this.fileTotalSize = 0;
    GMTrace.o(20083803947008L, 149636);
  }
  
  public int describeContents()
  {
    GMTrace.i(20083938164736L, 149637);
    GMTrace.o(20083938164736L, 149637);
    return 0;
  }
  
  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    GMTrace.i(20084072382464L, 149638);
    paramParcel.writeInt(this.taskState);
    paramParcel.writeInt(this.completeSize);
    paramParcel.writeInt(this.fileTotalSize);
    GMTrace.o(20084072382464L, 149638);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\plugin\downloader\ipc\CDNTaskState.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */