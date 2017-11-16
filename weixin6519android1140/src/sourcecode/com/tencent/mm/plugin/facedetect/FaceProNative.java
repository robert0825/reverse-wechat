package com.tencent.mm.plugin.facedetect;

import android.graphics.Rect;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.compatible.util.k;
import com.tencent.mm.k.e;
import com.tencent.mm.kernel.h;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;
import java.util.ArrayList;
import org.json.JSONArray;
import org.json.JSONException;

public class FaceProNative
{
  public static final int ROTFLIPHOR = 3;
  public static final int ROTFLIPLEFT = 4;
  public static final int ROTFLIPRIGHT = 5;
  public static final int ROTLEFT = 1;
  public static final int ROTRIGHT = 2;
  public static final int ROTSTABLE = 0;
  private static final String TAG = "MicroMsg.FaceProNative";
  private static final long TIMEOUT_CHECKER = 3600000L;
  private static String[] cachedStr;
  private static long lastCheckTime;
  private long nativePtr;
  
  static
  {
    GMTrace.i(5966246445056L, 44452);
    k.b("FacePro", FaceProNative.class.getClassLoader());
    k.b("wechatvoicereco", FaceProNative.class.getClassLoader());
    k.b("wechatxlog", FaceProNative.class.getClassLoader());
    nativeInit();
    cachedStr = null;
    lastCheckTime = -1L;
    GMTrace.o(5966246445056L, 44452);
  }
  
  public FaceProNative()
  {
    GMTrace.i(5963696308224L, 44433);
    NativeConstructor();
    GMTrace.o(5963696308224L, 44433);
  }
  
  private native void NativeConstructor();
  
  private native void NativeDestructor();
  
  public static native int engineVersion();
  
  @android.support.a.a
  public static String[] getDynamicValue(String paramString)
  {
    GMTrace.i(17813511077888L, 132721);
    if (System.currentTimeMillis() - lastCheckTime >= 3600000L)
    {
      lastCheckTime = System.currentTimeMillis();
      paramString = ((com.tencent.mm.plugin.zero.b.a)h.h(com.tencent.mm.plugin.zero.b.a.class)).ut().getValue(paramString);
      if (bg.nm(paramString)) {}
    }
    try
    {
      paramString = new JSONArray(paramString);
      ArrayList localArrayList = new ArrayList(5);
      int j = paramString.length();
      int i = 0;
      while (i < j)
      {
        localArrayList.add(paramString.getString(i));
        i += 1;
      }
      cachedStr = new String[j];
      localArrayList.toArray(cachedStr);
    }
    catch (JSONException paramString)
    {
      for (;;)
      {
        w.printErrStackTrace("MicroMsg.FaceProNative", paramString, "hy: array resolve failed", new Object[0]);
      }
    }
    paramString = cachedStr;
    GMTrace.o(17813511077888L, 132721);
    return paramString;
  }
  
  public static native boolean nativeInit();
  
  public void destroy()
  {
    GMTrace.i(5963830525952L, 44434);
    NativeDestructor();
    GMTrace.o(5963830525952L, 44434);
  }
  
  public native FaceStatus engineFaceProcess(byte[] paramArrayOfByte, int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5);
  
  public native int[] engineGetAllMotions();
  
  public native int engineGetCurrMotion();
  
  public native String engineGetCurrMotionData();
  
  public native int engineGroupChange();
  
  public native int engineInit(String paramString1, byte[] paramArrayOfByte, String paramString2, String paramString3);
  
  public native int engineNextMotion();
  
  public native int engineRelease();
  
  public native int engineReleaseCurrMotion();
  
  public native FaceResult engineReleaseOut();
  
  public native int engineSetVoiceData(byte[] paramArrayOfByte);
  
  public native int engineStartRecord();
  
  protected void finalize()
  {
    GMTrace.i(5963964743680L, 44435);
    super.finalize();
    NativeDestructor();
    GMTrace.o(5963964743680L, 44435);
  }
  
  public static class FaceResult
    implements Parcelable
  {
    public static final Parcelable.Creator<FaceResult> CREATOR;
    public byte[] data;
    public int result;
    public byte[] sidedata;
    
    static
    {
      GMTrace.i(5980070871040L, 44555);
      CREATOR = new Parcelable.Creator()
      {
        public final FaceProNative.FaceResult createFromParcel(Parcel paramAnonymousParcel)
        {
          GMTrace.i(5878065397760L, 43795);
          paramAnonymousParcel = new FaceProNative.FaceResult(paramAnonymousParcel);
          GMTrace.o(5878065397760L, 43795);
          return paramAnonymousParcel;
        }
        
        public final FaceProNative.FaceResult[] newArray(int paramAnonymousInt)
        {
          GMTrace.i(5878199615488L, 43796);
          FaceProNative.FaceResult[] arrayOfFaceResult = new FaceProNative.FaceResult[paramAnonymousInt];
          GMTrace.o(5878199615488L, 43796);
          return arrayOfFaceResult;
        }
      };
      GMTrace.o(5980070871040L, 44555);
    }
    
    public FaceResult()
    {
      GMTrace.i(5979399782400L, 44550);
      GMTrace.o(5979399782400L, 44550);
    }
    
    protected FaceResult(Parcel paramParcel)
    {
      GMTrace.i(5979534000128L, 44551);
      this.result = paramParcel.readInt();
      this.data = paramParcel.createByteArray();
      this.sidedata = paramParcel.createByteArray();
      GMTrace.o(5979534000128L, 44551);
    }
    
    public int describeContents()
    {
      GMTrace.i(5979802435584L, 44553);
      GMTrace.o(5979802435584L, 44553);
      return 0;
    }
    
    public String toString()
    {
      int j = 0;
      GMTrace.i(5979936653312L, 44554);
      Object localObject = new StringBuilder("FaceResult{result=").append(this.result).append(", sidedataLen=");
      if (this.sidedata == null)
      {
        i = 0;
        localObject = ((StringBuilder)localObject).append(i).append(", dataLen=");
        if (this.data != null) {
          break label94;
        }
      }
      label94:
      for (int i = j;; i = this.data.length)
      {
        localObject = i + '}';
        GMTrace.o(5979936653312L, 44554);
        return (String)localObject;
        i = this.sidedata.length;
        break;
      }
    }
    
    public void writeToParcel(Parcel paramParcel, int paramInt)
    {
      GMTrace.i(5979668217856L, 44552);
      paramParcel.writeInt(this.result);
      paramParcel.writeByteArray(this.data);
      paramParcel.writeByteArray(this.sidedata);
      GMTrace.o(5979668217856L, 44552);
    }
  }
  
  public static class FaceStatus
    implements Parcelable
  {
    public static final Parcelable.Creator<FaceStatus> CREATOR;
    public Rect facerect;
    public float pitch;
    public int result;
    public float roll;
    public float[] xys;
    public float yaw;
    
    static
    {
      GMTrace.i(5948261269504L, 44318);
      CREATOR = new Parcelable.Creator()
      {
        public final FaceProNative.FaceStatus createFromParcel(Parcel paramAnonymousParcel)
        {
          GMTrace.i(5912022482944L, 44048);
          paramAnonymousParcel = new FaceProNative.FaceStatus(paramAnonymousParcel);
          GMTrace.o(5912022482944L, 44048);
          return paramAnonymousParcel;
        }
        
        public final FaceProNative.FaceStatus[] newArray(int paramAnonymousInt)
        {
          GMTrace.i(5912156700672L, 44049);
          FaceProNative.FaceStatus[] arrayOfFaceStatus = new FaceProNative.FaceStatus[paramAnonymousInt];
          GMTrace.o(5912156700672L, 44049);
          return arrayOfFaceStatus;
        }
      };
      GMTrace.o(5948261269504L, 44318);
    }
    
    public FaceStatus()
    {
      GMTrace.i(5947590180864L, 44313);
      GMTrace.o(5947590180864L, 44313);
    }
    
    protected FaceStatus(Parcel paramParcel)
    {
      GMTrace.i(5947724398592L, 44314);
      this.result = paramParcel.readInt();
      this.facerect = ((Rect)paramParcel.readParcelable(Rect.class.getClassLoader()));
      this.xys = paramParcel.createFloatArray();
      this.pitch = paramParcel.readFloat();
      this.yaw = paramParcel.readFloat();
      this.roll = paramParcel.readFloat();
      GMTrace.o(5947724398592L, 44314);
    }
    
    public int describeContents()
    {
      GMTrace.i(5947992834048L, 44316);
      GMTrace.o(5947992834048L, 44316);
      return 0;
    }
    
    public String toString()
    {
      GMTrace.i(5948127051776L, 44317);
      String str = "FaceStatus{result=" + this.result + ", facerect=" + this.facerect + ", pitch=" + this.pitch + ", yaw=" + this.yaw + ", roll=" + this.roll + '}';
      GMTrace.o(5948127051776L, 44317);
      return str;
    }
    
    public void writeToParcel(Parcel paramParcel, int paramInt)
    {
      GMTrace.i(5947858616320L, 44315);
      paramParcel.writeInt(this.result);
      paramParcel.writeParcelable(this.facerect, paramInt);
      paramParcel.writeFloatArray(this.xys);
      paramParcel.writeFloat(this.pitch);
      paramParcel.writeFloat(this.yaw);
      paramParcel.writeFloat(this.roll);
      GMTrace.o(5947858616320L, 44315);
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\plugin\facedetect\FaceProNative.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */