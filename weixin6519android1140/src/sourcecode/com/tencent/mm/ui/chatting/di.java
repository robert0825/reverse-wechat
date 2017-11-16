package com.tencent.mm.ui.chatting;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.sdk.platformtools.bg;
import java.util.Map;

final class di
{
  public String eYm;
  public String gjw;
  public String glv;
  public String glw;
  public String glx;
  public String gly;
  public String glz;
  public long time;
  public String title;
  public int type;
  public String url;
  
  di()
  {
    GMTrace.i(2376727527424L, 17708);
    GMTrace.o(2376727527424L, 17708);
  }
  
  public static di al(Map<String, String> paramMap)
  {
    GMTrace.i(2376861745152L, 17709);
    di localdi = new di();
    localdi.title = ((String)paramMap.get(".msg.appmsg.mmreader.category.item.title"));
    localdi.url = ((String)paramMap.get(".msg.appmsg.mmreader.category.item.url"));
    localdi.eYm = ((String)paramMap.get(".msg.appmsg.mmreader.category.item.native_url"));
    localdi.glv = ((String)paramMap.get(".msg.appmsg.mmreader.category.item.shorturl"));
    localdi.glw = ((String)paramMap.get(".msg.appmsg.mmreader.category.item.longurl"));
    localdi.time = bg.getLong((String)paramMap.get(".msg.appmsg.mmreader.category.item.pub_time"), 0L);
    localdi.glx = ((String)paramMap.get(".msg.appmsg.mmreader.category.item.cover"));
    localdi.gly = ((String)paramMap.get(".msg.appmsg.mmreader.category.item.tweetid"));
    localdi.glz = ((String)paramMap.get(".msg.appmsg.mmreader.category.item.digest"));
    localdi.type = bg.getInt((String)paramMap.get(".msg.appmsg.mmreader.category.item.itemshowtype"), 0);
    localdi.gjw = ((String)paramMap.get(".msg.appmsg.template_id"));
    GMTrace.o(2376861745152L, 17709);
    return localdi;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\ui\chatting\di.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */