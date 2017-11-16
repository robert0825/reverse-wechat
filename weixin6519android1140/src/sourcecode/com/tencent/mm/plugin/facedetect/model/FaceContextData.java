package com.tencent.mm.plugin.facedetect.model;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import com.tencent.gmtrace.GMTrace;
import junit.framework.Assert;

public class FaceContextData
  implements Parcelable
{
  public static final Parcelable.Creator<FaceContextData> CREATOR;
  private static volatile FaceContextData kSH;
  public long kSI;
  
  static
  {
    GMTrace.i(5874575736832L, 43769);
    kSH = null;
    CREATOR = new Parcelable.Creator() {};
    GMTrace.o(5874575736832L, 43769);
  }
  
  public FaceContextData()
  {
    GMTrace.i(5874173083648L, 43766);
    this.kSI = -1L;
    GMTrace.o(5874173083648L, 43766);
  }
  
  protected FaceContextData(Parcel paramParcel)
  {
    GMTrace.i(5874038865920L, 43765);
    this.kSI = -1L;
    this.kSI = paramParcel.readLong();
    GMTrace.o(5874038865920L, 43765);
  }
  
  public static void a(FaceContextData paramFaceContextData)
  {
    GMTrace.i(5873636212736L, 43762);
    if (paramFaceContextData == null)
    {
      kSH = null;
      GMTrace.o(5873636212736L, 43762);
      return;
    }
    if (kSH != null)
    {
      b(paramFaceContextData);
      GMTrace.o(5873636212736L, 43762);
      return;
    }
    try
    {
      if (kSH != null)
      {
        b(paramFaceContextData);
        GMTrace.o(5873636212736L, 43762);
        return;
      }
      kSH = paramFaceContextData;
      GMTrace.o(5873636212736L, 43762);
      return;
    }
    finally {}
  }
  
  public static FaceContextData awb()
  {
    try
    {
      GMTrace.i(5873904648192L, 43764);
      FaceContextData localFaceContextData = kSH;
      GMTrace.o(5873904648192L, 43764);
      return localFaceContextData;
    }
    finally
    {
      localObject = finally;
      throw ((Throwable)localObject);
    }
  }
  
  private static void b(FaceContextData paramFaceContextData)
  {
    GMTrace.i(5873770430464L, 43763);
    if ((kSH != null) && (paramFaceContextData != null)) {}
    for (boolean bool = true;; bool = false)
    {
      Assert.assertTrue(bool);
      kSH.kSI = paramFaceContextData.kSI;
      GMTrace.o(5873770430464L, 43763);
      return;
    }
  }
  
  public int describeContents()
  {
    GMTrace.i(5874307301376L, 43767);
    GMTrace.o(5874307301376L, 43767);
    return 0;
  }
  
  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    GMTrace.i(5874441519104L, 43768);
    paramParcel.writeLong(this.kSI);
    GMTrace.o(5874441519104L, 43768);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\plugin\facedetect\model\FaceContextData.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */