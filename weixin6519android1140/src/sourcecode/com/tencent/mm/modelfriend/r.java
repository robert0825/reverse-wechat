package com.tencent.mm.modelfriend;

import android.content.ContentValues;
import android.database.Cursor;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.bu.g;
import com.tencent.mm.sdk.e.j;
import com.tencent.mm.sdk.platformtools.bg;

public final class r
  extends j
{
  public static final String[] fTX;
  private g goN;
  
  static
  {
    GMTrace.i(4416568557568L, 32906);
    fTX = new String[] { "CREATE TABLE IF NOT EXISTS invitefriendopen ( username text  PRIMARY KEY , friendtype int  , updatetime int  , reserved1 int  , reserved2 int  , reserved3 text  , reserved4 text  ) " };
    GMTrace.o(4416568557568L, 32906);
  }
  
  public r(g paramg)
  {
    GMTrace.i(4416165904384L, 32903);
    this.goN = paramg;
    GMTrace.o(4416165904384L, 32903);
  }
  
  public final boolean a(q paramq)
  {
    GMTrace.i(4416300122112L, 32904);
    if (jT(paramq.getUsername()))
    {
      paramq.eQl = -1;
      ContentValues localContentValues = paramq.qL();
      if (this.goN.update("invitefriendopen", localContentValues, "username=?", new String[] { paramq.getUsername() }) > 0)
      {
        GMTrace.o(4416300122112L, 32904);
        return true;
      }
      GMTrace.o(4416300122112L, 32904);
      return false;
    }
    paramq.eQl = -1;
    paramq = paramq.qL();
    if ((int)this.goN.insert("invitefriendopen", "username", paramq) != -1)
    {
      GMTrace.o(4416300122112L, 32904);
      return true;
    }
    GMTrace.o(4416300122112L, 32904);
    return false;
  }
  
  public final boolean jT(String paramString)
  {
    GMTrace.i(4416434339840L, 32905);
    paramString = "select invitefriendopen.username,invitefriendopen.friendtype,invitefriendopen.updatetime,invitefriendopen.reserved1,invitefriendopen.reserved2,invitefriendopen.reserved3,invitefriendopen.reserved4 from invitefriendopen   where invitefriendopen.username = \"" + bg.nk(paramString) + "\"";
    paramString = this.goN.a(paramString, null, 2);
    boolean bool = paramString.moveToFirst();
    paramString.close();
    GMTrace.o(4416434339840L, 32905);
    return bool;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\modelfriend\r.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */