package com.tencent.mm.plugin.game.gamewebview.jsapi.biz;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.plugin.downloader.model.FileDownloadTaskInfo;
import com.tencent.mm.plugin.downloader.model.f;
import com.tencent.mm.plugin.game.gamewebview.ipc.GWMainProcessTask;
import com.tencent.mm.sdk.platformtools.w;
import java.util.ArrayList;

public class QueryDownloadInfoTask
  extends GWMainProcessTask
{
  public static Parcelable.Creator<QueryDownloadInfoTask> CREATOR;
  public long eAf;
  public ArrayList<FileDownloadTaskInfo> kCf;
  public ArrayList<String> lHR;
  public int type;
  
  static
  {
    GMTrace.i(17029545328640L, 126880);
    CREATOR = new Parcelable.Creator() {};
    GMTrace.o(17029545328640L, 126880);
  }
  
  public QueryDownloadInfoTask()
  {
    GMTrace.i(17028740022272L, 126874);
    GMTrace.o(17028740022272L, 126874);
  }
  
  public QueryDownloadInfoTask(Parcel paramParcel)
  {
    GMTrace.i(17029411110912L, 126879);
    f(paramParcel);
    GMTrace.o(17029411110912L, 126879);
  }
  
  public final void RY()
  {
    GMTrace.i(17028874240000L, 126875);
    w.i("MicroMsg.QueryDownloadInfoTask", "QueryDownloadInfoTask");
    switch (this.type)
    {
    }
    for (;;)
    {
      GMTrace.o(17028874240000L, 126875);
      return;
      FileDownloadTaskInfo localFileDownloadTaskInfo = f.apJ().bg(this.eAf);
      this.kCf = new ArrayList();
      this.kCf.add(localFileDownloadTaskInfo);
      GMTrace.o(17028874240000L, 126875);
      return;
      if ((this.lHR == null) || (this.lHR.size() == 0))
      {
        w.i("MicroMsg.QueryDownloadInfoTask", "appIdList is null");
        GMTrace.o(17028874240000L, 126875);
        return;
      }
      f.apJ();
      this.kCf = f.q(this.lHR);
    }
  }
  
  public int describeContents()
  {
    GMTrace.i(17029008457728L, 126876);
    GMTrace.o(17029008457728L, 126876);
    return 0;
  }
  
  public final void f(Parcel paramParcel)
  {
    GMTrace.i(17029276893184L, 126878);
    this.type = paramParcel.readInt();
    this.eAf = paramParcel.readLong();
    this.lHR = paramParcel.readArrayList(QueryDownloadInfoTask.class.getClassLoader());
    this.kCf = paramParcel.readArrayList(QueryDownloadInfoTask.class.getClassLoader());
    GMTrace.o(17029276893184L, 126878);
  }
  
  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    GMTrace.i(17029142675456L, 126877);
    paramParcel.writeInt(this.type);
    paramParcel.writeLong(this.eAf);
    paramParcel.writeList(this.lHR);
    paramParcel.writeList(this.kCf);
    GMTrace.o(17029142675456L, 126877);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\plugin\game\gamewebview\jsapi\biz\QueryDownloadInfoTask.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */