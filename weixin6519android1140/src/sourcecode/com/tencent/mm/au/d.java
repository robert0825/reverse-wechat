package com.tencent.mm.au;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Map;
import java.util.Set;

public final class d
  extends a
{
  public String eOf;
  public LinkedList<String> gPh;
  public String url;
  
  public d(Map<String, String> paramMap)
  {
    super(paramMap);
    GMTrace.i(315545878528L, 2351);
    this.gPh = new LinkedList();
    GMTrace.o(315545878528L, 2351);
  }
  
  protected final boolean Kb()
  {
    GMTrace.i(315680096256L, 2352);
    if (this.values == null)
    {
      w.e("MicroMsg.DelChatroomMemberNewXmlMsg", "[parseXml] values == null ");
      GMTrace.o(315680096256L, 2352);
      return false;
    }
    w.i("MicroMsg.DelChatroomMemberNewXmlMsg", "[parseXml] type:%s, values size:%s", new Object[] { bg.nl(this.TYPE), Integer.valueOf(this.values.size()) });
    Object localObject1;
    int i;
    if ((!bg.nm(this.TYPE)) && (this.TYPE.equalsIgnoreCase("delchatroommember")))
    {
      this.url = bg.nl((String)this.values.get(".sysmsg.delchatroommember.url"));
      this.eOf = bg.nl((String)this.values.get(".sysmsg.delchatroommember.link.qrcode"));
      this.gPh.add(this.values.get(".sysmsg.delchatroommember.link.memberlist.username"));
      localObject1 = this.values.keySet().iterator();
      while (((Iterator)localObject1).hasNext())
      {
        localObject2 = (String)((Iterator)localObject1).next();
        if (((String)localObject2).startsWith(".sysmsg.delchatroommember.link.memberlist.username#")) {
          this.gPh.add(this.values.get(localObject2));
        }
      }
      localObject1 = new StringBuilder();
      Object localObject2 = this.values.keySet().iterator();
      i = 0;
      while (((Iterator)localObject2).hasNext())
      {
        String str = (String)((Iterator)localObject2).next();
        if (str.startsWith(gOQ))
        {
          if (((StringBuilder)localObject1).length() > 0) {
            ((StringBuilder)localObject1).insert(0, (String)this.values.get(str));
          } else {
            ((StringBuilder)localObject1).append((String)this.values.get(str));
          }
        }
        else
        {
          if (!str.startsWith(".sysmsg.delchatroommember.link.text")) {
            break label514;
          }
          ((StringBuilder)localObject1).append((String)this.values.get(str));
          this.gOU.add(this.values.get(str));
          i = ((String)this.values.get(str)).length();
        }
      }
    }
    label514:
    for (;;)
    {
      break;
      this.gOV.addFirst(Integer.valueOf(((StringBuilder)localObject1).length() - i));
      this.gOW.add(Integer.valueOf(((StringBuilder)localObject1).length()));
      this.gOS = ((StringBuilder)localObject1).toString();
      w.i("MicroMsg.DelChatroomMemberNewXmlMsg", "[parseXml] url:%s, qrcode:%s, members size :%s", new Object[] { this.url, this.eOf, Integer.valueOf(this.gPh.size()) });
      GMTrace.o(315680096256L, 2352);
      return true;
      w.e("MicroMsg.DelChatroomMemberNewXmlMsg", "[parseXml] type err :%s", new Object[] { bg.nl(this.TYPE) });
      GMTrace.o(315680096256L, 2352);
      return false;
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\au\d.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */