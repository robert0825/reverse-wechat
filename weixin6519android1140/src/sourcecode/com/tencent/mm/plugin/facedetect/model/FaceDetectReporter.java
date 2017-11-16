package com.tencent.mm.plugin.facedetect.model;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.plugin.report.service.g;
import com.tencent.mm.sdk.platformtools.ah;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;
import java.util.HashMap;

public class FaceDetectReporter
  implements Parcelable
{
  public static final Parcelable.Creator<FaceDetectReporter> CREATOR;
  public static FaceDetectReporter kTx;
  String appId;
  public long kTA;
  public int kTB;
  public boolean kTC;
  public boolean kTv;
  private FaceDetectReportInfo kTw;
  long kTy;
  long kTz;
  public long sessionId;
  
  static
  {
    GMTrace.i(5873233559552L, 43759);
    kTx = new FaceDetectReporter();
    CREATOR = new Parcelable.Creator() {};
    GMTrace.o(5873233559552L, 43759);
  }
  
  private FaceDetectReporter()
  {
    GMTrace.i(5871622946816L, 43747);
    this.sessionId = 0L;
    this.kTv = false;
    this.kTw = null;
    this.appId = "";
    this.kTy = 0L;
    this.kTz = -1L;
    this.kTA = -1L;
    this.kTB = 0;
    this.kTC = false;
    GMTrace.o(5871622946816L, 43747);
  }
  
  protected FaceDetectReporter(Parcel paramParcel)
  {
    GMTrace.i(5872830906368L, 43756);
    this.sessionId = 0L;
    this.kTv = false;
    this.kTw = null;
    this.appId = "";
    this.kTy = 0L;
    this.kTz = -1L;
    this.kTA = -1L;
    this.kTB = 0;
    this.kTC = false;
    this.sessionId = paramParcel.readLong();
    if (paramParcel.readByte() != 0)
    {
      bool1 = true;
      this.kTv = bool1;
      this.kTw = ((FaceDetectReportInfo)paramParcel.readParcelable(FaceDetectReportInfo.class.getClassLoader()));
      this.appId = paramParcel.readString();
      this.kTy = paramParcel.readLong();
      this.kTz = paramParcel.readLong();
      this.kTA = paramParcel.readLong();
      this.kTB = paramParcel.readInt();
      if (paramParcel.readByte() == 0) {
        break label170;
      }
    }
    label170:
    for (boolean bool1 = bool2;; bool1 = false)
    {
      this.kTC = bool1;
      GMTrace.o(5872830906368L, 43756);
      return;
      bool1 = false;
      break;
    }
  }
  
  public static FaceDetectReporter aws()
  {
    GMTrace.i(5871354511360L, 43745);
    if (kTx == null) {
      try
      {
        if (kTx == null) {
          kTx = new FaceDetectReporter();
        }
        FaceDetectReporter localFaceDetectReporter1 = kTx;
        GMTrace.o(5871354511360L, 43745);
        return localFaceDetectReporter1;
      }
      finally {}
    }
    FaceDetectReporter localFaceDetectReporter2 = kTx;
    GMTrace.o(5871354511360L, 43745);
    return localFaceDetectReporter2;
  }
  
  public static void d(long paramLong, int paramInt1, int paramInt2)
  {
    GMTrace.i(5871488729088L, 43746);
    w.i("MicroMsg.FaceDetectReporter", "hy: report video: bioId: %d, errType: %d, errCode: %d", new Object[] { Long.valueOf(paramLong), Integer.valueOf(paramInt1), Integer.valueOf(paramInt2) });
    g.ork.i(14121, new Object[] { Long.valueOf(paramLong), Integer.valueOf(paramInt1), Integer.valueOf(paramInt2) });
    GMTrace.o(5871488729088L, 43746);
  }
  
  public static int nq(int paramInt)
  {
    GMTrace.i(14525579395072L, 108224);
    switch (paramInt)
    {
    default: 
      GMTrace.o(14525579395072L, 108224);
      return -1;
    case 0: 
    case 3: 
      GMTrace.o(14525579395072L, 108224);
      return 2;
    case 1: 
    case 4: 
      GMTrace.o(14525579395072L, 108224);
      return 3;
    case 5: 
      GMTrace.o(14525579395072L, 108224);
      return 4;
    }
    GMTrace.o(14525579395072L, 108224);
    return 1;
  }
  
  public final void a(int paramInt1, boolean paramBoolean, int paramInt2, int paramInt3, int paramInt4)
  {
    GMTrace.i(14525713612800L, 108225);
    a(paramInt1, paramBoolean, paramInt2, paramInt3, paramInt4, 0);
    GMTrace.o(14525713612800L, 108225);
  }
  
  public final void a(int paramInt1, boolean paramBoolean, int paramInt2, int paramInt3, int paramInt4, int paramInt5)
  {
    GMTrace.i(5872294035456L, 43752);
    w.v("MicroMsg.FaceDetectReporter", "reportFaceDetectVerifyResult sessionId: %d, hasReported: %b, businessType: %d, isRetry: %b, result: %d, errType: %d, errCode: %d", new Object[] { Long.valueOf(this.sessionId), Boolean.valueOf(this.kTv), Integer.valueOf(paramInt1), Boolean.valueOf(paramBoolean), Integer.valueOf(paramInt2), Integer.valueOf(paramInt3), Integer.valueOf(paramInt4) });
    if ((this.kTw != null) && (!this.kTv))
    {
      w.v("MicroMsg.FaceDetectReporter", "info: %s", new Object[] { this.kTw.toString() });
      this.kTv = true;
      this.kTw.kRB = paramInt5;
      if (this.kTw.kTq != 0) {
        this.kTw.kTs = (this.kTw.kTr / this.kTw.kTq);
      }
      if ((!this.kTw.kTt.containsKey(Integer.valueOf(0))) || (!this.kTw.kTu.containsKey(Integer.valueOf(0)))) {
        break label704;
      }
    }
    label704:
    for (paramInt5 = (int)(((Long)this.kTw.kTu.get(Integer.valueOf(0))).longValue() - ((Long)this.kTw.kTt.get(Integer.valueOf(0))).longValue());; paramInt5 = 0)
    {
      if ((this.kTw.kTt.containsKey(Integer.valueOf(4))) && (this.kTw.kTu.containsKey(Integer.valueOf(4)))) {}
      for (int i = (int)(((Long)this.kTw.kTu.get(Integer.valueOf(4))).longValue() - ((Long)this.kTw.kTt.get(Integer.valueOf(4))).longValue());; i = 0)
      {
        w.v("MicroMsg.FaceDetectReporter", "alvinluo normal motion time: %d ms, read number motion time: %d ms", new Object[] { Integer.valueOf(paramInt5), Integer.valueOf(i) });
        g localg = g.ork;
        long l = this.sessionId;
        if (paramBoolean) {}
        for (int j = 1;; j = 0)
        {
          localg.i(14006, new Object[] { Long.valueOf(l), Integer.valueOf(paramInt1), Integer.valueOf(j), Integer.valueOf(paramInt2), Integer.valueOf(paramInt3), Integer.valueOf(paramInt4), Integer.valueOf(this.kTw.kTc), Integer.valueOf(this.kTw.kTd), Integer.valueOf(this.kTw.kTe), Integer.valueOf(this.kTw.kTb), Integer.valueOf(this.kTw.kTf), Integer.valueOf(this.kTw.kTg), Integer.valueOf(this.kTw.kTh), Integer.valueOf(this.kTw.kTi), Integer.valueOf(this.kTw.kTj), Integer.valueOf(this.kTw.kTk), Integer.valueOf(this.kTw.kTl), Integer.valueOf(this.kTw.kTm), Integer.valueOf(this.kTw.kTn), Integer.valueOf(this.kTw.kRB), Integer.valueOf(this.kTw.kTo), Integer.valueOf(this.kTw.kTp), Integer.valueOf(this.kTw.kTs), Integer.valueOf(paramInt5), Integer.valueOf(i), this.appId });
          GMTrace.o(5872294035456L, 43752);
          return;
        }
      }
    }
  }
  
  public final void a(FaceDetectReporter paramFaceDetectReporter)
  {
    GMTrace.i(5871891382272L, 43749);
    w.v("MicroMsg.FaceDetectReporter", "alvinluo setReporter, stack: %s", new Object[] { bg.bQW().toString() });
    this.kTw = paramFaceDetectReporter.kTw;
    this.kTv = paramFaceDetectReporter.kTv;
    this.sessionId = paramFaceDetectReporter.sessionId;
    long l = this.sessionId;
    if (this.kTw != null) {}
    for (paramFaceDetectReporter = this.kTw.toString();; paramFaceDetectReporter = "null")
    {
      w.v("MicroMsg.FaceDetectReporter", "alvinluo sessionId: %d, info: %s", new Object[] { Long.valueOf(l), paramFaceDetectReporter });
      GMTrace.o(5871891382272L, 43749);
      return;
    }
  }
  
  public final void aU(String paramString, int paramInt)
  {
    long l1 = -1L;
    int i = 1;
    GMTrace.i(18490773733376L, 137767);
    g localg;
    long l2;
    String str;
    if ((this.kTz == -1L) || (this.kTA == -1L) || (this.kTA < this.kTz))
    {
      w.e("MicroMsg.FaceDetectReporter", "alvinluo not set calledStartTime:%d or calledEndTime: %d, total time is not valid", new Object[] { Long.valueOf(this.kTz), Long.valueOf(this.kTA) });
      w.i("MicroMsg.FaceDetectReporter", "alvinluo report face detect interface called result, sessionId: %d, functionName: %s, interfaceType: %d, businessType: %d, totalTime: %d, isSuccess: %b, appId: %s, faceDetectCount: %d", new Object[] { Long.valueOf(this.kTy), paramString, Integer.valueOf(-1), Integer.valueOf(paramInt), Long.valueOf(l1), Boolean.valueOf(this.kTC), this.appId, Integer.valueOf(this.kTB) });
      localg = g.ork;
      l2 = this.kTy;
      str = this.appId;
      if (!this.kTC) {
        break label279;
      }
    }
    for (;;)
    {
      localg.i(14560, new Object[] { Long.valueOf(l2), paramString, Integer.valueOf(-1), Integer.valueOf(paramInt), str, Integer.valueOf(i), Long.valueOf(l1), Integer.valueOf(this.kTB) });
      GMTrace.o(18490773733376L, 137767);
      return;
      l1 = this.kTA - this.kTz;
      break;
      label279:
      i = 0;
    }
  }
  
  public final long awt()
  {
    GMTrace.i(5871757164544L, 43748);
    w.v("MicroMsg.FaceDetectReporter", "create report session");
    if (this.kTw == null) {
      this.kTw = new FaceDetectReportInfo();
    }
    this.kTw.reset();
    this.kTv = false;
    this.sessionId = System.currentTimeMillis();
    this.kTw.sessionId = this.sessionId;
    long l = this.sessionId;
    GMTrace.o(5871757164544L, 43748);
    return l;
  }
  
  public int describeContents()
  {
    GMTrace.i(5873099341824L, 43758);
    GMTrace.o(5873099341824L, 43758);
    return 0;
  }
  
  public final void p(int paramInt, long paramLong)
  {
    GMTrace.i(5872428253184L, 43753);
    if (this.kTw != null)
    {
      FaceDetectReportInfo localFaceDetectReportInfo = this.kTw;
      localFaceDetectReportInfo.kTq += 1;
      localFaceDetectReportInfo = this.kTw;
      localFaceDetectReportInfo.kTr = ((int)(localFaceDetectReportInfo.kTr + paramLong));
      this.kTw.np(paramInt);
    }
    GMTrace.o(5872428253184L, 43753);
  }
  
  public final void q(int paramInt, long paramLong)
  {
    GMTrace.i(5872562470912L, 43754);
    if (this.kTw != null) {
      this.kTw.kTt.put(Integer.valueOf(paramInt), Long.valueOf(paramLong));
    }
    GMTrace.o(5872562470912L, 43754);
  }
  
  public final void r(int paramInt, long paramLong)
  {
    GMTrace.i(5872696688640L, 43755);
    if (this.kTw != null) {
      this.kTw.kTu.put(Integer.valueOf(paramInt), Long.valueOf(paramLong));
    }
    GMTrace.o(5872696688640L, 43755);
  }
  
  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    int j = 1;
    GMTrace.i(5872965124096L, 43757);
    paramParcel.writeLong(this.sessionId);
    int i;
    if (this.kTv)
    {
      i = 1;
      paramParcel.writeByte((byte)i);
      paramParcel.writeParcelable(this.kTw, paramInt);
      paramParcel.writeString(this.appId);
      paramParcel.writeLong(this.kTy);
      paramParcel.writeLong(this.kTz);
      paramParcel.writeLong(this.kTA);
      paramParcel.writeInt(this.kTB);
      if (!this.kTC) {
        break label115;
      }
    }
    label115:
    for (paramInt = j;; paramInt = 0)
    {
      paramParcel.writeByte((byte)paramInt);
      GMTrace.o(5872965124096L, 43757);
      return;
      i = 0;
      break;
    }
  }
  
  public final void x(int paramInt, boolean paramBoolean)
  {
    int i = 1;
    GMTrace.i(14525445177344L, 108223);
    w.v("MicroMsg.FaceDetectReporter", "reportStartFaceDetect businessType: %d, isRetry: %b", new Object[] { Integer.valueOf(paramInt), Boolean.valueOf(paramBoolean) });
    g localg = g.ork;
    long l = this.sessionId;
    if (paramBoolean) {}
    for (;;)
    {
      localg.i(14005, new Object[] { Integer.valueOf(paramInt), Long.valueOf(l), Integer.valueOf(i) });
      GMTrace.o(14525445177344L, 108223);
      return;
      i = 0;
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\plugin\facedetect\model\FaceDetectReporter.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */