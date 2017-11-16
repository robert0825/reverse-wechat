package com.tencent.mm.plugin.game.gamewebview.jsapi.biz;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.g.a.gn;
import com.tencent.mm.plugin.downloader.model.FileDownloadTaskInfo;
import com.tencent.mm.plugin.downloader.model.f;
import com.tencent.mm.plugin.downloader.model.g;
import com.tencent.mm.plugin.downloader.model.g.a;
import com.tencent.mm.plugin.game.gamewebview.ipc.GWMainProcessTask;
import com.tencent.mm.pluginsdk.model.app.q;
import com.tencent.mm.sdk.b.b;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;
import java.io.File;

public class DoDownloadTask
  extends GWMainProcessTask
{
  public static Parcelable.Creator<DoDownloadTask> CREATOR;
  public String appId;
  public long eAf;
  public String eDW;
  public boolean eDb;
  public String extInfo;
  public String lGL;
  public String lGM;
  public String lGN;
  public long lGO;
  public String packageName;
  public int scene;
  public int type;
  public String url;
  
  static
  {
    GMTrace.i(17054107172864L, 127063);
    CREATOR = new Parcelable.Creator() {};
    GMTrace.o(17054107172864L, 127063);
  }
  
  public DoDownloadTask()
  {
    GMTrace.i(17053301866496L, 127057);
    GMTrace.o(17053301866496L, 127057);
  }
  
  public DoDownloadTask(Parcel paramParcel)
  {
    GMTrace.i(17053972955136L, 127062);
    f(paramParcel);
    GMTrace.o(17053972955136L, 127062);
  }
  
  public final void RY()
  {
    boolean bool1 = false;
    boolean bool2 = true;
    GMTrace.i(17053436084224L, 127058);
    w.i("MicroMsg.AddDownloadTask", "doDownloadTask, type = " + this.type);
    Object localObject;
    switch (this.type)
    {
    default: 
      GMTrace.o(17053436084224L, 127058);
      return;
    case 1: 
      w.i("MicroMsg.AddDownloadTask", "addDownloadTask");
      localObject = new gn();
      ((gn)localObject).eJF.url = this.url;
      ((gn)localObject).eJF.eDW = this.eDW;
      ((gn)localObject).eJF.extInfo = this.extInfo;
      ((gn)localObject).eJF.appId = this.appId;
      ((gn)localObject).eJF.scene = this.scene;
      com.tencent.mm.sdk.b.a.vgX.m((b)localObject);
      localObject = new g.a();
      ((g.a)localObject).vy(this.url);
      ((g.a)localObject).vz(this.lGM);
      ((g.a)localObject).bq(this.lGO);
      ((g.a)localObject).vA(this.lGL);
      ((g.a)localObject).vB(this.eDW);
      ((g.a)localObject).setAppId(this.appId);
      ((g.a)localObject).bE(this.packageName);
      ((g.a)localObject).dJ(true);
      ((g.a)localObject).mt(bg.getInt(this.lGN, 1));
      ((g.a)localObject).lq(this.scene);
      localObject = ((g.a)localObject).kfx;
      this.eAf = f.apJ().a((g)localObject);
      GMTrace.o(17053436084224L, 127058);
      return;
    case 2: 
      w.i("MicroMsg.AddDownloadTask", "pauseDownloadTask");
      bool1 = f.apJ().bh(this.eAf);
    }
    for (;;)
    {
      this.eDb = bool1;
      break;
      w.i("MicroMsg.AddDownloadTask", "resumeDownloadTask");
      localObject = com.tencent.mm.plugin.downloader.model.e.bm(this.eAf);
      if (localObject != null)
      {
        ((com.tencent.mm.plugin.downloader.e.a)localObject).field_scene = this.scene;
        com.tencent.mm.plugin.downloader.model.e.c((com.tencent.mm.plugin.downloader.e.a)localObject);
      }
      bool1 = f.apJ().bi(this.eAf);
      continue;
      w.i("MicroMsg.AddDownloadTask", "cancelDownloadTask");
      if (f.apJ().bf(this.eAf) > 0) {}
      for (bool1 = bool2;; bool1 = false)
      {
        this.eDb = bool1;
        GMTrace.o(17053436084224L, 127058);
        return;
      }
      w.i("MicroMsg.AddDownloadTask", "cancelDownloadTask");
      localObject = f.apJ().bg(this.eAf);
      if (((FileDownloadTaskInfo)localObject).status == -1)
      {
        w.e("MicroMsg.AddDownloadTask", "installDownloadTask fail, apilevel not supported");
      }
      else if (((FileDownloadTaskInfo)localObject).status != 3)
      {
        w.e("MicroMsg.AddDownloadTask", "installDownloadTask fail, invalid status = " + ((FileDownloadTaskInfo)localObject).status);
      }
      else if (com.tencent.mm.a.e.aZ(((FileDownloadTaskInfo)localObject).path))
      {
        localObject = Uri.fromFile(new File(((FileDownloadTaskInfo)localObject).path));
        bool1 = q.e(ab.getContext(), (Uri)localObject);
      }
    }
  }
  
  public int describeContents()
  {
    GMTrace.i(17053570301952L, 127059);
    GMTrace.o(17053570301952L, 127059);
    return 0;
  }
  
  public final void f(Parcel paramParcel)
  {
    boolean bool = true;
    GMTrace.i(17053838737408L, 127061);
    this.type = paramParcel.readInt();
    this.lGL = paramParcel.readString();
    this.url = paramParcel.readString();
    this.lGM = paramParcel.readString();
    this.eDW = paramParcel.readString();
    this.extInfo = paramParcel.readString();
    this.lGN = paramParcel.readString();
    this.appId = paramParcel.readString();
    this.packageName = paramParcel.readString();
    this.lGO = paramParcel.readLong();
    this.scene = paramParcel.readInt();
    this.eAf = paramParcel.readLong();
    if (paramParcel.readByte() == 1) {}
    for (;;)
    {
      this.eDb = bool;
      GMTrace.o(17053838737408L, 127061);
      return;
      bool = false;
    }
  }
  
  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    GMTrace.i(17053704519680L, 127060);
    paramParcel.writeInt(this.type);
    paramParcel.writeString(this.lGL);
    paramParcel.writeString(this.url);
    paramParcel.writeString(this.lGM);
    paramParcel.writeString(this.eDW);
    paramParcel.writeString(this.extInfo);
    paramParcel.writeString(this.lGN);
    paramParcel.writeString(this.appId);
    paramParcel.writeString(this.packageName);
    paramParcel.writeLong(this.lGO);
    paramParcel.writeInt(this.scene);
    paramParcel.writeLong(this.eAf);
    if (this.eDb) {}
    for (paramInt = 1;; paramInt = 0)
    {
      paramParcel.writeByte((byte)paramInt);
      GMTrace.o(17053704519680L, 127060);
      return;
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\plugin\game\gamewebview\jsapi\biz\DoDownloadTask.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */