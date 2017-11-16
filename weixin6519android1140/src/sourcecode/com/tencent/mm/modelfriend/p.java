package com.tencent.mm.modelfriend;

import android.content.ContentValues;
import android.database.Cursor;
import android.text.TextUtils;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.bu.f;
import com.tencent.mm.bu.f.a;
import com.tencent.mm.bu.g;
import com.tencent.mm.sdk.e.e;
import com.tencent.mm.sdk.e.i;
import com.tencent.mm.sdk.e.m;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;
import java.util.ArrayList;

public final class p
  extends i<o>
  implements f.a
{
  public static final String[] fTX;
  public e fTZ;
  public m gDp;
  
  static
  {
    GMTrace.i(4451599384576L, 33167);
    fTX = new String[] { i.a(o.fTp, "GoogleFriend") };
    GMTrace.o(4451599384576L, 33167);
  }
  
  public p(e parame)
  {
    super(parame, o.fTp, "GoogleFriend", null);
    GMTrace.i(4449988771840L, 33155);
    this.gDp = new m()
    {
      protected final boolean Hf()
      {
        GMTrace.i(4422474137600L, 32950);
        if ((p.this.fTZ == null) || (p.this.fTZ.bRk()))
        {
          if (p.this.fTZ == null) {}
          for (Object localObject = "null";; localObject = Boolean.valueOf(p.this.fTZ.bRk()))
          {
            w.w("MicroMsg.GoogleContact.GoogleFriendUI", "shouldProcessEvent db is close :%s", new Object[] { localObject });
            GMTrace.o(4422474137600L, 32950);
            return false;
          }
        }
        GMTrace.o(4422474137600L, 32950);
        return true;
      }
    };
    this.fTZ = parame;
    GMTrace.o(4449988771840L, 33155);
  }
  
  private boolean a(o paramo)
  {
    GMTrace.i(4450391425024L, 33158);
    if (paramo == null)
    {
      GMTrace.o(4450391425024L, 33158);
      return false;
    }
    paramo = paramo.qL();
    if ((int)this.fTZ.insert("GoogleFriend", "googleitemid", paramo) > 0)
    {
      GMTrace.o(4450391425024L, 33158);
      return true;
    }
    GMTrace.o(4450391425024L, 33158);
    return false;
  }
  
  public final boolean C(String paramString, int paramInt)
  {
    GMTrace.i(4450928295936L, 33162);
    paramString = "UPDATE GoogleFriend SET googlecgistatus='" + paramInt + "' WHERE googleitemid='" + paramString + "'";
    boolean bool = this.fTZ.eZ("GoogleFriend", paramString);
    GMTrace.o(4450928295936L, 33162);
    return bool;
  }
  
  public final boolean D(String paramString, int paramInt)
  {
    GMTrace.i(4451062513664L, 33163);
    if (!TextUtils.isEmpty(paramString))
    {
      paramString = "UPDATE GoogleFriend SET googlecgistatus='" + paramInt + "' , status='0" + "' WHERE username='" + paramString + "'";
      boolean bool = this.fTZ.eZ("GoogleFriend", paramString);
      GMTrace.o(4451062513664L, 33163);
      return bool;
    }
    GMTrace.o(4451062513664L, 33163);
    return false;
  }
  
  public final int a(f paramf)
  {
    GMTrace.i(4450257207296L, 33157);
    if (paramf != null) {
      this.fTZ = paramf;
    }
    GMTrace.o(4450257207296L, 33157);
    return 0;
  }
  
  public final boolean b(o paramo)
  {
    GMTrace.i(4450794078208L, 33161);
    Object localObject = paramo.field_googleitemid;
    localObject = "SELECT GoogleFriend.googleid,GoogleFriend.googlename,GoogleFriend.googlephotourl,GoogleFriend.googlegmail,GoogleFriend.username,GoogleFriend.nickname,GoogleFriend.nicknameqp,GoogleFriend.usernamepy,GoogleFriend.small_url,GoogleFriend.big_url,GoogleFriend.ret,GoogleFriend.status,GoogleFriend.googleitemid,GoogleFriend.googlecgistatus,GoogleFriend.contecttype,GoogleFriend.googlenamepy FROM GoogleFriend   WHERE GoogleFriend.googleitemid = \"" + bg.nk((String)localObject) + "\"";
    localObject = this.fTZ.a((String)localObject, null, 2);
    boolean bool = ((Cursor)localObject).moveToFirst();
    ((Cursor)localObject).close();
    if (!bool)
    {
      bool = a(paramo);
      GMTrace.o(4450794078208L, 33161);
      return bool;
    }
    localObject = paramo.qL();
    int i = this.fTZ.update("GoogleFriend", (ContentValues)localObject, "googleitemid=?", new String[] { paramo.field_googleitemid });
    if (i > 0) {
      doNotify();
    }
    if (i > 0)
    {
      GMTrace.o(4450794078208L, 33161);
      return true;
    }
    GMTrace.o(4450794078208L, 33161);
    return false;
  }
  
  public final void clear()
  {
    GMTrace.i(4451196731392L, 33164);
    this.fTZ.eZ("GoogleFriend", " delete from GoogleFriend");
    this.gDp.b(5, this.gDp, "");
    GMTrace.o(4451196731392L, 33164);
  }
  
  public final boolean f(ArrayList<o> paramArrayList)
  {
    int i = 0;
    GMTrace.i(4450525642752L, 33159);
    if (paramArrayList.size() <= 0)
    {
      w.d("MicroMsg.GoogleContact.GoogleFriendUI", "insertList . list is null.");
      GMTrace.o(4450525642752L, 33159);
      return false;
    }
    g localg;
    long l;
    if ((this.fTZ instanceof g))
    {
      localg = (g)this.fTZ;
      l = localg.cE(Thread.currentThread().getId());
      w.i("MicroMsg.GoogleContact.GoogleFriendUI", "surround insertList in a transaction, ticket = %d", new Object[] { Long.valueOf(l) });
    }
    for (;;)
    {
      if (i < paramArrayList.size())
      {
        a((o)paramArrayList.get(i));
        i += 1;
      }
      else
      {
        if (localg != null)
        {
          localg.aL(l);
          w.i("MicroMsg.GoogleContact.GoogleFriendUI", "end updateList transaction");
        }
        this.gDp.b(2, this.gDp, "");
        GMTrace.o(4450525642752L, 33159);
        return true;
        localg = null;
        l = -1L;
      }
    }
  }
  
  public final String getTableName()
  {
    GMTrace.i(4450122989568L, 33156);
    GMTrace.o(4450122989568L, 33156);
    return "GoogleFriend";
  }
  
  public final Cursor jS(String paramString)
  {
    GMTrace.i(4450659860480L, 33160);
    StringBuilder localStringBuilder = new StringBuilder();
    if (!TextUtils.isEmpty(paramString))
    {
      localStringBuilder.append(" WHERE ( ");
      localStringBuilder.append("GoogleFriend.googleid='" + paramString + "'");
      localStringBuilder.append(" ) ");
    }
    paramString = this.fTZ.rawQuery("SELECT GoogleFriend.googleid,GoogleFriend.googlename,GoogleFriend.googlephotourl,GoogleFriend.googlegmail,GoogleFriend.username,GoogleFriend.nickname,GoogleFriend.nicknameqp,GoogleFriend.usernamepy,GoogleFriend.small_url,GoogleFriend.big_url,GoogleFriend.ret,GoogleFriend.status,GoogleFriend.googleitemid,GoogleFriend.googlecgistatus,GoogleFriend.contecttype,GoogleFriend.googlenamepy FROM GoogleFriend  " + localStringBuilder, null);
    GMTrace.o(4450659860480L, 33160);
    return paramString;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\modelfriend\p.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */