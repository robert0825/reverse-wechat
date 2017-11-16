package com.tencent.mm.plugin.shake.b;

import android.content.ContentValues;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.g.b.cu;
import com.tencent.mm.protocal.c.azp;
import com.tencent.mm.protocal.c.bdd;
import com.tencent.mm.protocal.c.bgm;
import com.tencent.mm.sdk.e.c.a;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.storage.RegionCodeDecoder;
import java.lang.reflect.Field;
import java.util.Map;

public final class d
  extends cu
{
  protected static c.a fTp;
  public int eQl;
  private azp oMq;
  public int scene;
  
  static
  {
    GMTrace.i(6501775179776L, 48442);
    c.a locala = new c.a();
    locala.gZM = new Field[20];
    locala.columns = new String[21];
    StringBuilder localStringBuilder = new StringBuilder();
    locala.columns[0] = "shakeItemID";
    locala.vmt.put("shakeItemID", "INTEGER default '0'  PRIMARY KEY ");
    localStringBuilder.append(" shakeItemID INTEGER default '0'  PRIMARY KEY ");
    localStringBuilder.append(", ");
    locala.vms = "shakeItemID";
    locala.columns[1] = "username";
    locala.vmt.put("username", "TEXT");
    localStringBuilder.append(" username TEXT");
    localStringBuilder.append(", ");
    locala.columns[2] = "nickname";
    locala.vmt.put("nickname", "TEXT");
    localStringBuilder.append(" nickname TEXT");
    localStringBuilder.append(", ");
    locala.columns[3] = "province";
    locala.vmt.put("province", "TEXT");
    localStringBuilder.append(" province TEXT");
    localStringBuilder.append(", ");
    locala.columns[4] = "city";
    locala.vmt.put("city", "TEXT");
    localStringBuilder.append(" city TEXT");
    localStringBuilder.append(", ");
    locala.columns[5] = "signature";
    locala.vmt.put("signature", "TEXT");
    localStringBuilder.append(" signature TEXT");
    localStringBuilder.append(", ");
    locala.columns[6] = "distance";
    locala.vmt.put("distance", "TEXT");
    localStringBuilder.append(" distance TEXT");
    localStringBuilder.append(", ");
    locala.columns[7] = "sex";
    locala.vmt.put("sex", "INTEGER");
    localStringBuilder.append(" sex INTEGER");
    localStringBuilder.append(", ");
    locala.columns[8] = "imgstatus";
    locala.vmt.put("imgstatus", "INTEGER");
    localStringBuilder.append(" imgstatus INTEGER");
    localStringBuilder.append(", ");
    locala.columns[9] = "hasHDImg";
    locala.vmt.put("hasHDImg", "INTEGER");
    localStringBuilder.append(" hasHDImg INTEGER");
    localStringBuilder.append(", ");
    locala.columns[10] = "insertBatch";
    locala.vmt.put("insertBatch", "INTEGER");
    localStringBuilder.append(" insertBatch INTEGER");
    localStringBuilder.append(", ");
    locala.columns[11] = "reserved1";
    locala.vmt.put("reserved1", "INTEGER");
    localStringBuilder.append(" reserved1 INTEGER");
    localStringBuilder.append(", ");
    locala.columns[12] = "reserved2";
    locala.vmt.put("reserved2", "INTEGER");
    localStringBuilder.append(" reserved2 INTEGER");
    localStringBuilder.append(", ");
    locala.columns[13] = "reserved3";
    locala.vmt.put("reserved3", "TEXT");
    localStringBuilder.append(" reserved3 TEXT");
    localStringBuilder.append(", ");
    locala.columns[14] = "reserved4";
    locala.vmt.put("reserved4", "TEXT");
    localStringBuilder.append(" reserved4 TEXT");
    localStringBuilder.append(", ");
    locala.columns[15] = "type";
    locala.vmt.put("type", "INTEGER");
    localStringBuilder.append(" type INTEGER");
    localStringBuilder.append(", ");
    locala.columns[16] = "lvbuffer";
    locala.vmt.put("lvbuffer", "BLOB");
    localStringBuilder.append(" lvbuffer BLOB");
    localStringBuilder.append(", ");
    locala.columns[17] = "regionCode";
    locala.vmt.put("regionCode", "TEXT");
    localStringBuilder.append(" regionCode TEXT");
    localStringBuilder.append(", ");
    locala.columns[18] = "snsFlag";
    locala.vmt.put("snsFlag", "INTEGER");
    localStringBuilder.append(" snsFlag INTEGER");
    localStringBuilder.append(", ");
    locala.columns[19] = "sns_bgurl";
    locala.vmt.put("sns_bgurl", "TEXT");
    localStringBuilder.append(" sns_bgurl TEXT");
    locala.columns[20] = "rowid";
    locala.vmu = localStringBuilder.toString();
    fTp = locala;
    GMTrace.o(6501775179776L, 48442);
  }
  
  public d()
  {
    GMTrace.i(6500969873408L, 48436);
    this.eQl = -1;
    this.field_insertBatch = 2;
    GMTrace.o(6500969873408L, 48436);
  }
  
  public d(bdd parambdd)
  {
    GMTrace.i(6501104091136L, 48437);
    this.eQl = -1;
    this.field_username = parambdd.jhi;
    this.field_nickname = parambdd.jio;
    this.field_signature = parambdd.gCA;
    this.field_distance = parambdd.uAu;
    this.field_reserved4 = String.valueOf(parambdd.uPi);
    this.field_sex = parambdd.gCx;
    this.field_imgstatus = parambdd.tPZ;
    this.field_hasHDImg = parambdd.uPg;
    this.field_reserved1 = parambdd.uAv;
    this.field_reserved3 = parambdd.uAw;
    this.field_insertBatch = 2;
    if (parambdd.uAB != null)
    {
      this.field_snsFlag = parambdd.uAB.gCI;
      this.field_sns_bgurl = parambdd.uAB.gCJ;
    }
    this.oMq = parambdd.uPh;
    this.field_province = parambdd.gCy;
    this.field_city = parambdd.gCz;
    this.field_regionCode = RegionCodeDecoder.ai(parambdd.gCG, this.field_province, this.field_city);
    GMTrace.o(6501104091136L, 48437);
  }
  
  private int beY()
  {
    GMTrace.i(6501506744320L, 48440);
    try
    {
      int i = Integer.valueOf(this.field_reserved4).intValue();
      return i;
    }
    finally
    {
      GMTrace.o(6501506744320L, 48440);
    }
    return 0;
  }
  
  public final String getCity()
  {
    GMTrace.i(6501372526592L, 48439);
    Object localObject;
    if (!bg.nm(this.field_regionCode))
    {
      localObject = this.field_regionCode.split("_");
      if (localObject.length > 0)
      {
        if (localObject.length <= 2) {
          break label76;
        }
        this.field_city = RegionCodeDecoder.bUl().aj(localObject[0], localObject[1], localObject[2]);
      }
    }
    for (;;)
    {
      localObject = this.field_city;
      GMTrace.o(6501372526592L, 48439);
      return (String)localObject;
      label76:
      if (localObject.length == 2) {
        this.field_city = RegionCodeDecoder.bUl().fg(localObject[0], localObject[1]);
      } else {
        this.field_city = "";
      }
    }
  }
  
  public final String getProvince()
  {
    GMTrace.i(6501238308864L, 48438);
    Object localObject;
    if (!bg.nm(this.field_regionCode))
    {
      localObject = this.field_regionCode.split("_");
      if (localObject.length > 0) {
        if ((localObject.length <= 2) || (!localObject[0].equalsIgnoreCase("cn"))) {
          break label85;
        }
      }
    }
    label85:
    for (this.field_province = RegionCodeDecoder.bUl().fg(localObject[0], localObject[1]);; this.field_province = RegionCodeDecoder.bUl().Uv(localObject[0]))
    {
      localObject = this.field_province;
      GMTrace.o(6501238308864L, 48438);
      return (String)localObject;
    }
  }
  
  public final ContentValues qL()
  {
    GMTrace.i(6501640962048L, 48441);
    ContentValues localContentValues = new ContentValues();
    if ((this.eQl & 0x2) != 0) {
      localContentValues.put("username", this.field_username);
    }
    if ((this.eQl & 0x4) != 0) {
      localContentValues.put("nickname", this.field_nickname);
    }
    if ((this.eQl & 0x8) != 0) {
      localContentValues.put("province", getProvince());
    }
    if ((this.eQl & 0x10) != 0) {
      localContentValues.put("city", getCity());
    }
    if ((this.eQl & 0x20) != 0) {
      localContentValues.put("signature", this.field_signature);
    }
    if ((this.eQl & 0x40) != 0) {
      localContentValues.put("distance", this.field_distance);
    }
    if ((this.eQl & 0x80) != 0) {
      localContentValues.put("sex", Integer.valueOf(this.field_sex));
    }
    if ((this.eQl & 0x100) != 0) {
      localContentValues.put("imgstatus", Integer.valueOf(this.field_imgstatus));
    }
    if ((this.eQl & 0x200) != 0) {
      localContentValues.put("hasHDImg", Integer.valueOf(this.field_hasHDImg));
    }
    if ((this.eQl & 0x400) != 0) {
      localContentValues.put("insertBatch", Integer.valueOf(this.field_insertBatch));
    }
    if ((this.eQl & 0x800) != 0) {
      localContentValues.put("reserved1", Integer.valueOf(this.field_reserved1));
    }
    if ((this.eQl & 0x1000) != 0) {
      localContentValues.put("reserved2", Integer.valueOf(this.field_reserved2));
    }
    if ((this.eQl & 0x2000) != 0) {
      localContentValues.put("reserved3", this.field_reserved3);
    }
    if ((this.eQl & 0x4000) != 0) {
      localContentValues.put("reserved4", Integer.valueOf(beY()));
    }
    if ((this.eQl & 0x8000) != 0) {
      localContentValues.put("type", Integer.valueOf(this.field_type));
    }
    if ((this.eQl & 0x10000) != 0) {
      localContentValues.put("lvbuffer", this.field_lvbuffer);
    }
    if ((this.eQl & 0x20000) != 0) {
      localContentValues.put("regionCode", this.field_regionCode);
    }
    if ((this.eQl & 0x40000) != 0) {
      localContentValues.put("snsFlag", Integer.valueOf(this.field_snsFlag));
    }
    if ((this.eQl & 0x80000) != 0) {
      localContentValues.put("sns_bgurl", this.field_sns_bgurl);
    }
    GMTrace.o(6501640962048L, 48441);
    return localContentValues;
  }
  
  protected final c.a uw()
  {
    GMTrace.i(6500835655680L, 48435);
    c.a locala = fTp;
    GMTrace.o(6500835655680L, 48435);
    return locala;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\plugin\shake\b\d.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */