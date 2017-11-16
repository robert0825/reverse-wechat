package com.tencent.mm.plugin.webview.wepkg.model;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.plugin.webview.wepkg.a.a;
import org.json.JSONException;
import org.json.JSONObject;

public class WepkgPreloadFile
  implements Parcelable
{
  public static final Parcelable.Creator<WepkgPreloadFile> CREATOR;
  public String amf;
  public String downloadUrl;
  public String eDW;
  public String filePath;
  public long hcs;
  public String mimeType;
  public String rYG;
  public boolean rYH;
  public String rYr;
  public int rYt;
  public int size;
  public String version;
  
  static
  {
    GMTrace.i(15188078100480L, 113160);
    CREATOR = new Parcelable.Creator() {};
    GMTrace.o(15188078100480L, 113160);
  }
  
  public WepkgPreloadFile()
  {
    GMTrace.i(15187407011840L, 113155);
    GMTrace.o(15187407011840L, 113155);
  }
  
  public WepkgPreloadFile(Parcel paramParcel)
  {
    GMTrace.i(15187541229568L, 113156);
    this.amf = paramParcel.readString();
    this.rYG = paramParcel.readString();
    this.version = paramParcel.readString();
    this.filePath = paramParcel.readString();
    this.rYr = paramParcel.readString();
    this.mimeType = paramParcel.readString();
    this.eDW = paramParcel.readString();
    this.downloadUrl = paramParcel.readString();
    this.size = paramParcel.readInt();
    this.rYt = paramParcel.readInt();
    if (paramParcel.readByte() != 0) {}
    for (boolean bool = true;; bool = false)
    {
      this.rYH = bool;
      this.hcs = paramParcel.readLong();
      GMTrace.o(15187541229568L, 113156);
      return;
    }
  }
  
  public final void a(a parama)
  {
    GMTrace.i(15187675447296L, 113157);
    if (parama != null)
    {
      this.amf = parama.field_key;
      this.rYG = parama.field_pkgId;
      this.version = parama.field_version;
      this.filePath = parama.field_filePath;
      this.rYr = parama.field_rid;
      this.mimeType = parama.field_mimeType;
      this.eDW = parama.field_md5;
      this.downloadUrl = parama.field_downloadUrl;
      this.size = parama.field_size;
      this.rYt = parama.field_downloadNetType;
      this.rYH = parama.field_completeDownload;
      this.hcs = parama.field_createTime;
    }
    GMTrace.o(15187675447296L, 113157);
  }
  
  public final JSONObject bGo()
  {
    GMTrace.i(16002645491712L, 119229);
    JSONObject localJSONObject = new JSONObject();
    try
    {
      localJSONObject.put("key", this.amf);
      localJSONObject.put("pkgId", this.rYG);
      localJSONObject.put("version", this.version);
      localJSONObject.put("filePath", this.filePath);
      localJSONObject.put("rid", this.rYr);
      localJSONObject.put("mimeType", this.mimeType);
      localJSONObject.put("md5", this.eDW);
      localJSONObject.put("downloadUrl", this.downloadUrl);
      localJSONObject.put("size", this.size);
      localJSONObject.put("downloadNetType", this.rYt);
      localJSONObject.put("completeDownload", this.rYH);
      localJSONObject.put("createTime", this.hcs);
      GMTrace.o(16002645491712L, 119229);
      return localJSONObject;
    }
    catch (JSONException localJSONException)
    {
      for (;;) {}
    }
  }
  
  public int describeContents()
  {
    GMTrace.i(15187809665024L, 113158);
    GMTrace.o(15187809665024L, 113158);
    return 0;
  }
  
  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    GMTrace.i(15187943882752L, 113159);
    paramParcel.writeString(this.amf);
    paramParcel.writeString(this.rYG);
    paramParcel.writeString(this.version);
    paramParcel.writeString(this.filePath);
    paramParcel.writeString(this.rYr);
    paramParcel.writeString(this.mimeType);
    paramParcel.writeString(this.eDW);
    paramParcel.writeString(this.downloadUrl);
    paramParcel.writeInt(this.size);
    paramParcel.writeInt(this.rYt);
    if (this.rYH) {}
    for (paramInt = 1;; paramInt = 0)
    {
      paramParcel.writeByte((byte)paramInt);
      paramParcel.writeLong(this.hcs);
      GMTrace.o(15187943882752L, 113159);
      return;
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\plugin\webview\wepkg\model\WepkgPreloadFile.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */