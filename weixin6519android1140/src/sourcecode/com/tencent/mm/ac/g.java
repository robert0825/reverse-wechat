package com.tencent.mm.ac;

import android.database.Cursor;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.sdk.e.j;
import com.tencent.mm.sdk.platformtools.bg;

public final class g
  extends j
{
  public static final String[] fTX;
  com.tencent.mm.bu.g goN;
  
  static
  {
    GMTrace.i(394197467136L, 2937);
    fTX = new String[] { "CREATE TABLE IF NOT EXISTS hdheadimginfo ( username text  PRIMARY KEY , imgwidth int  , imgheigth int  , imgformat text  , totallen int  , startpos int  , headimgtype int  , reserved1 text  , reserved2 text  , reserved3 int  , reserved4 int  ) " };
    GMTrace.o(394197467136L, 2937);
  }
  
  public g(com.tencent.mm.bu.g paramg)
  {
    GMTrace.i(393794813952L, 2934);
    this.goN = paramg;
    GMTrace.o(393794813952L, 2934);
  }
  
  public final int a(String paramString, f paramf)
  {
    GMTrace.i(393929031680L, 2935);
    paramf = paramf.qL();
    int i = this.goN.update("hdheadimginfo", paramf, "username=?", new String[] { paramString });
    GMTrace.o(393929031680L, 2935);
    return i;
  }
  
  public final f jdMethod_if(String paramString)
  {
    Object localObject = null;
    GMTrace.i(394063249408L, 2936);
    paramString = "select hdheadimginfo.username,hdheadimginfo.imgwidth,hdheadimginfo.imgheigth,hdheadimginfo.imgformat,hdheadimginfo.totallen,hdheadimginfo.startpos,hdheadimginfo.headimgtype,hdheadimginfo.reserved1,hdheadimginfo.reserved2,hdheadimginfo.reserved3,hdheadimginfo.reserved4 from hdheadimginfo   where hdheadimginfo.username = \"" + bg.nk(paramString) + "\"";
    Cursor localCursor = this.goN.a(paramString, null, 2);
    if (localCursor == null)
    {
      GMTrace.o(394063249408L, 2936);
      return null;
    }
    paramString = (String)localObject;
    if (localCursor.moveToFirst())
    {
      paramString = new f();
      paramString.username = localCursor.getString(0);
      paramString.gsI = localCursor.getInt(1);
      paramString.gsJ = localCursor.getInt(2);
      paramString.gsK = localCursor.getString(3);
      paramString.gsL = localCursor.getInt(4);
      paramString.gsM = localCursor.getInt(5);
      paramString.gsN = localCursor.getInt(6);
      paramString.gsO = localCursor.getString(7);
      paramString.gsP = localCursor.getString(8);
      paramString.gsQ = localCursor.getInt(9);
      paramString.gsR = localCursor.getInt(10);
    }
    localCursor.close();
    GMTrace.o(394063249408L, 2936);
    return paramString;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\ac\g.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */