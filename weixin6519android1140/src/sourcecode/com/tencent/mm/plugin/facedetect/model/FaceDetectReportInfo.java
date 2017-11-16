package com.tencent.mm.plugin.facedetect.model;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.sdk.platformtools.w;
import java.util.HashMap;

class FaceDetectReportInfo
  implements Parcelable
{
  public static final Parcelable.Creator<FaceDetectReportInfo> CREATOR;
  protected int kRB;
  protected int kTb;
  protected int kTc;
  protected int kTd;
  protected int kTe;
  protected int kTf;
  protected int kTg;
  protected int kTh;
  protected int kTi;
  protected int kTj;
  protected int kTk;
  protected int kTl;
  protected int kTm;
  protected int kTn;
  protected int kTo;
  protected int kTp;
  protected int kTq;
  protected int kTr;
  protected int kTs;
  protected HashMap<Integer, Long> kTt;
  protected HashMap<Integer, Long> kTu;
  protected long sessionId;
  
  static
  {
    GMTrace.i(5859006480384L, 43653);
    CREATOR = new Parcelable.Creator() {};
    GMTrace.o(5859006480384L, 43653);
  }
  
  public FaceDetectReportInfo()
  {
    GMTrace.i(5858066956288L, 43646);
    this.sessionId = 0L;
    this.kTb = 0;
    this.kTc = 0;
    this.kTd = 0;
    this.kTe = 0;
    this.kTf = 0;
    this.kTg = 0;
    this.kTh = 0;
    this.kTi = 0;
    this.kTj = 0;
    this.kTk = 0;
    this.kTl = 0;
    this.kTm = 0;
    this.kTn = 0;
    this.kTo = 0;
    this.kTp = 0;
    this.kTq = 0;
    this.kRB = 0;
    this.kTr = 0;
    this.kTs = 0;
    this.kTt = new HashMap();
    this.kTu = new HashMap();
    GMTrace.o(5858066956288L, 43646);
  }
  
  protected FaceDetectReportInfo(Parcel paramParcel)
  {
    GMTrace.i(5858201174016L, 43647);
    this.sessionId = 0L;
    this.kTb = 0;
    this.kTc = 0;
    this.kTd = 0;
    this.kTe = 0;
    this.kTf = 0;
    this.kTg = 0;
    this.kTh = 0;
    this.kTi = 0;
    this.kTj = 0;
    this.kTk = 0;
    this.kTl = 0;
    this.kTm = 0;
    this.kTn = 0;
    this.kTo = 0;
    this.kTp = 0;
    this.kTq = 0;
    this.kRB = 0;
    this.kTr = 0;
    this.kTs = 0;
    this.kTt = new HashMap();
    this.kTu = new HashMap();
    this.sessionId = paramParcel.readLong();
    this.kTb = paramParcel.readInt();
    this.kTc = paramParcel.readInt();
    this.kTd = paramParcel.readInt();
    this.kTe = paramParcel.readInt();
    this.kTf = paramParcel.readInt();
    this.kTg = paramParcel.readInt();
    this.kTh = paramParcel.readInt();
    this.kTi = paramParcel.readInt();
    this.kTj = paramParcel.readInt();
    this.kTk = paramParcel.readInt();
    this.kTl = paramParcel.readInt();
    this.kTm = paramParcel.readInt();
    this.kTn = paramParcel.readInt();
    this.kTo = paramParcel.readInt();
    this.kTp = paramParcel.readInt();
    this.kTq = paramParcel.readInt();
    this.kRB = paramParcel.readInt();
    this.kTr = paramParcel.readInt();
    this.kTs = paramParcel.readInt();
    try
    {
      this.kTt = paramParcel.readHashMap(HashMap.class.getClassLoader());
      this.kTu = paramParcel.readHashMap(HashMap.class.getClassLoader());
      GMTrace.o(5858201174016L, 43647);
      return;
    }
    catch (Exception paramParcel)
    {
      w.printErrStackTrace("MicroMsg.FaceDetectReportInfo", paramParcel, "", new Object[0]);
      GMTrace.o(5858201174016L, 43647);
    }
  }
  
  public int describeContents()
  {
    GMTrace.i(5858469609472L, 43649);
    GMTrace.o(5858469609472L, 43649);
    return 0;
  }
  
  public final void np(int paramInt)
  {
    GMTrace.i(5858603827200L, 43650);
    if (paramInt > 0)
    {
      if (paramInt == 1)
      {
        this.kTc += 1;
        GMTrace.o(5858603827200L, 43650);
        return;
      }
      if (paramInt == 2)
      {
        this.kTd += 1;
        GMTrace.o(5858603827200L, 43650);
        return;
      }
      this.kTc += 1;
      GMTrace.o(5858603827200L, 43650);
      return;
    }
    if (paramInt == 0)
    {
      this.kTe += 1;
      GMTrace.o(5858603827200L, 43650);
      return;
    }
    if (paramInt == -11)
    {
      this.kTg += 1;
      GMTrace.o(5858603827200L, 43650);
      return;
    }
    if (paramInt == -12)
    {
      this.kTh += 1;
      GMTrace.o(5858603827200L, 43650);
      return;
    }
    if (paramInt == -13)
    {
      this.kTi += 1;
      GMTrace.o(5858603827200L, 43650);
      return;
    }
    if (paramInt == -101)
    {
      this.kTm += 1;
      GMTrace.o(5858603827200L, 43650);
      return;
    }
    if (paramInt == -102)
    {
      this.kTj += 1;
      GMTrace.o(5858603827200L, 43650);
      return;
    }
    if (paramInt == -103)
    {
      this.kTk += 1;
      GMTrace.o(5858603827200L, 43650);
      return;
    }
    if (paramInt == -105)
    {
      this.kTl += 1;
      GMTrace.o(5858603827200L, 43650);
      return;
    }
    if (paramInt == -106)
    {
      this.kTf += 1;
      GMTrace.o(5858603827200L, 43650);
      return;
    }
    if (paramInt == -107)
    {
      this.kTn += 1;
      GMTrace.o(5858603827200L, 43650);
      return;
    }
    if (paramInt == -108)
    {
      this.kTo += 1;
      GMTrace.o(5858603827200L, 43650);
      return;
    }
    if (paramInt == -109)
    {
      this.kTp += 1;
      GMTrace.o(5858603827200L, 43650);
      return;
    }
    this.kTb += 1;
    GMTrace.o(5858603827200L, 43650);
  }
  
  public final void reset()
  {
    GMTrace.i(5858738044928L, 43651);
    this.sessionId = 0L;
    this.kTc = 0;
    this.kTd = 0;
    this.kTe = 0;
    this.kTb = 0;
    this.kTf = 0;
    this.kTg = 0;
    this.kTh = 0;
    this.kTi = 0;
    this.kTj = 0;
    this.kTk = 0;
    this.kTl = 0;
    this.kTm = 0;
    this.kTn = 0;
    this.kTq = 0;
    this.kRB = 0;
    this.kTr = 0;
    this.kTs = 0;
    this.kTt.clear();
    this.kTu.clear();
    GMTrace.o(5858738044928L, 43651);
  }
  
  public String toString()
  {
    GMTrace.i(5858872262656L, 43652);
    String str = "detectOk: " + this.kTc + ", motionOk: " + this.kTd + ", noFace: " + this.kTe + ", systemErr: " + this.kTb + ", noLiveFace: " + this.kTf + ", tooDark: " + this.kTg + ", tooLight: " + this.kTh + ", backLight: " + this.kTi + ", tooSmall: " + this.kTj + ", tooBig: " + this.kTk + ", tooActive: " + this.kTl + ", poseNotValid: " + this.kTm + ", timeOut: " + this.kTn + ", totalFrame: " + this.kTq + ", verifyTime: " + this.kRB + ", processTimePerFrame: " + this.kTs;
    GMTrace.o(5858872262656L, 43652);
    return str;
  }
  
  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    GMTrace.i(5858335391744L, 43648);
    paramParcel.writeLong(this.sessionId);
    paramParcel.writeInt(this.kTb);
    paramParcel.writeInt(this.kTc);
    paramParcel.writeInt(this.kTd);
    paramParcel.writeInt(this.kTe);
    paramParcel.writeInt(this.kTf);
    paramParcel.writeInt(this.kTg);
    paramParcel.writeInt(this.kTh);
    paramParcel.writeInt(this.kTi);
    paramParcel.writeInt(this.kTj);
    paramParcel.writeInt(this.kTk);
    paramParcel.writeInt(this.kTl);
    paramParcel.writeInt(this.kTm);
    paramParcel.writeInt(this.kTn);
    paramParcel.writeInt(this.kTo);
    paramParcel.writeInt(this.kTp);
    paramParcel.writeInt(this.kTq);
    paramParcel.writeInt(this.kRB);
    paramParcel.writeInt(this.kTr);
    paramParcel.writeInt(this.kTs);
    paramParcel.writeMap(this.kTt);
    paramParcel.writeMap(this.kTu);
    GMTrace.o(5858335391744L, 43648);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\plugin\facedetect\model\FaceDetectReportInfo.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */