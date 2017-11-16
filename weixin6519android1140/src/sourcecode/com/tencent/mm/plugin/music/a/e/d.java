package com.tencent.mm.plugin.music.a.e;

import com.tencent.gmtrace.GMTrace;
import com.tencent.qqmusic.mediaplayer.network.IMediaHTTPConnection;
import com.tencent.qqmusic.mediaplayer.network.IMediaHTTPService;
import com.tencent.qqmusic.mediaplayer.util.Logger;

public final class d
  implements IMediaHTTPService
{
  public d()
  {
    GMTrace.i(15027956350976L, 111967);
    GMTrace.o(15027956350976L, 111967);
  }
  
  public final IMediaHTTPConnection makeHTTPConnection()
  {
    GMTrace.i(15028090568704L, 111968);
    Logger.i("MicroMsg.MMMediaHTTPService", "makeHTTPConnection");
    c localc = new c();
    GMTrace.o(15028090568704L, 111968);
    return localc;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\plugin\music\a\e\d.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */