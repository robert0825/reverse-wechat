package com.tencent.mm.modelfriend;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.g.b.bn;
import com.tencent.mm.sdk.e.c.a;
import java.lang.reflect.Field;
import java.util.Map;

public final class o
  extends bn
{
  protected static c.a fTp;
  
  static
  {
    GMTrace.i(4442069925888L, 33096);
    c.a locala = new c.a();
    locala.gZM = new Field[16];
    locala.columns = new String[17];
    StringBuilder localStringBuilder = new StringBuilder();
    locala.columns[0] = "googleid";
    locala.vmt.put("googleid", "TEXT");
    localStringBuilder.append(" googleid TEXT");
    localStringBuilder.append(", ");
    locala.columns[1] = "googlename";
    locala.vmt.put("googlename", "TEXT");
    localStringBuilder.append(" googlename TEXT");
    localStringBuilder.append(", ");
    locala.columns[2] = "googlephotourl";
    locala.vmt.put("googlephotourl", "TEXT");
    localStringBuilder.append(" googlephotourl TEXT");
    localStringBuilder.append(", ");
    locala.columns[3] = "googlegmail";
    locala.vmt.put("googlegmail", "TEXT");
    localStringBuilder.append(" googlegmail TEXT");
    localStringBuilder.append(", ");
    locala.columns[4] = "username";
    locala.vmt.put("username", "TEXT");
    localStringBuilder.append(" username TEXT");
    localStringBuilder.append(", ");
    locala.columns[5] = "nickname";
    locala.vmt.put("nickname", "TEXT");
    localStringBuilder.append(" nickname TEXT");
    localStringBuilder.append(", ");
    locala.columns[6] = "nicknameqp";
    locala.vmt.put("nicknameqp", "TEXT");
    localStringBuilder.append(" nicknameqp TEXT");
    localStringBuilder.append(", ");
    locala.columns[7] = "usernamepy";
    locala.vmt.put("usernamepy", "TEXT");
    localStringBuilder.append(" usernamepy TEXT");
    localStringBuilder.append(", ");
    locala.columns[8] = "small_url";
    locala.vmt.put("small_url", "TEXT");
    localStringBuilder.append(" small_url TEXT");
    localStringBuilder.append(", ");
    locala.columns[9] = "big_url";
    locala.vmt.put("big_url", "TEXT");
    localStringBuilder.append(" big_url TEXT");
    localStringBuilder.append(", ");
    locala.columns[10] = "ret";
    locala.vmt.put("ret", "INTEGER");
    localStringBuilder.append(" ret INTEGER");
    localStringBuilder.append(", ");
    locala.columns[11] = "status";
    locala.vmt.put("status", "INTEGER");
    localStringBuilder.append(" status INTEGER");
    localStringBuilder.append(", ");
    locala.columns[12] = "googleitemid";
    locala.vmt.put("googleitemid", "TEXT PRIMARY KEY ");
    localStringBuilder.append(" googleitemid TEXT PRIMARY KEY ");
    localStringBuilder.append(", ");
    locala.vms = "googleitemid";
    locala.columns[13] = "googlecgistatus";
    locala.vmt.put("googlecgistatus", "INTEGER default '2' ");
    localStringBuilder.append(" googlecgistatus INTEGER default '2' ");
    localStringBuilder.append(", ");
    locala.columns[14] = "contecttype";
    locala.vmt.put("contecttype", "TEXT");
    localStringBuilder.append(" contecttype TEXT");
    localStringBuilder.append(", ");
    locala.columns[15] = "googlenamepy";
    locala.vmt.put("googlenamepy", "TEXT");
    localStringBuilder.append(" googlenamepy TEXT");
    locala.columns[16] = "rowid";
    locala.vmu = localStringBuilder.toString();
    fTp = locala;
    GMTrace.o(4442069925888L, 33096);
  }
  
  public o()
  {
    GMTrace.i(4441667272704L, 33093);
    GMTrace.o(4441667272704L, 33093);
  }
  
  public final String toString()
  {
    GMTrace.i(4441935708160L, 33095);
    Object localObject = new StringBuffer();
    ((StringBuffer)localObject).append("googleIDgoogleid\n");
    ((StringBuffer)localObject).append("googleNamegooglename\n");
    ((StringBuffer)localObject).append("googlePhotoUrlgooglephotourl\n");
    ((StringBuffer)localObject).append("googleGmailgooglegmail\n");
    ((StringBuffer)localObject).append("userNameusername\n");
    ((StringBuffer)localObject).append("nickNamenickname\n");
    ((StringBuffer)localObject).append("nickNameQuanPinnicknameqp\n");
    ((StringBuffer)localObject).append("nickNamePYInitialusernamepy\n");
    ((StringBuffer)localObject).append("smallHeaderUrlsmall_url\n");
    ((StringBuffer)localObject).append("bigHeaderUrlbig_url\n");
    ((StringBuffer)localObject).append("retret\n");
    ((StringBuffer)localObject).append("statusstatus\n");
    ((StringBuffer)localObject).append("googleItemIDgoogleitemid\n");
    ((StringBuffer)localObject).append("cgiStatusgooglecgistatus\n");
    ((StringBuffer)localObject).append("contactTypecontecttype\n");
    ((StringBuffer)localObject).append("googleNamePYInitialgooglenamepy\n");
    localObject = ((StringBuffer)localObject).toString();
    GMTrace.o(4441935708160L, 33095);
    return (String)localObject;
  }
  
  protected final c.a uw()
  {
    GMTrace.i(4441801490432L, 33094);
    c.a locala = fTp;
    GMTrace.o(4441801490432L, 33094);
    return locala;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\modelfriend\o.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */