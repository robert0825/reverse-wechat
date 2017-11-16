package com.tencent.mm.aw;

import android.content.ContentValues;
import android.database.Cursor;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.bu.g;
import com.tencent.mm.sdk.e.j;
import com.tencent.mm.sdk.platformtools.bg;
import junit.framework.Assert;

public final class b
  extends j
{
  public static final String[] fTX;
  public g goN;
  
  static
  {
    GMTrace.i(12936978366464L, 96388);
    fTX = new String[] { "CREATE TABLE IF NOT EXISTS chattingbginfo ( username text  PRIMARY KEY , bgflag int  , path text  , reserved1 text  , reserved2 text  , reserved3 int  , reserved4 int  ) " };
    GMTrace.o(12936978366464L, 96388);
  }
  
  public b(g paramg)
  {
    GMTrace.i(12936441495552L, 96384);
    this.goN = paramg;
    GMTrace.o(12936441495552L, 96384);
  }
  
  public final boolean a(a parama)
  {
    GMTrace.i(12936575713280L, 96385);
    parama.eQl = -1;
    ContentValues localContentValues = parama.qL();
    if ((int)this.goN.insert("chattingbginfo", "username", localContentValues) != -1)
    {
      SS(parama.getUsername());
      GMTrace.o(12936575713280L, 96385);
      return true;
    }
    GMTrace.o(12936575713280L, 96385);
    return false;
  }
  
  public final boolean b(a parama)
  {
    GMTrace.i(12936709931008L, 96386);
    if (parama != null) {}
    for (boolean bool = true;; bool = false)
    {
      Assert.assertTrue(bool);
      ContentValues localContentValues = parama.qL();
      if (localContentValues.size() <= 0) {
        break;
      }
      if (this.goN.update("chattingbginfo", localContentValues, "username= ?", new String[] { parama.getUsername() }) <= 0) {
        break;
      }
      SS(parama.getUsername());
      GMTrace.o(12936709931008L, 96386);
      return true;
    }
    GMTrace.o(12936709931008L, 96386);
    return false;
  }
  
  public final a kE(String paramString)
  {
    Object localObject = null;
    GMTrace.i(12936844148736L, 96387);
    paramString = "select chattingbginfo.username,chattingbginfo.bgflag,chattingbginfo.path,chattingbginfo.reserved1,chattingbginfo.reserved2,chattingbginfo.reserved3,chattingbginfo.reserved4 from chattingbginfo   where chattingbginfo.username = \"" + bg.nk(paramString) + "\"";
    Cursor localCursor = this.goN.a(paramString, null, 2);
    if (localCursor == null)
    {
      GMTrace.o(12936844148736L, 96387);
      return null;
    }
    paramString = (String)localObject;
    if (localCursor.moveToFirst())
    {
      paramString = new a();
      paramString.b(localCursor);
    }
    localCursor.close();
    GMTrace.o(12936844148736L, 96387);
    return paramString;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\aw\b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */