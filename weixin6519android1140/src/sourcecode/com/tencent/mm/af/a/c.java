package com.tencent.mm.af.a;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.api.g;
import com.tencent.mm.g.b.u;
import com.tencent.mm.kernel.h;
import com.tencent.mm.sdk.e.c.a;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;
import java.lang.reflect.Field;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

public final class c
  extends u
{
  protected static c.a fTp;
  private Map<String, j> gya;
  private List<String> gyb;
  
  static
  {
    GMTrace.i(4559242002432L, 33969);
    c.a locala = new c.a();
    locala.gZM = new Field[14];
    locala.columns = new String[15];
    StringBuilder localStringBuilder = new StringBuilder();
    locala.columns[0] = "bizChatLocalId";
    locala.vmt.put("bizChatLocalId", "LONG PRIMARY KEY ");
    localStringBuilder.append(" bizChatLocalId LONG PRIMARY KEY ");
    localStringBuilder.append(", ");
    locala.vms = "bizChatLocalId";
    locala.columns[1] = "bizChatServId";
    locala.vmt.put("bizChatServId", "TEXT");
    localStringBuilder.append(" bizChatServId TEXT");
    localStringBuilder.append(", ");
    locala.columns[2] = "brandUserName";
    locala.vmt.put("brandUserName", "TEXT default '' ");
    localStringBuilder.append(" brandUserName TEXT default '' ");
    localStringBuilder.append(", ");
    locala.columns[3] = "chatType";
    locala.vmt.put("chatType", "INTEGER");
    localStringBuilder.append(" chatType INTEGER");
    localStringBuilder.append(", ");
    locala.columns[4] = "headImageUrl";
    locala.vmt.put("headImageUrl", "TEXT");
    localStringBuilder.append(" headImageUrl TEXT");
    localStringBuilder.append(", ");
    locala.columns[5] = "chatName";
    locala.vmt.put("chatName", "TEXT default '' ");
    localStringBuilder.append(" chatName TEXT default '' ");
    localStringBuilder.append(", ");
    locala.columns[6] = "chatNamePY";
    locala.vmt.put("chatNamePY", "TEXT default '' ");
    localStringBuilder.append(" chatNamePY TEXT default '' ");
    localStringBuilder.append(", ");
    locala.columns[7] = "chatVersion";
    locala.vmt.put("chatVersion", "INTEGER default '-1' ");
    localStringBuilder.append(" chatVersion INTEGER default '-1' ");
    localStringBuilder.append(", ");
    locala.columns[8] = "needToUpdate";
    locala.vmt.put("needToUpdate", "INTEGER default 'true' ");
    localStringBuilder.append(" needToUpdate INTEGER default 'true' ");
    localStringBuilder.append(", ");
    locala.columns[9] = "bitFlag";
    locala.vmt.put("bitFlag", "INTEGER default '0' ");
    localStringBuilder.append(" bitFlag INTEGER default '0' ");
    localStringBuilder.append(", ");
    locala.columns[10] = "maxMemberCnt";
    locala.vmt.put("maxMemberCnt", "INTEGER default '0' ");
    localStringBuilder.append(" maxMemberCnt INTEGER default '0' ");
    localStringBuilder.append(", ");
    locala.columns[11] = "ownerUserId";
    locala.vmt.put("ownerUserId", "TEXT");
    localStringBuilder.append(" ownerUserId TEXT");
    localStringBuilder.append(", ");
    locala.columns[12] = "userList";
    locala.vmt.put("userList", "TEXT");
    localStringBuilder.append(" userList TEXT");
    localStringBuilder.append(", ");
    locala.columns[13] = "addMemberUrl";
    locala.vmt.put("addMemberUrl", "TEXT");
    localStringBuilder.append(" addMemberUrl TEXT");
    locala.columns[14] = "rowid";
    locala.vmu = localStringBuilder.toString();
    fTp = locala;
    GMTrace.o(4559242002432L, 33969);
  }
  
  public c()
  {
    GMTrace.i(4558168260608L, 33961);
    this.gya = new HashMap();
    GMTrace.o(4558168260608L, 33961);
  }
  
  public final List<String> FT()
  {
    GMTrace.i(4558570913792L, 33964);
    if (this.gyb != null)
    {
      localObject = this.gyb;
      GMTrace.o(4558570913792L, 33964);
      return (List<String>)localObject;
    }
    Object localObject = this.field_userList;
    if (bg.nm((String)localObject))
    {
      localObject = new LinkedList();
      GMTrace.o(4558570913792L, 33964);
      return (List<String>)localObject;
    }
    this.gyb = bg.g(((String)localObject).split(";"));
    localObject = this.gyb;
    GMTrace.o(4558570913792L, 33964);
    return (List<String>)localObject;
  }
  
  public final boolean FU()
  {
    GMTrace.i(4558973566976L, 33967);
    if (this.field_bizChatServId == null)
    {
      GMTrace.o(4558973566976L, 33967);
      return false;
    }
    boolean bool = this.field_bizChatServId.endsWith("@qy_g");
    GMTrace.o(4558973566976L, 33967);
    return bool;
  }
  
  public final boolean FV()
  {
    GMTrace.i(4559107784704L, 33968);
    if (this.field_needToUpdate)
    {
      GMTrace.o(4559107784704L, 33968);
      return true;
    }
    if ((FU()) && (bg.nm(this.field_userList)))
    {
      GMTrace.o(4559107784704L, 33968);
      return true;
    }
    if ((bg.nm(this.field_chatNamePY)) && (!bg.nm(this.field_chatName)))
    {
      GMTrace.o(4559107784704L, 33968);
      return true;
    }
    GMTrace.o(4559107784704L, 33968);
    return false;
  }
  
  public final boolean fN(int paramInt)
  {
    GMTrace.i(4558436696064L, 33963);
    if ((this.field_bitFlag & paramInt) != 0)
    {
      GMTrace.o(4558436696064L, 33963);
      return true;
    }
    GMTrace.o(4558436696064L, 33963);
    return false;
  }
  
  public final String fs(String paramString)
  {
    GMTrace.i(4558705131520L, 33965);
    paramString = jc(paramString);
    if (paramString == null)
    {
      GMTrace.o(4558705131520L, 33965);
      return "";
    }
    paramString = bg.aq(paramString.field_userName, "");
    GMTrace.o(4558705131520L, 33965);
    return paramString;
  }
  
  public final j jc(String paramString)
  {
    GMTrace.i(4558839349248L, 33966);
    if ((!this.gya.containsKey(paramString)) || (this.gya.get(paramString) == null))
    {
      long l = System.currentTimeMillis();
      j localj = ((g)h.h(g.class)).bl(paramString);
      if (localj != null) {
        this.gya.put(localj.field_userId, localj);
      }
      w.d("MicroMsg.BaseBizChatInfo", "willen get userInfo use time:%s", new Object[] { Long.valueOf(System.currentTimeMillis() - l) });
    }
    if (this.gya.containsKey(paramString))
    {
      paramString = (j)this.gya.get(paramString);
      GMTrace.o(4558839349248L, 33966);
      return paramString;
    }
    GMTrace.o(4558839349248L, 33966);
    return null;
  }
  
  protected final c.a uw()
  {
    GMTrace.i(4558302478336L, 33962);
    c.a locala = fTp;
    GMTrace.o(4558302478336L, 33962);
    return locala;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\af\a\c.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */