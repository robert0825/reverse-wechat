package com.tencent.mm.plugin.sns.data;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import com.tencent.gmtrace.GMTrace;
import java.util.LinkedList;
import java.util.List;

public class SnsCmdList
  implements Parcelable
{
  public static final Parcelable.Creator<SnsCmdList> CREATOR;
  public int ppc;
  public int ppd;
  public List<Integer> ppe;
  public List<Integer> ppf;
  
  static
  {
    GMTrace.i(8783879208960L, 65445);
    CREATOR = new Parcelable.Creator() {};
    GMTrace.o(8783879208960L, 65445);
  }
  
  public SnsCmdList()
  {
    GMTrace.i(8782402813952L, 65434);
    this.ppc = 0;
    this.ppd = 0;
    this.ppe = new LinkedList();
    this.ppf = new LinkedList();
    GMTrace.o(8782402813952L, 65434);
  }
  
  public int describeContents()
  {
    GMTrace.i(8782805467136L, 65437);
    GMTrace.o(8782805467136L, 65437);
    return 0;
  }
  
  public final void uf(int paramInt)
  {
    GMTrace.i(8782537031680L, 65435);
    this.ppe.add(Integer.valueOf(paramInt));
    GMTrace.o(8782537031680L, 65435);
  }
  
  public final void ug(int paramInt)
  {
    GMTrace.i(8782671249408L, 65436);
    this.ppf.add(Integer.valueOf(paramInt));
    GMTrace.o(8782671249408L, 65436);
  }
  
  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    int i = 0;
    GMTrace.i(8782939684864L, 65438);
    this.ppc = this.ppe.size();
    paramParcel.writeInt(this.ppc);
    paramInt = 0;
    while (paramInt < this.ppc)
    {
      paramParcel.writeInt(((Integer)this.ppe.get(paramInt)).intValue());
      paramInt += 1;
    }
    this.ppd = this.ppf.size();
    paramParcel.writeInt(this.ppd);
    paramInt = i;
    while (paramInt < this.ppd)
    {
      paramParcel.writeInt(((Integer)this.ppf.get(paramInt)).intValue());
      paramInt += 1;
    }
    GMTrace.o(8782939684864L, 65438);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\plugin\sns\data\SnsCmdList.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */