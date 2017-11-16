package com.tencent.mm.plugin.card.model;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.protocal.c.am;
import com.tencent.mm.protocal.c.an;
import com.tencent.mm.protocal.c.ao;
import com.tencent.mm.protocal.c.yf;
import java.util.Iterator;
import java.util.LinkedList;

public class CardGiftInfo
  implements Parcelable
{
  public static final Parcelable.Creator<CardGiftInfo> CREATOR;
  public String eRY;
  public String gjg;
  public String jxY;
  public String jxZ;
  public String jyA;
  public LinkedList<AcceptedCardItem> jyB;
  public LinkedList<AccepterItem> jyC;
  public String jyD;
  public int jyE;
  public String jyF;
  public String jyG;
  public String jya;
  public String jyb;
  public String jyc;
  public String jyd;
  public String jye;
  public String jyf;
  public String jyg;
  public String jyh;
  public String jyi;
  public String jyj;
  public String jyk;
  public boolean jyl;
  public int jym;
  public int jyn;
  public int jyo;
  public String jyp;
  public String jyq;
  public int jyr;
  public String jys;
  public String jyt;
  public String jyu;
  public String jyv;
  public String jyw;
  public String jyx;
  public String jyy;
  public String jyz;
  public String toUserName;
  
  static
  {
    GMTrace.i(4902973603840L, 36530);
    CREATOR = new Parcelable.Creator() {};
    GMTrace.o(4902973603840L, 36530);
  }
  
  public CardGiftInfo()
  {
    GMTrace.i(4902034079744L, 36523);
    this.jyB = new LinkedList();
    this.jyC = new LinkedList();
    GMTrace.o(4902034079744L, 36523);
  }
  
  protected CardGiftInfo(Parcel paramParcel)
  {
    GMTrace.i(4902168297472L, 36524);
    this.jyB = new LinkedList();
    this.jyC = new LinkedList();
    this.toUserName = paramParcel.readString();
    this.eRY = paramParcel.readString();
    this.jxY = paramParcel.readString();
    this.jxZ = paramParcel.readString();
    this.jya = paramParcel.readString();
    this.jyb = paramParcel.readString();
    this.jyc = paramParcel.readString();
    this.jyd = paramParcel.readString();
    this.jye = paramParcel.readString();
    this.jyf = paramParcel.readString();
    this.jyg = paramParcel.readString();
    this.jyh = paramParcel.readString();
    this.jyi = paramParcel.readString();
    this.jyj = paramParcel.readString();
    this.jyk = paramParcel.readString();
    this.gjg = paramParcel.readString();
    if (paramParcel.readByte() != 0) {}
    for (boolean bool = true;; bool = false)
    {
      this.jyl = bool;
      this.jym = paramParcel.readInt();
      this.jyn = paramParcel.readInt();
      this.jyo = paramParcel.readInt();
      this.jyp = paramParcel.readString();
      this.jyq = paramParcel.readString();
      this.jyr = paramParcel.readInt();
      this.jys = paramParcel.readString();
      this.jyt = paramParcel.readString();
      this.jyu = paramParcel.readString();
      this.jyv = paramParcel.readString();
      this.jyw = paramParcel.readString();
      this.jyx = paramParcel.readString();
      this.jyy = paramParcel.readString();
      this.jyz = paramParcel.readString();
      this.jyA = paramParcel.readString();
      paramParcel.readTypedList(this.jyB, AcceptedCardItem.CREATOR);
      paramParcel.readTypedList(this.jyC, AccepterItem.CREATOR);
      this.jyD = paramParcel.readString();
      this.jyE = paramParcel.readInt();
      this.jyF = paramParcel.readString();
      this.jyG = paramParcel.readString();
      GMTrace.o(4902168297472L, 36524);
      return;
    }
  }
  
  public static CardGiftInfo a(am paramam)
  {
    GMTrace.i(4902705168384L, 36528);
    CardGiftInfo localCardGiftInfo = new CardGiftInfo();
    localCardGiftInfo.toUserName = paramam.tNR;
    localCardGiftInfo.eRY = paramam.tNS;
    localCardGiftInfo.jxY = paramam.tNT;
    localCardGiftInfo.jxZ = paramam.content;
    localCardGiftInfo.jya = paramam.tNU;
    localCardGiftInfo.jyb = paramam.tNV;
    localCardGiftInfo.jyc = paramam.tNW;
    localCardGiftInfo.jyd = paramam.tNX;
    localCardGiftInfo.jyf = paramam.tNZ;
    localCardGiftInfo.jye = paramam.tNY;
    localCardGiftInfo.jyg = paramam.tOa;
    localCardGiftInfo.jyh = paramam.tOb;
    localCardGiftInfo.jyi = paramam.jyH;
    localCardGiftInfo.jyj = paramam.jyI;
    localCardGiftInfo.jyk = paramam.tOc;
    localCardGiftInfo.gjg = paramam.gjg;
    localCardGiftInfo.jyl = paramam.tOd;
    localCardGiftInfo.jym = paramam.tOe;
    localCardGiftInfo.jyn = paramam.tOf;
    localCardGiftInfo.jyo = paramam.tOg;
    localCardGiftInfo.jyp = paramam.tOh;
    localCardGiftInfo.jyq = paramam.tOi;
    localCardGiftInfo.jyr = paramam.tOj;
    localCardGiftInfo.jys = paramam.tOk;
    localCardGiftInfo.jyt = paramam.tOl;
    localCardGiftInfo.jyu = paramam.tOm;
    localCardGiftInfo.jyv = paramam.tOn;
    localCardGiftInfo.jyw = paramam.tOo;
    localCardGiftInfo.jyx = paramam.tOp;
    localCardGiftInfo.jyy = paramam.tOq;
    localCardGiftInfo.jyz = paramam.jxF;
    localCardGiftInfo.jyA = paramam.tOr;
    Iterator localIterator = paramam.jyB.iterator();
    Object localObject1;
    LinkedList localLinkedList;
    Object localObject2;
    while (localIterator.hasNext())
    {
      localObject1 = (an)localIterator.next();
      localLinkedList = localCardGiftInfo.jyB;
      localObject2 = new AcceptedCardItem();
      ((AcceptedCardItem)localObject2).jyI = ((an)localObject1).jyI;
      ((AcceptedCardItem)localObject2).jyH = ((an)localObject1).jyH;
      localLinkedList.add(localObject2);
    }
    localIterator = paramam.jyC.iterator();
    while (localIterator.hasNext())
    {
      localObject1 = (ao)localIterator.next();
      localLinkedList = localCardGiftInfo.jyC;
      localObject2 = new AccepterItem();
      ((AccepterItem)localObject2).jyI = ((ao)localObject1).jyI;
      ((AccepterItem)localObject2).jyH = ((ao)localObject1).jyH;
      ((AccepterItem)localObject2).jyK = ((ao)localObject1).jyK;
      ((AccepterItem)localObject2).jyJ = ((ao)localObject1).jyJ;
      localLinkedList.add(localObject2);
    }
    localCardGiftInfo.jyD = paramam.jyD;
    localCardGiftInfo.jyE = paramam.jyE;
    localCardGiftInfo.jyF = paramam.jyF;
    localCardGiftInfo.jyG = paramam.jyG;
    GMTrace.o(4902705168384L, 36528);
    return localCardGiftInfo;
  }
  
  public static CardGiftInfo a(yf paramyf)
  {
    GMTrace.i(4902839386112L, 36529);
    CardGiftInfo localCardGiftInfo = new CardGiftInfo();
    localCardGiftInfo.toUserName = paramyf.tNR;
    localCardGiftInfo.eRY = paramyf.tNS;
    localCardGiftInfo.jxY = paramyf.tNT;
    localCardGiftInfo.jxZ = paramyf.content;
    localCardGiftInfo.jya = paramyf.tNU;
    localCardGiftInfo.jyb = paramyf.tNV;
    localCardGiftInfo.jyc = paramyf.tNW;
    localCardGiftInfo.jyd = paramyf.tNX;
    localCardGiftInfo.jyf = paramyf.tNZ;
    localCardGiftInfo.jye = paramyf.tNY;
    localCardGiftInfo.jyg = paramyf.tOa;
    localCardGiftInfo.jyh = paramyf.tOb;
    localCardGiftInfo.jyi = paramyf.jyH;
    localCardGiftInfo.jyj = paramyf.jyI;
    localCardGiftInfo.jyk = paramyf.tOc;
    localCardGiftInfo.gjg = paramyf.gjg;
    localCardGiftInfo.jyl = paramyf.tOd;
    localCardGiftInfo.jym = paramyf.tOe;
    localCardGiftInfo.jyn = paramyf.tOf;
    localCardGiftInfo.jyo = paramyf.tOg;
    localCardGiftInfo.jyp = paramyf.tOh;
    localCardGiftInfo.jyq = paramyf.tOi;
    localCardGiftInfo.jyr = paramyf.tOj;
    localCardGiftInfo.jys = paramyf.tOk;
    localCardGiftInfo.jyt = paramyf.tOl;
    localCardGiftInfo.jyu = paramyf.tOm;
    localCardGiftInfo.jyv = paramyf.tOn;
    localCardGiftInfo.jyw = paramyf.tOo;
    localCardGiftInfo.jyx = paramyf.tOp;
    localCardGiftInfo.jyy = paramyf.tOq;
    localCardGiftInfo.jyz = paramyf.jxF;
    localCardGiftInfo.jyA = paramyf.tOr;
    GMTrace.o(4902839386112L, 36529);
    return localCardGiftInfo;
  }
  
  public int describeContents()
  {
    GMTrace.i(4902302515200L, 36525);
    GMTrace.o(4902302515200L, 36525);
    return 0;
  }
  
  public String toString()
  {
    GMTrace.i(4902570950656L, 36527);
    String str = "CardGiftInfo{toUserName='" + this.toUserName + '\'' + ", fromUserName='" + this.eRY + '\'' + ", fromUserImgUrl='" + this.jxY + '\'' + ", fromUserContent='" + this.jxZ + '\'' + ", fromUserContentPicUrl='" + this.jya + '\'' + ", fromUserContentVideoUrl='" + this.jyb + '\'' + ", fromUserContentThumbPicUrl='" + this.jyc + '\'' + ", picAESKey='" + this.jyd + '\'' + ", videoAESKey='" + this.jye + '\'' + ", thumbVideoAESKey='" + this.jyf + '\'' + ", cardBackgroundPicUrl='" + this.jyg + '\'' + ", cardLogoLUrl='" + this.jyh + '\'' + ", cardTitle='" + this.jyi + '\'' + ", cardPrice='" + this.jyj + '\'' + ", footerWording='" + this.jyk + '\'' + ", color='" + this.gjg + '\'' + ", needJump=" + this.jyl + ", picDataLength=" + this.jym + ", videoDataLength=" + this.jyn + ", thumbDataLength=" + this.jyo + ", descTitle='" + this.jyp + '\'' + ", descIconUrl='" + this.jyq + '\'' + ", descLayoutMode=" + this.jyr + ", giftingMediaTitle='" + this.jys + '\'' + ", descriptionTitleColor='" + this.jyt + '\'' + ", cardTitleColor='" + this.jyu + '\'' + ", cardPriceTitleColor='" + this.jyv + '\'' + ", userCardId='" + this.jyw + '\'' + ", operationTitle='" + this.jyx + '\'' + ", operationUrl='" + this.jyy + '\'' + ", cardTpId='" + this.jyz + '\'' + ", cardCode='" + this.jyA + '\'' + ", accepted_card_list_size='" + this.jyB.size() + '\'' + ", accepter_list_size='" + this.jyC.size() + '\'' + ", accepter_list_title='" + this.jyD + '\'' + ", out_of_card='" + this.jyE + '\'' + ", operation_wxa_username='" + this.jyF + '\'' + ", operation_wxa_path='" + this.jyG + '\'' + '}';
    GMTrace.o(4902570950656L, 36527);
    return str;
  }
  
  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    GMTrace.i(4902436732928L, 36526);
    paramParcel.writeString(this.toUserName);
    paramParcel.writeString(this.eRY);
    paramParcel.writeString(this.jxY);
    paramParcel.writeString(this.jxZ);
    paramParcel.writeString(this.jya);
    paramParcel.writeString(this.jyb);
    paramParcel.writeString(this.jyc);
    paramParcel.writeString(this.jyd);
    paramParcel.writeString(this.jye);
    paramParcel.writeString(this.jyf);
    paramParcel.writeString(this.jyg);
    paramParcel.writeString(this.jyh);
    paramParcel.writeString(this.jyi);
    paramParcel.writeString(this.jyj);
    paramParcel.writeString(this.jyk);
    paramParcel.writeString(this.gjg);
    if (this.jyl) {}
    for (byte b = 1;; b = 0)
    {
      paramParcel.writeByte(b);
      paramParcel.writeInt(this.jym);
      paramParcel.writeInt(this.jyn);
      paramParcel.writeInt(this.jyo);
      paramParcel.writeString(this.jyp);
      paramParcel.writeString(this.jyq);
      paramParcel.writeInt(this.jyr);
      paramParcel.writeString(this.jys);
      paramParcel.writeString(this.jyt);
      paramParcel.writeString(this.jyu);
      paramParcel.writeString(this.jyv);
      paramParcel.writeString(this.jyw);
      paramParcel.writeString(this.jyx);
      paramParcel.writeString(this.jyy);
      paramParcel.writeString(this.jyz);
      paramParcel.writeString(this.jyA);
      paramParcel.writeTypedList(this.jyB);
      paramParcel.writeTypedList(this.jyC);
      paramParcel.writeString(this.jyD);
      paramParcel.writeInt(this.jyE);
      paramParcel.writeString(this.jyF);
      paramParcel.writeString(this.jyG);
      GMTrace.o(4902436732928L, 36526);
      return;
    }
  }
  
  public static class AcceptedCardItem
    implements Parcelable
  {
    public static final Parcelable.Creator<AcceptedCardItem> CREATOR;
    public String jyH;
    public String jyI;
    
    static
    {
      GMTrace.i(17264157917184L, 128628);
      CREATOR = new Parcelable.Creator() {};
      GMTrace.o(17264157917184L, 128628);
    }
    
    public AcceptedCardItem()
    {
      GMTrace.i(17263621046272L, 128624);
      GMTrace.o(17263621046272L, 128624);
    }
    
    public AcceptedCardItem(Parcel paramParcel)
    {
      GMTrace.i(17263755264000L, 128625);
      this.jyH = paramParcel.readString();
      this.jyI = paramParcel.readString();
      GMTrace.o(17263755264000L, 128625);
    }
    
    public int describeContents()
    {
      GMTrace.i(17264023699456L, 128627);
      GMTrace.o(17264023699456L, 128627);
      return 0;
    }
    
    public void writeToParcel(Parcel paramParcel, int paramInt)
    {
      GMTrace.i(17263889481728L, 128626);
      paramParcel.writeString(this.jyH);
      paramParcel.writeString(this.jyI);
      GMTrace.o(17263889481728L, 128626);
    }
  }
  
  public static class AccepterItem
    implements Parcelable
  {
    public static final Parcelable.Creator<AccepterItem> CREATOR;
    public String jyH;
    public String jyI;
    public String jyJ;
    public String jyK;
    
    static
    {
      GMTrace.i(17262949957632L, 128619);
      CREATOR = new Parcelable.Creator() {};
      GMTrace.o(17262949957632L, 128619);
    }
    
    public AccepterItem()
    {
      GMTrace.i(17262413086720L, 128615);
      GMTrace.o(17262413086720L, 128615);
    }
    
    public AccepterItem(Parcel paramParcel)
    {
      GMTrace.i(17262547304448L, 128616);
      this.jyH = paramParcel.readString();
      this.jyI = paramParcel.readString();
      this.jyJ = paramParcel.readString();
      this.jyK = paramParcel.readString();
      GMTrace.o(17262547304448L, 128616);
    }
    
    public int describeContents()
    {
      GMTrace.i(17262815739904L, 128618);
      GMTrace.o(17262815739904L, 128618);
      return 0;
    }
    
    public void writeToParcel(Parcel paramParcel, int paramInt)
    {
      GMTrace.i(17262681522176L, 128617);
      paramParcel.writeString(this.jyH);
      paramParcel.writeString(this.jyI);
      paramParcel.writeString(this.jyJ);
      paramParcel.writeString(this.jyK);
      GMTrace.o(17262681522176L, 128617);
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\plugin\card\model\CardGiftInfo.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */