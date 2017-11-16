package com.tencent.mm.ipcinvoker.wx_extension.service;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.ad.b;
import com.tencent.mm.ipcinvoker.extension.c;
import com.tencent.mm.ipcinvoker.wx_extension.a;

public class IPCRunCgiRespWrapper
  implements Parcelable
{
  public static final Parcelable.Creator<IPCRunCgiRespWrapper> CREATOR;
  public String eAR;
  public int errCode;
  public int errType;
  public b fUa;
  
  static
  {
    GMTrace.i(18946174484480L, 141160);
    CREATOR = new Parcelable.Creator() {};
    GMTrace.o(18946174484480L, 141160);
  }
  
  public IPCRunCgiRespWrapper()
  {
    GMTrace.i(18945771831296L, 141157);
    GMTrace.o(18945771831296L, 141157);
  }
  
  IPCRunCgiRespWrapper(Parcel paramParcel)
  {
    GMTrace.i(18945906049024L, 141158);
    this.errType = paramParcel.readInt();
    this.errCode = paramParcel.readInt();
    this.eAR = paramParcel.readString();
    this.fUa = ((b)c.a(a.class.getName(), paramParcel));
    GMTrace.o(18945906049024L, 141158);
  }
  
  public static IPCRunCgiRespWrapper vY()
  {
    GMTrace.i(18946040266752L, 141159);
    IPCRunCgiRespWrapper localIPCRunCgiRespWrapper = new IPCRunCgiRespWrapper();
    localIPCRunCgiRespWrapper.fUa = null;
    localIPCRunCgiRespWrapper.eAR = null;
    localIPCRunCgiRespWrapper.errType = 3;
    localIPCRunCgiRespWrapper.errCode = -2;
    GMTrace.o(18946040266752L, 141159);
    return localIPCRunCgiRespWrapper;
  }
  
  public int describeContents()
  {
    GMTrace.i(18945503395840L, 141155);
    GMTrace.o(18945503395840L, 141155);
    return 0;
  }
  
  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    GMTrace.i(18945637613568L, 141156);
    paramParcel.writeInt(this.errType);
    paramParcel.writeInt(this.errCode);
    paramParcel.writeString(this.eAR);
    c.a(this.fUa, paramParcel);
    GMTrace.o(18945637613568L, 141156);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\ipcinvoker\wx_extension\service\IPCRunCgiRespWrapper.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */