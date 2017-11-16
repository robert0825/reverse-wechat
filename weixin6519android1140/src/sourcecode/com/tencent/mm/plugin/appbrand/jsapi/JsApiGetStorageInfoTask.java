package com.tencent.mm.plugin.appbrand.jsapi;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.plugin.appbrand.app.e;
import com.tencent.mm.plugin.appbrand.appstorage.b;
import com.tencent.mm.plugin.appbrand.ipc.MainProcessTask;
import java.util.ArrayList;

public class JsApiGetStorageInfoTask
  extends MainProcessTask
{
  public static final Parcelable.Creator<JsApiGetStorageInfoTask> CREATOR;
  public int aCN;
  public String appId;
  public Runnable hYr;
  public ArrayList<String> hYz;
  public int size;
  
  static
  {
    GMTrace.i(10306579333120L, 76790);
    CREATOR = new Parcelable.Creator() {};
    GMTrace.o(10306579333120L, 76790);
  }
  
  public JsApiGetStorageInfoTask()
  {
    GMTrace.i(10305908244480L, 76785);
    GMTrace.o(10305908244480L, 76785);
  }
  
  public final void RY()
  {
    GMTrace.i(10306042462208L, 76786);
    Object localObject = e.Sd();
    if (localObject == null)
    {
      VL();
      GMTrace.o(10306042462208L, 76786);
      return;
    }
    localObject = ((b)localObject).ov(this.appId);
    this.hYz = ((ArrayList)localObject[0]);
    this.size = ((int)Math.ceil(((Integer)localObject[1]).doubleValue() / 1000.0D));
    this.aCN = ((int)Math.ceil(((Integer)localObject[2]).doubleValue() / 1000.0D));
    VL();
    GMTrace.o(10306042462208L, 76786);
  }
  
  public final void VK()
  {
    GMTrace.i(10306176679936L, 76787);
    if (this.hYr != null) {
      this.hYr.run();
    }
    GMTrace.o(10306176679936L, 76787);
  }
  
  public final void f(Parcel paramParcel)
  {
    GMTrace.i(10306310897664L, 76788);
    this.appId = paramParcel.readString();
    this.hYz = paramParcel.createStringArrayList();
    this.size = paramParcel.readInt();
    this.aCN = paramParcel.readInt();
    GMTrace.o(10306310897664L, 76788);
  }
  
  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    GMTrace.i(10306445115392L, 76789);
    paramParcel.writeString(this.appId);
    paramParcel.writeStringList(this.hYz);
    paramParcel.writeInt(this.size);
    paramParcel.writeInt(this.aCN);
    GMTrace.o(10306445115392L, 76789);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\plugin\appbrand\jsapi\JsApiGetStorageInfoTask.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */