package com.tencent.mm.modelsimple;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import com.tencent.gmtrace.GMTrace;

public class BindWordingContent
  implements Parcelable
{
  public static final Parcelable.Creator<BindWordingContent> CREATOR;
  public String content;
  public Integer gTy;
  public String title;
  
  static
  {
    GMTrace.i(13162195714048L, 98066);
    CREATOR = new Parcelable.Creator() {};
    GMTrace.o(13162195714048L, 98066);
  }
  
  public BindWordingContent(Parcel paramParcel)
  {
    GMTrace.i(13161793060864L, 98063);
    this.title = "";
    this.content = "";
    this.gTy = Integer.valueOf(0);
    String[] arrayOfString = new String[2];
    paramParcel.readStringArray(arrayOfString);
    this.title = arrayOfString[0];
    this.content = arrayOfString[1];
    this.gTy = Integer.valueOf(paramParcel.readInt());
    GMTrace.o(13161793060864L, 98063);
  }
  
  public BindWordingContent(String paramString1, String paramString2)
  {
    GMTrace.i(13161658843136L, 98062);
    this.title = "";
    this.content = "";
    this.gTy = Integer.valueOf(0);
    this.title = paramString1;
    this.content = paramString2;
    GMTrace.o(13161658843136L, 98062);
  }
  
  public int describeContents()
  {
    GMTrace.i(13161927278592L, 98064);
    GMTrace.o(13161927278592L, 98064);
    return 0;
  }
  
  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    GMTrace.i(13162061496320L, 98065);
    paramParcel.writeStringArray(new String[] { this.title, this.content });
    paramParcel.writeInt(this.gTy.intValue());
    GMTrace.o(13162061496320L, 98065);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\modelsimple\BindWordingContent.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */