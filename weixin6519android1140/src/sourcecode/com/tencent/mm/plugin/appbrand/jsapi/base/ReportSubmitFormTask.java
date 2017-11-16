package com.tencent.mm.plugin.appbrand.jsapi.base;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.ad.b;
import com.tencent.mm.ad.b.a;
import com.tencent.mm.ad.b.b;
import com.tencent.mm.ad.k;
import com.tencent.mm.ad.u;
import com.tencent.mm.ad.u.a;
import com.tencent.mm.kernel.e;
import com.tencent.mm.kernel.h;
import com.tencent.mm.plugin.appbrand.a;
import com.tencent.mm.plugin.appbrand.appcache.WxaPkgWrappingInfo;
import com.tencent.mm.plugin.appbrand.config.AppBrandSysConfig;
import com.tencent.mm.plugin.appbrand.ipc.MainProcessTask;
import com.tencent.mm.protocal.c.bvg;
import com.tencent.mm.protocal.c.fl;
import com.tencent.mm.protocal.c.fm;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.storage.t;
import com.tencent.mm.storage.w.a;
import java.util.Iterator;
import java.util.LinkedList;
import org.json.JSONArray;
import org.json.JSONObject;

public class ReportSubmitFormTask
  extends MainProcessTask
{
  public static final Parcelable.Creator<ReportSubmitFormTask> CREATOR;
  public String appId;
  public int eAu;
  public String ePf;
  public int eVc;
  public String icJ;
  public int type;
  
  static
  {
    GMTrace.i(10458916454400L, 77925);
    CREATOR = new Parcelable.Creator() {};
    GMTrace.o(10458916454400L, 77925);
  }
  
  public ReportSubmitFormTask()
  {
    GMTrace.i(10457976930304L, 77918);
    GMTrace.o(10457976930304L, 77918);
  }
  
  public ReportSubmitFormTask(String paramString)
  {
    GMTrace.i(10458111148032L, 77919);
    this.appId = paramString;
    this.eAu = a.nK(paramString).hRg.hKB;
    this.eVc = a.nK(paramString).hRg.hKC;
    GMTrace.o(10458111148032L, 77919);
  }
  
  static LinkedList<bvg> Wp()
  {
    GMTrace.i(10458379583488L, 77921);
    localLinkedList = new LinkedList();
    Object localObject = (String)h.xy().xh().get(w.a.vvp, null);
    try
    {
      localObject = new JSONArray((String)localObject);
      int i = 0;
      while (i < ((JSONArray)localObject).length())
      {
        JSONObject localJSONObject = ((JSONArray)localObject).getJSONObject(i);
        bvg localbvg = new bvg();
        localbvg.type = localJSONObject.getInt("type");
        localbvg.eSd = localJSONObject.getString("appid");
        localbvg.vdz = localJSONObject.getString("formid");
        localbvg.vdA = localJSONObject.getString("pageid");
        localbvg.vdB = localJSONObject.getInt("appstate");
        localbvg.vdC = localJSONObject.getInt("appversion");
        localLinkedList.add(localbvg);
        i += 1;
      }
      return localLinkedList;
    }
    catch (Exception localException)
    {
      w.e("MicroMsg.ReportSubmitFormTask", localException.getMessage());
      h.xy().xh().a(w.a.vvp, "");
      GMTrace.o(10458379583488L, 77921);
    }
  }
  
  public final void RY()
  {
    GMTrace.i(10458245365760L, 77920);
    Object localObject1 = new b.a();
    ((b.a)localObject1).gtF = new fl();
    ((b.a)localObject1).gtG = new fm();
    ((b.a)localObject1).uri = "/cgi-bin/mmbiz-bin/wxausrevent/batchrecordwxatemplatemsgevent";
    ((b.a)localObject1).gtE = 1129;
    localObject1 = ((b.a)localObject1).DA();
    final fl localfl = (fl)((b)localObject1).gtC.gtK;
    localfl.tTS = new LinkedList();
    ??? = new bvg();
    ((bvg)???).type = this.type;
    ((bvg)???).eSd = this.appId;
    ((bvg)???).vdz = this.icJ;
    ((bvg)???).vdA = this.ePf;
    ((bvg)???).vdB = this.eAu;
    ((bvg)???).vdC = this.eVc;
    localfl.tTS.add(???);
    synchronized (getClass())
    {
      localfl.tTS.addAll(Wp());
      u.a((b)localObject1, new u.a()
      {
        public final int a(int paramAnonymousInt1, int paramAnonymousInt2, String arg3, b paramAnonymousb, k paramAnonymousk)
        {
          GMTrace.i(10457305841664L, 77913);
          if ((paramAnonymousInt1 != 0) || (paramAnonymousInt2 != 0))
          {
            synchronized (ReportSubmitFormTask.this.getClass())
            {
              paramAnonymousk = localfl.tTS;
              paramAnonymousk.addAll(ReportSubmitFormTask.Wp());
              paramAnonymousb = new JSONArray();
              paramAnonymousk = paramAnonymousk.iterator();
              for (;;)
              {
                if (paramAnonymousk.hasNext())
                {
                  bvg localbvg = (bvg)paramAnonymousk.next();
                  JSONObject localJSONObject = new JSONObject();
                  try
                  {
                    localJSONObject.put("type", localbvg.type);
                    localJSONObject.put("appid", localbvg.eSd);
                    localJSONObject.put("formid", localbvg.vdz);
                    localJSONObject.put("pageid", localbvg.vdA);
                    localJSONObject.put("appstate", localbvg.vdB);
                    localJSONObject.put("appversion", localbvg.vdC);
                    paramAnonymousb.put(localJSONObject);
                  }
                  catch (Exception localException)
                  {
                    w.e("MicroMsg.ReportSubmitFormTask", localException.getMessage());
                  }
                }
              }
            }
            h.xy().xh().a(w.a.vvp, paramAnonymousb.toString());
            w.e("MicroMsg.ReportSubmitFormTask", "Error: %d, %d", new Object[] { Integer.valueOf(paramAnonymousInt1), Integer.valueOf(paramAnonymousInt2) });
            GMTrace.o(10457305841664L, 77913);
            return 0;
          }
          GMTrace.o(10457305841664L, 77913);
          return 0;
        }
      });
      GMTrace.o(10458245365760L, 77920);
      return;
    }
  }
  
  public final void f(Parcel paramParcel)
  {
    GMTrace.i(10458648018944L, 77923);
    this.type = paramParcel.readInt();
    this.appId = paramParcel.readString();
    this.icJ = paramParcel.readString();
    this.ePf = paramParcel.readString();
    this.eAu = paramParcel.readInt();
    this.eVc = paramParcel.readInt();
    GMTrace.o(10458648018944L, 77923);
  }
  
  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    GMTrace.i(10458513801216L, 77922);
    paramParcel.writeInt(this.type);
    paramParcel.writeString(this.appId);
    paramParcel.writeString(this.icJ);
    paramParcel.writeString(this.ePf);
    paramParcel.writeInt(this.eAu);
    paramParcel.writeInt(this.eVc);
    GMTrace.o(10458513801216L, 77922);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\plugin\appbrand\jsapi\base\ReportSubmitFormTask.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */