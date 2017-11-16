package com.tencent.mm.plugin.welab.c.a;

import android.content.res.Resources;
import android.text.TextUtils;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.g.b.ca;
import com.tencent.mm.sdk.e.c.a;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.v;
import com.tencent.mm.sdk.platformtools.w;
import java.lang.reflect.Field;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

public class a
  extends ca
{
  public static c.a fTp;
  private static final List<String> saR;
  private Map<String, Field> saQ;
  
  static
  {
    GMTrace.i(15664551034880L, 116710);
    c.a locala = new c.a();
    locala.gZM = new Field[45];
    locala.columns = new String[46];
    StringBuilder localStringBuilder = new StringBuilder();
    locala.columns[0] = "LabsAppId";
    locala.vmt.put("LabsAppId", "TEXT PRIMARY KEY ");
    localStringBuilder.append(" LabsAppId TEXT PRIMARY KEY ");
    localStringBuilder.append(", ");
    locala.vms = "LabsAppId";
    locala.columns[1] = "expId";
    locala.vmt.put("expId", "TEXT default '' ");
    localStringBuilder.append(" expId TEXT default '' ");
    localStringBuilder.append(", ");
    locala.columns[2] = "Type";
    locala.vmt.put("Type", "INTEGER default '0' ");
    localStringBuilder.append(" Type INTEGER default '0' ");
    localStringBuilder.append(", ");
    locala.columns[3] = "BizType";
    locala.vmt.put("BizType", "INTEGER default '0' ");
    localStringBuilder.append(" BizType INTEGER default '0' ");
    localStringBuilder.append(", ");
    locala.columns[4] = "Switch";
    locala.vmt.put("Switch", "INTEGER default '0' ");
    localStringBuilder.append(" Switch INTEGER default '0' ");
    localStringBuilder.append(", ");
    locala.columns[5] = "AllVer";
    locala.vmt.put("AllVer", "INTEGER default '0' ");
    localStringBuilder.append(" AllVer INTEGER default '0' ");
    localStringBuilder.append(", ");
    locala.columns[6] = "DetailURL";
    locala.vmt.put("DetailURL", "TEXT");
    localStringBuilder.append(" DetailURL TEXT");
    localStringBuilder.append(", ");
    locala.columns[7] = "WeAppUser";
    locala.vmt.put("WeAppUser", "TEXT");
    localStringBuilder.append(" WeAppUser TEXT");
    localStringBuilder.append(", ");
    locala.columns[8] = "WeAppPath";
    locala.vmt.put("WeAppPath", "TEXT");
    localStringBuilder.append(" WeAppPath TEXT");
    localStringBuilder.append(", ");
    locala.columns[9] = "Pos";
    locala.vmt.put("Pos", "INTEGER default '0' ");
    localStringBuilder.append(" Pos INTEGER default '0' ");
    localStringBuilder.append(", ");
    locala.columns[10] = "TitleKey_android";
    locala.vmt.put("TitleKey_android", "TEXT");
    localStringBuilder.append(" TitleKey_android TEXT");
    localStringBuilder.append(", ");
    locala.columns[11] = "Title_cn";
    locala.vmt.put("Title_cn", "TEXT");
    localStringBuilder.append(" Title_cn TEXT");
    localStringBuilder.append(", ");
    locala.columns[12] = "Title_hk";
    locala.vmt.put("Title_hk", "TEXT");
    localStringBuilder.append(" Title_hk TEXT");
    localStringBuilder.append(", ");
    locala.columns[13] = "Title_tw";
    locala.vmt.put("Title_tw", "TEXT");
    localStringBuilder.append(" Title_tw TEXT");
    localStringBuilder.append(", ");
    locala.columns[14] = "Title_en";
    locala.vmt.put("Title_en", "TEXT");
    localStringBuilder.append(" Title_en TEXT");
    localStringBuilder.append(", ");
    locala.columns[15] = "Desc_cn";
    locala.vmt.put("Desc_cn", "TEXT");
    localStringBuilder.append(" Desc_cn TEXT");
    localStringBuilder.append(", ");
    locala.columns[16] = "Desc_hk";
    locala.vmt.put("Desc_hk", "TEXT");
    localStringBuilder.append(" Desc_hk TEXT");
    localStringBuilder.append(", ");
    locala.columns[17] = "Desc_tw";
    locala.vmt.put("Desc_tw", "TEXT");
    localStringBuilder.append(" Desc_tw TEXT");
    localStringBuilder.append(", ");
    locala.columns[18] = "Desc_en";
    locala.vmt.put("Desc_en", "TEXT");
    localStringBuilder.append(" Desc_en TEXT");
    localStringBuilder.append(", ");
    locala.columns[19] = "Introduce_cn";
    locala.vmt.put("Introduce_cn", "TEXT");
    localStringBuilder.append(" Introduce_cn TEXT");
    localStringBuilder.append(", ");
    locala.columns[20] = "Introduce_hk";
    locala.vmt.put("Introduce_hk", "TEXT");
    localStringBuilder.append(" Introduce_hk TEXT");
    localStringBuilder.append(", ");
    locala.columns[21] = "Introduce_tw";
    locala.vmt.put("Introduce_tw", "TEXT");
    localStringBuilder.append(" Introduce_tw TEXT");
    localStringBuilder.append(", ");
    locala.columns[22] = "Introduce_en";
    locala.vmt.put("Introduce_en", "TEXT");
    localStringBuilder.append(" Introduce_en TEXT");
    localStringBuilder.append(", ");
    locala.columns[23] = "starttime";
    locala.vmt.put("starttime", "LONG");
    localStringBuilder.append(" starttime LONG");
    localStringBuilder.append(", ");
    locala.columns[24] = "endtime";
    locala.vmt.put("endtime", "LONG");
    localStringBuilder.append(" endtime LONG");
    localStringBuilder.append(", ");
    locala.columns[25] = "sequence";
    locala.vmt.put("sequence", "LONG");
    localStringBuilder.append(" sequence LONG");
    localStringBuilder.append(", ");
    locala.columns[26] = "prioritylevel";
    locala.vmt.put("prioritylevel", "INTEGER");
    localStringBuilder.append(" prioritylevel INTEGER");
    localStringBuilder.append(", ");
    locala.columns[27] = "status";
    locala.vmt.put("status", "INTEGER");
    localStringBuilder.append(" status INTEGER");
    localStringBuilder.append(", ");
    locala.columns[28] = "ThumbUrl_cn";
    locala.vmt.put("ThumbUrl_cn", "TEXT");
    localStringBuilder.append(" ThumbUrl_cn TEXT");
    localStringBuilder.append(", ");
    locala.columns[29] = "ThumbUrl_hk";
    locala.vmt.put("ThumbUrl_hk", "TEXT");
    localStringBuilder.append(" ThumbUrl_hk TEXT");
    localStringBuilder.append(", ");
    locala.columns[30] = "ThumbUrl_tw";
    locala.vmt.put("ThumbUrl_tw", "TEXT");
    localStringBuilder.append(" ThumbUrl_tw TEXT");
    localStringBuilder.append(", ");
    locala.columns[31] = "ThumbUrl_en";
    locala.vmt.put("ThumbUrl_en", "TEXT");
    localStringBuilder.append(" ThumbUrl_en TEXT");
    localStringBuilder.append(", ");
    locala.columns[32] = "ImgUrl_android_cn";
    locala.vmt.put("ImgUrl_android_cn", "TEXT");
    localStringBuilder.append(" ImgUrl_android_cn TEXT");
    localStringBuilder.append(", ");
    locala.columns[33] = "ImgUrl_android_hk";
    locala.vmt.put("ImgUrl_android_hk", "TEXT");
    localStringBuilder.append(" ImgUrl_android_hk TEXT");
    localStringBuilder.append(", ");
    locala.columns[34] = "ImgUrl_android_tw";
    locala.vmt.put("ImgUrl_android_tw", "TEXT");
    localStringBuilder.append(" ImgUrl_android_tw TEXT");
    localStringBuilder.append(", ");
    locala.columns[35] = "ImgUrl_android_en";
    locala.vmt.put("ImgUrl_android_en", "TEXT");
    localStringBuilder.append(" ImgUrl_android_en TEXT");
    localStringBuilder.append(", ");
    locala.columns[36] = "RedPoint";
    locala.vmt.put("RedPoint", "INTEGER");
    localStringBuilder.append(" RedPoint INTEGER");
    localStringBuilder.append(", ");
    locala.columns[37] = "WeAppDebugMode";
    locala.vmt.put("WeAppDebugMode", "INTEGER");
    localStringBuilder.append(" WeAppDebugMode INTEGER");
    localStringBuilder.append(", ");
    locala.columns[38] = "idkey";
    locala.vmt.put("idkey", "INTEGER");
    localStringBuilder.append(" idkey INTEGER");
    localStringBuilder.append(", ");
    locala.columns[39] = "idkeyValue";
    locala.vmt.put("idkeyValue", "INTEGER");
    localStringBuilder.append(" idkeyValue INTEGER");
    localStringBuilder.append(", ");
    locala.columns[40] = "Icon";
    locala.vmt.put("Icon", "TEXT");
    localStringBuilder.append(" Icon TEXT");
    localStringBuilder.append(", ");
    locala.columns[41] = "ImgUrl_cn";
    locala.vmt.put("ImgUrl_cn", "TEXT");
    localStringBuilder.append(" ImgUrl_cn TEXT");
    localStringBuilder.append(", ");
    locala.columns[42] = "ImgUrl_hk";
    locala.vmt.put("ImgUrl_hk", "TEXT");
    localStringBuilder.append(" ImgUrl_hk TEXT");
    localStringBuilder.append(", ");
    locala.columns[43] = "ImgUrl_tw";
    locala.vmt.put("ImgUrl_tw", "TEXT");
    localStringBuilder.append(" ImgUrl_tw TEXT");
    localStringBuilder.append(", ");
    locala.columns[44] = "ImgUrl_en";
    locala.vmt.put("ImgUrl_en", "TEXT");
    localStringBuilder.append(" ImgUrl_en TEXT");
    locala.columns[45] = "rowid";
    locala.vmu = localStringBuilder.toString();
    fTp = locala;
    saR = Arrays.asList(new String[] { "_cn", "_hk", "_tw", "_en" });
    GMTrace.o(15664551034880L, 116710);
  }
  
  public a()
  {
    GMTrace.i(15662806204416L, 116697);
    this.saQ = new HashMap();
    GMTrace.o(15662806204416L, 116697);
  }
  
  private String Nt(String paramString)
  {
    GMTrace.i(15664148381696L, 116707);
    Iterator localIterator = saR.iterator();
    while (localIterator.hasNext())
    {
      String str = (String)localIterator.next();
      str = sF(paramString + str);
      if (!TextUtils.isEmpty(str))
      {
        GMTrace.o(15664148381696L, 116707);
        return str;
      }
    }
    GMTrace.o(15664148381696L, 116707);
    return "";
  }
  
  private String ey(String paramString1, String paramString2)
  {
    GMTrace.i(15664014163968L, 116706);
    paramString2 = sF(paramString1 + paramString2);
    if (!TextUtils.isEmpty(paramString2))
    {
      GMTrace.o(15664014163968L, 116706);
      return paramString2;
    }
    paramString1 = Nt(paramString1);
    GMTrace.o(15664014163968L, 116706);
    return paramString1;
  }
  
  private String sF(String paramString)
  {
    GMTrace.i(15664282599424L, 116708);
    Object localObject = (Field)this.saQ.get(paramString);
    if (localObject == null) {
      try
      {
        Field localField = a.class.getField(paramString);
        localObject = localField;
        for (;;) {}
      }
      catch (NoSuchFieldException paramString)
      {
        for (;;)
        {
          try
          {
            this.saQ.put(paramString, localObject);
            if (localObject == null) {
              continue;
            }
          }
          catch (NoSuchFieldException paramString)
          {
            continue;
          }
          try
          {
            paramString = (String)((Field)localObject).get(this);
            GMTrace.o(15664282599424L, 116708);
            return paramString;
          }
          catch (IllegalAccessException paramString)
          {
            w.w("LabAppInfo", bg.f(paramString));
          }
          paramString = paramString;
          w.w("LabAppInfo", bg.f(paramString));
        }
        GMTrace.o(15664282599424L, 116708);
        return "";
      }
    }
  }
  
  public final String Ns(String paramString)
  {
    GMTrace.i(15663879946240L, 116705);
    String str1 = sF(paramString + "Key_android");
    if (!TextUtils.isEmpty(str1))
    {
      String str2 = ab.getPackageName();
      int i = ab.getResources().getIdentifier(str1, "string", str2);
      str1 = ab.getResources().getString(i);
      if (!TextUtils.isEmpty(str1))
      {
        GMTrace.o(15663879946240L, 116705);
        return str1;
      }
    }
    str1 = v.eq(ab.getContext());
    if (v.bPH())
    {
      paramString = ey(paramString, "_cn");
      GMTrace.o(15663879946240L, 116705);
      return paramString;
    }
    if ("zh_HK".equals(str1))
    {
      paramString = ey(paramString, "_hk");
      GMTrace.o(15663879946240L, 116705);
      return paramString;
    }
    if ("zh_TW".equals(str1))
    {
      paramString = ey(paramString, "_tw");
      GMTrace.o(15663879946240L, 116705);
      return paramString;
    }
    paramString = ey(paramString, "_en");
    GMTrace.o(15663879946240L, 116705);
    return paramString;
  }
  
  public final boolean bBM()
  {
    GMTrace.i(16419391537152L, 122334);
    if ((isValid()) && (System.currentTimeMillis() / 1000L >= this.field_endtime))
    {
      GMTrace.o(16419391537152L, 122334);
      return true;
    }
    GMTrace.o(16419391537152L, 122334);
    return false;
  }
  
  public final boolean bGE()
  {
    GMTrace.i(15664416817152L, 116709);
    if ((isRunning()) && ((this.field_Switch == 2) || (this.field_Switch == 1)))
    {
      GMTrace.o(15664416817152L, 116709);
      return true;
    }
    GMTrace.o(15664416817152L, 116709);
    return false;
  }
  
  public boolean equals(Object paramObject)
  {
    GMTrace.i(15663208857600L, 116700);
    if (paramObject == this)
    {
      GMTrace.o(15663208857600L, 116700);
      return true;
    }
    if ((paramObject instanceof a))
    {
      boolean bool = ((a)paramObject).field_LabsAppId.equals(this.field_LabsAppId);
      GMTrace.o(15663208857600L, 116700);
      return bool;
    }
    GMTrace.o(15663208857600L, 116700);
    return false;
  }
  
  public int hashCode()
  {
    GMTrace.i(15663074639872L, 116699);
    int i = this.field_LabsAppId.hashCode();
    GMTrace.o(15663074639872L, 116699);
    return i;
  }
  
  public final boolean isRunning()
  {
    GMTrace.i(15663477293056L, 116702);
    if ((isValid()) && (System.currentTimeMillis() / 1000L > this.field_starttime) && (System.currentTimeMillis() / 1000L < this.field_endtime))
    {
      GMTrace.o(15663477293056L, 116702);
      return true;
    }
    GMTrace.o(15663477293056L, 116702);
    return false;
  }
  
  public final boolean isValid()
  {
    GMTrace.i(15663343075328L, 116701);
    if (!TextUtils.isEmpty(this.field_LabsAppId))
    {
      GMTrace.o(15663343075328L, 116701);
      return true;
    }
    GMTrace.o(15663343075328L, 116701);
    return false;
  }
  
  public String toString()
  {
    GMTrace.i(15663745728512L, 116704);
    String str = "[appid " + this.field_LabsAppId + ",title " + this.field_Title_cn + "]";
    GMTrace.o(15663745728512L, 116704);
    return str;
  }
  
  protected final c.a uw()
  {
    GMTrace.i(15662940422144L, 116698);
    c.a locala = fTp;
    GMTrace.o(15662940422144L, 116698);
    return locala;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\plugin\welab\c\a\a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */