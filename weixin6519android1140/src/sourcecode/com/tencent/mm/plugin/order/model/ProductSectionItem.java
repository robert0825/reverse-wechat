package com.tencent.mm.plugin.order.model;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import com.tencent.gmtrace.GMTrace;
import java.util.ArrayList;
import java.util.List;

public class ProductSectionItem
  implements Parcelable
{
  public static final Parcelable.Creator<ProductSectionItem> CREATER;
  public int count;
  public String iconUrl;
  public String jumpUrl;
  public List<Skus> nFE;
  public String nFF;
  public String nFG;
  public String name;
  public int scene;
  
  static
  {
    GMTrace.i(6624450183168L, 49356);
    CREATER = new Parcelable.Creator() {};
    GMTrace.o(6624450183168L, 49356);
  }
  
  public ProductSectionItem()
  {
    GMTrace.i(6623913312256L, 49352);
    GMTrace.o(6623913312256L, 49352);
  }
  
  public ProductSectionItem(Parcel paramParcel)
  {
    GMTrace.i(6624047529984L, 49353);
    this.iconUrl = paramParcel.readString();
    this.name = paramParcel.readString();
    int j = paramParcel.readInt();
    if (j > 0)
    {
      this.nFE = new ArrayList();
      int i = 0;
      while (i < j)
      {
        Skus localSkus = new Skus();
        localSkus.amf = paramParcel.readString();
        localSkus.value = paramParcel.readString();
        this.nFE.add(localSkus);
        i += 1;
      }
    }
    this.count = paramParcel.readInt();
    this.nFF = paramParcel.readString();
    this.jumpUrl = paramParcel.readString();
    this.nFG = paramParcel.readString();
    this.scene = paramParcel.readInt();
    GMTrace.o(6624047529984L, 49353);
  }
  
  public int describeContents()
  {
    GMTrace.i(6624181747712L, 49354);
    GMTrace.o(6624181747712L, 49354);
    return 0;
  }
  
  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    GMTrace.i(6624315965440L, 49355);
    paramParcel.writeString(this.iconUrl);
    paramParcel.writeString(this.name);
    if (this.nFE != null)
    {
      paramParcel.writeInt(this.nFE.size());
      paramInt = 0;
      while (paramInt < this.nFE.size())
      {
        Skus localSkus = (Skus)this.nFE.get(paramInt);
        paramParcel.writeString(localSkus.amf);
        paramParcel.writeString(localSkus.value);
        paramInt += 1;
      }
    }
    paramParcel.writeInt(0);
    paramParcel.writeInt(this.count);
    paramParcel.writeString(this.nFF);
    paramParcel.writeString(this.jumpUrl);
    paramParcel.writeString(this.nFG);
    paramParcel.writeInt(this.scene);
    GMTrace.o(6624315965440L, 49355);
  }
  
  public static class Skus
    implements Parcelable
  {
    public static final Parcelable.Creator<Skus> CREATER;
    public String amf;
    public String value;
    
    static
    {
      GMTrace.i(6629684674560L, 49395);
      CREATER = new Parcelable.Creator() {};
      GMTrace.o(6629684674560L, 49395);
    }
    
    public Skus()
    {
      GMTrace.i(6629013585920L, 49390);
      GMTrace.o(6629013585920L, 49390);
    }
    
    public Skus(Parcel paramParcel)
    {
      GMTrace.i(6629147803648L, 49391);
      this.amf = paramParcel.readString();
      this.value = paramParcel.readString();
      GMTrace.o(6629147803648L, 49391);
    }
    
    public static String aZ(List<Skus> paramList)
    {
      GMTrace.i(6629550456832L, 49394);
      if ((paramList == null) || (paramList.size() == 0))
      {
        GMTrace.o(6629550456832L, 49394);
        return "";
      }
      StringBuilder localStringBuilder = new StringBuilder();
      int i = 0;
      while (i < paramList.size())
      {
        Skus localSkus = (Skus)paramList.get(i);
        if (i != 0) {
          localStringBuilder.append("、");
        }
        localStringBuilder.append(localSkus.value);
        i += 1;
      }
      paramList = localStringBuilder.toString();
      GMTrace.o(6629550456832L, 49394);
      return paramList;
    }
    
    public int describeContents()
    {
      GMTrace.i(6629282021376L, 49392);
      GMTrace.o(6629282021376L, 49392);
      return 0;
    }
    
    public void writeToParcel(Parcel paramParcel, int paramInt)
    {
      GMTrace.i(6629416239104L, 49393);
      paramParcel.writeString(this.amf);
      paramParcel.writeString(this.value);
      GMTrace.o(6629416239104L, 49393);
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\plugin\order\model\ProductSectionItem.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */