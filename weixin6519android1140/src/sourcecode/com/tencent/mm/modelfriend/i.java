package com.tencent.mm.modelfriend;

import android.content.ContentValues;
import android.database.Cursor;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.bu.g;
import com.tencent.mm.sdk.e.j;
import com.tencent.mm.sdk.platformtools.bg;
import junit.framework.Assert;

public final class i
  extends j
{
  public static final String[] fTX;
  public g goN;
  
  static
  {
    GMTrace.i(4438580264960L, 33070);
    fTX = new String[] { "CREATE TABLE IF NOT EXISTS facebookfriend ( fbid long  PRIMARY KEY , fbname text  , fbimgkey int  , status int  , username text  , nickname text  , nicknamepyinitial text  , nicknamequanpin text  , sex int  , personalcard int  , province text  , city text  , signature text  , alias text  , type int  , email text  ) " };
    GMTrace.o(4438580264960L, 33070);
  }
  
  public i(g paramg)
  {
    GMTrace.i(4438177611776L, 33067);
    this.goN = paramg;
    GMTrace.o(4438177611776L, 33067);
  }
  
  public final boolean Hh()
  {
    GMTrace.i(4438446047232L, 33069);
    boolean bool = this.goN.eZ("facebookfriend", "delete from facebookfriend");
    GMTrace.o(4438446047232L, 33069);
    return bool;
  }
  
  public final boolean a(h paramh)
  {
    GMTrace.i(4438311829504L, 33068);
    if (paramh.eQl == -1) {}
    for (boolean bool = true;; bool = false)
    {
      Assert.assertTrue("Func Set always conv_flag == flag_all", bool);
      long l = paramh.fjc;
      localObject = "select facebookfriend.fbid,facebookfriend.fbname,facebookfriend.fbimgkey,facebookfriend.status,facebookfriend.username,facebookfriend.nickname,facebookfriend.nicknamepyinitial,facebookfriend.nicknamequanpin,facebookfriend.sex,facebookfriend.personalcard,facebookfriend.province,facebookfriend.city,facebookfriend.signature,facebookfriend.alias,facebookfriend.type,facebookfriend.email from facebookfriend   where facebookfriend.fbid = \"" + bg.nk(String.valueOf(l)) + "\"";
      localObject = this.goN.a((String)localObject, null, 2);
      bool = ((Cursor)localObject).moveToFirst();
      ((Cursor)localObject).close();
      if (bool) {
        break label144;
      }
      paramh.eQl = -1;
      paramh = paramh.qL();
      if ((int)this.goN.insert("facebookfriend", "fbid", paramh) == -1) {
        break;
      }
      GMTrace.o(4438311829504L, 33068);
      return true;
    }
    GMTrace.o(4438311829504L, 33068);
    return false;
    label144:
    Object localObject = paramh.qL();
    int i = this.goN.update("facebookfriend", (ContentValues)localObject, "fbid=?", new String[] { paramh.fjc });
    if (i > 0) {
      doNotify();
    }
    if (i > 0)
    {
      GMTrace.o(4438311829504L, 33068);
      return true;
    }
    GMTrace.o(4438311829504L, 33068);
    return false;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\modelfriend\i.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */