package com.tencent.mm.plugin.sns.data;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import com.tencent.gmtrace.GMTrace;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class SnsTagList
  implements Parcelable
{
  public static final Parcelable.Creator<SnsTagList> CREATOR;
  public int ppj;
  public List<Long> ppk;
  
  static
  {
    GMTrace.i(8785892474880L, 65460);
    CREATOR = new Parcelable.Creator() {};
    GMTrace.o(8785892474880L, 65460);
  }
  
  public SnsTagList()
  {
    GMTrace.i(8785087168512L, 65454);
    this.ppj = 0;
    this.ppk = new LinkedList();
    GMTrace.o(8785087168512L, 65454);
  }
  
  public int describeContents()
  {
    GMTrace.i(8785221386240L, 65455);
    GMTrace.o(8785221386240L, 65455);
    return 0;
  }
  
  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    GMTrace.i(8785355603968L, 65456);
    this.ppj = this.ppk.size();
    paramParcel.writeInt(this.ppj);
    Iterator localIterator = this.ppk.iterator();
    while (localIterator.hasNext()) {
      paramParcel.writeLong(((Long)localIterator.next()).longValue());
    }
    GMTrace.o(8785355603968L, 65456);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\plugin\sns\data\SnsTagList.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */