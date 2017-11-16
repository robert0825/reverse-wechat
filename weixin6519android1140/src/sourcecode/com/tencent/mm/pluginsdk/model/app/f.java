package com.tencent.mm.pluginsdk.model.app;

import android.content.ContentValues;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.g.b.n;
import com.tencent.mm.sdk.e.c.a;
import com.tencent.mm.sdk.platformtools.bg;
import java.lang.reflect.Field;
import java.util.Map;

public class f
  extends n
{
  protected static c.a fTp;
  public static String tnG;
  public static String tnH;
  public static String tnI;
  public static String tnJ;
  
  static
  {
    GMTrace.i(814164738048L, 6066);
    tnG = "wxce6f23b478a3a2a2";
    tnH = "wx7302cee7c7d6d7d6";
    tnI = "wx6fa7e3bab7e15415";
    tnJ = "wx3cc22b542de028d4";
    c.a locala = new c.a();
    locala.gZM = new Field[26];
    locala.columns = new String[27];
    StringBuilder localStringBuilder = new StringBuilder();
    locala.columns[0] = "appId";
    locala.vmt.put("appId", "TEXT default ''  PRIMARY KEY ");
    localStringBuilder.append(" appId TEXT default ''  PRIMARY KEY ");
    localStringBuilder.append(", ");
    locala.vms = "appId";
    locala.columns[1] = "appName";
    locala.vmt.put("appName", "TEXT");
    localStringBuilder.append(" appName TEXT");
    localStringBuilder.append(", ");
    locala.columns[2] = "appDiscription";
    locala.vmt.put("appDiscription", "TEXT");
    localStringBuilder.append(" appDiscription TEXT");
    localStringBuilder.append(", ");
    locala.columns[3] = "appIconUrl";
    locala.vmt.put("appIconUrl", "TEXT");
    localStringBuilder.append(" appIconUrl TEXT");
    localStringBuilder.append(", ");
    locala.columns[4] = "appStoreUrl";
    locala.vmt.put("appStoreUrl", "TEXT");
    localStringBuilder.append(" appStoreUrl TEXT");
    localStringBuilder.append(", ");
    locala.columns[5] = "appVersion";
    locala.vmt.put("appVersion", "INTEGER");
    localStringBuilder.append(" appVersion INTEGER");
    localStringBuilder.append(", ");
    locala.columns[6] = "appWatermarkUrl";
    locala.vmt.put("appWatermarkUrl", "TEXT");
    localStringBuilder.append(" appWatermarkUrl TEXT");
    localStringBuilder.append(", ");
    locala.columns[7] = "packageName";
    locala.vmt.put("packageName", "TEXT");
    localStringBuilder.append(" packageName TEXT");
    localStringBuilder.append(", ");
    locala.columns[8] = "status";
    locala.vmt.put("status", "INTEGER");
    localStringBuilder.append(" status INTEGER");
    localStringBuilder.append(", ");
    locala.columns[9] = "signature";
    locala.vmt.put("signature", "TEXT");
    localStringBuilder.append(" signature TEXT");
    localStringBuilder.append(", ");
    locala.columns[10] = "modifyTime";
    locala.vmt.put("modifyTime", "LONG");
    localStringBuilder.append(" modifyTime LONG");
    localStringBuilder.append(", ");
    locala.columns[11] = "appName_en";
    locala.vmt.put("appName_en", "TEXT");
    localStringBuilder.append(" appName_en TEXT");
    localStringBuilder.append(", ");
    locala.columns[12] = "appName_tw";
    locala.vmt.put("appName_tw", "TEXT");
    localStringBuilder.append(" appName_tw TEXT");
    localStringBuilder.append(", ");
    locala.columns[13] = "appName_hk";
    locala.vmt.put("appName_hk", "TEXT");
    localStringBuilder.append(" appName_hk TEXT");
    localStringBuilder.append(", ");
    locala.columns[14] = "appDiscription_en";
    locala.vmt.put("appDiscription_en", "TEXT");
    localStringBuilder.append(" appDiscription_en TEXT");
    localStringBuilder.append(", ");
    locala.columns[15] = "appDiscription_tw";
    locala.vmt.put("appDiscription_tw", "TEXT");
    localStringBuilder.append(" appDiscription_tw TEXT");
    localStringBuilder.append(", ");
    locala.columns[16] = "appType";
    locala.vmt.put("appType", "TEXT");
    localStringBuilder.append(" appType TEXT");
    localStringBuilder.append(", ");
    locala.columns[17] = "openId";
    locala.vmt.put("openId", "TEXT");
    localStringBuilder.append(" openId TEXT");
    localStringBuilder.append(", ");
    locala.columns[18] = "authFlag";
    locala.vmt.put("authFlag", "INTEGER");
    localStringBuilder.append(" authFlag INTEGER");
    localStringBuilder.append(", ");
    locala.columns[19] = "appInfoFlag";
    locala.vmt.put("appInfoFlag", "INTEGER default '-1' ");
    localStringBuilder.append(" appInfoFlag INTEGER default '-1' ");
    localStringBuilder.append(", ");
    locala.columns[20] = "lvbuff";
    locala.vmt.put("lvbuff", "BLOB");
    localStringBuilder.append(" lvbuff BLOB");
    localStringBuilder.append(", ");
    locala.columns[21] = "serviceAppType";
    locala.vmt.put("serviceAppType", "INTEGER default '0' ");
    localStringBuilder.append(" serviceAppType INTEGER default '0' ");
    localStringBuilder.append(", ");
    locala.columns[22] = "serviceAppInfoFlag";
    locala.vmt.put("serviceAppInfoFlag", "INTEGER default '0' ");
    localStringBuilder.append(" serviceAppInfoFlag INTEGER default '0' ");
    localStringBuilder.append(", ");
    locala.columns[23] = "serviceShowFlag";
    locala.vmt.put("serviceShowFlag", "INTEGER default '0' ");
    localStringBuilder.append(" serviceShowFlag INTEGER default '0' ");
    localStringBuilder.append(", ");
    locala.columns[24] = "appSupportContentType";
    locala.vmt.put("appSupportContentType", "LONG default '0' ");
    localStringBuilder.append(" appSupportContentType LONG default '0' ");
    localStringBuilder.append(", ");
    locala.columns[25] = "svrAppSupportContentType";
    locala.vmt.put("svrAppSupportContentType", "LONG default '0' ");
    localStringBuilder.append(" svrAppSupportContentType LONG default '0' ");
    locala.columns[26] = "rowid";
    locala.vmu = localStringBuilder.toString();
    fTp = locala;
    GMTrace.o(814164738048L, 6066);
  }
  
  public f()
  {
    GMTrace.i(813090996224L, 6058);
    this.field_appId = "";
    this.field_appName = "";
    this.field_appDiscription = "";
    this.field_appIconUrl = "";
    this.field_appStoreUrl = "";
    this.field_appVersion = 0;
    this.field_appWatermarkUrl = "";
    this.field_packageName = "";
    this.field_status = 4;
    this.field_signature = "";
    this.field_modifyTime = 0L;
    this.field_appName_en = "";
    this.field_appName_tw = "";
    this.field_appName_hk = "";
    this.field_appDiscription_en = "";
    this.field_appDiscription_tw = "";
    this.field_appInfoFlag = 0;
    this.field_appType = "";
    this.field_openId = "";
    this.field_authFlag = 0;
    this.field_appInfoFlag = 0;
    bW("");
    bV("");
    bX("");
    cb("");
    cc("");
    cd("");
    GMTrace.o(813090996224L, 6058);
  }
  
  public final boolean bJs()
  {
    GMTrace.i(813225213952L, 6059);
    if (bg.nm(this.field_appType))
    {
      GMTrace.o(813225213952L, 6059);
      return false;
    }
    String[] arrayOfString = this.field_appType.split(",");
    if ((arrayOfString == null) || (arrayOfString.length == 0))
    {
      GMTrace.o(813225213952L, 6059);
      return false;
    }
    int j = arrayOfString.length;
    int i = 0;
    while (i < j)
    {
      if (arrayOfString[i].equals("1"))
      {
        GMTrace.o(813225213952L, 6059);
        return true;
      }
      i += 1;
    }
    GMTrace.o(813225213952L, 6059);
    return false;
  }
  
  public final boolean bJt()
  {
    GMTrace.i(813359431680L, 6060);
    if (this.field_serviceAppType == 0)
    {
      GMTrace.o(813359431680L, 6060);
      return false;
    }
    GMTrace.o(813359431680L, 6060);
    return true;
  }
  
  public final boolean bJu()
  {
    GMTrace.i(813493649408L, 6061);
    if ((this.field_serviceAppInfoFlag & 0x2) != 0)
    {
      GMTrace.o(813493649408L, 6061);
      return true;
    }
    GMTrace.o(813493649408L, 6061);
    return false;
  }
  
  public final boolean bJv()
  {
    GMTrace.i(813627867136L, 6062);
    if (tnH.equals(this.field_appId))
    {
      GMTrace.o(813627867136L, 6062);
      return true;
    }
    GMTrace.o(813627867136L, 6062);
    return false;
  }
  
  public boolean equals(Object paramObject)
  {
    GMTrace.i(813896302592L, 6064);
    if (paramObject == null)
    {
      GMTrace.o(813896302592L, 6064);
      return false;
    }
    if (paramObject == this)
    {
      GMTrace.o(813896302592L, 6064);
      return true;
    }
    if (!(paramObject instanceof f))
    {
      GMTrace.o(813896302592L, 6064);
      return false;
    }
    boolean bool = ((f)paramObject).field_appId.equals(this.field_appId);
    GMTrace.o(813896302592L, 6064);
    return bool;
  }
  
  public int hashCode()
  {
    GMTrace.i(814030520320L, 6065);
    if (!bg.nm(this.field_appId))
    {
      i = this.field_appId.hashCode();
      GMTrace.o(814030520320L, 6065);
      return i;
    }
    int i = super.hashCode();
    GMTrace.o(814030520320L, 6065);
    return i;
  }
  
  public final ContentValues qL()
  {
    GMTrace.i(813762084864L, 6063);
    if ((!bg.nm(this.field_appType)) && ((this.field_appType.startsWith("1")) || (this.field_appType.startsWith("6")))) {
      this.field_appType = ("," + this.field_appType);
    }
    ContentValues localContentValues = super.qL();
    GMTrace.o(813762084864L, 6063);
    return localContentValues;
  }
  
  protected final c.a uw()
  {
    GMTrace.i(812956778496L, 6057);
    c.a locala = fTp;
    GMTrace.o(812956778496L, 6057);
    return locala;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\pluginsdk\model\app\f.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */